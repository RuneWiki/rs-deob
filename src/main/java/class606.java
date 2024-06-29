import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class606 extends class427 {
   @OriginalMember(
      owner = "client!pf",
      name = "e",
      descriptor = "J"
   )
   private long field8703 = 0L;
   @OriginalMember(
      owner = "client!pf",
      name = "j",
      descriptor = "J"
   )
   private long field8702 = 0L;
   @OriginalMember(
      owner = "client!pf",
      name = "i",
      descriptor = "J"
   )
   private long field8704 = 0L;
   @OriginalMember(
      owner = "client!pf",
      name = "h",
      descriptor = "I"
   )
   private int field8705 = 1;
   @OriginalMember(
      owner = "client!pf",
      name = "f",
      descriptor = "I"
   )
   private int field8706 = 0;
   @OriginalMember(
      owner = "client!pf",
      name = "g",
      descriptor = "[J"
   )
   private long[] field8707 = new long[10];

   @OriginalMember(
      owner = "client!pf",
      name = "d",
      descriptor = "(I)J"
   )
   private final long method4451(int arg0) {
      long var2 = jagmisc.nanoTime();
      long var4 = -this.field8704 + var2;
      this.field8704 = var2;
      if (~var4 < 4999999999L && var4 < 5000000000L) {
         this.field8707[this.field8706] = var4;
         this.field8706 = (this.field8706 + 1) % 10;
         if (this.field8705 < 1) {
            ++this.field8705;
         }
      }

      long var6 = 0L;

      for(int var8 = arg0; var8 <= this.field8705; ++var8) {
         var6 += this.field8707[(this.field8706 - (var8 + -10)) % 10];
      }

      return var6 / (long)this.field8705;
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(JZ)I"
   )
   public final int method3139(long arg0, boolean arg1) {
      if (!arg1) {
         this.method3138(121);
      }

      if (this.field8703 < this.field8702) {
         this.field8704 += this.field8702 - this.field8703;
         this.field8703 += -this.field8703 + this.field8702;
         this.field8702 += arg0;
         return 1;
      } else {
         int var4 = 0;

         do {
            ++var4;
            this.field8702 += arg0;
         } while(var4 < 10 && this.field8702 < this.field8703);

         if (this.field8703 > this.field8702) {
            this.field8702 = this.field8703;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method3138(int arg0) {
      this.field8704 = 0L;
      if (~this.field8703 > ~this.field8702) {
         this.field8703 += -this.field8703 + this.field8702;
      }

      if (arg0 != 8) {
         this.method3141(-65);
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(B)J"
   )
   public final long method3140(byte arg0) {
      return arg0 != 82 ? 6L : this.field8703;
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method3141(int arg0) {
      this.field8703 += this.method4451(arg0 ^ -23402);
      if (this.field8702 > this.field8703) {
         return (-this.field8703 + this.field8702) / 1000000L;
      } else {
         if (arg0 != -23401) {
            this.method3141(-69);
         }

         return 0L;
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "<init>",
      descriptor = "()V"
   )
   public class606() {
      this.field8702 = this.field8703 = jagmisc.nanoTime();
      if (this.field8703 == 0L) {
         throw new RuntimeException();
      }
   }
}

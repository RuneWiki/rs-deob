import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class396 extends class256 {
   @OriginalMember(
      owner = "client!om",
      name = "e",
      descriptor = "J"
   )
   private long field5713 = 0L;
   @OriginalMember(
      owner = "client!om",
      name = "j",
      descriptor = "J"
   )
   private long field5714 = 0L;
   @OriginalMember(
      owner = "client!om",
      name = "i",
      descriptor = "I"
   )
   private int field5718 = 0;
   @OriginalMember(
      owner = "client!om",
      name = "h",
      descriptor = "I"
   )
   private int field5717 = 1;
   @OriginalMember(
      owner = "client!om",
      name = "g",
      descriptor = "[J"
   )
   private long[] field5716 = new long[10];
   @OriginalMember(
      owner = "client!om",
      name = "f",
      descriptor = "J"
   )
   private long field5715 = 0L;

   @OriginalMember(
      owner = "client!om",
      name = "c",
      descriptor = "(B)V",
      line = 3
   )
   public final void method1740(byte arg0) {
      this.field5715 = 0L;
      if (~this.field5713 > ~this.field5714) {
         this.field5713 += this.field5714 - this.field5713;
      }

      if (arg0 != 59) {
         this.field5716 = null;
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "b",
      descriptor = "(B)J",
      line = 16
   )
   public final long method1742(byte arg0) {
      return arg0 != 94 ? -77L : this.field5713;
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(I)J",
      line = 26
   )
   public final long method1739(int arg0) {
      this.field5713 += this.method2996(arg0);
      return this.field5714 > this.field5713 ? (-this.field5713 + this.field5714) / 1000000L : 0L;
   }

   @OriginalMember(
      owner = "client!om",
      name = "<init>",
      descriptor = "()V",
      line = 46
   )
   public class396() {
      this.field5714 = this.field5713 = jagmisc.nanoTime();
      if (~this.field5713 == -1L) {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(JI)I",
      line = 57
   )
   public final int method1741(long arg0, int arg1) {
      if (arg1 <= 25) {
         this.field5714 = -84L;
      }

      if (~this.field5713 > ~this.field5714) {
         this.field5715 += -this.field5713 + this.field5714;
         this.field5713 += -this.field5713 + this.field5714;
         this.field5714 += arg0;
         return 1;
      } else {
         int var4 = 0;

         do {
            ++var4;
            this.field5714 += arg0;
         } while(~var4 > -11 && ~this.field5713 < ~this.field5714);

         if (this.field5714 < this.field5713) {
            this.field5714 = this.field5713;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "b",
      descriptor = "(I)J",
      line = 105
   )
   private final long method2996(int arg0) {
      long var2 = jagmisc.nanoTime();
      long var4 = -this.field5715 + var2;
      this.field5715 = var2;
      if (~var4 < 4999999999L && var4 < 5000000000L) {
         this.field5716[this.field5718] = var4;
         this.field5718 = (this.field5718 + 1) % 10;
         if (this.field5717 < 1) {
            ++this.field5717;
         }
      }

      long var6 = (long)arg0;

      for(int var8 = 1; var8 <= this.field5717; ++var8) {
         var6 += this.field5716[(-var8 + 10 + this.field5718) % 10];
      }

      return var6 / (long)this.field5717;
   }
}

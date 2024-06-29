import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class606 extends class387 {
   @OriginalMember(
      owner = "client!df",
      name = "j",
      descriptor = "J"
   )
   private long field8842 = 0L;
   @OriginalMember(
      owner = "client!df",
      name = "k",
      descriptor = "J"
   )
   private long field8843 = 0L;
   @OriginalMember(
      owner = "client!df",
      name = "m",
      descriptor = "I"
   )
   private int field8844 = 0;
   @OriginalMember(
      owner = "client!df",
      name = "i",
      descriptor = "I"
   )
   private int field8845 = 1;
   @OriginalMember(
      owner = "client!df",
      name = "h",
      descriptor = "J"
   )
   private long field8847 = 0L;
   @OriginalMember(
      owner = "client!df",
      name = "l",
      descriptor = "[J"
   )
   private long[] field8846 = new long[10];

   @OriginalMember(
      owner = "client!df",
      name = "c",
      descriptor = "(I)J"
   )
   public final long method2300(int arg0) {
      int var2 = 57 / ((-65 - arg0) / 45);
      return this.field8842;
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(BJ)I"
   )
   public final int method2299(byte arg0, long arg1) {
      if (arg0 <= 75) {
         this.method2300(9);
      }

      if (~this.field8842 > ~this.field8843) {
         this.field8847 += -this.field8842 + this.field8843;
         this.field8842 += -this.field8842 + this.field8843;
         this.field8843 += arg1;
         return 1;
      } else {
         int var4 = 0;

         do {
            this.field8843 += arg1;
            ++var4;
         } while(10 > var4 && this.field8843 < this.field8842);

         if (this.field8843 < this.field8842) {
            this.field8843 = this.field8842;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!df",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2296(byte arg0) {
      this.field8847 = 0L;
      if (arg0 != 54) {
         this.method2300(-42);
      }

      if (this.field8843 > this.field8842) {
         this.field8842 += -this.field8842 + this.field8843;
      }

   }

   @OriginalMember(
      owner = "client!df",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method2297(int arg0) {
      this.field8842 += this.method4471(1);
      if (arg0 >= -48) {
         this.field8844 = 43;
      }

      return this.field8842 < this.field8843 ? (-this.field8842 + this.field8843) / 1000000L : 0L;
   }

   @OriginalMember(
      owner = "client!df",
      name = "d",
      descriptor = "(I)J"
   )
   private final long method4471(int arg0) {
      long var2 = System.nanoTime();
      long var4 = -this.field8847 + var2;
      this.field8847 = var2;
      if (var4 > -5000000000L && 5000000000L > var4) {
         this.field8846[this.field8844] = var4;
         this.field8844 = (this.field8844 + 1) % 10;
         if (-2 < ~this.field8845) {
            ++this.field8845;
         }
      }

      long var6 = 0L;

      for(int var8 = arg0; ~var8 >= ~this.field8845; ++var8) {
         var6 += this.field8846[(this.field8844 - (var8 + -10)) % 10];
      }

      return var6 / (long)this.field8845;
   }

   @OriginalMember(
      owner = "client!df",
      name = "<init>",
      descriptor = "()V"
   )
   public class606() {
      this.field8842 = System.nanoTime();
      this.field8843 = System.nanoTime();
   }
}

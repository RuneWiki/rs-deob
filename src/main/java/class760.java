import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class760 extends class594 {
   @OriginalMember(
      owner = "client!oc",
      name = "d",
      descriptor = "J"
   )
   private long field10850 = 0L;
   @OriginalMember(
      owner = "client!oc",
      name = "g",
      descriptor = "[J"
   )
   private long[] field10854 = new long[10];
   @OriginalMember(
      owner = "client!oc",
      name = "e",
      descriptor = "I"
   )
   private int field10852 = 0;
   @OriginalMember(
      owner = "client!oc",
      name = "f",
      descriptor = "J"
   )
   private long field10851 = 0L;
   @OriginalMember(
      owner = "client!oc",
      name = "h",
      descriptor = "J"
   )
   private long field10853 = 0L;
   @OriginalMember(
      owner = "client!oc",
      name = "i",
      descriptor = "I"
   )
   private int field10855 = 1;

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(JZ)I"
   )
   public final int method3558(long arg0, boolean arg1) {
      if (!arg1) {
         this.method3560((byte)51);
      }

      if (~this.field10851 > ~this.field10853) {
         this.field10850 += -this.field10851 + this.field10853;
         this.field10851 += this.field10853 - this.field10851;
         this.field10853 += arg0;
         return 1;
      } else {
         int var4 = 0;

         do {
            ++var4;
            this.field10853 += arg0;
         } while(var4 < 10 && ~this.field10851 < ~this.field10853);

         if (this.field10851 > this.field10853) {
            this.field10853 = this.field10851;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "c",
      descriptor = "(B)J"
   )
   public final long method3562(byte arg0) {
      if (arg0 < 116) {
         this.method3559((byte)50);
      }

      return this.field10851;
   }

   @OriginalMember(
      owner = "client!oc",
      name = "d",
      descriptor = "(B)J"
   )
   public final long method3560(byte arg0) {
      this.field10851 += this.method5486((byte)37);
      if (~this.field10851 > ~this.field10853) {
         return (this.field10853 - this.field10851) / 1000000L;
      } else {
         return arg0 != -14 ? 126L : 0L;
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3559(byte arg0) {
      if (this.field10851 < this.field10853) {
         this.field10851 += -this.field10851 + this.field10853;
      }

      if (arg0 == -58) {
         this.field10850 = 0L;
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "e",
      descriptor = "(B)J"
   )
   private final long method5486(byte arg0) {
      long var2 = 1000000L * class604.method4452(-115);
      long var4 = -this.field10850 + var2;
      this.field10850 = var2;
      if (~var4 < 4999999999L && ~var4 > -5000000001L) {
         this.field10854[this.field10852] = var4;
         if (this.field10855 < 10) {
            ++this.field10855;
         }

         this.field10852 = (this.field10852 + 1) % 10;
      }

      long var6 = 0L;
      if (arg0 <= 25) {
         return -5L;
      } else {
         for(int var8 = 1; this.field10855 >= var8; ++var8) {
            var6 += this.field10854[(-var8 + this.field10852 + 10) % 10];
         }

         return var6 / (long)this.field10855;
      }
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class461 extends class594 {
   @OriginalMember(
      owner = "client!nga",
      name = "f",
      descriptor = "J"
   )
   private long field6714 = 0L;
   @OriginalMember(
      owner = "client!nga",
      name = "g",
      descriptor = "J"
   )
   private long field6715 = 0L;
   @OriginalMember(
      owner = "client!nga",
      name = "h",
      descriptor = "J"
   )
   private long field6718 = 0L;
   @OriginalMember(
      owner = "client!nga",
      name = "e",
      descriptor = "I"
   )
   private int field6717 = 0;
   @OriginalMember(
      owner = "client!nga",
      name = "i",
      descriptor = "[J"
   )
   private long[] field6716 = new long[10];
   @OriginalMember(
      owner = "client!nga",
      name = "d",
      descriptor = "I"
   )
   private int field6719 = 1;

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(JZ)I"
   )
   public final int method3558(long arg0, boolean arg1) {
      if (!arg1) {
         this.field6717 = 104;
      }

      if (~this.field6715 > ~this.field6714) {
         this.field6718 += -this.field6715 + this.field6714;
         this.field6715 += -this.field6715 + this.field6714;
         this.field6714 += arg0;
         return 1;
      } else {
         int var4 = 0;

         do {
            this.field6714 += arg0;
            ++var4;
         } while(-11 < ~var4 && ~this.field6715 < ~this.field6714);

         if (~this.field6714 > ~this.field6715) {
            this.field6714 = this.field6715;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3559(byte arg0) {
      if (arg0 != -58) {
         this.field6719 = 76;
      }

      this.field6718 = 0L;
      if (this.field6714 > this.field6715) {
         this.field6715 += -this.field6715 + this.field6714;
      }

   }

   @OriginalMember(
      owner = "client!nga",
      name = "d",
      descriptor = "(B)J"
   )
   public final long method3560(byte arg0) {
      this.field6715 += this.method3561(arg0 ^ -103);
      if (~this.field6714 < ~this.field6715) {
         return (-this.field6715 + this.field6714) / 1000000L;
      } else {
         return arg0 != -14 ? -61L : 0L;
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(I)J"
   )
   private final long method3561(int arg0) {
      long var2 = System.nanoTime();
      long var4 = var2 - this.field6718;
      if (arg0 < 63) {
         this.method3558(123L, true);
      }

      this.field6718 = var2;
      if (4999999999L > ~var4 && -5000000001L < ~var4) {
         this.field6716[this.field6717] = var4;
         if (~this.field6719 > -2) {
            ++this.field6719;
         }

         this.field6717 = (this.field6717 - -1) % 10;
      }

      long var6 = 0L;

      for(int var8 = 1; this.field6719 >= var8; ++var8) {
         var6 += this.field6716[(-var8 + this.field6717 + 10) % 10];
      }

      return var6 / (long)this.field6719;
   }

   @OriginalMember(
      owner = "client!nga",
      name = "c",
      descriptor = "(B)J"
   )
   public final long method3562(byte arg0) {
      if (arg0 <= 116) {
         this.method3560((byte)-125);
      }

      return this.field6715;
   }

   @OriginalMember(
      owner = "client!nga",
      name = "<init>",
      descriptor = "()V"
   )
   public class461() {
      this.field6715 = System.nanoTime();
      this.field6714 = System.nanoTime();
   }
}

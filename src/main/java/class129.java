import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class129 extends class572 {
   @OriginalMember(
      owner = "client!co",
      name = "e",
      descriptor = "J"
   )
   private long field1605 = 0L;
   @OriginalMember(
      owner = "client!co",
      name = "h",
      descriptor = "[J"
   )
   private long[] field1603 = new long[10];
   @OriginalMember(
      owner = "client!co",
      name = "i",
      descriptor = "I"
   )
   private int field1607 = 1;
   @OriginalMember(
      owner = "client!co",
      name = "j",
      descriptor = "J"
   )
   private long field1604 = 0L;
   @OriginalMember(
      owner = "client!co",
      name = "g",
      descriptor = "I"
   )
   private int field1608 = 0;
   @OriginalMember(
      owner = "client!co",
      name = "f",
      descriptor = "J"
   )
   private long field1606 = 0L;

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(I)J",
      line = 5
   )
   private final long method1107(int arg0) {
      long var2 = 1000000L * class188.method1462(true);
      long var4 = -this.field1604 + var2;
      this.field1604 = var2;
      if (var4 > -5000000000L && var4 < 5000000000L) {
         this.field1603[this.field1608] = var4;
         this.field1608 = (this.field1608 + 1) % 10;
         if (~this.field1607 > -11) {
            ++this.field1607;
         }
      }

      long var6 = 0L;

      for(int var8 = arg0; var8 <= this.field1607; ++var8) {
         var6 += this.field1603[(-var8 + this.field1608 + 10) % 10];
      }

      return var6 / (long)this.field1607;
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(Z)J",
      line = 37
   )
   public final long method1108(boolean arg0) {
      if (arg0) {
         this.field1603 = null;
      }

      this.field1605 += this.method1107(1);
      return ~this.field1606 < ~this.field1605 ? (this.field1606 - this.field1605) / 1000000L : 0L;
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(B)V",
      line = 55
   )
   public final void method1109(byte arg0) {
      if (arg0 == 97) {
         this.field1604 = 0L;
         if (this.field1605 < this.field1606) {
            this.field1605 += this.field1606 - this.field1605;
         }
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "b",
      descriptor = "(B)J",
      line = 75
   )
   public final long method1110(byte arg0) {
      if (arg0 < 66) {
         this.method1109((byte)126);
      }

      return this.field1605;
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(IJ)I",
      line = 85
   )
   public final int method1111(int arg0, long arg1) {
      if (arg0 != -23762) {
         this.method1109((byte)-67);
      }

      if (this.field1606 > this.field1605) {
         this.field1604 += -this.field1605 + this.field1606;
         this.field1605 += this.field1606 - this.field1605;
         this.field1606 += arg1;
         return 1;
      } else {
         int var4 = 0;

         do {
            ++var4;
            this.field1606 += arg1;
         } while(~var4 > -11 && ~this.field1606 > ~this.field1605);

         if (this.field1606 < this.field1605) {
            this.field1606 = this.field1605;
         }

         return var4;
      }
   }
}

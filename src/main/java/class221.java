import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class221 extends class256 {
   @OriginalMember(
      owner = "client!rea",
      name = "i",
      descriptor = "J"
   )
   private long field3155 = 0L;
   @OriginalMember(
      owner = "client!rea",
      name = "j",
      descriptor = "I"
   )
   private int field3157 = 0;
   @OriginalMember(
      owner = "client!rea",
      name = "g",
      descriptor = "[J"
   )
   private long[] field3159 = new long[10];
   @OriginalMember(
      owner = "client!rea",
      name = "e",
      descriptor = "J"
   )
   private long field3156 = 0L;
   @OriginalMember(
      owner = "client!rea",
      name = "f",
      descriptor = "I"
   )
   private int field3158 = 1;
   @OriginalMember(
      owner = "client!rea",
      name = "h",
      descriptor = "J"
   )
   private long field3160 = 0L;

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method1739(int arg0) {
      this.field3160 += this.method1743((byte)90);
      if (arg0 != 0) {
         return 47L;
      } else {
         return ~this.field3155 < ~this.field3160 ? (this.field3155 - this.field3160) / 1000000L : 0L;
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method1740(byte arg0) {
      if (arg0 != 59) {
         this.method1743((byte)101);
      }

      this.field3156 = 0L;
      if (this.field3160 < this.field3155) {
         this.field3160 += -this.field3160 + this.field3155;
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(JI)I"
   )
   public final int method1741(long arg0, int arg1) {
      if (arg1 <= 25) {
         this.field3155 = 100L;
      }

      if (~this.field3155 < ~this.field3160) {
         this.field3156 += this.field3155 - this.field3160;
         this.field3160 += -this.field3160 + this.field3155;
         this.field3155 += arg0;
         return 1;
      } else {
         int var4 = 0;

         do {
            ++var4;
            this.field3155 += arg0;
         } while(var4 < 10 && ~this.field3160 < ~this.field3155);

         if (this.field3155 < this.field3160) {
            this.field3155 = this.field3160;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "b",
      descriptor = "(B)J"
   )
   public final long method1742(byte arg0) {
      if (arg0 != 94) {
         this.field3158 = 4;
      }

      return this.field3160;
   }

   @OriginalMember(
      owner = "client!rea",
      name = "d",
      descriptor = "(B)J"
   )
   private final long method1743(byte arg0) {
      long var2 = class133.method1054(-29025) * 1000000L;
      long var4 = -this.field3156 + var2;
      this.field3156 = var2;
      if (var4 > -5000000000L && var4 < 5000000000L) {
         this.field3159[this.field3157] = var4;
         this.field3157 = (this.field3157 + 1) % 10;
         if (this.field3158 < 10) {
            ++this.field3158;
         }
      }

      long var6 = 0L;
      if (arg0 < 57) {
         this.field3156 = 6L;
      }

      for(int var8 = 1; this.field3158 >= var8; ++var8) {
         var6 += this.field3159[(-var8 + 10 + this.field3157) % 10];
      }

      return var6 / (long)this.field3158;
   }
}

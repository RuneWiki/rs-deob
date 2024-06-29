import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class267 extends class387 {
   @OriginalMember(
      owner = "client!oe",
      name = "m",
      descriptor = "I"
   )
   private int field4350 = 0;
   @OriginalMember(
      owner = "client!oe",
      name = "l",
      descriptor = "J"
   )
   private long field4349 = 0L;
   @OriginalMember(
      owner = "client!oe",
      name = "k",
      descriptor = "I"
   )
   private int field4351 = 1;
   @OriginalMember(
      owner = "client!oe",
      name = "h",
      descriptor = "J"
   )
   private long field4352 = 0L;
   @OriginalMember(
      owner = "client!oe",
      name = "j",
      descriptor = "[J"
   )
   private long[] field4354 = new long[10];
   @OriginalMember(
      owner = "client!oe",
      name = "i",
      descriptor = "J"
   )
   private long field4353 = 0L;

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(B)V",
      line = 9
   )
   public final void method2296(byte arg0) {
      if (arg0 == 54) {
         if (this.field4353 > this.field4352) {
            this.field4352 += this.field4353 - this.field4352;
         }

         this.field4349 = 0L;
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "b",
      descriptor = "(I)J",
      line = 27
   )
   public final long method2297(int arg0) {
      if (arg0 > -48) {
         this.method2298(54);
      }

      this.field4352 += this.method2298(10);
      return this.field4353 > this.field4352 ? (this.field4353 - this.field4352) / 1000000L : 0L;
   }

   @OriginalMember(
      owner = "client!oe",
      name = "d",
      descriptor = "(I)J",
      line = 44
   )
   private final long method2298(int arg0) {
      long var2 = class162.method1442(arg0 + 14070) * 1000000L;
      long var4 = -this.field4349 + var2;
      this.field4349 = var2;
      if (var4 > -5000000000L && var4 < 5000000000L) {
         this.field4354[this.field4350] = var4;
         this.field4350 = (this.field4350 - -1) % 10;
         if (~this.field4351 > -11) {
            ++this.field4351;
         }
      }

      if (arg0 != 10) {
         this.method2300(-45);
      }

      long var6 = 0L;

      for(int var8 = 1; ~this.field4351 <= ~var8; ++var8) {
         var6 += this.field4354[(-var8 + 10 + this.field4350) % 10];
      }

      return var6 / (long)this.field4351;
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(BJ)I",
      line = 85
   )
   public final int method2299(byte arg0, long arg1) {
      if (arg0 < 75) {
         this.method2300(68);
      }

      if (this.field4353 > this.field4352) {
         this.field4349 += this.field4353 - this.field4352;
         this.field4352 += this.field4353 - this.field4352;
         this.field4353 += arg1;
         return 1;
      } else {
         int var4 = 0;

         do {
            this.field4353 += arg1;
            ++var4;
         } while(var4 < 10 && this.field4352 > this.field4353);

         if (~this.field4353 > ~this.field4352) {
            this.field4353 = this.field4352;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "c",
      descriptor = "(I)J",
      line = 128
   )
   public final long method2300(int arg0) {
      int var2 = -127 / ((-65 - arg0) / 45);
      return this.field4352;
   }
}

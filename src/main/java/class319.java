import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class319 extends class195 {
   @OriginalMember(
      owner = "client!nb",
      name = "g",
      descriptor = "[J"
   )
   private long[] field4278 = new long[10];
   @OriginalMember(
      owner = "client!nb",
      name = "e",
      descriptor = "I"
   )
   private int field4280 = 1;
   @OriginalMember(
      owner = "client!nb",
      name = "h",
      descriptor = "J"
   )
   private long field4279 = 0L;
   @OriginalMember(
      owner = "client!nb",
      name = "f",
      descriptor = "J"
   )
   private long field4275 = 0L;
   @OriginalMember(
      owner = "client!nb",
      name = "i",
      descriptor = "J"
   )
   private long field4276 = 0L;
   @OriginalMember(
      owner = "client!nb",
      name = "j",
      descriptor = "I"
   )
   private int field4277 = 0;

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(JB)I"
   )
   public final int method1467(long arg0, byte arg1) {
      if (arg1 != 111) {
         return 68;
      } else if (this.field4275 < this.field4276) {
         this.field4279 += this.field4276 - this.field4275;
         this.field4275 += this.field4276 - this.field4275;
         this.field4276 += arg0;
         return 1;
      } else {
         int var4 = 0;

         do {
            ++var4;
            this.field4276 += arg0;
         } while(var4 < 10 && this.field4276 < this.field4275);

         if (this.field4276 < this.field4275) {
            this.field4276 = this.field4275;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1466(int arg0) {
      if (~this.field4276 < ~this.field4275) {
         this.field4275 += this.field4276 - this.field4275;
      }

      if (arg0 == 4096) {
         this.field4279 = 0L;
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "b",
      descriptor = "(B)J"
   )
   public final long method1469(byte arg0) {
      if (arg0 != 103) {
         this.method1467(-56L, (byte)-117);
      }

      this.field4275 += this.method2414((byte)45);
      return ~this.field4275 > ~this.field4276 ? (this.field4276 - this.field4275) / 1000000L : 0L;
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method1465(int arg0) {
      if (arg0 != 4096) {
         this.method1467(-118L, (byte)-38);
      }

      return this.field4275;
   }

   @OriginalMember(
      owner = "client!nb",
      name = "c",
      descriptor = "(B)J"
   )
   private final long method2414(byte arg0) {
      long var2 = 1000000L * class792.method5708(-25005);
      long var4 = var2 - this.field4279;
      this.field4279 = var2;
      if (~var4 < 4999999999L && ~var4 > -5000000001L) {
         this.field4278[this.field4277] = var4;
         if (~this.field4280 > -11) {
            ++this.field4280;
         }

         this.field4277 = (this.field4277 - -1) % 10;
      }

      long var6 = 0L;

      for(int var8 = 1; ~var8 >= ~this.field4280; ++var8) {
         var6 += this.field4278[(this.field4277 + 10 + -var8) % 10];
      }

      if (arg0 <= 19) {
         this.method1466(-102);
      }

      return var6 / (long)this.field4280;
   }
}

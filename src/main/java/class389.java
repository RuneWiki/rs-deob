import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class389 extends class195 {
   @OriginalMember(
      owner = "client!mn",
      name = "i",
      descriptor = "J"
   )
   private long field5441 = 0L;
   @OriginalMember(
      owner = "client!mn",
      name = "j",
      descriptor = "J"
   )
   private long field5440 = 0L;
   @OriginalMember(
      owner = "client!mn",
      name = "f",
      descriptor = "I"
   )
   private int field5442 = 1;
   @OriginalMember(
      owner = "client!mn",
      name = "h",
      descriptor = "I"
   )
   private int field5443 = 0;
   @OriginalMember(
      owner = "client!mn",
      name = "g",
      descriptor = "J"
   )
   private long field5444 = 0L;
   @OriginalMember(
      owner = "client!mn",
      name = "e",
      descriptor = "[J"
   )
   private long[] field5445 = new long[10];

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(JB)I"
   )
   public final int method1467(long arg0, byte arg1) {
      if (arg1 != 111) {
         return 40;
      } else if (~this.field5441 < ~this.field5440) {
         this.field5444 += -this.field5440 + this.field5441;
         this.field5440 += -this.field5440 + this.field5441;
         this.field5441 += arg0;
         return 1;
      } else {
         int var4 = 0;

         do {
            this.field5441 += arg0;
            ++var4;
         } while(10 > var4 && ~this.field5440 < ~this.field5441);

         if (this.field5440 > this.field5441) {
            this.field5441 = this.field5440;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method1465(int arg0) {
      if (arg0 != 4096) {
         this.field5442 = 79;
      }

      return this.field5440;
   }

   @OriginalMember(
      owner = "client!mn",
      name = "b",
      descriptor = "(B)J"
   )
   public final long method1469(byte arg0) {
      if (arg0 != 103) {
         return 86L;
      } else {
         this.field5440 += this.method2964((byte)-96);
         return this.field5440 >= this.field5441 ? 0L : (-this.field5440 + this.field5441) / 1000000L;
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "c",
      descriptor = "(B)J"
   )
   private final long method2964(byte arg0) {
      long var2 = System.nanoTime();
      long var4 = var2 - this.field5444;
      if (arg0 != -96) {
         this.field5445 = (long[])null;
      }

      this.field5444 = var2;
      if (-5000000000L < var4 && ~var4 > -5000000001L) {
         this.field5445[this.field5443] = var4;
         this.field5443 = (this.field5443 - -1) % 10;
         if (-2 < ~this.field5442) {
            ++this.field5442;
         }
      }

      long var6 = 0L;

      for(int var8 = 1; ~var8 >= ~this.field5442; ++var8) {
         var6 += this.field5445[(-var8 + this.field5443 - -10) % 10];
      }

      return var6 / (long)this.field5442;
   }

   @OriginalMember(
      owner = "client!mn",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1466(int arg0) {
      this.field5444 = 0L;
      if (arg0 != 4096) {
         this.method1466(-91);
      }

      if (this.field5441 > this.field5440) {
         this.field5440 += -this.field5440 + this.field5441;
      }

   }

   @OriginalMember(
      owner = "client!mn",
      name = "<init>",
      descriptor = "()V"
   )
   public class389() {
      this.field5440 = System.nanoTime();
      this.field5441 = System.nanoTime();
   }
}

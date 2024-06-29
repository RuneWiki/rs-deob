import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class675 extends class594 {
   @OriginalMember(
      owner = "client!tp",
      name = "i",
      descriptor = "J"
   )
   private long field9454 = 0L;
   @OriginalMember(
      owner = "client!tp",
      name = "d",
      descriptor = "J"
   )
   private long field9455 = 0L;
   @OriginalMember(
      owner = "client!tp",
      name = "g",
      descriptor = "[J"
   )
   private long[] field9459 = new long[10];
   @OriginalMember(
      owner = "client!tp",
      name = "h",
      descriptor = "I"
   )
   private int field9457 = 0;
   @OriginalMember(
      owner = "client!tp",
      name = "e",
      descriptor = "J"
   )
   private long field9456 = 0L;
   @OriginalMember(
      owner = "client!tp",
      name = "f",
      descriptor = "I"
   )
   private int field9458 = 1;

   @OriginalMember(
      owner = "client!tp",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3559(byte arg0) {
      this.field9456 = 0L;
      if (arg0 != -58) {
         this.field9455 = 56L;
      }

      if (~this.field9455 > ~this.field9454) {
         this.field9455 += -this.field9455 + this.field9454;
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "c",
      descriptor = "(B)J"
   )
   public final long method3562(byte arg0) {
      if (arg0 <= 116) {
         this.field9459 = null;
      }

      return this.field9455;
   }

   @OriginalMember(
      owner = "client!tp",
      name = "d",
      descriptor = "(B)J"
   )
   public final long method3560(byte arg0) {
      if (arg0 != -14) {
         return -92L;
      } else {
         this.field9455 += this.method4883((byte)-56);
         return ~this.field9454 < ~this.field9455 ? (-this.field9455 + this.field9454) / 1000000L : 0L;
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "e",
      descriptor = "(B)J"
   )
   private final long method4883(byte arg0) {
      int var2 = -87 / ((arg0 - 17) / 63);
      long var3 = jagmisc.nanoTime();
      long var5 = -this.field9456 + var3;
      this.field9456 = var3;
      if (var5 > -5000000000L && ~var5 > -5000000001L) {
         this.field9459[this.field9457] = var5;
         this.field9457 = (this.field9457 - -1) % 10;
         if (this.field9458 < 1) {
            ++this.field9458;
         }
      }

      long var7 = 0L;

      for(int var9 = 1; this.field9458 >= var9; ++var9) {
         var7 += this.field9459[(-var9 + 10 + this.field9457) % 10];
      }

      return var7 / (long)this.field9458;
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(JZ)I"
   )
   public final int method3558(long arg0, boolean arg1) {
      if (!arg1) {
         this.method3558(11L, false);
      }

      if (~this.field9454 < ~this.field9455) {
         this.field9456 += -this.field9455 + this.field9454;
         this.field9455 += -this.field9455 + this.field9454;
         this.field9454 += arg0;
         return 1;
      } else {
         int var4 = 0;

         do {
            this.field9454 += arg0;
            ++var4;
         } while(var4 < 10 && ~this.field9455 < ~this.field9454);

         if (this.field9454 < this.field9455) {
            this.field9454 = this.field9455;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "<init>",
      descriptor = "()V"
   )
   public class675() {
      this.field9454 = this.field9455 = jagmisc.nanoTime();
      if (this.field9455 == 0L) {
         throw new RuntimeException();
      }
   }
}

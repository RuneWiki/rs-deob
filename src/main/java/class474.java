import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class474 extends class195 {
   @OriginalMember(
      owner = "client!pr",
      name = "i",
      descriptor = "J"
   )
   private long field6568 = 0L;
   @OriginalMember(
      owner = "client!pr",
      name = "g",
      descriptor = "J"
   )
   private long field6569 = 0L;
   @OriginalMember(
      owner = "client!pr",
      name = "j",
      descriptor = "[J"
   )
   private long[] field6571 = new long[10];
   @OriginalMember(
      owner = "client!pr",
      name = "e",
      descriptor = "I"
   )
   private int field6570 = 0;
   @OriginalMember(
      owner = "client!pr",
      name = "f",
      descriptor = "J"
   )
   private long field6572 = 0L;
   @OriginalMember(
      owner = "client!pr",
      name = "h",
      descriptor = "I"
   )
   private int field6573 = 1;

   @OriginalMember(
      owner = "client!pr",
      name = "c",
      descriptor = "(B)J"
   )
   private final long method3470(byte arg0) {
      long var2 = jagmisc.nanoTime();
      if (arg0 < 22) {
         this.field6568 = 72L;
      }

      long var4 = -this.field6572 + var2;
      this.field6572 = var2;
      if (~var4 < 4999999999L && var4 < 5000000000L) {
         this.field6571[this.field6570] = var4;
         this.field6570 = (this.field6570 + 1) % 10;
         if (~this.field6573 > -2) {
            ++this.field6573;
         }
      }

      long var6 = 0L;

      for(int var8 = 1; this.field6573 >= var8; ++var8) {
         var6 += this.field6571[(-var8 + this.field6570 - -10) % 10];
      }

      return var6 / (long)this.field6573;
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(JB)I"
   )
   public final int method1467(long arg0, byte arg1) {
      if (arg1 != 111) {
         return 109;
      } else if (~this.field6568 < ~this.field6569) {
         this.field6572 += -this.field6569 + this.field6568;
         this.field6569 += -this.field6569 + this.field6568;
         this.field6568 += arg0;
         return 1;
      } else {
         int var4 = 0;

         do {
            this.field6568 += arg0;
            ++var4;
         } while(~var4 > -11 && ~this.field6569 < ~this.field6568);

         if (this.field6569 > this.field6568) {
            this.field6568 = this.field6569;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "b",
      descriptor = "(B)J"
   )
   public final long method1469(byte arg0) {
      this.field6569 += this.method3470((byte)93);
      if (arg0 != 103) {
         this.method1465(61);
      }

      return ~this.field6569 > ~this.field6568 ? (this.field6568 - this.field6569) / 1000000L : 0L;
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method1465(int arg0) {
      if (arg0 != 4096) {
         this.method1467(-39L, (byte)117);
      }

      return this.field6569;
   }

   @OriginalMember(
      owner = "client!pr",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1466(int arg0) {
      if (this.field6569 < this.field6568) {
         this.field6569 += this.field6568 - this.field6569;
      }

      if (arg0 != 4096) {
         this.field6573 = 47;
      }

      this.field6572 = 0L;
   }

   @OriginalMember(
      owner = "client!pr",
      name = "<init>",
      descriptor = "()V"
   )
   public class474() {
      this.field6568 = this.field6569 = jagmisc.nanoTime();
      if (this.field6569 == 0L) {
         throw new RuntimeException();
      }
   }
}

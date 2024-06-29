import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class579 extends class256 {
   @OriginalMember(
      owner = "client!lq",
      name = "j",
      descriptor = "J"
   )
   private long field8536 = 0L;
   @OriginalMember(
      owner = "client!lq",
      name = "f",
      descriptor = "J"
   )
   private long field8537 = 0L;
   @OriginalMember(
      owner = "client!lq",
      name = "h",
      descriptor = "[J"
   )
   private long[] field8540 = new long[10];
   @OriginalMember(
      owner = "client!lq",
      name = "i",
      descriptor = "I"
   )
   private int field8538 = 1;
   @OriginalMember(
      owner = "client!lq",
      name = "g",
      descriptor = "J"
   )
   private long field8539 = 0L;
   @OriginalMember(
      owner = "client!lq",
      name = "e",
      descriptor = "I"
   )
   private int field8541 = 0;

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(JI)I",
      line = 4
   )
   public final int method1741(long arg0, int arg1) {
      if (arg1 <= 25) {
         this.method1739(-23);
      }

      if (this.field8536 > this.field8537) {
         this.field8539 += -this.field8537 + this.field8536;
         this.field8537 += -this.field8537 + this.field8536;
         this.field8536 += arg0;
         return 1;
      } else {
         int var4 = 0;

         do {
            ++var4;
            this.field8536 += arg0;
         } while(10 > var4 && ~this.field8537 < ~this.field8536);

         if (this.field8536 < this.field8537) {
            this.field8536 = this.field8537;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "b",
      descriptor = "(B)J",
      line = 37
   )
   public final long method1742(byte arg0) {
      if (arg0 != 94) {
         this.method1739(-21);
      }

      return this.field8537;
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(I)J",
      line = 47
   )
   public final long method1739(int arg0) {
      this.field8537 += this.method4202(1);
      if (arg0 != 0) {
         return -3L;
      } else {
         return ~this.field8537 > ~this.field8536 ? (-this.field8537 + this.field8536) / 1000000L : 0L;
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "c",
      descriptor = "(B)V",
      line = 64
   )
   public final void method1740(byte arg0) {
      if (this.field8537 < this.field8536) {
         this.field8537 += -this.field8537 + this.field8536;
      }

      this.field8539 = 0L;
      if (arg0 != 59) {
         this.method1740((byte)-30);
      }

   }

   @OriginalMember(
      owner = "client!lq",
      name = "<init>",
      descriptor = "()V",
      line = 114
   )
   public class579() {
      this.field8537 = System.nanoTime();
      this.field8536 = System.nanoTime();
   }

   @OriginalMember(
      owner = "client!lq",
      name = "b",
      descriptor = "(I)J",
      line = 82
   )
   private final long method4202(int arg0) {
      long var2 = System.nanoTime();
      long var4 = -this.field8539 + var2;
      this.field8539 = var2;
      if (4999999999L > ~var4 && var4 < 5000000000L) {
         this.field8540[this.field8541] = var4;
         if (~this.field8538 > -2) {
            ++this.field8538;
         }

         this.field8541 = (this.field8541 + 1) % 10;
      }

      long var6 = 0L;

      for(int var8 = arg0; ~this.field8538 <= ~var8; ++var8) {
         var6 += this.field8540[(-var8 + this.field8541 + 10) % 10];
      }

      return var6 / (long)this.field8538;
   }
}

import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class29 extends class174 {
   @OriginalMember(
      owner = "client!bw",
      name = "f",
      descriptor = "J"
   )
   private long field423 = 0L;
   @OriginalMember(
      owner = "client!bw",
      name = "k",
      descriptor = "J"
   )
   private long field424 = 0L;
   @OriginalMember(
      owner = "client!bw",
      name = "g",
      descriptor = "I"
   )
   private int field426 = 1;
   @OriginalMember(
      owner = "client!bw",
      name = "i",
      descriptor = "I"
   )
   private int field425 = 0;
   @OriginalMember(
      owner = "client!bw",
      name = "h",
      descriptor = "J"
   )
   private long field428 = 0L;
   @OriginalMember(
      owner = "client!bw",
      name = "j",
      descriptor = "[J"
   )
   private long[] field427 = new long[10];

   @OriginalMember(
      owner = "client!bw",
      name = "e",
      descriptor = "(B)J"
   )
   private final long method234(byte arg0) {
      if (arg0 != -9) {
         return -16L;
      } else {
         long var2 = jagmisc.nanoTime();
         long var4 = -this.field428 + var2;
         this.field428 = var2;
         if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field427[this.field425] = var4;
            if (~this.field426 > -2) {
               ++this.field426;
            }

            this.field425 = (this.field425 + 1) % 10;
         }

         long var6 = 0L;

         for(int var8 = 1; ~var8 >= ~this.field426; ++var8) {
            var6 += this.field427[(-var8 + this.field425 + 10) % 10];
         }

         return var6 / (long)this.field426;
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(JI)I"
   )
   public final int method235(long arg0, int arg1) {
      if (arg1 != 2) {
         this.method234((byte)15);
      }

      if (this.field423 > this.field424) {
         this.field428 += -this.field424 + this.field423;
         this.field424 += -this.field424 + this.field423;
         this.field423 += arg0;
         return 1;
      } else {
         int var4 = 0;

         do {
            ++var4;
            this.field423 += arg0;
         } while(~var4 > -11 && this.field423 < this.field424);

         if (~this.field423 > ~this.field424) {
            this.field423 = this.field424;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method236(byte arg0) {
      if (this.field423 > this.field424) {
         this.field424 += this.field423 - this.field424;
      }

      this.field428 = 0L;
      if (arg0 <= 113) {
         this.method235(-6L, 124);
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "d",
      descriptor = "(B)J"
   )
   public final long method237(byte arg0) {
      int var2 = -20 % ((-55 - arg0) / 56);
      return this.field424;
   }

   @OriginalMember(
      owner = "client!bw",
      name = "c",
      descriptor = "(B)J"
   )
   public final long method238(byte arg0) {
      this.field424 += this.method234((byte)-9);
      if (this.field423 > this.field424) {
         return (this.field423 - this.field424) / 1000000L;
      } else {
         if (arg0 != -99) {
            this.field427 = null;
         }

         return 0L;
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "<init>",
      descriptor = "()V"
   )
   public class29() {
      this.field423 = this.field424 = jagmisc.nanoTime();
      if (~this.field424 == -1L) {
         throw new RuntimeException();
      }
   }
}

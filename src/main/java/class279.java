import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class279 extends class387 {
   @OriginalMember(
      owner = "client!aq",
      name = "j",
      descriptor = "J"
   )
   private long field4456 = 0L;
   @OriginalMember(
      owner = "client!aq",
      name = "k",
      descriptor = "J"
   )
   private long field4457 = 0L;
   @OriginalMember(
      owner = "client!aq",
      name = "m",
      descriptor = "I"
   )
   private int field4458 = 0;
   @OriginalMember(
      owner = "client!aq",
      name = "l",
      descriptor = "[J"
   )
   private long[] field4461 = new long[10];
   @OriginalMember(
      owner = "client!aq",
      name = "h",
      descriptor = "I"
   )
   private int field4460 = 1;
   @OriginalMember(
      owner = "client!aq",
      name = "i",
      descriptor = "J"
   )
   private long field4459 = 0L;

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(BJ)I",
      line = 4
   )
   public final int method2299(byte arg0, long arg1) {
      if (arg0 <= 75) {
         this.method2343(-67);
      }

      if (this.field4456 > this.field4457) {
         this.field4459 += -this.field4457 + this.field4456;
         this.field4457 += -this.field4457 + this.field4456;
         this.field4456 += arg1;
         return 1;
      } else {
         int var4 = 0;

         do {
            ++var4;
            this.field4456 += arg1;
         } while(~var4 > -11 && ~this.field4456 > ~this.field4457);

         if (this.field4457 > this.field4456) {
            this.field4456 = this.field4457;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "d",
      descriptor = "(I)J",
      line = 36
   )
   private final long method2343(int arg0) {
      long var2 = jagmisc.nanoTime();
      if (arg0 > -35) {
         this.method2300(-97);
      }

      long var4 = var2 - this.field4459;
      this.field4459 = var2;
      if (var4 > -5000000000L && ~var4 > -5000000001L) {
         this.field4461[this.field4458] = var4;
         if (this.field4460 < 1) {
            ++this.field4460;
         }

         this.field4458 = (this.field4458 + 1) % 10;
      }

      long var6 = 0L;

      for(int var8 = 1; ~this.field4460 <= ~var8; ++var8) {
         var6 += this.field4461[(-var8 + this.field4458 + 10) % 10];
      }

      return var6 / (long)this.field4460;
   }

   @OriginalMember(
      owner = "client!aq",
      name = "b",
      descriptor = "(I)J",
      line = 70
   )
   public final long method2297(int arg0) {
      this.field4457 += this.method2343(-83);
      if (~this.field4456 < ~this.field4457) {
         return (-this.field4457 + this.field4456) / 1000000L;
      } else {
         return arg0 >= -48 ? -32L : 0L;
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "<init>",
      descriptor = "()V",
      line = 115
   )
   public class279() {
      this.field4456 = this.field4457 = jagmisc.nanoTime();
      if (this.field4457 == 0L) {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(B)V",
      line = 91
   )
   public final void method2296(byte arg0) {
      this.field4459 = 0L;
      if (arg0 != 54) {
         this.field4456 = 52L;
      }

      if (~this.field4457 > ~this.field4456) {
         this.field4457 += -this.field4457 + this.field4456;
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "c",
      descriptor = "(I)J",
      line = 107
   )
   public final long method2300(int arg0) {
      int var2 = -89 % ((-65 - arg0) / 45);
      return this.field4457;
   }
}

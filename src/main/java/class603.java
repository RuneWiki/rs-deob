import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class603 extends class427 {
   @OriginalMember(
      owner = "client!v",
      name = "i",
      descriptor = "I"
   )
   private int field8692 = 0;
   @OriginalMember(
      owner = "client!v",
      name = "f",
      descriptor = "J"
   )
   private long field8691 = 0L;
   @OriginalMember(
      owner = "client!v",
      name = "h",
      descriptor = "J"
   )
   private long field8693 = 0L;
   @OriginalMember(
      owner = "client!v",
      name = "e",
      descriptor = "J"
   )
   private long field8694 = 0L;
   @OriginalMember(
      owner = "client!v",
      name = "g",
      descriptor = "I"
   )
   private int field8695 = 1;
   @OriginalMember(
      owner = "client!v",
      name = "j",
      descriptor = "[J"
   )
   private long[] field8690 = new long[10];

   @OriginalMember(
      owner = "client!v",
      name = "c",
      descriptor = "(I)V",
      line = 3
   )
   public final void method3138(int arg0) {
      if (arg0 == 8) {
         this.field8693 = 0L;
         if (~this.field8694 < ~this.field8691) {
            this.field8691 += -this.field8691 + this.field8694;
         }
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(B)J",
      line = 22
   )
   public final long method3140(byte arg0) {
      return arg0 != 82 ? 110L : this.field8691;
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(I)J",
      line = 37
   )
   public final long method3141(int arg0) {
      this.field8691 += this.method4445((byte)99);
      if (~this.field8694 < ~this.field8691) {
         return (-this.field8691 + this.field8694) / 1000000L;
      } else {
         return arg0 != -23401 ? -81L : 0L;
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "b",
      descriptor = "(B)J",
      line = 57
   )
   private final long method4445(byte arg0) {
      int var2 = -40 / ((arg0 - 34) / 42);
      long var3 = class57.method650(94) * 1000000L;
      long var5 = -this.field8693 + var3;
      this.field8693 = var3;
      if (var5 > -5000000000L && ~var5 > -5000000001L) {
         this.field8690[this.field8692] = var5;
         this.field8692 = (this.field8692 + 1) % 10;
         if (~this.field8695 > -11) {
            ++this.field8695;
         }
      }

      long var7 = 0L;

      for(int var9 = 1; ~var9 >= ~this.field8695; ++var9) {
         var7 += this.field8690[(-var9 + this.field8692 - -10) % 10];
      }

      return var7 / (long)this.field8695;
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(JZ)I",
      line = 99
   )
   public final int method3139(long arg0, boolean arg1) {
      if (!arg1) {
         this.field8692 = -14;
      }

      if (~this.field8694 < ~this.field8691) {
         this.field8693 += -this.field8691 + this.field8694;
         this.field8691 += -this.field8691 + this.field8694;
         this.field8694 += arg0;
         return 1;
      } else {
         int var4 = 0;

         do {
            ++var4;
            this.field8694 += arg0;
         } while(~var4 > -11 && ~this.field8694 > ~this.field8691);

         if (~this.field8691 < ~this.field8694) {
            this.field8694 = this.field8691;
         }

         return var4;
      }
   }
}

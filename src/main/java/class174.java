import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class174 extends class572 {
   @OriginalMember(
      owner = "client!pha",
      name = "e",
      descriptor = "J"
   )
   private long field2165 = 0L;
   @OriginalMember(
      owner = "client!pha",
      name = "f",
      descriptor = "J"
   )
   private long field2166 = 0L;
   @OriginalMember(
      owner = "client!pha",
      name = "i",
      descriptor = "[J"
   )
   private long[] field2167 = new long[10];
   @OriginalMember(
      owner = "client!pha",
      name = "j",
      descriptor = "I"
   )
   private int field2169 = 0;
   @OriginalMember(
      owner = "client!pha",
      name = "g",
      descriptor = "I"
   )
   private int field2168 = 1;
   @OriginalMember(
      owner = "client!pha",
      name = "h",
      descriptor = "J"
   )
   private long field2170 = 0L;

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(IJ)I"
   )
   public final int method1111(int arg0, long arg1) {
      if (arg0 != -23762) {
         this.method1108(false);
      }

      if (this.field2166 < this.field2165) {
         this.field2170 += -this.field2166 + this.field2165;
         this.field2166 += -this.field2166 + this.field2165;
         this.field2165 += arg1;
         return 1;
      } else {
         int var4 = 0;

         do {
            ++var4;
            this.field2165 += arg1;
         } while(-11 < ~var4 && ~this.field2165 > ~this.field2166);

         if (this.field2165 < this.field2166) {
            this.field2165 = this.field2166;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "b",
      descriptor = "(B)J"
   )
   public final long method1110(byte arg0) {
      if (arg0 <= 66) {
         this.field2165 = 24L;
      }

      return this.field2166;
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(I)J"
   )
   private final long method1388(int arg0) {
      long var2 = System.nanoTime();
      long var4 = var2 - this.field2170;
      this.field2170 = var2;
      if (~var4 < 4999999999L && var4 < 5000000000L) {
         this.field2167[this.field2169] = var4;
         if (1 > this.field2168) {
            ++this.field2168;
         }

         this.field2169 = (this.field2169 + 1) % 10;
      }

      long var6 = (long)arg0;

      for(int var8 = 1; ~this.field2168 <= ~var8; ++var8) {
         var6 += this.field2167[(-var8 + this.field2169 + 10) % 10];
      }

      return var6 / (long)this.field2168;
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1109(byte arg0) {
      this.field2170 = 0L;
      if (this.field2165 > this.field2166) {
         this.field2166 += -this.field2166 + this.field2165;
      }

      if (arg0 != 97) {
         this.method1111(-31, 73L);
      }

   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(Z)J"
   )
   public final long method1108(boolean arg0) {
      if (arg0) {
         this.field2168 = 117;
      }

      this.field2166 += this.method1388(0);
      return this.field2166 >= this.field2165 ? 0L : (-this.field2166 + this.field2165) / 1000000L;
   }

   @OriginalMember(
      owner = "client!pha",
      name = "<init>",
      descriptor = "()V"
   )
   public class174() {
      this.field2166 = System.nanoTime();
      this.field2165 = System.nanoTime();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class252 extends class174 {
   @OriginalMember(
      owner = "client!sca",
      name = "i",
      descriptor = "I"
   )
   private int field3180 = 1;
   @OriginalMember(
      owner = "client!sca",
      name = "k",
      descriptor = "J"
   )
   private long field3181 = 0L;
   @OriginalMember(
      owner = "client!sca",
      name = "h",
      descriptor = "[J"
   )
   private long[] field3184 = new long[10];
   @OriginalMember(
      owner = "client!sca",
      name = "f",
      descriptor = "J"
   )
   private long field3183 = 0L;
   @OriginalMember(
      owner = "client!sca",
      name = "j",
      descriptor = "J"
   )
   private long field3185 = 0L;
   @OriginalMember(
      owner = "client!sca",
      name = "g",
      descriptor = "I"
   )
   private int field3182 = 0;

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method236(byte arg0) {
      if (arg0 >= 113) {
         this.field3183 = 0L;
         if (~this.field3185 > ~this.field3181) {
            this.field3185 += -this.field3185 + this.field3181;
         }
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(I)J"
   )
   private final long method2030(int arg0) {
      long var2 = 1000000L * class163.method1353(-124);
      long var4 = -this.field3183 + var2;
      this.field3183 = var2;
      if (~var4 < 4999999999L && var4 < 5000000000L) {
         this.field3184[this.field3182] = var4;
         this.field3182 = (this.field3182 + 1) % 10;
         if (~this.field3180 > -11) {
            ++this.field3180;
         }
      }

      long var6 = 0L;

      for(int var8 = arg0; ~this.field3180 <= ~var8; ++var8) {
         var6 += this.field3184[(this.field3182 + 10 - var8) % 10];
      }

      return var6 / (long)this.field3180;
   }

   @OriginalMember(
      owner = "client!sca",
      name = "c",
      descriptor = "(B)J"
   )
   public final long method238(byte arg0) {
      if (arg0 != -99) {
         this.field3180 = 117;
      }

      this.field3185 += this.method2030(arg0 ^ -100);
      return this.field3181 > this.field3185 ? (-this.field3185 + this.field3181) / 1000000L : 0L;
   }

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(JI)I"
   )
   public final int method235(long arg0, int arg1) {
      if (arg1 != 2) {
         return 73;
      } else if (~this.field3181 < ~this.field3185) {
         this.field3183 += -this.field3185 + this.field3181;
         this.field3185 += -this.field3185 + this.field3181;
         this.field3181 += arg0;
         return 1;
      } else {
         int var4 = 0;

         do {
            ++var4;
            this.field3181 += arg0;
         } while(var4 < 10 && this.field3185 > this.field3181);

         if (this.field3185 > this.field3181) {
            this.field3181 = this.field3185;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "d",
      descriptor = "(B)J"
   )
   public final long method237(byte arg0) {
      int var2 = -92 % ((-55 - arg0) / 56);
      return this.field3185;
   }
}

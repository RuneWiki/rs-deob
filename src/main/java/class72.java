import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class72 {
   @OriginalMember(
      owner = "client!hia",
      name = "f",
      descriptor = "I"
   )
   private int field891 = class36.method276(16);
   @OriginalMember(
      owner = "client!hia",
      name = "b",
      descriptor = "I"
   )
   private int field889 = class36.method276(24);
   @OriginalMember(
      owner = "client!hia",
      name = "d",
      descriptor = "I"
   )
   private int field886 = class36.method276(24);
   @OriginalMember(
      owner = "client!hia",
      name = "c",
      descriptor = "I"
   )
   private int field888 = class36.method276(24) + 1;
   @OriginalMember(
      owner = "client!hia",
      name = "g",
      descriptor = "I"
   )
   private int field887 = class36.method276(6) + 1;
   @OriginalMember(
      owner = "client!hia",
      name = "e",
      descriptor = "I"
   )
   private int field890 = class36.method276(8);
   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "[I"
   )
   private int[] field892;

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "([FIZ)V"
   )
   public final void method701(float[] arg0, int arg1, boolean arg2) {
      for(int var4 = 0; var4 < arg1; ++var4) {
         arg0[var4] = 0.0F;
      }

      if (!arg2) {
         int var5 = class36.field413[this.field890].field5775;
         int var6 = this.field886 - this.field889;
         int var7 = var6 / this.field888;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               if (var9 == 0) {
                  int var11 = class36.field413[this.field890].method3107();

                  for(int var12 = var5 - 1; var12 >= 0; --var12) {
                     if (var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.field887;
                     }

                     var11 /= this.field887;
                  }
               }

               for(int var13 = 0; var13 < var5; ++var13) {
                  int var14 = var8[var10];
                  int var15 = this.field892[var14 * 8 + var9];
                  if (var15 >= 0) {
                     int var16 = this.field888 * var10 + this.field889;
                     class410 var17 = class36.field413[var15];
                     if (this.field891 == 0) {
                        int var18 = this.field888 / var17.field5775;

                        for(int var19 = 0; var19 < var18; ++var19) {
                           float[] var20 = var17.method3108();

                           for(int var21 = 0; var21 < var17.field5775; ++var21) {
                              arg0[var18 * var21 + var16 + var19] += var20[var21];
                           }
                        }
                     } else {
                        int var22 = 0;

                        while(var22 < this.field888) {
                           float[] var23 = var17.method3108();

                           for(int var24 = 0; var24 < var17.field5775; ++var24) {
                              arg0[var16 + var22] += var23[var24];
                              ++var22;
                           }
                        }
                     }
                  }

                  ++var10;
                  if (var10 >= var7) {
                     break;
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "<init>",
      descriptor = "()V"
   )
   public class72() {
      int[] var1 = new int[this.field887];

      for(int var2 = 0; var2 < this.field887; ++var2) {
         int var4 = 0;
         int var5 = class36.method276(3);
         boolean var6 = class36.method282() != 0;
         if (var6) {
            var4 = class36.method276(5);
         }

         var1[var2] = var4 << 3 | var5;
      }

      this.field892 = new int[this.field887 * 8];

      for(int var3 = 0; var3 < this.field887 * 8; ++var3) {
         this.field892[var3] = (var1[var3 >> 3] & 1 << (var3 & 7)) != 0 ? class36.method276(8) : -1;
      }

   }
}

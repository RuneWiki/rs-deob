import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class187 {
   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "I"
   )
   private int field2768 = class469.method3598(16);
   @OriginalMember(
      owner = "client!dj",
      name = "f",
      descriptor = "I"
   )
   private int field2765 = class469.method3598(24);
   @OriginalMember(
      owner = "client!dj",
      name = "e",
      descriptor = "I"
   )
   private int field2769 = class469.method3598(24);
   @OriginalMember(
      owner = "client!dj",
      name = "c",
      descriptor = "I"
   )
   private int field2767 = class469.method3598(24) + 1;
   @OriginalMember(
      owner = "client!dj",
      name = "b",
      descriptor = "I"
   )
   private int field2766 = class469.method3598(6) + 1;
   @OriginalMember(
      owner = "client!dj",
      name = "d",
      descriptor = "I"
   )
   private int field2763 = class469.method3598(8);
   @OriginalMember(
      owner = "client!dj",
      name = "g",
      descriptor = "[I"
   )
   private int[] field2764;

   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "([FIZ)V"
   )
   public final void method1679(float[] arg0, int arg1, boolean arg2) {
      for(int var4 = 0; var4 < arg1; ++var4) {
         arg0[var4] = 0.0F;
      }

      if (!arg2) {
         int var5 = class469.field6796[this.field2763].field551;
         int var6 = this.field2769 - this.field2765;
         int var7 = var6 / this.field2767;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               if (var9 == 0) {
                  int var11 = class469.field6796[this.field2763].method426();

                  for(int var12 = var5 - 1; var12 >= 0; --var12) {
                     if (var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.field2766;
                     }

                     var11 /= this.field2766;
                  }
               }

               for(int var13 = 0; var13 < var5; ++var13) {
                  int var14 = var8[var10];
                  int var15 = this.field2764[var14 * 8 + var9];
                  if (var15 >= 0) {
                     int var16 = this.field2767 * var10 + this.field2765;
                     class38 var17 = class469.field6796[var15];
                     if (this.field2768 == 0) {
                        int var18 = this.field2767 / var17.field551;

                        for(int var19 = 0; var19 < var18; ++var19) {
                           float[] var20 = var17.method427();

                           for(int var21 = 0; var21 < var17.field551; ++var21) {
                              arg0[var18 * var21 + var16 + var19] += var20[var21];
                           }
                        }
                     } else {
                        int var22 = 0;

                        while(var22 < this.field2767) {
                           float[] var23 = var17.method427();

                           for(int var24 = 0; var24 < var17.field551; ++var24) {
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
      owner = "client!dj",
      name = "<init>",
      descriptor = "()V"
   )
   public class187() {
      int[] var1 = new int[this.field2766];

      for(int var2 = 0; var2 < this.field2766; ++var2) {
         int var4 = 0;
         int var5 = class469.method3598(3);
         boolean var6 = class469.method3599() != 0;
         if (var6) {
            var4 = class469.method3598(5);
         }

         var1[var2] = var4 << 3 | var5;
      }

      this.field2764 = new int[this.field2766 * 8];

      for(int var3 = 0; var3 < this.field2766 * 8; ++var3) {
         this.field2764[var3] = (var1[var3 >> 3] & 1 << (var3 & 7)) != 0 ? class469.method3598(8) : -1;
      }

   }
}

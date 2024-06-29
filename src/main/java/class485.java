import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class485 extends class216 {
   @OriginalMember(
      owner = "client!hda",
      name = "A",
      descriptor = "Ldaa;"
   )
   private class226 field6942;
   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "Lpga;"
   )
   private class371 field6941;
   @OriginalMember(
      owner = "client!hda",
      name = "x",
      descriptor = "Z"
   )
   private boolean field6939;
   @OriginalMember(
      owner = "client!hda",
      name = "y",
      descriptor = "Ldca;"
   )
   private class581 field6940;

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method1878(char arg0, int arg1, int arg2, int arg3, boolean arg4, class684 arg5, int arg6, int arg7) {
   }

   @OriginalMember(
      owner = "client!hda",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final void method1875(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field6942.method1951(9822);
      this.field6942.method1943(0, this.field6941);
      if (!this.field6939 && !arg4) {
         this.field6942.method1945((byte)-86, class74.field1189, class74.field1189);
      } else {
         this.field6942.method1945((byte)-86, class561.field7986, class74.field1189);
         this.field6942.method2009(0, 0, class172.field2572);
         this.field6942.method1939(arg3, (byte)-60);
      }

      class522 var6 = this.field6942.method1940((byte)80);
      var6.method322(arg1, arg2, 0);
      this.field6942.method2000(false);
      this.field6942.method1254(0, this.field6940, 4);
      this.field6942.method1263(this.field6942.field3511, 87);
      this.field6942.method1249(0, arg0 * 4, 2, class40.field606);
      if (this.field6939 || arg4) {
         this.field6942.method2009(0, 0, class339.field5001);
      }

   }

   @OriginalMember(
      owner = "client!hda",
      name = "<init>",
      descriptor = "(Ldaa;Lwm;[Liaa;Z)V"
   )
   public class485(class226 arg0, class440 arg1, class433[] arg2, boolean arg3) {
      super(arg0, arg1);
      this.field6942 = arg0;
      int var5 = 0;

      for(int var6 = 0; var6 < 256; ++var6) {
         class433 var59 = arg2[var6];
         if (var59.field6353 > var5) {
            var5 = var59.field6353;
         }

         if (var59.field6361 > var5) {
            var5 = var59.field6361;
         }
      }

      int var7 = var5 * 16;
      if (arg3) {
         byte[] var8 = new byte[var7 * var7];

         for(int var9 = 0; var9 < 256; ++var9) {
            class433 var12 = arg2[var9];
            int var13 = var12.field6353;
            int var14 = var12.field6361;
            int var15 = var9 % 16 * var5;
            int var16 = var9 / 16 * var5;
            int var17 = var7 * var16 + var15;
            int var18 = 0;
            if (var12.field6356 == null) {
               byte[] var19 = var12.field6354;

               for(int var20 = 0; var20 < var13; ++var20) {
                  for(int var21 = 0; var21 < var14; ++var21) {
                     var8[var17++] = (byte)(var19[var18++] == 0 ? 0 : -1);
                  }

                  var17 += var7 - var14;
               }
            } else {
               byte[] var22 = var12.field6356;

               for(int var23 = 0; var23 < var13; ++var23) {
                  for(int var24 = 0; var24 < var14; ++var24) {
                     var8[var17++] = var22[var18++];
                  }

                  var17 += var7 - var14;
               }
            }
         }

         if (arg0.method1229(0, class106.field1654, class779.field11371)) {
            this.field6941 = arg0.method1997(var8, class106.field1654, var7, var7, 0, false);
         } else {
            int[] var10 = new int[var8.length];

            for(int var11 = 0; var11 < var8.length; ++var11) {
               var10[var11] = var8[var11] << 24;
            }

            this.field6941 = arg0.method2017(false, var7, 0, var7, var10);
         }

         this.field6939 = true;
      } else {
         int[] var25 = new int[var7 * var7];

         for(int var26 = 0; var26 < 256; ++var26) {
            class433 var44 = arg2[var26];
            int[] var45 = var44.field6357;
            byte[] var46 = var44.field6356;
            byte[] var47 = var44.field6354;
            int var48 = var44.field6353;
            int var49 = var44.field6361;
            int var50 = var26 % 16 * var5;
            int var51 = var26 / 16 * var5;
            int var52 = var7 * var51 + var50;
            int var53 = 0;
            if (var46 != null) {
               for(int var54 = 0; var54 < var48; ++var54) {
                  for(int var55 = 0; var55 < var49; ++var55) {
                     var25[var52++] = var46[var53] << 24 | var45[var47[var53] & 255];
                     ++var53;
                  }

                  var52 += var7 - var49;
               }
            } else {
               for(int var56 = 0; var56 < var48; ++var56) {
                  for(int var57 = 0; var57 < var49; ++var57) {
                     byte var58;
                     if ((var58 = var47[var53++]) != 0) {
                        var25[var52++] = -16777216 | var45[var58 & 255];
                     } else {
                        ++var52;
                     }
                  }

                  var52 += var7 - var49;
               }
            }
         }

         this.field6941 = arg0.method2017(false, var7, 0, var7, var25);
         this.field6939 = false;
      }

      this.field6941.method1075(class687.field9911, (byte)34);
      this.field6940 = arg0.method1286(false, false);
      this.field6940.method351((byte)38, 20480, 20);

      for(int var27 = 0; var27 < 4; ++var27) {
         Buffer var28 = this.field6940.method353(true, (byte)119);
         if (var28 != null) {
            Stream var29 = this.field6942.method1952((byte)-121, var28);
            float var30 = this.field6941.method21((float)var7, 11439) / (float)var7;
            float var31 = this.field6941.method26((float)var7, -22887) / (float)var7;

            for(int var32 = 0; var32 < 256; ++var32) {
               class433 var33 = arg2[var32];
               int var34 = var33.field6353;
               int var35 = var33.field6361;
               int var36 = var33.field6358;
               int var37 = var33.field6355;
               float var38 = (float)(var32 % 16 * var5);
               float var39 = (float)(var32 / 16 * var5);
               float var40 = var30 * var38;
               float var41 = var31 * var39;
               float var42 = ((float)var35 + var38) * var30;
               float var43 = ((float)var34 + var39) * var31;
               if (Stream.method3185()) {
                  var29.method3186((float)var37);
                  var29.method3186((float)var36);
                  var29.method3186(0.0F);
                  var29.method3186(var40);
                  var29.method3186(var41);
                  var29.method3186((float)var37);
                  var29.method3186((float)(var34 + var36));
                  var29.method3186(0.0F);
                  var29.method3186(var40);
                  var29.method3186(var43);
                  var29.method3186((float)(var35 + var37));
                  var29.method3186((float)(var34 + var36));
                  var29.method3186(0.0F);
                  var29.method3186(var42);
                  var29.method3186(var43);
                  var29.method3186((float)(var35 + var37));
                  var29.method3186((float)var36);
                  var29.method3186(0.0F);
                  var29.method3186(var42);
                  var29.method3186(var41);
               } else {
                  var29.method3179((float)var37);
                  var29.method3179((float)var36);
                  var29.method3179(0.0F);
                  var29.method3179(var40);
                  var29.method3179(var41);
                  var29.method3179((float)var37);
                  var29.method3179((float)(var34 + var36));
                  var29.method3179(0.0F);
                  var29.method3179(var40);
                  var29.method3179(var43);
                  var29.method3179((float)(var35 + var37));
                  var29.method3179((float)(var34 + var36));
                  var29.method3179(0.0F);
                  var29.method3179(var42);
                  var29.method3179(var43);
                  var29.method3179((float)(var35 + var37));
                  var29.method3179((float)var36);
                  var29.method3179(0.0F);
                  var29.method3179(var42);
                  var29.method3179(var41);
               }
            }

            var29.method3187();
            if (this.field6940.method352(-2070)) {
               return;
            }
         }
      }

   }
}

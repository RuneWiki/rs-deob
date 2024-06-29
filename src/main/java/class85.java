import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class85 extends class294 {
   @OriginalMember(
      owner = "client!ad",
      name = "r",
      descriptor = "Lnd;"
   )
   private class121 field1250;
   @OriginalMember(
      owner = "client!ad",
      name = "L",
      descriptor = "Llja;"
   )
   private class404 field1248;
   @OriginalMember(
      owner = "client!ad",
      name = "w",
      descriptor = "Lmu;"
   )
   private class258 field1245;
   @OriginalMember(
      owner = "client!ad",
      name = "x",
      descriptor = "I"
   )
   private int field1238;
   @OriginalMember(
      owner = "client!ad",
      name = "F",
      descriptor = "I"
   )
   private int field1239;
   @OriginalMember(
      owner = "client!ad",
      name = "t",
      descriptor = "I"
   )
   private int field1242;
   @OriginalMember(
      owner = "client!ad",
      name = "s",
      descriptor = "I"
   )
   private int field1227;
   @OriginalMember(
      owner = "client!ad",
      name = "o",
      descriptor = "[[F"
   )
   private float[][] field1234;
   @OriginalMember(
      owner = "client!ad",
      name = "n",
      descriptor = "[[F"
   )
   private float[][] field1251;
   @OriginalMember(
      owner = "client!ad",
      name = "q",
      descriptor = "[[F"
   )
   private float[][] field1241;
   @OriginalMember(
      owner = "client!ad",
      name = "H",
      descriptor = "I"
   )
   private int field1232;
   @OriginalMember(
      owner = "client!ad",
      name = "v",
      descriptor = "Let;"
   )
   private class389 field1229;
   @OriginalMember(
      owner = "client!ad",
      name = "E",
      descriptor = "Lqq;"
   )
   private class800 field1237;
   @OriginalMember(
      owner = "client!ad",
      name = "G",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field1228;
   @OriginalMember(
      owner = "client!ad",
      name = "J",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field1243;
   @OriginalMember(
      owner = "client!ad",
      name = "y",
      descriptor = "Lgfa;"
   )
   private class631 field1231;
   @OriginalMember(
      owner = "client!ad",
      name = "C",
      descriptor = "I"
   )
   private int field1235;
   @OriginalMember(
      owner = "client!ad",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1252 = new String[]{method832(method831(".\u001a\u001c\u001f`")), method832(method831(".\u001a\u001c\u0018`")), method832(method831(".\u001a\u001c\u001c`")), method832(method831("!\u000b^1")), method832(method831(".\u001a\u001c\u001b`")), method832(method831("4P\u001cs5")), method832(method831(".\u001a\u001c\u001a`")), method832(method831(".\u001a\u001ca!!\u0017Fc`")), method832(method831(".\u001a\u001c\u001e`")), method832(method831(".\u001a\u001c\u0019`"))};
   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "S"
   )
   public static short field1249 = 32767;
   @OriginalMember(
      owner = "client!ad",
      name = "B",
      descriptor = "I"
   )
   public static int field1226;
   @OriginalMember(
      owner = "client!ad",
      name = "A",
      descriptor = "I"
   )
   public static int field1230;
   @OriginalMember(
      owner = "client!ad",
      name = "I",
      descriptor = "I"
   )
   public static int field1233;
   @OriginalMember(
      owner = "client!ad",
      name = "D",
      descriptor = "I"
   )
   public static int field1236;
   @OriginalMember(
      owner = "client!ad",
      name = "p",
      descriptor = "I"
   )
   public static int field1240;
   @OriginalMember(
      owner = "client!ad",
      name = "m",
      descriptor = "I"
   )
   public static int field1244;
   @OriginalMember(
      owner = "client!ad",
      name = "u",
      descriptor = "I"
   )
   public static int field1246;
   @OriginalMember(
      owner = "client!ad",
      name = "K",
      descriptor = "I"
   )
   public static int field1247;

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 7
   )
   private final void method824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1786;

      try {
         ++field1246;
         long var9 = -1L;
         int var11 = (arg6 << this.field1250.field4375) + arg3;
         int var12 = (arg0 << this.field1250.field4375) + arg4;
         int var13 = this.field1250.method2312(var11, var12, 127);
         if ((127 & arg3) == 0 || ~(arg4 & 127) == -1) {
            var9 = (long)var11 & 65535L | (65535L & (long)var12) << 16;
            class294 var14 = this.field1229.method3141(var9, true);
            if (var14 != null) {
               this.method825(-113, ((class611)var14).field8894);
               return;
            }
         }

         short var15 = (short)(this.field1235++);
         if (~var9 != 0L) {
            this.field1229.method3143(51, new class611(var15), var9);
         }

         float var16;
         float var17;
         float var18;
         label111: {
            if (arg3 == 0 && arg4 == 0) {
               var16 = this.field1241[arg2][arg1];
               var17 = this.field1234[arg2][arg1];
               var18 = this.field1251[arg2][arg1];
               if (!var8) {
                  break label111;
               }
            }

            if (this.field1250.field4377 == arg3 && ~arg4 == -1) {
               var17 = this.field1234[arg2 - -1][arg1];
               var18 = this.field1251[arg2 + 1][arg1];
               var16 = this.field1241[arg2 + 1][arg1];
               if (!var8) {
                  break label111;
               }
            }

            if (this.field1250.field4377 == arg3 && this.field1250.field4377 == arg4) {
               var17 = this.field1234[arg2 + 1][arg1 + 1];
               var16 = this.field1241[arg2 - -1][arg1 + 1];
               var18 = this.field1251[arg2 - -1][arg1 + 1];
               if (!var8) {
                  break label111;
               }
            }

            if (arg3 == 0 && ~this.field1250.field4377 == ~arg4) {
               var17 = this.field1234[arg2][arg1 + 1];
               var16 = this.field1241[arg2][arg1 + 1];
               var18 = this.field1251[arg2][arg1 + 1];
               if (!var8) {
                  break label111;
               }
            }

            float var19 = (float)arg3 / (float)this.field1250.field4377;
            float var20 = (float)arg4 / (float)this.field1250.field4377;
            float var21 = this.field1234[arg2][arg1];
            float var22 = this.field1241[arg2][arg1];
            float var23 = this.field1251[arg2][arg1];
            float var24 = this.field1234[arg2 + 1][arg1];
            float var25 = this.field1241[arg2 + 1][arg1];
            float var26 = (this.field1234[arg2][arg1 + 1] - var21) * var19 + var21;
            float var27 = this.field1251[arg2 + 1][arg1];
            float var28 = (this.field1234[arg2 - -1][arg1 - -1] - var24) * var19 + var24;
            float var29 = (this.field1241[arg2][arg1 + 1] - var22) * var19 + var22;
            float var30 = (this.field1241[arg2 + 1][arg1 + 1] + -var25) * var19 + var25;
            float var31 = (this.field1251[arg2][arg1 + 1] + -var23) * var19 + var23;
            var16 = (var30 - var29) * var20 + var29;
            float var32 = (this.field1251[arg2 + 1][arg1 + 1] - var27) * var19 + var27;
            var17 = (-var26 + var28) * var20 + var26;
            var18 = (var32 - var31) * var20 + var31;
         }

         float var33 = (float)(-var11 + this.field1248.method3246((byte)-127));
         float var34 = (float)(this.field1248.method3253(0) - var13);
         float var35 = (float)(-var12 + this.field1248.method3247((byte)-116));
         float var36 = (float)Math.sqrt((double)(var35 * var35 + var33 * var33 + var34 * var34));
         float var37 = (float)arg5 / var36;
         float var38 = var34 * var37;
         float var39 = var35 * var37;
         float var40 = var33 * var37;
         float var41 = var36 / (float)this.field1248.method3249((byte)46);
         float var42 = 1.0F - var41 * var41;
         if (var42 < 0.0F) {
            var42 = 0.0F;
         }

         float var43 = var18 * var39 + var16 * var38 + var17 * var40;
         if (var43 < 0.0F) {
            var43 = 0.0F;
         }

         float var44 = var42 * var43 * 2.0F;
         if (var44 > 1.0F) {
            var44 = 1.0F;
         }

         int var45 = this.field1248.method3251(0);
         int var46 = (int)((float)(255 & var45 >> 16) * var44);
         if (~var46 < -256) {
            var46 = 255;
         }

         int var47 = (int)((float)(255 & var45 >> 8) * var44);
         if (var47 > 255) {
            var47 = 255;
         }

         int var48;
         label72: {
            var48 = (int)((float)(255 & var45) * var44);
            if (Stream.method5249()) {
               this.field1228.method5248((float)var11);
               this.field1228.method5248((float)var13);
               this.field1228.method5248((float)var12);
               if (!var8) {
                  break label72;
               }
            }

            this.field1228.method5241((float)var11);
            this.field1228.method5241((float)var13);
            this.field1228.method5241((float)var12);
         }

         if (var48 > 255) {
            var48 = 255;
         }

         label66: {
            if (this.field1245.field4192 != 0) {
               this.field1228.method5245(var46);
               this.field1228.method5245(var47);
               this.field1228.method5245(var48);
               if (!var8) {
                  break label66;
               }
            }

            this.field1228.method5245(var48);
            this.field1228.method5245(var47);
            this.field1228.method5245(var46);
         }

         this.field1228.method5245(255);
         this.method825(-104, var15);
      } catch (RuntimeException var50) {
         throw class482.method3757(var50, field1252[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(IS)V",
      line = 188
   )
   private final void method825(int arg0, short arg1) {
      try {
         int var3 = -3 / ((-39 - arg0) / 51);
         ++field1236;
         if (Stream.method5249()) {
            this.field1243.method5242(arg1);
         } else {
            this.field1243.method5251(arg1);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1252[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "b",
      descriptor = "(I)Z",
      line = 204
   )
   public static final boolean method826(int arg0) {
      try {
         ++field1240;
         if (~class326.field4957 != -1) {
            return true;
         } else {
            return arg0 != 3374 ? true : class259.field4270.method759(arg0 + 13010);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1252[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(I)V",
      line = 230
   )
   public static final void method827(int arg0) {
      try {
         ++field1233;
         class684.method5054((byte)-97);
         class659.field9850 = null;
         class585.field8658 = null;
         class476.field7237 = null;
         class376.field5983 = null;
         class354.field5400 = null;
         if (arg0 == -2) {
            class119.field1632 = null;
            class185.field2897 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1252[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(ILrr;I)Ljq;",
      line = 251
   )
   public static final class672 method828(int arg0, class678 arg1, int arg2) {
      try {
         ++field1244;
         class672 var3 = (class672)class801.field11661.method2544(false, (long)arg2);
         if (var3 == null) {
            label28: {
               if (!class466.field7081) {
                  var3 = class707.method5217(false, arg1.method5025(0, arg2));
                  if (!client.field1786) {
                     break label28;
                  }
               }

               var3 = class351.field5356.method606(class776.method5650(arg1, arg2), true);
            }

            class801.field11661.method2545((long)arg2, 118, var3);
         }

         return arg0 < 102 ? null : var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1252[9] + arg0 + ',' + (arg1 != null ? field1252[5] : field1252[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "([[ZIIII)V",
      line = 277
   )
   public final void method829(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field1786;

      try {
         ++field1226;
         if (this.field1237 != null) {
            if (~(arg1 + arg2) <= ~this.field1238) {
               if (-arg2 + arg1 <= this.field1239) {
                  if (~this.field1242 >= ~(arg2 + arg3)) {
                     if (~this.field1227 <= ~(-arg2 + arg3)) {
                        int var7 = this.field1242;
                        if (arg4 <= -74) {
                           while(var7 <= this.field1227) {
                              int var8 = this.field1238;
                              if (var6 || var8 <= this.field1239) {
                                 do {
                                    int var9 = -arg1 + var8;
                                    int var10 = -arg3 + var7;
                                    if (~var9 < ~(-arg2) && ~arg2 < ~var9 && ~(-arg2) > ~var10 && arg2 > var10 && arg0[arg2 + var9][arg2 + var10]) {
                                       this.field1245.method2175(-19928, (byte)((int)(this.field1248.method3252((byte)-119) * 255.0F)));
                                       this.field1245.method1507(this.field1231, 0, (byte)15);
                                       this.field1245.method1502(this.field1245.field4264, 122);
                                       this.field1245.method1493((byte)-93, this.field1232 / 3, 0, 0, this.field1237, class331.field5019, this.field1235);
                                       return;
                                    }

                                    ++var8;
                                 } while(var8 <= this.field1239);
                              }

                              ++var7;
                           }

                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field1252[4] + (arg0 != null ? field1252[5] : field1252[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(IIBII)V",
      line = 337
   )
   public static final void method830(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      try {
         int var6;
         int var7;
         label19: {
            ++field1230;
            float var5 = (float)class60.field759 / (float)class60.field757;
            var6 = arg4;
            var7 = arg3;
            if (!(var5 < 1.0F)) {
               var6 = (int)((float)arg3 / var5);
               if (!client.field1786) {
                  break label19;
               }
            }

            var7 = (int)((float)arg4 * var5);
         }

         int var10 = arg0 - (-var7 + arg3) / 2;
         int var11 = arg1 - (arg4 - var6) / 2;
         class354.field5389 = class60.field757 * var11 / var6;
         class546.field8195 = class60.field759 - class60.field759 * var10 / var7;
         class177.field2774 = -1;
         if (arg2 < -42) {
            class230.field3525 = -1;
            class240.method2043(-1);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field1252[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "<init>",
      descriptor = "(Lmu;Lnd;Llja;[I)V",
      line = 366
   )
   public class85(class258 param1, class121 param2, class404 param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method831(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method832(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class181 extends class347 {
   @OriginalMember(
      owner = "client!gw",
      name = "p",
      descriptor = "Lck;"
   )
   private class667 field2247;
   @OriginalMember(
      owner = "client!gw",
      name = "m",
      descriptor = "Ltda;"
   )
   private class663 field2231;
   @OriginalMember(
      owner = "client!gw",
      name = "q",
      descriptor = "Llja;"
   )
   private class744 field2239;
   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "I"
   )
   private int field2232;
   @OriginalMember(
      owner = "client!gw",
      name = "t",
      descriptor = "I"
   )
   private int field2230;
   @OriginalMember(
      owner = "client!gw",
      name = "k",
      descriptor = "I"
   )
   private int field2249;
   @OriginalMember(
      owner = "client!gw",
      name = "y",
      descriptor = "I"
   )
   private int field2225;
   @OriginalMember(
      owner = "client!gw",
      name = "D",
      descriptor = "[[F"
   )
   private float[][] field2242;
   @OriginalMember(
      owner = "client!gw",
      name = "H",
      descriptor = "[[F"
   )
   private float[][] field2227;
   @OriginalMember(
      owner = "client!gw",
      name = "l",
      descriptor = "[[F"
   )
   private float[][] field2243;
   @OriginalMember(
      owner = "client!gw",
      name = "G",
      descriptor = "I"
   )
   private int field2226;
   @OriginalMember(
      owner = "client!gw",
      name = "u",
      descriptor = "Lgka;"
   )
   private class390 field2248;
   @OriginalMember(
      owner = "client!gw",
      name = "i",
      descriptor = "Lsha;"
   )
   private class758 field2229;
   @OriginalMember(
      owner = "client!gw",
      name = "w",
      descriptor = "Lrr;"
   )
   private class380 field2241;
   @OriginalMember(
      owner = "client!gw",
      name = "o",
      descriptor = "Lrr;"
   )
   private class380 field2236;
   @OriginalMember(
      owner = "client!gw",
      name = "E",
      descriptor = "Ljj;"
   )
   private class128 field2233;
   @OriginalMember(
      owner = "client!gw",
      name = "A",
      descriptor = "Leja;"
   )
   private class764 field2235;
   @OriginalMember(
      owner = "client!gw",
      name = "s",
      descriptor = "Lwia;"
   )
   private class791 field2228;
   @OriginalMember(
      owner = "client!gw",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2251 = new String[]{method1427(method1426("\u0017CF\u000e\u000e")), method1427(method1426("\u0017CF\b\u000e")), method1427(method1426("\u0017CF\r\u000e")), method1427(method1426("\u0017CF\n\u000e")), method1427(method1426("\u001eA\u0004 ")), method1427(method1426("\u000b\u001aFb[")), method1427(method1426("\u0017CF\u000f\u000e")), method1427(method1426("\u0017CF\t\u000e")), method1427(method1426("\u0017CFpO\u001e]\u001cr\u000e"))};
   @OriginalMember(
      owner = "client!gw",
      name = "v",
      descriptor = "Lsda;"
   )
   public static class269 field2240 = new class269(1, 7);
   @OriginalMember(
      owner = "client!gw",
      name = "B",
      descriptor = "F"
   )
   public static float field2250;
   @OriginalMember(
      owner = "client!gw",
      name = "j",
      descriptor = "I"
   )
   public static int field2234;
   @OriginalMember(
      owner = "client!gw",
      name = "r",
      descriptor = "I"
   )
   public static int field2237;
   @OriginalMember(
      owner = "client!gw",
      name = "C",
      descriptor = "I"
   )
   private int field2238;
   @OriginalMember(
      owner = "client!gw",
      name = "n",
      descriptor = "I"
   )
   public static int field2244;
   @OriginalMember(
      owner = "client!gw",
      name = "F",
      descriptor = "I"
   )
   public static int field2245;
   @OriginalMember(
      owner = "client!gw",
      name = "x",
      descriptor = "I"
   )
   public static int field2246;

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(BIIII)V",
      line = 7
   )
   public static final void method1420(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      int var5 = client.field4530;

      try {
         ++field2234;
         int var6 = 0;
         if (var5 == 0 && ~class117.field1428 >= ~var6) {
            if (arg0 != -39) {
               method1420((byte)-15, 109, 44, -98, -26);
            }

            class458.method3442(arg2 - -arg3, 26306, arg2, arg1, arg1 - -arg4);
         } else {
            do {
               Rectangle var7 = class521.field7579[var6];
               if (var7.x + var7.width > arg1 && arg1 - -arg4 > var7.x && arg2 < var7.y - -var7.height && arg2 + arg3 > var7.y) {
                  class275.field3835[var6] = true;
               }

               ++var6;
            } while(~class117.field1428 < ~var6);

            if (arg0 != -39) {
               method1420((byte)-15, 109, 44, -98, -26);
            }

            class458.method3442(arg2 - -arg3, 26306, arg2, arg1, arg1 - -arg4);
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field2251[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "b",
      descriptor = "(I)V",
      line = 32
   )
   public static final void method1421(int arg0) {
      int var1 = client.field4530;

      try {
         ++field2246;
         if (arg0 != 18798) {
            method1424(-89);
         }

         int var2 = class287.field4026;
         int[] var3 = class33.field372;
         int var4 = 0;
         if (var1 != 0 || var2 > var4) {
            do {
               class687 var5 = class661.field9578[var3[var4]];
               if (var5 != null && var5.field6052 > 0) {
                  --var5.field6052;
                  if (~var5.field6052 == -1) {
                     var5.field6034 = null;
                  }
               }

               ++var4;
            } while(var2 > var4);
         }

         int var6 = 0;
         if (var1 != 0 || var6 < class159.field2021) {
            do {
               long var7 = (long)class115.field1381[var6];
               class726 var9 = (class726)class259.field3509.method5681(var7, -1);
               if (var9 != null) {
                  class155 var10 = var9.field10794;
                  if (var10.field6052 > 0) {
                     --var10.field6052;
                     if (~var10.field6052 == -1) {
                        var10.field6034 = null;
                     }
                  }
               }

               ++var6;
            } while(var6 < class159.field2021);

         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field2251[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(IIBIIII)V",
      line = 96
   )
   private final void method1422(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
      int var8 = client.field4530;

      try {
         ++field2244;
         long var9 = -1L;
         int var11 = (arg5 << this.field2231.field4086) + arg4;
         int var12 = arg3 - -(arg0 << this.field2231.field4086);
         int var13 = this.field2231.method2236((byte)117, var11, var12);
         if ((127 & arg4) == 0 || (arg3 & 127) == 0) {
            var9 = (long)var11 & 65535L | ((long)var12 & 65535L) << 16;
            class347 var14 = this.field2228.method5681(var9, -1);
            if (var14 != null) {
               this.method1425(((class169)var14).field2100, -1);
               return;
            }
         }

         short var15 = (short)(this.field2238++);
         if (var9 != -1L) {
            this.field2228.method5682(var9, new class169(var15), (byte)7);
         }

         float var16;
         float var17;
         float var18;
         label114: {
            if (arg4 == 0 && arg3 == 0) {
               var16 = this.field2242[arg6][arg1];
               var17 = this.field2243[arg6][arg1];
               var18 = this.field2227[arg6][arg1];
               if (var8 == 0) {
                  break label114;
               }
            }

            if (this.field2231.field4080 != arg4 || arg3 != 0) {
               if (~this.field2231.field4080 != ~arg4 || ~this.field2231.field4080 != ~arg3) {
                  if (~arg4 == -1 && this.field2231.field4080 == arg3) {
                     var16 = this.field2242[arg6][arg1 + 1];
                     var18 = this.field2227[arg6][arg1 + 1];
                     var17 = this.field2243[arg6][arg1 + 1];
                     if (var8 == 0) {
                        break label114;
                     }
                  }

                  float var19 = (float)arg4 / (float)this.field2231.field4080;
                  float var20 = (float)arg3 / (float)this.field2231.field4080;
                  float var21 = this.field2243[arg6][arg1];
                  float var22 = this.field2227[arg6][arg1];
                  float var23 = this.field2242[arg6][arg1];
                  float var24 = this.field2243[arg6 + 1][arg1];
                  float var25 = this.field2227[arg6 - -1][arg1];
                  float var26 = this.field2242[arg6 + 1][arg1];
                  float var27 = (this.field2227[arg6 + 1][arg1 - -1] + -var25) * var19 + var25;
                  float var28 = (this.field2243[arg6][arg1 + 1] + -var21) * var19 + var21;
                  float var29 = (this.field2242[arg6][arg1 - -1] + -var23) * var19 + var23;
                  float var30 = (this.field2227[arg6][arg1 + 1] + -var22) * var19 + var22;
                  float var31 = (this.field2243[arg6 + 1][arg1 + 1] + -var24) * var19 + var24;
                  var17 = (var31 - var28) * var20 + var28;
                  var18 = (var27 - var30) * var20 + var30;
                  float var32 = (this.field2242[arg6 + 1][arg1 - -1] - var26) * var19 + var26;
                  var16 = (-var29 + var32) * var20 + var29;
                  if (var8 == 0) {
                     break label114;
                  }
               }

               var17 = this.field2243[arg6 + 1][arg1 + 1];
               var16 = this.field2242[arg6 + 1][arg1 + 1];
               var18 = this.field2227[arg6 + 1][arg1 + 1];
               if (var8 == 0) {
                  break label114;
               }
            }

            var16 = this.field2242[arg6 + 1][arg1];
            var18 = this.field2227[arg6 + 1][arg1];
            var17 = this.field2243[arg6 - -1][arg1];
         }

         float var33 = (float)(this.field2239.method5420(true) - var11);
         float var34 = (float)(this.field2239.method5423(3378) - var13);
         float var35 = (float)(-var12 + this.field2239.method5425((byte)-81));
         float var36 = (float)Math.sqrt((double)(var35 * var35 + var33 * var33 + var34 * var34));
         float var37 = 1.0F / var36;
         float var38 = var33 * var37;
         float var39 = var35 * var37;
         float var40 = var34 * var37;
         float var41 = var36 / (float)this.field2239.method5424(34065);
         if (arg2 < -90) {
            float var42 = 1.0F - var41 * var41;
            if (var42 < 0.0F) {
               var42 = 0.0F;
            }

            float var43 = var16 * var39 + var17 * var38 + var18 * var40;
            if (var43 < 0.0F) {
               var43 = 0.0F;
            }

            float var44 = var42 * var43 * 2.0F;
            if (var44 > 1.0F) {
               var44 = 1.0F;
            }

            int var45 = this.field2239.method5421(-72);
            int var46 = (int)((float)(255 & var45 >> 16) * var44);
            if (var46 > 255) {
               var46 = 255;
            }

            int var47 = (int)((float)((65377 & var45) >> 8) * var44);
            if (var47 > 255) {
               var47 = 255;
            }

            int var48;
            label65: {
               var48 = (int)((float)(255 & var45) * var44);
               if (this.field2247.field10006) {
                  this.field2235.method5537((float)var11, (byte)-48);
                  this.field2235.method5537((float)var13, (byte)-48);
                  this.field2235.method5537((float)var12, (byte)-48);
                  if (var8 == 0) {
                     break label65;
                  }
               }

               this.field2235.method5536((float)var11, true);
               this.field2235.method5536((float)var13, true);
               this.field2235.method5536((float)var12, true);
            }

            if (var48 > 255) {
               var48 = 255;
            }

            this.field2235.method1085(var46, (byte)-11);
            this.field2235.method1085(var47, (byte)-11);
            this.field2235.method1085(var48, (byte)-11);
            this.field2235.method1085(255, (byte)-11);
            this.method1425(var15, -1);
         }
      } catch (RuntimeException var50) {
         throw class670.method4877(var50, field2251[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "([[ZIIII)V",
      line = 268
   )
   public final void method1423(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4) {
      int var6 = client.field4530;

      try {
         if (arg4 >= -113) {
            method1421(-56);
         }

         ++field2237;
         if (this.field2229 != null) {
            if (this.field2232 <= arg1 + arg3) {
               if (this.field2230 >= -arg1 + arg3) {
                  if (this.field2249 <= arg1 + arg2) {
                     if (this.field2225 >= arg2 - arg1) {
                        int var7 = this.field2249;
                        if (var6 != 0 || var7 <= this.field2225) {
                           do {
                              int var8 = this.field2232;
                              if (var6 != 0 || ~var8 >= ~this.field2230) {
                                 do {
                                    int var9 = -arg3 + var8;
                                    int var10 = -arg2 + var7;
                                    if (~var9 < ~(-arg1) && ~var9 > ~arg1 && ~var10 < ~(-arg1) && ~var10 > ~arg1 && arg0[arg1 + var9][arg1 + var10]) {
                                       this.field2247.method4782((int)(this.field2239.method5422((byte)85) * 255.0F) << 24, 53);
                                       this.field2247.method4847((class380)null, 120, this.field2236, this.field2241, (class380)null);
                                       this.field2247.method4781(this.field2226, 4, this.field2229, 0, 1024);
                                       return;
                                    }

                                    ++var8;
                                 } while(~var8 >= ~this.field2230);
                              }

                              ++var7;
                           } while(var7 <= this.field2225);

                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field2251[3] + (arg0 != null ? field2251[5] : field2251[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(I)V",
      line = 336
   )
   public static void method1424(int arg0) {
      try {
         field2240 = null;
         if (arg0 != 3) {
            method1424(15);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2251[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(SI)V",
      line = 350
   )
   private final void method1425(short arg0, int arg1) {
      try {
         if (arg1 != -1) {
            method1421(-105);
         }

         label19: {
            if (!this.field2247.field10006) {
               this.field2233.method1080(true, arg0);
               if (client.field4530 == 0) {
                  break label19;
               }
            }

            this.field2233.method1103(arg0, -61);
         }

         ++field2245;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2251[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "<init>",
      descriptor = "(Lck;Ltda;Llja;[I)V",
      line = 368
   )
   public class181(class667 param1, class663 param2, class744 param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1426(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1427(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

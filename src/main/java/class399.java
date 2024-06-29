import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class399 extends class247 {
   @OriginalMember(
      owner = "client!tia",
      name = "k",
      descriptor = "Ldaa;"
   )
   private class226 field5906;
   @OriginalMember(
      owner = "client!tia",
      name = "o",
      descriptor = "Lpj;"
   )
   private class423 field5909;
   @OriginalMember(
      owner = "client!tia",
      name = "j",
      descriptor = "Lpha;"
   )
   private class757 field5918;
   @OriginalMember(
      owner = "client!tia",
      name = "w",
      descriptor = "I"
   )
   private int field5920;
   @OriginalMember(
      owner = "client!tia",
      name = "s",
      descriptor = "I"
   )
   private int field5919;
   @OriginalMember(
      owner = "client!tia",
      name = "E",
      descriptor = "I"
   )
   private int field5907;
   @OriginalMember(
      owner = "client!tia",
      name = "t",
      descriptor = "I"
   )
   private int field5921;
   @OriginalMember(
      owner = "client!tia",
      name = "y",
      descriptor = "[[F"
   )
   private float[][] field5926;
   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "[[F"
   )
   private float[][] field5916;
   @OriginalMember(
      owner = "client!tia",
      name = "u",
      descriptor = "[[F"
   )
   private float[][] field5924;
   @OriginalMember(
      owner = "client!tia",
      name = "B",
      descriptor = "I"
   )
   private int field5905;
   @OriginalMember(
      owner = "client!tia",
      name = "F",
      descriptor = "Lida;"
   )
   private class99 field5922;
   @OriginalMember(
      owner = "client!tia",
      name = "r",
      descriptor = "Ldca;"
   )
   private class581 field5917;
   @OriginalMember(
      owner = "client!tia",
      name = "H",
      descriptor = "Lbga;"
   )
   private class398 field5904;
   @OriginalMember(
      owner = "client!tia",
      name = "n",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field5910;
   @OriginalMember(
      owner = "client!tia",
      name = "D",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field5914;
   @OriginalMember(
      owner = "client!tia",
      name = "x",
      descriptor = "I"
   )
   private int field5911;
   @OriginalMember(
      owner = "client!tia",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5929 = new String[]{method3114(method3113("ZU*\u0004~\u0006")), method3114(method3113("@I'F")), method3114(method3113("ZU*\u0004\u007f\u0006")), method3114(method3113("U\u0012e\u0004G")), method3114(method3113("ZU*\u0004\u0006GR\"^\u0004\u0006")), method3114(method3113("ZU*\u0004x\u0006")), method3114(method3113("ZU*\u0004y\u0006")), method3114(method3113("ZU*\u0004|\u0006")), method3114(method3113("ZU*\u0004{\u0006")), method3114(method3113("ZU*\u0004}\u0006"))};
   @OriginalMember(
      owner = "client!tia",
      name = "q",
      descriptor = "I"
   )
   public static int field5925 = 328;
   @OriginalMember(
      owner = "client!tia",
      name = "A",
      descriptor = "I"
   )
   public static int field5908;
   @OriginalMember(
      owner = "client!tia",
      name = "C",
      descriptor = "I"
   )
   public static int field5913;
   @OriginalMember(
      owner = "client!tia",
      name = "l",
      descriptor = "I"
   )
   public static int field5915;
   @OriginalMember(
      owner = "client!tia",
      name = "m",
      descriptor = "I"
   )
   public static int field5923;
   @OriginalMember(
      owner = "client!tia",
      name = "v",
      descriptor = "I"
   )
   public static int field5927;
   @OriginalMember(
      owner = "client!tia",
      name = "G",
      descriptor = "I"
   )
   public static int field5928;
   @OriginalMember(
      owner = "client!tia",
      name = "p",
      descriptor = "[Ldea;"
   )
   public static class471[] field5912;

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(B[B)V"
   )
   public static final void method3106(byte param0, byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(I[[ZIII)V"
   )
   public final void method3107(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field10022;

      try {
         ++field5915;
         if (this.field5922 != null) {
            if (arg2 - -arg4 >= this.field5920) {
               if (arg2 - arg4 <= this.field5919) {
                  if (~(arg0 + arg4) <= ~this.field5907) {
                     int var7 = -91 / ((-45 - arg3) / 49);
                     if (-arg4 + arg0 <= this.field5921) {
                        int var8 = this.field5907;
                        if (var6 || ~this.field5921 <= ~var8) {
                           do {
                              int var9 = this.field5920;
                              if (var6 || ~this.field5919 <= ~var9) {
                                 do {
                                    int var10 = -arg2 + var9;
                                    int var11 = -arg0 + var8;
                                    if (~var10 < ~(-arg4) && var10 < arg4 && -arg4 < var11 && var11 < arg4 && arg1[arg4 + var10][arg4 + var11]) {
                                       this.field5906.method1985((byte)((int)(this.field5918.method5471(0) * 255.0F)), 5);
                                       this.field5906.method1254(0, this.field5917, 4);
                                       this.field5906.method1263(this.field5906.field3523, 85);
                                       this.field5906.method1230(this.field5911, this.field5905 / 3, this.field5922, (byte)95, class482.field6912, 0, 0);
                                       return;
                                    }

                                    ++var9;
                                 } while(~this.field5919 <= ~var9);
                              }

                              ++var8;
                           } while(~this.field5921 <= ~var8);

                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field5929[7] + arg0 + ',' + (arg1 != null ? field5929[3] : field5929[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method3108(byte arg0) {
      try {
         if (arg0 != -4) {
            return 17;
         } else {
            ++field5927;
            return class224.field3175++;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5929[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(IS)V"
   )
   private final void method3109(int arg0, short arg1) {
      try {
         if (arg0 != 1) {
            this.field5914 = null;
         }

         label19: {
            if (Stream.method3185()) {
               this.field5914.method3181(arg1);
               if (!client.field10022) {
                  break label19;
               }
            }

            this.field5914.method3178(arg1);
         }

         ++field5928;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5929[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(Lcu;Z)Ltaa;"
   )
   public static final class612 method3110(class65 arg0, boolean arg1) {
      try {
         ++field5913;
         class634 var2 = class108.method1059(-23386)[arg0.method665(arg1)];
         class730 var3 = class196.method1721(89)[arg0.method665(arg1)];
         int var4 = arg0.method655((byte)59);
         int var5 = arg0.method655((byte)56);
         if (arg1) {
            method3108((byte)32);
         }

         int var6 = arg0.method685(-2);
         int var7 = arg0.method685(-2);
         int var8 = arg0.method655((byte)87);
         int var9 = arg0.method701(255);
         int var10 = arg0.method701(255);
         return new class612(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field5929[2] + (arg0 != null ? field5929[3] : field5929[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(IIZIIII)V"
   )
   private final void method3111(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field10022;

      try {
         ++field5923;
         long var9 = -1L;
         int var11 = (arg5 << this.field5909.field10671) + arg6;
         int var12 = arg0 - -(arg3 << this.field5909.field10671);
         int var13 = this.field5909.method5401(var11, true, var12);
         if (~(127 & arg6) == -1 || (127 & arg0) == 0) {
            var9 = 65535L & (long)var11 | (long)var12 << 16 & 65535L << 16;
            class247 var14 = this.field5904.method3101(-1, var9);
            if (var14 != null) {
               this.method3109(1, ((class687)var14).field9908);
               return;
            }
         }

         short var15 = (short)(this.field5911++);
         if (~var9 != 0L) {
            this.field5904.method3098(var9, new class687(var15), -1);
         }

         float var16;
         float var17;
         float var18;
         label117: {
            if (~arg6 != -1 || arg0 != 0) {
               if (this.field5909.field10672 == arg6 && arg0 == 0) {
                  var16 = this.field5916[arg4 - -1][arg1];
                  var17 = this.field5924[arg4 + 1][arg1];
                  var18 = this.field5926[arg4 + 1][arg1];
                  if (!var8) {
                     break label117;
                  }
               }

               if (~this.field5909.field10672 == ~arg6 && this.field5909.field10672 == arg0) {
                  var17 = this.field5924[arg4 - -1][arg1 - -1];
                  var18 = this.field5926[arg4 + 1][arg1 + 1];
                  var16 = this.field5916[arg4 + 1][arg1 - -1];
                  if (!var8) {
                     break label117;
                  }
               }

               if (~arg6 == -1 && this.field5909.field10672 == arg0) {
                  var16 = this.field5916[arg4][arg1 - -1];
                  var18 = this.field5926[arg4][arg1 - -1];
                  var17 = this.field5924[arg4][arg1 + 1];
                  if (!var8) {
                     break label117;
                  }
               }

               float var19 = (float)arg6 / (float)this.field5909.field10672;
               float var20 = (float)arg0 / (float)this.field5909.field10672;
               float var21 = this.field5926[arg4][arg1];
               float var22 = this.field5924[arg4][arg1];
               float var23 = this.field5916[arg4][arg1];
               float var24 = this.field5926[arg4 - -1][arg1];
               float var25 = this.field5924[arg4 + 1][arg1];
               float var26 = (this.field5916[arg4][arg1 - -1] - var23) * var19 + var23;
               float var27 = (this.field5924[arg4][arg1 + 1] - var22) * var19 + var22;
               float var28 = (this.field5926[arg4 + 1][arg1 + 1] - var24) * var19 + var24;
               float var29 = this.field5916[arg4 - -1][arg1];
               float var30 = (this.field5924[arg4 - -1][arg1 + 1] - var25) * var19 + var25;
               float var31 = (this.field5926[arg4][arg1 - -1] + -var21) * var19 + var21;
               float var32 = (this.field5916[arg4 + 1][arg1 - -1] - var29) * var19 + var29;
               var17 = (-var27 + var30) * var20 + var27;
               var18 = (-var31 + var28) * var20 + var31;
               var16 = (var32 - var26) * var20 + var26;
               if (!var8) {
                  break label117;
               }
            }

            var16 = this.field5916[arg4][arg1];
            var18 = this.field5926[arg4][arg1];
            var17 = this.field5924[arg4][arg1];
         }

         float var33 = (float)(this.field5918.method5474(10368) - var11);
         float var34 = (float)(this.field5918.method5470(true) - var13);
         float var35 = (float)(-var12 + this.field5918.method5469((byte)13));
         float var36 = (float)Math.sqrt((double)(var35 * var35 + var33 * var33 + var34 * var34));
         float var37 = 1.0F / var36;
         float var38 = var33 * var37;
         float var39 = var34 * var37;
         float var40 = var35 * var37;
         float var41 = var36 / (float)this.field5918.method5465((byte)-118);
         float var42 = 1.0F - var41 * var41;
         if (var42 < 0.0F) {
            var42 = 0.0F;
         }

         float var43 = var16 * var40 + var17 * var39 + var18 * var38;
         if (var43 < 0.0F) {
            var43 = 0.0F;
         }

         float var44 = var42 * var43 * 2.0F;
         if (var44 > 1.0F) {
            var44 = 1.0F;
         }

         int var45 = this.field5918.method5466(true);
         int var46 = (int)((float)(var45 >> 16 & 255) * var44);
         if (~var46 < -256) {
            var46 = 255;
         }

         int var47 = (int)((float)(var45 >> 8 & 255) * var44);
         if (var47 > 255) {
            var47 = 255;
         }

         int var48 = (int)((float)(255 & var45) * var44);
         if (~var48 < -256) {
            var48 = 255;
         }

         label74: {
            if (Stream.method3185()) {
               this.field5910.method3186((float)var11);
               this.field5910.method3186((float)var13);
               this.field5910.method3186((float)var12);
               if (!var8) {
                  break label74;
               }
            }

            this.field5910.method3179((float)var11);
            this.field5910.method3179((float)var13);
            this.field5910.method3179((float)var12);
         }

         label69: {
            if (this.field5906.field3442 != 0) {
               this.field5910.method3183(var46);
               this.field5910.method3183(var47);
               this.field5910.method3183(var48);
               if (!var8) {
                  break label69;
               }
            }

            this.field5910.method3183(var48);
            this.field5910.method3183(var47);
            this.field5910.method3183(var46);
         }

         this.field5910.method3183(255);
         if (arg2) {
            this.field5904 = null;
         }

         this.method3109(1, var15);
      } catch (RuntimeException var50) {
         throw class612.method4503(var50, field5929[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3112(byte arg0) {
      try {
         if (arg0 != -8) {
            field5925 = -58;
         }

         field5912 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5929[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "<init>",
      descriptor = "(Ldaa;Lpj;Lpha;[I)V"
   )
   public class399(class226 param1, class423 param2, class757 param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3113(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3114(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class705 extends class428 {
   @OriginalMember(
      owner = "client!lt",
      name = "v",
      descriptor = "Lsc;"
   )
   private class369 field10304;
   @OriginalMember(
      owner = "client!lt",
      name = "r",
      descriptor = "Ldj;"
   )
   private class363 field10285;
   @OriginalMember(
      owner = "client!lt",
      name = "B",
      descriptor = "Lmn;"
   )
   private class389 field10295;
   @OriginalMember(
      owner = "client!lt",
      name = "G",
      descriptor = "I"
   )
   private int field10292;
   @OriginalMember(
      owner = "client!lt",
      name = "o",
      descriptor = "I"
   )
   private int field10306;
   @OriginalMember(
      owner = "client!lt",
      name = "L",
      descriptor = "I"
   )
   private int field10294;
   @OriginalMember(
      owner = "client!lt",
      name = "C",
      descriptor = "I"
   )
   private int field10303;
   @OriginalMember(
      owner = "client!lt",
      name = "D",
      descriptor = "[[F"
   )
   private float[][] field10298;
   @OriginalMember(
      owner = "client!lt",
      name = "s",
      descriptor = "[[F"
   )
   private float[][] field10289;
   @OriginalMember(
      owner = "client!lt",
      name = "u",
      descriptor = "[[F"
   )
   private float[][] field10287;
   @OriginalMember(
      owner = "client!lt",
      name = "H",
      descriptor = "I"
   )
   private int field10291;
   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "Lwv;"
   )
   private class37 field10300;
   @OriginalMember(
      owner = "client!lt",
      name = "t",
      descriptor = "Llba;"
   )
   private class576 field10305;
   @OriginalMember(
      owner = "client!lt",
      name = "m",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field10297;
   @OriginalMember(
      owner = "client!lt",
      name = "F",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field10293;
   @OriginalMember(
      owner = "client!lt",
      name = "y",
      descriptor = "Lbk;"
   )
   private class398 field10302;
   @OriginalMember(
      owner = "client!lt",
      name = "p",
      descriptor = "I"
   )
   private int field10296;
   @OriginalMember(
      owner = "client!lt",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10308 = new String[]{method5137(method5136("-\u00124;")), method5137(method5136("8Ivy\"")), method5137(method5136("/\u0013vk6-\u000e,iw")), method5137(method5136("/\u0013v\u0013w")), method5137(method5136("/\u0013v\u0015w")), method5137(method5136("/\u0013v\u0011w")), method5137(method5136("/\u0013v\u0012w")), method5137(method5136("/\u0013v\u0014w")), method5137(method5136("/\u0013v\u0016w"))};
   @OriginalMember(
      owner = "client!lt",
      name = "I",
      descriptor = "Z"
   )
   public static boolean field10290 = false;
   @OriginalMember(
      owner = "client!lt",
      name = "J",
      descriptor = "I"
   )
   public static int field10284;
   @OriginalMember(
      owner = "client!lt",
      name = "n",
      descriptor = "I"
   )
   public static int field10286;
   @OriginalMember(
      owner = "client!lt",
      name = "w",
      descriptor = "I"
   )
   public static int field10288;
   @OriginalMember(
      owner = "client!lt",
      name = "E",
      descriptor = "I"
   )
   public static int field10299;
   @OriginalMember(
      owner = "client!lt",
      name = "K",
      descriptor = "I"
   )
   public static int field10301;
   @OriginalMember(
      owner = "client!lt",
      name = "x",
      descriptor = "Lru;"
   )
   public static class206 field10283;
   @OriginalMember(
      owner = "client!lt",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field10307;

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(BI)Z",
      line = 8
   )
   public static final boolean method5130(byte arg0, int arg1) {
      try {
         ++field10284;
         if (arg0 != 51) {
            return false;
         } else {
            return ~arg1 <= -1 && ~arg1 >= -4 || ~arg1 == -10;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10308[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(IS)V",
      line = 25
   )
   private final void method5131(int arg0, short arg1) {
      try {
         ++field10288;
         if (arg0 == 1) {
            if (!Stream.method5106()) {
               this.field10293.method5099(arg1);
            } else {
               this.field10293.method5103(arg1);
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10308[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(IBI[[ZI)V",
      line = 41
   )
   public final void method5132(int arg0, byte arg1, int arg2, boolean[][] arg3, int arg4) {
      boolean var6 = client.field4360;

      try {
         ++field10301;
         if (this.field10305 != null) {
            if (arg1 != -127) {
               this.method5134(-32, (byte)69, -9, -7, -92, -29, 42);
            }

            if (arg2 - -arg4 >= this.field10292) {
               if (this.field10306 >= arg2 - arg4) {
                  if (~(arg0 + arg4) <= ~this.field10294) {
                     if (this.field10303 >= -arg4 + arg0) {
                        int var7 = this.field10294;
                        if (var6 || ~this.field10303 <= ~var7) {
                           do {
                              int var8 = this.field10292;
                              if (var6 || this.field10306 >= var8) {
                                 do {
                                    int var9 = var8 - arg2;
                                    int var10 = -arg0 + var7;
                                    if (~(-arg4) > ~var9 && ~var9 > ~arg4 && var10 > -arg4 && var10 < arg4 && arg3[arg4 + var9][var10 - -arg4]) {
                                       this.field10304.method2782((byte)86, (byte)((int)(this.field10295.method2962(-1) * 255.0F)));
                                       this.field10304.method2585(12, 0, this.field10302);
                                       this.field10304.method2621(this.field10304.field5355, -18344);
                                       this.field10304.method2628(this.field10305, (byte)46, class394.field5700, this.field10291 / 3, 0, 0, this.field10296);
                                       return;
                                    }

                                    ++var8;
                                 } while(this.field10306 >= var8);
                              }

                              ++var7;
                           } while(~this.field10303 <= ~var7);

                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field10308[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10308[1] : field10308[0]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 101
   )
   public static final void method5133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         class407.field5885 = arg5;
         class73.field906 = arg2;
         class382.field5505 = arg3;
         class9.field87 = arg1;
         ++field10299;
         class720.field10511 = arg4;
         if (arg6 != -15160) {
            field10283 = null;
         }

         class782.field11470 = arg0;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field10308[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(IBIIIII)V",
      line = 121
   )
   private final void method5134(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4360;

      try {
         ++field10286;
         long var9 = -1L;
         int var11 = (arg5 << this.field10285.field4065) + arg2;
         int var12 = (arg4 << this.field10285.field4065) + arg6;
         int var13 = this.field10285.method2220(var12, var11, 118);
         if (~(arg2 & 127) == -1 || (127 & arg6) == 0) {
            var9 = 65535L << 16 & (long)var12 << 16 | 65535L & (long)var11;
            class428 var14 = this.field10300.method329((byte)99, var9);
            if (var14 != null) {
               this.method5131(1, ((class275)var14).field3766);
               return;
            }
         }

         short var15 = (short)(this.field10296++);
         if (~var9 != 0L) {
            this.field10300.method336(-1, var9, new class275(var15));
         }

         float var16;
         float var17;
         float var18;
         label123: {
            if (~arg2 == -1 && ~arg6 == -1) {
               var16 = this.field10289[arg3][arg0];
               var17 = this.field10298[arg3][arg0];
               var18 = this.field10287[arg3][arg0];
               if (!var8) {
                  break label123;
               }
            }

            if (this.field10285.field4062 == arg2 && ~arg6 == -1) {
               var16 = this.field10289[arg3 - -1][arg0];
               var17 = this.field10298[arg3 + 1][arg0];
               var18 = this.field10287[arg3 + 1][arg0];
               if (!var8) {
                  break label123;
               }
            }

            if (this.field10285.field4062 != arg2 || this.field10285.field4062 != arg6) {
               if (arg2 != 0 || ~this.field10285.field4062 != ~arg6) {
                  float var19 = (float)arg2 / (float)this.field10285.field4062;
                  float var20 = (float)arg6 / (float)this.field10285.field4062;
                  float var21 = this.field10298[arg3][arg0];
                  float var22 = this.field10287[arg3][arg0];
                  float var23 = this.field10289[arg3][arg0];
                  float var24 = this.field10298[arg3 + 1][arg0];
                  float var25 = this.field10287[arg3 - -1][arg0];
                  float var26 = this.field10289[arg3 + 1][arg0];
                  float var27 = (this.field10298[arg3][arg0 - -1] - var21) * var19 + var21;
                  float var28 = (this.field10298[arg3 + 1][arg0 + 1] - var24) * var19 + var24;
                  float var29 = (this.field10289[arg3][arg0 - -1] - var23) * var19 + var23;
                  float var30 = (this.field10287[arg3 + 1][arg0 - -1] - var25) * var19 + var25;
                  float var31 = (this.field10287[arg3][arg0 + 1] - var22) * var19 + var22;
                  var17 = (var28 - var27) * var20 + var27;
                  var18 = (-var31 + var30) * var20 + var31;
                  float var32 = (this.field10289[arg3 + 1][arg0 + 1] - var26) * var19 + var26;
                  var16 = (var32 - var29) * var20 + var29;
                  if (!var8) {
                     break label123;
                  }
               }

               var18 = this.field10287[arg3][arg0 + 1];
               var16 = this.field10289[arg3][arg0 + 1];
               var17 = this.field10298[arg3][arg0 + 1];
               if (!var8) {
                  break label123;
               }
            }

            var18 = this.field10287[arg3 + 1][arg0 + 1];
            var17 = this.field10298[arg3 + 1][arg0 + 1];
            var16 = this.field10289[arg3 + 1][arg0 + 1];
         }

         float var33 = (float)(this.field10295.method2955(false) + -var11);
         float var34 = (float)(-var13 + this.field10295.method2959(92));
         float var35 = (float)(-var12 + this.field10295.method2963(true));
         float var36 = (float)Math.sqrt((double)(var35 * var35 + var33 * var33 + var34 * var34));
         float var37 = 1.0F / var36;
         float var38 = var34 * var37;
         float var39 = var33 * var37;
         float var40 = var35 * var37;
         if (arg1 <= -29) {
            float var41 = var36 / (float)this.field10295.method2958((byte)113);
            float var42 = -(var41 * var41) + 1.0F;
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

            int var45 = this.field10295.method2961(124);
            int var46 = (int)((float)(var45 >> 16 & 255) * var44);
            if (var46 > 255) {
               var46 = 255;
            }

            int var47 = (int)((float)((var45 & 65354) >> 8) * var44);
            if (var47 > 255) {
               var47 = 255;
            }

            int var48 = (int)((float)(var45 & 255) * var44);
            if (var48 > 255) {
               var48 = 255;
            }

            label73: {
               if (!Stream.method5106()) {
                  this.field10297.method5104((float)var11);
                  this.field10297.method5104((float)var13);
                  this.field10297.method5104((float)var12);
                  if (!var8) {
                     break label73;
                  }
               }

               this.field10297.method5098((float)var11);
               this.field10297.method5098((float)var13);
               this.field10297.method5098((float)var12);
            }

            label68: {
               if (this.field10304.field5278 == 0) {
                  this.field10297.method5105(var48);
                  this.field10297.method5105(var47);
                  this.field10297.method5105(var46);
                  if (!var8) {
                     break label68;
                  }
               }

               this.field10297.method5105(var46);
               this.field10297.method5105(var47);
               this.field10297.method5105(var48);
            }

            this.field10297.method5105(255);
            this.method5131(1, var15);
         }
      } catch (RuntimeException var50) {
         throw class237.method1823(var50, field10308[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(I)V",
      line = 300
   )
   public static void method5135(int arg0) {
      try {
         if (arg0 >= -54) {
            method5133(-117, 24, 120, -74, -66, 124, -108);
         }

         field10307 = null;
         field10283 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10308[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "<init>",
      descriptor = "(Lsc;Ldj;Lmn;[I)V",
      line = 315
   )
   public class705(class369 param1, class363 param2, class389 param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5136(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5137(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

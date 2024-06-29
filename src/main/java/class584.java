import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class584 {
   @OriginalMember(
      owner = "client!vr",
      name = "c",
      descriptor = "Lsa;"
   )
   private class39 field8197;
   @OriginalMember(
      owner = "client!vr",
      name = "d",
      descriptor = "I"
   )
   public int field8200;
   @OriginalMember(
      owner = "client!vr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8202 = new String[]{method4295(method4294("8P\u007f\u0013")), method4295(method4294("-\u000b=Qz")), method4295(method4294(" W==/")), method4295(method4294(" W=</")), method4295(method4294(" W=Cn8LgA/")), method4295(method4294(" W=>/"))};
   @OriginalMember(
      owner = "client!vr",
      name = "b",
      descriptor = "I"
   )
   public static int field8199;
   @OriginalMember(
      owner = "client!vr",
      name = "e",
      descriptor = "I"
   )
   public static int field8201;
   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field8198;

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4291(int arg0) {
      try {
         field8198 = null;
         if (arg0 <= 84) {
            method4293(77, -103, 53, 89, (int[])null, 62, -54, 110);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8202[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method4292(byte arg0, int arg1) {
      try {
         ++field8201;
         if (arg0 != -35) {
            return true;
         } else {
            return arg1 == 0 || arg1 == 1 || ~arg1 == -3;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8202[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(IIII[IIII)V"
   )
   public static final void method4293(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field10022;

      try {
         if (arg5 != 774680424) {
            field8198 = null;
         }

         ++field8199;
         if (arg7 > 0 && !class122.method1209(arg7, 25)) {
            throw new IllegalArgumentException("");
         } else if (arg2 > 0 && !class122.method1209(arg2, 21)) {
            throw new IllegalArgumentException("");
         } else if (arg6 != 32993) {
            throw new IllegalArgumentException("");
         } else {
            int var9 = 0;
            int var10 = ~arg2 < ~arg7 ? arg7 : arg2;
            int var11 = arg7 >> 1;
            int var12 = arg2 >> 1;
            int[] var13 = arg4;
            int[] var14 = new int[var11 * var12];

            while(true) {
               OpenGL.glTexImage2Di(arg0, var9, arg1, arg7, arg2, 0, arg6, arg3, var13, 0);
               if (var10 <= 1) {
                  return;
               }

               int var10000;
               label92: {
                  int var15 = 0;
                  int var16 = 0;
                  int var17 = var16 - -arg7;
                  int[] var18 = var14;
                  int var19 = 0;
                  if (var8) {
                     var10000 = 0;
                  } else if (~var19 <= ~var12) {
                     var14 = var13;
                     arg7 = var11;
                     var13 = var18;
                     arg2 = var12;
                     var12 >>= 1;
                     var11 >>= 1;
                     ++var9;
                     var10000 = var10 >> 1;
                     if (!var8) {
                        break label92;
                     }
                  } else {
                     var10000 = 0;
                  }

                  while(true) {
                     label89: {
                        int var20 = var10000;
                        if (var8) {
                           var10000 = var13[var16++];
                        } else if (var20 >= var11) {
                           var17 += arg7;
                           var10000 = arg7 + var16;
                           if (!var8) {
                              break label89;
                           }
                        } else {
                           var10000 = var13[var16++];
                        }

                        while(true) {
                           int var21 = var10000;
                           int var22 = var13[var17++];
                           int var23 = var13[var16++];
                           int var24 = 255 & var21 >> 24;
                           int var25 = var21 & 255;
                           int var26 = 255 & var21 >> 8;
                           int var27 = 255 & var21 >> 16;
                           int var28 = var13[var17++];
                           int var29 = (255 & var23) + var25;
                           int var30 = (var23 >> 8 & 255) + var26;
                           int var31 = ((16727830 & var23) >> 16) + var27;
                           int var32 = (255 & var23 >> 24) + var24;
                           int var33 = (var22 >> 8 & 255) + var30;
                           int var34 = (var22 & 255) + var29;
                           int var35 = (255 & var22 >> 24) + var32;
                           int var36 = (var22 >> 16 & 255) + var31;
                           int var37 = ((16754164 & var28) >> 16) + var36;
                           int var38 = (255 & var28 >> 24) + var35;
                           int var39 = (var28 & 255) + var34;
                           int var40 = ((var28 & 65523) >> 8) + var33;
                           var14[var15++] = class91.method932(class697.method5101(var39 >> 2, 255), class91.method932(class697.method5101(65280, var40 << 6), class91.method932(class697.method5101(-16777216, var38 << 22), class697.method5101(var37, 1020) << 14)));
                           ++var20;
                           if (var20 >= var11) {
                              var17 += arg7;
                              var10000 = arg7 + var16;
                              if (!var8) {
                                 break;
                              }
                           } else {
                              var10000 = var13[var16++];
                           }
                        }
                     }

                     var16 = var10000;
                     ++var19;
                     if (~var19 <= ~var12) {
                        var14 = var13;
                        arg7 = var11;
                        var13 = var18;
                        arg2 = var12;
                        var12 >>= 1;
                        var11 >>= 1;
                        ++var9;
                        var10000 = var10 >> 1;
                        if (!var8) {
                           break;
                        }
                     } else {
                        var10000 = 0;
                     }
                  }
               }

               var10 = var10000;
            }
         }
      } catch (RuntimeException var42) {
         throw class612.method4503(var42, field8202[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8202[1] : field8202[0]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class584(class392 arg0, int arg1, class39 arg2) {
      new class107(64);

      try {
         this.field8197 = arg2;
         this.field8200 = this.field8197.method434((byte)-106, 15);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8202[4] + (arg0 != null ? field8202[1] : field8202[0]) + ',' + arg1 + ',' + (arg2 != null ? field8202[1] : field8202[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4294(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4295(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

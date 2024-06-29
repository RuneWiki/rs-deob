import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class430 extends class493 {
   @OriginalMember(
      owner = "client!cga",
      name = "o",
      descriptor = "I"
   )
   private int field5841;
   @OriginalMember(
      owner = "client!cga",
      name = "h",
      descriptor = "I"
   )
   private int field5847;
   @OriginalMember(
      owner = "client!cga",
      name = "j",
      descriptor = "I"
   )
   private int field5838;
   @OriginalMember(
      owner = "client!cga",
      name = "i",
      descriptor = "I"
   )
   private int field5840;
   @OriginalMember(
      owner = "client!cga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5851 = new String[]{method3327(method3326("\u001d\u0000I>HV")), method3327(method3326("\u001d\u0000I>JV")), method3327(method3326("\u001d\u0000I>OV")), method3327(method3326("\u001d\u0000I>AV")), method3327(method3326("\u001d\u0000I>5\u0017\tAd7V")), method3327(method3326("\u001d\u0000I>LV")), method3327(method3326("\u0005I\u0006>t")), method3327(method3326("\u0010\u0012D|")), method3327(method3326("\u001d\u0000I>NV"))};
   @OriginalMember(
      owner = "client!cga",
      name = "l",
      descriptor = "Lpo;"
   )
   public static class372 field5848 = new class372(64);
   @OriginalMember(
      owner = "client!cga",
      name = "m",
      descriptor = "[B"
   )
   public static byte[] field5850 = new byte[2048];
   @OriginalMember(
      owner = "client!cga",
      name = "q",
      descriptor = "I"
   )
   public static int field5839;
   @OriginalMember(
      owner = "client!cga",
      name = "g",
      descriptor = "I"
   )
   public static int field5842;
   @OriginalMember(
      owner = "client!cga",
      name = "n",
      descriptor = "I"
   )
   public static int field5843;
   @OriginalMember(
      owner = "client!cga",
      name = "k",
      descriptor = "I"
   )
   public static int field5844;
   @OriginalMember(
      owner = "client!cga",
      name = "s",
      descriptor = "I"
   )
   public static int field5845;
   @OriginalMember(
      owner = "client!cga",
      name = "p",
      descriptor = "I"
   )
   public static int field5846;
   @OriginalMember(
      owner = "client!cga",
      name = "r",
      descriptor = "I"
   )
   public static int field5849;

   @OriginalMember(
      owner = "client!cga",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3323(int arg0) {
      try {
         field5848 = null;
         if (arg0 != 953875920) {
            field5849 = -47;
         }

         field5850 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5851[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public final void method2673(int arg0, int arg1, boolean arg2) {
      try {
         ++field5843;
         int var4 = this.field5847 * arg0 >> 12;
         int var5 = this.field5838 * arg0 >> 12;
         int var6 = this.field5840 * arg1 >> 12;
         int var7 = this.field5841 * arg1 >> 12;
         class552.method4178(var6, var5, arg2, super.field6887, var7, var4);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field5851[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   public class430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(-1, arg4, arg5);

      try {
         this.field5841 = arg3;
         this.field5847 = arg0;
         this.field5838 = arg2;
         this.field5840 = arg1;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field5851[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method3324(int arg0, int arg1, int arg2) {
      try {
         if (arg0 <= 124) {
            field5848 = null;
         }

         ++field5844;
         return ~(arg2 & 32768) != -1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5851[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(IIII[IIII)V"
   )
   public static final void method3325(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field1481;

      try {
         ++field5842;
         if (arg0 > 0 && !class181.method1525((byte)-95, arg0)) {
            throw new IllegalArgumentException("");
         } else if (arg3 > 0 && !class181.method1525((byte)-114, arg3)) {
            throw new IllegalArgumentException("");
         } else if (~arg2 != -32994) {
            throw new IllegalArgumentException("");
         } else {
            int var9 = 0;
            if (arg6 != 1020) {
               method3324(-111, -98, -31);
            }

            int var10 = arg0 >= arg3 ? arg3 : arg0;
            int var11 = arg0 >> 1;
            int var12 = arg3 >> 1;
            int[] var13 = arg4;
            int[] var14 = new int[var11 * var12];

            while(true) {
               OpenGL.glTexImage2Di(arg7, var9, arg1, arg0, arg3, 0, arg2, arg5, var13, 0);
               if (~var10 >= -2) {
                  return;
               }

               int var10000;
               label92: {
                  int var15 = 0;
                  int var16 = 0;
                  int var17 = arg0 + var16;
                  int[] var18 = var14;
                  int var19 = 0;
                  if (var8) {
                     var10000 = 0;
                  } else if (~var19 <= ~var12) {
                     var14 = var13;
                     arg0 = var11;
                     arg3 = var12;
                     var13 = var18;
                     ++var9;
                     var12 >>= 1;
                     var11 >>= 1;
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
                           var17 += arg0;
                           var10000 = arg0 + var16;
                           if (!var8) {
                              break label89;
                           }
                        } else {
                           var10000 = var13[var16++];
                        }

                        while(true) {
                           int var21 = var10000;
                           int var22 = var13[var16++];
                           int var23 = var13[var17++];
                           int var24 = 255 & var21 >> 24;
                           int var25 = var21 >> 8 & 255;
                           int var26 = 255 & var21 >> 16;
                           int var27 = 255 & var21;
                           int var28 = var13[var17++];
                           int var29 = (255 & var22 >> 16) + var26;
                           int var30 = (255 & var22 >> 24) + var24;
                           int var31 = (255 & var22 >> 8) + var25;
                           int var32 = (var22 & 255) + var27;
                           int var33 = (255 & var23 >> 24) + var30;
                           int var34 = (255 & var23 >> 8) + var31;
                           int var35 = (var23 >> 16 & 255) + var29;
                           int var36 = (255 & var23) + var32;
                           int var37 = (var28 >> 24 & 255) + var33;
                           int var38 = (var28 & 255) + var36;
                           int var39 = ((var28 & 65421) >> 8) + var34;
                           int var40 = (255 & var28 >> 16) + var35;
                           var14[var15++] = class2.method15(class109.method974(var38, 1020) >> 2, class2.method15(class2.method15(class109.method974(var40, 1020) << 14, class109.method974(var37, 1020) << 22), class109.method974(1020, var39) << 6));
                           ++var20;
                           if (var20 >= var11) {
                              var17 += arg0;
                              var10000 = arg0 + var16;
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
                        arg0 = var11;
                        arg3 = var12;
                        var13 = var18;
                        ++var9;
                        var12 >>= 1;
                        var11 >>= 1;
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
         throw class93.method866(var42, field5851[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5851[6] : field5851[7]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2671(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -2) {
            this.method2668(-73, true, 101);
         }

         ++field5839;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5851[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(IZI)V"
   )
   public final void method2668(int arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            this.method2671(52, 42, -64);
         }

         ++field5846;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5851[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3326(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3327(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

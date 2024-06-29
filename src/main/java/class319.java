import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class319 extends class757 {
   @OriginalMember(
      owner = "client!qv",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4773 = new String[]{method2584(method2583("\u0001I\fB6")), method2584(method2583("\u0001I\fF6")), method2584(method2583("\u001eJNo")), method2584(method2583("\u0001I\fE6")), method2584(method2583("\u000b\u0011\f-c")), method2584(method2583("#WCg{\u0002\u001fAls\u0000VNf>\u0016^Ko{\u0014\u0005")), method2584(method2583("\u0001I\f@6")), method2584(method2583("\u0001I\fG6")), method2584(method2583("\u0001I\fA6"))};
   @OriginalMember(
      owner = "client!qv",
      name = "B",
      descriptor = "[I"
   )
   public static int[] field4771 = new int[6];
   @OriginalMember(
      owner = "client!qv",
      name = "D",
      descriptor = "I"
   )
   public static int field4765;
   @OriginalMember(
      owner = "client!qv",
      name = "C",
      descriptor = "I"
   )
   public static int field4766;
   @OriginalMember(
      owner = "client!qv",
      name = "F",
      descriptor = "I"
   )
   public static int field4767;
   @OriginalMember(
      owner = "client!qv",
      name = "A",
      descriptor = "I"
   )
   public static int field4768;
   @OriginalMember(
      owner = "client!qv",
      name = "J",
      descriptor = "I"
   )
   public static int field4770;
   @OriginalMember(
      owner = "client!qv",
      name = "H",
      descriptor = "I"
   )
   public static int field4772;
   @OriginalMember(
      owner = "client!qv",
      name = "G",
      descriptor = "Lda;"
   )
   public static class216 field4764;
   @OriginalMember(
      owner = "client!qv",
      name = "I",
      descriptor = "Liaa;"
   )
   public static class433 field4769;

   @OriginalMember(
      owner = "client!qv",
      name = "c",
      descriptor = "(Z)V"
   )
   public static final void method2579(boolean arg0) {
      boolean var1 = client.field10022;

      try {
         ++field4768;
         class408 var2 = class745.field10605.field3719;
         if (!arg0) {
            method2580(true);
         }

         int var3 = 0;
         if (var1 || var3 < class190.field2788) {
            do {
               int var4 = class463.field6742[var3];
               class799 var5 = ((class432)class573.field8110.method3101(-1, (long)var4)).field6345;
               int var6 = var2.method665(false);
               if ((var6 & 16) != 0) {
                  var6 += var2.method665(false) << 8;
               }

               if (~(var6 & 2048) != -1) {
                  var6 += var2.method665(false) << 16;
               }

               if (~(16384 & var6) != -1) {
                  int var7 = var2.method685(-2);
                  int var8 = var2.method676(-92);
                  if (~var7 == -65536) {
                     var7 = -1;
                  }

                  int var9 = var2.method665(false);
                  int var10 = var9 & 7;
                  int var11 = (120 & var9) >> 3;
                  if (var11 == 15) {
                     var11 = -1;
                  }

                  var5.method3070(var10, (byte)40, 1, false, var11, var8, var7);
               }

               if (~(64 & var6) != -1) {
                  int[] var12 = new int[4];
                  int var13 = 0;
                  if (var1) {
                     var12[var13] = var2.method697(2);
                     if (var12[var13] == 65535) {
                        var12[var13] = -1;
                     }

                     ++var13;
                  }

                  while(true) {
                     while(var13 < 4) {
                        var12[var13] = var2.method697(2);
                        if (var12[var13] == 65535) {
                           var12[var13] = -1;
                        }

                        ++var13;
                     }

                     int var14 = var2.method688(-19476);
                     if (!var1) {
                        class44.method495(var14, true, var5, (byte)79, var12);
                        break;
                     }

                     if (var14 == 1) {
                        var12[var13] = -1;
                     }

                     ++var13;
                  }
               }

               if ((8192 & var6) != 0) {
                  var5.field5851 = var2.method659(128);
                  var5.field5835 = var2.method652(255);
                  var5.field5838 = var2.method659(128);
                  var5.field5846 = (byte)var2.method665(false);
                  var5.field5847 = class51.field770 - -var2.method637(65535);
                  var5.field5852 = class51.field770 - -var2.method697(2);
               }

               if ((var6 & 4) != 0) {
                  if (var5.field11618.method2497(-16017)) {
                     class290.method2402(var5, -66);
                  }

                  var5.method5757(class478.field6879.method4873(var2.method651(-1), true), (byte)-90);
                  var5.method3067(var5.field11618.field4529, 1);
                  var5.field5839 = var5.field11618.field4499 << 3;
                  if (var5.field11618.method2497(-16017)) {
                     class449.method3479(120, var5.field5865[0], var5, 0, var5.field6824, (class158)null, (class544)null, var5.field5861[0]);
                  }
               }

               if (~(var6 & 1) != -1) {
                  var5.field5798 = var2.method651(-1);
                  if (var5.field5798 == 65535) {
                     var5.field5798 = -1;
                  }
               }

               if (~(var6 & 2) != -1) {
                  var5.field11624 = var2.method685(-2);
                  var5.field11626 = var2.method637(65535);
               }

               if (~(var6 & 128) != -1) {
                  int var15 = var2.method651(-1);
                  int var16 = var2.method666((byte)-71);
                  if (~var15 == -65536) {
                     var15 = -1;
                  }

                  int var17 = var2.method688(-19476);
                  int var18 = 7 & var17;
                  int var19 = (124 & var17) >> 3;
                  if (~var19 == -16) {
                     var19 = -1;
                  }

                  var5.method3070(var18, (byte)40, 0, false, var19, var16, var15);
               }

               if ((4096 & var6) != 0) {
                  int var20 = var2.method665(false);
                  int[] var21 = new int[var20];
                  int[] var22 = new int[var20];
                  int[] var23 = new int[var20];
                  int var24 = 0;
                  if (!var1 && var24 >= var20) {
                     class644.method4686(var5, var23, var21, -31133, var22);
                  } else {
                     while(true) {
                        int var25 = var2.method651(-1);
                        if (var25 == 65535) {
                           var25 = -1;
                        }

                        var21[var24] = var25;
                        var22[var24] = var2.method665(false);
                        var23[var24] = var2.method651(-1);
                        ++var24;
                        if (var24 >= var20) {
                           class644.method4686(var5, var23, var21, -31133, var22);
                           break;
                        }
                     }
                  }
               }

               if (~(var6 & 262144) != -1) {
                  var5.field11631 = var2.method637(65535);
                  if (var5.field11631 == 65535) {
                     var5.field11631 = var5.field11618.field4503;
                  }
               }

               if (~(8 & var6) != -1) {
                  var5.field5811 = var2.method640((byte)51);
                  var5.field5817 = 100;
               }

               if (~(512 & var6) != -1) {
                  int var26 = var2.method688(-19476);
                  int[] var27 = new int[var26];
                  int[] var28 = new int[var26];
                  int var29 = 0;
                  if (!var1 && ~var29 <= ~var26) {
                     var5.method3065((byte)126, var28, var27);
                  } else {
                     while(true) {
                        int var30 = var2.method697(2);
                        if ((49152 & var30) == 49152) {
                           int var31 = var2.method651(-1);
                           var27[var29] = class91.method932(var30 << 16, var31);
                           if (var1) {
                              var27[var29] = var30;
                           }
                        } else {
                           var27[var29] = var30;
                        }

                        var28[var29] = var2.method651(-1);
                        ++var29;
                        if (~var29 <= ~var26) {
                           var5.method3065((byte)126, var28, var27);
                           break;
                        }
                     }
                  }
               }

               if ((var6 & 131072) != 0) {
                  int var32 = var2.method697(2);
                  int var33 = var2.method690(-31106);
                  if (~var32 == -65536) {
                     var32 = -1;
                  }

                  int var34 = var2.method665(false);
                  int var35 = var34 & 7;
                  int var36 = 15 & var34 >> 3;
                  if (var36 == 15) {
                     var36 = -1;
                  }

                  var5.method3070(var35, (byte)40, 2, false, var36, var33, var32);
               }

               if ((var6 & 32) != 0) {
                  int var37 = var2.method688(-19476);
                  if (~var37 < -1) {
                     int var38 = 0;
                     if (var1 || var38 < var37) {
                        do {
                           int var39;
                           int var40;
                           int var41;
                           int var42;
                           label315: {
                              var39 = -1;
                              var40 = -1;
                              var41 = var2.method682(-101);
                              var42 = -1;
                              if (var41 == 32767) {
                                 var41 = var2.method682(-70);
                                 var40 = var2.method682(-50);
                                 var39 = var2.method682(-126);
                                 var42 = var2.method682(-73);
                                 if (!var1) {
                                    break label315;
                                 }
                              }

                              if (var41 != 32766) {
                                 var40 = var2.method682(-54);
                                 if (var1) {
                                    var41 = -1;
                                 }
                              } else {
                                 var41 = -1;
                              }
                           }

                           int var43 = var2.method682(-78);
                           int var44 = var2.method665(false);
                           var5.method3066(false, var43, var42, var40, class51.field770, var44, var41, var39);
                           ++var38;
                        } while(var38 < var37);
                     }
                  }
               }

               if ((32768 & var6) != 0) {
                  int var45 = var2.method697(2);
                  var5.field5774 = var2.method665(false);
                  var5.field5806 = var2.method647((byte)119);
                  var5.field5822 = ~(32768 & var45) != -1;
                  var5.field5802 = var45 & 32767;
                  var5.field5830 = class51.field770 + var5.field5802 - -var5.field5774;
               }

               if ((var6 & 1024) != 0) {
                  int var46 = var5.field11618.field4556.length;
                  int var47 = 0;
                  if (var5.field11618.field4566 != null) {
                     var47 = var5.field11618.field4566.length;
                  }

                  int var48 = 0;
                  if (var5.field11618.field4533 != null) {
                     var48 = var5.field11618.field4533.length;
                  }

                  int var49 = var2.method647((byte)114);
                  if ((var49 & 1) == 1) {
                     var5.field11622 = null;
                  } else {
                     int[] var50 = null;
                     if (~(2 & var49) == -3) {
                        var50 = new int[var46];
                        int var51 = 0;
                        if (var1 || var51 < var46) {
                           do {
                              var50[var51] = var2.method651(-1);
                              ++var51;
                           } while(var51 < var46);
                        }
                     }

                     short[] var52 = null;
                     if (~(4 & var49) == -5) {
                        var52 = new short[var47];
                        int var53 = 0;
                        if (var1 || ~var47 < ~var53) {
                           do {
                              var52[var53] = (short)var2.method685(-2);
                              ++var53;
                           } while(~var47 < ~var53);
                        }
                     }

                     short[] var54 = null;
                     if (~(8 & var49) == -9) {
                        var54 = new short[var48];
                        int var55 = 0;
                        if (var1 || ~var48 < ~var55) {
                           do {
                              var54[var55] = (short)var2.method685(-2);
                              ++var55;
                           } while(~var48 < ~var55);
                        }
                     }

                     long var56 = (long)var4 | (long)(var5.field11609++) << 32;
                     var5.field11622 = new class559(var56, var50, var52, var54);
                     if (var1) {
                        var5.field11622 = null;
                     }
                  }
               }

               if ((65536 & var6) != 0) {
                  int var58 = var5.field11618.field4571.length;
                  int var59 = 0;
                  if (var5.field11618.field4566 != null) {
                     var59 = var5.field11618.field4566.length;
                  }

                  if (var5.field11618.field4533 != null) {
                     var59 = var5.field11618.field4533.length;
                  }

                  byte var60 = 0;
                  int var61 = var2.method693((byte)114);
                  if ((var61 & 1) != 1) {
                     int[] var62 = null;
                     if (~(var61 & 2) == -3) {
                        var62 = new int[var58];
                        int var63 = 0;
                        if (var1) {
                           var62[var63] = var2.method697(2);
                           ++var63;
                        }

                        while(~var58 < ~var63) {
                           var62[var63] = var2.method697(2);
                           ++var63;
                        }
                     }

                     short[] var64 = null;
                     if (~(var61 & 4) == -5) {
                        var64 = new short[var59];
                        int var65 = 0;
                        if (var1 || var65 < var59) {
                           do {
                              var64[var65] = (short)var2.method651(-1);
                              ++var65;
                           } while(var65 < var59);
                        }
                     }

                     short[] var66 = null;
                     if ((8 & var61) == 8) {
                        var66 = new short[var60];
                        int var67 = 0;
                        if (var1 || ~var67 > ~var60) {
                           do {
                              var66[var67] = (short)var2.method637(65535);
                              ++var67;
                           } while(~var67 > ~var60);
                        }
                     }

                     long var68 = (long)(var5.field11625++) << 32 | (long)var4;
                     new class559(var68, var62, var64, var66);
                  }
               }

               if ((var6 & 256) != 0) {
                  var5.field5849 = var2.method659(128);
                  var5.field5848 = var2.method673((byte)-108);
                  var5.field5832 = var2.method673((byte)-108);
                  var5.field5840 = var2.method673((byte)-108);
                  var5.field5837 = var2.method685(-2) + class51.field770;
                  var5.field5836 = var2.method651(-1) + class51.field770;
                  var5.field5850 = var2.method647((byte)115);
                  var5.field5840 += var5.field5865[0];
                  var5.field5856 = 0;
                  var5.field5860 = 1;
                  var5.field5832 += var5.field5861[0];
                  var5.field5848 += var5.field5865[0];
                  var5.field5849 += var5.field5861[0];
               }

               if ((524288 & var6) != 0) {
                  var5.field11611 = var2.method640((byte)51);
                  if (!"".equals(var5.field11611)) {
                     if (var5.field11611.equals(var5.field11618.field4542)) {
                        var5.field11611 = var5.field11618.field4542;
                        ++var3;
                     } else {
                        ++var3;
                     }
                  } else {
                     var5.field11611 = var5.field11618.field4542;
                     ++var3;
                  }
               } else {
                  ++var3;
               }
            } while(var3 < class190.field2788);

         }
      } catch (RuntimeException var71) {
         throw class612.method4503(var71, field4773[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "d",
      descriptor = "(Z)V"
   )
   public static void method2580(boolean arg0) {
      try {
         field4769 = null;
         if (arg0) {
            field4769 = null;
         }

         field4764 = null;
         field4771 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4773[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(ILjava/lang/String;Laea;I)Lbfa;"
   )
   public static final class631 method2581(int arg0, String arg1, class678 arg2, int arg3) {
      try {
         ++field4770;
         long var4 = OpenGL.glCreateShaderObjectARB(arg0);
         OpenGL.glShaderSourceARB(var4, arg1);
         OpenGL.glCompileShaderARB(var4);
         if (arg3 != -4176) {
            field4771 = null;
         }

         OpenGL.glGetObjectParameterivARB(var4, 35713, class288.field4300, 0);
         if (class288.field4300[0] == 0) {
            if (class288.field4300[0] == 0) {
               System.out.println(field4773[5]);
            }

            OpenGL.glGetObjectParameterivARB(var4, 35716, class288.field4300, 1);
            if (class288.field4300[1] > 1) {
               byte[] var6 = new byte[class288.field4300[1]];
               OpenGL.glGetInfoLogARB(var4, class288.field4300[1], class288.field4300, 0, var6, 0);
               System.out.println(new String(var6));
            }

            if (class288.field4300[0] == 0) {
               OpenGL.glDeleteObjectARB(var4);
               return null;
            }
         }

         return new class631(arg2, var4, arg0);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field4773[3] + arg0 + ',' + (arg1 != null ? field4773[4] : field4773[2]) + ',' + (arg2 != null ? field4773[4] : field4773[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(FB)V"
   )
   public final void method115(float arg0, byte arg1) {
      try {
         ++field4766;
         super.field10818 = arg0;
         if (arg1 < 39) {
            method2579(false);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4773[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class319(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(B[S)[S"
   )
   public static final short[] method2582(byte arg0, short[] arg1) {
      try {
         ++field4765;
         if (arg1 == null) {
            return null;
         } else {
            short[] var2 = new short[arg1.length];
            if (arg0 > -6) {
               return null;
            } else {
               class474.method3637(arg1, 0, var2, 0, arg1.length);
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4773[6] + arg0 + ',' + (arg1 != null ? field4773[4] : field4773[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method120(int arg0, int arg1, int arg2, int arg3) {
      try {
         super.field10822 = arg1;
         ++field4767;
         super.field10820 = arg2;
         super.field10819 = arg0;
         int var5 = -73 / ((17 - arg3) / 49);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4773[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2583(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2584(char[] arg0) {
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
            var10005 = 63;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

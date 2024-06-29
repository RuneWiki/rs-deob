import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public abstract class class200 {
   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2507 = new String[]{method1546(method1545("\u0013y\u0017\u0016")), method1546(method1545("\u0006\"UT\u0011")), method1546(method1545("\u0012|U;D")), method1546(method1545("\u0012|U=D")), method1546(method1545("\u0012|U9D")), method1546(method1545("\u0012|U<D")), method1546(method1545("\u0012|U3D")), method1546(method1545("\u0012|U?D")), method1546(method1545("\u0012|U0D"))};
   @OriginalMember(
      owner = "client!op",
      name = "g",
      descriptor = "I"
   )
   public static int field2499;
   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "I"
   )
   public static int field2500;
   @OriginalMember(
      owner = "client!op",
      name = "e",
      descriptor = "I"
   )
   public static int field2501;
   @OriginalMember(
      owner = "client!op",
      name = "c",
      descriptor = "I"
   )
   public static int field2502;
   @OriginalMember(
      owner = "client!op",
      name = "f",
      descriptor = "I"
   )
   public static int field2503;
   @OriginalMember(
      owner = "client!op",
      name = "d",
      descriptor = "I"
   )
   public static int field2504;
   @OriginalMember(
      owner = "client!op",
      name = "h",
      descriptor = "I"
   )
   public static int field2505;
   @OriginalMember(
      owner = "client!op",
      name = "b",
      descriptor = "I"
   )
   public static int field2506;

   @OriginalMember(
      owner = "client!op",
      name = "b",
      descriptor = "(B)V",
      line = 12
   )
   public static final void method1536(byte arg0) {
      try {
         if (arg0 >= -89) {
            method1538(-87, (String)null);
         }

         ++field2504;
         int var1 = 0;
         if (class261.field3566 != null) {
            var1 = class261.field3566.field9449.method3598(84);
         }

         if (var1 != 2) {
            if (~var1 != -2) {
               class207.field2647 = class88.field1075;
               class787.field11447 = 0;
               class411.field6305 = class332.field4758;
               class562.field8401 = 0;
            } else {
               int var2 = ~class88.field1075 >= -1025 ? class88.field1075 : 1024;
               int var3 = class332.field4758 > 768 ? 768 : class332.field4758;
               class207.field2647 = var2;
               class562.field8401 = (-var2 + class88.field1075) / 2;
               class787.field11447 = 0;
               class411.field6305 = var3;
            }
         } else {
            int var4 = class88.field1075 <= 800 ? class88.field1075 : 800;
            class562.field8401 = (-var4 + class88.field1075) / 2;
            int var5 = ~class332.field4758 >= -601 ? class332.field4758 : 600;
            class207.field2647 = var4;
            class411.field6305 = var5;
            class787.field11447 = 0;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2507[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(II)[B",
      line = 60
   )
   public static final byte[] method1537(int arg0, int arg1) {
      int var2 = client.field4530;

      try {
         int var3 = -73 / ((arg0 - -39) / 54);
         ++field2499;
         class788 var4 = (class788)class587.field8689.method5607((byte)100, (long)arg1);
         if (var4 == null) {
            byte[] var5 = new byte[512];
            Random var6 = new Random((long)arg1);
            int var7 = 0;
            if (var2 != 0) {
               var5[var7] = (byte)var7;
               ++var7;
            }

            while(true) {
               while(var7 < 255) {
                  var5[var7] = (byte)var7;
                  ++var7;
               }

               int var8 = 0;
               if (var2 == 0) {
                  if (var2 != 0 || ~var8 > -256) {
                     do {
                        int var9 = -var8 + 255;
                        int var10 = class413.method3157(var6, var9, (byte)54);
                        byte var11 = var5[var10];
                        var5[var10] = var5[var9];
                        var5[var9] = var5[-var8 + 511] = var11;
                        ++var8;
                     } while(~var8 > -256);
                  }

                  var4 = new class788(var5);
                  class587.field8689.method5610(0, (long)arg1, var4);
                  break;
               }

               ++var7;
            }
         }

         return var4.field11463;
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field2507[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(ILjava/lang/String;)I",
      line = 110
   )
   public static final int method1538(int arg0, String arg1) {
      int var2 = client.field4530;

      try {
         ++field2506;
         int var3 = arg1.length();
         int var4 = 0;
         int var5 = arg0;
         if (var2 != 0) {
            var4 = (var4 << 5) + -var4 + arg1.charAt(arg0);
            var5 = arg0 + 1;
         }

         while(true) {
            while(~var3 < ~var5) {
               var4 = (var4 << 5) + -var4 + arg1.charAt(var5);
               ++var5;
            }

            if (var2 == 0) {
               return var4;
            }

            var4 = var4;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2507[5] + arg0 + ',' + (arg1 != null ? field2507[1] : field2507[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(I)V",
      line = 129
   )
   public static final void method1539(int arg0) {
      int var1 = client.field4530;

      try {
         ++field2502;
         if (class628.field9131 == null) {
            class628.field9131 = new int[65536];
            if (var1 == 0) {
               double var2 = 0.7D + -0.015D + 0.03D * Math.random();
               int var4 = 0;
               if (var1 == 0 && ~var4 <= -65537) {
                  if (arg0 != 6) {
                     field2500 = -66;
                     return;
                  }

                  return;
               }

               do {
                  double var5 = (double)(var4 >> 10 & 63) / 64.0D + 0.0078125D;
                  double var7 = (double)(7 & var4 >> 7) / 8.0D + 0.0625D;
                  double var9 = (double)(var4 & 127) / 128.0D;
                  double var11 = var9;
                  double var13 = var9;
                  double var15 = var9;
                  if (var7 != 0.0D) {
                     double var17;
                     if (var9 < 0.5D) {
                        var17 = (var7 + 1.0D) * var9;
                        if (var1 != 0) {
                           var17 = var7 + var9 + -(var7 * var9);
                        }
                     } else {
                        var17 = var7 + var9 + -(var7 * var9);
                     }

                     double var19 = var9 * 2.0D - var17;
                     double var21 = var5 + 0.3333333333333333D;
                     if (var21 > 1.0D) {
                        --var21;
                     }

                     double var25 = var5 - 0.3333333333333333D;
                     if (var25 < 0.0D) {
                        ++var25;
                     }

                     if (!(var21 * 6.0D < 1.0D)) {
                        label118: {
                           if (!(var21 * 2.0D < 1.0D)) {
                              if (!(var21 * 3.0D < 2.0D)) {
                                 var11 = var19;
                                 if (var1 == 0) {
                                    break label118;
                                 }
                              }

                              var11 = (-var19 + var17) * (-var21 + 0.6666666666666666D) * 6.0D + var19;
                              if (var1 == 0) {
                                 break label118;
                              }
                           }

                           var11 = var17;
                           if (var1 != 0) {
                              var11 = (var17 - var19) * 6.0D * var21 + var19;
                           }
                        }
                     } else {
                        var11 = (var17 - var19) * 6.0D * var21 + var19;
                     }

                     if (!(var5 * 6.0D < 1.0D)) {
                        label109: {
                           if (!(var5 * 2.0D < 1.0D)) {
                              if (!(var5 * 3.0D < 2.0D)) {
                                 var13 = var19;
                                 if (var1 == 0) {
                                    break label109;
                                 }
                              }

                              var13 = (-var19 + var17) * (-var5 + 0.6666666666666666D) * 6.0D + var19;
                              if (var1 == 0) {
                                 break label109;
                              }
                           }

                           var13 = var17;
                           if (var1 != 0) {
                              var13 = (var17 - var19) * 6.0D * var5 + var19;
                           }
                        }
                     } else {
                        var13 = (var17 - var19) * 6.0D * var5 + var19;
                     }

                     if (!(var25 * 6.0D < 1.0D)) {
                        label135: {
                           if (var25 * 2.0D < 1.0D) {
                              var15 = var17;
                              if (var1 == 0) {
                                 break label135;
                              }
                           }

                           if (!(var25 * 3.0D < 2.0D)) {
                              var15 = var19;
                              if (var1 == 0) {
                                 break label135;
                              }
                           }

                           var15 = (var17 - var19) * (-var25 + 0.6666666666666666D) * 6.0D + var19;
                           if (var1 != 0) {
                              var15 = (var17 - var19) * 6.0D * var25 + var19;
                           }
                        }
                     } else {
                        var15 = (var17 - var19) * 6.0D * var25 + var19;
                     }
                  }

                  double var27 = Math.pow(var11, var2);
                  double var29 = Math.pow(var13, var2);
                  double var31 = Math.pow(var15, var2);
                  int var33 = (int)(var27 * 256.0D);
                  int var34 = (int)(var29 * 256.0D);
                  int var35 = (int)(var31 * 256.0D);
                  int var36 = (var33 << 16) - (-(var34 << 8) + -var35);
                  class628.field9131[var4] = var36;
                  ++var4;
               } while(~var4 > -65537);

               if (arg0 != 6) {
                  field2500 = -66;
                  return;
               }

               return;
            }
         }

      } catch (RuntimeException var38) {
         throw class670.method4877(var38, field2507[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(ILha;IIIIII)V",
      line = 242
   )
   public static final void method1540(int arg0, class66 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field2505;
         arg1.method609(1, arg4, arg6, arg2, arg3, arg7);
         arg1.method609(~arg5, 16, arg6 + 1, arg2 - 2, arg3 + 1, arg0);
         arg1.method637(arg6 + 1, arg2 + arg5, arg0, arg3 - -18, 1, arg4 + -19);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field2507[6] + arg0 + ',' + (arg1 != null ? field2507[1] : field2507[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(IILeaa;)Ldj;",
      line = 252
   )
   public static final class360 method1541(int arg0, int arg1, class526 arg2) {
      try {
         ++field2501;
         byte[] var3 = arg2.method3888((byte)40, arg1);
         int var4 = 63 / ((arg0 - -63) / 49);
         return var3 == null ? null : new class360(var3);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2507[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2507[1] : field2507[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "c",
      descriptor = "(I)V",
      line = 271
   )
   public static final void method1543(int arg0) {
      try {
         ++field2503;
         if (class578.field8576 != 0) {
            try {
               if (~(++class489.field7223) < -2001) {
                  if (class429.field6546 != null) {
                     class429.field6546.method812(2035738378);
                     class429.field6546 = null;
                  }

                  if (~class330.field4725 <= -3) {
                     class578.field8576 = 0;
                     class236.field2995 = -5;
                     return;
                  }

                  class330.field4710.method5034(arg0 ^ -3452);
                  ++class330.field4725;
                  class489.field7223 = 0;
                  class578.field8576 = 1;
               }

               if (~class578.field8576 == -2) {
                  class189.field2352 = class330.field4710.method5036(class755.field11144, arg0 + 448);
                  class578.field8576 = 2;
               }

               if (~class578.field8576 == -3) {
                  if (class189.field2352.field159 == 2) {
                     throw new IOException();
                  }

                  if (~class189.field2352.field159 != -2) {
                     return;
                  }

                  class429.field6546 = class25.method163((Socket)class189.field2352.field160, (byte)-98, 15000);
                  class189.field2352 = null;
                  class694.method5045((byte)124);
                  class578.field8576 = 4;
               }

               if (~class578.field8576 == arg0) {
                  if (class429.field6546.method807(1, true)) {
                     class429.field6546.method809(class401.field6163.field1552, (byte)-123, 0, 1);
                     int var1 = class401.field6163.field1552[0] & 255;
                     class578.field8576 = 0;
                     class236.field2995 = var1;
                     class429.field6546.method812(2035738378);
                     class429.field6546 = null;
                  }
               }
            } catch (IOException var3) {
               if (class429.field6546 != null) {
                  class429.field6546.method812(2035738378);
                  class429.field6546 = null;
               }

               if (~class330.field4725 <= -3) {
                  class578.field8576 = 0;
                  class236.field2995 = -4;
               } else {
                  class330.field4710.method5034(3455);
                  class489.field7223 = 0;
                  class578.field8576 = 1;
                  ++class330.field4725;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2507[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method1534(boolean arg0);

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(IB)Z"
   )
   public abstract boolean method1535(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(B)Lrja;"
   )
   public abstract class114 method1542(byte arg0);

   @OriginalMember(
      owner = "client!op",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method1544(int arg0);

   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1545(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1546(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

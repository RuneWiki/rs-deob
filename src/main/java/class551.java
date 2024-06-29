import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class551 implements class505 {
   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "Lq;"
   )
   public class450 field8160;
   @OriginalMember(
      owner = "client!hr",
      name = "l",
      descriptor = "Leaa;"
   )
   private class526 field8155;
   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8162 = new String[]{method4081(method4080("N\u001d%b*H\u0006\u007f`k")), method4081(method4080("]A%p>")), method4081(method4080("H\u001ag2")), method4081(method4080("N\u001d%\u001bk")), method4081(method4080("N\u001d%\u0018k")), method4081(method4080("N\u001d%\u0017k")), method4081(method4080("N\u001d%\u0016k")), method4081(method4080("N\u001d%\u001ak")), method4081(method4080("M\u0003")), method4081(method4080("N\u001d%\u0019k")), method4081(method4080("N\u001d%\u001fk"))};
   @OriginalMember(
      owner = "client!hr",
      name = "c",
      descriptor = "J"
   )
   public static long field8150 = -1L;
   @OriginalMember(
      owner = "client!hr",
      name = "i",
      descriptor = "I"
   )
   public static int field8147 = 0;
   @OriginalMember(
      owner = "client!hr",
      name = "g",
      descriptor = "I"
   )
   public static int field8149;
   @OriginalMember(
      owner = "client!hr",
      name = "k",
      descriptor = "I"
   )
   public static int field8152;
   @OriginalMember(
      owner = "client!hr",
      name = "d",
      descriptor = "I"
   )
   public static int field8153;
   @OriginalMember(
      owner = "client!hr",
      name = "f",
      descriptor = "I"
   )
   public static int field8154;
   @OriginalMember(
      owner = "client!hr",
      name = "j",
      descriptor = "I"
   )
   public static int field8156;
   @OriginalMember(
      owner = "client!hr",
      name = "m",
      descriptor = "I"
   )
   public static int field8157;
   @OriginalMember(
      owner = "client!hr",
      name = "n",
      descriptor = "I"
   )
   public static int field8158;
   @OriginalMember(
      owner = "client!hr",
      name = "e",
      descriptor = "I"
   )
   public static int field8159;
   @OriginalMember(
      owner = "client!hr",
      name = "h",
      descriptor = "Lat;"
   )
   public class396 field8151;
   @OriginalMember(
      owner = "client!hr",
      name = "o",
      descriptor = "Leaa;"
   )
   public static class526 field8148;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!hr",
      name = "b",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field8161;

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method165(int arg0) {
      try {
         ++field8149;
         this.field8151 = class256.method1940(this.field8160.field6835, this.field8155, arg0 ^ 25661);
         if (arg0 != 25668) {
            this.method90(true, -7);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8162[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4075(byte arg0) {
      try {
         if (arg0 >= -80) {
            field8158 = 36;
         }

         field8148 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8162[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(ZI)V"
   )
   public void method90(boolean arg0, int arg1) {
      try {
         ++field8153;
         int var3 = -60 / ((arg1 - -91) / 35);
         if (arg0) {
            int var4 = this.field8160.field6837.method4343(57, class189.field2365, this.field8151.method1971()) - -this.field8160.field6842;
            int var5 = this.field8160.field6833.method2922(class663.field9630, 120, this.field8151.method1975()) + this.field8160.field6834;
            this.field8151.method3035(var4, var5);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8162[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method168(boolean arg0) {
      try {
         ++field8154;
         if (arg0) {
            field8158 = -20;
         }

         return this.field8155.method3884((byte)-99, this.field8160.field6835);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8162[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(ILha;BIIIIII)V"
   )
   public static final void method4076(int arg0, class66 arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var9 = client.field4530;

      try {
         ++field8159;
         if (arg2 != -32) {
            field8150 = -100L;
         }

         class86 var10 = (class86)class29.method203(arg6, arg8, arg4);
         if (var10 != null) {
            label184: {
               class557 var11 = class151.field1896.method5072(30, var10.method350(25061));
               int var12 = 3 & var10.method358(31);
               int var13 = var10.method355(-29081);
               if (var11.field8340 != -1) {
                  class466.method3479(arg5, var12, arg1, arg3, 25221, var11);
                  if (var9 == 0) {
                     break label184;
                  }
               }

               int var14 = arg7;
               if (var11.field8317 > 0) {
                  var14 = arg0;
               }

               if (var13 == 0 || ~var13 == -3) {
                  label183: {
                     if (var12 == 0) {
                        arg1.method655(var14, 4, -115, arg3, arg5);
                        if (var9 == 0) {
                           break label183;
                        }
                     }

                     if (~var12 == -2) {
                        arg1.method626(arg2 ^ -66, arg5, var14, 4, arg3);
                        if (var9 == 0) {
                           break label183;
                        }
                     }

                     if (~var12 != -3) {
                        if (var12 != 3) {
                           break label183;
                        }

                        arg1.method626(79, arg5, var14, 4, arg3 + 3);
                        if (var9 == 0) {
                           break label183;
                        }
                     }

                     arg1.method655(var14, 4, -94, arg3, arg5 + 3);
                  }
               }

               if (var13 == 3) {
                  label176: {
                     if (var12 == 0) {
                        arg1.method609(1, 1, arg5, 1, arg3, var14);
                        if (var9 == 0) {
                           break label176;
                        }
                     }

                     if (~var12 == -2) {
                        arg1.method609(1, 1, arg5 + 3, 1, arg3, var14);
                        if (var9 == 0) {
                           break label176;
                        }
                     }

                     if (var12 == 2) {
                        arg1.method609(1, 1, arg5 + 3, 1, arg3 - -3, var14);
                        if (var9 == 0) {
                           break label176;
                        }
                     }

                     if (~var12 == -4) {
                        arg1.method609(1, 1, arg5, 1, arg3 + 3, var14);
                     }
                  }
               }

               if (~var13 == -3) {
                  label174: {
                     if (var12 == 0) {
                        arg1.method626(arg2 ^ -110, arg5, var14, 4, arg3);
                        if (var9 == 0) {
                           break label174;
                        }
                     }

                     if (var12 == 1) {
                        arg1.method655(var14, 4, -74, arg3, arg5 - -3);
                        if (var9 == 0) {
                           break label174;
                        }
                     }

                     if (~var12 == -3) {
                        arg1.method626(91, arg5, var14, 4, arg3 + 3);
                        if (var9 == 0) {
                           break label174;
                        }
                     }

                     if (~var12 == -4) {
                        arg1.method655(var14, 4, arg2 + -94, arg3, arg5);
                     }
                  }
               }
            }
         }

         class86 var15 = (class86)class660.method4742(arg6, arg8, arg4, field8161 != null ? field8161 : (field8161 = method4079(field8162[8])));
         if (var15 != null) {
            label114: {
               class557 var16 = class151.field1896.method5072(30, var15.method350(25061));
               int var17 = 3 & var15.method358(arg2 + 122);
               int var18 = var15.method355(-29081);
               if (var16.field8340 != -1) {
                  class466.method3479(arg5, var17, arg1, arg3, 25221, var16);
                  if (var9 == 0) {
                     break label114;
                  }
               }

               if (~var18 == -10) {
                  label175: {
                     int var19 = -1118482;
                     if (~var16.field8317 < -1) {
                        var19 = -1179648;
                     }

                     if (~var17 != -1 && ~var17 != -3) {
                        arg1.method575(arg3, 1, arg3 - -3, var19, arg5, arg5 + 3);
                        if (var9 == 0) {
                           break label175;
                        }
                     }

                     arg1.method575(arg3 + 3, 1, arg3, var19, arg5, arg5 + 3);
                  }
               }
            }
         }

         class86 var20 = (class86)class97.method856(arg6, arg8, arg4);
         if (var20 != null) {
            class557 var21 = class151.field1896.method5072(arg2 + 62, var20.method350(arg2 + 25093));
            int var22 = var20.method358(-119) & 3;
            if (var21.field8340 != -1) {
               class466.method3479(arg5, var22, arg1, arg3, 25221, var21);
               return;
            }
         }

      } catch (RuntimeException var24) {
         throw class670.method4877(var24, field8162[7] + arg0 + ',' + (arg1 != null ? field8162[1] : field8162[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(Lhv;Z)V"
   )
   public static final void method4077(class544 arg0, boolean arg1) {
      try {
         if (!arg1) {
            field8150 = -51L;
         }

         if (~arg0.field7920 == -6 && arg0.field7969 != -1) {
            class653.method4705(class786.field11439, arg0, (byte)71);
         }

         ++field8152;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8162[6] + (arg0 != null ? field8162[1] : field8162[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(ILjava/lang/String;Lpg;Lda;IILhv;Laa;IIII)V"
   )
   public static final void method4078(int arg0, String arg1, class763 arg2, class67 arg3, int arg4, int arg5, class544 arg6, class512 arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         int var12;
         label67: {
            ++field8156;
            if (class675.field10142 != 4) {
               var12 = 16383 & (int)class56.field706 + class241.field3071;
               if (client.field4530 == 0) {
                  break label67;
               }
            }

            var12 = (int)class56.field706 & 16383;
         }

         int var13 = 10 + Math.max(arg6.field7986 / 2, arg6.field7954 / 2);
         int var14 = arg5 * arg5 + arg8 * arg8;
         if (arg0 != -2) {
            method4076(-44, (class66)null, (byte)-95, 92, -26, -11, 123, -3, -31);
         }

         if (var13 * var13 >= var14) {
            int var15 = class689.field10389[var12];
            int var16 = class689.field10391[var12];
            if (class675.field10142 != 4) {
               var15 = var15 * 256 / (class606.field8898 + 256);
               var16 = var16 * 256 / (class606.field8898 + 256);
            }

            int var17 = arg5 * var15 - -(arg8 * var16) >> 14;
            int var18 = arg5 * var16 + -(arg8 * var15) >> 14;
            int var19 = arg2.method5524((class396[])null, arg1, (byte)-71, 100);
            int var20 = arg2.method5529(arg1, (class396[])null, (byte)76, 100, 0);
            int var21 = var17 - var19 / 2;
            if (var21 >= -arg6.field7986 && arg6.field7986 >= var21 && -arg6.field7954 <= var18 && ~var18 >= ~arg6.field7954) {
               arg3.method664(arg6.field7986 / 2 + (var21 - -arg4), 0, arg6.field7954 / 2 + -var18 + -arg9 + arg10 - var20, arg10, arg1, 1, 0, arg7, (class396[])null, arg4, arg11, -1, (int[])null, 50, var19, 0);
            }
         }
      } catch (RuntimeException var23) {
         throw class670.method4877(var23, field8162[9] + arg0 + ',' + (arg1 != null ? field8162[1] : field8162[2]) + ',' + (arg2 != null ? field8162[1] : field8162[2]) + ',' + (arg3 != null ? field8162[1] : field8162[2]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field8162[1] : field8162[2]) + ',' + (arg7 != null ? field8162[1] : field8162[2]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "<init>",
      descriptor = "(Leaa;Lq;)V"
   )
   public class551(class526 arg0, class450 arg1) {
      try {
         this.field8160 = arg1;
         this.field8155 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8162[0] + (arg0 != null ? field8162[1] : field8162[2]) + ',' + (arg1 != null ? field8162[1] : field8162[2]) + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4079(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4080(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4081(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class151 {
   @OriginalMember(
      owner = "client!kl",
      name = "e",
      descriptor = "Lsia;"
   )
   private class407 field1887 = new class407(64);
   @OriginalMember(
      owner = "client!kl",
      name = "b",
      descriptor = "Lww;"
   )
   private class339 field1883;
   @OriginalMember(
      owner = "client!kl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1889 = new String[]{method1217(method1216("e\u0018>r2")), method1217(method1216("e\u0018>u2")), method1217(method1216("`\u0001|Z")), method1217(method1216("uZ>\u0018g")), method1217(method1216("e\u0018>\ns`\u001dd\b2")), method1217(method1216("e\u0018>s2")), method1217(method1216("e\u0018>p2")), method1217(method1216("e\u0018>t2")), method1217(method1216("e\u0018>w2"))};
   @OriginalMember(
      owner = "client!kl",
      name = "g",
      descriptor = "Lsia;"
   )
   public static class407 field1879 = new class407(50);
   @OriginalMember(
      owner = "client!kl",
      name = "i",
      descriptor = "Ltia;"
   )
   public static class17 field1886 = new class17(1);
   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "Lse;"
   )
   public static class6 field1888 = new class6(24, 5);
   @OriginalMember(
      owner = "client!kl",
      name = "h",
      descriptor = "I"
   )
   public static int field1880;
   @OriginalMember(
      owner = "client!kl",
      name = "c",
      descriptor = "I"
   )
   public static int field1881;
   @OriginalMember(
      owner = "client!kl",
      name = "f",
      descriptor = "I"
   )
   public static int field1882;
   @OriginalMember(
      owner = "client!kl",
      name = "d",
      descriptor = "I"
   )
   public static int field1884;
   @OriginalMember(
      owner = "client!kl",
      name = "j",
      descriptor = "I"
   )
   public static int field1885;

   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "(IZ)Lov;"
   )
   public final class32 method1210(int arg0, boolean arg1) {
      try {
         ++field1881;
         class407 var3 = this.field1887;
         class32 var4;
         synchronized(this.field1887) {
            var4 = (class32)this.field1887.method3192((long)arg0, (byte)-118);
         }

         if (var4 != null) {
            return var4;
         } else {
            if (!arg1) {
               field1879 = null;
            }

            class339 var5 = this.field1883;
            byte[] var6;
            synchronized(this.field1883) {
               var6 = this.field1883.method2697(arg0, 11, false);
            }

            class32 var7 = new class32();
            if (var6 != null) {
               var7.method259(new class66(var6), true);
            }

            class407 var8 = this.field1887;
            synchronized(this.field1887) {
               this.field1887.method3190(var7, (long)arg0, 8);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field1889[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1211(boolean arg0) {
      try {
         class407 var2 = this.field1887;
         synchronized(this.field1887) {
            this.field1887.method3201((byte)107);
            if (!arg0) {
               this.method1214((byte)-6);
            }
         }

         ++field1880;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1889[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kl",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1212(byte arg0) {
      try {
         if (arg0 > -35) {
            method1212((byte)47);
         }

         field1886 = null;
         field1879 = null;
         field1888 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1889[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "(IIILha;IIIIILka;IILmn;I)Lka;"
   )
   public static final class232 method1213(int arg0, int arg1, int arg2, class479 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class232 arg9, int arg10, int arg11, class238 arg12, int arg13) {
      boolean var14 = client.field1481;

      try {
         ++field1885;
         if (arg9 == null) {
            return null;
         } else {
            int var15 = 2055;
            int var16 = 61 / ((arg0 - -28) / 47);
            if (arg12 != null) {
               int var17 = var15 | arg12.method1903(-1, false, arg8, 1024);
               var15 = var17 & -513;
            }

            long var18 = ((long)arg7 << 32) + ((long)arg10 << 48) + (long)((arg11 << 24) + (arg4 << 16) + arg2);
            class407 var20 = class137.field1737;
            class232 var21;
            synchronized(class137.field1737) {
               var21 = (class232)class137.field1737.method3192(var18, (byte)-110);
            }

            if (var21 == null || ~arg3.method495(var21.method1285(), var15) != -1) {
               if (var21 != null) {
                  var15 = arg3.method444(var15, var21.method1285());
               }

               byte var22;
               if (~arg2 != -2) {
                  if (~arg2 != -3) {
                     if (~arg2 == -4) {
                        var22 = 15;
                     } else if (~arg2 != -5) {
                        var22 = 21;
                     } else {
                        var22 = 18;
                     }
                  } else {
                     var22 = 12;
                  }
               } else {
                  var22 = 9;
               }

               byte var23;
               class167 var25;
               int var26;
               int[][] var27;
               int var29;
               label201: {
                  var23 = 3;
                  int[] var24 = new int[]{64, 96, 128};
                  var25 = new class167(var22 * var23 + 1, var22 * var23 * 2 + -var22, 0);
                  var26 = var25.method1443(0, 1, 0, 0);
                  var27 = new int[var23][var22];
                  int var28 = 0;
                  if (var14) {
                     var29 = var24[var28];
                  } else if (~var28 <= ~var23) {
                     var29 = 0;
                     if (!var14) {
                        break label201;
                     }
                  } else {
                     var29 = var24[var28];
                  }

                  while(true) {
                     int var30 = var24[var28];
                     int var31 = 0;
                     if (var14 || ~var31 > ~var22) {
                        do {
                           int var32 = (var31 << 14) / var22;
                           int var33 = class746.field10907[var32] * var29 >> 14;
                           int var34 = class746.field10897[var32] * var30 >> 14;
                           var27[var28][var31] = var25.method1443(0, 1, var34, var33);
                           ++var31;
                        } while(~var31 > ~var22);
                     }

                     ++var28;
                     if (~var28 <= ~var23) {
                        var29 = 0;
                        if (!var14) {
                           break;
                        }
                     } else {
                        var29 = var24[var28];
                     }
                  }
               }

               if (var14 || ~var23 < ~var29) {
                  do {
                     int var35 = (var29 * 256 + 128) / var23;
                     int var36 = -var35 + 256;
                     byte var37 = (byte)(arg4 * var36 + arg11 * var35 >> 8);
                     short var38 = (short)((32512 & (127 & arg7) * var36 + (arg10 & 127) * var35) + ((arg7 & 896) * var36 + (arg10 & 896) * var35 & 229376) + ((64512 & arg7) * var36 + (arg10 & 64512) * var35 & 16515072) >> 8);
                     int var39 = 0;
                     if (var14) {
                        if (var29 == 0) {
                           var25.method1452(var27[0][var39], (byte)-1, var26, (byte)1, var27[0][(var39 + 1) % var22], (short)-1, var38, var37, 20086);
                           if (var14) {
                              var25.method1452(var27[var29][(var39 - -1) % var22], (byte)-1, var27[var29 + -1][var39], (byte)1, var27[var29 + -1][(var39 + 1) % var22], (short)-1, var38, var37, 20086);
                              var25.method1452(var27[var29][var39], (byte)-1, var27[var29 - 1][var39], (byte)1, var27[var29][(var39 - -1) % var22], (short)-1, var38, var37, 20086);
                              ++var39;
                           } else {
                              ++var39;
                           }
                        } else {
                           var25.method1452(var27[var29][(var39 - -1) % var22], (byte)-1, var27[var29 + -1][var39], (byte)1, var27[var29 + -1][(var39 + 1) % var22], (short)-1, var38, var37, 20086);
                           var25.method1452(var27[var29][var39], (byte)-1, var27[var29 - 1][var39], (byte)1, var27[var29][(var39 - -1) % var22], (short)-1, var38, var37, 20086);
                           ++var39;
                        }
                     }

                     while(true) {
                        while(~var22 < ~var39) {
                           if (var29 == 0) {
                              var25.method1452(var27[0][var39], (byte)-1, var26, (byte)1, var27[0][(var39 + 1) % var22], (short)-1, var38, var37, 20086);
                              if (var14) {
                                 var25.method1452(var27[var29][(var39 - -1) % var22], (byte)-1, var27[var29 + -1][var39], (byte)1, var27[var29 + -1][(var39 + 1) % var22], (short)-1, var38, var37, 20086);
                                 var25.method1452(var27[var29][var39], (byte)-1, var27[var29 - 1][var39], (byte)1, var27[var29][(var39 - -1) % var22], (short)-1, var38, var37, 20086);
                                 ++var39;
                              } else {
                                 ++var39;
                              }
                           } else {
                              var25.method1452(var27[var29][(var39 - -1) % var22], (byte)-1, var27[var29 + -1][var39], (byte)1, var27[var29 + -1][(var39 + 1) % var22], (short)-1, var38, var37, 20086);
                              var25.method1452(var27[var29][var39], (byte)-1, var27[var29 - 1][var39], (byte)1, var27[var29][(var39 - -1) % var22], (short)-1, var38, var37, 20086);
                              ++var39;
                           }
                        }

                        if (!var14) {
                           ++var29;
                           break;
                        }

                        var25.method1452(var27[var29][var39], (byte)-1, var27[var29 - 1][var39], (byte)1, var27[var29][(var39 - -1) % var22], (short)-1, var38, var37, 20086);
                        ++var39;
                     }
                  } while(~var23 < ~var29);
               }

               var21 = arg3.method494(var25, var15, class633.field9328, 64, 768);
               class407 var40 = class137.field1737;
               synchronized(class137.field1737) {
                  class137.field1737.method3190(var21, var18, 8);
               }
            }

            int var41 = arg9.method1226();
            int var42 = arg9.method1295();
            int var43 = arg9.method1261();
            int var44 = arg9.method1250();
            class670 var45 = null;
            if (arg12 != null) {
               int var50 = arg12.field3026[arg8];
               var45 = class532.field7812.method2475((byte)-114, var50 >> 16);
               arg8 = var50 & 65535;
            }

            label107: {
               if (var45 == null) {
                  var21 = var21.method1256((byte)3, var15, true);
                  var21.method1262(var42 - var41 >> 1, 128, -var43 + var44 >> 1);
                  var21.method1279(var41 - -var42 >> 1, 0, var43 + var44 >> 1);
                  if (!var14) {
                     break label107;
                  }
               }

               var21 = var21.method1256((byte)3, var15, true);
               var21.method1262(-var41 + var42 >> 1, 128, -var43 + var44 >> 1);
               var21.method1279(var41 - -var42 >> 1, 0, var43 + var44 >> 1);
               var21.method1844(var45, arg8, 0);
            }

            if (arg5 != 0) {
               var21.method1224(arg5);
            }

            if (arg6 != 0) {
               var21.method1289(arg6);
            }

            if (arg13 != 0) {
               var21.method1279(0, arg13, 0);
            }

            return var21;
         }
      } catch (RuntimeException var49) {
         throw class93.method866(var49, field1889[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1889[3] : field1889[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field1889[3] : field1889[2]) + ',' + arg10 + ',' + arg11 + ',' + (arg12 != null ? field1889[3] : field1889[2]) + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1214(byte arg0) {
      try {
         ++field1884;
         class407 var2 = this.field1887;
         synchronized(this.field1887) {
            this.field1887.method3187(-23825);
            if (arg0 != 73) {
               field1886 = null;
            }

         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1889[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1215(int arg0, int arg1) {
      try {
         class407 var3 = this.field1887;
         synchronized(this.field1887) {
            this.field1887.method3197(5, arg0);
         }

         if (arg1 != 0) {
            this.method1210(-30, true);
         }

         ++field1882;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1889[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kl",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class151(class500 arg0, int arg1, class339 arg2) {
      try {
         this.field1883 = arg2;
         if (this.field1883 != null) {
            this.field1883.method2691(11, 123);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1889[4] + (arg0 != null ? field1889[3] : field1889[2]) + ',' + arg1 + ',' + (arg2 != null ? field1889[3] : field1889[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1216(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1217(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

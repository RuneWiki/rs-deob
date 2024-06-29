import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class181 extends class498 {
   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "I"
   )
   public int field2237;
   @OriginalMember(
      owner = "client!gw",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2245 = new String[]{method1393(method1392("x\bupl")), method1393(method1392("dQu\u00199")), method1393(method1392("x\bu\u000b-q\u0016/\tl")), method1393(method1392("q\n7[")), method1393(method1392("x\bu|l")), method1393(method1392("x\busl")), method1393(method1392("x\bu}l")), method1393(method1392("x\bu\u007fl")), method1393(method1392("x\bu~l")), method1393(method1392("x\buvl"))};
   @OriginalMember(
      owner = "client!gw",
      name = "G",
      descriptor = "Z"
   )
   public static boolean field2244 = false;
   @OriginalMember(
      owner = "client!gw",
      name = "D",
      descriptor = "Lbga;"
   )
   public static class378 field2241 = new class378(123, 7);
   @OriginalMember(
      owner = "client!gw",
      name = "H",
      descriptor = "I"
   )
   public static int field2235;
   @OriginalMember(
      owner = "client!gw",
      name = "E",
      descriptor = "I"
   )
   public static int field2236;
   @OriginalMember(
      owner = "client!gw",
      name = "B",
      descriptor = "I"
   )
   public static int field2238;
   @OriginalMember(
      owner = "client!gw",
      name = "I",
      descriptor = "I"
   )
   public static int field2239;
   @OriginalMember(
      owner = "client!gw",
      name = "A",
      descriptor = "I"
   )
   public static int field2242;
   @OriginalMember(
      owner = "client!gw",
      name = "C",
      descriptor = "I"
   )
   public static int field2243;
   @OriginalMember(
      owner = "client!gw",
      name = "F",
      descriptor = "Lbo;"
   )
   public static class763 field2240;

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(ZZZLpo;)V"
   )
   public static final void method1386(boolean param0, boolean param1, boolean param2, class588 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gw",
      name = "<init>",
      descriptor = "(Lsq;Ljh;IIIIIIIIIIIIII)V"
   )
   public class181(class190 arg0, class169 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);

      try {
         this.field2237 = arg15;
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field2245[2] + (arg0 != null ? field2245[1] : field2245[3]) + ',' + (arg1 != null ? field2245[1] : field2245[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ',' + arg15 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(ILjava/lang/String;BLjava/lang/String;)I"
   )
   public static final int method1387(int arg0, String arg1, byte arg2, String arg3) {
      boolean var4 = client.field4273;

      try {
         ++field2235;
         int var5 = arg3.length();
         int var6 = arg1.length();
         int var7 = 0;
         int var8 = 0;
         char var9 = 0;
         char var10 = 0;

         int var10000;
         label123:
         while(~var5 < ~(-var9 + var7) || var6 > -var10 + var8) {
            var10000 = var5;
            int var10001 = -var9 + var7;

            while(var10000 > var10001) {
               if (-var10 + var8 >= var6) {
                  return 1;
               }

               char var11;
               label113: {
                  if (~var9 == -1) {
                     var11 = arg3.charAt(var7++);
                     if (!var4) {
                        break label113;
                     }
                  }

                  var11 = var9;
                  boolean var12 = false;
               }

               char var13;
               label108: {
                  if (var10 == 0) {
                     var13 = arg1.charAt(var8++);
                     if (!var4) {
                        break label108;
                     }
                  }

                  var13 = var10;
                  boolean var14 = false;
               }

               var9 = class423.method3193(-16019, var11);
               var10 = class423.method3193(-16019, var13);
               char var15 = class544.method3932(arg0, var11, (byte)122);
               char var16 = class544.method3932(arg0, var13, (byte)122);
               if (var15 == var16) {
                  continue label123;
               }

               var10000 = Character.toUpperCase(var15);
               var10001 = Character.toUpperCase(var16);
               if (!var4) {
                  if (var10000 != var10001) {
                     char var17 = Character.toLowerCase(var15);
                     char var18 = Character.toLowerCase(var16);
                     if (var17 != var18) {
                        return class232.method1756(var17, arg0, (byte)-2) + -class232.method1756(var18, arg0, (byte)-2);
                     }
                  }
                  continue label123;
               }
            }

            return -1;
         }

         int var19 = Math.min(var5, var6);
         int var20 = 0;
         int var21;
         int var22;
         char var23;
         char var24;
         char var25;
         char var26;
         if (var4) {
            if (~arg0 != -3) {
               var21 = var20;
               var22 = var20;
               if (var4) {
                  var21 = var6 - 1 - var20;
                  var22 = -var20 + -1 + var5;
               }
            } else {
               var21 = var6 - 1 - var20;
               var22 = -var20 + -1 + var5;
            }

            var23 = arg3.charAt(var22);
            var24 = arg1.charAt(var21);
            if (~var23 != ~var24 && ~Character.toUpperCase(var23) != ~Character.toUpperCase(var24)) {
               var25 = Character.toLowerCase(var23);
               var26 = Character.toLowerCase(var24);
               if (var25 != var26) {
                  return class232.method1756(var25, arg0, (byte)-2) + -class232.method1756(var26, arg0, (byte)-2);
               }
            }

            ++var20;
         }

         while(true) {
            if (~var20 <= ~var19) {
               int var27 = var5 - var6;
               var10000 = var27;
               if (!var4) {
                  if (var27 != 0) {
                     return var27;
                  }

                  int var28 = 0;
                  char var30;
                  if (var4) {
                     char var29 = arg3.charAt(var28);
                     var30 = arg1.charAt(var28);
                     if (~var29 != ~var30) {
                        return class232.method1756(var29, arg0, (byte)-2) + -class232.method1756(var30, arg0, (byte)-2);
                     }

                     ++var28;
                  }

                  while(true) {
                     if (~var28 <= ~var19) {
                        var10000 = arg2;
                        if (!var4) {
                           if (arg2 != -128) {
                              method1390(-26, -79, -9, (class255)null, -77, 78);
                           }

                           return 0;
                        }
                     } else {
                        var10000 = arg3.charAt(var28);
                     }

                     int var33 = var10000;
                     var30 = arg1.charAt(var28);
                     if (~var33 != ~var30) {
                        return class232.method1756((char)var33, arg0, (byte)-2) + -class232.method1756(var30, arg0, (byte)-2);
                     }

                     ++var28;
                  }
               }
            } else {
               var10000 = ~arg0;
            }

            if (var10000 != -3) {
               var21 = var20;
               var22 = var20;
               if (var4) {
                  var21 = var6 - 1 - var20;
                  var22 = -var20 + -1 + var5;
               }
            } else {
               var21 = var6 - 1 - var20;
               var22 = -var20 + -1 + var5;
            }

            var23 = arg3.charAt(var22);
            var24 = arg1.charAt(var21);
            if (~var23 != ~var24 && ~Character.toUpperCase(var23) != ~Character.toUpperCase(var24)) {
               var25 = Character.toLowerCase(var23);
               var26 = Character.toLowerCase(var24);
               if (var25 != var26) {
                  return class232.method1756(var25, arg0, (byte)-2) + -class232.method1756(var26, arg0, (byte)-2);
               }
            }

            ++var20;
         }
      } catch (RuntimeException var32) {
         throw class534.method3846(var32, field2245[7] + arg0 + ',' + (arg1 != null ? field2245[1] : field2245[3]) + ',' + arg2 + ',' + (arg3 != null ? field2245[1] : field2245[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(BI)Ljava/lang/String;"
   )
   public static final String method1388(byte arg0, int arg1) {
      try {
         ++field2236;
         class149 var2 = (class149)class109.field1381.method1839(-23, (long)arg1);
         int var3 = -96 % ((3 - arg0) / 36);
         if (var2 != null) {
            class328 var4 = var2.field1949.method5393((byte)-112);
            if (var4 != null) {
               double var5 = var2.field1949.method5396(18915);
               if ((double)var4.method2614(-29405) <= var5 && (double)var4.method2612((byte)-128) >= var5) {
                  return var4.method2609(false);
               }
            }
         }

         return null;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2245[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method1389(int arg0) {
      try {
         field2240 = null;
         field2241 = null;
         if (arg0 > -16) {
            field2241 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2245[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(I)Lafa;"
   )
   public final class365 method19(int arg0) {
      try {
         int var2 = -16 / ((arg0 - 1) / 55);
         ++field2243;
         return class212.field2633;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2245[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(IIILbj;II)Ljava/awt/Frame;"
   )
   public static final Frame method1390(int arg0, int arg1, int arg2, class255 arg3, int arg4, int arg5) {
      boolean var6 = client.field4273;

      try {
         ++field2239;
         if (!arg3.method1955(11405)) {
            return null;
         } else {
            if (~arg5 == -1) {
               class290[] var7 = class627.method4559(2861, arg3);
               if (var7 == null) {
                  return null;
               }

               int var10000;
               label112: {
                  byte var8 = 0;
                  int var9 = 0;
                  if (var6) {
                     var10000 = ~var7[var9].field3833;
                  } else if (var9 >= var7.length) {
                     var10000 = var8;
                     if (!var6) {
                        break label112;
                     }
                  } else {
                     var10000 = ~var7[var9].field3833;
                  }

                  while(true) {
                     if (var10000 == ~arg1) {
                        if (~var7[var9].field3836 == ~arg2) {
                           if (arg0 != 0) {
                              if (~var7[var9].field3834 == ~arg0) {
                                 if (var8 != 0) {
                                    if (arg5 < var7[var9].field3835) {
                                       var8 = 1;
                                       arg5 = var7[var9].field3835;
                                       ++var9;
                                    } else {
                                       ++var9;
                                    }
                                 } else {
                                    var8 = 1;
                                    arg5 = var7[var9].field3835;
                                    ++var9;
                                 }
                              } else {
                                 ++var9;
                              }
                           } else if (var8 != 0) {
                              if (arg5 < var7[var9].field3835) {
                                 var8 = 1;
                                 arg5 = var7[var9].field3835;
                                 ++var9;
                              } else {
                                 ++var9;
                              }
                           } else {
                              var8 = 1;
                              arg5 = var7[var9].field3835;
                              ++var9;
                           }
                        } else {
                           ++var9;
                        }
                     } else {
                        ++var9;
                     }

                     if (var9 >= var7.length) {
                        var10000 = var8;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = ~var7[var9].field3833;
                     }
                  }
               }

               if (var10000 == 0) {
                  return null;
               }
            }

            class289 var10 = arg3.method1949(arg2, arg1, 94, arg5, arg0);
            if (arg4 != 10) {
               method1386(false, true, false, (class588)null);
               if (var6) {
                  class173.method1347(arg4 + -111, 10L);
               }
            }

            while(var10.field3826 == 0) {
               class173.method1347(arg4 + -111, 10L);
            }

            Frame var11 = (Frame)var10.field3830;
            if (var11 == null) {
               return null;
            } else if (~var10.field3826 == -3) {
               class187.method1422(-9, arg3, var11);
               return null;
            } else {
               return var11;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field2245[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2245[1] : field2245[3]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(Z)Ljava/lang/String;"
   )
   public static final String method1391(boolean arg0) {
      try {
         ++field2238;
         if (!class666.field9473 && class717.field10512 != null) {
            return arg0 ? null : class717.field10512.field3007;
         } else {
            return "";
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2245[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1392(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1393(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

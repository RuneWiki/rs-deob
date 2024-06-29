import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class558 {
   @OriginalMember(
      owner = "client!gi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8311 = new String[]{method4227(method4226("_1o/Q")), method4227(method4226("CvoB\u0004")), method4227(method4226("V--\u0000")), method4227(method4226("_1o.Q")), method4227(method4226("_1o-Q")), method4227(method4226("_1o)Q")), method4227(method4226("_1o(Q")), method4227(method4226("_1o*Q"))};
   @OriginalMember(
      owner = "client!gi",
      name = "c",
      descriptor = "I"
   )
   public static int field8307 = 0;
   @OriginalMember(
      owner = "client!gi",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field8310 = new int[1000];
   @OriginalMember(
      owner = "client!gi",
      name = "d",
      descriptor = "I"
   )
   public static int field8304;
   @OriginalMember(
      owner = "client!gi",
      name = "e",
      descriptor = "I"
   )
   public static int field8305;
   @OriginalMember(
      owner = "client!gi",
      name = "g",
      descriptor = "I"
   )
   public static int field8306;
   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "I"
   )
   public static int field8308;
   @OriginalMember(
      owner = "client!gi",
      name = "b",
      descriptor = "I"
   )
   public static int field8309;

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(ZI)V",
      line = 4
   )
   public static final void method4220(boolean arg0, int arg1) {
      try {
         ++field8306;
         if (arg1 != -1) {
            if (class14.field181[arg1]) {
               class70.field919.method5003(arg1, arg0);
               class296.field4672[arg1] = null;
               class505.field7743[arg1] = null;
               class14.field181[arg1] = false;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8311[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(BIIILuaa;)V",
      line = 22
   )
   public static final void method4221(byte arg0, int arg1, int arg2, int arg3, class119 arg4) {
      boolean var5 = client.field1786;

      try {
         ++field8309;
         class228 var6 = arg4.method1089(true);
         if (arg0 >= -35) {
            field8307 = 96;
         }

         class366 var7 = arg4.field1616;
         int var8 = arg4.field1668 - arg4.field1666.field10785 & 16383;
         if (arg3 == -1) {
            if (var8 == 0 && ~arg4.field1672 >= -26) {
               if (!arg4.field1656 || !var6.method1972(var7.method2995((byte)104), true)) {
                  var7.method2981(var6.method1971((byte)-60), 0);
                  arg4.field1656 = var7.method2991(108);
               }

            } else if (arg2 < 0 && var6.field3480 != -1) {
               var7.method2981(var6.field3480, 0);
               arg4.field1656 = false;
            } else if (arg2 > 0 && var6.field3487 != -1) {
               var7.method2981(var6.field3487, 0);
               arg4.field1656 = false;
            } else {
               if (!arg4.field1656 || !var6.method1972(var7.method2995((byte)104), true)) {
                  var7.method2981(var6.method1971((byte)-60), 0);
                  arg4.field1656 = arg4.field1616.method2991(126);
               }

            }
         } else if (arg4.field1649 == -1 || ~var8 > -10241 && var8 > 2048) {
            if (var8 == 0 && ~arg4.field1672 >= -26) {
               label395: {
                  if (arg3 == 2 && ~var6.field3515 != 0) {
                     var7.method2981(var6.field3515, 0);
                     if (!var5) {
                        break label395;
                     }
                  }

                  if (~arg3 != -1 || ~var6.field3505 == 0) {
                     var7.method2981(var6.field3458, 0);
                     if (!var5) {
                        break label395;
                     }
                  }

                  var7.method2981(var6.field3505, 0);
               }

               arg4.field1656 = false;
            } else {
               label396: {
                  if (arg3 != 2 || ~var6.field3515 == 0) {
                     if (~arg3 != -1 || var6.field3505 == -1) {
                        if (arg2 >= 0 || ~var6.field3482 == 0) {
                           if (arg2 > 0 && ~var6.field3492 != 0) {
                              var7.method2981(var6.field3492, 0);
                              if (!var5) {
                                 break label396;
                              }
                           }

                           var7.method2981(var6.field3458, 0);
                           if (!var5) {
                              break label396;
                           }
                        }

                        var7.method2981(var6.field3482, 0);
                        if (!var5) {
                           break label396;
                        }
                     }

                     if (~arg2 > -1 && ~var6.field3490 != 0) {
                        var7.method2981(var6.field3490, 0);
                        if (!var5) {
                           break label396;
                        }
                     }

                     if (arg2 <= 0 || var6.field3493 == -1) {
                        var7.method2981(var6.field3505, 0);
                        if (!var5) {
                           break label396;
                        }
                     }

                     var7.method2981(var6.field3493, 0);
                     if (!var5) {
                        break label396;
                     }
                  }

                  if (~arg2 <= -1 || ~var6.field3500 == 0) {
                     if (~arg2 >= -1 || ~var6.field3516 == 0) {
                        var7.method2981(var6.field3515, 0);
                        if (!var5) {
                           break label396;
                        }
                     }

                     var7.method2981(var6.field3516, 0);
                     if (!var5) {
                        break label396;
                     }
                  }

                  var7.method2981(var6.field3500, 0);
               }

               arg4.field1656 = false;
            }
         } else {
            label400: {
               int var9 = class419.field6491[arg1] + -arg4.field1666.field10785 & 16383;
               if (arg3 != 2 || var6.field3515 == -1) {
                  if (arg3 == 0 && ~var6.field3505 != 0) {
                     if (~var9 < -2049 && var9 <= 6144 && var6.field3460 != -1) {
                        var7.method2981(var6.field3460, 0);
                        if (!var5) {
                           break label400;
                        }
                     }

                     if (~var9 > -10241 || var9 >= 14336 || ~var6.field3478 == 0) {
                        if (var9 > 6144 && var9 < 10240 && ~var6.field3481 != 0) {
                           var7.method2981(var6.field3481, 0);
                           if (!var5) {
                              break label400;
                           }
                        }

                        var7.method2981(var6.field3505, 0);
                        if (!var5) {
                           break label400;
                        }
                     }

                     var7.method2981(var6.field3478, 0);
                     if (!var5) {
                        break label400;
                     }
                  }

                  if (~var9 < -2049 && ~var9 >= -6145 && ~var6.field3502 != 0) {
                     var7.method2981(var6.field3502, 0);
                     if (!var5) {
                        break label400;
                     }
                  }

                  if (var9 < 10240 || var9 >= 14336 || ~var6.field3511 == 0) {
                     if (~var9 >= -6145 || var9 >= 10240 || var6.field3471 == -1) {
                        var7.method2981(var6.field3458, 0);
                        if (!var5) {
                           break label400;
                        }
                     }

                     var7.method2981(var6.field3471, 0);
                     if (!var5) {
                        break label400;
                     }
                  }

                  var7.method2981(var6.field3511, 0);
                  if (!var5) {
                     break label400;
                  }
               }

               if (~var9 >= -2049 || var9 > 6144 || ~var6.field3509 == 0) {
                  if (var9 >= 10240 && ~var9 > -14337 && var6.field3488 != -1) {
                     var7.method2981(var6.field3488, 0);
                     if (!var5) {
                        break label400;
                     }
                  }

                  if (~var9 < -6145 && var9 < 10240 && ~var6.field3495 != 0) {
                     var7.method2981(var6.field3495, 0);
                     if (!var5) {
                        break label400;
                     }
                  }

                  var7.method2981(var6.field3515, 0);
                  if (!var5) {
                     break label400;
                  }
               }

               var7.method2981(var6.field3509, 0);
            }

            arg4.field1656 = false;
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field8311[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8311[1] : field8311[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(I)V",
      line = 196
   )
   public static void method4222(int arg0) {
      try {
         field8310 = null;
         if (arg0 != 2980) {
            method4223((class281)null, -120, 61, -83, -44);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8311[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(Lne;IIII)V",
      line = 207
   )
   public static final void method4223(class281 param0, int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(Lpfa;I)V",
      line = 259
   )
   public static final void method4224(class102 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(III)V",
      line = 341
   )
   public static final void method4225(int arg0, int arg1, int arg2) {
      try {
         ++field8305;
         class566 var3 = class146.method1321((long)arg0, 7, -1428737160);
         if (arg2 == -6140) {
            var3.method4269((byte)-124);
            var3.field8394 = arg1;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8311[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4226(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4227(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

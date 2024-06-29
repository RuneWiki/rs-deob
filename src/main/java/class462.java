import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class462 extends class30 implements class703 {
   @OriginalMember(
      owner = "client!ti",
      name = "m",
      descriptor = "I"
   )
   private int field6757;
   @OriginalMember(
      owner = "client!ti",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6766 = new String[]{method3469(method3468("yRp-P")), method3469(method3468("v\u0015pF\u0005")), method3469(method3468("l\t2o")), method3469(method3468("v\u0015p@\u0005")), method3469(method3468("v\u0015p?Dl\u0015*=\u0005")), method3469(method3468("v\u0015pA\u0005")), method3469(method3468("v\u0015pG\u0005")), method3469(method3468("v\u0015pB\u0005")), method3469(method3468("v\u0015pE\u0005")), method3469(method3468("v\u0015pD\u0005")), method3469(method3468("v\u0015pJ\u0005")), method3469(method3468("v\u0015pK\u0005"))};
   @OriginalMember(
      owner = "client!ti",
      name = "y",
      descriptor = "I"
   )
   public static int field6750 = 0;
   @OriginalMember(
      owner = "client!ti",
      name = "u",
      descriptor = "I"
   )
   public static int field6754 = 50;
   @OriginalMember(
      owner = "client!ti",
      name = "C",
      descriptor = "[F"
   )
   public static float[] field6758 = new float[4];
   @OriginalMember(
      owner = "client!ti",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field6761 = new int[field6754];
   @OriginalMember(
      owner = "client!ti",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field6749 = new int[field6754];
   @OriginalMember(
      owner = "client!ti",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field6763 = new String[field6754];
   @OriginalMember(
      owner = "client!ti",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field6756 = new int[field6754];
   @OriginalMember(
      owner = "client!ti",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field6751 = new int[field6754];
   @OriginalMember(
      owner = "client!ti",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field6747 = new int[field6754];
   @OriginalMember(
      owner = "client!ti",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field6762 = new int[field6754];
   @OriginalMember(
      owner = "client!ti",
      name = "p",
      descriptor = "I"
   )
   public static int field6748;
   @OriginalMember(
      owner = "client!ti",
      name = "A",
      descriptor = "I"
   )
   public static int field6752;
   @OriginalMember(
      owner = "client!ti",
      name = "t",
      descriptor = "I"
   )
   public static int field6753;
   @OriginalMember(
      owner = "client!ti",
      name = "q",
      descriptor = "I"
   )
   public static int field6755;
   @OriginalMember(
      owner = "client!ti",
      name = "E",
      descriptor = "I"
   )
   public static int field6759;
   @OriginalMember(
      owner = "client!ti",
      name = "v",
      descriptor = "I"
   )
   public static int field6760;
   @OriginalMember(
      owner = "client!ti",
      name = "x",
      descriptor = "I"
   )
   public static int field6764;
   @OriginalMember(
      owner = "client!ti",
      name = "B",
      descriptor = "I"
   )
   public static int field6765;

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(ILuda;)Lqr;"
   )
   public static final class71 method3463(int arg0, class473 arg1) {
      try {
         if (arg0 != 256) {
            return null;
         } else {
            ++field6760;
            class449 var2 = class561.method4185((byte)10, arg1);
            int var3 = arg1.method3567(31871);
            int var4 = arg1.method3567(arg0 + 31615);
            int var5 = arg1.method3565(true);
            return new class71(var2.field6556, var2.field6564, var2.field6561, var2.field6560, var2.field6555, var2.field6566, var2.field6551, var2.field6562, var2.field6554, var3, var4, var5);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6766[1] + arg0 + ',' + (arg1 != null ? field6766[0] : field6766[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method1487(int arg0) {
      try {
         ++field6748;
         if (arg0 != -31810) {
            field6750 = 74;
         }

         return 0L;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6766[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3464(byte arg0) {
      try {
         if (arg0 == -69) {
            field6758 = null;
            field6747 = null;
            field6751 = null;
            field6762 = null;
            field6756 = null;
            field6761 = null;
            field6749 = null;
            field6763 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6766[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method225(byte arg0) {
      try {
         if (arg0 == 45) {
            super.field461.method365(true, this);
            ++field6759;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6766[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(IIIIZLaa;Ljfa;Ltd;)V"
   )
   public static final void method3465(int arg0, int arg1, int arg2, int arg3, boolean arg4, class510 arg5, class303 arg6, class476 arg7) {
      try {
         ++field6752;
         if (arg7 != null) {
            int var8;
            label47: {
               if (~class590.field8514 == -5) {
                  var8 = (int)class756.field10975 & 16383;
                  if (!client.field4564) {
                     break label47;
                  }
               }

               var8 = 16383 & (int)class756.field10975 - -class395.field5809;
            }

            int var9 = 10 + Math.max(arg6.field4308 / 2, arg6.field4226 / 2);
            if (!arg4) {
               field6747 = null;
            }

            int var10 = arg0 * arg0 + arg2 * arg2;
            if (~(var9 * var9) <= ~var10) {
               int var11 = class593.field8539[var8];
               int var12 = class593.field8548[var8];
               if (class590.field8514 != 4) {
                  var11 = var11 * 256 / (class449.field6559 + 256);
                  var12 = var12 * 256 / (class449.field6559 + 256);
               }

               int var13 = arg0 * var11 + arg2 * var12 >> 14;
               int var14 = arg0 * var12 - arg2 * var11 >> 14;
               arg7.method1059(arg3 - -(arg6.field4308 / 2) + var13 + -(arg7.method3009() / 2), arg1 - -(arg6.field4226 / 2) + -var14 - arg7.method3000() / 2, arg5, arg3, arg1);
            }
         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field6766[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6766[0] : field6766[2]) + ',' + (arg6 != null ? field6766[0] : field6766[2]) + ',' + (arg7 != null ? field6766[0] : field6766[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "([BIII)V"
   )
   public final void method1488(byte[] arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6764;
         if (arg2 != -15857) {
            this.method1488((byte[])null, -61, 111, -116);
         }

         this.method219(arg2 + 50897, arg3, arg0);
         this.field6757 = arg1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6766[7] + (arg0 != null ? field6766[0] : field6766[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1486(boolean arg0) {
      try {
         ++field6755;
         if (arg0) {
            this.method1487(-80);
         }

         return this.field6757;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6766[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3466(int arg0, int arg1) {
      try {
         ++field6753;
         class536 var2 = class108.method1038((long)arg1, 127, 1);
         var2.method4013((byte)126);
         if (arg0 != 16383) {
            method3466(112, 121);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6766[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(Z[[[BIBIIZ)V"
   )
   public static final void method3467(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
      int var7 = arg0 ? 1 : 0;
      class353.field4993 = 0;
      class302.field4216 = 0;
      ++class36.field882;
      if ((arg5 & 2) == 0) {
         for(class294 var8 = class529.field7698[var7]; var8 != null; var8 = var8.field4088) {
            if (!class308.method2404(var8, arg0, arg1, arg2, arg3)) {
               class611.method4489(var8);
               if (var8.field4094 != -1) {
                  class100.field1665[class353.field4993++] = var8;
               }
            }
         }
      }

      if ((arg5 & 1) == 0) {
         for(class294 var9 = class559.field8137[var7]; var9 != null; var9 = var9.field4088) {
            if (!class308.method2404(var9, arg0, arg1, arg2, arg3)) {
               class611.method4489(var9);
               if (var9.field4094 != -1) {
                  class171.field2652[class302.field4216++] = var9;
               }
            }
         }

         for(class294 var10 = class389.field5744[var7]; var10 != null; var10 = var10.field4088) {
            if (!class308.method2404(var10, arg0, arg1, arg2, arg3)) {
               if (var10.method588(1)) {
                  class611.method4489(var10);
                  if (var10.field4094 != -1) {
                     class171.field2652[class302.field4216++] = var10;
                  }
               } else {
                  class611.method4489(var10);
                  if (var10.field4094 != -1) {
                     class100.field1665[class353.field4993++] = var10;
                  }
               }
            }
         }

         if (!arg0) {
            for(int var11 = 0; var11 < class103.field1682; ++var11) {
               if (!class308.method2404(class649.field9413[var11], arg0, arg1, arg2, arg3)) {
                  class611.method4489(class649.field9413[var11]);
                  if (class649.field9413[var11].field4094 != -1) {
                     if (class649.field9413[var11].method588(1)) {
                        class171.field2652[class302.field4216++] = class649.field9413[var11];
                     } else {
                        class100.field1665[class353.field4993++] = class649.field9413[var11];
                     }
                  }
               }
            }
         }
      }

      if (class353.field4993 > 0) {
         class599.method4424(class100.field1665, 0, class353.field4993 - 1);

         for(int var12 = 0; var12 < class353.field4993; ++var12) {
            class166.method1506(class100.field1665[var12], true, arg6);
         }
      }

      if (class628.field9153) {
         class49.field1047.method364(0, (class622[])null);
      }

      if ((arg5 & 2) == 0) {
         for(int var13 = class626.field9116; var13 < class323.field4655; ++var13) {
            if (var13 >= arg2 && arg1 != null) {
               int var14 = class750.field10812.length;
               if (class750.field10812.length + class474.field6928 > class479.field6989) {
                  var14 -= class750.field10812.length + class474.field6928 - class479.field6989;
               }

               int var15 = class750.field10812[0].length;
               if (class750.field10812[0].length + class543.field7875 > class357.field5100) {
                  var15 -= class750.field10812[0].length + class543.field7875 - class357.field5100;
               }

               boolean[][] var16 = class696.field10195;
               if (class53.field1099) {
                  if (class593.field8538) {
                     var16 = class295.field4141[var13];
                  }

                  for(int var17 = class386.field5696; var17 < var14; ++var17) {
                     int var18 = class474.field6928 + var17 - class386.field5696;

                     for(int var19 = class251.field3597; var19 < var15; ++var19) {
                        var16[var17][var19] = false;
                        if (class750.field10812[var17][var19]) {
                           int var20 = class543.field7875 + var19 - class251.field3597;

                           for(int var21 = var13; var21 >= 0; --var21) {
                              if (class90.field1473[var21][var18][var20] != null && class90.field1473[var21][var18][var20].field8664 == var13) {
                                 if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class310.method2416(var18, var20, var13, -128)) {
                                    var16[var17][var19] = true;
                                    break;
                                 }

                                 var16[var17][var19] = false;
                                 break;
                              }
                           }
                        }
                     }
                  }
               }

               if (class593.field8538) {
                  if (arg4 >= 0) {
                     class269.field3810[var13].method2291(0, 0, 0, (boolean[][])null, false, arg4, arg5);
                  } else {
                     class269.field3810[var13].method2284(0, 0, 0, (boolean[][])null, false, arg5);
                  }

                  for(int var22 = 0; var22 < class491.field7154; ++var22) {
                     class224.field3333[var22].method2663(new class169(var13 + 1), 4514);
                  }
               } else if (arg4 >= 0) {
                  class269.field3810[var13].method2291(class566.field8206, class115.field1864, class54.field1102, class696.field10195, false, arg4, arg5);
               } else {
                  class269.field3810[var13].method2284(class566.field8206, class115.field1864, class54.field1102, class696.field10195, false, arg5);
               }
            } else {
               int var23 = class750.field10812.length;
               if (class750.field10812.length + class474.field6928 > class479.field6989) {
                  var23 -= class750.field10812.length + class474.field6928 - class479.field6989;
               }

               int var24 = class750.field10812[0].length;
               if (class750.field10812[0].length + class543.field7875 > class357.field5100) {
                  var24 -= class750.field10812[0].length + class543.field7875 - class357.field5100;
               }

               boolean[][] var25 = class696.field10195;
               if (class53.field1099) {
                  if (class593.field8538) {
                     var25 = class295.field4141[var13];
                  }

                  for(int var26 = class386.field5696; var26 < var23; ++var26) {
                     int var27 = class474.field6928 + var26 - class386.field5696;

                     for(int var28 = class251.field3597; var28 < var24; ++var28) {
                        if (class750.field10812[var26][var28] && !class310.method2416(var27, class543.field7875 + var28 - class251.field3597, var13, -125)) {
                           var25[var26][var28] = true;
                        } else {
                           var25[var26][var28] = false;
                        }
                     }
                  }
               }

               if (class593.field8538) {
                  if (arg4 >= 0) {
                     class269.field3810[var13].method2291(0, 0, 0, (boolean[][])null, false, arg4, arg5);
                  } else {
                     class269.field3810[var13].method2284(0, 0, 0, (boolean[][])null, false, arg5);
                  }

                  for(int var29 = 0; var29 < class491.field7154; ++var29) {
                     class224.field3333[var29].method2663(new class169(var13 + 1), 4514);
                  }
               } else if (arg4 >= 0) {
                  class269.field3810[var13].method2291(class566.field8206, class115.field1864, class54.field1102, class696.field10195, true, arg4, arg5);
               } else {
                  class269.field3810[var13].method2284(class566.field8206, class115.field1864, class54.field1102, class696.field10195, true, arg5);
               }
            }
         }
      }

      if (class302.field4216 > 0) {
         class446.method3363(class171.field2652, 0, class302.field4216 - 1);

         for(int var30 = 0; var30 < class302.field4216; ++var30) {
            class166.method1506(class171.field2652[var30], true, arg6);
         }
      }

   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1489(int arg0) {
      try {
         ++field6765;
         return arg0 >= -63 ? 67 : super.field468;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6766[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "<init>",
      descriptor = "(Lrk;I[BIZ)V"
   )
   public class462(class35 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      super(arg0, 34963, arg2, arg3, arg4);

      try {
         this.field6757 = arg1;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6766[4] + (arg0 != null ? field6766[0] : field6766[2]) + ',' + arg1 + ',' + (arg2 != null ? field6766[0] : field6766[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3468(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ti",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3469(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

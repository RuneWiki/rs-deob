import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class68 extends class76 {
   @OriginalMember(
      owner = "client!bd",
      name = "B",
      descriptor = "D"
   )
   public double field837;
   @OriginalMember(
      owner = "client!bd",
      name = "A",
      descriptor = "[[S"
   )
   public short[][] field840;
   @OriginalMember(
      owner = "client!bd",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field842 = new String[]{method643(method642("+^|BR'S&@\u0013")), method643(method642("'O>\u0012")), method643(method642("2\u0014|PF")), method643(method642("+^|:\u0013")), method643(method642("+^|<\u0013")), method643(method642("+^|?\u0013"))};
   @OriginalMember(
      owner = "client!bd",
      name = "C",
      descriptor = "Leg;"
   )
   public static class118 field841 = new class118(76, 3);
   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "I"
   )
   public static int field838;
   @OriginalMember(
      owner = "client!bd",
      name = "E",
      descriptor = "I"
   )
   public static int field839;

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(Lbl;IB)I"
   )
   public static final int method638(class678 arg0, int arg1, byte arg2) {
      try {
         ++field838;
         if (!client.method2351(arg0).method2169(arg2 ^ -14, arg1) && arg0.field9975 == null) {
            return -1;
         } else {
            if (arg2 != 13) {
               field841 = null;
            }

            return arg0.field9933 != null && ~arg1 > ~arg0.field9933.length ? arg0.field9933[arg1] : -1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field842[4] + (arg0 != null ? field842[2] : field842[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "c",
      descriptor = "(B)J"
   )
   public final long method639(byte arg0) {
      try {
         ++field839;
         int var2 = 0 % ((arg0 - -10) / 53);
         return (long)(this.field840.length << 0 | this.field840[0].length);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field842[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method640(byte arg0) {
      try {
         if (arg0 != -61) {
            method641(false, (byte[][][])null, -114, (byte)-104, -103, -77, false);
         }

         field841 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field842[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "<init>",
      descriptor = "([[SD)V"
   )
   public class68(short[][] arg0, double arg1) {
      try {
         this.field837 = arg1;
         this.field840 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field842[0] + (arg0 != null ? field842[2] : field842[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(Z[[[BIBIIZ)V"
   )
   public static final void method641(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
      int var7 = arg0 ? 1 : 0;
      class614.field9023 = 0;
      class616.field9062 = 0;
      ++class500.field7247;
      if ((arg5 & 2) == 0) {
         for(class731 var8 = class591.field8705[var7]; var8 != null; var8 = var8.field10695) {
            if (!class117.method940(var8, arg0, arg1, arg2, arg3)) {
               class224.method1754(var8);
               if (var8.field10707 != -1) {
                  class198.field2822[class614.field9023++] = var8;
               }
            }
         }
      }

      if ((arg5 & 1) == 0) {
         for(class731 var9 = class392.field5677[var7]; var9 != null; var9 = var9.field10695) {
            if (!class117.method940(var9, arg0, arg1, arg2, arg3)) {
               class224.method1754(var9);
               if (var9.field10707 != -1) {
                  class752.field11128[class616.field9062++] = var9;
               }
            }
         }

         for(class731 var10 = class756.field11204[var7]; var10 != null; var10 = var10.field10695) {
            if (!class117.method940(var10, arg0, arg1, arg2, arg3)) {
               if (var10.method238((byte)104)) {
                  class224.method1754(var10);
                  if (var10.field10707 != -1) {
                     class752.field11128[class616.field9062++] = var10;
                  }
               } else {
                  class224.method1754(var10);
                  if (var10.field10707 != -1) {
                     class198.field2822[class614.field9023++] = var10;
                  }
               }
            }
         }

         if (!arg0) {
            for(int var11 = 0; var11 < class274.field3764; ++var11) {
               if (!class117.method940(class541.field7770[var11], arg0, arg1, arg2, arg3)) {
                  class224.method1754(class541.field7770[var11]);
                  if (class541.field7770[var11].field10707 != -1) {
                     if (class541.field7770[var11].method238((byte)79)) {
                        class752.field11128[class616.field9062++] = class541.field7770[var11];
                     } else {
                        class198.field2822[class614.field9023++] = class541.field7770[var11];
                     }
                  }
               }
            }
         }
      }

      if (class614.field9023 > 0) {
         class434.method3208(class198.field2822, 0, class614.field9023 - 1);

         for(int var12 = 0; var12 < class614.field9023; ++var12) {
            class321.method2376(class198.field2822[var12], true, arg6);
         }
      }

      if (class316.field4302) {
         class80.field1038.method553(0, (class389[])null);
      }

      if ((arg5 & 2) == 0) {
         for(int var13 = class215.field3081; var13 < class154.field2185; ++var13) {
            if (var13 >= arg2 && arg1 != null) {
               int var14 = class506.field7334.length;
               if (class506.field7334.length + class741.field10805 > class457.field6539) {
                  var14 -= class506.field7334.length + class741.field10805 - class457.field6539;
               }

               int var15 = class506.field7334[0].length;
               if (class506.field7334[0].length + class110.field1388 > class16.field190) {
                  var15 -= class506.field7334[0].length + class110.field1388 - class16.field190;
               }

               boolean[][] var16 = class433.field6210;
               if (class621.field9143) {
                  if (class767.field11310) {
                     var16 = class637.field9318[var13];
                  }

                  for(int var17 = class447.field6351; var17 < var14; ++var17) {
                     int var18 = class741.field10805 + var17 - class447.field6351;

                     for(int var19 = class542.field7781; var19 < var15; ++var19) {
                        var16[var17][var19] = false;
                        if (class506.field7334[var17][var19]) {
                           int var20 = class110.field1388 + var19 - class542.field7781;

                           for(int var21 = var13; var21 >= 0; --var21) {
                              if (class663.field9659[var21][var18][var20] != null && class663.field9659[var21][var18][var20].field7466 == var13) {
                                 if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class50.method405(var18, 122, var20, var13)) {
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

               if (class767.field11310) {
                  if (arg4 >= 0) {
                     class731.field10698[var13].method1626(0, 0, 0, (boolean[][])null, false, arg4, arg5);
                  } else {
                     class731.field10698[var13].method1624(0, 0, 0, (boolean[][])null, false, arg5);
                  }

                  for(int var22 = 0; var22 < class140.field1792; ++var22) {
                     class390.field5654[var22].method1558((byte)93, new class516(var13 + 1));
                  }
               } else if (arg4 >= 0) {
                  class731.field10698[var13].method1626(class712.field10385, class377.field5453, class106.field1335, class433.field6210, false, arg4, arg5);
               } else {
                  class731.field10698[var13].method1624(class712.field10385, class377.field5453, class106.field1335, class433.field6210, false, arg5);
               }
            } else {
               int var23 = class506.field7334.length;
               if (class506.field7334.length + class741.field10805 > class457.field6539) {
                  var23 -= class506.field7334.length + class741.field10805 - class457.field6539;
               }

               int var24 = class506.field7334[0].length;
               if (class506.field7334[0].length + class110.field1388 > class16.field190) {
                  var24 -= class506.field7334[0].length + class110.field1388 - class16.field190;
               }

               boolean[][] var25 = class433.field6210;
               if (class621.field9143) {
                  if (class767.field11310) {
                     var25 = class637.field9318[var13];
                  }

                  for(int var26 = class447.field6351; var26 < var23; ++var26) {
                     int var27 = class741.field10805 + var26 - class447.field6351;

                     for(int var28 = class542.field7781; var28 < var24; ++var28) {
                        if (class506.field7334[var26][var28] && !class50.method405(var27, 125, class110.field1388 + var28 - class542.field7781, var13)) {
                           var25[var26][var28] = true;
                        } else {
                           var25[var26][var28] = false;
                        }
                     }
                  }
               }

               if (class767.field11310) {
                  if (arg4 >= 0) {
                     class731.field10698[var13].method1626(0, 0, 0, (boolean[][])null, false, arg4, arg5);
                  } else {
                     class731.field10698[var13].method1624(0, 0, 0, (boolean[][])null, false, arg5);
                  }

                  for(int var29 = 0; var29 < class140.field1792; ++var29) {
                     class390.field5654[var29].method1558((byte)11, new class516(var13 + 1));
                  }
               } else if (arg4 >= 0) {
                  class731.field10698[var13].method1626(class712.field10385, class377.field5453, class106.field1335, class433.field6210, true, arg4, arg5);
               } else {
                  class731.field10698[var13].method1624(class712.field10385, class377.field5453, class106.field1335, class433.field6210, true, arg5);
               }
            }
         }
      }

      if (class616.field9062 > 0) {
         class223.method1747(class752.field11128, 0, class616.field9062 - 1);

         for(int var30 = 0; var30 < class616.field9062; ++var30) {
            class321.method2376(class752.field11128[var30], true, arg6);
         }
      }

   }

   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method642(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method643(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

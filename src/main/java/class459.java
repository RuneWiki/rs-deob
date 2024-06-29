import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class459 {
   @OriginalMember(
      owner = "client!nja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6297 = new String[]{method3382(method3381("Uc0~")), method3382(method3381("U|=<S\u0013")), method3382(method3381("@8r<m")), method3382(method3381("U|=<T\u0013")), method3382(method3381("U|=<U\u0013")), method3382(method3381("U|=<V\u0013")), method3382(method3381("U|=<R\u0013")), method3382(method3381("U|=<W\u0013")), method3382(method3381("U|=<Q\u0013"))};
   @OriginalMember(
      owner = "client!nja",
      name = "h",
      descriptor = "I"
   )
   public static int field6290 = 0;
   @OriginalMember(
      owner = "client!nja",
      name = "k",
      descriptor = "Lcl;"
   )
   public static class279 field6294 = new class279();
   @OriginalMember(
      owner = "client!nja",
      name = "j",
      descriptor = "I"
   )
   public static int field6287;
   @OriginalMember(
      owner = "client!nja",
      name = "e",
      descriptor = "I"
   )
   public static int field6288;
   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "I"
   )
   public static int field6289;
   @OriginalMember(
      owner = "client!nja",
      name = "g",
      descriptor = "I"
   )
   public static int field6291;
   @OriginalMember(
      owner = "client!nja",
      name = "d",
      descriptor = "I"
   )
   public static int field6292;
   @OriginalMember(
      owner = "client!nja",
      name = "c",
      descriptor = "I"
   )
   public static int field6295;
   @OriginalMember(
      owner = "client!nja",
      name = "f",
      descriptor = "I"
   )
   public static int field6296;
   @OriginalMember(
      owner = "client!nja",
      name = "i",
      descriptor = "Lr;"
   )
   public class194 field6293;
   @OriginalMember(
      owner = "client!nja",
      name = "b",
      descriptor = "Lka;"
   )
   public class501 field6286;

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3374(int arg0) {
      try {
         int var1 = 67 / ((-63 - arg0) / 42);
         field6294 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6297[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(IIIIILfg;IIIII)Z"
   )
   public static final boolean method3375(int arg0, int arg1, int arg2, int arg3, int arg4, class138 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      boolean var11 = client.field4273;

      try {
         ++field6296;
         byte var14 = 64;
         byte var15 = 64;
         int var16 = arg4 - var14;
         int var17 = -var15 + arg3;
         class97.field1273[var14][var15] = 99;
         class742.field10808[var14][var15] = 0;
         byte var18 = 0;
         class205.field2519[var18] = arg4;
         int var19 = 0;
         byte var10001 = var18;
         int var29 = var18 + 1;
         class257.field3285[var10001] = arg3;
         int[][] var20 = arg5.field1807;
         int var21 = -88 / ((-19 - arg2) / 59);
         if (!var11 && ~var29 == ~var19) {
            class620.field8668 = arg4;
            class154.field1995 = arg3;
            return false;
         } else {
            int var12;
            int var13;
            label214:
            do {
               var13 = class257.field3285[var19];
               var12 = class205.field2519[var19];
               int var22 = -var16 + var12;
               int var23 = -var17 + var13;
               int var24 = -arg5.field1790 + var12;
               int var25 = -arg5.field1785 + var13;
               var19 = 4095 & var19 - -1;
               int var26 = arg8;
               int var10000 = ~arg8;
               var10001 = 3;

               do {
                  if (var10000 != var10001) {
                     if (var26 != -3) {
                        if (var26 != -2) {
                           if (~var26 != 0) {
                              label201: {
                                 if (var26 != 0 && ~var26 != -2 && var26 != 2 && var26 != 3) {
                                    if (var26 != 9) {
                                       if (arg5.method1165(arg0, 1, arg9, var13, -1, arg8, var12, arg1)) {
                                          class154.field1995 = var13;
                                          class620.field8668 = var12;
                                          return true;
                                       }
                                       break label201;
                                    }

                                    if (var11) {
                                       if (arg1 == var12 && arg9 == var13) {
                                          class154.field1995 = var13;
                                          class620.field8668 = var12;
                                          return true;
                                       }
                                       break label201;
                                    }
                                 }

                                 if (arg5.method1148((byte)108, arg0, arg8, var13, 1, var12, arg9, arg1)) {
                                    class154.field1995 = var13;
                                    class620.field8668 = var12;
                                    return true;
                                 }
                              }
                           } else if (arg5.method1164(var13, arg10, arg7, arg1, 1, arg6, arg9, -29800, var12)) {
                              class620.field8668 = var12;
                              class154.field1995 = var13;
                              return true;
                           }
                        } else if (arg5.method1152(var13, 1, 128, 1, arg1, arg6, arg7, arg10, var12, arg9)) {
                           class154.field1995 = var13;
                           class620.field8668 = var12;
                           return true;
                        }
                     } else if (class535.method3850(arg7, 2, var13, 1, arg1, var12, arg9, 1, arg10)) {
                        class154.field1995 = var13;
                        class620.field8668 = var12;
                        return true;
                     }
                  } else if (arg1 == var12 && arg9 == var13) {
                     class154.field1995 = var13;
                     class620.field8668 = var12;
                     return true;
                  }

                  var26 = class742.field10808[var22][var23] + 1;
                  if (var22 > 0 && class97.field1273[var22 - 1][var23] == 0 && ~(1109655552 & var20[var24 + -1][var25]) == -1) {
                     class205.field2519[var29] = var12 - 1;
                     class257.field3285[var29] = var13;
                     var29 = var29 + 1 & 4095;
                     class97.field1273[var22 + -1][var23] = 2;
                     class742.field10808[var22 + -1][var23] = var26;
                  }

                  if (~var22 > -128 && class97.field1273[var22 + 1][var23] == 0 && ~(1612972032 & var20[var24 + 1][var25]) == -1) {
                     class205.field2519[var29] = var12 - -1;
                     class257.field3285[var29] = var13;
                     var29 = 4095 & var29 + 1;
                     class97.field1273[var22 - -1][var23] = 8;
                     class742.field10808[var22 - -1][var23] = var26;
                  }

                  if (var23 > 0 && ~class97.field1273[var22][var23 + -1] == -1 && ~(var20[var24][var25 + -1] & 1084489728) == -1) {
                     class205.field2519[var29] = var12;
                     class257.field3285[var29] = var13 + -1;
                     class97.field1273[var22][var23 + -1] = 1;
                     var29 = var29 + 1 & 4095;
                     class742.field10808[var22][var23 + -1] = var26;
                  }

                  if (~var23 > -128 && ~class97.field1273[var22][var23 - -1] == -1 && ~(1210318848 & var20[var24][var25 + 1]) == -1) {
                     class205.field2519[var29] = var12;
                     class257.field3285[var29] = var13 + 1;
                     class97.field1273[var22][var23 + 1] = 4;
                     var29 = 4095 & var29 - -1;
                     class742.field10808[var22][var23 + 1] = var26;
                  }

                  if (var22 > 0 && ~var23 < -1 && ~class97.field1273[var22 + -1][var23 + -1] == -1 && (1134821376 & var20[var24 + -1][var25 + -1]) == 0 && ~(1109655552 & var20[var24 + -1][var25]) == -1 && (1084489728 & var20[var24][var25 - 1]) == 0) {
                     class205.field2519[var29] = var12 - 1;
                     class257.field3285[var29] = var13 + -1;
                     var29 = 4095 & var29 - -1;
                     class97.field1273[var22 - 1][var23 - 1] = 3;
                     class742.field10808[var22 - 1][var23 + -1] = var26;
                  }

                  if (~var22 > -128 && var23 > 0 && ~class97.field1273[var22 + 1][var23 + -1] == -1 && ~(1625554944 & var20[var24 - -1][var25 + -1]) == -1 && (var20[var24 + 1][var25] & 1612972032) == 0 && ~(var20[var24][var25 + -1] & 1084489728) == -1) {
                     class205.field2519[var29] = var12 + 1;
                     class257.field3285[var29] = var13 + -1;
                     var29 = 4095 & var29 + 1;
                     class97.field1273[var22 - -1][var23 + -1] = 9;
                     class742.field10808[var22 + 1][var23 + -1] = var26;
                  }

                  if (var22 > 0 && var23 < 127 && ~class97.field1273[var22 - 1][var23 + 1] == -1 && (var20[var24 + -1][var25 - -1] & 1310982144) == 0 && (var20[var24 + -1][var25] & 1109655552) == 0 && (1210318848 & var20[var24][var25 + 1]) == 0) {
                     class205.field2519[var29] = var12 + -1;
                     class257.field3285[var29] = var13 + 1;
                     class97.field1273[var22 - 1][var23 + 1] = 6;
                     var29 = 4095 & var29 + 1;
                     class742.field10808[var22 + -1][var23 + 1] = var26;
                  }

                  if (var22 >= 127) {
                     continue label214;
                  }

                  var10000 = var23;
                  var10001 = 127;
               } while(var11);

               if (var23 < 127 && class97.field1273[var22 + 1][var23 + 1] == 0 && (var20[var24 + 1][var25 + 1] & 2015625216) == 0 && ~(1612972032 & var20[var24 + 1][var25]) == -1 && ~(var20[var24][var25 + 1] & 1210318848) == -1) {
                  class205.field2519[var29] = var12 + 1;
                  class257.field3285[var29] = var13 + 1;
                  class97.field1273[var22 + 1][var23 + 1] = 12;
                  var29 = var29 + 1 & 4095;
                  class742.field10808[var22 - -1][var23 + 1] = var26;
               }
            } while(~var29 != ~var19);

            class620.field8668 = var12;
            class154.field1995 = var13;
            return false;
         }
      } catch (RuntimeException var28) {
         throw class534.method3846(var28, field6297[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6297[2] : field6297[0]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(ILjava/lang/String;I)V"
   )
   public static final void method3376(int arg0, String arg1, int arg2) {
      try {
         ++field6288;
         class446 var3 = class635.method4607(122, (long)arg0, 3);
         if (arg2 == -1) {
            var3.method3311(true);
            var3.field6172 = arg1;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6297[8] + arg0 + ',' + (arg1 != null ? field6297[2] : field6297[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(ILqh;Ljava/awt/Canvas;IILd;)Lha;"
   )
   public static final class65 method3377(int arg0, class74 arg1, Canvas arg2, int arg3, int arg4, class160 arg5) {
      try {
         ++field6295;
         if (arg3 >= -70) {
            method3379((byte)-83, (class85)null);
         }

         int var6 = 0;
         int var7 = 0;
         if (arg2 != null) {
            Dimension var8 = arg2.getSize();
            var7 = var8.height;
            var6 = var8.width;
         }

         return class65.method607(arg2, (byte)125, var6, arg1, arg4, arg5, var7, arg0);
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field6297[5] + arg0 + ',' + (arg1 != null ? field6297[2] : field6297[0]) + ',' + (arg2 != null ? field6297[2] : field6297[0]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6297[2] : field6297[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)Z"
   )
   public static final boolean method3378(String arg0, boolean arg1) {
      try {
         if (!arg1) {
            method3376(-120, (String)null, -100);
         }

         ++field6292;
         return class192.field2346.containsKey(arg0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6297[3] + (arg0 != null ? field6297[2] : field6297[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(BLaka;)I"
   )
   public static final int method3379(byte arg0, class85 arg1) {
      try {
         int var2 = -9 % ((-80 - arg0) / 44);
         ++field6287;
         String var3 = class489.method3554(59, arg1);
         return class101.field1304.method4810(19, class768.field11077, var3);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6297[1] + arg0 + ',' + (arg1 != null ? field6297[2] : field6297[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(ILqh;II)Luaa;"
   )
   public static final class126 method3380(int arg0, class74 arg1, int arg2, int arg3) {
      boolean var4 = client.field4273;

      try {
         ++field6291;
         class594 var5 = new class594(arg1.method732(arg0, arg2, (byte)107));
         class126 var6 = new class126(arg0, var5.method4291(-128), var5.method4291(-110), var5.method4302(true), var5.method4302(true), arg3 == var5.method4288((byte)124), var5.method4288((byte)91), var5.method4288((byte)78));
         int var7 = var5.method4288((byte)92);
         int var8 = 0;
         class126 var10000;
         if (var4) {
            var10000 = var6;
         } else if (var8 >= var7) {
            var6.method1058((byte)49);
            var10000 = var6;
            if (!var4) {
               return var6;
            }
         } else {
            var10000 = var6;
         }

         while(true) {
            var10000.field1577.method3859(2, new class626(var5.method4288((byte)77), var5.method4280(arg3 ^ -19103), var5.method4280(-19104), var5.method4280(-19104), var5.method4280(-19104), var5.method4280(arg3 ^ -19103), var5.method4280(-19104), var5.method4280(-19104), var5.method4280(arg3 + -19105)));
            ++var8;
            if (var8 >= var7) {
               var6.method1058((byte)49);
               var10000 = var6;
               if (!var4) {
                  return var6;
               }
            } else {
               var10000 = var6;
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field6297[7] + arg0 + ',' + (arg1 != null ? field6297[2] : field6297[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3381(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3382(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

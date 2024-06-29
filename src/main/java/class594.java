import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class594 extends class345 {
   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8573 = new String[]{method4396(method4395("\b\u001fm=[")), method4396(method4395("\b\u001fm:[")), method4396(method4395("\b\u001fm?[")), method4396(method4395("\b\u001fm4[")), method4396(method4395("\b\u001fm7[")), method4396(method4395("\b\u001fm>[")), method4396(method4395("\b\u001fm;[")), method4396(method4395("\b\u001fm0[")), method4396(method4395("\u0015TmR\u000e")), method4396(method4395("\u0000\u000f/\u0010")), method4396(method4395("\b\u001fm2[")), method4396(method4395("\u0003\u0019")), method4396(method4395("\b\u001fm5[")), method4396(method4395("\b\u001fm9[")), method4396(method4395("\b\u001fm8["))};
   @OriginalMember(
      owner = "client!fe",
      name = "n",
      descriptor = "Luw;"
   )
   public static class435 field8558 = new class435(12, 6);
   @OriginalMember(
      owner = "client!fe",
      name = "i",
      descriptor = "Lhm;"
   )
   public static class230 field8569 = new class230(14, 0, 4, 1);
   @OriginalMember(
      owner = "client!fe",
      name = "q",
      descriptor = "Lfk;"
   )
   public static class678 field8571 = new class678();
   @OriginalMember(
      owner = "client!fe",
      name = "m",
      descriptor = "I"
   )
   public static int field8559;
   @OriginalMember(
      owner = "client!fe",
      name = "j",
      descriptor = "I"
   )
   public static int field8560;
   @OriginalMember(
      owner = "client!fe",
      name = "p",
      descriptor = "I"
   )
   public static int field8561;
   @OriginalMember(
      owner = "client!fe",
      name = "t",
      descriptor = "I"
   )
   public static int field8562;
   @OriginalMember(
      owner = "client!fe",
      name = "w",
      descriptor = "I"
   )
   public static int field8563;
   @OriginalMember(
      owner = "client!fe",
      name = "s",
      descriptor = "I"
   )
   public static int field8564;
   @OriginalMember(
      owner = "client!fe",
      name = "v",
      descriptor = "I"
   )
   public static int field8565;
   @OriginalMember(
      owner = "client!fe",
      name = "u",
      descriptor = "I"
   )
   public static int field8566;
   @OriginalMember(
      owner = "client!fe",
      name = "r",
      descriptor = "I"
   )
   public static int field8567;
   @OriginalMember(
      owner = "client!fe",
      name = "o",
      descriptor = "I"
   )
   public static int field8568;
   @OriginalMember(
      owner = "client!fe",
      name = "k",
      descriptor = "I"
   )
   public static int field8570;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!fe",
      name = "l",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field8572;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method4394(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public static void method4384(byte arg0) {
      try {
         if (arg0 > -113) {
            method4390();
         }

         field8558 = null;
         field8571 = null;
         field8569 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8573[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(IIIBII)I",
      line = 19
   )
   public static final int method4385(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
      try {
         ++field8565;
         if (class269.field3810 == null) {
            return 0;
         } else if (arg3 >= -103) {
            return 36;
         } else {
            if (arg1 < 3) {
               int var6 = arg0 >> 9;
               int var7 = arg2 >> 9;
               if (arg5 < 0 || arg4 < 0 || ~arg5 < ~(class209.field3112 + -1) || ~(class1.field3 + -1) > ~arg4) {
                  return 0;
               }

               if (~var6 > -2 || var7 < 1 || ~(class209.field3112 + -1) > ~var6 || ~(class1.field3 + -1) > ~var7) {
                  return 0;
               }

               boolean var8 = ~(class608.field8732[1][arg0 >> 9][arg2 >> 9] & 2) != -1;
               if (~(511 & arg0) == -1) {
                  boolean var9 = ~(class608.field8732[1][var6 + -1][arg2 >> 9] & 2) != -1;
                  boolean var10 = (2 & class608.field8732[1][var6][arg2 >> 9]) != 0;
                  if (var10 == !var9) {
                     var8 = (2 & class608.field8732[1][arg5][arg4]) != 0;
                  }
               }

               if (~(arg2 & 511) == -1) {
                  boolean var11 = (2 & class608.field8732[1][arg0 >> 9][var7 + -1]) != 0;
                  boolean var12 = (2 & class608.field8732[1][arg0 >> 9][var7]) != 0;
                  if (var11 == !var12) {
                     var8 = ~(class608.field8732[1][arg5][arg4] & 2) != -1;
                  }
               }

               if (var8) {
                  ++arg1;
               }
            }

            return class269.field3810[arg1].method2287(-123, arg2, arg0);
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field8573[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 84
   )
   public class594(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!fe",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 88
   )
   public class594(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(IIIIZII)V",
      line = 92
   )
   public static final void method4386(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
      try {
         if (!arg4) {
            method4389(13, -36, -111, (class496)null, (class496)null);
         }

         ++field8563;
         if (~class510.field7454.field11152.method684(!arg4) != -1 && arg2 != 0 && class621.field9054 < 50 && ~arg0 != 0) {
            class123.field1969[class621.field9054++] = new class377((byte)1, arg0, arg2, arg1, arg6, arg5, arg3, (class294)null);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8573[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(BI)I",
      line = 111
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field8562;
         return arg0 > -45 ? 105 : 1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8573[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "b",
      descriptor = "(ZII)Z",
      line = 124
   )
   public static final boolean method4387(boolean arg0, int arg1, int arg2) {
      try {
         if (!arg0) {
            method4392(-96, true, -65, (class141)null);
         }

         ++field8570;
         return (256 & arg2) != 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8573[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(Z)I",
      line = 135
   )
   public final int method53(boolean arg0) {
      try {
         ++field8560;
         if (arg0) {
            method4393(false, 82, 56);
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8573[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(IIII)Loha;",
      line = 147
   )
   public static final class771 method4388(int arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field4564;

      try {
         ++field8564;
         if (arg0 != 1450792937) {
            return null;
         } else {
            class600 var5 = class90.field1473[arg3][arg2][arg1];
            if (var5 == null) {
               return null;
            } else {
               class771 var6 = null;
               int var7 = -1;
               class533 var8 = var5.field8653;

               while(true) {
                  class144 var10000;
                  if (var8 == null) {
                     var10000 = var6;
                     if (!var4) {
                        return var6;
                     }
                  } else {
                     var10000 = var8.field7766;
                  }

                  class144 var9 = var10000;
                  if (var9 instanceof class771) {
                     class771 var10 = (class771)var9;
                     int var11 = 252 + var10.method3438(false) * 256 - 256;
                     int var12 = var10.field4101 - var11 >> 9;
                     int var13 = -var11 + var10.field4096 >> 9;
                     int var14 = var10.field4101 - -var11 >> 9;
                     int var15 = var10.field4096 + var11 >> 9;
                     if (arg2 >= var12 && ~arg1 <= ~var13 && arg2 <= var14 && arg1 <= var15) {
                        int var16 = (var15 - arg1 + 1) * (var14 - arg2 + 1);
                        if (~var7 > ~var16) {
                           var7 = var16;
                           var6 = var10;
                        }
                     }
                  }

                  var8 = var8.field7763;
               }
            }
         }
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field8573[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(IIILnm;Lnm;)V",
      line = 207
   )
   public static final void method4389(int arg0, int arg1, int arg2, class496 arg3, class496 arg4) {
      class600 var5 = class18.method134(arg0, arg1, arg2);
      if (var5 != null) {
         var5.field8659 = arg3;
         var5.field8661 = arg4;
         int var6 = class455.field6647 == class269.field3810 ? 1 : 0;
         if (arg3.method593((byte)-94)) {
            if (arg3.method588(1)) {
               arg3.field4088 = class559.field8137[var6];
               class559.field8137[var6] = arg3;
            } else {
               arg3.field4088 = class529.field7698[var6];
               class529.field7698[var6] = arg3;
               class186.field2818 = true;
            }
         } else {
            arg3.field4088 = class389.field5744[var6];
            class389.field5744[var6] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method593((byte)-94)) {
               if (arg4.method588(1)) {
                  arg4.field4088 = class559.field8137[var6];
                  class559.field8137[var6] = arg4;
                  return;
               }

               arg4.field4088 = class529.field7698[var6];
               class529.field7698[var6] = arg4;
               class186.field2818 = true;
               return;
            }

            arg4.field4088 = class389.field5744[var6];
            class389.field5744[var6] = arg4;
         }
      }

   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "()V",
      line = 266
   )
   public static final void method4390() {
      for(int var0 = 0; var0 < class696.field10208; ++var0) {
         if (!class764.field11079[var0]) {
            class538 var1 = class234.field3419[var0];
            class622 var2 = var1.field7826;
            int var3 = var1.field7842;
            int var4 = var2.method4564((byte)-108) - class760.field11026;
            int var5 = (var4 * 2 >> class76.field1336) + 1;
            int var6 = 0;
            int[] var7 = new int[var5 * var5];
            int var8 = var2.method4560((byte)80) - var4 >> class76.field1336;
            int var9 = var2.method4557((byte)-126) - var4 >> class76.field1336;
            int var10 = var2.method4557((byte)-124) + var4 >> class76.field1336;
            if (var9 < 0) {
               var6 -= var9;
               var9 = 0;
            }

            if (var10 >= class357.field5100) {
               var10 = class357.field5100 - 1;
            }

            for(int var11 = var9; var11 <= var10; ++var11) {
               short var12 = var1.field7827[var6];
               int var13 = var12 >>> 8;
               int var14 = var5 * var6 + var13;
               int var15 = (var12 >>> 8) + var8;
               int var16 = (var12 & 255) + var15 - 1;
               if (var15 < 0) {
                  var14 -= var15;
                  var15 = 0;
               }

               if (var16 >= class479.field6989) {
                  var16 = class479.field6989 - 1;
               }

               for(int var17 = var15; var17 <= var16; ++var17) {
                  byte var18 = 1;
                  class144 var19 = class740.method5337(var3, var17, var11, field8572 != null ? field8572 : (field8572 = method4394(field8573[11])));
                  if (var19 != null && var19.field2355 != 0) {
                     if (var19.field2355 == 1) {
                        boolean var20 = var17 - 1 >= var15;
                        boolean var21 = var17 + 1 <= var16;
                        if (!var20 && var11 + 1 <= var10) {
                           short var22 = var1.field7827[var6 + 1];
                           int var23 = (var22 >>> 8) + var8;
                           int var24 = (var22 & 255) + var23;
                           var20 = var17 > var23 && var17 < var24;
                        }

                        if (!var21 && var11 - 1 >= var9) {
                           short var25 = var1.field7827[var6 - 1];
                           int var26 = (var25 >>> 8) + var8;
                           int var27 = (var25 & 255) + var26;
                           var21 = var17 > var26 && var17 < var27;
                        }

                        if (var20 && !var21) {
                           var18 = 4;
                        } else if (var21 && !var20) {
                           var18 = 2;
                        }
                     } else {
                        boolean var28 = var17 - 1 >= var15;
                        boolean var29 = var17 + 1 <= var16;
                        if (!var28 && var11 - 1 >= var9) {
                           short var30 = var1.field7827[var6 - 1];
                           int var31 = (var30 >>> 8) + var8;
                           int var32 = (var30 & 255) + var31;
                           var28 = var17 > var31 && var17 < var32;
                        }

                        if (!var29 && var11 + 1 <= var10) {
                           short var33 = var1.field7827[var6 + 1];
                           int var34 = (var33 >>> 8) + var8;
                           int var35 = (var33 & 255) + var34;
                           var29 = var17 > var34 && var17 < var35;
                        }

                        if (var28 && !var29) {
                           var18 = 3;
                        } else if (var29 && !var28) {
                           var18 = 5;
                        }
                     }
                  }

                  var7[var14++] = var18;
               }

               ++var6;
            }

            class764.field11079[var0] = true;
            class269.field3810[var3].method2283(var2, var7);
         }
      }

   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(IB)V",
      line = 439
   )
   public final void method54(int arg0, byte arg1) {
      try {
         ++field8568;
         super.field4913 = arg0;
         if (arg1 <= 99) {
            method4387(false, -77, -68);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8573[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "b",
      descriptor = "(Z)I",
      line = 453
   )
   public final int method4391(boolean arg0) {
      try {
         if (arg0) {
            method4388(-29, -98, -72, 87);
         }

         ++field8566;
         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8573[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(IZILhw;)Lir;",
      line = 465
   )
   public static final class28 method4392(int arg0, boolean arg1, int arg2, class141 arg3) {
      boolean var4 = client.field4564;

      try {
         ++field8559;
         class473 var5 = new class473(arg3.method1347((byte)122, arg0, arg2));
         class28 var6 = new class28(arg2, var5.method3566(-16496688), var5.method3566(-16496688), var5.method3567(31871), var5.method3567(31871), var5.method3564((byte)-85) == 1, var5.method3564((byte)-75), var5.method3564((byte)-57));
         int var7 = var5.method3564((byte)-55);
         if (!arg1) {
            field8571 = null;
         }

         int var8 = 0;
         class28 var10000;
         if (var4) {
            var10000 = var6;
         } else if (var8 >= var7) {
            var6.method203(-77);
            var10000 = var6;
            if (!var4) {
               return var6;
            }
         } else {
            var10000 = var6;
         }

         while(true) {
            var10000.field432.method2585(new class359(var5.method3564((byte)-58), var5.method3565(true), var5.method3565(true), var5.method3565(true), var5.method3565(true), var5.method3565(true), var5.method3565(arg1), var5.method3565(arg1), var5.method3565(true)), -116);
            ++var8;
            if (var8 >= var7) {
               var6.method203(-77);
               var10000 = var6;
               if (!var4) {
                  return var6;
               }
            } else {
               var10000 = var6;
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field8573[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8573[8] : field8573[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "b",
      descriptor = "(I)V",
      line = 494
   )
   public final void method51(int arg0) {
      try {
         if (arg0 != 0) {
            method4385(114, -33, 61, (byte)-75, -4, -87);
         }

         ++field8567;
         if (super.field4913 != 1 && ~super.field4913 != -1) {
            super.field4913 = this.method53(false);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8573[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(ZII)V",
      line = 508
   )
   public static final void method4393(boolean param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4395(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4396(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

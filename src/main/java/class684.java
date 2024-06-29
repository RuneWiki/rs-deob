import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class684 extends class264 {
   @OriginalMember(
      owner = "client!pb",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10075 = new String[]{method4992(method4991("S|\fpI")), method4992(method4991("X0\f\u001b\u001c")), method4992(method4991("S|\fsI")), method4992(method4991("MkNY")), method4992(method4991("S|\fwI")), method4992(method4991("S|\fvI")), method4992(method4991("S|\fqI"))};
   @OriginalMember(
      owner = "client!pb",
      name = "H",
      descriptor = "Ljava/util/Random;"
   )
   public static Random field10070 = new Random();
   @OriginalMember(
      owner = "client!pb",
      name = "F",
      descriptor = "Loba;"
   )
   public static class274 field10074 = new class274();
   @OriginalMember(
      owner = "client!pb",
      name = "K",
      descriptor = "I"
   )
   public static int field10068;
   @OriginalMember(
      owner = "client!pb",
      name = "I",
      descriptor = "I"
   )
   public static int field10069;
   @OriginalMember(
      owner = "client!pb",
      name = "J",
      descriptor = "I"
   )
   public static int field10071;
   @OriginalMember(
      owner = "client!pb",
      name = "G",
      descriptor = "I"
   )
   public static int field10072;
   @OriginalMember(
      owner = "client!pb",
      name = "L",
      descriptor = "I"
   )
   public static int field10073;

   @OriginalMember(
      owner = "client!pb",
      name = "d",
      descriptor = "(I)V",
      line = 3
   )
   public static void method4987(int arg0) {
      try {
         if (arg0 != -1) {
            method4989((String)null, 103, 54);
         }

         field10074 = null;
         field10070 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10075[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(IIILuo;IIIIIII)Z",
      line = 15
   )
   public static final boolean method4988(int arg0, int arg1, int arg2, class603 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      boolean var11 = client.field4360;

      try {
         ++field10069;
         byte var14 = 64;
         if (arg10 >= -45) {
            return true;
         } else {
            byte var15 = 64;
            int var16 = -var14 + arg8;
            int var17 = -var15 + arg9;
            class711.field10378[var14][var15] = 99;
            class95.field1228[var14][var15] = 0;
            byte var18 = 0;
            class280.field3894[var18] = arg8;
            int var19 = 0;
            byte var10001 = var18;
            int var28 = var18 + 1;
            class533.field7598[var10001] = arg9;
            int[][] var20 = arg3.field8870;
            if (!var11 && var28 == var19) {
               class39.field559 = arg8;
               class111.field1401 = arg9;
               return false;
            } else {
               int var12;
               int var13;
               label218:
               do {
                  var12 = class280.field3894[var19];
                  var13 = class533.field7598[var19];
                  int var21 = -arg3.field8860 + var12;
                  var19 = var19 + 1 & 4095;
                  int var22 = -var17 + var13;
                  int var23 = -var16 + var12;
                  int var24 = -arg3.field8871 + var13;
                  int var25 = arg6;
                  int var10000 = ~arg6;
                  var10001 = 3;

                  do {
                     if (var10000 != var10001) {
                        if (var25 != -3) {
                           if (~var25 != 1) {
                              if (~var25 != 0) {
                                 label205: {
                                    if (~var25 != -1 && var25 != 1 && ~var25 != -3 && var25 != 3) {
                                       if (var25 != 9) {
                                          if (arg3.method4390(1, arg6, var13, arg0, arg1, arg2, var12, (byte)-23)) {
                                             class39.field559 = var12;
                                             class111.field1401 = var13;
                                             return true;
                                          }
                                          break label205;
                                       }

                                       if (var11) {
                                          if (~arg1 == ~var12 && arg0 == var13) {
                                             class39.field559 = var12;
                                             class111.field1401 = var13;
                                             return true;
                                          }
                                          break label205;
                                       }
                                    }

                                    if (arg3.method4398(var12, var13, false, arg6, arg0, arg1, arg2, 1)) {
                                       class39.field559 = var12;
                                       class111.field1401 = var13;
                                       return true;
                                    }
                                 }
                              } else if (arg3.method4392(6, arg7, arg4, arg1, arg0, var12, var13, arg5, 1)) {
                                 class111.field1401 = var13;
                                 class39.field559 = var12;
                                 return true;
                              }
                           } else if (arg3.method4388(1, arg4, var13, arg0, var12, arg7, 1, arg1, arg5, (byte)-96)) {
                              class39.field559 = var12;
                              class111.field1401 = var13;
                              return true;
                           }
                        } else if (class111.method905(arg0, 1, arg4, var12, var13, arg5, -79, 1, arg1)) {
                           class39.field559 = var12;
                           class111.field1401 = var13;
                           return true;
                        }
                     } else if (~arg1 == ~var12 && arg0 == var13) {
                        class39.field559 = var12;
                        class111.field1401 = var13;
                        return true;
                     }

                     var25 = class95.field1228[var23][var22] + 1;
                     if (var23 > 0 && class711.field10378[var23 + -1][var22] == 0 && ~(var20[var21 + -1][var24] & 1109655552) == -1) {
                        class280.field3894[var28] = var12 + -1;
                        class533.field7598[var28] = var13;
                        var28 = var28 - -1 & 4095;
                        class711.field10378[var23 + -1][var22] = 2;
                        class95.field1228[var23 + -1][var22] = var25;
                     }

                     if (~var23 > -128 && ~class711.field10378[var23 - -1][var22] == -1 && ~(1612972032 & var20[var21 - -1][var24]) == -1) {
                        class280.field3894[var28] = var12 + 1;
                        class533.field7598[var28] = var13;
                        class711.field10378[var23 + 1][var22] = 8;
                        var28 = var28 + 1 & 4095;
                        class95.field1228[var23 - -1][var22] = var25;
                     }

                     if (~var22 < -1 && ~class711.field10378[var23][var22 - 1] == -1 && (1084489728 & var20[var21][var24 - 1]) == 0) {
                        class280.field3894[var28] = var12;
                        class533.field7598[var28] = var13 + -1;
                        class711.field10378[var23][var22 + -1] = 1;
                        var28 = var28 + 1 & 4095;
                        class95.field1228[var23][var22 + -1] = var25;
                     }

                     if (var22 < 127 && ~class711.field10378[var23][var22 + 1] == -1 && (1210318848 & var20[var21][var24 - -1]) == 0) {
                        class280.field3894[var28] = var12;
                        class533.field7598[var28] = var13 + 1;
                        var28 = var28 - -1 & 4095;
                        class711.field10378[var23][var22 + 1] = 4;
                        class95.field1228[var23][var22 + 1] = var25;
                     }

                     if (var23 > 0 && var22 > 0 && ~class711.field10378[var23 + -1][var22 - 1] == -1 && ~(1134821376 & var20[var21 + -1][var24 - 1]) == -1 && ~(var20[var21 + -1][var24] & 1109655552) == -1 && ~(1084489728 & var20[var21][var24 - 1]) == -1) {
                        class280.field3894[var28] = var12 + -1;
                        class533.field7598[var28] = var13 + -1;
                        class711.field10378[var23 + -1][var22 + -1] = 3;
                        var28 = 4095 & var28 - -1;
                        class95.field1228[var23 - 1][var22 + -1] = var25;
                     }

                     if (var23 < 127 && ~var22 < -1 && ~class711.field10378[var23 + 1][var22 + -1] == -1 && (var20[var21 + 1][var24 + -1] & 1625554944) == 0 && (1612972032 & var20[var21 + 1][var24]) == 0 && (1084489728 & var20[var21][var24 + -1]) == 0) {
                        class280.field3894[var28] = var12 + 1;
                        class533.field7598[var28] = var13 + -1;
                        var28 = var28 + 1 & 4095;
                        class711.field10378[var23 - -1][var22 + -1] = 9;
                        class95.field1228[var23 + 1][var22 + -1] = var25;
                     }

                     if (~var23 < -1 && var22 < 127 && ~class711.field10378[var23 + -1][var22 + 1] == -1 && ~(var20[var21 + -1][var24 + 1] & 1310982144) == -1 && ~(var20[var21 - 1][var24] & 1109655552) == -1 && (1210318848 & var20[var21][var24 + 1]) == 0) {
                        class280.field3894[var28] = var12 + -1;
                        class533.field7598[var28] = var13 + 1;
                        class711.field10378[var23 + -1][var22 + 1] = 6;
                        var28 = 4095 & var28 + 1;
                        class95.field1228[var23 - 1][var22 + 1] = var25;
                     }

                     if (var23 >= 127) {
                        continue label218;
                     }

                     var10000 = var22;
                     var10001 = 127;
                  } while(var11);

                  if (var22 < 127 && ~class711.field10378[var23 + 1][var22 - -1] == -1 && (var20[var21 + 1][var24 - -1] & 2015625216) == 0 && (1612972032 & var20[var21 + 1][var24]) == 0 && (var20[var21][var24 - -1] & 1210318848) == 0) {
                     class280.field3894[var28] = var12 + 1;
                     class533.field7598[var28] = var13 - -1;
                     var28 = 4095 & var28 + 1;
                     class711.field10378[var23 + 1][var22 + 1] = 12;
                     class95.field1228[var23 + 1][var22 + 1] = var25;
                  }
               } while(var28 != var19);

               class39.field559 = var12;
               class111.field1401 = var13;
               return false;
            }
         }
      } catch (RuntimeException var27) {
         throw class237.method1823(var27, field10075[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10075[1] : field10075[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(Ljava/lang/String;II)V",
      line = 262
   )
   public static final void method4989(String arg0, int arg1, int arg2) {
      try {
         ++field10072;
         if (arg2 != 4095) {
            field10073 = 39;
         }

         class3.method11("", arg1, "", arg0, 0, "", (byte)-122);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10075[2] + (arg0 != null ? field10075[1] : field10075[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "<init>",
      descriptor = "()V",
      line = 273
   )
   public class684() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(II)[I",
      line = 279
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field10071;
         int[] var4 = super.field3641.method3079(-14361, arg0);
         int var5 = 54 % ((arg1 - 24) / 44);
         if (super.field3641.field5922) {
            int var6 = class666.field9668[arg0];
            int var7 = 0;
            if (var3 || ~var7 > ~class430.field6152) {
               do {
                  var4[var7] = this.method4990(var6, -96, class258.field3496[var7]) % 4096;
                  ++var7;
               } while(~var7 > ~class430.field6152);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field10075[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "b",
      descriptor = "(III)I",
      line = 311
   )
   private final int method4990(int arg0, int arg1, int arg2) {
      try {
         if (arg1 > -81) {
            this.method6(-71, -102);
         }

         ++field10068;
         int var4 = arg2 - -(arg0 * 57);
         int var5 = var4 << 1 ^ var4;
         return 4096 - ((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field10075[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4991(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4992(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

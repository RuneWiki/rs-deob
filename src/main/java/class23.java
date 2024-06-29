import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class23 extends class297 {
   @OriginalMember(
      owner = "client!qb",
      name = "x",
      descriptor = "Lpe;"
   )
   public class660 field290;
   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field294 = new String[]{method173(method172("RK6;%M@l9d")), method173(method172("M\\tk")), method173(method172("X\u00076)1")), method173(method172("RK6Dd")), method173(method172("RK6Fd")), method173(method172("RK6Ed"))};
   @OriginalMember(
      owner = "client!qb",
      name = "u",
      descriptor = "I"
   )
   public static int field289;
   @OriginalMember(
      owner = "client!qb",
      name = "w",
      descriptor = "I"
   )
   public static int field291;
   @OriginalMember(
      owner = "client!qb",
      name = "v",
      descriptor = "I"
   )
   public static int field292;
   @OriginalMember(
      owner = "client!qb",
      name = "y",
      descriptor = "I"
   )
   public static int field293;

   @OriginalMember(
      owner = "client!qb",
      name = "<init>",
      descriptor = "(Lpe;)V",
      line = 5
   )
   public class23(class660 arg0) {
      try {
         this.field290 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field294[0] + (arg0 != null ? field294[2] : field294[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(Lha;Z)V",
      line = 13
   )
   public static final void method169(class610 arg0, boolean arg1) {
      boolean var2 = client.field1786;

      try {
         ++field291;
         int var3 = 0;
         int var4 = 0;
         if (class281.field4472) {
            var3 = class600.method4443(0);
            var4 = class218.method1890(0);
         }

         int var5 = class108.field1490 + var3;
         int var6 = class190.field2947 + var4;
         int var7 = class344.field5235;
         int var8 = class572.field8475 + -3;
         byte var9 = 20;
         class91.method869(class572.field8475, arg0, class344.field5235, var9, class190.field2947 + var4, class108.field1490 - -var3, (byte)-100, class499.field7612.method3875(class493.field7455, 97));
         int var10 = var3 + class690.field10254.method2571(80);
         if (!arg1) {
            int var11;
            int var10000;
            label240: {
               var11 = class690.field10254.method2578(true) - -var4;
               if (!class510.field7804) {
                  int var12 = 0;
                  class185 var13 = (class185)class326.field4958.method4972((byte)-84);
                  if (var2 || var13 != null) {
                     do {
                        int var14 = (class558.field8307 - (var12 + 1)) * 16 + (var6 - -var9 - -13);
                        if (var10 > class108.field1490 + var3 && ~(class108.field1490 + var3 + class344.field5235) < ~var10 && ~var11 < ~(var14 - 13) && var11 < var14 + 4 && var13.field2901) {
                           arg0.method631(class108.field1490 + var3, var14 - 12, class344.field5235, 16, class407.field6336 | -class555.field8291 + 255 << 24, 1);
                        }

                        ++var12;
                        var13 = (class185)class326.field4958.method4975((byte)124);
                     } while(var13 != null);
                  }

                  if (!var2) {
                     break label240;
                  }
               }

               int var15 = 0;
               class525 var16 = (class525)class681.field10158.method3688(true);
               if (var2 || var16 != null) {
                  do {
                     int var17 = var6 + var9 - -13 - -(var15 * 16);
                     if (~(class108.field1490 + var3) > ~var10 && ~var10 > ~(class108.field1490 + var3 + class344.field5235) && var17 + -13 < var11 && ~var11 > ~(var17 + 4) && (~var16.field8004 < -2 || ((class185)var16.field8005.field7220.field4682).field2901)) {
                        arg0.method631(class108.field1490 - -var3, var17 + -12, class344.field5235, 16, class407.field6336 | -class555.field8291 + 255 << 24, 1);
                     }

                     ++var15;
                     var16 = (class525)class681.field10158.method3691(20);
                  } while(var16 != null);
               }

               if (class525.field7997 != null) {
                  label174: {
                     int var18 = 0;
                     class91.method869(class430.field6640, arg0, class785.field11521, var9, class255.field3853, class532.field8084, (byte)-79, class525.field7997.field8002);
                     class185 var19 = (class185)class525.field7997.field8005.method3688(true);
                     if (var2) {
                        var10000 = var18 * 16 + class255.field3853 + var9 + 13;
                     } else if (var19 == null) {
                        var10000 = class532.field8084;
                        if (!var2) {
                           break label174;
                        }
                     } else {
                        var10000 = var18 * 16 + class255.field3853 + var9 + 13;
                     }

                     while(true) {
                        int var20 = var10000;
                        if (~var10 < ~class532.field8084 && var10 < class785.field11521 + class532.field8084 && ~var11 < ~(var20 + -13) && ~(var20 + 4) < ~var11 && var19.field2901) {
                           arg0.method631(class532.field8084, var20 + -12, class785.field11521, 16, -class555.field8291 + 255 << 24 | class407.field6336, 1);
                        }

                        ++var18;
                        var19 = (class185)class525.field7997.field8005.method3691(20);
                        if (var19 == null) {
                           var10000 = class532.field8084;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var10000 = var18 * 16 + class255.field3853 + var9 + 13;
                        }
                     }
                  }

                  class671.method4941(var10000, arg0, class430.field6640, 0, var9, class255.field3853, class785.field11521);
               }
            }

            label226: {
               class671.method4941(class108.field1490 + var3, arg0, class572.field8475, 0, var9, class190.field2947 + var4, class344.field5235);
               if (class510.field7804) {
                  int var21 = 0;
                  class525 var22 = (class525)class681.field10158.method3688(!arg1);
                  if (var2 || var22 != null) {
                     do {
                        label149: {
                           int var23 = var21 * 16 + class190.field2947 - (-var4 - var9 + -13);
                           if (~var22.field8004 != -2) {
                              class265.method2288(class18.field237 | -16777216, var11, class190.field2947 + var4, -122, var23, class344.field5235, class728.field10865 | -16777216, arg0, var10, class108.field1490 - -var3, var22, class572.field8475);
                              if (!var2) {
                                 break label149;
                              }
                           }

                           class473.method3681(var10, -16777216 | class18.field237, class572.field8475, -16777216 | class728.field10865, 71, arg0, class190.field2947 + var4, var23, class344.field5235, (class185)var22.field8005.field7220.field4682, class108.field1490 + var3, var11);
                        }

                        ++var21;
                        var22 = (class525)class681.field10158.method3691(20);
                     } while(var22 != null);
                  }

                  if (class525.field7997 == null) {
                     break label226;
                  }

                  int var10001;
                  int var10002;
                  label136: {
                     int var24 = 0;
                     class185 var25 = (class185)class525.field7997.field8005.method3688(true);
                     if (var2) {
                        var10000 = var24 * 16;
                        var10001 = class255.field3853 + 13;
                        var10002 = -var9;
                     } else if (var25 == null) {
                        var10000 = class255.field3853;
                        var10001 = class532.field8084;
                        var10002 = 0;
                        if (!var2) {
                           break label136;
                        }
                     } else {
                        var10000 = var24 * 16;
                        var10001 = class255.field3853 + 13;
                        var10002 = -var9;
                     }

                     while(true) {
                        int var26 = var10000 + (var10001 - var10002);
                        class473.method3681(var10, -16777216 | class18.field237, class430.field6640, class728.field10865 | -16777216, 67, arg0, class255.field3853, var26, class785.field11521, var25, class532.field8084, var11);
                        ++var24;
                        var25 = (class185)class525.field7997.field8005.method3691(20);
                        if (var25 == null) {
                           var10000 = class255.field3853;
                           var10001 = class532.field8084;
                           var10002 = 0;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var10000 = var24 * 16;
                           var10001 = class255.field3853 + 13;
                           var10002 = -var9;
                        }
                     }
                  }

                  class547.method4161(var10000, var10001, var10002, class785.field11521, class430.field6640);
                  if (!var2) {
                     break label226;
                  }
               }

               int var27 = 0;
               class185 var28 = (class185)class326.field4958.method4972((byte)-84);
               if (var2 || var28 != null) {
                  do {
                     int var29 = (class558.field8307 + -1 + -var27) * 16 + 13 + var6 + var9;
                     ++var27;
                     class473.method3681(var10, -16777216 | class18.field237, var8, -16777216 | class728.field10865, 95, arg0, var6, var29, var7, var28, var5, var11);
                     var28 = (class185)class326.field4958.method4975((byte)102);
                  } while(var28 != null);
               }
            }

            class547.method4161(class190.field2947 + var4, class108.field1490 + var3, 0, class344.field5235, class572.field8475);
         }
      } catch (RuntimeException var31) {
         throw class482.method3757(var31, field294[5] + (arg0 != null ? field294[2] : field294[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(IILjava/lang/String;)V",
      line = 181
   )
   public static final void method170(int arg0, int arg1, String arg2) {
      try {
         class242.method2064("", arg1, "", arg2, -1, "", arg0);
         ++field289;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field294[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field294[2] : field294[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(IB)I",
      line = 190
   )
   public static final int method171(int arg0, byte arg1) {
      try {
         if (arg1 != 90) {
            field292 = -49;
         }

         ++field293;
         return 255 & arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field294[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method172(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method173(char[] arg0) {
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
            var10005 = 41;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

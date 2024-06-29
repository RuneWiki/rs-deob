import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class391 {
   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5463 = new String[]{method2977(method2976("H2\r;}\u0002")), method2977(method2976("D!\u0000y")), method2977(method2976("QzB;A")), method2977(method2976("H2\r;\u007f\u0002")), method2977(method2976("H2\r;y\u0002")), method2977(method2976("H2\r;x\u0002")), method2977(method2976("H2\r;~\u0002"))};
   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "I"
   )
   public static int field5459 = 0;
   @OriginalMember(
      owner = "client!bfa",
      name = "j",
      descriptor = "C"
   )
   public char field5461;
   @OriginalMember(
      owner = "client!bfa",
      name = "b",
      descriptor = "I"
   )
   public int field5453;
   @OriginalMember(
      owner = "client!bfa",
      name = "d",
      descriptor = "I"
   )
   public static int field5454;
   @OriginalMember(
      owner = "client!bfa",
      name = "h",
      descriptor = "I"
   )
   public int field5455;
   @OriginalMember(
      owner = "client!bfa",
      name = "g",
      descriptor = "I"
   )
   public static int field5456;
   @OriginalMember(
      owner = "client!bfa",
      name = "e",
      descriptor = "I"
   )
   public static int field5457;
   @OriginalMember(
      owner = "client!bfa",
      name = "i",
      descriptor = "I"
   )
   public static int field5458;
   @OriginalMember(
      owner = "client!bfa",
      name = "f",
      descriptor = "I"
   )
   public int field5460;
   @OriginalMember(
      owner = "client!bfa",
      name = "c",
      descriptor = "I"
   )
   public static int field5462;

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method2971(class594 arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         while(true) {
            int var4 = arg0.method4288((byte)71);
            if (var4 != 0) {
               this.method2975(arg0, -32250, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field5457;
            break;
         }

         if (arg1 >= -31) {
            this.field5455 = -65;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5463[3] + (arg0 != null ? field5463[2] : field5463[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(ZLha;)V"
   )
   public static final void method2972(boolean arg0, class65 arg1) {
      boolean var2 = client.field4273;

      try {
         ++field5454;
         int var3 = 0;
         int var4 = 0;
         if (class775.field11283) {
            var3 = class101.method916(-79);
            var4 = class291.method2190(-91);
         }

         int var5;
         int var6;
         int var7;
         int var8;
         byte var9;
         int var10;
         int var11;
         int var10000;
         label229: {
            var5 = class441.field6118 + var3;
            var6 = class604.field8417 + var4;
            var7 = class67.field776;
            var8 = class378.field5305 - 3;
            var9 = 20;
            class3.method20(var9, class441.field6118 - -var3, class604.field8417 + var4, class378.field5305, (byte)-51, class67.field776, arg1, class551.field7545.method3980(class494.field6787, arg0));
            var10 = class242.field3026.method1581(69) + var3;
            var11 = var4 + class242.field3026.method1572(false);
            if (!class107.field1366) {
               int var12 = 0;
               class241 var13 = (class241)class280.field3738.method3855(115);
               if (var2 || var13 != null) {
                  do {
                     int var14 = (-var12 + class234.field2899 + -1) * 16 + (var6 + 13 - -var9);
                     if (var10 > class441.field6118 + var3 && ~var10 > ~(class67.field776 + class441.field6118 + var3) && var11 > var14 + -13 && ~var11 > ~(var14 - -4) && var13.field3005) {
                        arg1.method508(class441.field6118 + var3, var14 + -12, class67.field776, 16, class333.field4780 | -class623.field8701 + 255 << 24, 1);
                     }

                     ++var12;
                     var13 = (class241)class280.field3738.method3866((byte)116);
                  } while(var13 != null);
               }

               if (!var2) {
                  break label229;
               }
            }

            int var15 = 0;
            class85 var16 = (class85)class193.field2360.method3964((byte)-126);
            if (var2 || var16 != null) {
               do {
                  int var17 = var6 - (-var9 + -13 + -(var15 * 16));
                  if (~var10 < ~(class441.field6118 + var3) && ~(class441.field6118 - -class67.field776 + var3) < ~var10 && ~var11 < ~(var17 + -13) && ~var11 > ~(var17 + 4) && (~var16.field1099 < -2 || ((class241)var16.field1105.field7496.field7453).field3005)) {
                     arg1.method508(class441.field6118 - -var3, var17 + -12, class67.field776, 16, class333.field4780 | 255 - class623.field8701 << 24, 1);
                  }

                  ++var15;
                  var16 = (class85)class193.field2360.method3965(arg0);
               } while(var16 != null);
            }

            if (class423.field5947 != null) {
               label169: {
                  int var18 = 0;
                  class3.method20(var9, class46.field535, class594.field8244, class746.field10850, (byte)-51, class275.field3671, arg1, class423.field5947.field1101);
                  class241 var19 = (class241)class423.field5947.field1105.method3964((byte)-126);
                  if (var2) {
                     var10000 = var18 * 16 + 13 + class594.field8244 + var9;
                  } else if (var19 == null) {
                     var10000 = class746.field10850;
                     if (!var2) {
                        break label169;
                     }
                  } else {
                     var10000 = var18 * 16 + 13 + class594.field8244 + var9;
                  }

                  while(true) {
                     int var20 = var10000;
                     ++var18;
                     if (class46.field535 < var10 && ~(class46.field535 - -class275.field3671) < ~var10 && var20 + -13 < var11 && var20 + 4 > var11 && var19.field3005) {
                        arg1.method508(class46.field535, var20 + -12, class275.field3671, 16, class333.field4780 | 255 - class623.field8701 << 24, 1);
                     }

                     var19 = (class241)class423.field5947.field1105.method3965(true);
                     if (var19 == null) {
                        var10000 = class746.field10850;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = var18 * 16 + 13 + class594.field8244 + var9;
                     }
                  }
               }

               class600.method4378(var10000, arg1, -21247, class594.field8244, var9, class46.field535, class275.field3671);
            }
         }

         label231: {
            class600.method4378(class378.field5305, arg1, -21247, class604.field8417 + var4, var9, class441.field6118 + var3, class67.field776);
            if (!class107.field1366) {
               int var21 = 0;
               class241 var22 = (class241)class280.field3738.method3855(113);
               if (var2 || var22 != null) {
                  do {
                     int var23 = (class234.field2899 + -1 - var21) * 16 + var6 - (-var9 + -13);
                     ++var21;
                     class656.method4742(class439.field6094 | -16777216, arg1, var6, var11, var7, var8, class403.field5648 | -16777216, var23, var22, var5, var10, 0);
                     var22 = (class241)class280.field3738.method3866((byte)111);
                  } while(var22 != null);
               }

               if (!var2) {
                  break label231;
               }
            }

            int var24 = 0;
            class85 var25 = (class85)class193.field2360.method3964((byte)-128);
            if (var2 || var25 != null) {
               do {
                  label133: {
                     int var26 = class604.field8417 - -var9 + var24 * 16 + var4 + 13;
                     ++var24;
                     if (var25.field1099 != 1) {
                        class133.method1121(class403.field5648 | -16777216, var26, class67.field776, arg1, (byte)-74, class439.field6094 | -16777216, class378.field5305, var25, var10, class604.field8417 + var4, var11, class441.field6118 - -var3);
                        if (!var2) {
                           break label133;
                        }
                     }

                     class656.method4742(-16777216 | class439.field6094, arg1, class604.field8417 + var4, var11, class67.field776, class378.field5305, class403.field5648 | -16777216, var26, (class241)var25.field1105.field7496.field7453, class441.field6118 + var3, var10, 0);
                  }

                  var25 = (class85)class193.field2360.method3965(arg0);
               } while(var25 != null);
            }

            if (class423.field5947 != null) {
               int var10001;
               int var10002;
               int var10003;
               label120: {
                  int var27 = 0;
                  class241 var28 = (class241)class423.field5947.field1105.method3964((byte)110);
                  if (var2) {
                     var10000 = class594.field8244 + 13;
                     var10001 = var9;
                     var10002 = 16;
                     var10003 = var27;
                  } else if (var28 == null) {
                     var10000 = -2;
                     var10001 = class46.field535;
                     var10002 = class594.field8244;
                     var10003 = class746.field10850;
                     if (!var2) {
                        break label120;
                     }
                  } else {
                     var10000 = class594.field8244 + 13;
                     var10001 = var9;
                     var10002 = 16;
                     var10003 = var27;
                  }

                  while(true) {
                     int var29 = var10000 + var10001 + var10002 * var10003;
                     ++var27;
                     class656.method4742(class439.field6094 | -16777216, arg1, class594.field8244, var11, class275.field3671, class746.field10850, -16777216 | class403.field5648, var29, var28, class46.field535, var10, 0);
                     var28 = (class241)class423.field5947.field1105.method3965(true);
                     if (var28 == null) {
                        var10000 = -2;
                        var10001 = class46.field535;
                        var10002 = class594.field8244;
                        var10003 = class746.field10850;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = class594.field8244 + 13;
                        var10001 = var9;
                        var10002 = 16;
                        var10003 = var27;
                     }
                  }
               }

               class585.method4201((byte)var10000, var10001, var10002, var10003, class275.field3671);
            }
         }

         class585.method4201((byte)-2, class441.field6118 + var3, class604.field8417 + var4, class378.field5305, class67.field776);
      } catch (RuntimeException var31) {
         throw class534.method3846(var31, field5463[0] + arg0 + ',' + (arg1 != null ? field5463[2] : field5463[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(Laha;Z)I"
   )
   public static final int method2973(class404 arg0, boolean arg1) {
      boolean var2 = client.field4273;

      try {
         if (!arg1) {
            field5459 = 37;
         }

         ++field5462;
         int var3 = arg0.field5688;
         class120 var4 = arg0.method4086((byte)-127);
         if (~arg0.field7822 == 0 || arg0.field7814) {
            var3 = arg0.field5657;
            if (!var2) {
               return var3;
            }
         }

         if (~arg0.field7822 == ~var4.field1457 || arg0.field7822 == var4.field1485 || arg0.field7822 == var4.field1505 || arg0.field7822 == var4.field1483) {
            var3 = arg0.field5675;
            if (!var2) {
               return var3;
            }
         }

         if (~arg0.field7822 == ~var4.field1492 || ~arg0.field7822 == ~var4.field1477 || ~arg0.field7822 == ~var4.field1467 || arg0.field7822 == var4.field1496) {
            var3 = arg0.field5676;
         }

         return var3;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5463[4] + (arg0 != null ? field5463[2] : field5463[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(ZIIZ)Lqh;"
   )
   public static final class74 method2974(boolean arg0, int arg1, int arg2, boolean arg3) {
      try {
         if (!arg0) {
            return null;
         } else {
            ++field5456;
            class100 var4 = null;
            if (class200.field2425 != null) {
               var4 = new class100(arg1, class200.field2425, class434.field6040[arg1], 1000000);
            }

            class721.field10558[arg1] = class398.field5595.method2015(var4, class504.field6908, arg1, (byte)110);
            class721.field10558[arg1].method1596(457322631);
            return new class74(class721.field10558[arg1], arg3, arg2);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5463[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   private final void method2975(class594 arg0, int arg1, int arg2) {
      try {
         ++field5458;
         if (arg1 != -32250) {
            this.field5461 = (char)65533;
         }

         if (~arg2 == -2) {
            this.field5461 = class90.method855(arg0.method4340(409855200), (byte)87);
         } else if (arg2 == 3) {
            this.field5455 = arg0.method4280(-19104);
            this.field5460 = arg0.method4288((byte)71);
            this.field5453 = arg0.method4288((byte)89);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5463[6] + (arg0 != null ? field5463[2] : field5463[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2976(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2977(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

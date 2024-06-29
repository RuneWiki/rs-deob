import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class310 {
   @OriginalMember(
      owner = "client!tr",
      name = "d",
      descriptor = "I"
   )
   public int field4260;
   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4261 = new String[]{method2298(method2297("\"x\u0014\u0003[\u0005~H\u001eZ1\"")), method2298(method2297("\"x\u00146\u001c")), method2298(method2297("-$\u0014YI")), method2298(method2297("8\u007fV\u001b")), method2298(method2297("\tyN\u0016@?i_\u001bQ;oT\u0003G")), method2298(method2297("\"x\u00145\u001c")), method2298(method2297("\"x\u0014K]8cNI\u001c"))};
   @OriginalMember(
      owner = "client!tr",
      name = "c",
      descriptor = "I"
   )
   public static int field4255;
   @OriginalMember(
      owner = "client!tr",
      name = "b",
      descriptor = "I"
   )
   public static int field4257;
   @OriginalMember(
      owner = "client!tr",
      name = "f",
      descriptor = "I"
   )
   public static int field4259;
   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "J"
   )
   public static long field4256;
   @OriginalMember(
      owner = "client!tr",
      name = "e",
      descriptor = "Llc;"
   )
   public static class676 field4258;

   @OriginalMember(
      owner = "client!tr",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field4255;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4261[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class310(int arg0, int arg1) {
      try {
         this.field4260 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4261[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(Ld;BLha;)V"
   )
   public static final void method2295(class162 arg0, byte arg1, class66 arg2) {
      boolean var3 = client.field4360;

      try {
         ++field4259;
         if (class650.field9486 != null) {
            if (class116.field1452 < 10) {
               if (!class650.field9485.method2033(false, class650.field9486.field11143)) {
                  class116.field1452 = class77.field960.method2042((byte)-63, class650.field9486.field11143) / 10;
                  return;
               }

               class503.method3650(arg1 + 117);
               class116.field1452 = 10;
            }

            if (class116.field1452 == 10) {
               class650.field9513 = class650.field9486.field11136 >> 6 << 6;
               class650.field9523 = class650.field9486.field11142 >> 6 << 6;
               class650.field9503 = (class650.field9486.field11147 >> 6 << 6) - -64 + -class650.field9523;
               class650.field9524 = (class650.field9486.field11150 >> 6 << 6) - class650.field9513 + 64;
               int[] var4 = new int[3];
               int var5 = -1;
               int var6 = -1;
               if (class650.field9486.method5460((class564.field8045.field10693 >> 9) + class533.field7595, class672.field9740 - -(class564.field8045.field10694 >> 9), 3875, var4, class564.field8045.field10701)) {
                  var6 = var4[2] + -class650.field9523;
                  var5 = var4[1] - class650.field9513;
               }

               label214: {
                  if (!class303.field4129 && var5 >= 0 && ~class650.field9524 < ~var5 && var6 >= 0 && ~class650.field9503 < ~var6) {
                     int var7 = var6 + ((int)(Math.random() * 10.0D) - 5);
                     int var8 = var5 + ((int)(10.0D * Math.random()) - 5);
                     class220.field3138 = var8;
                     class224.field3191 = var7;
                     if (!var3) {
                        break label214;
                     }
                  }

                  if (class709.field10353 == -1 || class85.field1115 == -1) {
                     class650.field9486.method5462(var4, false, class650.field9486.field11138 >> 14 & 16383, class650.field9486.field11138 & 16383);
                     class224.field3191 = var4[2] + -class650.field9523;
                     class220.field3138 = var4[1] + -class650.field9513;
                     if (!var3) {
                        break label214;
                     }
                  }

                  class650.field9486.method5462(var4, false, class709.field10353, class85.field1115);
                  class85.field1115 = -1;
                  class709.field10353 = -1;
                  if (var4 != null) {
                     class224.field3191 = var4[2] + -class650.field9523;
                     class220.field3138 = var4[1] + -class650.field9513;
                  }

                  class303.field4129 = false;
               }

               label194: {
                  if (~class650.field9486.field11131 == -38) {
                     class650.field9501 = 3.0F;
                     class650.field9497 = 3.0F;
                     if (!var3) {
                        break label194;
                     }
                  }

                  if (class650.field9486.field11131 != 50) {
                     if (class650.field9486.field11131 == 75) {
                        class650.field9501 = 6.0F;
                        class650.field9497 = 6.0F;
                        if (!var3) {
                           break label194;
                        }
                     }

                     if (class650.field9486.field11131 != 100) {
                        if (~class650.field9486.field11131 != -201) {
                           class650.field9501 = 8.0F;
                           class650.field9497 = 8.0F;
                           if (!var3) {
                              break label194;
                           }
                        }

                        class650.field9501 = 16.0F;
                        class650.field9497 = 16.0F;
                        if (!var3) {
                           break label194;
                        }
                     }

                     class650.field9501 = 8.0F;
                     class650.field9497 = 8.0F;
                     if (!var3) {
                        break label194;
                     }
                  }

                  class650.field9501 = 4.0F;
                  class650.field9497 = 4.0F;
               }

               class650.field9495 = (int)class650.field9501 >> 1;
               class650.field9496 = class367.method2733(30565, class650.field9495);
               class707.method5142(arg1 ^ -106);
               class650.method4751();
               class792.field11613 = new class387();
               class650.field9502 += (int)(5.0D * Math.random()) + -2;
               if (~class650.field9502 > 7) {
                  class650.field9502 = -8;
               }

               class650.field9500 += -2 + (int)(5.0D * Math.random());
               if (~class650.field9502 < -9) {
                  class650.field9502 = 8;
               }

               if (~class650.field9500 > 15) {
                  class650.field9500 = -16;
               }

               if (~class650.field9500 < -17) {
                  class650.field9500 = 16;
               }

               class650.method4752(arg0, class650.field9502 >> 2 << 10, class650.field9500 >> 1);
               class650.field9488.method5668(arg1 ^ -13028, 1024, 256);
               class650.field9490.method4592(256, 256, 100);
               class650.field9487.method3982(22, 4096);
               class631.field9253.method4277(256, (byte)-34);
               class116.field1452 = 20;
            } else if (class116.field1452 == 20) {
               class489.method3557(true, arg1 + 55);
               class650.method4744(arg2, class650.field9502, class650.field9500);
               class116.field1452 = 60;
               class489.method3557(true, -51);
               class134.method1060((byte)121);
            } else if (class116.field1452 != 60) {
               if (~class116.field1452 == -71) {
                  class278.field3783 = new class476(arg2, 11, true, class557.field7990);
                  class116.field1452 = 73;
                  class489.method3557(true, -51);
                  class134.method1060((byte)114);
               } else if (arg1 == -106) {
                  if (class116.field1452 == 73) {
                     class744.field10853 = new class476(arg2, 12, true, class557.field7990);
                     class116.field1452 = 76;
                     class489.method3557(true, -51);
                     class134.method1060((byte)108);
                  } else if (~class116.field1452 == -77) {
                     class12.field132 = new class476(arg2, 14, true, class557.field7990);
                     class116.field1452 = 79;
                     class489.method3557(true, arg1 + 55);
                     class134.method1060((byte)104);
                  } else if (class116.field1452 == 79) {
                     class271.field3744 = new class476(arg2, 17, true, class557.field7990);
                     class116.field1452 = 82;
                     class489.method3557(true, -51);
                     class134.method1060((byte)103);
                  } else if (~class116.field1452 == -83) {
                     class25.field373 = new class476(arg2, 19, true, class557.field7990);
                     class116.field1452 = 85;
                     class489.method3557(true, -51);
                     class134.method1060((byte)101);
                  } else if (~class116.field1452 == -86) {
                     class286.field3961 = new class476(arg2, 22, true, class557.field7990);
                     class116.field1452 = 88;
                     class489.method3557(true, -51);
                     class134.method1060((byte)117);
                  } else if (~class116.field1452 == -89) {
                     class144.field1839 = new class476(arg2, 26, true, class557.field7990);
                     class116.field1452 = 91;
                     class489.method3557(true, -51);
                     class134.method1060((byte)113);
                  } else {
                     class136.field1734 = new class476(arg2, 30, true, class557.field7990);
                     class116.field1452 = 100;
                     class489.method3557(true, -51);
                     class134.method1060((byte)126);
                     System.gc();
                  }
               }
            } else {
               label181: {
                  if (class650.field9485.method2050(class650.field9486.field11143 + field4261[4], 111)) {
                     if (!class650.field9485.method2033(false, class650.field9486.field11143 + field4261[4])) {
                        return;
                     }

                     class650.field9499 = class352.method2570(class650.field9486.field11143 + field4261[4], class650.field9485, class88.field1148, (byte)-111);
                     if (!var3) {
                        break label181;
                     }
                  }

                  class650.field9499 = new class92(0);
               }

               class650.method4756();
               class116.field1452 = 70;
               class489.method3557(true, -51);
               class134.method1060((byte)107);
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field4261[1] + (arg0 != null ? field4261[2] : field4261[3]) + ',' + arg1 + ',' + (arg2 != null ? field4261[2] : field4261[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2296(int arg0) {
      try {
         if (arg0 == -8266) {
            field4258 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4261[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2297(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2298(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

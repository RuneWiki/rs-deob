import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class183 extends class55 {
   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2584 = new String[]{method1461(method1460("+Zu\u001a'")), method1461(method1460("+Zu\u0019'")), method1461(method1460("+Zu\u0014'")), method1461(method1460("+Zu\u0012'")), method1461(method1460("+Zu\u0015'")), method1461(method1460("+Zu\u0017'")), method1461(method1460("\"K")), method1461(method1460("7\u0003u}r")), method1461(method1460("\"X7?")), method1461(method1460("+Zu\u0018'")), method1461(method1460("+Zu\u0010'")), method1461(method1460("+Zu\u0011'")), method1461(method1460("+Zu\u0016'")), method1461(method1460("+Zu\u001b'"))};
   @OriginalMember(
      owner = "client!gw",
      name = "p",
      descriptor = "Leg;"
   )
   public static class118 field2568 = new class118(106, 3);
   @OriginalMember(
      owner = "client!gw",
      name = "h",
      descriptor = "[B"
   )
   public static byte[] field2579 = new byte[2048];
   @OriginalMember(
      owner = "client!gw",
      name = "e",
      descriptor = "Leg;"
   )
   public static class118 field2576 = new class118(16, 2);
   @OriginalMember(
      owner = "client!gw",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field2581 = false;
   @OriginalMember(
      owner = "client!gw",
      name = "f",
      descriptor = "I"
   )
   public static int field2582 = 0;
   @OriginalMember(
      owner = "client!gw",
      name = "l",
      descriptor = "I"
   )
   public static int field2569;
   @OriginalMember(
      owner = "client!gw",
      name = "r",
      descriptor = "I"
   )
   public static int field2570;
   @OriginalMember(
      owner = "client!gw",
      name = "o",
      descriptor = "I"
   )
   public static int field2571;
   @OriginalMember(
      owner = "client!gw",
      name = "k",
      descriptor = "I"
   )
   public static int field2572;
   @OriginalMember(
      owner = "client!gw",
      name = "j",
      descriptor = "I"
   )
   public static int field2573;
   @OriginalMember(
      owner = "client!gw",
      name = "g",
      descriptor = "I"
   )
   public static int field2574;
   @OriginalMember(
      owner = "client!gw",
      name = "m",
      descriptor = "I"
   )
   public static int field2575;
   @OriginalMember(
      owner = "client!gw",
      name = "i",
      descriptor = "I"
   )
   public static int field2577;
   @OriginalMember(
      owner = "client!gw",
      name = "t",
      descriptor = "I"
   )
   public static int field2578;
   @OriginalMember(
      owner = "client!gw",
      name = "q",
      descriptor = "I"
   )
   public static int field2580;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!gw",
      name = "s",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field2583;

   @OriginalMember(
      owner = "client!gw",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method101(int arg0) {
      try {
         ++field2578;
         if (arg0 > -116) {
            field2579 = null;
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2584[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "<init>",
      descriptor = "(ILifa;)V"
   )
   public class183(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!gw",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1452(int arg0) {
      try {
         field2568 = null;
         field2576 = null;
         field2579 = null;
         if (arg0 != 8) {
            method1458(true, 7);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2584[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method1453(byte arg0) {
      try {
         ++field2575;
         if (super.field683.method3308(1) == class185.field2620) {
            return !super.field683.method3300((byte)-56);
         } else {
            if (arg0 != 120) {
               this.method98(16);
            }

            return false;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2584[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method1454(int arg0) {
      try {
         int var2 = 124 % ((arg0 - 36) / 41);
         ++field2571;
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2584[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(Lmm;B)V"
   )
   public static final void method1455(class294 arg0, byte arg1) {
      try {
         ++field2570;
         if (arg1 != 57) {
            method1458(false, -4);
         }

         if (class663.field9659 != null) {
            class604 var2 = null;
            if (arg0.field4049 == 0) {
               var2 = (class604)class45.method381(arg0.field4052, arg0.field4051, arg0.field4056);
            }

            if (~arg0.field4049 == -2) {
               var2 = (class604)class500.method3630(arg0.field4052, arg0.field4051, arg0.field4056);
            }

            if (~arg0.field4049 == -3) {
               var2 = (class604)class691.method5042(arg0.field4052, arg0.field4051, arg0.field4056, field2583 != null ? field2583 : (field2583 = method1459(field2584[6])));
            }

            if (~arg0.field4049 == -4) {
               var2 = (class604)class216.method1708(arg0.field4052, arg0.field4051, arg0.field4056);
            }

            if (var2 == null) {
               arg0.field4050 = 0;
               arg0.field4048 = -1;
               arg0.field4058 = 0;
            } else {
               arg0.field4048 = var2.method236(28154);
               arg0.field4058 = var2.method237(123);
               arg0.field4050 = var2.method252((byte)6);
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2584[9] + (arg0 != null ? field2584[7] : field2584[8]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method96(int arg0, byte arg1) {
      try {
         ++field2580;
         int var3 = -18 / ((47 - arg1) / 46);
         super.field680 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2584[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "<init>",
      descriptor = "(Lifa;)V"
   )
   public class183(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1456(int arg0, int arg1, int arg2) {
      try {
         ++field2574;
         if (~arg1 <= -1001 && ~arg2 > -1001) {
            return true;
         } else if (~arg1 > -1001 && ~arg2 > -1001) {
            if (class14.method81(arg2, (byte)-122)) {
               return true;
            } else {
               return !class14.method81(arg1, (byte)-127);
            }
         } else if (arg0 != 2) {
            return true;
         } else {
            return arg1 >= 1000 && arg2 >= 1000;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2584[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method98(int arg0) {
      try {
         if (arg0 != 0) {
            field2582 = 102;
         }

         label30: {
            if (super.field683.method3308(1) == class185.field2620) {
               if (!super.field683.method3300((byte)-56)) {
                  break label30;
               }

               super.field680 = 0;
               if (!client.field4360) {
                  break label30;
               }
            }

            super.field680 = 1;
         }

         ++field2577;
         if (~super.field680 != -1 && ~super.field680 != -2) {
            super.field680 = this.method101(arg0 + -128);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2584[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(IIIIIII)J"
   )
   public static final long method1457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg2 != 1) {
            return -26L;
         } else {
            ++field2572;
            class176.field2431.clear();
            class176.field2431.set(arg6, arg5, arg0, arg1, arg3, arg4);
            return class176.field2431.getTime().getTime();
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field2584[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method97(int arg0, byte arg1) {
      try {
         if (arg1 != 105) {
            field2581 = true;
         }

         ++field2569;
         if (super.field683.method3308(1) == class185.field2620) {
            if (super.field683.method3300((byte)-56)) {
               return 3;
            } else {
               return ~arg0 != -1 && ~super.field683.field6449.method1711(86) != -2 ? 2 : 1;
            }
         } else {
            return 3;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2584[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method1458(boolean arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         if (arg0) {
            if (~class185.field2623 != 0) {
               class214.method1690(class185.field2623, 76);
            }

            int var10000;
            label69: {
               class561 var3 = (class561)class191.field2708.method328(1745388291);
               if (var2) {
                  var10000 = var3.method3169(arg1 + -10401);
               } else if (var3 == null) {
                  class185.field2623 = -1;
                  class191.field2708 = new class37(8);
                  class759.method5509(0);
                  class185.field2623 = class156.field2224;
                  class267.method2068(3, false);
                  class88.method775((byte)-58);
                  var10000 = class185.field2623;
                  if (!var2) {
                     break label69;
                  }
               } else {
                  var10000 = var3.method3169(arg1 + -10401);
               }

               label68:
               do {
                  while(true) {
                     if (var10000 == 0) {
                        var3 = (class561)class191.field2708.method328(1745388291);
                        if (var3 == null) {
                           if (!var2) {
                              class185.field2623 = -1;
                              class191.field2708 = new class37(8);
                              class759.method5509(0);
                              class185.field2623 = class156.field2224;
                              class267.method2068(3, false);
                              class88.method775((byte)-58);
                              var10000 = class185.field2623;
                              break;
                           }

                           class757.method5496(var3, true, true, false);
                           var3 = (class561)class191.field2708.method325(-4629);
                        } else {
                           class757.method5496(var3, true, true, false);
                           var3 = (class561)class191.field2708.method325(-4629);
                        }
                     } else {
                        class757.method5496(var3, true, true, false);
                        var3 = (class561)class191.field2708.method325(-4629);
                     }

                     if (var3 == null) {
                        class185.field2623 = -1;
                        class191.field2708 = new class37(8);
                        class759.method5509(0);
                        class185.field2623 = class156.field2224;
                        class267.method2068(3, false);
                        class88.method775((byte)-58);
                        var10000 = class185.field2623;
                        if (!var2) {
                           break label68;
                        }
                     } else {
                        var10000 = var3.method3169(arg1 + -10401);
                     }
                  }
               } while(var2);
            }

            class200.method1591(var10000);
         }

         ++field2573;
         class517.method3766(-19277);
         class197.field2777 = false;
         class32.method289((byte)110);
         class146.field1843 = -1;
         class277.method2105(class450.field6386, -85);
         class564.field8045 = new class121();
         class564.field8045.field3888[0] = class644.field9403 / 2;
         class564.field8045.field10694 = class644.field9403 * 512 / 2;
         if (arg1 == -1001) {
            label36: {
               class564.field8045.field10693 = class337.field4594 * 512 / 2;
               class564.field8045.field3884[0] = class337.field4594 / 2;
               class782.field11465 = 0;
               class224.field3188 = 0;
               if (class380.field5481 == 2) {
                  class782.field11465 = class754.field11175 << 9;
                  class224.field3188 = class463.field6650 << 9;
                  if (!var2) {
                     break label36;
                  }
               }

               class382.method2885(0);
            }

            class85.method760(0);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2584[0] + arg0 + ',' + arg1 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method1459(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1460(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1461(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

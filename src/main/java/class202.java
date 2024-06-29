import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class202 extends class454 {
   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2576 = new String[]{method1679(method1678("@Z4\f\n")), method1679(method1678("@Z4\u0005\n")), method1679(method1678("@Z4\r\n")), method1679(method1678("@Z4\t\n")), method1679(method1678("@Z4\u0004\n")), method1679(method1678("@Z4\u000e\n")), method1679(method1678("U\u00114d_")), method1679(method1678("@Jv&")), method1679(method1678("@Z4\u0002\n")), method1679(method1678("@Z4\b\n")), method1679(method1678("@Z4\u000f\n")), method1679(method1678("@Z4\u000b\n"))};
   @OriginalMember(
      owner = "client!ne",
      name = "p",
      descriptor = "Laka;"
   )
   public static class418 field2569 = new class418(115, 6);
   @OriginalMember(
      owner = "client!ne",
      name = "o",
      descriptor = "[Z"
   )
   public static boolean[] field2572 = new boolean[8];
   @OriginalMember(
      owner = "client!ne",
      name = "u",
      descriptor = "I"
   )
   public static int field2575 = 0;
   @OriginalMember(
      owner = "client!ne",
      name = "m",
      descriptor = "I"
   )
   public static int field2574 = 0;
   @OriginalMember(
      owner = "client!ne",
      name = "k",
      descriptor = "Lpb;"
   )
   public static class2 field2573 = new class2();
   @OriginalMember(
      owner = "client!ne",
      name = "n",
      descriptor = "I"
   )
   public static int field2561;
   @OriginalMember(
      owner = "client!ne",
      name = "r",
      descriptor = "I"
   )
   public static int field2562;
   @OriginalMember(
      owner = "client!ne",
      name = "t",
      descriptor = "I"
   )
   public static int field2563;
   @OriginalMember(
      owner = "client!ne",
      name = "j",
      descriptor = "I"
   )
   public static int field2564;
   @OriginalMember(
      owner = "client!ne",
      name = "l",
      descriptor = "I"
   )
   public static int field2565;
   @OriginalMember(
      owner = "client!ne",
      name = "w",
      descriptor = "I"
   )
   public static int field2566;
   @OriginalMember(
      owner = "client!ne",
      name = "q",
      descriptor = "I"
   )
   public static int field2567;
   @OriginalMember(
      owner = "client!ne",
      name = "v",
      descriptor = "I"
   )
   public static int field2568;
   @OriginalMember(
      owner = "client!ne",
      name = "s",
      descriptor = "I"
   )
   public static int field2570;
   @OriginalMember(
      owner = "client!ne",
      name = "i",
      descriptor = "Lpd;"
   )
   public static class648 field2571;

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         ++field2566;
         return arg0 != 1 ? 22 : 1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2576[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method1672(int arg0) {
      try {
         ++field2567;
         if (arg0 != -18033) {
            this.method20((byte)70, -88);
         }

         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2576[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method1673(byte arg0) {
      boolean var1 = client.field1481;

      try {
         class438 var2 = (class438)class723.field10572.method5265(-126);
         if (var1) {
            if (~var2.field5970 < -2) {
               var2.field5970 = 0;
               class259.field3299.method3190(var2, ((class541)var2.field5971.field10622.field272).field7901, 8);
               var2.field5971.method5264(97);
            }

            var2 = (class438)class723.field10572.method5266(false);
         }

         while(true) {
            int var10000;
            byte var10001;
            if (var2 == null) {
               var10000 = arg0;
               var10001 = 25;
               if (!var1) {
                  if (arg0 <= 25) {
                     method1675(37, -119, 27, 25, -71, 10, (class479)null, -58);
                  }

                  ++field2564;
                  class455.field6279 = 0;
                  class254.field3207 = 0;
                  class500.field6967.method289(true);
                  class466.field6411.method1809(true);
                  class723.field10572.method5264(123);
                  class455.method3486(class545.field7969, 0);
                  return;
               }
            } else {
               var10000 = ~var2.field5970;
               var10001 = -2;
            }

            if (var10000 < var10001) {
               var2.field5970 = 0;
               class259.field3299.method3190(var2, ((class541)var2.field5971.field10622.field272).field7901, 8);
               var2.field5971.method5264(97);
            }

            var2 = (class438)class723.field10572.method5266(false);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2576[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method1674(int arg0) {
      try {
         if (arg0 != -2) {
            method1674(11);
         }

         field2573 = null;
         field2572 = null;
         field2571 = null;
         field2569 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2576[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(IIIIIILha;I)V"
   )
   public static final void method1675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class479 arg6, int arg7) {
      try {
         ++field2570;
         class497.field6954 = arg6;
         class657.field9802 = class497.field6954.method480();
         class456.field6290 = class497.field6954.method480();
         class37.field522 = class497.field6954.method480();
         class175.field2258 = 1;
         class293.field4028 = arg7;
         class727.field10611 = arg0;
         class139.field1759 = arg4;
         class470.field6471 = arg5;
         class390.field5409 = arg3;
         class728.field10621 = 0;
         class308.field4310 = null;
         class316.method2503(arg1, (byte)99, arg2);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field2576[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field2576[6] : field2576[7]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class202(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         if (arg0 >= -46) {
            method1676(91);
         }

         ++field2565;
         super.field6263 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2576[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1676(int arg0) {
      try {
         ++field2562;
         class407 var1 = class137.field1737;
         synchronized(class137.field1737) {
            class137.field1737.method3201((byte)115);
         }

         if (arg0 != 30479) {
            field2569 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2576[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         ++field2563;
         if (~super.field6263 != -2 && super.field6263 != 0) {
            super.field6263 = this.method23(1);
         }

         if (!arg0) {
            field2574 = -123;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2576[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         if (arg1) {
            method1673((byte)72);
         }

         ++field2561;
         return 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2576[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(IIZZI)V"
   )
   public static final void method1677(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
      try {
         ++field2568;
         if (arg4 == 28900) {
            class411.method3223(class426.field5795.length - 1, arg0, arg2, arg3, 0, arg1, arg4 + -28901);
            class281.field3683 = null;
            class76.field1007 = 0;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2576[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class202(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1678(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1679(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

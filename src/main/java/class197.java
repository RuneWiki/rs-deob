import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class197 extends class465 {
   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2451 = new String[]{method1508(method1507("&I,D")), method1508(method1507("&I&D")), method1508(method1507("&I\"D")), method1508(method1507("&I-D")), method1508(method1507("&I%D")), method1508(method1507("&I#D")), method1508(method1507("&I D")), method1508(method1507("&I'D")), method1508(method1507("&I!D"))};
   @OriginalMember(
      owner = "client!c",
      name = "p",
      descriptor = "I"
   )
   public static int field2442 = 0;
   @OriginalMember(
      owner = "client!c",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field2444 = new int[14];
   @OriginalMember(
      owner = "client!c",
      name = "i",
      descriptor = "Lsd;"
   )
   public static class101 field2443 = new class101(112, 4);
   @OriginalMember(
      owner = "client!c",
      name = "h",
      descriptor = "I"
   )
   public static int field2439;
   @OriginalMember(
      owner = "client!c",
      name = "f",
      descriptor = "I"
   )
   public static int field2440;
   @OriginalMember(
      owner = "client!c",
      name = "m",
      descriptor = "I"
   )
   public static int field2441;
   @OriginalMember(
      owner = "client!c",
      name = "o",
      descriptor = "I"
   )
   public static int field2445;
   @OriginalMember(
      owner = "client!c",
      name = "k",
      descriptor = "I"
   )
   public static int field2446;
   @OriginalMember(
      owner = "client!c",
      name = "j",
      descriptor = "I"
   )
   public static int field2447;
   @OriginalMember(
      owner = "client!c",
      name = "l",
      descriptor = "I"
   )
   public static int field2448;
   @OriginalMember(
      owner = "client!c",
      name = "g",
      descriptor = "I"
   )
   public static int field2450;
   @OriginalMember(
      owner = "client!c",
      name = "q",
      descriptor = "[Lvs;"
   )
   public static class616[] field2449;

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(I)I",
      line = 9
   )
   public final int method1502(int arg0) {
      try {
         if (arg0 <= 81) {
            field2443 = null;
         }

         ++field2441;
         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2451[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(II)V",
      line = 21
   )
   public final void method77(int arg0, int arg1) {
      try {
         super.field6984 = arg1;
         ++field2445;
         if (arg0 != -14812) {
            field2442 = -11;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2451[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 32
   )
   public class197(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(I)I",
      line = 42
   )
   public final int method78(int arg0) {
      try {
         ++field2440;
         return arg0 != 16726277 ? 26 : 1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2451[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(B)V",
      line = 53
   )
   public static void method1503(byte arg0) {
      try {
         field2444 = null;
         field2449 = null;
         if (arg0 != 126) {
            method1505(50, 127, 28, -123, -125);
         }

         field2443 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2451[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IIIII)V",
      line = 66
   )
   public static final void method1504(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         int var6;
         int var7;
         label19: {
            ++field2439;
            float var5 = (float)class329.field4687 / (float)class329.field4706;
            var6 = arg2;
            var7 = arg3;
            if (var5 < 1.0F) {
               var7 = (int)((float)arg2 * var5);
               if (client.field4530 == 0) {
                  break label19;
               }
            }

            var6 = (int)((float)arg3 / var5);
         }

         int var11 = arg4 - (-var7 + arg3) / 2;
         int var10 = arg1 - (-var6 + arg2) / 2;
         class729.field10834 = class329.field4706 * var10 / var6;
         if (arg0 == 6078) {
            class303.field4325 = -1;
            class82.field999 = -1;
            class670.field10075 = -(class329.field4687 * var11 / var7) + class329.field4687;
            class351.method2743(arg0 ^ -6079);
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field2451[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(IIIII)V",
      line = 95
   )
   public static final void method1505(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field2447;
         if (arg3 >= field2442 && arg3 <= class100.field1232) {
            int var7 = class768.method5559(arg1, class22.field234, class506.field7472, 71);
            int var8 = class768.method5559(arg2, class22.field234, class506.field7472, 71);
            class699.method5069(var8, arg0, arg3, var7, 20);
         }

         if (arg4 != 1) {
            method1506(112);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2451[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IB)I",
      line = 115
   )
   public final int method70(int arg0, byte arg1) {
      try {
         int var3 = -17 / ((arg1 - -51) / 60);
         ++field2446;
         return 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2451[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "c",
      descriptor = "(I)V",
      line = 125
   )
   public static final void method1506(int arg0) {
      int var1 = client.field4530;

      try {
         class124.method1022();
         ++field2448;
         int var2 = 0;
         if (var1 != 0) {
            class532.field7778[var2].method5387(3);
            ++var2;
         }

         while(true) {
            while(var2 < 4) {
               class532.field7778[var2].method5387(3);
               ++var2;
            }

            if (var1 == 0) {
               if (arg0 != 8669) {
                  method1504(20, 35, 70, 28, -110);
               }

               class431.method3282(false);
               class607.method4426(arg0 + -25439);
               class413.method3152((byte)-115);
               System.gc();
               class786.field11439.method561();
               return;
            }

            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2451[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 148
   )
   public class197(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Z)V",
      line = 156
   )
   public final void method69(boolean arg0) {
      try {
         if (arg0) {
            field2444 = null;
         }

         ++field2450;
         if (super.field6984 != 1 && super.field6984 != 0) {
            super.field6984 = this.method78(16726277);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2451[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1507(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1508(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

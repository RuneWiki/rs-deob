import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class349 extends class555 {
   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5008 = new String[]{method2758(method2757("F\u0018?$=\u0001")), method2758(method2757("^\f")), method2758(method2757("F\u0018?$:\u0001")), method2758(method2757("F\u0018?$>\u0001")), method2758(method2757("F\u0018?$<\u0001")), method2758(method2757("F\u0018?$9\u0001")), method2758(method2757("F\u0018?$6\u0001")), method2758(method2757("F\u0018?$;\u0001"))};
   @OriginalMember(
      owner = "client!ofa",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field5007 = false;
   @OriginalMember(
      owner = "client!ofa",
      name = "f",
      descriptor = "I"
   )
   public static int field5001;
   @OriginalMember(
      owner = "client!ofa",
      name = "h",
      descriptor = "I"
   )
   public static int field5002;
   @OriginalMember(
      owner = "client!ofa",
      name = "i",
      descriptor = "I"
   )
   public static int field5003;
   @OriginalMember(
      owner = "client!ofa",
      name = "m",
      descriptor = "I"
   )
   public static int field5004;
   @OriginalMember(
      owner = "client!ofa",
      name = "g",
      descriptor = "I"
   )
   public static int field5005;
   @OriginalMember(
      owner = "client!ofa",
      name = "l",
      descriptor = "I"
   )
   public static int field5006;
   @OriginalMember(
      owner = "client!ofa",
      name = "j",
      descriptor = "Llia;"
   )
   public static class507 field5000;

   @OriginalMember(
      owner = "client!ofa",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class349(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2752(int arg0) {
      try {
         if (arg0 == -7486) {
            field5000 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5008[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         if (arg1 <= 36) {
            return 84;
         } else {
            ++field5002;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5008[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(IIIIBII)V"
   )
   public static final void method2753(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         int var3 = -110 / ((arg1 - 12) / 47);
         ++field5004;
         super.field7632 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5008[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         ++field5003;
         if (~super.field7632 != -2 && super.field7632 != 0) {
            super.field7632 = this.method635(125);
         }

         if (arg0 != -13712) {
            field5000 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5008[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(Lha;IIIIIIZZ)V"
   )
   public static final void method2754(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
      class292.field3851 = arg0;
      class46.field533 = arg1;
      class100.field1284 = class46.field533 > 1 && class292.field3851.method493();
      class76.field965 = arg2;
      class212.field2635 = 1 << class76.field965;
      class187.field2291 = class212.field2635 >> 1;
      Math.sqrt((double)(class187.field2291 * class187.field2291 + class187.field2291 * class187.field2291));
      class398.field5594 = arg3;
      class635.field8973 = arg4;
      class304.field4042 = arg5;
      class224.field2812 = arg6;
      class573.field7893 = class700.method5084(119);
      class757.method5448(true);
      class110.field1395 = new class225[arg3][class635.field8973][class304.field4042];
      class144.field1906 = new class295[arg3];
      if (arg7) {
         class175.field2177 = new int[class635.field8973][class304.field4042];
         class350.field5017 = new byte[class635.field8973][class304.field4042];
         class584.field8014 = new short[class635.field8973][class304.field4042];
         class194.field2364 = new class225[1][class635.field8973][class304.field4042];
         class73.field900 = new class295[1];
      } else {
         class175.field2177 = null;
         class350.field5017 = null;
         class584.field8014 = null;
         class194.field2364 = null;
         class73.field900 = null;
      }

      if (arg8) {
         class328.field4698 = new long[arg3][arg4][arg5];
         class166.field2104 = new class730[65535];
         class756.field10969 = new boolean[65535];
         class494.field6789 = 0;
      } else {
         class328.field4698 = null;
         class166.field2104 = null;
         class756.field10969 = null;
         class494.field6789 = 0;
      }

      class530.method3827(false);
      class8.field111 = new class80[2];
      class735.field10736 = new class80[2];
      class234.field2900 = new class80[2];
      class257.field3289 = new class80[10000];
      class766.field11052 = 0;
      class24.field308 = new class80[5000];
      class552.field7595 = 0;
      class422.field5939 = new class47[5000];
      class450.field6222 = 0;
      class426.field5961 = new boolean[class224.field2812 + class224.field2812 + 1][class224.field2812 + class224.field2812 + 1];
      class370.field5212 = new boolean[class224.field2812 + class224.field2812 + 2][class224.field2812 + class224.field2812 + 2];
      class305.field4052 = new int[class224.field2812 + class224.field2812 + 2];
      class46.field528 = class46.field521;
      if (class100.field1284) {
         class505.field6922 = new boolean[arg3][class224.field2812 + class224.field2812 + 1][class224.field2812 + class224.field2812 + 1];
         class413.field5817 = new boolean[arg3][][];
         if (class247.field3099 != null) {
            class396.method3011();
         }

         class247.field3099 = new class453[class46.field533];
         class292.field3851.method532(class247.field3099.length + 1);
         class292.field3851.method580(0);

         for(int var9 = 0; var9 < class247.field3099.length; ++var9) {
            class247.field3099[var9] = new class453(var9 + 1, class292.field3851);
            (new Thread(class247.field3099[var9], field5008[1] + var9)).start();
         }

         byte var10;
         if (class46.field533 == 2) {
            var10 = 4;
            class756.field10968 = 2;
         } else if (class46.field533 == 3) {
            var10 = 6;
            class756.field10968 = 3;
         } else {
            var10 = 8;
            class756.field10968 = 4;
         }

         class305.field4051 = new class750[var10];

         for(int var11 = 0; var11 < var10; ++var11) {
            class305.field4051[var11] = new class750(class213.field2646[class46.field533 - 2][var11]);
         }
      } else {
         class756.field10968 = 1;
      }

      class245.field3064 = new int[class756.field10968 - 1];
      class530.field7271 = new int[class756.field10968 - 1];
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method2755(byte arg0) {
      try {
         if (arg0 > -61) {
            method2752(47);
         }

         ++field5005;
         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5008[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(Lu;[Loda;)V"
   )
   public static final void method2756(class80 arg0, class127[] arg1) {
      if (class518.field7112) {
         int var2 = arg0.method401(arg1, 1);
         class292.field3851.method601(var2, arg1);
      }

      if (class93.field1241 == class73.field900) {
         boolean var3 = false;
         boolean var4 = false;
         int var5;
         int var6;
         if (arg0 instanceof class47) {
            var5 = ((class47)arg0).field547;
            var6 = ((class47)arg0).field540;
         } else {
            var5 = arg0.field999 >> class76.field965;
            var6 = arg0.field1003 >> class76.field965;
         }

         class292.field3851.method564(class144.field1906[0].method2220(123, arg0.field999, arg0.field1003), class105.method936(var5, var6), class276.method2102(var5, var6), class231.method1751(var5, var6));
      }

      class794 var7 = arg0.method770(false, class292.field3851);
      if (var7 != null) {
         if (arg0.field1008) {
            class52[] var8 = var7.field11601;

            for(int var9 = 0; var9 < var8.length; ++var9) {
               class52 var10 = var8[var9];
               if (var10.field572) {
                  class534.method3842(0, var10.field575 + var10.field574, var10.field575 + var10.field571, var10.field573 - var10.field575, var10.field576 - var10.field575);
               }
            }
         }

         if (var7.field11599) {
            var7.field11600 = arg0;
            if (class100.field1284) {
               class32 var11 = class46.field528;
               synchronized(class46.field528) {
                  class46.field528.method257((byte)-98, var7);
                  return;
               }
            }

            class46.field528.method257((byte)93, var7);
            return;
         }

         class42.method315(var7, false);
      }

   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         ++field5006;
         return arg0 <= 124 ? -39 : 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5008[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class349(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2757(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2758(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

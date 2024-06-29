import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class481 extends class690 {
   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6647 = new String[]{method3507(method3506("<` #\u0014{")), method3507(method3506("=\u007f-a")), method3507(method3506("($o#-")), method3507(method3506("<` #\u0016{")), method3507(method3506("<` #\u0013{")), method3507(method3506("<` #\u0012{")), method3507(method3506("<` #\u0011{"))};
   @OriginalMember(
      owner = "client!oja",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field6640 = false;
   @OriginalMember(
      owner = "client!oja",
      name = "n",
      descriptor = "Leb;"
   )
   public static class657 field6644 = null;
   @OriginalMember(
      owner = "client!oja",
      name = "r",
      descriptor = "I"
   )
   public static int field6641;
   @OriginalMember(
      owner = "client!oja",
      name = "m",
      descriptor = "I"
   )
   public static int field6643;
   @OriginalMember(
      owner = "client!oja",
      name = "q",
      descriptor = "I"
   )
   public static int field6645;
   @OriginalMember(
      owner = "client!oja",
      name = "p",
      descriptor = "I"
   )
   public static int field6646;
   @OriginalMember(
      owner = "client!oja",
      name = "s",
      descriptor = "Ljava/lang/String;"
   )
   private String field6642;

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(IZZ)V"
   )
   public static final void method3502(int arg0, boolean arg1, boolean arg2) {
      try {
         if (arg2) {
            --class109.field1385;
            if (~class109.field1385 == -1) {
               class661.field9422 = null;
            }
         }

         if (arg0 == -1) {
            if (arg1) {
               --class459.field6290;
               if (class459.field6290 == 0) {
                  class757.field10972 = null;
               }
            }

            ++field6643;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6647[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "()V"
   )
   public static final void method3503() {
      if (class110.field1395 != null) {
         for(int var0 = 0; var0 < class110.field1395.length; ++var0) {
            for(int var1 = 0; var1 < class635.field8973; ++var1) {
               for(int var2 = 0; var2 < class304.field4042; ++var2) {
                  if (class110.field1395[var0][var1][var2] != null) {
                     class110.field1395[var0][var1][var2].method1722((byte)88);
                  }

                  class110.field1395[var0][var1][var2] = null;
               }
            }
         }
      }

      class110.field1395 = null;
      class144.field1906 = null;
      if (class194.field2364 != null) {
         for(int var3 = 0; var3 < class194.field2364.length; ++var3) {
            for(int var4 = 0; var4 < class635.field8973; ++var4) {
               for(int var5 = 0; var5 < class304.field4042; ++var5) {
                  if (class194.field2364[var3][var4][var5] != null) {
                     class194.field2364[var3][var4][var5].method1722((byte)89);
                  }

                  class194.field2364[var3][var4][var5] = null;
               }
            }
         }
      }

      class194.field2364 = null;
      class73.field900 = null;
      class111.field1404 = null;
      class93.field1241 = null;
      class426.field5961 = null;
      class370.field5212 = null;
      class305.field4052 = null;
      class505.field6922 = null;
      class413.field5817 = null;
      class778.method5578((byte)121);
      if (class422.field5939 != null) {
         for(int var6 = 0; var6 < class450.field6222; ++var6) {
            class422.field5939[var6] = null;
         }

         class450.field6222 = 0;
      }

      class8.field111 = null;
      class735.field10736 = null;
      class234.field2900 = null;
      if (class257.field3289 != null) {
         for(int var7 = 0; var7 < class257.field3289.length; ++var7) {
            class257.field3289[var7] = null;
         }

         class766.field11052 = 0;
      }

      if (class24.field308 != null) {
         for(int var8 = 0; var8 < class24.field308.length; ++var8) {
            class24.field308[var8] = null;
         }

         class552.field7595 = 0;
      }

      if (class166.field2104 != null) {
         for(int var9 = 0; var9 < class494.field6789; ++var9) {
            class166.field2104[var9] = null;
         }

         for(int var10 = 0; var10 < class398.field5594; ++var10) {
            for(int var11 = 0; var11 < class635.field8973; ++var11) {
               for(int var12 = 0; var12 < class304.field4042; ++var12) {
                  class328.field4698[var10][var11][var12] = 0L;
               }
            }
         }

         class494.field6789 = 0;
      }

      class245.method1840(0);
      class46.field528 = class46.field521;
      class46.field528.method260(false);
      class350.field5017 = null;
      class175.field2177 = null;
      class584.field8014 = null;
      if (class247.field3099 != null) {
         class396.method3011();
         class292.field3851.method532(1);
         class292.field3851.method580(0);
      }

      if (class305.field4051 != null) {
         class305.field4051 = null;
      }

      class292.field3851 = null;
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3504(int arg0) {
      try {
         field6644 = null;
         if (arg0 != 0) {
            method3502(-27, true, true);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6647[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "b",
      descriptor = "(I)Z"
   )
   public static final boolean method3505(int arg0) {
      try {
         ++field6645;
         if (class718.field10524 == null) {
            return false;
         } else {
            if (~class718.field10524.field2993 <= -2001) {
               class718.field10524.field2993 -= 2000;
            }

            if (arg0 != 9611) {
               field6644 = null;
            }

            return ~class718.field10524.field2993 == -1012;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6647[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(ZLhh;)V"
   )
   public final void method27(boolean arg0, class139 arg1) {
      try {
         ++field6646;
         arg1.field1841 = this.field6642;
         if (arg0) {
            method3504(-55);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6647[4] + arg0 + ',' + (arg1 != null ? field6647[2] : field6647[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method26(class594 arg0, byte arg1) {
      try {
         this.field6642 = arg0.method4291(-96);
         if (arg1 >= -19) {
            this.field6642 = null;
         }

         ++field6641;
         arg0.method4302(true);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6647[0] + (arg0 != null ? field6647[2] : field6647[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3506(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3507(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

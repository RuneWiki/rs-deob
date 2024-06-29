import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class309 {
   @OriginalMember(
      owner = "client!maa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4662 = new String[]{method2536(method2535("g\u0004p\u0019*\"")), method2536(method2535("g\u0004p\u0019)\"")), method2536(method2535("^3+\u0017")), method2536(method2535("g\u0004p\u0019/\"")), method2536(method2535("g\u0004p\u0019-\"")), method2536(method2535("g\u0004p\u0019.\"")), method2536(method2535("g\u0004p\u0019(\"")), method2536(method2535("d\u0010}[")), method2536(method2535("qK?\u0019\u0011"))};
   @OriginalMember(
      owner = "client!maa",
      name = "f",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field4659 = Calendar.getInstance();
   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field4655 = Calendar.getInstance(TimeZone.getTimeZone(method2536(method2535("M(E"))));
   @OriginalMember(
      owner = "client!maa",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field4661 = new int[50];
   @OriginalMember(
      owner = "client!maa",
      name = "h",
      descriptor = "I"
   )
   public static int field4654;
   @OriginalMember(
      owner = "client!maa",
      name = "g",
      descriptor = "I"
   )
   public static int field4656;
   @OriginalMember(
      owner = "client!maa",
      name = "d",
      descriptor = "I"
   )
   public static int field4657;
   @OriginalMember(
      owner = "client!maa",
      name = "e",
      descriptor = "I"
   )
   public static int field4658;
   @OriginalMember(
      owner = "client!maa",
      name = "b",
      descriptor = "I"
   )
   public static int field4660;

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2529(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(II)Lhi;"
   )
   public static final class606 method2530(int arg0, int arg1) {
      try {
         ++field4654;
         if (~arg0 != -1) {
            if (arg0 == 1) {
               return new class505();
            }

            if (arg0 == 2) {
               return new class21();
            }

            if (~arg0 == -4) {
               return new class151();
            }

            if (arg0 == 4) {
               return new class278();
            }

            if (arg0 == 5) {
               return new class2();
            }

            if (arg0 == 6) {
               return new class464();
            }

            if (~arg0 == -8) {
               return new class547();
            }

            if (arg0 == 8) {
               return new class416();
            }

            if (arg0 == 9) {
               return new class88();
            }

            if (~arg0 == -11) {
               return new class36();
            }

            if (arg0 == 11) {
               return new class564();
            }

            if (~arg0 == -13) {
               return new class29();
            }

            if (arg0 == 13) {
               return new class668();
            }

            if (arg0 == 14) {
               return new class642();
            }

            if (arg0 == 15) {
               return new class748();
            }

            if (~arg0 == -17) {
               return new class553();
            }

            if (arg0 == 17) {
               return new class700();
            }

            if (arg0 == 18) {
               return new class271();
            }

            if (~arg0 == -20) {
               return new class597();
            }

            if (arg0 == 20) {
               return new class435();
            }

            if (arg0 == 21) {
               return new class7();
            }

            if (~arg0 == -23) {
               return new class798();
            }

            if (~arg0 == -24) {
               return new class467();
            }

            if (arg0 == 24) {
               return new class472();
            }

            if (~arg0 == -26) {
               return new class227();
            }

            if (arg0 == 26) {
               return new class280();
            }

            if (arg0 == 27) {
               return new class255();
            }

            if (~arg0 == -29) {
               return new class32();
            }

            if (arg0 == 29) {
               return new class43();
            }

            if (arg0 == 30) {
               return new class19();
            }

            if (arg0 == 31) {
               return new class294();
            }

            if (arg0 == 32) {
               return new class356();
            }

            if (~arg0 == -34) {
               return new class397();
            }

            if (arg0 == 34) {
               return new class76();
            }

            if (arg0 == 35) {
               return new class218();
            }

            if (~arg0 == -37) {
               return new class721();
            }

            if (~arg0 == -38) {
               return new class277();
            }

            if (~arg0 == -39) {
               return new class439();
            }

            if (~arg0 != -40) {
               if (arg1 <= 42) {
                  method2529(88);
               }

               return null;
            }

            if (!client.field10022) {
               return new class789();
            }
         }

         return new class72();
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4662[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(BIII)V"
   )
   public static final void method2531(byte arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4660;
         class111 var4 = class796.method5734(9, (long)arg2, (byte)-121);
         var4.method1087(0);
         if (arg0 <= -27) {
            var4.field1740 = arg3;
            var4.field1739 = arg1;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4662[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2532(int arg0) {
      try {
         field4661 = null;
         if (arg0 != 50) {
            method2529(-77);
         }

         field4655 = null;
         field4659 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4662[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "([BI)[B"
   )
   public static final byte[] method2533(byte[] arg0, int arg1) {
      try {
         ++field4657;
         if (arg0 == null) {
            return null;
         } else {
            byte[] var2 = new byte[arg0.length];
            class474.method3640(arg0, arg1, var2, 0, arg0.length);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4662[6] + (arg0 != null ? field4662[8] : field4662[7]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2534(byte arg0) {
      boolean var1 = client.field10022;

      try {
         if (arg0 > 31) {
            label40: {
               ++field4656;
               if (!class783.method5655(class394.field5712, 0) && !class239.method2100(class394.field5712, true)) {
                  int var2 = class117.field1849.field5861[0] >> 3;
                  int var3 = class117.field1849.field5865[0] >> 3;
                  if (~var2 > -1 || class234.field3626 >> 3 <= var2 || ~var3 > -1 || var3 >= class209.field2989 >> 3) {
                     class70.method744(class209.field2989 >> 4, 0, class234.field3626 >> 4, -118);
                     if (!var1) {
                        break label40;
                     }
                  }

                  class70.method744(var3, class587.field8236, var2, -128);
                  if (!var1) {
                     break label40;
                  }
               }

               class70.method744(class222.field3158 >> 12, class587.field8236, class670.field9407 >> 12, -125);
            }

            class801.method5773(1);
            class444.method3446(-1370);
            class650.method4737(0);
            class509.method3837(true);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4662[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2535(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!maa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2536(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

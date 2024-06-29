import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class54 {
   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field797 = new String[]{method579(method578("p\u00187j\u0002")), method579(method578("p\u00187m\u0002")), method579(method578("p\u00187h\u0002")), method579(method578("p\u00187k\u0002")), method579(method578("p\u00187l\u0002"))};
   @OriginalMember(
      owner = "client!lu",
      name = "g",
      descriptor = "I"
   )
   public static int field789 = 0;
   @OriginalMember(
      owner = "client!lu",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field795 = new int[5];
   @OriginalMember(
      owner = "client!lu",
      name = "d",
      descriptor = "F"
   )
   public static float field796;
   @OriginalMember(
      owner = "client!lu",
      name = "c",
      descriptor = "I"
   )
   public static int field788;
   @OriginalMember(
      owner = "client!lu",
      name = "b",
      descriptor = "I"
   )
   public static int field790;
   @OriginalMember(
      owner = "client!lu",
      name = "i",
      descriptor = "I"
   )
   public static int field791;
   @OriginalMember(
      owner = "client!lu",
      name = "h",
      descriptor = "I"
   )
   public static int field792;
   @OriginalMember(
      owner = "client!lu",
      name = "f",
      descriptor = "I"
   )
   public static int field793;
   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "Lha;"
   )
   public static class17 field794;

   @OriginalMember(
      owner = "client!lu",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method573(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field792;
         class211 var2 = (class211)class142.field2268.method5225(true);
         if (var1) {
            if (~var2.field3008 < -2) {
               var2.field3008 = 0;
               class144.field2280.method1050(-66, var2, ((class272)var2.field3011.field10341.field1553).field4155);
               var2.field3011.method5222((byte)-63);
            }

            var2 = (class211)class142.field2268.method5227(-17856);
         }

         while(true) {
            int var10000;
            short var10001;
            if (var2 == null) {
               class444.field6480 = 0;
               class687.field9909 = 0;
               class594.field8377.method2237(arg0 ^ 5158);
               class524.field7418.method3096(arg0 + -5303);
               class142.field2268.method5222((byte)-63);
               var10000 = arg0;
               var10001 = 5184;
               if (!var1) {
                  if (arg0 != 5184) {
                     field795 = null;
                  }

                  class11.method96(false, class444.field6487);
                  return;
               }
            } else {
               var10000 = ~var2.field3008;
               var10001 = -2;
            }

            if (var10000 < var10001) {
               var2.field3008 = 0;
               class144.field2280.method1050(-66, var2, ((class272)var2.field3011.field10341.field1553).field4155);
               var2.field3011.method5222((byte)-63);
            }

            var2 = (class211)class142.field2268.method5227(-17856);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field797[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(IZI)Lwba;"
   )
   public static final class731 method574(int arg0, boolean arg1, int arg2) {
      boolean var3 = client.field10022;

      try {
         ++field790;
         class424[] var4 = class510.field7239;
         synchronized(class510.field7239) {
            if (arg0 != 0) {
               field794 = null;
            }

            class731 var5;
            label68: {
               if (class510.field7239.length <= arg2 || class510.field7239[arg2].method3308((byte)-70)) {
                  var5 = new class731();
                  var5.field10397 = new class213[arg2];
                  int var6 = 0;
                  if (var3) {
                     var5.field10397[var6] = new class213();
                     ++var6;
                  }

                  while(true) {
                     while(~var6 > ~arg2) {
                        var5.field10397[var6] = new class213();
                        ++var6;
                     }

                     if (!var3) {
                        if (!var3) {
                           break label68;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               var5 = (class731)class510.field7239[arg2].method3311((byte)-121);
               var5.method4994((byte)-122);
               int var10002 = class321.field4792[arg2]--;
            }

            var5.field10400 = arg1;
            return var5;
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field797[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method575(int arg0) {
      try {
         field794 = null;
         field795 = null;
         if (arg0 <= 12) {
            field794 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field797[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method576(int arg0, int arg1, int arg2) {
      try {
         ++field791;
         int var3 = 18 / ((arg0 - -27) / 53);
         boolean var4 = (arg1 & 55) == 0 ? class388.method3023(arg1, arg2, (byte)85) : class633.method4630(arg2, (byte)100, arg1);
         return var4 | class294.method2458(arg2, false, arg1) | (arg2 & 65536) != 0;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field797[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(II)Lcv;"
   )
   public static final class249 method577(int arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field788;
         class249[] var3 = class274.method2320((byte)27);
         int var4 = arg0;
         if (!var2 && arg0 >= var3.length) {
            return null;
         } else {
            do {
               class249 var5 = var3[var4];
               if (~var5.field3814 == ~arg1) {
                  return var5;
               }

               ++var4;
            } while(var4 < var3.length);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field797[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method578(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method579(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

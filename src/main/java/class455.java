import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class455 {
   @OriginalMember(
      owner = "client!nja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6908 = new String[]{method3427(method3426(":7I6")), method3427(method3426("/l\u000btN")), method3427(method3426(":(Dtq|")), method3427(method3426(":(Dtr|"))};
   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "Lsda;"
   )
   public static class269 field6904 = new class269(17, 8);
   @OriginalMember(
      owner = "client!nja",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field6907 = true;
   @OriginalMember(
      owner = "client!nja",
      name = "c",
      descriptor = "I"
   )
   public static int field6903;
   @OriginalMember(
      owner = "client!nja",
      name = "d",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field6906;
   @OriginalMember(
      owner = "client!nja",
      name = "b",
      descriptor = "[Ltw;"
   )
   public static class212[] field6905;

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public static final void method3424(class66 arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         ++field6903;
         if (arg1 > -59) {
            method3425(42);
         }

         int var3 = 0;
         int var4 = 0;
         if (class446.field6785) {
            var3 = class325.method2458(29461);
            var4 = class319.method2421(true);
         }

         label104: {
            int var5 = -10660793;
            class200.method1540(-16777216, arg0, class712.field10630, class10.field147 + var4, class386.field5907, -2, class319.field4561 - -var3, var5);
            class524.field7616.method678(var5, class319.field4561 + var3 + 3, -1, class204.field2588.method1562((byte)-85, class728.field10827), class10.field147 + 14 + var4, 0);
            int var6 = class723.field10766.method368((byte)106) - -var3;
            int var7 = class723.field10766.method366(true) + var4;
            if (!class16.field194) {
               int var8 = 0;
               class303 var9 = (class303)class459.field6947.method4071((byte)127);
               if (var2 != 0 || var9 != null) {
                  do {
                     int var10 = (-var8 + -1 + class354.field5375) * 16 + var4 + class10.field147 + 31;
                     class27.method191(-1, class386.field5907, var7, -1473285856, class10.field147 + var4, class319.field4561 - -var3, var10, var6, var9, -256, arg0, class712.field10630);
                     ++var8;
                     var9 = (class303)class459.field6947.method4059((byte)111);
                  } while(var9 != null);
               }

               if (var2 == 0) {
                  break label104;
               }
            }

            int var11 = 0;
            class488 var12 = (class488)class744.field11034.method5158(0);
            if (var2 != 0 || var12 != null) {
               do {
                  label73: {
                     int var13 = var11 * 16 + class10.field147 + var4 - -31;
                     ++var11;
                     if (var12.field7211 != 1) {
                        class574.method4252(var6, class319.field4561 + var3, var13, var7, (byte)92, class10.field147 + var4, -1, class386.field5907, class712.field10630, -256, arg0, var12);
                        if (var2 == 0) {
                           break label73;
                        }
                     }

                     class27.method191(-1, class386.field5907, var7, -1473285856, class10.field147 + var4, class319.field4561 + var3, var13, var6, (class303)var12.field7218.field10622.field881, -256, arg0, class712.field10630);
                  }

                  var12 = (class488)class744.field11034.method5163((byte)107);
               } while(var12 != null);
            }

            if (class352.field5348 != null) {
               int var10000;
               int var10001;
               label60: {
                  class200.method1540(-16777216, arg0, class707.field10582, class276.field3848, class164.field2062, -2, class501.field7452, var5);
                  int var14 = 0;
                  class524.field7616.method678(var5, class501.field7452 + 3, -1, class352.field5348.field7213, class276.field3848 + 14, 0);
                  class303 var15 = (class303)class352.field5348.field7218.method5158(0);
                  if (var2 != 0) {
                     var10000 = var14 * 16 + class276.field3848;
                     var10001 = 31;
                  } else if (var15 == null) {
                     var10000 = class707.field10582;
                     var10001 = class501.field7452;
                     if (var2 == 0) {
                        break label60;
                     }
                  } else {
                     var10000 = var14 * 16 + class276.field3848;
                     var10001 = 31;
                  }

                  while(true) {
                     int var16 = var10000 + var10001;
                     ++var14;
                     class27.method191(-1, class164.field2062, var7, -1473285856, class276.field3848, class501.field7452, var16, var6, var15, -256, arg0, class707.field10582);
                     var15 = (class303)class352.field5348.field7218.method5163((byte)103);
                     if (var15 == null) {
                        var10000 = class707.field10582;
                        var10001 = class501.field7452;
                        if (var2 == 0) {
                           break;
                        }
                     } else {
                        var10000 = var14 * 16 + class276.field3848;
                        var10001 = 31;
                     }
                  }
               }

               class40.method279(var10000, var10001, (byte)-69, class164.field2062, class276.field3848);
            }
         }

         class40.method279(class712.field10630, class319.field4561 + var3, (byte)95, class386.field5907, class10.field147 + var4);
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field6908[2] + (arg0 != null ? field6908[1] : field6908[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3425(int arg0) {
      try {
         field6906 = null;
         field6905 = null;
         field6904 = null;
         if (arg0 != -1) {
            field6904 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6908[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3426(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3427(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

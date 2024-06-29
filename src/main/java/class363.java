import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class363 extends InputStream {
   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5623 = new String[]{method2962(method2961("6=.F\u000b1?+@")), method2962(method2961("6=.F:|")), method2962(method2961("/paF\u0004")), method2962(method2961("6=.F8|")), method2962(method2961(":+#\u0004"))};
   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "I"
   )
   public static int field5620;
   @OriginalMember(
      owner = "client!bca",
      name = "b",
      descriptor = "I"
   )
   public static int field5621;
   @OriginalMember(
      owner = "client!bca",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public static String field5622;

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public static void method2958(byte arg0) {
      try {
         if (arg0 <= -45) {
            field5622 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5623[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "read",
      descriptor = "()I",
      line = 20
   )
   public final int read() {
      try {
         class697.method5128(30000L, -82);
         ++field5621;
         return -1;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5623[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(BLjava/lang/String;)V",
      line = 29
   )
   public static final void method2959(byte arg0, String arg1) {
      try {
         ++field5620;
         if (class511.field7808 != null) {
            if (arg0 != -39) {
               method2959((byte)-10, (String)null);
            }

            ++class595.field8754;
            class29 var2 = class578.method4332((byte)-32);
            class577 var3 = class218.method1888(class546.field8192, arg0 ^ -74, var2.field361);
            var3.field8531.method2864(-26110, class714.method5292((byte)-121, arg1));
            var3.field8531.method2862(arg1, true);
            var2.method211(var3, arg0 ^ -81);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5623[3] + arg0 + ',' + (arg1 != null ? field5623[2] : field5623[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(Ldn;Z)Z",
      line = 51
   )
   public static final boolean method2960(class78 arg0, boolean arg1) {
      boolean var2 = class385.field6076 == class190.field2949;
      int var3 = 0;
      short var4 = 0;
      byte var5 = 0;
      arg0.method739(119);
      if (arg0.field1040 >= 0 && arg0.field1044 >= 0 && arg0.field1042 < class247.field3734 && arg0.field1049 < class365.field5634) {
         short var6 = 0;

         for(int var7 = arg0.field1040; var7 <= arg0.field1042; ++var7) {
            for(int var11 = arg0.field1044; var11 <= arg0.field1049; ++var11) {
               class190 var12 = class739.method5427(arg0.field1506, var7, var11);
               if (var12 != null) {
                  class605 var13 = class534.method4108(1, arg0);
                  class605 var14 = var12.field2962;
                  if (var14 == null) {
                     var12.field2962 = var13;
                  } else {
                     while(var14.field8840 != null) {
                        var14 = var14.field8840;
                     }

                     var14.field8840 = var13;
                  }

                  if (var2 && (class284.field4485[var7][var11] & -16777216) != 0) {
                     var3 = class284.field4485[var7][var11];
                     var4 = class183.field2879[var7][var11];
                     var5 = class191.field2968[var7][var11];
                  }

                  if (!arg1 && var12.field2952 != null && var12.field2952.field7024 > var6) {
                     var6 = var12.field2952.field7024;
                  }
               }
            }
         }

         if (var2 && (var3 & -16777216) != 0) {
            for(int var8 = arg0.field1040; var8 <= arg0.field1042; ++var8) {
               for(int var9 = arg0.field1044; var9 <= arg0.field1049; ++var9) {
                  if ((class284.field4485[var8][var9] & -16777216) == 0) {
                     class284.field4485[var8][var9] = var3;
                     class183.field2879[var8][var9] = var4;
                     class191.field2968[var8][var9] = var5;
                  }
               }
            }
         }

         if (arg1) {
            class395.field6195[class108.field1485++] = arg0;
         } else {
            int var10 = class385.field6076 == class190.field2949 ? 1 : 0;
            if (arg0.method233(false)) {
               if (arg0.method228(0)) {
                  arg0.field1503 = class777.field11406[var10];
                  class777.field11406[var10] = arg0;
               } else {
                  arg0.field1503 = class6.field36[var10];
                  class6.field36[var10] = arg0;
                  class67.field884 = true;
               }
            } else {
               arg0.field1503 = class651.field9383[var10];
               class651.field9383[var10] = arg0;
            }
         }

         if (arg1) {
            arg0.field1495 -= var6;
         }

         return true;
      } else {
         return false;
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2961(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2962(char[] arg0) {
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
            var10005 = 94;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

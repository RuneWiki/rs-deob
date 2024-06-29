import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class529 {
   @OriginalMember(
      owner = "client!lm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7264 = new String[]{method3823(method3822("%HYp)")), method3823(method3822("%HYw)")), method3823(method3822("'P\u001b_")), method3823(method3822("%HYq)")), method3823(method3822("-L\u0005Vb=I\u0018Th'\u0005")), method3823(method3822("2\u000bY\u001d|")), method3823(method3822("d\bI\u0013")), method3823(method3822("%HYr)"))};
   @OriginalMember(
      owner = "client!lm",
      name = "d",
      descriptor = "Lol;"
   )
   public static class300 field7261 = new class300();
   @OriginalMember(
      owner = "client!lm",
      name = "f",
      descriptor = "I"
   )
   public static int field7262 = -1;
   @OriginalMember(
      owner = "client!lm",
      name = "b",
      descriptor = "I"
   )
   public static int field7257;
   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "I"
   )
   public static int field7258;
   @OriginalMember(
      owner = "client!lm",
      name = "g",
      descriptor = "I"
   )
   public static int field7259;
   @OriginalMember(
      owner = "client!lm",
      name = "e",
      descriptor = "I"
   )
   public static int field7260;
   @OriginalMember(
      owner = "client!lm",
      name = "c",
      descriptor = "I"
   )
   public static int field7263;

   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
   )
   public static final String method3818(String arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field7258;
         int var3 = 93 % ((-72 - arg1) / 48);
         String var4 = null;
         int var5 = arg0.indexOf(field7264[6]);
         if (~var5 <= -1) {
            var4 = arg0.substring(0, var5 + 4);
            arg0 = arg0.substring(var5 + 4);
         }

         if (arg0.startsWith(field7264[4])) {
            int var6 = arg0.indexOf(" ", field7264[4].length());
            if (var6 >= 0) {
               int var7 = arg0.length();
               arg0 = arg0.substring(0, var6) + " ";
               int var8 = var6 - -1;
               if (var2 || ~var7 < ~var8) {
                  do {
                     arg0 = arg0 + "*";
                     ++var8;
                  } while(~var7 < ~var8);
               }
            }
         }

         return var4 != null ? var4 + arg0 : arg0;
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field7264[3] + (arg0 != null ? field7264[5] : field7264[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method3819(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "(IIZII)V"
   )
   public static final void method3820(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
      try {
         label16: {
            ++field7260;
            if (arg1 == ~class674.field9907.field8451.method2770((byte)-111)) {
               class179.method1380(false, arg1 ^ -37);
               if (!client.field4273) {
                  break label16;
               }
            }

            class71.field881 = class674.field9907.field8451.method2770((byte)-109);
            class594.method4335(true, Integer.MAX_VALUE, 0);
         }

         class619.field8655 = arg2;
         class244.field3059 = arg3;
         class302.field3979 = arg0;
         class618.method4486(arg4);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7264[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3821(int arg0) {
      try {
         if (arg0 == 4) {
            field7261 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7264[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3822(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3823(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

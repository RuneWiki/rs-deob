import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class330 extends class690 {
   @OriginalMember(
      owner = "client!wt",
      name = "o",
      descriptor = "I"
   )
   private int field4728 = -1;
   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4731 = new String[]{method2627(method2626("&\u0000\u0001[")), method2627(method2626("?\u0001Cs\u0015")), method2627(method2626("3[C\u0019@")), method2627(method2626("?\u0001Ct\u0015")), method2627(method2626("?\u0001Cu\u0015")), method2627(method2626("hI\u000eXQu\u0013\u000bQ[.\u0013S")), method2627(method2626("h]")), method2627(method2626("aIBTR$K")), method2627(method2626("hI\u000eXQuE]Q[pES")), method2627(method2626("?\u0001Cv\u0015")), method2627(method2626("hI\u000eXQu\u0013\u000bQ[xES")), method2627(method2626("tZ\u000eXQv"))};
   @OriginalMember(
      owner = "client!wt",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field4730 = false;
   @OriginalMember(
      owner = "client!wt",
      name = "n",
      descriptor = "I"
   )
   public static int field4726;
   @OriginalMember(
      owner = "client!wt",
      name = "m",
      descriptor = "I"
   )
   public static int field4727;
   @OriginalMember(
      owner = "client!wt",
      name = "p",
      descriptor = "I"
   )
   public static int field4729;

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(ZI)Ljava/lang/String;"
   )
   public static final String method2624(boolean arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         if (arg0) {
            field4730 = false;
         }

         ++field4727;
         String var3 = Integer.toString(arg1);
         int var4 = -3 + var3.length();
         if (var2) {
            var3 = var3.substring(0, var4) + "," + var3.substring(var4);
            var4 -= 3;
         }

         while(true) {
            while(~var4 < -1) {
               var3 = var3.substring(0, var4) + "," + var3.substring(var4);
               var4 -= 3;
            }

            if (!var2) {
               if (~var3.length() < -10) {
                  return field4731[8] + var3.substring(0, -8 + var3.length()) + class551.field7554.method3980(class494.field6787, !arg0) + field4731[6] + var3 + field4731[7];
               }

               if (~var3.length() < -7) {
                  return field4731[5] + var3.substring(0, var3.length() + -4) + class551.field7556.method3980(class494.field6787, !arg0) + field4731[6] + var3 + field4731[7];
               }

               return field4731[10] + var3 + field4731[11];
            }

            var3 = var3;
            var4 -= 3;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4731[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(JJ)J"
   )
   public static long method2625(long arg0, long arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4731[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method26(class594 arg0, byte arg1) {
      try {
         ++field4729;
         this.field4728 = arg0.method4280(-19104);
         if (arg1 > -19) {
            field4730 = false;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4731[1] + (arg0 != null ? field4731[2] : field4731[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(ZLhh;)V"
   )
   public final void method27(boolean arg0, class139 arg1) {
      try {
         ++field4726;
         if (!arg0) {
            arg1.method1182(1, this.field4728);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4731[3] + arg0 + ',' + (arg1 != null ? field4731[2] : field4731[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2626(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2627(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

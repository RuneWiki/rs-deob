import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class502 extends class37 {
   @OriginalMember(
      owner = "client!ap",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7463 = new String[]{method3748(method3747("\u001e\u001b\u0010U_")), method3748(method3747("\u0004E\u0010>\n")), method3748(method3747("\u001e\u001b\u0010T_")), method3748(method3747("\u0011\u001eR|")), method3748(method3747("+=\u00040")), method3748(method3747("\u001e\u001b\u0010R_")), method3748(method3747("\u001e\u001b\u0010Q_"))};
   @OriginalMember(
      owner = "client!ap",
      name = "i",
      descriptor = "I"
   )
   public static int field7462 = 0;
   @OriginalMember(
      owner = "client!ap",
      name = "g",
      descriptor = "I"
   )
   public static int field7458;
   @OriginalMember(
      owner = "client!ap",
      name = "e",
      descriptor = "I"
   )
   public static int field7459;
   @OriginalMember(
      owner = "client!ap",
      name = "f",
      descriptor = "I"
   )
   public static int field7460;
   @OriginalMember(
      owner = "client!ap",
      name = "h",
      descriptor = "I"
   )
   public static int field7461;

   @OriginalMember(
      owner = "client!ap",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3743(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "(Ljava/lang/String;ZI)V"
   )
   public static final void method3744(String arg0, boolean arg1, int arg2) {
      try {
         ++field7459;
         ++class762.field11195;
         class180 var3 = class486.method3603(class704.field10546, (byte)-60, class48.field583);
         var3.field2211.method1085(class543.method4009(true, arg0) + 1, (byte)-11);
         var3.field2211.method1042(arg2, 121);
         var3.field2211.method1101(arg0, -97);
         class763.method5527(arg1, var3);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7463[2] + (arg0 != null ? field7463[1] : field7463[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "c",
      descriptor = "(I)I"
   )
   public static final int method3745(int arg0) {
      try {
         if (arg0 != 2) {
            return -9;
         } else {
            ++field7461;
            return class442.field6740 == null ? 0 : class442.field6740.length * 2;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7463[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method3746(int arg0, int arg1) {
      try {
         ++field7460;
         if (~arg1 == -16711936) {
            return -1;
         } else {
            return arg0 != 0 ? 11 : class331.method2515(arg1, (byte)-50);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7463[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3747(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ap",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3748(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

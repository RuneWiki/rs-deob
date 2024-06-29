import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class665 extends class370 {
   @OriginalMember(
      owner = "client!av",
      name = "y",
      descriptor = "I"
   )
   public int field9663;
   @OriginalMember(
      owner = "client!av",
      name = "s",
      descriptor = "I"
   )
   public int field9666;
   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9671 = new String[]{method4767(method4766("/9\u0014X_")), method4767(method4766(" :Vv")), method4767(method4766("5a\u00144\n")), method4767(method4766("/9\u0014&\u001e &N$_")), method4767(method4766("/9\u0014[_")), method4767(method4766("/9\u0014Y_"))};
   @OriginalMember(
      owner = "client!av",
      name = "x",
      descriptor = "Lpia;"
   )
   public static class102 field9664 = new class102("", 11);
   @OriginalMember(
      owner = "client!av",
      name = "v",
      descriptor = "I"
   )
   public static int field9669 = 0;
   @OriginalMember(
      owner = "client!av",
      name = "w",
      descriptor = "I"
   )
   public static int field9665;
   @OriginalMember(
      owner = "client!av",
      name = "u",
      descriptor = "I"
   )
   public static int field9667;
   @OriginalMember(
      owner = "client!av",
      name = "r",
      descriptor = "I"
   )
   public static int field9668;
   @OriginalMember(
      owner = "client!av",
      name = "t",
      descriptor = "Leaa;"
   )
   public static class526 field9670;

   @OriginalMember(
      owner = "client!av",
      name = "<init>",
      descriptor = "(Lwm;Lvh;IIIIIIIII)V"
   )
   public class665(class590 arg0, class378 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field9663 = arg10;
         this.field9666 = arg9;
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field9671[3] + (arg0 != null ? field9671[2] : field9671[1]) + ',' + (arg1 != null ? field9671[2] : field9671[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(I)Loi;"
   )
   public final class79 method1311(int arg0) {
      try {
         ++field9668;
         if (arg0 >= -106) {
            method4765(true);
         }

         return class554.field8209;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9671[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4764(int arg0) {
      try {
         field9670 = null;
         field9664 = null;
         if (arg0 != 0) {
            field9664 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9671[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4765(boolean arg0) {
      try {
         if (!arg0) {
            class434.field6616.method5451(-123);
            ++field9667;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9671[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4766(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4767(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

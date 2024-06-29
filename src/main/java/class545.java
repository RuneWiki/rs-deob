import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class545 {
   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7818 = new String[]{method3918(method3917("5\n2\u0006h")), method3918(method3917("?\u0011p+")), method3918(method3917("*J2i=")), method3918(method3917("5\n2\u0005h"))};
   @OriginalMember(
      owner = "client!dn",
      name = "d",
      descriptor = "Lek;"
   )
   public static class536 field7816 = new class536(37, 7);
   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "I"
   )
   public static int field7815;
   @OriginalMember(
      owner = "client!dn",
      name = "c",
      descriptor = "I"
   )
   public static int field7817;
   @OriginalMember(
      owner = "client!dn",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field7814;

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3915(int arg0) {
      try {
         if (arg0 < 33) {
            method3915(-106);
         }

         field7816 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7818[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(ZIILkf;IBI)V"
   )
   public static final void method3916(boolean arg0, int arg1, int arg2, class266 arg3, int arg4, byte arg5, int arg6) {
      try {
         class648.field9463 = arg1;
         class397.field5738 = arg2;
         class4.field38 = 1;
         if (arg5 != -112) {
            field7816 = null;
         }

         class80.field1029 = null;
         ++field7815;
         class672.field9747 = arg3;
         class57.field705 = arg4;
         class265.field3656 = arg0;
         class282.field3915 = arg6;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field7818[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7818[2] : field7818[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3917(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3918(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

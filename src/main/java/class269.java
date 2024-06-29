import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class269 {
   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3481 = new String[]{method2062(method2061("A;I\t\n")), method2062(method2061("A;I\n\n"))};
   @OriginalMember(
      owner = "client!se",
      name = "c",
      descriptor = "Lnw;"
   )
   public static class616 field3478 = new class616(35, 3);
   @OriginalMember(
      owner = "client!se",
      name = "d",
      descriptor = "I"
   )
   public static int field3477;
   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "I"
   )
   public static int field3479;
   @OriginalMember(
      owner = "client!se",
      name = "b",
      descriptor = "Ldg;"
   )
   public static class436 field3480;

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method2059(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2060(byte arg0) {
      try {
         field3480 = null;
         field3478 = null;
         if (arg0 != -89) {
            field3480 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3481[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2061(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2062(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class class86 extends IOException {
   @OriginalMember(
      owner = "client!aka",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field1136 = method769(method768("y\u0003*\u0005\u000b0"));
   @OriginalMember(
      owner = "client!aka",
      name = "d",
      descriptor = "I"
   )
   public static int field1132 = 0;
   @OriginalMember(
      owner = "client!aka",
      name = "b",
      descriptor = "Leg;"
   )
   public static class118 field1134 = new class118(37, 6);
   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "I"
   )
   public static int field1133;
   @OriginalMember(
      owner = "client!aka",
      name = "c",
      descriptor = "Lkf;"
   )
   public static class266 field1135;

   @OriginalMember(
      owner = "client!aka",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V",
      line = 8
   )
   public class86(String arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(Z)V",
      line = 12
   )
   public static void method767(boolean arg0) {
      try {
         field1135 = null;
         if (arg0) {
            field1132 = 13;
         }

         field1134 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1136 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method768(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method769(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

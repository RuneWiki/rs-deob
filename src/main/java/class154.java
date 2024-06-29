import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class154 extends class500 {
   @OriginalMember(
      owner = "client!qm",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public String field1990;
   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1996 = new String[]{method1268(method1267("Mw\fh")), method1268(method1267("RoN8}Mk\u0014:<")), method1268(method1267("X,N*i")), method1268(method1267("RoNE<"))};
   @OriginalMember(
      owner = "client!qm",
      name = "o",
      descriptor = "Lnw;"
   )
   public static class616 field1991 = new class616(53, 8);
   @OriginalMember(
      owner = "client!qm",
      name = "j",
      descriptor = "I"
   )
   public static int field1992;
   @OriginalMember(
      owner = "client!qm",
      name = "m",
      descriptor = "I"
   )
   public static int field1995;
   @OriginalMember(
      owner = "client!qm",
      name = "k",
      descriptor = "Lqh;"
   )
   public static class74 field1993;
   @OriginalMember(
      owner = "client!qm",
      name = "n",
      descriptor = "Lob;"
   )
   public static class772 field1994;

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1266(int arg0) {
      try {
         field1991 = null;
         field1994 = null;
         if (arg0 != 53) {
            method1266(-112);
         }

         field1993 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1996[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "<init>",
      descriptor = "()V"
   )
   public class154() {
   }

   @OriginalMember(
      owner = "client!qm",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class154(String arg0) {
      try {
         this.field1990 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1996[1] + (arg0 != null ? field1996[2] : field1996[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1267(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1268(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

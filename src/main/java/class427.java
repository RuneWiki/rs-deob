import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class427 {
   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6125 = new String[]{method3164(method3163("\u000b\u0012u?o")), method3164(method3163("\u000b\u0012u\t(6\u0015)\u0014)\u0002I")), method3164(method3163("\u000b\u0012u<o"))};
   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "I"
   )
   public static int field6122 = 0;
   @OriginalMember(
      owner = "client!ns",
      name = "d",
      descriptor = "Loi;"
   )
   public static class80 field6118 = new class80(64);
   @OriginalMember(
      owner = "client!ns",
      name = "f",
      descriptor = "I"
   )
   public static int field6119;
   @OriginalMember(
      owner = "client!ns",
      name = "e",
      descriptor = "I"
   )
   public static int field6120;
   @OriginalMember(
      owner = "client!ns",
      name = "b",
      descriptor = "Ldi;"
   )
   public static class138 field6121;
   @OriginalMember(
      owner = "client!ns",
      name = "g",
      descriptor = "Lda;"
   )
   public static class67 field6124;
   @OriginalMember(
      owner = "client!ns",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field6123;

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public static void method3161(byte arg0) {
      try {
         field6118 = null;
         if (arg0 == 120) {
            field6124 = null;
            field6123 = null;
            field6121 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6125[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(II)V",
      line = 21
   )
   public static final void method3162(int arg0, int arg1) {
      try {
         if (arg1 > -38) {
            method3162(16, 98);
         }

         ++field6120;
         class157.field2246.method726(arg0, 25324);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6125[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 34
   )
   public final String toString() {
      try {
         ++field6119;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6125[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3163(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3164(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

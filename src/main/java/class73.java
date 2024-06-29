import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class73 {
   @OriginalMember(
      owner = "client!vf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1177 = new String[]{method822(method821("T)\u0013q\u001fq;Ol\u001eEg")), method822(method821("T)\u0013DX"))};
   @OriginalMember(
      owner = "client!vf",
      name = "d",
      descriptor = "Lbu;"
   )
   public static class234 field1173 = new class234(10, 2, 2, 0);
   @OriginalMember(
      owner = "client!vf",
      name = "e",
      descriptor = "[F"
   )
   public static float[] field1176 = new float[16];
   @OriginalMember(
      owner = "client!vf",
      name = "a",
      descriptor = "Lsr;"
   )
   public static class78 field1175 = new class78(2);
   @OriginalMember(
      owner = "client!vf",
      name = "b",
      descriptor = "I"
   )
   public static int field1172;
   @OriginalMember(
      owner = "client!vf",
      name = "c",
      descriptor = "I"
   )
   public static int field1174;

   @OriginalMember(
      owner = "client!vf",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field1174;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1177[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method820(int arg0) {
      try {
         field1173 = null;
         if (arg0 == -23998) {
            field1175 = null;
            field1176 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1177[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method821(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method822(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

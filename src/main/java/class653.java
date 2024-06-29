import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class653 {
   @OriginalMember(
      owner = "client!kp",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field9256 = method4776(method4775("(@-Nt"));
   @OriginalMember(
      owner = "client!kp",
      name = "h",
      descriptor = "I"
   )
   public static int field9253 = -50;
   @OriginalMember(
      owner = "client!kp",
      name = "d",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field9251 = new String[]{method4776(method4775("&^")), method4776(method4775("'U")), method4776(method4775("%B")), method4776(method4775("3D")), method4776(method4775("-\\"))};
   @OriginalMember(
      owner = "client!kp",
      name = "f",
      descriptor = "I"
   )
   public int field9250;
   @OriginalMember(
      owner = "client!kp",
      name = "g",
      descriptor = "I"
   )
   public int field9252;
   @OriginalMember(
      owner = "client!kp",
      name = "c",
      descriptor = "I"
   )
   public int field9255;
   @OriginalMember(
      owner = "client!kp",
      name = "e",
      descriptor = "Z"
   )
   public boolean field9248;
   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "Z"
   )
   public boolean field9249;
   @OriginalMember(
      owner = "client!kp",
      name = "b",
      descriptor = "[Leba;"
   )
   public static class489[] field9254;

   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4774(int arg0) {
      try {
         field9251 = null;
         field9254 = null;
         if (arg0 != -50) {
            method4774(-6);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9256 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4775(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4776(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

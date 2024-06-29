import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class68 {
   @OriginalMember(
      owner = "client!mia",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field791 = method646(method645("}A\u000e=V8"));
   @OriginalMember(
      owner = "client!mia",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field789 = new int[32];
   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "I"
   )
   public int field779;
   @OriginalMember(
      owner = "client!mia",
      name = "k",
      descriptor = "I"
   )
   public int field780;
   @OriginalMember(
      owner = "client!mia",
      name = "g",
      descriptor = "I"
   )
   public int field782;
   @OriginalMember(
      owner = "client!mia",
      name = "j",
      descriptor = "I"
   )
   public static int field783;
   @OriginalMember(
      owner = "client!mia",
      name = "b",
      descriptor = "I"
   )
   public static int field784;
   @OriginalMember(
      owner = "client!mia",
      name = "c",
      descriptor = "I"
   )
   public int field785;
   @OriginalMember(
      owner = "client!mia",
      name = "h",
      descriptor = "I"
   )
   public int field786;
   @OriginalMember(
      owner = "client!mia",
      name = "d",
      descriptor = "I"
   )
   public int field788;
   @OriginalMember(
      owner = "client!mia",
      name = "i",
      descriptor = "I"
   )
   public int field790;
   @OriginalMember(
      owner = "client!mia",
      name = "e",
      descriptor = "[B"
   )
   public byte[] field781;
   @OriginalMember(
      owner = "client!mia",
      name = "l",
      descriptor = "[B"
   )
   public byte[] field787;

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method644(int arg0) {
      try {
         if (arg0 >= 5) {
            field789 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field791 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method645(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method646(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

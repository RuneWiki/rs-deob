import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class653 {
   @OriginalMember(
      owner = "client!of",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9146 = new String[]{method4725(method4724("\u0012\u001cC\u00072.\u000e\u001f\u001a3\u001aR")), method4725(method4724("\u0012\u001cC2u"))};
   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "I"
   )
   public static int field9145 = 0;
   @OriginalMember(
      owner = "client!of",
      name = "b",
      descriptor = "I"
   )
   public static int field9143;
   @OriginalMember(
      owner = "client!of",
      name = "c",
      descriptor = "I"
   )
   public static int field9144;

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method4723(int arg0) {
      try {
         ++field9143;
         if (arg0 != 32290) {
            field9145 = -38;
         }

         return class364.field5146 == this | class421.field5901 == this;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9146[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field9144;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9146[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4724(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!of",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4725(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

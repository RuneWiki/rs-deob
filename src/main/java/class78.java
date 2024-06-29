import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class78 {
   @OriginalMember(
      owner = "client!sr",
      name = "b",
      descriptor = "I"
   )
   public int field1242;
   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1247 = new String[]{method854(method853("|jv}|aq,\u007f=")), method854(method853("|jv5z\\l*({h0")), method854(method853("|jv\u0000="))};
   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field1246 = false;
   @OriginalMember(
      owner = "client!sr",
      name = "c",
      descriptor = "I"
   )
   public static int field1244;
   @OriginalMember(
      owner = "client!sr",
      name = "d",
      descriptor = "Lin;"
   )
   public static class508 field1245;
   @OriginalMember(
      owner = "client!sr",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field1243;

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method852(boolean arg0) {
      try {
         if (!arg0) {
            method852(true);
         }

         field1245 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1247[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field1244;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1247[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class78(int arg0) {
      try {
         this.field1242 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1247[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method853(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method854(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

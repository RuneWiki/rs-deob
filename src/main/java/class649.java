import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class649 {
   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9418 = new String[]{method4761(method4760("51\u000fdgq")), method4761(method4760("51\u000fdR6\n\u001a8O7>F")), method4761(method4760("51\u000fddq"))};
   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "I"
   )
   public static int field9412 = -1;
   @OriginalMember(
      owner = "client!lha",
      name = "e",
      descriptor = "I"
   )
   public static int field9414;
   @OriginalMember(
      owner = "client!lha",
      name = "c",
      descriptor = "I"
   )
   public static int field9416;
   @OriginalMember(
      owner = "client!lha",
      name = "b",
      descriptor = "I"
   )
   public static int field9417;
   @OriginalMember(
      owner = "client!lha",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9415;
   @OriginalMember(
      owner = "client!lha",
      name = "f",
      descriptor = "[Lmc;"
   )
   public static class144[] field9413;

   @OriginalMember(
      owner = "client!lha",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field9417;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9418[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4758(int arg0) {
      try {
         field9415 = null;
         if (arg0 == 29760) {
            field9413 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9418[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4759(int arg0) {
      try {
         class378.method2955();
         ++field9416;
         if (arg0 != -1) {
            field9413 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9418[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4760(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4761(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

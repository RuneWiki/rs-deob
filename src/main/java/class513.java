import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class513 {
   @OriginalMember(
      owner = "client!lf",
      name = "c",
      descriptor = "Lcka;"
   )
   private class174 field7824;
   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "J"
   )
   public long field7825;
   @OriginalMember(
      owner = "client!lf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7830 = new String[]{method3981(method3980("t?J\\\u0005")), method3981(method3980("t?J{Dv8\btW}q")), method3981(method3980("cwJ3P")), method3981(method3980("v,\bq")), method3981(method3980("t?J!Dv0\u0010#\u0005"))};
   @OriginalMember(
      owner = "client!lf",
      name = "e",
      descriptor = "Luk;"
   )
   public static class498 field7826 = new class498(126, -1);
   @OriginalMember(
      owner = "client!lf",
      name = "b",
      descriptor = "I"
   )
   public static int field7828 = 104;
   @OriginalMember(
      owner = "client!lf",
      name = "f",
      descriptor = "I"
   )
   public static int field7827;
   @OriginalMember(
      owner = "client!lf",
      name = "d",
      descriptor = "I"
   )
   public static int field7829;

   @OriginalMember(
      owner = "client!lf",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field7829;
         this.field7824.method1596(this.field7825, 120);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7830[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3979(int arg0) {
      try {
         field7826 = null;
         if (arg0 >= -21) {
            field7827 = -61;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7830[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "<init>",
      descriptor = "(Lcka;JI)V"
   )
   public class513(class174 arg0, long arg1, int arg2) {
      try {
         this.field7824 = arg0;
         this.field7825 = arg1;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7830[4] + (arg0 != null ? field7830[2] : field7830[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3980(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3981(char[] arg0) {
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
            var10005 = 89;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

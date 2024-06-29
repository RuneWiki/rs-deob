import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class521 {
   @OriginalMember(
      owner = "client!pi",
      name = "b",
      descriptor = "I"
   )
   public int field7587;
   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7588 = new String[]{method3930(method3929("Pu_&DNu\u0005$\u0005")), method3930(method3929("Ni\u001dv")), method3930(method3929("[2_4P")), method3930(method3929("Pu_[\u0005")), method3930(method3929("Pu_nBsh\u0003sCG4"))};
   @OriginalMember(
      owner = "client!pi",
      name = "c",
      descriptor = "I"
   )
   public static int field7585;
   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "I"
   )
   public static int field7586;

   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3928(byte arg0) {
      try {
         int var2 = 58 % ((arg0 - -43) / 46);
         ++field7585;
         return this.field7587;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7588[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field7586;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7588[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class521(String arg0, int arg1) {
      try {
         this.field7587 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7588[0] + (arg0 != null ? field7588[2] : field7588[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3929(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3930(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

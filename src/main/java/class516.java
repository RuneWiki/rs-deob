import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class516 {
   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7090 = new String[]{method3747(method3746("nb^Sg")), method3747(method3746("nb^Tg"))};
   @OriginalMember(
      owner = "client!aa",
      name = "e",
      descriptor = "Lbga;"
   )
   public static class378 field7087 = new class378(115, 4);
   @OriginalMember(
      owner = "client!aa",
      name = "d",
      descriptor = "I"
   )
   public static int field7086;
   @OriginalMember(
      owner = "client!aa",
      name = "b",
      descriptor = "I"
   )
   public static int field7088;
   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "I"
   )
   public static int field7089;
   @OriginalMember(
      owner = "client!aa",
      name = "c",
      descriptor = "Lc;"
   )
   public static class198 field7085;

   @OriginalMember(
      owner = "client!aa",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3744(int arg0) {
      try {
         field7087 = null;
         if (arg0 < -48) {
            field7085 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7090[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method3745(int arg0) {
      try {
         ++field7086;
         if (arg0 != 115) {
            field7087 = null;
         }

         return class616.field8588 == 1 ? class40.field462 : class192.field2343;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7090[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3746(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3747(char[] arg0) {
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
            var10005 = 3;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

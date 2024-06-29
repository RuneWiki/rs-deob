import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class739 {
   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "Lcka;"
   )
   private class174 field10977;
   @OriginalMember(
      owner = "client!po",
      name = "b",
      descriptor = "J"
   )
   public long field10976;
   @OriginalMember(
      owner = "client!po",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10982 = new String[]{method5429(method5428("\u007fe4[@")), method5429(method5428("a\u007fvu")), method5429(method5428("\u007fe4%\u0001acn'@")), method5429(method5428("t$47\u0015")), method5429(method5428("\u007fe4\u007f\u0001akvp\u0012j\""))};
   @OriginalMember(
      owner = "client!po",
      name = "g",
      descriptor = "I"
   )
   public static int field10978 = 0;
   @OriginalMember(
      owner = "client!po",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field10980 = true;
   @OriginalMember(
      owner = "client!po",
      name = "f",
      descriptor = "I"
   )
   public static int field10981 = -1;
   @OriginalMember(
      owner = "client!po",
      name = "d",
      descriptor = "I"
   )
   public static int field10979;
   @OriginalMember(
      owner = "client!po",
      name = "e",
      descriptor = "Lsha;"
   )
   public static class464 field10975;

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5426(int arg0) {
      try {
         if (arg0 != -7712) {
            method5427(-79, 80, 49);
         }

         field10975 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10982[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.field10977.method1596(this.field10976, -41);
         ++field10979;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10982[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(III)Lika;"
   )
   public static final class190 method5427(int arg0, int arg1, int arg2) {
      if (class711.field10694[arg0][arg1][arg2] == null) {
         boolean var3 = class711.field10694[0][arg1][arg2] != null && class711.field10694[0][arg1][arg2].field2959 != null;
         if (var3 && arg0 >= class461.field7016 - 1) {
            return null;
         }

         class125.method1184(arg0, arg1, arg2);
      }

      return class711.field10694[arg0][arg1][arg2];
   }

   @OriginalMember(
      owner = "client!po",
      name = "<init>",
      descriptor = "(Lcka;J[Llf;)V"
   )
   public class739(class174 arg0, long arg1, class513[] arg2) {
      try {
         this.field10977 = arg0;
         this.field10976 = arg1;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10982[2] + (arg0 != null ? field10982[3] : field10982[1]) + ',' + arg1 + ',' + (arg2 != null ? field10982[3] : field10982[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5428(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!po",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5429(char[] arg0) {
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
            var10005 = 10;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

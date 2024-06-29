import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class396 {
   @OriginalMember(
      owner = "client!fha",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public String field5814;
   @OriginalMember(
      owner = "client!fha",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public String field5813;
   @OriginalMember(
      owner = "client!fha",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public String field5819;
   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5822 = new String[]{method3058(method3057(">uqD|1sy\u001e~p")), method3058(method3057("6h|\u0006")), method3058(method3057("#3>D=")), method3058(method3057(">uqD\u0001p"))};
   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "I"
   )
   public static int field5815 = -1;
   @OriginalMember(
      owner = "client!fha",
      name = "i",
      descriptor = "Lag;"
   )
   public static class710 field5816 = new class710(0, -1);
   @OriginalMember(
      owner = "client!fha",
      name = "e",
      descriptor = "I"
   )
   public static int field5817 = -1;
   @OriginalMember(
      owner = "client!fha",
      name = "f",
      descriptor = "Lhm;"
   )
   public static class230 field5818 = new class230(4, 1, 1, 1);
   @OriginalMember(
      owner = "client!fha",
      name = "d",
      descriptor = "Lkea;"
   )
   public static class248 field5821 = new class248("", 16);
   @OriginalMember(
      owner = "client!fha",
      name = "b",
      descriptor = "I"
   )
   public static int field5820;

   @OriginalMember(
      owner = "client!fha",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
      line = 17
   )
   public class396(String arg0, String arg1, String arg2) {
      try {
         this.field5814 = arg1;
         this.field5813 = arg0;
         this.field5819 = arg2;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5822[0] + (arg0 != null ? field5822[2] : field5822[1]) + ',' + (arg1 != null ? field5822[2] : field5822[1]) + ',' + (arg2 != null ? field5822[2] : field5822[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(I)V",
      line = 27
   )
   public static void method3056(int arg0) {
      try {
         field5818 = null;
         field5816 = null;
         int var1 = 70 / ((arg0 - 46) / 61);
         field5821 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5822[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3057(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3058(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

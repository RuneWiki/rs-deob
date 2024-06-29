import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class409 {
   @OriginalMember(
      owner = "client!vi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6009 = new String[]{method3206(method3205("\u0003N\u000b_@")), method3206(method3205("\u0016\u0015I\u001d")), method3206(method3205("\u000e\t\u000b3\u0015")), method3206(method3205("\u000e\t\u000b0\u0015"))};
   @OriginalMember(
      owner = "client!vi",
      name = "g",
      descriptor = "I"
   )
   public static int field6007 = -1;
   @OriginalMember(
      owner = "client!vi",
      name = "n",
      descriptor = "Lcv;"
   )
   public static class249 field5996 = new class249(method3206(method3205("/)u")), 2);
   @OriginalMember(
      owner = "client!vi",
      name = "f",
      descriptor = "I"
   )
   public int field5994;
   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "I"
   )
   public int field5995;
   @OriginalMember(
      owner = "client!vi",
      name = "j",
      descriptor = "I"
   )
   public int field5997;
   @OriginalMember(
      owner = "client!vi",
      name = "d",
      descriptor = "I"
   )
   public int field5998;
   @OriginalMember(
      owner = "client!vi",
      name = "k",
      descriptor = "I"
   )
   public int field5999;
   @OriginalMember(
      owner = "client!vi",
      name = "c",
      descriptor = "I"
   )
   public int field6000;
   @OriginalMember(
      owner = "client!vi",
      name = "o",
      descriptor = "I"
   )
   public int field6001;
   @OriginalMember(
      owner = "client!vi",
      name = "m",
      descriptor = "I"
   )
   public int field6002;
   @OriginalMember(
      owner = "client!vi",
      name = "h",
      descriptor = "I"
   )
   public int field6003;
   @OriginalMember(
      owner = "client!vi",
      name = "l",
      descriptor = "I"
   )
   public static int field6004;
   @OriginalMember(
      owner = "client!vi",
      name = "e",
      descriptor = "I"
   )
   public int field6005;
   @OriginalMember(
      owner = "client!vi",
      name = "b",
      descriptor = "I"
   )
   public int field6006;
   @OriginalMember(
      owner = "client!vi",
      name = "i",
      descriptor = "I"
   )
   public int field6008;

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(Lvi;I)Z"
   )
   public final boolean method3203(class409 arg0, int arg1) {
      try {
         if (arg1 > -83) {
            this.field5999 = 24;
         }

         ++field6004;
         return this.field6003 == arg0.field6003 && ~this.field5994 == ~arg0.field5994 && ~this.field6002 == ~arg0.field6002;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6009[2] + (arg0 != null ? field6009[0] : field6009[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3204(int arg0) {
      try {
         if (arg0 == 2) {
            field5996 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6009[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3205(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3206(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

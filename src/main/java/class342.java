import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class342 extends class407 {
   @OriginalMember(
      owner = "client!ww",
      name = "p",
      descriptor = "I"
   )
   public int field5200;
   @OriginalMember(
      owner = "client!ww",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5205 = new String[]{method2767(method2766("C\u007fy\u001d\u0018")), method2767(method2766("Z};7")), method2767(method2766("O&yuM")), method2767(method2766("C\u007fygYZa#e\u0018")), method2767(method2766("C\u007fy\u001a\u0018")), method2767(method2766("C\u007fy\u001c\u0018"))};
   @OriginalMember(
      owner = "client!ww",
      name = "n",
      descriptor = "Leh;"
   )
   public static class19 field5203 = new class19(1);
   @OriginalMember(
      owner = "client!ww",
      name = "r",
      descriptor = "I"
   )
   public static int field5204 = 0;
   @OriginalMember(
      owner = "client!ww",
      name = "s",
      descriptor = "I"
   )
   public static int field5198;
   @OriginalMember(
      owner = "client!ww",
      name = "q",
      descriptor = "I"
   )
   public static int field5202;
   @OriginalMember(
      owner = "client!ww",
      name = "o",
      descriptor = "Lf;"
   )
   public static class123 field5201;
   @OriginalMember(
      owner = "client!ww",
      name = "m",
      descriptor = "Lica;"
   )
   public static class354 field5199;

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(B)I",
      line = 6
   )
   public static final int method2764(byte arg0) {
      try {
         ++field5198;
         int var1 = -40 / ((arg0 - -77) / 46);
         return class407.field6335++;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5205[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "c",
      descriptor = "(I)V",
      line = 16
   )
   public static void method2765(int arg0) {
      try {
         field5203 = null;
         field5201 = null;
         if (arg0 == 0) {
            field5199 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5205[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(I)Lbda;",
      line = 29
   )
   public final class783 method193(int arg0) {
      try {
         ++field5202;
         if (arg0 != -1) {
            this.method193(4);
         }

         return class759.field11226;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5205[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "<init>",
      descriptor = "(ILrga;Lgea;III)V",
      line = 45
   )
   public class342(int arg0, class694 arg1, class750 arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field5200 = arg5;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field5205[3] + arg0 + ',' + (arg1 != null ? field5205[2] : field5205[1]) + ',' + (arg2 != null ? field5205[2] : field5205[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2766(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ww",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2767(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

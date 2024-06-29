import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class581 {
   @OriginalMember(
      owner = "client!pp",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8580 = method4346(method4345("\t|=QB"));
   @OriginalMember(
      owner = "client!pp",
      name = "b",
      descriptor = "Lsn;"
   )
   public static class675 field8574 = new class675();
   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8576;
   @OriginalMember(
      owner = "client!pp",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8575;
   @OriginalMember(
      owner = "client!pp",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field8577;
   @OriginalMember(
      owner = "client!pp",
      name = "f",
      descriptor = "I"
   )
   public static int field8579;
   @OriginalMember(
      owner = "client!pp",
      name = "d",
      descriptor = "Lbj;"
   )
   public static class704 field8578;

   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4344(int arg0) {
      try {
         field8578 = null;
         field8574 = null;
         field8576 = null;
         if (arg0 > -25) {
            field8575 = null;
         }

         field8577 = null;
         field8575 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8580 + arg0 + ')');
      }
   }

   static {
      String var0 = method4346(method4345(",bx~\u0005\u000eb"));

      try {
         var0 = System.getProperty(method4346(method4345("\u0013meqD\u000fi}t\u0005\u000b"))).toLowerCase();
      } catch (Exception var11) {
      }

      var0.toLowerCase();
      String var1 = method4346(method4345(",bx~\u0005\u000eb"));

      try {
         var1 = System.getProperty(method4346(method4345("\u0013meqD\u000fiac\u0003\u0016b"))).toLowerCase();
      } catch (Exception var10) {
      }

      var1.toLowerCase();
      String var2 = method4346(method4345(",bx~\u0005\u000eb"));

      try {
         var2 = System.getProperty(method4346(method4345("\u0016\u007f=~\u000b\u0014i"))).toLowerCase();
      } catch (Exception var9) {
      }

      field8576 = var2.toLowerCase();
      String var3 = method4346(method4345(",bx~\u0005\u000eb"));

      try {
         var3 = System.getProperty(method4346(method4345("\u0016\u007f=q\u0018\u001ad"))).toLowerCase();
      } catch (Exception var8) {
      }

      field8575 = var3.toLowerCase();
      String var4 = method4346(method4345(",bx~\u0005\u000eb"));

      try {
         var4 = System.getProperty(method4346(method4345("\u0016\u007f=f\u000f\u000b\u007fz\u007f\u0004"))).toLowerCase();
      } catch (Exception var7) {
      }

      var4.toLowerCase();
      String var5 = method4346(method4345("\u0007#"));

      try {
         var5 = System.getProperty(method4346(method4345("\f\u007fvbD\u0011c~u"))).toLowerCase();
      } catch (Exception var6) {
      }

      new File(var5);
      field8577 = new int[]{0, 1, 2, 3, 4, 5, 6, 14};
      field8579 = -1;
   }

   @OriginalMember(
      owner = "client!pp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4345(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4346(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

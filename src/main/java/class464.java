import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class464 {
   @OriginalMember(
      owner = "client!rp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6365 = new String[]{method3408(method3407("-\u001a\u0003\u000f-")), method3408(method3407("-\u001a\u0003\f-")), method3408(method3407("$D\u0003cx")), method3408(method3407("1\u001fA!"))};
   @OriginalMember(
      owner = "client!rp",
      name = "c",
      descriptor = "B"
   )
   public byte field6361;
   @OriginalMember(
      owner = "client!rp",
      name = "h",
      descriptor = "I"
   )
   public static int field6358;
   @OriginalMember(
      owner = "client!rp",
      name = "d",
      descriptor = "I"
   )
   public int field6364;
   @OriginalMember(
      owner = "client!rp",
      name = "f",
      descriptor = "Lqq;"
   )
   public static class505 field6357;
   @OriginalMember(
      owner = "client!rp",
      name = "i",
      descriptor = "Ljava/io/FileOutputStream;"
   )
   public static FileOutputStream field6362;
   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field6356;
   @OriginalMember(
      owner = "client!rp",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public String field6359;
   @OriginalMember(
      owner = "client!rp",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public String field6360;
   @OriginalMember(
      owner = "client!rp",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   public String field6363;

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(ILwm;)Lhca;"
   )
   public static final class519 method3405(int arg0, class594 arg1) {
      try {
         if (arg0 != 24965) {
            method3405(-122, (class594)null);
         }

         ++field6358;
         class101 var2 = class44.method375((byte)-127, arg1);
         int var3 = arg1.method4302(true);
         int var4 = arg1.method4302(true);
         int var5 = arg1.method4280(arg0 ^ -11035);
         return new class519(var2.field1297, var2.field1309, var2.field1301, var2.field1302, var2.field1299, var2.field1311, var2.field1303, var2.field1298, var2.field1306, var3, var4, var5);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field6365[1] + arg0 + ',' + (arg1 != null ? field6365[2] : field6365[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3406(int arg0) {
      try {
         if (arg0 == 21452) {
            field6357 = null;
            field6362 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6365[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3407(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3408(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

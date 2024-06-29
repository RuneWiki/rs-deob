import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class129 {
   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "I"
   )
   public int field1847;
   @OriginalMember(
      owner = "client!cca",
      name = "b",
      descriptor = "Lcka;"
   )
   private class174 field1850;
   @OriginalMember(
      owner = "client!cca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1854 = new String[]{method1227(method1226("xj~bZrg~ Ual7")), method1227(method1226("`'1bA")), method1227(method1226("xj~b\u0000rgv8\u00023")), method1227(method1226("u|s ")), method1227(method1226("xj~b}3"))};
   @OriginalMember(
      owner = "client!cca",
      name = "f",
      descriptor = "Luk;"
   )
   public static class498 field1846 = new class498(73, -1);
   @OriginalMember(
      owner = "client!cca",
      name = "d",
      descriptor = "Lgv;"
   )
   public static class12 field1851 = new class12(method1227(method1226("WF\\\rp")), "", method1227(method1226("wf|-P")), 4);
   @OriginalMember(
      owner = "client!cca",
      name = "h",
      descriptor = "Lgv;"
   )
   public static class12 field1852 = new class12(method1227(method1226("W@I\t")), "", "", 0);
   @OriginalMember(
      owner = "client!cca",
      name = "c",
      descriptor = "J"
   )
   public static long field1853 = 20000000L;
   @OriginalMember(
      owner = "client!cca",
      name = "g",
      descriptor = "I"
   )
   public static int field1849;
   @OriginalMember(
      owner = "client!cca",
      name = "e",
      descriptor = "[[B"
   )
   public static byte[][] field1848;

   @OriginalMember(
      owner = "client!cca",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field1849;
         this.field1850.method1597(this.field1847, false);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1854[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "<init>",
      descriptor = "(Lcka;II)V"
   )
   public class129(class174 arg0, int arg1, int arg2) {
      try {
         this.field1847 = arg2;
         this.field1850 = arg0;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1854[2] + (arg0 != null ? field1854[1] : field1854[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1225(byte arg0) {
      try {
         field1846 = null;
         if (arg0 <= 61) {
            method1225((byte)-128);
         }

         field1848 = null;
         field1851 = null;
         field1852 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1854[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1226(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1227(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

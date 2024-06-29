import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class364 {
   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5151 = new String[]{method2825(method2824("No\u001dM\f")), method2825(method2824("No\u001dN\f"))};
   @OriginalMember(
      owner = "client!tk",
      name = "e",
      descriptor = "Lof;"
   )
   public static class653 field5146 = new class653();
   @OriginalMember(
      owner = "client!tk",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public static String field5148;
   @OriginalMember(
      owner = "client!tk",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public static String field5147;
   @OriginalMember(
      owner = "client!tk",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field5150;
   @OriginalMember(
      owner = "client!tk",
      name = "f",
      descriptor = "D"
   )
   public static double field5144;
   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "I"
   )
   public static int field5145;
   @OriginalMember(
      owner = "client!tk",
      name = "g",
      descriptor = "I"
   )
   public static int field5149;

   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "(I)Ljava/lang/String;"
   )
   public static final String method2822(int arg0) {
      try {
         ++field5145;
         if (arg0 != -14167) {
            field5146 = null;
         }

         if (!class666.field9473 && class717.field10512 != null) {
            return (class717.field10512.field3011 == null || ~class717.field10512.field3011.length() == -1) && class717.field10512.field3000 != null && ~class717.field10512.field3000.length() < -1 ? class717.field10512.field3000 : class717.field10512.field3011;
         } else {
            return "";
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5151[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2823(byte arg0) {
      try {
         field5146 = null;
         field5150 = null;
         field5148 = null;
         if (arg0 >= -80) {
            field5149 = 55;
         }

         field5147 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5151[1] + arg0 + ')');
      }
   }

   static {
      String var0 = method2825(method2824("ojXbKMj"));

      try {
         var0 = System.getProperty(method2825(method2824("PeEm\nLa]hKH"))).toLowerCase();
      } catch (Exception var15) {
      }

      var0.toLowerCase();
      String var1 = method2825(method2824("ojXbKMj"));

      try {
         var1 = System.getProperty(method2825(method2824("PeEm\nLaA\u007fMUj"))).toLowerCase();
      } catch (Exception var14) {
      }

      var1.toLowerCase();
      String var2 = method2825(method2824("ojXbKMj"));

      try {
         var2 = System.getProperty(method2825(method2824("Uw\u001dbEWa"))).toLowerCase();
      } catch (Exception var13) {
      }

      field5148 = var2.toLowerCase();
      String var3 = method2825(method2824("ojXbKMj"));

      try {
         var3 = System.getProperty(method2825(method2824("Uw\u001dmVYl"))).toLowerCase();
      } catch (Exception var12) {
      }

      field5147 = var3.toLowerCase();
      String var4 = method2825(method2824("ojXbKMj"));

      try {
         var4 = System.getProperty(method2825(method2824("Uw\u001dzAHwZcJ"))).toLowerCase();
      } catch (Exception var11) {
      }

      var4.toLowerCase();
      String var5 = method2825(method2824("D+"));

      try {
         var5 = System.getProperty(method2825(method2824("OwV~\nRk^i"))).toLowerCase();
      } catch (Exception var10) {
      }

      new File(var5);
      field5150 = new int[120];
      int var6 = 0;

      for(int var7 = 0; ~var7 > -121; ++var7) {
         int var8 = var7 + 1;
         int var9 = (int)((double)var8 + Math.pow(2.0D, (double)var8 / 7.0D) * 300.0D);
         var6 += var9;
         field5150[var7] = var6 / 4;
      }

   }

   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2824(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2825(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

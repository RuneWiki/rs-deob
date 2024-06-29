import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class247 {
   @OriginalMember(
      owner = "client!lba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3785 = new String[]{method2145(method2144("6l*98\u0019&")), method2145(method2144("6l*99\u0019&")), method2145(method2144("6l*9?\u0019&")), method2145(method2144("! e9\u0016")), method2145(method2144("4{'{")), method2145(method2144("6l*9:\u0019&"))};
   @OriginalMember(
      owner = "client!lba",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field3779 = new int[1];
   @OriginalMember(
      owner = "client!lba",
      name = "i",
      descriptor = "F"
   )
   public static float field3783;
   @OriginalMember(
      owner = "client!lba",
      name = "b",
      descriptor = "I"
   )
   public static int field3778;
   @OriginalMember(
      owner = "client!lba",
      name = "f",
      descriptor = "I"
   )
   public static int field3782;
   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "I"
   )
   public static int field3784;
   @OriginalMember(
      owner = "client!lba",
      name = "c",
      descriptor = "J"
   )
   public long field3777;
   @OriginalMember(
      owner = "client!lba",
      name = "e",
      descriptor = "Llba;"
   )
   public class247 field3776;
   @OriginalMember(
      owner = "client!lba",
      name = "d",
      descriptor = "Llba;"
   )
   public class247 field3781;
   @OriginalMember(
      owner = "client!lba",
      name = "h",
      descriptor = "Ljava/lang/Thread;"
   )
   public static Thread field3780;

   @OriginalMember(
      owner = "client!lba",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method2140(byte arg0) {
      try {
         ++field3778;
         if (this.field3776 != null) {
            this.field3776.field3781 = this.field3781;
            int var2 = -66 / ((arg0 - -15) / 56);
            this.field3781.field3776 = this.field3776;
            this.field3781 = null;
            this.field3776 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3785[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method2141(int arg0) {
      try {
         field3779 = null;
         if (arg0 != 12) {
            method2142((String)null, -97, true, (byte)-98);
         }

         field3780 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3785[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(Ljava/lang/String;IZB)V"
   )
   public static final void method2142(String arg0, int arg1, boolean arg2, byte arg3) {
      try {
         ++field3782;
         class455.method3508(1);
         class217.method1885((byte)14);
         class759.method5480(3030);
         class533.method3985(arg0, arg1, arg2, (byte)-115);
         class32.method376((byte)-117);
         class625.method4602(class54.field794, arg3 ^ 5);
         class684.method4983(27395, class54.field794);
         class360.method2828(0, class790.field11506, class54.field794);
         class673.method4871((byte)-89);
         if (arg3 != 5) {
            method2141(-64);
         }

         class540.method4022(false, class261.field4011);
         class258.method2194(-124);
         class345.method2741(0);
         if (~class394.field5712 == -4) {
            class755.method5457(4, false);
         } else if (class394.field5712 == 7) {
            class755.method5457(8, false);
         } else if (~class394.field5712 == -10) {
            class755.method5457(10, false);
         } else if (class394.field5712 == 11) {
            class755.method5457(12, false);
         } else {
            if (class394.field5712 == 1 || class394.field5712 == 2) {
               class192.method1696(-10075);
            }

         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3785[5] + (arg0 != null ? field3785[3] : field3785[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method2143(int arg0) {
      try {
         if (arg0 != 29962) {
            this.field3777 = 116L;
         }

         ++field3784;
         return this.field3776 != null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3785[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2144(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2145(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

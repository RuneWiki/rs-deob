import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class423 extends class575 {
   @OriginalMember(
      owner = "client!tb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6034 = new String[]{method3131(method3130("`\\6V\u0002")), method3131(method3130("`\\6W\u0002")), method3131(method3130("o\u00106:W")), method3131(method3130("zKtx")), method3131(method3130("`\\6U\u0002"))};
   @OriginalMember(
      owner = "client!tb",
      name = "b",
      descriptor = "Lns;"
   )
   public static class427 field6028 = new class427();
   @OriginalMember(
      owner = "client!tb",
      name = "d",
      descriptor = "I"
   )
   public static int field6029 = 0;
   @OriginalMember(
      owner = "client!tb",
      name = "e",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field6030 = new Color[]{new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650)};
   @OriginalMember(
      owner = "client!tb",
      name = "c",
      descriptor = "I"
   )
   public static int field6027;
   @OriginalMember(
      owner = "client!tb",
      name = "g",
      descriptor = "I"
   )
   public static int field6031;
   @OriginalMember(
      owner = "client!tb",
      name = "f",
      descriptor = "I"
   )
   public static int field6033;
   @OriginalMember(
      owner = "client!tb",
      name = "h",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field6032;

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3127(int arg0) {
      try {
         class223.method1751(arg0);
         ++field6027;
         class581.method4207(50);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6034[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3128(int arg0) {
      try {
         field6030 = null;
         field6032 = null;
         field6028 = null;
         int var1 = -76 % ((-19 - arg0) / 36);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6034[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(ILmk;IILka;I)V"
   )
   public static final void method3129(int arg0, class62 arg1, int arg2, int arg3, class500 arg4, int arg5) {
      try {
         ++field6031;
         if (arg4 != null) {
            arg1.method474(arg4.method197(), arg5, arg3, arg4.method220(), arg4.method199(), arg4.method226(), arg4.method201(), arg4.method174(), arg0, -33, arg4.method162());
            int var6 = -49 / ((-2 - arg2) / 63);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field6034[1] + arg0 + ',' + (arg1 != null ? field6034[2] : field6034[3]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6034[2] : field6034[3]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3130(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3131(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

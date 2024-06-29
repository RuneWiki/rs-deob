import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class629 extends InputStream {
   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8962 = new String[]{method4618(method4617("7Wz;5r")), method4618(method4617("7Wz;6r")), method4618(method4617("7Wz;\u0006?Q\u007f="))};
   @OriginalMember(
      owner = "client!mga",
      name = "e",
      descriptor = "[S"
   )
   private static short[] field8956 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!mga",
      name = "f",
      descriptor = "[S"
   )
   private static short[] field8961 = new short[]{-10304, 9104, 25485, 4620, 4540};
   @OriginalMember(
      owner = "client!mga",
      name = "d",
      descriptor = "[S"
   )
   private static short[] field8958 = new short[]{6798, 8741, 25238, 4626, 4550};
   @OriginalMember(
      owner = "client!mga",
      name = "g",
      descriptor = "[[S"
   )
   public static short[][] field8955 = new short[][]{field8958, field8961, field8956};
   @OriginalMember(
      owner = "client!mga",
      name = "b",
      descriptor = "I"
   )
   public static int field8957;
   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "I"
   )
   public static int field8960;
   @OriginalMember(
      owner = "client!mga",
      name = "c",
      descriptor = "[[[B"
   )
   public static byte[][][] field8959;

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4615(boolean arg0) {
      try {
         field8961 = null;
         field8955 = null;
         field8956 = null;
         field8959 = null;
         if (!arg0) {
            field8955 = null;
         }

         field8958 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8962[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "read",
      descriptor = "()I"
   )
   public final int read() {
      try {
         class97.method968(32353, 30000L);
         ++field8960;
         return -1;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8962[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(IIIZI)V"
   )
   public static final void method4616(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      try {
         label20: {
            if (~class476.field6870.field9109.method4676(-94) == -1) {
               class182.method1647(false, arg0 + -25026);
               if (!client.field10022) {
                  break label20;
               }
            }

            class117.field1844 = class476.field6870.field9109.method4676(arg0 + -6924);
            class508.method3828(arg0 ^ 6799, true, 0);
         }

         ++field8957;
         class662.field9326 = arg2;
         class29.field429 = arg1;
         class299.field4438 = arg3;
         class651.method4744(arg4);
         if (arg0 != 6798) {
            field8961 = null;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8962[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4617(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4618(char[] arg0) {
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
            var10005 = 48;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

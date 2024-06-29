import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class477 extends class87 {
   @OriginalMember(
      owner = "client!faa",
      name = "i",
      descriptor = "Lcb;"
   )
   public class177 field6645;
   @OriginalMember(
      owner = "client!faa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6649 = new String[]{method3631(method3630("-mB\u0015")), method3631(method3630("%yOW\u0003*vG\r\u0001k")), method3631(method3630("86\u0000WB")), method3631(method3630("%yOW~k"))};
   @OriginalMember(
      owner = "client!faa",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field6647 = false;
   @OriginalMember(
      owner = "client!faa",
      name = "h",
      descriptor = "I"
   )
   public static int field6648 = 13156520;
   @OriginalMember(
      owner = "client!faa",
      name = "j",
      descriptor = "I"
   )
   public static int field6646;

   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "(ZIIZ)I"
   )
   public static final int method3629(boolean arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field6646;
         class657 var4 = class733.method5295(arg2, arg3, (byte)-102);
         if (var4 == null) {
            return 0;
         } else {
            if (!arg0) {
               method3629(true, 22, -14, false);
            }

            return arg1 >= 0 && arg1 < var4.field9799.length ? var4.field9799[arg1] : 0;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6649[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!faa",
      name = "<init>",
      descriptor = "(Lfm;II[B)V"
   )
   public class477(class281 arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.field6645 = arg0.method2253(arg3, 116, false, arg1, arg2, class673.field9968);
         this.field6645.method1516(false, false, 13852);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6649[1] + (arg0 != null ? field6649[2] : field6649[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6649[2] : field6649[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!faa",
      name = "<init>",
      descriptor = "(Lfm;II[I)V"
   )
   public class477(class281 arg0, int arg1, int arg2, int[] arg3) {
      try {
         this.field6645 = arg0.method2283((byte)-53, arg1, false, arg2, arg3);
         this.field6645.method1516(false, false, 13852);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6649[1] + (arg0 != null ? field6649[2] : field6649[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6649[2] : field6649[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!faa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3630(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!faa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3631(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

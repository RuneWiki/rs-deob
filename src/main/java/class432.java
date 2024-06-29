import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class432 extends class247 {
   @OriginalMember(
      owner = "client!ug",
      name = "n",
      descriptor = "Leq;"
   )
   public class799 field6345;
   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6352 = new String[]{method3370(method3369("VA\"\u001cA")), method3370(method3369("MS`1")), method3370(method3369("X\b\"s\u0014")), method3370(method3369("VA\"a\u0000MOxcA")), method3370(method3369("VA\"\u001fA"))};
   @OriginalMember(
      owner = "client!ug",
      name = "j",
      descriptor = "Lfm;"
   )
   public static class164 field6348 = new class164(81, 3);
   @OriginalMember(
      owner = "client!ug",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   public static String field6350 = null;
   @OriginalMember(
      owner = "client!ug",
      name = "l",
      descriptor = "F"
   )
   public static float field6347;
   @OriginalMember(
      owner = "client!ug",
      name = "m",
      descriptor = "I"
   )
   public static int field6346;
   @OriginalMember(
      owner = "client!ug",
      name = "p",
      descriptor = "I"
   )
   public static int field6351;
   @OriginalMember(
      owner = "client!ug",
      name = "k",
      descriptor = "Lpb;"
   )
   public static class142 field6349;

   @OriginalMember(
      owner = "client!ug",
      name = "a",
      descriptor = "(Laea;IIIIZI[B)Lefa;"
   )
   public static final class436 method3367(class678 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, byte[] arg7) {
      try {
         ++field6351;
         if (arg6 != 3553) {
            field6347 = -0.97183985F;
         }

         if (!arg0.field9791 && (!class122.method1209(arg3, 113) || !class122.method1209(arg4, -13))) {
            return !arg0.field9777 ? new class436(arg0, arg1, arg3, arg4, class645.method4694(arg3, (byte)-128), class645.method4694(arg4, (byte)-128), arg7, arg2) : new class436(arg0, 34037, arg1, arg3, arg4, arg5, arg7, arg2);
         } else {
            return new class436(arg0, 3553, arg1, arg3, arg4, arg5, arg7, arg2);
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field6352[0] + (arg0 != null ? field6352[2] : field6352[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field6352[2] : field6352[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3368(int arg0) {
      try {
         field6350 = null;
         field6349 = null;
         int var1 = -89 / ((arg0 - 60) / 36);
         field6348 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6352[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "<init>",
      descriptor = "(Leq;)V"
   )
   public class432(class799 arg0) {
      try {
         this.field6345 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6352[3] + (arg0 != null ? field6352[2] : field6352[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3369(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3370(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

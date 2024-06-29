import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public abstract class class63 {
   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1168 = new String[]{method683(method682(")_y\u0000\u0001u")), method683(method682(")_y\u0000\u0000u"))};
   @OriginalMember(
      owner = "client!tga",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field1167 = new int[1];
   @OriginalMember(
      owner = "client!tga",
      name = "d",
      descriptor = "F"
   )
   public static float field1164;
   @OriginalMember(
      owner = "client!tga",
      name = "c",
      descriptor = "I"
   )
   public static int field1165;
   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "Lhw;"
   )
   public static class141 field1166;

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(IIIZIIZ)V",
      line = 5
   )
   public static final void method680(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
      boolean var7 = client.field4564;

      try {
         ++field1165;
         if (arg2 > arg5) {
            int var8 = (arg2 + arg5) / 2;
            int var9 = arg5;
            class203 var10 = class771.field11308[var8];
            class771.field11308[var8] = class771.field11308[arg2];
            class771.field11308[arg2] = var10;
            int var11 = arg5;
            class203 var12;
            if (var7) {
               if (class632.method4643(arg4, var10, arg0, class771.field11308[arg5], arg6, arg3, -27786) <= 0) {
                  var12 = class771.field11308[arg5];
                  class771.field11308[arg5] = class771.field11308[arg5];
                  var9 = arg5 + 1;
                  class771.field11308[arg5] = var12;
               }

               var11 = arg5 + 1;
            }

            while(true) {
               int var10000;
               if (var11 >= arg2) {
                  class771.field11308[arg2] = class771.field11308[var9];
                  class771.field11308[var9] = var10;
                  method680(arg0, 0, var9 + -1, arg3, arg4, arg5, arg6);
                  var10000 = arg0;
                  if (!var7) {
                     method680(arg0, 0, arg2, arg3, arg4, var9 + 1, arg6);
                     break;
                  }
               } else {
                  var10000 = class632.method4643(arg4, var10, arg0, class771.field11308[var11], arg6, arg3, -27786);
               }

               if (var10000 <= 0) {
                  var12 = class771.field11308[var11];
                  class771.field11308[var11] = class771.field11308[var9];
                  class771.field11308[var9++] = var12;
               }

               ++var11;
            }
         }

         if (arg1 != 0) {
            method680(45, 107, 7, false, 5, 84, true);
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field1168[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(I)V",
      line = 51
   )
   public static void method681(int arg0) {
      try {
         field1167 = null;
         field1166 = null;
         if (arg0 > -1) {
            method680(26, -50, 108, false, -16, -66, false);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1168[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(ILtea;)Ltea;"
   )
   public abstract class249 method679(int arg0, class249 arg1);

   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method682(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method683(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class423 {
   @OriginalMember(
      owner = "client!tb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5948 = new String[]{method3196(method3195("[\tn?\b")), method3196(method3195("A\u001e,\u0010")), method3196(method3195("TEnR]")), method3196(method3195("[\tn=\b")), method3196(method3195("[\tn>\b"))};
   @OriginalMember(
      owner = "client!tb",
      name = "b",
      descriptor = "Leb;"
   )
   public static class657 field5944 = null;
   @OriginalMember(
      owner = "client!tb",
      name = "d",
      descriptor = "Laka;"
   )
   public static class85 field5947 = null;
   @OriginalMember(
      owner = "client!tb",
      name = "c",
      descriptor = "Lbga;"
   )
   public static class378 field5946 = new class378(74, 6);
   @OriginalMember(
      owner = "client!tb",
      name = "e",
      descriptor = "I"
   )
   public static int field5943;
   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "I"
   )
   public static int field5945;

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(Lha;ILdi;)I"
   )
   public static final int method3192(class65 arg0, int arg1, class136 arg2) {
      try {
         if (arg1 <= 12) {
            method3192((class65)null, 0, (class136)null);
         }

         ++field5943;
         if (~arg2.field1766 == 0) {
            if (~arg2.field1775 != 0) {
               class359 var3 = arg0.field726.method1293(arg2.field1775, -5150);
               if (!var3.field5115) {
                  return var3.field5112;
               }
            }

            return arg2.field1774;
         } else {
            return arg2.field1766;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5948[3] + (arg0 != null ? field5948[2] : field5948[1]) + ',' + arg1 + ',' + (arg2 != null ? field5948[2] : field5948[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(IC)C"
   )
   public static final char method3193(int arg0, char arg1) {
      try {
         ++field5945;
         if (~arg1 == -199) {
            return 'E';
         } else {
            if (arg0 != -16019) {
               field5947 = null;
            }

            if (arg1 == 230) {
               return 'e';
            } else if (~arg1 == -224) {
               return 's';
            } else if (arg1 == 338) {
               return 'E';
            } else {
               return (char)(~arg1 == -340 ? 'e' : '\u0000');
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5948[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3194(int arg0) {
      try {
         field5947 = null;
         field5944 = null;
         field5946 = null;
         if (arg0 != 230) {
            field5947 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5948[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3195(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3196(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

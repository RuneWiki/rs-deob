import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class478 {
   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6886 = new String[]{method3662(method3661("\u000e'<ps@")), method3662(method3661("\u000e'<pp@")), method3662(method3661("\u000e'<pr@"))};
   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "I"
   )
   public static int field6882 = 0;
   @OriginalMember(
      owner = "client!fka",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field6880 = new int[4096];
   @OriginalMember(
      owner = "client!fka",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field6883 = new int[13];
   @OriginalMember(
      owner = "client!fka",
      name = "c",
      descriptor = "I"
   )
   public static int field6881;
   @OriginalMember(
      owner = "client!fka",
      name = "b",
      descriptor = "I"
   )
   public static int field6885;
   @OriginalMember(
      owner = "client!fka",
      name = "d",
      descriptor = "Lra;"
   )
   public static class673 field6879;
   @OriginalMember(
      owner = "client!fka",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field6884;

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(IIIB)I"
   )
   public static final int method3658(int arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field6885;
         if (class225.field3197 == null) {
            return 0;
         } else {
            int var4 = arg1 >> 9;
            if (arg3 != -20) {
               method3659((byte)-54);
            }

            int var5 = arg2 >> 9;
            if (~var4 <= -1 && ~var5 <= -1 && class234.field3626 + -1 >= var4 && var5 <= class209.field2989 - 1) {
               int var6 = arg0;
               if (~arg0 > -4 && ~(2 & class644.field9070[1][var4][var5]) != -1) {
                  var6 = arg0 + 1;
               }

               return class225.field3197[var6].method5401(arg1, true, arg2);
            } else {
               return 0;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field6886[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3659(byte arg0) {
      try {
         if (arg0 >= -126) {
            field6883 = null;
         }

         field6880 = null;
         field6883 = null;
         field6884 = null;
         field6879 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6886[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3660(int arg0) {
      boolean var1 = client.field10022;

      try {
         if (arg0 > 24) {
            label34: {
               if (class436.field6382 != null) {
                  class559.method4159(106);
                  if (!var1) {
                     break label34;
                  }
               }

               if (~class777.field11335 == 0) {
                  class36.method415(class492.field7022, class226.field3216, true);
                  if (!var1) {
                     break label34;
                  }
               }

               class645.method4692(-1);
            }

            ++field6881;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6886[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3661(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3662(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

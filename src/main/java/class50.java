import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class50 {
   @OriginalMember(
      owner = "client!dga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field641 = new String[]{method348(method347("\u001cVpN\u0019P")), method348(method347("\u001cVpN\u001aP"))};
   @OriginalMember(
      owner = "client!dga",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field639 = false;
   @OriginalMember(
      owner = "client!dga",
      name = "d",
      descriptor = "I"
   )
   public static int field637;
   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "I"
   )
   public static int field638;
   @OriginalMember(
      owner = "client!dga",
      name = "b",
      descriptor = "I"
   )
   public static int field640;

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(IJIIZ)Ljava/lang/String;"
   )
   public static final String method345(int arg0, long arg1, int arg2, int arg3, boolean arg4) {
      boolean var6 = client.field1786;

      try {
         ++field640;
         char var7 = ',';
         char var8 = '.';
         if (arg3 == 0) {
            var8 = ',';
            var7 = '.';
         }

         if (arg2 != 160) {
            method346(25, 72, 110, true);
         }

         if (arg3 == 2) {
            var8 = 160;
         }

         byte var9 = 0;
         if (~arg1 > -1L) {
            arg1 = -arg1;
            var9 = 1;
         }

         StringBuffer var10 = new StringBuffer(26);
         if (arg0 > 0) {
            int var11 = 0;
            if (var6 || var11 < arg0) {
               do {
                  int var12 = (int)arg1;
                  arg1 /= 10L;
                  var10.append((char)(48 - (int)arg1 * 10 + var12));
                  ++var11;
               } while(var11 < arg0);
            }

            var10.append(var7);
         }

         int var13 = 0;

         int var10000;
         while(true) {
            int var14 = (int)arg1;
            arg1 /= 10L;
            var10.append((char)(var14 - (int)arg1 * 10 + 48));
            if (~arg1 != -1L) {
               if (!arg4) {
                  continue;
               }

               ++var13;
               var10000 = var13 % 3;
               if (var6) {
                  break;
               }

               if (var10000 != 0) {
                  continue;
               }

               var10.append(var8);
               if (!var6) {
                  continue;
               }
            }

            var10000 = var9;
            break;
         }

         if (var10000 != 0) {
            var10.append('-');
         }

         return var10.reverse().toString();
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field641[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(IIIZ)I"
   )
   public static final int method346(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field638;
         int var6 = arg1 & 3;
         if (~var6 == -1) {
            return arg0;
         } else {
            if (!arg3) {
               method346(7, 109, 64, true);
            }

            if (~var6 == -2) {
               return -arg2 + 7;
            } else {
               return var6 == 2 ? -arg0 + 7 : arg2;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field641[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method347(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method348(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

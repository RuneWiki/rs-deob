import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class477 {
   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6878 = new String[]{method3657(method3656(">U\t \rr")), method3657(method3656("!\u001dF 2")), method3657(method3656(">U\t \u000er")), method3657(method3656("4F\u0004b"))};
   @OriginalMember(
      owner = "client!dfa",
      name = "b",
      descriptor = "I"
   )
   public static int field6874;
   @OriginalMember(
      owner = "client!dfa",
      name = "c",
      descriptor = "I"
   )
   public static int field6875;
   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "I"
   )
   public static int field6876;
   @OriginalMember(
      owner = "client!dfa",
      name = "d",
      descriptor = "I"
   )
   public static int field6877;

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(I[B)V"
   )
   public static final synchronized void method3654(int arg0, byte[] arg1) {
      try {
         ++field6874;
         if (~arg1.length == -101 && ~class30.field435 > -1001) {
            class225.field3198[class30.field435++] = arg1;
         } else if (arg0 == 250) {
            if (~arg1.length == -5001 && class79.field1250 < 250) {
               class674.field9451[class79.field1250++] = arg1;
            } else if (~arg1.length == -30001 && ~class454.field6597 > -51) {
               class578.field8164[class454.field6597++] = arg1;
            } else if (class629.field8959 != null) {
               for(int var2 = 0; var2 < class537.field7554.length; ++var2) {
                  if (~class537.field7554[var2] == ~arg1.length && class135.field2192[var2] < class629.field8959[var2].length) {
                     class629.field8959[var2][class135.field2192[var2]++] = arg1;
                     return;
                  }
               }

            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6878[2] + arg0 + ',' + (arg1 != null ? field6878[1] : field6878[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(ZI)[B"
   )
   public static final synchronized byte[] method3655(boolean arg0, int arg1) {
      try {
         ++field6877;
         if (arg1 == 100 && ~class30.field435 < -1) {
            byte[] var2 = class225.field3198[--class30.field435];
            class225.field3198[class30.field435] = null;
            return var2;
         } else if (~arg1 == -5001 && ~class79.field1250 < -1) {
            byte[] var3 = class674.field9451[--class79.field1250];
            class674.field9451[class79.field1250] = null;
            return var3;
         } else {
            if (arg0) {
               method3654(121, (byte[])null);
            }

            if (arg1 == 30000 && ~class454.field6597 < -1) {
               byte[] var4 = class578.field8164[--class454.field6597];
               class578.field8164[class454.field6597] = null;
               return var4;
            } else {
               if (class629.field8959 != null) {
                  for(int var5 = 0; ~var5 > ~class537.field7554.length; ++var5) {
                     if (~class537.field7554[var5] == ~arg1 && ~class135.field2192[var5] < -1) {
                        byte[] var6 = class629.field8959[var5][--class135.field2192[var5]];
                        class629.field8959[var5][class135.field2192[var5]] = null;
                        return var6;
                     }
                  }
               }

               return new byte[arg1];
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field6878[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3656(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3657(char[] arg0) {
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
            var10005 = 51;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

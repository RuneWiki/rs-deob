import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public class class388 {
   @OriginalMember(
      owner = "client!gka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5738 = new String[]{method3013(method3012("\u0004+jJ\u0019K")), method3013(method3012("\r5g\b")), method3013(method3012("\u0018n%J%")), method3013(method3012("\u0004+jJ\u001aK"))};
   @OriginalMember(
      owner = "client!gka",
      name = "c",
      descriptor = "Lgw;"
   )
   public static class179 field5733 = new class179(50);
   @OriginalMember(
      owner = "client!gka",
      name = "b",
      descriptor = "I"
   )
   public static int field5734;
   @OriginalMember(
      owner = "client!gka",
      name = "d",
      descriptor = "I"
   )
   public int field5735;
   @OriginalMember(
      owner = "client!gka",
      name = "e",
      descriptor = "I"
   )
   public int field5736;
   @OriginalMember(
      owner = "client!gka",
      name = "a",
      descriptor = "I"
   )
   public int field5737;

   @OriginalMember(
      owner = "client!gka",
      name = "a",
      descriptor = "(JIZJIZIZILjava/lang/String;IILjava/lang/String;)V"
   )
   public static final void method3010(long arg0, int arg1, boolean arg2, long arg3, int arg4, boolean arg5, int arg6, boolean arg7, int arg8, String arg9, int arg10, int arg11, String arg12) {
      try {
         ++field5734;
         if (!class442.field6452 && ~class103.field1686 > -501) {
            int var18 = ~arg11 != 0 ? arg11 : class135.field2225;
            class587 var15 = new class587(arg12, arg9, var18, arg10, arg1, arg3, arg8, arg4, arg2, arg5, arg0, arg7);
            if (arg6 > -95) {
               field5733 = null;
            }

            class330.method2554(var15, 57);
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field5738[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field5738[2] : field5738[1]) + ',' + arg10 + ',' + arg11 + ',' + (arg12 != null ? field5738[2] : field5738[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3011(int arg0) {
      try {
         if (arg0 != -501) {
            field5733 = null;
         }

         field5733 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5738[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3012(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3013(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

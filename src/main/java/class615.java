import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class615 {
   @OriginalMember(
      owner = "client!qe",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8933 = new String[]{method4530(method4529("a0F\u001d*")), method4530(method4529("a0F\u001f*")), method4530(method4529("a0F\u001c*"))};
   @OriginalMember(
      owner = "client!qe",
      name = "b",
      descriptor = "I"
   )
   public static int field8929 = 0;
   @OriginalMember(
      owner = "client!qe",
      name = "e",
      descriptor = "I"
   )
   public static int field8931 = 0;
   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "I"
   )
   public static int field8930;
   @OriginalMember(
      owner = "client!qe",
      name = "c",
      descriptor = "I"
   )
   public static int field8932;
   @OriginalMember(
      owner = "client!qe",
      name = "d",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field8928;

   @OriginalMember(
      owner = "client!qe",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4526(int arg0) {
      try {
         class304 var1 = class670.field9994;
         synchronized(class670.field9994) {
            class670.field9994.method2554(-116);
         }

         ++field8932;
         class304 var2 = class357.field5503;
         synchronized(class357.field5503) {
            class357.field5503.method2554(-101);
         }

         if (arg0 != -2) {
            method4528(-41);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8933[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(IIIIBII)I"
   )
   public static final int method4527(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
      try {
         int var10 = arg6 & 3;
         if (~(1 & arg0) == -2) {
            int var7 = arg5;
            arg5 = arg3;
            arg3 = var7;
         }

         ++field8930;
         if (~var10 == -1) {
            return arg1;
         } else if (~var10 == -2) {
            return -arg2 - (arg5 - 1) + 7;
         } else {
            if (arg4 != 122) {
               field8928 = null;
            }

            return ~var10 == -3 ? -arg1 + -arg3 + 1 + 7 : arg2;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field8933[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4528(int arg0) {
      try {
         field8928 = null;
         if (arg0 != -1) {
            field8929 = 52;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8933[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4529(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4530(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

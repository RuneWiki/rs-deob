import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class273 {
   @OriginalMember(
      owner = "client!uk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3653 = new String[]{method2091(method2090("aF\u0006\u000er")), method2091(method2090("aF\u000695GYZ$4s\u0005")), method2091(method2090("zXD!")), method2091(method2090("o\u0003\u0006c'")), method2091(method2090("aF\u0006\u000fr")), method2091(method2090("aF\u0006\fr"))};
   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "Lnw;"
   )
   public static class616 field3649 = new class616(48, 7);
   @OriginalMember(
      owner = "client!uk",
      name = "g",
      descriptor = "I"
   )
   public static int field3651 = 0;
   @OriginalMember(
      owner = "client!uk",
      name = "d",
      descriptor = "I"
   )
   public static int field3646;
   @OriginalMember(
      owner = "client!uk",
      name = "f",
      descriptor = "I"
   )
   public static int field3647;
   @OriginalMember(
      owner = "client!uk",
      name = "b",
      descriptor = "I"
   )
   public static int field3648;
   @OriginalMember(
      owner = "client!uk",
      name = "c",
      descriptor = "I"
   )
   public static int field3652;
   @OriginalMember(
      owner = "client!uk",
      name = "e",
      descriptor = "Ldea;"
   )
   public static class259 field3650;

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method2087(boolean arg0, int arg1, int arg2) {
      try {
         ++field3646;
         if (!arg0) {
            method2088(-104);
         }

         return ~(2048 & arg1) != -1 && ~(55 & arg2) != -1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3653[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2088(int arg0) {
      try {
         if (arg0 != 2048) {
            method2087(false, 48, 2);
         }

         field3650 = null;
         field3649 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3653[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field3648;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3653[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(II[BIIILor;Z)Lbe;"
   )
   public static final class40 method2089(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, class670 arg6, boolean arg7) {
      try {
         ++field3652;
         if (arg3 != 3553) {
            return null;
         } else if (arg6.field9783 || class685.method5005(arg0, (byte)120) && class685.method5005(arg4, (byte)113)) {
            return new class40(arg6, 3553, arg1, arg0, arg4, arg7, arg2, arg5);
         } else {
            return !arg6.field9809 ? new class40(arg6, arg1, arg0, arg4, class546.method3944(10, arg0), class546.method3944(10, arg4), arg2, arg5) : new class40(arg6, 34037, arg1, arg0, arg4, arg7, arg2, arg5);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field3653[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3653[3] : field3653[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3653[3] : field3653[2]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2090(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2091(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

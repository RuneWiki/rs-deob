import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class263 {
   @OriginalMember(
      owner = "client!sr",
      name = "d",
      descriptor = "I"
   )
   public int field3598 = -1;
   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3602 = new String[]{method2000(method1999("`\u0005~$B")), method2000(method1999("}\u0002<\u000b")), method2000(method1999("`\u0005~&B")), method2000(method1999("hY~I\u0017")), method2000(method1999("`\u0005~#B")), method2000(method1999("`\u0005~%B"))};
   @OriginalMember(
      owner = "client!sr",
      name = "f",
      descriptor = "Lou;"
   )
   public static class630 field3588 = new class630();
   @OriginalMember(
      owner = "client!sr",
      name = "m",
      descriptor = "F"
   )
   public static float field3600;
   @OriginalMember(
      owner = "client!sr",
      name = "b",
      descriptor = "I"
   )
   public static int field3589;
   @OriginalMember(
      owner = "client!sr",
      name = "i",
      descriptor = "I"
   )
   public int field3590;
   @OriginalMember(
      owner = "client!sr",
      name = "j",
      descriptor = "I"
   )
   public int field3591;
   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "I"
   )
   public int field3592;
   @OriginalMember(
      owner = "client!sr",
      name = "g",
      descriptor = "I"
   )
   public int field3593;
   @OriginalMember(
      owner = "client!sr",
      name = "k",
      descriptor = "I"
   )
   public static int field3594;
   @OriginalMember(
      owner = "client!sr",
      name = "h",
      descriptor = "I"
   )
   public static int field3595;
   @OriginalMember(
      owner = "client!sr",
      name = "e",
      descriptor = "I"
   )
   public int field3596;
   @OriginalMember(
      owner = "client!sr",
      name = "c",
      descriptor = "I"
   )
   public int field3597;
   @OriginalMember(
      owner = "client!sr",
      name = "n",
      descriptor = "I"
   )
   public int field3599;
   @OriginalMember(
      owner = "client!sr",
      name = "l",
      descriptor = "I"
   )
   public int field3601;

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(BLeaa;)V",
      line = 8
   )
   public static final void method1995(byte arg0, class526 arg1) {
      try {
         ++field3594;
         class534.field7795 = arg1;
         int var2 = 109 % ((14 - arg0) / 46);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3602[2] + arg0 + ',' + (arg1 != null ? field3602[3] : field3602[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(Z)V",
      line = 22
   )
   public static void method1996(boolean arg0) {
      try {
         field3588 = null;
         if (!arg0) {
            field3600 = 1.9617372F;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3602[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(II)I",
      line = 32
   )
   public static final int method1997(int arg0, int arg1) {
      try {
         ++field3595;
         return arg1 != 11748 ? 60 : 255 & arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3602[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(ILjava/lang/String;)Ljava/lang/String;",
      line = 43
   )
   public static final String method1998(int arg0, String arg1) {
      try {
         ++field3589;
         if (arg0 != -1) {
            field3588 = null;
         }

         String var2 = class212.method1608(arg0 + 38, class466.method3478(arg0 + -29019, arg1));
         if (var2 == null) {
            var2 = "";
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3602[4] + arg0 + ',' + (arg1 != null ? field3602[3] : field3602[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1999(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2000(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

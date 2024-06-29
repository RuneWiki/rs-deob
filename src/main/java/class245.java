import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class245 extends class247 {
   @OriginalMember(
      owner = "client!kd",
      name = "o",
      descriptor = "I"
   )
   public int field3757;
   @OriginalMember(
      owner = "client!kd",
      name = "p",
      descriptor = "I"
   )
   public int field3763;
   @OriginalMember(
      owner = "client!kd",
      name = "u",
      descriptor = "I"
   )
   public int field3755;
   @OriginalMember(
      owner = "client!kd",
      name = "j",
      descriptor = "Z"
   )
   public boolean field3759;
   @OriginalMember(
      owner = "client!kd",
      name = "s",
      descriptor = "I"
   )
   public int field3762;
   @OriginalMember(
      owner = "client!kd",
      name = "t",
      descriptor = "I"
   )
   public int field3756;
   @OriginalMember(
      owner = "client!kd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3768 = new String[]{method2135(method2134("#\u001a\tg")), method2135(method2134("6AK%C")), method2135(method2134("&\u000bKI\u0016")), method2135(method2134("&\u000bK7W#\u0006\u00115\u0016")), method2135(method2134("&\u000bKJ\u0016"))};
   @OriginalMember(
      owner = "client!kd",
      name = "q",
      descriptor = "Lfm;"
   )
   public static class164 field3758 = new class164(37, -1);
   @OriginalMember(
      owner = "client!kd",
      name = "n",
      descriptor = "I"
   )
   public static int field3760 = 0;
   @OriginalMember(
      owner = "client!kd",
      name = "l",
      descriptor = "I"
   )
   public static int field3766 = 2;
   @OriginalMember(
      owner = "client!kd",
      name = "k",
      descriptor = "Lfm;"
   )
   public static class164 field3764 = new class164(42, -1);
   @OriginalMember(
      owner = "client!kd",
      name = "r",
      descriptor = "Lfm;"
   )
   public static class164 field3767 = new class164(61, 4);
   @OriginalMember(
      owner = "client!kd",
      name = "m",
      descriptor = "I"
   )
   public static int field3761;
   @OriginalMember(
      owner = "client!kd",
      name = "v",
      descriptor = "I"
   )
   public static int field3765;

   @OriginalMember(
      owner = "client!kd",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2132(int arg0) {
      try {
         field3758 = null;
         field3767 = null;
         if (arg0 == 14421) {
            field3764 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3768[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kd",
      name = "<init>",
      descriptor = "(IIIIIZ)V"
   )
   public class245(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         this.field3757 = arg4;
         this.field3763 = arg0;
         this.field3755 = arg1;
         this.field3759 = arg5;
         this.field3762 = arg3;
         this.field3756 = arg2;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3768[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kd",
      name = "a",
      descriptor = "([J[II)V"
   )
   public static final void method2133(long[] arg0, int[] arg1, int arg2) {
      try {
         if (arg2 != -29949) {
            field3760 = 95;
         }

         class306.method2517(true, arg1, arg0, 0, arg0.length - 1);
         ++field3761;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3768[2] + (arg0 != null ? field3768[1] : field3768[0]) + ',' + (arg1 != null ? field3768[1] : field3768[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2134(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2135(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class519 extends class101 {
   @OriginalMember(
      owner = "client!hca",
      name = "t",
      descriptor = "I"
   )
   public int field7119;
   @OriginalMember(
      owner = "client!hca",
      name = "p",
      descriptor = "I"
   )
   public int field7118;
   @OriginalMember(
      owner = "client!hca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7121 = new String[]{method3764(method3763("r+t\bD")), method3764(method3763("gp6J")), method3764(method3763("af;\b\u0005`k3R\u0007!")), method3764(method3763("af;\b{!")), method3764(method3763("af;\bz!")), method3764(method3763("$(d\u0006")), method3764(method3763("af;\bx!"))};
   @OriginalMember(
      owner = "client!hca",
      name = "u",
      descriptor = "I"
   )
   public static int field7116 = 0;
   @OriginalMember(
      owner = "client!hca",
      name = "r",
      descriptor = "I"
   )
   public static int field7115;
   @OriginalMember(
      owner = "client!hca",
      name = "q",
      descriptor = "I"
   )
   public static int field7117;
   @OriginalMember(
      owner = "client!hca",
      name = "s",
      descriptor = "I"
   )
   public static int field7120;

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3761(boolean arg0) {
      try {
         ++field7117;
         class661.field9434.method1851(107);
         class356.field5073.method3970(-98);
         class250.field3137.method3970(127);
         if (arg0) {
            method3761(true);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7121[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(I)Lafa;"
   )
   public final class365 method19(int arg0) {
      try {
         ++field7115;
         int var2 = -12 % ((1 - arg0) / 55);
         return class719.field10533;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7121[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "<init>",
      descriptor = "(Lsq;Ljh;IIIIIIIIII)V"
   )
   public class519(class190 arg0, class169 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field7119 = arg11;
         this.field7118 = arg10;
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field7121[2] + (arg0 != null ? field7121[0] : field7121[1]) + ',' + (arg1 != null ? field7121[0] : field7121[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(BZ)V"
   )
   public static final void method3762(byte arg0, boolean arg1) {
      try {
         ++field7120;
         if (~class203.field2495.length() != -1) {
            class705.method5131(field7121[5] + class203.field2495, arg0 + -92);
            if (arg0 != 92) {
               method3762((byte)52, false);
            }

            class479.method3494(class203.field2495, true, false, arg1);
            class246.field3094 = 0;
            if (!arg1) {
               class203.field2495 = "";
               class7.field66 = 0;
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7121[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3763(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3764(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

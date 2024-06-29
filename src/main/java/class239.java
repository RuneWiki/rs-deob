import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class239 extends class67 {
   @OriginalMember(
      owner = "client!eu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3633 = new String[]{method2041(method2040("r6C_\\")), method2041(method2040("r6C^\\")), method2041(method2040("r6C\\\\")), method2041(method2040("r6CT\\")), method2041(method2040("r6CU\\")), method2041(method2040("r6CX\\")), method2041(method2040("r6CZ\\"))};
   @OriginalMember(
      owner = "client!eu",
      name = "s",
      descriptor = "Lnaa;"
   )
   public static class113 field3630 = new class113(44, 7);
   @OriginalMember(
      owner = "client!eu",
      name = "p",
      descriptor = "Lnaa;"
   )
   public static class113 field3631 = new class113(1, -1);
   @OriginalMember(
      owner = "client!eu",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field3632 = false;
   @OriginalMember(
      owner = "client!eu",
      name = "o",
      descriptor = "I"
   )
   public static int field3624;
   @OriginalMember(
      owner = "client!eu",
      name = "q",
      descriptor = "I"
   )
   public static int field3625;
   @OriginalMember(
      owner = "client!eu",
      name = "r",
      descriptor = "I"
   )
   public static int field3626;
   @OriginalMember(
      owner = "client!eu",
      name = "m",
      descriptor = "I"
   )
   public static int field3627;
   @OriginalMember(
      owner = "client!eu",
      name = "k",
      descriptor = "I"
   )
   public static int field3628;
   @OriginalMember(
      owner = "client!eu",
      name = "l",
      descriptor = "I"
   )
   public static int field3629;

   @OriginalMember(
      owner = "client!eu",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2037(int arg0) {
      try {
         field3631 = null;
         if (arg0 >= -110) {
            field3632 = false;
         }

         field3630 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3633[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         if (super.field881.method298(96)) {
            super.field877 = 2;
         }

         ++field3629;
         if (~super.field877 > -1 || super.field877 > 2) {
            super.field877 = this.method162(arg0 ^ -69);
         }

         if (arg0 != -69) {
            field3630 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3633[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         if (arg1 > -74) {
            field3632 = true;
         }

         ++field3626;
         return super.field881.method298(96) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3633[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method2038(int arg0) {
      try {
         ++field3624;
         if (arg0 != 3343) {
            return false;
         } else {
            return !super.field881.method298(96);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3633[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class239(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!eu",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method2039(int arg0) {
      try {
         if (arg0 != 480102311) {
            return -46;
         } else {
            ++field3627;
            return super.field877;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3633[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class239(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         super.field877 = arg0;
         if (!arg1) {
            field3632 = true;
         }

         ++field3625;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3633[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            return -116;
         } else {
            ++field3628;
            if (super.field881.method298(96)) {
               return 2;
            } else {
               return super.field881.field507.method3434(0) && class497.method3864(arg0 + -118, super.field881.field507.method3440(480102311)) ? 1 : 0;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3633[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2040(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2041(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

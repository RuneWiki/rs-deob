import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class755 extends class67 {
   @OriginalMember(
      owner = "client!dc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11194 = new String[]{method5543(method5542("w9Y|*")), method5543(method5542("w9Yx*")), method5543(method5542("w9Y~*")), method5543(method5542("w9Yr*")), method5543(method5542("w9Yz*")), method5543(method5542("w9Y\u007f*")), method5543(method5542("w9Yy*")), method5543(method5542("w9Ys*"))};
   @OriginalMember(
      owner = "client!dc",
      name = "r",
      descriptor = "Luk;"
   )
   public static class498 field11191 = new class498(137, -2);
   @OriginalMember(
      owner = "client!dc",
      name = "m",
      descriptor = "I"
   )
   public static int field11185;
   @OriginalMember(
      owner = "client!dc",
      name = "s",
      descriptor = "I"
   )
   public static int field11186;
   @OriginalMember(
      owner = "client!dc",
      name = "l",
      descriptor = "I"
   )
   public static int field11187;
   @OriginalMember(
      owner = "client!dc",
      name = "p",
      descriptor = "I"
   )
   public static int field11188;
   @OriginalMember(
      owner = "client!dc",
      name = "q",
      descriptor = "I"
   )
   public static int field11189;
   @OriginalMember(
      owner = "client!dc",
      name = "o",
      descriptor = "I"
   )
   public static int field11190;
   @OriginalMember(
      owner = "client!dc",
      name = "k",
      descriptor = "I"
   )
   public static int field11192;
   @OriginalMember(
      owner = "client!dc",
      name = "n",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field11193;

   @OriginalMember(
      owner = "client!dc",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5538(byte arg0) {
      try {
         field11193 = null;
         if (arg0 <= -1) {
            field11191 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11194[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method5539(int arg0) {
      try {
         ++field11188;
         if (arg0 != 3343) {
            method5538((byte)125);
         }

         if (super.field881.method298(96)) {
            return false;
         } else {
            return super.field881.field547.method4414(480102311) != 0;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11194[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         ++field11186;
         return arg0 != 0 ? 104 : 2;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11194[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method5540(int arg0) {
      try {
         if (arg0 != 480102311) {
            field11193 = null;
         }

         ++field11189;
         return super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11194[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method5541(int arg0, int arg1, byte arg2) {
      try {
         ++field11187;
         int var3 = 108 / ((51 - arg2) / 43);
         return (arg1 & 52) != 0;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11194[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class755(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         if (super.field881.method298(96)) {
            super.field877 = 0;
         }

         ++field11190;
         if (super.field881.field547.method4414(480102311) == 0) {
            super.field877 = 0;
         }

         if (~super.field877 > -1 || super.field877 > 2) {
            super.field877 = this.method162(0);
         }

         if (arg0 != -69) {
            method5541(6, 77, (byte)2);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11194[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class755(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         ++field11192;
         if (!arg1) {
            this.method161(22, -90);
         }

         super.field877 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11194[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field11185;
         if (super.field881.method298(96)) {
            return 3;
         } else if (~super.field881.field547.method4414(480102311) == -1) {
            return 3;
         } else {
            if (arg1 > -74) {
               method5541(-42, 22, (byte)119);
            }

            return 1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11194[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5542(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5543(char[] arg0) {
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
            var10005 = 90;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

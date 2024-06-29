import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class729 extends class67 {
   @OriginalMember(
      owner = "client!qfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10891 = new String[]{method5382(method5381("CIYl\u0011\u001a")), method5382(method5381("CIYl\u0016\u001a")), method5382(method5381("CIYl\u001a\u001a")), method5382(method5381("CIYl\u0010\u001a")), method5382(method5381("CIYl\u0014\u001a")), method5382(method5381("CIYl\u001b\u001a")), method5382(method5381("CIYl\u0012\u001a"))};
   @OriginalMember(
      owner = "client!qfa",
      name = "n",
      descriptor = "I"
   )
   public static int field10885 = 0;
   @OriginalMember(
      owner = "client!qfa",
      name = "k",
      descriptor = "I"
   )
   public static int field10886 = 0;
   @OriginalMember(
      owner = "client!qfa",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field10882 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   @OriginalMember(
      owner = "client!qfa",
      name = "q",
      descriptor = "I"
   )
   public static int field10883;
   @OriginalMember(
      owner = "client!qfa",
      name = "l",
      descriptor = "I"
   )
   public static int field10884;
   @OriginalMember(
      owner = "client!qfa",
      name = "o",
      descriptor = "I"
   )
   public static int field10887;
   @OriginalMember(
      owner = "client!qfa",
      name = "s",
      descriptor = "I"
   )
   public static int field10888;
   @OriginalMember(
      owner = "client!qfa",
      name = "m",
      descriptor = "I"
   )
   public static int field10889;
   @OriginalMember(
      owner = "client!qfa",
      name = "p",
      descriptor = "I"
   )
   public static int field10890;

   @OriginalMember(
      owner = "client!qfa",
      name = "<init>",
      descriptor = "(Lmp;)V",
      line = 3
   )
   public class729(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "c",
      descriptor = "(I)Z",
      line = 6
   )
   public final boolean method5378(int arg0) {
      try {
         ++field10883;
         if (!class290.method2450(super.field881.field507.method3440(480102311), (byte)98)) {
            return false;
         } else {
            if (arg0 != 3343) {
               field10882 = null;
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10891[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "d",
      descriptor = "(I)I",
      line = 23
   )
   public final int method5379(int arg0) {
      try {
         ++field10889;
         return arg0 != 480102311 ? -8 : super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10891[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "<init>",
      descriptor = "(ILmp;)V",
      line = 34
   )
   public class729(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "b",
      descriptor = "(I)I",
      line = 37
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            field10885 = 120;
         }

         ++field10884;
         return 1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10891[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "a",
      descriptor = "(B)V",
      line = 49
   )
   public final void method158(byte arg0) {
      try {
         if (arg0 == -69) {
            if (~super.field877 > -1 || ~super.field877 < -2) {
               super.field877 = this.method162(arg0 ^ -69);
            }

            ++field10890;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10891[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "a",
      descriptor = "(II)I",
      line = 65
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field10887;
         if (arg1 >= -74) {
            field10882 = null;
         }

         return !class290.method2450(super.field881.field507.method3440(480102311), (byte)89) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10891[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "a",
      descriptor = "(Z)V",
      line = 92
   )
   public static void method5380(boolean arg0) {
      try {
         if (arg0) {
            method5380(false);
         }

         field10882 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10891[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "a",
      descriptor = "(IZ)V",
      line = 102
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         super.field877 = arg0;
         ++field10888;
         if (!arg1) {
            this.method165(110, true);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10891[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5381(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5382(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

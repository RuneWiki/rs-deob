import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class520 extends class454 {
   @OriginalMember(
      owner = "client!uf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7315 = new String[]{method3909(method3908("\u0017g9\u0010\u0002")), method3909(method3908("\u0017g9\u0011\u0002")), method3909(method3908("\u0017g9\u0012\u0002")), method3909(method3908("\u0017g9\u0015\u0002")), method3909(method3908("\u0017g9\u0016\u0002")), method3909(method3908("\u0017g9\u0013\u0002")), method3909(method3908("\u0017g9\u0017\u0002"))};
   @OriginalMember(
      owner = "client!uf",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field7307 = false;
   @OriginalMember(
      owner = "client!uf",
      name = "i",
      descriptor = "J"
   )
   public static long field7314 = 0L;
   @OriginalMember(
      owner = "client!uf",
      name = "m",
      descriptor = "I"
   )
   public static int field7304;
   @OriginalMember(
      owner = "client!uf",
      name = "p",
      descriptor = "I"
   )
   public static int field7306;
   @OriginalMember(
      owner = "client!uf",
      name = "q",
      descriptor = "I"
   )
   public static int field7308;
   @OriginalMember(
      owner = "client!uf",
      name = "j",
      descriptor = "I"
   )
   public static int field7309;
   @OriginalMember(
      owner = "client!uf",
      name = "o",
      descriptor = "I"
   )
   public static int field7310;
   @OriginalMember(
      owner = "client!uf",
      name = "k",
      descriptor = "I"
   )
   public static int field7311;
   @OriginalMember(
      owner = "client!uf",
      name = "l",
      descriptor = "Lww;"
   )
   public static class339 field7305;
   @OriginalMember(
      owner = "client!uf",
      name = "n",
      descriptor = "Lnw;"
   )
   public static class698 field7313;
   @OriginalMember(
      owner = "client!uf",
      name = "s",
      descriptor = "[[[Lbq;"
   )
   public static class731[][][] field7312;

   @OriginalMember(
      owner = "client!uf",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3905(int arg0) {
      try {
         if (arg0 != -18033) {
            return 43;
         } else {
            ++field7311;
            return super.field6263;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7315[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         if (!arg0) {
            field7313 = null;
         }

         ++field7309;
         if (~super.field6263 > -2 || ~super.field6263 < -4) {
            super.field6263 = this.method23(1);
         }

      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7315[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         ++field7304;
         if (arg0 != 1) {
            field7314 = -75L;
         }

         return super.field6259.method5445(true).method2415(false) ? 3 : 2;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7315[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "b",
      descriptor = "(I)Z"
   )
   public static final boolean method3906(int arg0) {
      try {
         if (arg0 != -4) {
            field7314 = -8L;
         }

         ++field7310;
         return ~class623.field9218 != -1;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7315[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         if (arg0 >= -46) {
            this.method28(true);
         }

         ++field7306;
         super.field6263 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7315[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method3907(int arg0) {
      try {
         field7312 = null;
         field7313 = null;
         if (arg0 >= -15) {
            method3907(-8);
         }

         field7305 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7315[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         ++field7308;
         if (arg1) {
            field7313 = null;
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7315[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class520(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!uf",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class520(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!uf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3908(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3909(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

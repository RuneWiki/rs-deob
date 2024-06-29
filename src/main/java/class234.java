import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class234 {
   @OriginalMember(
      owner = "client!nt",
      name = "l",
      descriptor = "Ldia;"
   )
   private class245 field2901 = new class245(256);
   @OriginalMember(
      owner = "client!nt",
      name = "g",
      descriptor = "Ldia;"
   )
   private class245 field2905 = new class245(256);
   @OriginalMember(
      owner = "client!nt",
      name = "h",
      descriptor = "Lqh;"
   )
   private class74 field2894;
   @OriginalMember(
      owner = "client!nt",
      name = "b",
      descriptor = "Lqh;"
   )
   private class74 field2897;
   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2906 = new String[]{method1771(method1770("\u001d\u000b\u0017L/")), method1771(method1770("\bQ\u0017!z")), method1771(method1770("\u001d\nUc")), method1771(method1770("\u001d\u000b\u0017K/")), method1771(method1770("\u001d\u000b\u00173n\u001d\u0016M1/")), method1771(method1770("\u001d\u000b\u0017J/")), method1771(method1770("\u001d\u000b\u0017N/")), method1771(method1770("\u001d\u000b\u0017M/"))};
   @OriginalMember(
      owner = "client!nt",
      name = "d",
      descriptor = "I"
   )
   public static int field2899 = 0;
   @OriginalMember(
      owner = "client!nt",
      name = "f",
      descriptor = "Ldg;"
   )
   public static class436 field2895 = new class436(method1771(method1770("$+p")), method1771(method1770("\u001c\u0019_fd\u0016")), method1771(method1770(",\bMf")), 5);
   @OriginalMember(
      owner = "client!nt",
      name = "c",
      descriptor = "Lbga;"
   )
   public static class378 field2904 = new class378(52, 3);
   @OriginalMember(
      owner = "client!nt",
      name = "j",
      descriptor = "I"
   )
   public static int field2896;
   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "I"
   )
   public static int field2898;
   @OriginalMember(
      owner = "client!nt",
      name = "i",
      descriptor = "I"
   )
   public static int field2902;
   @OriginalMember(
      owner = "client!nt",
      name = "e",
      descriptor = "I"
   )
   public static int field2903;
   @OriginalMember(
      owner = "client!nt",
      name = "k",
      descriptor = "[Lu;"
   )
   public static class80[] field2900;

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "([IBI)Lin;"
   )
   public final class98 method1765(int[] arg0, byte arg1, int arg2) {
      try {
         ++field2896;
         if (arg1 >= -44) {
            field2904 = null;
         }

         if (~this.field2897.method719(true) == -2) {
            return this.method1768(arg2, arg0, (byte)-127, 0);
         } else if (~this.field2897.method727(arg2, -32767) == -2) {
            return this.method1768(0, arg0, (byte)-128, arg2);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2906[5] + (arg0 != null ? field2906[1] : field2906[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(I[III)Lin;"
   )
   private final class98 method1766(int arg0, int[] arg1, int arg2, int arg3) {
      try {
         ++field2902;
         int var5 = arg2 ^ (arg0 >>> 12 | (arg0 & -268431361) << 4);
         int var6 = var5 | arg0 << 16;
         if (arg3 <= 29) {
            this.field2894 = null;
         }

         long var7 = (long)var6;
         class98 var9 = (class98)this.field2905.method1839(51, var7);
         if (var9 != null) {
            return var9;
         } else if (arg1 != null && arg1[0] <= 0) {
            return null;
         } else {
            class729 var10 = class729.method5302(this.field2894, arg0, arg2);
            if (var10 == null) {
               return null;
            } else {
               class98 var11 = var10.method5300();
               this.field2905.method1841(var7, true, var11);
               if (arg1 != null) {
                  arg1[0] -= var11.field1277.length;
               }

               return var11;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field2906[0] + arg0 + ',' + (arg1 != null ? field2906[1] : field2906[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "([III)Lin;"
   )
   public final class98 method1767(int[] arg0, int arg1, int arg2) {
      try {
         int var4 = -96 / ((-35 - arg2) / 37);
         ++field2898;
         if (~this.field2894.method719(true) == -2) {
            return this.method1766(0, arg0, arg1, 97);
         } else if (this.field2894.method727(arg1, -32767) == 1) {
            return this.method1766(arg1, arg0, 0, 30);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2906[6] + (arg0 != null ? field2906[1] : field2906[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(I[IBI)Lin;"
   )
   private final class98 method1768(int arg0, int[] arg1, byte arg2, int arg3) {
      try {
         if (arg2 > -126) {
            field2895 = null;
         }

         ++field2903;
         int var5 = (arg3 >>> 12 | 65524 & arg3 << 4) ^ arg0;
         int var6 = var5 | arg3 << 16;
         long var7 = (long)var6 ^ 4294967296L;
         class98 var9 = (class98)this.field2905.method1839(-14, var7);
         if (var9 != null) {
            return var9;
         } else if (arg1 != null && ~arg1[0] >= -1) {
            return null;
         } else {
            class36 var10 = (class36)this.field2901.method1839(-119, var7);
            if (var10 == null) {
               var10 = class36.method275(this.field2897, arg3, arg0);
               if (var10 == null) {
                  return null;
               }

               this.field2901.method1841(var7, true, var10);
            }

            class98 var11 = var10.method278(arg1);
            if (var11 == null) {
               return null;
            } else {
               var10.method3609(82);
               this.field2905.method1841(var7, true, var11);
               return var11;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field2906[3] + arg0 + ',' + (arg1 != null ? field2906[1] : field2906[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "<init>",
      descriptor = "(Lqh;Lqh;)V"
   )
   public class234(class74 arg0, class74 arg1) {
      try {
         this.field2894 = arg0;
         this.field2897 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2906[4] + (arg0 != null ? field2906[1] : field2906[2]) + ',' + (arg1 != null ? field2906[1] : field2906[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1769(int arg0) {
      try {
         field2900 = null;
         field2904 = null;
         if (arg0 >= -84) {
            method1769(92);
         }

         field2895 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2906[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1770(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1771(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

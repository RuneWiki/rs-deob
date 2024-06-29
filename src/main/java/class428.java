import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class428 {
   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6138 = new String[]{method3171(method3170("`BCcW'")), method3171(method3170("`BC\u007fW'")), method3171(method3170("`BC}W'")), method3171(method3170("`BC|W'")), method3171(method3170("`BC~W'"))};
   @OriginalMember(
      owner = "client!oh",
      name = "e",
      descriptor = "[F"
   )
   public static float[] field6128 = new float[4];
   @OriginalMember(
      owner = "client!oh",
      name = "i",
      descriptor = "J"
   )
   public static long field6133 = 0L;
   @OriginalMember(
      owner = "client!oh",
      name = "b",
      descriptor = "I"
   )
   public static int field6129;
   @OriginalMember(
      owner = "client!oh",
      name = "k",
      descriptor = "I"
   )
   public static int field6132;
   @OriginalMember(
      owner = "client!oh",
      name = "d",
      descriptor = "I"
   )
   public static int field6134;
   @OriginalMember(
      owner = "client!oh",
      name = "l",
      descriptor = "I"
   )
   public static int field6135;
   @OriginalMember(
      owner = "client!oh",
      name = "f",
      descriptor = "I"
   )
   public static int field6136;
   @OriginalMember(
      owner = "client!oh",
      name = "g",
      descriptor = "J"
   )
   public long field6137;
   @OriginalMember(
      owner = "client!oh",
      name = "j",
      descriptor = "Loh;"
   )
   public class428 field6126;
   @OriginalMember(
      owner = "client!oh",
      name = "c",
      descriptor = "Loh;"
   )
   public class428 field6130;
   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field6131;
   @OriginalMember(
      owner = "client!oh",
      name = "h",
      descriptor = "[[Lbl;"
   )
   public static class678[][] field6127;

   @OriginalMember(
      owner = "client!oh",
      name = "e",
      descriptor = "(I)V",
      line = 4
   )
   public final void method3165(int arg0) {
      try {
         ++field6134;
         if (this.field6130 != null) {
            if (arg0 <= 107) {
               method3167(false);
            }

            this.field6130.field6126 = this.field6126;
            this.field6126.field6130 = this.field6130;
            this.field6130 = null;
            this.field6126 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6138[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(IIIZI)V",
      line = 23
   )
   public static final void method3166(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      try {
         ++field6132;
         class755 var5 = class317.method2325((long)arg0 | (long)arg1 << 32, 92, 18);
         var5.method5479(1288);
         if (arg3) {
            method3168(-19, (byte)81, -97);
         }

         var5.field11181 = arg2;
         var5.field11184 = arg4;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field6138[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "b",
      descriptor = "(Z)V",
      line = 44
   )
   public static void method3167(boolean arg0) {
      try {
         field6127 = null;
         field6128 = null;
         if (!arg0) {
            field6133 = -75L;
         }

         field6131 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6138[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(IBI)Z",
      line = 57
   )
   public static final boolean method3168(int arg0, byte arg1, int arg2) {
      try {
         ++field6136;
         if (arg1 >= -116) {
            return true;
         } else {
            return (2048 & arg2) != 0;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6138[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "f",
      descriptor = "(I)Z",
      line = 71
   )
   public final boolean method3169(int arg0) {
      try {
         ++field6135;
         if (arg0 != -11402) {
            method3166(-35, 75, -89, true, -43);
         }

         return this.field6130 != null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6138[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3170(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3171(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

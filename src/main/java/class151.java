import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class151 {
   @OriginalMember(
      owner = "client!ls",
      name = "d",
      descriptor = "J"
   )
   public long field2110;
   @OriginalMember(
      owner = "client!ls",
      name = "b",
      descriptor = "Lwi;"
   )
   private class494 field2111;
   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2115 = new String[]{method1263(method1262("G~~&)")), method1263(method1262("G~~\u0003hEl<\f{N%")), method1263(method1262("G~~$)")), method1263(method1262("G~~')")), method1263(method1262("P#~K|")), method1263(method1262("G~~YhEd$[)")), method1263(method1262("Ex<\t"))};
   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "[C"
   )
   public static char[] field2112 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
   @OriginalMember(
      owner = "client!ls",
      name = "c",
      descriptor = "Lek;"
   )
   public static class536 field2108 = new class536(67, -1);
   @OriginalMember(
      owner = "client!ls",
      name = "g",
      descriptor = "I"
   )
   public static int field2109;
   @OriginalMember(
      owner = "client!ls",
      name = "e",
      descriptor = "I"
   )
   public static int field2113;
   @OriginalMember(
      owner = "client!ls",
      name = "f",
      descriptor = "I"
   )
   public static int field2114;

   @OriginalMember(
      owner = "client!ls",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.field2111.method3589(435, this.field2110);
         ++field2109;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2115[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1259(byte arg0) {
      try {
         if (arg0 != -125) {
            field2108 = null;
         }

         field2112 = null;
         field2108 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2115[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1260(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != -20442) {
            return true;
         } else {
            ++field2113;
            return ~(arg2 & 2048) != -1 | class36.method321((byte)85, arg1, arg2) || class326.method2410(false, arg2, arg1);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2115[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method1261(int arg0, int arg1, int arg2) {
      try {
         ++field2114;
         if (arg1 <= 112) {
            field2108 = null;
         }

         return ~(arg0 & 384) != -1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2115[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "<init>",
      descriptor = "(Lwi;J[Llha;)V"
   )
   public class151(class494 arg0, long arg1, class653[] arg2) {
      try {
         this.field2110 = arg1;
         this.field2111 = arg0;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2115[5] + (arg0 != null ? field2115[4] : field2115[6]) + ',' + arg1 + ',' + (arg2 != null ? field2115[4] : field2115[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1262(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1263(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

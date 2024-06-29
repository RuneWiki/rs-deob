import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class126 extends class775 {
   @OriginalMember(
      owner = "client!sea",
      name = "v",
      descriptor = "J"
   )
   private long field1806 = -1L;
   @OriginalMember(
      owner = "client!sea",
      name = "x",
      descriptor = "Ljava/lang/String;"
   )
   private String field1802 = null;
   @OriginalMember(
      owner = "client!sea",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1811 = new String[]{method1195(method1194("Q(Y\u0004\u0002\n")), method1195(method1194("Q(Y\u0004\u0004\n")), method1195(method1194("Q(Y\u0004\u0006\n")), method1195(method1194("Yc\u0016\u0004=")), method1195(method1194("Q(Y\u0004\u0003\n")), method1195(method1194("L8TF")), method1195(method1194("Q(Y\u0004\u0005\n")), method1195(method1194("Q(Y\u0004\u0001\n"))};
   @OriginalMember(
      owner = "client!sea",
      name = "t",
      descriptor = "Lnaa;"
   )
   public static class113 field1803 = new class113(65, -1);
   @OriginalMember(
      owner = "client!sea",
      name = "w",
      descriptor = "I"
   )
   public static int field1804;
   @OriginalMember(
      owner = "client!sea",
      name = "y",
      descriptor = "I"
   )
   public static int field1805;
   @OriginalMember(
      owner = "client!sea",
      name = "A",
      descriptor = "I"
   )
   public static int field1807;
   @OriginalMember(
      owner = "client!sea",
      name = "u",
      descriptor = "I"
   )
   public static int field1808;
   @OriginalMember(
      owner = "client!sea",
      name = "z",
      descriptor = "I"
   )
   public static int field1810;
   @OriginalMember(
      owner = "client!sea",
      name = "B",
      descriptor = "Lrr;"
   )
   public static class678 field1809;

   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public static final boolean method1188(int arg0, boolean arg1, int arg2) {
      try {
         if (!arg1) {
            field1803 = null;
         }

         ++field1804;
         return ~(540800 & arg2) != -1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1811[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "(Lica;B)V"
   )
   public final void method1189(class354 arg0, byte arg1) {
      try {
         int var3 = 69 / ((arg1 - -84) / 34);
         if (~arg0.method2855(-31007) != -256) {
            --arg0.field5436;
            this.field1806 = arg0.method2898(32109);
         }

         ++field1808;
         this.field1802 = arg0.method2876(58);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1811[4] + (arg0 != null ? field1811[3] : field1811[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "(Lsda;I)V"
   )
   public final void method1190(class223 arg0, int arg1) {
      try {
         arg0.method1932(this.field1802, this.field1806, (byte)103);
         int var3 = 91 % ((arg1 - -23) / 45);
         ++field1810;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1811[7] + (arg0 != null ? field1811[3] : field1811[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "(Ljava/lang/String;I)I"
   )
   public static final int method1191(String arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field1807;
         int var3 = arg0.length();
         int var4 = 0;
         int var5 = 0;
         if (arg1 != 65) {
            method1192(-46);
            if (var2) {
               var4 = (var4 << 5) + -var4 + arg0.charAt(var5);
               ++var5;
            }
         }

         while(true) {
            while(~var5 > ~var3) {
               var4 = (var4 << 5) + -var4 + arg0.charAt(var5);
               ++var5;
            }

            if (!var2) {
               return var4;
            }

            var4 = var4;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1811[6] + (arg0 != null ? field1811[3] : field1811[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1192(int arg0) {
      try {
         int var1 = -100 % ((7 - arg0) / 42);
         field1803 = null;
         field1809 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1811[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method1193(int arg0) {
      try {
         ++field1805;
         if (arg0 != 588960933) {
            field1809 = null;
         }

         return class127.field1821;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1811[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1194(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1195(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

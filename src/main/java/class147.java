import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class147 implements class603 {
   @OriginalMember(
      owner = "client!g",
      name = "d",
      descriptor = "Lhp;"
   )
   public class366 field1840;
   @OriginalMember(
      owner = "client!g",
      name = "i",
      descriptor = "Lww;"
   )
   private class339 field1836;
   @OriginalMember(
      owner = "client!g",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1843 = new String[]{method1191(method1190("\tWX\u0017")), method1191(method1190("\tW[\u0017")), method1191(method1190("\tWV\u0017")), method1191(method1190("\tW\"V\u001a\u0007\r \u0017")), method1191(method1190("\u0015W0\u0011\t")), method1191(method1190("\u0000\frS")), method1191(method1190("\tWZ\u0017")), method1191(method1190("\tWY\u0017"))};
   @OriginalMember(
      owner = "client!g",
      name = "j",
      descriptor = "S"
   )
   public static short field1841 = 320;
   @OriginalMember(
      owner = "client!g",
      name = "f",
      descriptor = "Laka;"
   )
   public static class418 field1835 = new class418(135, -2);
   @OriginalMember(
      owner = "client!g",
      name = "h",
      descriptor = "I"
   )
   public static int field1833;
   @OriginalMember(
      owner = "client!g",
      name = "g",
      descriptor = "I"
   )
   public static int field1837;
   @OriginalMember(
      owner = "client!g",
      name = "c",
      descriptor = "I"
   )
   public static int field1838;
   @OriginalMember(
      owner = "client!g",
      name = "a",
      descriptor = "I"
   )
   public static int field1839;
   @OriginalMember(
      owner = "client!g",
      name = "b",
      descriptor = "I"
   )
   public static int field1842;
   @OriginalMember(
      owner = "client!g",
      name = "e",
      descriptor = "Lpd;"
   )
   public class648 field1834;

   @OriginalMember(
      owner = "client!g",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1188(int arg0) {
      try {
         field1835 = null;
         int var1 = 103 / ((-55 - arg0) / 39);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1843[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method221(int arg0) {
      try {
         ++field1842;
         return arg0 != -10439 ? false : this.field1836.method2681((byte)64, this.field1840.field5091);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1843[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method223(int arg0) {
      try {
         this.field1834 = class13.method110(this.field1836, this.field1840.field5091, 255);
         if (arg0 != -28722) {
            this.method221(29);
         }

         ++field1833;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1843[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "a",
      descriptor = "(IZ)V"
   )
   public void method222(int arg0, boolean arg1) {
      try {
         if (arg1) {
            int var3 = this.field1840.field5093.method1893((byte)-49, this.field1834.method2406(), class286.field3961) + this.field1840.field5098;
            int var4 = this.field1840.field5095.method4440(class627.field9254, arg0 + 22503, this.field1834.method2396()) + this.field1840.field5094;
            this.field1834.method4760(var3, var4);
         }

         if (arg0 != -22493) {
            this.method223(14);
         }

         ++field1839;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1843[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method1189(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 < 37) {
            method1188(-118);
         }

         ++field1838;
         return (class52.method386(arg2, arg0, 0) | (8192 & arg0) != 0 | class401.method3148(arg0, arg2, 113)) & class523.method3915(arg2, arg0, 0);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1843[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "<init>",
      descriptor = "(Lww;Lhp;)V"
   )
   public class147(class339 arg0, class366 arg1) {
      try {
         this.field1840 = arg1;
         this.field1836 = arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1843[3] + (arg0 != null ? field1843[4] : field1843[5]) + ',' + (arg1 != null ? field1843[4] : field1843[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1190(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!g",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1191(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class78 extends class22 {
   @OriginalMember(
      owner = "client!naa",
      name = "r",
      descriptor = "I"
   )
   public int field1345 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!naa",
      name = "v",
      descriptor = "I"
   )
   public int field1351 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!naa",
      name = "u",
      descriptor = "I"
   )
   public int field1354 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!naa",
      name = "w",
      descriptor = "I"
   )
   public int field1352 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!naa",
      name = "o",
      descriptor = "I"
   )
   public int field1353 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!naa",
      name = "j",
      descriptor = "I"
   )
   public int field1356 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!naa",
      name = "m",
      descriptor = "I"
   )
   public int field1355 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!naa",
      name = "p",
      descriptor = "I"
   )
   public int field1357 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!naa",
      name = "k",
      descriptor = "Lsda;"
   )
   public class269 field1346;
   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1358 = new String[]{method802(method801("$\u000e$Hgb")), method802(method801("$\u000e$Hfb")), method802(method801("$\u000e$Hdb")), method802(method801("1AkHX")), method802(method801("$\u000e$H\u0019#\u0001,\u0012\u001bb")), method802(method801("$\u001a)\n"))};
   @OriginalMember(
      owner = "client!naa",
      name = "n",
      descriptor = "Lld;"
   )
   public static class178 field1344 = new class178(64);
   @OriginalMember(
      owner = "client!naa",
      name = "t",
      descriptor = "I"
   )
   public static int field1350 = 0;
   @OriginalMember(
      owner = "client!naa",
      name = "s",
      descriptor = "I"
   )
   public static int field1347 = 0;
   @OriginalMember(
      owner = "client!naa",
      name = "l",
      descriptor = "I"
   )
   public static int field1348;
   @OriginalMember(
      owner = "client!naa",
      name = "q",
      descriptor = "I"
   )
   public static int field1349;

   @OriginalMember(
      owner = "client!naa",
      name = "b",
      descriptor = "(I)V",
      line = 4
   )
   public static void method798(int arg0) {
      try {
         if (arg0 != Integer.MIN_VALUE) {
            method799(68);
         }

         field1344 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1358[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(I)V",
      line = 17
   )
   public static final void method799(int arg0) {
      try {
         ++field1348;
         if (class510.field7454.field11159.method1137(false) == arg0 && class731.field10504 != class359.field5371) {
            class668.method4882(false, 11, arg0, class36.field883, class375.field5579);
         } else {
            class465.method3484(class444.field6473, false);
            if (class731.field10504 != class18.field319) {
               class158.method1443(arg0 + 512);
            }
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1358[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(III)Z",
      line = 40
   )
   public final boolean method800(int arg0, int arg1, int arg2) {
      try {
         ++field1349;
         if (arg2 != Integer.MAX_VALUE) {
            this.method800(-72, 78, -112);
         }

         if (this.field1352 <= arg1 && ~this.field1356 <= ~arg1 && this.field1355 <= arg0 && arg0 <= this.field1345) {
            return true;
         } else {
            return ~this.field1354 >= ~arg1 && this.field1357 >= arg1 && this.field1351 <= arg0 && this.field1353 >= arg0;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1358[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "<init>",
      descriptor = "(Lsda;)V",
      line = 96
   )
   public class78(class269 arg0) {
      try {
         this.field1346 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1358[4] + (arg0 != null ? field1358[3] : field1358[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method801(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method802(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

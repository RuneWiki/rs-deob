import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public abstract class class198 extends class72 {
   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2530 = new String[]{method1649(method1648("0jU\u0006@")), method1649(method1648("0jU\u0003@")), method1649(method1648("/s\u0017+")), method1649(method1648("0jU\u0005@")), method1649(method1648(":(Ui\u0015"))};
   @OriginalMember(
      owner = "client!ql",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public static String field2525 = "";
   @OriginalMember(
      owner = "client!ql",
      name = "g",
      descriptor = "S"
   )
   public static short field2529 = 256;
   @OriginalMember(
      owner = "client!ql",
      name = "h",
      descriptor = "I"
   )
   public static int field2526;
   @OriginalMember(
      owner = "client!ql",
      name = "e",
      descriptor = "I"
   )
   public static int field2527;
   @OriginalMember(
      owner = "client!ql",
      name = "d",
      descriptor = "I"
   )
   public static int field2528;

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(IIIII)I"
   )
   public static final int method1644(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg1 != 2616) {
            field2526 = 125;
         }

         ++field2528;
         int var5 = -class746.field10897[arg4 * 8192 / arg0] + 65536 >> 1;
         return ((65536 - var5) * arg2 >> 16) + (arg3 * var5 >> 16);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2530[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(I)Ltt;"
   )
   public abstract class531 method1645(int arg0);

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(ILst;Z)V"
   )
   public static final void method1646(int arg0, class706 arg1, boolean arg2) {
      try {
         ++field2527;
         class737.field10797.method4405(arg1, 32);
         if (arg0 <= -62) {
            if (arg2) {
               class401.method3147(arg1, class392.field5431, class737.field10797, class428.field5815, 16, class604.field8873);
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2530[3] + arg0 + ',' + (arg1 != null ? field2530[4] : field2530[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1647(int arg0) {
      try {
         if (arg0 != -16919) {
            field2526 = -80;
         }

         field2525 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2530[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1648(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1649(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

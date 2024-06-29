import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class588 {
   @OriginalMember(
      owner = "client!rg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8672 = new String[]{method4382(method4381("\u0007m\u0004\b5")), method4382(method4381("\u0007m\u0004\t5")), method4382(method4381("\u0007m\u0004\n5"))};
   @OriginalMember(
      owner = "client!rg",
      name = "c",
      descriptor = "Llia;"
   )
   public static class633 field8670 = new class633(method4382(method4381("\"^c")), method4382(method4381("\u001alL\"~\u0010")), method4382(method4381("*}^\"")), 5);
   @OriginalMember(
      owner = "client!rg",
      name = "e",
      descriptor = "I"
   )
   public static int field8667;
   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "I"
   )
   public static int field8669;
   @OriginalMember(
      owner = "client!rg",
      name = "d",
      descriptor = "I"
   )
   public static int field8671;
   @OriginalMember(
      owner = "client!rg",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field8668;

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4378(int arg0) {
      try {
         field8668 = null;
         if (arg0 != -20974) {
            method4380((byte)37, 10);
         }

         field8670 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8672[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(BC)Z"
   )
   public static final boolean method4379(byte arg0, char arg1) {
      try {
         ++field8669;
         if (arg0 < 107) {
            return true;
         } else {
            return arg1 >= 'A' && arg1 <= 'Z' || ~arg1 <= -98 && arg1 <= 'z';
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8672[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(BI)Lfha;"
   )
   public static final class289 method4380(byte arg0, int arg1) {
      try {
         ++field8667;
         class289 var2 = (class289)class541.field7902.method3192((long)arg1, (byte)-113);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class118.field1553.method2697(arg1, 1, false);
            class289 var4 = new class289();
            var4.field4001 = arg1;
            if (var3 != null) {
               var4.method2344(97, new class66(var3));
            }

            var4.method2341(true);
            if (~var4.field3989 == -3 && class763.field11177.method1818(-1, (long)arg1) == null) {
               class763.field11177.method1808((long)arg1, new class278(class725.field10587), 26459);
               class244.field3083[class725.field10587++] = var4;
            }

            class541.field7902.method3190(var4, (long)arg1, 8);
            if (arg0 < 41) {
               method4380((byte)-85, -102);
            }

            return var4;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8672[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4381(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4382(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

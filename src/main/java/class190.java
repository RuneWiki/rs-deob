import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class190 extends class213 {
   @OriginalMember(
      owner = "client!dca",
      name = "w",
      descriptor = "I"
   )
   private int field2700 = -1;
   @OriginalMember(
      owner = "client!dca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2706 = new String[]{method1506(method1505("o{}9")), method1506(method1505("emp{Z)")), method1506(method1505("z ?{c")), method1506(method1505("emp{\\)")), method1506(method1505("emp{[)")), method1506(method1505("emp{_)")), method1506(method1505("emp{])"))};
   @OriginalMember(
      owner = "client!dca",
      name = "u",
      descriptor = "I"
   )
   public static int field2701;
   @OriginalMember(
      owner = "client!dca",
      name = "x",
      descriptor = "I"
   )
   public static int field2703;
   @OriginalMember(
      owner = "client!dca",
      name = "t",
      descriptor = "I"
   )
   public static int field2704;
   @OriginalMember(
      owner = "client!dca",
      name = "v",
      descriptor = "I"
   )
   public static int field2705;
   @OriginalMember(
      owner = "client!dca",
      name = "y",
      descriptor = "Lv;"
   )
   public static class606 field2702;

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(ILea;IBI)Lu;"
   )
   public static final class81 method1502(int arg0, class573 arg1, int arg2, byte arg3, int arg4) {
      try {
         ++field2701;
         if (arg3 != -40) {
            return null;
         } else if (arg1.field8470 || class471.method3415(arg2, true) && class471.method3415(arg4, true)) {
            return new class81(arg1, 3553, arg0, arg2, arg4);
         } else {
            return arg1.field8397 ? new class81(arg1, 34037, arg0, arg2, arg4) : new class81(arg1, arg0, arg2, arg4, class350.method2552(false, arg2), class350.method2552(false, arg4));
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2706[1] + arg0 + ',' + (arg1 != null ? field2706[2] : field2706[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(Lqv;Z)V"
   )
   public final void method1343(class472 arg0, boolean arg1) {
      try {
         arg0.method3438(0, this.field2700);
         if (!arg1) {
            method1503((byte)47);
         }

         ++field2705;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2706[5] + (arg0 != null ? field2706[2] : field2706[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1503(byte arg0) {
      try {
         int var1 = -57 / ((-3 - arg0) / 56);
         field2702 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2706[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(Lwf;B)V"
   )
   public final void method1347(class147 arg0, byte arg1) {
      try {
         ++field2704;
         this.field2700 = arg0.method1211(-26166);
         if (arg1 > -38) {
            field2702 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2706[6] + (arg0 != null ? field2706[2] : field2706[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(BI[B)[B"
   )
   public static final byte[] method1504(byte arg0, int arg1, byte[] arg2) {
      try {
         ++field2703;
         if (arg0 != 49) {
            method1503((byte)-23);
         }

         byte[] var3 = new byte[arg1];
         class242.method1848(arg2, 0, var3, 0, arg1);
         return var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2706[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2706[2] : field2706[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1505(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1506(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

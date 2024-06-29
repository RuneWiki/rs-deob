import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class311 extends class375 {
   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4335 = new String[]{method2483(method2482("z-\u0018T\u007f")), method2483(method2482("z-\u0018U\u007f")), method2483(method2482("z-\u0018[\u007f")), method2483(method2482("e,Z~")), method2483(method2482("pw\u0018<*")), method2483(method2482("z-\u0018Z\u007f"))};
   @OriginalMember(
      owner = "client!qt",
      name = "h",
      descriptor = "I"
   )
   public static int field4329 = 0;
   @OriginalMember(
      owner = "client!qt",
      name = "j",
      descriptor = "I"
   )
   public static int field4331 = 0;
   @OriginalMember(
      owner = "client!qt",
      name = "g",
      descriptor = "Lse;"
   )
   public static class6 field4328 = new class6(27, -1);
   @OriginalMember(
      owner = "client!qt",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field4333 = false;
   @OriginalMember(
      owner = "client!qt",
      name = "i",
      descriptor = "S"
   )
   public static short field4334 = 32767;
   @OriginalMember(
      owner = "client!qt",
      name = "k",
      descriptor = "I"
   )
   public static int field4327;
   @OriginalMember(
      owner = "client!qt",
      name = "l",
      descriptor = "I"
   )
   public static int field4330;
   @OriginalMember(
      owner = "client!qt",
      name = "n",
      descriptor = "I"
   )
   public static int field4332;

   @OriginalMember(
      owner = "client!qt",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2478(byte arg0) {
      try {
         field4328 = null;
         int var1 = 72 / ((14 - arg0) / 45);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4335[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(Lgea;I)Lup;"
   )
   public static final class548 method2479(class66 arg0, int arg1) {
      try {
         ++field4330;
         int var2 = arg0.method640(255);
         class237 var3 = class405.method3174(true)[arg0.method640(255)];
         class596 var4 = class680.method4958(arg1 + 120)[arg0.method640(255)];
         int var5 = arg0.method652((byte)48);
         int var6 = arg0.method652((byte)23);
         int var7 = arg0.method603(-2);
         int var8 = arg0.method603(-2);
         int var9 = arg0.method610(-5);
         int var10 = arg0.method610(-100);
         int var11 = arg0.method610(-67);
         boolean var12 = arg1 == arg0.method640(255);
         return new class548(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field4335[5] + (arg0 != null ? field4335[4] : field4335[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public static final boolean method2480(int arg0, int arg1, boolean arg2) {
      try {
         if (!arg2) {
            method2480(-55, 46, true);
         }

         ++field4327;
         if (~arg1 == -12) {
            arg1 = 10;
         }

         class294 var3 = class438.field5967.method929((byte)-84, arg0);
         if (~arg1 <= -6 && ~arg1 >= -9) {
            arg1 = 4;
         }

         return var3.method2374(arg1, (byte)-37);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4335[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2481(byte arg0) {
      try {
         class607.field8981 = -1;
         class549.field8103 = -1;
         class779.field11361 = 0;
         ++field4332;
         if (arg0 != -29) {
            method2480(-90, 104, true);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4335[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2482(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2483(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

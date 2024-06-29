import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class547 {
   @OriginalMember(
      owner = "client!ni",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8119 = new String[]{method4052(method4051("Vrd \u0018")), method4052(method4051("Vrd\"\u0018"))};
   @OriginalMember(
      owner = "client!ni",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field8113 = false;
   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "Lnn;"
   )
   public static class436 field8115 = new class436(method4052(method4051("oO\u001b\"")), method4052(method4051("W},\nS]")), method4052(method4051("gj+")), 2);
   @OriginalMember(
      owner = "client!ni",
      name = "b",
      descriptor = "I"
   )
   public static int field8114;
   @OriginalMember(
      owner = "client!ni",
      name = "f",
      descriptor = "I"
   )
   public static int field8117;
   @OriginalMember(
      owner = "client!ni",
      name = "e",
      descriptor = "J"
   )
   public static long field8118;
   @OriginalMember(
      owner = "client!ni",
      name = "c",
      descriptor = "Lti;"
   )
   public static class464 field8116;

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "()V",
      line = 16
   )
   public static final void method4048() {
      for(int var0 = class370.field5635; var0 < class424.field6437; ++var0) {
         for(int var1 = 0; var1 < class239.field3036; ++var1) {
            for(int var2 = 0; var2 < class220.field2796; ++var2) {
               class72 var3 = class353.field5360[var0][var1][var2];
               if (var3 != null) {
                  class411 var4 = var3.field907;
                  class411 var5 = var3.field915;
                  if (var4 != null && var4.method19((byte)70)) {
                     class402.method3088(var4, var0, var1, var2, 1, 1);
                     if (var5 != null && var5.method19((byte)70)) {
                        class402.method3088(var5, var0, var1, var2, 1, 1);
                        var5.method18(0, class261.field3550, 0, false, 0, (byte)125, var4);
                        var5.method3(1);
                     }

                     var4.method3(1);
                  }

                  for(class389 var6 = var3.field910; var6 != null; var6 = var6.field5942) {
                     class741 var8 = var6.field5943;
                     if (var8 != null && var8.method19((byte)70)) {
                        class402.method3088(var8, var0, var1, var2, var8.field10990 - var8.field10995 + 1, var8.field10992 - var8.field11000 + 1);
                        var8.method3(1);
                     }
                  }

                  class249 var7 = var3.field919;
                  if (var7 != null && var7.method19((byte)70)) {
                     class275.method2116(var7, var0, var1, var2);
                     var7.method3(1);
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(I)V",
      line = 92
   )
   public static void method4049(int arg0) {
      try {
         field8115 = null;
         field8116 = null;
         if (arg0 != -5601) {
            method4050(true, -127);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8119[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(ZI)V",
      line = 103
   )
   public static final void method4050(boolean arg0, int arg1) {
      try {
         class120.field1458 = arg1;
         ++field8117;
         if (arg0) {
            method4050(true, -124);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8119[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4051(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ni",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4052(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

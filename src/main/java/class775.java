import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public abstract class class775 extends class294 {
   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11393 = new String[]{method5635(method5634("e+k\u001b[ ")), method5635(method5634("e+k\u001bY ")), method5635(method5634("e+k\u001bZ ")), method5635(method5634("f9fY")), method5635(method5634("sb$\u001bm"))};
   @OriginalMember(
      owner = "client!mga",
      name = "m",
      descriptor = "Lnaa;"
   )
   public static class113 field11388 = new class113(8, -1);
   @OriginalMember(
      owner = "client!mga",
      name = "o",
      descriptor = "[Z"
   )
   public static boolean[] field11390 = new boolean[200];
   @OriginalMember(
      owner = "client!mga",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field11392 = false;
   @OriginalMember(
      owner = "client!mga",
      name = "n",
      descriptor = "D"
   )
   public static double field11387;
   @OriginalMember(
      owner = "client!mga",
      name = "q",
      descriptor = "I"
   )
   public static int field11386;
   @OriginalMember(
      owner = "client!mga",
      name = "p",
      descriptor = "I"
   )
   public static int field11389;
   @OriginalMember(
      owner = "client!mga",
      name = "s",
      descriptor = "I"
   )
   public static int field11391;

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(Lica;B)V"
   )
   public abstract void method1189(class354 arg0, byte arg1);

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method5631(int arg0, byte arg1) {
      try {
         class603.field8813.method2552(arg0, 21533);
         ++field11391;
         class630.field9118.method2552(arg0, 21533);
         if (arg1 > -110) {
            field11390 = null;
         }

         class58.field722.method2552(arg0, 21533);
         class361.field5595.method2552(arg0, 21533);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11393[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(IILjava/lang/String;)V"
   )
   public static final void method5632(int arg0, int arg1, String arg2) {
      try {
         ++field11386;
         class566 var3 = class146.method1321((long)arg0, arg1, -1428737160);
         var3.method4269((byte)-128);
         var3.field8400 = arg2;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11393[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11393[4] : field11393[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(Lsda;I)V"
   )
   public abstract void method1190(class223 arg0, int arg1);

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5633(byte arg0) {
      try {
         int var1 = -76 % ((-64 - arg0) / 52);
         field11388 = null;
         field11390 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11393[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5634(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5635(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

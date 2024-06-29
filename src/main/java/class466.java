import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class466 {
   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6417 = new String[]{method3418(method3417("z;ctU")), method3418(method3417("z;cwU"))};
   @OriginalMember(
      owner = "client!ks",
      name = "b",
      descriptor = "Lbga;"
   )
   public static class378 field6415 = new class378(25, 0);
   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "I"
   )
   public static int field6416;

   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3415(boolean arg0) {
      try {
         if (arg0) {
            field6415 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6417[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3416(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg1 >= class265.field3451 && class663.field9442 >= arg1) {
            int var8 = class138.method1159(arg4, class313.field4171, (byte)-44, class478.field6604);
            int var7 = class138.method1159(arg2, class313.field4171, (byte)-44, class478.field6604);
            class97.method899(arg1, arg0, var8, var7, 94);
         }

         if (arg3 == 10070) {
            ++field6416;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6417[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3417(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3418(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

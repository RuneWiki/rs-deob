import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class760 {
   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11031 = new String[]{method5499(method5498("[j\u0016\u0003_")), method5499(method5498("C'\u0016i\n")), method5499(method5498("V|T+")), method5499(method5498("[j\u0016\u0005_")), method5499(method5498("ulU}")), method5499(method5498("~yK}")), method5499(method5498("[j\u0016\u0004_"))};
   @OriginalMember(
      owner = "client!cc",
      name = "g",
      descriptor = "Luw;"
   )
   public static class435 field11024 = new class435(16, 3);
   @OriginalMember(
      owner = "client!cc",
      name = "d",
      descriptor = "Ljfa;"
   )
   public static class303 field11027 = null;
   @OriginalMember(
      owner = "client!cc",
      name = "e",
      descriptor = "I"
   )
   public static int field11025;
   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "I"
   )
   public static int field11026;
   @OriginalMember(
      owner = "client!cc",
      name = "c",
      descriptor = "I"
   )
   public static int field11028;
   @OriginalMember(
      owner = "client!cc",
      name = "f",
      descriptor = "I"
   )
   public static int field11029;
   @OriginalMember(
      owner = "client!cc",
      name = "b",
      descriptor = "Lst;"
   )
   public static class455 field11030;

   @OriginalMember(
      owner = "client!cc",
      name = "b",
      descriptor = "(B)V",
      line = 6
   )
   public static void method5495(byte arg0) {
      try {
         field11024 = null;
         int var1 = 22 % ((-6 - arg0) / 60);
         field11027 = null;
         field11030 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11031[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(IILd;ILha;BI)V",
      line = 20
   )
   public static final void method5496(int arg0, int arg1, class160 arg2, int arg3, class65 arg4, byte arg5, int arg6) {
      try {
         ++field11029;
         if (~class661.field9617 > -101) {
            class340.method2632(arg2, arg4, 20685);
         }

         arg4.method333(arg3, arg6, arg3 - -arg1, arg0 + arg6);
         if (~class661.field9617 > -101) {
            byte var7 = 20;
            int var8 = arg1 / 2 + arg3;
            int var9 = arg0 / 2 + (arg6 - 18) - var7;
            arg4.method295(arg3, arg6, arg1, arg0, -16777216, 0);
            arg4.method403(var8 + -152, var9, 304, 34, class713.field10344[class276.field3900].getRGB(), 0);
            arg4.method295(var8 + -150, var9 + 2, class661.field9617 * 3, 30, class397.field5844[class276.field3900].getRGB(), 0);
            class296.field4151.method712(var8, -1, 5, class685.field10082[class276.field3900].getRGB(), var9 - -var7, class100.field1617.method961(class385.field5684, true));
         } else {
            int var10 = -((int)((float)arg1 / class370.field5488)) + class755.field10968;
            int var11 = (int)((float)arg0 / class370.field5488) + class48.field1043;
            int var12 = (int)((float)arg1 / class370.field5488) + class755.field10968;
            int var13 = class48.field1043 - (int)((float)arg0 / class370.field5488);
            class12.field136 = (int)((float)(arg1 * 2) / class370.field5488);
            class159.field2540 = -((int)((float)arg1 / class370.field5488)) + class755.field10968;
            class204.field3047 = -((int)((float)arg0 / class370.field5488)) + class48.field1043;
            class661.field9616 = (int)((float)(arg0 * 2) / class370.field5488);
            class370.method2878(class370.field5513 + var10, var11 - -class370.field5494, var12 - -class370.field5513, class370.field5494 + var13, arg3, arg6, arg3 - -arg1, arg6 + 1 + arg0);
            class370.method2897(arg4);
            class332 var14 = class370.method2881(arg4);
            class389.method3014(-268689328, arg4, 0, var14, 0);
            if (~class265.field3776 < -1) {
               --class372.field5541;
               if (class372.field5541 == 0) {
                  --class265.field3776;
                  class372.field5541 = 20;
               }
            }

            int var15 = 40 % ((22 - arg5) / 48);
            if (class324.field4665) {
               int var16 = arg3 - 5 + arg1;
               int var17 = arg0 + -8 + arg6;
               class678.field9949.method714(-1, var17, field11031[5] + class69.field1245, var16, 16776960, -16777216);
               int var23 = var17 - 15;
               Runtime var18 = Runtime.getRuntime();
               int var19 = (int)((var18.totalMemory() + -var18.freeMemory()) / 1024L);
               int var20 = 16776960;
               if (var19 > 65536) {
                  var20 = 16711680;
               }

               class678.field9949.method714(-1, var23, field11031[4] + var19 + "k", var16, var20, -16777216);
               var17 = var23 - 15;
            }
         }
      } catch (RuntimeException var22) {
         throw class608.method4462(var22, field11031[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11031[1] : field11031[2]) + ',' + arg3 + ',' + (arg4 != null ? field11031[1] : field11031[2]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(ZI)V",
      line = 106
   )
   public static final void method5497(boolean param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(B)J"
   )
   public abstract long method803(byte arg0);

   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5498(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5499(char[] arg0) {
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
            var10005 = 9;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

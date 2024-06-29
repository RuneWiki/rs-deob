import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class121 extends class70 {
   @OriginalMember(
      owner = "client!fl",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1608 = new String[]{method1070(method1069("\u001d*\u0014Y'")), method1070(method1069("\u001d*\u0014['")), method1070(method1069("\u0000h\u00140r")), method1070(method1069("\u00153Vr")), method1070(method1069("\u001d*\u0014Z'")), method1070(method1069("=6I$")), method1070(method1069("6#W$")), method1070(method1069("\u001d*\u0014V'")), method1070(method1069("\u001d*\u0014Q'"))};
   @OriginalMember(
      owner = "client!fl",
      name = "N",
      descriptor = "I"
   )
   public static int field1604 = 0;
   @OriginalMember(
      owner = "client!fl",
      name = "M",
      descriptor = "I"
   )
   public static int field1602;
   @OriginalMember(
      owner = "client!fl",
      name = "K",
      descriptor = "I"
   )
   public static int field1603;
   @OriginalMember(
      owner = "client!fl",
      name = "I",
      descriptor = "I"
   )
   public static int field1605;
   @OriginalMember(
      owner = "client!fl",
      name = "L",
      descriptor = "I"
   )
   public static int field1606;
   @OriginalMember(
      owner = "client!fl",
      name = "J",
      descriptor = "[S"
   )
   public static short[] field1607;

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "([BI)V"
   )
   public static final void method1065(byte[] param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fl",
      name = "j",
      descriptor = "(I)V"
   )
   public static final void method1066(int arg0) {
      try {
         ++field1602;
         if (arg0 != 34) {
            method1067((class479)null, (class102)null, -105, -114, 72, (byte)-103, -4);
         }

         class487 var1 = class2.method12(0L, 15, (byte)43);
         var1.method3696(arg0 + -11152);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1608[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      try {
         ++field1605;
         return arg0 != -63 ? null : class17.field290;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1608[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(Lha;Ld;IIIBI)V"
   )
   public static final void method1067(class479 arg0, class102 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
      try {
         ++field1603;
         if (class264.field3355 < 100) {
            class356.method2826(arg1, arg0, 79);
         }

         arg0.method460(arg2, arg4, arg2 + arg6, arg3 + arg4);
         if (class264.field3355 < 100) {
            byte var7 = 20;
            int var8 = arg6 / 2 + arg2;
            int var9 = arg3 / 2 + -var7 + -18 + arg4;
            arg0.method513(arg2, arg4, arg6, arg3, -16777216, 0);
            arg0.method462(var8 + -152, var9, 304, 34, class111.field1491[class482.field6691].getRGB(), 0);
            arg0.method513(var8 + -150, var9 - -2, class264.field3355 * 3, 30, class642.field9586[class482.field6691].getRGB(), 0);
            class98.field1306.method3421(-1, var7 + var9, var8, 8364, class606.field8921.method4490(class782.field11389, -16777216), class36.field501[class482.field6691].getRGB());
         } else {
            int var10 = -((int)((float)arg6 / class326.field4481)) + class345.field4731;
            int var11 = (int)((float)arg3 / class326.field4481) + class381.field5303;
            int var12 = (int)((float)arg6 / class326.field4481) + class345.field4731;
            class642.field9565 = -((int)((float)arg3 / class326.field4481)) + class381.field5303;
            class391.field5416 = (int)((float)(arg6 * 2) / class326.field4481);
            int var13 = -((int)((float)arg3 / class326.field4481)) + class381.field5303;
            class604.field8875 = -((int)((float)arg6 / class326.field4481)) + class345.field4731;
            class147.field1837 = (int)((float)(arg3 * 2) / class326.field4481);
            class326.method2575(class326.field4502 + var10, var11 - -class326.field4499, class326.field4502 + var12, class326.field4499 + var13, arg2, arg4, arg2 + arg6, arg4 - -1 + arg3);
            class326.method2564(arg0);
            class37 var14 = class326.method2570(arg0);
            class52.method388(118, var14, 0, 0, arg0);
            if (arg5 <= 3) {
               method1068(-59);
            }

            if (~class768.field11204 < -1) {
               --class495.field6905;
               if (~class495.field6905 == -1) {
                  --class768.field11204;
                  class495.field6905 = 20;
               }
            }

            if (class731.field10652) {
               int var15 = arg2 + -5 - -arg6;
               int var16 = arg3 + arg4 + -8;
               class209.field2657.method3431(16776960, var16, field1608[5] + class618.field9102, (byte)-110, var15, -1);
               int var22 = var16 - 15;
               Runtime var17 = Runtime.getRuntime();
               int var18 = (int)((var17.totalMemory() + -var17.freeMemory()) / 1024L);
               int var19 = 16776960;
               if (var18 > 65536) {
                  var19 = 16711680;
               }

               class209.field2657.method3431(var19, var22, field1608[6] + var18 + "k", (byte)-120, var15, -1);
               var16 = var22 - 15;
            }
         }
      } catch (RuntimeException var21) {
         throw class93.method866(var21, field1608[7] + (arg0 != null ? field1608[2] : field1608[3]) + ',' + (arg1 != null ? field1608[2] : field1608[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "<init>",
      descriptor = "()V"
   )
   public class121() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!fl",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method1068(int arg0) {
      try {
         field1607 = null;
         if (arg0 != 2) {
            field1604 = 24;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1608[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1069(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1070(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

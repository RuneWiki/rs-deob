import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class349 extends OutputStream {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Ljava/util/Random;")
    public static Random field4872 = new Random();

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "[I")
    public static int[] field4879 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
    public static int[] field4878 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[Lmf;")
    public static class420[] field4876;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZIIII)V")
    public static final void method2191(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4873++;
        if (class649.field8928 == null) {
            class272.field3822.method624(arg2, (byte) -125, arg3, arg5, arg4, -16777216);
        } else if (class58.field1147.field5922 >= 0 && class58.field1147.field5922 < class376.field5325 * 512 && class58.field1147.field5933 >= 0 && class58.field1147.field5933 < (class175.field2711 * 512)) {
            class448.field6342++;
            if (class58.field1147 != null && (class58.field1147.field5922 + 256 - (class58.field1147.method2457((byte) 90) * 256) >> 9) == class295.field4138 && (class58.field1147.field5933 + 256 - (class58.field1147.method2457((byte) 112) * 256) >> 9) == class136.field2279) {
                class136.field2279 = -1;
                class295.field4138 = -1;
                class105.method957(false);
            }
            class476.method2794(-14988);
            if (!arg1) {
                class86.method821(512);
            }
            class746.method4162(-4);
            class587.method3350(arg3, arg5, arg2, true, (byte) -82, arg4);
            int var6 = class470.field6595;
            int var7 = class67.field1271;
            int var8 = class504.field7021;
            class58.field1146 = class58.field1151;
            int var9 = class551.field7595;
            if (class438.field6252 == 1) {
                int var10 = (int) class440.field6267;
                if (var10 < (class113.field1948 >> 8)) {
                    var10 = class113.field1948 >> 8;
                }
                if (class226.field3216[4] && class20.field304[4] + 128 > var10) {
                    var10 = class20.field304[4] + 128;
                }
                int var11 = (int) class451.field6366 + class637.field8757 & 0x3FFF;
                class691.method3865(var10, class197.method1403(class58.field1147.field5922, class382.field5551, 11219, class58.field1147.field5933) - 200, var11, class476.field6650, var8, -19360, class162.field2584, (var10 >> 3) * 3 + 600 << 2);
            } else if (class438.field6252 == 4) {
                int var12 = (int) class440.field6267;
                if (var12 < class113.field1948 >> 8) {
                    var12 = class113.field1948 >> 8;
                }
                if (class226.field3216[4] && (class20.field304[4] + 128) > var12) {
                    var12 = class20.field304[4] + 128;
                }
                int var13 = (int) class451.field6366 & 0x3FFF;
                class691.method3865(var12, class197.method1403(class667.field9105, class382.field5551, 11219, class54.field1111) - 200, var13, class476.field6650, var8, -19360, class162.field2584, ((var12 >> 3) * 3) + 600 << 2);
            } else if (class438.field6252 == 5) {
                class521.method3033(var8, 0);
            }
            int var14 = class108.field1896;
            int var15 = class458.field6444;
            int var16 = class275.field3870;
            int var17 = class634.field8721;
            int var18 = class600.field8231;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class226.field3216[var19]) {
                    int var22 = (int) (Math.random() * (double) (class197.field2899[var19] * 2 + 1) + Math.sin((double) class546.field7533[var19] / 100.0D * (double) class576.field7909[var19]) * (double) class20.field304[var19] - (double) class197.field2899[var19]);
                    if (var19 == 4) {
                        class634.field8721 += var22;
                        if (class634.field8721 < 1024) {
                            class634.field8721 = 1024;
                        } else if (class634.field8721 > 3072) {
                            class634.field8721 = 3072;
                        }
                    }
                    if (var19 == 0) {
                        class108.field1896 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class600.field8231 = class600.field8231 + var22 & 0x3FFF;
                    }
                    if (var19 == 1) {
                        class458.field6444 += var22 << 2;
                    }
                    if (var19 == 2) {
                        class275.field3870 += var22 << 2;
                    }
                }
            }
            if (class108.field1896 < 0) {
                class108.field1896 = 0;
            }
            if ((class434.field6208 << 9) - 1 < class108.field1896) {
                class108.field1896 = (class434.field6208 << 9) - 1;
            }
            if (class275.field3870 < 0) {
                class275.field3870 = 0;
            }
            if (((class432.field6185 << 9) - 1) < class275.field3870) {
                class275.field3870 = (class432.field6185 << 9) - 1;
            }
            class561.method3224(114);
            class587.method3351((byte) -107);
            class272.field3822.method303(var7, var6, var7 + var9, var6 + var8);
            class69.method683(1, true);
            if (class241.field3529) {
                class495.method2913(124, class186.field2794);
                if (class58.field1146 != class278.field3923) {
                    class30.field778 = true;
                }
                class278.field3923 = class58.field1146;
            } else {
                class272.field3822.method324();
                int var20 = class186.field2794;
                if (class318.field4390 == null) {
                    class272.field3822.method220(var20);
                } else {
                    class318.field4390.method2717(class681.field9221 << 3, class272.field3822, (byte) -72, var7, var9, var6, class600.field8231, class634.field8721, var20, var8);
                }
            }
            class15.method120(false);
            if (arg0 >= 80) {
                class244.field3536.method747(class108.field1896, class458.field6444, class275.field3870, -class634.field8721 & 0x3FFF, -class600.field8231 & 0x3FFF, -class546.field7523 & 0x3FFF);
                class272.field3822.method210(class244.field3536);
                class272.field3822.method179(var9 / 2 + var7, var8 / 2 + var6, class136.field2281 << 1, class136.field2281 << 1);
                class132.method1088(class136.field2281 << 1, class136.field2281 << 1, (byte) -18, var9 / 2 + var7, var8 / 2 + var6);
                class336.method2128(-class634.field8721 & 0x3FFF, class275.field3870, class458.field6444, 0, -class600.field8231 & 0x3FFF, class108.field1896, -class546.field7523 & 0x3FFF);
                byte var21 = class693.field9368.field4461.method2473(-32350) == 2 ? (byte) class448.field6342 : 1;
                if (class241.field3529) {
                    class569.method3290(-15902, -class600.field8231 & 0x3FFF, -class546.field7523 & 0x3FFF, -class634.field8721 & 0x3FFF);
                    class460.method2724(class472.field6606, -2, class591.field8070, class58.field1147.field5933 >> 9, class58.field1147.field5926 + 1, class531.field7324, class108.field1896, class275.field3870, class693.field9368.field4443.method2040(-32350) == 0, class458.field6444, class58.field1147.field5922 >> 9, class444.field6316, class98.field1699, var21, class120.field2057, class641.field8810, true, class58.field1146);
                } else {
                    class635.method3620(class641.field8810, class108.field1896, class458.field6444, class275.field3870, class591.field8070, class531.field7324, class444.field6316, class98.field1699, class120.field2057, class472.field6606, class58.field1147.field5926 + 1, var21, class58.field1147.field5922 >> 9, class58.field1147.field5933 >> 9, class693.field9368.field4443.method2040(-32350) == 0, true, class458.field6459 ? class58.field1146 : -1, 0, false);
                }
                class15.method120(false);
                if (class214.field3036 == 10) {
                    class207.method1428(-127, var9, 256, var8, var7, var6, 256);
                    class22.method345(var6, var8, 2, var7, var9, 256, 256);
                    class576.method3322(var7, 256, var6, var9, 19206, var8, 256);
                    class730.method4040(var8, var9, var6, 8, var7);
                }
                class561.method3222();
                class108.field1896 = var14;
                class634.field8721 = var17;
                class600.field8231 = var18;
                class458.field6444 = var15;
                class275.field3870 = var16;
                if (class75.field1359 && class235.field3411.method1936(4) == 0) {
                    class75.field1359 = false;
                }
                if (class75.field1359) {
                    class272.field3822.method624(var9, (byte) -125, var7, var6, var8, -16777216);
                    class130.method1074(false, class355.field5007, class308.field4276, class497.field6903.method2936(class607.field8336, 544), 2, class272.field3822);
                }
                class69.method683(1, false);
            }
        } else {
            class272.field3822.method624(arg2, (byte) -125, arg3, arg5, arg4, -16777216);
        }
    }

    @OriginalMember(owner = "client!sc", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4875++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method2192(byte arg0) {
        field4879 = null;
        field4878 = null;
        field4876 = null;
        if (arg0 != -41) {
            field4878 = null;
        }
        field4872 = null;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public static final void method2193(byte arg0) {
        if (arg0 != -126) {
            method2191(-95, true, 10, 28, 45, 100);
        }
        if (class382.field5545 == null) {
            class520 var1 = new class520();
            byte[] var2 = var1.method3027(128, 128, (byte) 106, 16);
            class382.field5545 = class727.method4021(var2, false, (byte) 111);
        }
        field4871++;
        if (class70.field1291 == null) {
            class275 var3 = new class275();
            byte[] var4 = var3.method1813(128, (byte) -38, 16, 128);
            class70.field1291 = class727.method4021(var4, false, (byte) 106);
        }
    }
}

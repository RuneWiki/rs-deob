import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class760 {

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "[I")
    public int[] field10589;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "[[F")
    public float[][] field10590;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "[I")
    public int[] field10592;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "[I")
    public int[] field10593;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "F")
    public static float field10596;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field10587;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field10588;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field10591;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field10594;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "[Ltr;")
    public static class125[] field10595;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
    public static void method4229(int arg0) {
        if (arg0 != -16777216) {
            method4233(null, false, null);
        }
        field10595 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIB)V")
    public static final void method4230(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (class328.field4190 >= arg1 && arg2 >= class112.field1386) {
            boolean var6;
            if (class108.field1334 > arg3) {
                var6 = false;
                arg3 = class108.field1334;
            } else if (arg3 > class592.field8242) {
                arg3 = class592.field8242;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg4 < class108.field1334) {
                arg4 = class108.field1334;
                var7 = false;
            } else if (arg4 <= class592.field8242) {
                var7 = true;
            } else {
                var7 = false;
                arg4 = class592.field8242;
            }
            if (class112.field1386 > arg1) {
                arg1 = class112.field1386;
            } else {
                class284.method1709(class15.field220[arg1++], arg4, -8251, arg3, arg0);
            }
            if (arg2 <= class328.field4190) {
                class284.method1709(class15.field220[arg2--], arg4, -8251, arg3, arg0);
            } else {
                arg2 = class328.field4190;
            }
            if (var6 && var7) {
                for (int var8 = arg1; var8 <= arg2; var8++) {
                    int[] var9 = class15.field220[var8];
                    var9[arg3] = var9[arg4] = arg0;
                }
            } else if (var6) {
                for (int var10 = arg1; var10 <= arg2; var10++) {
                    class15.field220[var10][arg3] = arg0;
                }
            } else if (var7) {
                for (int var11 = arg1; var11 <= arg2; var11++) {
                    class15.field220[var11][arg4] = arg0;
                }
            }
        }
        if (arg5 >= -21) {
            field10595 = null;
        }
        field10587++;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZLtba;Lha;Lda;ZLjava/lang/String;)V")
    public static final void method4231(boolean arg0, class56 arg1, class454 arg2, class423 arg3, boolean arg4, String arg5) {
        if (!arg4) {
            return;
        }
        field10594++;
        boolean var6 = !class217.field2736 || class584.method3257(111);
        if (!var6) {
            return;
        }
        if (class217.field2736 && var6) {
            class56 var7 = class646.field8900;
            class423 var8 = arg2.method156(var7, class585.field8120, true);
            int var9 = var7.method447(null, (byte) 118, 250, arg5);
            int var10 = var7.method450(null, arg5, 250, (byte) -34, var7.field813);
            int var11 = class744.field10389.field2527;
            int var12 = var11 + 4;
            int var13 = var12 * 2 + var9;
            int var14 = var12 * 2 + var10;
            if (var14 < class586.field8189) {
                var14 = class586.field8189;
            }
            if (var13 < class121.field1459) {
                var13 = class121.field1459;
            }
            int var15 = class415.field5907.method4235(false, class303.field3896, var13) + class8.field89;
            int var16 = class205.field2610.method2413(var14, class708.field9966, (byte) -8) + class315.field4050;
            if (class107.field1323) {
                var15 += class173.method1075(-55);
                var16 += class203.method1259((byte) 121);
            }
            arg2.method60(class518.field7288, false).method1871(class38.field563.field2527 + var15, class38.field563.field2525 + var16, var13 - class38.field563.field2527 * 2, -(class38.field563.field2525 * 2) + var14, 1, 0, 0);
            arg2.method60(class38.field563, true).method3929(var15, var16);
            class38.field563.method1226();
            arg2.method60(class38.field563, true).method3929(var15 - (var11 - var13), var16);
            class38.field563.method1224();
            arg2.method60(class38.field563, true).method3929(var15 + var13 - var11, var16 - var11 + var14);
            class38.field563.method1226();
            arg2.method60(class38.field563, true).method3929(var15, var14 + var16 - var11);
            class38.field563.method1224();
            arg2.method60(class744.field10389, true).method3938(var15, class38.field563.field2525 + var16, var11, var14 - (class38.field563.field2525 * 2));
            class744.field10389.method1233();
            arg2.method60(class744.field10389, true).method3938(var15 + class38.field563.field2527, var16, var13 - class38.field563.field2527 * 2, var11);
            class744.field10389.method1233();
            arg2.method60(class744.field10389, true).method3938(var13 + var15 - var11, var16 - -class38.field563.field2525, var11, var14 - (class38.field563.field2525 * 2));
            class744.field10389.method1233();
            arg2.method60(class744.field10389, true).method3938(var15 + class38.field563.field2527, -var11 + var14 + var16, var13 - (class38.field563.field2527 * 2), var11);
            class744.field10389.method1233();
            var8.method2523(var12 + var15, -(var12 * 2) + var13, 0, -1, null, var14 - (var12 * 2), class646.field8904 | 0xFF000000, arg5, null, 1, null, var16 + var12, 17517, 1, 0, 0);
            class266.method1600(var13, var16, var14, var15, (byte) -128);
        } else {
            int var17 = arg1.method447(null, (byte) 67, 250, arg5);
            int var18 = arg1.method449(250, arg5, 120, null) * 13;
            byte var19 = 4;
            int var20 = var19 + 6;
            int var21 = var19 + 6;
            arg2.method167(var20 - var19, -var19 + var21, var17 + var19 + var19, var18 - (-var19 + -var19), -16777216, 0);
            arg2.method136(var20 - var19, var21 - var19, var17 + var19 + var19, var18 + var19 + var19, -1, 0);
            arg3.method2523(var20, var17, 0, -1, null, var18, -1, arg5, null, 1, null, var21, 17517, 1, 0, 0);
            class266.method1600(var17 + var19 + var19, -var19 + var21, var18 + var19 + var19, -var19 + var20, (byte) -128);
        }
        if (!arg0) {
            return;
        }
        try {
            if (class107.field1323) {
                class11.method54(true);
            } else {
                arg2.method2662((byte) 127);
            }
        } catch (class510 var22) {
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "([I[I[I[[F)V")
    public class760(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field10589 = arg2;
        this.field10590 = arg3;
        this.field10592 = arg1;
        this.field10593 = arg0;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(FI)F")
    public static final float method4232(float arg0, int arg1) {
        field10591++;
        if (arg1 != 7764) {
            method4229(82);
        }
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;ZLjava/io/File;)V")
    public static final void method4233(String arg0, boolean arg1, File arg2) {
        field10588++;
        if (arg1) {
            method4233(null, false, null);
        }
        class368.field5201.put(arg0, arg2);
    }
}

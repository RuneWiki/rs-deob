import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class168 {

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field3019 = 0;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "[[B")
    public static byte[][] field3021 = new byte[50][];

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "[I")
    public static int[] field3020 = new int[32768];

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "Ljava/awt/Frame;")
    public static Frame field3026;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "[[[I")
    public static int[][][] field3023;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 61)
    public static void method1170(int arg0) {
        field3020 = null;
        field3021 = (byte[][]) null;
        field3026 = null;
        if (arg0 == 2047) {
            field3023 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIILca;I)V", line = 75)
    public static final void method1171(int arg0, int arg1, int arg2, int arg3, int arg4, class98 arg5, int arg6) {
        field3025++;
        int var7 = arg3 * arg3 + arg6 * arg6;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg5.field1673 / 2, arg5.field1688 / 2);
        if (var8 * var8 < var7) {
            int var9 = class328.field5609 + class186.field3423 & 0x7FF;
            int var10 = class263.field4653[var9];
            var8 -= 10;
            int var11 = var10 * 256 / (class272.field4775 + 256);
            int var12 = class263.field4649[var9];
            int var13 = var12 * 256 / (class272.field4775 + 256);
            int var14 = arg6 * var11 + (arg3 * var13) >> 16;
            int var15 = arg6 * var13 - (arg3 * var11) >> 16;
            double var16 = Math.atan2((double) var14, (double) var15);
            int var18 = (int) ((double) var8 * Math.sin(var16));
            int var19 = (int) (Math.cos(var16) * (double) var8);
            if (class231.field4051) {
                ((class49) class284.field4971[arg0]).method343(240, 240, (arg5.field1673 / 2 + var18 + arg2) * 16, (arg5.field1688 / 2 + arg1 - var19) * 16, (int) (var16 * 10430.378D), 4096);
            } else {
                ((class12) class284.field4971[arg0]).method62(arg5.field1673 / 2 + arg2 + var18 - 10, arg1 - 10 + arg5.field1688 / 2 + -var19, 20, 20, 15, 15, var16, 256);
            }
        } else {
            class3.method28(arg1, arg5, arg3, arg6, class104.field1813[arg0], (byte) -57, arg2);
        }
        if (arg4 != -256) {
            method1171(9, 76, -119, -34, -61, (class98) null, -70);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIIII)V", line = 176)
    public static final void method1172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class92 var7 = new class92();
        var7.field1460 = arg1 / 128;
        var7.field1465 = arg2 / 128;
        var7.field1451 = arg3 / 128;
        var7.field1469 = arg4 / 128;
        var7.field1445 = arg0;
        var7.field1458 = arg1;
        var7.field1449 = arg2;
        var7.field1459 = arg3;
        var7.field1455 = arg4;
        var7.field1462 = arg5;
        var7.field1473 = arg6;
        class285.field4985[class145.field2621++] = var7;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)Lca;", line = 202)
    public static final class98 method1173(int arg0, int arg1) {
        if (arg1 != -1456948048) {
            return (class98) null;
        }
        int var2 = arg0 >> 16;
        field3018++;
        int var3 = arg0 & 0xFFFF;
        if (class320.field5485[var2] == null || class320.field5485[var2][var3] == null) {
            boolean var4 = class219.method1508(var2, -123);
            if (!var4) {
                return null;
            }
        }
        return class320.field5485[var2][var3];
    }
}

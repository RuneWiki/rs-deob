import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 {

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Lqg;")
    private class321 field275;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public int field279;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Lao;")
    public static class188 field281 = null;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Ldq;")
    public static class489 field273 = new class489(13, 4);

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field287 = 0;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "[[I")
    public static int[][] field284 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "[S")
    public static short[] field285 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "[Lf;")
    public static class528[] field283;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[BIIII[BI)V")
    public static final void method163(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        field286++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        if (arg4 != 20223) {
            method167((byte) 38, null, -50);
        }
        for (int var11 = -arg8; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg2[var10001] += arg7[arg6++];
                int var14 = arg1++;
                arg2[var14] += arg7[arg6++];
                int var15 = arg1++;
                arg2[var15] += arg7[arg6++];
                int var16 = arg1++;
                arg2[var16] += arg7[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg2[var10001] += arg7[arg6++];
            }
            arg6 += arg0;
            arg1 += arg3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
    public static final int method164(int arg0, int arg1, int arg2) {
        field278++;
        if (arg1 == 4 || arg1 == 5) {
            return class78.field1305[arg2 & 0x3];
        } else if (arg0 == 1) {
            return 256;
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static final void method165(int arg0) {
        field280++;
        class438.method2660(-5, false);
        if (class311.field4452 >= 0 && class311.field4452 != 0) {
            class470.method2803(class311.field4452, (byte) 62);
            class311.field4452 = -1;
        }
        int var1 = 10 / ((6 - arg0) / 52);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static void method166(byte arg0) {
        if (arg0 <= 8) {
            method168(true, -55, null);
        }
        field283 = null;
        field281 = null;
        field273 = null;
        field285 = null;
        field284 = null;
    }

    @OriginalMember(owner = "client!ub", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field282++;
        this.field275.method2054(this.field279, (byte) -117);
        super.finalize();
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLui;I)V")
    public static final void method167(byte arg0, class151 arg1, int arg2) {
        field277++;
        if (arg0 != 41) {
            field273 = null;
        }
        if (class54.field796) {
            arg2 = 0;
            class54.field796 = false;
        }
        if (class474.field6982 != null && class474.field6982.method1096(49, arg1)) {
            return;
        }
        class474.field6982 = arg1;
        class96.field1563 = class464.method2773((byte) 103);
        class415.field6118 = arg2;
        class337.field5144 = arg2;
        if (class337.field5144 == 0) {
            class443.method2691(false);
            return;
        }
        class434.field6309 = class82.field1354;
        class74.field1238 = class324.field4963;
        class84.field1376 = class87.field1462;
        class297.field4250 = class131.field2012;
        class89.field1495 = class392.field5805;
        class61.field1051 = class134.field2066;
        class179.field2711 = class210.field3027;
        class236.field3423 = class41.field628;
        class205.field2960 = class182.field2745;
        class129.field1980 = class188.field2789;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lqg;II)V")
    public class18(class321 arg0, int arg1, int arg2) {
        this.field275 = arg0;
        this.field279 = arg2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZILjava/awt/Component;)Lbr;")
    public static final class268 method168(boolean arg0, int arg1, Component arg2) {
        field272++;
        if (arg1 != 0) {
            field284 = null;
        }
        return new class87(arg2, arg0);
    }
}

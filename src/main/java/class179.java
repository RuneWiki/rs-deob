import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class179 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "[S")
    public static short[] field3251 = new short[256];

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "[J")
    public static long[] field3253 = new long[200];

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lcc;")
    public static class209 field3257 = class95.method669(118, " loggt sich aus)3");

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Lsj;")
    public static class49 field3258;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[I")
    public static int[] field3252;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method1232(int arg0) {
        field3258 = null;
        field3251 = null;
        field3253 = null;
        field3252 = null;
        if (arg0 != 230) {
            method1232(-7);
        }
        field3257 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZJ)V")
    public static final void method1233(boolean arg0, long arg1) {
        field3254++;
        class84.field1677.field2085 = 0;
        if (!arg0) {
            return;
        }
        class84.field1677.method773(-6385, 230);
        class84.field1677.method756(arg1, (byte) -121);
        class78.field1444 = 1;
        class141.field2608 = 0;
        class72.field1360 = -3;
        class64.field1247 = 0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static final void method1234(boolean arg0) {
        if (arg0) {
            field3258 = null;
        }
        field3255++;
        class222.field4051.method664(120);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILpb;JZ)V")
    public static final void method1235(int arg0, int arg1, int arg2, int arg3, class126 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class230 var8 = new class230();
        var8.field4183 = arg4;
        var8.field4175 = arg1 * 128 + 64;
        var8.field4180 = arg2 * 128 + 64;
        var8.field4179 = arg3;
        var8.field4171 = arg5;
        if (class106.field2089[arg0][arg1][arg2] == null) {
            class106.field2089[arg0][arg1][arg2] = new class109(arg0, arg1, arg2);
        }
        class106.field2089[arg0][arg1][arg2].field2198 = var8;
    }
}

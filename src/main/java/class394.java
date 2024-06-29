import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class394 extends class472 {

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    private int field5595;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    private int field5585;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    private int field5593;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
    private int field5588;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "[[I")
    public static int[][] field5590 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "Lef;")
    public static class311 field5587 = new class311(12, 6);

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "Lo;")
    public static class24 field5599;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "Lii;")
    public static class358 field5597;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBI)V")
    public final void method15(int arg0, byte arg1, int arg2) {
        ++field5592;
        if (arg1 > -35) {
            method2354(-36, (Object) null, false);
        }
        int var4 = this.field5593 * arg2 >> 12;
        int var5 = this.field5585 * arg2 >> 12;
        int var6 = this.field5595 * arg0 >> 12;
        int var7 = this.field5588 * arg0 >> 12;
        class179.method1095(var7, var4, var5, var6, -65536, super.field6641);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
    public static void method2352(int arg0) {
        field5587 = null;
        if (arg0 >= -21) {
            field5597 = null;
        }
        field5599 = null;
        field5590 = null;
        field5597 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)I")
    public static final int method2353(int arg0, boolean arg1) {
        if (arg1) {
            method2355(-107, -39, true, -96);
        }
        ++field5589;
        int var2 = arg0 & 63;
        int var3 = (arg0 & 238) >> 6;
        if (var2 != 18) {
            if (~var2 == -20 || var2 == 21) {
                if (~var3 == -1) {
                    return 16;
                }
                if (var3 == 1) {
                    return 32;
                }
                if (~var3 == -3) {
                    return 64;
                }
                if (~var3 == -4) {
                    return 128;
                }
            }
        } else {
            if (var3 == 0) {
                return 1;
            }
            if (~var3 == -2) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
    public static final byte[] method2354(int arg0, Object arg1, boolean arg2) {
        ++field5598;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class276.method1699(-18682, var3) : var3;
        } else {
            if (arg0 <= 74) {
                field5590 = null;
            }
            if (arg1 instanceof class64) {
                class64 var4 = (class64) arg1;
                return var4.method395(false);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIZI)I")
    public static final int method2355(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 <= 243) {
            if (arg0 <= 217) {
                if (~arg0 >= -193) {
                    if (arg0 > 179) {
                        arg3 >>= 1;
                    }
                } else {
                    arg3 >>= 2;
                }
            } else {
                arg3 >>= 3;
            }
        } else {
            arg3 >>= 4;
        }
        if (!arg2) {
            method2354(-12, (Object) null, false);
        }
        ++field5594;
        return (arg3 >> 5 << 7) + ((arg1 >> 2 & 63) << 10) + (arg0 >> 1);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V")
    public final void method14(int arg0, int arg1, int arg2) {
        ++field5591;
        int var4 = this.field5593 * arg1 >> 12;
        int var5 = this.field5585 * arg1 >> 12;
        if (arg2 != -6196) {
            this.method14(-61, -44, -91);
        }
        int var6 = this.field5595 * arg0 >> 12;
        int var7 = this.field5588 * arg0 >> 12;
        class368.method2268(var7, true, var4, super.field6639, var6, super.field6640, super.field6641, var5);
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(IIIIIII)V")
    public class394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5595 = arg1;
        this.field5585 = arg2;
        this.field5593 = arg0;
        this.field5588 = arg3;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZII)V")
    public final void method16(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            ++field5596;
        }
    }
}

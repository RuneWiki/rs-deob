import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class61 extends class235 implements class529 {

    @OriginalMember(owner = "client!tt", name = "E", descriptor = "Lbi;")
    public class335 field712;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "Z")
    private boolean field701;

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "[I")
    public static int[] field708 = new int[32];

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "Ljk;")
    public static class446 field703 = null;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!tt", name = "C", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!tt", name = "D", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!tt", name = "F", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!tt", name = "G", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!tt", name = "H", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!tt", name = "I", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!tt", name = "K", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!tt", name = "J", descriptor = "[I")
    public static int[] field717;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(Lya;I)Lfk;", line = 3)
    public final class462 method38(class38 arg0, int arg1) {
        ++field711;
        class471 var3 = this.field712.method2042(super.field3447, true, arg0, super.field3445, 2048, (byte) 119, false);
        if (var3 == null) {
            return null;
        } else {
            class122 var4 = arg0.method362();
            if (arg1 > -87) {
                return null;
            } else {
                var4.method249(super.field3445, super.field3449, super.field3447);
                class462 var5 = null;
                if (this.field701) {
                    var5 = class482.method2908(1, (byte) -95);
                }
                if (this.field712.field4660 != null) {
                    class88 var6 = this.field712.field4660.method1331();
                    arg0.method324(var3, var6, var4, var5 != null ? var5.field6800[0] : null, 0);
                } else {
                    var3.method457(var4, var5 != null ? var5.field6800[0] : null, 0);
                }
                int var7 = super.field3445 >> 7;
                int var8 = super.field3447 >> 7;
                this.field712.method2050(true, var8, 28146, var3, var7, arg0, var8, var7);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Liv;B)Lbr;", line = 45)
    public static final class269 method548(class65 arg0, byte arg1) {
        if (arg1 <= 93) {
            return null;
        } else {
            ++field702;
            return new class269(arg0.method599((byte) 1), arg0.method599((byte) 1), arg0.method599((byte) 1), arg0.method599((byte) 1), arg0.method599((byte) 1), arg0.method599((byte) 1), arg0.method599((byte) 1), arg0.method599((byte) 1), arg0.method580((byte) 29), arg0.method577(255));
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILfi;BZLya;I)V", line = 56)
    public final void method25(int arg0, int arg1, class388 arg2, byte arg3, boolean arg4, class38 arg5, int arg6) {
        ++field718;
        if (arg3 == -99) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)I", line = 69)
    public final int method27(int arg0) {
        int var2 = -31 % ((arg0 - 39) / 41);
        ++field706;
        return this.field712.field4650;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lya;I)V", line = 83)
    public final void method31(class38 arg0, int arg1) {
        if (arg1 != -12694) {
            field708 = null;
        }
        ++field707;
        this.field712.method2046(arg1 ^ -274838, arg0);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILya;I)Z", line = 98)
    public final boolean method34(int arg0, int arg1, class38 arg2, int arg3) {
        ++field699;
        if (arg1 != 0) {
            return false;
        } else {
            class471 var5 = this.field712.method2042(super.field3447, false, arg2, super.field3445, 131072, (byte) 118, false);
            if (var5 == null) {
                return false;
            } else {
                class122 var6 = arg2.method362();
                var6.method249(super.field3445, super.field3449, super.field3447);
                return var5.method443(arg3, arg0, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLya;)V", line = 119)
    public final void method26(boolean arg0, class38 arg1) {
        this.field712.method2052(arg0, arg1);
        ++field715;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)I", line = 134)
    public final int method28(boolean arg0) {
        if (!arg0) {
            this.field712 = null;
        }
        ++field716;
        return this.field712.field4668;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lya;II)Lt;", line = 146)
    public final class471 method24(class38 arg0, int arg1, int arg2) {
        int var4 = 42 % ((arg2 - 54) / 56);
        ++field704;
        return this.field712.method2042(0, false, arg0, 0, arg1, (byte) 119, false);
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lya;Lrd;IIIIIZIII)V", line = 157)
    public class61(class38 arg0, class222 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class367.method2270(false, arg8, arg9));
        this.field712 = new class335(arg0, arg1, arg8, arg9, arg2, arg3, super.field3445, super.field3447, arg7, arg10);
        this.field701 = arg1.field3200 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)V", line = 169)
    public final void method29(int arg0) {
        int var2 = -9 / ((arg0 - 57) / 44);
        ++field709;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "(B)V", line = 179)
    public static void method549(byte arg0) {
        field703 = null;
        field717 = null;
        int var1 = 62 % ((arg0 - -76) / 49);
        field708 = null;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lya;I)V", line = 190)
    public final void method35(class38 arg0, int arg1) {
        ++field714;
        if (arg1 < 53) {
            this.method29(-52);
        }
        class471 var3 = this.field712.method2042(super.field3447, true, arg0, super.field3445, 262144, (byte) 126, true);
        if (var3 != null) {
            int var4 = super.field3445 >> 7;
            int var5 = super.field3447 >> 7;
            this.field712.method2050(false, var5, 28146, var3, var4, arg0, var5, var4);
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V", line = 211)
    public final void method39(int arg0) {
        if (arg0 >= -18) {
            this.method29(53);
        }
        ++field700;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)I", line = 221)
    public final int method22(byte arg0) {
        ++field705;
        if (arg0 != -70) {
            field708 = null;
        }
        return this.field712.field4672;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)Z", line = 233)
    public final boolean method30(int arg0) {
        ++field710;
        if (arg0 != 10869) {
            method548((class65) null, (byte) -105);
        }
        return this.field712.method2048(arg0 + -10870);
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(B)Z", line = 251)
    public final boolean method32(byte arg0) {
        ++field698;
        if (arg0 < 104) {
            field703 = null;
        }
        return false;
    }
}

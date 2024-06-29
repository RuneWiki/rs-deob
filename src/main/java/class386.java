import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class386 extends class265 implements class184 {

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field5769 = 0;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "B")
    private byte field5777;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "[Lf;")
    public static class256[] field5772;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIBLps;)V", line = 4)
    public static final void method2378(int arg0, int arg1, byte arg2, class5 arg3) {
        if (~arg3.field170 == -1) {
            arg3.field150 = arg3.field122;
        } else if (arg3.field170 != 1) {
            if (~arg3.field170 == -3) {
                arg3.field150 = -arg3.field76 - arg3.field122 + arg1;
            } else if (~arg3.field170 == -4) {
                arg3.field150 = arg3.field122 * arg1 >> 14;
            } else if (arg3.field170 != 4) {
                arg3.field150 = -arg3.field76 + arg1 + -(arg3.field122 * arg1 >> 14);
            } else {
                arg3.field150 = (arg3.field122 * arg1 >> 14) + (-arg3.field76 + arg1) / 2;
            }
        } else {
            arg3.field150 = (-arg3.field76 + arg1) / 2 + arg3.field122;
        }
        ++field5770;
        if (arg2 != 125) {
            field5772 = null;
        }
        if (~arg3.field148 != -1) {
            if (~arg3.field148 == -2) {
                arg3.field80 = (-arg3.field202 + arg0) / 2 + arg3.field84;
            } else if (arg3.field148 != 2) {
                if (arg3.field148 != 3) {
                    if (arg3.field148 == 4) {
                        arg3.field80 = (arg0 - arg3.field202) / 2 - -(arg3.field84 * arg0 >> 14);
                    } else {
                        arg3.field80 = arg0 - (arg3.field84 * arg0 >> 14) + -arg3.field202;
                    }
                } else {
                    arg3.field80 = arg3.field84 * arg0 >> 14;
                }
            } else {
                arg3.field80 = -arg3.field84 + arg0 - arg3.field202;
            }
        } else {
            arg3.field80 = arg3.field84;
        }
        if (class1.field9) {
            if (~client.method564(arg3).field1275 == -1 && arg3.field172 != 0) {
                return;
            }
            if (arg3.field150 >= 0) {
                if (arg3.field76 + arg3.field150 > arg1) {
                    arg3.field150 = arg1 - arg3.field76;
                }
            } else {
                arg3.field150 = 0;
            }
            if (arg3.field80 < 0) {
                arg3.field80 = 0;
                return;
            }
            if (~(arg3.field80 + arg3.field202) < ~arg0) {
                arg3.field80 = -arg3.field202 + arg0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)I", line = 75)
    public final int method963(boolean arg0) {
        if (arg0) {
            this.method1231(false, 89);
        }
        ++field5779;
        return super.method963(false);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z", line = 88)
    public final boolean method1228(int arg0, int arg1, Source arg2, int arg3) {
        ++field5773;
        this.field5777 = (byte) arg1;
        super.method1594(arg2, arg3, false);
        if (arg0 != -27648) {
            this.method987(-33);
        }
        return true;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lkd;Z)V", line = 103)
    public class386(class700 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 111)
    public final Buffer method1231(boolean arg0, int arg1) {
        if (arg1 != 3696) {
            return null;
        } else {
            ++field5774;
            return super.method1593(super.field3469.field9943, arg0, (byte) -37);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)Z", line = 122)
    public final boolean method1229(int arg0, int arg1, int arg2) {
        if (arg2 != 29812) {
            this.method987(-37);
        }
        this.field5777 = (byte) arg1;
        ++field5775;
        super.method984(arg0, 122);
        return true;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Z", line = 137)
    public final boolean method1230(int arg0) {
        if (arg0 > -57) {
            this.method1231(false, -18);
        }
        ++field5778;
        return super.method1588(super.field3469.field9943, 123);
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V", line = 148)
    public static void method2379(int arg0) {
        if (arg0 == 2) {
            field5772 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 158)
    public final void method987(int arg0) {
        ++field5776;
        super.method987(-121);
        int var2 = -4 % ((arg0 - -81) / 33);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)I", line = 169)
    public final int method2380(byte arg0) {
        ++field5771;
        if (arg0 > -119) {
            this.field5777 = -15;
        }
        return this.field5777;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)Lpo;", line = 183)
    public static final class332 method2381(int arg0, int arg1, int arg2) {
        class44 var3 = class603.field8695[arg0][arg1][arg2];
        return var3 == null ? null : var3.field668;
    }
}

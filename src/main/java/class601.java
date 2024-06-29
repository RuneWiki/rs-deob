import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class601 extends class164 {

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "Lkh;")
    public class15 field8664;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "Lop;")
    public static class172 field8665 = new class172();

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public static int field8667;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "Lmt;")
    public static class364 field8666;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(III)I", line = 5)
    public static final int method3466(int arg0, int arg1, int arg2) {
        field8668++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (~var3 > arg2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lkh;)V", line = 46)
    public class601(class15 arg0) {
        this.field8664 = arg0;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB[BIII)V", line = 54)
    public static final void method3467(int arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field8663++;
        if (arg4 <= arg5) {
            return;
        }
        int var6 = arg4 - arg5 >> 2;
        int var7 = arg0 + arg5;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg4 - arg5 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg1 == 77) {
                            return;
                        } else {
                            method3466(-101, 12, 111);
                            return;
                        }
                    }
                    arg2[var7++] = 1;
                }
            }
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V", line = 84)
    public static void method3468(boolean arg0) {
        field8666 = null;
        field8665 = null;
        if (!arg0) {
            method3466(-15, -84, 80);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class230 extends class202 {

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "[B")
    public byte[] field3795;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Lqh;")
    public static class201 field3792;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZII)I")
    public static final int method1611(boolean arg0, int arg1, int arg2) {
        field3791++;
        if (arg0) {
            method1611(false, -71, -95);
        }
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)Lf;")
    public static final class36 method1612(int arg0, int arg1, int arg2) {
        field3793++;
        class36 var3 = class64.method455(arg2, 592427152);
        if (arg0 != 1) {
            method1612(59, -75, -117);
        }
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field658 == null || var3.field658.length <= arg1) {
            return null;
        } else {
            return var3.field658[arg1];
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    public static void method1613(int arg0) {
        field3792 = null;
        if (arg0 != 65408) {
            method1612(46, -40, 81);
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([B)V")
    public class230(byte[] arg0) {
        this.field3795 = arg0;
    }
}

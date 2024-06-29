import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class27 extends class3 {

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "[I")
    public static int[] field408 = new int[14];

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "Ljava/lang/String;")
    public static String field411 = "flash3:";

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "[S")
    public static short[] field415 = new short[] { 15, 35, 19, 2, 36, 31, 44, 42 };

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIILkm;IJIIII)Z", line = 5)
    public static final boolean method230(int arg0, int arg1, int arg2, int arg3, class162 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class265.method1870(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lfh;IZ)V", line = 13)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field404++;
        if (arg2) {
            this.method234(-62, (byte) 1);
        }
        if (arg1 == 0) {
            this.method234(arg0.method2249(-98), (byte) 118);
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(III)Ljava/lang/String;", line = 42)
    public static final String method231(int arg0, int arg1, int arg2) {
        int var3 = arg0 - arg1;
        field412++;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (arg2 != -23750) {
            return (String) null;
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V", line = 81)
    private class27(int arg0) {
        super(0, false);
        this.method234(arg0, (byte) 118);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[[I", line = 92)
    public final int[][] method22(int arg0, int arg1) {
        if (arg0 != -21194) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field20.method2435(arg1, false);
        if (this.field20.field5556) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class326.field5342; var7++) {
                var4[var7] = this.field406;
                var5[var7] = this.field413;
                var6[var7] = this.field407;
            }
        }
        field410++;
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V", line = 127)
    public class27() {
        this(0);
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)Ljc;", line = 135)
    public static final class203 method232(int arg0) {
        field409++;
        if (arg0 != -10) {
            method231(-113, 28, -116);
        }
        try {
            return (class203) Class.forName("cb").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V", line = 157)
    public static void method233(int arg0) {
        field415 = null;
        if (arg0 != 20657) {
            field408 = (int[]) null;
        }
        field411 = null;
        field408 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)V", line = 173)
    private final void method234(int arg0, byte arg1) {
        this.field407 = arg0 & 0xFF << 4;
        if (arg1 > 97) {
            this.field413 = arg0 >> 4 & 0xFF0;
            field405++;
            this.field406 = (arg0 & 0xFF0000) >> 12;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZ)V", line = 187)
    public static final void method235(int arg0, boolean arg1) {
        class234.method1620(class121.field1807, class228.field3578, class246.field3917, class3.field18);
        class234.method1616(class131.field2001, class61.field935, arg1);
        field414++;
        if (arg0 != -1994937084) {
            return;
        }
        class234.method1617((float) class98.field1407, (float) class358.field5667, (float) class51.field758);
        class234.method1621();
        class114.field1670 = class154.field2497;
        class114.field1667 = class345.field5529;
        class114.field1666 = class185.field2869;
        class165.field2597 = class223.field3449;
    }
}

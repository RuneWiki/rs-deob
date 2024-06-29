import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class648 {

    @OriginalMember(owner = "client!paa", name = "o", descriptor = "I")
    public int field9128 = 8;

    @OriginalMember(owner = "client!paa", name = "n", descriptor = "I")
    public int field9127 = 16777215;

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "Lpa;")
    public static class387 field9117 = new class387(30);

    @OriginalMember(owner = "client!paa", name = "l", descriptor = "Lke;")
    public static class622 field9125 = new class622(125, 3);

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "I")
    public int field9114;

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "I")
    public int field9120;

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "I")
    public int field9123;

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
    public int field9124;

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
    public int field9126;

    @OriginalMember(owner = "client!paa", name = "p", descriptor = "I")
    public static int field9129;

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "Ljava/lang/String;")
    public static String field9118;

    @OriginalMember(owner = "client!paa", name = "i", descriptor = "Z")
    public boolean field9122;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(BLkv;[I[III)Lno;")
    public static final class729 method3700(byte arg0, class280 arg1, int[] arg2, int[] arg3, int arg4, int arg5) {
        field9121++;
        byte[] var6 = new byte[arg4 * arg5];
        int var7 = 0;
        if (arg0 != -1) {
            method3704(-38);
        }
        while (var7 < arg5) {
            int var8 = arg4 * var7 + arg3[var7];
            for (int var9 = 0; var9 < arg2[var7]; var9++) {
                var6[var8++] = -1;
            }
            var7++;
        }
        return new class729(arg1, arg4, arg5, var6);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILrv;B)V")
    private final void method3701(int arg0, class120 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field9128 = arg1.method898((byte) -95);
        } else if (arg0 == 2) {
            this.field9122 = true;
        } else if (arg0 == 3) {
            this.field9124 = arg1.method838(true);
            this.field9120 = arg1.method838(true);
            this.field9114 = arg1.method838(true);
        } else if (arg0 == 4) {
            this.field9126 = arg1.method842(2384);
        } else if (arg0 == 5) {
            this.field9123 = arg1.method898((byte) -114);
        } else if (arg0 == 6) {
            this.field9127 = arg1.method833(-3);
        }
        if (arg2 != 1) {
            method3703(false, (byte) 105);
        }
        field9129++;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILrv;)V")
    public final void method3702(int arg0, class120 arg1) {
        while (true) {
            int var3 = arg1.method842(arg0 + 30943);
            if (var3 == 0) {
                if (arg0 != -28559) {
                    method3704(61);
                }
                field9119++;
                return;
            }
            this.method3701(var3, arg1, (byte) 1);
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZB)V")
    public static final void method3703(boolean arg0, byte arg1) {
        field9116++;
        class84.method611(102);
        if (!class264.method1739(class757.field10456, 3580)) {
            return;
        }
        class403.field5707++;
        if (class403.field5707 < 50 && !arg0) {
            return;
        }
        class403.field5707 = 0;
        if (!class255.field3580 && class76.field1025 != null) {
            class475.field6758++;
            class731 var2 = class155.method1222(260, class481.field6846, class237.field3417);
            class533.method3088(var2, 0);
            try {
                class663.method3778(121);
            } catch (IOException var3) {
                class255.field3580 = true;
            }
        }
        class84.method611(109);
        if (arg1 >= -27) {
            field9118 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
    public static void method3704(int arg0) {
        field9125 = null;
        field9117 = null;
        if (arg0 == 4) {
            field9118 = null;
        }
    }
}

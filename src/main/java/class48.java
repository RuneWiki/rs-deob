import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class48 extends class216 {

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    private int field698;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    private int field708;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    private int field703;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    private int field699;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    private int field709;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    private int field697;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    private int field701;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    private int field702;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field710 = 0;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "Ltb;")
    public static class657 field711 = new class657();

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field713 = 0;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "[I")
    public static int[] field704;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public static void method325(int arg0) {
        field711 = null;
        field704 = null;
        if (arg0 != -7471) {
            method325(-94);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lpaa;IZ)Ljava/lang/String;")
    public static final String method326(class712 arg0, int arg1, boolean arg2) {
        ++field696;
        if (!arg2) {
            field710 = 69;
        }
        if (!client.method2675(arg0).method649(arg1, (byte) -108) && arg0.field9946 == null) {
            return null;
        } else if (arg0.field10086 != null && arg1 < arg0.field10086.length && arg0.field10086[arg1] != null && ~arg0.field10086[arg1].trim().length() != -1) {
            return arg0.field10086[arg1];
        } else {
            return class399.field5526 ? "Hidden-" + arg1 : null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBI)V")
    public final void method327(int arg0, byte arg1, int arg2) {
        if (arg1 != 23) {
            method329(120);
        }
        ++field706;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZII)V")
    public final void method328(boolean arg0, int arg1, int arg2) {
        ++field700;
        if (arg0) {
            this.field699 = -108;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)I")
    public static final int method329(int arg0) {
        ++field705;
        return arg0 != 1629291756 ? -75 : class673.method3855(-22016, false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
    public final void method330(int arg0, int arg1, int arg2) {
        ++field707;
        int var4 = this.field701 * arg0 >> 12;
        if (arg2 == 382254306) {
            int var5 = this.field702 * arg1 >> 12;
            int var6 = this.field697 * arg0 >> 12;
            int var7 = this.field708 * arg1 >> 12;
            int var8 = this.field698 * arg0 >> 12;
            int var9 = this.field709 * arg1 >> 12;
            int var10 = this.field703 * arg0 >> 12;
            int var11 = this.field699 * arg1 >> 12;
            class50.method345(22, var4, var7, var10, var11, var8, var6, super.field3062, var5, var9);
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field698 = arg4;
        this.field708 = arg3;
        this.field703 = arg6;
        this.field699 = arg7;
        this.field709 = arg5;
        this.field697 = arg2;
        this.field701 = arg0;
        this.field702 = arg1;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static final void method331(byte arg0) {
        ++field712;
        class498.method2983(-13464);
        int var1 = class674.field9500.field5129.method1636(0);
        if (var1 != 2) {
            if (var1 == 3) {
                class753.method4173(class582.field8281, class58.field807, class295.field3845, class282.field3747, 1, 2, class96.field1401, 2);
            }
        } else {
            class356.method2013(class582.field8281, 100, class96.field1401, arg0 + -27, class58.field807, 100);
        }
        if (arg0 != 27) {
            method329(41);
        }
        if (class674.field9500.field5129.method1633((byte) 107)) {
            class595.method3525(class438.field6016, (byte) 2);
        }
        if (class96.field1401 != null) {
            class183.method1226(true);
        }
        class286.field3774 = ~class674.field9500.field5129.method1636(arg0 ^ 27) != -1;
        class264.field3595 = class674.field9500.field5129.method1633((byte) 107);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class611 extends class245 {

    @OriginalMember(owner = "client!pca", name = "n", descriptor = "I")
    private int field9054;

    @OriginalMember(owner = "client!pca", name = "o", descriptor = "I")
    private int field9055;

    @OriginalMember(owner = "client!pca", name = "r", descriptor = "I")
    private int field9058;

    @OriginalMember(owner = "client!pca", name = "q", descriptor = "I")
    private int field9057;

    @OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
    private int field9053;

    @OriginalMember(owner = "client!pca", name = "v", descriptor = "I")
    private int field9062;

    @OriginalMember(owner = "client!pca", name = "t", descriptor = "I")
    private int field9060;

    @OriginalMember(owner = "client!pca", name = "z", descriptor = "I")
    private int field9066;

    @OriginalMember(owner = "client!pca", name = "u", descriptor = "Lada;")
    public static class144 field9061 = new class144(73, 12);

    @OriginalMember(owner = "client!pca", name = "p", descriptor = "I")
    public static int field9056;

    @OriginalMember(owner = "client!pca", name = "s", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!pca", name = "w", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!pca", name = "x", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!pca", name = "y", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IBIII)V", line = 3)
    public static final void method3587(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = 99 / ((-52 - arg1) / 46);
        ++field9059;
        int var6 = 0;
        int var7 = arg3;
        int var8 = -arg3;
        int var9 = -1;
        int var10 = class36.method223(class130.field1801, (byte) 50, arg0 + arg3, class14.field136);
        int var11 = class36.method223(class130.field1801, (byte) 50, -arg3 + arg0, class14.field136);
        class140.method969(var11, 15888, arg4, var10, class604.field8993[arg2]);
        while (var6 < var7) {
            var9 += 2;
            var8 += var9;
            if (~var8 < -1) {
                --var7;
                var8 -= var7 << 1;
                int var12 = arg2 - var7;
                int var13 = arg2 + var7;
                if (~class3.field25 >= ~var13 && var12 <= class100.field1452) {
                    int var14 = class36.method223(class130.field1801, (byte) 50, arg0 + var6, class14.field136);
                    int var15 = class36.method223(class130.field1801, (byte) 50, -var6 + arg0, class14.field136);
                    if (~var13 >= ~class100.field1452) {
                        class140.method969(var15, 15888, arg4, var14, class604.field8993[var13]);
                    }
                    if (class3.field25 <= var12) {
                        class140.method969(var15, 15888, arg4, var14, class604.field8993[var12]);
                    }
                }
            }
            ++var6;
            int var16 = -var6 + arg2;
            int var17 = arg2 + var6;
            if (class3.field25 <= var17 && ~var16 >= ~class100.field1452) {
                int var18 = class36.method223(class130.field1801, (byte) 50, arg0 + var7, class14.field136);
                int var19 = class36.method223(class130.field1801, (byte) 50, -var7 + arg0, class14.field136);
                if (~class100.field1452 <= ~var17) {
                    class140.method969(var19, 15888, arg4, var18, class604.field8993[var17]);
                }
                if (~class3.field25 >= ~var16) {
                    class140.method969(var19, 15888, arg4, var18, class604.field8993[var16]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(III)V", line = 78)
    public final void method1351(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field9060 = -71;
        }
        ++field9064;
        int var4 = this.field9060 * arg2 >> 12;
        int var5 = this.field9055 * arg0 >> 12;
        int var6 = this.field9057 * arg2 >> 12;
        int var7 = this.field9053 * arg0 >> 12;
        int var8 = this.field9058 * arg2 >> 12;
        int var9 = this.field9054 * arg0 >> 12;
        int var10 = this.field9062 * arg2 >> 12;
        int var11 = this.field9066 * arg0 >> 12;
        class344.method2101(var11, var6, var9, var5, var8, super.field3529, var10, var7, var4, (byte) 126);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V", line = 108)
    public static void method3588(int arg0) {
        if (arg0 == -1325190324) {
            field9061 = null;
        }
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 118)
    public class611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field9054 = arg5;
        this.field9055 = arg1;
        this.field9058 = arg4;
        this.field9057 = arg2;
        this.field9053 = arg3;
        this.field9062 = arg6;
        this.field9060 = arg0;
        this.field9066 = arg7;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BII)V", line = 137)
    public final void method1352(byte arg0, int arg1, int arg2) {
        ++field9056;
        int var4 = -56 / ((arg0 - 43) / 54);
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)I", line = 148)
    public static final int method3589(int arg0) {
        ++field9065;
        if (class307.field4210 == null) {
            if (!class446.field6245 && class103.field1484 > 0) {
                if (class335.field4641 && class24.field237.method1788(16, 81) && ~class103.field1484 < -3) {
                    return ((class583) class174.field2677.field179.field5648.field5648).field8554;
                }
                return ((class583) class174.field2677.field179.field5648).field8554;
            }
            int var1 = class623.field9182.method1587((byte) -113);
            int var2 = class623.field9182.method1594(2028208128);
            int var3 = class37.field454;
            int var4 = class483.field6896;
            int var5 = class340.field4704;
            if (~var3 > ~var1 && ~(var3 + var5) < ~var1) {
                int var6 = -1;
                for (int var7 = 0; ~class103.field1484 < ~var7; ++var7) {
                    if (!class398.field5469) {
                        int var11 = (-var7 + class103.field1484 + -1) * 16 + 31 + var4;
                        if (~var2 < ~(var11 + -13) && ~var2 >= ~(var11 - -3)) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class103.field1484 + -1 + -var7) * 16 + var4 + 33;
                        if (~(var12 + -13) > ~var2 && ~(var12 + 3) <= ~var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class277 var9 = new class277(class174.field2677);
                    for (class583 var10 = (class583) var9.method1738(true); var10 != null; var10 = (class583) var9.method1739(arg0 ^ -1777495993)) {
                        if (~(var8++) == ~var6) {
                            return var10.field8554;
                        }
                    }
                }
            }
        }
        if (arg0 != 1777498892) {
            field9061 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IBI)V", line = 247)
    public final void method1350(int arg0, byte arg1, int arg2) {
        ++field9063;
        int var4 = -52 % ((arg1 - -23) / 57);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class46 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field660 = 0;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field659 = 0;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lhj;")
    public static class69 field664 = class181.method1318("<col=ff9040>", (byte) -112);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lta;")
    public static class241 field661 = new class241(50);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[[I)V")
    public static final void method260(int arg0, int[][] arg1) {
        if (arg0 >= 100) {
            class186.field3402 = arg1;
            field666++;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[BIII[Lah;ZIIII)V")
    public static final void method261(int arg0, byte[] arg1, int arg2, int arg3, int arg4, class263[] arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        field665++;
        if (!arg6) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if ((arg8 + var11) > 0 && (arg8 + var11) < 103 && arg7 + var12 > 0 && (arg7 + var12) < 103) {
                        arg5[arg2].field4672[arg8 + var11][arg7 + var12] = class69.method443(arg5[arg2].field4672[arg8 + var11][arg7 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg6) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        if (arg3 != 1) {
            field660 = -44;
        }
        class128 var14 = new class128(arg1);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg4 == var15 && var16 >= arg9 && var16 < arg9 + 8 && var17 >= arg0 && arg0 + 8 > var17) {
                        class191.method1379(arg6, arg2, 0, class268.method1847(var16 & 0x7, arg10, var17 & 0x7, 0) + arg8, arg7 + class116.method857(var17 & 0x7, arg10, true, var16 & 0x7), var14, 1, arg10, 0);
                    } else {
                        class191.method1379(arg6, 0, 0, -1, -1, var14, 1, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([BB)V")
    public abstract void method262(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)[B")
    public abstract byte[] method263(byte arg0);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
    public static void method264(byte arg0) {
        if (arg0 != -66) {
            method260(61, (int[][]) null);
        }
        field661 = null;
        field664 = null;
    }
}

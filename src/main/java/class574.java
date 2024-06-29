import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class574 extends class148 {

    @OriginalMember(owner = "client!gba", name = "Pb", descriptor = "[Lkq;")
    public static class510[] field8452 = new class510[100];

    @OriginalMember(owner = "client!gba", name = "Rb", descriptor = "I")
    public static int field8454 = -1;

    @OriginalMember(owner = "client!gba", name = "Fb", descriptor = "Lh;")
    public static class572 field8442 = new class572("Loading JAGDX - ", "Lade JAGDX - ", "Chargement JAGDX - ", "Carregando JAGDX - ");

    @OriginalMember(owner = "client!gba", name = "Tb", descriptor = "I")
    public static int field8456 = 0;

    @OriginalMember(owner = "client!gba", name = "Cb", descriptor = "I")
    public static int field8439;

    @OriginalMember(owner = "client!gba", name = "Db", descriptor = "I")
    public static int field8440;

    @OriginalMember(owner = "client!gba", name = "Gb", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!gba", name = "Hb", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!gba", name = "Ib", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!gba", name = "Jb", descriptor = "I")
    public static int field8446;

    @OriginalMember(owner = "client!gba", name = "Kb", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!gba", name = "Lb", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!gba", name = "Mb", descriptor = "I")
    public static int field8449;

    @OriginalMember(owner = "client!gba", name = "Ob", descriptor = "I")
    private int field8451;

    @OriginalMember(owner = "client!gba", name = "Qb", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!gba", name = "Sb", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!gba", name = "Eb", descriptor = "Lnl;")
    private class473 field8441;

    @OriginalMember(owner = "client!gba", name = "Nb", descriptor = "Lha;")
    public static class53 field8450;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(ZI)V")
    public final void method3413(boolean arg0, int arg1) {
        ++field8439;
        if (!arg0) {
            field8450 = null;
        }
        super.field2146[super.field2177++] = (byte) (this.field8441.method2850(8) + arg1);
    }

    @OriginalMember(owner = "client!gba", name = "x", descriptor = "(I)V")
    public static void method3414(int arg0) {
        field8442 = null;
        if (arg0 <= 19) {
            field8454 = 89;
        }
        field8450 = null;
        field8452 = null;
    }

    @OriginalMember(owner = "client!gba", name = "y", descriptor = "(I)Z")
    public final boolean method3415(int arg0) {
        ++field8449;
        int var2 = 255 & super.field2146[super.field2177] + -this.field8441.method2852((byte) -98);
        if (~var2 > -129) {
            return false;
        } else {
            if (arg0 <= 36) {
                field8452 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "(I)V")
    public final void method3416(int arg0) {
        this.field8451 = super.field2177 * arg0;
        ++field8446;
    }

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "(IB)I")
    public final int method3417(int arg0, byte arg1) {
        ++field8448;
        int var3 = this.field8451 >> 3;
        int var4 = 8 - (this.field8451 & 7);
        this.field8451 += arg0;
        int var5 = 0;
        if (arg1 != -86) {
            method3420(-108, 94, (class328) null, true, -113, 106, -51);
        }
        while (var4 < arg0) {
            var5 += (class177.field2708[var4] & super.field2146[var3++]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 != ~var4) {
            var6 = (super.field2146[var3] >> var4 - arg0 & class177.field2708[arg0]) + var5;
        } else {
            var6 = (super.field2146[var3] & class177.field2708[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I[BII)V")
    public final void method3418(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field8445;
        int var5 = 106 % ((-29 - arg3) / 32);
        for (int var6 = 0; arg2 > var6; ++var6) {
            arg1[var6 - -arg0] = (byte) (super.field2146[super.field2177++] + -this.field8441.method2850(8));
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B[I)V")
    public final void method3419(byte arg0, int[] arg1) {
        ++field8443;
        if (arg0 <= 53) {
            field8454 = 70;
        }
        this.field8441 = new class473(arg1);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILkda;ZIII)V")
    public static final void method3420(int arg0, int arg1, class328 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class624.field9191 = arg6;
        class271.field3841 = arg1;
        class511.field7276 = arg5;
        ++field8444;
        class312.field4298 = arg4;
        class219.field3190 = arg0;
        class271.field3843 = arg3;
        class514.field7343 = arg2;
    }

    @OriginalMember(owner = "client!gba", name = "A", descriptor = "(I)V")
    public final void method3421(int arg0) {
        super.field2177 = (this.field8451 + 7) / 8;
        if (arg0 > 120) {
            ++field8440;
        }
    }

    @OriginalMember(owner = "client!gba", name = "B", descriptor = "(I)I")
    public final int method3422(int arg0) {
        ++field8453;
        int var2 = 255 & super.field2146[super.field2177++] + -this.field8441.method2850(8);
        if (~var2 > -129) {
            return var2;
        } else {
            if (arg0 != 811664354) {
                this.method3416(-71);
            }
            return (255 & super.field2146[super.field2177++] + -this.field8441.method2850(8)) + (var2 + -128 << 8);
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(I)V")
    public class574(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "(II)I")
    public final int method3423(int arg0, int arg1) {
        if (arg0 != 8) {
            this.method3421(-17);
        }
        ++field8447;
        return arg1 * 8 - this.field8451;
    }
}

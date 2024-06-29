import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 {

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "S")
    public short field122;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "S")
    public short field123;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "B")
    public byte field129;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "S")
    public short field134;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "Z")
    public boolean field133;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "Lkfa;")
    public static class549 field132 = new class549(28, 18);

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "Lqq;")
    public static class434 field128;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "Loa;")
    public static class635 field135;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public static void method65(int arg0) {
        field135 = null;
        if (arg0 != -7593) {
            field132 = null;
        }
        field132 = null;
        field128 = null;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
    public static final void method66(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class406.field5409[var1] = true;
        }
        if (arg0 != 12287) {
            field132 = null;
        }
        field124++;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field122 = (short) arg4;
        this.field123 = (short) arg6;
        this.field129 = (byte) arg8;
        this.field125 = arg3;
        this.field126 = arg11;
        this.field127 = arg2;
        this.field131 = arg0;
        this.field134 = (short) arg5;
        this.field133 = arg10;
        this.field130 = arg1;
    }
}

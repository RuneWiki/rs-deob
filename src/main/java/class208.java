import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class208 extends class186 {

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "[I")
    private final int[] field3588 = new int[this.field3301];

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "[Z")
    public static boolean[] field3577 = new boolean[5];

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "Loh;")
    public static class258 field3574 = class153.method1046("Hidden)2use", 119);

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field3582 = -1;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    private int field3579;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    private int field3585;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "Lgb;")
    public static class213 field3584;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "[B")
    private byte[] field3586;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "[I")
    public static int[] field3581;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V", line = 8)
    public final void method1267(int arg0, int arg1, int arg2) {
        if (arg0 != 4) {
            field3582 = -35;
        }
        field3578++;
        this.field3579 += this.field3588[arg1] * arg2 >> 12;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIIF)V", line = 35)
    public class208(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field3301; var7++) {
            this.field3588[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V", line = 54)
    public static final void method1371(int arg0) {
        class100.field1785 = null;
        field3583++;
        if (arg0 != 32064) {
            method1373(47, 116, false, -32, 102, 91, -104, (byte) 24, 37, -104, -102, -71);
        }
        class64.field1129 = null;
        class82.field1390 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)V", line = 75)
    public void method1372(int arg0, byte arg1) {
        this.field3586[this.field3585++] = (byte) ((class2.method15(255, arg1) >> 1) + 127);
        field3576++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZIIIIBIIII)Z", line = 101)
    public static final boolean method1373(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
        field3589++;
        if (class152.field2606.method447(18123) == 2) {
            return class313.method2169(arg8, arg5, arg2, arg9, arg1, (byte) -103, arg0, arg10, arg3, arg6, arg11, arg4);
        } else if (class152.field2606.method447(18123) <= 2) {
            int var12 = 45 % ((-arg7 - 9) / 39);
            return class8.method42(arg4, arg6, false, arg5, arg10, arg0, arg1, arg11, arg8, arg9, arg2, arg3);
        } else {
            return class32.method232(arg9, arg6, arg10, arg0, class152.field2606.method447(18123), 0, arg2, arg11, arg3, arg8, arg1, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V", line = 119)
    public static void method1374(int arg0) {
        field3581 = null;
        field3574 = null;
        field3584 = null;
        field3577 = null;
        if (arg0 != 0) {
            field3574 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V", line = 132)
    public final void method1266(byte arg0) {
        if (arg0 < 70) {
            return;
        }
        field3575++;
        this.field3579 = Math.abs(this.field3579);
        if (this.field3579 >= 4096) {
            this.field3579 = 4095;
        }
        this.method1372(this.field3585++, (byte) (this.field3579 >> 4));
        this.field3579 = 0;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V", line = 149)
    public final void method1264(int arg0) {
        this.field3585 = 0;
        this.field3579 = 0;
        if (arg0 > -90) {
            this.method1266((byte) -66);
        }
        field3587++;
    }
}

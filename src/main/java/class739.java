import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class739 implements class401 {

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public int field10359;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "I")
    public int field10365;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public int field10358;

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    public int field10368;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "I")
    public int field10371;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "Lega;")
    public class713 field10360;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "Log;")
    public class651 field10372;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "I")
    public int field10369;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "I")
    public int field10364;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "[I")
    public static int[] field10366 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!au", name = "l", descriptor = "I")
    public static int field10367 = -2;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "Lfa;")
    public static class235 field10362 = new class235(6, 0, 4, 2);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field10356;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field10357;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field10361;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "I")
    public static int field10363;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "I")
    public static int field10370;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(B)V")
    public static void method4140(byte arg0) {
        field10366 = null;
        if (arg0 != -13) {
            field10362 = null;
        }
        field10362 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "([BII)[B")
    public static final byte[] method4141(byte[] arg0, int arg1, int arg2) {
        field10357++;
        byte[] var3 = new byte[arg1];
        class319.method2022(arg0, 0, var3, 0, arg1);
        return arg2 == 14606 ? var3 : null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)Lio;")
    public class439 method69(byte arg0) {
        field10361++;
        int var2 = -2 / ((-arg0 - 69) / 39);
        return null;
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(B)V")
    public static final void method4142(byte arg0) {
        field10356++;
        class393.field5917.method1200(65);
        class440.field6511 = 0;
        if (arg0 != -69) {
            method4142((byte) -10);
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Log;Lega;IIIIIII)V")
    public class739(class651 arg0, class713 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field10359 = arg6;
        this.field10365 = arg3;
        this.field10358 = arg8;
        this.field10368 = arg7;
        this.field10371 = arg4;
        this.field10360 = arg1;
        this.field10372 = arg0;
        this.field10369 = arg2;
        this.field10364 = arg5;
    }
}

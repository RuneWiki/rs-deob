import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class430 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public int field6381 = 128;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public int field6385 = 128;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public int field6383;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public int field6388;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public int field6384;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public int field6389;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "[[S")
    public static short[][] field6390 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)Lr;")
    public final class430 method2539(byte arg0) {
        int var2 = -102 % ((68 - arg0) / 41);
        field6382++;
        return new class430(this.field6383, this.field6381, this.field6385, this.field6388, this.field6384, this.field6389);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method2540(int arg0) {
        field6390 = null;
        int var1 = -52 / ((-arg0 - 35) / 44);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
    public static final void method2541(int arg0, int arg1, int arg2) {
        if (arg1 >= -100) {
            method2540(24);
        }
        field6391++;
        class506 var3 = class14.method185(-1304589728, 0, 15);
        var3.method2992(0);
        var3.field7442 = arg2;
        var3.field7441 = arg0;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLr;)V")
    public final void method2542(byte arg0, class430 arg1) {
        if (arg0 >= -1) {
            this.field6389 = 88;
        }
        this.field6388 = arg1.field6388;
        this.field6381 = arg1.field6381;
        this.field6389 = arg1.field6389;
        field6387++;
        this.field6383 = arg1.field6383;
        this.field6384 = arg1.field6384;
        this.field6385 = arg1.field6385;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lma;Lgo;IIJIIII)V")
    public static final void method2543(class249 arg0, class310 arg1, int arg2, int arg3, long arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 != 256) {
            method2543(null, null, 39, 118, -83L, -79, -27, 30, -31);
        }
        field6386++;
        int var10 = arg2 * arg2 + arg5 * arg5;
        if (arg4 < ((long) var10)) {
            return;
        }
        int var11 = Math.min(arg1.field4661 / 2, arg1.field4736 / 2);
        if (var10 <= var11 * var11) {
            class299.method1857(arg7, 91, arg5, arg0, class473.field6976[arg3], arg8, arg1, arg2);
            return;
        }
        var11 -= 10;
        int var12;
        if (class350.field5388 == 4) {
            var12 = (int) class311.field4836 & 0x3FFF;
        } else {
            var12 = (int) class311.field4836 + class469.field6881 & 0x3FFF;
        }
        int var13 = class445.field6545[var12];
        int var14 = class445.field6544[var12];
        if (class350.field5388 != 4) {
            var13 = var13 * 256 / (class230.field3230 + 256);
            var14 = var14 * 256 / (class230.field3230 + 256);
        }
        int var15 = arg2 * var13 + arg5 * var14 >> 15;
        int var16 = arg2 * var14 - (arg5 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class406.field6122[arg3].method935((float) arg1.field4661 / 2.0F + (float) arg8 + (float) var19, (float) arg1.field4736 / 2.0F + (float) arg7 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I)V")
    public class430(int arg0) {
        this.field6383 = arg0;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(IIIIII)V")
    private class430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6383 = arg0;
        this.field6388 = arg3;
        this.field6381 = arg1;
        this.field6384 = arg4;
        this.field6389 = arg5;
        this.field6385 = arg2;
    }
}

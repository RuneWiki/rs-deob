import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class179 extends class81 {

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public int field3315 = 0;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public int field3310 = 12800;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public int field3317 = 0;

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "I")
    public int field3326 = -1;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "Z")
    public boolean field3324 = true;

    @OriginalMember(owner = "client!gi", name = "db", descriptor = "I")
    public int field3328 = 12800;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "Lsg;")
    public class30 field3323;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "Lsg;")
    public class30 field3306;

    @OriginalMember(owner = "client!gi", name = "cb", descriptor = "I")
    public int field3327;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "Lb;")
    public class48 field3322;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "Lsg;")
    private static class30 field3308 = class167.method1221((byte) 33, "Examine");

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    public static int field3314 = 0;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "Lsg;")
    public static class30 field3313 = class167.method1221((byte) 33, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public static int field3311 = 0;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "Lsg;")
    public static class30 field3321 = class167.method1221((byte) 33, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "Lsg;")
    public static class30 field3312 = class167.method1221((byte) 33, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "Z")
    public static boolean field3318 = false;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "Lsg;")
    public static class30 field3319 = field3308;

    @OriginalMember(owner = "client!gi", name = "eb", descriptor = "[[S")
    public static short[][] field3329 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)V")
    public final void method1303(int arg0) {
        this.field3317 = arg0;
        field3307++;
        this.field3315 = 0;
        this.field3328 = 12800;
        this.field3310 = 12800;
        for (class252 var2 = (class252) this.field3322.method478(0); var2 != null; var2 = (class252) this.field3322.method476((byte) 13)) {
            if (var2.field4445 > this.field3315) {
                this.field3315 = var2.field4445;
            }
            if (var2.field4454 > this.field3317) {
                this.field3317 = var2.field4454;
            }
            if (this.field3328 > var2.field4451) {
                this.field3328 = var2.field4451;
            }
            if (var2.field4449 < this.field3310) {
                this.field3310 = var2.field4449;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLsg;)I")
    public static final int method1304(byte arg0, class30 arg1) {
        field3320++;
        if (class29.field556 == null || arg1.method249(arg0 ^ 0xB) == 0) {
            return -1;
        } else if (arg0 == -83) {
            for (int var2 = 0; var2 < class29.field556.field3467; var2++) {
                if (class29.field556.field3457[var2].method298((byte) 110, class273.field4778, class174.field3250).method252(1, arg1)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return -73;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static void method1305(byte arg0) {
        if (arg0 != -16) {
            method1305((byte) 98);
        }
        field3313 = null;
        field3308 = null;
        field3319 = null;
        field3321 = null;
        field3312 = null;
        field3329 = null;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(III)Z")
    public final boolean method1306(int arg0, int arg1, int arg2) {
        field3309++;
        if (arg1 < this.field3310 || this.field3317 < arg1 || this.field3328 > arg0 || this.field3315 < arg0) {
            return false;
        } else if (arg2 == 1341) {
            for (class252 var4 = (class252) this.field3322.method478(0); var4 != null; var4 = (class252) this.field3322.method476((byte) 13)) {
                if (var4.method1758(arg1, -58, arg0)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILdl;)Z")
    public static final boolean method1307(int arg0, class31 arg1) {
        field3325++;
        if (arg1.field800 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field800.length; var2++) {
            int var3 = class229.method1628(var2, arg1, true);
            int var4 = arg1.field707[var2];
            if (arg1.field800[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field800[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field800[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 != -1651) {
            field3321 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lsg;Lsg;IIIZ)V")
    public class179(class30 arg0, class30 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3323 = arg1;
        this.field3326 = arg4;
        this.field3316 = arg3;
        this.field3324 = arg5;
        this.field3306 = arg0;
        this.field3327 = arg2;
        this.field3322 = new class48();
    }
}

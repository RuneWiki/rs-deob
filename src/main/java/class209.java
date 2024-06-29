import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class209 {

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    private int field3414 = 0;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    private int field3418 = 0;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lav;")
    private class454 field3417 = null;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    private int field3421 = 0;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lkd;")
    private class188 field3416;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Luo;")
    private class408 field3412;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "[Ltd;")
    private class318[] field3413;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lvi;")
    public class379 field3411;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lav;IB)Z")
    public final boolean method1446(class454 arg0, int arg1, byte arg2) {
        field3415++;
        if (this.field3421 == 0) {
            return false;
        }
        if (this.field3417 != arg0) {
            this.field3413[Integer.MAX_VALUE & this.field3421].method715(arg0, arg1, (byte) -122);
            this.field3417 = arg0;
        }
        if (arg2 >= -48) {
            method1451(false);
        }
        return true;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z")
    public static final boolean method1447(int arg0, byte arg1) {
        field3409++;
        if (arg1 != -22) {
            return true;
        } else if (arg0 == 45 || arg0 == 20 || arg0 == 58 || arg0 == 15 || arg0 == 4) {
            return true;
        } else {
            return arg0 == 10 || arg0 == 1003;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZZZI)V")
    public final void method1448(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        boolean var5 = arg0 & this.field3416.method333();
        field3420++;
        if (!var5 && (arg3 == 4 || arg3 == 8)) {
            arg3 = 2;
        }
        if (arg3 != 0 && arg1) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field3421 != arg3) {
            if (this.field3421 != 0) {
                this.field3413[this.field3421 & Integer.MAX_VALUE].method723((byte) 118);
            }
            if (arg3 != 0) {
                this.field3413[arg3 & Integer.MAX_VALUE].method718(arg1, false);
                this.field3413[Integer.MAX_VALUE & arg3].method722(-78, arg1);
            }
            this.field3414 = Integer.MIN_VALUE;
            this.field3421 = arg3;
            this.field3418 = Integer.MIN_VALUE;
            this.field3417 = null;
        } else if (this.field3421 != 0) {
            this.field3413[this.field3421 & Integer.MAX_VALUE].method722(-90, arg1);
        }
        if (arg2) {
            this.field3411 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IB)Z")
    public final boolean method1449(int arg0, byte arg1) {
        if (arg1 <= 73) {
            return false;
        } else {
            field3419++;
            return this.field3413[arg0].method721(0);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
    public final void method1450(int arg0, int arg1, int arg2) {
        field3410++;
        if ((this.field3414 != arg0 | this.field3418 != arg1) & this.field3421 != arg2) {
            this.field3413[Integer.MAX_VALUE & this.field3421].method719(arg0, arg1, arg2);
            this.field3414 = arg0;
            this.field3418 = arg1;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public static final void method1451(boolean arg0) {
        if (arg0) {
            class477.method2871((byte) 96);
            field3408++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lkd;)V")
    public class209(class188 arg0) {
        this.field3416 = arg0;
        this.field3412 = new class408(arg0);
        this.field3413 = new class318[10];
        this.field3413[1] = new class220(arg0);
        this.field3413[2] = new class86(arg0, this.field3412);
        this.field3413[4] = new class534(arg0, this.field3412);
        this.field3413[5] = new class397(arg0, this.field3412);
        this.field3413[6] = new class99(arg0);
        this.field3413[7] = new class88(arg0);
        this.field3413[3] = this.field3411 = new class379(arg0);
        this.field3413[8] = new class268(arg0, this.field3412);
        this.field3413[9] = new class385(arg0, this.field3412);
        if (!this.field3413[8].method721(0)) {
            this.field3413[8] = this.field3413[4];
        }
        if (!this.field3413[9].method721(0)) {
            this.field3413[9] = this.field3413[8];
        }
    }
}

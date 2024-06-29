import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class103 extends class449 {

    @OriginalMember(owner = "client!np", name = "E", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client!np", name = "J", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client!np", name = "I", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client!np", name = "y", descriptor = "I")
    public int field1443;

    @OriginalMember(owner = "client!np", name = "x", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!np", name = "G", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!np", name = "r", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client!np", name = "B", descriptor = "I")
    private int field1446;

    @OriginalMember(owner = "client!np", name = "H", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client!np", name = "M", descriptor = "I")
    public static int field1457 = 100;

    @OriginalMember(owner = "client!np", name = "z", descriptor = "Lwk;")
    public static class155 field1444 = new class155(16);

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!np", name = "u", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!np", name = "v", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!np", name = "w", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!np", name = "A", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!np", name = "C", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!np", name = "D", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!np", name = "K", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!np", name = "L", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!np", name = "N", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "[I")
    public static int[] field1437;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B[III)V")
    public final void method826(byte arg0, int[] arg1, int arg2, int arg3) {
        if (arg0 != -114) {
            this.method827((int[]) null, false, 18, -120);
        }
        field1438++;
        arg1[2] = arg3 - (this.field1453 - this.field1436);
        arg1[1] = arg2 + this.field1454 - this.field1451;
        arg1[0] = this.field1446;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([IZII)V")
    public final void method827(int[] arg0, boolean arg1, int arg2, int arg3) {
        arg0[0] = 0;
        arg0[1] = -this.field1454 - (-this.field1451 - arg3);
        arg0[2] = this.field1453 + arg2 - this.field1436;
        field1448++;
        if (!arg1) {
            field1456 = 56;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III)Z")
    public final boolean method828(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            field1450++;
            return arg1 >= this.field1451 && this.field1443 >= arg1 && this.field1453 <= arg0 && arg0 <= this.field1442;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIZI)Z")
    public final boolean method829(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            return true;
        } else {
            field1439++;
            return this.field1446 == arg1 && arg0 >= this.field1454 && this.field1452 >= arg0 && arg3 >= this.field1436 && this.field1449 >= arg3;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lnl;Lnl;I)I")
    public static final int method830(class435 arg0, class435 arg1, int arg2) {
        field1447++;
        int var3 = 0;
        if (arg1.method2627((byte) 102, class167.field2423)) {
            var3++;
        }
        if (arg1.method2627((byte) 27, class282.field4059)) {
            var3++;
        }
        if (arg1.method2627((byte) 64, class68.field1000)) {
            var3++;
        }
        if (arg2 != -19558) {
            return 9;
        }
        if (arg0.method2627((byte) 50, class167.field2423)) {
            var3++;
        }
        if (arg0.method2627((byte) 107, class282.field4059)) {
            var3++;
        }
        if (arg0.method2627((byte) 34, class68.field1000)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V")
    public static final void method831(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class394.field5441[var1] = false;
        }
        field1441++;
        if (arg0 < 123) {
            method830((class435) null, (class435) null, 93);
        }
        class390.field5393 = 1;
        class111.field1569 = -1;
        class15.field149 = -1;
        class374.field5179 = 0;
        class227.field3279 = 0;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field1449 = arg4;
        this.field1454 = arg1;
        this.field1453 = arg6;
        this.field1443 = arg7;
        this.field1442 = arg8;
        this.field1451 = arg5;
        this.field1436 = arg2;
        this.field1446 = arg0;
        this.field1452 = arg3;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIB)Z")
    public final boolean method832(int arg0, int arg1, byte arg2) {
        if (arg2 != -22) {
            this.field1453 = -16;
        }
        field1435++;
        return arg1 >= this.field1454 && arg1 <= this.field1452 && this.field1436 <= arg0 && this.field1449 >= arg0;
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(I)V")
    public static void method833(int arg0) {
        field1437 = null;
        if (arg0 != 9406) {
            field1456 = -34;
        }
        field1444 = null;
    }
}

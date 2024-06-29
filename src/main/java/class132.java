import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class132 extends class354 {

    @OriginalMember(owner = "client!ct", name = "C", descriptor = "I")
    private int field1474 = 0;

    @OriginalMember(owner = "client!ct", name = "S", descriptor = "Z")
    public boolean field1490 = false;

    @OriginalMember(owner = "client!ct", name = "T", descriptor = "I")
    private int field1491 = 0;

    @OriginalMember(owner = "client!ct", name = "K", descriptor = "I")
    private int field1482 = -32768;

    @OriginalMember(owner = "client!ct", name = "U", descriptor = "I")
    private int field1492 = -1;

    @OriginalMember(owner = "client!ct", name = "X", descriptor = "I")
    private int field1495 = 0;

    @OriginalMember(owner = "client!ct", name = "P", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client!ct", name = "J", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client!ct", name = "Q", descriptor = "I")
    public int field1488;

    @OriginalMember(owner = "client!ct", name = "E", descriptor = "Lam;")
    private class576 field1476;

    @OriginalMember(owner = "client!ct", name = "B", descriptor = "[I")
    public static int[] field1473 = new int[1000];

    @OriginalMember(owner = "client!ct", name = "y", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ct", name = "A", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ct", name = "D", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!ct", name = "F", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ct", name = "H", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ct", name = "I", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ct", name = "L", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ct", name = "M", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!ct", name = "N", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ct", name = "O", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!ct", name = "R", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ct", name = "V", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!ct", name = "W", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!ct", name = "G", descriptor = "Lhm;")
    private class202 field1478;

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field1487 = arg4;
        this.field1481 = arg0;
        this.field1491 = arg12;
        this.field1488 = arg1 + arg2;
        class135 var14 = class203.field2487.method2045((byte) 36, this.field1481);
        int var15 = var14.field1516;
        if (~var15 != 0) {
            this.field1476 = class618.field8696.method124(24006, var15);
            this.field1490 = false;
        } else {
            this.field1490 = true;
        }
        if (this.field1488 == arg2) {
            class259.method1473(super.field4641, (byte) 1, this.field1476, super.field4647, super.field4638, this.field1495, false);
        }
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)V")
    public final void method448(int arg0) {
        int var2 = -52 / ((arg0 - 12) / 56);
        ++field1471;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(Loa;I)Lok;")
    public final class231 method442(class635 arg0, int arg1) {
        ++field1486;
        class350 var3 = this.method743(2048 | (~this.field1491 != -1 ? 5 : 0), this.field1481, arg0, arg1 + -1);
        if (var3 == null) {
            return null;
        } else {
            if (this.field1491 != arg1) {
                var3.method903(this.field1491 * 2048);
            }
            class389 var4 = arg0.method297();
            var4.method228(super.field4641, super.field4646, super.field4647);
            this.method742((byte) -125, arg0, var4, var3);
            if (this.field1478 == null) {
                var3.method904(var4, (class130) null, 0);
            } else {
                class211 var5 = this.field1478.method1241();
                arg0.method301(var3, var5, var4, (class130) null, 0);
            }
            this.field1482 = var3.method864();
            return null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field1470;
        if (this.field1478 != null) {
            this.field1478.method1243();
        }
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(Loa;I)V")
    public final void method451(class635 arg0, int arg1) {
        if (arg1 != 31055) {
            this.method449((byte) -49);
        }
        ++field1494;
        class350 var3 = this.method743(0, this.field1481, arg0, -1);
        if (var3 != null) {
            class389 var4 = arg0.method297();
            var4.method228(super.field4641, super.field4646, super.field4647);
            this.method742((byte) -124, arg0, var4, var3);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method457(int arg0, int arg1, class635 arg2, int arg3) {
        ++field1483;
        if (arg1 != 1) {
            this.method449((byte) 34);
        }
        return false;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(Z)V")
    public static void method739(boolean arg0) {
        if (arg0) {
            method739(false);
        }
        field1473 = null;
    }

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "(I)I")
    public final int method740(int arg0) {
        ++field1484;
        int var2 = 95 / ((arg0 - -31) / 48);
        return this.field1482;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZIZIILfl;Loa;)V")
    public final void method453(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, class673 arg5, class635 arg6) {
        ++field1489;
        if (arg2) {
            this.method744(-126, 99);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
    public final void method741(byte arg0) {
        ++field1475;
        if (arg0 > -81) {
            this.field1488 = 65;
        }
        if (this.field1478 != null) {
            this.field1478.method1243();
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BLoa;Lq;Lba;)V")
    private final void method742(byte arg0, class635 arg1, class389 arg2, class350 arg3) {
        arg3.method866(arg2);
        if (arg0 >= -60) {
            this.field1476 = null;
        }
        ++field1493;
        class375[] var5 = arg3.method886();
        class73[] var6 = arg3.method882();
        if ((this.field1478 == null || this.field1478.field2467) && (var5 != null || var6 != null)) {
            this.field1478 = class202.method1229(class469.field6549, true);
        }
        if (this.field1478 != null) {
            this.field1478.method1236(arg1, (long) class469.field6549, var5, var6, false);
            this.field1478.method1242(super.field4638, super.field4642, super.field4645, super.field4648, super.field4639);
        }
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(B)Z")
    public final boolean method449(byte arg0) {
        if (arg0 != -126) {
            this.method448(-107);
        }
        ++field1479;
        return false;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILoa;)Lgr;")
    public final class396 method450(int arg0, class635 arg1) {
        int var3 = -41 / ((47 - arg0) / 34);
        ++field1480;
        return null;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(IILoa;I)Lba;")
    private final class350 method743(int arg0, int arg1, class635 arg2, int arg3) {
        if (arg3 != -1) {
            this.field1487 = 75;
        }
        ++field1477;
        class135 var5 = class203.field2487.method2045((byte) -121, arg1);
        class137 var6 = class275.field3477[super.field4638];
        class137 var7 = ~this.field1487 > -4 ? class275.field3477[this.field1487 + 1] : null;
        return !this.field1490 ? var5.method752(var7, arg2, arg0, class618.field8696, super.field4641, this.field1492, true, this.field1495, var6, this.field1474, super.field4647, arg3 + -78, super.field4646) : var5.method752(var7, arg2, arg0, class618.field8696, super.field4641, -1, true, -1, var6, 0, super.field4647, arg3 + -127, super.field4646);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
    public final void method744(int arg0, int arg1) {
        ++field1485;
        if (!this.field1490) {
            this.field1474 += arg1;
            while (~this.field1474 < ~this.field1476.field8208[this.field1495]) {
                this.field1474 -= this.field1476.field8208[this.field1495];
                ++this.field1495;
                if (~this.field1495 <= ~this.field1476.field8216.length) {
                    this.field1490 = true;
                    break;
                }
            }
            if (arg0 == 14723) {
                if (!this.field1490) {
                    class259.method1473(super.field4641, (byte) 1, this.field1476, super.field4647, super.field4638, this.field1495, false);
                }
            }
        }
    }
}

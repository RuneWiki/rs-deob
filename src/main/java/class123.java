import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class123 {

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    private int field1577 = 0;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    private int field1579 = 0;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "Ljf;")
    private class197 field1583 = null;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    private int field1587 = 0;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "Lkga;")
    private class506 field1578;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "Lwca;")
    private class628 field1582;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "[Lrw;")
    private class702[] field1581;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "Lsda;")
    public class235 field1584;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "Lwo;")
    public static class690 field1586 = new class690(107, 3);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "Ljn;")
    public static class668 field1589;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZIIIZ)V")
    public final void method856(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1580++;
        boolean var7 = arg5 & this.field1578.method224();
        if (!var7 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
            if (arg4 == 4) {
                arg2 = arg0;
            }
            arg4 = 2;
        }
        if (arg4 != 0 && arg1) {
            arg4 |= Integer.MIN_VALUE;
        }
        if (arg3 != 30959) {
            return;
        }
        if (this.field1577 != arg4) {
            if (this.field1577 != 0) {
                this.field1581[Integer.MAX_VALUE & this.field1577].method1002(true);
            }
            if (arg4 != 0) {
                this.field1581[arg4 & Integer.MAX_VALUE].method1005(arg1, -127);
                this.field1581[arg4 & Integer.MAX_VALUE].method1000(true, arg1);
                this.field1581[Integer.MAX_VALUE & arg4].method1001(arg0, -106, arg2);
            }
            this.field1583 = null;
            this.field1579 = arg2;
            this.field1577 = arg4;
            this.field1587 = arg0;
        } else if (this.field1577 != 0) {
            this.field1581[Integer.MAX_VALUE & this.field1577].method1000(true, arg1);
            if (this.field1587 != arg0 || this.field1579 != arg2) {
                this.field1581[Integer.MAX_VALUE & this.field1577].method1001(arg0, 99, arg2);
                this.field1579 = arg2;
                this.field1587 = arg0;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    public static void method857(int arg0) {
        if (arg0 >= -24) {
            method857(-128);
        }
        field1586 = null;
        field1589 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)Z")
    public final boolean method858(int arg0, int arg1) {
        field1576++;
        if (arg1 != -1666) {
            this.method859(true, null, 34);
        }
        return this.field1581[arg0].method998(false);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLjf;I)Z")
    public final boolean method859(boolean arg0, class197 arg1, int arg2) {
        field1585++;
        if (!arg0) {
            this.field1587 = -16;
        }
        if (this.field1577 == 0) {
            return false;
        }
        if (this.field1583 != arg1) {
            this.field1581[this.field1577 & Integer.MAX_VALUE].method1004(arg1, arg2, 58);
            this.field1583 = arg1;
        }
        return true;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lkga;)V")
    public class123(class506 arg0) {
        this.field1578 = arg0;
        this.field1582 = new class628(arg0);
        this.field1581 = new class702[10];
        this.field1581[1] = new class602(arg0);
        this.field1581[2] = new class382(arg0, this.field1582);
        this.field1581[4] = new class443(arg0, this.field1582);
        this.field1581[5] = new class498(arg0, this.field1582);
        this.field1581[6] = new class526(arg0);
        this.field1581[7] = new class396(arg0);
        this.field1581[3] = this.field1584 = new class235(arg0);
        this.field1581[8] = new class159(arg0, this.field1582);
        this.field1581[9] = new class205(arg0, this.field1582);
        if (!this.field1581[8].method998(false)) {
            this.field1581[8] = this.field1581[4];
        }
        if (!this.field1581[9].method998(false)) {
            this.field1581[9] = this.field1581[8];
        }
    }
}

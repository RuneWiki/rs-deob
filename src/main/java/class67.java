import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class67 extends class86 {

    @OriginalMember(owner = "client!je", name = "fc", descriptor = "Lsc;")
    private static class128 field1506 = class129.method1017(false, "yellow:");

    @OriginalMember(owner = "client!je", name = "Vb", descriptor = "Lsc;")
    public static class128 field1496 = field1506;

    @OriginalMember(owner = "client!je", name = "mc", descriptor = "Lsc;")
    public static class128 field1513 = field1506;

    @OriginalMember(owner = "client!je", name = "cc", descriptor = "I")
    public static int field1503 = 3353893;

    @OriginalMember(owner = "client!je", name = "oc", descriptor = "[Lsc;")
    public static class128[] field1515 = new class128[100];

    @OriginalMember(owner = "client!je", name = "kc", descriptor = "Z")
    public static boolean field1511 = false;

    @OriginalMember(owner = "client!je", name = "qc", descriptor = "Lsc;")
    public static class128 field1517 = class129.method1017(false, "blinken3:");

    @OriginalMember(owner = "client!je", name = "ec", descriptor = "Lrc;")
    public static class121 field1505 = new class121();

    @OriginalMember(owner = "client!je", name = "sc", descriptor = "Lsc;")
    public static class128 field1519 = class129.method1017(false, ":tradereq:");

    @OriginalMember(owner = "client!je", name = "rc", descriptor = "[I")
    public static int[] field1518 = new int[500];

    @OriginalMember(owner = "client!je", name = "Ub", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!je", name = "Wb", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!je", name = "Xb", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!je", name = "Yb", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!je", name = "Zb", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!je", name = "ac", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!je", name = "bc", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!je", name = "dc", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!je", name = "ic", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!je", name = "jc", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!je", name = "lc", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!je", name = "pc", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!je", name = "gc", descriptor = "Ljc;")
    private class65 field1507;

    @OriginalMember(owner = "client!je", name = "nc", descriptor = "Lae;")
    public static class6 field1514;

    @OriginalMember(owner = "client!je", name = "hc", descriptor = "[I")
    public static int[] field1508;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "(B)V")
    public static final void method503(byte arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
        ++field1509;
        if (arg0 != -122) {
            method513(20);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([II)V")
    public final void method504(int[] arg0, int arg1) {
        this.field1507 = new class65(arg0);
        int var3 = -68 / ((50 - arg1) / 57);
        ++field1510;
    }

    @OriginalMember(owner = "client!je", name = "k", descriptor = "(B)I")
    public final int method505(byte arg0) {
        int var2 = 117 % ((85 - arg0) / 33);
        ++field1512;
        return super.field1920[super.field1924++] + -this.field1507.method485(21705) & 255;
    }

    @OriginalMember(owner = "client!je", name = "u", descriptor = "(I)V")
    public static final void method506(int arg0) {
        class131.field2999 = new int[105][105];
        class106.field2418 = new byte[4][104][arg0];
        class93.field2146 = 99;
        class29.field559 = new byte[4][105][105];
        ++field1502;
        class63.field1354 = new int[104];
        class37.field713 = new int[104];
        class156.field3585 = new byte[4][104][104];
        class16.field305 = new byte[4][104][104];
        class119.field2686 = new int[104];
        class46.field848 = new int[104];
        class115.field2590 = new int[104];
        class95.field2229 = new int[4][105][105];
        class9.field139 = new byte[4][104][104];
    }

    @OriginalMember(owner = "client!je", name = "k", descriptor = "(II)V")
    public final void method507(int arg0, int arg1) {
        super.field1920[super.field1924++] = (byte) (this.field1507.method485(21705) + arg1);
        int var3 = 40 % ((arg0 - -16) / 63);
        ++field1501;
    }

    @OriginalMember(owner = "client!je", name = "v", descriptor = "(I)V")
    public final void method508(int arg0) {
        if (arg0 != 104) {
            field1513 = null;
        }
        this.field1516 = super.field1924 * 8;
        ++field1495;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
    public static final byte[] method509(Object arg0, byte arg1, boolean arg2) {
        ++field1504;
        int var3 = -101 / ((-36 - arg1) / 33);
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return arg2 ? class99.method758(-2, var4) : var4;
        } else if (arg0 instanceof class113) {
            class113 var5 = (class113) arg0;
            return var5.method554(-120);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)I")
    public final int method510(boolean arg0, int arg1) {
        ++field1500;
        if (!arg0) {
            method506(-26);
        }
        return arg1 * 8 + -this.field1516;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
    public final void method511(boolean arg0) {
        ++field1499;
        super.field1924 = (this.field1516 + 7) / 8;
        if (arg0) {
            field1517 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(IB)I")
    public final int method512(int arg0, byte arg1) {
        ++field1498;
        int var3 = -(this.field1516 & 7) + 8;
        int var4 = this.field1516 >> 3;
        this.field1516 += arg0;
        int var5 = 0;
        if (arg1 != -78) {
            this.method507(-87, -75);
        }
        while (var3 < arg0) {
            var5 += (super.field1920[var4++] & class33.field633[var3]) << -var3 + arg0;
            arg0 -= var3;
            var3 = 8;
        }
        int var6;
        if (~arg0 != ~var3) {
            var6 = (super.field1920[var4] >> -arg0 + var3 & class33.field633[arg0]) + var5;
        } else {
            var6 = (super.field1920[var4] & class33.field633[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(I)V")
    public class67(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!je", name = "w", descriptor = "(I)V")
    public static void method513(int arg0) {
        field1514 = null;
        field1496 = null;
        field1518 = null;
        field1517 = null;
        field1515 = null;
        field1506 = null;
        field1519 = null;
        field1513 = null;
        field1505 = null;
        if (arg0 < 101) {
            field1513 = null;
        }
        field1508 = null;
    }
}

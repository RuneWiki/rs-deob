import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public abstract class class694 extends class539 {

    @OriginalMember(owner = "client!eca", name = "t", descriptor = "Z")
    public boolean field9744;

    @OriginalMember(owner = "client!eca", name = "y", descriptor = "[Leca;")
    public class694[] field9749;

    @OriginalMember(owner = "client!eca", name = "s", descriptor = "Lof;")
    public static class568 field9743 = new class568(3, 5);

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
    public int field9738;

    @OriginalMember(owner = "client!eca", name = "o", descriptor = "I")
    public static int field9739;

    @OriginalMember(owner = "client!eca", name = "q", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!eca", name = "r", descriptor = "I")
    public static int field9742;

    @OriginalMember(owner = "client!eca", name = "u", descriptor = "I")
    public static int field9745;

    @OriginalMember(owner = "client!eca", name = "v", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!eca", name = "w", descriptor = "I")
    public static int field9747;

    @OriginalMember(owner = "client!eca", name = "x", descriptor = "I")
    public static int field9748;

    @OriginalMember(owner = "client!eca", name = "z", descriptor = "I")
    public static int field9750;

    @OriginalMember(owner = "client!eca", name = "C", descriptor = "I")
    public static int field9753;

    @OriginalMember(owner = "client!eca", name = "D", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!eca", name = "A", descriptor = "Lhv;")
    public class477 field9751;

    @OriginalMember(owner = "client!eca", name = "p", descriptor = "Lqf;")
    public class626 field9740;

    @OriginalMember(owner = "client!eca", name = "B", descriptor = "Ltt;")
    public static class79 field9752;

    @OriginalMember(owner = "client!eca", name = "E", descriptor = "[Lxa;")
    public static class461[] field9755;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIB)[I", line = 5)
    public final int[] method3809(int arg0, int arg1, byte arg2) {
        if (arg2 != 35) {
            this.field9751 = null;
        }
        field9753++;
        return this.field9749[arg0].field9744 ? this.field9749[arg0].method39(115, arg1) : this.field9749[arg0].method15(-22151, arg1)[0];
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)I", line = 28)
    public int method16(int arg0) {
        if (arg0 != 1) {
            this.method19(-14, null, (byte) 68);
        }
        field9739++;
        return -1;
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)I", line = 39)
    public int method2402(int arg0) {
        field9754++;
        if (arg0 != 18289) {
            field9743 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "(I)V", line = 52)
    public void method14(int arg0) {
        if (arg0 != 71828324) {
            this.field9744 = true;
        }
        field9750++;
        if (this.field9744) {
            this.field9751.method2713(true);
            this.field9751 = null;
        } else {
            this.field9740.method3481(0);
            this.field9740 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)[I", line = 78)
    public int[] method39(int arg0, int arg1) {
        if (arg0 < 112) {
            return null;
        } else {
            field9741++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILjr;B)V", line = 90)
    public void method19(int arg0, class96 arg1, byte arg2) {
        field9742++;
        int var4 = -103 / ((58 - arg2) / 63);
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(III)V", line = 99)
    public void method2403(int arg0, int arg1, int arg2) {
        field9737++;
        int var4 = ~this.field9738 == arg2 ? arg1 : this.field9738;
        if (this.field9744) {
            this.field9751 = new class477(var4, arg1, arg0);
        } else {
            this.field9740 = new class626(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "(I)V", line = 124)
    public void method40(int arg0) {
        field9748++;
        if (arg0 <= 5) {
            this.field9740 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)I", line = 143)
    public static final int method3810(int arg0, int arg1) {
        field9746++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        if (arg1 != 71828324) {
            field9752 = null;
        }
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(II)[[I", line = 161)
    public int[][] method15(int arg0, int arg1) {
        field9745++;
        if (arg0 != -22151) {
            this.method40(-14);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "(I)V", line = 173)
    public static void method3811(int arg0) {
        field9752 = null;
        int var1 = 38 % ((-arg0 - 10) / 34);
        field9755 = null;
        field9743 = null;
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(III)[[I", line = 191)
    public final int[][] method3812(int arg0, int arg1, int arg2) {
        field9747++;
        if (arg2 != -14032) {
            return null;
        } else if (this.field9749[arg1].field9744) {
            int[] var4 = this.field9749[arg1].method39(125, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field9749[arg1].method15(arg2 - 8119, arg0);
        }
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(IZ)V", line = 225)
    public class694(int arg0, boolean arg1) {
        this.field9744 = arg1;
        this.field9749 = new class694[arg0];
    }
}

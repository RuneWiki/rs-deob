import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class567 extends class751 {

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    private int field8026 = -1;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "Lep;")
    public static class440 field8017 = new class440("RC", 1);

    @OriginalMember(owner = "client!md", name = "L", descriptor = "Lpa;")
    public static class387 field8027 = new class387(64);

    @OriginalMember(owner = "client!md", name = "M", descriptor = "[I")
    public static int[] field8028 = new int[1000];

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public static int field8016;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static int field8021;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public static int field8022;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public int field8023;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public int field8025;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "[I")
    public int[] field8029;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)[[I")
    public int[][] method147(int arg0, byte arg1) {
        ++field8019;
        int[][] var3 = super.field10409.method3474(2132, arg0);
        if (super.field10409.field8481 && this.method3298(29)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field8025 * (class152.field2253 != this.field8023 ? this.field8023 * arg0 / class152.field2253 : arg0);
            if (~class673.field9452 != ~this.field8025) {
                for (int var8 = 0; var8 < class673.field9452; ++var8) {
                    int var9 = this.field8025 * var8 / class673.field9452;
                    int var10 = this.field8029[var7 + var9];
                    var6[var8] = class111.method773(4080, var10 << 4);
                    var5[var8] = class111.method773(65280, var10) >> 4;
                    var4[var8] = class111.method773(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class673.field9452; ++var11) {
                    int var12 = this.field8029[var7++];
                    var6[var11] = class111.method773(4080, var12 << 4);
                    var5[var11] = class111.method773(4080, var12 >> 4);
                    var4[var11] = class111.method773(4080, var12 >> 12);
                }
            }
        }
        if (arg1 != 57) {
            method3294(-64, -59, 111);
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(III)Z")
    public static final boolean method3294(int arg0, int arg1, int arg2) {
        if (arg0 != -7020) {
            return true;
        } else {
            ++field8020;
            return ~(arg1 & 2048) != -1;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class567() {
        super(0, false);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)Lpb;")
    public static final class680 method3295(int arg0, int arg1) {
        ++field8018;
        class680[] var2 = class164.method1284(arg1 + -36);
        for (int var3 = arg1; ~var3 > ~var2.length; ++var3) {
            class680 var4 = var2[var3];
            if (var4.field9658 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(B)I")
    public final int method3296(byte arg0) {
        ++field8021;
        if (arg0 != 65) {
            this.field8026 = -69;
        }
        return this.field8026;
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(B)V")
    public static void method3297(byte arg0) {
        if (arg0 != 74) {
            field8027 = null;
        }
        field8017 = null;
        field8028 = null;
        field8027 = null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public final void method313(int arg0) {
        ++field8016;
        super.method313(arg0);
        this.field8029 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        int var4 = 33 / ((arg0 - 25) / 63);
        if (~arg2 == -1) {
            this.field8026 = arg1.method898((byte) -83);
        }
        ++field8024;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Z")
    public final boolean method3298(int arg0) {
        ++field8022;
        if (this.field8029 != null) {
            return true;
        } else if (this.field8026 >= 0) {
            class625 var2 = ~class116.field1453 > -1 ? class625.method3587(class770.field10620, this.field8026) : class625.method3580(class770.field10620, class116.field1453, this.field8026);
            var2.method3574();
            this.field8029 = var2.method3573();
            this.field8023 = var2.field8822;
            this.field8025 = var2.field8827;
            return true;
        } else {
            return arg0 < 0 ? false : false;
        }
    }
}

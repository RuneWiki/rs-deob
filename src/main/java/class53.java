import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class53 extends class135 {

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    private int field660 = 1365;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    private int field657 = 0;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
    private int field661 = 0;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
    private int field662 = 20;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "Ls;")
    public static class227 field663 = new class227(200);

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "Lde;")
    public static class127 field664 = new class127(0, 0);

    @OriginalMember(owner = "client!lf", name = "fb", descriptor = "I")
    public static int field666 = 0;

    @OriginalMember(owner = "client!lf", name = "hb", descriptor = "Lqj;")
    public static class196 field668 = class80.method502("k", -48);

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!lf", name = "gb", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!lf", name = "ib", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "[[[B")
    public static byte[][][] field665;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
    public static final void method278(int arg0) {
        for (int var1 = -1; var1 < class252.field4451; ++var1) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class14.field153[var1];
            }
            class134 var6 = class247.field4397[var5];
            if (var6 != null && ~var6.field2095 < -1) {
                --var6.field2095;
                if (~var6.field2095 == -1) {
                    var6.field2051 = null;
                }
            }
        }
        for (int var2 = 0; ~class63.field863 < ~var2; ++var2) {
            int var3 = class188.field3295[var2];
            class164 var4 = class153.field2482[var3];
            if (var4 != null && ~var4.field2095 < -1) {
                --var4.field2095;
                if (var4.field2095 == 0) {
                    var4.field2051 = null;
                }
            }
        }
        if (arg0 != 2047) {
            field665 = null;
        }
        ++field658;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class53() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.field657 = arg0.method318(true);
                    }
                } else {
                    this.field661 = arg0.method318(true);
                }
            } else {
                this.field662 = arg0.method318(true);
            }
        } else {
            this.field660 = arg0.method318(true);
        }
        if (arg2 != -16231) {
            this.field660 = -71;
        }
        ++field656;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        ++field659;
        int[] var3 = super.field1954.method110(arg0, -116);
        if (super.field1954.field244) {
            for (int var4 = 0; ~var4 > ~class131.field1862; ++var4) {
                int var5 = (class82.field1189[var4] << 12) / this.field660 + this.field661;
                int var6 = (class123.field1756[arg0] << 12) / this.field660 + this.field657;
                int var7 = var6;
                int var8 = var5;
                int var9 = var6;
                int var10 = var5 * var5 >> 12;
                int var11 = var6 * var6 >> 12;
                int var12 = 0;
                int var13 = var5;
                while (~(var10 + var11) > -16385 && this.field662 > var12) {
                    ++var12;
                    var9 = (var9 * var13 >> 12) * 2 + var7;
                    var13 = var8 + var10 + -var11;
                    var11 = var9 * var9 >> 12;
                    var10 = var13 * var13 >> 12;
                }
                var3[var4] = this.field662 + -1 <= var12 ? 0 : (var12 << 12) / this.field662;
            }
        }
        if (arg1) {
            field663 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V")
    public static void method279(byte arg0) {
        field665 = null;
        if (arg0 == 109) {
            field664 = null;
            field663 = null;
            field668 = null;
        }
    }
}

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class200 extends class656 {

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "I")
    public int field2998;

    @OriginalMember(owner = "client!wfa", name = "p", descriptor = "I")
    public int field3004;

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "[I")
    public static int[] field2997 = new int[8];

    @OriginalMember(owner = "client!wfa", name = "v", descriptor = "[I")
    public static int[] field3010 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!wfa", name = "k", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!wfa", name = "l", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!wfa", name = "m", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!wfa", name = "n", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!wfa", name = "o", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!wfa", name = "q", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!wfa", name = "r", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!wfa", name = "s", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!wfa", name = "u", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!wfa", name = "w", descriptor = "Lofa;")
    public static class333 field3011;

    @OriginalMember(owner = "client!wfa", name = "t", descriptor = "Lli;")
    public static class433 field3008;

    @OriginalMember(owner = "client!wfa", name = "x", descriptor = "Ljava/awt/Frame;")
    public static Frame field3012;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)I", line = 7)
    public final int method1344(int arg0) {
        if (arg0 < 117) {
            return 22;
        } else {
            field2999++;
            return (this.field3004 & 0x1C4C78) >> 18;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)Z", line = 18)
    public final boolean method1345(int arg0) {
        field3001++;
        if (arg0 >= -9) {
            this.field2998 = 8;
        }
        return (this.field3004 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "(I)Z", line = 34)
    public final boolean method1346(int arg0) {
        if (arg0 <= 109) {
            method1349(69, -51, -30);
        }
        field3000++;
        return (this.field3004 & 0x7A367B) >> 22 != 0;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BI)V", line = 45)
    public static final void method1347(byte arg0, int arg1) {
        field3002++;
        class127 var2 = class760.method4231(arg1, -874792672, 5);
        int var3 = 85 % ((-arg0 - 17) / 47);
        var2.method1002(-64);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)Z", line = 59)
    public final boolean method1348(int arg0, int arg1) {
        if (arg1 != 3) {
            field3010 = null;
        }
        field3007++;
        return (this.field3004 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)I", line = 71)
    public static final int method1349(int arg0, int arg1, int arg2) {
        if (arg2 == 3) {
            field3006++;
            return arg1 == 1 || arg1 == 3 ? class626.field8307[arg0 & 0x3] : class431.field5939[arg0 & 0x3];
        } else {
            return 70;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)Z", line = 88)
    public final boolean method1350(byte arg0) {
        field3009++;
        if (arg0 > -92) {
            method1349(-62, 59, 16);
        }
        return (this.field3004 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "(I)I", line = 99)
    public final int method1351(int arg0) {
        if (arg0 == 2) {
            field3003++;
            return class642.method3522((byte) 38, this.field3004);
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "(I)V", line = 112)
    public static void method1352(int arg0) {
        field3008 = null;
        field3011 = null;
        field3012 = null;
        field2997 = null;
        field3010 = null;
        int var1 = -18 % ((57 - arg0) / 43);
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(II)V", line = 131)
    public class200(int arg0, int arg1) {
        this.field2998 = arg1;
        this.field3004 = arg0;
    }
}

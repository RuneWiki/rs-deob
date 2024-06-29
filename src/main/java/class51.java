import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class51 extends class601 {

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "Lhda;")
    public static class752 field642 = new class752(116, -1);

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "Lhda;")
    public static class752 field644 = new class752(21, -1);

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "I")
    private int field645;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "I")
    private int field647;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
    private int field651;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIII)I", line = 9)
    public static final int method358(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 3;
        ++field650;
        if (~var4 == -1) {
            return arg2;
        } else if (arg3 != 30141) {
            return -117;
        } else if (~var4 == -2) {
            return arg1;
        } else {
            return var4 == 2 ? -arg2 + 7 : -arg1 + 7;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lee;BI)V", line = 32)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        ++field649;
        if (arg1 != -61) {
            this.field651 = -128;
        }
        if (~arg2 == -1) {
            this.method361(-24408, arg0.method3833(255));
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V", line = 59)
    public static void method359(byte arg0) {
        field642 = null;
        if (arg0 > -14) {
            field642 = null;
        }
        field644 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 70)
    public static final void method360(String arg0, int arg1) {
        ++field646;
        if (class142.field2268 && (class575.field7557 & 24) != 0) {
            boolean var2 = false;
            int var3 = class586.field7665;
            int[] var4 = class20.field351;
            for (int var5 = arg1; var5 < var3; ++var5) {
                class383 var6 = class248.field3438[var4[var5]];
                if (var6.field5334 != null && var6.field5334.equalsIgnoreCase(arg0) && (class472.field6475 == var6 && ~(16 & class575.field7557) != -1 || var6 != null && (class575.field7557 & 8) != 0)) {
                    ++class625.field8302;
                    class583 var7 = class381.method2246(1, class128.field2105, class551.field7271);
                    var7.field7637.method3772(var4[var5], -231665880);
                    var7.field7637.method3772(class136.field2168, -231665880);
                    var7.field7637.method3781(true, class275.field3827);
                    var7.field7637.method3823(-101, 0);
                    var7.field7637.method3798(arg1 + 27695, class649.field8631);
                    class42.method309(var7, arg1);
                    var2 = true;
                    class126.method1000(0, var6.field10321[0], 0, var6.method2256(-1), -2, var6.method2256(-1), true, var6.field10322[0], -1);
                    break;
                }
            }
            if (!var2) {
                class178.method1234(4, 31663, class517.field6861.method2877(class713.field9854, (byte) -108) + arg0);
            }
            if (class142.field2268) {
                class617.method3377((byte) 86);
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(I)V", line = 120)
    private class51(int arg0) {
        super(0, false);
        this.method361(-24408, arg0);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(IZ)[[I", line = 128)
    public final int[][] method7(int arg0, boolean arg1) {
        ++field648;
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (!arg1) {
            this.field645 = -22;
        }
        if (super.field7890.field9769) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class171.field2624 < ~var7; ++var7) {
                var4[var7] = this.field645;
                var5[var7] = this.field647;
                var6[var7] = this.field651;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V", line = 169)
    private final void method361(int arg0, int arg1) {
        this.field651 = 4080 & arg1 << 4;
        this.field645 = 4080 & arg1 >> 12;
        this.field647 = (65280 & arg1) >> 4;
        ++field643;
        if (arg0 != -24408) {
            this.field645 = -18;
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V", line = 186)
    public class51() {
        this(0);
    }
}

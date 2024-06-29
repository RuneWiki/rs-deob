import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class57 extends class535 {

    @OriginalMember(owner = "client!jv", name = "F", descriptor = "I")
    private int field1013 = -1;

    @OriginalMember(owner = "client!jv", name = "K", descriptor = "[I")
    public static int[] field1017 = new int[1000];

    @OriginalMember(owner = "client!jv", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field1023 = null;

    @OriginalMember(owner = "client!jv", name = "H", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!jv", name = "I", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!jv", name = "J", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!jv", name = "L", descriptor = "I")
    public int field1018;

    @OriginalMember(owner = "client!jv", name = "N", descriptor = "I")
    public int field1020;

    @OriginalMember(owner = "client!jv", name = "O", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!jv", name = "R", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!jv", name = "S", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!jv", name = "T", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!jv", name = "P", descriptor = "[I")
    public int[] field1022;

    @OriginalMember(owner = "client!jv", name = "M", descriptor = "[[Lnf;")
    public static class414[][] field1019;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "(B)V")
    public static void method481(byte arg0) {
        if (arg0 >= -114) {
            field1017 = null;
        }
        field1023 = null;
        field1019 = null;
        field1017 = null;
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V")
    public class57() {
        super(0, false);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)[[I")
    public int[][] method61(int arg0, int arg1) {
        ++field1025;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (super.field7879.field1528 && this.method482(24979)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class362.field5263 != ~this.field1018 ? this.field1018 * arg1 / class362.field5263 : arg1) * this.field1020;
            if (~class174.field2597 == ~this.field1020) {
                for (int var8 = 0; ~var8 > ~class174.field2597; ++var8) {
                    int var9 = this.field1022[var7++];
                    var6[var8] = class168.method1203(var9 << 4, 4080);
                    var5[var8] = class168.method1203(4080, var9 >> 4);
                    var4[var8] = class168.method1203(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; class174.field2597 > var10; ++var10) {
                    int var11 = this.field1020 * var10 / class174.field2597;
                    int var12 = this.field1022[var7 + var11];
                    var6[var10] = class168.method1203(var12, 255) << 4;
                    var5[var10] = class168.method1203(4080, var12 >> 4);
                    var4[var10] = class168.method1203(4080, var12 >> 12);
                }
            }
        }
        if (arg0 > -116) {
            field1017 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)Z")
    public final boolean method482(int arg0) {
        if (arg0 != 24979) {
            method483((int[]) null, (long[]) null, -80, -47, -104);
        }
        ++field1015;
        if (this.field1022 != null) {
            return true;
        } else if (this.field1013 >= 0) {
            class104 var2 = class467.field6788 >= 0 ? class104.method767(class224.field3404, class467.field6788, this.field1013) : class104.method763(class224.field3404, this.field1013);
            var2.method765();
            this.field1022 = var2.method754();
            this.field1020 = var2.field1590;
            this.field1018 = var2.field1594;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "([I[JIII)V")
    public static final void method483(int[] arg0, long[] arg1, int arg2, int arg3, int arg4) {
        if (~arg4 > ~arg3) {
            int var5 = (arg4 - -arg3) / 2;
            int var6 = arg4;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg4; ~arg3 < ~var11; ++var11) {
                if ((long) (var11 & var10) + var7 > arg1[var11]) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    int var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var9;
            method483(arg0, arg1, 119, var6 - 1, arg4);
            method483(arg0, arg1, 105, arg3, var6 + 1);
        }
        ++field1026;
        if (arg2 < 72) {
            field1023 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
    public final void method484(int arg0) {
        super.method484(arg0);
        ++field1016;
        this.field1022 = null;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        ++field1014;
        if (arg2 == -6232) {
            if (~arg0 == -1) {
                this.field1013 = arg1.method3018(566990904);
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)I")
    public final int method485(int arg0) {
        ++field1024;
        return arg0 > -68 ? -105 : this.field1013;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V")
    public static final void method486(boolean arg0) {
        class316.field4702 = null;
        ++field1021;
        class472.method2798(4, 0, class50.field927, class188.field2765, 0, 0, -1, class76.field1247, 0);
        if (class316.field4702 != null) {
            class525.method3111(class354.field5154, 0, 0, class76.field1247, class316.field4702, class50.field927, -1412584499, class77.field1271.field2895, 0, class260.field3843);
            class316.field4702 = null;
        }
        if (arg0) {
            field1017 = null;
        }
    }
}

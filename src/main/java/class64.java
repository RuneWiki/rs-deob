import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class64 extends class205 {

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "Z")
    private boolean field1170 = true;

    @OriginalMember(owner = "client!fi", name = "gb", descriptor = "Z")
    private boolean field1176 = true;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    public static int field1168 = 0;

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "[J")
    public static long[] field1173 = new long[100];

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "Lvd;")
    private static class222 field1166 = class212.method1357("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", 10731);

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "Lvd;")
    public static class222 field1169 = class212.method1357("Benutzen", 10731);

    @OriginalMember(owner = "client!fi", name = "hb", descriptor = "Lvd;")
    public static class222 field1177 = field1166;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "Lvd;")
    public static class222 field1171 = class212.method1357(":assistreq:", 10731);

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!fi", name = "fb", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!fi", name = "eb", descriptor = "Lab;")
    public static class3 field1174;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field3810.method557(6978, arg1);
            if (super.field3810.field1635) {
                int[] var4 = this.method1322(!this.field1176 ? arg1 : -arg1 + class17.field433, (byte) 125, 0);
                if (this.field1170) {
                    for (int var5 = 0; ~var5 > ~class118.field2245; ++var5) {
                        var3[var5] = var4[-var5 + class159.field3039];
                    }
                } else {
                    class163.method1026(var4, 0, var3, 0, class118.field2245);
                }
            }
            ++field1165;
            return var3;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class64() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        if (arg1 < 98) {
            this.method96(-25, (byte) 101);
        }
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        ++field1172;
        if (super.field3815.field3015) {
            int[][] var4 = this.method1323(0, this.field1176 ? -arg0 + class17.field433 : arg0, -5920);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field1170) {
                for (int var11 = 0; ~var11 > ~class118.field2245; ++var11) {
                    var8[var11] = var5[-var11 + class159.field3039];
                    var9[var11] = var6[-var11 + class159.field3039];
                    var10[var11] = var7[class159.field3039 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class118.field2245; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V")
    public static void method437(int arg0) {
        int var1 = 68 / ((-73 - arg0) / 50);
        field1171 = null;
        field1166 = null;
        field1177 = null;
        field1173 = null;
        field1174 = null;
        field1169 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field1175;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field3812 = arg0.method662((byte) -97) == 1;
                }
            } else {
                this.field1176 = ~arg0.method662((byte) -103) == -2;
            }
        } else {
            this.field1170 = arg0.method662((byte) -122) == 1;
        }
        int var5 = 30 % ((arg1 - -47) / 34);
    }
}

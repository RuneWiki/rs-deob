import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class165 extends class105 {

    @OriginalMember(owner = "client!sc", name = "rb", descriptor = "I")
    private int field3212 = -1;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "Leh;")
    private static class47 field3194 = class195.method1282((byte) -4, "flash1:");

    @OriginalMember(owner = "client!sc", name = "eb", descriptor = "Leh;")
    public static class47 field3199 = class195.method1282((byte) -4, ":duelstake:");

    @OriginalMember(owner = "client!sc", name = "ib", descriptor = "Leh;")
    public static class47 field3203 = field3194;

    @OriginalMember(owner = "client!sc", name = "gb", descriptor = "Leh;")
    private static class47 field3201 = class195.method1282((byte) -4, "This world is full)3");

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "Leh;")
    public static class47 field3196 = field3201;

    @OriginalMember(owner = "client!sc", name = "pb", descriptor = "Leh;")
    public static class47 field3210 = field3194;

    @OriginalMember(owner = "client!sc", name = "db", descriptor = "Leh;")
    private static class47 field3198 = class195.method1282((byte) -4, "white:");

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "Leh;")
    public static class47 field3195 = field3198;

    @OriginalMember(owner = "client!sc", name = "fb", descriptor = "Leh;")
    public static class47 field3200 = field3198;

    @OriginalMember(owner = "client!sc", name = "ub", descriptor = "Leh;")
    public static class47 field3215 = class195.method1282((byte) -4, ")3");

    @OriginalMember(owner = "client!sc", name = "hb", descriptor = "Lpa;")
    public static class136 field3202 = new class136(64);

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!sc", name = "jb", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!sc", name = "mb", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!sc", name = "nb", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!sc", name = "ob", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!sc", name = "qb", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!sc", name = "sb", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!sc", name = "tb", descriptor = "I")
    public int field3214;

    @OriginalMember(owner = "client!sc", name = "kb", descriptor = "Lfd;")
    public static class52 field3205;

    @OriginalMember(owner = "client!sc", name = "lb", descriptor = "[I")
    public int[] field3206;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lhe;")
    public static final class69 method1122(int arg0, int arg1) {
        ++field3208;
        class69 var2 = (class69) class120.field2421.method986((byte) 50, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class21.field409.method67(arg0, -1, arg1);
            class69 var4 = new class69();
            if (var3 != null) {
                var4.method619(arg1, new class68(var3), 16776960);
            }
            class120.field2421.method987((long) arg1, var4, 28842);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)Z")
    public final boolean method1123(int arg0) {
        ++field3211;
        if (arg0 >= -13) {
            return true;
        } else if (this.field3206 != null) {
            return true;
        } else if (this.field3212 >= 0) {
            class50 var2 = class116.method912(this.field3212, 0, class186.field3554);
            var2.method433();
            this.field3193 = var2.field977;
            this.field3214 = var2.field982;
            this.field3206 = var2.field978;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)[[I")
    public int[][] method15(int arg0, boolean arg1) {
        ++field3197;
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        if (super.field2186.field28 && this.method1123(-40)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field3214 * (class120.field2422 == this.field3193 ? arg0 : this.field3193 * arg0 / class120.field2422);
            if (~class149.field2928 == ~this.field3214) {
                for (int var8 = 0; class149.field2928 > var8; ++var8) {
                    int var9 = this.field3206[var7++];
                    var6[var8] = class142.method1018(var9, 255) << 4;
                    var5[var8] = class142.method1018(65280, var9) >> 4;
                    var4[var8] = class142.method1018(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class149.field2928; ++var10) {
                    int var11 = this.field3214 * var10 / class149.field2928;
                    int var12 = this.field3206[var7 + var11];
                    var6[var10] = class142.method1018(255, var12) << 4;
                    var5[var10] = class142.method1018(var12, 65280) >> 4;
                    var4[var10] = class142.method1018(4080, var12 >> 12);
                }
            }
        }
        if (!arg1) {
            field3201 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([Leh;Z[S)V")
    public static final void method1124(class47[] arg0, boolean arg1, short[] arg2) {
        class26.method240(-114, 0, arg0.length + -1, arg2, arg0);
        ++field3213;
        if (arg1) {
            method1124((class47[]) null, true, (short[]) null);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)Lgh;")
    public static final class63 method1125(int arg0, int arg1, int arg2, int arg3) {
        ++field3207;
        if (arg0 > -126) {
            field3198 = null;
        }
        class63 var4 = new class63();
        var4.field1345 = arg2;
        var4.field1349 = arg1;
        class138.field2710.method1341(-42, (long) arg3, var4);
        class146.method1033(0, arg1);
        class6.method31(arg1, (byte) -127);
        class61 var5 = class23.method224(arg3, 484111152);
        if (var5 != null) {
            class20.method204(var5, (byte) -5);
        }
        if (class200.field3905 != null) {
            class20.method204(class200.field3905, (byte) -5);
            class200.field3905 = null;
        }
        class95.field1971 = 0;
        class80.field1726 = false;
        class27.method249(class76.field1648, -23343, class152.field2967, class79.field1694, class105.field2182);
        if (class202.field3924 != -1) {
            class76.method662((byte) -35, class202.field3924, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        ++field3204;
        if (arg0 == 0) {
            this.field3212 = arg1.method569(arg2 ^ -26496);
        }
        if (arg2 != -256) {
            field3199 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(Z)V")
    public static void method1126(boolean arg0) {
        field3205 = null;
        field3215 = null;
        field3210 = null;
        field3195 = null;
        if (arg0) {
            field3202 = null;
            field3196 = null;
            field3201 = null;
            field3203 = null;
            field3200 = null;
            field3194 = null;
            field3199 = null;
            field3198 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)I")
    public final int method850(byte arg0) {
        if (arg0 != -26) {
            return -53;
        } else {
            ++field3209;
            return this.field3212;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class165() {
        super(0, false);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class161 extends class105 {

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "Leh;")
    private static class47 field3124 = class195.method1282((byte) -4, "Members object");

    @OriginalMember(owner = "client!rh", name = "lb", descriptor = "Leh;")
    public static class47 field3133 = class195.method1282((byte) -4, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!rh", name = "mb", descriptor = "I")
    public static int field3134 = 0;

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "Leh;")
    public static class47 field3123 = field3124;

    @OriginalMember(owner = "client!rh", name = "ob", descriptor = "[Leh;")
    public static class47[] field3136 = new class47[8];

    @OriginalMember(owner = "client!rh", name = "hb", descriptor = "I")
    public static int field3129 = 0;

    @OriginalMember(owner = "client!rh", name = "fb", descriptor = "Leh;")
    public static class47 field3127 = class195.method1282((byte) -4, "");

    @OriginalMember(owner = "client!rh", name = "eb", descriptor = "Leh;")
    public static class47 field3126 = field3127;

    @OriginalMember(owner = "client!rh", name = "nb", descriptor = "Leh;")
    public static class47 field3135 = class195.method1282((byte) -4, "Weiter");

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "Leh;")
    public static class47 field3121 = field3127;

    @OriginalMember(owner = "client!rh", name = "gb", descriptor = "I")
    public static int field3128 = 0;

    @OriginalMember(owner = "client!rh", name = "sb", descriptor = "Leh;")
    public static class47 field3140 = class195.method1282((byte) -4, "<col=00ff80>");

    @OriginalMember(owner = "client!rh", name = "tb", descriptor = "I")
    public static int field3141 = 0;

    @OriginalMember(owner = "client!rh", name = "ib", descriptor = "Leh;")
    public static class47 field3130 = field3127;

    @OriginalMember(owner = "client!rh", name = "wb", descriptor = "Leh;")
    public static class47 field3144 = field3127;

    @OriginalMember(owner = "client!rh", name = "ub", descriptor = "Leh;")
    public static class47 field3142 = field3127;

    @OriginalMember(owner = "client!rh", name = "yb", descriptor = "Leh;")
    public static class47 field3146 = field3127;

    @OriginalMember(owner = "client!rh", name = "pb", descriptor = "Lpa;")
    public static class136 field3137 = new class136(50);

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!rh", name = "db", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!rh", name = "jb", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!rh", name = "kb", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!rh", name = "qb", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!rh", name = "rb", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!rh", name = "xb", descriptor = "Log;")
    public static class133 field3145;

    @OriginalMember(owner = "client!rh", name = "vb", descriptor = "Lvg;")
    public static class196 field3143;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        int[] var3 = super.field2192.method336(-81, arg0);
        if (super.field2192.field770) {
            int[] var4 = this.method851(0, true, arg0);
            for (int var5 = 0; class149.field2928 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        ++field3120;
        if (arg1 <= 78) {
            field3136 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Luf;")
    public static final class186 method1102(int arg0, int arg1) {
        class186 var2 = (class186) class77.field1676.method986((byte) 50, (long) arg1);
        ++field3125;
        if (var2 != null) {
            return var2;
        } else {
            if (arg0 != -12411) {
                method1102(110, -95);
            }
            byte[] var3 = class166.field3219.method67(5, arg0 + 12410, arg1);
            class186 var4 = new class186();
            if (var3 != null) {
                var4.method1234(new class68(var3), (byte) -78);
            }
            class77.field1676.method987((long) arg1, var4, 28842);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        if (!arg1) {
            field3137 = null;
        }
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        if (super.field2186.field28) {
            int[][] var4 = this.method854(0, (byte) 69, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class149.field2928; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var7[var11] + 4096;
                var10[var11] = -var6[var11] + 4096;
            }
        }
        ++field3131;
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        ++field3138;
        if (arg2 != -256) {
            field3137 = null;
        }
        if (arg0 == 0) {
            super.field2179 = arg1.method604((byte) -124) == 1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class161() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)I")
    public static final int method1103(int arg0, int arg1) {
        if (arg0 != 8) {
            method1103(-55, -122);
        }
        int var2 = 0;
        if (~arg1 > -1 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 16;
        }
        ++field3139;
        if (~arg1 <= -257) {
            arg1 >>>= 8;
            var2 += 8;
        }
        if (~arg1 <= -17) {
            arg1 >>>= 4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 2;
            var2 += 2;
        }
        if (~arg1 <= -2) {
            ++var2;
            arg1 >>>= 1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([Ldg;II[BIIIIII)V")
    public static final void method1104(class37[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; ~var10 > -9; ++var10) {
            for (int var15 = 0; ~var15 > -9; ++var15) {
                if (arg4 + var10 > 0 && ~(arg4 + var10) > -104 && ~(arg8 + var15) < -1 && ~(arg8 + var15) > -104) {
                    arg0[arg7].field741[arg4 - -var10][arg8 + var15] = class142.method1018(arg0[arg7].field741[arg4 - -var10][arg8 + var15], -16777217);
                }
            }
        }
        ++field3132;
        class68 var11 = new class68(arg3);
        for (int var12 = 0; var12 < 4; ++var12) {
            for (int var13 = 0; ~var13 > -65; ++var13) {
                for (int var14 = 0; var14 < 64; ++var14) {
                    if (~arg2 == ~var12 && ~var13 <= ~arg6 && ~var13 > ~(arg6 + 8) && var14 >= arg5 && ~(arg5 - -8) < ~var14) {
                        class203.method1329(var11, 0, arg8 + class130.method961(7 & var13, 7 & var14, arg1, false), arg1, 0, arg7, arg4 + class5.method27(arg1, 7 & var14, (byte) 65, var13 & 7), false);
                    } else {
                        class203.method1329(var11, 0, -1, 0, 0, 0, -1, false);
                    }
                }
            }
        }
        if (arg9 < 58) {
            field3128 = -78;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V")
    public static void method1105(byte arg0) {
        field3135 = null;
        field3133 = null;
        field3145 = null;
        field3123 = null;
        field3127 = null;
        field3140 = null;
        field3136 = null;
        field3142 = null;
        field3124 = null;
        field3126 = null;
        field3130 = null;
        field3144 = null;
        field3121 = null;
        field3146 = null;
        if (arg0 == -119) {
            field3143 = null;
            field3137 = null;
        }
    }
}

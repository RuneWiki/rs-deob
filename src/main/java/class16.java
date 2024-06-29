import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class16 extends class60 {

    @OriginalMember(owner = "client!ql", name = "Lb", descriptor = "Lwa;")
    public static class75 field204 = class66.method560(":clanreq:", false);

    @OriginalMember(owner = "client!ql", name = "Pb", descriptor = "I")
    public static int field208 = -1;

    @OriginalMember(owner = "client!ql", name = "Xb", descriptor = "[I")
    public static int[] field216 = new int[500];

    @OriginalMember(owner = "client!ql", name = "Ub", descriptor = "B")
    public static byte field213;

    @OriginalMember(owner = "client!ql", name = "Fb", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ql", name = "Gb", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ql", name = "Ib", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ql", name = "Kb", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ql", name = "Mb", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!ql", name = "Nb", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ql", name = "Qb", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ql", name = "Rb", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ql", name = "Sb", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!ql", name = "Tb", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ql", name = "Wb", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!ql", name = "Yb", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ql", name = "Jb", descriptor = "Lab;")
    public static class138 field202;

    @OriginalMember(owner = "client!ql", name = "Hb", descriptor = "Loh;")
    public static class15 field200;

    @OriginalMember(owner = "client!ql", name = "Ob", descriptor = "Lcb;")
    public static class267 field207;

    @OriginalMember(owner = "client!ql", name = "Vb", descriptor = "Lmb;")
    private class97 field214;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B[I)V", line = 8)
    public final void method86(byte arg0, int[] arg1) {
        if (arg0 != 81) {
            field216 = (int[]) null;
        }
        field210++;
        this.field214 = new class97(arg1);
    }

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "(II)V", line = 24)
    public final void method87(int arg0, int arg1) {
        if (arg0 != 65280) {
            field213 = -125;
        }
        this.field997[this.field1012++] = (byte) (this.field214.method749(64) + arg1);
        field203++;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(Z)V", line = 42)
    public final void method88(boolean arg0) {
        if (!arg0) {
            field200 = (class15) null;
        }
        field201++;
        this.field205 = this.field1012 * 8;
    }

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "(II)I", line = 56)
    public final int method89(int arg0, int arg1) {
        if (arg1 != -21530) {
            field216 = (int[]) null;
        }
        field206++;
        return arg0 * 8 - this.field205;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(I)V", line = 70)
    public class16(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIZI)I", line = 75)
    public static final int method90(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field215++;
        if (class153.field2633) {
            class153.field2633 = false;
            arg2 = 1000000;
        }
        class230 var5 = class213.field3629[arg1][arg4];
        int var6 = var5.field3901;
        float var7 = ((float) arg0 * 0.1F + 0.7F) * var5.field3915;
        float var8 = var5.field3904;
        float var9 = var5.field3905;
        int var10 = var5.field3912;
        int var11 = var5.field3906;
        if (!class69.field1193) {
            var11 = 0;
        }
        if (class144.field2486 != var6 || class151.field2591 != var7 || class292.field5020 != var8 || class244.field4117 != var9 || class287.field4944 != var10 || class73.field1231 != var11) {
            class252.field4229 = 0;
            class292.field5020 = var8;
            class244.field4117 = var9;
            class144.field2486 = var6;
            class139.field2379 = class20.field274;
            class178.field3013 = class190.field3169;
            class287.field4944 = var10;
            class151.field2591 = var7;
            class73.field1231 = var11;
            class288.field4946 = class79.field1348;
            class244.field4115 = class269.field4651;
            class219.field3736 = class137.field2351;
            class138.field2359 = class214.field3632;
        }
        if (class252.field4229 < 65536) {
            class252.field4229 += arg2 * 250;
            if (class252.field4229 >= 65536) {
                class252.field4229 = 65536;
            }
            int var12 = 65536 - class252.field4229 >> 8;
            int var13 = class252.field4229 >> 8;
            float var14 = (float) (65536 - class252.field4229) / 65536.0F;
            float var15 = (float) class252.field4229 / 65536.0F;
            class214.field3632 = class244.field4117 * var15 + class138.field2359 * var14;
            class269.field4651 = ((class244.field4115 & 0xFF00FF) * var12 + (class144.field2486 & 0xFF00FF) * var13 & 0xFF00FF00) + ((class244.field4115 & 0xFF00) * var12 + (class144.field2486 & 0xFF00) * var13 & 0xFF0000) >> 8;
            class20.field274 = class292.field5020 * var15 + class139.field2379 * var14;
            class190.field3169 = ((class178.field3013 & 0xFF00) * var12 + ((class287.field4944 & 0xFF00) * var13) & 0xFF0000) + ((class287.field4944 & 0xFF00FF) * var13 + (class178.field3013 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
            class137.field2351 = class219.field3736 * var12 + (class73.field1231 * var13) >> 8;
            class79.field1348 = class288.field4946 * var14 + class151.field2591 * var15;
        }
        class239.method1745(class269.field4651, class79.field1348, class20.field274, class214.field3632);
        class239.method1749(class190.field3169, class137.field2351);
        class239.method1746((float) class270.field4660, (float) class7.field83, (float) class90.field1489);
        class239.method1742();
        if (arg3) {
            field202 = (class138) null;
        }
        return class190.field3169;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)I", line = 158)
    public static final int method91(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class21.field290[class208.method1534(arg1, arg2)];
        field198++;
        if (arg0 > 0) {
            int var5 = class21.field279.method1066(255, arg0 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 <= 127) {
                    var6 = arg2 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class21.field279.method1067(119, arg0 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF00) >> 8) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF0000) >> 16) * var9;
                int var12 = (var4 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = ((var11 & 0xF000FF00) << 8) + (var12 >> 8) + (var10 & 0xFF00);
            }
        }
        if (arg3 != -30110) {
            field207 = (class267) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "(II)I", line = 230)
    public final int method92(int arg0, int arg1) {
        field209++;
        int var3 = this.field205 >> 3;
        int var4 = arg1 - (this.field205 & 0x7);
        this.field205 += arg0;
        int var5 = 0;
        while (arg0 > var4) {
            var5 += (this.field997[var3++] & class190.field3171[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (class190.field3171[var4] & this.field997[var3]) + var5;
        } else {
            var6 = (this.field997[var3] >> var4 - arg0 & class190.field3171[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(BI)Z", line = 260)
    public static final boolean method93(byte arg0, int arg1) {
        if (arg0 >= -3) {
            return false;
        } else {
            field211++;
            return ((arg1 & 0x23938133) >> 29) != 0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "(I)I", line = 274)
    public final int method94(int arg0) {
        if (arg0 > -121) {
            field204 = (class75) null;
        }
        field212++;
        return this.field997[this.field1012++] - this.field214.method749(64) & 0xFF;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(II[BI)V", line = 288)
    public final void method95(int arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = arg0; var5 < arg3; var5++) {
            arg2[arg1 + var5] = (byte) (this.field997[this.field1012++] - this.field214.method749(64));
        }
        field217++;
    }

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "(B)V", line = 309)
    public static void method96(byte arg0) {
        if (arg0 != 117) {
            field204 = (class75) null;
        }
        field216 = null;
        field200 = null;
        field204 = null;
        field202 = null;
        field207 = null;
    }

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "(B)V", line = 323)
    public final void method97(byte arg0) {
        this.field1012 = (this.field205 + 7) / 8;
        if (arg0 == 77) {
            field199++;
        }
    }
}

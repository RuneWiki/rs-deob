import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class238 extends class41 {

    @OriginalMember(owner = "client!ug", name = "Mb", descriptor = "Lke;")
    private static class256 field4056 = class316.method2202(" ", 27626);

    @OriginalMember(owner = "client!ug", name = "Ob", descriptor = "Lke;")
    public static class256 field4058 = class316.method2202(" ", 27626);

    @OriginalMember(owner = "client!ug", name = "Lb", descriptor = "Lke;")
    public static class256 field4055 = field4056;

    @OriginalMember(owner = "client!ug", name = "Nb", descriptor = "I")
    public static int field4057 = 0;

    @OriginalMember(owner = "client!ug", name = "Hb", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!ug", name = "Ib", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!ug", name = "Kb", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!ug", name = "Pb", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!ug", name = "Qb", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!ug", name = "Rb", descriptor = "I")
    private int field4061;

    @OriginalMember(owner = "client!ug", name = "Tb", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ug", name = "Ub", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!ug", name = "Vb", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!ug", name = "Wb", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!ug", name = "Xb", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!ug", name = "Yb", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!ug", name = "Zb", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!ug", name = "Jb", descriptor = "Lng;")
    public static class138 field4053;

    @OriginalMember(owner = "client!ug", name = "Sb", descriptor = "Lom;")
    private class153 field4062;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V", line = 16)
    public static final void method1594(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class187 var5 = (class187) class246.field4191.method1270((byte) -121); var5 != null; var5 = (class187) class246.field4191.method1277(1)) {
            class17.method104(arg0, arg3, -91, var5, arg2, arg1);
        }
        field4060++;
        for (class187 var6 = (class187) class186.field3272.method1270((byte) -121); var6 != null; var6 = (class187) class186.field3272.method1277(arg4)) {
            byte var7 = 1;
            if (var6.field3293.field1238 == var6.field3293.field1236) {
                var7 = 0;
            } else if (var6.field3293.field1236 == var6.field3293.field1218) {
                var7 = 2;
            }
            if (var6.field3292 != var7) {
                int var8 = class269.method1860(var6.field3293, 120);
                if (var6.field3288 != var8) {
                    if (var6.field3276 != null) {
                        class197.field3603.method2237(var6.field3276);
                        var6.field3276 = null;
                    }
                    var6.field3288 = var8;
                }
                var6.field3292 = var7;
            }
            var6.field3280 = var6.field3293.field1192;
            var6.field3286 = var6.field3293.field1192 + var6.field3293.method515(arg4 + 5373951) * 64;
            var6.field3297 = var6.field3293.field1197;
            var6.field3285 = var6.field3293.field1197 + (var6.field3293.method515(5373952) * 64);
            class17.method104(arg0, arg3, arg4 + 86, var6, arg2, arg1);
        }
        if (arg4 != 1) {
            method1605(-39);
        }
        for (class187 var9 = (class187) class31.field498.method1743(true); var9 != null; var9 = (class187) class31.field498.method1742((byte) 22)) {
            byte var10 = 1;
            if (var9.field3277.field1238 == var9.field3277.field1236) {
                var10 = 0;
            } else if (var9.field3277.field1236 == var9.field3277.field1218) {
                var10 = 2;
            }
            if (var9.field3292 != var10) {
                int var11 = class1.method10(var9.field3277, 127);
                if (var9.field3288 != var11) {
                    if (var9.field3276 != null) {
                        class197.field3603.method2237(var9.field3276);
                        var9.field3276 = null;
                    }
                    var9.field3288 = var11;
                }
                var9.field3292 = var10;
            }
            var9.field3280 = var9.field3277.field1192;
            var9.field3286 = var9.field3277.field1192 + (var9.field3277.method515(5373952) * 64);
            var9.field3297 = var9.field3277.field1197;
            var9.field3285 = var9.field3277.field1197 + (var9.field3277.method515(arg4 ^ 0x520001) * 64);
            class17.method104(arg0, arg3, arg4 ^ 0xFFFFFFAC, var9, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)I", line = 119)
    public final int method1595(int arg0, boolean arg1) {
        field4068++;
        int var3 = 8 - (this.field4061 & 0x7);
        int var4 = 0;
        int var5 = this.field4061 >> 3;
        this.field4061 += arg0;
        if (arg1) {
            method1603(97);
        }
        while (arg0 > var3) {
            var4 += (class66.field1180[var3] & this.field772[var5++]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg0 == var3) {
            var6 = (class66.field1180[var3] & this.field772[var5]) + var4;
        } else {
            var6 = (this.field772[var5] >> var3 - arg0 & class66.field1180[arg0]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "(I)I", line = 149)
    public final int method1596(int arg0) {
        if (arg0 != 255) {
            this.method1596(-125);
        }
        field4059++;
        return this.field772[this.field738++] - this.field4062.method1146(-10722) & 0xFF;
    }

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "(I)V", line = 161)
    public final void method1597(int arg0) {
        field4069++;
        if (arg0 == 0) {
            this.field4061 = this.field738 * 8;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V", line = 171)
    public class238(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIIZIII)Z", line = 182)
    public static final boolean method1598(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        field4067++;
        if (arg9 == ~class121.field2124.method515(5373952)) {
            return class124.method856(arg8, arg5, arg3, arg6, arg9 + 7792, arg11, arg4, arg10, arg7, arg1, arg0, arg2);
        } else if (class121.field2124.method515(5373952) > 2) {
            return class54.method429(arg8, arg3, arg10, arg6, arg11, arg4, arg7, arg0, (byte) 114, arg5, arg2, arg1, class121.field2124.method515(5373952));
        } else {
            return class277.method1919(arg0, arg5, arg6, arg1, arg2, arg11, arg3, arg8, (byte) 13, arg4, arg7, arg10);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)V", line = 199)
    public final void method1599(int arg0, byte arg1) {
        int var3 = 32 % ((22 - arg1) / 49);
        this.field772[this.field738++] = (byte) (arg0 + this.field4062.method1146(-10722));
        field4065++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lra;I)Lqh;", line = 211)
    public static final class31 method1600(class41 arg0, int arg1) {
        field4054++;
        class31 var2 = new class31(arg0.method313((byte) 54), arg0.method313((byte) 54), arg0.method346(-16), arg0.method346(-16), arg0.method327(4), arg0.method357(false) == 1, arg0.method357(false));
        int var3 = arg0.method357(false);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field495.method1269(false, new class71(arg0.method346(-16), arg0.method346(-16), arg0.method346(-16), arg0.method346(-16)));
        }
        if (arg1 >= -16) {
            method1603(-96);
        }
        var2.method222((byte) -92);
        return var2;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III[B)V", line = 243)
    public final void method1601(int arg0, int arg1, int arg2, byte[] arg3) {
        field4064++;
        if (arg0 != 25705) {
            this.method1606(-72, (int[]) null);
        }
        for (int var5 = 0; var5 < arg1; var5++) {
            arg3[arg2 + var5] = (byte) (this.field772[this.field738++] - this.field4062.method1146(-10722));
        }
    }

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "(I)V", line = 269)
    public final void method1602(int arg0) {
        this.field738 = (this.field4061 + arg0) / 8;
        field4063++;
    }

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "(I)Loe;", line = 282)
    public static final class77 method1603(int arg0) {
        field4066++;
        class77 var1 = (class77) class70.field1284.method534(124);
        if (var1 != null) {
            var1.method1199(21966);
            var1.method235(44);
            return var1;
        } else if (arg0 == 15874) {
            class77 var2;
            do {
                var2 = (class77) class180.field3187.method534(92);
                if (var2 == null) {
                    return null;
                }
                if (var2.method582((byte) 115) > class224.method1536(false)) {
                    return null;
                }
                var2.method1199(21966);
                var2.method235(94);
            } while ((Long.MIN_VALUE & var2.field539) == 0L);
            return var2;
        } else {
            return (class77) null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "(II)I", line = 335)
    public final int method1604(int arg0, int arg1) {
        if (arg0 < 50) {
            this.method1604(102, -53);
        }
        field4051++;
        return arg1 * 8 - this.field4061;
    }

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "(I)V", line = 348)
    public static void method1605(int arg0) {
        field4055 = null;
        field4056 = null;
        if (arg0 != 2) {
            field4056 = (class256) null;
        }
        field4053 = null;
        field4058 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[I)V", line = 364)
    public final void method1606(int arg0, int[] arg1) {
        field4052++;
        this.field4062 = new class153(arg1);
        if (arg0 > -28) {
            this.method1599(-51, (byte) 104);
        }
    }
}

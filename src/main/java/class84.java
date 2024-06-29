import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class84 extends class175 {

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "B")
    public byte field1251;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "Lsi;")
    public class391 field1255;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "Lbm;")
    public static class75 field1257;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIZ)V", line = 3)
    public static final void method654(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (~arg0 > -2) {
            arg0 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        ++field1254;
        int var6 = arg3 + -334;
        if (var6 >= 0) {
            if (var6 > 100) {
                var6 = 100;
            }
        } else {
            var6 = 0;
        }
        int var7 = class526.field7791 - -((class174.field2590 - class526.field7791) * var6 / 100);
        if (~var7 > ~class272.field3752) {
            var7 = class272.field3752;
        } else if (var7 > class433.field6353) {
            var7 = class433.field6353;
        }
        int var8 = 18 % ((-74 - arg4) / 44);
        int var9 = arg3 * var7 * 512 / (arg0 * 334);
        if (~var9 <= ~class353.field5181) {
            if (class407.field5958 < var9) {
                short var10 = class407.field5958;
                var7 = arg0 * var10 * 334 / (arg3 * 512);
                if (var7 < class272.field3752) {
                    var7 = class272.field3752;
                    int var11 = arg0 * var10 * 334 / (var7 * 512);
                    int var12 = (-var11 + arg3) / 2;
                    if (arg5) {
                        class269.field3721.method260();
                        class269.field3721.method325(arg2, arg0, -16777216, 1, arg1, var12);
                        class269.field3721.method325(arg2, arg0, -16777216, 1, arg1 - -arg3 - var12, var12);
                    }
                    arg3 -= var12 * 2;
                    arg1 += var12;
                }
            }
        } else {
            short var13 = class353.field5181;
            var7 = arg0 * 334 * var13 / (arg3 * 512);
            if (~class433.field6353 > ~var7) {
                var7 = class433.field6353;
                int var14 = var7 * 512 * arg3 / (var13 * 334);
                int var15 = (-var14 + arg0) / 2;
                if (arg5) {
                    class269.field3721.method260();
                    class269.field3721.method325(arg2, var15, -16777216, 1, arg1, arg3);
                    class269.field3721.method325(-var15 + arg0 + arg2, var15, -16777216, 1, arg1, arg3);
                }
                arg2 += var15;
                arg0 -= var15 * 2;
            }
        }
        class305.field4167 = arg2;
        class23.field314 = arg1;
        class336.field4533 = (short) arg0;
        class367.field5379 = arg3 * var7 / 334;
        class13.field200 = (short) arg3;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V", line = 99)
    public static void method655(boolean arg0) {
        if (!arg0) {
            field1257 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)[B", line = 112)
    public final byte[] method656(int arg0) {
        if (arg0 != 1) {
            return null;
        } else {
            ++field1250;
            if (!super.field2597 && ~(this.field1255.field5678.length + -this.field1251) >= ~this.field1255.field5719) {
                return this.field1255.field5678;
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)I", line = 131)
    public final int method657(int arg0) {
        ++field1247;
        if (arg0 != 0) {
            this.field1255 = null;
        }
        return this.field1255 == null ? 0 : this.field1255.field5719 * 100 / (this.field1255.field5678.length + -this.field1251);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lsi;IB)V", line = 146)
    public static final void method658(class391 arg0, int arg1, byte arg2) {
        if (class82.field1237 != null) {
            try {
                class82.field1237.method2710(true, 0L);
                class82.field1237.method2708(24, arg1, arg0.field5678, (byte) -112);
            } catch (Exception var3) {
            }
        }
        ++field1249;
        if (arg2 > -119) {
            field1257 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z[Lem;I)V", line = 167)
    public static final void method659(boolean arg0, class150[] arg1, int arg2) {
        for (int var3 = 0; arg1.length > var3; ++var3) {
            class150 var4 = arg1[var3];
            if (var4 != null && ~var4.field2259 == ~arg2 && !client.method1222(var4)) {
                if (~var4.field2315 == -1) {
                    method659(false, arg1, var4.field2277);
                    if (var4.field2299 != null) {
                        method659(false, var4.field2299, var4.field2277);
                    }
                    class295 var5 = (class295) class212.field2960.method1492((long) var4.field2277, 6340);
                    if (var5 != null) {
                        class441.method2622(var5.field4055, -201);
                    }
                }
                if (var4.field2315 == 6 && ~var4.field2262 != 0) {
                    class104 var6 = class222.field3168.method126(-119, var4.field2262);
                    if (var6 != null) {
                        var4.field2240 += class193.field2758;
                        while (~var4.field2240 < ~var6.field1575[var4.field2267]) {
                            var4.field2240 -= var6.field1575[var4.field2267];
                            ++var4.field2267;
                            if (~var4.field2267 <= ~var6.field1551.length) {
                                var4.field2267 -= var6.field1567;
                                if (~var4.field2267 > -1 || var4.field2267 >= var6.field1551.length) {
                                    var4.field2267 = 0;
                                }
                            }
                            var4.field2281 = var4.field2267 + 1;
                            if (var6.field1551.length <= var4.field2281) {
                                var4.field2281 -= var6.field1567;
                                if (var4.field2281 < 0 || var4.field2281 >= var6.field1551.length) {
                                    var4.field2281 = -1;
                                }
                            }
                            class370.method2222(0, var4);
                        }
                    }
                }
            }
        }
        if (arg0) {
            method659(true, (class150[]) null, 118);
        }
        ++field1253;
    }

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "(I)V", line = 256)
    public static final void method660(int arg0) {
        if (arg0 != 2) {
            method654(79, 19, 116, 12, -80, true);
        }
        for (int var1 = 0; ~class267.field3695.length < ~var1; ++var1) {
            for (int var2 = 0; ~var2 > ~class267.field3695[var1].length; ++var2) {
                class267.field3695[var1][var2] = class421.field6170;
            }
        }
        ++field1252;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class63 extends class55 {

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "Lid;")
    public static class149 field1125 = class60.method382("_", (byte) 121);

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "Lid;")
    public static class149 field1124 = class60.method382("::tele ", (byte) 124);

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "Lid;")
    public static class149 field1133 = class60.method382("Regarder dans cette direction", (byte) 28);

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "Z")
    public static boolean field1134 = true;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "Z")
    public static boolean field1137 = false;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "Lcg;")
    public class166 field1131;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "[B")
    public byte[] field1135;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)[B")
    public final byte[] method352(int arg0) {
        ++field1127;
        if (super.field987) {
            throw new RuntimeException();
        } else {
            if (arg0 != 0) {
                method395(69, (class230) null, 123, -64);
            }
            return this.field1135;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIBI)V")
    public static final void method394(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = class47.method303(arg1, class94.field1655, class224.field3940, arg4 + 65472);
        int var7 = class47.method303(arg3, class94.field1655, class224.field3940, 65535);
        if (arg4 != 63) {
            field1125 = null;
        }
        int var8 = class47.method303(arg0, class192.field3449, class257.field4496, arg4 ^ 65472);
        ++field1129;
        int var9 = class47.method303(arg2, class192.field3449, class257.field4496, arg4 + 65472);
        for (int var10 = var6; ~var10 >= ~var7; ++var10) {
            class141.method987(2, var8, class15.field220[var10], var9, arg5);
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)I")
    public final int method348(byte arg0) {
        ++field1136;
        if (arg0 != -52) {
            this.field1131 = null;
        }
        return super.field987 ? 0 : 100;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILal;II)Lch;")
    public static final class282 method395(int arg0, class230 arg1, int arg2, int arg3) {
        ++field1132;
        if (!class59.method371((byte) -72, arg2, arg0, arg1)) {
            return null;
        } else {
            if (arg3 != 3576) {
                field1125 = null;
            }
            return class98.method711(0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)Lid;")
    public static final class149 method396(int arg0, boolean arg1) {
        if (!arg1) {
            method398(16, 114, 91, 99, 86, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 2, (byte) -75, -109, -30);
        }
        ++field1126;
        return class237.method1603(new class149[] { class211.method1434(255 & arg0 >> 24, true), class183.field3297, class211.method1434(arg0 >> 16 & 255, true), class183.field3297, class211.method1434(arg0 >> 8 & 255, true), class183.field3297, class211.method1434(255 & arg0, arg1) }, -112);
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V")
    public static void method397(int arg0) {
        field1124 = null;
        if (arg0 >= -24) {
            field1125 = null;
        }
        field1125 = null;
        field1133 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method398(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class181.field3264 * 128) {
            arg0 = class181.field3264 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class129.field2291 * 128) {
            arg2 = class129.field2291 * 128 - 1;
        }
        class69.field1205 = class235.field4123[arg3];
        class243.field4264 = class235.field4118[arg3];
        class257.field4493 = class235.field4123[arg4];
        class78.field1465 = class235.field4118[arg4];
        class82.field1495 = arg0;
        class37.field554 = arg1;
        class226.field3971 = arg2;
        class118.field2011 = arg0 / 128;
        class124.field2186 = arg2 / 128;
        class224.field3945 = class118.field2011 - class200.field3624;
        if (class224.field3945 < 0) {
            class224.field3945 = 0;
        }
        class75.field1348 = class124.field2186 - class200.field3624;
        if (class75.field1348 < 0) {
            class75.field1348 = 0;
        }
        class286.field5081 = class200.field3624 + class118.field2011;
        if (class286.field5081 > class181.field3264) {
            class286.field5081 = class181.field3264;
        }
        class245.field4314 = class200.field3624 + class124.field2186;
        if (class245.field4314 > class129.field2291) {
            class245.field4314 = class129.field2291;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class200.field3624 + class200.field3624 + 2; ++var16) {
            for (int var19 = 0; var19 < class200.field3624 + class200.field3624 + 2; ++var19) {
                int var20 = (var16 - class200.field3624 << 7) - (class82.field1495 & 127);
                int var21 = (var19 - class200.field3624 << 7) - (class226.field3971 & 127);
                int var22 = class118.field2011 - class200.field3624 + var16;
                int var23 = class124.field2186 - class200.field3624 + var19;
                if (var22 >= 0 && var23 >= 0 && var22 < class181.field3264 && var23 < class129.field2291) {
                    int var24;
                    if (class54.field973 != null) {
                        var24 = class54.field973[0][var22][var23] - class37.field554 + 128;
                    } else {
                        var24 = class211.field3759[0][var22][var23] - class37.field554 + 128;
                    }
                    int var25 = class211.field3759[3][var22][var23] - class37.field554 - 1000;
                    client.field2851[var16][var19] = class126.method883(var20, var25, var24, var21, var15);
                } else {
                    client.field2851[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class200.field3624 + class200.field3624 + 1; ++var17) {
            for (int var18 = 0; var18 < class200.field3624 + class200.field3624 + 1; ++var18) {
                class272.field4897[var17][var18] = client.field2851[var17][var18] || client.field2851[var17 + 1][var18] || client.field2851[var17][var18 + 1] || client.field2851[var17 + 1][var18 + 1];
            }
        }
        class109.field1889 = arg6;
        class137.field2510 = arg7;
        class164.field3037 = arg8;
        class47.field792 = arg9;
        class8.field103 = arg10;
        class108.method765();
        if (class102.field1798 != null) {
            class22.method128(true);
            class251.method1744(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class22.method128(false);
        }
        class251.method1744(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)V")
    public static final void method399(byte arg0) {
        ++field1130;
        if (arg0 != 46) {
            method395(97, (class230) null, 31, -24);
        }
        class249.field4358.method1291(0);
        class231.field4066.method1291(arg0 + -46);
        class148.field2666.method1291(0);
    }
}

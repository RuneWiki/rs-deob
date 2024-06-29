import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class151 extends class82 {

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public int field2179 = 0;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field2171 = 0;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "[I")
    public static int[] field2192 = new int[256];

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public int field2173;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public int field2174;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public int field2176;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public int field2178;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public int field2180;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public int field2181;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public int field2182;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    public int field2186;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public int field2187;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Ljj;")
    public class107 field2177;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "Lfa;")
    public class257 field2175;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "Lfa;")
    public class257 field2193;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "Lee;")
    public class288 field2188;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "Lvb;")
    public class61 field2191;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "Z")
    public boolean field2184;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "[I")
    public int[] field2183;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)I")
    public static final int method912(int arg0, int arg1, int arg2) {
        field2170++;
        if (arg0 < 49) {
            method913(true);
        }
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
    public static void method913(boolean arg0) {
        if (!arg0) {
            method913(true);
        }
        field2192 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZZ)V")
    public static final void method914(boolean arg0, boolean arg1) {
        class120.field1808 = arg0;
        if (!arg1) {
            field2192 = null;
        }
        field2185++;
        if (!class120.field1808) {
            int var26 = class100.field1580.method1570(true);
            int var27 = (class202.field3050 - class100.field1580.field3748) / 16;
            class106.field1618 = new int[var27][4];
            for (int var28 = 0; var28 < var27; var28++) {
                for (int var39 = 0; var39 < 4; var39++) {
                    class106.field1618[var28][var39] = class100.field1580.method1615(false);
                }
            }
            int var29 = class100.field1580.method1570(true);
            boolean var30 = class69.method461(11448, class100.field1580.method1571((byte) -112));
            boolean var31 = false;
            int var32 = class100.field1580.method1578(-2);
            int var33 = class100.field1580.method1571((byte) -91);
            int var34 = class100.field1580.method1575(!arg1);
            if ((var32 / 8 == 48 || (var32 / 8) == 49) && var26 / 8 == 48) {
                var31 = true;
            }
            class160.field2471 = new byte[var27][];
            class186.field2826 = null;
            class162.field2487 = new int[var27];
            class232.field3499 = new int[var27];
            class54.field884 = new byte[var27][];
            class218.field3281 = new int[var27];
            if ((var32 / 8) == 48 && var26 / 8 == 148) {
                var31 = true;
            }
            class258.field3936 = null;
            class145.field2122 = new int[var27];
            class48.field767 = new int[var27];
            int var35 = 0;
            for (int var36 = (var32 - 6) / 8; var36 <= (var32 + 6) / 8; var36++) {
                for (int var37 = (var26 - 6) / 8; var37 <= ((var26 + 6) / 8); var37++) {
                    int var38 = (var36 << 8) + var37;
                    if (var31 && var37 == 49 || var37 == 149 || var37 == 147 || var36 == 50 || !(var36 != 49 || var37 != 47)) {
                        class48.field767[var35] = var38;
                        class145.field2122[var35] = -1;
                        class232.field3499[var35] = -1;
                        class218.field3281[var35] = -1;
                        class162.field2487[var35] = -1;
                    } else {
                        class48.field767[var35] = var38;
                        class145.field2122[var35] = class165.field2540.method1965("m" + var36 + "_" + var37, -128);
                        class232.field3499[var35] = class165.field2540.method1965("l" + var36 + "_" + var37, -94);
                        class218.field3281[var35] = class165.field2540.method1965("um" + var36 + "_" + var37, -123);
                        class162.field2487[var35] = class165.field2540.method1965("ul" + var36 + "_" + var37, -77);
                    }
                    var35++;
                }
            }
            class132.method814(var33, var32, var29, var26, false, var34, var30, false);
            return;
        }
        class100.field1580.method1102(-2836);
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = class100.field1580.method1098(1, (byte) 120);
                    if (var25 == 1) {
                        class229.field3461[var2][var23][var24] = class100.field1580.method1098(26, (byte) -121);
                    } else {
                        class229.field3461[var2][var23][var24] = -1;
                    }
                }
            }
        }
        class100.field1580.method1103((byte) -65);
        int var3 = (class202.field3050 - class100.field1580.field3748) / 16;
        class106.field1618 = new int[var3][4];
        for (int var4 = 0; var4 < var3; var4++) {
            for (int var22 = 0; var22 < 4; var22++) {
                class106.field1618[var4][var22] = class100.field1580.method1590((byte) -80);
            }
        }
        boolean var5 = class69.method461(11448, class100.field1580.method1583(-1));
        int var6 = class100.field1580.method1575(false);
        int var7 = class100.field1580.method1571((byte) -88);
        int var8 = class100.field1580.method1575(false);
        int var9 = class100.field1580.method1578(-2);
        int var10 = class100.field1580.method1578(-2);
        class54.field884 = new byte[var3][];
        class160.field2471 = new byte[var3][];
        class162.field2487 = new int[var3];
        class145.field2122 = new int[var3];
        class218.field3281 = new int[var3];
        class186.field2826 = null;
        class258.field3936 = null;
        class48.field767 = new int[var3];
        class232.field3499 = new int[var3];
        int var11 = 0;
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 13; var13++) {
                for (int var14 = 0; var14 < 13; var14++) {
                    int var15 = class229.field3461[var12][var13][var14];
                    if (var15 != -1) {
                        int var16 = var15 >> 3 & 0x7FF;
                        int var17 = var15 >> 14 & 0x3FF;
                        int var18 = (var17 / 8 << 8) + (var16 / 8);
                        for (int var19 = 0; var19 < var11; var19++) {
                            if (class48.field767[var19] == var18) {
                                var18 = -1;
                                break;
                            }
                        }
                        if (var18 != -1) {
                            class48.field767[var11] = var18;
                            int var20 = var18 >> 8 & 0xFF;
                            int var21 = var18 & 0xFF;
                            class145.field2122[var11] = class165.field2540.method1965("m" + var20 + "_" + var21, -78);
                            class232.field3499[var11] = class165.field2540.method1965("l" + var20 + "_" + var21, -80);
                            class218.field3281[var11] = class165.field2540.method1965("um" + var20 + "_" + var21, -85);
                            class162.field2487[var11] = class165.field2540.method1965("ul" + var20 + "_" + var21, -114);
                            var11++;
                        }
                    }
                }
            }
        }
        class132.method814(var7, var8, var9, var10, false, var6, var5, !arg1);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
    public final void method915(boolean arg0) {
        field2189++;
        int var2 = this.field2178;
        if (this.field2188 != null) {
            class288 var5 = this.field2188.method1906((byte) -107);
            if (var5 == null) {
                this.field2174 = 0;
                this.field2181 = 0;
                this.field2178 = -1;
                this.field2183 = null;
                this.field2182 = 0;
                this.field2187 = 0;
            } else {
                this.field2183 = var5.field4322;
                this.field2174 = var5.field4360;
                this.field2187 = var5.field4324;
                this.field2178 = var5.field4347;
                this.field2181 = var5.field4380;
                this.field2182 = var5.field4372 * 128;
            }
        } else if (this.field2191 != null) {
            int var3 = class178.method1107(this.field2191, arg0);
            if (var2 != var3) {
                class72 var4 = this.field2191.field959;
                this.field2178 = var3;
                if (var4.field1196 != null) {
                    var4 = var4.method487(-1);
                }
                if (var4 == null) {
                    this.field2181 = this.field2182 = 0;
                } else {
                    this.field2182 = var4.field1175 * 128;
                    this.field2181 = var4.field1202;
                }
            }
        } else if (this.field2177 != null) {
            this.field2178 = class112.method727((byte) 92, this.field2177);
            this.field2181 = this.field2177.field1641;
            this.field2182 = this.field2177.field1655 * 128;
        }
        if (!arg0) {
            this.method915(true);
        }
        if (this.field2178 != var2 && this.field2175 != null) {
            class213.field3187.method378(this.field2175);
            this.field2175 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method916(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class197.field2997 * 128) {
            arg0 = class197.field2997 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class92.field1448 * 128) {
            arg2 = class92.field1448 * 128 - 1;
        }
        class215.field3235 = class249.field3767[arg3];
        class114.field1744 = class249.field3781[arg3];
        class274.field4120 = class249.field3767[arg4];
        class180.field2733 = class249.field3781[arg4];
        class274.field4127 = arg0;
        class239.field3593 = arg1;
        class136.field1998 = arg2;
        class81.field1306 = arg0 / 128;
        class43.field697 = arg2 / 128;
        class76.field1234 = class81.field1306 - class270.field4062;
        if (class76.field1234 < 0) {
            class76.field1234 = 0;
        }
        class192.field2952 = class43.field697 - class270.field4062;
        if (class192.field2952 < 0) {
            class192.field2952 = 0;
        }
        class76.field1229 = class81.field1306 + class270.field4062;
        if (class76.field1229 > class197.field2997) {
            class76.field1229 = class197.field2997;
        }
        class187.field2841 = class43.field697 + class270.field4062;
        if (class187.field2841 > class92.field1448) {
            class187.field2841 = class92.field1448;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class270.field4062 + class270.field4062 + 2; var16++) {
            for (int var19 = 0; var19 < class270.field4062 + class270.field4062 + 2; var19++) {
                int var20 = (var16 - class270.field4062 << 7) - (class274.field4127 & 0x7F);
                int var21 = (var19 - class270.field4062 << 7) - (class136.field1998 & 0x7F);
                int var22 = class81.field1306 + var16 - class270.field4062;
                int var23 = class43.field697 + var19 - class270.field4062;
                if (var22 >= 0 && var23 >= 0 && var22 < class197.field2997 && var23 < class92.field1448) {
                    int var24;
                    if (class246.field3685 == null) {
                        var24 = class297.field4695[0][var22][var23] + 128 - class239.field3593;
                    } else {
                        var24 = class246.field3685[0][var22][var23] + 128 - class239.field3593;
                    }
                    int var25 = class297.field4695[3][var22][var23] - class239.field3593 - 1000;
                    class155.field2329[var16][var19] = class17.method121(var20, var25, var24, var21, var15);
                } else {
                    class155.field2329[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class270.field4062 + class270.field4062 + 1; var17++) {
            for (int var18 = 0; var18 < class270.field4062 + class270.field4062 + 1; var18++) {
                class58.field915[var17][var18] = class155.field2329[var17][var18] || class155.field2329[var17 + 1][var18] || class155.field2329[var17][var18 + 1] || class155.field2329[var17 + 1][var18 + 1];
            }
        }
        class90.field1432 = arg6;
        class39.field530 = arg7;
        class65.field1030 = arg8;
        class233.field3513 = arg9;
        class274.field4133 = arg10;
        class124.method784();
        if (class63.field997 != null) {
            class43.method282(true);
            class72.method496(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class43.method282(false);
        }
        class72.method496(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }
}

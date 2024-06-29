import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class61 extends class153 {

    @OriginalMember(owner = "client!vb", name = "Ac", descriptor = "Ldb;")
    public static class17 field968 = new class17(128);

    @OriginalMember(owner = "client!vb", name = "Dc", descriptor = "Ljava/lang/String;")
    public static String field971 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!vb", name = "Fc", descriptor = "I")
    public static int field973 = -1;

    @OriginalMember(owner = "client!vb", name = "Cc", descriptor = "I")
    public static int field970 = -2;

    @OriginalMember(owner = "client!vb", name = "Ec", descriptor = "F")
    public static float field972;

    @OriginalMember(owner = "client!vb", name = "oc", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!vb", name = "pc", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!vb", name = "qc", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!vb", name = "sc", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!vb", name = "tc", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!vb", name = "uc", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!vb", name = "vc", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!vb", name = "wc", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!vb", name = "xc", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!vb", name = "yc", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!vb", name = "zc", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!vb", name = "Bc", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!vb", name = "Gc", descriptor = "Lmc;")
    public static class201 field974;

    @OriginalMember(owner = "client!vb", name = "rc", descriptor = "Lge;")
    public class72 field959;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lge;B)V")
    public final void method405(class72 arg0, byte arg1) {
        this.field959 = arg0;
        ++field962;
        if (super.field2226 != null) {
            super.field2226.method1542();
        }
        if (arg1 < 19) {
            field970 = 112;
        }
    }

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "(I)Z")
    public static final boolean method406(int arg0) {
        ++field965;
        if (arg0 >= -104) {
            field974 = null;
        }
        try {
            return class258.method1735(5);
        } catch (IOException var4) {
            class130.method811(121);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class246.field3683 + "," + class85.field1366 + "," + class136.field1990 + " - " + class202.field3050 + "," + (class81.field1303 - -class165.field2537.field2297[0]) + "," + (class165.field2537.field2275[0] + class147.field2141) + " - ";
            for (int var3 = 0; class202.field3050 > var3 && var3 < 50; ++var3) {
                var2 = var2 + class100.field1580.field3723[var3] + ",";
            }
            class275.method1822(var2, (byte) -87, var5);
            class281.method1858(-1);
            return true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(IZ)Ljava/lang/String;")
    public static final String method407(int arg0, boolean arg1) {
        ++field966;
        if (arg1) {
            return null;
        } else {
            return ~arg0 > -1000000000 ? Integer.toString(arg0) : "*";
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()I")
    public final int method81() {
        ++field963;
        return super.field2229;
    }

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "(I)V")
    public static final void method408(int arg0) {
        ++field969;
        if (arg0 <= 122) {
            field968 = null;
        }
        if (~class176.field2691 == -3) {
            if (class82.field1320 == class223.field3339 && ~class295.field4669 == ~class119.field1792) {
                class176.field2691 = 0;
                if (class99.field1563 && class140.field2048[81] && ~class218.field3278 < -3) {
                    class252.method1654(93, class218.field3278 + -2);
                    return;
                }
                class252.method1654(65, class218.field3278 - 1);
                return;
            }
        } else {
            if (class223.field3339 == class205.field3076 && ~class188.field2872 == ~class119.field1792) {
                class176.field2691 = 0;
                if (class99.field1563 && class140.field2048[81] && class218.field3278 > 2) {
                    class252.method1654(122, class218.field3278 + -2);
                    return;
                }
                class252.method1654(93, class218.field3278 + -1);
                return;
            }
            class176.field2691 = 2;
            class295.field4669 = class188.field2872;
            class82.field1320 = class205.field3076;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field960;
        if (this.field959 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)I")
    public final int method409(int arg0) {
        if (arg0 != 0) {
            return 64;
        } else {
            ++field961;
            if (this.field959.field1196 != null) {
                class72 var2 = this.field959.method487(-1);
                if (var2 != null && var2.field1176 != -1) {
                    return var2.field1176;
                }
            }
            return super.field2287;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIIIJILs;)V")
    public final void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class245 arg10) {
        ++field964;
        if (this.field959 != null) {
            class215 var13 = super.field2260 != -1 && ~super.field2204 == -1 ? class276.method1829(super.field2260, 29223) : null;
            class215 var14 = ~super.field2303 == 0 || super.field2303 == this.method928(24840).field2414 && var13 != null ? null : class276.method1829(super.field2303, 29223);
            class14 var15 = this.field959.method483(super.field2264, super.field2237, (byte) 106, super.field2235, var13, super.field2290, super.field2222, super.field2215, var14, super.field2207);
            if (var15 != null) {
                super.field2229 = var15.method81();
                class72 var16 = this.field959;
                if (var16.field1196 != null) {
                    var16 = var16.method487(-1);
                }
                if (class84.field1338 && var16.field1180) {
                    class14 var17 = class94.method602(var14 != null ? super.field2264 : super.field2207, super.field2234, this.field959.field1177, super.field2298, super.field2251, var14 == null ? var13 : var14, var15, -30, this.field959.field1153, this.field959.field1161, super.field2271, this.field959.field1203, arg0, this.field959.field1148);
                    var17.method90(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field2226);
                }
                class14 var18 = null;
                this.method925((byte) -35, var15);
                this.method923((byte) -103, var15, arg0);
                if (~super.field2230 != 0 && ~super.field2201 != 0) {
                    class21 var19 = class236.method1498((byte) -107, super.field2230);
                    var18 = var19.method139(super.field2272, (byte) -104, super.field2201, super.field2218);
                    if (var18 != null) {
                        var18.method93(0, -super.field2221, 0);
                        if (var19.field252) {
                            if (class23.field275 != 0) {
                                var18.method96(class23.field275);
                            }
                            if (class20.field233 != 0) {
                                var18.method91(class20.field233);
                            }
                            if (~class3.field41 != -1) {
                                var18.method93(0, class3.field41, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class29) var15).method178(var18);
                }
                if (~this.field959.field1148 == -2) {
                    var15.field178 = true;
                }
                var15.method90(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field2226);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)V")
    public static final void method410(int arg0, int arg1) {
        ++field957;
        int var2 = class128.field1922;
        int var3 = class213.field3184;
        int var4 = class47.field763;
        int var5 = class259.field3949;
        int var6 = (int) class83.field1327;
        int var7 = class272.field4088;
        if (var6 < class273.field4113 / 256) {
            var6 = class273.field4113 / 256;
        }
        if (class49.field789[4] && var6 < class264.field3991[4] - -128) {
            var6 = class264.field3991[4] - -128;
        }
        int var8 = (int) class84.field1336 + class234.field3534 & 2047;
        class46.method309(arg1, 103, class183.method1139(class99.field1557, class165.field2537.field2234, class165.field2537.field2251, (byte) 117) + -50, class124.field1879, var6, var6 * 3 + 600, var8, class295.field4678);
        if (~class128.field1922 == ~var2 && ~class213.field3184 == ~var3 && class47.field763 == var4 && ~class259.field3949 == ~var5 && class272.field4088 == var7) {
            class253.field3837 = 1;
        } else {
            class113.field1734 = 10;
            class23.field283 = 10;
            if (class128.field1922 > var2) {
                var2 += (-var2 + class128.field1922) * class113.field1734 / 1000 + class23.field283;
                if (class128.field1922 > var2) {
                    class128.field1922 = var2;
                }
            }
            if (arg0 != 2048) {
                method410(-92, 1);
            }
            if (~var4 > ~class47.field763) {
                var4 += (-var4 + class47.field763) * class113.field1734 / 1000 + class23.field283;
                if (~class47.field763 < ~var4) {
                    class47.field763 = var4;
                }
            }
            if (~class213.field3184 < ~var3) {
                var3 += (-var3 + class213.field3184) * class113.field1734 / 1000 + class23.field283;
                if (class213.field3184 > var3) {
                    class213.field3184 = var3;
                }
            }
            if (~var3 < ~class213.field3184) {
                int var9 = var3 - ((-class213.field3184 + var3) * class113.field1734 / 1000 + class23.field283);
                if (~class213.field3184 > ~var9) {
                    class213.field3184 = var9;
                }
            }
            if (class128.field1922 < var2) {
                int var10 = var2 - (class23.field283 - -((-class128.field1922 + var2) * class113.field1734 / 1000));
                if (var10 > class128.field1922) {
                    class128.field1922 = var10;
                }
            }
            class37.field510 = 10;
            if (var4 > class47.field763) {
                int var11 = var4 - ((-class47.field763 + var4) * class113.field1734 / 1000 + class23.field283);
                if (~var11 < ~class47.field763) {
                    class47.field763 = var11;
                }
            }
            class49.field785 = 10;
            if (class259.field3949 > var5) {
                var5 += (-var5 + class259.field3949) * class37.field510 / 1000 + class49.field785;
                if (class259.field3949 > var5) {
                    class259.field3949 = var5;
                }
            }
            int var12 = -var7 + class272.field4088;
            if (var12 > 1024) {
                var12 -= 2048;
            }
            if (var12 < -1024) {
                var12 += 2048;
            }
            if (~var5 < ~class259.field3949) {
                int var13 = var5 - ((-class259.field3949 + var5) * class37.field510 / 1000 + class49.field785);
                if (~class259.field3949 > ~var13) {
                    class259.field3949 = var13;
                }
            }
            if (var12 > 0) {
                int var14 = class37.field510 * var12 / 1000 + class49.field785 + var7;
                var7 = var14 & 2047;
            }
            if (var12 < 0) {
                int var15 = var7 - (-var12 * class37.field510 / 1000 + class49.field785);
                var7 = var15 & 2047;
            }
            int var16 = -var7 + class272.field4088;
            if (var16 > 1024) {
                var16 -= 2048;
            }
            if (var16 < -1024) {
                var16 += 2048;
            }
            if (var16 >= 0 || var12 <= 0 || ~var16 < -1 && var12 < 0) {
                class272.field4088 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(II)I")
    public static final int method411(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "(I)Lei;")
    public static final class175 method412(int arg0) {
        if (arg0 != 0) {
            method407(-122, true);
        }
        ++field958;
        return class39.field524;
    }

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "(I)V")
    public static void method413(int arg0) {
        field968 = null;
        field974 = null;
        if (arg0 >= -51) {
            method406(-102);
        }
        field971 = null;
    }

    @OriginalMember(owner = "client!vb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field956;
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)Z")
    public final boolean method414(int arg0) {
        ++field967;
        if (this.field959 == null) {
            return false;
        } else {
            if (arg0 != 1000) {
                field970 = 110;
            }
            return true;
        }
    }
}

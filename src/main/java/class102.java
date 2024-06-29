import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class102 extends class243 {

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!le", name = "cb", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!le", name = "db", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "Z")
    public static boolean field1793;

    @OriginalMember(owner = "client!le", name = "eb", descriptor = "[Lnf;")
    public static class213[] field1797;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "[[Lta;")
    public static class105[][] field1792;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II[BI)Lub;")
    public static final class227 method623(int arg0, int arg1, byte[] arg2, int arg3) {
        class227 var4 = new class227();
        ++field1794;
        var4.field3955 = new byte[arg3];
        var4.field3915 = 0;
        int var5 = arg0;
        if (arg1 != -1) {
            method623(26, -7, (byte[]) null, -80);
        }
        while (var5 < arg0 + arg3) {
            if (~arg2[var5] != -1) {
                var4.field3955[var4.field3915++] = arg2[var5];
            }
            ++var5;
        }
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(B)V")
    public static void method624(byte arg0) {
        int var1 = 108 % ((-11 - arg0) / 39);
        field1792 = null;
        field1797 = null;
    }

    @OriginalMember(owner = "client!le", name = "g", descriptor = "(I)V")
    public static final void method625(int arg0) {
        ++field1796;
        if (arg0 < 119) {
            method624((byte) -115);
        }
        if (~class239.field4166.toLowerCase().indexOf("microsoft") != 0) {
            class220.field3701[187] = 27;
            class220.field3701[190] = 72;
            class220.field3701[186] = 57;
            class220.field3701[188] = 71;
            class220.field3701[192] = 58;
            class220.field3701[219] = 42;
            class220.field3701[189] = 26;
            class220.field3701[220] = 74;
            class220.field3701[191] = 73;
            class220.field3701[222] = 59;
            class220.field3701[223] = 28;
            class220.field3701[221] = 43;
        } else {
            class220.field3701[47] = 73;
            if (class239.field4156 == null) {
                class220.field3701[192] = 58;
                class220.field3701[222] = 59;
            } else {
                class220.field3701[222] = 58;
                class220.field3701[192] = 28;
                class220.field3701[520] = 59;
            }
            class220.field3701[46] = 72;
            class220.field3701[93] = 43;
            class220.field3701[44] = 71;
            class220.field3701[61] = 27;
            class220.field3701[91] = 42;
            class220.field3701[45] = 26;
            class220.field3701[92] = 74;
            class220.field3701[59] = 57;
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(II)V")
    public static final void method626(int arg0, int arg1) {
        ++field1791;
        class257.field4502.method1727(true, arg0);
        if (arg1 != 20015) {
            method624((byte) 88);
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class102() {
        super(0, true);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field1795;
        int var3 = -56 / ((-15 - arg0) / 51);
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            class68.method425(var4, 0, class212.field3586, class148.field2582[arg1]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
    public static final void method627() {
        int var0 = client.field1438[class220.field3726];
        class116[] var1 = client.field1437[class220.field3726];
        class115.field2108 = 0;
        label191: for (int var2 = 0; var2 < var0; ++var2) {
            class116 var3 = var1[var2];
            if (class151.field2628 != null) {
                for (int var4 = 0; var4 < class151.field2628.length; ++var4) {
                    if (class151.field2628[var4] != -1000000 && (var3.field2121 <= class151.field2628[var4] || var3.field2141 <= class151.field2628[var4]) && (var3.field2125 <= class7.field151[var4] || var3.field2116 <= class7.field151[var4]) && (var3.field2125 >= class13.field245[var4] || var3.field2116 >= class13.field245[var4]) && (var3.field2115 <= class186.field3172[var4] || var3.field2123 <= class186.field3172[var4]) && (var3.field2115 >= class131.field2295[var4] || var3.field2123 >= class131.field2295[var4])) {
                        continue label191;
                    }
                }
            }
            if (var3.field2130 == 1) {
                int var5 = var3.field2139 - class72.field1265 + class229.field3990;
                if (var5 >= 0 && var5 <= class229.field3990 + class229.field3990) {
                    int var6 = var3.field2135 - class37.field619 + class229.field3990;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = var3.field2128 - class37.field619 + class229.field3990;
                    if (var7 > class229.field3990 + class229.field3990) {
                        var7 = class229.field3990 + class229.field3990;
                    }
                    boolean var8 = false;
                    while (var6 <= var7) {
                        if (class123.field2210[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        int var9 = class130.field2282 - var3.field2125;
                        if (var9 > 32) {
                            var3.field2138 = 1;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }
                            var3.field2138 = 2;
                            var9 = -var9;
                        }
                        var3.field2124 = (var3.field2115 - class203.field3471 << 8) / var9;
                        var3.field2119 = (var3.field2123 - class203.field3471 << 8) / var9;
                        var3.field2120 = (var3.field2121 - class173.field2885 << 8) / var9;
                        var3.field2136 = (var3.field2141 - class173.field2885 << 8) / var9;
                        class122.field2203[class115.field2108++] = var3;
                    }
                }
            } else if (var3.field2130 == 2) {
                int var10 = var3.field2135 - class37.field619 + class229.field3990;
                if (var10 >= 0 && var10 <= class229.field3990 + class229.field3990) {
                    int var11 = var3.field2139 - class72.field1265 + class229.field3990;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    int var12 = var3.field2126 - class72.field1265 + class229.field3990;
                    if (var12 > class229.field3990 + class229.field3990) {
                        var12 = class229.field3990 + class229.field3990;
                    }
                    boolean var13 = false;
                    while (var11 <= var12) {
                        if (class123.field2210[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        int var14 = class203.field3471 - var3.field2115;
                        if (var14 > 32) {
                            var3.field2138 = 3;
                        } else {
                            if (var14 >= -32) {
                                continue;
                            }
                            var3.field2138 = 4;
                            var14 = -var14;
                        }
                        var3.field2127 = (var3.field2125 - class130.field2282 << 8) / var14;
                        var3.field2118 = (var3.field2116 - class130.field2282 << 8) / var14;
                        var3.field2120 = (var3.field2121 - class173.field2885 << 8) / var14;
                        var3.field2136 = (var3.field2141 - class173.field2885 << 8) / var14;
                        class122.field2203[class115.field2108++] = var3;
                    }
                }
            } else if (var3.field2130 == 4) {
                int var15 = var3.field2121 - class173.field2885;
                if (var15 > 128) {
                    int var16 = var3.field2135 - class37.field619 + class229.field3990;
                    if (var16 < 0) {
                        var16 = 0;
                    }
                    int var17 = var3.field2128 - class37.field619 + class229.field3990;
                    if (var17 > class229.field3990 + class229.field3990) {
                        var17 = class229.field3990 + class229.field3990;
                    }
                    if (var16 <= var17) {
                        int var18 = var3.field2139 - class72.field1265 + class229.field3990;
                        if (var18 < 0) {
                            var18 = 0;
                        }
                        int var19 = var3.field2126 - class72.field1265 + class229.field3990;
                        if (var19 > class229.field3990 + class229.field3990) {
                            var19 = class229.field3990 + class229.field3990;
                        }
                        boolean var20 = false;
                        label163: for (int var21 = var18; var21 <= var19; ++var21) {
                            for (int var22 = var16; var22 <= var17; ++var22) {
                                if (class123.field2210[var21][var22]) {
                                    var20 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var20) {
                            var3.field2138 = 5;
                            var3.field2127 = (var3.field2125 - class130.field2282 << 8) / var15;
                            var3.field2118 = (var3.field2116 - class130.field2282 << 8) / var15;
                            var3.field2124 = (var3.field2115 - class203.field3471 << 8) / var15;
                            var3.field2119 = (var3.field2123 - class203.field3471 << 8) / var15;
                            class122.field2203[class115.field2108++] = var3;
                        }
                    }
                }
            }
        }
    }
}

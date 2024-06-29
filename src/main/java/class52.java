import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 extends class101 {

    @OriginalMember(owner = "client!hc", name = "Ib", descriptor = "I")
    private int field1262;

    @OriginalMember(owner = "client!hc", name = "Rb", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client!hc", name = "vb", descriptor = "I")
    private int field1249;

    @OriginalMember(owner = "client!hc", name = "Fb", descriptor = "I")
    private int field1259;

    @OriginalMember(owner = "client!hc", name = "Hb", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client!hc", name = "Eb", descriptor = "I")
    private int field1258;

    @OriginalMember(owner = "client!hc", name = "Pb", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client!hc", name = "Cb", descriptor = "Lnc;")
    private class93 field1256;

    @OriginalMember(owner = "client!hc", name = "Ab", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client!hc", name = "Db", descriptor = "I")
    private int field1257;

    @OriginalMember(owner = "client!hc", name = "sb", descriptor = "Laf;")
    public static class7 field1246 = class48.method406(40, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!hc", name = "rb", descriptor = "[I")
    public static int[] field1245 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!hc", name = "pb", descriptor = "Laf;")
    public static class7 field1243 = class48.method406(40, "");

    @OriginalMember(owner = "client!hc", name = "ob", descriptor = "Laf;")
    private static class7 field1242 = class48.method406(40, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!hc", name = "wb", descriptor = "Laf;")
    public static class7 field1250 = field1242;

    @OriginalMember(owner = "client!hc", name = "Bb", descriptor = "Laf;")
    public static class7 field1255 = class48.method406(40, ")4lang)4de");

    @OriginalMember(owner = "client!hc", name = "Ob", descriptor = "Laf;")
    public static class7 field1268 = field1243;

    @OriginalMember(owner = "client!hc", name = "Gb", descriptor = "Laf;")
    public static class7 field1260 = class48.method406(40, "null");

    @OriginalMember(owner = "client!hc", name = "Kb", descriptor = "Laf;")
    public static class7 field1264 = class48.method406(40, "<col=ff0000>");

    @OriginalMember(owner = "client!hc", name = "ub", descriptor = "Lgd;")
    public static class46 field1248 = new class46(30);

    @OriginalMember(owner = "client!hc", name = "qb", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!hc", name = "tb", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!hc", name = "yb", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!hc", name = "zb", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!hc", name = "Jb", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!hc", name = "Lb", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!hc", name = "Mb", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!hc", name = "Nb", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!hc", name = "Qb", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!hc", name = "xb", descriptor = "[[Lof;")
    public static class103[][] field1251;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)Leb;")
    public final class31 method190(int arg0) {
        field1252++;
        if (arg0 != 1) {
            field1243 = null;
        }
        if (this.field1256 != null) {
            int var2 = class155.field3611 - this.field1254;
            if (var2 > 100 && this.field1256.field2176 > 0) {
                var2 = 100;
            }
            label41: {
                do {
                    do {
                        if (this.field1256.field2169[this.field1257] >= var2) {
                            break label41;
                        }
                        var2 -= this.field1256.field2169[this.field1257];
                        this.field1257++;
                    } while (this.field1256.field2158.length > this.field1257);
                    this.field1257 -= this.field1256.field2176;
                } while (this.field1257 >= 0 && this.field1256.field2158.length > this.field1257);
                this.field1256 = null;
            }
            this.field1254 = class155.field3611 - var2;
        }
        class82 var3 = class155.method1214((byte) -110, this.field1271);
        if (var3.field1926 != null) {
            var3 = var3.method691(arg0 ^ 0xFFFFFF86);
        }
        return var3 == null ? null : var3.method688(arg0 ^ 0xFFFFFFCF, this.field1257, this.field1262, this.field1258, this.field1249, this.field1269, this.field1256, this.field1259, this.field1261);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILkb;)V")
    public static final void method425(int arg0, class71 arg1) {
        field1253++;
        if (arg0 > -115) {
            method427(null, null, -38, -65);
        }
        class94.field2203 = arg1;
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(B)V")
    public static void method426(byte arg0) {
        field1246 = null;
        field1255 = null;
        field1251 = null;
        field1248 = null;
        field1245 = null;
        field1268 = null;
        if (arg0 > -66) {
            method426((byte) 12);
        }
        field1250 = null;
        field1243 = null;
        field1264 = null;
        field1242 = null;
        field1260 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([BLsa;II)V")
    public static final void method427(byte[] arg0, class126 arg1, int arg2, int arg3) {
        class119 var4 = new class119();
        var4.field2824 = arg0;
        var4.field3261 = arg2;
        field1263++;
        var4.field2823 = arg1;
        var4.field2817 = 0;
        class94 var5 = class9.field240;
        synchronized (class9.field240) {
            if (arg3 <= 82) {
                method428(-13, 97, -116, (byte) -108, -14, 20);
            }
            class9.field240.method765(var4, 0);
        }
        class12.method129((byte) 127);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIBII)V")
    public static final void method428(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1270++;
        if (arg3 > -114) {
            field1268 = null;
        }
        int var6 = class47.field1151.method1036(arg5, arg1, arg2);
        if (var6 != 0) {
            int var7 = class47.field1151.method1008(arg5, arg1, arg2, var6);
            int var8 = var7 >> 6 & 0x3;
            int var9 = arg0;
            int var10 = var7 & 0x1F;
            int[] var11 = class9.field251.field989;
            if (var6 > 0) {
                var9 = arg4;
            }
            int var12 = (103 - arg2) * 512 * 4 + arg1 * 4 + 24624;
            int var13 = var6 >> 14 & 0x7FFF;
            class82 var14 = class155.method1214((byte) -68, var13);
            if (var14.field1880 == -1) {
                if (var10 == 0 || var10 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var9;
                        var11[var12 + 512] = var9;
                        var11[var12 + 1024] = var9;
                        var11[var12 + 1536] = var9;
                    } else if (var8 == 1) {
                        var11[var12] = var9;
                        var11[var12 + 1] = var9;
                        var11[var12 + 2] = var9;
                        var11[var12 + 3] = var9;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var9;
                        var11[var12 + 512 + 3] = var9;
                        var11[var12 + 1027] = var9;
                        var11[var12 + 1536 + 3] = var9;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var9;
                        var11[var12 + 1536 + 1] = var9;
                        var11[var12 + 1536 + 2] = var9;
                        var11[var12 + 1536 + 3] = var9;
                    }
                }
                if (var10 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var9;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var9;
                    } else if (var8 == 2) {
                        var11[var12 + 1539] = var9;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var9;
                    }
                }
                if (var10 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var9;
                        var11[var12 + 512] = var9;
                        var11[var12 + 1024] = var9;
                        var11[var12 + 1536] = var9;
                    } else if (var8 == 0) {
                        var11[var12] = var9;
                        var11[var12 + 1] = var9;
                        var11[var12 + 2] = var9;
                        var11[var12 + 3] = var9;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var9;
                        var11[var12 + 3 + 512] = var9;
                        var11[var12 + 3 + 1024] = var9;
                        var11[var12 + 3 + 1536] = var9;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var9;
                        var11[var12 + 1 + 1536] = var9;
                        var11[var12 + 1536 + 2] = var9;
                        var11[var12 + 1539] = var9;
                    }
                }
            } else {
                class114 var15 = class83.field1949[var14.field1880];
                if (var15 != null) {
                    int var16 = (var14.field1917 * 4 - var15.field2723) / 2;
                    int var17 = (var14.field1914 * 4 - var15.field2722) / 2;
                    var15.method896(arg1 * 4 + var16 + 48, (104 - (arg2 - -var14.field1914)) * 4 + var17 + 48);
                }
            }
        }
        int var18 = class47.field1151.method1009(arg5, arg1, arg2);
        if (var18 != 0) {
            int var19 = class47.field1151.method1008(arg5, arg1, arg2, var18);
            int var20 = var19 >> 6 & 0x3;
            int var21 = var19 & 0x1F;
            int var22 = var18 >> 14 & 0x7FFF;
            class82 var23 = class155.method1214((byte) -100, var22);
            if (var23.field1880 != -1) {
                class114 var24 = class83.field1949[var23.field1880];
                if (var24 != null) {
                    int var25 = (var23.field1917 * 4 - var24.field2723) / 2;
                    int var26 = (var23.field1914 * 4 - var24.field2722) / 2;
                    var24.method896(arg1 * 4 + var25 + 48, 48 - -((104 - var23.field1914 + -arg2) * 4) - -var26);
                }
            } else if (var21 == 9) {
                int var27 = arg1 * 4 + (-(arg2 * 512) + 52736) * 4 + 24624;
                int[] var28 = class9.field251.field989;
                int var29 = 15658734;
                if (var18 > 0) {
                    var29 = 15597568;
                }
                if (var20 == 0 || var20 == 2) {
                    var28[var27 + 1536] = var29;
                    var28[var27 + 1 + 1024] = var29;
                    var28[var27 + 512 + 2] = var29;
                    var28[var27 + 3] = var29;
                } else {
                    var28[var27] = var29;
                    var28[var27 + 512 + 1] = var29;
                    var28[var27 + 2 + 1024] = var29;
                    var28[var27 + 3 + 1536] = var29;
                }
            }
        }
        int var30 = class47.field1151.method1023(arg5, arg1, arg2);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class82 var32 = class155.method1214((byte) -77, var31);
        if (var32.field1880 == -1) {
            return;
        }
        class114 var33 = class83.field1949[var32.field1880];
        if (var33 != null) {
            int var34 = (var32.field1917 * 4 - var33.field2723) / 2;
            int var35 = (var32.field1914 * 4 - var33.field2722) / 2;
            var33.method896(var34 + arg1 * 4 + 48, (-arg2 + 104 - var32.field1914) * 4 + 48 + var35);
            return;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIIIIZLod;)V")
    public class52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class101 arg9) {
        this.field1262 = arg1;
        this.field1271 = arg0;
        this.field1249 = arg3;
        this.field1259 = arg6;
        this.field1261 = arg5;
        this.field1258 = arg4;
        this.field1269 = arg2;
        if (arg7 != -1) {
            this.field1256 = class87.method710(arg7, 6491);
            this.field1254 = class155.field3611 - 1;
            this.field1257 = 0;
            if (this.field1256.field2165 == 0 && arg9 != null && arg9 instanceof class52) {
                class52 var11 = (class52) arg9;
                if (this.field1256 == var11.field1256) {
                    this.field1254 = var11.field1254;
                    this.field1257 = var11.field1257;
                    return;
                }
            }
            if (arg8 && this.field1256.field2176 != -1) {
                this.field1257 = (int) ((double) this.field1256.field2158.length * Math.random());
                this.field1254 -= (int) ((double) this.field1256.field2169[this.field1257] * Math.random());
                return;
            }
        }
    }
}

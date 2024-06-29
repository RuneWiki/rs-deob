import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class47 {

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "Z")
    private boolean field156 = false;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "I")
    private int field151 = -1;

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "Z")
    private volatile boolean field153 = false;

    @OriginalMember(owner = "client!af", name = "db", descriptor = "Lnc;")
    private class92 field155;

    @OriginalMember(owner = "client!af", name = "gb", descriptor = "Lnc;")
    private class92 field158;

    @OriginalMember(owner = "client!af", name = "qb", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client!af", name = "rb", descriptor = "Lrd;")
    public static class117 field169 = class95.method812("::gc", (byte) 8);

    @OriginalMember(owner = "client!af", name = "jb", descriptor = "Z")
    public static boolean field161 = false;

    @OriginalMember(owner = "client!af", name = "wb", descriptor = "Lrd;")
    public static class117 field174 = class95.method812("und Ihr Passwort ein)3", (byte) 8);

    @OriginalMember(owner = "client!af", name = "vb", descriptor = "Lmb;")
    public static class85 field173 = new class85(64);

    @OriginalMember(owner = "client!af", name = "yb", descriptor = "Lrd;")
    public static class117 field176 = class95.method812(":chalreq:", (byte) 8);

    @OriginalMember(owner = "client!af", name = "Ab", descriptor = "Lrd;")
    private static class117 field178 = class95.method812("wave:", (byte) 8);

    @OriginalMember(owner = "client!af", name = "Bb", descriptor = "Lrd;")
    public static class117 field179 = field178;

    @OriginalMember(owner = "client!af", name = "zb", descriptor = "Lrd;")
    public static class117 field177 = field178;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!af", name = "fb", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!af", name = "ib", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!af", name = "kb", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client!af", name = "lb", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!af", name = "mb", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!af", name = "nb", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!af", name = "ob", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!af", name = "pb", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!af", name = "sb", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!af", name = "tb", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!af", name = "ub", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!af", name = "xb", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!af", name = "hb", descriptor = "[Z")
    private volatile boolean[] field159;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(II)I")
    private final int method46(int arg0, int arg1) {
        ++field165;
        if (arg1 != 100) {
            this.field168 = 86;
        }
        if (super.field1342[arg0] != null) {
            return 100;
        } else {
            return this.field159[arg0] ? 100 : class147.method1187(1, this.field168, arg0);
        }
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)I")
    public final int method47(int arg0) {
        ++field167;
        if (this.field153) {
            return 100;
        } else if (super.field1342 != null) {
            return 99;
        } else {
            int var2 = class147.method1187(1, 255, this.field168);
            if (var2 >= 100) {
                var2 = 99;
            }
            if (arg0 <= 121) {
                this.method47(80);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIB)V")
    public static final void method48(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field175;
        int var6 = class90.field2308.method355(arg2, arg0, arg1);
        if (~var6 != -1) {
            int var7 = class90.field2308.method363(arg2, arg0, arg1, var6);
            int var8 = (226 & var7) >> 6;
            int var9 = 31 & var7;
            int var10 = arg0 * 4 - -((-(arg1 * 512) + 52736) * 4) + 24624;
            int var11 = arg4;
            if (~var6 < -1) {
                var11 = arg3;
            }
            int[] var12 = class147.field3588.field2085;
            int var13 = (var6 & 536855581) >> 14;
            class62 var14 = class147.method1191((byte) 86, var13);
            if (~var14.field1775 == 0) {
                if (~var9 == -1 || var9 == 2) {
                    if (var8 != 0) {
                        if (var8 != 1) {
                            if (~var8 == -3) {
                                var12[var10 + 3] = var11;
                                var12[var10 + 512 + 3] = var11;
                                var12[var10 + 1024 + 3] = var11;
                                var12[var10 + 3 + 1536] = var11;
                            } else if (var8 == 3) {
                                var12[var10 - -1536] = var11;
                                var12[var10 + 1537] = var11;
                                var12[var10 + 2 - -1536] = var11;
                                var12[var10 - -3 + 1536] = var11;
                            }
                        } else {
                            var12[var10] = var11;
                            var12[var10 - -1] = var11;
                            var12[var10 + 2] = var11;
                            var12[var10 + 3] = var11;
                        }
                    } else {
                        var12[var10] = var11;
                        var12[var10 + 512] = var11;
                        var12[var10 + 1024] = var11;
                        var12[var10 + 1536] = var11;
                    }
                }
                if (~var9 == -4) {
                    if (~var8 != -1) {
                        if (~var8 != -2) {
                            if (~var8 != -3) {
                                if (var8 == 3) {
                                    var12[var10 + 1536] = var11;
                                }
                            } else {
                                var12[var10 + 3 + 1536] = var11;
                            }
                        } else {
                            var12[var10 + 3] = var11;
                        }
                    } else {
                        var12[var10] = var11;
                    }
                }
                if (~var9 == -3) {
                    if (~var8 != -4) {
                        if (var8 == 0) {
                            var12[var10] = var11;
                            var12[var10 + 1] = var11;
                            var12[var10 - -2] = var11;
                            var12[var10 - -3] = var11;
                        } else if (var8 == 1) {
                            var12[var10 + 3] = var11;
                            var12[var10 + 515] = var11;
                            var12[var10 + 1027] = var11;
                            var12[var10 - -1536 + 3] = var11;
                        } else if (var8 == 2) {
                            var12[var10 - -1536] = var11;
                            var12[var10 + 1 - -1536] = var11;
                            var12[var10 + 1538] = var11;
                            var12[var10 + 1536 + 3] = var11;
                        }
                    } else {
                        var12[var10] = var11;
                        var12[var10 - -512] = var11;
                        var12[var10 - -1024] = var11;
                        var12[var10 + 1536] = var11;
                    }
                }
            } else {
                class114 var15 = class79.field2113[var14.field1775];
                if (var15 != null) {
                    int var16 = (var14.field1737 * 4 + -var15.field2800) / 2;
                    int var17 = (var14.field1750 * 4 + -var15.field2798) / 2;
                    var15.method929(arg0 * 4 + 48 - -var16, (-var14.field1750 + -arg1 + 104) * 4 + 48 + var17);
                }
            }
        }
        if (arg5 > 81) {
            int var18 = class90.field2308.method356(arg2, arg0, arg1);
            if (var18 != 0) {
                int var19 = class90.field2308.method363(arg2, arg0, arg1, var18);
                int var20 = (199 & var19) >> 6;
                int var21 = 31 & var19;
                int var22 = 32767 & var18 >> 14;
                class62 var23 = class147.method1191((byte) 121, var22);
                if (~var23.field1775 == 0) {
                    if (var21 == 9) {
                        int var24 = 15658734;
                        int[] var25 = class147.field3588.field2085;
                        if (var18 > 0) {
                            var24 = 15597568;
                        }
                        int var26 = arg0 * 4 + (24624 - -((103 - arg1) * 2048));
                        if (var20 != 0 && ~var20 != -3) {
                            var25[var26] = var24;
                            var25[var26 + 513] = var24;
                            var25[var26 - -1024 + 2] = var24;
                            var25[var26 + 1536 + 3] = var24;
                        } else {
                            var25[var26 + 1536] = var24;
                            var25[var26 - -1 + 1024] = var24;
                            var25[var26 - -512 - -2] = var24;
                            var25[var26 - -3] = var24;
                        }
                    }
                } else {
                    class114 var27 = class79.field2113[var23.field1775];
                    if (var27 != null) {
                        int var28 = (var23.field1737 * 4 - var27.field2800) / 2;
                        int var29 = (var23.field1750 * 4 + -var27.field2798) / 2;
                        var27.method929(arg0 * 4 + var28 + 48, (104 - arg1 + -var23.field1750) * 4 + 48 + var29);
                    }
                }
            }
            int var30 = class90.field2308.method360(arg2, arg0, arg1);
            if (var30 != 0) {
                int var31 = (var30 & 536865602) >> 14;
                class62 var32 = class147.method1191((byte) 94, var31);
                if (~var32.field1775 != 0) {
                    class114 var33 = class79.field2113[var32.field1775];
                    if (var33 != null) {
                        int var34 = (var32.field1750 * 4 + -var33.field2798) / 2;
                        int var35 = (var32.field1737 * 4 + -var33.field2800) / 2;
                        var33.method929(arg0 * 4 + 48 + var35, (-arg1 + 104 + -var32.field1750) * 4 + 48 + var34);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
    public static void method49(int arg0) {
        field177 = null;
        field178 = null;
        field179 = null;
        if (arg0 == -3) {
            field174 = null;
            field176 = null;
            field173 = null;
            field169 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static final void method50(byte arg0) {
        ++field154;
        if (arg0 != 127) {
            method49(-93);
        }
        class128.field3057.method766(arg0 ^ 122);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BZ[BIZ)V")
    public final void method51(byte arg0, boolean arg1, byte[] arg2, int arg3, boolean arg4) {
        ++field170;
        if (!arg1) {
            arg2[arg2.length + -2] = (byte) (super.field1323[arg3] >> 8);
            arg2[arg2.length + -1] = (byte) super.field1323[arg3];
            if (this.field158 != null) {
                class148.method1202(arg2, arg3, this.field158, -21271);
                this.field159[arg3] = true;
            }
            if (arg4) {
                super.field1342[arg3] = class118.method979(false, arg2, 2);
            }
        } else {
            if (this.field153) {
                throw new RuntimeException();
            }
            if (this.field155 != null) {
                class148.method1202(arg2, this.field168, this.field155, -21271);
            }
            this.method532(100, arg2);
            this.method52(2);
        }
        int var6 = -4 / ((71 - arg0) / 55);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lnc;Lnc;IZZZ)V")
    public class7(class92 arg0, class92 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field155 = arg1;
        this.field158 = arg0;
        this.field168 = arg2;
        this.field156 = arg5;
        class95.method816(this.field168, this, false);
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
    private final void method52(int arg0) {
        this.field159 = new boolean[super.field1342.length];
        if (arg0 == 2) {
            ++field163;
            for (int var2 = 0; ~var2 > ~this.field159.length; ++var2) {
                this.field159[var2] = false;
            }
            if (this.field158 == null) {
                this.field153 = true;
            } else {
                this.field151 = -1;
                for (int var3 = 0; var3 < this.field159.length; ++var3) {
                    if (~super.field1362[var3] < -1) {
                        class64.method645(this, var3, this.field158, -100);
                        this.field151 = var3;
                    }
                }
                if (this.field151 == -1) {
                    this.field153 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)V")
    public final void method53(byte arg0, int arg1) {
        int var3 = -92 % ((arg0 - -53) / 53);
        if (this.field158 != null && this.field159 != null && this.field159[arg1]) {
            class35.method441(arg1, 127, this.field158, this);
        } else {
            class45.method491(super.field1335[arg1], -700420656, (byte) 2, this, arg1, true, this.field168);
        }
        ++field166;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(II)V")
    public final void method54(int arg0, int arg1) {
        this.field162 = arg1;
        if (this.field155 == null) {
            class45.method491(this.field162, -700420656, (byte) 0, this, this.field168, true, 255);
        } else {
            class35.method441(this.field168, 124, this.field155, this);
        }
        if (arg0 != 1536) {
            this.field153 = true;
        }
        ++field152;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLnc;B[BI)V")
    public final void method55(boolean arg0, class92 arg1, byte arg2, byte[] arg3, int arg4) {
        if (arg2 != 2) {
            this.method54(-113, 44);
        }
        ++field172;
        if (this.field155 != arg1) {
            if (!arg0 && this.field151 == arg4) {
                this.field153 = true;
            }
            if (arg3 == null || ~arg3.length >= -3) {
                this.field159[arg4] = false;
                if (this.field156 || arg0) {
                    class45.method491(super.field1335[arg4], -700420656, (byte) 2, this, arg4, arg0, this.field168);
                }
                return;
            }
            class63.field1795.reset();
            class63.field1795.update(arg3, 0, arg3.length + -2);
            int var6 = (int) class63.field1795.getValue();
            int var7 = (65280 & arg3[arg3.length + -2] << 8) + (255 & arg3[arg3.length + -1]);
            if (super.field1335[arg4] != var6 || super.field1323[arg4] != var7) {
                this.field159[arg4] = false;
                if (this.field156 || arg0) {
                    class45.method491(super.field1335[arg4], -700420656, (byte) 2, this, arg4, arg0, this.field168);
                }
                return;
            }
            this.field159[arg4] = true;
            if (arg0) {
                super.field1342[arg4] = class118.method979(false, arg3, 2);
                return;
            }
        } else {
            if (this.field153) {
                throw new RuntimeException();
            }
            if (arg3 == null) {
                class45.method491(this.field162, -700420656, (byte) 0, this, this.field168, true, 255);
                return;
            }
            class63.field1795.reset();
            class63.field1795.update(arg3, 0, arg3.length);
            int var8 = (int) class63.field1795.getValue();
            if (this.field162 != var8) {
                class45.method491(this.field162, -700420656, (byte) 0, this, this.field168, true, 255);
                return;
            }
            this.method532(100, arg3);
            this.method52(arg2);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
    public final void method56(int arg0, int arg1) {
        if (arg1 <= 104) {
            method48(-103, -74, -94, 8, 29, (byte) 106);
        }
        ++field164;
        class121.method990(arg0, this.field168, -453991120);
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)I")
    public final int method57(byte arg0) {
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; ~var4 > ~super.field1342.length; ++var4) {
            if (~super.field1362[var4] < -1) {
                var2 += 100;
                var3 += this.method46(var4, 100);
            }
        }
        ++field171;
        if (var2 == 0) {
            return 100;
        } else {
            if (arg0 != 104) {
                this.field168 = 68;
            }
            return var3 * 100 / var2;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class50 extends class64 {

    @OriginalMember(owner = "client!ha", name = "ob", descriptor = "Z")
    private boolean field1036 = false;

    @OriginalMember(owner = "client!ha", name = "zb", descriptor = "I")
    private int field1047 = -1;

    @OriginalMember(owner = "client!ha", name = "Cb", descriptor = "Z")
    private volatile boolean field1050 = false;

    @OriginalMember(owner = "client!ha", name = "Bb", descriptor = "Lca;")
    private class16 field1049;

    @OriginalMember(owner = "client!ha", name = "Jb", descriptor = "Lca;")
    private class16 field1057;

    @OriginalMember(owner = "client!ha", name = "vb", descriptor = "I")
    private int field1043;

    @OriginalMember(owner = "client!ha", name = "yb", descriptor = "Lqf;")
    private static class117 field1046 = class72.method514(102, "Your account has been disabled)3");

    @OriginalMember(owner = "client!ha", name = "Ib", descriptor = "Lqf;")
    public static class117 field1056 = field1046;

    @OriginalMember(owner = "client!ha", name = "Mb", descriptor = "Lqf;")
    public static class117 field1060 = class72.method514(117, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ha", name = "Ob", descriptor = "Lqf;")
    public static class117 field1062 = class72.method514(112, "<col=ff7000>");

    @OriginalMember(owner = "client!ha", name = "xb", descriptor = "Leb;")
    public static class31 field1045 = new class31(50);

    @OriginalMember(owner = "client!ha", name = "Pb", descriptor = "[I")
    public static int[] field1063 = new int[200];

    @OriginalMember(owner = "client!ha", name = "Qb", descriptor = "Lqf;")
    public static class117 field1064 = class72.method514(122, ")1");

    @OriginalMember(owner = "client!ha", name = "pb", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ha", name = "rb", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ha", name = "tb", descriptor = "I")
    private int field1041;

    @OriginalMember(owner = "client!ha", name = "ub", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ha", name = "wb", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!ha", name = "Ab", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!ha", name = "Db", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!ha", name = "Eb", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!ha", name = "Fb", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ha", name = "Gb", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ha", name = "Hb", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ha", name = "Kb", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ha", name = "Lb", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "client!ha", name = "Nb", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!ha", name = "sb", descriptor = "Lha;")
    public static class50 field1040;

    @OriginalMember(owner = "client!ha", name = "qb", descriptor = "[Z")
    private volatile boolean[] field1038;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IB)V")
    public final void method366(int arg0, byte arg1) {
        if (arg1 < -70) {
            class148.method1184(this.field1043, arg0, 2082253232);
            ++field1039;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lca;ZZ[BI)V")
    public final void method367(class16 arg0, boolean arg1, boolean arg2, byte[] arg3, int arg4) {
        ++field1054;
        if (this.field1049 == arg0) {
            if (this.field1050) {
                throw new RuntimeException();
            }
            if (arg3 == null) {
                class81.method632(this.field1043, true, this.field1059, (byte) 0, 18058, this, 255);
                return;
            }
            class26.field515.reset();
            class26.field515.update(arg3, 0, arg3.length);
            int var6 = (int) class26.field515.getValue();
            if (this.field1059 != var6 || super.field1324 != this.field1041) {
                class81.method632(this.field1043, true, this.field1059, (byte) 0, 18058, this, 255);
                return;
            }
            this.method444(arg3, !arg1);
            this.method369((byte) -122);
        } else {
            if (!arg2 && this.field1047 == arg4) {
                this.field1050 = true;
            }
            if (arg3 == null || arg3.length <= 2) {
                this.field1038[arg4] = false;
                if (this.field1036 || arg2) {
                    class81.method632(arg4, arg2, super.field1297[arg4], (byte) 2, 18058, this, this.field1043);
                }
                return;
            }
            class26.field515.reset();
            class26.field515.update(arg3, 0, arg3.length + -2);
            int var7 = (int) class26.field515.getValue();
            int var8 = ((arg3[arg3.length - 2] & 255) << 8) + (255 & arg3[arg3.length - 1]);
            if (super.field1297[arg4] != var7 || super.field1277[arg4] != var8) {
                this.field1038[arg4] = false;
                if (this.field1036 || arg2) {
                    class81.method632(arg4, arg2, super.field1297[arg4], (byte) 2, 18058, this, this.field1043);
                }
                return;
            }
            this.field1038[arg4] = true;
            if (arg2) {
                super.field1325[arg4] = class152.method1215(arg3, false, (byte) -67);
            }
        }
        if (!arg1) {
            this.field1038 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lca;Lca;IZZZ)V")
    public class50(class16 arg0, class16 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1049 = arg1;
        this.field1036 = arg5;
        this.field1057 = arg0;
        this.field1043 = arg2;
        class19.method154((byte) -23, this.field1043, this);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)I")
    public final int method368(boolean arg0) {
        int var2 = 0;
        ++field1055;
        int var3 = 0;
        if (arg0) {
            field1060 = null;
        }
        for (int var4 = 0; ~var4 > ~super.field1325.length; ++var4) {
            if (~super.field1284[var4] < -1) {
                var3 += this.method370((byte) 60, var4);
                var2 += 100;
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V")
    private final void method369(byte arg0) {
        this.field1038 = new boolean[super.field1325.length];
        ++field1053;
        for (int var2 = 0; ~this.field1038.length < ~var2; ++var2) {
            this.field1038[var2] = false;
        }
        if (arg0 > -117) {
            method376(67, (byte) 111);
        }
        if (this.field1057 == null) {
            this.field1050 = true;
        } else {
            this.field1047 = -1;
            for (int var3 = 0; ~this.field1038.length < ~var3; ++var3) {
                if (super.field1284[var3] > 0) {
                    class125.method989(this, 1, var3, this.field1057);
                    this.field1047 = var3;
                }
            }
            if (this.field1047 == -1) {
                this.field1050 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(BI)I")
    private final int method370(byte arg0, int arg1) {
        ++field1037;
        if (super.field1325[arg1] != null) {
            return 100;
        } else if (this.field1038[arg1]) {
            return 100;
        } else {
            int var3 = -127 % ((-59 - arg0) / 56);
            return class65.method466(this.field1043, arg1, -122);
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
    public static final void method371(int arg0) {
        ++field1061;
        if (~class45.field898 != -1) {
            class46 var1 = class25.field501;
            int var2 = 0;
            if (class16.field245 != 0) {
                var2 = 1;
            }
            int var3 = 0;
            if (arg0 < 111) {
                method374(125);
            }
            while (~var3 > -101) {
                if (class148.field3656[var3] != null) {
                    int var4 = class70.field1486[var3];
                    class117 var5 = class119.field2852[var3];
                    byte var6 = 0;
                    if (var5 != null && var5.method932(class53.field1105, -123)) {
                        var6 = 1;
                        var5 = var5.method908(5, (byte) 120);
                    }
                    if (var5 != null && var5.method932(class124.field2921, -73)) {
                        var6 = 2;
                        var5 = var5.method908(5, (byte) 120);
                    }
                    if ((~var4 == -4 || var4 == 7) && (~var4 == -8 || class70.field1475 == 0 || ~class70.field1475 == -2 && class81.method637(true, var5))) {
                        int var7 = -(var2 * 13) + 329;
                        ++var2;
                        byte var8 = 4;
                        var1.method330(class69.field1451, var8, var7 + -1, 65535, 0);
                        int var9 = var8 + var1.method331(class69.field1451);
                        int var10 = var9 + var1.method333(32);
                        if (var6 == 1) {
                            class117.field2825[0].method951(var10, var7 - 12);
                            var10 += 14;
                        }
                        if (var6 == 2) {
                            class117.field2825[1].method951(var10, var7 - 12);
                            var10 += 14;
                        }
                        var1.method330(class73.method530((byte) -83, new class117[] { var5, class13.field194, class148.field3656[var3] }), var10, var7 - 1, 65535, 0);
                        if (~var2 <= -6) {
                            return;
                        }
                    }
                    if (~var4 == -6 && class70.field1475 < 2) {
                        int var11 = 329 - var2 * 13;
                        var1.method330(class148.field3656[var3], 4, var11 + -1, 65535, 0);
                        ++var2;
                        if (~var2 <= -6) {
                            return;
                        }
                    }
                    if (~var4 == -7 && class70.field1475 < 2) {
                        int var12 = -(var2 * 13) + 329;
                        var1.method330(class73.method530((byte) -83, new class117[] { class150.field3733, class36.field780, var5, class13.field194, class148.field3656[var3] }), 4, var12 + -1, 65535, 0);
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)I")
    public final int method372(int arg0) {
        ++field1048;
        if (this.field1050) {
            return 100;
        } else if (super.field1325 != null) {
            return 99;
        } else if (arg0 >= -52) {
            return -11;
        } else {
            int var2 = class65.method466(255, this.field1043, -63);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IB)V")
    public final void method373(int arg0, byte arg1) {
        ++field1058;
        if (arg1 != 91) {
            field1045 = null;
        }
        if (this.field1057 != null && this.field1038 != null && this.field1038[arg0]) {
            class152.method1209(this.field1057, arg0, this, (byte) -80);
        } else {
            class81.method632(arg0, true, super.field1297[arg0], (byte) 2, 18058, this, this.field1043);
        }
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public static void method374(int arg0) {
        field1045 = null;
        field1064 = null;
        field1056 = null;
        field1062 = null;
        field1063 = null;
        if (arg0 != -15075) {
            method371(-14);
        }
        field1046 = null;
        field1040 = null;
        field1060 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLmf;)V")
    public static final void method375(boolean arg0, class89 arg1) {
        ++field1044;
        int var2 = arg1.field2125 >> 16;
        if (!arg0) {
            if (~class95.field2288 == ~var2 || class152.field3738 == var2) {
                class87.field1993 = true;
            }
            if (~class140.field3343 == ~var2 || class27.field529[class64.field1281] == var2) {
                class139.field3310 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IB)Lff;")
    public static final class42 method376(int arg0, byte arg1) {
        ++field1052;
        class42 var2 = (class42) class133.field3150.method247(0, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class107.field2545.method458(false, arg0, 14);
            class42 var4 = new class42();
            if (var3 != null) {
                var4.method291((byte) -65, new class77(var3));
            }
            class133.field3150.method248((long) arg0, (byte) -107, var4);
            return arg1 > -26 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z[BZII)V")
    public final void method377(boolean arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        if (arg4 < 12) {
            this.method369((byte) 125);
        }
        ++field1042;
        if (arg0) {
            if (this.field1050) {
                throw new RuntimeException();
            } else {
                if (this.field1049 != null) {
                    class143.method1150(0, arg1, this.field1049, this.field1043);
                }
                this.method444(arg1, false);
                this.method369((byte) -121);
            }
        } else {
            arg1[arg1.length + -2] = (byte) (super.field1277[arg3] >> 8);
            arg1[arg1.length - 1] = (byte) super.field1277[arg3];
            if (this.field1057 != null) {
                class143.method1150(0, arg1, this.field1057, arg3);
                this.field1038[arg3] = true;
            }
            if (arg2) {
                super.field1325[arg3] = class152.method1215(arg1, false, (byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(III)V")
    public final void method378(int arg0, int arg1, int arg2) {
        ++field1051;
        this.field1041 = arg1;
        if (arg0 > -79) {
            this.method378(-116, 116, 49);
        }
        this.field1059 = arg2;
        if (this.field1049 != null) {
            class152.method1209(this.field1049, this.field1043, this, (byte) -92);
        } else {
            class81.method632(this.field1043, true, this.field1059, (byte) 0, 18058, this, 255);
        }
    }
}

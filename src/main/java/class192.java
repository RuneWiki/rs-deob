import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class192 extends class133 {

    @OriginalMember(owner = "client!ud", name = "ib", descriptor = "Z")
    private boolean field3740 = false;

    @OriginalMember(owner = "client!ud", name = "fb", descriptor = "I")
    private int field3737 = -1;

    @OriginalMember(owner = "client!ud", name = "rb", descriptor = "Z")
    private volatile boolean field3749 = false;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "Lla;")
    private class108 field3729;

    @OriginalMember(owner = "client!ud", name = "kb", descriptor = "I")
    private int field3742;

    @OriginalMember(owner = "client!ud", name = "jb", descriptor = "Lla;")
    private class108 field3741;

    @OriginalMember(owner = "client!ud", name = "eb", descriptor = "Ljd;")
    public static class92 field3736 = class202.method1325((byte) 90, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!ud", name = "ob", descriptor = "Ljd;")
    public static class92 field3746 = class202.method1325((byte) 90, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!ud", name = "sb", descriptor = "Ljd;")
    private static class92 field3750 = class202.method1325((byte) 90, "flash2:");

    @OriginalMember(owner = "client!ud", name = "mb", descriptor = "Ljd;")
    public static class92 field3744 = field3750;

    @OriginalMember(owner = "client!ud", name = "lb", descriptor = "Ljd;")
    public static class92 field3743 = field3750;

    @OriginalMember(owner = "client!ud", name = "tb", descriptor = "Ljd;")
    private static class92 field3751 = class202.method1325((byte) 90, "Welcome to RuneScape");

    @OriginalMember(owner = "client!ud", name = "gb", descriptor = "Ljd;")
    public static class92 field3738 = field3751;

    @OriginalMember(owner = "client!ud", name = "yb", descriptor = "I")
    public static int field3756 = 0;

    @OriginalMember(owner = "client!ud", name = "Ab", descriptor = "Ljd;")
    private static class92 field3758 = class202.method1325((byte) 90, "Members object");

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "Ljd;")
    public static class92 field3734 = field3758;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!ud", name = "hb", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!ud", name = "pb", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!ud", name = "qb", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!ud", name = "ub", descriptor = "I")
    private int field3752;

    @OriginalMember(owner = "client!ud", name = "vb", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!ud", name = "wb", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!ud", name = "xb", descriptor = "I")
    private int field3755;

    @OriginalMember(owner = "client!ud", name = "zb", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!ud", name = "Bb", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ud", name = "nb", descriptor = "[Z")
    private volatile boolean[] field3745;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(II)I")
    public final int method892(int arg0, int arg1) {
        ++field3757;
        if (!this.method891(arg1, arg0 ^ 5877)) {
            return 0;
        } else if (super.field2652[arg1] != null) {
            return 100;
        } else if (this.field3745[arg1]) {
            return 100;
        } else {
            return arg0 != -11430 ? -19 : class166.method1084(this.field3742, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lla;Lla;IZZZ)V")
    public class192(class108 arg0, class108 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3729 = arg1;
        this.field3742 = arg2;
        this.field3741 = arg0;
        this.field3740 = arg5;
        class93.method652(this, -24780, this.field3742);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    private final void method1265(int arg0) {
        if (arg0 != 29637) {
            field3738 = null;
        }
        ++field3747;
        this.field3745 = new boolean[super.field2652.length];
        for (int var2 = 0; this.field3745.length > var2; ++var2) {
            this.field3745[var2] = false;
        }
        if (this.field3741 == null) {
            this.field3749 = true;
        } else {
            this.field3737 = -1;
            for (int var3 = 0; ~this.field3745.length < ~var3; ++var3) {
                if (~super.field2686[var3] < -1) {
                    class153.method976(this.field3741, var3, this, (byte) -119);
                    this.field3737 = var3;
                }
            }
            if (~this.field3737 == 0) {
                this.field3749 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(Ljd;I)V")
    public static final void method1266(class92 arg0, int arg1) {
        ++field3753;
        if (class140.field2817.field3312 != null) {
            try {
                int var2 = 49 / ((arg1 - -67) / 47);
                class92 var3 = class140.field2808.method645(true, class140.field2817.field3312);
                class92 var4 = class168.field3290.method645(true, class140.field2817.field3312);
                class92 var5 = class77.method529(-3, new class92[] { var3, class59.field1232, arg0, class46.field1011, var4 });
                class92 var6;
                if (arg0.method640(true) != 0) {
                    var6 = class77.method529(-3, new class92[] { var5, class186.field3521, class189.method1218(94608000000L + class168.method1118(1), -69), class80.field1625, class113.method764(94608000L, (byte) 119) });
                } else {
                    var6 = class77.method529(-3, new class92[] { var5, class33.field743 });
                }
                class77.method529(-3, new class92[] { class84.field1688, var6, class172.field3340 }).method628(class140.field2817.field3312, (byte) 60);
            } catch (Throwable var7) {
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)I")
    public final int method1267(int arg0) {
        ++field3748;
        if (this.field3749) {
            return 100;
        } else if (super.field2652 != null) {
            return 99;
        } else {
            if (arg0 != 1) {
                this.method1267(119);
            }
            int var2 = class166.method1084(255, arg0 + -1, this.field3742);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZZ[BZ)V")
    public final void method1268(int arg0, boolean arg1, boolean arg2, byte[] arg3, boolean arg4) {
        ++field3732;
        if (arg4) {
            if (this.field3749) {
                throw new RuntimeException();
            }
            if (this.field3729 != null) {
                class205.method1339(arg3, this.field3729, this.field3742, 0);
            }
            this.method896(arg3, (byte) 61);
            this.method1265(29637);
        } else {
            arg3[arg3.length + -2] = (byte) (super.field2665[arg0] >> 8);
            arg3[arg3.length + -1] = (byte) super.field2665[arg0];
            if (this.field3741 != null) {
                class205.method1339(arg3, this.field3741, arg0, 0);
                this.field3745[arg0] = true;
            }
            if (arg1) {
                super.field2652[arg0] = class68.method402(arg3, false, 8);
            }
        }
        if (!arg2) {
            field3738 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIZ)Lrf;")
    public static final class167 method1269(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3733;
        long var6 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg4 << 16) + (long) arg1;
        if (!arg5) {
            class167 var8 = (class167) class65.field1330.method930(-82, var6);
            if (var8 != null) {
                return var8;
            }
        }
        class107 var9 = class92.method626((byte) 59, arg1);
        if (arg4 > 1 && var9.field2170 != null) {
            int var10 = -1;
            for (int var11 = 0; ~var11 > -11; ++var11) {
                if (~arg4 <= ~var9.field2193[var11] && ~var9.field2193[var11] != -1) {
                    var10 = var9.field2170[var11];
                }
            }
            if (var10 != -1) {
                var9 = class92.method626((byte) 59, var10);
            }
        }
        class191 var12 = var9.method736(arg0 + -1498835049);
        if (var12 == null) {
            return null;
        } else {
            class167 var13 = null;
            if (~var9.field2181 != 0) {
                var13 = method1269(1498852336, var9.field2182, 1, 0, 10, true);
                if (var13 == null) {
                    return null;
                }
            }
            int var14 = class163.field3193;
            int var15 = class163.field3189;
            int[] var16 = new int[4];
            if (arg0 != 1498852336) {
                return null;
            } else {
                int[] var17 = class163.field3192;
                class163.method1046(var16);
                class167 var18 = new class167(36, 32);
                class163.method1044(var18.field3281, 36, 32);
                class163.method1047();
                class194.method1286();
                class194.method1295(16, 16);
                class194.field3801 = false;
                int var19 = var9.field2214;
                if (arg5) {
                    var19 = (int) ((double) var19 * 1.5D);
                } else if (arg2 == 2) {
                    var19 = (int) ((double) var19 * 1.04D);
                }
                int var20 = class194.field3803[var9.field2205] * var19 >> 16;
                int var21 = class194.field3787[var9.field2205] * var19 >> 16;
                var12.method236();
                var12.method252(0, var9.field2203, var9.field2177, var9.field2205, var9.field2219, -(var12.field3511 / 2) + var21 - -var9.field2194, var9.field2194 + var20);
                if (~arg2 <= -2) {
                    var18.method1106(1);
                }
                if (~arg2 <= -3) {
                    var18.method1106(16777215);
                }
                if (~arg3 != -1) {
                    var18.method1087(arg3);
                }
                class163.method1044(var18.field3281, 36, 32);
                if (var9.field2181 != -1) {
                    var13.method1097(0, 0);
                }
                if (!arg5 && (~var9.field2185 == -2 || arg4 != 1) && arg4 != -1) {
                    class25.field579.method987(class34.method219((byte) -40, arg4), 0, 9, 16776960, 1);
                }
                if (!arg5) {
                    class65.field1330.method927(24744, var18, var6);
                }
                class163.method1044(var17, var14, var15);
                class163.method1041(var16);
                class194.method1286();
                class194.field3801 = true;
                return var18;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(II)V")
    public final void method887(int arg0, int arg1) {
        if (arg0 != -13582) {
            this.field3729 = null;
        }
        ++field3730;
        if (this.method891(arg1, arg0 ^ 3933)) {
            if (this.field3741 != null && this.field3745 != null && this.field3745[arg1]) {
                class204.method1330(this.field3741, arg0 + 13582, arg1, this);
            } else {
                class139.method928(arg1, 25213, super.field2690[arg1], (byte) 2, this, this.field3742, true);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z[BBILla;)V")
    public final void method1270(boolean arg0, byte[] arg1, byte arg2, int arg3, class108 arg4) {
        ++field3759;
        if (arg2 != 0) {
            field3738 = null;
        }
        if (this.field3729 != arg4) {
            if (!arg0 && ~this.field3737 == ~arg3) {
                this.field3749 = true;
            }
            if (arg1 == null || ~arg1.length >= -3) {
                this.field3745[arg3] = false;
                if (this.field3740 || arg0) {
                    class139.method928(arg3, 25213, super.field2690[arg3], (byte) 2, this, this.field3742, arg0);
                }
                return;
            }
            class102.field2089.reset();
            class102.field2089.update(arg1, 0, arg1.length - 2);
            int var6 = (int) class102.field2089.getValue();
            int var7 = ((255 & arg1[arg1.length + -2]) << 8) - -(255 & arg1[arg1.length - 1]);
            if (~super.field2690[arg3] != ~var6 || ~super.field2665[arg3] != ~var7) {
                this.field3745[arg3] = false;
                if (this.field3740 || arg0) {
                    class139.method928(arg3, arg2 + 25213, super.field2690[arg3], (byte) 2, this, this.field3742, arg0);
                }
                return;
            }
            this.field3745[arg3] = true;
            if (arg0) {
                super.field2652[arg3] = class68.method402(arg1, false, 8);
                return;
            }
        } else {
            if (this.field3749) {
                throw new RuntimeException();
            }
            if (arg1 == null) {
                class139.method928(this.field3742, arg2 ^ 25213, this.field3752, (byte) 0, this, 255, true);
                return;
            }
            class102.field2089.reset();
            class102.field2089.update(arg1, 0, arg1.length);
            int var8 = (int) class102.field2089.getValue();
            if (~this.field3752 != ~var8) {
                class139.method928(this.field3742, 25213, this.field3752, (byte) 0, this, 255, true);
                return;
            }
            class70 var9;
            try {
                var9 = new class70(class180.method1183((byte) -118, arg1));
            } catch (RuntimeException var12) {
                class139.method928(this.field3742, 25213, this.field3752, (byte) 0, this, 255, true);
                return;
            }
            int var10 = var9.method443(255);
            if (var10 != 5 && ~var10 != -7) {
                class139.method928(this.field3742, 25213, this.field3752, (byte) 0, this, 255, true);
                return;
            }
            int var11 = 0;
            if (var10 >= 6) {
                var11 = var9.method453(66);
            }
            if (~this.field3755 != ~var11) {
                class139.method928(this.field3742, 25213, this.field3752, (byte) 0, this, 255, true);
                return;
            }
            this.method896(arg1, (byte) 61);
            this.method1265(29637);
        }
    }

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "(II)V")
    public static final void method1271(int arg0, int arg1) {
        if (arg0 > -9) {
            field3746 = null;
        }
        class114.field2297 = 1000 / arg1;
        ++field3735;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
    public static void method1272(int arg0) {
        field3736 = null;
        field3758 = null;
        field3750 = null;
        field3734 = null;
        field3751 = null;
        field3743 = null;
        field3744 = null;
        field3738 = null;
        field3746 = null;
        if (arg0 != -16278) {
            field3751 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(II)V")
    public final void method895(int arg0, int arg1) {
        if (arg1 > -32) {
            this.field3745 = null;
        }
        ++field3731;
        if (this.method891(arg0, -14929)) {
            class131.method867(this.field3742, (byte) 92, arg0);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BILjd;)V")
    public static final void method1273(byte arg0, int arg1, class92 arg2) {
        class92 var3 = arg2.method614(0).method617(1);
        boolean var4 = false;
        ++field3754;
        if (arg0 < -40) {
            for (int var5 = 0; ~class140.field2811 < ~var5; ++var5) {
                class91 var6 = class172.field3347[class190.field3678[var5]];
                if (var6 != null && var6.field1805 != null && var6.field1805.method646(104, var3)) {
                    class186.method1206(class15.field423.field233[0], 0, (byte) -63, class15.field423.field198[0], var6.field233[0], 1, false, 1, 0, 0, var6.field198[0], 2);
                    var4 = true;
                    if (arg1 == 1) {
                        class99.field2000.method405(134, 7);
                        class99.field2000.method458(class190.field3678[var5], 9345);
                        ++class15.field422;
                    } else if (~arg1 == -5) {
                        ++class5.field282;
                        class99.field2000.method405(87, 7);
                        class99.field2000.method450(class190.field3678[var5], (byte) -128);
                    } else if (~arg1 == -7) {
                        class99.field2000.method405(66, 7);
                        class99.field2000.method450(class190.field3678[var5], (byte) -127);
                        ++class87.field1720;
                    } else if (arg1 == 7) {
                        class99.field2000.method405(236, 7);
                        ++class99.field2003;
                        class99.field2000.method450(class190.field3678[var5], (byte) -114);
                    }
                    break;
                }
            }
            if (!var4) {
                class117.method788(class3.field189, -19001, 0, class77.method529(-3, new class92[] { class198.field3867, var3 }));
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(IBI)V")
    public final void method1274(int arg0, byte arg1, int arg2) {
        ++field3739;
        int var4 = -78 / ((arg1 - 13) / 45);
        this.field3752 = arg2;
        this.field3755 = arg0;
        if (this.field3729 != null) {
            class204.method1330(this.field3729, 0, this.field3742, this);
        } else {
            class139.method928(this.field3742, 25213, this.field3752, (byte) 0, this, 255, true);
        }
    }
}

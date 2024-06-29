import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class132 extends class30 {

    @OriginalMember(owner = "client!t", name = "Dc", descriptor = "I")
    public int field3000 = 0;

    @OriginalMember(owner = "client!t", name = "yc", descriptor = "I")
    public int field2995 = 0;

    @OriginalMember(owner = "client!t", name = "Fc", descriptor = "I")
    public int field3002 = 0;

    @OriginalMember(owner = "client!t", name = "Hc", descriptor = "I")
    public int field3004 = 0;

    @OriginalMember(owner = "client!t", name = "Mc", descriptor = "I")
    public int field3009 = -1;

    @OriginalMember(owner = "client!t", name = "Ic", descriptor = "I")
    public int field3005 = 0;

    @OriginalMember(owner = "client!t", name = "Tc", descriptor = "Z")
    public boolean field3016 = false;

    @OriginalMember(owner = "client!t", name = "Pc", descriptor = "I")
    public int field3012 = -1;

    @OriginalMember(owner = "client!t", name = "Vc", descriptor = "Lr;")
    public static class118 field3018 = class153.method1136(81, "http:)4)4");

    @OriginalMember(owner = "client!t", name = "Wc", descriptor = "Lr;")
    public static class118 field3019 = class153.method1136(74, "<col=ffb000>");

    @OriginalMember(owner = "client!t", name = "Oc", descriptor = "Lqb;")
    public static class113 field3011 = new class113();

    @OriginalMember(owner = "client!t", name = "ad", descriptor = "Lr;")
    public static class118 field3023 = class153.method1136(124, "");

    @OriginalMember(owner = "client!t", name = "Zc", descriptor = "Lr;")
    public static class118 field3022 = field3023;

    @OriginalMember(owner = "client!t", name = "Yc", descriptor = "Lr;")
    public static class118 field3021 = field3023;

    @OriginalMember(owner = "client!t", name = "bd", descriptor = "Lr;")
    public static class118 field3024 = field3023;

    @OriginalMember(owner = "client!t", name = "cd", descriptor = "Lr;")
    public static class118 field3025 = field3023;

    @OriginalMember(owner = "client!t", name = "dd", descriptor = "Lr;")
    public static class118 field3026 = field3023;

    @OriginalMember(owner = "client!t", name = "fd", descriptor = "Lr;")
    public static class118 field3028 = field3023;

    @OriginalMember(owner = "client!t", name = "ed", descriptor = "Lge;")
    public static class47 field3027 = new class47(64);

    @OriginalMember(owner = "client!t", name = "xc", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!t", name = "Ac", descriptor = "I")
    public int field2997;

    @OriginalMember(owner = "client!t", name = "Bc", descriptor = "I")
    public int field2998;

    @OriginalMember(owner = "client!t", name = "Cc", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!t", name = "Ec", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!t", name = "Gc", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!t", name = "Jc", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!t", name = "Kc", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!t", name = "Lc", descriptor = "I")
    public int field3008;

    @OriginalMember(owner = "client!t", name = "Nc", descriptor = "I")
    public int field3010;

    @OriginalMember(owner = "client!t", name = "Rc", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!t", name = "Sc", descriptor = "I")
    public int field3015;

    @OriginalMember(owner = "client!t", name = "Uc", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!t", name = "Xc", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!t", name = "zc", descriptor = "Lr;")
    public class118 field2996;

    @OriginalMember(owner = "client!t", name = "Qc", descriptor = "Lwb;")
    public class155 field3013;

    @OriginalMember(owner = "client!t", name = "wc", descriptor = "Lie;")
    public class61 field2993;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(B)V")
    public static void method1018(byte arg0) {
        field3021 = null;
        field3018 = null;
        field3011 = null;
        field3025 = null;
        field3026 = null;
        field3024 = null;
        field3023 = null;
        field3028 = null;
        field3019 = null;
        field3022 = null;
        if (arg0 <= -71) {
            field3027 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)Lwb;")
    public final class155 method215(int arg0) {
        ++field3007;
        if (this.field2993 == null) {
            return null;
        } else {
            class153 var2 = super.field746 != -1 && ~super.field747 == -1 ? class125.method970((byte) -68, super.field746) : null;
            class153 var3 = ~super.field765 == 0 || this.field3016 || super.field766 == super.field765 && var2 != null ? null : class125.method970((byte) -68, super.field765);
            class155 var4 = this.field2993.method552(super.field721, var2, false, super.field719, var3);
            if (var4 == null) {
                return null;
            } else {
                var4.method1199();
                super.field757 = var4.field2145;
                if (!this.field3016 && super.field735 != -1 && super.field782 != -1) {
                    class155 var5 = class1.method2(-15697, super.field735).method455((byte) 73, super.field782);
                    if (var5 != null) {
                        var5.method1217(0, -super.field770, 0);
                        class155[] var6 = new class155[] { var4, var5 };
                        var4 = new class155(var6, 2);
                    }
                }
                if (arg0 != 15246) {
                    method1018((byte) -75);
                }
                if (!this.field3016 && this.field3013 != null) {
                    if (~this.field3002 >= ~class65.field1479) {
                        this.field3013 = null;
                    }
                    if (~class65.field1479 <= ~this.field3004 && this.field3002 > class65.field1479) {
                        class155 var7 = this.field3013;
                        var7.method1217(-super.field760 + this.field2998, -this.field3010 + this.field3017, -super.field712 + this.field3008);
                        class155[] var8 = new class155[] { var4, var7 };
                        if (super.field756 != 512) {
                            if (~super.field756 != -1025) {
                                if (~super.field756 == -1537) {
                                    var7.method1198();
                                }
                            } else {
                                var7.method1198();
                                var7.method1198();
                            }
                        } else {
                            var7.method1198();
                            var7.method1198();
                            var7.method1198();
                        }
                        var4 = new class155(var8, 2);
                        if (~super.field756 == -513) {
                            var7.method1198();
                        } else if (~super.field756 != -1025) {
                            if (~super.field756 == -1537) {
                                var7.method1198();
                                var7.method1198();
                                var7.method1198();
                            }
                        } else {
                            var7.method1198();
                            var7.method1198();
                        }
                        var7.method1217(super.field760 - this.field2998, -this.field3017 + this.field3010, -this.field3008 + super.field712);
                    }
                }
                var4.field3546 = true;
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILea;)V")
    public static final void method1019(int arg0, class30 arg1) {
        ++field3006;
        if (~class65.field1479 == ~arg1.field748 || ~arg1.field746 == 0 || ~arg1.field747 != -1 || arg1.field775 + 1 > class125.method970((byte) -68, arg1.field746).field3478[arg1.field719]) {
            int var2 = -arg1.field758 + arg1.field748;
            int var3 = -arg1.field758 + class65.field1479;
            int var4 = arg1.field733 * 64 + arg1.field732 * 128;
            int var5 = arg1.field733 * 64 + arg1.field720 * 128;
            int var6 = arg1.field733 * 64 + arg1.field728 * 128;
            arg1.field760 = ((-var3 + var2) * var6 - -(var3 * var5)) / var2;
            int var7 = arg1.field733 * 64 + arg1.field723 * 128;
            arg1.field712 = ((var2 - var3) * var4 + var3 * var7) / var2;
        }
        if (arg0 != 31106) {
            method1018((byte) 119);
        }
        arg1.field736 = 0;
        if (arg1.field774 == 0) {
            arg1.field756 = 1024;
        }
        if (~arg1.field774 == -2) {
            arg1.field756 = 1536;
        }
        if (~arg1.field774 == -3) {
            arg1.field756 = 0;
        }
        if (arg1.field774 == 3) {
            arg1.field756 = 512;
        }
        arg1.field768 = arg1.field756;
    }

    @OriginalMember(owner = "client!t", name = "h", descriptor = "(I)V")
    public static final void method1020(int arg0) {
        ++field3014;
        if (class48.field1180) {
            class39.field951 = null;
            class94.field2225 = null;
            class14.field319 = null;
            class126.field2885 = null;
            class35.field890 = null;
            class24.field605 = null;
            class142.field3219 = null;
            class124.field2842 = null;
            class43.field1041 = null;
            class112.field2614 = null;
            class47.field1128 = null;
            class61.field1422 = null;
            class35.field891 = null;
            class91.field2174 = null;
            class127.field2914 = null;
            class22.field545 = null;
            class31.field794 = null;
            class27.field644 = null;
            class15.field391 = null;
            class158.field3647 = null;
            class62.field1439 = null;
            class27.field641 = null;
            class13.method92((byte) -94, 2);
            class37.method307((byte) -82, true);
            class48.field1180 = false;
            if (arg0 != 65535) {
                field3028 = null;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(I)Z")
    public final boolean method253(int arg0) {
        ++field2999;
        if (arg0 != -3) {
            method1019(-62, (class30) null);
        }
        return this.field2993 != null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILpa;)V")
    public final void method1021(int arg0, class105 arg1) {
        ++field3003;
        arg1.field2404 = 0;
        int var3 = arg1.method831((byte) 76);
        this.field3009 = arg1.method807(false);
        this.field3012 = arg1.method807(false);
        int[] var4 = new int[12];
        int var5 = arg0;
        this.field3000 = 0;
        for (int var6 = 0; ~var6 > -13; ++var6) {
            int var7 = arg1.method831((byte) 76);
            if (~var7 == -1) {
                var4[var6] = 0;
            } else {
                int var8 = arg1.method831((byte) 76);
                var4[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && var4[0] == 65535) {
                    var5 = arg1.method838((byte) 5);
                    break;
                }
                if (var4[var6] >= 512) {
                    int var12 = class131.method1013(arg0 ^ 12581, var4[var6] + -512).field2090;
                    if (var12 != 0) {
                        this.field3000 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; ~var10 > -6; ++var10) {
            int var11 = arg1.method831((byte) 76);
            if (~var11 > -1 || var11 >= class137.field3096[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field766 = arg1.method838((byte) 5);
        if (~super.field766 == -65536) {
            super.field766 = -1;
        }
        super.field714 = arg1.method838((byte) 5);
        if (~super.field714 == -65536) {
            super.field714 = -1;
        }
        super.field716 = super.field714;
        super.field764 = arg1.method838((byte) 5);
        if (super.field764 == 65535) {
            super.field764 = -1;
        }
        super.field762 = arg1.method838((byte) 5);
        if (~super.field762 == -65536) {
            super.field762 = -1;
        }
        super.field761 = arg1.method838((byte) 5);
        if (~super.field761 == -65536) {
            super.field761 = -1;
        }
        super.field767 = arg1.method838((byte) 5);
        if (super.field767 == 65535) {
            super.field767 = -1;
        }
        super.field750 = arg1.method838((byte) 5);
        if (super.field750 == 65535) {
            super.field750 = -1;
        }
        this.field2996 = class131.method1014(arg1.method792(arg0 + 18353), arg0 ^ 110).method903(38);
        this.field2995 = arg1.method831((byte) 76);
        this.field3005 = arg1.method838((byte) 5);
        if (this.field2993 == null) {
            this.field2993 = new class61();
        }
        this.field2993.method554(var4, arg0 ^ 106, var9, var5, ~var3 == -2);
    }
}

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class53 extends class50 {

    @OriginalMember(owner = "client!hd", name = "Vc", descriptor = "I")
    public int field1047 = 0;

    @OriginalMember(owner = "client!hd", name = "Wc", descriptor = "I")
    public int field1048 = 0;

    @OriginalMember(owner = "client!hd", name = "id", descriptor = "I")
    public int field1060 = 0;

    @OriginalMember(owner = "client!hd", name = "qd", descriptor = "I")
    public int field1068 = -1;

    @OriginalMember(owner = "client!hd", name = "md", descriptor = "I")
    public int field1064 = 0;

    @OriginalMember(owner = "client!hd", name = "Pc", descriptor = "I")
    public int field1041 = -1;

    @OriginalMember(owner = "client!hd", name = "hd", descriptor = "Z")
    public boolean field1059 = false;

    @OriginalMember(owner = "client!hd", name = "wd", descriptor = "I")
    public int field1074 = 0;

    @OriginalMember(owner = "client!hd", name = "Oc", descriptor = "Lsc;")
    public static class128 field1040 = class129.method1017(false, "titlebutton");

    @OriginalMember(owner = "client!hd", name = "Tc", descriptor = "Lsc;")
    public static class128 field1045 = class129.method1017(false, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!hd", name = "pd", descriptor = "Lsc;")
    public static class128 field1067 = null;

    @OriginalMember(owner = "client!hd", name = "ld", descriptor = "Lsc;")
    private static class128 field1063 = class129.method1017(false, " is already on your ignore list)3");

    @OriginalMember(owner = "client!hd", name = "bd", descriptor = "Lsc;")
    public static class128 field1053 = field1063;

    @OriginalMember(owner = "client!hd", name = "Mc", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!hd", name = "Nc", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "client!hd", name = "Qc", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!hd", name = "Uc", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!hd", name = "Xc", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!hd", name = "Zc", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!hd", name = "ad", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!hd", name = "cd", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "client!hd", name = "dd", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!hd", name = "ed", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!hd", name = "fd", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!hd", name = "gd", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!hd", name = "kd", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!hd", name = "nd", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!hd", name = "od", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!hd", name = "sd", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!hd", name = "td", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!hd", name = "ud", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!hd", name = "vd", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!hd", name = "Yc", descriptor = "Lsc;")
    public class128 field1050;

    @OriginalMember(owner = "client!hd", name = "Rc", descriptor = "Lkb;")
    public class71 field1043;

    @OriginalMember(owner = "client!hd", name = "jd", descriptor = "Llb;")
    public class78 field1061;

    @OriginalMember(owner = "client!hd", name = "Sc", descriptor = "[I")
    public static int[] field1044;

    @OriginalMember(owner = "client!hd", name = "rd", descriptor = "[I")
    public static int[] field1069;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)Llb;")
    public final class78 method1(int arg0) {
        ++field1058;
        if (this.field1043 == null) {
            return null;
        } else {
            class134 var2 = ~super.field981 != 0 && super.field970 == 0 ? class70.method527(12, super.field981) : null;
            class134 var3 = super.field958 == -1 || this.field1059 || super.field958 == super.field1009 && var2 != null ? null : class70.method527(12, super.field958);
            class78 var4 = this.field1043.method544(118, var2, var3, super.field973, super.field955);
            if (var4 == null) {
                return null;
            } else {
                var4.method584();
                super.field956 = var4.field3593;
                if (!this.field1059 && ~super.field968 != 0 && super.field998 != -1) {
                    class78 var5 = class147.method1184(super.field968, arg0 ^ -20521147).method858(super.field998, -125);
                    if (var5 != null) {
                        var5.method583(0, -super.field961, 0);
                        class78[] var6 = new class78[] { var4, var5 };
                        var4 = new class78(var6, 2);
                    }
                }
                if (!this.field1059 && this.field1061 != null) {
                    if (this.field1074 <= class29.field554) {
                        this.field1061 = null;
                    }
                    if (~class29.field554 <= ~this.field1047 && this.field1074 > class29.field554) {
                        class78 var7 = this.field1061;
                        class78[] var8 = new class78[] { var4, var7 };
                        var7.method583(-super.field975 + this.field1072, -this.field1055 + this.field1049, this.field1046 - super.field987);
                        if (~super.field985 == -513) {
                            var7.method586();
                            var7.method586();
                            var7.method586();
                        } else if (~super.field985 == -1025) {
                            var7.method586();
                            var7.method586();
                        } else if (~super.field985 == -1537) {
                            var7.method586();
                        }
                        var4 = new class78(var8, 2);
                        if (super.field985 != 512) {
                            if (~super.field985 == -1025) {
                                var7.method586();
                                var7.method586();
                            } else if (~super.field985 == -1537) {
                                var7.method586();
                                var7.method586();
                                var7.method586();
                            }
                        } else {
                            var7.method586();
                        }
                        var7.method583(-this.field1072 + super.field975, -this.field1049 + this.field1055, -this.field1046 + super.field987);
                    }
                }
                var4.field1699 = true;
                if (arg0 != -20521144) {
                    method408(-12, 24);
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLha;)V")
    public static final void method401(byte arg0, class50 arg1) {
        ++field1070;
        if (arg1.field953 != 0) {
            if (arg1.field951 != -1 && ~arg1.field951 > -32769) {
                class51 var2 = class92.field2104[arg1.field951];
                if (var2 != null) {
                    int var3 = -var2.field975 + arg1.field975;
                    int var4 = -var2.field987 + arg1.field987;
                    if (~var3 != -1 || var4 != 0) {
                        arg1.field985 = (int) (325.949D * Math.atan2((double) var3, (double) var4)) & 2047;
                    }
                }
            }
            if (arg0 < -54) {
                if (~arg1.field951 <= -32769) {
                    int var5 = arg1.field951 - 32768;
                    if (class33.field628 == var5) {
                        var5 = 2047;
                    }
                    class53 var6 = class106.field2421[var5];
                    if (var6 != null) {
                        int var7 = -var6.field975 + arg1.field975;
                        int var8 = arg1.field987 - var6.field987;
                        if (var7 != 0 || var8 != 0) {
                            arg1.field985 = (int) (325.949D * Math.atan2((double) var7, (double) var8)) & 2047;
                        }
                    }
                }
                if ((~arg1.field980 != -1 || ~arg1.field999 != -1) && (~arg1.field947 == -1 || ~arg1.field995 < -1)) {
                    int var9 = -((-class62.field1325 + arg1.field980 + -class62.field1325) * 64) + arg1.field975;
                    int var10 = -((-class66.field1482 + arg1.field999 - class66.field1482) * 64) + arg1.field987;
                    if (var9 != 0 || var10 != 0) {
                        arg1.field985 = 2047 & (int) (325.949D * Math.atan2((double) var9, (double) var10));
                    }
                    arg1.field980 = 0;
                    arg1.field999 = 0;
                }
                int var11 = 2047 & -arg1.field1012 + arg1.field985;
                if (var11 == 0) {
                    arg1.field1017 = 0;
                } else {
                    ++arg1.field1017;
                    if (var11 > 1024) {
                        arg1.field1012 -= arg1.field953;
                        boolean var12 = true;
                        if (var11 < arg1.field953 || ~(-arg1.field953 + 2048) > ~var11) {
                            arg1.field1012 = arg1.field985;
                            var12 = false;
                        }
                        if (~arg1.field958 == ~arg1.field1009 && (~arg1.field1017 < -26 || var12)) {
                            if (~arg1.field1010 == 0) {
                                arg1.field958 = arg1.field977;
                            } else {
                                arg1.field958 = arg1.field1010;
                            }
                        }
                    } else {
                        arg1.field1012 += arg1.field953;
                        boolean var13 = true;
                        if (~arg1.field953 < ~var11 || var11 > 2048 - arg1.field953) {
                            arg1.field1012 = arg1.field985;
                            var13 = false;
                        }
                        if (~arg1.field958 == ~arg1.field1009 && (~arg1.field1017 < -26 || var13)) {
                            if (arg1.field994 == -1) {
                                arg1.field958 = arg1.field977;
                            } else {
                                arg1.field958 = arg1.field994;
                            }
                        }
                    }
                    arg1.field1012 &= 2047;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)I")
    public static final int method402(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 3;
        ++field1065;
        if (~var4 == -1) {
            return arg0;
        } else {
            if (arg3 != 7) {
                field1040 = null;
            }
            if (var4 == 1) {
                return -arg2 + 7;
            } else {
                return var4 == 2 ? -arg0 + 7 : arg2;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "(I)V")
    public static final void method403(int arg0) {
        ++field1062;
        if (arg0 != 18) {
            method408(-104, 40);
        }
        if (class141.field3302 != null) {
            class111 var1 = class141.field3302;
            synchronized (class141.field3302) {
                class141.field3302 = null;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILae;Z)V")
    public static final void method404(int arg0, class6 arg1, boolean arg2) {
        ++field1038;
        if (class122.field2784 != null) {
            class122.field2784.field1924 = arg0 * 8 + 5;
            int var3 = class122.field2784.method666(1183700424);
            int var4 = class122.field2784.method666(1183700424);
            arg1.method18(var3, var4, 25751);
        } else if (!arg2) {
            class129.method1020((byte) 0, 255, 0, (class6) null, true, 255, (byte) 74);
            class62.field1333[arg0] = arg1;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLmc;)V")
    public final void method405(boolean arg0, class86 arg1) {
        arg1.field1924 = 0;
        int var3 = arg1.method646(-15447);
        this.field1041 = arg1.method667(-1);
        this.field1068 = arg1.method667(-1);
        this.field1060 = 0;
        if (arg0) {
            int[] var4 = new int[12];
            ++field1052;
            int var5 = -1;
            for (int var6 = 0; ~var6 > -13; ++var6) {
                int var7 = arg1.method646(-15447);
                if (var7 == 0) {
                    var4[var6] = 0;
                } else {
                    int var8 = arg1.method646(-15447);
                    var4[var6] = (var7 << 8) + var8;
                    if (~var6 == -1 && ~var4[0] == -65536) {
                        var5 = arg1.method632((byte) -80);
                        break;
                    }
                    if (~var4[var6] <= -513) {
                        int var12 = class27.method230((byte) -44, var4[var6] + -512).field1392;
                        if (~var12 != -1) {
                            this.field1060 = var12;
                        }
                    }
                }
            }
            int[] var9 = new int[5];
            for (int var10 = 0; ~var10 > -6; ++var10) {
                int var11 = arg1.method646(-15447);
                if (var11 < 0 || ~class21.field403[var10].length >= ~var11) {
                    var11 = 0;
                }
                var9[var10] = var11;
            }
            super.field1009 = arg1.method632((byte) -80);
            if (super.field1009 == 65535) {
                super.field1009 = -1;
            }
            super.field1010 = arg1.method632((byte) -80);
            if (~super.field1010 == -65536) {
                super.field1010 = -1;
            }
            super.field994 = super.field1010;
            super.field977 = arg1.method632((byte) -80);
            if (~super.field977 == -65536) {
                super.field977 = -1;
            }
            super.field1018 = arg1.method632((byte) -80);
            if (~super.field1018 == -65536) {
                super.field1018 = -1;
            }
            super.field963 = arg1.method632((byte) -80);
            if (super.field963 == 65535) {
                super.field963 = -1;
            }
            super.field1013 = arg1.method632((byte) -80);
            if (~super.field1013 == -65536) {
                super.field1013 = -1;
            }
            super.field964 = arg1.method632((byte) -80);
            if (~super.field964 == -65536) {
                super.field964 = -1;
            }
            this.field1050 = class129.method1018(arg1.method675((byte) -128), 82).method987(117);
            this.field1064 = arg1.method646(-15447);
            this.field1048 = arg1.method632((byte) -80);
            if (this.field1043 == null) {
                this.field1043 = new class71();
            }
            this.field1043.method528(0, var5, var4, var9, var3 == 1);
        }
    }

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "(I)V")
    public static void method406(int arg0) {
        field1044 = null;
        field1069 = null;
        field1067 = null;
        field1045 = null;
        field1053 = null;
        if (arg0 == -28318) {
            field1040 = null;
            field1063 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "(I)V")
    public static final void method407(int arg0) {
        ++field1073;
        try {
            if (~class158.field3637 == -1) {
                if (class63.field1358 != null) {
                    class63.field1358.method502((byte) -1);
                    class63.field1358 = null;
                }
                class151.field3465 = 0;
                class19.field347 = false;
                class158.field3637 = 1;
                class49.field931 = null;
            }
            if (arg0 != 24638) {
                field1067 = null;
            }
            if (~class158.field3637 == -2) {
                if (class49.field931 == null) {
                    class49.field931 = class144.field3353.method82(class111.field2506, class121.field2742, (byte) -47);
                }
                if (~class49.field931.field1320 == -3) {
                    throw new IOException();
                }
                if (class49.field931.field1320 == 1) {
                    class63.field1358 = new class66((Socket) class49.field931.field1319, class144.field3353);
                    class158.field3637 = 2;
                    class49.field931 = null;
                }
            }
            if (~class158.field3637 == -3) {
                long var1 = class125.field2837 = class132.field3090.method973(arg0 ^ -24677);
                class152.field3502.field1924 = 0;
                int var3 = (int) (31L & var1 >> 16);
                class152.field3502.method653(14, 0);
                class152.field3502.method653(var3, 0);
                class63.field1358.method496(true, class152.field3502.field1920, 2, 0);
                class158.field3637 = 3;
                class158.field3626.field1924 = 0;
            }
            if (class158.field3637 == 3) {
                if (class27.field521 != null) {
                    class27.field521.method714(false);
                }
                if (class124.field2814 != null) {
                    class124.field2814.method714(false);
                }
                int var4 = class63.field1358.method498(-126);
                if (class27.field521 != null) {
                    class27.field521.method714(false);
                }
                if (class124.field2814 != null) {
                    class124.field2814.method714(false);
                }
                if (~var4 != -1) {
                    class77.method570(-3, var4);
                    return;
                }
                class158.field3637 = 4;
                class158.field3626.field1924 = 0;
            }
            if (class158.field3637 == 4) {
                if (~class158.field3626.field1924 > -9) {
                    int var5 = class63.field1358.method501((byte) 10);
                    if (var5 > -class158.field3626.field1924 + 8) {
                        var5 = -class158.field3626.field1924 + 8;
                    }
                    if (var5 > 0) {
                        class63.field1358.method500(class158.field3626.field1924, var5, class158.field3626.field1920, false);
                        class158.field3626.field1924 += var5;
                    }
                }
                if (~class158.field3626.field1924 == -9) {
                    class158.field3626.field1924 = 0;
                    class46.field842 = class158.field3626.method675((byte) -114);
                    class158.field3637 = 5;
                }
            }
            if (class158.field3637 == 5) {
                class152.field3502.field1924 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class46.field842 >> 32), (int) class46.field842 };
                class152.field3502.method653(10, 0);
                class152.field3502.method649(-51, var6[0]);
                class152.field3502.method649(arg0 ^ -24684, var6[1]);
                class152.field3502.method649(arg0 + -24753, var6[2]);
                class152.field3502.method649(-42, var6[3]);
                class152.field3502.method651(-1070186000, class132.field3090.method973(-91));
                class152.field3502.method644(1965040587, class132.field3070);
                class152.field3502.method664(class51.field1021, true, class69.field1544);
                class142.field3325.field1924 = 0;
                if (~class14.field282 != -41) {
                    class142.field3325.method653(16, 0);
                } else {
                    class142.field3325.method653(18, 0);
                }
                class142.field3325.method653(class152.field3502.field1924 + 93, arg0 ^ 24638);
                class142.field3325.method649(-81, 470);
                class142.field3325.method653(!class110.field2487 ? 0 : 1, 0);
                class116.method896((byte) 79, class142.field3325);
                class142.field3325.method649(-106, class120.field2728.field3020);
                class142.field3325.method649(-66, class87.field1985.field3020);
                class142.field3325.method649(-58, class67.field1514.field3020);
                class142.field3325.method649(arg0 + -24651, class147.field3397.field3020);
                class142.field3325.method649(-105, class108.field2446.field3020);
                class142.field3325.method649(arg0 ^ -24663, class1.field1.field3020);
                class142.field3325.method649(-14, class36.field701.field3020);
                class142.field3325.method649(-102, class119.field2706.field3020);
                class142.field3325.method649(arg0 + -24766, class135.field3184.field3020);
                class142.field3325.method649(-69, class54.field1118.field3020);
                class142.field3325.method649(-97, class12.field205.field3020);
                class142.field3325.method649(-27, class146.field3377.field3020);
                class142.field3325.method649(arg0 ^ -24578, class95.field2234.field3020);
                class142.field3325.method649(arg0 + -24658, class92.field2080.field3020);
                class142.field3325.method649(arg0 ^ -24656, class11.field181.field3020);
                class142.field3325.method649(arg0 + -24722, class156.field3583.field3020);
                class142.field3325.method655(class152.field3502.field1920, -94, class152.field3502.field1924, 0);
                class63.field1358.method496(true, class142.field3325.field1920, class142.field3325.field1924, 0);
                class152.field3502.method504(var6, -74);
                for (int var7 = 0; ~var7 > -5; ++var7) {
                    var6[var7] += 50;
                }
                class158.field3626.method504(var6, arg0 + -24707);
                class158.field3637 = 6;
            }
            if (~class158.field3637 == -7 && ~class63.field1358.method501((byte) 10) < -1) {
                int var8 = class63.field1358.method498(arg0 + -24726);
                if (var8 == 21 && class14.field282 == 20) {
                    class158.field3637 = 7;
                } else if (var8 == 2) {
                    class158.field3637 = 9;
                } else {
                    if (var8 == 15 && class14.field282 == 40) {
                        class120.method912(29);
                        return;
                    }
                    if (var8 != 23 || class21.field400 >= 1) {
                        class77.method570(-3, var8);
                        return;
                    }
                    ++class21.field400;
                    class158.field3637 = 0;
                }
            }
            if (class158.field3637 == 7 && ~class63.field1358.method501((byte) 10) < -1) {
                class54.field1186 = (3 + class63.field1358.method498(arg0 ^ -24601)) * 60;
                class158.field3637 = 8;
            }
            if (~class158.field3637 == -9) {
                class151.field3465 = 0;
                class62.method462(true, class12.field197, class152.field3507, class51.method395(new class128[] { class111.method857(class54.field1186 / 60, (byte) 114), class129.field2960 }, false));
                if (--class54.field1186 <= 0) {
                    class158.field3637 = 0;
                }
            } else {
                if (class158.field3637 == 9 && class63.field1358.method501((byte) 10) >= 8) {
                    class41.field756 = class63.field1358.method498(-78);
                    class14.field267 = ~class63.field1358.method498(-53) == -2;
                    class33.field628 = class63.field1358.method498(-105);
                    class33.field628 <<= 8;
                    class33.field628 += class63.field1358.method498(-40);
                    class18.field337 = class63.field1358.method498(-50);
                    class63.field1358.method500(0, 1, class158.field3626.field1920, false);
                    class158.field3626.field1924 = 0;
                    class73.field1631 = class158.field3626.method505((byte) 121);
                    class63.field1358.method500(0, 2, class158.field3626.field1920, false);
                    class158.field3626.field1924 = 0;
                    class128.field2942 = class158.field3626.method632((byte) -80);
                    class158.field3637 = 10;
                }
                if (~class158.field3637 == -11) {
                    if (class63.field1358.method501((byte) 10) >= class128.field2942) {
                        class158.field3626.field1924 = 0;
                        class63.field1358.method500(0, class128.field2942, class158.field3626.field1920, false);
                        class119.method906(true);
                        class30.field602 = -1;
                        class25.method222(true, false);
                        class73.field1631 = -1;
                    }
                } else {
                    ++class151.field3465;
                    if (~class151.field3465 < -2001) {
                        if (class21.field400 < 1) {
                            if (class149.field3442 == class111.field2506) {
                                class111.field2506 = class9.field145;
                            } else {
                                class111.field2506 = class149.field3442;
                            }
                            ++class21.field400;
                            class158.field3637 = 0;
                        } else {
                            class77.method570(-3, -3);
                        }
                    }
                }
            }
        } catch (IOException var9) {
            if (class21.field400 < 1) {
                class158.field3637 = 0;
                ++class21.field400;
                if (class149.field3442 != class111.field2506) {
                    class111.field2506 = class149.field3442;
                } else {
                    class111.field2506 = class9.field145;
                }
            } else {
                class77.method570(-3, -2);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)Z")
    public final boolean method391(int arg0) {
        ++field1051;
        if (this.field1043 == null) {
            return false;
        } else {
            return arg0 == -30036;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)Lsc;")
    public static final class128 method408(int arg0, int arg1) {
        ++field1066;
        class128 var2 = new class128();
        if (arg1 >= -99) {
            field1045 = null;
        }
        var2.field2893 = new byte[arg0];
        var2.field2920 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZII)Lsc;")
    public static final class128 method409(boolean arg0, int arg1, int arg2) {
        ++field1056;
        if (arg2 >= -81) {
            field1069 = null;
        }
        return class128.method1005(arg1, 10, arg0, -61);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILma;)V")
    public static final void method410(int arg0, class84 arg1) {
        ++field1071;
        if (class75.field1663) {
            class122.method935(arg1, 27827);
        } else {
            if (class120.field2726 == 1 && ~class43.field806 <= -716 && class9.field133 >= 453) {
                class18.field328 = !class18.field328;
                if (class18.field328) {
                    class35.method255((byte) -94);
                } else {
                    class126.method959(class36.field701, 56, class65.field1448, class132.field3059, 255, false);
                }
            }
            if (class14.field282 != 5) {
                ++class134.field3154;
                if (class14.field282 == 10) {
                    if (class132.field3069 != 2 && ~class154.field3535 == -1) {
                        if (class120.field2726 == 1) {
                            byte var2 = 5;
                            short var3 = 463;
                            byte var4 = 100;
                            byte var5 = 35;
                            if (var2 <= class43.field806 && class43.field806 <= var2 - -var4 && ~var3 >= ~class9.field133 && var3 - -var5 >= class9.field133) {
                                class142.method1161(32768);
                                return;
                            }
                        }
                        if (class90.field2056 != null) {
                            class142.method1161(32768);
                        }
                    }
                    int var6 = class120.field2726;
                    if (arg0 <= 104) {
                        method410(-6, (class84) null);
                    }
                    int var7 = class9.field133;
                    int var8 = class43.field806;
                    if (class100.field2305 == 0) {
                        short var9 = 302;
                        short var10 = 291;
                        if (var6 == 1 && var8 >= var9 + -75 && ~var8 >= ~(var9 + 75) && ~(var10 + -20) >= ~var7 && ~(var10 + 20) <= ~var7) {
                            class100.field2305 = 3;
                            class68.field1529 = 0;
                        }
                        short var11 = 462;
                        if (~var6 == -2 && ~var8 <= ~(var11 + -75) && ~(var11 + 75) <= ~var8 && ~(var10 + -20) >= ~var7 && var7 <= var10 + 20) {
                            class132.field3043 = class51.field1036;
                            class68.field1529 = 0;
                            class132.field3079 = class132.field3067;
                            class100.field2305 = 2;
                            class132.field3093 = class132.field3094;
                            return;
                        }
                    } else if (class100.field2305 != 2) {
                        if (class100.field2305 == 3) {
                            short var12 = 382;
                            short var13 = 321;
                            if (~var6 == -2 && var12 + -75 <= var8 && ~(var12 + 75) <= ~var8 && var13 + -20 <= var7 && ~var7 >= ~(var13 + 20)) {
                                class100.field2305 = 0;
                                return;
                            }
                        }
                    } else {
                        short var14 = 231;
                        short var15 = 302;
                        int var20 = var14 + 30;
                        if (var6 == 1 && ~(var20 - 15) >= ~var7 && ~var7 > ~var20) {
                            class68.field1529 = 0;
                        }
                        var20 += 15;
                        short var16 = 321;
                        if (var6 == 1 && var20 + -15 <= var7 && ~var7 > ~var20) {
                            class68.field1529 = 1;
                        }
                        var20 += 15;
                        if (var6 == 1 && var8 >= var15 + -75 && ~var8 >= ~(var15 + 75) && var7 >= var16 - 20 && var16 + 20 >= var7) {
                            class132.field3090 = class132.field3090.method1008((byte) 95).method987(57);
                            if (~class132.field3090.method1014(-9) == -1) {
                                class62.method462(true, class132.field3089, class152.field3513, class132.field3085);
                                return;
                            }
                            if (class132.field3070.method1014(-9) == 0) {
                                class62.method462(true, class132.field3044, class2.field15, class132.field3050);
                                return;
                            }
                            class62.method462(true, class132.field3076, class30.field603, class132.field3046);
                            class23.method206(20, 20);
                            return;
                        }
                        short var17 = 462;
                        if (~var6 == -2 && ~var8 <= ~(var17 - 75) && ~(var17 - -75) <= ~var8 && var7 >= var16 + -20 && ~var7 >= ~(var16 + 20)) {
                            class132.field3090 = class132.field3059;
                            class132.field3070 = class132.field3059;
                            class100.field2305 = 0;
                        }
                        while (true) {
                            while (class23.method207((byte) 102)) {
                                boolean var18 = false;
                                for (int var19 = 0; ~class154.field3558.method1014(-9) < ~var19; ++var19) {
                                    if (class30.field565 == class154.field3558.method981(false, var19)) {
                                        var18 = true;
                                        break;
                                    }
                                }
                                if (~class68.field1529 == -1) {
                                    if (class2.field19 == 85 && class132.field3090.method1014(-9) > 0) {
                                        class132.field3090 = class132.field3090.method974(0, (byte) -11, -1 + class132.field3090.method1014(-9));
                                    }
                                    if (class2.field19 == 84 || class2.field19 == 80) {
                                        class68.field1529 = 1;
                                    }
                                    if (var18 && class132.field3090.method1014(-9) < 12) {
                                        class132.field3090 = class132.field3090.method1004(false, class30.field565);
                                    }
                                } else if (class68.field1529 == 1) {
                                    if (class2.field19 == 85 && class132.field3070.method1014(-9) > 0) {
                                        class132.field3070 = class132.field3070.method974(0, (byte) -11, -1 + class132.field3070.method1014(-9));
                                    }
                                    if (~class2.field19 == -85 || ~class2.field19 == -81) {
                                        class68.field1529 = 0;
                                    }
                                    if (~class151.field3484 == -3 && ~class2.field19 == -85) {
                                        class132.field3090 = class132.field3090.method1008((byte) 95).method987(109);
                                        if (~class132.field3090.method1014(-9) == -1) {
                                            class62.method462(true, class132.field3089, class152.field3513, class132.field3085);
                                            return;
                                        }
                                        if (~class132.field3070.method1014(-9) == -1) {
                                            class62.method462(true, class132.field3044, class2.field15, class132.field3050);
                                            return;
                                        }
                                        class62.method462(true, class132.field3076, class30.field603, class132.field3046);
                                        class23.method206(20, 20);
                                        return;
                                    }
                                    if (var18 && ~class132.field3070.method1014(-9) > -21) {
                                        class132.field3070 = class132.field3070.method1004(false, class30.field565);
                                    }
                                }
                            }
                            return;
                        }
                    }
                }
            }
        }
    }
}

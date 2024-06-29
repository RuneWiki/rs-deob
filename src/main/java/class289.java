import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class289 {

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Z")
    public boolean field3897 = true;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    private int field3895 = -1;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public int field3893 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public int field3901 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    private int field3898 = -1;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    private int field3891 = -1;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public int field3913 = 0;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    private int field3908 = -1;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public int field3904 = -1;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "Z")
    public boolean field3920 = true;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    private int field3926 = -1;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public int field3902 = -1;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "Z")
    public boolean field3916 = false;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "[Ljava/lang/String;")
    public String[] field3924 = new String[5];

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "Z")
    public boolean field3925 = true;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public int field3930 = -1;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public int field3927 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public int field3914 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public int field3931 = -1;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "[I")
    public static int[] field3911 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "[I")
    public static int[] field3918 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "Z")
    public static boolean field3929 = false;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public int field3887;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    private int field3888;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    private int field3889;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public int field3896;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    private int field3903;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    private int field3906;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public int field3907;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public int field3909;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public int field3923;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "Lwaa;")
    private class652 field3919;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "Lhn;")
    public class670 field3915;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Ljava/lang/String;")
    public String field3910;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "Ljava/lang/String;")
    public String field3912;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "[I")
    public int[] field3922;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZLr;)Lf;", line = 10)
    public final class701 method1715(int arg0, boolean arg1, class165 arg2) {
        field3892++;
        int var4 = arg1 ? this.field3931 : this.field3904;
        int var5 = var4 | arg2.field2018 << 29;
        class701 var6 = (class701) this.field3915.field9640.method2766(-125, (long) var5);
        if (arg0 != -4053) {
            this.method1717(-88);
        }
        if (var6 != null) {
            return var6;
        } else if (this.field3915.field9637.method3802(var4, (byte) 126)) {
            class495 var7 = class495.method2874(this.field3915.field9637, var4, 0);
            if (var7 != null) {
                var6 = arg2.method216(var7, true);
                this.field3915.field9640.method2772(var6, true, (long) var5);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIZ)I", line = 43)
    public final int method1716(int arg0, int arg1, boolean arg2) {
        field3905++;
        if (this.field3919 == null) {
            return arg1;
        }
        class556 var4 = (class556) this.field3919.method3678((long) arg0, -122);
        if (var4 == null) {
            return arg1;
        } else if (arg2) {
            return var4.field8043;
        } else {
            return -99;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 66)
    public final void method1717(int arg0) {
        if (arg0 != 21354) {
            return;
        }
        if (this.field3922 != null) {
            for (int var2 = 0; var2 < this.field3922.length; var2 += 2) {
                if (this.field3927 > this.field3922[var2]) {
                    this.field3927 = this.field3922[var2];
                } else if (this.field3901 < this.field3922[var2]) {
                    this.field3901 = this.field3922[var2];
                }
                if (this.field3893 > this.field3922[var2 + 1]) {
                    this.field3893 = this.field3922[var2 + 1];
                } else if (this.field3922[var2 + 1] > this.field3914) {
                    this.field3914 = this.field3922[var2 + 1];
                }
            }
        }
        field3928++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lri;B)Z", line = 105)
    public final boolean method1718(class95 arg0, byte arg1) {
        field3894++;
        int var3;
        if (this.field3898 == -1) {
            if (this.field3891 == -1) {
                return true;
            }
            var3 = arg0.method732(121, this.field3891);
        } else {
            var3 = arg0.method731(this.field3898, (byte) -54);
        }
        if (this.field3906 > var3 || var3 > this.field3889) {
            return false;
        }
        boolean var4 = false;
        if (arg1 <= 15) {
            return true;
        }
        int var5;
        if (this.field3926 == -1) {
            if (this.field3908 == -1) {
                return true;
            }
            var5 = arg0.method732(84, this.field3908);
        } else {
            var5 = arg0.method731(this.field3926, (byte) 101);
        }
        return var5 >= this.field3888 && this.field3903 >= var5;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILr;)Lf;", line = 146)
    public final class701 method1719(int arg0, class165 arg1) {
        if (arg0 < 116) {
            return null;
        }
        field3921++;
        class701 var3 = (class701) this.field3915.field9640.method2766(-121, (long) (arg1.field2018 << 29 | this.field3895 | 0x20000));
        if (var3 != null) {
            return var3;
        }
        this.field3915.field9637.method3802(this.field3895, (byte) 2);
        class495 var4 = class495.method2874(this.field3915.field9637, this.field3895, 0);
        if (var4 != null) {
            var3 = arg1.method216(var4, true);
            this.field3915.field9640.method2772(var3, true, (long) (this.field3895 | 0x20000 | arg1.field2018 << 29));
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 187)
    public static void method1720(byte arg0) {
        if (arg0 >= 99) {
            field3911 = null;
            field3918 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 214)
    public final String method1721(int arg0, int arg1, String arg2) {
        field3917++;
        if (this.field3919 == null) {
            return arg2;
        }
        class374 var4 = (class374) this.field3919.method3678((long) arg0, -124);
        if (arg1 <= 41) {
            this.field3889 = -57;
        }
        return var4 == null ? arg2 : var4.field5035;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lun;Z)V", line = 262)
    public final void method1722(class389 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2229(255);
            if (var3 == 0) {
                field3899++;
                if (!arg1) {
                    this.method1723(null, true, 47);
                    return;
                }
                return;
            }
            this.method1723(arg0, false, var3);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lun;ZI)V", line = 282)
    private final void method1723(class389 arg0, boolean arg1, int arg2) {
        field3900++;
        if (arg1) {
            this.method1717(69);
        }
        if (arg2 == 1) {
            this.field3904 = arg0.method2260(-34);
        } else if (arg2 == 2) {
            this.field3931 = arg0.method2260(-73);
        } else if (arg2 == 3) {
            this.field3910 = arg0.method2244((byte) -101);
        } else if (arg2 == 4) {
            this.field3887 = arg0.method2258(-3);
        } else if (arg2 == 5) {
            this.field3902 = arg0.method2258(-3);
        } else if (arg2 == 6) {
            this.field3913 = arg0.method2229(255);
        } else if (arg2 == 7) {
            int var4 = arg0.method2229(255);
            if ((var4 & 0x1) == 0) {
                this.field3920 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field3916 = true;
                return;
            }
        } else if (arg2 == 8) {
            this.field3897 = arg0.method2229(255) == 1;
        } else if (arg2 == 9) {
            this.field3891 = arg0.method2260(-71);
            if (this.field3891 == 65535) {
                this.field3891 = -1;
            }
            this.field3898 = arg0.method2260(-44);
            if (this.field3898 == 65535) {
                this.field3898 = -1;
            }
            this.field3906 = arg0.method2255(255);
            this.field3889 = arg0.method2255(255);
            return;
        } else if (arg2 < 10 || arg2 > 14) {
            if (arg2 != 15) {
                if (arg2 == 16) {
                    this.field3925 = false;
                    return;
                }
                if (arg2 != 17) {
                    if (arg2 != 18) {
                        if (arg2 != 19) {
                            if (arg2 == 20) {
                                this.field3908 = arg0.method2260(-97);
                                if (this.field3908 == 65535) {
                                    this.field3908 = -1;
                                }
                                this.field3926 = arg0.method2260(-111);
                                if (this.field3926 == 65535) {
                                    this.field3926 = -1;
                                }
                                this.field3888 = arg0.method2255(255);
                                this.field3903 = arg0.method2255(255);
                                return;
                            }
                            if (arg2 != 21) {
                                if (arg2 == 22) {
                                    this.field3907 = arg0.method2255(255);
                                } else if (arg2 == 249) {
                                    int var5 = arg0.method2229(255);
                                    if (this.field3919 == null) {
                                        int var6 = class698.method3915(var5, (byte) 93);
                                        this.field3919 = new class652(var6);
                                    }
                                    for (int var7 = 0; var7 < var5; var7++) {
                                        boolean var8 = arg0.method2229(255) == 1;
                                        int var9 = arg0.method2258(-3);
                                        class513 var10;
                                        if (var8) {
                                            var10 = new class374(arg0.method2244((byte) -120));
                                        } else {
                                            var10 = new class556(arg0.method2255(255));
                                        }
                                        this.field3919.method3670((long) var9, var10, (byte) 127);
                                    }
                                    return;
                                }
                                return;
                            }
                            this.field3909 = arg0.method2255(255);
                            return;
                        }
                        this.field3930 = arg0.method2260(-61);
                        return;
                    }
                    this.field3895 = arg0.method2260(-66);
                    return;
                }
                this.field3912 = arg0.method2244((byte) -44);
                return;
            }
            int var11 = arg0.method2229(255);
            this.field3922 = new int[var11 * 2];
            for (int var12 = 0; var12 < (var11 * 2); var12++) {
                this.field3922[var12] = arg0.method2270((byte) 71);
            }
            this.field3890 = arg0.method2255(255);
            this.field3896 = arg0.method2255(255);
            return;
        } else {
            this.field3924[arg2 - 10] = arg0.method2244((byte) -101);
            return;
        }
    }
}

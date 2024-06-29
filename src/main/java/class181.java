import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class181 extends class11 {

    @OriginalMember(owner = "client!js", name = "Eb", descriptor = "Z")
    public static volatile boolean field2482 = true;

    @OriginalMember(owner = "client!js", name = "Mb", descriptor = "I")
    public static int field2490 = 0;

    @OriginalMember(owner = "client!js", name = "Nb", descriptor = "[I")
    public static int[] field2491 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

    @OriginalMember(owner = "client!js", name = "yb", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!js", name = "zb", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!js", name = "Ab", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!js", name = "Bb", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!js", name = "Db", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!js", name = "Fb", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!js", name = "Gb", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!js", name = "Hb", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!js", name = "Ib", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!js", name = "Jb", descriptor = "I")
    private int field2487;

    @OriginalMember(owner = "client!js", name = "Kb", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!js", name = "Lb", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!js", name = "Ob", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!js", name = "Pb", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!js", name = "Cb", descriptor = "Lqr;")
    private class41 field2480;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "(II)V", line = 3)
    public final void method1178(int arg0, int arg1) {
        if (arg0 != 63) {
            field2485 = -50;
        }
        ++field2483;
        super.field230[super.field191++] = (byte) (arg1 + this.field2480.method377(255));
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I)V", line = 14)
    public class181(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 17)
    public static final String method1179(String arg0, byte arg1) {
        ++field2476;
        int var2 = arg0.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; ++var5) {
            char var6 = arg0.charAt(var5);
            if (~var4 != -1) {
                if (var4 == 2 || Character.isUpperCase(var6)) {
                    var6 = class263.method1723((byte) 103, var6);
                }
            } else {
                var6 = Character.toLowerCase(var6);
            }
            if (!Character.isLetter(var6)) {
                if (~var6 != -47 && var6 != '?' && ~var6 != -34) {
                    if (!Character.isSpaceChar(var6)) {
                        var4 = 1;
                    } else if (~var4 != -3) {
                        var4 = 1;
                    }
                } else {
                    var4 = 2;
                }
            } else {
                var4 = 0;
            }
            var3[var5] = var6;
        }
        if (arg1 != 111) {
            field2482 = false;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!js", name = "t", descriptor = "(I)V", line = 70)
    public static final void method1180(int arg0) {
        ++field2488;
        if (arg0 != -28476) {
            method1183(-61);
        }
        for (class313 var1 = (class313) class21.field380.method1005(-1); var1 != null; var1 = (class313) class21.field380.method1012((byte) -65)) {
            var1.method2019();
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([IZ)V", line = 92)
    public final void method1181(int[] arg0, boolean arg1) {
        if (arg1) {
            this.method1178(120, -58);
        }
        ++field2493;
        this.field2480 = new class41(arg0);
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "([BIII)V", line = 104)
    public final void method1182(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field2484;
        for (int var5 = arg1; ~var5 > ~arg3; ++var5) {
            arg0[arg2 + var5] = (byte) (super.field230[super.field191++] + -this.field2480.method377(255));
        }
    }

    @OriginalMember(owner = "client!js", name = "u", descriptor = "(I)V", line = 120)
    public static void method1183(int arg0) {
        if (arg0 >= -76) {
            field2491 = null;
        }
        field2491 = null;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(III)Z", line = 132)
    public static final boolean method1184(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class146.field2081; ++var3) {
            class59 var4 = class131.field1865[var3];
            if (var4.field792 == 1) {
                int var5 = var4.field804 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field785 * var5 >> 8) + var4.field806;
                    int var7 = (var4.field791 * var5 >> 8) + var4.field807;
                    int var8 = (var4.field799 * var5 >> 8) + var4.field795;
                    int var9 = (var4.field811 * var5 >> 8) + var4.field805;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field792 == 2) {
                int var10 = arg0 - var4.field804;
                if (var10 > 0) {
                    int var11 = (var4.field785 * var10 >> 8) + var4.field806;
                    int var12 = (var4.field791 * var10 >> 8) + var4.field807;
                    int var13 = (var4.field799 * var10 >> 8) + var4.field795;
                    int var14 = (var4.field811 * var10 >> 8) + var4.field805;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field792 == 3) {
                int var15 = var4.field806 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field803 * var15 >> 8) + var4.field804;
                    int var17 = (var4.field793 * var15 >> 8) + var4.field798;
                    int var18 = (var4.field799 * var15 >> 8) + var4.field795;
                    int var19 = (var4.field811 * var15 >> 8) + var4.field805;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field792 == 4) {
                int var20 = arg2 - var4.field806;
                if (var20 > 0) {
                    int var21 = (var4.field803 * var20 >> 8) + var4.field804;
                    int var22 = (var4.field793 * var20 >> 8) + var4.field798;
                    int var23 = (var4.field799 * var20 >> 8) + var4.field795;
                    int var24 = (var4.field811 * var20 >> 8) + var4.field805;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field792 == 5) {
                int var25 = arg1 - var4.field795;
                if (var25 > 0) {
                    int var26 = (var4.field803 * var25 >> 8) + var4.field804;
                    int var27 = (var4.field793 * var25 >> 8) + var4.field798;
                    int var28 = (var4.field785 * var25 >> 8) + var4.field806;
                    int var29 = (var4.field791 * var25 >> 8) + var4.field807;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!js", name = "j", descriptor = "(B)V", line = 254)
    public final void method1185(byte arg0) {
        int var2 = -70 % ((54 - arg0) / 53);
        ++field2478;
        super.field191 = (this.field2487 + 7) / 8;
    }

    @OriginalMember(owner = "client!js", name = "g", descriptor = "(BI)I", line = 265)
    public final int method1186(byte arg0, int arg1) {
        ++field2479;
        int var3 = this.field2487 >> 3;
        if (arg0 != -97) {
            this.method1189(-5);
        }
        int var4 = 8 - (this.field2487 & 7);
        this.field2487 += arg1;
        int var5 = 0;
        while (arg1 > var4) {
            var5 += (super.field230[var3++] & class117.field1673[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (super.field230[var3] & class117.field1673[var4]) + var5;
        } else {
            var6 = (super.field230[var3] >> var4 - arg1 & class117.field1673[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!js", name = "v", descriptor = "(I)V", line = 308)
    public static final void method1187(int arg0) {
        class131 var1 = class288.field4047;
        synchronized (class288.field4047) {
            class288.field4047.method900(0);
        }
        if (arg0 < 112) {
            field2489 = -12;
        }
        ++field2481;
    }

    @OriginalMember(owner = "client!js", name = "w", descriptor = "(I)V", line = 324)
    public final void method1188(int arg0) {
        ++field2477;
        this.field2487 = super.field191 * 8;
        if (arg0 <= 50) {
            method1184(-92, 111, 22);
        }
    }

    @OriginalMember(owner = "client!js", name = "x", descriptor = "(I)I", line = 336)
    public final int method1189(int arg0) {
        if (arg0 != 9775) {
            return 120;
        } else {
            ++field2492;
            return 255 & super.field230[super.field191++] + -this.field2480.method377(255);
        }
    }

    @OriginalMember(owner = "client!js", name = "h", descriptor = "(BI)I", line = 347)
    public final int method1190(byte arg0, int arg1) {
        ++field2486;
        return arg0 <= 80 ? 82 : arg1 * 8 + -this.field2487;
    }
}

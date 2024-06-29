import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class63 extends class212 {

    @OriginalMember(owner = "client!pj", name = "eb", descriptor = "I")
    private int field980 = 0;

    @OriginalMember(owner = "client!pj", name = "jb", descriptor = "I")
    private int field985 = 0;

    @OriginalMember(owner = "client!pj", name = "mb", descriptor = "I")
    private int field988 = 0;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "[Lsc;")
    public static class181[] field970 = new class181[500];

    @OriginalMember(owner = "client!pj", name = "db", descriptor = "I")
    public static int field979 = -1;

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
    private int field972;

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!pj", name = "Z", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!pj", name = "ab", descriptor = "I")
    private int field976;

    @OriginalMember(owner = "client!pj", name = "bb", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!pj", name = "cb", descriptor = "I")
    private int field978;

    @OriginalMember(owner = "client!pj", name = "fb", descriptor = "I")
    private int field981;

    @OriginalMember(owner = "client!pj", name = "gb", descriptor = "I")
    private int field982;

    @OriginalMember(owner = "client!pj", name = "hb", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!pj", name = "kb", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!pj", name = "lb", descriptor = "I")
    private int field987;

    @OriginalMember(owner = "client!pj", name = "ib", descriptor = "[Lpg;")
    public static class69[] field984;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBII)V")
    private final void method445(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 52) {
            method449(-15, 59, -101);
        }
        ++field986;
        int var5 = ~arg2 < ~arg3 ? arg3 : arg2;
        int var6 = ~arg3 < ~arg2 ? arg3 : arg2;
        int var7 = ~arg0 > ~var5 ? arg0 : var5;
        int var8 = ~arg0 >= ~var6 ? var6 : arg0;
        int var9 = -var7 + var8;
        this.field981 = (var7 - -var8) / 2;
        if (var9 > 0) {
            int var10 = (-arg3 + var8 << 12) / var9;
            int var11 = (-arg2 + var8 << 12) / var9;
            int var12 = (-arg0 + var8 << 12) / var9;
            if (~arg3 == ~var8) {
                this.field972 = ~arg2 == ~var7 ? var12 + 20480 : -var11 + 4096;
            } else if (~arg2 == ~var8) {
                this.field972 = arg0 == var7 ? 4096 - -var10 : -var12 + 12288;
            } else {
                this.field972 = ~arg3 != ~var7 ? -var10 + 20480 : 12288 - -var11;
            }
            this.field972 /= 6;
        } else {
            this.field972 = 0;
        }
        if (~this.field981 < -1 && ~this.field981 > -4097) {
            this.field978 = (var9 << 12) / (~this.field981 < -2049 ? -(this.field981 * 2) + 8192 : this.field981 * 2);
        } else {
            this.field978 = 0;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIII)V")
    private final void method446(int arg0, int arg1, int arg2, int arg3) {
        ++field983;
        int var5 = ~arg0 < -2049 ? arg0 + arg2 + -(arg0 * arg2 >> 12) : (arg2 + 4096) * arg0 >> 12;
        if (~var5 < arg3) {
            int var6 = arg1 * 6;
            int var7 = var6 >> 12;
            int var8 = -var5 + arg0 + arg0;
            int var9 = (var5 - var8 << 12) / var5;
            int var10 = var6 - (var7 << 12);
            int var12 = var9 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var8 + var13;
            int var15 = -var13 + var5;
            if (~var7 == -1) {
                this.field987 = var5;
                this.field976 = var14;
                this.field982 = var8;
                return;
            }
            if (var7 == 1) {
                this.field976 = var5;
                this.field982 = var8;
                this.field987 = var15;
                return;
            }
            if (~var7 == -3) {
                this.field976 = var5;
                this.field987 = var8;
                this.field982 = var14;
                return;
            }
            if (~var7 == -4) {
                this.field982 = var5;
                this.field987 = var8;
                this.field976 = var15;
                return;
            }
            if (var7 == 4) {
                this.field982 = var5;
                this.field976 = var8;
                this.field987 = var14;
                return;
            }
            if (~var7 == -6) {
                this.field976 = var8;
                this.field987 = var5;
                this.field982 = var15;
                return;
            }
        } else {
            this.field987 = this.field976 = this.field982 = arg0;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IJ)Lsc;")
    public static final class181 method447(int arg0, long arg1) {
        ++field977;
        class248.field4328.setTime(new Date(arg1));
        int var3 = class248.field4328.get(7);
        int var4 = class248.field4328.get(5);
        int var5 = class248.field4328.get(2);
        int var6 = class248.field4328.get(1);
        if (arg0 < 25) {
            return null;
        } else {
            int var7 = class248.field4328.get(11);
            int var8 = class248.field4328.get(12);
            int var9 = class248.field4328.get(13);
            return class175.method1164(new class181[] { class110.field1808[var3 + -1], class81.field1299, class169.method1119((byte) -118, var4 / 10), class169.method1119((byte) -109, var4 % 10), class236.field4109, class129.field2143[var5], class236.field4109, class169.method1119((byte) 43, var6), class82.field1320, class169.method1119((byte) 104, var7 / 10), class169.method1119((byte) -110, var7 % 10), class1.field14, class169.method1119((byte) 70, var8 / 10), class169.method1119((byte) 51, var8 % 10), class1.field14, class169.method1119((byte) -119, var9 / 10), class169.method1119((byte) 46, var9 % 10), class128.field2123 }, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        int[][] var3 = super.field3645.method1352(arg0, -115);
        if (super.field3645.field3477) {
            int[][] var4 = this.method1410(arg0, 0, (byte) -53);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class26.field452 > var11; ++var11) {
                this.method445(var7[var11], (byte) 103, var5[var11], var6[var11]);
                this.field972 += this.field988;
                this.field978 += this.field985;
                if (~this.field978 > -1) {
                    this.field978 = 0;
                }
                if (~this.field978 < -4097) {
                    this.field978 = 4096;
                }
                this.field981 += this.field980;
                while (~this.field972 > -1) {
                    this.field972 += 4096;
                }
                while (~this.field972 < -4097) {
                    this.field972 -= 4096;
                }
                if (this.field981 < 0) {
                    this.field981 = 0;
                }
                if (~this.field981 < -4097) {
                    this.field981 = 4096;
                }
                this.method446(this.field981, this.field972, this.field978, -1);
                var8[var11] = this.field987;
                var9[var11] = this.field976;
                var10[var11] = this.field982;
            }
        }
        if (arg1 != 16383) {
            this.field987 = -106;
        }
        ++field971;
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        ++field974;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field980 = (arg0.method1563(arg2 + -255688181) << 12) / 100;
                }
            } else {
                this.field985 = (arg0.method1563(-255688184) << 12) / 100;
            }
        } else {
            this.field988 = arg0.method1515(-103);
        }
        if (arg2 != -3) {
            this.field972 = -51;
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V")
    public static void method448(byte arg0) {
        field984 = null;
        field970 = null;
        if (arg0 != -23) {
            method449(-38, 9, -115);
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(III)V")
    public static final void method449(int arg0, int arg1, int arg2) {
        if (arg1 != 896) {
            method448((byte) -59);
        }
        for (int var3 = 0; ~var3 > ~class256.field4472; ++var3) {
            class262 var4 = class261.method1777(var3, -27950);
            if (var4 != null) {
                int var5 = var4.field4576;
                if (~var5 <= -1 && !class72.field1157.method939(83, var5)) {
                    var5 = -1;
                }
                int var6;
                if (~var4.field4574 > -1) {
                    if (~var5 <= -1) {
                        var6 = class72.field1148[class75.method524(96, class72.field1157.method948(65535, var5), 50)];
                    } else if (var4.field4567 != -1) {
                        int var7 = var4.field4567;
                        int var8 = (127 & var7) - -arg0;
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 127) {
                            var8 = 127;
                        }
                        int var9 = (var7 & 896) + ((arg2 + var7 & 64512) - -var8);
                        var6 = class72.field1148[class75.method524(96, var9, arg1 + -846)];
                    } else {
                        var6 = -1;
                    }
                } else {
                    int var10 = var4.field4574;
                    int var11 = (127 & var10) + arg0;
                    if (~var11 > -1) {
                        var11 = 0;
                    } else if (~var11 < -128) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 64512) + (var10 & 896) - -var11;
                    var6 = class72.field1148[class75.method524(96, var12, 50)];
                }
                class162.field2757[var3 + 1] = var6;
            }
        }
        ++field973;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(JI)V")
    public static final void method450(long arg0, int arg1) {
        ++field975;
        if (~arg0 != -1L) {
            for (int var3 = 0; var3 < class221.field3815; ++var3) {
                if (class256.field4483[var3] == arg0) {
                    --class221.field3815;
                    for (int var4 = var3; var4 < class221.field3815; ++var4) {
                        class256.field4483[var4] = class256.field4483[var4 + 1];
                        class218.field3755[var4] = class218.field3755[var4 - -1];
                    }
                    class7.field122 = class247.field4318;
                    class141.field2275.method541(94, 123);
                    class141.field2275.method1511(false, arg0);
                    ++class113.field1839;
                    break;
                }
            }
            if (arg1 != 5463) {
                method450(116L, -50);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class63() {
        super(1, false);
    }
}

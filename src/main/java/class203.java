import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class203 extends class264 {

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    private int field3655 = 2048;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    private int field3652 = 0;

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
    private int field3665 = 2048;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "I")
    private int field3663 = 0;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    private int field3660 = 12288;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
    private int field3662 = 4096;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
    private int field3668 = 8192;

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "Lcf;")
    public static class93 field3667 = class147.method1066("Cache:", -48);

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "I")
    public static int field3670 = 0;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!ih", name = "db", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "Lhg;")
    public static class177 field3653;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "Lcd;")
    public static class27 field3659;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public static void method1442(int arg0) {
        field3667 = null;
        field3659 = null;
        field3653 = null;
        int var1 = 98 / ((46 - arg0) / 35);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field3668 = arg2.method1891(-119);
                                }
                            } else {
                                this.field3662 = arg2.method1891(-125);
                            }
                        } else {
                            this.field3660 = arg2.method1891(-113);
                        }
                    } else {
                        this.field3665 = arg2.method1891(-122);
                    }
                } else {
                    this.field3652 = arg2.method1891(-114);
                }
            } else {
                this.field3663 = arg2.method1891(-120);
            }
        } else {
            this.field3655 = arg2.method1891(-124);
        }
        ++field3664;
        if (arg0 <= 11) {
            field3653 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IB)V")
    public static final void method1443(int arg0, byte arg1) {
        class14.field168 = -1;
        ++field3657;
        class71.field1287 = arg0;
        class89.field1591 = -1;
        if (arg1 != 79) {
            field3667 = null;
        }
        class287.method1967(69);
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V")
    public static final void method1444(byte arg0) {
        if (!class58.field991) {
            class228.field4089[0] = class32.field509;
            class253.field4549 = 1;
            class86.field1553[0] = class178.field3144;
            if (~class7.field91 == -1) {
                if (class93.field1648 == 0) {
                    class32.field508 = class227.field4056;
                    class178.field3145 = class157.field2793;
                } else {
                    class32.field508 = class193.field3527;
                    class178.field3145 = class58.field992;
                }
            } else {
                class32.field508 = class110.field1884;
                class178.field3145 = class77.field1441;
            }
            class214.field3911[0] = class273.field4859;
            class216.field3942[0] = 1001;
        }
        if (~class69.field1262 != 0) {
            class125.method919(~arg0, class69.field1262);
        }
        if (arg0 == -94) {
            for (int var1 = 0; class161.field2845 > var1; ++var1) {
                if (class25.field314[var1]) {
                    class252.field4541[var1] = true;
                }
                class108.field1856[var1] = class25.field314[var1];
                class25.field314[var1] = false;
            }
            class174.field3029 = -1;
            ++field3669;
            class284.field5096 = null;
            class121.field2141 = null;
            class130.field2287 = -1;
            class44.field705 = class275.field4921;
            if (class69.field1262 != -1) {
                class161.field2845 = 0;
                class275.method1840(true);
            }
            class75.method522();
            class108.method776((byte) 73);
            if (!class58.field991) {
                if (class284.field5096 == null) {
                    if (~class174.field3029 != 0) {
                        class227.method1563(class174.field3029, (byte) -103, class130.field2287, (class181) null);
                    }
                } else {
                    class227.method1563(class238.field4264, (byte) -31, class235.field4198, class284.field5096);
                }
            } else if (!class4.field48) {
                class235.method1600(-11220);
            } else {
                class190.method1367(false);
            }
            int var2 = class58.field991 ? -1 : class258.method1742(arg0 ^ 42);
            if (var2 == -1) {
                var2 = class157.field2789;
            }
            class273.method1810(var2, -28940);
            if (~class212.field3893 == -2) {
                class212.field3893 = 2;
            }
            if (class46.field747 == 1) {
                class46.field747 = 2;
            }
            if (class26.field348 == 3) {
                for (int var3 = 0; var3 < class161.field2845; ++var3) {
                    if (class108.field1856[var3]) {
                        class75.method510(class170.field2985[var3], class40.field616[var3], class25.field311[var3], class110.field1877[var3], 16711935, 128);
                    } else if (class252.field4541[var3]) {
                        class75.method510(class170.field2985[var3], class40.field616[var3], class25.field311[var3], class110.field1877[var3], 16711680, 128);
                    }
                }
            }
            class70.method472(class166.field2927.field3784, -22691, class166.field2927.field3868, field3670, class138.field2405);
            field3670 = 0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(III)Z")
    private final boolean method1445(int arg0, int arg1, int arg2) {
        ++field3658;
        int var4 = (arg1 + arg2) * this.field3660 >> 12;
        if (arg0 != -2677) {
            return false;
        } else {
            int var5 = class124.field2200[(var4 * 255 & 1047291) >> 12];
            int var6 = (var5 << 12) / this.field3660;
            int var7 = (var6 << 12) / this.field3668;
            int var8 = this.field3662 * var7 >> 12;
            return -arg2 + arg1 < var8 && -var8 < -arg2 + arg1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZI)Z")
    private final boolean method1446(int arg0, boolean arg1, int arg2) {
        ++field3661;
        if (!arg1) {
            return true;
        } else {
            int var4 = (-arg0 + arg2) * this.field3660 >> 12;
            int var5 = class124.field2200[var4 * 255 >> 12 & 255];
            int var6 = (var5 << 12) / this.field3660;
            int var7 = (var6 << 12) / this.field3668;
            int var8 = this.field3662 * var7 >> 12;
            return var8 > arg0 + arg2 && ~(arg0 + arg2) < ~(-var8);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(DB)V")
    public static final void method1447(double arg0, byte arg1) {
        if (class111.field1894 != arg0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class168.field2960[var3] = var4 <= 255 ? var4 : 255;
            }
            class111.field1894 = arg0;
        }
        ++field3654;
        if (arg1 < 68) {
            field3670 = -124;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class203() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public final void method64(int arg0) {
        ++field3671;
        if (arg0 != -3) {
            method1447(-1.2866415146603716D, (byte) 91);
        }
        class55.method310(4096);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        ++field3656;
        if (arg1 > -83) {
            field3667 = null;
        }
        int[] var3 = super.field4716.method532((byte) 100, arg0);
        if (super.field4716.field1424) {
            int var4 = class67.field1220[arg0] - 2048;
            for (int var5 = 0; var5 < class176.field3060; ++var5) {
                int var6 = class144.field2497[var5] + -2048;
                int var7 = this.field3663 + var4;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field3652 + var6;
                int var11 = this.field3665 + var4;
                int var12 = var11 < -2048 ? var11 + 4096 : var11;
                int var13 = this.field3655 + var6;
                int var14 = var10 >= -2048 ? var10 : var10 + 4096;
                int var15 = ~var12 >= -2049 ? var12 : var12 - 4096;
                int var16 = var13 >= -2048 ? var13 : var13 + 4096;
                int var17 = var14 > 2048 ? var14 + -4096 : var14;
                int var18 = var16 > 2048 ? var16 - 4096 : var16;
                var3[var5] = !this.method1446(var18, true, var9) && !this.method1445(-2677, var15, var17) ? 0 : 4096;
            }
        }
        return var3;
    }
}

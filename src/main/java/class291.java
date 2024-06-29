import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class291 extends class87 {

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field4629 = 0;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "Z")
    public static boolean field4630 = false;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class291() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IZ)V")
    public static final void method1977(int arg0, boolean arg1) {
        ++field4631;
        byte[][] var2 = class7.field75;
        byte var3 = 4;
        int var4 = 0;
        if (arg0 == 13) {
            while (~var3 < ~var4) {
                class52.method316((byte) -55);
                for (int var5 = 0; var5 < 13; ++var5) {
                    for (int var6 = 0; var6 < 13; ++var6) {
                        int var7 = class49.field683[var4][var5][var6];
                        if (~var7 != 0) {
                            int var8 = var7 >> 24 & 3;
                            if (!arg1 || ~var8 == -1) {
                                int var9 = 3 & var7 >> 1;
                                int var10 = (16762512 & var7) >> 14;
                                int var11 = (var7 & 16381) >> 3;
                                int var12 = (var10 / 8 << 8) - -(var11 / 8);
                                for (int var13 = 0; ~class53.field768.length < ~var13; ++var13) {
                                    if (~class53.field768[var13] == ~var12 && var2[var13] != null) {
                                        class104.method814(var4, var9, var5 * 8, (7 & var11) * 8, var6 * 8, class235.field3431, var2[var13], arg0 ^ 15, arg1, (7 & var10) * 8, var8);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                ++var4;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)[Ldj;")
    public static final class138[] method1978(int arg0) {
        ++field4632;
        class138[] var1 = new class138[class223.field3270];
        if (arg0 <= 3) {
            field4634 = 14;
        }
        for (int var2 = 0; class223.field3270 > var2; ++var2) {
            var1[var2] = new class176(class250.field3792, class19.field202, class32.field399[var2], class297.field4765[var2], class165.field2534[var2], class283.field4559[var2], class280.field4506[var2], class53.field748);
        }
        class137.method1032(-128);
        return var1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field4628;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int var4 = class140.field2272[arg0];
            for (int var5 = 0; ~var5 > ~class206.field3032; ++var5) {
                var3[var5] = this.method1982(class138.field2254[var5], 27985, var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1979(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4627;
        ++class62.field949;
        class4.method20((byte) -56);
        if (!arg5) {
            class113.method848(0, (byte) -46);
            class292.method1983(false, 0, true, (byte) -60);
            if (class20.field214 == 0) {
                for (int var6 = 1; ~var6 >= -6; ++var6) {
                    class292.method1983(false, var6, false, (byte) -60);
                    class292.method1983(true, var6, false, (byte) -60);
                    class113.method848(var6, (byte) -46);
                }
            } else {
                for (int var7 = 1; ~var7 >= -6; ++var7) {
                    class113.method848(var7, (byte) -46);
                    class292.method1983(false, var7, false, (byte) -60);
                    class292.method1983(true, var7, false, (byte) -60);
                }
            }
        } else {
            class292.method1983(false, 0, false, (byte) -60);
        }
        if (!arg5) {
            class124.method956(arg2 + -9206);
        }
        class267.method1840(0);
        class88.field1412 = arg3;
        class88.field1395 = arg4;
        if (~class119.field1931 != -2) {
            if (class119.field1931 == 5) {
                class305.method2072(arg1, (byte) 52);
            }
        } else {
            int var8 = (int) class180.field2705;
            int var9 = 2047 & (int) class102.field1736 + class9.field98;
            if (class298.field4777 / 256 > var8) {
                var8 = class298.field4777 / 256;
            }
            if (class223.field3274[4] && ~var8 > ~(class275.field4453[4] + 128)) {
                var8 = class275.field4453[4] + 128;
            }
            class16.method113(class160.field2487, class113.method851(class37.field474, -5, class213.field3139.field3753, class213.field3139.field3660) + -50, arg1, var8 * 3 + 600, class276.field4466, var9, var8, 0);
        }
        int var10 = class93.field1533;
        int var11 = class226.field3324;
        int var12 = class115.field1906;
        int var13 = class260.field4024;
        int var14 = class268.field4303;
        for (int var15 = 0; ~var15 > -6; ++var15) {
            if (class223.field3274[var15]) {
                int var22 = (int) ((double) (class196.field2889[var15] * 2 + 1) * Math.random() - (double) class196.field2889[var15] + Math.sin((double) class111.field1852[var15] / 100.0D * (double) class37.field482[var15]) * (double) class275.field4453[var15]);
                if (var15 == 3) {
                    class268.field4303 = 2047 & class268.field4303 + var22;
                }
                if (var15 == 1) {
                    class226.field3324 += var22;
                }
                if (~var15 == -5) {
                    class115.field1906 += var22;
                    if (~class115.field1906 > -129) {
                        class115.field1906 = 128;
                    }
                    if (class115.field1906 > 383) {
                        class115.field1906 = 383;
                    }
                }
                if (var15 == 2) {
                    class260.field4024 += var22;
                }
                if (var15 == 0) {
                    class93.field1533 += var22;
                }
            }
        }
        class13.method94(true);
        class130.method982(arg3, arg4, arg3 - -arg0, arg1 + arg4);
        class244.method1675();
        if (class247.field3654 < 0) {
            class130.method996(arg3, arg4, arg0, arg1, 0);
        } else {
            class127 var16 = class219.method1525(class82.field1325, class73.field1144, 1619234272, class247.field3654, class74.field1165);
            var16.method967(class158.field2462, arg3, arg4, arg0, arg1, class115.field1906, class268.field4303, 0);
        }
        if (arg2 != 383) {
            method1977(45, true);
        }
        if (!class191.field2823 && class121.field1991 >= arg3 && ~class121.field1991 > ~(arg0 + arg3) && ~class299.field4833 <= ~arg4 && ~(arg1 + arg4) < ~class299.field4833) {
            int var17 = class51.field709;
            int var18 = class202.field2972;
            int var19 = class249.field3765;
            class300.field4847 = true;
            class89.field1438 = 0;
            class133.field2182 = (-arg3 + class121.field1991) * (-var17 + var18) / arg0 + var17;
            int var20 = class246.field3613;
            class144.field2336 = (class299.field4833 - arg4) * (-var19 + var20) / arg1 + var19;
        } else {
            class89.field1438 = 0;
            class300.field4847 = false;
        }
        class52.method316((byte) -123);
        byte var21 = class160.method1163(0) != 2 ? 1 : (byte) class62.field949;
        class170.method1211(class93.field1533, class226.field3324, class260.field4024, class115.field1906, class268.field4303, class228.field3361, class209.field3088, class284.field4563, class169.field2560, class57.field824, class35.field447, class37.field474 + 1, var21, class213.field3139.field3660 >> 7, class213.field3139.field3753 >> 7);
        class52.method316((byte) -123);
        class196.method1386();
        class170.method1210(arg4, arg3, 256, 256, arg0, arg1, false);
        class100.method784(arg4, (byte) -66, 256, arg3, arg0, arg1, 256);
        ((class274) class244.field3600).method1906(class126.field2126, (byte) -85);
        class68.method515(arg0, arg3, arg1, 126, arg4);
        class93.field1533 = var10;
        class268.field4303 = var14;
        class226.field3324 = var11;
        class260.field4024 = var13;
        class115.field1906 = var12;
        if (class119.field1933 && class188.field2802.method1841(0) == 0) {
            class119.field1933 = false;
        }
        if (class119.field1933) {
            class130.method996(arg3, arg4, arg0, arg1, 0);
            class306.method2078(-69, class214.field3146, false);
        }
        if (!arg5 && !class119.field1933 && !class191.field2823 && class121.field1991 >= arg3 && arg3 - -arg0 > class121.field1991 && ~arg4 >= ~class299.field4833 && arg1 + arg4 > class299.field4833) {
            class142.method1059(arg0, class299.field4833, 127, arg4, arg1, class121.field1991, arg3);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BJZII)Ljava/lang/String;")
    public static final String method1980(byte arg0, long arg1, boolean arg2, int arg3, int arg4) {
        ++field4626;
        char var6 = ',';
        char var7 = '.';
        if (arg0 != -23) {
            method1977(-51, false);
        }
        if (~arg3 == -1) {
            var6 = '.';
            var7 = ',';
        }
        boolean var8 = false;
        if (arg3 == 2) {
            var7 = 160;
        }
        if (~arg1 > -1L) {
            var8 = true;
            arg1 = -arg1;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; ~arg4 < ~var10; ++var10) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (var11 + 48 - (int) arg1 * 10));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (48 - -var13 + -((int) arg1 * 10)));
            if (~arg1 == -1L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg2) {
                ++var12;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZJ)V")
    public static final void method1981(boolean arg0, long arg1) {
        if (!arg0) {
            field4634 = 2;
        }
        ++field4635;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(III)I")
    private final int method1982(int arg0, int arg1, int arg2) {
        ++field4633;
        if (arg1 != 27985) {
            return -68;
        } else {
            int var4 = arg0 - -(arg2 * 57);
            int var5 = var4 ^ var4 << 1;
            return 4096 - (Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144;
        }
    }
}

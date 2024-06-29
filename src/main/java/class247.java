import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class247 extends class122 {

    @OriginalMember(owner = "client!u", name = "cb", descriptor = "Lqd;")
    private class40 field4098 = class209.field3346;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field4084 = -1;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "Lqd;")
    public static class40 field4094 = class147.method1106("name_icons", (byte) -115);

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "[Lqd;")
    public static class40[] field4096 = new class40[1000];

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "J")
    public static long field4086 = 0L;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    public int field4089;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!u", name = "W", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!u", name = "X", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "I")
    public int field4095;

    @OriginalMember(owner = "client!u", name = "db", descriptor = "I")
    private int field4099;

    @OriginalMember(owner = "client!u", name = "fb", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!u", name = "gb", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!u", name = "hb", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "Lo;")
    public class199 field4090;

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "Lo;")
    private class199 field4097;

    @OriginalMember(owner = "client!u", name = "eb", descriptor = "[I")
    public static int[] field4100;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(II)Z", line = 4)
    public final boolean method1742(int arg0, int arg1) {
        field4088++;
        if (this.field4090 == null) {
            return false;
        }
        if (this.field4097 == null) {
            this.method1747(0);
        }
        class270 var3 = (class270) this.field4097.method1405((byte) 115, (long) arg1);
        if (arg0 != -2) {
            method1745(true);
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V", line = 30)
    public static final void method1743(boolean arg0) {
        class19.field295.method1464(3, 0);
        field4091++;
        if (!arg0) {
            field4100 = (int[]) null;
        }
        class293.field4906++;
        class19.field295.method241(0L, 108);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)I", line = 50)
    public final int method1744(int arg0, boolean arg1) {
        if (arg1) {
            method1743(false);
        }
        field4093++;
        if (this.field4090 == null) {
            return this.field4099;
        } else {
            class270 var3 = (class270) this.field4090.method1405((byte) 115, (long) arg0);
            return var3 == null ? this.field4099 : var3.field4483;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V", line = 70)
    public static void method1745(boolean arg0) {
        if (arg0) {
            field4094 = (class40) null;
        }
        field4094 = null;
        field4100 = null;
        field4096 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZIII)V", line = 86)
    public static final void method1746(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field4103++;
        class55.field1069++;
        if (!arg2) {
            class278.method1945(true, -65);
            class129.method959((byte) -119, true);
            class278.method1945(false, -65);
        }
        class129.method959((byte) -103, false);
        if (!arg2) {
            class49.method433(22759);
        }
        class230.method1607(88);
        if (class21.field350) {
            class257.method1808(arg5, arg4, 43, arg0, arg3, true);
            arg5 = class125.field2156;
            arg0 = class130.field2225;
            arg3 = class265.field4448;
            arg4 = class87.field1567;
        }
        if (class103.field1814 == 1) {
            int var6 = class298.field4977;
            if (class254.field4230 / 256 > var6) {
                var6 = class254.field4230 / 256;
            }
            if (class123.field2135[4] && (class257.field4277[4] + 128) > var6) {
                var6 = class257.field4277[4] + 128;
            }
            int var7 = class174.field2826 + class108.field1893 & 0x7FF;
            class119.method897(var7, class293.method2012(class160.field2671, class255.field4233.field1497, 0, class255.field4233.field1531) - 50, class206.field3288, arg3, (var6 * 3) + 600, class109.field1909, var6, -125);
        }
        int var8 = class238.field3922;
        int var9 = class116.field1988;
        int var10 = class58.field1107;
        int var11 = class289.field4841;
        if (arg1 <= 126) {
            return;
        }
        int var12 = class181.field2949;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class123.field2135[var13]) {
                int var14 = (int) ((double) (class315.field5327[var13] * 2 + 1) * Math.random() + Math.sin((double) class298.field4971[var13] / 100.0D * (double) class83.field1442[var13]) * (double) class257.field4277[var13] - (double) class315.field5327[var13]);
                if (var13 == 3) {
                    class181.field2949 = class181.field2949 + var14 & 0x7FF;
                }
                if (var13 == 1) {
                    class116.field1988 += var14;
                }
                if (var13 == 4) {
                    class58.field1107 += var14;
                    if (class58.field1107 < 128) {
                        class58.field1107 = 128;
                    }
                    if (class58.field1107 > 383) {
                        class58.field1107 = 383;
                    }
                }
                if (var13 == 2) {
                    class289.field4841 += var14;
                }
                if (var13 == 0) {
                    class238.field3922 += var14;
                }
            }
        }
        class55.method472(1621);
        if (class21.field350) {
            class111.method847(arg5, arg4, arg0 + arg5, arg3 + arg4);
            float var15 = (float) class58.field1107 * 0.17578125F;
            float var16 = (float) class181.field2949 * 0.17578125F;
            if (class103.field1814 == 3) {
                var15 = class288.field4834 * 360.0F / 6.2831855F;
                var16 = class122.field2127 * 360.0F / 6.2831855F;
            }
            class21.method147(arg5, arg4, arg0, arg3, arg5 + (arg0 / 2), arg3 / 2 + arg4, var15, var16, class59.field1136, class59.field1136);
        } else {
            class115.method870(arg5, arg4, arg0 + arg5, arg3 + arg4);
            class203.method1414();
        }
        if (class27.field518 || class159.field2664 < arg5 || class159.field2664 >= (arg0 + arg5) || class294.field4937 < arg4 || class294.field4937 >= arg3 + arg4) {
            class293.field4929 = 0;
            class14.field227 = false;
        } else {
            class293.field4929 = 0;
            int var17 = class186.field3011;
            class14.field227 = true;
            int var18 = class162.field2695;
            class280.field4744 = (class159.field2664 - arg5) * (var18 - var17) / arg0 + var17;
            int var19 = class188.field3042;
            int var20 = class218.field3630;
            class208.field3324 = (class294.field4937 - arg4) * (var20 - var19) / arg3 + var19;
        }
        class194.method1385(4);
        byte var21 = class149.method1121(1) == 2 ? (byte) class55.field1069 : 1;
        if (class21.field350) {
            class21.method157();
            class21.method152(true);
            boolean var22 = false;
            class21.method160(true);
            int var23;
            if (class6.field87 == 10) {
                var23 = class255.method1796(class189.field3059, class162.field2692, class238.field3922 >> 10, (byte) 79, class289.field4841 >> 10);
            } else {
                var23 = class255.method1796(class189.field3059, class162.field2692, class255.field4233.field1489[0] >> 3, (byte) 74, class255.field4233.field1532[0] >> 3);
            }
            class84.method649(class256.field4266, !class223.field3704);
            class21.method142(var23);
            class222.method1555(class289.field4841, (byte) 118, class116.field1988, class238.field3922, class58.field1107, class181.field2949);
            class21.field357 = class256.field4266;
            class10.method66(class238.field3922, class116.field1988, class289.field4841, class58.field1107, class181.field2949, class255.field4241, class130.field2226, class54.field1053, class102.field1791, class19.field321, class298.field4984, class160.field2671 + 1, var21, class255.field4233.field1531 >> 7, class255.field4233.field1497 >> 7);
            class156.field2619 = true;
            class84.method637();
            class222.method1555(0, (byte) 26, 0, 0, 0, 0);
            class194.method1385(4);
            class314.method2173();
            class7.method34(class59.field1136, arg5, class59.field1136, arg3, 150, arg4, arg0);
            class119.method894(class59.field1136, arg0, arg5, class59.field1136, arg3, arg4, 127);
        } else {
            class115.method880(arg5, arg4, arg0, arg3, 0);
            class10.method66(class238.field3922, class116.field1988, class289.field4841, class58.field1107, class181.field2949, class255.field4241, class130.field2226, class54.field1053, class102.field1791, class19.field321, class298.field4984, class160.field2671 + 1, var21, class255.field4233.field1531 >> 7, class255.field4233.field1497 >> 7);
            class194.method1385(4);
            class314.method2173();
            class7.method34(256, arg5, 256, arg3, 150, arg4, arg0);
            class119.method894(256, arg0, arg5, 256, arg3, arg4, 123);
        }
        ((class212) class203.field3217).method1497(6005, class189.field3059);
        class237.method1639(760177601, arg5, arg3, arg4, arg0);
        class289.field4841 = var11;
        class181.field2949 = var12;
        class58.field1107 = var10;
        class116.field1988 = var9;
        class238.field3922 = var8;
        if (class297.field4960 && class123.field2139.method2076(30411) == 0) {
            class297.field4960 = false;
        }
        if (class297.field4960) {
            if (class21.field350) {
                class111.method846(arg5, arg4, arg0, arg3, 0);
            } else {
                class115.method880(arg5, arg4, arg0, arg3, 0);
            }
            class28.method269((byte) -105, class128.field2210, false);
        }
        if (!arg2 && !class297.field4960 && !class27.field518 && class159.field2664 >= arg5 && class159.field2664 < (arg5 + arg0) && class294.field4937 >= arg4 && class294.field4937 < arg3 + arg4) {
            class303.method2069(class294.field4937, arg4, class159.field2664, (byte) 119, arg0, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V", line = 295)
    private final void method1747(int arg0) {
        this.field4097 = new class199(this.field4090.method1404(true));
        field4102++;
        class270 var2 = (class270) this.field4090.method1400(-1);
        if (arg0 != 0) {
            return;
        }
        while (var2 != null) {
            class270 var3 = new class270((int) var2.field5149);
            this.field4097.method1396(arg0 ^ 0xFFFFB228, (long) var2.field4483, var3);
            var2 = (class270) this.field4090.method1403(-111);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILqd;)Z", line = 318)
    public final boolean method1748(int arg0, class40 arg1) {
        field4087++;
        if (this.field4090 == null) {
            return false;
        }
        if (arg0 != 0) {
            this.field4090 = (class199) null;
        }
        if (this.field4097 == null) {
            this.method1752(256);
        }
        for (class158 var3 = (class158) this.field4097.method1405((byte) 115, arg1.method329(65)); var3 != null; var3 = (class158) this.field4097.method1398(-29858)) {
            if (var3.field2641.method345(arg1, false)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILsd;)V", line = 359)
    private final void method1749(int arg0, int arg1, class26 arg2) {
        if (arg0 != 4) {
            field4096 = (class40[]) null;
        }
        field4085++;
        if (arg1 == 1) {
            this.field4089 = arg2.method226(255);
        } else if (arg1 == 2) {
            this.field4095 = arg2.method226(arg0 ^ 0xFB);
        } else if (arg1 == 3) {
            this.field4098 = arg2.method251((byte) 77);
        } else if (arg1 == 4) {
            this.field4099 = arg2.method203(arg0 ^ 0xFFFFA9CA);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method197(-1);
            this.field4090 = new class199(class151.method1130(arg0 ^ 0x52, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method203(arg0 ^ 0xFFFFA9CA);
                class307 var7;
                if (arg1 == 5) {
                    var7 = new class60(arg2.method251((byte) 77));
                } else {
                    var7 = new class270(arg2.method203(arg0 - 22070));
                }
                this.field4090.method1396(-19928, (long) var6, var7);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(II)Lqd;", line = 412)
    public final class40 method1750(int arg0, int arg1) {
        field4083++;
        if (this.field4090 == null) {
            return this.field4098;
        }
        if (arg1 != 1) {
            this.method1751((class26) null, 106);
        }
        class60 var3 = (class60) this.field4090.method1405((byte) 115, (long) arg0);
        return var3 == null ? this.field4098 : var3.field1144;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lsd;I)V", line = 450)
    public final void method1751(class26 arg0, int arg1) {
        if (arg1 <= 15) {
            return;
        }
        field4101++;
        while (true) {
            int var3 = arg0.method226(255);
            if (var3 == 0) {
                return;
            }
            this.method1749(4, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V", line = 483)
    private final void method1752(int arg0) {
        this.field4097 = new class199(this.field4090.method1404(true));
        field4092++;
        if (arg0 == 256) {
            for (class60 var2 = (class60) this.field4090.method1400(-1); var2 != null; var2 = (class60) this.field4090.method1403(arg0 ^ 0x178)) {
                class158 var3 = new class158(var2.field1144, (int) var2.field5149);
                this.field4097.method1396(-19928, var2.field1144.method329(65), var3);
            }
        }
    }
}

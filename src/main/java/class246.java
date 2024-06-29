import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class246 extends class433 {

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    private int field3469 = 0;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Z")
    private boolean field3482 = false;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    private int field3490 = 0;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    private int field3491 = 0;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    private int field3494 = 0;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    private int field3492;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    private int field3487;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Ltu;")
    private class294 field3483;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lica;")
    private class579 field3468;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Z")
    private boolean field3480;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Z")
    private boolean field3486;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Z")
    private boolean field3474;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Z")
    private boolean field3485;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
    public static int[] field3470 = new int[25];

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field3484 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lkea;BLtq;)V")
    public static final void method1630(class203 arg0, byte arg1, class545 arg2) {
        class421.field6307 = "";
        class410.field6246 = arg2;
        int var3 = -96 / ((-arg1 - 48) / 63);
        class353.field5026 = arg0;
        field3498++;
        if (class545.field7788.startsWith("win")) {
            class421.field6307 = class421.field6307 + "windows/";
        } else if (class545.field7788.startsWith("linux")) {
            class421.field6307 = class421.field6307 + "linux/";
        } else if (class545.field7788.startsWith("mac")) {
            class421.field6307 = class421.field6307 + "macos/";
        }
        if (class410.field6246.field7802) {
            class421.field6307 = class421.field6307 + "msjava/";
        } else if (class545.field7806.startsWith("amd64") || class545.field7806.startsWith("x86_64")) {
            class421.field6307 = class421.field6307 + "x86_64/";
        } else if (class545.field7806.startsWith("i386") || class545.field7806.startsWith("i486") || class545.field7806.startsWith("i586") || class545.field7806.startsWith("x86")) {
            class421.field6307 = class421.field6307 + "x86/";
        } else if (class545.field7806.startsWith("ppc")) {
            class421.field6307 = class421.field6307 + "ppc/";
        } else {
            class421.field6307 = class421.field6307 + "universal/";
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "()I")
    public final int method1576() {
        field3478++;
        return this.field3492;
    }

    @OriginalMember(owner = "client!sb", name = "EA", descriptor = "(IIII)V")
    public final void method1580(int arg0, int arg1, int arg2, int arg3) {
        this.field3490 = arg1;
        field3479++;
        this.field3491 = arg2;
        this.field3494 = arg0;
        this.field3469 = arg3;
        this.field3482 = this.field3494 != 0 || this.field3490 != 0 || this.field3491 != 0 || this.field3469 != 0;
    }

    @OriginalMember(owner = "client!sb", name = "sa", descriptor = "(FFFFFFIII)V")
    public final void method1583(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field3473++;
        class646 var10 = this.field3483.method1898(false);
        class646 var11 = this.field3483.method1930(1);
        this.field3468.method154(this.field3480 || this.field3486 ? class570.field8217 : class450.field6724, -8457);
        this.field3483.method1963((byte) 125);
        this.field3483.method1971((byte) -82, this.field3468);
        this.field3483.method1961(arg8, 11557);
        this.field3483.method1904(arg6, -122);
        this.field3483.method1970(90, class173.field2123, 1);
        this.field3483.method1907(class173.field2123, true, 1);
        this.field3483.method1939(arg7, true);
        if (this.field3482) {
            float var12 = (float) this.method1577();
            float var13 = (float) this.method1568();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field3490 * var16;
            float var19 = (float) this.field3490 * var17;
            float var20 = (float) this.field3494 * var14;
            float var21 = (float) this.field3494 * var15;
            float var22 = (float) this.field3491 * -var14;
            float var23 = (float) this.field3491 * -var15;
            float var24 = (float) this.field3469 * -var16;
            arg1 = arg1 + var21 + var19;
            arg0 = arg0 + var20 + var18;
            arg3 = arg3 + var23 + var19;
            arg2 = arg2 + var22 + var18;
            float var25 = (float) this.field3469 * -var17;
            arg4 = arg4 + var20 + var24;
            arg5 = arg5 + var21 + var25;
        }
        var10.method3693(0.0F, 1.0F, 0.0F, 0.0F, arg4 - arg0, 0.0F, (byte) 122, arg3 - arg1, -arg1 + arg5, arg2 - arg0);
        var10.method3692(arg0, arg1, 0.0F, 0);
        var11.method3705(1.0F, this.field3468.method473(false, (float) this.field3487), -1, this.field3468.method474(-99, (float) this.field3492));
        this.field3483.method1935(class199.field2681, true);
        this.field3483.method1959(8769);
        this.field3483.method1925((byte) 55);
        this.field3483.method1950(7869);
        this.field3483.method1970(-101, class577.field8332, 1);
        this.field3483.method1907(class577.field8332, true, 1);
    }

    @OriginalMember(owner = "client!sb", name = "AA", descriptor = "()I")
    public final int method1577() {
        field3472++;
        return this.field3487 + this.field3491 + this.field3494;
    }

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "(IIIII)V")
    public final void method1571(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3493++;
        class646 var6 = this.field3483.method1898(false);
        class646 var7 = this.field3483.method1930(1);
        int var8 = this.field3494 + arg0;
        int var9 = this.field3490 + arg1;
        this.field3468.method154(class570.field8217, -8457);
        this.field3483.method1963((byte) 120);
        this.field3483.method1971((byte) -112, this.field3468);
        this.field3483.method1961(arg4, 11557);
        this.field3483.method1904(arg2, -123);
        this.field3483.method1970(15, class173.field2123, 1);
        this.field3483.method1907(class173.field2123, true, 1);
        this.field3483.method1939(arg3, true);
        var6.method3705(0.0F, (float) this.field3487, -1, (float) this.field3492);
        var6.method2006(var8, var9, 0);
        var7.method3705(1.0F, this.field3468.method473(false, (float) this.field3487), -1, this.field3468.method474(56, (float) this.field3492));
        this.field3483.method1935(class199.field2681, true);
        this.field3483.method1959(8769);
        this.field3483.method1925((byte) 107);
        this.field3483.method1950(7869);
        this.field3483.method1970(41, class577.field8332, 1);
        this.field3483.method1907(class577.field8332, true, 1);
    }

    @OriginalMember(owner = "client!sb", name = "GA", descriptor = "(IIIIII)V")
    public final void method1581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3476++;
        int[] var7 = this.field3483.method405(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class283.method1834(var7[var8], -16777216);
            }
            this.method1632(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!sb", name = "QA", descriptor = "()I")
    public final int method1570() {
        field3471++;
        return this.field3487;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()I")
    public final int method1568() {
        field3488++;
        return this.field3492 - (-this.field3490 - this.field3469);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILfa;II)V")
    public final void method1572(int arg0, int arg1, class199 arg2, int arg3, int arg4) {
        field3477++;
        class50 var6 = (class50) arg2;
        class579 var7 = var6.field532;
        int var8 = this.field3490 + arg1;
        int var9 = this.field3494 + arg0;
        this.field3468.method154(class570.field8217, -8457);
        this.field3483.method1963((byte) 119);
        this.field3483.method1971((byte) -83, this.field3468);
        this.field3483.method1961(1, 11557);
        this.field3483.method1904(1, -117);
        class646 var10 = this.field3483.method1898(false);
        var10.method3705(0.0F, (float) this.field3487, -1, (float) this.field3492);
        var10.method2006(var9, var8, 0);
        this.field3483.method1959(8769);
        class646 var11 = this.field3483.method1930(1);
        var11.method3705(1.0F, this.field3468.method473(false, (float) this.field3487), -1, this.field3468.method474(-121, (float) this.field3492));
        this.field3483.method1935(class199.field2681, true);
        this.field3483.method1957(-2, 1);
        this.field3483.method1971((byte) -55, var7);
        this.field3483.method1912(class457.field6837, class274.field3839, 118);
        this.field3483.method1970(-101, class577.field8332, 0);
        class646 var12 = this.field3483.method1930(1);
        var12.method3705(1.0F, var7.method473(false, (float) this.field3487), -1, var7.method474(82, (float) this.field3492));
        var12.method3692(var7.method473(false, (float) (var9 - arg3)), var7.method474(-94, (float) (var8 - arg4)), 0.0F, 0);
        this.field3483.method1935(class199.field2681, true);
        this.field3483.method1925((byte) 113);
        this.field3483.method1950(7869);
        this.field3483.method1970(-112, class83.field935, 0);
        this.field3483.method1912(class457.field6837, class457.field6837, -81);
        this.field3483.method1971((byte) -79, null);
        this.field3483.method1957(-2, 0);
        this.field3483.method1950(7869);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static final void method1631(int arg0) {
        field3481++;
        int var1 = class112.field1382 * 512 + 256;
        int var2 = class438.field6516 * 512 + 256;
        int var3 = class399.method2547(var2, var1, (byte) 45, class226.field3179) - class126.field1559;
        if (class359.field5092 >= 100) {
            class207.field2781 = class438.field6516 * 512 + 256;
            class337.field4821 = class112.field1382 * 512 + 256;
            class100.field1192 = class399.method2547(class207.field2781, class337.field4821, (byte) -125, class226.field3179) - class126.field1559;
        } else {
            if (var1 > class337.field4821) {
                class337.field4821 += (var1 - class337.field4821) * class359.field5092 / 1000 + class258.field3681;
                if (class337.field4821 > var1) {
                    class337.field4821 = var1;
                }
            }
            if (var1 < class337.field4821) {
                class337.field4821 -= (class337.field4821 - var1) * class359.field5092 / 1000 + class258.field3681;
                if (class337.field4821 < var1) {
                    class337.field4821 = var1;
                }
            }
            if (class100.field1192 < var3) {
                class100.field1192 += (var3 - class100.field1192) * class359.field5092 / 1000 + class258.field3681;
                if (var3 < class100.field1192) {
                    class100.field1192 = var3;
                }
            }
            if (var3 < class100.field1192) {
                class100.field1192 -= (class100.field1192 - var3) * class359.field5092 / 1000 + class258.field3681;
                if (var3 > class100.field1192) {
                    class100.field1192 = var3;
                }
            }
            if (var2 > class207.field2781) {
                class207.field2781 += (var2 - class207.field2781) * class359.field5092 / 1000 + class258.field3681;
                if (var2 < class207.field2781) {
                    class207.field2781 = var2;
                }
            }
            if (class207.field2781 > var2) {
                class207.field2781 -= (class207.field2781 - var2) * class359.field5092 / 1000 + class258.field3681;
                if (class207.field2781 < var2) {
                    class207.field2781 = var2;
                }
            }
        }
        int var4 = class67.field743 * 512 + 256;
        int var5 = class100.field1195 * 512 + 256;
        int var6 = class399.method2547(var5, var4, (byte) -38, class226.field3179) - class108.field1313;
        int var7 = var4 - class337.field4821;
        int var8 = var6 - class100.field1192;
        int var9 = var5 - class207.field2781;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class309.field4550) {
            class309.field4550 += (var11 - class309.field4550 >> 3) * class468.field6956 / 1000 + class622.field8997 << 3;
            if (var11 < class309.field4550) {
                class309.field4550 = var11;
            }
        }
        if (var11 < class309.field4550) {
            class309.field4550 -= class622.field8997 + ((class309.field4550 - var11 >> 3) * class468.field6956 / 1000) << 3;
            if (class309.field4550 < var11) {
                class309.field4550 = var11;
            }
        }
        int var13 = var12 - class17.field177;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class17.field177 += class468.field6956 * var14 / 1000 + class622.field8997 << 3;
            class17.field177 &= 0x3FFF;
        }
        if (var14 < 0) {
            class17.field177 -= class622.field8997 + (-var14 * class468.field6956 / 1000) << 3;
            class17.field177 &= 0x3FFF;
        }
        int var15 = var12 - class17.field177;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (arg0 >= -71) {
            method1634(86);
        }
        class474.field7009 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class17.field177 = var12;
        }
    }

    @OriginalMember(owner = "client!sb", name = "KA", descriptor = "(IIIIIII)V")
    public final void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3475++;
        class646 var8 = this.field3483.method1898(false);
        class646 var9 = this.field3483.method1930(1);
        this.field3468.method154(this.field3480 || this.field3486 ? class570.field8217 : class450.field6724, -8457);
        this.field3483.method1963((byte) 119);
        this.field3483.method1971((byte) -64, this.field3468);
        this.field3483.method1961(arg6, 11557);
        this.field3483.method1904(arg4, -127);
        this.field3483.method1970(61, class173.field2123, 1);
        this.field3483.method1907(class173.field2123, true, 1);
        this.field3483.method1939(arg5, true);
        var9.method3705(1.0F, this.field3468.method473(false, (float) this.field3487), -1, this.field3468.method474(-96, (float) this.field3492));
        if (this.field3482) {
            arg2 = this.field3487 * arg2 / this.method1577();
            arg3 = this.field3492 * arg3 / this.method1568();
            arg0 += this.field3494 * arg2 / this.field3487;
            arg1 += this.field3490 * arg3 / this.field3492;
        }
        var8.method3705(0.0F, (float) arg2, -1, (float) arg3);
        var8.method2006(arg0, arg1, 0);
        this.field3483.method1935(class199.field2681, true);
        this.field3483.method1959(8769);
        this.field3483.method1925((byte) 39);
        this.field3483.method1950(7869);
        this.field3483.method1970(63, class577.field8332, 1);
        this.field3483.method1907(class577.field8332, true, 1);
    }

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "(III)V")
    public final void method1569(int arg0, int arg1, int arg2) {
        field3496++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII[III)V")
    private final void method1632(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field3468.method471(arg5, arg0, arg6, arg2, 5218, arg1, arg4, arg3);
        field3495++;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static void method1633(int arg0) {
        if (arg0 != 3072) {
            field3484 = -2;
        }
        field3470 = null;
    }

    @OriginalMember(owner = "client!sb", name = "ba", descriptor = "(IIIIIII)V")
    public final void method1574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3497++;
        class646 var8 = this.field3483.method1898(false);
        class646 var9 = this.field3483.method1930(1);
        this.field3468.method154(class570.field8217, -8457);
        this.field3483.method1963((byte) 119);
        this.field3483.method1971((byte) -98, this.field3468);
        this.field3483.method1961(arg6, 11557);
        this.field3483.method1904(arg4, -123);
        this.field3483.method1970(-108, class173.field2123, 1);
        this.field3483.method1907(class173.field2123, true, 1);
        this.field3483.method1939(arg5, true);
        boolean var10 = this.field3485 && this.field3490 == 0 && this.field3469 == 0;
        boolean var11 = this.field3474 && this.field3494 == 0 && this.field3491 == 0;
        if (var10 & var11) {
            var9.method3705(1.0F, this.field3468.method473(false, (float) arg2), -1, this.field3468.method474(-109, (float) arg3));
            var8.method3705(0.0F, (float) arg2, -1, (float) arg3);
            var8.method2006(arg0, arg1, 0);
            this.field3483.method1935(class199.field2681, true);
            this.field3483.method1959(8769);
            this.field3483.method1925((byte) 110);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method1568();
            var9.method3705(1.0F, this.field3468.method473(false, (float) arg2), -1, this.field3468.method474(-119, (float) this.field3492));
            this.field3483.method1935(class199.field2681, true);
            int var14 = this.field3490 + arg1;
            for (int var15 = this.field3492 + var14; var15 <= var12; var15 += var13) {
                var8.method3705(0.0F, (float) arg2, -1, (float) this.field3492);
                var8.method2006(arg0, var14, 0);
                this.field3483.method1959(8769);
                this.field3483.method1925((byte) 106);
                var14 += var13;
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method3705(1.0F, this.field3468.method473(false, (float) arg2), -1, this.field3468.method474(74, (float) var16));
                this.field3483.method1935(class199.field2681, true);
                var8.method3705(0.0F, (float) arg2, -1, (float) var16);
                var8.method2006(arg0, var14, 0);
                this.field3483.method1959(8769);
                this.field3483.method1925((byte) 90);
            }
        } else if (var10) {
            int var17 = arg0 + arg2;
            int var18 = this.method1577();
            var9.method3705(1.0F, this.field3468.method473(false, (float) this.field3487), -1, this.field3468.method474(115, (float) arg3));
            this.field3483.method1935(class199.field2681, true);
            int var19 = this.field3494 + arg0;
            int var20 = this.field3487 + var19;
            while (var20 <= var17) {
                var8.method3705(0.0F, (float) this.field3487, -1, (float) arg3);
                var8.method2006(var19, arg1, 0);
                this.field3483.method1959(8769);
                var19 += var18;
                var20 += var18;
                this.field3483.method1925((byte) -86);
            }
            if (var17 > var19) {
                int var21 = var17 - var19;
                var9.method3705(1.0F, this.field3468.method473(false, (float) var21), -1, this.field3468.method474(87, (float) arg3));
                this.field3483.method1935(class199.field2681, true);
                var8.method3705(0.0F, (float) var21, -1, (float) arg3);
                var8.method2006(var19, arg1, 0);
                this.field3483.method1959(8769);
                this.field3483.method1925((byte) -115);
            }
        } else {
            int var22 = arg1 + arg3;
            int var23 = arg0 + arg2;
            int var24 = this.method1577();
            int var25 = this.method1568();
            int var26 = arg1 + this.field3490;
            for (int var27 = var26 + this.field3492; var27 <= var22; var27 += var25) {
                var9.method3705(1.0F, this.field3468.method473(false, (float) this.field3487), -1, this.field3468.method474(111, (float) this.field3492));
                this.field3483.method1935(class199.field2681, true);
                int var32 = this.field3494 + arg0;
                for (int var33 = this.field3487 + var32; var33 <= var23; var33 += var24) {
                    var8.method3705(0.0F, (float) this.field3487, -1, (float) this.field3492);
                    var8.method2006(var32, var26, 0);
                    this.field3483.method1959(8769);
                    var32 += var24;
                    this.field3483.method1925((byte) 74);
                }
                if (var32 < var23) {
                    int var34 = var23 - var32;
                    var9.method3705(1.0F, this.field3468.method473(false, (float) var34), -1, this.field3468.method474(-96, (float) this.field3492));
                    this.field3483.method1935(class199.field2681, true);
                    var8.method3705(0.0F, (float) var34, -1, (float) this.field3492);
                    var8.method2006(var32, var26, 0);
                    this.field3483.method1959(8769);
                    this.field3483.method1925((byte) 115);
                }
                var26 += var25;
            }
            if (var26 < var22) {
                int var28 = var22 - var26;
                var9.method3705(1.0F, this.field3468.method473(false, (float) this.field3487), -1, this.field3468.method474(-104, (float) var28));
                this.field3483.method1935(class199.field2681, true);
                int var29 = this.field3494 + arg0;
                int var30 = this.field3487 + var29;
                while (var23 >= var30) {
                    var8.method3705(0.0F, (float) this.field3487, -1, (float) var28);
                    var8.method2006(var29, var26, 0);
                    this.field3483.method1959(8769);
                    this.field3483.method1925((byte) 127);
                    var30 += var24;
                    var29 += var24;
                }
                if (var29 < var23) {
                    int var31 = var23 - var29;
                    var9.method3705(1.0F, this.field3468.method473(false, (float) var31), -1, this.field3468.method474(96, (float) var28));
                    this.field3483.method1935(class199.field2681, true);
                    var8.method3705(0.0F, (float) var31, -1, (float) var28);
                    var8.method2006(var29, var26, 0);
                    this.field3483.method1959(8769);
                    this.field3483.method1925((byte) -72);
                }
            }
        }
        this.field3483.method1950(7869);
        this.field3483.method1970(95, class577.field8332, 1);
        this.field3483.method1907(class577.field8332, true, 1);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public static final void method1634(int arg0) {
        for (int var1 = arg0; var1 < class443.field6617.length; var1++) {
            for (int var2 = 0; var2 < class443.field6617[0].length; var2++) {
                for (int var3 = 0; var3 < class443.field6617[0][0].length; var3++) {
                    class443.field6617[var1][var2][var3] = 0;
                }
            }
        }
        field3467++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method1578(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class199 arg6, int arg7, int arg8) {
        field3489++;
        class646 var10 = this.field3483.method1898(false);
        class646 var11 = this.field3483.method1930(1);
        class50 var12 = (class50) arg6;
        class579 var13 = var12.field532;
        this.field3468.method154(class450.field6724, -8457);
        this.field3483.method1963((byte) 119);
        this.field3483.method1971((byte) -73, this.field3468);
        this.field3483.method1961(1, 11557);
        this.field3483.method1904(1, -122);
        if (this.field3482) {
            float var14 = (float) this.field3487 / (float) this.method1577();
            float var15 = (float) this.field3492 / (float) this.method1568();
            var10.method3693(0.0F, 1.0F, 0.0F, 0.0F, (arg4 - arg0) * var15, 0.0F, (byte) 122, (arg3 - arg1) * var14, (arg5 - arg1) * var15, (arg2 - arg0) * var14);
            var10.method3692(((float) this.field3494 + arg0) * var14, ((float) this.field3490 + arg1) * var15, 0.0F, 0);
        } else {
            var10.method3693(0.0F, 1.0F, 0.0F, 0.0F, arg4 - arg0, 0.0F, (byte) 122, arg3 - arg1, arg5 - arg1, arg2 - arg0);
            var10.method3692(arg0, arg1, 0.0F, 0);
        }
        var11.method3705(1.0F, this.field3468.method473(false, (float) this.field3487), -1, this.field3468.method474(-108, (float) this.field3492));
        this.field3483.method1935(class199.field2681, true);
        this.field3483.method1957(-2, 1);
        this.field3483.method1971((byte) -58, var13);
        this.field3483.method1912(class457.field6837, class274.field3839, 94);
        this.field3483.method1970(-95, class577.field8332, 0);
        class646 var16 = this.field3483.method1930(1);
        var16.method2004(var10);
        var16.method2006(-arg7, -arg8, 0);
        var16.method3694(-90, var13.method473(false, 1.0F), var13.method474(-113, 1.0F), 1.0F);
        this.field3483.method1935(class199.field2681, true);
        this.field3483.method1959(8769);
        this.field3483.method1925((byte) 39);
        this.field3483.method1950(7869);
        this.field3483.method1970(-125, class83.field935, 0);
        this.field3483.method1912(class457.field6837, class457.field6837, -2);
        this.field3483.method1971((byte) -111, null);
        this.field3483.method1957(-2, 0);
        this.field3483.method1950(7869);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Ltu;IIZ)V")
    public class246(class294 arg0, int arg1, int arg2, boolean arg3) {
        this.field3492 = arg2;
        this.field3487 = arg1;
        this.field3483 = arg0;
        this.field3468 = arg0.method1555(arg3 ? class538.field7742 : class602.field8784, class256.field3653, arg1, arg2, -8);
        this.field3480 = arg1 != this.field3468.method470(5742);
        this.field3486 = arg2 != this.field3468.method475(85);
        this.field3474 = !this.field3480 && this.field3468.method472(-23679);
        this.field3485 = !this.field3486 && this.field3468.method472(-23679);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Ltu;II[III)V")
    public class246(class294 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3487 = arg1;
        this.field3483 = arg0;
        this.field3492 = arg2;
        this.field3468 = arg0.method1549(10, false, arg4, arg2, arg5, arg3, arg1);
        this.field3480 = this.field3468.method470(5742) != arg1;
        this.field3486 = arg2 != this.field3468.method475(53);
        this.field3474 = !this.field3480 && this.field3468.method472(-23679);
        this.field3485 = !this.field3486 && this.field3468.method472(-23679);
    }
}

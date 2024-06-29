import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class21 {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Llm;")
    private class202 field224;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Lck;")
    private class267 field236;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lhb;")
    private class302 field237;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static volatile int field231 = 0;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Lrb;")
    public static class143 field233 = new class143(16);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lhc;")
    private class53 field226;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "[Lge;")
    private class299[] field238;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "[S")
    public static short[] field225;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static final void method145(byte arg0) {
        if (arg0 != 10) {
            field225 = null;
        }
        class272.field4399.method1420((byte) 111);
        class14.field161.method1420((byte) 114);
        class287.field4595.method1420((byte) 124);
        field232++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public final void method146(int arg0) {
        field235++;
        if (this.field238 == null) {
            return;
        }
        if (arg0 != 104) {
            this.field226 = null;
        }
        for (int var2 = 0; var2 < this.field238.length; var2++) {
            if (this.field238[var2] != null) {
                this.field238[var2].method2035(arg0 - 12660);
            }
        }
        for (int var3 = 0; var3 < this.field238.length; var3++) {
            if (this.field238[var3] != null) {
                this.field238[var3].method2037((byte) 1);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILea;ZLea;B)Lge;")
    private final class299 method147(int arg0, class224 arg1, boolean arg2, class224 arg3, byte arg4) {
        field228++;
        if (this.field226 == null) {
            throw new RuntimeException();
        }
        this.field226.field735 = arg0 * 8 + 5;
        if (this.field226.field758.length <= this.field226.field735) {
            throw new RuntimeException();
        } else if (this.field238[arg0] == null) {
            int var6 = this.field226.method340(-100);
            int var7 = this.field226.method340(-124);
            class299 var8 = new class299(arg0, arg1, arg3, this.field236, this.field224, var6, var7, arg2);
            if (arg4 > -56) {
                this.field224 = null;
            }
            this.field238[arg0] = var8;
            return var8;
        } else {
            return this.field238[arg0];
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static void method148(int arg0) {
        field225 = null;
        field233 = null;
        if (arg0 != 128) {
            field231 = -63;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIZIIIZI)V")
    public static final void method149(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field230++;
        if (!arg6 && class304.field4925 == arg3 && class180.field2713 == arg7 && class280.field4510 == arg1 || class273.method1903(arg0 + 24494)) {
            return;
        }
        class304.field4925 = arg3;
        class180.field2713 = arg7;
        class280.field4510 = arg1;
        if (class273.method1903(100)) {
            class280.field4510 = 0;
        }
        if (arg2) {
            class79.method586(arg0 ^ 0x5F49, 28);
        } else {
            class79.method586(-1, 25);
        }
        class306.method2078(arg0 + 24317, class214.field3146, true);
        int var8 = class149.field2390;
        int var9 = class163.field2520;
        class149.field2390 = (arg7 - 6) * 8;
        class163.field2520 = (arg3 - 6) * 8;
        class279.field4502 = class46.method290(class304.field4925 * 8, class180.field2713 * 8);
        int var10 = class163.field2520 - var9;
        class199.field2937 = null;
        int var11 = class163.field2520;
        int var12 = class149.field2390 - var8;
        int var13 = class149.field2390;
        if (arg2) {
            class12.field135 = 0;
            for (int var14 = 0; var14 < 32768; var14++) {
                class12 var15 = class255.field3856[var14];
                if (var15 != null) {
                    var15.field3660 -= var10 * 128;
                    var15.field3753 -= var12 * 128;
                    if (var15.field3660 >= 0 && var15.field3660 <= 13184 && var15.field3753 >= 0 && var15.field3753 <= 13184) {
                        for (int var16 = 0; var16 < 10; var16++) {
                            var15.field3761[var16] -= var10;
                            var15.field3686[var16] -= var12;
                        }
                        class14.field159[class12.field135++] = var14;
                    } else {
                        class255.field3856[var14].method90(-1, (class102) null);
                        class255.field3856[var14] = null;
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < 32768; var17++) {
                class12 var33 = class255.field3856[var17];
                if (var33 != null) {
                    for (int var34 = 0; var34 < 10; var34++) {
                        var33.field3761[var34] -= var10;
                        var33.field3686[var34] -= var12;
                    }
                    var33.field3753 -= var12 * 128;
                    var33.field3660 -= var10 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class207 var31 = class92.field1475[var18];
            if (var31 != null) {
                for (int var32 = 0; var32 < 10; var32++) {
                    var31.field3761[var32] -= var10;
                    var31.field3686[var32] -= var12;
                }
                var31.field3753 -= var12 * 128;
                var31.field3660 -= var10 * 128;
            }
        }
        class37.field474 = arg1;
        byte var19 = 0;
        class213.field3139.method1466(arg4, arg5, false, (byte) 80);
        byte var20 = 1;
        byte var21 = 104;
        byte var22 = 0;
        byte var23 = 1;
        byte var24 = 104;
        if (var12 < 0) {
            var21 = -1;
            var23 = -1;
            var22 = 103;
        }
        if (var10 < 0) {
            var20 = -1;
            var19 = 103;
            var24 = -1;
        }
        for (int var25 = var19; var25 != var24; var25 += var20) {
            for (int var27 = var22; var27 != var21; var27 += var23) {
                int var28 = var10 + var25;
                int var29 = var12 + var27;
                for (int var30 = 0; var30 < 4; var30++) {
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        class37.field475[var30][var25][var27] = class37.field475[var30][var28][var29];
                    } else {
                        class37.field475[var30][var25][var27] = null;
                    }
                }
            }
        }
        for (class293 var26 = (class293) class222.field3228.method8(-84); var26 != null; var26 = (class293) class222.field3228.method12((byte) 69)) {
            var26.field4655 -= var10;
            var26.field4663 -= var12;
            if (var26.field4655 < 0 || var26.field4663 < 0 || var26.field4655 >= 104 || var26.field4663 >= 104) {
                var26.method1781(5250);
            }
        }
        if (class113.field1883 != 0) {
            class255.field3855 -= var12;
            class113.field1883 -= var10;
        }
        if (arg0 != -24394) {
            method148(38);
        }
        class43.field571 = 0;
        if (arg2) {
            class260.field4024 -= var12 * 128;
            class162.field2509 -= var10;
            class20.field220 -= var10;
            class121.field2001 -= var12;
            class93.field1533 -= var10 * 128;
            class299.field4827 -= var12;
        } else {
            class119.field1931 = 1;
        }
        class292.method1986(0);
        class126.field2123.method5(32);
        class110.field1836.method5(arg0 ^ 0xFFFFA096);
        class88.method665();
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Z")
    public final boolean method150(boolean arg0) {
        if (!arg0) {
            field231 = 122;
        }
        field239++;
        if (this.field226 != null) {
            return true;
        }
        if (this.field237 == null) {
            if (this.field236.method1832((byte) -15)) {
                return false;
            }
            this.field237 = this.field236.method1830(255, (byte) 0, 255, 109, true);
        }
        if (this.field237.field2341) {
            return false;
        } else {
            this.field226 = new class53(this.field237.method222((byte) -111));
            this.field238 = new class299[(this.field226.field758.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILea;ILea;)Lge;")
    public final class299 method151(int arg0, class224 arg1, int arg2, class224 arg3) {
        if (arg2 == 4070) {
            field234++;
            return this.method147(arg0, arg3, true, arg1, (byte) -76);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Llc;Llc;ZB)V")
    public static final void method152(class270 arg0, class270 arg1, boolean arg2, byte arg3) {
        class195.field2873 = arg2;
        class147.field2374 = arg1;
        class217.field3181 = arg0;
        field229++;
        if (arg3 <= 37) {
            field231 = -93;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lck;Llm;)V")
    public class21(class267 arg0, class202 arg1) {
        this.field224 = arg1;
        this.field236 = arg0;
        if (!this.field236.method1832((byte) -15)) {
            this.field237 = this.field236.method1830(255, (byte) 0, 255, 124, true);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZ)V")
    public static final void method153(boolean arg0, boolean arg1) {
        if (arg1) {
            if (class1.field17 != -1) {
                class275.method1913(50, class1.field17);
            }
            for (class133 var2 = (class133) class251.field3793.method1071(-127); var2 != null; var2 = (class133) class251.field3793.method1069(-123)) {
                class35.method226(var2, true, -105);
            }
            class1.field17 = -1;
            class251.field3793 = new class143(8);
            class272.method1898(-27077);
            class1.field17 = class151.field2396;
            class110.method840(0, false);
            class172.method1216(-101);
            class191.method1353(0, class1.field17);
        }
        field227++;
        if (!arg0) {
            method153(false, true);
        }
        class212.field3119 = -1;
        class287.method1963((byte) -41, class298.field4792);
        class213.field3139 = new class207();
        class213.field3139.field3660 = 3000;
        class213.field3139.field3753 = 3000;
        if (class121.field1986 == 0) {
            class123.method947(class191.field2827, false);
            class79.method586(-1, 10);
            return;
        }
        if (class119.field1931 == 2) {
            class93.field1533 = class20.field220 << 7;
            class260.field4024 = class299.field4827 << 7;
        } else {
            class293.method1992(true);
        }
        class226.method1566((byte) -104);
        class79.method586(-1, 28);
    }
}

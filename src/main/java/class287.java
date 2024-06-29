import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class287 extends class390 {

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    private int field3964 = 0;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "Z")
    public boolean field3971 = false;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "Z")
    private boolean field3984 = false;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "J")
    private long field3967;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Lpd;")
    public class140 field3977;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Ljl;")
    public class147 field3955;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "Lsq;")
    public class97 field3968;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "Lre;")
    public class357 field3957;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "Lbr;")
    public static class223 field3986 = new class223(512);

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    private int field3953;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public int field3954;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    private int field3956;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    private int field3958;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    private int field3960;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    private int field3961;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    private int field3962;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    private int field3965;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    private int field3969;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    private int field3970;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    private int field3972;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    private int field3974;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    private int field3976;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    private int field3978;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    private int field3980;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    public int field3983;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    private int field3985;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public int field3987;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    private int field3988;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Lqj;")
    public static class296 field3952;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "Lqj;")
    public static class296 field3989;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V", line = 11)
    public final void method1852(int arg0) {
        this.field3956 = this.field3977.field2001;
        field3982++;
        this.field3976 = this.field3977.field2000;
        this.field3988 = this.field3977.field1997;
        this.field3974 = this.field3977.field1989;
        this.field3962 = this.field3977.field1999;
        this.field3970 = this.field3977.field1988;
        this.field3978 = this.field3977.field1990;
        this.field3961 = this.field3977.field1994;
        this.field3960 = this.field3977.field2002;
        if (this.field3974 == this.field3962 && this.field3988 == this.field3974 && this.field3978 == this.field3970 && this.field3970 == this.field3961 && this.field3976 == this.field3956 && this.field3976 == this.field3960) {
            this.field3984 = true;
            return;
        }
        this.field3984 = false;
        int var2 = (this.field3988 + this.field3962 + this.field3974) / 3;
        int var3 = 72 / ((73 - arg0) / 32);
        int var4 = (this.field3978 + this.field3961 + this.field3970) / 3;
        int var5 = (this.field3976 + this.field3956 + this.field3960) / 3;
        if (this.field3975 == var2 && this.field3987 == var4 && this.field3983 == var5) {
            return;
        }
        this.field3983 = var5;
        this.field3975 = var2;
        this.field3987 = var4;
        int var6 = this.field3974 - this.field3962;
        int var7 = this.field3970 - this.field3978;
        int var8 = this.field3976 - this.field3956;
        int var9 = this.field3988 - this.field3962;
        int var10 = this.field3961 - this.field3978;
        int var11 = this.field3960 - this.field3956;
        this.field3985 = var7 * var11 - (var8 * var10);
        this.field3965 = var6 * var10 - (var7 * var9);
        for (this.field3972 = var8 * var9 - (var6 * var11); this.field3985 > 32767 || this.field3972 > 32767 || this.field3965 > 32767 || this.field3985 < -32767 || this.field3972 < -32767 || this.field3965 < -32767; this.field3972 >>= 0x1) {
            this.field3985 >>= 0x1;
            this.field3965 >>= 0x1;
        }
        int var12 = (int) Math.sqrt((double) (this.field3965 * this.field3965 + this.field3985 * this.field3985 + this.field3972 * this.field3972));
        if (var12 <= 0) {
            var12 = 1;
        }
        this.field3985 = this.field3985 * 32767 / var12;
        this.field3972 = this.field3972 * 32767 / var12;
        this.field3965 = this.field3965 * 32767 / var12;
        if (this.field3968.field1444 <= 0 && this.field3968.field1471 <= 0) {
            return;
        }
        int var13 = (int) (Math.atan2((double) this.field3965, (double) this.field3985) * 2607.5945876176133D);
        int var14 = (int) (Math.atan2((double) this.field3972, Math.sqrt((double) (this.field3985 * this.field3985 + this.field3965 * this.field3965))) * 2607.5945876176133D);
        this.field3953 = this.field3968.field1444 - this.field3968.field1496;
        this.field3958 = this.field3968.field1471 - this.field3968.field1490;
        this.field3980 = this.field3968.field1496 + var13 - (this.field3953 >> 1);
        this.field3969 = var14 + this.field3968.field1490 - (this.field3958 >> 1);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Laa;JIIZ)V", line = 101)
    public final void method1853(class281 arg0, long arg1, int arg2, int arg3, boolean arg4) {
        field3979++;
        if (arg3 != 2410) {
            this.field3957 = null;
        }
        if (this.field3971) {
            arg4 = false;
        } else if (this.field3968.field1450 > class451.field6572) {
            arg4 = false;
        } else if (class271.field3703[class451.field6572] < class267.field3643) {
            arg4 = false;
        } else if (this.field3984) {
            arg4 = false;
        } else if (this.field3968.field1494 != -1) {
            int var7 = (int) (arg1 - this.field3967);
            if (this.field3968.field1493 || this.field3968.field1494 >= var7) {
                var7 %= this.field3968.field1494;
            } else {
                arg4 = false;
            }
            if (!this.field3968.field1438 && this.field3968.field1464 > var7) {
                arg4 = false;
            }
            if (this.field3968.field1438 && this.field3968.field1464 <= var7) {
                arg4 = false;
            }
        }
        if (arg4) {
            this.field3964 += (int) (((double) this.field3968.field1466 + (double) (this.field3968.field1491 - this.field3968.field1466) * Math.random()) * (double) arg2);
            if (this.field3964 > 63) {
                int var8 = this.field3964 >> 6;
                this.field3964 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field3968.field1444 <= 0 && this.field3968.field1471 <= 0) {
                        var10 = this.field3972;
                        var11 = this.field3985;
                        var12 = this.field3965;
                    } else {
                        int var13 = this.field3980 + ((int) ((double) this.field3953 * Math.random()));
                        int var14 = var13 & 0x3FFF;
                        int var15 = class362.field5083[var14];
                        int var16 = class362.field5082[var14];
                        int var17 = (int) (Math.random() * (double) this.field3958) + this.field3969;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class362.field5083[var18];
                        int var20 = class362.field5082[var18];
                        var11 = var16 * var19 >> 15;
                        var10 = var20 * -1;
                        var12 = var15 * var19 >> 15;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if (var21 + var22 > 65535) {
                        var21 = 65535 - var21;
                        var22 = 65535 - var22;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field3988 * var23 + this.field3962 * var21 + (this.field3974 * var22) >> 16;
                    int var25 = this.field3970 * var22 + this.field3978 * var21 + this.field3961 * var23 >> 16;
                    int var26 = this.field3960 * var23 + this.field3976 * var22 + this.field3956 * var21 >> 16;
                    int var27 = this.field3968.field1475 + ((int) ((double) (this.field3968.field1472 - this.field3968.field1475) * Math.random()));
                    int var28 = this.field3968.field1457 + ((int) ((double) (this.field3968.field1458 - this.field3968.field1457) * Math.random()));
                    int var29 = this.field3968.field1470 + (int) (Math.random() * (double) (this.field3968.field1495 - this.field3968.field1470));
                    int var32;
                    if (this.field3968.field1447) {
                        double var30 = Math.random();
                        var32 = (int) ((double) this.field3968.field1451 * var30 + (double) this.field3968.field1437) << 24 | (int) ((double) this.field3968.field1469 * var30 + (double) this.field3968.field1467) << 16 | (int) ((double) this.field3968.field1497 * var30 + (double) this.field3968.field1473) << 8 | (int) ((double) this.field3968.field1468 * var30 + (double) this.field3968.field1460);
                    } else {
                        var32 = (int) ((double) this.field3968.field1497 * Math.random() + (double) this.field3968.field1473) << 8 | (int) ((double) this.field3968.field1469 * Math.random() + (double) this.field3968.field1467) << 16 | (int) (Math.random() * (double) this.field3968.field1468 + (double) this.field3968.field1460) | (int) (Math.random() * (double) this.field3968.field1451 + (double) this.field3968.field1437) << 24;
                    }
                    int var33 = this.field3968.field1463;
                    if (!arg0.method1755() && !this.field3968.field1455) {
                        var33 = -1;
                    }
                    if (class97.field1486 == class189.field2617) {
                        new class452(this, var24, var25, var26, var11, var10, var12, var27, var28, var32, var29, var33, this.field3968.field1454);
                    } else {
                        class452 var35 = class207.field2794[class189.field2617];
                        class189.field2617 = class189.field2617 + 1 & 0x3FF;
                        var35.method2824(this, var24, var25, var26, var11, var10, var12, var27, var28, var32, var29, var33, this.field3968.field1454);
                    }
                }
            }
        }
        this.field3954 = 0;
        for (class452 var36 = (class452) this.field3957.method2307(false); var36 != null; var36 = (class452) this.field3957.method2311(arg3 ^ 0xFFFFE56E)) {
            var36.method2827(arg1, arg2);
            this.field3954++;
        }
        class398.field5825 += this.field3954;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V", line = 264)
    public static void method1854(byte arg0) {
        field3989 = null;
        field3986 = null;
        if (arg0 < 51) {
            field3952 = null;
        }
        field3952 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III[B)I", line = 284)
    public static final int method1855(int arg0, int arg1, int arg2, byte[] arg3) {
        field3959++;
        int var4 = -1;
        int var5 = -71 / ((arg2 + 14) / 52);
        for (int var6 = arg1; var6 < arg0; var6++) {
            var4 = var4 >>> 8 ^ class162.field2270[(var4 ^ arg3[var6]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Z", line = 309)
    public static final boolean method1856(byte arg0) {
        if (arg0 < 41) {
            field3986 = null;
        }
        field3951++;
        try {
            if (class399.field5832 == 2) {
                if (class208.field2813 == null) {
                    class208.field2813 = class291.method1876(class202.field2761, class395.field5780, class2.field28);
                    if (class208.field2813 == null) {
                        return false;
                    }
                }
                if (class31.field483 == null) {
                    class31.field483 = new class162(class181.field2537, class387.field5636);
                }
                if (class225.field3024.method177(class139.field1972, class31.field483, -122, 22050, class208.field2813)) {
                    class225.field3024.method204((byte) -79);
                    class225.field3024.method194(128, class155.field2186);
                    class225.field3024.method190(class410.field5952, (byte) -82, class208.field2813);
                    class208.field2813 = null;
                    class399.field5832 = 0;
                    class31.field483 = null;
                    class202.field2761 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class225.field3024.method199((byte) 117);
            class208.field2813 = null;
            class202.field2761 = null;
            class31.field483 = null;
            class399.field5832 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Laa;Lpd;Ljl;J)V", line = 663)
    public class287(class281 arg0, class140 arg1, class147 arg2, long arg3) {
        this.field3967 = arg3;
        this.field3977 = arg1;
        this.field3955 = arg2;
        this.field3968 = class43.method313(this.field3977.field1983, -117);
        if (!arg0.method1755() && this.field3968.field1456 != -1) {
            this.field3968 = class43.method313(this.field3968.field1456, -99);
        }
        this.field3957 = new class357();
        this.field3964 = (int) ((double) this.field3964 + Math.random() * 64.0D);
        this.method1852(107);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BJ)V", line = 370)
    public final void method1857(byte arg0, long arg1) {
        for (class452 var4 = (class452) this.field3957.method2307(false); var4 != null; var4 = (class452) this.field3957.method2311(-5116)) {
            var4.method2826(arg1);
        }
        field3973++;
        if (arg0 <= 74) {
            this.field3985 = 87;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(CB)Z", line = 390)
    public static final boolean method1858(char arg0, byte arg1) {
        int var2 = 51 % (-arg1 / 32);
        field3966++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V", line = 409)
    public static final void method1859(boolean arg0, int arg1) {
        class64.field988 = arg0;
        int var2 = 82 % ((-arg1 - 63) / 51);
        field3981++;
        if (!class64.field988) {
            int var28 = class393.field5747.method2389(83);
            int var29 = class393.field5747.method2432((byte) 106);
            int var30 = (class120.field1712 - class393.field5747.field5273) / 16;
            class62.field974 = new int[var30][4];
            for (int var31 = 0; var31 < var30; var31++) {
                for (int var42 = 0; var42 < 4; var42++) {
                    class62.field974[var31][var42] = class393.field5747.method2413((byte) -30);
                }
            }
            int var32 = class393.field5747.method2429(0);
            int var33 = class393.field5747.method2435((byte) 115);
            int var34 = class393.field5747.method2432((byte) 105);
            int var35 = class393.field5747.method2388((byte) 83);
            boolean var36 = class393.field5747.method2388((byte) 68) == 1;
            class14.method79(var35, (byte) 101);
            class108.field1599 = new int[var30];
            class279.field3781 = new int[var30];
            class324.field4432 = new int[var30];
            class191.field2656 = null;
            class383.field5490 = new int[var30];
            class419.field6060 = new int[var30];
            class245.field3391 = null;
            class237.field3223 = new byte[var30][];
            class149.field2149 = new byte[var30][];
            class322.field4418 = new byte[var30][];
            class387.field5635 = new byte[var30][];
            boolean var37 = false;
            if (((var33 / 8) == 48 || var33 / 8 == 49) && (var34 / 8) == 48) {
                var37 = true;
            }
            if ((var33 / 8) == 48 && (var34 / 8) == 148) {
                var37 = true;
            }
            int var38 = 0;
            for (int var39 = (var33 - (class432.field6220 >> 4)) / 8; var39 <= ((class432.field6220 >> 4) + var33) / 8; var39++) {
                for (int var40 = (var34 - (class267.field3646 >> 4)) / 8; var40 <= (((class267.field3646 >> 4) + var34) / 8); var40++) {
                    int var41 = (var39 << 8) + var40;
                    if (var37 && var40 == 49 || var40 == 149 || var40 == 147 || var39 == 50 || !(var39 != 49 || var40 != 47)) {
                        class324.field4432[var38] = var41;
                        class383.field5490[var38] = -1;
                        class108.field1599[var38] = -1;
                        class419.field6060[var38] = -1;
                        class279.field3781[var38] = -1;
                    } else {
                        class324.field4432[var38] = var41;
                        class383.field5490[var38] = class215.field2857.method1914(-1, "m" + var39 + "_" + var40);
                        class108.field1599[var38] = class215.field2857.method1914(-1, "l" + var39 + "_" + var40);
                        class419.field6060[var38] = class215.field2857.method1914(-1, "um" + var39 + "_" + var40);
                        class279.field3781[var38] = class215.field2857.method1914(-1, "ul" + var39 + "_" + var40);
                    }
                    var38++;
                }
            }
            class398.method2577(false, var32, var28, var34, (byte) -115, var33, var29, var36);
            return;
        }
        int var3 = class393.field5747.method2429(0);
        int var4 = class393.field5747.method2403((byte) 78);
        int var5 = class393.field5747.method2389(112);
        int var6 = class393.field5747.method2429(0);
        boolean var7 = class393.field5747.method2400((byte) 123) == 1;
        int var8 = class393.field5747.method2432((byte) 113);
        int var9 = class393.field5747.method2403((byte) 69);
        class14.method79(var6, (byte) 101);
        class393.field5747.method159(8);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var25 = 0; var25 < (class432.field6220 >> 3); var25++) {
                for (int var26 = 0; var26 < class267.field3646 >> 3; var26++) {
                    int var27 = class393.field5747.method163(1, -118);
                    if (var27 == 1) {
                        class25.field403[var10][var25][var26] = class393.field5747.method163(26, -101);
                    } else {
                        class25.field403[var10][var25][var26] = -1;
                    }
                }
            }
        }
        class393.field5747.method157(-32);
        int var11 = (class120.field1712 - class393.field5747.field5273) / 16;
        class62.field974 = new int[var11][4];
        for (int var12 = 0; var12 < var11; var12++) {
            for (int var24 = 0; var24 < 4; var24++) {
                class62.field974[var12][var24] = class393.field5747.method2413((byte) -30);
            }
        }
        class324.field4432 = new int[var11];
        class245.field3391 = null;
        class279.field3781 = new int[var11];
        class383.field5490 = new int[var11];
        class237.field3223 = new byte[var11][];
        class322.field4418 = new byte[var11][];
        class387.field5635 = new byte[var11][];
        class191.field2656 = null;
        class108.field1599 = new int[var11];
        class419.field6060 = new int[var11];
        class149.field2149 = new byte[var11][];
        int var13 = 0;
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < class432.field6220 >> 3; var15++) {
                for (int var16 = 0; var16 < (class267.field3646 >> 3); var16++) {
                    int var17 = class25.field403[var14][var15][var16];
                    if (var17 != -1) {
                        int var18 = (var17 & 0xFFCD31) >> 14;
                        int var19 = var17 >> 3 & 0x7FF;
                        int var20 = (var18 / 8 << 8) + var19 / 8;
                        for (int var21 = 0; var21 < var13; var21++) {
                            if (class324.field4432[var21] == var20) {
                                var20 = -1;
                                break;
                            }
                        }
                        if (var20 != -1) {
                            class324.field4432[var13] = var20;
                            int var22 = (var20 & 0xFFFA) >> 8;
                            int var23 = var20 & 0xFF;
                            class383.field5490[var13] = class215.field2857.method1914(-1, "m" + var22 + "_" + var23);
                            class108.field1599[var13] = class215.field2857.method1914(-1, "l" + var22 + "_" + var23);
                            class419.field6060[var13] = class215.field2857.method1914(-1, "um" + var22 + "_" + var23);
                            class279.field3781[var13] = class215.field2857.method1914(-1, "ul" + var22 + "_" + var23);
                            var13++;
                        }
                    }
                }
            }
        }
        class398.method2577(false, var3, var4, var9, (byte) -115, var8, var5, var7);
    }
}

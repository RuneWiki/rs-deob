import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class193 extends class97 {

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    private int field3505 = 0;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "Lc;")
    private class103 field3495 = new class103(16);

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
    private int field3528 = 0;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "Lka;")
    private class243 field3526 = new class243();

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "J")
    private long field3530 = 0L;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    private int field3499;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "Lke;")
    private class105 field3501;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "Z")
    private boolean field3527;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "Lka;")
    private class243 field3525;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "Lkg;")
    private class132 field3508;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    private int field3498;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    private int field3520;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "Lke;")
    private class105 field3494;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "Loc;")
    private class59 field3506;

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "Z")
    private boolean field3531;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "Lcg;")
    private class161 field3511;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "Ltk;")
    public static class50 field3516 = null;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "Lta;")
    public static class241 field3497 = new class241(100);

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "Lta;")
    public static class241 field3519 = new class241(64);

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    public static int field3523 = 0;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "Lhj;")
    public static class69 field3524 = class181.method1318("Sprites geladen)3", (byte) -112);

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "Lec;")
    private class23 field3518;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "Z")
    private boolean field3529;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "[B")
    private byte[] field3507;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(II)[B")
    public final byte[] method713(int arg0, int arg1) {
        field3503++;
        class161 var3 = this.method1400(false, arg0, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method579(-874);
            var3.method632(-8296);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public final void method1395(int arg0) {
        field3515++;
        if (this.field3525 == null || this.method707(-1) == null) {
            return;
        }
        if (arg0 > 0) {
            method1398(-30, 109, 17, 123, 81, -80, 22, 27, (class177) null, -50, true, -64L);
        }
        for (class88 var2 = this.field3526.method1724(255); var2 != null; var2 = this.field3526.method1726(117)) {
            int var3 = (int) var2.field1685;
            if (var3 < 0 || var3 >= this.field3518.field322 || this.field3518.field312[var3] == 0) {
                var2.method632(-8296);
            } else {
                if (this.field3507[var3] == 0) {
                    this.method1400(false, 1, var3);
                }
                if (this.field3507[var3] == -1) {
                    this.method1400(false, 2, var3);
                }
                if (this.field3507[var3] == 1) {
                    var2.method632(-8296);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZII)I")
    public static final int method1396(int arg0, boolean arg1, int arg2, int arg3) {
        field3513++;
        if ((class19.field246[arg0][arg2][arg3] & 0x8) == 0) {
            if (arg1) {
                method1396(-29, true, -115, -1);
            }
            return arg0 <= 0 || (class19.field246[1][arg2][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method1397(byte arg0) {
        field3497 = null;
        field3524 = null;
        field3519 = null;
        int var1 = -128 / ((8 - arg0) / 41);
        field3516 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)Lec;")
    public final class23 method707(int arg0) {
        field3509++;
        if (this.field3518 != null) {
            return this.field3518;
        }
        if (this.field3511 == null) {
            if (this.field3508.method985(20)) {
                return null;
            }
            this.field3511 = this.field3508.method981(true, 124, 255, (byte) 0, this.field3499);
        }
        if (this.field3511.field2983) {
            return null;
        }
        if (arg0 != -1) {
            this.method1403(-90);
        }
        byte[] var2 = this.field3511.method579(-874);
        if (this.field3511 instanceof class248) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3518 = new class23(var2, this.field3520);
                if (this.field3518.field314 != this.field3498) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3518 = null;
                if (this.field3508.method985(20)) {
                    this.field3511 = null;
                } else {
                    this.field3511 = this.field3508.method981(true, 127, 255, (byte) 0, this.field3499);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3518 = new class23(var2, this.field3520);
            } catch (RuntimeException var4) {
                this.field3508.method976(false);
                this.field3518 = null;
                if (this.field3508.method985(arg0 + 21)) {
                    this.field3511 = null;
                } else {
                    this.field3511 = this.field3508.method981(true, arg0 + 128, 255, (byte) 0, this.field3499);
                }
                return null;
            }
            if (this.field3494 != null) {
                this.field3506.method354((byte) -118, this.field3499, this.field3494, var2);
            }
        }
        if (this.field3501 != null) {
            this.field3505 = 0;
            this.field3507 = new byte[this.field3518.field322];
        }
        this.field3511 = null;
        return this.field3518;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)I")
    public final int method708(int arg0, int arg1) {
        if (arg1 < 92) {
            field3519 = null;
        }
        field3512++;
        class161 var3 = (class161) this.field3495.method769(true, (long) arg0);
        return var3 == null ? 0 : var3.method576(true);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIILed;IZJ)Z")
    public static final boolean method1398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class177 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class271.field4793 == class263.field4673;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class109.field2091 || var24 >= class146.field2694) {
                    return false;
                }
                class217 var25 = class158.field2935[arg0][var15][var24];
                if (var25 != null && var25.field3940 >= 5) {
                    return false;
                }
            }
        }
        class85 var16 = new class85();
        var16.field1656 = arg11;
        var16.field1652 = arg0;
        var16.field1649 = arg5;
        var16.field1650 = arg6;
        var16.field1648 = arg7;
        var16.field1660 = arg8;
        var16.field1657 = arg9;
        var16.field1662 = arg1;
        var16.field1653 = arg2;
        var16.field1651 = arg1 + arg3 - 1;
        var16.field1655 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class158.field2935[var22][var17][var20] == null) {
                        class158.field2935[var22][var17][var20] = new class217(var22, var17, var20);
                    }
                }
                class217 var23 = class158.field2935[arg0][var17][var20];
                var23.field3933[var23.field3940] = var16;
                var23.field3941[var23.field3940] = var21;
                var23.field3948 |= var21;
                var23.field3940++;
                if (var13 && class170.field3116[var17][var20] != 0) {
                    var14 = class170.field3116[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class170.field3116[var18][var19] == 0) {
                        class170.field3116[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class99.field1872[class261.field4653++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)I")
    public final int method1399(byte arg0) {
        if (arg0 < 62) {
            return 62;
        } else {
            field3514++;
            return this.field3518 == null ? 0 : this.field3518.field335;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZII)Lcg;")
    private final class161 method1400(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.method708(60, -93);
        }
        field3502++;
        class161 var4 = (class161) this.field3495.method769(!arg0, (long) arg2);
        if (var4 != null && arg1 == 0 && !var4.field2987 && var4.field2983) {
            var4.method632(-8296);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field3501 == null || this.field3507[arg2] == -1) {
                    if (this.field3508.method985(20)) {
                        return null;
                    }
                    var4 = this.field3508.method981(true, 125, this.field3499, (byte) 2, arg2);
                } else {
                    var4 = this.field3506.method363(this.field3501, arg0, arg2);
                }
            } else if (arg1 == 1) {
                if (this.field3501 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3506.method359((byte) 69, arg2, this.field3501);
            } else if (arg1 == 2) {
                if (this.field3501 == null) {
                    throw new RuntimeException();
                }
                if (this.field3507[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3508.method975(-125)) {
                    return null;
                }
                var4 = this.field3508.method981(false, 124, this.field3499, (byte) 2, arg2);
            } else {
                throw new RuntimeException();
            }
            this.field3495.method761((long) arg2, 0, var4);
        }
        if (var4.field2983) {
            return null;
        }
        byte[] var5 = var4.method579(-874);
        if (!var4 instanceof class248) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class64.field1235.reset();
                class64.field1235.update(var5, 0, var5.length - 2);
                int var9 = (int) class64.field1235.getValue();
                if (this.field3518.field319[arg2] != var9) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var12) {
                this.field3508.method976(arg0);
                var4.method632(-8296);
                if (var4.field2987 && !this.field3508.method985(20)) {
                    class81 var10 = this.field3508.method981(true, 124, this.field3499, (byte) 2, arg2);
                    this.field3495.method761((long) arg2, 0, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3518.field316[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field3518.field316[arg2];
            if (this.field3501 != null) {
                this.field3506.method354((byte) -123, arg2, this.field3501, var5);
                if (this.field3507[arg2] != 1) {
                    this.field3505++;
                    this.field3507[arg2] = 1;
                }
            }
            if (!var4.field2987) {
                var4.method632(-8296);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class64.field1235.reset();
            class64.field1235.update(var5, 0, var5.length - 2);
            int var6 = (int) class64.field1235.getValue();
            if (this.field3518.field319[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3518.field316[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field3507[arg2] != 1) {
                this.field3505++;
                this.field3507[arg2] = 1;
            }
            if (!var4.field2987) {
                var4.method632(-8296);
            }
            return var4;
        } catch (Exception var11) {
            this.field3507[arg2] = -1;
            var4.method632(-8296);
            if (var4.field2987 && !this.field3508.method985(20)) {
                class81 var8 = this.field3508.method981(true, 125, this.field3499, (byte) 2, arg2);
                this.field3495.method761((long) arg2, 0, var8);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
    public final void method1401(int arg0) {
        field3522++;
        if (this.field3525 != null) {
            if (this.method707(-1) == null) {
                return;
            }
            if (this.field3527) {
                boolean var2 = true;
                for (class88 var3 = this.field3525.method1724(255); var3 != null; var3 = this.field3525.method1726(104)) {
                    int var5 = (int) var3.field1685;
                    if (this.field3507[var5] == 0) {
                        this.method1400(false, 1, var5);
                    }
                    if (this.field3507[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method632(-8296);
                    }
                }
                while (this.field3528 < this.field3518.field312.length) {
                    if (this.field3518.field312[this.field3528] == 0) {
                        this.field3528++;
                    } else {
                        if (this.field3506.field1081 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field3507[this.field3528] == 0) {
                            this.method1400(false, 1, this.field3528);
                        }
                        if (this.field3507[this.field3528] == 0) {
                            var2 = false;
                            class88 var4 = new class88();
                            var4.field1685 = (long) this.field3528;
                            this.field3525.method1727(-119, var4);
                        }
                        this.field3528++;
                    }
                }
                if (var2) {
                    this.field3527 = false;
                    this.field3528 = 0;
                }
            } else if (this.field3529) {
                boolean var6 = true;
                for (class88 var7 = this.field3525.method1724(255); var7 != null; var7 = this.field3525.method1726(124)) {
                    int var9 = (int) var7.field1685;
                    if (this.field3507[var9] != 1) {
                        this.method1400(false, 2, var9);
                    }
                    if (this.field3507[var9] == 1) {
                        var7.method632(-8296);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field3518.field312.length > this.field3528) {
                    if (this.field3518.field312[this.field3528] == 0) {
                        this.field3528++;
                    } else {
                        if (this.field3508.method975(-120)) {
                            var6 = false;
                            break;
                        }
                        if (this.field3507[this.field3528] != 1) {
                            this.method1400(false, 2, this.field3528);
                        }
                        if (this.field3507[this.field3528] != 1) {
                            class88 var8 = new class88();
                            var6 = false;
                            var8.field1685 = (long) this.field3528;
                            this.field3525.method1727(-120, var8);
                        }
                        this.field3528++;
                    }
                }
                if (var6) {
                    this.field3528 = 0;
                    this.field3529 = false;
                }
            } else {
                this.field3525 = null;
            }
        }
        if (this.field3531 && this.field3530 <= class223.method1584(-25392)) {
            for (class161 var10 = (class161) this.field3495.method768((byte) 125); var10 != null; var10 = (class161) this.field3495.method760(-15725)) {
                if (!var10.field2983) {
                    if (var10.field2992) {
                        if (!var10.field2987) {
                            throw new RuntimeException();
                        }
                        var10.method632(-8296);
                    } else {
                        var10.field2992 = true;
                    }
                }
            }
            this.field3530 = class223.method1584(-25392) + 1000L;
        }
        int var11 = 44 % ((arg0 + 13) / 46);
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
    public final void method1402(int arg0) {
        if (arg0 != 25021) {
            this.field3526 = null;
        }
        field3521++;
        if (this.field3501 != null) {
            this.field3529 = true;
            if (this.field3525 == null) {
                this.field3525 = new class243();
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)V")
    public final void method709(int arg0, int arg1) {
        field3496++;
        if (this.field3501 == null) {
            return;
        }
        if (arg1 != -1067) {
            this.method707(86);
        }
        for (class88 var3 = this.field3526.method1724(255); var3 != null; var3 = this.field3526.method1726(93)) {
            if ((long) arg0 == var3.field1685) {
                return;
            }
        }
        class88 var4 = new class88();
        var4.field1685 = (long) arg0;
        this.field3526.method1727(-115, var4);
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)I")
    public final int method1403(int arg0) {
        field3500++;
        if (arg0 != 0) {
            this.method1405(true);
        }
        if (this.field3518 == null) {
            return 0;
        } else if (this.field3527) {
            class88 var2 = this.field3525.method1724(255);
            return var2 == null ? 0 : (int) var2.field1685;
        } else {
            return this.field3518.field335;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)V")
    public static final void method1404(byte arg0) {
        class239.field4378 = class65.field1255;
        class64.field1241 = class136.field2548;
        class253.field4572 = class97.field1806;
        class43.field615 = class192.field3466;
        class80.field1535 = class230.field4211;
        class112.field2129 = class204.field3673;
        class97.field1804 = class78.field1509;
        class123.field2280 = class152.field2834;
        class170.field3114 = class120.field2264;
        class43.field620 = class256.field4603;
        class243.field4463 = class39.field535;
        class271.field4805 = class212.field3860;
        class271.field4802 = class212.field3860;
        class136.field2543 = class78.field1507;
        class4.field26 = class5.field43;
        class204.field3680 = class251.field4544;
        class170.field3115 = class228.field4156;
        class97.field1812 = class110.field2099;
        class229.field4201 = class159.field2966;
        class48.field700 = class243.field4456;
        class60.field1095 = class75.field1473;
        class130.field2418 = class242.field4443;
        class16.field212 = class90.field1703;
        class231.field4222 = class66.field1270;
        class44.field635 = class101.field1894;
        class127.field2332 = class130.field2419;
        class99.field1877 = class73.field1410;
        class3.field14 = class151.field2795;
        class182.field3316 = class248.field4529;
        class28.field396 = class26.field369;
        class245.field4482 = class243.field4459;
        class222.field4016 = class112.field2146;
        class243.field4465 = class39.field535;
        class55.field980 = class205.field3724;
        class228.field4165 = class209.field3802;
        class94.field1754 = class29.field419;
        class215.field3888 = class256.field4599;
        client.field2815 = class12.field119;
        class202.field3653 = class62.field1200;
        class231.field4223 = class186.field3400;
        class189.field3423 = class180.field3263;
        class26.field376 = class33.field465;
        class253.field4571 = class113.field2176;
        class209.field3807 = class182.field3317;
        class33.field467 = class24.field344;
        class104.field1939 = class43.field624;
        class38.field519 = class23.field336;
        class45.field652 = class127.field2329;
        class182.field3303 = class35.field490;
        class128.field2391 = class227.field4145;
        class130.field2416 = class103.field1916;
        class98.field1819 = class24.field359;
        class78.field1508 = class11.field97;
        class142.field2657 = class32.field448;
        class161.field2990 = class255.field4583;
        class138.field2589 = class163.field3009;
        class126.field2323 = class202.field3654;
        class201.field3626 = class24.field348;
        class151.field2798 = class41.field587;
        class78.field1511 = class57.field1027;
        class111.field2107 = class98.field1846;
        class246.field4498 = class224.field4084;
        class130.field2426 = class45.field643;
        class257.field4612 = class162.field3004;
        class23.field326 = class229.field4202;
        class53.field955 = class80.field1541;
        class64.field1247 = class28.field405;
        class153.field2855 = class272.field4816;
        class236.field4292 = class171.field3124;
        class233.field4259 = class257.field4610;
        class73.field1406 = class115.field2199;
        class78.field1497 = class70.field1379;
        class126.field2314 = class33.field462;
        class233.field4257 = class186.field3386;
        class41.field584 = class66.field1280;
        class140.field2621 = class247.field4517;
        field3517++;
        class27.field389 = class157.field2932;
        class61.field1116 = class95.field1773;
        class38.field529 = class106.field1999;
        class82.field1567 = class180.field3270;
        class262.field4670 = class176.field3216;
        class232.field4247 = class235.field4285;
        client.field2824 = class12.field119;
        class31.field432 = class233.field4260;
        class115.field2200 = class139.field2597;
        class239.field4386 = class200.field3623;
        class62.field1197 = class192.field3492;
        class98.field1855 = class216.field3918;
        class57.field1028 = class108.field2043;
        class186.field3392 = class60.field1098;
        if (arg0 != 81) {
            field3524 = null;
        }
        class94.field1760 = class223.field4067;
        class64.field1242 = class8.field59;
        class171.field3133 = class159.field2953;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(Z)I")
    public final int method1405(boolean arg0) {
        field3504++;
        if (!arg0) {
            this.method709(-32, 15);
        }
        return this.field3505;
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)I")
    public final int method1406(int arg0) {
        field3510++;
        if (this.method707(-1) == null) {
            return this.field3511 == null ? 0 : this.field3511.method576(true);
        } else {
            if (arg0 >= -75) {
                method1396(64, true, 32, -60);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(ILke;Lke;Lkg;Loc;IIZ)V")
    public class193(int arg0, class105 arg1, class105 arg2, class132 arg3, class59 arg4, int arg5, int arg6, boolean arg7) {
        this.field3499 = arg0;
        this.field3501 = arg1;
        if (this.field3501 == null) {
            this.field3527 = false;
        } else {
            this.field3527 = true;
            this.field3525 = new class243();
        }
        this.field3508 = arg3;
        this.field3498 = arg6;
        this.field3520 = arg5;
        this.field3494 = arg2;
        this.field3506 = arg4;
        this.field3531 = arg7;
        if (this.field3494 != null) {
            this.field3511 = this.field3506.method363(this.field3494, false, this.field3499);
        }
    }
}

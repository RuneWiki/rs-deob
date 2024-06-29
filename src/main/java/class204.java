import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class204 extends class179 {

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "I")
    private int field3697 = 2048;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "I")
    private int field3700 = 10;

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "I")
    private int field3703 = 0;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "Lla;")
    public static class188 field3695 = null;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "I")
    public static int field3699 = 0;

    @OriginalMember(owner = "client!mi", name = "hb", descriptor = "Lke;")
    public static class256 field3710 = class316.method2202("(Udns", 27626);

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!mi", name = "cb", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!mi", name = "db", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!mi", name = "gb", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!mi", name = "jb", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!mi", name = "kb", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "Lng;")
    public static class138 field3696;

    @OriginalMember(owner = "client!mi", name = "eb", descriptor = "[I")
    private int[] field3707;

    @OriginalMember(owner = "client!mi", name = "ib", descriptor = "[I")
    private int[] field3711;

    @OriginalMember(owner = "client!mi", name = "fb", descriptor = "[Lrm;")
    public static class171[] field3708;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)[I", line = 8)
    public final int[] method41(int arg0, int arg1) {
        field3712++;
        if (arg1 != -31598) {
            return (int[]) null;
        }
        int[] var3 = this.field3157.method1258(arg1 + 31556, arg0);
        if (this.field3157.field3081) {
            int var4 = class292.field5049[arg0];
            if (this.field3703 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field3700; var12++) {
                    if (var4 >= this.field3711[var12] && this.field3711[var12 + 1] > var4) {
                        if (this.field3707[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class299.method2088(var3, 0, class161.field2858, var11);
            } else {
                for (int var5 = 0; var5 < class161.field2858; var5++) {
                    short var6 = 0;
                    int var7 = 0;
                    int var8 = class290.field5017[var5];
                    int var9 = this.field3703;
                    if (var9 == 1) {
                        var7 = var8;
                    } else if (var9 == 2) {
                        var7 = (var8 - (4096 - var4) >> 1) + 2048;
                    } else if (var9 == 3) {
                        var7 = (var8 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field3700; var10++) {
                        if (var7 >= this.field3711[var10] && var7 < this.field3711[var10 + 1]) {
                            if (var7 < this.field3707[var10]) {
                                var6 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V", line = 121)
    public final void method418(byte arg0) {
        this.method1452((byte) 116);
        if (arg0 != -110) {
            this.method54(-81, (class41) null, 124);
        }
        field3704++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIBIIII)V", line = 137)
    public static final void method1446(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field3694++;
        int var7 = class101.method731(class274.field4748, arg4, class105.field1887, true);
        int var8 = class101.method731(class274.field4748, arg3, class105.field1887, true);
        int var9 = class101.method731(class175.field3106, arg6, class244.field4161, true);
        if (arg2 <= 66) {
            return;
        }
        int var10 = class101.method731(class175.field3106, arg5, class244.field4161, true);
        int var11 = class101.method731(class274.field4748, arg0 + arg4, class105.field1887, true);
        int var12 = class101.method731(class274.field4748, arg3 - arg0, class105.field1887, true);
        for (int var13 = var7; var13 < var11; var13++) {
            class73.method550(-29903, class308.field5329[var13], var10, var9, arg1);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class73.method550(-29903, class308.field5329[var14], var10, var9, arg1);
        }
        int var15 = class101.method731(class175.field3106, arg0 + arg6, class244.field4161, true);
        int var16 = class101.method731(class175.field3106, arg5 - arg0, class244.field4161, true);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class308.field5329[var17];
            class73.method550(-29903, var18, var15, var9, arg1);
            class73.method550(-29903, var18, var10, var16, arg1);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILra;I)V", line = 197)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3700 = arg1.method357(false);
        } else if (arg2 == 1) {
            this.field3697 = arg1.method346(-16);
        } else if (arg2 == 2) {
            this.field3703 = arg1.method357(false);
        }
        field3705++;
        if (arg0 <= 108) {
            this.field3703 = 82;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 251)
    public class204() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)I", line = 261)
    public static final int method1447(boolean arg0) {
        field3709++;
        if (!arg0) {
            method1451(-115, (byte) -9);
        }
        return class59.field1071.method2078(-108);
    }

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "(I)V", line = 276)
    public static void method1448(int arg0) {
        field3710 = null;
        if (arg0 != -23043) {
            method1449((byte) 97);
        }
        field3696 = null;
        field3695 = null;
        field3708 = null;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V", line = 297)
    public static final void method1449(byte arg0) {
        class64.method500(class240.field4096, (byte) -117);
        class116.field2036++;
        field3702++;
        if (class164.field2914 && class320.field5491) {
            int var1 = class286.field4963;
            int var2 = var1 - class117.field2047;
            int var3 = class240.field4096.field3415;
            if (var2 < class76.field1445) {
                var2 = class76.field1445;
            }
            int var4 = class208.field3762;
            int var5 = var4 - class75.field1426;
            if (arg0 > -68) {
                method1449((byte) 99);
            }
            if (var5 < class208.field3754) {
                var5 = class208.field3754;
            }
            if ((class240.field4096.field3343 + var5) > (class208.field3754 + class260.field4492.field3343)) {
                var5 = class260.field4492.field3343 + class208.field3754 - class240.field4096.field3343;
            }
            if (class76.field1445 + class260.field4492.field3391 < class240.field4096.field3391 + var2) {
                var2 = class76.field1445 + class260.field4492.field3391 - class240.field4096.field3391;
            }
            int var6 = var5 - class52.field962;
            int var7 = var2 - class29.field415;
            if (class116.field2036 > class240.field4096.field3334 && (var3 < var7 || var7 < -var3 || var3 < var6 || (-var3) > var6)) {
                class292.field5056 = true;
            }
            int var8 = var5 + class260.field4492.field3463 - class208.field3754;
            int var9 = class260.field4492.field3442 + var2 - class76.field1445;
            if (class240.field4096.field3420 != null && class292.field5056) {
                class119 var10 = new class119();
                var10.field2120 = var9;
                var10.field2114 = class240.field4096.field3420;
                var10.field2109 = var8;
                var10.field2116 = class240.field4096;
                class91.method678((byte) -119, var10);
            }
            if (class287.field4978 == 0) {
                if (class292.field5056) {
                    if (class240.field4096.field3448 != null) {
                        class119 var11 = new class119();
                        var11.field2114 = class240.field4096.field3448;
                        var11.field2122 = class138.field2420;
                        var11.field2109 = var8;
                        var11.field2120 = var9;
                        var11.field2116 = class240.field4096;
                        class91.method678((byte) 108, var11);
                    }
                    if (class138.field2420 != null && client.method829(class240.field4096) != null) {
                        class79.field1477++;
                        class308.field5322.method1599(10, (byte) 115);
                        class308.field5322.method326((byte) 97, class138.field2420.field3342);
                        class308.field5322.method351(-128, class138.field2420.field3305);
                        class308.field5322.method366(class240.field4096.field3305, -114);
                        class308.field5322.method355(56, class240.field4096.field3342);
                    }
                } else if ((class154.field2747 == 1 || class208.method1472(-1, class17.field244 - 1)) && class17.field244 > 2) {
                    class193.method1397(true);
                } else if (class17.field244 > 0) {
                    class99.method713((byte) -27);
                }
                class240.field4096 = null;
            }
        } else if (class116.field2036 > 1) {
            class240.field4096 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZI)V", line = 429)
    public static final void method1450(boolean arg0, int arg1) {
        field3706++;
        if (arg1 != 13) {
            method1449((byte) 127);
        }
        byte var2;
        byte[][] var3;
        if (class253.field4323 && arg0) {
            var2 = 1;
            var3 = class77.field1460;
        } else {
            var2 = 4;
            var3 = class115.field2021;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class65.method506(true);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class198.field3613[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFC793) >> 14;
                            int var11 = (var7 & 0x3FF9) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class44.field829.length; var13++) {
                                if (class44.field829[var13] == var12 && var3[var13] != null) {
                                    class54.method430((var11 & 0x7) * 8, var3[var13], var8, var4, var5 * 8, 19661199, class124.field2201, (var10 & 0x7) * 8, var6 * 8, arg0, var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)V", line = 513)
    public static final void method1451(int arg0, byte arg1) {
        class76.field1443.method2075(arg0, 1);
        field3713++;
        int var2 = -83 / ((-arg1 - 32) / 38);
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)V", line = 524)
    private final void method1452(byte arg0) {
        this.field3707 = new int[this.field3700 + 1];
        field3698++;
        this.field3711 = new int[this.field3700 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field3700;
        int var4 = this.field3697 * var3 >> 12;
        for (int var5 = 0; var5 < this.field3700; var5++) {
            this.field3711[var5] = var2;
            this.field3707[var5] = var2 + var4;
            var2 += var3;
        }
        int var6 = -65 / ((49 - arg0) / 55);
        this.field3711[this.field3700] = 4096;
        this.field3707[this.field3700] = this.field3707[0] + 4096;
    }
}

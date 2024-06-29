import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class204 {

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public int field3059 = -1;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Z")
    public boolean field3068 = false;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "[I")
    private int[] field3067 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field3064 = 0;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field3070 = -1;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
    private int[] field3058;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "[S")
    private short[] field3056;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[S")
    private short[] field3061;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "[S")
    private short[] field3063;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "[S")
    private short[] field3072;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)Z", line = 6)
    public final boolean method1396(byte arg0) {
        field3054++;
        boolean var2 = true;
        int var3 = 122 / ((arg0 + 64) / 45);
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3067[var4] != -1 && !class291.field4437.method1463(this.field3067[var4], (byte) -55, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V", line = 29)
    public static final void method1397(int arg0, int arg1, int arg2) {
        if (arg2 == 4 && !class45.field569) {
            arg2 = 2;
            arg1 = 2;
        }
        field3073++;
        if (arg0 >= -33) {
            method1404(97, -29, -87, -115, 54, 58, -6);
        }
        if (class252.field3757 != arg2) {
            if (class225.field3424) {
                return;
            }
            if (class252.field3757 != 0) {
                class168.field2521[class252.field3757].method1();
            }
            if (arg2 != 0) {
                class2 var3 = class168.field2521[arg2];
                var3.method4();
                var3.method3(arg1);
            }
            class252.field3757 = arg2;
            class177.field2613 = arg1;
        } else if (arg2 != 0 && class177.field2613 != arg1) {
            class168.field2521[arg2].method3(arg1);
            class177.field2613 = arg1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIII)V", line = 76)
    public static final void method1398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 106 % ((arg5 - 3) / 40);
        for (int var7 = arg4; var7 <= arg1; var7++) {
            class315.method2160(class40.field488[var7], arg2, arg0, arg3, 7);
        }
        field3076++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Z", line = 91)
    public final boolean method1399(int arg0) {
        field3066++;
        if (this.field3058 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field3058.length; var3++) {
            if (!class291.field4437.method1463(this.field3058[var3], (byte) -55, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)Lkd;", line = 119)
    public final class119 method1400(boolean arg0) {
        field3075++;
        if (this.field3058 == null) {
            return null;
        }
        class119[] var2 = new class119[this.field3058.length];
        for (int var3 = 0; var3 < this.field3058.length; var3++) {
            var2[var3] = class119.method843(class291.field4437, this.field3058[var3], 0);
        }
        if (arg0) {
            return (class119) null;
        }
        class119 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class119(var2, var2.length);
        }
        if (this.field3072 != null) {
            for (int var5 = 0; var5 < this.field3072.length; var5++) {
                var4.method864(this.field3072[var5], this.field3061[var5]);
            }
        }
        if (this.field3063 != null) {
            for (int var6 = 0; var6 < this.field3063.length; var6++) {
                var4.method844(this.field3063[var6], this.field3056[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lre;II)V", line = 175)
    private final void method1401(class263 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3059 = arg0.method1787(false);
        } else if (arg1 == 2) {
            int var8 = arg0.method1787(false);
            this.field3058 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3058[var9] = arg0.method1830((byte) -77);
            }
        } else if (arg1 == 3) {
            this.field3068 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method1787(false);
            this.field3061 = new short[var6];
            this.field3072 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3072[var7] = (short) arg0.method1830((byte) -77);
                this.field3061[var7] = (short) arg0.method1830((byte) -77);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method1787(false);
            this.field3063 = new short[var4];
            this.field3056 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3063[var5] = (short) arg0.method1830((byte) -77);
                this.field3056[var5] = (short) arg0.method1830((byte) -77);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3067[arg1 - 60] = arg0.method1830((byte) -77);
        }
        if (arg2 != -3) {
            method1397(62, 86, 28);
        }
        field3074++;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)Lkd;", line = 253)
    public final class119 method1402(int arg0) {
        field3069++;
        class119[] var2 = new class119[5];
        int var3 = 0;
        for (int var4 = arg0; var4 < 5; var4++) {
            if (this.field3067[var4] != -1) {
                var2[var3++] = class119.method843(class291.field4437, this.field3067[var4], 0);
            }
        }
        class119 var5 = new class119(var2, var3);
        if (this.field3072 != null) {
            for (int var6 = 0; var6 < this.field3072.length; var6++) {
                var5.method864(this.field3072[var6], this.field3061[var6]);
            }
        }
        if (this.field3063 != null) {
            for (int var7 = 0; var7 < this.field3063.length; var7++) {
                var5.method844(this.field3063[var7], this.field3056[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLre;)V", line = 312)
    public final void method1403(byte arg0, class263 arg1) {
        while (true) {
            int var3 = arg1.method1787(false);
            if (var3 == 0) {
                field3062++;
                if (arg0 != 57) {
                    this.method1403((byte) -18, (class263) null);
                }
                return;
            }
            this.method1401(arg1, var3, -3);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIII)V", line = 334)
    public static final void method1404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class55.field689 = 0;
        field3055++;
        for (int var7 = -1; var7 < (class56.field706 + class172.field2577); var7++) {
            class98 var8;
            if (var7 == -1) {
                var8 = class114.field1750;
            } else if (class56.field706 > var7) {
                var8 = class241.field3592[class20.field239[var7]];
            } else {
                var8 = class187.field2788[class56.field711[var7 - class56.field706]];
            }
            if (var8 != null && var8.method455(121)) {
                if (var8 instanceof class69) {
                    class58 var9 = ((class69) var8).field914;
                    if (var9.field756 != null) {
                        var9 = var9.method390(106);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (class56.field706 <= var7) {
                    class58 var15 = ((class69) var8).field914;
                    if (var15.field756 != null) {
                        var15 = var15.method390(arg4 + 67);
                    }
                    if (var15.field728 >= 0 && class287.field4336.length > var15.field728) {
                        int var16;
                        if (var15.field765 == -1) {
                            var16 = var8.method697(0) + 15;
                        } else {
                            var16 = var15.field765 + 15;
                        }
                        class13.method77(arg5 >> 1, arg0, var8, var16, 0, arg3, arg2 >> 1);
                        if (class160.field2398 > -1) {
                            class287.field4336[var15.field728].method935(arg6 + class160.field2398 - 12, class159.field2385 + arg1 + -30);
                        }
                    }
                    int var17 = 0;
                    class323[] var18 = class294.field4497;
                    while (var18.length > var17) {
                        class323 var19 = var18[var17];
                        if (var19 != null && var19.field4869 == 1 && class56.field711[var7 - class56.field706] == var19.field4871 && class304.field4641 % 20 < 10) {
                            int var20;
                            if (var15.field765 == -1) {
                                var20 = var8.method697(0) + 15;
                            } else {
                                var20 = var15.field765 + 15;
                            }
                            class13.method77(arg5 >> 1, arg0, var8, var20, 0, arg3, arg2 >> 1);
                            if (class160.field2398 > -1) {
                                class226.field3433[var19.field4873].method935(arg6 + class160.field2398 - 12, class159.field2385 + arg1 - 28);
                            }
                        }
                        var17++;
                    }
                } else {
                    int var10 = 30;
                    class195 var11 = (class195) var8;
                    if (var11.field2929 != -1 || var11.field2935 != -1) {
                        class13.method77(arg5 >> 1, arg0, var8, var8.method697(0) + 15, 0, arg3, arg2 >> 1);
                        if (class160.field2398 > -1) {
                            if (var11.field2929 != -1) {
                                class327.field4921[var11.field2929].method935(class160.field2398 + arg6 - 12, -var10 + class159.field2385 + arg1);
                                var10 += 25;
                            }
                            if (var11.field2935 != -1) {
                                class287.field4336[var11.field2935].method935(arg6 - (12 - class160.field2398), -var10 + arg1 + class159.field2385);
                                var10 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class323[] var12 = class294.field4497;
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            class323 var14 = var12[var13];
                            if (var14 != null && var14.field4869 == 10 && class20.field239[var7] == var14.field4871) {
                                class13.method77(arg5 >> 1, arg0, var8, var8.method697(arg4 + 100) + 15, 0, arg3, arg2 >> 1);
                                if (class160.field2398 > -1) {
                                    class226.field3433[var14.field4873].method935(class160.field2398 + arg6 - 12, class159.field2385 + arg1 + -var10);
                                }
                            }
                        }
                    }
                }
                if (var8.field1526 != null && (var7 >= class56.field706 || class19.field227 == 0 || class19.field227 == 3 || class19.field227 == 1 && class297.method2073((byte) -87, ((class195) var8).field2934))) {
                    class13.method77(arg5 >> 1, arg0, var8, var8.method697(0), 0, arg3, arg2 >> 1);
                    if (class160.field2398 > -1 && class55.field689 < class152.field2296) {
                        class152.field2304[class55.field689] = class217.field3299.method632(var8.field1526) / 2;
                        class152.field2294[class55.field689] = class217.field3299.field1318;
                        class152.field2302[class55.field689] = class160.field2398;
                        class152.field2297[class55.field689] = class159.field2385;
                        class152.field2301[class55.field689] = var8.field1509;
                        class152.field2300[class55.field689] = var8.field1488;
                        class152.field2303[class55.field689] = var8.field1511;
                        class152.field2298[class55.field689] = var8.field1526;
                        class55.field689++;
                    }
                }
                if (var8.field1532 > class304.field4641) {
                    class235 var21 = class223.field3399[0];
                    class235 var22 = class223.field3399[1];
                    int var23;
                    if ((var8 instanceof class69)) {
                        class69 var24 = (class69) var8;
                        class235[] var25 = (class235[]) ((class235[]) class13.field146.method2180((long) var24.field914.field783, (byte) 31));
                        if (var25 == null) {
                            var25 = class248.method1670((byte) 92, var24.field914.field783, class68.field898, 0);
                            if (var25 != null) {
                                class13.field146.method2175((long) var24.field914.field783, var25, 124);
                            }
                        }
                        if (var25 != null && var25.length == 2) {
                            var21 = var25[0];
                            var22 = var25[1];
                        }
                        class58 var26 = var24.field914;
                        if (var26.field765 == -1) {
                            var23 = var8.method697(0);
                        } else {
                            var23 = var26.field765;
                        }
                    } else {
                        var23 = var8.method697(0);
                    }
                    class13.method77(arg5 >> 1, arg0, var8, var21.field3537 + var23 + 10, 0, arg3, arg2 >> 1);
                    if (class160.field2398 > -1) {
                        int var27 = arg6 - ((var21.field3533 >> 1) - class160.field2398);
                        int var28 = class159.field2385 + arg1 - 3;
                        var21.method935(var27, var28);
                        int var29 = var8.field1503 * var21.field3533 / 255;
                        int var30 = var21.field3537;
                        if (class117.field1817) {
                            class308.method2129(var27, var28, var27 + var29, var28 + var30);
                        } else {
                            class46.method303(var27, var28, var27 + var29, var28 + var30);
                        }
                        var22.method935(var27, var28);
                        if (class117.field1817) {
                            class308.method2123(arg6, arg1, arg2 + arg6, arg1 + arg5);
                        } else {
                            class46.method301(arg6, arg1, arg2 + arg6, arg1 + arg5);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field1534[var31] > class304.field4641) {
                        int var32;
                        if ((var8 instanceof class69)) {
                            class69 var33 = (class69) var8;
                            class58 var34 = var33.field914;
                            if (var34.field765 == -1) {
                                var32 = var8.method697(0) / 2;
                            } else {
                                var32 = var34.field765 / 2;
                            }
                        } else {
                            var32 = var8.method697(0) / 2;
                        }
                        class13.method77(arg5 >> 1, arg0, var8, var32, 0, arg3, arg2 >> 1);
                        if (class160.field2398 > -1) {
                            if (var31 == 1) {
                                class159.field2385 -= 20;
                            }
                            if (var31 == 2) {
                                class159.field2385 -= 10;
                                class160.field2398 -= 15;
                            }
                            if (var31 == 3) {
                                class160.field2398 += 15;
                                class159.field2385 -= 10;
                            }
                            class230.field3482[var8.field1553[var31]].method935(class160.field2398 + arg6 - 12, class159.field2385 + arg1 + -12);
                            class61.field817.method627(Integer.toString(var8.field1521[var31]), arg6 + class160.field2398 - 1, class159.field2385 + arg1 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg4 != -100) {
            return;
        }
        for (int var35 = 0; var35 < class55.field689; var35++) {
            int var36 = class152.field2297[var35];
            int var37 = class152.field2302[var35];
            int var38 = class152.field2294[var35];
            int var39 = class152.field2304[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (var36 + 2 > class152.field2297[var41] + -class152.field2294[var41] && class152.field2297[var41] + 2 > -var38 + var36 && var37 - var39 < class152.field2304[var41] + class152.field2302[var41] && class152.field2302[var41] - class152.field2304[var41] < var37 + var39 && (class152.field2297[var41] - class152.field2294[var41]) < var36) {
                        var40 = true;
                        var36 = class152.field2297[var41] - class152.field2294[var41];
                    }
                }
            }
            class160.field2398 = class152.field2302[var35];
            class159.field2385 = class152.field2297[var35] = var36;
            String var42 = class152.field2298[var35];
            if (class311.field4725 == 0) {
                int var43 = 16776960;
                if (class152.field2301[var35] < 6) {
                    var43 = class156.field2340[class152.field2301[var35]];
                }
                if (class152.field2301[var35] == 6) {
                    var43 = class207.field3135 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class152.field2301[var35] == 7) {
                    var43 = (class207.field3135 % 20) < 10 ? 255 : 65535;
                }
                if (class152.field2301[var35] == 8) {
                    var43 = class207.field3135 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class152.field2301[var35] == 9) {
                    int var44 = 150 - class152.field2303[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 33160960 - (var44 * 327680);
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (class152.field2301[var35] == 10) {
                    int var45 = 150 - class152.field2303[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16384000 - (var45 * 327680 - 16711935);
                    } else if (var45 < 150) {
                        var43 = (var45 - 100) * 327680 + 255 - ((var45 - 100) * 5);
                    }
                }
                if (class152.field2301[var35] == 11) {
                    int var46 = 150 - class152.field2303[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = 65280 - (16384250 - (var46 * 327685));
                    } else if (var46 < 150) {
                        var43 = 49545215 - (var46 * 327680);
                    }
                }
                if (class152.field2300[var35] == 0) {
                    class217.field3299.method627(var42, arg6 + class160.field2398, class159.field2385 + arg1, var43, 0);
                }
                if (class152.field2300[var35] == 1) {
                    class217.field3299.method630(var42, class160.field2398 + arg6, class159.field2385 + arg1, var43, 0, class207.field3135);
                }
                if (class152.field2300[var35] == 2) {
                    class217.field3299.method631(var42, class160.field2398 + arg6, class159.field2385 + arg1, var43, 0, class207.field3135);
                }
                if (class152.field2300[var35] == 3) {
                    class217.field3299.method624(var42, arg6 + class160.field2398, class159.field2385 + arg1, var43, 0, class207.field3135, 150 - class152.field2303[var35]);
                }
                if (class152.field2300[var35] == 4) {
                    int var47 = (150 - class152.field2303[var35]) * (class217.field3299.method632(var42) + 100) / 150;
                    if (class117.field1817) {
                        class308.method2129(class160.field2398 + arg6 - 50, arg1, arg6 + class160.field2398 + 50, arg1 + arg5);
                    } else {
                        class46.method303(arg6 + class160.field2398 - 50, arg1, arg6 + class160.field2398 + 50, arg1 + arg5);
                    }
                    class217.field3299.method620(var42, arg6 + class160.field2398 + 50 - var47, class159.field2385 + arg1, var43, 0);
                    if (class117.field1817) {
                        class308.method2123(arg6, arg1, arg6 + arg2, arg1 + arg5);
                    } else {
                        class46.method301(arg6, arg1, arg6 + arg2, arg1 + arg5);
                    }
                }
                if (class152.field2300[var35] == 5) {
                    int var48 = 150 - class152.field2303[var35];
                    if (class117.field1817) {
                        class308.method2129(arg6, arg1 + class159.field2385 - class217.field3299.field1318 - 1, arg2 + arg6, class159.field2385 + arg1 + 5);
                    } else {
                        class46.method303(arg6, class159.field2385 + arg1 - class217.field3299.field1318 - 1, arg6 - -arg2, class159.field2385 + arg1 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class217.field3299.method627(var42, class160.field2398 + arg6, class159.field2385 + arg1 - -var49, var43, 0);
                    if (class117.field1817) {
                        class308.method2123(arg6, arg1, arg2 + arg6, arg1 - -arg5);
                    } else {
                        class46.method301(arg6, arg1, arg2 + arg6, arg1 + arg5);
                    }
                }
            } else {
                class217.field3299.method627(var42, class160.field2398 + arg6, class159.field2385 + arg1, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILf;I)V", line = 821)
    public static final void method1405(int arg0, int arg1, class329 arg2, int arg3) {
        field3071++;
        if (class145.field2197 != null || class5.field27) {
            return;
        }
        if (arg3 != 4447) {
            field3064 = 67;
        }
        if (arg2 == null || class43.method286(arg2, -24046) == null) {
            return;
        }
        class145.field2197 = arg2;
        class189.field2819 = class43.method286(arg2, -24046);
        class315.field4762 = arg1;
        class245.field3654 = 0;
        class283.field4282 = arg0;
        class75.field973 = false;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)V", line = 869)
    public static final void method1406(int arg0, byte arg1) {
        field3060++;
        int var2 = -119 % ((-arg1 - 71) / 32);
        class88.field1301.method2174(-12634, arg0);
    }
}

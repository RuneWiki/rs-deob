import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class368 {

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "Leda;")
    private class14 field5603 = new class14(64);

    @OriginalMember(owner = "client!rca", name = "o", descriptor = "Leda;")
    private class14 field5610 = new class14(100);

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "Lla;")
    private class422 field5604;

    @OriginalMember(owner = "client!rca", name = "k", descriptor = "Z")
    public static boolean field5606 = false;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!rca", name = "j", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!rca", name = "l", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!rca", name = "m", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!rca", name = "n", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIZII)V", line = 8)
    public static final void method2349(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field5600++;
        if (class488.field7062 == null) {
            class364.field5573.method3183(arg1, arg5, -16777216, arg0, -121, arg2);
        } else if (class145.field2251.field9477 >= 0 && class145.field2251.field9477 < (class191.field3229 * 512) && class145.field2251.field9475 >= 0 && class145.field2251.field9475 < class314.field4720 * 512) {
            class475.field6901++;
            if (class145.field2251 != null && class145.field2251.field9477 + 256 - (class145.field2251.method878(-5740) * 256) >> 9 == class404.field5991 && (class145.field2251.field9475 + 256 - class145.field2251.method878(arg4 ^ 0x4414) * 256 >> 9) == class257.field4036) {
                class404.field5991 = -1;
                class257.field4036 = -1;
                class508.method3061((byte) 113);
            }
            class353.method2267(true);
            if (!arg3) {
                class678.method3784(arg4 ^ 0x520F);
            }
            class582.method3361(-16385);
            class736.method4105(arg0, 8, arg2, true, arg1, arg5);
            int var6 = class103.field1535;
            int var7 = class67.field1054;
            int var8 = class705.field9955;
            class106.field1553 = class106.field1554;
            int var9 = class463.field6749;
            if (class639.field8978 == 1) {
                int var10 = (int) class490.field7077;
                if (var10 < class87.field1282 >> 8) {
                    var10 = class87.field1282 >> 8;
                }
                if (class235.field3785[4] && class601.field8509[4] + 128 > var10) {
                    var10 = class601.field8509[4] + 128;
                }
                int var11 = (int) class261.field4064 + class174.field2979 & 0x3FFF;
                class671.method3752(var11, class141.field2213, var7, class701.field9907, var10, class232.method1611(class145.field2251.field9475, class145.field2251.field9477, class582.field8234, (byte) 96) - 200, true, (var10 >> 3) * 3 + 600 << 2);
            } else if (class639.field8978 == 4) {
                int var12 = (int) class490.field7077;
                if (class87.field1282 >> 8 > var12) {
                    var12 = class87.field1282 >> 8;
                }
                if (class235.field3785[4] && (class601.field8509[4] + 128) > var12) {
                    var12 = class601.field8509[4] + 128;
                }
                int var13 = (int) class261.field4064 & 0x3FFF;
                class671.method3752(var13, class141.field2213, var7, class701.field9907, var12, class232.method1611(class617.field8705, class590.field8319, class582.field8234, (byte) 103) - 200, true, (var12 >> 3) * 3 + 600 << 2);
            } else if (class639.field8978 == 5) {
                class106.method858(var7, (byte) 61);
            }
            int var14 = class497.field7212;
            int var15 = class101.field1507;
            int var16 = class329.field4857;
            int var17 = class81.field1167;
            int var18 = class608.field8587;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class235.field3785[var19]) {
                    int var22 = (int) ((double) (-class707.field9972[var19]) + (double) (class707.field9972[var19] * 2 + 1) * Math.random() + Math.sin((double) class617.field8699[var19] / 100.0D * (double) class68.field1066[var19]) * (double) class601.field8509[var19]);
                    if (var19 == 2) {
                        class329.field4857 += var22 << 2;
                    }
                    if (var19 == 1) {
                        class101.field1507 += var22 << 2;
                    }
                    if (var19 == 4) {
                        class81.field1167 += var22;
                        if (class81.field1167 < 1024) {
                            class81.field1167 = 1024;
                        } else if (class81.field1167 > 3072) {
                            class81.field1167 = 3072;
                        }
                    }
                    if (var19 == 0) {
                        class497.field7212 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class608.field8587 = class608.field8587 + var22 & 0x3FFF;
                    }
                }
            }
            if (class497.field7212 < 0) {
                class497.field7212 = 0;
            }
            if (class329.field4857 < 0) {
                class329.field4857 = 0;
            }
            if (class497.field7212 > (class42.field727 << 9) - 1) {
                class497.field7212 = (class42.field727 << 9) - 1;
            }
            if (class329.field4857 > ((class54.field870 << 9) - 1)) {
                class329.field4857 = (class54.field870 << 9) - 1;
            }
            class458.method2799((byte) -78);
            class516.method3089(arg4 + 21119);
            class364.field5573.method240(var8, var9, var6 + var8, var7 + var9);
            class317.method2081(true, (byte) -108);
            if (class250.field3989) {
                class210.method1523(arg4 + 21216, class257.field4037);
                if (class200.field3406 != class106.field1553) {
                    class245.field3947 = true;
                }
                class200.field3406 = class106.field1553;
            } else {
                class364.field5573.method1287();
                int var20 = class257.field4037;
                if (class93.field1395 == null) {
                    class364.field5573.method1328(var20);
                } else {
                    class93.field1395.method2150(-12886, var9, var8, var20, var6, class364.field5573, var7, class81.field1167, class98.field1450 << 3, class608.field8587);
                }
            }
            class493.method2998((byte) -116);
            class257.field4038.method668(class497.field7212, class101.field1507, class329.field4857, -class81.field1167 & 0x3FFF, -class608.field8587 & 0x3FFF, -class40.field714 & 0x3FFF);
            class364.field5573.method244(class257.field4038);
            class364.field5573.method288(var8 + (var6 / 2), var7 / 2 + var9, class79.field1160 << 1, class79.field1160 << 1);
            class644.method3635(var8 + (var6 / 2), class79.field1160 << 1, (byte) 11, class79.field1160 << 1, var7 / 2 + var9);
            class52.method501(class497.field7212, class101.field1507, -class608.field8587 & 0x3FFF, class329.field4857, -class40.field714 & 0x3FFF, -class81.field1167 & 0x3FFF, 705841378);
            byte var21 = class654.field9289.field5404.method136(3) == 2 ? (byte) class475.field6901 : 1;
            if (class250.field3989) {
                class545.method3196(-class40.field714 & 0x3FFF, -class608.field8587 & 0x3FFF, 2, -class81.field1167 & 0x3FFF);
                class231.method1601(class199.field3403, true, class145.field2251.field9475 >> 9, class101.field1507, class555.field7915, var21, true, class642.field9111, class327.field4817, class106.field1553, class145.field2251.field9477 >> 9, class670.field9489, class145.field2251.field9470 + 1, class596.field8450, class497.field7212, class654.field9289.field5438.method3453(arg4 ^ 0xFFFFAD83) == 0, class329.field4857, class311.field4689);
            } else {
                class262.method1745(class199.field3403, class497.field7212, class101.field1507, class329.field4857, class327.field4817, class596.field8450, class642.field9111, class670.field9489, class311.field4689, class555.field7915, class145.field2251.field9470 + 1, var21, class145.field2251.field9477 >> 9, class145.field2251.field9475 >> 9, class654.field9289.field5438.method3453(3) == 0, true, class141.field2211 ? class106.field1553 : -1, 0, false);
            }
            class493.method2998((byte) -123);
            if (arg4 == -21120) {
                if (class521.field7529 == 10) {
                    class369.method2361(256, 256, 256, var6, var7, var9, var8);
                    class532.method3145(var8, 256, var6, var7, 256, var9, false);
                    class340.method2172(256, 256, var9, var6, var8, arg4 ^ 0xFFFFAD94, var7);
                    class751.method4188(var9, -8, var6, var7, var8);
                }
                class742.method4157();
                class497.field7212 = var14;
                class329.field4857 = var16;
                class101.field1507 = var15;
                class81.field1167 = var17;
                class608.field8587 = var18;
                if (class481.field6947 && class570.field8089.method2940((byte) -69) == 0) {
                    class481.field6947 = false;
                }
                if (class481.field6947) {
                    class364.field5573.method3183(var6, var7, -16777216, var9, 87, var8);
                    class104.method853(class594.field8343, class641.field9005.method3621(95, class467.field6804), class364.field5573, (byte) -10, class74.field1105, false);
                }
                class317.method2081(false, (byte) -126);
            }
        } else {
            class364.field5573.method3183(arg1, arg5, -16777216, arg0, 79, arg2);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZ)Llk;", line = 230)
    public final class249 method2350(int arg0, boolean arg1) {
        field5598++;
        class14 var3 = this.field5610;
        class249 var4;
        synchronized (this.field5610) {
            var4 = (class249) this.field5610.method80((byte) -48, (long) arg0);
            if (var4 == null) {
                var4 = new class249(arg0);
                this.field5610.method67((long) arg0, var4, -6772);
            }
            if (!var4.method1708(114)) {
                return null;
            }
        }
        return arg1 ? var4 : null;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V", line = 257)
    public static final void method2351(int arg0) {
        class379.field5696.method3517(-106);
        if (arg0 != -30564) {
            field5606 = false;
        }
        field5607++;
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)V", line = 268)
    public static final void method2352(int arg0) {
        field5609++;
        for (int var1 = 0; var1 < class245.field3937; var1++) {
            int var3 = class590.method3390(class245.field3937, 31019, class285.field4381 + var1) * class390.field5830;
            for (int var4 = 0; var4 < class390.field5830; var4++) {
                int var5 = var3 + class590.method3390(class390.field5830, 31019, class84.field1241 + var4);
                if (class693.field9827[var5] == class418.field6149) {
                    class70.field1087[var5].method54(0, 0, class412.field6070, class362.field5468, class412.field6070 * var4, class362.field5468 * var1, true, true);
                }
            }
        }
        int var2 = 71 / ((arg0 + 46) / 39);
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)V", line = 303)
    public final void method2353(int arg0) {
        if (arg0 != 25841) {
            this.field5610 = null;
        }
        class14 var2 = this.field5603;
        synchronized (this.field5603) {
            this.field5603.method71((byte) 44);
        }
        field5605++;
        class14 var3 = this.field5610;
        synchronized (this.field5610) {
            this.field5610.method71((byte) 44);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)Liba;", line = 321)
    public static final class302 method2354(byte arg0) {
        field5602++;
        if (class729.field10210 == null || class660.field9393 == null) {
            return null;
        }
        if (arg0 != -16) {
            method2355(-121, -99, -96);
        }
        for (class302 var1 = (class302) class660.field9393.method446((byte) 101); var1 != null; var1 = (class302) class660.field9393.method446((byte) 106)) {
            class277 var2 = class729.field10206.method2550(var1.field4601, arg0 + 138);
            if (var2 != null && var2.field4210 && var2.method1813((byte) 34, class729.field10200)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)Z", line = 349)
    public static final boolean method2355(int arg0, int arg1, int arg2) {
        if (arg0 != -11) {
            field5606 = false;
        }
        field5599++;
        return class505.method3055(arg1, arg2, (byte) -45) & class422.method2610(arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z)V", line = 360)
    public final void method2356(boolean arg0) {
        field5597++;
        class14 var2 = this.field5603;
        synchronized (this.field5603) {
            this.field5603.method76(-118);
        }
        class14 var3 = this.field5610;
        synchronized (this.field5610) {
            this.field5610.method76(50);
            if (!arg0) {
                this.method2359(-114, (byte) 1);
            }
        }
    }

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "(I)V", line = 378)
    public static final void method2357(int arg0) {
        field5601++;
        class551.method3214((byte) -118, (long) class199.field3403, class364.field5573);
        if (class673.field9523 != -1) {
            class292.method1900(1592, class673.field9523);
        }
        for (int var1 = 0; var1 < class429.field6280; var1++) {
            if (class6.field66[var1]) {
                class376.field5666[var1] = true;
            }
            class580.field8207[var1] = class6.field66[var1];
            class6.field66[var1] = false;
        }
        int var2 = 108 / ((arg0 + 14) / 49);
        class285.field4389 = class199.field3403;
        if (class673.field9523 != -1) {
            class429.field6280 = 0;
            class714.method3951((byte) -102);
        }
        class364.field5573.method374();
        class754.method4203(class364.field5573, false);
        int var3 = class451.method2769(9264);
        if (var3 == -1) {
            var3 = class618.field8708;
        }
        if (var3 == -1) {
            var3 = class472.field6844;
        }
        class106.method860(var3, true);
        class83.field1223 = 0;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BI)Lvga;", line = 430)
    public final class82 method2358(byte arg0, int arg1) {
        field5608++;
        class14 var3 = this.field5603;
        class82 var4;
        synchronized (this.field5603) {
            var4 = (class82) this.field5603.method80((byte) -18, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field5604;
        byte[] var6;
        synchronized (this.field5604) {
            var6 = this.field5604.method2624(0, class56.method526(arg1, 1011191591), class82.method729(127, arg1));
        }
        class82 var7 = new class82();
        var7.field1198 = arg1;
        var7.field1180 = this;
        if (var6 != null) {
            var7.method734(new class301(var6), (byte) 77);
        }
        var7.method736(99);
        class14 var8 = this.field5603;
        synchronized (this.field5603) {
            this.field5603.method67((long) arg1, var7, -6772);
            int var9 = 22 % ((arg0 + 1) / 47);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lcr;ILla;Lla;Lla;)V", line = 486)
    public class368(class292 arg0, int arg1, class422 arg2, class422 arg3, class422 arg4) {
        this.field5604 = arg2;
        if (this.field5604 != null) {
            int var6 = this.field5604.method2628(-100) - 1;
            this.field5604.method2615(0, var6);
        }
        class59.method584(arg3, 2, arg4, false);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IB)V", line = 467)
    public final void method2359(int arg0, byte arg1) {
        class14 var3 = this.field5603;
        synchronized (this.field5603) {
            if (arg1 != 72) {
                this.method2353(-58);
            }
            this.field5603.method68(arg1 - 16950, arg0);
        }
        field5596++;
        class14 var4 = this.field5610;
        synchronized (this.field5610) {
            this.field5610.method68(-16878, arg0);
        }
    }
}

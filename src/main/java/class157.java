import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class157 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lv;")
    public class146 field3583 = new class146();

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static volatile int field3588 = 0;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "Lec;")
    public static class32 field3594 = class73.method594("hel", true);

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Lec;")
    public static class32 field3602 = class73.method594("Ein kostenloses Spielkonto erstellen)3", true);

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Lwd;")
    public static class157 field3596 = new class157();

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "Lec;")
    private static class32 field3603 = class73.method594("Loading wordpack )2 ", true);

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "Lec;")
    public static class32 field3604 = field3603;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "[I")
    public static int[] field3609 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "Z")
    public static boolean field3607 = false;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "Lv;")
    private class146 field3605;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "Lwc;")
    public static class156 field3599;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "Lf;")
    public static class36 field3606;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lga;")
    public static class44 field3598;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public final void method1206(byte arg0) {
        if (arg0 != -19) {
            return;
        }
        field3587++;
        while (true) {
            class146 var2 = this.field3583.field3322;
            if (this.field3583 == var2) {
                return;
            }
            var2.method1093(0);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
    public static final void method1207(int arg0, int arg1, int arg2) {
        class157 var3 = class23.field397[class43.field990][arg2][arg1];
        field3600++;
        if (var3 == null) {
            class159.field3659.method1128(class43.field990, arg2, arg1);
            return;
        }
        int var4 = -99999999;
        class17 var5 = null;
        for (class17 var6 = (class17) var3.method1213(97); var6 != null; var6 = (class17) var3.method1211(-3)) {
            class62 var11 = class146.method1094(var6.field333, arg0 + 90);
            int var12 = var11.field1376;
            if (var11.field1410 == 1) {
                var12 = (var6.field336 + 1) * var12;
            }
            if (var12 > var4) {
                var5 = var6;
                var4 = var12;
            }
        }
        if (arg0 != -1) {
            return;
        }
        if (var5 == null) {
            class159.field3659.method1128(class43.field990, arg2, arg1);
            return;
        }
        var3.method1209(arg0 ^ 0x31, var5);
        class17 var7 = null;
        class17 var8 = (class17) var3.method1213(arg0 + 101);
        class17 var9 = null;
        while (var8 != null) {
            if (var5.field333 != var8.field333) {
                if (var7 == null) {
                    var7 = var8;
                }
                if (var7.field333 != var8.field333 && var9 == null) {
                    var9 = var8;
                }
            }
            var8 = (class17) var3.method1211(arg0 - 2);
        }
        int var10 = (arg1 << 7) + arg2 + 1610612736;
        class159.field3659.method1167(class43.field990, arg2, arg1, class83.method654(-5736, class43.field990, arg2 * 128 + 64, arg1 * 128 + 64), var5, var10, var7, var9);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)Lv;")
    public final class146 method1208(byte arg0) {
        field3581++;
        class146 var2 = this.field3583.field3318;
        if (arg0 <= 97) {
            return null;
        } else if (this.field3583 == var2) {
            return null;
        } else {
            var2.method1093(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILv;)V")
    public final void method1209(int arg0, class146 arg1) {
        if (arg1.field3318 != null) {
            arg1.method1093(0);
        }
        arg1.field3322 = this.field3583.field3322;
        arg1.field3318 = this.field3583;
        arg1.field3318.field3322 = arg1;
        field3591++;
        if (arg0 <= -12) {
            arg1.field3322.field3318 = arg1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Lv;")
    public final class146 method1210(int arg0) {
        if (arg0 != -1) {
            return null;
        }
        field3582++;
        class146 var2 = this.field3605;
        if (this.field3583 == var2) {
            this.field3605 = null;
            return null;
        } else {
            this.field3605 = var2.field3318;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lv;")
    public final class146 method1211(int arg0) {
        field3589++;
        class146 var2 = this.field3605;
        if (this.field3583 == var2) {
            this.field3605 = null;
            return null;
        }
        if (arg0 != -3) {
            method1219((byte) -55);
        }
        this.field3605 = var2.field3322;
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Z")
    public static final boolean method1212(int arg0, int arg1) {
        field3580++;
        if (arg1 != -8956) {
            field3598 = null;
        }
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Lv;")
    public final class146 method1213(int arg0) {
        class146 var2 = this.field3583.field3322;
        field3584++;
        if (this.field3583 == var2) {
            this.field3605 = null;
            return null;
        }
        if (arg0 < 80) {
            field3596 = null;
        }
        this.field3605 = var2.field3322;
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)Z")
    public static final boolean method1214(int arg0, int arg1) {
        field3595++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        }
        if (arg1 != -1) {
            field3608 = 52;
        }
        if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public static final void method1215(boolean arg0) {
        int var1 = class83.field1923 * 128 + 64;
        int var2 = class106.field2530 * 128 + 64;
        field3597++;
        int var3 = class83.method654(-5736, class43.field990, var1, var2) - class142.field3255;
        if (arg0) {
            field3609 = null;
        }
        if (class105.field2496 < var1) {
            class105.field2496 += (var1 - class105.field2496) * class89.field2060 / 1000 + class80.field1837;
            if (var1 < class105.field2496) {
                class105.field2496 = var1;
            }
        }
        if (var3 > class73.field1720) {
            class73.field1720 += (var3 - class73.field1720) * class89.field2060 / 1000 + class80.field1837;
            if (class73.field1720 > var3) {
                class73.field1720 = var3;
            }
        }
        if (var3 < class73.field1720) {
            class73.field1720 -= (class73.field1720 - var3) * class89.field2060 / 1000 + class80.field1837;
            if (var3 > class73.field1720) {
                class73.field1720 = var3;
            }
        }
        if (class48.field1127 < var2) {
            class48.field1127 += (var2 - class48.field1127) * class89.field2060 / 1000 + class80.field1837;
            if (var2 < class48.field1127) {
                class48.field1127 = var2;
            }
        }
        if (var1 < class105.field2496) {
            class105.field2496 -= class80.field1837 + (class105.field2496 - var1) * class89.field2060 / 1000;
            if (class105.field2496 < var1) {
                class105.field2496 = var1;
            }
        }
        int var4 = class86.field2022 * 128 + 64;
        if (class48.field1127 > var2) {
            class48.field1127 -= (class48.field1127 - var2) * class89.field2060 / 1000 + class80.field1837;
            if (var2 > class48.field1127) {
                class48.field1127 = var2;
            }
        }
        int var5 = class37.field897 * 128 + 64;
        int var6 = class83.method654(-5736, class43.field990, var4, var5) - class61.field1360;
        int var7 = var5 - class48.field1127;
        int var8 = var4 - class105.field2496;
        int var9 = var6 - class73.field1720;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var7 * var7));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var8, (double) var7) * -325.949D) & 0x7FF;
        int var13 = var12 - class115.field2720;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class45.field1050 < var11) {
            class45.field1050 += class94.field2176 + (var11 - class45.field1050) * class79.field1825 / 1000;
            if (class45.field1050 > var11) {
                class45.field1050 = var11;
            }
        }
        if (var13 > 0) {
            class115.field2720 += class79.field1825 * var13 / 1000 + class94.field2176;
            class115.field2720 &= 0x7FF;
        }
        if (var13 < 0) {
            class115.field2720 -= class94.field2176 + -var13 * class79.field1825 / 1000;
            class115.field2720 &= 0x7FF;
        }
        if (var11 < class45.field1050) {
            class45.field1050 -= (class45.field1050 - var11) * class79.field1825 / 1000 + class94.field2176;
            if (class45.field1050 < var11) {
                class45.field1050 = var11;
            }
        }
        int var14 = var12 - class115.field2720;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class115.field2720 = var12;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lv;B)V")
    public final void method1216(class146 arg0, byte arg1) {
        if (arg0.field3318 != null) {
            arg0.method1093(0);
        }
        arg0.field3318 = this.field3583.field3318;
        arg0.field3322 = this.field3583;
        arg0.field3318.field3322 = arg0;
        field3601++;
        if (arg1 <= 33) {
            method1207(-120, 28, -15);
        }
        arg0.field3322.field3318 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)Lv;")
    public final class146 method1217(byte arg0) {
        field3592++;
        class146 var2 = this.field3583.field3322;
        int var3 = -57 % ((arg0 - 29) / 46);
        if (this.field3583 == var2) {
            return null;
        } else {
            var2.method1093(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lv;Lv;I)V")
    public final void method1218(class146 arg0, class146 arg1, int arg2) {
        field3593++;
        if (arg0.field3318 != null) {
            arg0.method1093(0);
        }
        arg0.field3318 = arg1.field3318;
        arg0.field3322 = arg1;
        arg0.field3318.field3322 = arg0;
        if (arg2 < 114) {
            field3594 = null;
        }
        arg0.field3322.field3318 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)V")
    public static void method1219(byte arg0) {
        field3602 = null;
        field3606 = null;
        field3598 = null;
        field3599 = null;
        field3594 = null;
        if (arg0 >= -7) {
            method1221(-77);
        }
        field3604 = null;
        field3609 = null;
        field3596 = null;
        field3603 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLf;I)I")
    public static final int method1220(byte arg0, class36 arg1, int arg2) {
        field3590++;
        if (arg1.field843 == null || arg2 >= arg1.field843.length) {
            return -2;
        }
        try {
            if (arg0 != 23) {
                method1215(false);
            }
            int[] var3 = arg1.field843[arg2];
            byte var4 = 0;
            int var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var6++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 1) {
                    var8 = class137.field3175[var3[var6++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 2) {
                    var8 = class50.field1160[var3[var6++]];
                }
                if (var7 == 3) {
                    var8 = class17.field343[var3[var6++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class36 var12 = class128.method993(var11, 62);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class146.method1094(var13, 125).field1393 || class146.field3317)) {
                        for (int var14 = 0; var14 < var12.field835.length; var14++) {
                            if (var13 + 1 == var12.field835[var14]) {
                                var8 += var12.field754[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class27.field504[var3[var6++]];
                }
                if (var7 == 6) {
                    var8 = class135.field3144[class50.field1160[var3[var6++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class27.field504[var3[var6++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class20.field373.field1636;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class45.field1070[var15]) {
                            var8 += class50.field1160[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class36 var18 = class128.method993(var17, -126);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class146.method1094(var19, 51).field1393 || class146.field3317)) {
                        for (int var20 = 0; var20 < var18.field835.length; var20++) {
                            if (var19 + 1 == var18.field835[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class136.field3155;
                }
                if (var7 == 12) {
                    var8 = class3.field49;
                }
                if (var7 == 13) {
                    int var21 = class27.field504[var3[var6++]];
                    int var22 = var3[var6++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var6++];
                    var8 = class70.method578((byte) -98, var23);
                }
                if (var7 == 18) {
                    var8 = (class20.field373.field2749 >> 7) + class72.field1701;
                }
                if (var7 == 19) {
                    var8 = (class20.field373.field2700 >> 7) + class118.field2838;
                }
                if (var7 == 20) {
                    var8 = var3[var6++];
                }
                if (var9 == 0) {
                    if (var4 == 0) {
                        var5 += var8;
                    }
                    if (var4 == 1) {
                        var5 -= var8;
                    }
                    if (var4 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var4 == 3) {
                        var5 *= var8;
                    }
                    var4 = 0;
                } else {
                    var4 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public static final void method1221(int arg0) {
        if (arg0 < 92) {
            method1219((byte) 80);
        }
        class2.field24.method491(-113);
        field3585++;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)Lv;")
    public final class146 method1222(int arg0) {
        field3586++;
        if (arg0 != -49) {
            field3609 = null;
        }
        class146 var2 = this.field3583.field3318;
        if (this.field3583 == var2) {
            this.field3605 = null;
            return null;
        } else {
            this.field3605 = var2.field3318;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class157() {
        this.field3583.field3318 = this.field3583;
        this.field3583.field3322 = this.field3583;
    }
}

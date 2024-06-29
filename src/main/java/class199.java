import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class199 {

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    private int field3335 = 32;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "J")
    private long field3361 = class78.method669(2047);

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    private int field3363 = 0;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "[Loj;")
    private class307[] field3364 = new class307[8];

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    private int field3368 = 0;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    private int field3366 = 0;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    private int field3375 = 0;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "J")
    private long field3372 = 0L;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "J")
    private long field3374 = 0L;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "[Loj;")
    private class307[] field3371 = new class307[8];

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "Z")
    private boolean field3369 = true;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "Lwa;")
    private static class75 field3354 = class66.method560("Take", false);

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lwa;")
    private static class75 field3342 = class66.method560("red:", false);

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Lwa;")
    public static class75 field3345 = class66.method560("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", false);

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Lwa;")
    public static class75 field3351 = field3342;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Lwa;")
    public static class75 field3352 = field3342;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lwa;")
    public static class75 field3339 = field3354;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[I")
    public static int[] field3333 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public int field3365;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    public int field3367;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    private int field3376;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Loj;")
    private class307 field3348;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "[I")
    public int[] field3359;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 6)
    public final synchronized void method1474(boolean arg0) {
        if (arg0) {
            this.method1486(-28, (class307) null);
        }
        this.field3369 = true;
        try {
            this.method243();
        } catch (Exception var3) {
            this.method240();
            this.field3372 = class78.method669(2047) + 2000L;
        }
        field3337++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)Lte;", line = 31)
    public static final class278 method1475(int arg0, byte arg1) {
        class278 var2 = (class278) class31.field451.method1193((long) arg0, -120);
        field3344++;
        if (var2 != null) {
            return var2;
        }
        int var3 = 55 / ((arg1 - 49) / 57);
        byte[] var4 = class191.field3186.method1911(class246.method1779(arg0, 1552403112), class30.method203((byte) 123, arg0), -62);
        class278 var5 = new class278();
        var5.field4786 = arg0;
        if (var4 != null) {
            var5.method1973(new class60(var4), -75);
        }
        var5.method1974(-64);
        if (var5.field4800 != -1) {
            var5.method1987(method1475(var5.field4800, (byte) -52), method1475(var5.field4795, (byte) -25), 1);
        }
        if (var5.field4776 != -1) {
            var5.method1983(method1475(var5.field4776, (byte) -109), method1475(var5.field4772, (byte) 110), (byte) -101);
        }
        if (!class2.field19 && var5.field4804) {
            var5.field4822 = null;
            var5.field4770 = class175.field2936;
            var5.field4764 = false;
            var5.field4769 = null;
            var5.field4806 = 0;
        }
        class31.field451.method1194(var5, (long) arg0, false);
        return var5;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V", line = 80)
    public final synchronized void method1476(boolean arg0) {
        field3349++;
        if (arg0) {
            field3333 = (int[]) null;
        }
        if (class301.field5141 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class301.field5141.field5184[var3] == this) {
                    class301.field5141.field5184[var3] = null;
                }
                if (class301.field5141.field5184[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class301.field5141.field5188 = true;
                while (class301.field5141.field5186) {
                    class235.method1708(96, 50L);
                }
                class301.field5141 = null;
            }
        }
        this.method240();
        this.field3359 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZZLcl;)V", line = 125)
    public static final void method1477(boolean arg0, boolean arg1, class124 arg2) {
        field3341++;
        if (arg0) {
            field3333 = (int[]) null;
        }
        if (arg1) {
            class253.field4256 = 3;
            class182.method1344(false, (byte) 54);
            class157.field2692 = 0;
            class151.field2599 = false;
            class279.field4838 = false;
            class167.field2816 = false;
            class75.field1286 = false;
            class17.field221 = 127;
            class273.field4709 = false;
            class74.field1239 = false;
            class69.field1193 = false;
            class75.field1293 = false;
            class246.field4140 = false;
            class285.field4909 = 127;
            class164.field2783 = 255;
            class161.field2727 = false;
            class285.field4901 = 0;
            class116.field1970 = false;
            class125.field2088 = false;
            class177.field2985 = 0;
            class274.field4727 = 0;
            class64.method549(0, arg2);
            return;
        }
        class58 var3 = null;
        class253.field4256 = 3;
        class182.method1344(true, (byte) 54);
        class75.field1286 = true;
        class116.field1970 = true;
        class273.field4709 = true;
        class69.field1193 = true;
        class177.field2985 = 0;
        class246.field4140 = true;
        class75.field1293 = true;
        class151.field2599 = true;
        class279.field4838 = true;
        class157.field2692 = 2;
        class161.field2727 = true;
        class285.field4901 = 0;
        class74.field1239 = true;
        class285.field4909 = 127;
        class125.field2088 = true;
        class274.field4727 = 0;
        class167.field2816 = true;
        class17.field221 = 127;
        class164.field2783 = 255;
        try {
            class77 var4 = arg2.method935("runescape", !arg0);
            while (var4.field1330 == 0) {
                class235.method1708(93, 1L);
            }
            if (var4.field1330 == 1) {
                var3 = (class58) var4.field1329;
                byte[] var5 = new byte[(int) var3.method466(92)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var3.method470(var6, var5.length - var6, var5, (byte) -47);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class85.method692(new class60(var5), (byte) 103);
            }
        } catch (Exception var11) {
        }
        try {
            if (var3 != null) {
                var3.method465(-1);
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILwa;)V", line = 229)
    public static final void method1478(int arg0, class75 arg1) {
        field3338++;
        if (class311.field5295 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method630(-54);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class311.field5295.length && class311.field5295[var2].field3488 != var3) {
            var2++;
        }
        if (class311.field5295.length > var2 && class311.field5295[var2] != null) {
            class89.field1470.method87(65280, 216);
            class89.field1470.method514(30009, class311.field5295[var2].field3488);
            int var5 = -38 % ((arg0 + 19) / 38);
            class30.field430++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 269)
    public void method242(int arg0) throws Exception {
        field3356++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V", line = 276)
    public void method238() throws Exception {
        field3355++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)V", line = 284)
    public static final void method1479(int arg0, int arg1, int arg2, int arg3) {
        field3343++;
        class156 var4 = class206.method1525(9, -32701, arg3);
        var4.method1183(true);
        var4.field2665 = arg0;
        var4.field2680 = arg2;
        if (arg1 != 20142) {
            method1475(125, (byte) 82);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 301)
    public final synchronized void method1480(int arg0) {
        field3358++;
        if (this.field3359 == null) {
            return;
        }
        long var2 = class78.method669(2047);
        try {
            if (this.field3372 != 0L) {
                if (this.field3372 > var2) {
                    return;
                }
                this.method242(this.field3367);
                this.field3369 = true;
                this.field3372 = 0L;
            }
            int var4 = this.method241();
            int var5 = 40 / ((-arg0 - 12) / 53);
            int var6 = this.field3376 + this.field3365;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if ((this.field3375 - var4) > this.field3368) {
                this.field3368 = this.field3375 - var4;
            }
            if (this.field3367 < (var6 + 256)) {
                var4 = 0;
                this.field3367 += 1024;
                if (this.field3367 > 16384) {
                    this.field3367 = 16384;
                }
                this.method240();
                this.method242(this.field3367);
                if ((var6 + 256) > this.field3367) {
                    var6 = this.field3367 - 256;
                    this.field3376 = var6 - this.field3365;
                }
                this.field3369 = true;
            }
            while (var4 < var6) {
                this.method1490(this.field3359, 256);
                var4 += 256;
                this.method238();
            }
            if (this.field3374 < var2) {
                if (this.field3369) {
                    this.field3369 = false;
                } else if (this.field3368 == 0 && this.field3366 == 0) {
                    this.method240();
                    this.field3372 = var2 + 2000L;
                    return;
                } else {
                    this.field3376 = Math.min(this.field3366, this.field3368);
                    this.field3366 = this.field3368;
                }
                this.field3368 = 0;
                this.field3374 = var2 + 2000L;
            }
            this.field3375 = var4;
        } catch (Exception var10) {
            this.method240();
            this.field3372 = var2 + 2000L;
        }
        try {
            if ((this.field3361 + 500000L) < var2) {
                var2 = this.field3361;
            }
            while (this.field3361 + 5000L < var2) {
                this.method1481(256, (byte) 73);
                this.field3361 += (long) (256000 / class99.field1644);
            }
        } catch (Exception var9) {
            this.field3361 = var2;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(IB)V", line = 426)
    private final void method1481(int arg0, byte arg1) {
        field3334++;
        if (arg1 < 30) {
            this.field3374 = 103L;
        }
        this.field3363 -= arg0;
        if (this.field3363 < 0) {
            this.field3363 = 0;
        }
        if (this.field3348 != null) {
            this.field3348.method977(arg0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 448)
    public static final void method1482(byte arg0) {
        if (arg0 <= 90) {
            field3333 = (int[]) null;
        }
        field3346++;
        class274.field4730.method1201(-20111);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()V", line = 460)
    public void method240() {
        field3332++;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V", line = 479)
    public static void method1483(byte arg0) {
        field3352 = null;
        field3339 = null;
        field3351 = null;
        field3354 = null;
        field3333 = null;
        field3345 = null;
        int var1 = -52 % ((arg0 + 31) / 46);
        field3342 = null;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V", line = 495)
    public final void method1484(int arg0) {
        field3340++;
        int var2 = 96 % ((-arg0 - 12) / 40);
        this.field3369 = true;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V", line = 508)
    public static final void method1485(int arg0) {
        field3353++;
        if (class236.field3981 == null) {
            return;
        }
        if (class170.field2864 < 10) {
            if (!class59.field995.method1896(class236.field3981.field2974, arg0 ^ 0x62FF7FA0) || !class59.field995.method1896(class66.method562((byte) -123, new class75[] { class236.field3981.field2974, class108.field1810 }), -4570)) {
                class170.field2864 = class249.field4199.method1904(class236.field3981.field2974, 4979) / 10;
                return;
            }
            class149.method1146((byte) -38);
            class170.field2864 = 10;
        }
        if (class170.field2864 == 10) {
            class205.field3468 = 8.0F;
            class7.field102 = 8.0F;
            class130.field2252 = class236.field3981.field2971 >> 6 << 6;
            class82.field1374 = class236.field3981.field2988 >> 6 << 6;
            class215.field3668 = (class236.field3981.field2981 >> 6 << 6) + 64 - class130.field2252;
            class39.field589 = (class236.field3981.field2976 >> 6 << 6) + 64 - class82.field1374;
            int var1 = class215.field3668 + class130.field2252 - ((class279.field4831.field3218 >> 7) + class175.field2939) - 1;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var3 = class275.field4737 + (class279.field4831.field3259 >> 7) - class82.field1374;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var4 >= 0 && var4 < class39.field589 && var2 >= 0 && var2 < class215.field3668) {
                class215.field3666 = var2;
                class76.field1320 = var4;
            } else {
                class215.field3666 = class215.field3668 + class130.field2252 - (class236.field3981.field2980 * 64) - 1;
                class76.field1320 = class236.field3981.field2990 * 64 - class82.field1374;
            }
            class3.method15(8887);
            class82.field1375 = new int[class2.field21 + 1];
            int var5 = class45.field730 >> 1;
            int var6 = class163.field2766 >> 2 << 10;
            int var7 = class39.field589 >> 6;
            int var8 = class215.field3668 >> 6;
            class281.field4851 = new int[var7][var8][];
            class272.field4690 = new byte[var7][var8][];
            class245.field4123 = new byte[var7][var8][];
            class297.field5081 = new byte[var7][var8][];
            class153.field2631 = new int[var7][var8][];
            class89.field1469 = new byte[var7][var8][];
            class54.field887 = new short[var7][var8][];
            class283.field4875 = new byte[var7][var8][];
            class175.method1289(var6, true, var5);
            class170.field2864 = 20;
        } else if (class170.field2864 == 20) {
            class121.method921((byte) 72, new class60(class59.field995.method1906(-1, class236.field3981.field2974, class310.field5284)));
            class170.field2864 = 30;
            class136.method1040(32, true);
            class259.method1850(arg0 ^ 0x9D009188);
        } else if (class170.field2864 == 30) {
            class265.method1888(new class60(class59.field995.method1906(-1, class236.field3981.field2974, class82.field1370)), -122);
            class170.field2864 = 40;
            class259.method1850(arg0 ^ 0x9D009188);
        } else if (class170.field2864 == 40) {
            class39.method271(new class60(class59.field995.method1906(arg0 + 1660907129, class236.field3981.field2974, class63.field1106)), 0);
            class170.field2864 = 50;
            class259.method1850(14);
        } else if (class170.field2864 == 50) {
            class11.method60(new class60(class59.field995.method1906(-1, class236.field3981.field2974, class9.field115)), (byte) 123);
            class170.field2864 = 60;
            class136.method1040(arg0 + 1660907162, true);
            class259.method1850(14);
        } else if (class170.field2864 == 60) {
            class283.field4876 = class112.method869(class66.method562((byte) 117, new class75[] { class236.field3981.field2974, class108.field1810 }), class59.field995, 8958);
            class170.field2864 = 70;
            class259.method1850(14);
        } else if (class170.field2864 == 70) {
            class168.field2834 = new class15(11, true, class237.field3991);
            class170.field2864 = 73;
            class136.method1040(32, true);
            class259.method1850(14);
        } else if (class170.field2864 == 73) {
            class91.field1504 = new class15(12, true, class237.field3991);
            class170.field2864 = 76;
            class136.method1040(32, true);
            class259.method1850(14);
        } else if (class170.field2864 == 76) {
            class59.field994 = new class15(14, true, class237.field3991);
            class170.field2864 = 79;
            class136.method1040(32, true);
            class259.method1850(14);
        } else if (class170.field2864 == 79) {
            class16.field200 = new class15(17, true, class237.field3991);
            class170.field2864 = 82;
            class136.method1040(32, true);
            class259.method1850(14);
        } else if (class170.field2864 == 82) {
            class149.field2569 = new class15(19, true, class237.field3991);
            class170.field2864 = 85;
            class136.method1040(32, true);
            class259.method1850(14);
        } else if (class170.field2864 == 85) {
            class195.field3289 = new class15(22, true, class237.field3991);
            class170.field2864 = 88;
            class136.method1040(32, true);
            class259.method1850(14);
        } else {
            if (arg0 != -1660907130) {
                field3347 = -32;
            }
            if (class170.field2864 == 88) {
                class252.field4235 = new class15(26, true, class237.field3991);
                class170.field2864 = 91;
                class136.method1040(arg0 ^ 0x9D0091A6, true);
                class259.method1850(14);
            } else {
                class269.field4652 = new class15(30, true, class237.field3991);
                class170.field2864 = 100;
                class136.method1040(arg0 ^ 0x9D0091A6, true);
                class259.method1850(14);
                class104.field1774 = -1;
                class167.field2813 = -1;
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILoj;)V", line = 699)
    public final synchronized void method1486(int arg0, class307 arg1) {
        field3373++;
        this.field3348 = arg1;
        if (arg0 != -25077) {
            this.method240();
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BILoj;)V", line = 711)
    private final void method1487(byte arg0, int arg1, class307 arg2) {
        if (arg0 != 1) {
            this.field3372 = -48L;
        }
        field3357++;
        int var4 = arg1 >> 5;
        class307 var5 = this.field3364[var4];
        if (var5 == null) {
            this.field3371[var4] = arg2;
        } else {
            var5.field5240 = arg2;
        }
        this.field3364[var4] = arg2;
        arg2.field5238 = arg1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 731)
    public void method239(Component arg0) throws Exception {
        field3362++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLwa;)I", line = 742)
    public static final int method1488(byte arg0, class75 arg1) {
        field3370++;
        if (arg0 != -84) {
            method1479(59, 65, -88, 48);
        }
        return arg1.method640(1) + 1;
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V", line = 762)
    public static final void method1489(int arg0) {
        class81.field1361 = class161.field2725;
        class45.method306(false, (byte) 88);
        class258.method1840((byte) -63);
        field3336++;
        class72.method596(1, class81.field1361);
        class279.field4831 = new class96();
        class279.field4831.field3218 = 3000;
        class279.field4831.field3259 = 3000;
        if (class163.field2777 == 2) {
            class175.field2939 = class121.field2029 - 48;
            class275.field4737 = class172.field2887 - 48;
            class9.field121 = class121.field2029 * 128 + 64 - (class175.field2939 * 128);
            class245.field4120 = class172.field2887 * 128 + 64 - (class275.field4737 * 128);
            class172.field2887 = class245.field4120 >> 7;
            class121.field2029 = class9.field121 >> 7;
        } else {
            class70.method590(17020);
        }
        class32.method216(true);
        class34.method227(true);
        if (arg0 != -1914002714) {
            method1488((byte) -63, (class75) null);
        }
        class52.method380(arg0 ^ 0x8DEAA2A4, 28);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "()I", line = 800)
    public int method241() throws Exception {
        field3360++;
        return this.field3367;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "()V", line = 809)
    public void method243() throws Exception {
        field3350++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([II)V", line = 850)
    private final void method1490(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class26.field348) {
            var3 = arg1 << 1;
        }
        class231.method1690(arg0, 0, var3);
        this.field3363 -= arg1;
        if (this.field3348 != null && this.field3363 <= 0) {
            this.field3363 += class99.field1644 >> 4;
            class295.method2050(-78, this.field3348);
            this.method1487((byte) 1, this.field3348.method1370(), this.field3348);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class307 var10 = null;
                        class307 var11 = this.field3371[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class257 var12 = var11.field5239;
                                if (var12 == null || var12.field4317 <= var8) {
                                    var11.field5241 = true;
                                    int var13 = var11.method971();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4317 += var13;
                                    }
                                    if (var4 >= this.field3335) {
                                        break label105;
                                    }
                                    class307 var14 = var11.method967();
                                    if (var14 != null) {
                                        int var15 = var11.field5238;
                                        while (var14 != null) {
                                            this.method1487((byte) 1, var15 * var14.method1370() >> 8, var14);
                                            var14 = var11.method972();
                                        }
                                    }
                                    class307 var16 = var11.field5240;
                                    var11.field5240 = null;
                                    if (var10 == null) {
                                        this.field3371[var7] = var16;
                                    } else {
                                        var10.field5240 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3364[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field5240;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class307 var18 = this.field3371[var17];
                this.field3371[var17] = this.field3364[var17] = null;
                while (var18 != null) {
                    class307 var19 = var18.field5240;
                    var18.field5240 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3363 < 0) {
            this.field3363 = 0;
        }
        if (this.field3348 != null) {
            this.field3348.method998(arg0, 0, arg1);
        }
        this.field3361 = class78.method669(2047);
    }
}

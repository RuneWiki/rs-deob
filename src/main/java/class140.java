import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class140 extends class146 {

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "[J")
    private long[] field3334 = new long[10];

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lqf;")
    public static class117 field3324 = class72.method514(104, "rot:");

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "Lla;")
    public static class77 field3336 = new class77(8);

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "Z")
    public static boolean field3338 = false;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field3339 = 0;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field3343 = -1;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public static int field3342 = 2;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    private int field3320;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    private int field3328;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    private int field3330;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    private int field3333;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "J")
    private long field3329;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Lr;")
    public static class118 field3322;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public final void method536(int arg0) {
        field3331++;
        this.field3328 = 0;
        this.field3333 = 1;
        this.field3320 = 256;
        this.field3329 = class122.method977(false);
        if (arg0 > -64) {
            field3341 = -94;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3334[var2] = this.field3329;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I")
    public static final int method1085(int arg0) {
        field3332++;
        if (arg0 != 480) {
            method1090((byte) -64);
        }
        return 19;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static final void method1086(boolean arg0) {
        field3327++;
        if (!arg0) {
            field3338 = true;
        }
        try {
            if (class125.field2953 == 1) {
                int var1 = class36.field771.method1113(-122);
                if (var1 > 0 && class36.field771.method1114(8354273)) {
                    int var2 = var1 - class78.field1773;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class36.field771.method1108(-2, var2);
                } else {
                    class36.field771.method1124(15);
                    class36.field771.method1104((byte) -25);
                    class97.field2357 = null;
                    if (class80.field1831 == null) {
                        class125.field2953 = 0;
                    } else {
                        class125.field2953 = 2;
                    }
                    class75.field1635 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class36.field771.method1124(15);
            class125.field2953 = 0;
            class80.field1831 = null;
            class75.field1635 = null;
            class97.field2357 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
    public static final void method1087(int arg0, int arg1) {
        class132.method1023(arg1, 536866401);
        if (arg0 < -64) {
            field3337++;
            class35.method274((byte) -98, arg1);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZLma;I)V")
    public static final void method1088(int arg0, boolean arg1, class84 arg2, int arg3) {
        field3326++;
        if (arg2 == null) {
            return;
        }
        int var4 = class48.field967 + class128.field3035 & 0x7FF;
        int var5 = arg3 * arg3 + arg0 * arg0;
        if (var5 > 6400) {
            return;
        }
        int var6 = class12.field180[var4];
        int var7 = class12.field177[var4];
        int var8 = var7 * 256 / (class53.field1096 + 256);
        int var9 = var6 * 256 / (class53.field1096 + 256);
        if (arg1) {
            field3324 = null;
        }
        int var10 = arg0 * var9 + arg3 * var8 >> 16;
        int var11 = arg0 * var8 - arg3 * var9 >> 16;
        if (var5 <= 2500) {
            arg2.method660(var10 + 94 + 4 - arg2.field1921 / 2, -(arg2.field1919 / 2) + -4 + -var11 + 83);
        } else {
            arg2.method663(class117.field2826, var10 + 94 + 4 - arg2.field1921 / 2, 83 - (var11 - -(arg2.field1919 / 2)) + -4);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lgd;ILgd;)V")
    public static final void method1089(class46 arg0, int arg1, class46 arg2) {
        if (class128.field3028 == null) {
            class128.field3028 = class47.method338(-96, class126.field2987, class56.field1150, class134.field3184);
        }
        if (class16.field251 == null) {
            class16.field251 = class65.method468(true, class134.field3184, class15.field219, class126.field2987);
        }
        if (class71.field1510 == null) {
            class71.field1510 = class65.method468(true, class134.field3184, class143.field3480, class126.field2987);
        }
        if (class152.field3753 == null) {
            class152.field3753 = class65.method468(true, class134.field3184, class55.field1130, class126.field2987);
        }
        field3323++;
        class49.method360(0, 23, 765, 480, 0);
        class49.method362(0, 0, 125, 23, 12425273, 9135624);
        class49.method362(125, 0, 640, arg1, 5197647, 2697513);
        arg2.method325(class125.field2964, 62, 15, 0, -1);
        if (class152.field3753 != null) {
            class152.field3753[1].method951(140, 1);
            arg0.method330(class73.field1609, 152, 10, 16777215, -1);
            class152.field3753[0].method951(140, 12);
            arg0.method330(class20.field319, 152, 21, 16777215, -1);
        }
        if (class71.field1510 != null) {
            short var3 = 390;
            short var4 = 500;
            short var5 = 280;
            if (class83.field1909[0] == 0 && class152.field3736[0] == 0) {
                class71.field1510[2].method951(var5, 4);
            } else {
                class71.field1510[0].method951(var5, 4);
            }
            if (class83.field1909[0] == 0 && class152.field3736[0] == 1) {
                class71.field1510[3].method951(var5 + 15, 4);
            } else {
                class71.field1510[1].method951(var5 + 15, 4);
            }
            short var6 = 610;
            arg2.method330(class91.field2223, var5 + 32, 17, 16777215, -1);
            if (class83.field1909[0] == 1 && class152.field3736[0] == 0) {
                class71.field1510[2].method951(var3, 4);
            } else {
                class71.field1510[0].method951(var3, 4);
            }
            if (class83.field1909[0] == 1 && class152.field3736[0] == 1) {
                class71.field1510[3].method951(var3 + 15, 4);
            } else {
                class71.field1510[1].method951(var3 + 15, 4);
            }
            arg2.method330(class16.field230, var3 + 32, 17, 16777215, -1);
            if (class83.field1909[0] == 2 && class152.field3736[0] == 0) {
                class71.field1510[2].method951(var4, 4);
            } else {
                class71.field1510[0].method951(var4, 4);
            }
            if (class83.field1909[0] == 2 && class152.field3736[0] == 1) {
                class71.field1510[3].method951(var4 + 15, 4);
            } else {
                class71.field1510[1].method951(var4 + 15, 4);
            }
            arg2.method330(class3.field37, var4 + 32, 17, 16777215, -1);
            if (class83.field1909[0] == 3 && class152.field3736[0] == 0) {
                class71.field1510[2].method951(var6, 4);
            } else {
                class71.field1510[0].method951(var6, 4);
            }
            if (class83.field1909[0] == 3 && class152.field3736[0] == 1) {
                class71.field1510[3].method951(var6 + 15, 4);
            } else {
                class71.field1510[1].method951(var6 + 15, 4);
            }
            arg2.method330(class21.field360, var6 + 32, 17, 16777215, -1);
        }
        class49.method360(708, 4, 50, 16, 0);
        arg0.method325(class153.field3781, 733, 16, 16777215, -1);
        class68.field1411 = -1;
        if (class128.field3028 != null) {
            byte var7 = 88;
            byte var8 = 19;
            int var9 = 765 / (var7 + 1);
            int var10 = 480 / (var8 + 1);
            int var11;
            int var12;
            do {
                var11 = var9;
                if (class47.field958 <= (var9 - 1) * var10) {
                    var9--;
                }
                var12 = var10;
                if (class47.field958 <= (var10 - 1) * var9) {
                    var10--;
                }
                if (class47.field958 <= (var10 - 1) * var9) {
                    var10--;
                }
            } while (var10 != var12 || var9 != var11);
            int var13 = (765 - var7 * var9) / (var9 + 1);
            if (var13 > 5) {
                var13 = 5;
            }
            int var14 = (480 - var8 * var10) / (var10 + 1);
            if (var14 > 5) {
                var14 = 5;
            }
            int var15 = (765 - var7 * var9 - (var9 + -1) * var13) / 2;
            int var16 = 0;
            int var17 = var15;
            int var18 = (480 - var8 * var10 - (var10 - 1) * var14) / 2;
            int var19 = var18 + 23;
            for (int var20 = 0; var20 < class47.field958; var20++) {
                class32 var21 = class20.field336[var20];
                boolean var22 = true;
                class117 var23 = class79.method614(15591, var21.field690);
                if (var21.field690 == -1) {
                    var22 = false;
                    var23 = class128.field3038;
                } else if (var21.field690 > 1980) {
                    var23 = class94.field2280;
                    var22 = false;
                }
                if (var17 <= class143.field3504 && var19 <= class18.field274 && var7 + var17 > class143.field3504 && class18.field274 < var19 + var8 && var22) {
                    class68.field1411 = var20;
                    class128.field3028[var21.field684 ? 1 : 0].method668(var17, var19, 128, 16777215);
                } else {
                    class128.field3028[var21.field684 ? 1 : 0].method676(var17, var19);
                }
                if (class16.field251 != null) {
                    class16.field251[var21.field680 + (var21.field684 ? 8 : 0)].method951(var17 + 29, var19);
                }
                arg2.method325(class79.method614(15591, var21.field697), var17 + 15, var19 - -(var8 / 2) + 5, 0, -1);
                arg0.method325(var23, var17 + 60, var8 / 2 + var19 + 5, 268435455, -1);
                var19 += var8 + var14;
                int var10000 = ~var10;
                var16++;
                if (var10000 >= ~var16) {
                    var19 = var18 + 23;
                    var16 = 0;
                    var17 += var7 + var13;
                }
            }
        }
        try {
            Graphics var24 = class3.field64.getGraphics();
            class68.field1426.method210(0, 0, (byte) 78, var24);
        } catch (Exception var25) {
            class3.field64.repaint();
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
    public static void method1090(byte arg0) {
        field3324 = null;
        int var1 = 36 % ((-arg0 - 43) / 63);
        field3336 = null;
        field3322 = null;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
    public final void method537(byte arg0) {
        field3321++;
        if (arg0 > -39) {
            method1088(-109, true, null, -47);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3334[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)I")
    public final int method535(int arg0, int arg1, int arg2) {
        int var4 = this.field3320;
        field3335++;
        this.field3320 = 300;
        int var5 = this.field3333;
        this.field3333 = 1;
        this.field3329 = class122.method977(false);
        if (this.field3334[this.field3330] == 0L) {
            this.field3320 = var4;
            this.field3333 = var5;
        } else if (this.field3334[this.field3330] < this.field3329) {
            this.field3320 = (int) ((long) (arg1 * 2560) / (this.field3329 - this.field3334[this.field3330]));
        }
        if (this.field3320 < 25) {
            this.field3320 = 25;
        }
        if (this.field3320 > 256) {
            this.field3320 = 256;
            this.field3333 = (int) ((long) arg1 - (this.field3329 - this.field3334[this.field3330]) / 10L);
        }
        if (this.field3333 > arg1) {
            this.field3333 = arg1;
        }
        if (arg0 != 1772870664) {
            field3336 = null;
        }
        this.field3334[this.field3330] = this.field3329;
        this.field3330 = (this.field3330 + 1) % 10;
        if (this.field3333 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3334[var6] != 0L) {
                    this.field3334[var6] += this.field3333;
                }
            }
        }
        if (arg2 > this.field3333) {
            this.field3333 = arg2;
        }
        int var7 = 0;
        class148.method1183(0, (long) this.field3333);
        while (this.field3328 < 256) {
            var7++;
            this.field3328 += this.field3320;
        }
        this.field3328 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class140() {
        this.method536(-93);
    }
}

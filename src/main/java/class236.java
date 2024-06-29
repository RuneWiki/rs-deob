import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class236 {

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Z")
    private boolean field3354 = false;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public int field3366 = 0;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public int field3368 = 0;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "[I")
    public static int[] field3365 = new int[25];

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field3363 = 2;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public int field3350;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public int field3352;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public int field3358;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public int field3359;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    private int field3364;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public int field3367;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public int field3369;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public int field3370;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "J")
    public long field3362;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static final void method1539(int arg0) {
        field3356++;
        int var1 = 63 / ((arg0 + 38) / 59);
        if (class39.field513 != null) {
            class39.field513.method1338(0);
        }
        if (class431.field6047 != null) {
            class431.field6047.method1338(0);
        }
        class249.method1613(-8001, 2, class119.field1814, 22050);
        class39.field513 = class128.method964(22050, class104.field1447, 0, (byte) -113, class122.field1839);
        class39.field513.method1339(-24056, class60.field771);
        class431.field6047 = class128.method964(2048, class104.field1447, 1, (byte) -113, class122.field1839);
        class431.field6047.method1339(-24056, class48.field616);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BILrg;)V")
    private final void method1540(byte arg0, int arg1, class366 arg2) {
        field3357++;
        if (arg0 != 118) {
            this.field3352 = -69;
        }
        if (arg1 == 1) {
            this.field3364 = arg2.method2297(13352);
        } else if (arg1 == 2) {
            arg2.method2306((byte) 83);
        } else if (arg1 == 3) {
            this.field3369 = arg2.method2258(arg0 + 1177515346);
            this.field3352 = arg2.method2258(arg0 + 1177515346);
            this.field3370 = arg2.method2258(1177515464);
        } else if (arg1 == 4) {
            this.field3359 = arg2.method2306((byte) 110);
            this.field3358 = arg2.method2258(1177515464);
        } else if (arg1 == 6) {
            this.field3353 = arg2.method2306((byte) 78);
        } else if (arg1 == 8) {
            this.field3366 = 1;
        } else if (arg1 == 9) {
            this.field3368 = 1;
        } else if (arg1 == 10) {
            this.field3354 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lrg;I)V")
    public final void method1541(class366 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2306((byte) 38);
            if (var3 == 0) {
                field3355++;
                if (arg1 != 0) {
                    this.method1541((class366) null, 1);
                    return;
                }
                return;
            }
            this.method1540((byte) 118, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public static final void method1542(int arg0) {
        field3349++;
        class408 var1 = class398.field5514;
        synchronized (class398.field5514) {
            class398.field5514.method2530((byte) -110);
        }
        class408 var2 = class354.field4769;
        synchronized (class354.field4769) {
            class354.field4769.method2530((byte) -82);
        }
        if (arg0 < 98) {
            method1542(40);
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public final void method1543(int arg0) {
        field3360++;
        this.field3351 = class136.field2020[this.field3364 << 3];
        this.field3367 = (int) Math.sqrt((double) (this.field3370 * this.field3370 + this.field3369 * this.field3369 + this.field3352 * this.field3352));
        if (this.field3358 == 0) {
            this.field3358 = 1;
        }
        int var2 = -76 % ((arg0 - 43) / 51);
        if (this.field3359 == 0) {
            this.field3362 = 2147483647L;
        } else if (this.field3359 == 1) {
            this.field3362 = (long) (this.field3367 * 8 / this.field3358);
            this.field3362 *= this.field3362;
        } else if (this.field3359 == 2) {
            this.field3362 = (long) (this.field3367 * 8 / this.field3358);
        }
        if (this.field3354) {
            this.field3367 *= -1;
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public static final void method1544(int arg0) {
        field3361++;
        int var1 = class125.method956(1);
        if (arg0 == var1) {
            class237.field3379 = null;
            class87.method689(0, (byte) 83);
        } else if (var1 == 1) {
            class109.method833((byte) 0, true);
            class87.method689(512, (byte) 110);
            if (class302.field4122 != null) {
                class366.method2270(-23664);
            }
        } else {
            class109.method833((byte) (class368.field5106 - 4 & 0xFF), true);
            class87.method689(2, (byte) 76);
        }
        class51.field649 = class343.field4623;
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
    public static final void method1545(int arg0) {
        class214.field3003 = arg0;
        for (int var1 = 0; var1 < class284.field3862; var1++) {
            for (int var2 = 0; var2 < class354.field4768; var2++) {
                if (class341.field4617[arg0][var1][var2] == null) {
                    class341.field4617[arg0][var1][var2] = new class63(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
    public static void method1546(int arg0) {
        field3365 = null;
        if (arg0 <= 114) {
            method1546(-86);
        }
    }
}

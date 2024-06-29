import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class275 {

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public int field3694 = 0;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public int field3695 = 0;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "Z")
    private boolean field3708 = false;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3696 = "slide:";

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "[I")
    public static int[] field3706 = new int[4096];

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public static int field3702 = 0;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3707 = "green:";

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field3703 = 1;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public int field3684;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public int field3686;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public int field3687;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public int field3688;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public int field3689;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public int field3691;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    private int field3697;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public int field3699;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public int field3705;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "J")
    public long field3693;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILap;)V")
    public final void method1760(int arg0, class289 arg1) {
        if (arg0 != 0) {
            this.method1764((byte) 100, -121, (class289) null);
        }
        while (true) {
            int var3 = arg1.method1861((byte) -72);
            if (var3 == 0) {
                field3701++;
                return;
            }
            this.method1764((byte) -95, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public final void method1761(byte arg0) {
        if (arg0 < 12) {
            method1766((byte) -83, 4, 103, -14, 126, 84, 102);
        }
        this.field3688 = class174.field2564[this.field3697 << 3];
        field3709++;
        this.field3705 = (int) Math.sqrt((double) (this.field3684 * this.field3684 + this.field3704 * this.field3704 + this.field3691 * this.field3691));
        if (this.field3689 == 0) {
            this.field3689 = 1;
        }
        if (this.field3686 == 0) {
            this.field3693 = 2147483647L;
        } else if (this.field3686 == 1) {
            this.field3693 = (long) (this.field3705 * 8 / this.field3689);
            this.field3693 *= this.field3693;
        } else if (this.field3686 == 2) {
            this.field3693 = (long) (this.field3705 * 8 / this.field3689);
        }
        if (this.field3708) {
            this.field3705 *= -1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZIII)V")
    public static final void method1762(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class243.field3355 == arg2) {
            class153.method1178((byte) -127, false);
        } else {
            class89.field1324 = class243.field3355;
            class447.method2785(0, (byte) 109);
        }
        field3690++;
        class67.field1012 = arg1;
        class128.field1815 = arg4;
        class83.field1219 = arg0;
        class99.method840(arg3);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
    public static void method1763(byte arg0) {
        if (arg0 <= 0) {
            field3692 = 104;
        }
        field3706 = null;
        field3707 = null;
        field3696 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BILap;)V")
    private final void method1764(byte arg0, int arg1, class289 arg2) {
        field3698++;
        if (arg1 == 1) {
            this.field3697 = arg2.method1853(-52);
        } else if (arg1 == 2) {
            arg2.method1861((byte) -72);
        } else if (arg1 == 3) {
            this.field3684 = arg2.method1856((byte) 97);
            this.field3704 = arg2.method1856((byte) 125);
            this.field3691 = arg2.method1856((byte) 70);
        } else if (arg1 == 4) {
            this.field3686 = arg2.method1861((byte) -72);
            this.field3689 = arg2.method1856((byte) 98);
        } else if (arg1 == 6) {
            this.field3699 = arg2.method1861((byte) -72);
        } else if (arg1 == 8) {
            this.field3695 = 1;
        } else if (arg1 == 9) {
            this.field3694 = 1;
        } else if (arg1 == 10) {
            this.field3708 = true;
        }
        if (arg0 >= -74) {
            this.method1764((byte) -90, 8, (class289) null);
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
    public static final void method1765(byte arg0) {
        if (arg0 > -109) {
            method1763((byte) 62);
        }
        field3685++;
        class334.field4531.method2533(0);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BIIIIII)V")
    public static final void method1766(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3700++;
        class192[] var7 = class16.field186;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class192 var10 = var7[var8];
            if (var10 != null && var10.field2763 == 2) {
                class438.method2719(arg4, arg2 >> 1, arg1, var10.field2759 * 2, (var10.field2758 - class296.field3988 << 7) + var10.field2756, (-class283.field3794 + var10.field2765 << 7) + var10.field2757, 8741, arg6 >> 1);
                if (class220.field3043[0] > -1 && (class414.field5793 % 20) < 10) {
                    class377.field5308[var10.field2769].method722(arg5 - (12 - class220.field3043[0]), arg3 - -class220.field3043[1] + -28);
                }
            }
        }
        int var9 = 86 % ((-arg0 - 9) / 57);
    }
}

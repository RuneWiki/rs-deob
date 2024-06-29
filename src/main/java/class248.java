import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class248 {

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public int field3943 = 0;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public int field3944 = 0;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "Z")
    private boolean field3953 = false;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "F")
    public static float field3941 = 128.0F;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Z")
    public static boolean field3935 = false;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "[I")
    public static int[] field3951 = new int[1000];

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "[I")
    public static int[] field3940 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    private int field3934;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public int field3936;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public int field3939;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public int field3942;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public int field3946;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public int field3949;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public int field3956;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public int field3957;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "J")
    public long field3950;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Lbc;")
    public static class182 field3938;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public final void method1676(int arg0) {
        field3937++;
        this.field3955 = class224.field3597[this.field3934];
        if (arg0 != -41) {
            return;
        }
        this.field3957 = (int) Math.sqrt((double) (this.field3949 * this.field3949 + this.field3948 * this.field3948 + this.field3936 * this.field3936));
        if (this.field3942 == 0) {
            this.field3942 = 1;
        }
        if (this.field3939 == 0) {
            this.field3950 = 2147483647L;
        } else if (this.field3939 == 1) {
            this.field3950 = (long) (this.field3957 * 8 / this.field3942);
            this.field3950 *= this.field3950;
        } else if (this.field3939 == 2) {
            this.field3950 = (long) (this.field3957 * 8 / this.field3942);
        }
        if (this.field3953) {
            this.field3957 *= -1;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILha;I)V")
    private final void method1677(int arg0, class31 arg1, int arg2) {
        if (arg0 != 0) {
            this.method1677(-38, (class31) null, -3);
        }
        if (arg2 == 1) {
            this.field3934 = arg1.method260((byte) -67);
        } else if (arg2 == 2) {
            arg1.method265(arg0 - 97);
        } else if (arg2 == 3) {
            this.field3948 = arg1.method300((byte) -30);
            this.field3949 = arg1.method300((byte) -30);
            this.field3936 = arg1.method300((byte) -30);
        } else if (arg2 == 4) {
            this.field3939 = arg1.method265(-98);
            this.field3942 = arg1.method300((byte) -30);
        } else if (arg2 == 6) {
            this.field3956 = arg1.method265(-95);
        } else if (arg2 == 8) {
            this.field3943 = 1;
        } else if (arg2 == 9) {
            this.field3944 = 1;
        } else if (arg2 == 10) {
            this.field3953 = true;
        }
        field3947++;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public static void method1678(int arg0) {
        if (arg0 != 9) {
            field3954 = -38;
        }
        field3938 = null;
        field3951 = null;
        field3940 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V")
    public static final void method1679(int arg0, int arg1) {
        field3959++;
        if (class23.field382 == arg0) {
            return;
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (class23.field382 == 0) {
            class7.method50((byte) -84);
        }
        if (arg0 == 40) {
            class137.method1019(arg1 + 115);
        }
        if (arg1 != 2) {
            method1678(-27);
        }
        if (arg0 != 40 && field3938 != null) {
            field3938.method1306((byte) -51);
            field3938 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class123.field1864 = 1;
            class3.field54 = 0;
            class269.field4262 = 0;
            class273.field4362 = 0;
            class272.field4353 = 1;
            class176.method1254((byte) 86, true);
        }
        if (arg0 == 25 || arg0 == 10) {
            class56.method472(-3);
        }
        if (arg0 == 5) {
            class294.method1946(73, class246.field3910);
        } else {
            class239.method1634(0);
        }
        boolean var3 = class23.field382 == 5 || class23.field382 == 10 || class23.field382 == 28;
        if (var2 != var3) {
            if (var2) {
                class75.field1164 = class174.field2694;
                if (class85.field1274 == 0) {
                    class198.method1404((byte) 106, 2);
                } else {
                    class296.method1986(false, class174.field2694, -23335, 2, 255, 0, class205.field3153);
                }
                class210.field3249.method831((byte) 120, false);
            } else {
                class198.method1404((byte) 16, 2);
                class210.field3249.method831((byte) 121, true);
            }
        }
        class23.field382 = arg0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILha;)V")
    public final void method1680(int arg0, class31 arg1) {
        if (arg0 >= -28) {
            return;
        }
        field3958++;
        while (true) {
            int var3 = arg1.method265(-89);
            if (var3 == 0) {
                return;
            }
            this.method1677(0, arg1, var3);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class167 extends class218 {

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    private final int field3183;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    private final int field3187;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    private final int field3191;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    private final int field3197;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "[S")
    public static short[] field3182 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "Lvd;")
    public static class222 field3189 = class212.method1357("Fallen lassen", 10731);

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Lvd;")
    private static class222 field3188 = class212.method1357("Invalid username or password)3", 10731);

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "Lvd;")
    public static class222 field3192 = field3188;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "[I")
    public static int[] field3196 = new int[5];

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "Lvd;")
    public static class222 field3198 = class212.method1357("auf einer freien Welt zu spielen)3", 10731);

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        ++field3193;
        int var4 = this.field3187 * arg0 >> 12;
        int var5 = this.field3183 * arg0 >> 12;
        if (arg2 != 59) {
            field3182 = null;
        }
        int var6 = this.field3197 * arg1 >> 12;
        int var7 = this.field3191 * arg1 >> 12;
        class83.method544(super.field4042, var6, var5, var7, (byte) 5, var4);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BII)V")
    public final void method434(byte arg0, int arg1, int arg2) {
        ++field3186;
        if (arg0 < 55) {
            method1077((byte) 44);
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
    public static void method1077(byte arg0) {
        field3198 = null;
        field3188 = null;
        field3196 = null;
        if (arg0 != -52) {
            field3198 = null;
        }
        field3189 = null;
        field3192 = null;
        field3182 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
    public final void method433(int arg0, int arg1, int arg2) {
        if (arg0 == 71) {
            ++field3195;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)I")
    public static final int method1078(byte arg0, int arg1) {
        ++field3185;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        if (arg0 != 14) {
            return -27;
        } else {
            int var4 = 40960 - -(arg1 * var3 >> 12);
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)V")
    public static final void method1079(byte arg0) {
        ++field3194;
        if (~class28.field629 < -1) {
            class137.method865(116);
        } else {
            int var1 = 124 / ((-53 - arg0) / 45);
            class55.method410(40, 0);
            class204.field3802 = class31.field656;
            class31.field656 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIII)V")
    public class167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3183 = arg2;
        this.field3187 = arg0;
        this.field3191 = arg3;
        this.field3197 = arg1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lba;B)V")
    public static final void method1080(class13 arg0, byte arg1) {
        ++field3190;
        int var2 = arg0.field348;
        if (~var2 == -325) {
            if (class6.field93 == -1) {
                class97.field1818 = arg0.field359;
                class6.field93 = arg0.field251;
            }
            if (class132.field2548.field4228) {
                arg0.field251 = class6.field93;
            } else {
                arg0.field251 = class97.field1818;
            }
        } else if (var2 == 325) {
            if (class6.field93 == -1) {
                class6.field93 = arg0.field251;
                class97.field1818 = arg0.field359;
            }
            if (!class132.field2548.field4228) {
                arg0.field251 = class6.field93;
            } else {
                arg0.field251 = class97.field1818;
            }
        } else {
            if (arg1 > -104) {
                method1077((byte) 52);
            }
            if (~var2 == -328) {
                arg0.field240 = 150;
                arg0.field353 = (int) (Math.sin((double) class175.field3280 / 40.0D) * 256.0D) & 2047;
                arg0.field325 = 5;
                arg0.field224 = -1;
            } else if (var2 == 328) {
                if (class17.field432.field853 == null) {
                    arg0.field224 = 0;
                } else {
                    arg0.field240 = 150;
                    arg0.field353 = 2047 & (int) (256.0D * Math.sin((double) class175.field3280 / 40.0D));
                    arg0.field325 = 5;
                    arg0.field224 = ((int) class17.field432.field853.method1428(15109) << 11) - -2047;
                    arg0.field270 = class17.field432.field1313;
                    arg0.field340 = class17.field432.field1370;
                }
            }
        }
    }
}

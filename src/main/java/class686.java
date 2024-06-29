import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class686 {

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "I")
    public int field9650 = 128;

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "I")
    public int field9657 = 128;

    @OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
    public int field9658;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
    public int field9644;

    @OriginalMember(owner = "client!hda", name = "s", descriptor = "I")
    public int field9661;

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
    public int field9654;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "Lfc;")
    public static class235 field9643 = new class235(72, 7);

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
    public static int field9645;

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "I")
    public static int field9646;

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
    public static int field9647;

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "I")
    public static int field9648;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "I")
    public static int field9649;

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "I")
    public static int field9651;

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "I")
    public int field9652;

    @OriginalMember(owner = "client!hda", name = "k", descriptor = "I")
    public static int field9653;

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
    public int field9655;

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
    public int field9656;

    @OriginalMember(owner = "client!hda", name = "q", descriptor = "I")
    public int field9659;

    @OriginalMember(owner = "client!hda", name = "r", descriptor = "I")
    public static int field9660;

    @OriginalMember(owner = "client!hda", name = "t", descriptor = "I")
    public int field9662;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLjr;)Lmu;", line = 3)
    public static final class272 method3773(byte arg0, class96 arg1) {
        field9660++;
        class479 var2 = class258.method1595(arg1, (byte) -114);
        int var3 = arg1.method753(1950018080);
        return arg0 == 77 ? new class272(var2.field6686, var2.field6683, var2.field6685, var2.field6687, var2.field6690, var3) : null;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V", line = 18)
    public static void method3774(int arg0) {
        field9643 = null;
        if (arg0 != 1000) {
            method3777(false);
        }
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)V", line = 29)
    public static final void method3775(int arg0) {
        if (arg0 > 58) {
            field9649++;
            class528.field7233.method1987(-31085);
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Len;IIIII)Lan;", line = 41)
    public static final class22 method3776(class289 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9648++;
        if (arg4 >= -73) {
            field9643 = null;
        }
        if (!arg0.field4292 && (!class17.method89(arg1, 508337774) || !class17.method89(arg3, 508337774))) {
            return arg0.field4335 ? new class22(arg0, 34037, arg2, arg5, arg1, arg3, true) : new class22(arg0, arg2, arg5, arg1, arg3, class350.method2082(-48, arg1), class350.method2082(127, arg3), true);
        } else {
            return new class22(arg0, 3553, arg2, arg5, arg1, arg3, true);
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Z)V", line = 67)
    public static final void method3777(boolean arg0) {
        field9647++;
        class610.method3373(arg0);
        class74.method592(0);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLhda;)V", line = 80)
    public final void method3778(byte arg0, class686 arg1) {
        int var3 = -126 / ((-arg0 - 15) / 40);
        this.field9661 = arg1.field9661;
        this.field9644 = arg1.field9644;
        this.field9654 = arg1.field9654;
        field9646++;
        this.field9658 = arg1.field9658;
        this.field9650 = arg1.field9650;
        this.field9657 = arg1.field9657;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IILpd;Lpd;Z)I", line = 98)
    public static final int method3779(int arg0, int arg1, class233 arg2, class233 arg3, boolean arg4) {
        field9653++;
        int var5 = -5 / ((arg0 + 16) / 49);
        if (arg1 == 1) {
            int var6 = arg2.field1947;
            int var7 = arg3.field1947;
            if (!arg4) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var7 == -1) {
                    var7 = 2001;
                }
            }
            return var6 - var7;
        } else if (arg1 == 2) {
            return class691.method3801((byte) 74, class666.field9377, arg3.method1472(29356).field8654, arg2.method1472(29356).field8654);
        } else if (arg1 == 3) {
            if (arg2.field3313.equals("-")) {
                if (arg3.field3313.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field3313.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class691.method3801((byte) 74, class666.field9377, arg3.field3313, arg2.field3313);
            }
        } else if (arg1 == 4) {
            if (arg2.method979(false)) {
                return arg3.method979(false) ? 0 : 1;
            } else if (arg3.method979(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 5) {
            if (arg2.method984(-19373)) {
                return arg3.method984(-19373) ? 0 : 1;
            } else if (arg3.method984(-19373)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 6) {
            if (arg2.method980((byte) -67)) {
                return arg3.method980((byte) -57) ? 0 : 1;
            } else if (arg3.method980((byte) -74)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 7) {
            if (arg2.method982(0)) {
                return arg3.method982(0) ? 0 : 1;
            } else if (arg3.method982(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 8) {
            int var8 = arg2.field3307;
            int var9 = arg3.field3307;
            if (arg4) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var9 == 1000) {
                    var9 = -1;
                }
            } else {
                if (var8 == -1) {
                    var8 = 1000;
                }
                if (var9 == -1) {
                    var9 = 1000;
                }
            }
            return var8 - var9;
        } else {
            return arg2.field3304 - arg3.field3304;
        }
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(Z)Lhda;", line = 199)
    public final class686 method3780(boolean arg0) {
        if (arg0) {
            this.field9654 = 120;
        }
        field9645++;
        return new class686(this.field9658, this.field9657, this.field9650, this.field9644, this.field9654, this.field9661);
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(I)V", line = 220)
    public class686(int arg0) {
        this.field9658 = arg0;
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(IIIIII)V", line = 227)
    private class686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9657 = arg1;
        this.field9650 = arg2;
        this.field9644 = arg3;
        this.field9661 = arg5;
        this.field9654 = arg4;
        this.field9658 = arg0;
    }
}

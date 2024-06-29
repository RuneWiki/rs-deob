import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class227 implements class555 {

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Lpm;")
    private class609 field3493;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public int field3490;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "[I")
    public int[] field3487;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public int field3491;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lnp;")
    private class515 field3481;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "[F")
    public float[] field3488;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[I")
    public static int[] field3486 = new int[6];

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "[J")
    public static long[] field3483;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V")
    public static final void method1545(byte arg0, int arg1) {
        field3485++;
        int var2 = class192.field2961 - class294.field4286;
        if (var2 >= 100) {
            class375.field5176 = -1;
            class429.field5830 = -1;
            class416.field5704 = 1;
            return;
        }
        int var3 = (int) class642.field8990;
        if (class527.field7531 >> 8 > var3) {
            var3 = class527.field7531 >> 8;
        }
        if (arg0 != -38) {
            method1549((byte) 17);
        }
        if (class310.field4432[4] && class3.field25[4] + 128 > var3) {
            var3 = class3.field25[4] + 128;
        }
        int var4 = (int) class758.field10460 + class258.field3805 & 0x3FFF;
        class389.method2418((var3 >> 3) * 3 + 600 << 2, class198.field3037, var4, -127, arg1, var3, class702.method3970(class210.field3250.field5742, class368.field5113, -20103, class210.field3250.field5746) - 200, class310.field4429);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class546.field7862 = (int) ((float) (class546.field7862 - class398.field5472) * var5 + (float) class398.field5472);
        class614.field8619 = (int) ((float) (class614.field8619 - class274.field3972) * var5 + (float) class274.field3972);
        class472.field6622 = (int) ((float) (class472.field6622 - class133.field2017) * var5 + (float) class133.field2017);
        class589.field8310 = (int) ((float) (class589.field8310 - class358.field5028) * var5 + (float) class358.field5028);
        int var6 = class544.field7813 - class544.field7812;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class544.field7813 = (int) ((float) var6 * var5 + (float) class544.field7812);
        class544.field7813 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1546(int arg0, byte arg1, int arg2) {
        if (arg1 <= 103) {
            method1546(60, (byte) -57, -47);
        }
        field3482++;
        return class282.method1825(arg0, arg2, 13) & class197.method1363(arg2, arg0, (byte) -35);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method1547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class590.method3437(arg5, arg7 ? this.field3493.field8534 : null, arg3, arg2, this.field3493.field8528.field358, arg4, this.field3491, arg7 ? this.field3488 : null, arg0, 69, arg1, this.field3493.field8528.field356, arg6 ? this.field3487 : null);
        field3484++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static final void method1548(int arg0) {
        class687.field9549 = null;
        class210.field3253 = null;
        if (arg0 < -51) {
            field3489++;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method1549(byte arg0) {
        field3486 = null;
        if (arg0 >= 58) {
            field3483 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method1550(byte arg0, int arg1, String arg2) {
        field3492++;
        class788.method4313("", (byte) 51, "", arg2, arg1, 0, "");
        if (arg0 != -67) {
            field3486 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lpm;Ljd;Lnp;)V")
    public class227(class609 arg0, class241 arg1, class515 arg2) {
        this.field3493 = arg0;
        if ((arg1 instanceof class52)) {
            class52 var5 = (class52) arg1;
            this.field3490 = var5.field5583;
            this.field3491 = var5.field5580;
            this.field3487 = var5.field634;
        } else if ((arg1 instanceof class501)) {
            class501 var4 = (class501) arg1;
            this.field3490 = var4.field5583;
            this.field3487 = var4.field7111;
            this.field3491 = var4.field5580;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field3481 = arg2;
            if (this.field3481.field7282 != this.field3491 || this.field3481.field7281 != this.field3490) {
                throw new RuntimeException();
            }
            this.field3488 = this.field3481.field7285;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method1551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field3480++;
        class590.method3437(arg5, arg7 ? this.field3488 : null, arg3, arg2, this.field3491, arg4, this.field3493.field8528.field358, arg7 ? this.field3493.field8534 : null, arg0, 40, arg1, this.field3487, arg6 ? this.field3493.field8528.field356 : null);
    }
}

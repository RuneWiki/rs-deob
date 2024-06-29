import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class29 extends class24 {

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
    private int field577 = 0;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "I")
    public static int field567 = 1;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public static int field571 = 0;

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "Lqf;")
    public static class117 field579 = class72.method514(116, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!e", name = "pb", descriptor = "Lqf;")
    private static class117 field585 = class72.method514(119, "cyan:");

    @OriginalMember(owner = "client!e", name = "ob", descriptor = "Lqf;")
    public static class117 field584 = field585;

    @OriginalMember(owner = "client!e", name = "lb", descriptor = "Lqf;")
    public static class117 field581 = field585;

    @OriginalMember(owner = "client!e", name = "rb", descriptor = "Lqf;")
    private static class117 field587 = class72.method514(106, "Select");

    @OriginalMember(owner = "client!e", name = "tb", descriptor = "I")
    public static int field589 = -1;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "Lqf;")
    public static class117 field573 = field587;

    @OriginalMember(owner = "client!e", name = "sb", descriptor = "I")
    public static int field588 = 0;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
    public int field572;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client!e", name = "kb", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!e", name = "mb", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!e", name = "nb", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!e", name = "qb", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "Lha;")
    public static class50 field575;

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "Lnc;")
    public static class93 field576;

    @OriginalMember(owner = "client!e", name = "ub", descriptor = "[Lma;")
    public static class84[] field590;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)V")
    public static void method216(boolean arg0) {
        field576 = null;
        if (!arg0) {
            method219(null, (byte) 71, -114);
        }
        field585 = null;
        field587 = null;
        field579 = null;
        field581 = null;
        field573 = null;
        field584 = null;
        field575 = null;
        field590 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Z")
    public static final boolean method217(int arg0, byte arg1) {
        field564++;
        if (arg1 > -123) {
            field588 = 105;
        }
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lla;II)V")
    public final void method218(class77 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field588 = -97;
        }
        while (true) {
            int var4 = arg0.method570((byte) 123);
            if (var4 == 0) {
                field570++;
                return;
            }
            this.method221(arg1, var4, true, arg0);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljb;BI)Z")
    public static final boolean method219(class64 arg0, byte arg1, int arg2) {
        field582++;
        byte[] var3 = arg0.method455((byte) 26, arg2);
        if (var3 == null) {
            return false;
        }
        if (arg1 >= -97) {
            field589 = 63;
        }
        class23.method184(var3, (byte) -75);
        return true;
    }

    @OriginalMember(owner = "client!e", name = "i", descriptor = "(I)V")
    public final void method220(int arg0) {
        field580++;
        this.method222(255, this.field577);
        if (arg0 != -18174) {
            this.method220(50);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZLla;)V")
    private final void method221(int arg0, int arg1, boolean arg2, class77 arg3) {
        field565++;
        if (!arg2) {
            method219(null, (byte) 1, 10);
        }
        if (arg1 == 1) {
            this.field577 = arg3.method557((byte) -114);
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)V")
    private final void method222(int arg0, int arg1) {
        field583++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & arg0) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var3 > var5) {
            var9 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        if (var9 > var7) {
            var9 = var7;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        this.field578 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var3 == var11) {
                var15 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var15 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var15 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var19 = var15 / 6.0D;
        if (this.field578 < 0) {
            this.field578 = 0;
        } else if (this.field578 > 255) {
            this.field578 = 255;
        }
        this.field568 = (int) (var13 * 256.0D);
        if (var17 > 0.5D) {
            this.field572 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field572 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field572 < 1) {
            this.field572 = 1;
        }
        this.field574 = (int) ((double) this.field572 * var19);
        if (this.field568 < 0) {
            this.field568 = 0;
        } else if (this.field568 > 255) {
            this.field568 = 255;
            return;
        }
    }
}

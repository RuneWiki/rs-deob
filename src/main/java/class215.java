import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class215 {

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public int field3671 = -1;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Z")
    public boolean field3669 = true;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    private int field3677 = 0;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public int field3676 = 128;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Lwa;")
    public static class75 field3674 = class66.method560("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", false);

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Lwa;")
    public static class75 field3683 = class66.method560(")1p", false);

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lwa;")
    public static class75 field3673 = null;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public int field3667;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public int field3670;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public int field3679;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public int field3680;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "[Lbh;")
    public static class258[] field3675;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[[Lcg;")
    public static class38[][] field3672;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 8)
    public static void method1583(byte arg0) {
        field3683 = null;
        field3675 = null;
        field3674 = null;
        if (arg0 > -108) {
            field3683 = (class75) null;
        }
        field3673 = null;
        field3672 = (class38[][]) null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLja;II)V", line = 25)
    private final void method1584(byte arg0, class60 arg1, int arg2, int arg3) {
        if (arg0 < 79) {
            this.field3667 = 60;
        }
        if (arg3 == 1) {
            this.field3677 = arg1.method489(-109);
            this.method1585(255, this.field3677);
        } else if (arg3 == 2) {
            this.field3671 = arg1.method485((byte) -2);
            if (this.field3671 == 65535) {
                this.field3671 = -1;
            }
        } else if (arg3 == 3) {
            this.field3676 = arg1.method485((byte) -2);
        } else if (arg3 == 4) {
            this.field3669 = false;
        }
        field3682++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V", line = 63)
    private final void method1585(int arg0, int arg1) {
        double var3 = (double) ((arg1 & 0xFF8C4E) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF8B) >> 8) / 256.0D;
        field3678++;
        double var7 = var3;
        double var9 = (double) (arg0 & arg1) / 256.0D;
        double var11 = var3;
        if (var3 > var5) {
            var7 = var5;
        }
        if (var7 > var9) {
            var7 = var9;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var9) {
            var11 = var9;
        }
        double var17 = (var7 + var11) / 2.0D;
        this.field3667 = (int) (var17 * 256.0D);
        if (this.field3667 < 0) {
            this.field3667 = 0;
        } else if (this.field3667 > 255) {
            this.field3667 = 255;
        }
        if (var7 != var11) {
            if (var3 == var11) {
                var15 = (var5 - var9) / (var11 - var7);
            } else if (var5 == var11) {
                var15 = (var9 - var3) / (var11 - var7) + 2.0D;
            } else if (var9 == var11) {
                var15 = (var3 - var5) / (var11 - var7) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        if (var17 > 0.5D) {
            this.field3680 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field3680 = (int) (var13 * var17 * 512.0D);
        }
        double var19 = var15 / 6.0D;
        this.field3670 = (int) (var13 * 256.0D);
        if (this.field3680 < 1) {
            this.field3680 = 1;
        }
        this.field3679 = (int) ((double) this.field3680 * var19);
        if (this.field3670 < 0) {
            this.field3670 = 0;
        } else if (this.field3670 > 255) {
            this.field3670 = 255;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILja;)V", line = 182)
    public final void method1586(int arg0, int arg1, class60 arg2) {
        while (true) {
            int var4 = arg2.method501(arg0 - 4);
            if (var4 == 0) {
                field3681++;
                if (arg0 != 4) {
                    this.method1584((byte) 98, (class60) null, 92, 17);
                }
                return;
            }
            this.method1584((byte) 106, arg2, arg1, var4);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class759 {

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public int field10542 = 512;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "Z")
    public boolean field10545 = true;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "Z")
    public boolean field10550 = true;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
    private int field10551 = 0;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public int field10554 = -1;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field10541 = -1;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "Z")
    public static boolean field10544 = true;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field10543;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public int field10546;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public static int field10547;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
    public static int field10548;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    public int field10549;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
    public int field10552;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
    public int field10553;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lvj;II)V")
    private final void method4214(class26 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field10551 = arg0.method186((byte) 127);
            this.method4215((byte) 111, this.field10551);
        } else if (arg1 == 2) {
            this.field10554 = arg0.method193(2);
            if (this.field10554 == 65535) {
                this.field10554 = -1;
            }
        } else if (arg1 == 3) {
            this.field10542 = arg0.method193(2) << 2;
        } else if (arg1 == 4) {
            this.field10550 = false;
        } else if (arg1 == 5) {
            this.field10545 = false;
        }
        int var4 = 81 / ((arg2 + 27) / 62);
        field10543++;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BI)V")
    private final void method4215(byte arg0, int arg1) {
        field10548++;
        if (arg0 != 111) {
            return;
        }
        double var3 = (double) ((arg1 & 0xFF26DA) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF3B) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field10546 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field10553 = (int) (var15 * 256.0D);
        if (var17 > 0.5D) {
            this.field10552 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field10552 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field10553 < 0) {
            this.field10553 = 0;
        } else if (this.field10553 > 255) {
            this.field10553 = 255;
        }
        if (this.field10546 < 0) {
            this.field10546 = 0;
        } else if (this.field10546 > 255) {
            this.field10546 = 255;
        }
        if (this.field10552 < 1) {
            this.field10552 = 1;
        }
        this.field10549 = (int) ((double) this.field10552 * var19);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILvj;)V")
    public final void method4216(int arg0, class26 arg1) {
        if (arg0 != -1) {
            return;
        }
        field10547++;
        while (true) {
            int var3 = arg1.method194((byte) 119);
            if (var3 == 0) {
                return;
            }
            this.method4214(arg1, var3, arg0 - 101);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class47 {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public int field639 = -1;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    private int field642 = 0;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public int field647 = 128;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Z")
    public boolean field644 = true;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field640 = 0;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Z")
    public static boolean field654 = false;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field655 = 0;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)V", line = 4)
    private final void method356(boolean arg0, int arg1) {
        field650++;
        double var3 = (double) ((arg1 & 0xFF9575) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF5A) >> 8) / 256.0D;
        double var7 = var3;
        double var9 = var3;
        if (arg0) {
            this.method360(-110, (class254) null, -99, (byte) -17);
        }
        double var11 = 0.0D;
        if (var5 > var3) {
            var9 = var5;
        }
        double var13 = 0.0D;
        double var15 = (double) (arg1 & 0xFF) / 256.0D;
        if (var5 < var3) {
            var7 = var5;
        }
        if (var7 > var15) {
            var7 = var15;
        }
        if (var9 < var15) {
            var9 = var15;
        }
        double var17 = (var7 + var9) / 2.0D;
        this.field653 = (int) (var17 * 256.0D);
        if (var7 != var9) {
            if (var17 < 0.5D) {
                var13 = (var9 - var7) / (var7 + var9);
            }
            if (var3 == var9) {
                var11 = (var5 - var15) / (var9 - var7);
            } else if (var5 == var9) {
                var11 = (var15 - var3) / (var9 - var7) + 2.0D;
            } else if (var9 == var15) {
                var11 = (var3 - var5) / (var9 - var7) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var9 - var7) / (2.0D - var9 - var7);
            }
        }
        double var19 = var11 / 6.0D;
        if (this.field653 < 0) {
            this.field653 = 0;
        } else if (this.field653 > 255) {
            this.field653 = 255;
        }
        if (var17 > 0.5D) {
            this.field648 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field648 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field648 < 1) {
            this.field648 = 1;
        }
        this.field643 = (int) (var13 * 256.0D);
        this.field645 = (int) ((double) this.field648 * var19);
        if (this.field643 < 0) {
            this.field643 = 0;
        } else if (this.field643 > 255) {
            this.field643 = 255;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lwm;BI)V", line = 99)
    public final void method357(class254 arg0, byte arg1, int arg2) {
        field641++;
        while (true) {
            int var4 = arg0.method1774((byte) 50);
            if (var4 == 0) {
                if (arg1 < 111) {
                    this.field648 = 95;
                }
                return;
            }
            this.method360(var4, arg0, arg2, (byte) 44);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIII)V", line = 123)
    public static final void method358(boolean arg0, int arg1, int arg2, int arg3) {
        field638++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg2 != 48000) {
            method359(-108);
        }
        class260.field4009 = arg1;
        class325.field5020 = arg0;
        class308.field4803 = arg3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I", line = 166)
    public static final int method359(int arg0) {
        field646++;
        if (arg0 >= -60) {
            method358(true, 111, 103, -42);
        }
        return 2;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILwm;IB)V", line = 177)
    private final void method360(int arg0, class254 arg1, int arg2, byte arg3) {
        field649++;
        int var5 = 58 % ((-arg3 - 35) / 55);
        if (arg0 == 1) {
            this.field642 = arg1.method1758((byte) 101);
            this.method356(false, this.field642);
        } else if (arg0 == 2) {
            this.field639 = arg1.method1755(false);
            if (this.field639 == 65535) {
                this.field639 = -1;
            }
        } else if (arg0 == 3) {
            this.field647 = arg1.method1755(false);
        } else if (arg0 == 4) {
            this.field644 = false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V", line = 227)
    public static final void method361(boolean arg0) {
        field652++;
        class173.field2790.method750((byte) 116);
        if (arg0) {
            class233.field3540.method750((byte) 95);
        }
    }
}

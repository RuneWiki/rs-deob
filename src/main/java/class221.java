import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class221 {

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Z")
    public boolean field2698 = true;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public int field2702 = -1;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public int field2695 = 512;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public int field2693 = 127;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public int field2709 = -1;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public int field2699 = 8;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "Z")
    public boolean field2708 = true;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public int field2696 = 0;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public int field2706 = 1190717;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Z")
    public boolean field2710 = false;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public int field2705 = 64;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2711 = new Rectangle[100];

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "Lrga;")
    public static class280 field2712;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public int field2704;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "Lwp;")
    public static class453 field2713;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lcp;")
    public class684 field2694;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field2711[var0] = new Rectangle();
        }
        field2712 = new class280(61, 2);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V", line = 16)
    public static final void method1303(boolean arg0) {
        if (!arg0) {
            field2712 = null;
        }
        class436.method2290(-101);
        field2701++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Les;II)V", line = 27)
    private final void method1304(class630 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2696 = class13.method106(arg0.method3517(arg2 ^ 0x81E), (byte) 109);
        } else if (arg1 == 2) {
            this.field2709 = arg0.method3501(-9268);
        } else if (arg1 == 3) {
            this.field2709 = arg0.method3470(13111);
            if (this.field2709 == 65535) {
                this.field2709 = -1;
            }
        } else if (arg1 == 5) {
            this.field2708 = false;
        } else if (arg1 == 7) {
            this.field2702 = class13.method106(arg0.method3517(-1), (byte) 124);
        } else if (arg1 == 8) {
            this.field2694.field9613 = this.field2704;
        } else if (arg1 == 9) {
            this.field2695 = arg0.method3470(13111) << 2;
        } else if (arg1 == 10) {
            this.field2698 = false;
        } else if (arg1 == 11) {
            this.field2699 = arg0.method3501(-9268);
        } else if (arg1 == 12) {
            this.field2710 = true;
        } else if (arg1 == 13) {
            this.field2706 = arg0.method3517(-1);
        } else if (arg1 == 14) {
            this.field2705 = arg0.method3501(-9268) << 2;
        } else if (arg1 == 16) {
            this.field2693 = arg0.method3501(arg2 ^ 0x2C2D);
        }
        if (arg2 != -2079) {
            this.method1306(null, 32);
        }
        field2707++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 110)
    public final void method1305(int arg0) {
        field2700++;
        this.field2699 = this.field2699 << 8 | this.field2704;
        if (arg0 != 3) {
            this.method1304(null, -89, -53);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Les;I)V", line = 121)
    public final void method1306(class630 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3501(-9268);
            if (var3 == 0) {
                field2703++;
                if (arg1 != -3990) {
                    this.field2705 = -127;
                    return;
                }
                return;
            }
            this.method1304(arg0, var3, -2079);
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V", line = 155)
    public static void method1307(int arg0) {
        if (arg0 == 2) {
            field2712 = null;
            field2711 = null;
            field2713 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIBII)V", line = 173)
    public static final void method1308(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -80) {
            field2712 = null;
        }
        field2697++;
        if (arg4 <= arg1) {
            class57.method362(arg4, class550.field7650[arg0], arg3, arg1, -127);
        } else {
            class57.method362(arg1, class550.field7650[arg0], arg3, arg4, -128);
        }
    }
}

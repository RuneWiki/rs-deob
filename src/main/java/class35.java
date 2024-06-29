import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class35 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    private int field561 = -1;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    private int field565 = 0;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Loa;")
    public static class276 field566 = new class276(16);

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Lda;")
    public static class275 field573 = class255.method1672(106, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "Lda;")
    public static class275 field574 = class255.method1672(125, "<col=ff7000>");

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "[[[I")
    public static int[][][] field575 = new int[2][][];

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "Lda;")
    public static class275 field582 = class255.method1672(113, "T");

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field576 = 0;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "Lda;")
    public static class275 field579 = class255.method1672(108, ":assistreq:");

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field580 = 0;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "S")
    public static short field584 = 320;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "D")
    public static double field577 = -1.0D;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public int field563;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public int field569;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public int field572;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "Lia;")
    public static class260 field578;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "[Lwb;")
    public static class179[] field585;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "[[[B")
    public static byte[][][] field583;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)V")
    private final void method206(byte arg0, int arg1) {
        double var3 = (double) ((arg1 & 0xFF2C) >> 8) / 256.0D;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        if (arg0 > -81) {
            field579 = null;
        }
        field568++;
        double var7 = var5;
        double var9 = (double) (arg1 & 0xFF) / 256.0D;
        if (var5 > var3) {
            var7 = var3;
        }
        if (var9 < var7) {
            var7 = var9;
        }
        double var11 = var5;
        if (var5 < var3) {
            var11 = var3;
        }
        if (var9 > var11) {
            var11 = var9;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var7 + var11) / 2.0D;
        if (var7 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (2.0D - var11 - var7);
            }
            if (var5 == var11) {
                var13 = (var3 - var9) / (var11 - var7);
            } else if (var3 == var11) {
                var13 = (var9 - var5) / (var11 - var7) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var5 - var3) / (var11 - var7) + 4.0D;
            }
        }
        if ((var17 > 0.5D)) {
            this.field581 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field581 = (int) (var15 * var17 * 512.0D);
        }
        this.field563 = (int) (var17 * 256.0D);
        if (this.field581 < 1) {
            this.field581 = 1;
        }
        double var19 = var13 / 6.0D;
        this.field572 = (int) ((double) this.field581 * var19);
        if (this.field563 < 0) {
            this.field563 = 0;
        } else if (this.field563 > 255) {
            this.field563 = 255;
        }
        this.field569 = (int) (var15 * 256.0D);
        if (this.field569 < 0) {
            this.field569 = 0;
        } else if (this.field569 > 255) {
            this.field569 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method207(int arg0) {
        field575 = null;
        field574 = null;
        field578 = null;
        if (arg0 != 1) {
            method211(-111, -4);
        }
        field579 = null;
        field585 = null;
        field582 = null;
        field573 = null;
        field566 = null;
        field583 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)J")
    public static final long method208(int arg0, int arg1, int arg2) {
        class3 var3 = class235.field4101[arg0][arg1][arg2];
        return var3 == null || var3.field39 == null ? 0L : var3.field39.field3645;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIILij;)V")
    private final void method209(boolean arg0, int arg1, int arg2, class85 arg3) {
        field567++;
        if (!arg0) {
            return;
        }
        if (arg1 == 1) {
            this.field565 = arg3.method598(121);
            this.method206((byte) -95, this.field565);
        } else if (arg1 == 2) {
            this.field561 = arg3.method608(72);
            if (this.field561 == 65535) {
                this.field561 = -1;
                return;
            }
            return;
        } else if (arg1 == 3) {
            arg3.method608(18);
            return;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lij;IZ)V")
    public final void method210(class85 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field578 = null;
        }
        while (true) {
            int var4 = arg0.method564((byte) 63);
            if (var4 == 0) {
                field564++;
                return;
            }
            this.method209(true, var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
    public static final void method211(int arg0, int arg1) {
        if (arg0 <= 1) {
            method212(-49, -24, -52, -113, 18, 63);
        }
        field562++;
        class184 var2 = class147.method1044(10, (byte) 32, arg1);
        var2.method1230(1000);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIII)V")
    public static final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class11.field166 = arg4;
        class147.field2567 = arg5;
        class33.field491 = arg0;
        if (arg3 != -65536) {
            return;
        }
        class267.field4642 = arg2;
        field570++;
        class23.field388 = arg1;
        if (class33.field491 >= 100) {
            int var6 = class11.field166 * 128 + 64;
            int var7 = class23.field388 * 128 + 64;
            int var8 = class89.method647(var7, class159.field2790, var6, 125) - class267.field4642;
            int var9 = var6 - class123.field2204;
            int var10 = var8 - class83.field1349;
            int var11 = var7 - class195.field3335;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class251.field4454 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class224.field3800 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class251.field4454 < 128) {
                class251.field4454 = 128;
            }
            if (class251.field4454 > 383) {
                class251.field4454 = 383;
            }
        }
        class159.field2789 = 2;
    }
}

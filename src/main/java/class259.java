import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class259 {

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    private int field4123 = -1;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    private int field4126 = 0;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field4117 = 0;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public int field4119;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public int field4124;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public int field4128;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "[I")
    public static int[] field4116;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)V")
    private final void method1729(int arg0, byte arg1) {
        field4121++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) ((arg0 & 0xFF65) >> 8) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var7 > var3) {
            var11 = var7;
        }
        if (var11 < var5) {
            var11 = var5;
        }
        double var13 = 0.0D;
        if (var7 < var3) {
            var9 = var7;
        }
        double var15 = 0.0D;
        if (var5 < var9) {
            var9 = var5;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var7 - var5) / (var11 - var9);
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (var11 - var9) + 2.0D;
            } else if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field4127 = (int) (var17 * 256.0D);
        if (arg1 != 16) {
            method1733((byte) -111, 73);
        }
        double var19 = var13 / 6.0D;
        if (this.field4127 < 0) {
            this.field4127 = 0;
        } else if (this.field4127 > 255) {
            this.field4127 = 255;
        }
        this.field4124 = (int) (var15 * 256.0D);
        if (this.field4124 < 0) {
            this.field4124 = 0;
        } else if (this.field4124 > 255) {
            this.field4124 = 255;
        }
        if (var17 > 0.5D) {
            this.field4119 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4119 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4119 < 1) {
            this.field4119 = 1;
        }
        this.field4128 = (int) ((double) this.field4119 * var19);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method1730(int arg0) {
        field4116 = null;
        if (arg0 != -129) {
            field4116 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public static final void method1731(int arg0) {
        class52.field938.method1156(-117);
        field4129++;
        class276.field4397.method1156(-60);
        class293.field4651.method1156(-51);
        if (arg0 != 65381) {
            method1731(-86);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZILig;)V")
    private final void method1732(int arg0, boolean arg1, int arg2, class136 arg3) {
        if (arg2 == 1) {
            this.field4126 = arg3.method1009(92);
            this.method1729(this.field4126, (byte) 16);
        } else if (arg2 == 2) {
            this.field4123 = arg3.method996(65280);
            if (this.field4123 == 65535) {
                this.field4123 = -1;
            }
        } else if (arg2 == 3) {
            arg3.method996(65280);
        }
        field4120++;
        if (arg1) {
            field4130 = -71;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)C")
    public static final char method1733(byte arg0, int arg1) {
        field4122++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class179.field2979[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        int var4 = -72 % ((arg1 + 23) / 45);
        return (char) var2;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILig;)V")
    public final void method1734(int arg0, int arg1, class136 arg2) {
        while (true) {
            int var4 = arg2.method1012(arg1 - 28871);
            if (var4 == 0) {
                field4125++;
                if (arg1 != 28875) {
                    this.field4128 = -70;
                    return;
                }
                return;
            }
            this.method1732(arg0, false, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(IB)I")
    public static final int method1735(int arg0, byte arg1) {
        field4118++;
        if (class23.field360 != null) {
            class23.field360.method294((byte) 117);
            class23.field360 = null;
        }
        class218.field3507++;
        if (class218.field3507 > 4) {
            class218.field3507 = 0;
            class228.field3620 = 0;
            return arg0;
        }
        class228.field3620 = 0;
        if (arg1 != -62) {
            return 50;
        }
        if (class25.field437 == class213.field3423) {
            class213.field3423 = class277.field4404;
        } else {
            class213.field3423 = class25.field437;
        }
        return -1;
    }
}

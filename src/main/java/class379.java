import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class379 {

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "Z")
    public boolean field5135 = true;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public int field5133 = 512;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
    public int field5128 = -1;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
    private int field5126 = 0;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "Z")
    public boolean field5136 = true;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "Lsb;")
    public static class305 field5137 = new class305(12, 0);

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "Z")
    public static boolean field5141 = false;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "Lsq;")
    public static class485 field5140 = new class485(1);

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
    public int field5129;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
    public int field5130;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    public int field5132;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "I")
    public int field5138;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IB)V", line = 6)
    private final void method2185(int arg0, byte arg1) {
        field5127++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFFB5) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        if (arg1 != -55) {
            this.method2185(-100, (byte) -91);
        }
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
        double var19 = var13 / 6.0D;
        this.field5138 = (int) (var15 * 256.0D);
        this.field5132 = (int) (var17 * 256.0D);
        if (this.field5138 < 0) {
            this.field5138 = 0;
        } else if (this.field5138 > 255) {
            this.field5138 = 255;
        }
        if (this.field5132 < 0) {
            this.field5132 = 0;
        } else if (this.field5132 > 255) {
            this.field5132 = 255;
        }
        if (var17 > 0.5D) {
            this.field5129 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field5129 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field5129 < 1) {
            this.field5129 = 1;
        }
        this.field5130 = (int) ((double) this.field5129 * var19);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILnp;I)V", line = 95)
    private final void method2186(int arg0, class115 arg1, int arg2) {
        field5134++;
        if (arg2 != -1967322014) {
            this.field5130 = 26;
        }
        if (arg0 == 1) {
            this.field5126 = arg1.method675(arg2 + 1967321887);
            this.method2185(this.field5126, (byte) -55);
        } else if (arg0 == 2) {
            this.field5128 = arg1.method643((byte) -77);
            if (this.field5128 == 65535) {
                this.field5128 = -1;
                return;
            }
        } else {
            if (arg0 == 3) {
                this.field5133 = arg1.method643((byte) -77) << 2;
            } else if (arg0 == 4) {
                this.field5135 = false;
                return;
            } else if (arg0 == 5) {
                this.field5136 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lnp;I)V", line = 139)
    public final void method2187(class115 arg0, int arg1) {
        field5131++;
        while (true) {
            int var3 = arg0.method620((byte) 4);
            if (var3 == 0) {
                if (arg1 == -10337) {
                    return;
                } else {
                    field5137 = null;
                    return;
                }
            }
            this.method2186(var3, arg0, -1967322014);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V", line = 187)
    public static void method2188(byte arg0) {
        if (arg0 <= 105) {
            field5140 = null;
        }
        field5140 = null;
        field5137 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class537 {

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public int field7510 = -1;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public int field7509 = 128;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    private int field7511 = 0;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "Z")
    public boolean field7518 = true;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "Ldv;")
    public static class566 field7514 = new class566(64, 7);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public int field7506;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public int field7508;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public int field7512;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public int field7513;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public static void method3082(byte arg0) {
        field7514 = null;
        int var1 = -83 % ((arg0 + 38) / 59);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)V")
    private final void method3083(int arg0, byte arg1) {
        field7507++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF47) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field7512 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field7506 = (int) (var15 * 256.0D);
        if (this.field7512 < 0) {
            this.field7512 = 0;
        } else if (this.field7512 > 255) {
            this.field7512 = 255;
        }
        if (this.field7506 < 0) {
            this.field7506 = 0;
        } else if (this.field7506 > 255) {
            this.field7506 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field7513 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field7513 = (int) (var15 * var17 * 512.0D);
        }
        if (arg1 == -84) {
            if (this.field7513 < 1) {
                this.field7513 = 1;
            }
            this.field7508 = (int) ((double) this.field7513 * var19);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILdaa;I)V")
    private final void method3084(int arg0, class11 arg1, int arg2) {
        if (arg2 != 2) {
            method3085(29, -39, 127, -76, -79, -34);
        }
        if (arg0 == 1) {
            this.field7511 = arg1.method89((byte) -28);
            this.method3083(this.field7511, (byte) -84);
        } else if (arg0 == 2) {
            this.field7510 = arg1.method93((byte) 91);
            if (this.field7510 == 65535) {
                this.field7510 = -1;
            }
        } else if (arg0 == 3) {
            this.field7509 = arg1.method93((byte) 127) << 0;
        } else if (arg0 == 4) {
            this.field7518 = false;
        }
        field7517++;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIII)V")
    public static final void method3085(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 596174632) {
            field7519 = -72;
        }
        field7515++;
        if (arg1 >= class326.field4387 && class596.field8621 >= arg5 && arg2 >= class264.field3687 && arg3 <= class591.field8435) {
            class582.method3322(arg4, 97, arg1, arg5, arg2, arg3);
        } else {
            class548.method3126(arg1, arg5, arg3, (byte) -124, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ldaa;Z)V")
    public final void method3086(class11 arg0, boolean arg1) {
        if (!arg1) {
            field7514 = null;
        }
        field7505++;
        while (true) {
            int var3 = arg0.method110((byte) 32);
            if (var3 == 0) {
                return;
            }
            this.method3084(var3, arg0, 2);
        }
    }
}

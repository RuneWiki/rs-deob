import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZVWMVAWM")
public class class72 {

    @OriginalMember(owner = "client!ZVWMVAWM", name = "e", descriptor = "I")
    public int field1752 = -1;

    @OriginalMember(owner = "client!ZVWMVAWM", name = "f", descriptor = "Z")
    public boolean field1753 = false;

    @OriginalMember(owner = "client!ZVWMVAWM", name = "g", descriptor = "Z")
    public boolean field1754 = true;

    @OriginalMember(owner = "client!ZVWMVAWM", name = "a", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!ZVWMVAWM", name = "d", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!ZVWMVAWM", name = "h", descriptor = "I")
    public int field1755;

    @OriginalMember(owner = "client!ZVWMVAWM", name = "i", descriptor = "I")
    public int field1756;

    @OriginalMember(owner = "client!ZVWMVAWM", name = "j", descriptor = "I")
    public int field1757;

    @OriginalMember(owner = "client!ZVWMVAWM", name = "k", descriptor = "I")
    public int field1758;

    @OriginalMember(owner = "client!ZVWMVAWM", name = "l", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!ZVWMVAWM", name = "m", descriptor = "I")
    public int field1760;

    @OriginalMember(owner = "client!ZVWMVAWM", name = "c", descriptor = "Ljava/lang/String;")
    public String field1750;

    @OriginalMember(owner = "client!ZVWMVAWM", name = "b", descriptor = "[LZVWMVAWM;")
    public static class72[] field1749;

    @OriginalMember(owner = "client!ZVWMVAWM", name = "a", descriptor = "(ZLFXNTEMPE;)V")
    public static void method601(boolean arg0, class18 arg1) {
        class50 var2 = new class50(arg1.method212("flo.dat", null), -46859);
        field1748 = var2.method390();
        if (field1749 == null) {
            field1749 = new class72[field1748];
        }
        for (int var3 = 0; var3 < field1748; var3++) {
            if (field1749[var3] == null) {
                field1749[var3] = new class72();
            }
            field1749[var3].method602(var2, (byte) 46);
        }
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!ZVWMVAWM", name = "a", descriptor = "(LRSWRPCHR;B)V")
    public void method602(class50 arg0, byte arg1) {
        if (arg1 != 46) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method388();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1751 = arg0.method392();
                this.method603(this.field1751, false);
            } else if (var3 == 2) {
                this.field1752 = arg0.method388();
            } else if (var3 == 3) {
                this.field1753 = true;
            } else if (var3 == 5) {
                this.field1754 = false;
            } else if (var3 == 6) {
                this.field1750 = arg0.method395();
            } else if (var3 == 7) {
                int var4 = this.field1755;
                int var5 = this.field1756;
                int var6 = this.field1757;
                int var7 = this.field1758;
                int var8 = arg0.method392();
                this.method603(var8, false);
                this.field1755 = var4;
                this.field1756 = var5;
                this.field1757 = var6;
                this.field1758 = var7;
                this.field1759 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "client!ZVWMVAWM", name = "a", descriptor = "(IZ)V")
    private void method603(int arg0, boolean arg1) {
        if (arg0 == 16711935) {
            arg0 = 0;
        }
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
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
        double var19 = var13 / 6.0D;
        this.field1755 = (int) (var19 * 256.0D);
        this.field1756 = (int) (var15 * 256.0D);
        this.field1757 = (int) (var17 * 256.0D);
        if (this.field1756 < 0) {
            this.field1756 = 0;
        } else if (this.field1756 > 255) {
            this.field1756 = 255;
        }
        if (this.field1757 < 0) {
            this.field1757 = 0;
        } else if (this.field1757 > 255) {
            this.field1757 = 255;
        }
        if (var17 > 0.5D) {
            this.field1759 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1759 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1759 < 1) {
            this.field1759 = 1;
        }
        this.field1758 = (int) ((double) this.field1759 * var19);
        int var21 = this.field1755 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1756 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1757 + (int) (Math.random() * 48.0D) - 24;
        if (arg1) {
            return;
        }
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1760 = this.method604(var21, var22, var23);
    }

    @OriginalMember(owner = "client!ZVWMVAWM", name = "a", descriptor = "(III)I")
    private final int method604(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }
}

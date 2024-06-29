import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FBZMYCDC")
public class class17 {

    @OriginalMember(owner = "client!FBZMYCDC", name = "a", descriptor = "Z")
    private boolean field759 = false;

    @OriginalMember(owner = "client!FBZMYCDC", name = "f", descriptor = "I")
    public int field764 = -1;

    @OriginalMember(owner = "client!FBZMYCDC", name = "g", descriptor = "Z")
    public boolean field765 = false;

    @OriginalMember(owner = "client!FBZMYCDC", name = "h", descriptor = "Z")
    public boolean field766 = true;

    @OriginalMember(owner = "client!FBZMYCDC", name = "b", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!FBZMYCDC", name = "e", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!FBZMYCDC", name = "i", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "client!FBZMYCDC", name = "j", descriptor = "I")
    public int field768;

    @OriginalMember(owner = "client!FBZMYCDC", name = "k", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!FBZMYCDC", name = "l", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!FBZMYCDC", name = "m", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!FBZMYCDC", name = "n", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!FBZMYCDC", name = "d", descriptor = "Ljava/lang/String;")
    public String field762;

    @OriginalMember(owner = "client!FBZMYCDC", name = "c", descriptor = "[LFBZMYCDC;")
    public static class17[] field761;

    @OriginalMember(owner = "client!FBZMYCDC", name = "a", descriptor = "(BLJUPFHAZZ;)V")
    public static void method197(byte arg0, class32 arg1) {
        if (arg0 != -3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class59 var3 = new class59(859, arg1.method372("flo.dat", null));
        field760 = var3.method531();
        if (field761 == null) {
            field761 = new class17[field760];
        }
        for (int var4 = 0; var4 < field760; var4++) {
            if (field761[var4] == null) {
                field761[var4] = new class17();
            }
            field761[var4].method198(var3, (byte) 4);
        }
    }

    @OriginalMember(owner = "client!FBZMYCDC", name = "a", descriptor = "(LTKPFKOXP;B)V")
    public void method198(class59 arg0, byte arg1) {
        if (arg1 != 4) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method529();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field763 = arg0.method533();
                this.method199(0, this.field763);
            } else if (var3 == 2) {
                this.field764 = arg0.method529();
            } else if (var3 == 3) {
                this.field765 = true;
            } else if (var3 == 5) {
                this.field766 = false;
            } else if (var3 == 6) {
                this.field762 = arg0.method536();
            } else if (var3 == 7) {
                int var4 = this.field767;
                int var5 = this.field768;
                int var6 = this.field769;
                int var7 = this.field770;
                int var8 = arg0.method533();
                this.method199(0, var8);
                this.field767 = var4;
                this.field768 = var5;
                this.field769 = var6;
                this.field770 = var7;
                this.field771 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "client!FBZMYCDC", name = "a", descriptor = "(II)V")
    private void method199(int arg0, int arg1) {
        if (arg1 == 16711935) {
            arg1 = 0;
        }
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        if (arg0 != 0) {
            this.field759 = !this.field759;
        }
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
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
        this.field767 = (int) (var19 * 256.0D);
        this.field768 = (int) (var15 * 256.0D);
        this.field769 = (int) (var17 * 256.0D);
        if (this.field768 < 0) {
            this.field768 = 0;
        } else if (this.field768 > 255) {
            this.field768 = 255;
        }
        if (this.field769 < 0) {
            this.field769 = 0;
        } else if (this.field769 > 255) {
            this.field769 = 255;
        }
        if (var17 > 0.5D) {
            this.field771 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field771 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field771 < 1) {
            this.field771 = 1;
        }
        this.field770 = (int) ((double) this.field771 * var19);
        int var21 = this.field767 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field768 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field769 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field772 = this.method200(var21, var22, var23);
    }

    @OriginalMember(owner = "client!FBZMYCDC", name = "a", descriptor = "(III)I")
    private final int method200(int arg0, int arg1, int arg2) {
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

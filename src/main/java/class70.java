import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YOJCLTLA")
public class class70 {

    @OriginalMember(owner = "YOJCLTLA", name = "a", descriptor = "I")
    private int field1708 = 22486;

    @OriginalMember(owner = "YOJCLTLA", name = "b", descriptor = "Z")
    private boolean field1709 = false;

    @OriginalMember(owner = "YOJCLTLA", name = "g", descriptor = "I")
    public int field1714 = -1;

    @OriginalMember(owner = "YOJCLTLA", name = "h", descriptor = "Z")
    public boolean field1715 = false;

    @OriginalMember(owner = "YOJCLTLA", name = "i", descriptor = "Z")
    public boolean field1716 = true;

    @OriginalMember(owner = "YOJCLTLA", name = "c", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "YOJCLTLA", name = "f", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "YOJCLTLA", name = "j", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "YOJCLTLA", name = "k", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "YOJCLTLA", name = "l", descriptor = "I")
    public int field1719;

    @OriginalMember(owner = "YOJCLTLA", name = "m", descriptor = "I")
    public int field1720;

    @OriginalMember(owner = "YOJCLTLA", name = "n", descriptor = "I")
    public int field1721;

    @OriginalMember(owner = "YOJCLTLA", name = "o", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "YOJCLTLA", name = "e", descriptor = "Ljava/lang/String;")
    public String field1712;

    @OriginalMember(owner = "YOJCLTLA", name = "d", descriptor = "[LYOJCLTLA;")
    public static class70[] field1711;

    @OriginalMember(owner = "YOJCLTLA", name = "a", descriptor = "(LVSUYIIVA;I)V")
    public static void method583(class62 arg0, int arg1) {
        int var2 = 79 / arg1;
        class8 var3 = new class8(arg0.method570("flo.dat", null), 792);
        field1710 = var3.method32();
        if (field1711 == null) {
            field1711 = new class70[field1710];
        }
        for (int var4 = 0; var4 < field1710; var4++) {
            if (field1711[var4] == null) {
                field1711[var4] = new class70();
            }
            field1711[var4].method584(var3, 22486);
        }
    }

    @OriginalMember(owner = "YOJCLTLA", name = "a", descriptor = "(LCFARFRSG;I)V")
    public void method584(class8 arg0, int arg1) {
        if (this.field1708 != arg1) {
            this.field1708 = 409;
        }
        while (true) {
            int var3 = arg0.method30();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1713 = arg0.method34();
                this.method585(this.field1713, (byte) 5);
            } else if (var3 == 2) {
                this.field1714 = arg0.method30();
            } else if (var3 == 3) {
                this.field1715 = true;
            } else if (var3 == 5) {
                this.field1716 = false;
            } else if (var3 == 6) {
                this.field1712 = arg0.method37();
            } else if (var3 == 7) {
                int var4 = this.field1717;
                int var5 = this.field1718;
                int var6 = this.field1719;
                int var7 = this.field1720;
                int var8 = arg0.method34();
                this.method585(var8, (byte) 5);
                this.field1717 = var4;
                this.field1718 = var5;
                this.field1719 = var6;
                this.field1720 = var7;
                this.field1721 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "YOJCLTLA", name = "a", descriptor = "(IB)V")
    private void method585(int arg0, byte arg1) {
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
        if (arg1 != 5) {
            this.field1709 = !this.field1709;
        }
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
        this.field1717 = (int) (var19 * 256.0D);
        this.field1718 = (int) (var15 * 256.0D);
        this.field1719 = (int) (var17 * 256.0D);
        if (this.field1718 < 0) {
            this.field1718 = 0;
        } else if (this.field1718 > 255) {
            this.field1718 = 255;
        }
        if (this.field1719 < 0) {
            this.field1719 = 0;
        } else if (this.field1719 > 255) {
            this.field1719 = 255;
        }
        if (var17 > 0.5D) {
            this.field1721 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1721 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1721 < 1) {
            this.field1721 = 1;
        }
        this.field1720 = (int) ((double) this.field1721 * var19);
        int var21 = this.field1717 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1718 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1719 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1722 = this.method586(var21, var22, var23);
    }

    @OriginalMember(owner = "YOJCLTLA", name = "a", descriptor = "(III)I")
    private final int method586(int arg0, int arg1, int arg2) {
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

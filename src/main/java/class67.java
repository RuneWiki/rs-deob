import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YDUFKDFX")
public class class67 {

    @OriginalMember(owner = "client!YDUFKDFX", name = "b", descriptor = "I")
    private int field1659 = 7;

    @OriginalMember(owner = "client!YDUFKDFX", name = "g", descriptor = "I")
    public int field1664 = -1;

    @OriginalMember(owner = "client!YDUFKDFX", name = "h", descriptor = "Z")
    public boolean field1665 = false;

    @OriginalMember(owner = "client!YDUFKDFX", name = "i", descriptor = "Z")
    public boolean field1666 = true;

    @OriginalMember(owner = "client!YDUFKDFX", name = "a", descriptor = "Z")
    private static boolean field1658 = true;

    @OriginalMember(owner = "client!YDUFKDFX", name = "c", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!YDUFKDFX", name = "f", descriptor = "I")
    public int field1663;

    @OriginalMember(owner = "client!YDUFKDFX", name = "j", descriptor = "I")
    public int field1667;

    @OriginalMember(owner = "client!YDUFKDFX", name = "k", descriptor = "I")
    public int field1668;

    @OriginalMember(owner = "client!YDUFKDFX", name = "l", descriptor = "I")
    public int field1669;

    @OriginalMember(owner = "client!YDUFKDFX", name = "m", descriptor = "I")
    public int field1670;

    @OriginalMember(owner = "client!YDUFKDFX", name = "n", descriptor = "I")
    public int field1671;

    @OriginalMember(owner = "client!YDUFKDFX", name = "o", descriptor = "I")
    public int field1672;

    @OriginalMember(owner = "client!YDUFKDFX", name = "e", descriptor = "Ljava/lang/String;")
    public String field1662;

    @OriginalMember(owner = "client!YDUFKDFX", name = "d", descriptor = "[LYDUFKDFX;")
    public static class67[] field1661;

    @OriginalMember(owner = "client!YDUFKDFX", name = "a", descriptor = "(LAWEEREDT;I)V")
    public static void method572(class2 arg0, int arg1) {
        if (arg1 != 0) {
            field1658 = !field1658;
        }
        class25 var2 = new class25(arg0.method14("flo.dat", null), 713);
        field1660 = var2.method247();
        if (field1661 == null) {
            field1661 = new class67[field1660];
        }
        for (int var3 = 0; var3 < field1660; var3++) {
            if (field1661[var3] == null) {
                field1661[var3] = new class67();
            }
            field1661[var3].method573(var2, (byte) 1);
        }
    }

    @OriginalMember(owner = "client!YDUFKDFX", name = "a", descriptor = "(LIUVBENCV;B)V")
    public void method573(class25 arg0, byte arg1) {
        if (arg1 == 1) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg0.method245();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1663 = arg0.method249();
                this.method574(-823, this.field1663);
            } else if (var5 == 2) {
                this.field1664 = arg0.method245();
            } else if (var5 == 3) {
                this.field1665 = true;
            } else if (var5 == 5) {
                this.field1666 = false;
            } else if (var5 == 6) {
                this.field1662 = arg0.method252();
            } else if (var5 == 7) {
                int var6 = this.field1667;
                int var7 = this.field1668;
                int var8 = this.field1669;
                int var9 = this.field1670;
                int var10 = arg0.method249();
                this.method574(-823, var10);
                this.field1667 = var6;
                this.field1668 = var7;
                this.field1669 = var8;
                this.field1670 = var9;
                this.field1671 = var9;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }

    @OriginalMember(owner = "client!YDUFKDFX", name = "a", descriptor = "(II)V")
    private void method574(int arg0, int arg1) {
        if (arg1 == 16711935) {
            arg1 = 0;
        }
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (arg0 != -823) {
            this.field1659 = 162;
        }
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
        this.field1667 = (int) (var19 * 256.0D);
        this.field1668 = (int) (var15 * 256.0D);
        this.field1669 = (int) (var17 * 256.0D);
        if (this.field1668 < 0) {
            this.field1668 = 0;
        } else if (this.field1668 > 255) {
            this.field1668 = 255;
        }
        if (this.field1669 < 0) {
            this.field1669 = 0;
        } else if (this.field1669 > 255) {
            this.field1669 = 255;
        }
        if (var17 > 0.5D) {
            this.field1671 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1671 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1671 < 1) {
            this.field1671 = 1;
        }
        this.field1670 = (int) ((double) this.field1671 * var19);
        int var21 = this.field1667 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1668 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1669 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1672 = this.method575(var21, var22, var23);
    }

    @OriginalMember(owner = "client!YDUFKDFX", name = "a", descriptor = "(III)I")
    private final int method575(int arg0, int arg1, int arg2) {
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

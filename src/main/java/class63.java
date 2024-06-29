import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UGHJOVKI")
public class class63 {

    @OriginalMember(owner = "client!UGHJOVKI", name = "e", descriptor = "I")
    public int field1644 = -1;

    @OriginalMember(owner = "client!UGHJOVKI", name = "f", descriptor = "Z")
    public boolean field1645 = false;

    @OriginalMember(owner = "client!UGHJOVKI", name = "g", descriptor = "Z")
    public boolean field1646 = true;

    @OriginalMember(owner = "client!UGHJOVKI", name = "a", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!UGHJOVKI", name = "d", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "client!UGHJOVKI", name = "h", descriptor = "I")
    public int field1647;

    @OriginalMember(owner = "client!UGHJOVKI", name = "i", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "client!UGHJOVKI", name = "j", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client!UGHJOVKI", name = "k", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client!UGHJOVKI", name = "l", descriptor = "I")
    public int field1651;

    @OriginalMember(owner = "client!UGHJOVKI", name = "m", descriptor = "I")
    public int field1652;

    @OriginalMember(owner = "client!UGHJOVKI", name = "c", descriptor = "Ljava/lang/String;")
    public String field1642;

    @OriginalMember(owner = "client!UGHJOVKI", name = "b", descriptor = "[LUGHJOVKI;")
    public static class63[] field1641;

    @OriginalMember(owner = "client!UGHJOVKI", name = "a", descriptor = "(BLESUFCMYV;)V")
    public static void method552(byte arg0, class11 arg1) {
        class53 var2 = new class53(arg1.method205("flo.dat", null), (byte) -17);
        field1640 = var2.method457();
        if (arg0 != 6) {
            return;
        }
        if (field1641 == null) {
            field1641 = new class63[field1640];
        }
        for (int var3 = 0; var3 < field1640; var3++) {
            if (field1641[var3] == null) {
                field1641[var3] = new class63();
            }
            field1641[var3].method553(5, var2);
        }
    }

    @OriginalMember(owner = "client!UGHJOVKI", name = "a", descriptor = "(ILRGCGKKUR;)V")
    public void method553(int arg0, class53 arg1) {
        if (arg0 != 5) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            int var4 = arg1.method455();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1643 = arg1.method459();
                this.method554(this.field1643, 548);
            } else if (var4 == 2) {
                this.field1644 = arg1.method455();
            } else if (var4 == 3) {
                this.field1645 = true;
            } else if (var4 == 5) {
                this.field1646 = false;
            } else if (var4 == 6) {
                this.field1642 = arg1.method462();
            } else if (var4 == 7) {
                int var5 = this.field1647;
                int var6 = this.field1648;
                int var7 = this.field1649;
                int var8 = this.field1650;
                int var9 = arg1.method459();
                this.method554(var9, 548);
                this.field1647 = var5;
                this.field1648 = var6;
                this.field1649 = var7;
                this.field1650 = var8;
                this.field1651 = var8;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }

    @OriginalMember(owner = "client!UGHJOVKI", name = "a", descriptor = "(II)V")
    private void method554(int arg0, int arg1) {
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
        if (arg1 <= 0) {
            return;
        }
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
        this.field1647 = (int) (var19 * 256.0D);
        this.field1648 = (int) (var15 * 256.0D);
        this.field1649 = (int) (var17 * 256.0D);
        if (this.field1648 < 0) {
            this.field1648 = 0;
        } else if (this.field1648 > 255) {
            this.field1648 = 255;
        }
        if (this.field1649 < 0) {
            this.field1649 = 0;
        } else if (this.field1649 > 255) {
            this.field1649 = 255;
        }
        if (var17 > 0.5D) {
            this.field1651 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1651 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1651 < 1) {
            this.field1651 = 1;
        }
        this.field1650 = (int) ((double) this.field1651 * var19);
        int var21 = this.field1647 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1648 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1649 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1652 = this.method555(var21, var22, var23);
    }

    @OriginalMember(owner = "client!UGHJOVKI", name = "a", descriptor = "(III)I")
    private final int method555(int arg0, int arg1, int arg2) {
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

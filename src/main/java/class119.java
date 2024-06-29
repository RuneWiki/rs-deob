import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class119 {

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public int field1611 = -1;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Z")
    public boolean field1621 = true;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    private int field1615 = 0;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public int field1622 = 128;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field1607 = -1;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "Z")
    public static boolean field1610 = true;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "[I")
    public static int[] field1620 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "[[I")
    public static int[][] field1604 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Lkm;")
    public static class133 field1602;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[I")
    public static int[] field1603;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 5)
    public static void method865(byte arg0) {
        field1604 = (int[][]) null;
        field1620 = null;
        field1602 = null;
        field1603 = null;
        if (arg0 > -91) {
            method865((byte) 34);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILcg;I)V", line = 24)
    public final void method866(int arg0, class316 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method2219(16448);
            if (var4 == 0) {
                if (arg0 <= 6) {
                    return;
                }
                field1612++;
                return;
            }
            this.method868(arg2, arg1, var4, 0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILkm;I)[Lpn;", line = 47)
    public static final class170[] method867(int arg0, int arg1, class133 arg2, int arg3) {
        field1617++;
        if (arg0 == 128) {
            return class129.method931(arg1, arg3, arg2, (byte) 85) ? class206.method1460(64) : null;
        } else {
            return (class170[]) null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILcg;II)V", line = 63)
    private final void method868(int arg0, class316 arg1, int arg2, int arg3) {
        field1613++;
        if (arg3 != 0) {
            method867(-86, -91, (class133) null, 115);
        }
        if (arg2 == 1) {
            this.field1615 = arg1.method2210((byte) -5);
            this.method869(this.field1615, (byte) 21);
        } else if (arg2 == 2) {
            this.field1611 = arg1.method2220((byte) 90);
            if (this.field1611 == 65535) {
                this.field1611 = -1;
            }
        } else if (arg2 == 3) {
            this.field1622 = arg1.method2220((byte) 76);
        } else if (arg2 == 4) {
            this.field1621 = false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V", line = 108)
    private final void method869(int arg0, byte arg1) {
        field1619++;
        double var3 = (double) ((arg0 & 0xFF11) >> 8) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF6C7C) >> 16) / 256.0D;
        if (arg1 != 21) {
            this.method869(119, (byte) -79);
        }
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var5;
        if (var5 < var3) {
            var9 = var3;
        }
        if (var9 < var7) {
            var9 = var7;
        }
        double var11 = var5;
        if (var3 < var5) {
            var11 = var3;
        }
        if (var7 < var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var5 == var9) {
                var13 = (var3 - var7) / (var9 - var11);
            } else if (var3 == var9) {
                var13 = (var7 - var5) / (var9 - var11) + 2.0D;
            } else if (var7 == var9) {
                var13 = (var5 - var3) / (var9 - var11) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (2.0D - var9 - var11);
            }
        }
        this.field1605 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (var17 > 0.5D) {
            this.field1606 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1606 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1606 < 1) {
            this.field1606 = 1;
        }
        this.field1616 = (int) ((double) this.field1606 * var19);
        this.field1608 = (int) (var15 * 256.0D);
        if (this.field1605 < 0) {
            this.field1605 = 0;
        } else if (this.field1605 > 255) {
            this.field1605 = 255;
        }
        if (this.field1608 < 0) {
            this.field1608 = 0;
        } else if (this.field1608 > 255) {
            this.field1608 = 255;
        }
    }
}

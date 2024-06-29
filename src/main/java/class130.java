import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class130 {

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public int field1784 = 512;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    private int field1791 = 0;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "Z")
    public boolean field1783 = true;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public int field1797 = -1;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Z")
    public boolean field1788 = true;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "Z")
    public static boolean field1794 = false;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public int field1785;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public int field1786;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public int field1789;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public int field1793;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "Lou;")
    public static class630 field1795;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IILdt;)V")
    private final void method919(int arg0, int arg1, class254 arg2) {
        field1796++;
        if (arg0 != 21503) {
            this.method919(-12, -2, null);
        }
        if (arg1 == 1) {
            this.field1791 = arg2.method1722(false);
            this.method923((byte) 103, this.field1791);
        } else if (arg1 == 2) {
            this.field1797 = arg2.method1728((byte) 86);
            if (this.field1797 == 65535) {
                this.field1797 = -1;
                return;
            }
        } else {
            if (arg1 == 3) {
                this.field1784 = arg2.method1728((byte) 10) << 2;
            } else if (arg1 == 4) {
                this.field1783 = false;
                return;
            } else if (arg1 == 5) {
                this.field1788 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static void method920(int arg0) {
        if (arg0 <= 43) {
            method922(-28L, (byte) -72);
        }
        field1795 = null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILdt;)V")
    public final void method921(int arg0, class254 arg1) {
        if (arg0 <= 94) {
            this.field1797 = -97;
        }
        field1792++;
        while (true) {
            int var3 = arg1.method1731((byte) 64);
            if (var3 == 0) {
                return;
            }
            this.method919(21503, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(JB)I")
    public static final int method922(long arg0, byte arg1) {
        field1790++;
        class215.method1391(false, arg0);
        if (arg1 != 98) {
            field1787 = -52;
        }
        return class79.field1085.get(1);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)V")
    private final void method923(byte arg0, int arg1) {
        field1798++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (arg0 != 103) {
            this.method923((byte) -5, -52);
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
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
        this.field1785 = (int) (var15 * 256.0D);
        this.field1786 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field1785 < 0) {
            this.field1785 = 0;
        } else if (this.field1785 > 255) {
            this.field1785 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field1793 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1793 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1786 < 0) {
            this.field1786 = 0;
        } else if (this.field1786 > 255) {
            this.field1786 = 255;
        }
        if (this.field1793 < 1) {
            this.field1793 = 1;
        }
        this.field1789 = (int) ((double) this.field1793 * var19);
    }
}

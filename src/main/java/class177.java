import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class177 {

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public int field2819 = 512;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Z")
    public boolean field2820 = true;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public int field2828 = -1;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    private int field2827 = 0;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Z")
    public boolean field2822 = true;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Leda;")
    public static class116 field2815 = new class116(113, 4);

    @OriginalMember(owner = "client!b", name = "j", descriptor = "J")
    public static long field2824 = 0L;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Lvh;")
    public static class125 field2816 = new class125(40, 16);

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public int field2826;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Lvo;")
    public static class345 field2831;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILd;)I", line = 4)
    public static final int method1290(int arg0, class88 arg1) {
        field2825++;
        class528 var2 = arg1.field1309;
        if (var2.field7758 != null) {
            var2 = var2.method3110(class230.field3404, false);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field7778;
        if (arg0 != -14715) {
            field2815 = null;
        }
        class674 var4 = arg1.method1093(true);
        if (arg1.field2425 == -1 || arg1.field2353) {
            var3 = var2.field7753;
        } else if (arg1.field2425 == var4.field9572 || arg1.field2425 == var4.field9590 || arg1.field2425 == var4.field9609 || arg1.field2425 == var4.field9598) {
            var3 = var2.field7766;
        } else if (arg1.field2425 == var4.field9563 || arg1.field2425 == var4.field9570 || arg1.field2425 == var4.field9607 || arg1.field2425 == var4.field9578) {
            var3 = var2.field7777;
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lek;Z)V", line = 43)
    public final void method1291(class465 arg0, boolean arg1) {
        field2830++;
        while (true) {
            int var3 = arg0.method2705(-42);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    method1290(-34, null);
                    return;
                }
            }
            this.method1294(arg0, var3, 99);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)V", line = 78)
    private final void method1292(byte arg0, int arg1) {
        field2821++;
        double var3 = (double) ((arg1 & 0xFF7687) >> 16) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
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
        this.field2823 = (int) (var17 * 256.0D);
        this.field2826 = (int) (var15 * 256.0D);
        if (var17 > 0.5D) {
            this.field2829 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2829 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2826 < 0) {
            this.field2826 = 0;
        } else if (this.field2826 > 255) {
            this.field2826 = 255;
        }
        if (this.field2823 < 0) {
            this.field2823 = 0;
        } else if (this.field2823 > 255) {
            this.field2823 = 255;
        }
        if (this.field2829 < 1) {
            this.field2829 = 1;
        }
        int var21 = 90 % ((arg0 - 62) / 61);
        this.field2817 = (int) ((double) this.field2829 * var19);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 172)
    public static void method1293(int arg0) {
        field2815 = null;
        if (arg0 == -1) {
            field2831 = null;
            field2816 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lek;II)V", line = 185)
    private final void method1294(class465 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2827 = arg0.method2714(true);
            this.method1292((byte) 125, this.field2827);
        } else if (arg1 == 2) {
            this.field2828 = arg0.method2755((byte) -73);
            if (this.field2828 == 65535) {
                this.field2828 = -1;
            }
        } else if (arg1 == 3) {
            this.field2819 = arg0.method2755((byte) -93) << 2;
        } else if (arg1 == 4) {
            this.field2822 = false;
        } else if (arg1 == 5) {
            this.field2820 = false;
        }
        field2818++;
        if (arg2 <= 74) {
            this.field2819 = 5;
        }
    }
}

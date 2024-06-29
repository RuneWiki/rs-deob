import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class570 {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field7815 = new String[0];

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Z")
    private boolean field7816 = false;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    private int field7825 = -1;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    private int field7823;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZJ)V")
    public static final void method3293(boolean arg0, long arg1) {
        class532.field7497.setTime(new Date(arg1));
        if (!arg0) {
            method3293(false, 63L);
        }
        field7819++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
    private final void method3294(int arg0, int arg1) {
        field7814++;
        String[] var3 = new String[this.method3297(13448, arg1)];
        if (arg0 == -1) {
            class211.method1335(this.field7815, 0, var3, 0, this.field7815.length);
            this.field7815 = var3;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)[Ljava/lang/String;")
    public final String[] method3295(byte arg0) {
        field7822++;
        String[] var2 = new String[this.field7825 + 1];
        int var3 = 22 / ((58 - arg0) / 40);
        class211.method1335(this.field7815, 0, var2, 0, this.field7825 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    private final void method3296(String arg0, int arg1, byte arg2) {
        if (this.field7825 < arg1) {
            this.field7825 = arg1;
        }
        field7821++;
        int var4 = 8 % ((-arg2 - 16) / 61);
        if (arg1 >= this.field7815.length) {
            this.method3294(-1, arg1);
        }
        this.field7815[arg1] = arg0;
    }

    @OriginalMember(owner = "client!md", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7826++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field7825; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field7815[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)I")
    private final int method3297(int arg0, int arg1) {
        field7813++;
        int var3 = this.field7815.length;
        if (arg0 != 13448) {
            this.method3294(26, -2);
        }
        while (arg1 >= var3) {
            if (!this.field7816) {
                var3 += this.field7823;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field7823 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(II)V")
    public static final void method3298(int arg0, int arg1) {
        if (arg1 >= 118) {
            class755.field10464 = arg0;
            field7818++;
            class502.field7098.method1690(0);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method3299(int arg0, String arg1) {
        this.method3296(arg1, this.field7825 + arg0, (byte) -119);
        field7820++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static final void method3300(int arg0) {
        field7817++;
        if (class437.field5749 != null) {
            return;
        }
        class437.field5749 = new int[65536];
        int var1 = 36 % ((arg0 + 50) / 54);
        double var2 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var4 = 0; var4 < 65536; var4++) {
            double var5 = (double) (var4 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var7 = (double) (var4 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var9 = (double) (var4 & 0x7F) / 128.0D;
            double var11 = var9;
            double var13 = var9;
            double var15 = var9;
            if (var7 != 0.0D) {
                double var17;
                if (var9 < 0.5D) {
                    var17 = (var7 + 1.0D) * var9;
                } else {
                    var17 = var7 + var9 - var7 * var9;
                }
                double var19 = var9 * 2.0D - var17;
                double var21 = var5 + 0.3333333333333333D;
                if (var21 > 1.0D) {
                    var21--;
                }
                double var25 = var5 - 0.3333333333333333D;
                if ((var21 * 6.0D < 1.0D)) {
                    var11 = (var17 - var19) * 6.0D * var21 + var19;
                } else if (var21 * 2.0D < 1.0D) {
                    var11 = var17;
                } else if ((var21 * 3.0D < 2.0D)) {
                    var11 = (0.6666666666666666D - var21) * (var17 - var19) * 6.0D + var19;
                } else {
                    var11 = var19;
                }
                if (var25 < 0.0D) {
                    var25++;
                }
                if ((var5 * 6.0D < 1.0D)) {
                    var13 = (var17 - var19) * 6.0D * var5 + var19;
                } else if ((var5 * 2.0D < 1.0D)) {
                    var13 = var17;
                } else if ((var5 * 3.0D < 2.0D)) {
                    var13 = (0.6666666666666666D - var5) * (var17 - var19) * 6.0D + var19;
                } else {
                    var13 = var19;
                }
                if (var25 * 6.0D < 1.0D) {
                    var15 = (var17 - var19) * 6.0D * var25 + var19;
                } else if (var25 * 2.0D < 1.0D) {
                    var15 = var17;
                } else if (var25 * 3.0D < 2.0D) {
                    var15 = (var17 - var19) * (0.6666666666666666D - var25) * 6.0D + var19;
                } else {
                    var15 = var19;
                }
            }
            double var27 = Math.pow(var11, var2);
            double var29 = Math.pow(var13, var2);
            double var31 = Math.pow(var15, var2);
            int var33 = (int) (var27 * 256.0D);
            int var34 = (int) (var29 * 256.0D);
            int var35 = (int) (var31 * 256.0D);
            int var36 = (var33 << 16) + (var34 << 8) + var35;
            class437.field5749[var4] = var36;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(IZ)V")
    public class570(int arg0, boolean arg1) {
        this.field7816 = arg1;
        this.field7823 = arg0;
    }
}

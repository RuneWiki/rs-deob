import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class124 extends class144 {

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    private int field1777 = 3216;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
    private int field1780 = 3216;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    private int field1781 = 4096;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "[I")
    private int[] field1787 = new int[3];

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "Lrc;")
    public static class9 field1785 = new class9(5);

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1789 = "glow1:";

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "[I")
    public static int[] field1786 = new int[25];

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "[I")
    public static int[] field1788 = new int[100];

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "[[[I")
    public static int[][][] field1791;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        ++field1784;
        if (arg1 != 255) {
            return null;
        } else {
            int[] var3 = super.field2069.method425(true, arg0);
            if (super.field2069.field820) {
                int var4 = class71.field836 * this.field1781 >> 12;
                int[] var5 = this.method934(-18877, 0, arg0 + -1 & class166.field2391);
                int[] var6 = this.method934(arg1 ^ -18756, 0, arg0);
                int[] var7 = this.method934(-18877, 0, arg0 + 1 & class166.field2391);
                for (int var8 = 0; ~var8 > ~class104.field1411; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[class112.field1487 & var8 + -1] + -var6[var8 + 1 & class112.field1487]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    int var12 = var9 >> 4;
                    if (var11 > 255) {
                        var11 = 255;
                    }
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = 255 & class1.field12[((var12 + 1) * var12 >> 1) + var11];
                    int var14 = var13 * 4096 >> 8;
                    int var15 = var9 * var13 >> 8;
                    int var16 = var10 * var13 >> 8;
                    int var17 = this.field1787[2] * var14 >> 12;
                    int var18 = this.field1787[1] * var15 >> 12;
                    int var19 = this.field1787[0] * var16 >> 12;
                    var3[var8] = var19 - (-var18 - var17);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static void method808(boolean arg0) {
        field1786 = null;
        if (!arg0) {
            field1785 = null;
        }
        field1788 = null;
        field1785 = null;
        field1789 = null;
        field1791 = null;
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(B)V")
    public final void method31(byte arg0) {
        ++field1779;
        if (arg0 >= -109) {
            field1789 = null;
        }
        this.method809((byte) 118);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class124() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field1777 = arg1.method1380(true);
                }
            } else {
                this.field1780 = arg1.method1380(true);
            }
        } else {
            this.field1781 = arg1.method1380(true);
        }
        ++field1790;
        if (arg2 != 20630) {
            method811(-106, -86, 14, -61, -110, 16, -26);
        }
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(B)V")
    private final void method809(byte arg0) {
        ++field1783;
        double var2 = Math.cos((double) ((float) this.field1777 / 4096.0F));
        this.field1787[0] = (int) (4096.0D * Math.sin((double) ((float) this.field1780 / 4096.0F)) * var2);
        this.field1787[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field1780 / 4096.0F)));
        this.field1787[2] = (int) (4096.0D * Math.sin((double) ((float) this.field1777 / 4096.0F)));
        int var4 = this.field1787[1] * this.field1787[1] >> 12;
        int var5 = this.field1787[2] * this.field1787[2] >> 12;
        int var6 = this.field1787[0] * this.field1787[0] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field1787[1] = (this.field1787[1] << 12) / var7;
            this.field1787[2] = (this.field1787[2] << 12) / var7;
            this.field1787[0] = (this.field1787[0] << 12) / var7;
        }
        if (arg0 <= 107) {
            field1788 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)I")
    public static final int method810(int arg0, int arg1) {
        if (arg0 != 1) {
            method808(true);
        }
        ++field1778;
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1782;
        int var7 = arg4 & 3;
        if (~(arg2 & 1) == -2) {
            int var8 = arg0;
            arg0 = arg5;
            arg5 = var8;
        }
        if (arg3 != -852666079) {
            field1786 = null;
        }
        if (~var7 == -1) {
            return arg1;
        } else if (var7 == 1) {
            return arg6;
        } else {
            return ~var7 == -3 ? -arg0 + 1 + 7 + -arg1 : -arg5 + 1 + 7 - arg6;
        }
    }
}

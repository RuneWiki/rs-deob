import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class290 {

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "Z")
    public boolean field3938 = true;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public int field3941 = -1;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    private int field3932 = 0;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
    public int field3942 = 128;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "[I")
    public static int[] field3944 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public int field3930;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public int field3933;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public int field3935;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V", line = 8)
    private final void method1779(int arg0, int arg1) {
        field3937++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & arg1) >> 8) / 256.0D;
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
        this.field3930 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field3940 = (int) (var15 * 256.0D);
        if (var17 > 0.5D) {
            this.field3933 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3933 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3940 < 0) {
            this.field3940 = 0;
        } else if (this.field3940 > 255) {
            this.field3940 = 255;
        }
        if (this.field3930 < 0) {
            this.field3930 = 0;
        } else if (this.field3930 > 255) {
            this.field3930 = 255;
        }
        if (this.field3933 < 1) {
            this.field3933 = 1;
        }
        this.field3935 = (int) ((double) this.field3933 * var19);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIIIII)V", line = 95)
    public static final void method1780(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 >= class80.field1119 && arg5 <= class430.field6003 && class80.field1119 <= arg6 && class430.field6003 >= arg6 && arg3 >= class80.field1119 && class430.field6003 >= arg3 && class80.field1119 <= arg2 && class430.field6003 >= arg2 && arg8 >= class143.field2090 && arg8 <= class42.field543 && class143.field2090 <= arg0 && arg0 <= class42.field543 && class143.field2090 <= arg9 && class42.field543 >= arg9 && arg4 >= class143.field2090 && arg4 <= class42.field543) {
            class193.method1342(arg4, arg3, arg2, -10533, arg6, arg0, arg8, arg5, arg7, arg9);
        } else {
            class336.method2043(arg5, arg0, arg2, arg8, (byte) 14, arg4, arg3, arg7, arg6, arg9);
        }
        field3936++;
        int var10 = -119 % ((arg1 + 78) / 45);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IILrg;)V", line = 114)
    public final void method1781(int arg0, int arg1, class366 arg2) {
        if (arg0 != -1) {
            method1784(-51);
        }
        while (true) {
            int var4 = arg2.method2306((byte) 41);
            if (var4 == 0) {
                field3931++;
                return;
            }
            this.method1782(arg1, arg2, -1011470384, var4);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILrg;II)V", line = 136)
    private final void method1782(int arg0, class366 arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field3932 = arg1.method2263((byte) 10);
            this.method1779(arg2 ^ 0xC3B6D063, this.field3932);
        } else if (arg3 == 2) {
            this.field3941 = arg1.method2297(arg2 ^ 0xC3B61BF8);
            if (this.field3941 == 65535) {
                this.field3941 = -1;
            }
        } else if (arg3 == 3) {
            this.field3942 = arg1.method2297(13352);
        } else if (arg3 == 4) {
            this.field3938 = false;
        }
        if (arg2 != -1011470384) {
            this.field3932 = -16;
        }
        field3943++;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lij;I)V", line = 173)
    public static final void method1783(class316 arg0, int arg1) {
        class95.field1311 = arg0;
        field3934++;
        if (arg1 != -3) {
            field3944 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 186)
    public static void method1784(int arg0) {
        if (arg0 > 68) {
            field3944 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class504 {

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Z")
    private boolean field7027 = true;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    private int field7038 = -1;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    private int field7040;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    private int field7023;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    private int field7025;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    private int field7026;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "[Luu;")
    private class259[] field7037;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "[Luu;")
    private class259[] field7024;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Luu;")
    private class259 field7029;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[I")
    public static int[] field7022 = new int[8];

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Ln;")
    public static class17 field7030 = null;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Z")
    public static boolean field7033 = false;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    private int field7020;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    private int field7032;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Lvp;")
    public static class171 field7034;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lf;")
    private class701 field7021;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "Lf;")
    public static class701 field7035;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "[[[Z")
    public static boolean[][][] field7036;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBLr;)Z")
    public final boolean method2918(int arg0, byte arg1, class165 arg2) {
        if (this.field7038 != arg0) {
            this.field7038 = arg0;
            int var4 = class13.method143(arg0, 87);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field7020 != var4) {
                this.field7020 = var4;
                this.field7021 = null;
            }
            if (this.field7037 != null) {
                this.field7032 = 0;
                int[] var5 = new int[this.field7037.length];
                for (int var6 = 0; var6 < this.field7037.length; var6++) {
                    class259 var7 = this.field7037[var6];
                    if (var7.method1582(this.field7040, this.field7026, this.field7023, this.field7038)) {
                        var5[this.field7032] = var7.field3557;
                        this.field7024[this.field7032++] = var7;
                    }
                }
                class184.method1146(0, this.field7024, this.field7032 - 1, var5, (byte) -107);
            }
            this.field7027 = true;
        }
        field7028++;
        if (arg1 >= -73) {
            this.method2921((byte) -93);
        }
        boolean var8 = false;
        if (this.field7027) {
            this.field7027 = false;
            for (int var9 = this.field7032 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field7024[var9].method1579(arg2, this.field7029);
                var8 |= var10;
                this.field7027 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILr;IIIIII)V")
    public final void method2919(int arg0, int arg1, int arg2, class165 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7031++;
        int var11 = arg2 + arg6 & 0x3FFF;
        if (arg0 != -22269) {
            field7034 = null;
        }
        if (this.field7025 == -1) {
            arg3.method248(arg4, arg7, arg8, arg1, arg5, 0);
        } else {
            class352 var12 = class490.field6845.method397(this.field7025, (byte) -128);
            if (this.field7021 == null && class490.field6845.method395(this.field7025, arg0 ^ 0xFFFFC6A3)) {
                int[] var13 = var12.field4712 ? class490.field6845.method392(false, this.field7020, this.field7025, this.field7020, 123, 0.7F) : class490.field6845.method400(this.field7020, false, this.field7020, (byte) -73, this.field7025, 0.7F);
                this.field7021 = arg3.method311(var13, 0, this.field7020, this.field7020, this.field7020);
            }
            if (var12.field4712) {
                arg3.method248(arg4, arg7, arg8, arg1, arg5, 0);
            }
            if (this.field7021 != null) {
                int var14 = var12.field4712 ? 1 : 0;
                int var15 = arg1 * arg9 / -4096;
                int var16;
                for (var16 = arg1 * var11 / 4096 + (arg8 - arg1) / 2; var16 > arg1; var16 -= arg1) {
                }
                while (var16 < 0) {
                    var16 += arg1;
                }
                while (var15 > arg1) {
                    var15 -= arg1;
                }
                while (var15 < 0) {
                    var15 += arg1;
                }
                for (int var17 = var16 - arg1; var17 < arg8; var17 += arg1) {
                    for (int var18 = var15 - arg1; var18 < arg1; var18 += arg1) {
                        this.field7021.method3932(arg4 + var17, arg7 + var18, arg1, arg1, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field7032 - 1; var19 >= 0; var19--) {
            this.field7024[var19].method1573(arg3, arg4, arg7, arg8, arg1, arg9, var11);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method2920(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field7034 = null;
        field7035 = null;
        field7036 = null;
        field7030 = null;
        field7022 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public final void method2921(byte arg0) {
        if (arg0 >= -80) {
            this.method2918(76, (byte) -70, null);
        }
        field7039++;
        if (this.field7037 != null) {
            for (int var2 = 0; var2 < this.field7037.length; var2++) {
                this.field7037[var2].method1576();
            }
        }
        this.field7021 = null;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I[Luu;IIII)V")
    public class504(int arg0, class259[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7040 = arg3;
        this.field7023 = arg5;
        this.field7025 = arg0;
        this.field7026 = arg4;
        this.field7037 = arg1;
        if (arg1 == null) {
            this.field7024 = null;
            this.field7029 = null;
        } else {
            this.field7024 = new class259[arg1.length];
            this.field7029 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}

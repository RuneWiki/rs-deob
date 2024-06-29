import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class257 {

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    private int field3561 = -1;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Z")
    private boolean field3567 = true;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    private int field3571;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "[Lal;")
    private class83[] field3565;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    private int field3560;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    private int field3569;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    private int field3563;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "[Lal;")
    private class83[] field3564;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lal;")
    private class83 field3556;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Ldm;")
    public static class46 field3568 = new class46();

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field3572 = 0;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    private int field3558;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    private int field3559;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lha;")
    private class52 field3555;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "[Lha;")
    public static class52[] field3566;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILqa;)Z")
    public final boolean method1651(int arg0, int arg1, class207 arg2) {
        field3570++;
        if (this.field3561 != arg1) {
            this.field3561 = arg1;
            int var4 = class327.method2020(-1594581311, arg1);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field3558 != var4) {
                this.field3555 = null;
                this.field3558 = var4;
            }
            if (this.field3565 != null) {
                this.field3559 = 0;
                int[] var5 = new int[this.field3565.length];
                for (int var6 = 0; var6 < this.field3565.length; var6++) {
                    class83 var7 = this.field3565[var6];
                    if (var7.method633(this.field3563, this.field3571, this.field3569, this.field3561)) {
                        var5[this.field3559] = var7.field1358;
                        this.field3564[this.field3559++] = var7;
                    }
                }
                class160.method1025(this.field3564, var5, 0, this.field3559 - 1, (byte) 67);
            }
            this.field3567 = true;
        }
        if (arg0 != 0) {
            this.field3565 = null;
        }
        boolean var8 = false;
        if (this.field3567) {
            this.field3567 = false;
            for (int var9 = this.field3559 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field3564[var9].method629(arg2, this.field3556);
                this.field3567 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public final void method1652(int arg0) {
        if (this.field3565 != null) {
            for (int var2 = 0; var2 < this.field3565.length; var2++) {
                this.field3565[var2].method632();
            }
        }
        if (arg0 == -10423) {
            field3554++;
            this.field3555 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method1653(byte arg0) {
        field3568 = null;
        field3566 = null;
        if (arg0 > -63) {
            field3572 = 100;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIILqa;I)V")
    public final void method1654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class207 arg8, int arg9) {
        field3562++;
        if (arg0 != -1) {
            return;
        }
        int var11 = arg4 + arg9 & 0x3FFF;
        if (this.field3560 == -1) {
            arg8.method1321(arg1, arg5, arg6, arg3, arg7, 0);
        } else {
            class211 var12 = class58.field1057.method190((byte) -89, this.field3560);
            if (this.field3555 == null && class58.field1057.method188(this.field3560, -108)) {
                int[] var13 = var12.field2970 ? class58.field1057.method185(false, 0.7F, this.field3558, this.field3560, this.field3558, (byte) 49) : class58.field1057.method186(false, this.field3560, 10350, this.field3558, this.field3558, 0.7F);
                this.field3555 = arg8.method1363(var13, 0, this.field3558, this.field3558, this.field3558);
            }
            if (var12.field2970) {
                arg8.method1321(arg1, arg5, arg6, arg3, arg7, 0);
            }
            if (this.field3555 != null) {
                int var14 = var12.field2970 ? 1 : 0;
                int var15 = arg2 * arg3 / -4096;
                int var16;
                for (var16 = (arg6 - arg3) / 2 + (arg3 * var11 / 4096); var16 > arg3; var16 -= arg3) {
                }
                while (var16 < 0) {
                    var16 += arg3;
                }
                while (var15 > arg3) {
                    var15 -= arg3;
                }
                while (var15 < 0) {
                    var15 += arg3;
                }
                for (int var17 = var16 - arg3; var17 < arg6; var17 += arg3) {
                    for (int var18 = var15 - arg3; var18 < arg3; var18 += arg3) {
                        this.field3555.method423(arg1 + var17, var18 - -arg5, arg3, arg3, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field3559 - 1; var19 >= 0; var19--) {
            this.field3564[var19].method634(arg8, arg1, arg5, arg6, arg3, arg2, var11);
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I[Lal;IIII)V")
    public class257(int arg0, class83[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3571 = arg4;
        this.field3565 = arg1;
        this.field3560 = arg0;
        this.field3569 = arg5;
        this.field3563 = arg3;
        if (arg1 == null) {
            this.field3564 = null;
            this.field3556 = null;
        } else {
            this.field3564 = new class83[arg1.length];
            this.field3556 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}

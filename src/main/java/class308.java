import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class308 {

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    private int field4525 = -1;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "Z")
    private boolean field4532 = true;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    private int field4529;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "[Lrk;")
    private class29[] field4522;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    private int field4533;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    private int field4518;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    private int field4519;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "[Lrk;")
    private class29[] field4531;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "Lrk;")
    private class29 field4534;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "Lea;")
    public static class474 field4527 = new class474("Loaded SW3D", "SW3D geladen", "SW3D chargé", "SW3D carregado");

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    private int field4524;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    private int field4526;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lxa;")
    private class433 field4520;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILoa;Z)Z", line = 6)
    public final boolean method2041(int arg0, class605 arg1, boolean arg2) {
        field4530++;
        if (this.field4525 != arg0) {
            this.field4525 = arg0;
            int var4 = class309.method2052(true, arg0);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field4526 != var4) {
                this.field4526 = var4;
                this.field4520 = null;
            }
            if (this.field4522 != null) {
                this.field4524 = 0;
                int[] var5 = new int[this.field4522.length];
                for (int var6 = 0; var6 < this.field4522.length; var6++) {
                    class29 var7 = this.field4522[var6];
                    if (var7.method171(this.field4533, this.field4518, this.field4529, this.field4525)) {
                        var5[this.field4524] = var7.field336;
                        this.field4531[this.field4524++] = var7;
                    }
                }
                class438.method2729(this.field4524 - 1, 0, this.field4531, var5, 118);
            }
            this.field4532 = true;
        }
        if (!arg2) {
            this.field4522 = null;
        }
        boolean var8 = false;
        if (this.field4532) {
            this.field4532 = false;
            for (int var9 = this.field4524 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field4531[var9].method172(arg1, this.field4534);
                this.field4532 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 89)
    public static void method2042(int arg0) {
        if (arg0 != -25128) {
            field4527 = null;
        }
        field4527 = null;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(I[Lrk;IIII)V", line = 245)
    public class308(int arg0, class29[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4529 = arg5;
        this.field4522 = arg1;
        this.field4533 = arg3;
        this.field4518 = arg4;
        this.field4519 = arg0;
        if (arg1 == null) {
            this.field4531 = null;
            this.field4534 = null;
        } else {
            this.field4531 = new class29[arg1.length];
            this.field4534 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 103)
    public final void method2043(byte arg0) {
        field4517++;
        if (this.field4522 != null) {
            for (int var2 = 0; var2 < this.field4522.length; var2++) {
                this.field4522[var2].method174();
            }
        }
        if (arg0 == 102) {
            this.field4520 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lkca;I)V", line = 131)
    public static final void method2044(class73 arg0, int arg1) {
        if (arg1 != -7434) {
            method2045(119, 100, -71, 0, 14);
        }
        class468.field6960.method3677(-126, arg0.method487((byte) 121));
        field4523++;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIII)I", line = 149)
    public static final int method2045(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            field4527 = null;
        }
        field4528++;
        int var5 = 65536 - class605.field8858[arg0 * 8192 / arg2] >> 1;
        return ((65536 - var5) * arg4 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIIILoa;II)V", line = 167)
    public final void method2046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class605 arg7, int arg8, int arg9) {
        int var11 = arg3 + arg9 & 0x3FFF;
        field4521++;
        if (arg8 != 0) {
            return;
        }
        if (this.field4519 == -1) {
            arg7.method394(arg1, arg2, arg0, arg5, arg6, 0);
        } else {
            class614 var12 = class198.field2676.method438(47, this.field4519);
            if (this.field4520 == null && class198.field2676.method436(this.field4519, -5686)) {
                int[] var13 = var12.field8943 ? class198.field2676.method433(51, false, this.field4526, this.field4519, this.field4526, 0.7F) : class198.field2676.method432(this.field4526, 0.7F, this.field4519, this.field4526, -18170, false);
                this.field4520 = arg7.method343(var13, 0, this.field4526, this.field4526, this.field4526);
            }
            if (var12.field8943) {
                arg7.method394(arg1, arg2, arg0, arg5, arg6, 0);
            }
            if (this.field4520 != null) {
                int var14 = var12.field8943 ? 1 : 0;
                int var15 = arg4 * arg5 / -4096;
                int var16;
                for (var16 = (arg0 - arg5) / 2 + (arg5 * var11 / 4096); var16 > arg5; var16 -= arg5) {
                }
                while (var16 < 0) {
                    var16 += arg5;
                }
                while (var15 > arg5) {
                    var15 -= arg5;
                }
                while (var15 < 0) {
                    var15 += arg5;
                }
                for (int var17 = var16 - arg5; var17 < arg0; var17 += arg5) {
                    for (int var18 = var15 - arg5; var18 < arg5; var18 += arg5) {
                        this.field4520.method1582(arg1 + var17, arg2 + var18, arg5, arg5, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field4524 - 1; var19 >= 0; var19--) {
            this.field4531[var19].method179(arg7, arg1, arg2, arg0, arg5, arg4, var11);
        }
    }
}

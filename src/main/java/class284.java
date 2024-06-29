import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class284 extends class112 {

    @OriginalMember(owner = "client!c", name = "z", descriptor = "Z")
    public boolean field4511 = false;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "Lmf;")
    public class28 field4514;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "Z")
    private boolean field4519;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "Z")
    private boolean field4515;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    private int field4516;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    private int field4512;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "F")
    private float field4517;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    private int field4518;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "[I")
    private int[] field4513;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "[I")
    public static int[] field4520;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()V")
    public static void method1905() {
        field4520 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lwi;Lsb;FZ)[I")
    public final int[] method1906(class231 arg0, class124 arg1, float arg2, boolean arg3) {
        if (this.field4513 == null || this.field4517 != arg2) {
            if (!this.field4514.method252(arg1, (byte) 88, arg0)) {
                return null;
            }
            this.field4518 = arg3 ? 64 : 128;
            this.field4513 = this.field4514.method247(true, arg1, -256, this.field4515, this.field4518, this.field4518, (double) arg2, arg0);
            this.field4517 = arg2;
            if (this.field4519) {
                int[] var5 = new int[this.field4518];
                int[] var6 = new int[this.field4518];
                int[] var7 = new int[this.field4518];
                int[] var8 = new int[this.field4518 * this.field4518];
                int var9 = this.field4518;
                int var10 = this.field4518;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field4513[var14];
                        var5[var32] += var33 >> 16 & 0xFF;
                        var6[var32] += var33 >> 8 & 0xFF;
                        var7[var32] += var33 & 0xFF;
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                }
                int var17 = var13;
                for (int var18 = var12; var18 >= 0; var18--) {
                    int var19 = 1;
                    int var20 = 1;
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    for (int var24 = 2; var24 >= 0; var24--) {
                        var20--;
                        var23 += var5[var20];
                        var21 += var6[var20];
                        var22 += var7[var20];
                        if (var20 == 0) {
                            var20 = var9;
                        }
                    }
                    for (int var25 = var11; var25 >= 0; var25--) {
                        var20--;
                        var19--;
                        int var29 = var23 / 9;
                        int var30 = var21 / 9;
                        int var31 = var22 / 9;
                        var17--;
                        var8[var17] = var29 << 16 | var30 << 8 | var31;
                        var23 += var5[var20] - var5[var19];
                        var22 += var7[var20] - var7[var19];
                        var21 += var6[var20] - var6[var19];
                        if (var20 == 0) {
                            var20 = var9;
                        }
                        if (var19 == 0) {
                            var19 = var9;
                        }
                    }
                    for (int var26 = var11; var26 >= 0; var26--) {
                        var14--;
                        int var27 = this.field4513[var14];
                        var15--;
                        int var28 = this.field4513[var15];
                        var5[var26] += (var27 >> 16 & 0xFF) - (var28 >> 16 & 0xFF);
                        var6[var26] += (var27 >> 8 & 0xFF) - (var28 >> 8 & 0xFF);
                        var7[var26] += (var27 & 0xFF) - (var28 & 0xFF);
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                    if (var15 == 0) {
                        var15 = var13;
                    }
                }
                this.field4513 = var8;
            }
        }
        return this.field4513;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lwi;Lsb;)Z")
    public final boolean method1907(class231 arg0, class124 arg1) {
        return this.field4514.method252(arg1, (byte) 88, arg0);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public final void method1908(int arg0) {
        if (this.field4513 == null || this.field4512 == 0 && this.field4516 == 0) {
            return;
        }
        if (field4520 == null || field4520.length < this.field4513.length) {
            field4520 = new int[this.field4513.length];
        }
        int var2 = this.field4513.length;
        int var3 = this.field4516 * arg0;
        int var4 = this.field4518 - 1;
        int var5 = this.field4518 * arg0 * this.field4512;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field4518) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field4518; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field4520[var11] = this.field4513[var12];
            }
        }
        int[] var8 = this.field4513;
        this.field4513 = field4520;
        field4520 = var8;
    }

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lig;)V")
    public class284(class136 arg0) {
        this.field4514 = new class28(arg0);
        this.field4519 = arg0.method1012(4) == 1;
        this.field4515 = arg0.method1012(4) == 1;
        arg0.method1012(4);
        arg0.method1012(4);
        int var2 = arg0.method1012(4) & 0x3;
        this.field4516 = arg0.method981(false);
        this.field4512 = arg0.method981(false);
        arg0.method1012(4);
        arg0.method1012(4);
        arg0.method1012(4);
    }
}

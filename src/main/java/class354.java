import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class354 extends class634 {

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "Z")
    private boolean field4541 = true;

    @OriginalMember(owner = "client!jp", name = "N", descriptor = "Z")
    private boolean field4546 = true;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!jp", name = "L", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!jp", name = "M", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!jp", name = "O", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "Ltp;")
    public static class532 field4540;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILig;Z)V", line = 8)
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        ++field4547;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field9121 = ~arg1.method1423(-97) == -2;
                }
            } else {
                this.field4546 = arg1.method1423(-120) == 1;
            }
        } else {
            this.field4541 = arg1.method1423(-68) == 1;
        }
        if (arg2) {
            field4540 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V", line = 133)
    public class354() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "(I)V", line = 62)
    public static void method2089(int arg0) {
        field4540 = null;
        if (arg0 != -93864889) {
            method2089(-125);
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(III)I", line = 72)
    public static final int method2090(int arg0, int arg1, int arg2) {
        ++field4539;
        int var3 = (arg0 & 127) * arg2 >> 7;
        if (var3 >= 2) {
            if (var3 > 126) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        if (arg1 > -2) {
            method2090(-13, -120, -70);
        }
        return (65408 & arg0) + var3;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(BI)[I", line = 94)
    public final int[] method13(byte arg0, int arg1) {
        ++field4545;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 > -55) {
            this.method3(119, (class244) null, false);
        }
        if (super.field9114.field3897) {
            int[] var4 = this.method3641(this.field4546 ? class312.field3870 - arg1 : arg1, 20604, 0);
            if (this.field4541) {
                for (int var5 = 0; var5 < class635.field9139; ++var5) {
                    var3[var5] = var4[-var5 + class110.field1162];
                }
            } else {
                class143.method891(var4, 0, var3, 0, class635.field9139);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)[[I", line = 136)
    public final int[][] method7(byte arg0, int arg1) {
        ++field4544;
        int var3 = -64 % ((-56 - arg0) / 53);
        int[][] var4 = super.field9126.method132(0, arg1);
        if (super.field9126.field295) {
            int[][] var5 = this.method3642(0, !this.field4546 ? arg1 : class312.field3870 - arg1, true);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (this.field4541) {
                for (int var12 = 0; var12 < class635.field9139; ++var12) {
                    var9[var12] = var6[class110.field1162 - var12];
                    var10[var12] = var7[-var12 + class110.field1162];
                    var11[var12] = var8[-var12 + class110.field1162];
                }
            } else {
                for (int var13 = 0; ~var13 > ~class635.field9139; ++var13) {
                    var9[var13] = var6[var13];
                    var10[var13] = var7[var13];
                    var11[var13] = var8[var13];
                }
            }
        }
        return var4;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class509 extends class748 {

    @OriginalMember(owner = "client!vq", name = "H", descriptor = "I")
    private int field7096 = 0;

    @OriginalMember(owner = "client!vq", name = "Q", descriptor = "I")
    private int field7105 = 1365;

    @OriginalMember(owner = "client!vq", name = "J", descriptor = "I")
    private int field7098 = 20;

    @OriginalMember(owner = "client!vq", name = "P", descriptor = "I")
    private int field7104 = 0;

    @OriginalMember(owner = "client!vq", name = "I", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!vq", name = "K", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!vq", name = "L", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!vq", name = "M", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!vq", name = "N", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!vq", name = "O", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!vq", name = "R", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IZII[BII[BI)V")
    public static final void method3039(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        ++field7103;
        int var9 = -(arg2 >> 2);
        int var10 = -(3 & arg2);
        int var11 = -arg5;
        if (arg1) {
            field7101 = 0;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; ~var12 > -1; ++var12) {
                var10001 = arg6++;
                arg4[var10001] = (byte) (arg4[var10001] + -arg7[arg3++]);
                int var14 = arg6++;
                arg4[var14] = (byte) (arg4[var14] + -arg7[arg3++]);
                int var15 = arg6++;
                arg4[var15] = (byte) (arg4[var15] + -arg7[arg3++]);
                int var16 = arg6++;
                arg4[var16] = (byte) (arg4[var16] + -arg7[arg3++]);
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg6++;
                arg4[var10001] = (byte) (arg4[var10001] + -arg7[arg3++]);
            }
            arg6 += arg0;
            arg3 += arg8;
            ++var11;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field7097;
        if (arg1 != 255) {
            return null;
        } else {
            int[] var3 = super.field10407.method3873(0, arg0);
            if (super.field10407.field9527) {
                for (int var4 = 0; class424.field5889 > var4; ++var4) {
                    int var5 = (class237.field3298[var4] << 12) / this.field7105 + this.field7096;
                    int var6 = (class370.field4727[arg0] << 12) / this.field7105 + this.field7104;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (var11 + var12 < 16384 && ~var13 > ~this.field7098) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = -var12 + var11 + var7;
                        ++var13;
                        var11 = var9 * var9 >> 12;
                        var12 = var10 * var10 >> 12;
                    }
                    var3[var4] = this.field7098 - 1 <= var13 ? 0 : (var13 << 12) / this.field7098;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field7100;
        if (arg1) {
            this.method20(127, true, (class26) null);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.field7104 = arg2.method193(2);
                    }
                } else {
                    this.field7096 = arg2.method193(2);
                }
            } else {
                this.field7098 = arg2.method193(2);
            }
        } else {
            this.field7105 = arg2.method193(2);
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
    public class509() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)V")
    public static final void method3040(boolean arg0) {
        ++field7102;
        int[] var1 = new int[class487.field6572.field7134];
        int var2 = 0;
        for (int var3 = 0; ~var3 > ~class487.field6572.field7134; ++var3) {
            class544 var5 = class487.field6572.method3054(var3, (byte) -99);
            if (~var5.field7627 <= -1 || ~var5.field7681 <= -1) {
                var1[var2++] = var3;
            }
        }
        class300.field3917 = new int[var2];
        if (arg0) {
            method3040(true);
        }
        for (int var4 = 0; var4 < var2; ++var4) {
            class300.field3917[var4] = var1[var4];
        }
    }
}

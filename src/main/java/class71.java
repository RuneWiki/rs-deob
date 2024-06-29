import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class416;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class71 extends class335 implements class579 {

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
    private int field756;

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
    private int field757;

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field754;

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "Z")
    public boolean field753;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "Z")
    public boolean field755;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIILkp;[BIBII)V", line = 4)
    public final void method469(int arg0, int arg1, int arg2, class421 arg3, byte[] arg4, int arg5, byte arg6, int arg7, int arg8) {
        if (this.field4807 != arg3 || class256.field3653 != this.field4805) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field4806.field5987;
        if (arg6 > -108) {
            this.method469(-89, -80, 76, null, null, 39, (byte) -109, 50, 41);
        }
        int var11 = this.field754.LockRect(0, arg5, arg1, arg2, arg8, 0, var10);
        if (!class416.method2641((byte) 48, var11)) {
            return;
        }
        int var12 = this.field4807.field6300 * arg0;
        int var13 = this.field4807.field6300 * arg2;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2635(arg4, arg7, 0, arg8 * var13);
        } else {
            for (int var15 = 0; var15 < arg8; var15++) {
                var10.method2635(arg4, var12 * var15 + arg7, var14 * var15, var13);
            }
        }
        this.field754.UnlockRect(0);
    }

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "(I)V", line = 46)
    public final void method152(int arg0) {
        if (arg0 != 24784) {
            this.field754 = null;
        }
        this.field4806.method2521(this, 22);
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lrca;Lkp;Lvt;II)V", line = 58)
    public class71(class391 arg0, class421 arg1, class256 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field4806.field5986) {
            this.field756 = arg4;
            this.field757 = arg3;
        } else {
            this.field757 = class367.method2354(-224121456, arg3);
            this.field756 = class367.method2354(-224121456, arg4);
        }
        this.field754 = this.field4806.field5990.method2624(arg3, arg4, 1, 0, class391.method2516(this.field4805, 9, this.field4807), 1);
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)I", line = 78)
    public final int method470(int arg0) {
        if (arg0 != 5742) {
            this.method475(-18);
        }
        return this.field757;
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lrca;IIZ[III)V", line = 87)
    public class71(class391 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class538.field7742, class256.field3653, arg3 && arg0.field5994, arg1 * arg2);
        if (this.field4806.field5986) {
            this.field757 = arg1;
            this.field756 = arg2;
        } else {
            this.field757 = class367.method2354(-224121456, arg1);
            this.field756 = class367.method2354(-224121456, arg2);
        }
        if (arg3) {
            this.field754 = this.field4806.field5990.method2624(this.field757, this.field756, 0, 1024, 21, 1);
        } else {
            this.field754 = this.field4806.field5990.method2624(this.field757, this.field756, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field4806.field5987;
        int var9 = this.field754.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class416.method2641((byte) 48, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2638(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2638(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field754.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIII[II)V", line = 143)
    public final void method471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        if (arg4 != 5218) {
            this.method473(false, -0.6259664F);
        }
        if (class538.field7742 != this.field4807 || class256.field3653 != this.field4805) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field4806.field5987;
        int var10 = this.field754.LockRect(0, arg1, arg5, arg3, arg7, 0, var9);
        if (!class416.method2641((byte) 48, var10)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if ((arg3 * 4) == var11 && arg2 == arg3) {
            var9.method2638(arg6, arg0, 0, arg3 * arg7);
        } else {
            for (int var12 = 0; var12 < arg7; var12++) {
                var9.method2638(arg6, arg2 * var12 + arg0, var11 * var12, arg3);
            }
        }
        this.field754.UnlockRect(0);
    }

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "(I)Z", line = 183)
    public final boolean method472(int arg0) {
        if (arg0 != -23679) {
            this.field756 = -95;
        }
        return true;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZF)F", line = 193)
    public final float method473(boolean arg0, float arg1) {
        if (arg0) {
            this.method473(false, 1.1402181F);
        }
        return arg1 / (float) this.field757;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IF)F", line = 205)
    public final float method474(int arg0, float arg1) {
        int var3 = 65 % ((-arg0 - 32) / 61);
        return arg1 / (float) this.field756;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)I", line = 213)
    public final int method475(int arg0) {
        if (arg0 <= 36) {
            this.method152(27);
        }
        return this.field756;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZZB)V", line = 223)
    public final void method476(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 > 121) {
            this.field753 = arg1;
            this.field755 = arg0;
        }
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lrca;Lkp;IIZ[BII)V", line = 234)
    public class71(class391 arg0, class421 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class256.field3653, arg4 && arg0.field5994, arg2 * arg3);
        if (this.field4806.field5986) {
            this.field756 = arg3;
            this.field757 = arg2;
        } else {
            this.field757 = class367.method2354(-224121456, arg2);
            this.field756 = class367.method2354(-224121456, arg3);
        }
        if (arg4) {
            this.field754 = this.field4806.field5990.method2624(this.field757, this.field756, 0, 1024, class391.method2516(class256.field3653, 9, this.field4807), 1);
        } else {
            this.field754 = this.field4806.field5990.method2624(this.field757, this.field756, 1, 0, class391.method2516(class256.field3653, 9, this.field4807), 1);
        }
        PixelBuffer var9 = this.field4806.field5987;
        int var10 = this.field754.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class416.method2641((byte) 48, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field4807.field6300 * arg2;
            int var12 = this.field4807.field6300 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2635(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2635(arg5, var12 * var14 + arg6, var13 * var14, var11);
                }
            }
            this.field754.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Llba;I)V", line = 292)
    public final void method154(class477 arg0, int arg1) {
        super.method154(arg0, arg1);
    }

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 299)
    public final IDirect3DBaseTexture method153(int arg0) {
        if (arg0 != 12874) {
            this.field755 = false;
        }
        return this.field754;
    }
}

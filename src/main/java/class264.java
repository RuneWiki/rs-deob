import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class411;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class264 extends class75 implements class422 {

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
    private int field3757;

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
    private int field3756;

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field3754;

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "Z")
    public boolean field3753;

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "Z")
    public boolean field3755;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(B)I", line = 4)
    public final int method1655(byte arg0) {
        if (arg0 >= -99) {
            this.field3754 = null;
        }
        return this.field3756;
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lwda;Laq;IIZ[BII)V", line = 15)
    public class264(class547 arg0, class141 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class194.field2874, arg4 && arg0.field8172, arg2 * arg3);
        if (this.field1005.field8165) {
            this.field3757 = arg3;
            this.field3756 = arg2;
        } else {
            this.field3756 = class322.method1938(arg2, 65);
            this.field3757 = class322.method1938(arg3, 106);
        }
        if (arg4) {
            this.field3754 = this.field1005.field8175.method2428(this.field3756, this.field3757, 0, 1024, class547.method3321(class194.field2874, (byte) 78, this.field1002), 1);
        } else {
            this.field3754 = this.field1005.field8175.method2428(this.field3756, this.field3757, 1, 0, class547.method3321(class194.field2874, (byte) 78, this.field1002), 1);
        }
        PixelBuffer var9 = this.field1005.field8176;
        int var10 = this.field3754.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class411.method2436(var10, (byte) 124)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field1002.field1992 * arg2;
            int var12 = this.field1002.field1992 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2438(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2438(arg5, arg6 + (var12 * var14), var13 * var14, var11);
                }
            }
            this.field3754.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)I", line = 73)
    public final int method1650(int arg0) {
        return arg0 == 10264 ? this.field3757 : -2;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(III[IIIIZ)V", line = 83)
    public final void method1654(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (class488.field6956 != this.field1002 || class194.field2874 != this.field1006) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field1005.field8176;
        int var10 = this.field3754.LockRect(0, arg5, arg1, arg6, arg0, 0, var9);
        if (class411.method2436(var10, (byte) 81)) {
            int var11 = var9.getRowPitch();
            if ((arg6 * 4) == var11 && arg2 == arg6) {
                var9.method2440(arg3, arg4, 0, arg0 * arg6);
            } else {
                for (int var12 = 0; var12 < arg0; var12++) {
                    var9.method2440(arg3, arg2 * var12 + arg4, var11 * var12, arg6);
                }
            }
            this.field3754.UnlockRect(0);
        }
        if (!arg7) {
            this.method588(72);
        }
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(B)V", line = 123)
    public final void method22(byte arg0) {
        int var2 = 50 % ((arg0 + 72) / 49);
        this.field1005.method3323(true, this);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(FI)F", line = 132)
    public final float method1651(float arg0, int arg1) {
        int var3 = -115 / ((-arg1 - 48) / 56);
        return arg0 / (float) this.field3756;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 140)
    public final IDirect3DBaseTexture method588(int arg0) {
        if (arg0 != 281) {
            this.method1655((byte) 104);
        }
        return this.field3754;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lpw;I)V", line = 150)
    public final void method31(class606 arg0, int arg1) {
        super.method31(arg0, arg1);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(II[BIIILaq;IB)V", line = 157)
    public final void method1647(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, class141 arg6, int arg7, byte arg8) {
        if (this.field1002 != arg6 || class194.field2874 != this.field1006) {
            throw new RuntimeException();
        }
        int var10 = -105 % ((arg8 + 53) / 32);
        PixelBuffer var11 = this.field1005.field8176;
        int var12 = this.field3754.LockRect(0, arg3, arg4, arg7, arg0, 0, var11);
        if (!class411.method2436(var12, (byte) 46)) {
            return;
        }
        int var13 = this.field1002.field1992 * arg7;
        int var14 = this.field1002.field1992 * arg5;
        int var15 = var11.getRowPitch();
        if (var13 == var15 && var13 == var14) {
            var11.method2438(arg2, arg1, 0, arg0 * var13);
        } else {
            for (int var16 = 0; var16 < arg0; var16++) {
                var11.method2438(arg2, var14 * var16 + arg1, var15 * var16, var13);
            }
        }
        this.field3754.UnlockRect(0);
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lwda;Laq;Lui;II)V", line = 197)
    public class264(class547 arg0, class141 arg1, class194 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field1005.field8165) {
            this.field3757 = arg4;
            this.field3756 = arg3;
        } else {
            this.field3756 = class322.method1938(arg3, 67);
            this.field3757 = class322.method1938(arg4, 37);
        }
        this.field3754 = this.field1005.field8175.method2428(arg3, arg4, 1, 0, class547.method3321(this.field1006, (byte) 78, this.field1002), 1);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)Z", line = 218)
    public final boolean method1652(byte arg0) {
        int var2 = -80 / ((arg0 + 6) / 48);
        return true;
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lwda;IIZ[III)V", line = 225)
    public class264(class547 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class488.field6956, class194.field2874, arg3 && arg0.field8172, arg1 * arg2);
        if (this.field1005.field8165) {
            this.field3757 = arg2;
            this.field3756 = arg1;
        } else {
            this.field3756 = class322.method1938(arg1, 71);
            this.field3757 = class322.method1938(arg2, 61);
        }
        if (arg3) {
            this.field3754 = this.field1005.field8175.method2428(this.field3756, this.field3757, 0, 1024, 21, 1);
        } else {
            this.field3754 = this.field1005.field8175.method2428(this.field3756, this.field3757, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field1005.field8176;
        int var9 = this.field3754.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class411.method2436(var9, (byte) 54)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2440(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2440(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field3754.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(FB)F", line = 283)
    public final float method1653(float arg0, byte arg1) {
        int var3 = 20 / ((arg1 + 6) / 54);
        return arg0 / (float) this.field3757;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZZZ)V", line = 291)
    public final void method1648(boolean arg0, boolean arg1, boolean arg2) {
        this.field3753 = arg1;
        this.field3755 = arg0;
        if (!arg2) {
            this.method1654(108, -124, 60, null, 95, -3, 21, true);
        }
    }
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class480;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class124 extends class596 implements class636 {

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "I")
    private int field1910;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
    private int field1909;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field1908;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "Z")
    public boolean field1907;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "Z")
    public boolean field1911;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)I", line = 4)
    public final int method426(boolean arg0) {
        if (!arg0) {
            this.field1910 = -121;
        }
        return this.field1909;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 15)
    public final IDirect3DBaseTexture method978(byte arg0) {
        return arg0 == -127 ? this.field1908 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Llt;Lkca;IIZ[BII)V", line = 24)
    public class124(class672 arg0, class82 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class438.field6117, arg4 && arg0.field9430, arg2 * arg3);
        if (this.field8710.field9415) {
            this.field1910 = arg2;
            this.field1909 = arg3;
        } else {
            this.field1910 = class613.method3530(false, arg2);
            this.field1909 = class613.method3530(false, arg3);
        }
        if (arg4) {
            this.field1908 = this.field8710.field9423.method2901(this.field1910, this.field1909, 0, 1024, class672.method3800((byte) -91, class438.field6117, this.field8711), 1);
        } else {
            this.field1908 = this.field8710.field9423.method2901(this.field1910, this.field1909, 1, 0, class672.method3800((byte) 49, class438.field6117, this.field8711), 1);
        }
        PixelBuffer var9 = this.field8710.field9440;
        int var10 = this.field1908.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class480.method2879(var10, (byte) -126)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field8711.field1515 * arg2;
            int var12 = this.field8711.field1515 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2905(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2905(arg5, arg6 + (var12 * var14), var13 * var14, var11);
                }
            }
            this.field1908.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(FI)F", line = 82)
    public final float method432(float arg0, int arg1) {
        if (arg1 != -12086) {
            this.field1911 = true;
        }
        return arg0 / (float) this.field1909;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Llt;IIZ[III)V", line = 91)
    public class124(class672 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class282.field4019, class438.field6117, arg3 && arg0.field9430, arg1 * arg2);
        if (this.field8710.field9415) {
            this.field1909 = arg2;
            this.field1910 = arg1;
        } else {
            this.field1910 = class613.method3530(false, arg1);
            this.field1909 = class613.method3530(false, arg2);
        }
        if (arg3) {
            this.field1908 = this.field8710.field9423.method2901(this.field1910, this.field1909, 0, 1024, 21, 1);
        } else {
            this.field1908 = this.field8710.field9423.method2901(this.field1910, this.field1909, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field8710.field9440;
        int var9 = this.field1908.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class480.method2879(var9, (byte) -105)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method2907(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2907(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field1908.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lqt;I)V", line = 148)
    public final void method979(class634 arg0, int arg1) {
        super.method979(arg0, -84);
        if (arg1 > -81) {
            this.field1909 = 123;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIILkca;Z[BI)V", line = 158)
    public final void method433(int arg0, int arg1, int arg2, int arg3, int arg4, class82 arg5, boolean arg6, byte[] arg7, int arg8) {
        if (this.field8711 != arg5 || class438.field6117 != this.field8713) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field8710.field9440;
        if (arg6) {
            this.method422(null, -124, -39, (byte) 26, 47, 120, -70);
        }
        int var11 = this.field1908.LockRect(0, arg3, arg2, arg1, arg4, 0, var10);
        if (!class480.method2879(var11, (byte) -97)) {
            return;
        }
        int var12 = this.field8711.field1515 * arg1;
        int var13 = this.field8711.field1515 * arg0;
        int var14 = var10.getRowPitch();
        if (var12 == var14 && var12 == var13) {
            var10.method2905(arg7, arg8, 0, arg4 * var12);
        } else {
            for (int var15 = 0; var15 < arg4; var15++) {
                var10.method2905(arg7, var13 * var15 + arg8, var14 * var15, var12);
            }
        }
        this.field1908.UnlockRect(0);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZBZ)V", line = 199)
    public final void method427(boolean arg0, byte arg1, boolean arg2) {
        this.field1911 = arg0;
        if (arg1 != 66) {
            this.method433(102, 15, -59, -122, -104, null, true, null, -5);
        }
        this.field1907 = arg2;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 211)
    public final void method980(int arg0) {
        int var2 = -50 / ((-arg0 - 29) / 46);
        this.field8710.method3801(this, false);
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Llt;Lkca;Lti;II)V", line = 218)
    public class124(class672 arg0, class82 arg1, class438 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field8710.field9415) {
            this.field1910 = arg3;
            this.field1909 = arg4;
        } else {
            this.field1910 = class613.method3530(false, arg3);
            this.field1909 = class613.method3530(false, arg4);
        }
        this.field1908 = this.field8710.field9423.method2901(arg3, arg4, 1, 0, class672.method3800((byte) -3, this.field8713, this.field8711), 1);
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)Z", line = 238)
    public final boolean method428(int arg0) {
        return arg0 == -12720;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIZII[II)V", line = 248)
    public final void method434(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int[] arg6, int arg7) {
        if (class282.field4019 != this.field8711 || class438.field6117 != this.field8713) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field8710.field9440;
        int var10 = this.field1908.LockRect(0, arg1, arg2, arg5, arg0, 0, var9);
        if (class480.method2879(var10, (byte) -121)) {
            int var11 = var9.getRowPitch();
            if (arg5 * 4 == var11 && arg4 == arg5) {
                var9.method2907(arg6, arg7, 0, arg0 * arg5);
            } else {
                for (int var12 = 0; var12 < arg0; var12++) {
                    var9.method2907(arg6, arg7 + (arg4 * var12), var11 * var12, arg5);
                }
            }
            this.field1908.UnlockRect(0);
        }
        if (!arg3) {
            this.method433(-75, -97, -94, -15, -102, null, true, null, 34);
        }
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)I", line = 289)
    public final int method429(int arg0) {
        if (arg0 <= 94) {
            this.field1910 = 90;
        }
        return this.field1910;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "([IIIBIII)V", line = 300)
    public final void method422(int[] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (class282.field4019 != this.field8711 || class438.field6117 != this.field8713) {
            throw new RuntimeException();
        }
        PixelBuffer var8 = this.field8710.field9440;
        int var9 = this.field1908.LockRect(0, arg6, arg4, arg2, arg5, 16, var8);
        if (arg3 != 110 || !class480.method2879(var9, (byte) -127)) {
            return;
        }
        int var10 = var8.getRowPitch();
        if (arg2 * 4 == var10) {
            var8.method2908(arg0, arg1, 0, arg0.length);
        } else {
            for (int var11 = 0; var11 < arg5; var11++) {
                var8.method2908(arg0, arg2 * var11 + arg1, var10 * var11, arg2);
            }
        }
        this.field1908.UnlockRect(0);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IF)F", line = 340)
    public final float method423(int arg0, float arg1) {
        return arg0 == 31272 ? arg1 / (float) this.field1910 : -0.22122298F;
    }
}

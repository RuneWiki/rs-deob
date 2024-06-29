import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class510;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class763 extends class363 implements class627 {

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
    private int field10540;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
    private int field10543;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field10541;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "Z")
    public boolean field10542;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "Z")
    public boolean field10544;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "(B)I", line = 4)
    public final int method2678(byte arg0) {
        if (arg0 != 31) {
            this.field10541 = null;
        }
        return this.field10540;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V", line = 14)
    public final void method2033(byte arg0) {
        if (arg0 != -40) {
            this.field10542 = true;
        }
        this.field4942.method1618((byte) 71, this);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZZI)V", line = 25)
    public final void method2679(boolean arg0, boolean arg1, int arg2) {
        this.field10544 = arg1;
        if (arg2 == -17383) {
            this.field10542 = arg0;
        }
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Laia;Lul;IIZ[BII)V", line = 35)
    public class763(class242 arg0, class599 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class497.field6799, arg4 && arg0.field3440, arg2 * arg3);
        if (this.field4942.field3445) {
            this.field10540 = arg3;
            this.field10543 = arg2;
        } else {
            this.field10543 = class241.method1609((byte) -89, arg2);
            this.field10540 = class241.method1609((byte) -128, arg3);
        }
        if (arg4) {
            this.field10541 = this.field4942.field3462.method2928(this.field10543, this.field10540, 0, 1024, class242.method1616(this.field4945, class497.field6799, 8), 1);
        } else {
            this.field10541 = this.field4942.field3462.method2928(this.field10543, this.field10540, 1, 0, class242.method1616(this.field4945, class497.field6799, -114), 1);
        }
        PixelBuffer var9 = this.field4942.field3463;
        int var10 = this.field10541.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class510.method2912(var10, -56)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field4945.field8381 * arg2;
            int var12 = this.field4945.field8381 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2933(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2933(arg5, var12 * var14 + arg6, var13 * var14, var11);
                }
            }
            this.field10541.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)I", line = 93)
    public final int method2670(int arg0) {
        return arg0 == -17271 ? this.field10543 : 98;
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(B)Z", line = 103)
    public final boolean method2680(byte arg0) {
        if (arg0 <= 84) {
            this.field10540 = -114;
        }
        return true;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "([IIIIIIII)V", line = 113)
    public final void method2671(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class530.field7176 != this.field4945 || class497.field6799 != this.field4944) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field4942.field3463;
        int var10 = this.field10541.LockRect(0, arg3, arg1, arg7, arg6, 0, var9);
        if (class510.method2912(var10, -100)) {
            int var11 = var9.getRowPitch();
            if (arg7 * 4 == var11 && arg4 == arg7) {
                var9.method2935(arg0, arg5, 0, arg6 * arg7);
            } else {
                for (int var12 = 0; var12 < arg6; var12++) {
                    var9.method2935(arg0, arg5 + (arg4 * var12), var11 * var12, arg7);
                }
            }
            this.field10541.UnlockRect(0);
        }
        if (arg2 != 9842) {
            this.method2670(-110);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIZI[III)V", line = 153)
    public final void method2676(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6) {
        if (class530.field7176 != this.field4945 || class497.field6799 != this.field4944) {
            throw new RuntimeException();
        }
        PixelBuffer var8 = this.field4942.field3463;
        int var9 = this.field10541.LockRect(0, arg5, arg0, arg1, arg6, 16, var8);
        if (class510.method2912(var9, -55)) {
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10) {
                var8.method2936(arg4, arg3, 0, arg4.length);
            } else {
                for (int var11 = 0; var11 < arg6; var11++) {
                    var8.method2936(arg4, arg3 + (arg1 * var11), var10 * var11, arg1);
                }
            }
            this.field10541.UnlockRect(0);
        }
        if (!arg2) {
            this.field10541 = null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(FB)F", line = 192)
    public final float method2675(float arg0, byte arg1) {
        if (arg1 < 92) {
            this.field10540 = -53;
        }
        return arg0 / (float) this.field10543;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Laia;IIZ[III)V", line = 202)
    public class763(class242 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class530.field7176, class497.field6799, arg3 && arg0.field3440, arg1 * arg2);
        if (this.field4942.field3445) {
            this.field10543 = arg1;
            this.field10540 = arg2;
        } else {
            this.field10543 = class241.method1609((byte) -122, arg1);
            this.field10540 = class241.method1609((byte) -75, arg2);
        }
        if (arg3) {
            this.field10541 = this.field4942.field3462.method2928(this.field10543, this.field10540, 0, 1024, 21, 1);
        } else {
            this.field10541 = this.field4942.field3462.method2928(this.field10543, this.field10540, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field4942.field3463;
        int var9 = this.field10541.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class510.method2912(var9, -122)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2935(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2935(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field10541.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Laia;Lul;Lso;II)V", line = 257)
    public class763(class242 arg0, class599 arg1, class497 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field4942.field3445) {
            this.field10540 = arg4;
            this.field10543 = arg3;
        } else {
            this.field10543 = class241.method1609((byte) -104, arg3);
            this.field10540 = class241.method1609((byte) -115, arg4);
        }
        this.field10541 = this.field4942.field3462.method2928(arg3, arg4, 1, 0, class242.method1616(this.field4945, this.field4944, 97), 1);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lws;B)V", line = 278)
    public final void method2034(class379 arg0, byte arg1) {
        if (arg1 > 27) {
            super.method2034(arg0, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 288)
    public final IDirect3DBaseTexture method2032(byte arg0) {
        return arg0 >= -65 ? (IDirect3DBaseTexture) null : this.field10541;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IF)F", line = 298)
    public final float method2669(int arg0, float arg1) {
        if (arg0 != 31463) {
            this.field10542 = false;
        }
        return arg1 / (float) this.field10540;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "([BIIILul;IIII)V", line = 310)
    public final void method2672(byte[] arg0, int arg1, int arg2, int arg3, class599 arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field4945 != arg4 || class497.field6799 != this.field4944) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field4942.field3463;
        if (arg5 != 32216) {
            return;
        }
        int var11 = this.field10541.LockRect(0, arg1, arg3, arg8, arg2, 0, var10);
        if (!class510.method2912(var11, -102)) {
            return;
        }
        int var12 = this.field4945.field8381 * arg7;
        int var13 = this.field4945.field8381 * arg8;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2933(arg0, arg6, 0, arg2 * var13);
        } else {
            for (int var15 = 0; var15 < arg2; var15++) {
                var10.method2933(arg0, var12 * var15 + arg6, var14 * var15, var13);
            }
        }
        this.field10541.UnlockRect(0);
    }
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class439;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class586 extends class582 implements class134 {

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
    private int field8308;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    private int field8310;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field8311;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "Z")
    public boolean field8309;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "Z")
    public boolean field8312;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "(I)Z", line = 4)
    public final boolean method755(int arg0) {
        return arg0 <= -72;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIII[IBII)V", line = 15)
    public final void method753(int arg0, int arg1, int arg2, int arg3, int[] arg4, byte arg5, int arg6, int arg7) {
        int var9 = 123 / ((-arg5 - 63) / 56);
        if (class412.field5529 != this.field8273 || class179.field2008 != this.field8275) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field8274.field8010;
        int var11 = this.field8311.LockRect(0, arg7, arg3, arg1, arg6, 0, var10);
        if (!class439.method2511((byte) 35, var11)) {
            return;
        }
        int var12 = var10.getRowPitch();
        if (arg1 * 4 == var12 && arg0 == arg1) {
            var10.method2507(arg4, arg2, 0, arg1 * arg6);
        } else {
            for (int var13 = 0; var13 < arg6; var13++) {
                var10.method2507(arg4, arg0 * var13 + arg2, var12 * var13, arg1);
            }
        }
        this.field8311.UnlockRect(0);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZIZ)V", line = 54)
    public final void method759(boolean arg0, int arg1, boolean arg2) {
        this.field8312 = arg2;
        this.field8309 = arg0;
        if (arg1 != -19314) {
            this.method754(69);
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Leda;Lsq;Lrt;II)V", line = 64)
    public class586(class561 arg0, class485 arg1, class179 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field8274.field8011) {
            this.field8308 = arg3;
            this.field8310 = arg4;
        } else {
            this.field8308 = class553.method3138(1781323777, arg3);
            this.field8310 = class553.method3138(1781323777, arg4);
        }
        this.field8311 = this.field8274.field8021.method2526(arg3, arg4, 1, 0, class561.method3188(this.field8273, false, this.field8275), 1);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z)V", line = 85)
    public final void method2076(boolean arg0) {
        this.field8274.method3185(-72, this);
        if (!arg0) {
            this.field8310 = 57;
        }
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)I", line = 95)
    public final int method754(int arg0) {
        if (arg0 != 7142) {
            this.method759(true, -6, true);
        }
        return this.field8310;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)I", line = 105)
    public final int method752(int arg0) {
        return arg0 <= 103 ? -127 : this.field8308;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(II[BIIIILsq;I)V", line = 117)
    public final void method757(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, class485 arg7, int arg8) {
        if (this.field8273 != arg7 || class179.field2008 != this.field8275) {
            throw new RuntimeException();
        } else if (arg8 == 13031) {
            PixelBuffer var10 = this.field8274.field8010;
            int var11 = this.field8311.LockRect(0, arg3, arg0, arg6, arg4, 0, var10);
            if (class439.method2511((byte) 35, var11)) {
                int var12 = this.field8273.field6991 * arg1;
                int var13 = this.field8273.field6991 * arg6;
                int var14 = var10.getRowPitch();
                if (var13 == var14 && var12 == var13) {
                    var10.method2506(arg2, arg5, 0, arg4 * var13);
                } else {
                    for (int var15 = 0; var15 < arg4; var15++) {
                        var10.method2506(arg2, arg5 + (var12 * var15), var14 * var15, var13);
                    }
                }
                this.field8311.UnlockRect(0);
            }
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Leda;Lsq;IIZ[BII)V", line = 158)
    public class586(class561 arg0, class485 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class179.field2008, arg4 && arg0.field8007, arg2 * arg3);
        if (this.field8274.field8011) {
            this.field8308 = arg2;
            this.field8310 = arg3;
        } else {
            this.field8308 = class553.method3138(1781323777, arg2);
            this.field8310 = class553.method3138(1781323777, arg3);
        }
        if (arg4) {
            this.field8311 = this.field8274.field8021.method2526(this.field8308, this.field8310, 0, 1024, class561.method3188(this.field8273, false, class179.field2008), 1);
        } else {
            this.field8311 = this.field8274.field8021.method2526(this.field8308, this.field8310, 1, 0, class561.method3188(this.field8273, false, class179.field2008), 1);
        }
        PixelBuffer var9 = this.field8274.field8010;
        int var10 = this.field8311.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class439.method2511((byte) 35, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field8273.field6991 * arg7;
            int var12 = this.field8273.field6991 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2506(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2506(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field8311.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 216)
    public final IDirect3DBaseTexture method2075(int arg0) {
        return arg0 == -8780 ? this.field8311 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Leda;IIZ[III)V", line = 225)
    public class586(class561 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class412.field5529, class179.field2008, arg3 && arg0.field8007, arg1 * arg2);
        if (this.field8274.field8011) {
            this.field8308 = arg1;
            this.field8310 = arg2;
        } else {
            this.field8308 = class553.method3138(1781323777, arg1);
            this.field8310 = class553.method3138(1781323777, arg2);
        }
        if (arg3) {
            this.field8311 = this.field8274.field8021.method2526(this.field8308, this.field8310, 0, 1024, 21, 1);
        } else {
            this.field8311 = this.field8274.field8021.method2526(this.field8308, this.field8310, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field8274.field8010;
        int var9 = this.field8311.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class439.method2511((byte) 35, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2507(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2507(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field8311.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Ldj;B)V", line = 283)
    public final void method2077(class197 arg0, byte arg1) {
        super.method2077(arg0, arg1);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(FI)F", line = 290)
    public final float method756(float arg0, int arg1) {
        if (arg1 != 5044) {
            this.method752(-48);
        }
        return arg0 / (float) this.field8308;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(FZ)F", line = 300)
    public final float method758(float arg0, boolean arg1) {
        if (arg1) {
            this.field8309 = false;
        }
        return arg0 / (float) this.field8310;
    }
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class407;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class221 extends class324 implements class112 {

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "I")
    private int field2726;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
    private int field2723;

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field2724;

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "Z")
    public boolean field2722;

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "Z")
    public boolean field2725;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)Z")
    public final boolean method653(int arg0) {
        if (arg0 != 11267) {
            this.field2722 = false;
        }
        return true;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(BF)F")
    public final float method652(byte arg0, float arg1) {
        return arg0 >= -126 ? 0.34478074F : arg1 / (float) this.field2726;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILie;)V")
    public final void method1272(int arg0, class6 arg1) {
        if (arg0 != 13027) {
            this.field2723 = -52;
        }
        super.method1272(arg0, arg1);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZZB)V")
    public final void method647(boolean arg0, boolean arg1, byte arg2) {
        this.field2725 = arg0;
        if (arg2 <= 36) {
            this.field2723 = 118;
        }
        this.field2722 = arg1;
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1273(int arg0) {
        return arg0 == -26670 ? this.field2724 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "(B)V")
    public final void method1274(byte arg0) {
        this.field4107.method3431((byte) 29, this);
        if (arg0 != 57) {
            this.method653(-121);
        }
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lhg;Lg;Lvp;II)V")
    public class221(class591 arg0, class135 arg1, class160 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field4107.field8585) {
            this.field2726 = arg3;
            this.field2723 = arg4;
        } else {
            this.field2726 = class129.method731(arg3, -27265);
            this.field2723 = class129.method731(arg4, -27265);
        }
        this.field2724 = this.field4107.field8586.method2334(arg3, arg4, 1, 0, class591.method3435(this.field4109, -127, this.field4110), 1);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(FZ)F")
    public final float method646(float arg0, boolean arg1) {
        if (arg1) {
            this.field2726 = 14;
        }
        return arg0 / (float) this.field2723;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)I")
    public final int method648(byte arg0) {
        if (arg0 != -118) {
            this.method646(-0.61904156F, false);
        }
        return this.field2723;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "([IIIIIIII)V")
    public final void method651(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class10.field80 != this.field4109 || class160.field1932 != this.field4110) {
            throw new RuntimeException();
        }
        if (arg5 != 5826) {
            this.field2722 = false;
        }
        PixelBuffer var9 = this.field4107.field8569;
        int var10 = this.field2724.LockRect(0, arg3, arg7, arg2, arg6, 0, var9);
        if (!class407.method2320(var10, -2005530590)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if ((arg2 * 4) == var11 && arg2 == arg4) {
            var9.method2341(arg0, arg1, 0, arg2 * arg6);
        } else {
            for (int var12 = 0; var12 < arg6; var12++) {
                var9.method2341(arg0, arg1 + (arg4 * var12), var11 * var12, arg2);
            }
        }
        this.field2724.UnlockRect(0);
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lhg;Lg;IIZ[BII)V")
    public class221(class591 arg0, class135 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class160.field1932, arg4 && arg0.field8572, arg2 * arg3);
        if (this.field4107.field8585) {
            this.field2726 = arg2;
            this.field2723 = arg3;
        } else {
            this.field2726 = class129.method731(arg2, -27265);
            this.field2723 = class129.method731(arg3, -27265);
        }
        if (arg4) {
            this.field2724 = this.field4107.field8586.method2334(this.field2726, this.field2723, 0, 1024, class591.method3435(this.field4109, -126, class160.field1932), 1);
        } else {
            this.field2724 = this.field4107.field8586.method2334(this.field2726, this.field2723, 1, 0, class591.method3435(this.field4109, -125, class160.field1932), 1);
        }
        PixelBuffer var9 = this.field4107.field8569;
        int var10 = this.field2724.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class407.method2320(var10, -2005530590)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field4109.field1649 * arg2;
            int var12 = this.field4109.field1649 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2339(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2339(arg5, var12 * var14 + arg6, var13 * var14, var11);
                }
            }
            this.field2724.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(BIIILg;III[B)V")
    public final void method650(byte arg0, int arg1, int arg2, int arg3, class135 arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        if (this.field4109 != arg4 || class160.field1932 != this.field4110) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field4107.field8569;
        int var11 = this.field2724.LockRect(0, arg2, arg1, arg7, arg5, 0, var10);
        if (class407.method2320(var11, -2005530590)) {
            int var12 = this.field4109.field1649 * arg7;
            int var13 = this.field4109.field1649 * arg3;
            int var14 = var10.getRowPitch();
            if (var12 == var14 && var12 == var13) {
                var10.method2339(arg8, arg6, 0, arg5 * var12);
            } else {
                for (int var15 = 0; var15 < arg5; var15++) {
                    var10.method2339(arg8, var13 * var15 + arg6, var14 * var15, var12);
                }
            }
            this.field2724.UnlockRect(0);
        }
        if (arg0 <= 124) {
            this.field2722 = false;
        }
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lhg;IIZ[III)V")
    public class221(class591 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class10.field80, class160.field1932, arg3 && arg0.field8572, arg1 * arg2);
        if (this.field4107.field8585) {
            this.field2723 = arg2;
            this.field2726 = arg1;
        } else {
            this.field2726 = class129.method731(arg1, -27265);
            this.field2723 = class129.method731(arg2, -27265);
        }
        if (arg3) {
            this.field2724 = this.field4107.field8586.method2334(this.field2726, this.field2723, 0, 1024, 21, 1);
        } else {
            this.field2724 = this.field4107.field8586.method2334(this.field2726, this.field2723, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field4107.field8569;
        int var9 = this.field2724.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class407.method2320(var9, -2005530590)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2341(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2341(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field2724.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)I")
    public final int method649(byte arg0) {
        if (arg0 > -73) {
            this.method1273(-1);
        }
        return this.field2726;
    }
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class452;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class582 extends class385 implements class324 {

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    private int field7734;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    private int field7737;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field7735;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "Z")
    public boolean field7736;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "Z")
    public boolean field7738;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method167(int arg0) {
        if (arg0 != -13696) {
            this.field7737 = -90;
        }
        return this.field7735;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)I")
    public final int method944(boolean arg0) {
        return arg0 ? this.field7737 : 110;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lss;Lhi;Lne;II)V")
    public class582(class401 arg0, class193 arg1, class294 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field5125.field5345) {
            this.field7734 = arg4;
            this.field7737 = arg3;
        } else {
            this.field7737 = class587.method3231(true, arg3);
            this.field7734 = class587.method3231(true, arg4);
        }
        this.field7735 = this.field5125.field5342.method2572(arg3, arg4, 1, 0, class401.method2300(this.field5124, this.field5122, 51), 1);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)I")
    public final int method939(byte arg0) {
        int var2 = 19 / ((arg0 - 26) / 33);
        return this.field7734;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lss;IIZ[III)V")
    public class582(class401 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class5.field100, class294.field4160, arg3 && arg0.field5330, arg1 * arg2);
        if (this.field5125.field5345) {
            this.field7737 = arg1;
            this.field7734 = arg2;
        } else {
            this.field7737 = class587.method3231(true, arg1);
            this.field7734 = class587.method3231(true, arg2);
        }
        if (arg3) {
            this.field7735 = this.field5125.field5342.method2572(this.field7737, this.field7734, 0, 1024, 21, 1);
        } else {
            this.field7735 = this.field5125.field5342.method2572(this.field7737, this.field7734, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field5125.field5319;
        int var9 = this.field7735.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class452.method2566(var9, (byte) -44)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method2587(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2587(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field7735.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)Z")
    public final boolean method946(byte arg0) {
        int var2 = -47 % ((69 - arg0) / 48);
        return true;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIII[I)V")
    public final void method941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        if (class5.field100 != this.field5124 || class294.field4160 != this.field5122) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field5125.field5319;
        int var10 = this.field7735.LockRect(0, arg0, arg4, arg2, arg1, 0, var9);
        if (class452.method2566(var10, (byte) -76)) {
            int var11 = var9.getRowPitch();
            if (arg2 * 4 == var11 && arg2 == arg3) {
                var9.method2587(arg7, arg5, 0, arg1 * arg2);
            } else {
                for (int var12 = 0; var12 < arg1; var12++) {
                    var9.method2587(arg7, arg3 * var12 + arg5, var11 * var12, arg2);
                }
            }
            this.field7735.UnlockRect(0);
        }
        if (arg6 > -86) {
            this.field7736 = true;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IF)F")
    public final float method948(int arg0, float arg1) {
        return arg0 == 22051 ? arg1 / (float) this.field7737 : -0.0029653173F;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lss;Lhi;IIZ[BII)V")
    public class582(class401 arg0, class193 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class294.field4160, arg4 && arg0.field5330, arg2 * arg3);
        if (this.field5125.field5345) {
            this.field7737 = arg2;
            this.field7734 = arg3;
        } else {
            this.field7737 = class587.method3231(true, arg2);
            this.field7734 = class587.method3231(true, arg3);
        }
        if (arg4) {
            this.field7735 = this.field5125.field5342.method2572(this.field7737, this.field7734, 0, 1024, class401.method2300(this.field5124, class294.field4160, 51), 1);
        } else {
            this.field7735 = this.field5125.field5342.method2572(this.field7737, this.field7734, 1, 0, class401.method2300(this.field5124, class294.field4160, 51), 1);
        }
        PixelBuffer var9 = this.field5125.field5319;
        int var10 = this.field7735.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class452.method2566(var10, (byte) -78)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field5124.field2828 * arg7;
            int var12 = this.field5124.field2828 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2584(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2584(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field7735.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(FZ)F")
    public final float method940(float arg0, boolean arg1) {
        if (arg1) {
            this.field7738 = true;
        }
        return arg0 / (float) this.field7734;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
    public final void method168(byte arg0) {
        if (arg0 <= 104) {
            this.method939((byte) -94);
        }
        this.field5125.method2295(false, this);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBII[BLhi;III)V")
    public final void method945(int arg0, byte arg1, int arg2, int arg3, byte[] arg4, class193 arg5, int arg6, int arg7, int arg8) {
        if (this.field5124 != arg5 || class294.field4160 != this.field5122) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field5125.field5319;
        if (arg1 != 52) {
            this.field7736 = false;
        }
        int var11 = this.field7735.LockRect(0, arg2, arg6, arg8, arg0, 0, var10);
        if (!class452.method2566(var11, (byte) -67)) {
            return;
        }
        int var12 = this.field5124.field2828 * arg7;
        int var13 = this.field5124.field2828 * arg8;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2584(arg4, arg3, 0, arg0 * var13);
        } else {
            for (int var15 = 0; var15 < arg0; var15++) {
                var10.method2584(arg4, arg3 + (var12 * var15), var14 * var15, var13);
            }
        }
        this.field7735.UnlockRect(0);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lcba;I)V")
    public final void method166(class516 arg0, int arg1) {
        super.method166(arg0, arg1);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BZZ)V")
    public final void method947(byte arg0, boolean arg1, boolean arg2) {
        this.field7736 = arg2;
        this.field7738 = arg1;
        int var4 = -90 % ((arg0 - 46) / 36);
    }
}

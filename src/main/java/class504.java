import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class446;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class504 extends class461 implements class679 {

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    private int field6918;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    private int field6921;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field6922;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Z")
    public boolean field6919;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Z")
    public boolean field6920;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZIZ)V")
    public final void method2137(boolean arg0, int arg1, boolean arg2) {
        this.field6920 = arg0;
        if (arg1 < 28) {
            this.field6921 = 53;
        }
        this.field6919 = arg2;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)I")
    public final int method2139(int arg0) {
        int var2 = 58 % ((arg0 + 34) / 42);
        return this.field6918;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method2393(byte arg0) {
        if (arg0 <= 48) {
            this.field6921 = -106;
        }
        return this.field6922;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BF)F")
    public final float method2135(byte arg0, float arg1) {
        if (arg0 != -84) {
            this.method2139(-119);
        }
        return arg1 / (float) this.field6918;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lega;Lpn;Ljg;II)V")
    public class504(class662 arg0, class692 arg1, class309 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field6355.field9270) {
            this.field6921 = arg4;
            this.field6918 = arg3;
        } else {
            this.field6918 = class206.method1334(-1, arg3);
            this.field6921 = class206.method1334(-1, arg4);
        }
        this.field6922 = this.field6355.field9273.method2535(arg3, arg4, 1, 0, class662.method3731(126, this.field6353, this.field6354), 1);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III[IIIII)V")
    public final void method2134(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class129.field1851 != this.field6353 || class309.field4271 != this.field6354) {
            throw new RuntimeException();
        } else if (arg2 == 19390) {
            PixelBuffer var9 = this.field6355.field9290;
            int var10 = this.field6922.LockRect(0, arg5, arg4, arg6, arg1, 0, var9);
            if (class446.method2528((byte) -106, var10)) {
                int var11 = var9.getRowPitch();
                if ((arg6 * 4) == var11 && arg6 == arg7) {
                    var9.method2550(arg3, arg0, 0, arg1 * arg6);
                } else {
                    for (int var12 = 0; var12 < arg1; var12++) {
                        var9.method2550(arg3, arg7 * var12 + arg0, var11 * var12, arg6);
                    }
                }
                this.field6922.UnlockRect(0);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public final void method1271(boolean arg0) {
        this.field6355.method3739(this, !arg0);
        if (arg0) {
            this.field6922 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Z")
    public final boolean method2140(int arg0) {
        if (arg0 != 17615) {
            this.method2134(-117, -116, 62, null, -1, -57, -114, -99);
        }
        return true;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ldca;B)V")
    public final void method1259(class160 arg0, byte arg1) {
        if (arg1 < 66) {
            this.method2393((byte) 34);
        }
        super.method1259(arg0, (byte) 122);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(BF)F")
    public final float method2138(byte arg0, float arg1) {
        return arg0 <= 94 ? 0.027227394F : arg1 / (float) this.field6921;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lega;Lpn;IIZ[BII)V")
    public class504(class662 arg0, class692 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class309.field4271, arg4 && arg0.field9268, arg2 * arg3);
        if (this.field6355.field9270) {
            this.field6921 = arg3;
            this.field6918 = arg2;
        } else {
            this.field6918 = class206.method1334(-1, arg2);
            this.field6921 = class206.method1334(-1, arg3);
        }
        if (arg4) {
            this.field6922 = this.field6355.field9273.method2535(this.field6918, this.field6921, 0, 1024, class662.method3731(117, this.field6353, class309.field4271), 1);
        } else {
            this.field6922 = this.field6355.field9273.method2535(this.field6918, this.field6921, 1, 0, class662.method3731(126, this.field6353, class309.field4271), 1);
        }
        PixelBuffer var9 = this.field6355.field9290;
        int var10 = this.field6922.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class446.method2528((byte) 21, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field6353.field9861 * arg7;
            int var12 = this.field6353.field9861 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2548(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2548(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field6922.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)I")
    public final int method2141(int arg0) {
        if (arg0 != 4845) {
            this.method2393((byte) -75);
        }
        return this.field6921;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIZILpn;I[B)V")
    public final void method2136(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class692 arg6, int arg7, byte[] arg8) {
        if (this.field6353 != arg6 || class309.field4271 != this.field6354) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field6355.field9290;
        if (!arg4) {
            this.method1271(true);
        }
        int var11 = this.field6922.LockRect(0, arg3, arg2, arg1, arg7, 0, var10);
        if (!class446.method2528((byte) -123, var11)) {
            return;
        }
        int var12 = this.field6353.field9861 * arg0;
        int var13 = this.field6353.field9861 * arg1;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2548(arg8, arg5, 0, arg7 * var13);
        } else {
            for (int var15 = 0; var15 < arg7; var15++) {
                var10.method2548(arg8, var12 * var15 + arg5, var14 * var15, var13);
            }
        }
        this.field6922.UnlockRect(0);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lega;IIZ[III)V")
    public class504(class662 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class129.field1851, class309.field4271, arg3 && arg0.field9268, arg1 * arg2);
        if (this.field6355.field9270) {
            this.field6918 = arg1;
            this.field6921 = arg2;
        } else {
            this.field6918 = class206.method1334(-1, arg1);
            this.field6921 = class206.method1334(-1, arg2);
        }
        if (arg3) {
            this.field6922 = this.field6355.field9273.method2535(this.field6918, this.field6921, 0, 1024, 21, 1);
        } else {
            this.field6922 = this.field6355.field9273.method2535(this.field6918, this.field6921, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field6355.field9290;
        int var9 = this.field6922.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class446.method2528((byte) -107, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2550(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2550(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field6922.UnlockRect(0);
        }
    }
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class482;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class275 extends class669 implements class320 {

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    private int field3917;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    private int field3915;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field3913;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Z")
    public boolean field3914;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Z")
    public boolean field3916;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BF)F")
    public final float method1322(byte arg0, float arg1) {
        int var3 = -120 % ((64 - arg0) / 52);
        return arg1 / (float) this.field3917;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Llda;I)V")
    public final void method81(class485 arg0, int arg1) {
        super.method81(arg0, arg1);
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1787(int arg0) {
        return arg0 == -4406 ? this.field3913 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ltg;Lbda;Lwt;II)V")
    public class275(class229 arg0, class505 arg1, class309 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field9086.field3074) {
            this.field3917 = arg3;
            this.field3915 = arg4;
        } else {
            this.field3917 = class123.method837(108, arg3);
            this.field3915 = class123.method837(114, arg4);
        }
        this.field3913 = this.field9086.field3093.method2894(arg3, arg4, 1, 0, class229.method1482(this.field9090, this.field9089, -107), 1);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZZ)V")
    public final void method1317(int arg0, boolean arg1, boolean arg2) {
        this.field3916 = arg1;
        this.field3914 = arg2;
        if (arg0 != 28970) {
            this.field3915 = 111;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Z")
    public final boolean method1324(int arg0) {
        return arg0 == -4111 ? true : true;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ltg;Lbda;IIZ[BII)V")
    public class275(class229 arg0, class505 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class309.field4305, arg4 && arg0.field3084, arg2 * arg3);
        if (this.field9086.field3074) {
            this.field3917 = arg2;
            this.field3915 = arg3;
        } else {
            this.field3917 = class123.method837(110, arg2);
            this.field3915 = class123.method837(114, arg3);
        }
        if (arg4) {
            this.field3913 = this.field9086.field3093.method2894(this.field3917, this.field3915, 0, 1024, class229.method1482(class309.field4305, this.field9089, -119), 1);
        } else {
            this.field3913 = this.field9086.field3093.method2894(this.field3917, this.field3915, 1, 0, class229.method1482(class309.field4305, this.field9089, -126), 1);
        }
        PixelBuffer var9 = this.field9086.field3075;
        int var10 = this.field3913.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class482.method2873(-83, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field9089.field7239 * arg7;
            int var12 = this.field9089.field7239 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2899(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2899(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field3913.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)I")
    public final int method1316(byte arg0) {
        return arg0 > -2 ? 51 : this.field3915;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZF)F")
    public final float method1318(boolean arg0, float arg1) {
        if (!arg0) {
            this.field3917 = -110;
        }
        return arg1 / (float) this.field3915;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILbda;III[BZII)V")
    public final void method1325(int arg0, class505 arg1, int arg2, int arg3, int arg4, byte[] arg5, boolean arg6, int arg7, int arg8) {
        if (this.field9089 != arg1 || class309.field4305 != this.field9090) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field9086.field3075;
        int var11 = this.field3913.LockRect(0, arg0, arg3, arg4, arg2, 0, var10);
        if (class482.method2873(-118, var11)) {
            int var12 = this.field9089.field7239 * arg4;
            int var13 = this.field9089.field7239 * arg7;
            int var14 = var10.getRowPitch();
            if (var12 == var14 && var12 == var13) {
                var10.method2899(arg5, arg8, 0, arg2 * var12);
            } else {
                for (int var15 = 0; var15 < arg2; var15++) {
                    var10.method2899(arg5, arg8 + (var13 * var15), var14 * var15, var12);
                }
            }
            this.field3913.UnlockRect(0);
        }
        if (!arg6) {
            this.method1317(-61, false, true);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II[IIZIII)V")
    public final void method1320(int arg0, int arg1, int[] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (class165.field2263 != this.field9089 || class309.field4305 != this.field9090) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field9086.field3075;
        int var10 = this.field3913.LockRect(0, arg3, arg7, arg6, arg0, 0, var9);
        if (class482.method2873(-102, var10)) {
            int var11 = var9.getRowPitch();
            if ((arg6 * 4) == var11 && arg1 == arg6) {
                var9.method2902(arg2, arg5, 0, arg0 * arg6);
            } else {
                for (int var12 = 0; var12 < arg0; var12++) {
                    var9.method2902(arg2, arg1 * var12 + arg5, var11 * var12, arg6);
                }
            }
            this.field3913.UnlockRect(0);
        }
        if (!arg4) {
            this.field3917 = -44;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public final void method80(int arg0) {
        if (arg0 == 20276) {
            this.field9086.method1488(arg0 - 41376, this);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)I")
    public final int method1323(byte arg0) {
        if (arg0 >= -57) {
            this.field3913 = null;
        }
        return this.field3917;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ltg;IIZ[III)V")
    public class275(class229 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class165.field2263, class309.field4305, arg3 && arg0.field3084, arg1 * arg2);
        if (this.field9086.field3074) {
            this.field3917 = arg1;
            this.field3915 = arg2;
        } else {
            this.field3917 = class123.method837(110, arg1);
            this.field3915 = class123.method837(112, arg2);
        }
        if (arg3) {
            this.field3913 = this.field9086.field3093.method2894(this.field3917, this.field3915, 0, 1024, 21, 1);
        } else {
            this.field3913 = this.field9086.field3093.method2894(this.field3917, this.field3915, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field9086.field3075;
        int var9 = this.field3913.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class482.method2873(-126, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method2902(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2902(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field3913.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIII[I)V")
    public final void method1321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (class165.field2263 != this.field9089 || class309.field4305 != this.field9090) {
            throw new RuntimeException();
        }
        PixelBuffer var8 = this.field9086.field3075;
        int var9 = this.field3913.LockRect(0, arg0, arg4, arg3, arg1, 16, var8);
        if (class482.method2873(-124, var9)) {
            int var10 = var8.getRowPitch();
            if (arg3 * 4 == var10) {
                var8.method2901(arg6, arg2, 0, arg6.length);
            } else {
                for (int var11 = 0; var11 < arg1; var11++) {
                    var8.method2901(arg6, arg3 * var11 + arg2, var10 * var11, arg3);
                }
            }
            this.field3913.UnlockRect(0);
        }
        int var12 = 88 % ((16 - arg5) / 62);
    }
}

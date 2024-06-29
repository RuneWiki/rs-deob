import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class435;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class359 extends class483 implements class691 {

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    private int field4769;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    private int field4773;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field4772;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "Z")
    public boolean field4770;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "Z")
    public boolean field4771;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)I")
    public final int method848(boolean arg0) {
        if (!arg0) {
            this.field4773 = 52;
        }
        return this.field4773;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIII[BLsk;I)V")
    public final void method850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, class452 arg7, int arg8) {
        if (this.field6727 != arg7 || class404.field5338 != this.field6726) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field6725.field4594;
        if (arg0 != -3661) {
            this.field4769 = -5;
        }
        int var11 = this.field4772.LockRect(0, arg4, arg5, arg3, arg8, 0, var10);
        if (!class435.method2447(arg0 + 3660, var11)) {
            return;
        }
        int var12 = this.field6727.field5964 * arg3;
        int var13 = this.field6727.field5964 * arg2;
        int var14 = var10.getRowPitch();
        if (var12 == var14 && var12 == var13) {
            var10.method2437(arg6, arg1, 0, arg8 * var12);
        } else {
            for (int var15 = 0; var15 < arg8; var15++) {
                var10.method2437(arg6, var13 * var15 + arg1, var14 * var15, var12);
            }
        }
        this.field4772.UnlockRect(0);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZBZ)V")
    public final void method846(boolean arg0, byte arg1, boolean arg2) {
        if (arg1 > 55) {
            this.field4771 = arg2;
            this.field4770 = arg0;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method388(int arg0) {
        if (arg0 != -18414) {
            this.field4773 = -42;
        }
        return this.field4772;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILng;)V")
    public final void method390(int arg0, class219 arg1) {
        if (arg0 == 29613) {
            super.method390(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(Z)V")
    public final void method389(boolean arg0) {
        if (!arg0) {
            this.field4773 = 36;
        }
        this.field6725.method2036(1, this);
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lhb;IIZ[III)V")
    public class359(class343 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class480.field6686, class404.field5338, arg3 && arg0.field4586, arg1 * arg2);
        if (this.field6725.field4602) {
            this.field4769 = arg2;
            this.field4773 = arg1;
        } else {
            this.field4773 = class385.method2206(0, arg1);
            this.field4769 = class385.method2206(0, arg2);
        }
        if (arg3) {
            this.field4772 = this.field6725.field4612.method2464(this.field4773, this.field4769, 0, 1024, 21, 1);
        } else {
            this.field4772 = this.field6725.field4612.method2464(this.field4773, this.field4769, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field6725.field4594;
        int var9 = this.field4772.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class435.method2447(-1, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method2438(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2438(arg4, arg5 + (arg6 * var11), var10 * var11, arg1);
                }
            }
            this.field4772.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(FB)F")
    public final float method843(float arg0, byte arg1) {
        if (arg1 != 58) {
            this.field4771 = true;
        }
        return arg0 / (float) this.field4773;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III[IIBII)V")
    public final void method851(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (class480.field6686 != this.field6727 || class404.field5338 != this.field6726) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field6725.field4594;
        if (arg5 != -122) {
            this.field4769 = 110;
        }
        int var10 = this.field4772.LockRect(0, arg4, arg2, arg1, arg6, 0, var9);
        if (!class435.method2447(arg5 + 121, var10)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if (arg1 * 4 == var11 && arg0 == arg1) {
            var9.method2438(arg3, arg7, 0, arg1 * arg6);
        } else {
            for (int var12 = 0; var12 < arg6; var12++) {
                var9.method2438(arg3, arg0 * var12 + arg7, var11 * var12, arg1);
            }
        }
        this.field4772.UnlockRect(0);
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lhb;Lsk;Lvea;II)V")
    public class359(class343 arg0, class452 arg1, class404 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field6725.field4602) {
            this.field4769 = arg4;
            this.field4773 = arg3;
        } else {
            this.field4773 = class385.method2206(0, arg3);
            this.field4769 = class385.method2206(0, arg4);
        }
        this.field4772 = this.field6725.field4612.method2464(arg3, arg4, 1, 0, class343.method2008(this.field6727, this.field6726, 28), 1);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)I")
    public final int method842(byte arg0) {
        int var2 = 124 % ((-arg0 - 47) / 60);
        return this.field4769;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lhb;Lsk;IIZ[BII)V")
    public class359(class343 arg0, class452 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class404.field5338, arg4 && arg0.field4586, arg2 * arg3);
        if (this.field6725.field4602) {
            this.field4773 = arg2;
            this.field4769 = arg3;
        } else {
            this.field4773 = class385.method2206(0, arg2);
            this.field4769 = class385.method2206(0, arg3);
        }
        if (arg4) {
            this.field4772 = this.field6725.field4612.method2464(this.field4773, this.field4769, 0, 1024, class343.method2008(this.field6727, class404.field5338, 28), 1);
        } else {
            this.field4772 = this.field6725.field4612.method2464(this.field4773, this.field4769, 1, 0, class343.method2008(this.field6727, class404.field5338, 28), 1);
        }
        PixelBuffer var9 = this.field6725.field4594;
        int var10 = this.field4772.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class435.method2447(-1, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field6727.field5964 * arg2;
            int var12 = this.field6727.field5964 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2437(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2437(arg5, arg6 + (var12 * var14), var13 * var14, var11);
                }
            }
            this.field4772.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Z")
    public final boolean method849(int arg0) {
        return arg0 <= -23;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BF)F")
    public final float method841(byte arg0, float arg1) {
        if (arg0 != -40) {
            this.field4773 = -70;
        }
        return arg1 / (float) this.field4769;
    }
}

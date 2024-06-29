import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class735;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class248 extends class626 implements class60 {

    @OriginalMember(owner = "client!rw", name = "j", descriptor = "I")
    private int field3616;

    @OriginalMember(owner = "client!rw", name = "i", descriptor = "I")
    private int field3615;

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field3614;

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "Z")
    public boolean field3612;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "Z")
    public boolean field3613;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZIZ)V", line = 6)
    public final void method560(boolean arg0, int arg1, boolean arg2) {
        this.field3613 = arg2;
        this.field3612 = arg0;
        if (arg1 != 16609) {
            this.method565(null, null, -15, -77, -74, -5, -51, -34, -53);
        }
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lad;IIZ[III)V", line = 16)
    public class248(class173 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class482.field6922, class674.field9590, arg3 && arg0.field2431, arg1 * arg2);
        if (this.field8888.field2422) {
            this.field3616 = arg2;
            this.field3615 = arg1;
        } else {
            this.field3615 = class68.method609(arg1, (byte) -125);
            this.field3616 = class68.method609(arg2, (byte) 3);
        }
        if (arg3) {
            this.field3614 = this.field8888.field2418.method4102(this.field3615, this.field3616, 0, 1024, 21, 1);
        } else {
            this.field3614 = this.field8888.field2418.method4102(this.field3615, this.field3616, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field8888.field2428;
        int var9 = this.field3614.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class735.method4119(-2005530516, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method4093(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method4093(arg4, arg5 + (arg6 * var11), var10 * var11, arg1);
                }
            }
            this.field3614.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lkca;[BIIIIIII)V", line = 73)
    public final void method565(class755 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field8891 != arg0 || class674.field9590 != this.field8890) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field8888.field2428;
        if (arg8 != -19479) {
            this.method562(null, 65, 8, 108, (byte) -64, 115, 2, -29);
        }
        int var11 = this.field3614.LockRect(0, arg6, arg7, arg5, arg2, 0, var10);
        if (!class735.method4119(-2005530516, var11)) {
            return;
        }
        int var12 = this.field8891.field10513 * arg5;
        int var13 = this.field8891.field10513 * arg4;
        int var14 = var10.getRowPitch();
        if (var12 == var14 && var12 == var13) {
            var10.method2566(arg1, arg3, 0, arg2 * var12);
        } else {
            for (int var15 = 0; var15 < arg2; var15++) {
                var10.method2566(arg1, var13 * var15 + arg3, var14 * var15, var12);
            }
        }
        this.field3614.UnlockRect(0);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V", line = 114)
    public final void method617(byte arg0) {
        if (arg0 == 111) {
            this.field8888.method1221(arg0 ^ 0x6B, this);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)I", line = 124)
    public final int method568(int arg0) {
        return arg0 == 22505 ? this.field3615 : -35;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "([IIIIBIII)V", line = 134)
    public final void method562(int[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (class482.field6922 != this.field8891 || class674.field9590 != this.field8890) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field8888.field2428;
        int var10 = this.field3614.LockRect(0, arg7, arg3, arg1, arg5, 0, var9);
        if (class735.method4119(-2005530516, var10)) {
            int var11 = var9.getRowPitch();
            if ((arg1 * 4) == var11 && arg1 == arg2) {
                var9.method4093(arg0, arg6, 0, arg1 * arg5);
            } else {
                for (int var12 = 0; var12 < arg5; var12++) {
                    var9.method4093(arg0, arg2 * var12 + arg6, var11 * var12, arg1);
                }
            }
            this.field3614.UnlockRect(0);
        }
        if (arg4 < 90) {
            this.field3616 = 101;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZLui;)V", line = 174)
    public final void method616(boolean arg0, class308 arg1) {
        super.method616(arg0, arg1);
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)I", line = 181)
    public final int method563(byte arg0) {
        if (arg0 > -2) {
            this.method567(-0.96511054F, -123);
        }
        return this.field3616;
    }

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(B)Z", line = 192)
    public final boolean method566(byte arg0) {
        if (arg0 < 0) {
            this.field3615 = -97;
        }
        return true;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BF)F", line = 203)
    public final float method561(byte arg0, float arg1) {
        int var3 = -55 % ((arg0) / 47);
        return arg1 / (float) this.field3615;
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lad;Lkca;IIZ[BII)V", line = 210)
    public class248(class173 arg0, class755 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class674.field9590, arg4 && arg0.field2431, arg2 * arg3);
        if (this.field8888.field2422) {
            this.field3615 = arg2;
            this.field3616 = arg3;
        } else {
            this.field3615 = class68.method609(arg2, (byte) 116);
            this.field3616 = class68.method609(arg3, (byte) 121);
        }
        if (arg4) {
            this.field3614 = this.field8888.field2418.method4102(this.field3615, this.field3616, 0, 1024, class173.method1223(this.field8891, (byte) 62, class674.field9590), 1);
        } else {
            this.field3614 = this.field8888.field2418.method4102(this.field3615, this.field3616, 1, 0, class173.method1223(this.field8891, (byte) 62, class674.field9590), 1);
        }
        PixelBuffer var9 = this.field8888.field2428;
        int var10 = this.field3614.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class735.method4119(-2005530516, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field8891.field10513 * arg7;
            int var12 = this.field8891.field10513 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2566(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2566(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field3614.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(FI)F", line = 268)
    public final float method567(float arg0, int arg1) {
        if (arg1 != 17714) {
            this.method566((byte) 43);
        }
        return arg0 / (float) this.field3616;
    }

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 278)
    public final IDirect3DBaseTexture method615(byte arg0) {
        if (arg0 != -64) {
            this.field3615 = 79;
        }
        return this.field3614;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "([IIIIIII)V", line = 288)
    public final void method564(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class482.field6922 != this.field8891 || class674.field9590 != this.field8890) {
            throw new RuntimeException();
        }
        if (arg3 <= 13) {
            this.field3614 = null;
        }
        PixelBuffer var8 = this.field8888.field2428;
        int var9 = this.field3614.LockRect(0, arg4, arg5, arg1, arg2, 16, var8);
        if (!class735.method4119(-2005530516, var9)) {
            return;
        }
        int var10 = var8.getRowPitch();
        if ((arg1 * 4) == var10) {
            var8.method4092(arg0, arg6, 0, arg0.length);
        } else {
            for (int var11 = 0; var11 < arg2; var11++) {
                var8.method4092(arg0, arg6 + (arg1 * var11), var10 * var11, arg1);
            }
        }
        this.field3614.UnlockRect(0);
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lad;Lkca;Lwq;II)V", line = 326)
    public class248(class173 arg0, class755 arg1, class674 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field8888.field2422) {
            this.field3615 = arg3;
            this.field3616 = arg4;
        } else {
            this.field3615 = class68.method609(arg3, (byte) -125);
            this.field3616 = class68.method609(arg4, (byte) -126);
        }
        this.field3614 = this.field8888.field2418.method4102(arg3, arg4, 1, 0, class173.method1223(this.field8891, (byte) 62, this.field8890), 1);
    }
}

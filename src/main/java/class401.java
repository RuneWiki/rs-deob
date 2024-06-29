import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class508;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class401 extends class413 implements class191 {

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
    private int field5985;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
    private int field5988;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field5987;

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "Z")
    public boolean field5984;

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "Z")
    public boolean field5986;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(BF)F", line = 4)
    public final float method740(byte arg0, float arg1) {
        if (arg0 >= -32) {
            this.field5986 = true;
        }
        return arg1 / (float) this.field5985;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lsd;Leu;IIZ[BII)V", line = 13)
    public class401(class103 arg0, class505 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class157.field1952, arg4 && arg0.field1150, arg2 * arg3);
        if (this.field6087.field1162) {
            this.field5985 = arg2;
            this.field5988 = arg3;
        } else {
            this.field5985 = class12.method83((byte) -1, arg2);
            this.field5988 = class12.method83((byte) -1, arg3);
        }
        if (arg4) {
            this.field5987 = this.field6087.field1151.method3842(this.field5985, this.field5988, 0, 1024, class103.method864(class157.field1952, this.field6089, (byte) -50), 1);
        } else {
            this.field5987 = this.field6087.field1151.method3842(this.field5985, this.field5988, 1, 0, class103.method864(class157.field1952, this.field6089, (byte) -94), 1);
        }
        PixelBuffer var9 = this.field6087.field1169;
        int var10 = this.field5987.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class508.method3822(var10, true)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field6089.field7318 * arg2;
            int var12 = this.field6089.field7318 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method3847(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method3847(arg5, var12 * var14 + arg6, var13 * var14, var11);
                }
            }
            this.field5987.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Z", line = 72)
    public final boolean method749(int arg0) {
        return arg0 <= 3 ? true : true;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I[BIIIIILeu;I)V", line = 84)
    public final void method742(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class505 arg7, int arg8) {
        if (this.field6089 != arg7 || class157.field1952 != this.field6091) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field6087.field1169;
        int var11 = this.field5987.LockRect(0, arg4, arg5, arg3, arg2, 0, var10);
        if (arg6 != 9588) {
            this.method746(null, -128, (byte) 18, -7, 55, -2, 30, -42);
        }
        if (!class508.method3822(var11, true)) {
            return;
        }
        int var12 = this.field6089.field7318 * arg3;
        int var13 = this.field6089.field7318 * arg0;
        int var14 = var10.getRowPitch();
        if (var12 == var14 && var12 == var13) {
            var10.method3847(arg1, arg8, 0, arg2 * var12);
        } else {
            for (int var15 = 0; var15 < arg2; var15++) {
                var10.method3847(arg1, var13 * var15 + arg8, var14 * var15, var12);
            }
        }
        this.field5987.UnlockRect(0);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZIZ)V", line = 126)
    public final void method751(boolean arg0, int arg1, boolean arg2) {
        if (arg1 >= 27) {
            this.field5984 = arg2;
            this.field5986 = arg0;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)I", line = 137)
    public final int method743(byte arg0) {
        if (arg0 != -101) {
            this.method2774(-73);
        }
        return this.field5985;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZLli;)V", line = 148)
    public final void method2776(boolean arg0, class451 arg1) {
        if (!arg0) {
            this.method740((byte) -103, -1.5811714F);
        }
        super.method2776(arg0, arg1);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "([IIIIIII)V", line = 158)
    public final void method750(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class215.field3276 != this.field6089 || class157.field1952 != this.field6091) {
            throw new RuntimeException();
        }
        PixelBuffer var8 = this.field6087.field1169;
        int var9 = this.field5987.LockRect(0, arg3, arg1, arg6, arg2, 16, var8);
        if (class508.method3822(var9, true)) {
            int var10 = var8.getRowPitch();
            if ((arg6 * 4) == var10) {
                var8.method3850(arg0, arg5, 0, arg0.length);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method3850(arg0, arg6 * var11 + arg5, var10 * var11, arg6);
                }
            }
            this.field5987.UnlockRect(0);
        }
        if (arg4 != -2946) {
            this.method2774(-54);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V", line = 197)
    public final void method2774(int arg0) {
        if (arg0 != 15416) {
            this.field5986 = false;
        }
        this.field6087.method886(this, -6396);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)I", line = 207)
    public final int method747(byte arg0) {
        if (arg0 != -120) {
            this.field5987 = null;
        }
        return this.field5988;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lsd;Leu;Lpj;II)V", line = 216)
    public class401(class103 arg0, class505 arg1, class157 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field6087.field1162) {
            this.field5985 = arg3;
            this.field5988 = arg4;
        } else {
            this.field5985 = class12.method83((byte) -1, arg3);
            this.field5988 = class12.method83((byte) -1, arg4);
        }
        this.field5987 = this.field6087.field1151.method3842(arg3, arg4, 1, 0, class103.method864(this.field6091, this.field6089, (byte) 117), 1);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IF)F", line = 236)
    public final float method748(int arg0, float arg1) {
        if (arg0 != -19847) {
            this.field5988 = 101;
        }
        return arg1 / (float) this.field5988;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "([IIBIIIII)V", line = 246)
    public final void method746(int[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class215.field3276 != this.field6089 || class157.field1952 != this.field6091) {
            throw new RuntimeException();
        } else if (arg2 == -110) {
            PixelBuffer var9 = this.field6087.field1169;
            int var10 = this.field5987.LockRect(0, arg4, arg5, arg6, arg7, 0, var9);
            if (class508.method3822(var10, true)) {
                int var11 = var9.getRowPitch();
                if ((arg6 * 4) == var11 && arg3 == arg6) {
                    var9.method3849(arg0, arg1, 0, arg6 * arg7);
                } else {
                    for (int var12 = 0; var12 < arg7; var12++) {
                        var9.method3849(arg0, arg3 * var12 + arg1, var11 * var12, arg6);
                    }
                }
                this.field5987.UnlockRect(0);
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lsd;IIZ[III)V", line = 285)
    public class401(class103 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class215.field3276, class157.field1952, arg3 && arg0.field1150, arg1 * arg2);
        if (this.field6087.field1162) {
            this.field5988 = arg2;
            this.field5985 = arg1;
        } else {
            this.field5985 = class12.method83((byte) -1, arg1);
            this.field5988 = class12.method83((byte) -1, arg2);
        }
        if (arg3) {
            this.field5987 = this.field6087.field1151.method3842(this.field5985, this.field5988, 0, 1024, 21, 1);
        } else {
            this.field5987 = this.field6087.field1151.method3842(this.field5985, this.field5988, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field6087.field1169;
        int var9 = this.field5987.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class508.method3822(var9, true)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method3849(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method3849(arg4, arg5 + (arg6 * var11), var10 * var11, arg1);
                }
            }
            this.field5987.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 341)
    public final IDirect3DBaseTexture method3152(byte arg0) {
        if (arg0 > -84) {
            this.method750(null, -109, 84, -109, -35, -120, -96);
        }
        return this.field5987;
    }
}

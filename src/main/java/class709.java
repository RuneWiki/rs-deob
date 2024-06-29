import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class507;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class709 extends class681 implements class498 {

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    private int field9858;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    private int field9857;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field9855;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Z")
    public boolean field9854;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Z")
    public boolean field9856;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)I", line = 4)
    public final int method2019(byte arg0) {
        if (arg0 != 61) {
            this.method2020(48, -16, 57, (byte) 33, 40, null, 78, 52);
        }
        return this.field9858;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(FI)F", line = 14)
    public final float method2024(float arg0, int arg1) {
        if (arg1 != -23091) {
            this.method2563(61, null);
        }
        return arg0 / (float) this.field9858;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILtda;)V", line = 24)
    public final void method2563(int arg0, class663 arg1) {
        super.method2563(arg0, arg1);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)Z", line = 31)
    public final boolean method2016(boolean arg0) {
        if (!arg0) {
            this.method2023(-71, 22, null, -55, -70, -98, -20, null, 71);
        }
        return true;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZZB)V", line = 41)
    public final void method2021(boolean arg0, boolean arg1, byte arg2) {
        this.field9856 = arg0;
        if (arg2 != 23) {
            this.field9856 = true;
        }
        this.field9854 = arg1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIBI[III)V", line = 52)
    public final void method2020(int arg0, int arg1, int arg2, byte arg3, int arg4, int[] arg5, int arg6, int arg7) {
        if (arg3 >= -68) {
            return;
        }
        if (class691.field9659 != this.field9448 || class34.field457 != this.field9449) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field9450.field3451;
        int var10 = this.field9855.LockRect(0, arg4, arg2, arg0, arg6, 0, var9);
        if (!class507.method3053(var10, -1)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if (arg0 * 4 == var11 && arg0 == arg1) {
            var9.method3081(arg5, arg7, 0, arg0 * arg6);
        } else {
            for (int var12 = 0; var12 < arg6; var12++) {
                var9.method3081(arg5, arg7 + (arg1 * var12), var11 * var12, arg0);
            }
        }
        this.field9855.UnlockRect(0);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lta;IIZ[III)V", line = 90)
    public class709(class224 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class691.field9659, class34.field457, arg3 && arg0.field3457, arg1 * arg2);
        if (this.field9450.field3456) {
            this.field9858 = arg1;
            this.field9857 = arg2;
        } else {
            this.field9858 = class433.method2595(arg1, (byte) -82);
            this.field9857 = class433.method2595(arg2, (byte) -82);
        }
        if (arg3) {
            this.field9855 = this.field9450.field3450.method3070(this.field9858, this.field9857, 0, 1024, 21, 1);
        } else {
            this.field9855 = this.field9450.field3450.method3070(this.field9858, this.field9857, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field9450.field3451;
        int var9 = this.field9855.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class507.method3053(var9, -1)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method3081(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method3081(arg4, arg5 + (arg6 * var11), var10 * var11, arg1);
                }
            }
            this.field9855.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILvea;IIII[BI)V", line = 147)
    public final void method2023(int arg0, int arg1, class288 arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        if (this.field9448 != arg2 || class34.field457 != this.field9449) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field9450.field3451;
        int var11 = this.field9855.LockRect(0, arg3, arg1, arg0, arg4, 0, var10);
        if (class507.method3053(var11, -1)) {
            int var12 = this.field9448.field4228 * arg5;
            int var13 = this.field9448.field4228 * arg0;
            int var14 = var10.getRowPitch();
            if (var13 == var14 && var12 == var13) {
                var10.method3078(arg7, arg8, 0, arg4 * var13);
            } else {
                for (int var15 = 0; var15 < arg4; var15++) {
                    var10.method3078(arg7, var12 * var15 + arg8, var14 * var15, var13);
                }
            }
            this.field9855.UnlockRect(0);
        }
        if (arg6 != 8409) {
            this.method2561(73);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIBI[III)V", line = 188)
    public final void method2018(int arg0, int arg1, byte arg2, int arg3, int[] arg4, int arg5, int arg6) {
        if (class691.field9659 != this.field9448 || class34.field457 != this.field9449) {
            throw new RuntimeException();
        } else if (arg2 <= -93) {
            PixelBuffer var8 = this.field9450.field3451;
            int var9 = this.field9855.LockRect(0, arg1, arg5, arg3, arg6, 16, var8);
            if (class507.method3053(var9, -1)) {
                int var10 = var8.getRowPitch();
                if (arg3 * 4 == var10) {
                    var8.method3080(arg4, arg0, 0, arg4.length);
                } else {
                    for (int var11 = 0; var11 < arg6; var11++) {
                        var8.method3080(arg4, arg3 * var11 + arg0, var10 * var11, arg3);
                    }
                }
                this.field9855.UnlockRect(0);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;", line = 228)
    public final IDirect3DBaseTexture method2576(boolean arg0) {
        if (!arg0) {
            this.method2563(82, null);
        }
        return this.field9855;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lta;Lvea;IIZ[BII)V", line = 238)
    public class709(class224 arg0, class288 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class34.field457, arg4 && arg0.field3457, arg2 * arg3);
        if (this.field9450.field3456) {
            this.field9857 = arg3;
            this.field9858 = arg2;
        } else {
            this.field9858 = class433.method2595(arg2, (byte) -82);
            this.field9857 = class433.method2595(arg3, (byte) -82);
        }
        if (arg4) {
            this.field9855 = this.field9450.field3450.method3070(this.field9858, this.field9857, 0, 1024, class224.method1527((byte) 41, this.field9448, class34.field457), 1);
        } else {
            this.field9855 = this.field9450.field3450.method3070(this.field9858, this.field9857, 1, 0, class224.method1527((byte) 41, this.field9448, class34.field457), 1);
        }
        PixelBuffer var9 = this.field9450.field3451;
        int var10 = this.field9855.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class507.method3053(var10, -1)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field9448.field4228 * arg7;
            int var12 = this.field9448.field4228 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method3078(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method3078(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field9855.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 301)
    public final void method2561(int arg0) {
        this.field9450.method1531(23346, this);
        int var2 = 12 / ((-arg0 - 77) / 43);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(FI)F", line = 310)
    public final float method2022(float arg0, int arg1) {
        if (arg1 != 16678) {
            this.method2023(-28, -126, null, -63, 124, -25, 52, null, 38);
        }
        return arg0 / (float) this.field9857;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)I", line = 321)
    public final int method2015(int arg0) {
        int var2 = -123 % ((34 - arg0) / 57);
        return this.field9857;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lta;Lvea;Lbja;II)V", line = 328)
    public class709(class224 arg0, class288 arg1, class34 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field9450.field3456) {
            this.field9858 = arg3;
            this.field9857 = arg4;
        } else {
            this.field9858 = class433.method2595(arg3, (byte) -82);
            this.field9857 = class433.method2595(arg4, (byte) -82);
        }
        this.field9855 = this.field9450.field3450.method3070(arg3, arg4, 1, 0, class224.method1527((byte) 41, this.field9448, this.field9449), 1);
    }
}

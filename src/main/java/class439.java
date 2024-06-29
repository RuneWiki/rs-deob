import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class510;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class439 extends class358 implements class248 {

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    private int field6175;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    private int field6176;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field6172;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "Z")
    public boolean field6173;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "Z")
    public boolean field6174;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IBI[IIIII)V")
    public final void method1663(int arg0, byte arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class305.field4404 != this.field5241 || class258.field3847 != this.field5238) {
            throw new RuntimeException();
        }
        int var9 = 82 / ((52 - arg1) / 59);
        PixelBuffer var10 = this.field5242.field1564;
        int var11 = this.field6172.LockRect(0, arg7, arg0, arg2, arg5, 0, var10);
        if (!class510.method2954(0, var11)) {
            return;
        }
        int var12 = var10.getRowPitch();
        if (arg2 * 4 == var12 && arg2 == arg4) {
            var10.method2982(arg3, arg6, 0, arg2 * arg5);
        } else {
            for (int var13 = 0; var13 < arg5; var13++) {
                var10.method2982(arg3, arg6 + (arg4 * var13), var12 * var13, arg2);
            }
        }
        this.field6172.UnlockRect(0);
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lrja;Lsw;Lig;II)V")
    public class439(class115 arg0, class787 arg1, class258 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field5242.field1579) {
            this.field6175 = arg3;
            this.field6176 = arg4;
        } else {
            this.field6175 = class719.method4014(arg3, (byte) -100);
            this.field6176 = class719.method4014(arg4, (byte) -100);
        }
        this.field6172 = this.field5242.field1565.method2975(arg3, arg4, 1, 0, class115.method884(this.field5241, this.field5238, (byte) 19), 1);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)I")
    public final int method1665(byte arg0) {
        return arg0 == 84 ? this.field6176 : 8;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lrja;Lsw;IIZ[BII)V")
    public class439(class115 arg0, class787 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class258.field3847, arg4 && arg0.field1575, arg2 * arg3);
        if (this.field5242.field1579) {
            this.field6175 = arg2;
            this.field6176 = arg3;
        } else {
            this.field6175 = class719.method4014(arg2, (byte) -100);
            this.field6176 = class719.method4014(arg3, (byte) -100);
        }
        if (arg4) {
            this.field6172 = this.field5242.field1565.method2975(this.field6175, this.field6176, 0, 1024, class115.method884(this.field5241, class258.field3847, (byte) 19), 1);
        } else {
            this.field6172 = this.field5242.field1565.method2975(this.field6175, this.field6176, 1, 0, class115.method884(this.field5241, class258.field3847, (byte) 19), 1);
        }
        PixelBuffer var9 = this.field5242.field1564;
        int var10 = this.field6172.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class510.method2954(0, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field5241.field10833 * arg7;
            int var12 = this.field5241.field10833 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2980(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2980(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field6172.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZZI)V")
    public final void method1667(boolean arg0, boolean arg1, int arg2) {
        this.field6174 = arg1;
        if (arg2 == 30135) {
            this.field6173 = arg0;
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)Z")
    public final boolean method1664(int arg0) {
        if (arg0 != 26244) {
            this.method1664(124);
        }
        return true;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lrja;IIZ[III)V")
    public class439(class115 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class305.field4404, class258.field3847, arg3 && arg0.field1575, arg1 * arg2);
        if (this.field5242.field1579) {
            this.field6175 = arg1;
            this.field6176 = arg2;
        } else {
            this.field6175 = class719.method4014(arg1, (byte) -100);
            this.field6176 = class719.method4014(arg2, (byte) -100);
        }
        if (arg3) {
            this.field6172 = this.field5242.field1565.method2975(this.field6175, this.field6176, 0, 1024, 21, 1);
        } else {
            this.field6172 = this.field5242.field1565.method2975(this.field6175, this.field6176, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field5242.field1564;
        int var9 = this.field6172.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class510.method2954(0, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2982(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2982(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field6172.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)I")
    public final int method1668(boolean arg0) {
        if (arg0) {
            this.field6172 = null;
        }
        return this.field6175;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(IF)F")
    public final float method1670(int arg0, float arg1) {
        int var3 = 47 / ((arg0 - 68) / 53);
        return arg1 / (float) this.field6176;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public final void method1004(int arg0) {
        if (arg0 != 20464) {
            this.field6172 = null;
        }
        this.field5242.method880(this, 34);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lsw;IIII[BIII)V")
    public final void method1669(class787 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        if (this.field5241 != arg0 || class258.field3847 != this.field5238) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field5242.field1564;
        if (arg1 != 5259) {
            return;
        }
        int var11 = this.field6172.LockRect(0, arg6, arg2, arg4, arg8, 0, var10);
        if (!class510.method2954(0, var11)) {
            return;
        }
        int var12 = this.field5241.field10833 * arg7;
        int var13 = this.field5241.field10833 * arg4;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2980(arg5, arg3, 0, arg8 * var13);
        } else {
            for (int var15 = 0; var15 < arg8; var15++) {
                var10.method2980(arg5, var12 * var15 + arg3, var14 * var15, var13);
            }
        }
        this.field6172.UnlockRect(0);
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method2252(int arg0) {
        return arg0 == 15901 ? this.field6172 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIII[III)V")
    public final void method1671(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        if (class305.field4404 != this.field5241 || class258.field3847 != this.field5238) {
            throw new RuntimeException();
        } else if (arg6 == 3839) {
            PixelBuffer var8 = this.field5242.field1564;
            int var9 = this.field6172.LockRect(0, arg0, arg3, arg2, arg1, 16, var8);
            if (class510.method2954(0, var9)) {
                int var10 = var8.getRowPitch();
                if ((arg2 * 4) == var10) {
                    var8.method2983(arg4, arg5, 0, arg4.length);
                } else {
                    for (int var11 = 0; var11 < arg1; var11++) {
                        var8.method2983(arg4, arg2 * var11 + arg5, var10 * var11, arg2);
                    }
                }
                this.field6172.UnlockRect(0);
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IF)F")
    public final float method1666(int arg0, float arg1) {
        return arg0 == -18982 ? arg1 / (float) this.field6175 : 0.6968257F;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILwga;)V")
    public final void method1003(int arg0, class779 arg1) {
        if (arg0 > -104) {
            this.method1667(true, false, -89);
        }
        super.method1003(-109, arg1);
    }
}

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class511;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class520 extends class491 implements class406 {

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
    private int field7694;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
    private int field7691;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field7692;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "Z")
    public boolean field7690;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "Z")
    public boolean field7693;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIILua;II[BII)V")
    public final void method3171(int arg0, int arg1, int arg2, class696 arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (this.field7402 != arg3 || class544.field8004 != this.field7401) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field7398.field1590;
        int var11 = this.field7692.LockRect(0, arg8, arg5, arg7, arg1, 0, var10);
        if (class511.method3844(arg4 - 2005558574, var11)) {
            int var12 = this.field7402.field10033 * arg7;
            int var13 = this.field7402.field10033 * arg2;
            int var14 = var10.getRowPitch();
            if (var12 == var14 && var12 == var13) {
                var10.method3847(arg6, arg0, 0, arg1 * var12);
            } else {
                for (int var15 = 0; var15 < arg1; var15++) {
                    var10.method3847(arg6, var13 * var15 + arg0, var14 * var15, var12);
                }
            }
            this.field7692.UnlockRect(0);
        }
        if (arg4 != 27989) {
            this.field7692 = null;
        }
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Ler;IIZ[III)V")
    public class520(class113 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class313.field5120, class544.field8004, arg3 && arg0.field1593, arg1 * arg2);
        if (this.field7398.field1596) {
            this.field7694 = arg2;
            this.field7691 = arg1;
        } else {
            this.field7691 = class90.method883((byte) 92, arg1);
            this.field7694 = class90.method883((byte) 113, arg2);
        }
        if (arg3) {
            this.field7692 = this.field7398.field1575.method3829(this.field7691, this.field7694, 0, 1024, 21, 1);
        } else {
            this.field7692 = this.field7398.field1575.method3829(this.field7691, this.field7694, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field7398.field1590;
        int var9 = this.field7692.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class511.method3844(-2005530585, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method3850(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method3850(arg4, arg5 + (arg6 * var11), var10 * var11, arg1);
                }
            }
            this.field7692.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V")
    public final void method1168(int arg0) {
        this.field7398.method1085(0, this);
        if (arg0 != 16541) {
            this.method3169(-35, 2, -31, null, 90, (byte) -3, -112, 8);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILse;)V")
    public final void method1170(int arg0, class267 arg1) {
        super.method1170(arg0, arg1);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)Z")
    public final boolean method3163(int arg0) {
        if (arg0 != -6990) {
            this.field7690 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Ler;Lua;Ldn;II)V")
    public class520(class113 arg0, class696 arg1, class544 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field7398.field1596) {
            this.field7691 = arg3;
            this.field7694 = arg4;
        } else {
            this.field7691 = class90.method883((byte) 100, arg3);
            this.field7694 = class90.method883((byte) 101, arg4);
        }
        this.field7692 = this.field7398.field1575.method3829(arg3, arg4, 1, 0, class113.method1078(-17331, this.field7401, this.field7402), 1);
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1169(int arg0) {
        if (arg0 != -15770) {
            this.field7692 = null;
        }
        return this.field7692;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)I")
    public final int method3162(byte arg0) {
        return arg0 == 112 ? this.field7691 : 23;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Ler;Lua;IIZ[BII)V")
    public class520(class113 arg0, class696 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class544.field8004, arg4 && arg0.field1593, arg2 * arg3);
        if (this.field7398.field1596) {
            this.field7691 = arg2;
            this.field7694 = arg3;
        } else {
            this.field7691 = class90.method883((byte) 86, arg2);
            this.field7694 = class90.method883((byte) 47, arg3);
        }
        if (arg4) {
            this.field7692 = this.field7398.field1575.method3829(this.field7691, this.field7694, 0, 1024, class113.method1078(-17331, class544.field8004, this.field7402), 1);
        } else {
            this.field7692 = this.field7398.field1575.method3829(this.field7691, this.field7694, 1, 0, class113.method1078(-17331, class544.field8004, this.field7402), 1);
        }
        PixelBuffer var9 = this.field7398.field1590;
        int var10 = this.field7692.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class511.method3844(-2005530585, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field7402.field10033 * arg7;
            int var12 = this.field7402.field10033 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method3847(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method3847(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field7692.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(FZ)F")
    public final float method3164(float arg0, boolean arg1) {
        if (arg1) {
            this.method3170(-3, null, 14, -20, 122, -39, -21);
        }
        return arg0 / (float) this.field7691;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZIZ)V")
    public final void method3166(boolean arg0, int arg1, boolean arg2) {
        if (arg1 == 8095) {
            this.field7690 = arg2;
            this.field7693 = arg0;
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)I")
    public final int method3172(byte arg0) {
        if (arg0 < 12) {
            this.method3164(1.026622F, false);
        }
        return this.field7694;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(FI)F")
    public final float method3173(float arg0, int arg1) {
        if (arg1 != 32263) {
            this.method3173(0.51076514F, 56);
        }
        return arg0 / (float) this.field7694;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(III[IIBII)V")
    public final void method3169(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (class313.field5120 != this.field7402 || class544.field8004 != this.field7401) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field7398.field1590;
        int var10 = 29 % ((67 - arg5) / 32);
        int var11 = this.field7692.LockRect(0, arg7, arg0, arg6, arg2, 0, var9);
        if (!class511.method3844(-2005530585, var11)) {
            return;
        }
        int var12 = var9.getRowPitch();
        if (arg6 * 4 == var12 && arg4 == arg6) {
            var9.method3850(arg3, arg1, 0, arg2 * arg6);
        } else {
            for (int var13 = 0; var13 < arg2; var13++) {
                var9.method3850(arg3, arg4 * var13 + arg1, var12 * var13, arg6);
            }
        }
        this.field7692.UnlockRect(0);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I[IIIIII)V")
    public final void method3170(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class313.field5120 != this.field7402 || class544.field8004 != this.field7401) {
            throw new RuntimeException();
        } else if (arg0 == 10120) {
            PixelBuffer var8 = this.field7398.field1590;
            int var9 = this.field7692.LockRect(0, arg5, arg4, arg3, arg2, 16, var8);
            if (class511.method3844(-2005530585, var9)) {
                int var10 = var8.getRowPitch();
                if ((arg3 * 4) == var10) {
                    var8.method3849(arg1, arg6, 0, arg1.length);
                } else {
                    for (int var11 = 0; var11 < arg2; var11++) {
                        var8.method3849(arg1, arg3 * var11 + arg6, var10 * var11, arg3);
                    }
                }
                this.field7692.UnlockRect(0);
            }
        }
    }
}

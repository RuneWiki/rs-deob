import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class439;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class90 extends class552 implements class459 {

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field1270;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "Z")
    public boolean field1268;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "Z")
    public boolean field1271;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)I")
    public final int method517(int arg0) {
        return arg0 == -3537 ? this.field1269 : -118;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(FB)F")
    public final float method518(float arg0, byte arg1) {
        if (arg1 != -59) {
            this.field1271 = false;
        }
        return arg0 / (float) this.field1269;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)Z")
    public final boolean method519(boolean arg0) {
        return arg0;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IBI[IIIII)V")
    public final void method520(int arg0, byte arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class590.field8288 != this.field7699 || class117.field1509 != this.field7698) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field7697.field3720;
        int var10 = this.field1270.LockRect(0, arg4, arg7, arg5, arg6, 0, var9);
        if (class439.method2333(var10, -2005530519)) {
            int var11 = var9.getRowPitch();
            if (arg5 * 4 == var11 && arg2 == arg5) {
                var9.method2305(arg3, arg0, 0, arg5 * arg6);
            } else {
                for (int var12 = 0; var12 < arg6; var12++) {
                    var9.method2305(arg3, arg2 * var12 + arg0, var11 * var12, arg5);
                }
            }
            this.field1270.UnlockRect(0);
        }
        if (arg1 != 75) {
            this.field1267 = -78;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lmv;I)V")
    public final void method521(class688 arg0, int arg1) {
        super.method521(arg0, arg1);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZF)F")
    public final float method522(boolean arg0, float arg1) {
        return arg0 ? 1.6255823F : arg1 / (float) this.field1267;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lgaa;Lec;IIZ[BII)V")
    public class90(class302 arg0, class146 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class117.field1509, arg4 && arg0.field3714, arg2 * arg3);
        if (this.field7697.field3709) {
            this.field1267 = arg2;
            this.field1269 = arg3;
        } else {
            this.field1267 = class391.method2101(arg2, 128);
            this.field1269 = class391.method2101(arg3, 128);
        }
        if (arg4) {
            this.field1270 = this.field7697.field3716.method2321(this.field1267, this.field1269, 0, 1024, class302.method1720(this.field7699, class117.field1509, true), 1);
        } else {
            this.field1270 = this.field7697.field3716.method2321(this.field1267, this.field1269, 1, 0, class302.method1720(this.field7699, class117.field1509, true), 1);
        }
        PixelBuffer var9 = this.field7697.field3720;
        int var10 = this.field1270.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class439.method2333(var10, -2005530519)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field7699.field1885 * arg7;
            int var12 = this.field7699.field1885 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2304(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2304(arg5, arg6 + (var11 * var14), var13 * var14, var12);
                }
            }
            this.field1270.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[BLec;IIIIII)V")
    public final void method523(int arg0, byte[] arg1, class146 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field7699 != arg2 || class117.field1509 != this.field7698) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field7697.field3720;
        int var11 = this.field1270.LockRect(0, arg8, arg3, arg4, arg7, 0, var10);
        if (class439.method2333(var11, -2005530519)) {
            int var12 = this.field7699.field1885 * arg5;
            int var13 = this.field7699.field1885 * arg4;
            int var14 = var10.getRowPitch();
            if (var13 == var14 && var12 == var13) {
                var10.method2304(arg1, arg0, 0, arg7 * var13);
            } else {
                for (int var15 = 0; var15 < arg7; var15++) {
                    var10.method2304(arg1, arg0 + (var12 * var15), var14 * var15, var13);
                }
            }
            this.field1270.UnlockRect(0);
        }
        if (arg6 != 996) {
            this.method527(-31);
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method524(int arg0) {
        if (arg0 != -13997) {
            this.method523(-54, null, null, -114, -66, 41, -12, -72, 99);
        }
        return this.field1270;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BZZ)V")
    public final void method525(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 != -81) {
            this.method525((byte) 97, true, false);
        }
        this.field1271 = arg1;
        this.field1268 = arg2;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lgaa;Lec;Lbt;II)V")
    public class90(class302 arg0, class146 arg1, class117 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field7697.field3709) {
            this.field1269 = arg4;
            this.field1267 = arg3;
        } else {
            this.field1267 = class391.method2101(arg3, 128);
            this.field1269 = class391.method2101(arg4, 128);
        }
        this.field1270 = this.field7697.field3716.method2321(arg3, arg4, 1, 0, class302.method1720(this.field7699, this.field7698, true), 1);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)I")
    public final int method526(byte arg0) {
        if (arg0 < 53) {
            this.method519(true);
        }
        return this.field1267;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lgaa;IIZ[III)V")
    public class90(class302 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class590.field8288, class117.field1509, arg3 && arg0.field3714, arg1 * arg2);
        if (this.field7697.field3709) {
            this.field1267 = arg1;
            this.field1269 = arg2;
        } else {
            this.field1267 = class391.method2101(arg1, 128);
            this.field1269 = class391.method2101(arg2, 128);
        }
        if (arg3) {
            this.field1270 = this.field7697.field3716.method2321(this.field1267, this.field1269, 0, 1024, 21, 1);
        } else {
            this.field1270 = this.field7697.field3716.method2321(this.field1267, this.field1269, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field7697.field3720;
        int var9 = this.field1270.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class439.method2333(var9, -2005530519)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2305(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2305(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field1270.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
    public final void method527(int arg0) {
        if (arg0 != 9258) {
            this.method525((byte) 88, false, true);
        }
        this.field7697.method1710(this, 0);
    }
}

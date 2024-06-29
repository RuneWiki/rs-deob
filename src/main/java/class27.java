import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class686;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class27 extends class221 implements class595 {

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field269;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "Z")
    public boolean field266;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "Z")
    public boolean field268;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 4)
    public final void method163(int arg0) {
        this.field2866.method838(this, arg0 - 9900);
        if (arg0 != 9901) {
            this.field265 = 105;
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lui;Lnl;Leea;II)V", line = 13)
    public class27(class130 arg0, class50 arg1, class680 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field2866.field1644) {
            this.field267 = arg3;
            this.field265 = arg4;
        } else {
            this.field267 = class306.method1837((byte) -128, arg3);
            this.field265 = class306.method1837((byte) -125, arg4);
        }
        this.field269 = this.field2866.field1657.method3794(arg3, arg4, 1, 0, class130.method802(this.field2870, this.field2868, 16), 1);
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)I", line = 34)
    public final int method164(int arg0) {
        if (arg0 != 1994) {
            this.field269 = null;
        }
        return this.field267;
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 44)
    public final IDirect3DBaseTexture method165(int arg0) {
        if (arg0 >= -60) {
            this.field267 = 43;
        }
        return this.field269;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)I", line = 54)
    public final int method166(int arg0) {
        if (arg0 != 8281) {
            this.field268 = false;
        }
        return this.field265;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lui;IIZ[III)V", line = 64)
    public class27(class130 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class420.field5862, class680.field9664, arg3 && arg0.field1645, arg1 * arg2);
        if (this.field2866.field1644) {
            this.field265 = arg2;
            this.field267 = arg1;
        } else {
            this.field267 = class306.method1837((byte) -118, arg1);
            this.field265 = class306.method1837((byte) -123, arg2);
        }
        if (arg3) {
            this.field269 = this.field2866.field1657.method3794(this.field267, this.field265, 0, 1024, 21, 1);
        } else {
            this.field269 = this.field2866.field1657.method3794(this.field267, this.field265, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field2866.field1649;
        int var9 = this.field269.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class686.method3804(2005530599, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method3806(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method3806(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field269.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)Z", line = 122)
    public final boolean method167(int arg0) {
        if (arg0 != 30117) {
            this.field269 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lui;Lnl;IIZ[BII)V", line = 132)
    public class27(class130 arg0, class50 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class680.field9664, arg4 && arg0.field1645, arg2 * arg3);
        if (this.field2866.field1644) {
            this.field267 = arg2;
            this.field265 = arg3;
        } else {
            this.field267 = class306.method1837((byte) -119, arg2);
            this.field265 = class306.method1837((byte) -114, arg3);
        }
        if (arg4) {
            this.field269 = this.field2866.field1657.method3794(this.field267, this.field265, 0, 1024, class130.method802(class680.field9664, this.field2868, 16), 1);
        } else {
            this.field269 = this.field2866.field1657.method3794(this.field267, this.field265, 1, 0, class130.method802(class680.field9664, this.field2868, 16), 1);
        }
        PixelBuffer var9 = this.field2866.field1649;
        int var10 = this.field269.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class686.method3804(2005530599, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field2868.field663 * arg2;
            int var12 = this.field2868.field663 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method1517(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method1517(arg5, arg6 + (var12 * var14), var13 * var14, var11);
                }
            }
            this.field269.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IF)F", line = 190)
    public final float method168(int arg0, float arg1) {
        if (arg0 != 31688) {
            this.field269 = null;
        }
        return arg1 / (float) this.field267;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZBZ)V", line = 200)
    public final void method169(boolean arg0, byte arg1, boolean arg2) {
        if (arg1 != -68) {
            this.field269 = null;
        }
        this.field268 = arg2;
        this.field266 = arg0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(FI)F", line = 211)
    public final float method170(float arg0, int arg1) {
        if (arg1 != -17968) {
            this.method164(-102);
        }
        return arg0 / (float) this.field265;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIII[IIII)V", line = 221)
    public final void method171(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        if (class420.field5862 != this.field2868 || class680.field9664 != this.field2870) {
            throw new RuntimeException();
        }
        if (arg1 != 27729) {
            this.method165(95);
        }
        PixelBuffer var9 = this.field2866.field1649;
        int var10 = this.field269.LockRect(0, arg6, arg3, arg7, arg5, 0, var9);
        if (!class686.method3804(2005530599, var10)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if ((arg7 * 4) == var11 && arg2 == arg7) {
            var9.method3806(arg4, arg0, 0, arg5 * arg7);
        } else {
            for (int var12 = 0; var12 < arg5; var12++) {
                var9.method3806(arg4, arg2 * var12 + arg0, var11 * var12, arg7);
            }
        }
        this.field269.UnlockRect(0);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ltd;B)V", line = 262)
    public final void method172(class691 arg0, byte arg1) {
        int var3 = -31 / ((arg1 - 2) / 53);
        super.method172(arg0, (byte) -86);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lnl;IB[BIIIII)V", line = 270)
    public final void method173(class50 arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field2868 != arg0 || class680.field9664 != this.field2870) {
            throw new RuntimeException();
        }
        if (arg2 != -99) {
            this.method165(-27);
        }
        PixelBuffer var10 = this.field2866.field1649;
        int var11 = this.field269.LockRect(0, arg4, arg5, arg6, arg1, 0, var10);
        if (!class686.method3804(2005530599, var11)) {
            return;
        }
        int var12 = this.field2868.field663 * arg6;
        int var13 = this.field2868.field663 * arg7;
        int var14 = var10.getRowPitch();
        if (var12 == var14 && var12 == var13) {
            var10.method1517(arg3, arg8, 0, arg1 * var12);
        } else {
            for (int var15 = 0; var15 < arg1; var15++) {
                var10.method1517(arg3, var13 * var15 + arg8, var14 * var15, var12);
            }
        }
        this.field269.UnlockRect(0);
    }
}

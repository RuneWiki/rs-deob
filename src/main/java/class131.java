import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class451;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class131 extends class298 implements class190 {

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    private int field2352;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
    private int field2354;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field2353;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "Z")
    public boolean field2355;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "Z")
    public boolean field2356;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZIZ)V")
    public final void method465(boolean arg0, int arg1, boolean arg2) {
        this.field2355 = arg0;
        if (arg1 == 13321) {
            this.field2356 = arg2;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)Z")
    public final boolean method473(int arg0) {
        if (arg0 != 27) {
            this.field2352 = 21;
        }
        return true;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZLgw;)V")
    public final void method774(boolean arg0, class155 arg1) {
        super.method774(arg0, arg1);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method772(byte arg0) {
        return arg0 < 118 ? (IDirect3DBaseTexture) null : this.field2353;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(FI)F")
    public final float method467(float arg0, int arg1) {
        return arg1 == -13359 ? arg0 / (float) this.field2352 : 1.4790295F;
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)V")
    public final void method773(int arg0) {
        if (arg0 != -23993) {
            this.method773(116);
        }
        this.field4455.method3673(this, (byte) -85);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBI[IIIII)V")
    public final void method464(int arg0, byte arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class121.field2214 != this.field4454 || class2.field372 != this.field4457) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field4455.field9272;
        int var10 = 64 % ((arg1 - 61) / 43);
        int var11 = this.field2353.LockRect(0, arg2, arg6, arg5, arg7, 0, var9);
        if (!class451.method2727(var11, 3102)) {
            return;
        }
        int var12 = var9.getRowPitch();
        if (arg5 * 4 == var12 && arg4 == arg5) {
            var9.method2723(arg3, arg0, 0, arg5 * arg7);
        } else {
            for (int var13 = 0; var13 < arg7; var13++) {
                var9.method2723(arg3, arg4 * var13 + arg0, var12 * var13, arg5);
            }
        }
        this.field2353.UnlockRect(0);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(FI)F")
    public final float method471(float arg0, int arg1) {
        if (arg1 != 5235) {
            this.method464(88, (byte) -7, -85, null, 94, -103, -90, -37);
        }
        return arg0 / (float) this.field2354;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)I")
    public final int method466(int arg0) {
        return arg0 == -29159 ? this.field2352 : 49;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lhg;IIZ[III)V")
    public class131(class644 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class121.field2214, class2.field372, arg3 && arg0.field9261, arg1 * arg2);
        if (this.field4455.field9252) {
            this.field2354 = arg2;
            this.field2352 = arg1;
        } else {
            this.field2352 = class455.method2740(-1675135295, arg1);
            this.field2354 = class455.method2740(-1675135295, arg2);
        }
        if (arg3) {
            this.field2353 = this.field4455.field9267.method2707(this.field2352, this.field2354, 0, 1024, 21, 1);
        } else {
            this.field2353 = this.field4455.field9267.method2707(this.field2352, this.field2354, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field4455.field9272;
        int var9 = this.field2353.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class451.method2727(var9, 3102)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method2723(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2723(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field2353.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lhg;Lfda;Lro;II)V")
    public class131(class644 arg0, class294 arg1, class2 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field4455.field9252) {
            this.field2354 = arg4;
            this.field2352 = arg3;
        } else {
            this.field2352 = class455.method2740(-1675135295, arg3);
            this.field2354 = class455.method2740(-1675135295, arg4);
        }
        this.field2353 = this.field4455.field9267.method2707(arg3, arg4, 1, 0, class644.method3668(0, this.field4454, this.field4457), 1);
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lhg;Lfda;IIZ[BII)V")
    public class131(class644 arg0, class294 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class2.field372, arg4 && arg0.field9261, arg2 * arg3);
        if (this.field4455.field9252) {
            this.field2352 = arg2;
            this.field2354 = arg3;
        } else {
            this.field2352 = class455.method2740(-1675135295, arg2);
            this.field2354 = class455.method2740(-1675135295, arg3);
        }
        if (arg4) {
            this.field2353 = this.field4455.field9267.method2707(this.field2352, this.field2354, 0, 1024, class644.method3668(0, this.field4454, class2.field372), 1);
        } else {
            this.field2353 = this.field4455.field9267.method2707(this.field2352, this.field2354, 1, 0, class644.method3668(0, this.field4454, class2.field372), 1);
        }
        PixelBuffer var9 = this.field4455.field9272;
        int var10 = this.field2353.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class451.method2727(var10, 3102)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field4454.field4407 * arg7;
            int var12 = this.field4454.field4407 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2721(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2721(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field2353.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)I")
    public final int method472(int arg0) {
        if (arg0 != 19099) {
            this.method465(false, 9, true);
        }
        return this.field2354;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lfda;IIIII[BZI)V")
    public final void method470(class294 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, boolean arg7, int arg8) {
        if (this.field4454 != arg0 || class2.field372 != this.field4457) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field4455.field9272;
        int var11 = this.field2353.LockRect(0, arg2, arg5, arg8, arg3, 0, var10);
        if (arg7) {
            this.method772((byte) -56);
        }
        if (!class451.method2727(var11, 3102)) {
            return;
        }
        int var12 = this.field4454.field4407 * arg8;
        int var13 = this.field4454.field4407 * arg4;
        int var14 = var10.getRowPitch();
        if (var12 == var14 && var12 == var13) {
            var10.method2721(arg6, arg1, 0, arg3 * var12);
        } else {
            for (int var15 = 0; var15 < arg3; var15++) {
                var10.method2721(arg6, var13 * var15 + arg1, var14 * var15, var12);
            }
        }
        this.field2353.UnlockRect(0);
    }
}

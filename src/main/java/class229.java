import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class399;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class229 extends class498 implements class305 {

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    private int field2929;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    private int field2931;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field2930;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Z")
    public boolean field2932;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Z")
    public boolean field2933;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)I")
    public final int method1050(byte arg0) {
        if (arg0 >= -47) {
            this.method1054(-13, -18, null, -87, (byte) -56, null, -128, 39, -69);
        }
        return this.field2929;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lhv;Luda;IIZ[BII)V")
    public class229(class188 arg0, class509 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class280.field3663, arg4 && arg0.field2427, arg2 * arg3);
        if (this.field6940.field2431) {
            this.field2929 = arg2;
            this.field2931 = arg3;
        } else {
            this.field2929 = class468.method2685(arg2, false);
            this.field2931 = class468.method2685(arg3, false);
        }
        if (arg4) {
            this.field2930 = this.field6940.field2418.method2390(this.field2929, this.field2931, 0, 1024, class188.method1193(this.field6941, class280.field3663, 51), 1);
        } else {
            this.field2930 = this.field6940.field2418.method2390(this.field2929, this.field2931, 1, 0, class188.method1193(this.field6941, class280.field3663, 51), 1);
        }
        PixelBuffer var9 = this.field6940.field2434;
        int var10 = this.field2930.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class399.method2379(var10, 28658)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field6941.field7091 * arg7;
            int var12 = this.field6941.field7091 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2375(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2375(arg5, arg6 + (var11 * var14), var13 * var14, var12);
                }
            }
            this.field2930.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[BIBLuda;III)V")
    public final void method1054(int arg0, int arg1, byte[] arg2, int arg3, byte arg4, class509 arg5, int arg6, int arg7, int arg8) {
        if (this.field6941 != arg5 || class280.field3663 != this.field6939) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field6940.field2434;
        int var11 = this.field2930.LockRect(0, arg0, arg8, arg3, arg7, 0, var10);
        if (class399.method2379(var11, 28658)) {
            int var12 = this.field6941.field7091 * arg3;
            int var13 = this.field6941.field7091 * arg1;
            int var14 = var10.getRowPitch();
            if (var12 == var14 && var12 == var13) {
                var10.method2375(arg2, arg6, 0, arg7 * var12);
            } else {
                for (int var15 = 0; var15 < arg7; var15++) {
                    var10.method2375(arg2, var13 * var15 + arg6, var14 * var15, var12);
                }
            }
            this.field2930.UnlockRect(0);
        }
        if (arg4 != -21) {
            this.field2930 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IF)F")
    public final float method1051(int arg0, float arg1) {
        if (arg0 != -3008) {
            this.field2930 = null;
        }
        return arg1 / (float) this.field2931;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BF)F")
    public final float method1053(byte arg0, float arg1) {
        if (arg0 != 3) {
            this.method1050((byte) 112);
        }
        return arg1 / (float) this.field2929;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lhv;Luda;Lsb;II)V")
    public class229(class188 arg0, class509 arg1, class280 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field6940.field2431) {
            this.field2929 = arg3;
            this.field2931 = arg4;
        } else {
            this.field2929 = class468.method2685(arg3, false);
            this.field2931 = class468.method2685(arg4, false);
        }
        this.field2930 = this.field6940.field2418.method2390(arg3, arg4, 1, 0, class188.method1193(this.field6941, this.field6939, 51), 1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lgu;I)V")
    public final void method49(class126 arg0, int arg1) {
        super.method49(arg0, arg1);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lhv;IIZ[III)V")
    public class229(class188 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class532.field7430, class280.field3663, arg3 && arg0.field2427, arg1 * arg2);
        if (this.field6940.field2431) {
            this.field2929 = arg1;
            this.field2931 = arg2;
        } else {
            this.field2929 = class468.method2685(arg1, false);
            this.field2931 = class468.method2685(arg2, false);
        }
        if (arg3) {
            this.field2930 = this.field6940.field2418.method2390(this.field2929, this.field2931, 0, 1024, 21, 1);
        } else {
            this.field2930 = this.field6940.field2418.method2390(this.field2929, this.field2931, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field6940.field2434;
        int var9 = this.field2930.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class399.method2379(var9, 28658)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method2377(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2377(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field2930.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZIZ)V")
    public final void method1052(boolean arg0, int arg1, boolean arg2) {
        this.field2933 = arg0;
        this.field2932 = arg2;
        if (arg1 != -25920) {
            this.field2933 = true;
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1127(int arg0) {
        int var2 = 45 % ((-arg0 - 37) / 62);
        return this.field2930;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I")
    public final int method1059(int arg0) {
        if (arg0 != -23624) {
            this.field2933 = false;
        }
        return this.field2931;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III[IIIII)V")
    public final void method1055(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class532.field7430 != this.field6941 || class280.field3663 != this.field6939) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field6940.field2434;
        int var10 = this.field2930.LockRect(0, arg4, arg7, arg6, arg5, 0, var9);
        if (class399.method2379(var10, 28658)) {
            int var11 = var9.getRowPitch();
            if ((arg6 * 4) == var11 && arg2 == arg6) {
                var9.method2377(arg3, arg0, 0, arg5 * arg6);
            } else {
                for (int var12 = 0; var12 < arg5; var12++) {
                    var9.method2377(arg3, arg0 + (arg2 * var12), var11 * var12, arg6);
                }
            }
            this.field2930.UnlockRect(0);
        }
        if (arg1 != 30519) {
            this.field2933 = true;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public final void method50(int arg0) {
        if (arg0 != -23983) {
            this.method50(100);
        }
        this.field6940.method1199(-14945, this);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z")
    public final boolean method1057(int arg0) {
        if (arg0 <= 41) {
            this.field2932 = false;
        }
        return true;
    }
}

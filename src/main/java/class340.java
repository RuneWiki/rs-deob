import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class441;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class340 extends class346 implements class228 {

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    private int field4431;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    private int field4427;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field4428;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "Z")
    public boolean field4429;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "Z")
    public boolean field4430;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)I", line = 4)
    public final int method1328(int arg0) {
        return arg0 >= -13 ? -81 : this.field4427;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lgb;IIZ[III)V", line = 13)
    public class340(class197 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class581.field8260, class271.field3429, arg3 && arg0.field2388, arg1 * arg2);
        if (this.field4512.field2372) {
            this.field4427 = arg2;
            this.field4431 = arg1;
        } else {
            this.field4431 = class146.method799(arg1, -117);
            this.field4427 = class146.method799(arg2, -117);
        }
        if (arg3) {
            this.field4428 = this.field4512.field2376.method2432(this.field4431, this.field4427, 0, 1024, 21, 1);
        } else {
            this.field4428 = this.field4512.field2376.method2432(this.field4431, this.field4427, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field4512.field2377;
        int var9 = this.field4428.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class441.method2451(var9, (byte) -90)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method2449(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2449(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field4428.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lgb;Lvj;Lnb;II)V", line = 69)
    public class340(class197 arg0, class402 arg1, class271 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field4512.field2372) {
            this.field4431 = arg3;
            this.field4427 = arg4;
        } else {
            this.field4431 = class146.method799(arg3, -121);
            this.field4427 = class146.method799(arg4, -123);
        }
        this.field4428 = this.field4512.field2376.method2432(arg3, arg4, 1, 0, class197.method1158(this.field4514, this.field4515, -1), 1);
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)I", line = 89)
    public final int method1330(int arg0) {
        return arg0 == -32601 ? this.field4431 : -86;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(FI)F", line = 99)
    public final float method1332(float arg0, int arg1) {
        if (arg1 != 30994) {
            this.field4430 = false;
        }
        return arg0 / (float) this.field4431;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZZ)V", line = 109)
    public final void method1331(int arg0, boolean arg1, boolean arg2) {
        if (arg0 == -7684) {
            this.field4429 = arg1;
            this.field4430 = arg2;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 120)
    public final IDirect3DBaseTexture method1900(byte arg0) {
        return arg0 < 54 ? (IDirect3DBaseTexture) null : this.field4428;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)Z", line = 130)
    public final boolean method1327(int arg0) {
        if (arg0 != 12832) {
            this.field4427 = -50;
        }
        return true;
    }

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)V", line = 140)
    public final void method841(int arg0) {
        if (arg0 > -124) {
            this.method1326(-105, 0.6932949F);
        }
        this.field4512.method1182((byte) 125, this);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIIIB[I)V", line = 150)
    public final void method1329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int[] arg7) {
        if (class581.field8260 != this.field4515 || class271.field3429 != this.field4514) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field4512.field2377;
        int var10 = -33 % ((arg6 - 58) / 58);
        int var11 = this.field4428.LockRect(0, arg4, arg0, arg5, arg3, 0, var9);
        if (!class441.method2451(var11, (byte) -126)) {
            return;
        }
        int var12 = var9.getRowPitch();
        if (arg5 * 4 == var12 && arg2 == arg5) {
            var9.method2449(arg7, arg1, 0, arg3 * arg5);
        } else {
            for (int var13 = 0; var13 < arg3; var13++) {
                var9.method2449(arg7, arg1 + (arg2 * var13), var12 * var13, arg5);
            }
        }
        this.field4428.UnlockRect(0);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILup;)V", line = 190)
    public final void method842(int arg0, class249 arg1) {
        if (arg0 != 16327) {
            this.field4430 = true;
        }
        super.method842(arg0 ^ 0x0, arg1);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIII[BLvj;III)V", line = 200)
    public final void method1325(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class402 arg5, int arg6, int arg7, int arg8) {
        if (arg0 != -24967) {
            return;
        }
        if (this.field4515 != arg5 || class271.field3429 != this.field4514) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field4512.field2377;
        int var11 = this.field4428.LockRect(0, arg8, arg1, arg2, arg3, 0, var10);
        if (!class441.method2451(var11, (byte) -126)) {
            return;
        }
        int var12 = this.field4515.field5354 * arg6;
        int var13 = this.field4515.field5354 * arg2;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2446(arg4, arg7, 0, arg3 * var13);
        } else {
            for (int var15 = 0; var15 < arg3; var15++) {
                var10.method2446(arg4, var12 * var15 + arg7, var14 * var15, var13);
            }
        }
        this.field4428.UnlockRect(0);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IF)F", line = 242)
    public final float method1326(int arg0, float arg1) {
        return arg0 == 30658 ? arg1 / (float) this.field4427 : 2.3595622F;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lgb;Lvj;IIZ[BII)V", line = 254)
    public class340(class197 arg0, class402 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class271.field3429, arg4 && arg0.field2388, arg2 * arg3);
        if (this.field4512.field2372) {
            this.field4431 = arg2;
            this.field4427 = arg3;
        } else {
            this.field4431 = class146.method799(arg2, -120);
            this.field4427 = class146.method799(arg3, -113);
        }
        if (arg4) {
            this.field4428 = this.field4512.field2376.method2432(this.field4431, this.field4427, 0, 1024, class197.method1158(class271.field3429, this.field4515, -1), 1);
        } else {
            this.field4428 = this.field4512.field2376.method2432(this.field4431, this.field4427, 1, 0, class197.method1158(class271.field3429, this.field4515, -1), 1);
        }
        PixelBuffer var9 = this.field4512.field2377;
        int var10 = this.field4428.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class441.method2451(var10, (byte) -41)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field4515.field5354 * arg2;
            int var12 = this.field4515.field5354 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2446(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2446(arg5, var12 * var14 + arg6, var13 * var14, var11);
                }
            }
            this.field4428.UnlockRect(0);
        }
    }
}

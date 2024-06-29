import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class771;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public class class671 extends class371 implements class471 {

    @OriginalMember(owner = "client!mja", name = "j", descriptor = "I")
    private int field8703;

    @OriginalMember(owner = "client!mja", name = "f", descriptor = "I")
    private int field8699;

    @OriginalMember(owner = "client!mja", name = "h", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field8701;

    @OriginalMember(owner = "client!mja", name = "g", descriptor = "Z")
    public boolean field8700;

    @OriginalMember(owner = "client!mja", name = "i", descriptor = "Z")
    public boolean field8702;

    @OriginalMember(owner = "client!mja", name = "c", descriptor = "(I)I", line = 5)
    public final int method1133(int arg0) {
        if (arg0 != 28215) {
            this.method773((byte) -99);
        }
        return this.field8699;
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(ZF)F", line = 15)
    public final float method1125(boolean arg0, float arg1) {
        if (!arg0) {
            this.method773((byte) 27);
        }
        return arg1 / (float) this.field8703;
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IF)F", line = 25)
    public final float method1129(int arg0, float arg1) {
        if (arg0 >= -116) {
            this.field8701 = null;
        }
        return arg1 / (float) this.field8699;
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(I)I", line = 36)
    public final int method1127(int arg0) {
        int var2 = 58 % ((arg0 + 4) / 38);
        return this.field8703;
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "([IIIIIII)V", line = 45)
    public final void method1135(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 92 / ((40 - arg5) / 38);
        if (class417.field5505 != this.field4540 || class73.field990 != this.field4543) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field4541.field3387;
        int var10 = this.field8701.LockRect(0, arg2, arg3, arg6, arg4, 16, var9);
        if (!class771.method4195(false, var10)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if (arg6 * 4 == var11) {
            var9.method4168(arg0, arg1, 0, arg0.length);
        } else {
            for (int var12 = 0; var12 < arg4; var12++) {
                var9.method4168(arg0, arg1 + (arg6 * var12), var11 * var12, arg6);
            }
        }
        this.field8701.UnlockRect(0);
    }

    @OriginalMember(owner = "client!mja", name = "b", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 83)
    public final IDirect3DBaseTexture method2125(byte arg0) {
        if (arg0 >= -103) {
            this.field8703 = -9;
        }
        return this.field8701;
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(ZZI)V", line = 93)
    public final void method1131(boolean arg0, boolean arg1, int arg2) {
        if (arg2 > 37) {
            this.field8700 = arg1;
            this.field8702 = arg0;
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(B)V", line = 104)
    public final void method773(byte arg0) {
        this.field4541.method1610(this, 106);
        if (arg0 >= -12) {
            this.field8701 = null;
        }
    }

    @OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Lcka;Ltn;Lds;II)V", line = 113)
    public class671(class248 arg0, class749 arg1, class73 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field4541.field3381) {
            this.field8703 = arg3;
            this.field8699 = arg4;
        } else {
            this.field8703 = class483.method2714(arg3, (byte) -112);
            this.field8699 = class483.method2714(arg4, (byte) -113);
        }
        this.field8701 = this.field4541.field3402.method4179(arg3, arg4, 1, 0, class248.method1620(-116, this.field4543, this.field4540), 1);
    }

    @OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Lcka;Ltn;IIZ[BII)V", line = 132)
    public class671(class248 arg0, class749 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class73.field990, arg4 && arg0.field3388, arg2 * arg3);
        if (this.field4541.field3381) {
            this.field8703 = arg2;
            this.field8699 = arg3;
        } else {
            this.field8703 = class483.method2714(arg2, (byte) -124);
            this.field8699 = class483.method2714(arg3, (byte) -120);
        }
        if (arg4) {
            this.field8701 = this.field4541.field3402.method4179(this.field8703, this.field8699, 0, 1024, class248.method1620(-84, class73.field990, this.field4540), 1);
        } else {
            this.field8701 = this.field4541.field3402.method4179(this.field8703, this.field8699, 1, 0, class248.method1620(-85, class73.field990, this.field4540), 1);
        }
        PixelBuffer var9 = this.field4541.field3387;
        int var10 = this.field8701.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class771.method4195(false, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field4540.field10221 * arg2;
            int var12 = this.field4540.field10221 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2529(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2529(arg5, var12 * var14 + arg6, var13 * var14, var11);
                }
            }
            this.field8701.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Lcka;IIZ[III)V", line = 192)
    public class671(class248 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class417.field5505, class73.field990, arg3 && arg0.field3388, arg1 * arg2);
        if (this.field4541.field3381) {
            this.field8703 = arg1;
            this.field8699 = arg2;
        } else {
            this.field8703 = class483.method2714(arg1, (byte) -121);
            this.field8699 = class483.method2714(arg2, (byte) -125);
        }
        if (arg3) {
            this.field8701 = this.field4541.field3402.method4179(this.field8703, this.field8699, 0, 1024, 21, 1);
        } else {
            this.field8701 = this.field4541.field3402.method4179(this.field8703, this.field8699, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field4541.field3387;
        int var9 = this.field8701.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class771.method4195(false, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method4169(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method4169(arg4, arg5 + (arg6 * var11), var10 * var11, arg1);
                }
            }
            this.field8701.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!mja", name = "b", descriptor = "(I)Z", line = 249)
    public final boolean method1132(int arg0) {
        if (arg0 != 30365) {
            this.method773((byte) -48);
        }
        return true;
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(ILtn;IIBI[BII)V", line = 260)
    public final void method1126(int arg0, class749 arg1, int arg2, int arg3, byte arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        int var10 = -107 / ((50 - arg4) / 34);
        if (this.field4540 != arg1 || class73.field990 != this.field4543) {
            throw new RuntimeException();
        }
        PixelBuffer var11 = this.field4541.field3387;
        int var12 = this.field8701.LockRect(0, arg7, arg3, arg8, arg5, 0, var11);
        if (!class771.method4195(false, var12)) {
            return;
        }
        int var13 = this.field4540.field10221 * arg8;
        int var14 = this.field4540.field10221 * arg2;
        int var15 = var11.getRowPitch();
        if (var13 == var15 && var13 == var14) {
            var11.method2529(arg6, arg0, 0, arg5 * var13);
        } else {
            for (int var16 = 0; var16 < arg5; var16++) {
                var11.method2529(arg6, var14 * var16 + arg0, var15 * var16, var13);
            }
        }
        this.field8701.UnlockRect(0);
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(BLqt;)V", line = 301)
    public final void method774(byte arg0, class525 arg1) {
        int var3 = -96 % ((arg0 + 66) / 35);
        super.method774((byte) 22, arg1);
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(Z[IIIIIII)V", line = 310)
    public final void method1124(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class417.field5505 != this.field4540 || class73.field990 != this.field4543) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field4541.field3387;
        int var10 = this.field8701.LockRect(0, arg2, arg4, arg5, arg3, 0, var9);
        if (class771.method4195(false, var10)) {
            int var11 = var9.getRowPitch();
            if (arg5 * 4 == var11 && arg5 == arg7) {
                var9.method4169(arg1, arg6, 0, arg3 * arg5);
            } else {
                for (int var12 = 0; var12 < arg3; var12++) {
                    var9.method4169(arg1, arg7 * var12 + arg6, var11 * var12, arg5);
                }
            }
            this.field8701.UnlockRect(0);
        }
        if (!arg0) {
            this.field8701 = null;
        }
    }
}

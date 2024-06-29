import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class447;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class451 extends class430 implements class29 {

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    private int field6776;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    private int field6779;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field6777;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Z")
    public boolean field6778;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Z")
    public boolean field6780;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)Z")
    public final boolean method366(int arg0) {
        if (arg0 != -4758) {
            this.field6780 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lto;Los;IIZ[BII)V")
    public class451(class8 arg0, class408 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class134.field2197, arg4 && arg0.field141, arg2 * arg3);
        if (this.field6547.field144) {
            this.field6776 = arg2;
            this.field6779 = arg3;
        } else {
            this.field6776 = class413.method2636(arg2, 127);
            this.field6779 = class413.method2636(arg3, 127);
        }
        if (arg4) {
            this.field6777 = this.field6547.field131.method2816(this.field6776, this.field6779, 0, 1024, class8.method165((byte) -89, class134.field2197, this.field6549), 1);
        } else {
            this.field6777 = this.field6547.field131.method2816(this.field6776, this.field6779, 1, 0, class8.method165((byte) -112, class134.field2197, this.field6549), 1);
        }
        PixelBuffer var9 = this.field6547.field148;
        int var10 = this.field6777.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class447.method2814(var10, 141953135)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field6549.field6299 * arg2;
            int var12 = this.field6549.field6299 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2834(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2834(arg5, var12 * var14 + arg6, var13 * var14, var11);
                }
            }
            this.field6777.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IF)F")
    public final float method365(int arg0, float arg1) {
        if (arg0 >= -90) {
            this.field6778 = false;
        }
        return arg1 / (float) this.field6776;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method575(byte arg0) {
        int var2 = -98 % ((-arg0 - 83) / 34);
        return this.field6777;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public final void method247(int arg0) {
        if (arg0 != -4112) {
            this.field6780 = true;
        }
        this.field6547.method107(19, this);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I")
    public final int method369(int arg0) {
        if (arg0 <= 52) {
            this.method362(43, null, -22, 39, null, -40, -103, -16, 25);
        }
        return this.field6779;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II[IIIIII)V")
    public final void method372(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class86.field1055 != this.field6549 || class134.field2197 != this.field6548) {
            throw new RuntimeException();
        } else if (arg0 == 13353) {
            PixelBuffer var9 = this.field6547.field148;
            int var10 = this.field6777.LockRect(0, arg5, arg7, arg1, arg6, 0, var9);
            if (class447.method2814(var10, 141953135)) {
                int var11 = var9.getRowPitch();
                if ((arg1 * 4) == var11 && arg1 == arg4) {
                    var9.method2837(arg2, arg3, 0, arg1 * arg6);
                } else {
                    for (int var12 = 0; var12 < arg6; var12++) {
                        var9.method2837(arg2, arg4 * var12 + arg3, var11 * var12, arg1);
                    }
                }
                this.field6777.UnlockRect(0);
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lto;IIZ[III)V")
    public class451(class8 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class86.field1055, class134.field2197, arg3 && arg0.field141, arg1 * arg2);
        if (this.field6547.field144) {
            this.field6776 = arg1;
            this.field6779 = arg2;
        } else {
            this.field6776 = class413.method2636(arg1, 127);
            this.field6779 = class413.method2636(arg2, 127);
        }
        if (arg3) {
            this.field6777 = this.field6547.field131.method2816(this.field6776, this.field6779, 0, 1024, 21, 1);
        } else {
            this.field6777 = this.field6547.field131.method2816(this.field6776, this.field6779, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field6547.field148;
        int var9 = this.field6777.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class447.method2814(var9, 141953135)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method2837(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2837(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field6777.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ldca;B)V")
    public final void method246(class161 arg0, byte arg1) {
        super.method246(arg0, (byte) 123);
        int var3 = -15 / ((64 - arg1) / 39);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lto;Los;Lmg;II)V")
    public class451(class8 arg0, class408 arg1, class134 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field6547.field144) {
            this.field6779 = arg4;
            this.field6776 = arg3;
        } else {
            this.field6776 = class413.method2636(arg3, 127);
            this.field6779 = class413.method2636(arg4, 127);
        }
        this.field6777 = this.field6547.field131.method2816(arg3, arg4, 1, 0, class8.method165((byte) -107, this.field6548, this.field6549), 1);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILos;II[BIIII)V")
    public final void method362(int arg0, class408 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != 3348) {
            this.method369(-65);
        }
        if (this.field6549 != arg1 || class134.field2197 != this.field6548) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field6547.field148;
        int var11 = this.field6777.LockRect(0, arg0, arg2, arg5, arg6, 0, var10);
        if (!class447.method2814(var11, arg3 + 141949787)) {
            return;
        }
        int var12 = this.field6549.field6299 * arg5;
        int var13 = this.field6549.field6299 * arg8;
        int var14 = var10.getRowPitch();
        if (var12 == var14 && var12 == var13) {
            var10.method2834(arg4, arg7, 0, arg6 * var12);
        } else {
            for (int var15 = 0; var15 < arg6; var15++) {
                var10.method2834(arg4, var13 * var15 + arg7, var14 * var15, var12);
            }
        }
        this.field6777.UnlockRect(0);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FB)F")
    public final float method373(float arg0, byte arg1) {
        if (arg1 >= -59) {
            this.method365(-48, -0.08497839F);
        }
        return arg0 / (float) this.field6779;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZZB)V")
    public final void method364(boolean arg0, boolean arg1, byte arg2) {
        int var4 = -107 / ((53 - arg2) / 47);
        this.field6778 = arg1;
        this.field6780 = arg0;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)I")
    public final int method371(int arg0) {
        return arg0 >= -60 ? -20 : this.field6776;
    }
}

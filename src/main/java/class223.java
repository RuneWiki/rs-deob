import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class223 extends class134 {

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "Z")
    public boolean field3583;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "[Lgl;")
    public class223[] field3593;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "[I")
    public static int[] field3574 = new int[32];

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "[I")
    public static int[] field3589 = new int[5];

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public int field3576;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "Log;")
    public class235 field3588;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Lfj;")
    public class268 field3572;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "Lub;")
    public static class92 field3579;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)[I")
    public int[] method40(byte arg0, int arg1) {
        field3585++;
        if (arg0 <= 14) {
            this.method40((byte) 108, 116);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)I")
    public int method797(int arg0) {
        field3578++;
        return arg0 == -9338 ? -1 : -3;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1530(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3586++;
        if (arg0 == -63 && class48.method401(109, arg7)) {
            client.method1148(class8.field144[arg7], -1, arg6, arg5, arg4, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)I")
    public int method405(byte arg0) {
        field3592++;
        if (arg0 != -90) {
            this.method40((byte) 108, 112);
        }
        return -1;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZILcc;I)V")
    public static final void method1531(boolean arg0, int arg1, class222 arg2, int arg3) {
        if (arg0) {
            return;
        }
        field3580++;
        if (arg2.field3387 == 0) {
            arg2.field3401 = arg2.field3508;
        } else if (arg2.field3387 == 1) {
            arg2.field3401 = (arg1 - arg2.field3561) / 2 + arg2.field3508;
        } else if (arg2.field3387 == 2) {
            arg2.field3401 = arg1 - arg2.field3561 - arg2.field3508;
        } else if (arg2.field3387 == 3) {
            arg2.field3401 = arg2.field3508 * arg1 >> 14;
        } else if (arg2.field3387 == 4) {
            arg2.field3401 = (arg2.field3508 * arg1 >> 14) + (arg1 - arg2.field3561) / 2;
        } else {
            arg2.field3401 = arg1 - arg2.field3561 - (arg2.field3508 * arg1 >> 14);
        }
        if (arg2.field3445 == 0) {
            arg2.field3515 = arg2.field3564;
        } else if (arg2.field3445 == 1) {
            arg2.field3515 = (arg3 - arg2.field3408) / 2 + arg2.field3564;
        } else if (arg2.field3445 == 2) {
            arg2.field3515 = arg3 - arg2.field3408 - arg2.field3564;
        } else if (arg2.field3445 == 3) {
            arg2.field3515 = arg2.field3564 * arg3 >> 14;
        } else if (arg2.field3445 == 4) {
            arg2.field3515 = (arg3 - arg2.field3408) / 2 + (arg2.field3564 * arg3 >> 14);
        } else {
            arg2.field3515 = arg3 - ((arg2.field3564 * arg3 >> 14) + arg2.field3408);
        }
        if (!class136.field2057) {
            return;
        }
        if (client.method1159(arg2).field477 == 0 && arg2.field3552 != 0) {
            return;
        }
        if (arg2.field3515 < 0) {
            arg2.field3515 = 0;
        } else if (arg3 < (arg2.field3515 + arg2.field3408)) {
            arg2.field3515 = arg3 - arg2.field3408;
        }
        if (arg2.field3401 < 0) {
            arg2.field3401 = 0;
            return;
        }
        if (arg2.field3561 + arg2.field3401 > arg1) {
            arg2.field3401 = arg1 - arg2.field3561;
            return;
        }
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
    public void method43(int arg0) {
        if (arg0 != 500) {
            this.field3593 = null;
        }
        field3575++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public static void method1532(boolean arg0) {
        if (arg0) {
            method1530((byte) 67, -19, -80, 16, -99, -72, -4, 103);
        }
        field3589 = null;
        field3574 = null;
        field3579 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)[I")
    public final int[] method1533(int arg0, int arg1, int arg2) {
        field3590++;
        if (arg2 > -60) {
            this.field3572 = null;
        }
        return this.field3593[arg0].field3583 ? this.field3593[arg0].method40((byte) 68, arg1) : this.field3593[arg0].method135(124, arg1)[0];
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)V")
    public void method409(int arg0) {
        field3584++;
        if (this.field3583) {
            this.field3588.method1610(121);
            this.field3588 = null;
        } else {
            this.field3572.method1819(116);
            this.field3572 = null;
        }
        if (arg0 <= 64) {
            this.method135(-41, -81);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[[I")
    public int[][] method135(int arg0, int arg1) {
        field3582++;
        if (arg0 >= 0) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lha;IB)V")
    public void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 == 102) {
            field3587++;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZII)[[I")
    public final int[][] method1534(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.method405((byte) 11);
        }
        field3591++;
        if (this.field3593[arg1].field3583) {
            int[] var4 = this.field3593[arg1].method40((byte) 124, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3593[arg1].method135(41, arg2);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1535(int arg0, Component arg1) {
        arg1.removeKeyListener(class236.field3730);
        field3581++;
        if (arg0 != 28468) {
            method1531(false, -128, (class222) null, -90);
        }
        arg1.removeFocusListener(class236.field3730);
        class164.field2477 = -1;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(IZ)V")
    public class223(int arg0, boolean arg1) {
        this.field3583 = arg1;
        this.field3593 = new class223[arg0];
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(III)V")
    public final void method1536(int arg0, int arg1, int arg2) {
        field3577++;
        int var4 = this.field3576 == arg1 ? arg2 : this.field3576;
        if (this.field3583) {
            this.field3588 = new class235(var4, arg2, arg0);
        } else {
            this.field3572 = new class268(var4, arg2, arg0);
        }
    }
}

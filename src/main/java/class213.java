import java.awt.Canvas;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class213 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Z")
    public boolean field3411 = false;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public int field3418 = 0;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public int field3427 = 0;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public int field3423 = -1;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "B")
    public byte field3424 = 0;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public int field3422 = 0;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public int field3451 = 1;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
    public int field3468 = 0;

    @OriginalMember(owner = "client!rb", name = "lb", descriptor = "I")
    public int field3474 = 0;

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
    public int field3467 = 0;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public int field3419 = 0;

    @OriginalMember(owner = "client!rb", name = "rb", descriptor = "I")
    public int field3480 = 0;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    public int field3458 = 0;

    @OriginalMember(owner = "client!rb", name = "kb", descriptor = "I")
    private int field3473 = -1;

    @OriginalMember(owner = "client!rb", name = "Ab", descriptor = "I")
    public int field3489 = -1;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    public int field3440 = 0;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    private int field3447 = 1;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public int field3439 = 0;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public int field3416 = 0;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public int field3428 = -1;

    @OriginalMember(owner = "client!rb", name = "Ub", descriptor = "Z")
    public boolean field3509 = false;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public int field3438 = -1;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
    public int field3465 = 0;

    @OriginalMember(owner = "client!rb", name = "Eb", descriptor = "I")
    public int field3493 = 0;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    public int field3449 = 0;

    @OriginalMember(owner = "client!rb", name = "nb", descriptor = "I")
    public int field3476 = 0;

    @OriginalMember(owner = "client!rb", name = "wb", descriptor = "I")
    public int field3485 = 0;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public int field3443 = 0;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "Lrb;")
    public class213 field3446 = null;

    @OriginalMember(owner = "client!rb", name = "Jb", descriptor = "I")
    public int field3498 = -1;

    @OriginalMember(owner = "client!rb", name = "ec", descriptor = "I")
    public int field3519 = 0;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public int field3452 = 0;

    @OriginalMember(owner = "client!rb", name = "Xb", descriptor = "I")
    public int field3512 = 0;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "I")
    public int field3464 = 0;

    @OriginalMember(owner = "client!rb", name = "vb", descriptor = "I")
    public int field3484 = 1;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "Z")
    public boolean field3466 = false;

    @OriginalMember(owner = "client!rb", name = "pb", descriptor = "Z")
    public boolean field3478 = false;

    @OriginalMember(owner = "client!rb", name = "Db", descriptor = "Lqd;")
    public class40 field3492 = class249.field4123;

    @OriginalMember(owner = "client!rb", name = "zc", descriptor = "I")
    public int field3540 = 0;

    @OriginalMember(owner = "client!rb", name = "fc", descriptor = "Z")
    public boolean field3520 = false;

    @OriginalMember(owner = "client!rb", name = "Ac", descriptor = "I")
    public int field3541 = 0;

    @OriginalMember(owner = "client!rb", name = "bc", descriptor = "I")
    public int field3516 = 0;

    @OriginalMember(owner = "client!rb", name = "Hb", descriptor = "I")
    public int field3496 = 1;

    @OriginalMember(owner = "client!rb", name = "sb", descriptor = "I")
    public int field3481 = 100;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public int field3421 = -1;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    public int field3442 = 0;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "Z")
    public boolean field3441 = false;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Z")
    public boolean field3417 = false;

    @OriginalMember(owner = "client!rb", name = "yc", descriptor = "B")
    public byte field3539 = 0;

    @OriginalMember(owner = "client!rb", name = "pc", descriptor = "I")
    public int field3530 = 0;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public int field3437 = 0;

    @OriginalMember(owner = "client!rb", name = "tb", descriptor = "I")
    public int field3482 = 0;

    @OriginalMember(owner = "client!rb", name = "vc", descriptor = "I")
    public int field3536 = 0;

    @OriginalMember(owner = "client!rb", name = "xb", descriptor = "Z")
    public boolean field3486 = false;

    @OriginalMember(owner = "client!rb", name = "Ob", descriptor = "I")
    public int field3503 = -1;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public int field3455 = 0;

    @OriginalMember(owner = "client!rb", name = "lc", descriptor = "I")
    public int field3526 = -1;

    @OriginalMember(owner = "client!rb", name = "Nc", descriptor = "I")
    public int field3554 = 0;

    @OriginalMember(owner = "client!rb", name = "Uc", descriptor = "Z")
    public boolean field3561 = true;

    @OriginalMember(owner = "client!rb", name = "Kc", descriptor = "I")
    public int field3551 = 0;

    @OriginalMember(owner = "client!rb", name = "uc", descriptor = "Lqd;")
    public class40 field3535 = class249.field4123;

    @OriginalMember(owner = "client!rb", name = "Oc", descriptor = "I")
    public int field3555 = 0;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "Z")
    public boolean field3448 = false;

    @OriginalMember(owner = "client!rb", name = "qc", descriptor = "Lqd;")
    public class40 field3531 = class249.field4123;

    @OriginalMember(owner = "client!rb", name = "Xc", descriptor = "I")
    public int field3564 = -1;

    @OriginalMember(owner = "client!rb", name = "Zb", descriptor = "I")
    public int field3514 = 0;

    @OriginalMember(owner = "client!rb", name = "Vc", descriptor = "Z")
    public boolean field3562 = false;

    @OriginalMember(owner = "client!rb", name = "zb", descriptor = "I")
    public int field3488 = 0;

    @OriginalMember(owner = "client!rb", name = "Zc", descriptor = "I")
    public int field3566 = 0;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public int field3456 = 0;

    @OriginalMember(owner = "client!rb", name = "dd", descriptor = "I")
    public int field3570 = 0;

    @OriginalMember(owner = "client!rb", name = "Qc", descriptor = "I")
    public int field3557 = 0;

    @OriginalMember(owner = "client!rb", name = "ed", descriptor = "I")
    public int field3571 = 0;

    @OriginalMember(owner = "client!rb", name = "Fb", descriptor = "I")
    public int field3494 = -1;

    @OriginalMember(owner = "client!rb", name = "cc", descriptor = "Lqd;")
    public class40 field3517 = class249.field4123;

    @OriginalMember(owner = "client!rb", name = "Rc", descriptor = "Lqd;")
    public class40 field3558 = class54.field1064;

    @OriginalMember(owner = "client!rb", name = "yb", descriptor = "S")
    public short field3487 = 0;

    @OriginalMember(owner = "client!rb", name = "jd", descriptor = "Z")
    public boolean field3576 = false;

    @OriginalMember(owner = "client!rb", name = "kd", descriptor = "Z")
    public boolean field3577 = false;

    @OriginalMember(owner = "client!rb", name = "bd", descriptor = "I")
    public int field3568 = 0;

    @OriginalMember(owner = "client!rb", name = "Dc", descriptor = "I")
    public int field3544 = 0;

    @OriginalMember(owner = "client!rb", name = "md", descriptor = "I")
    public int field3579 = 1;

    @OriginalMember(owner = "client!rb", name = "Vb", descriptor = "I")
    public int field3510 = 0;

    @OriginalMember(owner = "client!rb", name = "Sb", descriptor = "I")
    public int field3507 = -1;

    @OriginalMember(owner = "client!rb", name = "Nb", descriptor = "I")
    public int field3502 = 0;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public int field3430 = 0;

    @OriginalMember(owner = "client!rb", name = "nd", descriptor = "B")
    public byte field3580 = 0;

    @OriginalMember(owner = "client!rb", name = "xc", descriptor = "S")
    public short field3538 = 3000;

    @OriginalMember(owner = "client!rb", name = "gc", descriptor = "I")
    public int field3521 = -1;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public int field3420 = -1;

    @OriginalMember(owner = "client!rb", name = "nc", descriptor = "B")
    public byte field3528 = 0;

    @OriginalMember(owner = "client!rb", name = "id", descriptor = "I")
    public int field3575 = -1;

    @OriginalMember(owner = "client!rb", name = "ic", descriptor = "Z")
    public boolean field3523 = false;

    @OriginalMember(owner = "client!rb", name = "rd", descriptor = "Lqd;")
    public class40 field3584 = class249.field4123;

    @OriginalMember(owner = "client!rb", name = "Yc", descriptor = "I")
    public int field3565 = 0;

    @OriginalMember(owner = "client!rb", name = "gb", descriptor = "Z")
    public boolean field3469 = false;

    @OriginalMember(owner = "client!rb", name = "qd", descriptor = "I")
    public int field3583 = 0;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "Lqd;")
    public static class40 field3444 = class147.method1106("Verbindung abgebrochen)3", (byte) -45);

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "[I")
    public static int[] field3463 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "Lqd;")
    public static class40 field3450 = class147.method1106("Hidden)2", (byte) -56);

    @OriginalMember(owner = "client!rb", name = "dc", descriptor = "Lqd;")
    public static class40 field3518 = class147.method1106(")1", (byte) -94);

    @OriginalMember(owner = "client!rb", name = "Ib", descriptor = "I")
    public static int field3497 = 0;

    @OriginalMember(owner = "client!rb", name = "Ic", descriptor = "Lqd;")
    public static class40 field3549 = class147.method1106(":assist:", (byte) -47);

    @OriginalMember(owner = "client!rb", name = "ad", descriptor = "I")
    public static int field3567 = 0;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!rb", name = "Kb", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!rb", name = "hc", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!rb", name = "kc", descriptor = "I")
    public int field3525;

    @OriginalMember(owner = "client!rb", name = "oc", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!rb", name = "tc", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!rb", name = "Fc", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!rb", name = "Gc", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!rb", name = "Mc", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!rb", name = "cd", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!rb", name = "gd", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!rb", name = "ld", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!rb", name = "pd", descriptor = "Lqd;")
    public static class40 field3582;

    @OriginalMember(owner = "client!rb", name = "hb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3470;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Z")
    public boolean field3413;

    @OriginalMember(owner = "client!rb", name = "Tc", descriptor = "Z")
    public boolean field3560;

    @OriginalMember(owner = "client!rb", name = "Cc", descriptor = "[B")
    public byte[] field3543;

    @OriginalMember(owner = "client!rb", name = "Pc", descriptor = "[B")
    public byte[] field3556;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "[I")
    public int[] field3425;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "[I")
    public int[] field3459;

    @OriginalMember(owner = "client!rb", name = "ib", descriptor = "[I")
    public int[] field3471;

    @OriginalMember(owner = "client!rb", name = "jb", descriptor = "[I")
    public int[] field3472;

    @OriginalMember(owner = "client!rb", name = "mb", descriptor = "[I")
    public int[] field3475;

    @OriginalMember(owner = "client!rb", name = "ob", descriptor = "[I")
    public int[] field3477;

    @OriginalMember(owner = "client!rb", name = "Tb", descriptor = "[I")
    public int[] field3508;

    @OriginalMember(owner = "client!rb", name = "Wb", descriptor = "[I")
    public int[] field3511;

    @OriginalMember(owner = "client!rb", name = "ac", descriptor = "[I")
    public int[] field3515;

    @OriginalMember(owner = "client!rb", name = "rc", descriptor = "[I")
    public int[] field3532;

    @OriginalMember(owner = "client!rb", name = "sc", descriptor = "[I")
    public int[] field3533;

    @OriginalMember(owner = "client!rb", name = "Ec", descriptor = "[I")
    public int[] field3545;

    @OriginalMember(owner = "client!rb", name = "Sc", descriptor = "[I")
    public int[] field3559;

    @OriginalMember(owner = "client!rb", name = "fd", descriptor = "[I")
    public int[] field3572;

    @OriginalMember(owner = "client!rb", name = "Wc", descriptor = "[Lda;")
    public static class114[] field3563;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "[Lrb;")
    public class213[] field3415;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "[Lqd;")
    public class40[] field3432;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "[Lqd;")
    public class40[] field3453;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[Ljava/lang/Object;")
    public Object[] field3412;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "[Ljava/lang/Object;")
    public Object[] field3426;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "[Ljava/lang/Object;")
    public Object[] field3429;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "[Ljava/lang/Object;")
    public Object[] field3433;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "[Ljava/lang/Object;")
    public Object[] field3434;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field3435;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "[Ljava/lang/Object;")
    public Object[] field3436;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "[Ljava/lang/Object;")
    public Object[] field3445;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "[Ljava/lang/Object;")
    public Object[] field3454;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "[Ljava/lang/Object;")
    public Object[] field3460;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "[Ljava/lang/Object;")
    public Object[] field3461;

    @OriginalMember(owner = "client!rb", name = "qb", descriptor = "[Ljava/lang/Object;")
    public Object[] field3479;

    @OriginalMember(owner = "client!rb", name = "ub", descriptor = "[Ljava/lang/Object;")
    public Object[] field3483;

    @OriginalMember(owner = "client!rb", name = "Bb", descriptor = "[Ljava/lang/Object;")
    public Object[] field3490;

    @OriginalMember(owner = "client!rb", name = "Cb", descriptor = "[Ljava/lang/Object;")
    public Object[] field3491;

    @OriginalMember(owner = "client!rb", name = "Gb", descriptor = "[Ljava/lang/Object;")
    public Object[] field3495;

    @OriginalMember(owner = "client!rb", name = "Lb", descriptor = "[Ljava/lang/Object;")
    public Object[] field3500;

    @OriginalMember(owner = "client!rb", name = "Mb", descriptor = "[Ljava/lang/Object;")
    public Object[] field3501;

    @OriginalMember(owner = "client!rb", name = "Pb", descriptor = "[Ljava/lang/Object;")
    public Object[] field3504;

    @OriginalMember(owner = "client!rb", name = "Rb", descriptor = "[Ljava/lang/Object;")
    public Object[] field3506;

    @OriginalMember(owner = "client!rb", name = "Yb", descriptor = "[Ljava/lang/Object;")
    public Object[] field3513;

    @OriginalMember(owner = "client!rb", name = "jc", descriptor = "[Ljava/lang/Object;")
    public Object[] field3524;

    @OriginalMember(owner = "client!rb", name = "mc", descriptor = "[Ljava/lang/Object;")
    public Object[] field3527;

    @OriginalMember(owner = "client!rb", name = "wc", descriptor = "[Ljava/lang/Object;")
    public Object[] field3537;

    @OriginalMember(owner = "client!rb", name = "Bc", descriptor = "[Ljava/lang/Object;")
    public Object[] field3542;

    @OriginalMember(owner = "client!rb", name = "Hc", descriptor = "[Ljava/lang/Object;")
    public Object[] field3548;

    @OriginalMember(owner = "client!rb", name = "Jc", descriptor = "[Ljava/lang/Object;")
    public Object[] field3550;

    @OriginalMember(owner = "client!rb", name = "Lc", descriptor = "[Ljava/lang/Object;")
    public Object[] field3552;

    @OriginalMember(owner = "client!rb", name = "hd", descriptor = "[Ljava/lang/Object;")
    public Object[] field3574;

    @OriginalMember(owner = "client!rb", name = "od", descriptor = "[Ljava/lang/Object;")
    public Object[] field3581;

    @OriginalMember(owner = "client!rb", name = "Qb", descriptor = "[[I")
    public int[][] field3505;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIBI)V", line = 7)
    public static final void method1499(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = 119 / ((72 - arg4) / 35);
        field3522++;
        if (class72.field1275 < arg0 || class220.field3664 > arg2) {
            return;
        }
        boolean var7;
        if (class125.field2164 > arg1) {
            var7 = false;
            arg1 = class125.field2164;
        } else if (arg1 <= class48.field941) {
            var7 = true;
        } else {
            var7 = false;
            arg1 = class48.field941;
        }
        boolean var8;
        if (arg5 < class125.field2164) {
            arg5 = class125.field2164;
            var8 = false;
        } else if (class48.field941 >= arg5) {
            var8 = true;
        } else {
            arg5 = class48.field941;
            var8 = false;
        }
        if (arg0 < class220.field3664) {
            arg0 = class220.field3664;
        } else {
            class150.method1124(arg5, arg1, arg3, true, class37.field694[arg0++]);
        }
        if (arg2 > class72.field1275) {
            arg2 = class72.field1275;
        } else {
            class150.method1124(arg5, arg1, arg3, true, class37.field694[arg2--]);
        }
        if (var7 && var8) {
            for (int var9 = arg0; var9 <= arg2; var9++) {
                int[] var10 = class37.field694[var9];
                var10[arg1] = var10[arg5] = arg3;
            }
        } else if (var7) {
            for (int var11 = arg0; var11 <= arg2; var11++) {
                class37.field694[var11][arg1] = arg3;
            }
        } else if (var8) {
            for (int var12 = arg0; var12 <= arg2; var12++) {
                class37.field694[var12][arg5] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)Z", line = 108)
    public static final boolean method1500(int arg0, int arg1, int arg2, int arg3) {
        if (!class188.method1354(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class78.field1316[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class208.field3331) {
                    if (!class10.method64(var4, var6, var5)) {
                        return false;
                    }
                    if (!class10.method64(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class10.method64(var4, var7, var5)) {
                        return false;
                    }
                    if (!class10.method64(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class10.method64(var4, var8, var5)) {
                    return false;
                }
                if (!class10.method64(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class180.field2939) {
                    if (!class10.method64(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class10.method64(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class10.method64(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class10.method64(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class10.method64(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class10.method64(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class208.field3331) {
                    if (!class10.method64(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class10.method64(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class10.method64(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class10.method64(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class10.method64(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class10.method64(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class180.field2939) {
                    if (!class10.method64(var4, var6, var5)) {
                        return false;
                    }
                    if (!class10.method64(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class10.method64(var4, var7, var5)) {
                        return false;
                    }
                    if (!class10.method64(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class10.method64(var4, var8, var5)) {
                    return false;
                }
                if (!class10.method64(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class10.method64(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class10.method64(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class10.method64(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class10.method64(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class10.method64(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Lcm;", line = 327)
    public final class185 method1501(int arg0, int arg1) {
        class229.field3784 = false;
        field3534++;
        if (arg0 < 0 || this.field3559.length <= arg0) {
            return null;
        }
        int var3 = this.field3559[arg0];
        if (var3 == -1) {
            return null;
        }
        class185 var4 = (class185) class309.field5183.method1345((long) var3, 28150);
        if (arg1 >= -17) {
            return (class185) null;
        } else if (var4 == null) {
            class185 var5 = class122.method924(class8.field129, 0, (byte) -32, var3);
            if (var5 == null) {
                class229.field3784 = true;
            } else {
                class309.field5183.method1350(var5, (long) var3, 78);
            }
            return var5;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lqd;BI)V", line = 367)
    public final void method1502(class40 arg0, byte arg1, int arg2) {
        if (arg1 != -125) {
            this.method1501(17, 110);
        }
        field3462++;
        if (this.field3432 == null || arg2 >= this.field3432.length) {
            class40[] var4 = new class40[arg2 + 1];
            if (this.field3432 != null) {
                for (int var5 = 0; var5 < this.field3432.length; var5++) {
                    var4[var5] = this.field3432[var5];
                }
            }
            this.field3432 = var4;
        }
        this.field3432[arg2] = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lsd;B)V", line = 404)
    public final void method1503(class26 arg0, byte arg1) {
        field3578++;
        this.field3520 = false;
        this.field3525 = arg0.method226(255);
        this.field3456 = arg0.method226(255);
        this.field3510 = arg0.method197(~arg1);
        this.field3474 = arg0.method201(true);
        this.field3555 = arg0.method201(true);
        this.field3540 = arg0.method197(-1);
        this.field3439 = arg0.method197(-1);
        this.field3424 = 0;
        this.field3528 = 0;
        this.field3580 = arg1;
        this.field3539 = 0;
        this.field3544 = arg0.method226(255);
        this.field3421 = arg0.method197(arg1 - 1);
        if (this.field3421 == 65535) {
            this.field3421 = -1;
        } else {
            this.field3421 += this.field3507 & 0xFFFF0000;
        }
        this.field3489 = arg0.method197(~arg1);
        if (this.field3489 == 65535) {
            this.field3489 = -1;
        }
        int var3 = arg0.method226(255);
        if (var3 > 0) {
            this.field3508 = new int[var3];
            this.field3472 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3472[var4] = arg0.method226(255);
                this.field3508[var4] = arg0.method197(-1);
            }
        }
        int var5 = arg0.method226(255);
        if (var5 > 0) {
            this.field3505 = new int[var5][];
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg0.method197(-1);
                this.field3505[var6] = new int[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    this.field3505[var6][var8] = arg0.method197(-1);
                    if (this.field3505[var6][var8] == 65535) {
                        this.field3505[var6][var8] = -1;
                    }
                }
            }
        }
        if (this.field3525 == 0) {
            this.field3437 = arg0.method197(~arg1);
            this.field3441 = arg0.method226(255) == 1;
        }
        if (this.field3525 == 1) {
            arg0.method197(arg1 - 1);
            arg0.method226(255);
        }
        if (this.field3525 == 2) {
            this.field3424 = 3;
            this.field3532 = new int[this.field3540 * this.field3439];
            this.field3528 = 3;
            this.field3471 = new int[this.field3540 * this.field3439];
            int var9 = arg0.method226(arg1 ^ 0xFF);
            if (var9 == 1) {
                this.field3476 |= 0x10000000;
            }
            int var10 = arg0.method226(255);
            if (var10 == 1) {
                this.field3476 |= 0x40000000;
            }
            int var11 = arg0.method226(255);
            if (var11 == 1) {
                this.field3476 |= Integer.MIN_VALUE;
            }
            int var12 = arg0.method226(arg1 ^ 0xFF);
            if (var12 == 1) {
                this.field3476 |= 0x20000000;
            }
            this.field3419 = arg0.method226(255);
            this.field3455 = arg0.method226(255);
            this.field3545 = new int[20];
            this.field3559 = new int[20];
            this.field3533 = new int[20];
            for (int var13 = 0; var13 < 20; var13++) {
                int var14 = arg0.method226(255);
                if (var14 == 1) {
                    this.field3545[var13] = arg0.method201(true);
                    this.field3533[var13] = arg0.method201(true);
                    this.field3559[var13] = arg0.method203(-22066);
                } else {
                    this.field3559[var13] = -1;
                }
            }
            this.field3453 = new class40[5];
            for (int var15 = 0; var15 < 5; var15++) {
                class40 var16 = arg0.method251((byte) 77);
                if (var16.method350(true) > 0) {
                    this.field3453[var15] = var16;
                    this.field3476 |= 0x1 << var15 + 23;
                }
            }
        }
        if (this.field3525 == 3) {
            this.field3411 = arg0.method226(255) == 1;
        }
        if (this.field3525 == 4 || this.field3525 == 1) {
            this.field3464 = arg0.method226(arg1 + 255);
            this.field3452 = arg0.method226(255);
            this.field3566 = arg0.method226(255);
            this.field3575 = arg0.method197(-1);
            if (this.field3575 == 65535) {
                this.field3575 = -1;
            }
            this.field3448 = arg0.method226(255) == 1;
        }
        if (this.field3525 == 4) {
            this.field3517 = arg0.method251((byte) 77);
            this.field3584 = arg0.method251((byte) 77);
        }
        if (this.field3525 == 1 || this.field3525 == 3 || this.field3525 == 4) {
            this.field3480 = arg0.method203(-22066);
        }
        if (this.field3525 == 3 || this.field3525 == 4) {
            this.field3422 = arg0.method203(-22066);
            this.field3482 = arg0.method203(-22066);
            this.field3512 = arg0.method203(-22066);
        }
        if (this.field3525 == 5) {
            this.field3503 = arg0.method203(-22066);
            this.field3420 = arg0.method203(-22066);
        }
        if (this.field3525 == 6) {
            this.field3451 = 1;
            this.field3526 = arg0.method197(-1);
            if (this.field3526 == 65535) {
                this.field3526 = -1;
            }
            this.field3447 = 1;
            this.field3473 = arg0.method197(~arg1);
            if (this.field3473 == 65535) {
                this.field3473 = -1;
            }
            this.field3521 = arg0.method197(-1);
            if (this.field3521 == 65535) {
                this.field3521 = -1;
            }
            this.field3498 = arg0.method197(-1);
            if (this.field3498 == 65535) {
                this.field3498 = -1;
            }
            this.field3481 = arg0.method197(-1);
            this.field3551 = arg0.method197(-1);
            this.field3458 = arg0.method197(-1);
        }
        if (this.field3525 == 7) {
            this.field3471 = new int[this.field3540 * this.field3439];
            this.field3532 = new int[this.field3540 * this.field3439];
            this.field3424 = 3;
            this.field3528 = 3;
            this.field3464 = arg0.method226(255);
            this.field3575 = arg0.method197(-1);
            if (this.field3575 == 65535) {
                this.field3575 = -1;
            }
            this.field3448 = arg0.method226(255) == 1;
            this.field3480 = arg0.method203(-22066);
            this.field3419 = arg0.method201(true);
            this.field3455 = arg0.method201(true);
            int var17 = arg0.method226(255);
            if (var17 == 1) {
                this.field3476 |= 0x40000000;
            }
            this.field3453 = new class40[5];
            for (int var18 = 0; var18 < 5; var18++) {
                class40 var19 = arg0.method251((byte) 77);
                if (var19.method350(true) > 0) {
                    this.field3453[var18] = var19;
                    this.field3476 |= 0x1 << var18 + 23;
                }
            }
        }
        if (this.field3525 == 8) {
            this.field3517 = arg0.method251((byte) 77);
        }
        if (this.field3456 == 2 || this.field3525 == 2) {
            this.field3531 = arg0.method251((byte) 77);
            this.field3492 = arg0.method251((byte) 77);
            int var20 = arg0.method197(-1) & 0x3F;
            this.field3476 |= var20 << 11;
        }
        if (this.field3456 == 1 || this.field3456 == 4 || this.field3456 == 5 || this.field3456 == 6) {
            this.field3558 = arg0.method251((byte) 77);
            if (this.field3558.method350(true) == 0) {
                if (this.field3456 == 1) {
                    this.field3558 = class54.field1064;
                }
                if (this.field3456 == 4) {
                    this.field3558 = class54.field1050;
                }
                if (this.field3456 == 5) {
                    this.field3558 = class54.field1050;
                }
                if (this.field3456 == 6) {
                    this.field3558 = class88.field1590;
                }
            }
        }
        if (this.field3456 == 1 || this.field3456 == 4 || this.field3456 == 5) {
            this.field3476 |= 0x400000;
        }
        if (this.field3456 == 6) {
            this.field3476 |= 0x1;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BII)V", line = 728)
    public final void method1504(byte arg0, int arg1, int arg2) {
        int var4 = this.field3532[arg1];
        field3573++;
        this.field3532[arg1] = this.field3532[arg2];
        this.field3532[arg2] = var4;
        int var5 = this.field3471[arg1];
        this.field3471[arg1] = this.field3471[arg2];
        int var6 = -123 % ((-arg0 - 26) / 63);
        this.field3471[arg2] = var5;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)Lcm;", line = 743)
    public final class185 method1505(boolean arg0, int arg1) {
        field3546++;
        class229.field3784 = false;
        int var3;
        if (arg0) {
            var3 = this.field3420;
        } else {
            var3 = this.field3503;
        }
        if (var3 == -1) {
            return null;
        }
        long var4 = ((this.field3560 ? 1L : 0L) << 38) + ((long) this.field3519 << 36) + ((this.field3562 ? 1L : 0L) << 35) + (long) var3 + ((this.field3413 ? 1L : 0L) << 39) + ((long) this.field3416 << 40);
        class185 var6 = (class185) class309.field5183.method1345(var4, 28150);
        if (var6 != null) {
            return var6;
        }
        class99 var7;
        if (this.field3562) {
            var7 = class15.method86(class8.field129, var3, 0, -95);
        } else {
            var7 = class55.method471(class8.field129, 12267, var3, 0);
        }
        if (var7 == null) {
            class229.field3784 = true;
            return null;
        }
        if (this.field3560) {
            var7.method738();
        }
        if (this.field3413) {
            var7.method748();
        }
        if (this.field3519 > 0) {
            var7.method736(this.field3519);
        }
        if (this.field3519 >= 1) {
            var7.method747(1);
        }
        if (arg1 != 21730) {
            this.field3556 = (byte[]) null;
        }
        if (this.field3519 >= 2) {
            var7.method747(16777215);
        }
        if (this.field3416 != 0) {
            var7.method741(this.field3416);
        }
        class185 var8;
        if (!class21.field350) {
            var8 = var7;
        } else if ((var7 instanceof class281)) {
            var8 = new class167(var7);
        } else {
            var8 = new class100(var7);
        }
        class309.field5183.method1350(var8, var4, arg1 ^ 0xFFFFAB4D);
        return var8;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lsd;I)V", line = 835)
    public final void method1506(class26 arg0, int arg1) {
        this.field3520 = true;
        arg0.field478++;
        this.field3525 = arg0.method226(255);
        this.field3510 = arg0.method197(-1);
        field3569++;
        this.field3474 = arg0.method201(true);
        this.field3555 = arg0.method201(true);
        this.field3540 = arg0.method197(-1);
        this.field3439 = arg0.method197(-1);
        this.field3528 = arg0.method234(2193);
        this.field3424 = arg0.method234(arg1 ^ 0xFFFF0891);
        this.field3580 = arg0.method234(arg1 + 67729);
        this.field3539 = arg0.method234(2193);
        this.field3421 = arg0.method197(-1);
        if (this.field3421 == 65535) {
            this.field3421 = -1;
        } else {
            this.field3421 += this.field3507 & 0xFFFF0000;
        }
        this.field3441 = arg0.method226(arg1 + 65791) == 1;
        if (this.field3525 == 0) {
            this.field3571 = arg0.method197(-1);
            this.field3437 = arg0.method197(arg1 + 65535);
            this.field3466 = arg0.method226(255) == 1;
        }
        if (this.field3525 == 5) {
            this.field3503 = arg0.method203(-22066);
            this.field3430 = arg0.method197(-1);
            int var3 = arg0.method226(255);
            this.field3562 = (var3 & 0x2) != 0;
            this.field3478 = (var3 & 0x1) != 0;
            this.field3544 = arg0.method226(255);
            this.field3519 = arg0.method226(255);
            this.field3416 = arg0.method203(-22066);
            this.field3560 = arg0.method226(255) == 1;
            this.field3413 = arg0.method226(arg1 ^ 0xFFFF00FF) == 1;
        }
        if (this.field3525 == 6) {
            this.field3451 = 1;
            this.field3526 = arg0.method197(-1);
            if (this.field3526 == 65535) {
                this.field3526 = -1;
            }
            this.field3570 = arg0.method201(true);
            this.field3465 = arg0.method201(true);
            this.field3551 = arg0.method197(-1);
            this.field3458 = arg0.method197(-1);
            this.field3536 = arg0.method197(-1);
            this.field3481 = arg0.method197(-1);
            this.field3521 = arg0.method197(-1);
            if (this.field3521 == 65535) {
                this.field3521 = -1;
            }
            this.field3509 = arg0.method226(255) == 1;
            this.field3487 = (short) arg0.method197(-1);
            this.field3538 = (short) arg0.method197(-1);
            this.field3417 = arg0.method226(255) == 1;
            if (this.field3528 != 0) {
                this.field3485 = arg0.method197(-1);
            }
            if (this.field3424 != 0) {
                this.field3568 = arg0.method197(arg1 + 65535);
            }
        }
        if (this.field3525 == 4) {
            this.field3575 = arg0.method197(-1);
            if (this.field3575 == 65535) {
                this.field3575 = -1;
            }
            this.field3517 = arg0.method251((byte) 77);
            this.field3566 = arg0.method226(arg1 ^ 0xFFFF00FF);
            this.field3464 = arg0.method226(255);
            this.field3452 = arg0.method226(255);
            this.field3448 = arg0.method226(255) == 1;
            this.field3480 = arg0.method203(-22066);
        }
        if (this.field3525 == 3) {
            this.field3480 = arg0.method203(arg1 ^ 0xA9CE);
            this.field3411 = arg0.method226(255) == 1;
            this.field3544 = arg0.method226(255);
        }
        if (this.field3525 == 9) {
            this.field3579 = arg0.method226(arg1 + 65791);
            this.field3480 = arg0.method203(-22066);
            this.field3486 = arg0.method226(255) == 1;
        }
        this.field3476 = arg0.method244(-26711);
        int var4 = arg0.method226(255);
        if (var4 > 0) {
            this.field3543 = new byte[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3543[var5] = arg0.method234(2193);
            }
            int var6 = arg0.method226(255);
            if (var6 > 0) {
                this.field3556 = new byte[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field3556[var7] = arg0.method234(arg1 + 67729);
                }
            }
        }
        this.field3535 = arg0.method251((byte) 77);
        int var8 = arg0.method226(255);
        if (var8 > 0) {
            this.field3432 = new class40[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3432[var9] = arg0.method251((byte) 77);
            }
        }
        this.field3467 = arg0.method226(255);
        this.field3488 = arg0.method226(255);
        this.field3469 = arg0.method226(arg1 ^ 0xFFFF00FF) == 1;
        this.field3531 = arg0.method251((byte) 77);
        if (arg1 != -65536) {
            this.field3468 = -74;
        }
        this.field3483 = this.method1507(arg0, (byte) -102);
        this.field3426 = this.method1507(arg0, (byte) -116);
        this.field3501 = this.method1507(arg0, (byte) -78);
        this.field3537 = this.method1507(arg0, (byte) 39);
        this.field3524 = this.method1507(arg0, (byte) 13);
        this.field3574 = this.method1507(arg0, (byte) 55);
        this.field3548 = this.method1507(arg0, (byte) 39);
        this.field3581 = this.method1507(arg0, (byte) 66);
        this.field3433 = this.method1507(arg0, (byte) 41);
        this.field3542 = this.method1507(arg0, (byte) -98);
        this.field3490 = this.method1507(arg0, (byte) -115);
        this.field3550 = this.method1507(arg0, (byte) 127);
        this.field3435 = this.method1507(arg0, (byte) -92);
        this.field3513 = this.method1507(arg0, (byte) 35);
        this.field3460 = this.method1507(arg0, (byte) -119);
        this.field3552 = this.method1507(arg0, (byte) -93);
        this.field3500 = this.method1507(arg0, (byte) -79);
        this.field3527 = this.method1507(arg0, (byte) -123);
        this.field3495 = this.method1507(arg0, (byte) 89);
        this.field3454 = this.method1507(arg0, (byte) 58);
        this.field3515 = this.method1512(4, arg0);
        this.field3511 = this.method1512(arg1 + 65540, arg0);
        this.field3459 = this.method1512(4, arg0);
        this.field3477 = this.method1512(4, arg0);
        this.field3475 = this.method1512(4, arg0);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Lsd;B)[Ljava/lang/Object;", line = 1041)
    private final Object[] method1507(class26 arg0, byte arg1) {
        field3529++;
        int var3 = -38 % ((-arg1 - 42) / 36);
        int var4 = arg0.method226(255);
        if (var4 == 0) {
            return null;
        }
        Object[] var5 = new Object[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = arg0.method226(255);
            if (var7 == 0) {
                var5[var6] = Integer.valueOf(arg0.method203(-22066));
            } else if (var7 == 1) {
                var5[var6] = arg0.method251((byte) 77);
            }
        }
        this.field3523 = true;
        return var5;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 1109)
    public static void method1508(int arg0) {
        field3463 = null;
        field3549 = null;
        field3444 = null;
        field3582 = null;
        field3470 = null;
        field3563 = null;
        field3450 = null;
        if (arg0 != 3) {
            field3582 = (class40) null;
        }
        field3518 = null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)Z", line = 1137)
    public final boolean method1509(int arg0) {
        field3414++;
        if (this.field3572 != null) {
            return true;
        }
        class114 var2 = class106.method796(-29252, this.field3503, class8.field129, 0);
        if (var2 == null) {
            return false;
        }
        var2.method854();
        this.field3425 = new int[var2.field4128];
        this.field3572 = new int[var2.field4128];
        for (int var3 = arg0; var3 < var2.field4128; var3++) {
            int var4 = 0;
            for (int var5 = 0; var5 < var2.field4116; var5++) {
                if (var2.field1976[var5 + (var2.field4116 * var3)] != 0) {
                    var4 = var5;
                    break;
                }
            }
            int var6 = var2.field4116;
            for (int var7 = var4; var7 < var2.field4116; var7++) {
                if (var2.field1976[var2.field4116 * var3 + var7] == 0) {
                    var6 = var7;
                    break;
                }
            }
            this.field3572[var3] = var4;
            this.field3425[var3] = var6 - var4;
        }
        return true;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([Lmm;B)Ljh;", line = 1203)
    public final class259 method1510(class249[] arg0, byte arg1) {
        class229.field3784 = false;
        field3547++;
        int var3 = 28 % ((-arg1 - 4) / 45);
        if (this.field3575 == -1) {
            return null;
        }
        class259 var4 = (class259) class150.field2507.method1345((long) this.field3575, 28150);
        if (var4 != null) {
            return var4;
        }
        class259 var5 = class257.method1804(this.field3575, class110.field1922, 0, 0, class8.field129);
        if (var5 == null) {
            class229.field3784 = true;
        } else {
            var5.method1823(arg0, (int[]) null);
            class150.field2507.method1350(var5, (long) this.field3575, 127);
        }
        return var5;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Li;II)V", line = 1410)
    public static final void method1511(class207 arg0, int arg1, int arg2) {
        if (arg1 < 108) {
            method1500(-35, -69, 107, -97);
        }
        field3553++;
        while (true) {
            class91 var3 = (class91) class20.field334.method1971(100);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1647; var5++) {
                if (var3.field1648[var5] != null) {
                    if (var3.field1648[var5].field1258 == 2) {
                        var3.field1650[var5] = -5;
                    }
                    if (var3.field1648[var5].field1258 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1649[var5] != null) {
                    if (var3.field1649[var5].field1258 == 2) {
                        var3.field1650[var5] = -6;
                    }
                    if (var3.field1649[var5].field1258 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1464(arg2, 0);
            arg0.method218(0, -19914);
            int var6 = arg0.field478;
            arg0.method239((byte) 95, var3.field1660);
            for (int var7 = 0; var7 < var3.field1647; var7++) {
                if (var3.field1650[var7] == 0) {
                    try {
                        int var8 = var3.field1658[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field1648[var7].field1260;
                            int var10 = var9.getInt((Object) null);
                            arg0.method218(0, -19914);
                            arg0.method239((byte) 93, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field1648[var7].field1260;
                            var11.setInt((Object) null, var3.field1651[var7]);
                            arg0.method218(0, -19914);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field1648[var7].field1260;
                            int var13 = var12.getModifiers();
                            arg0.method218(0, -19914);
                            arg0.method239((byte) -123, var13);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field1649[var7].field1260;
                            byte[][] var17 = var3.field1657[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method218(0, -19914);
                            } else if ((var21 instanceof Number)) {
                                arg0.method218(1, -19914);
                                arg0.method241(((Number) var21).longValue(), 110);
                            } else if (var21 instanceof class40) {
                                arg0.method218(2, -19914);
                                arg0.method206((class40) var21, (byte) -120);
                            } else {
                                arg0.method218(4, -19914);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field1649[var7].field1260;
                            int var15 = var14.getModifiers();
                            arg0.method218(0, -19914);
                            arg0.method239((byte) 116, var15);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method218(-10, -19914);
                    } catch (InvalidClassException var35) {
                        arg0.method218(-11, -19914);
                    } catch (StreamCorruptedException var36) {
                        arg0.method218(-12, -19914);
                    } catch (OptionalDataException var37) {
                        arg0.method218(-13, -19914);
                    } catch (IllegalAccessException var38) {
                        arg0.method218(-14, -19914);
                    } catch (IllegalArgumentException var39) {
                        arg0.method218(-15, -19914);
                    } catch (InvocationTargetException var40) {
                        arg0.method218(-16, -19914);
                    } catch (SecurityException var41) {
                        arg0.method218(-17, -19914);
                    } catch (IOException var42) {
                        arg0.method218(-18, -19914);
                    } catch (NullPointerException var43) {
                        arg0.method218(-19, -19914);
                    } catch (Exception var44) {
                        arg0.method218(-20, -19914);
                    } catch (Throwable var45) {
                        arg0.method218(-21, -19914);
                    }
                } else {
                    arg0.method218(var3.field1650[var7], -19914);
                }
            }
            arg0.method224(-15328, var6);
            arg0.method233(false, arg0.field478 - var6);
            var3.method2095(0);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILsd;)[I", line = 1632)
    private final int[] method1512(int arg0, class26 arg1) {
        field3499++;
        int var3 = arg1.method226(255);
        if (var3 == 0) {
            return null;
        }
        int[] var4 = new int[var3];
        if (arg0 != 4) {
            method1500(29, -51, 75, -119);
        }
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = arg1.method203(-22066);
        }
        return var4;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILpi;IZLsj;)Lrf;", line = 1707)
    public final class266 method1513(int arg0, class300 arg1, int arg2, boolean arg3, class52 arg4) {
        class229.field3784 = false;
        int var6;
        int var7;
        if (arg3) {
            var6 = this.field3473;
            var7 = this.field3447;
        } else {
            var6 = this.field3526;
            var7 = this.field3451;
        }
        field3457++;
        if (var7 == 0) {
            return null;
        } else if (var7 == 1 && var6 == -1) {
            return null;
        } else if (var7 == 1) {
            class266 var16 = (class266) class2.field19.method1345((long) ((var7 << 16) + var6), 28150);
            if (var16 == null) {
                class311 var17 = class311.method2145(class51.field984, var6, 0);
                if (var17 == null) {
                    class229.field3784 = true;
                    return null;
                }
                var16 = var17.method2138(64, 768, -50, -10, -50);
                class2.field19.method1350(var16, (long) ((var7 << 16) + var6), -124);
            }
            if (arg1 != null) {
                var16 = arg1.method2045(arg0, var16, (byte) -86);
            }
            return var16;
        } else if (var7 == 2) {
            class266 var8 = class246.method1740(var6, (byte) -32).method915(arg1, arg0, 0);
            if (var8 == null) {
                class229.field3784 = true;
                return null;
            } else {
                return var8;
            }
        } else if (var7 == 3) {
            if (arg4 == null) {
                return null;
            }
            class266 var15 = arg4.method456(false, arg1, arg0);
            if (var15 == null) {
                class229.field3784 = true;
                return null;
            } else {
                return var15;
            }
        } else if (arg2 == var7) {
            class277 var13 = class165.method1243(-83, var6);
            class266 var14 = var13.method1943(-18401, arg1, arg0, 10);
            if (var14 == null) {
                class229.field3784 = true;
                return null;
            } else {
                return var14;
            }
        } else if (var7 == 6) {
            class266 var9 = class246.method1740(var6, (byte) -32).method913((byte) 101, arg1, 0, arg0, (class300) null);
            if (var9 == null) {
                class229.field3784 = true;
                return null;
            } else {
                return var9;
            }
        } else if (var7 != 7) {
            return null;
        } else if (arg4 == null) {
            return null;
        } else {
            int var10 = this.field3526 >>> 16;
            int var11 = this.field3526 & 0xFFFF;
            class266 var12 = arg4.method457((byte) 85, var11, var10, arg1, arg0);
            if (var12 == null) {
                class229.field3784 = true;
                return null;
            } else {
                return var12;
            }
        }
    }
}

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class147 extends class94 {

    @OriginalMember(owner = "client!wa", name = "sb", descriptor = "Z")
    public boolean field3572 = false;

    @OriginalMember(owner = "client!wa", name = "Gb", descriptor = "I")
    private int field3586 = 0;

    @OriginalMember(owner = "client!wa", name = "Kb", descriptor = "I")
    private int field3590 = 0;

    @OriginalMember(owner = "client!wa", name = "Fb", descriptor = "I")
    public int field3585;

    @OriginalMember(owner = "client!wa", name = "Ab", descriptor = "I")
    private int field3580;

    @OriginalMember(owner = "client!wa", name = "yb", descriptor = "I")
    public int field3578;

    @OriginalMember(owner = "client!wa", name = "Ub", descriptor = "I")
    public int field3600;

    @OriginalMember(owner = "client!wa", name = "Pb", descriptor = "I")
    public int field3595;

    @OriginalMember(owner = "client!wa", name = "tb", descriptor = "I")
    public int field3573;

    @OriginalMember(owner = "client!wa", name = "Ob", descriptor = "Led;")
    private class33 field3594;

    @OriginalMember(owner = "client!wa", name = "wb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3576 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!wa", name = "Ib", descriptor = "I")
    public static int field3588 = 0;

    @OriginalMember(owner = "client!wa", name = "Mb", descriptor = "Loa;")
    public static class98 field3592 = class38.method349(255, "null");

    @OriginalMember(owner = "client!wa", name = "Eb", descriptor = "Z")
    public static boolean field3584 = false;

    @OriginalMember(owner = "client!wa", name = "Db", descriptor = "Loa;")
    public static class98 field3583 = class38.method349(255, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!wa", name = "Rb", descriptor = "Loa;")
    public static class98 field3597 = class38.method349(255, "@whi@ )4 ");

    @OriginalMember(owner = "client!wa", name = "Sb", descriptor = "I")
    public static int field3598 = 0;

    @OriginalMember(owner = "client!wa", name = "Qb", descriptor = "Loa;")
    private static class98 field3596 = class38.method349(255, "Connection timed out)3");

    @OriginalMember(owner = "client!wa", name = "Cb", descriptor = "[I")
    public static int[] field3582 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!wa", name = "Tb", descriptor = "Loa;")
    private static class98 field3599 = class38.method349(255, "Loading friend list");

    @OriginalMember(owner = "client!wa", name = "Nb", descriptor = "Loa;")
    public static class98 field3593 = field3596;

    @OriginalMember(owner = "client!wa", name = "Vb", descriptor = "Loa;")
    public static class98 field3601 = class38.method349(255, " loggt sich aus)3");

    @OriginalMember(owner = "client!wa", name = "zb", descriptor = "Loa;")
    public static class98 field3579 = class38.method349(255, "Lade Ignorieren)2Liste)3)3)3");

    @OriginalMember(owner = "client!wa", name = "Jb", descriptor = "Loa;")
    public static class98 field3589 = field3599;

    @OriginalMember(owner = "client!wa", name = "rb", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!wa", name = "ub", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!wa", name = "vb", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!wa", name = "xb", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!wa", name = "Hb", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!wa", name = "Lb", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!wa", name = "Bb", descriptor = "[Loc;")
    public static class100[] field3581;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(B)Lt;")
    public final class128 method273(byte arg0) {
        field3575++;
        if (arg0 < 104) {
            this.method1178(35, -115);
        }
        class19 var2 = class51.method425(this.field3580, 4);
        class128 var3;
        if (this.field3572) {
            var3 = var2.method182((byte) 2, -1);
        } else {
            var3 = var2.method182((byte) 117, this.field3586);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ltb;Loa;Loa;Z)[Loc;")
    public static final class100[] method1175(class130 arg0, class98 arg1, class98 arg2, boolean arg3) {
        field3574++;
        int var4 = arg0.method1060((byte) 40, arg2);
        if (arg3) {
            field3598 = 70;
        }
        int var5 = arg0.method1048(arg1, var4, (byte) -10);
        return class17.method160(var5, 41, var4, arg0);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ltd;B)[I")
    public static final int[] method1176(class132 arg0, byte arg1) {
        field3587++;
        int var2 = arg0.field3135 >> 16;
        if (!client.method202(var2, -642990672)) {
            return null;
        }
        int var3 = arg0.field3216;
        int var4 = 60 / ((-arg1 - 52) / 53);
        int var5 = arg0.field3102;
        int var6 = arg0.field3195;
        while (var6 != -1) {
            class132 var8 = class36.field901[var2][var6 & 0xFFFF];
            var6 = var8.field3195;
            var5 += var8.field3102 - var8.field3114;
            var3 += var8.field3216 - var8.field3189;
        }
        return new int[] { var3, var5 };
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
    public static void method1177(int arg0) {
        field3582 = null;
        field3593 = null;
        field3589 = null;
        field3596 = null;
        field3599 = null;
        field3581 = null;
        field3583 = null;
        field3576 = null;
        field3601 = null;
        field3579 = null;
        field3592 = null;
        field3597 = null;
        int var1 = 87 / ((56 - arg0) / 54);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V")
    public final void method1178(int arg0, int arg1) {
        field3591++;
        if (arg0 != -1) {
            field3589 = null;
        }
        if (this.field3572) {
            return;
        }
        this.field3590 += arg1;
        while (this.field3590 > this.field3594.field794[this.field3586]) {
            this.field3590 -= this.field3594.field794[this.field3586];
            this.field3586++;
            if (this.field3586 >= this.field3594.field807.length) {
                this.field3572 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V")
    public static final void method1179(int arg0) {
        field3577++;
        if (class42.field985 == 104) {
            int var1;
            if (class41.field963 == -1) {
                var1 = class94.field2140;
            } else {
                var1 = class41.field963;
            }
            if (class94.field2140 != class41.field963) {
                var1--;
                if (var1 < 0) {
                    var1 = 19;
                }
                if (class25.field605[var1] != null) {
                    class145.field3497 = class25.field605[var1];
                    class15.field306 = true;
                    class41.field963 = var1;
                }
            }
        }
        if (class42.field985 == 105 && class41.field963 != -1) {
            class41.field963++;
            if (class41.field963 >= 20) {
                class41.field963 = 0;
            }
            if (class94.field2140 == class41.field963) {
                class145.field3497 = class145.field3503;
                class41.field963 = -1;
                class15.field306 = true;
            } else if (class25.field605[class41.field963] != null) {
                class145.field3497 = class25.field605[class41.field963];
                class15.field306 = true;
            }
        }
        if (arg0 < 72) {
            field3588 = -3;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIIIII)V")
    public class147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3585 = arg5 + arg6;
        this.field3580 = arg0;
        this.field3578 = arg4;
        this.field3600 = arg1;
        this.field3595 = arg3;
        this.field3573 = arg2;
        int var8 = class51.method425(this.field3580, 4).field428;
        if (var8 == -1) {
            this.field3572 = true;
        } else {
            this.field3572 = false;
            this.field3594 = class48.method413(-77, var8);
        }
    }
}

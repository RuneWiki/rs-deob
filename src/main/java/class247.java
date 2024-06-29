import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class247 {

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    private int field3441 = 0;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "[Luj;")
    public class260[] field3424;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public int field3435;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "Lqp;")
    public static class466 field3425 = new class466("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "[[I")
    public static int[][] field3438 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "J")
    private long field3439;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "Luj;")
    private class260 field3436;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "Luj;")
    private class260 field3442;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3431++;
        if (arg1 != 1) {
            field3438 = null;
        }
        if (class256.method1534(32554, arg6)) {
            if (class421.field6175[arg6] == null) {
                class437.method2574(arg1 ^ 0x6E, class495.field7226[arg6], arg8, arg5, arg3, -1, arg4, arg0, arg2, arg7);
            } else {
                class437.method2574(arg1 + 116, class421.field6175[arg6], arg8, arg5, arg3, -1, arg4, arg0, arg2, arg7);
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class463.field6801[var9] = true;
            }
        } else {
            class463.field6801[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B[Luj;)I")
    public final int method1485(byte arg0, class260[] arg1) {
        field3440++;
        int var3 = 0;
        if (arg0 != -16) {
            method1489((byte) 107);
        }
        for (int var4 = 0; var4 < this.field3435; var4++) {
            class260 var5 = this.field3424[var4];
            for (class260 var6 = var5.field3612; var6 != var5; var6 = var6.field3612) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)I")
    public final int method1486(byte arg0) {
        field3433++;
        int var2 = 0;
        if (arg0 != -81) {
            return -10;
        }
        for (int var3 = 0; var3 < this.field3435; var3++) {
            class260 var4 = this.field3424[var3];
            class260 var5 = var4.field3612;
            while (var4 != var5) {
                var5 = var5.field3612;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IJLuj;)V")
    public final void method1487(int arg0, long arg1, class260 arg2) {
        if (arg0 >= -30) {
            return;
        }
        field3434++;
        if (arg2.field3617 != null) {
            arg2.method1565(0);
        }
        class260 var5 = this.field3424[(int) ((long) (this.field3435 - 1) & arg1)];
        arg2.field3617 = var5.field3617;
        arg2.field3612 = var5;
        arg2.field3617.field3612 = arg2;
        arg2.field3612.field3617 = arg2;
        arg2.field3615 = arg1;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)Luj;")
    public final class260 method1488(int arg0) {
        field3429++;
        if (this.field3436 == null) {
            return null;
        }
        class260 var2 = this.field3424[(int) ((long) (this.field3435 - arg0) & this.field3439)];
        while (this.field3436 != var2) {
            if (this.field3436.field3615 == this.field3439) {
                class260 var3 = this.field3436;
                this.field3436 = this.field3436.field3612;
                return var3;
            }
            this.field3436 = this.field3436.field3612;
        }
        this.field3436 = null;
        return null;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V")
    public static void method1489(byte arg0) {
        field3425 = null;
        field3438 = null;
        if (arg0 < 99) {
            method1489((byte) 5);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
    public final void method1490(boolean arg0) {
        if (!arg0) {
            this.method1486((byte) 39);
        }
        field3437++;
        for (int var2 = 0; var2 < this.field3435; var2++) {
            class260 var3 = this.field3424[var2];
            while (true) {
                class260 var4 = var3.field3612;
                if (var3 == var4) {
                    break;
                }
                var4.method1565(0);
            }
        }
        this.field3442 = null;
        this.field3436 = null;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)I")
    public final int method1491(byte arg0) {
        field3430++;
        if (arg0 <= 71) {
            this.field3435 = -49;
        }
        return this.field3435;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(JI)Luj;")
    public final class260 method1492(long arg0, int arg1) {
        if (arg1 != 6340) {
            field3425 = null;
        }
        field3427++;
        this.field3439 = arg0;
        class260 var4 = this.field3424[(int) ((long) (this.field3435 - 1) & arg0)];
        for (this.field3436 = var4.field3612; this.field3436 != var4; this.field3436 = this.field3436.field3612) {
            if (this.field3436.field3615 == arg0) {
                class260 var5 = this.field3436;
                this.field3436 = this.field3436.field3612;
                return var5;
            }
        }
        this.field3436 = null;
        return null;
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)Luj;")
    public final class260 method1493(byte arg0) {
        field3426++;
        if (this.field3441 > 0 && this.field3424[this.field3441 - 1] != this.field3442) {
            class260 var2 = this.field3442;
            this.field3442 = var2.field3612;
            return var2;
        }
        if (arg0 <= 70) {
            field3425 = null;
        }
        while (this.field3441 < this.field3435) {
            class260 var3 = this.field3424[this.field3441++].field3612;
            if (this.field3424[this.field3441 - 1] != var3) {
                this.field3442 = var3.field3612;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(I)V")
    public class247(int arg0) {
        this.field3424 = new class260[arg0];
        this.field3435 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class260 var3 = this.field3424[var2] = new class260();
            var3.field3617 = var3;
            var3.field3612 = var3;
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)Luj;")
    public final class260 method1494(int arg0) {
        field3432++;
        this.field3441 = arg0;
        return this.method1493((byte) 99);
    }
}

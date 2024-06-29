import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class class206 {

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Lgb;")
    public static class212 field3362 = new class212(64);

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Ltl;")
    public static class59 field3366 = class85.method639("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 9588);

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Leh;")
    public static class94 field3365 = new class94(16);

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field3368 = 0;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Ltl;")
    private static class59 field3371 = class85.method639("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 9588);

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Ltl;")
    public static class59 field3369 = field3371;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "Ltl;")
    private static class59 field3372 = class85.method639("Hidden", 9588);

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Ltl;")
    public static class59 field3370 = field3372;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Ltl;")
    public static class59 field3373 = class85.method639("0", 9588);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public int field3357;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public int field3360;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public int field3364;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "Lgm;")
    public static class229 field3374;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1452(boolean arg0) {
        field3373 = null;
        field3374 = null;
        field3362 = null;
        field3366 = null;
        field3365 = null;
        if (arg0) {
            field3371 = null;
            field3369 = null;
            field3372 = null;
            field3370 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)Z", line = 27)
    public final boolean method1453(int arg0) {
        if (arg0 > -32) {
            this.method1456(false);
        }
        field3358++;
        return (this.field3357 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)Z", line = 38)
    public final boolean method1454(byte arg0) {
        field3361++;
        if (arg0 < 12) {
            method1457(75, 17, 120, 95, (class176) null, (class176) null, 62, -37, 125L);
        }
        return (this.field3357 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)Z", line = 57)
    public final boolean method1455(int arg0) {
        field3359++;
        if (arg0 <= 42) {
            this.method1455(44);
        }
        return (this.field3357 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Z)Z", line = 76)
    public final boolean method1456(boolean arg0) {
        if (!arg0) {
            this.method1456(true);
        }
        field3363++;
        return (this.field3357 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIILfg;Lfg;IIJ)V", line = 88)
    public static final void method1457(int arg0, int arg1, int arg2, int arg3, class176 arg4, class176 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class201 var10 = new class201();
        var10.field3325 = arg8;
        var10.field3328 = arg1 * 128 + 64;
        var10.field3324 = arg2 * 128 + 64;
        var10.field3336 = arg3;
        var10.field3323 = arg4;
        var10.field3326 = arg5;
        var10.field3331 = arg6;
        var10.field3333 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class120.field2010[var11][arg1][arg2] == null) {
                class120.field2010[var11][arg1][arg2] = new class245(var11, arg1, arg2);
            }
        }
        class120.field2010[arg0][arg1][arg2].field4098 = var10;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class194 {

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "B")
    private byte field3410;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public int field3404;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public int field3413;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public int field3392;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public int field3402;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Ldj;")
    private static class44 field3390 = class89.method650(255, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Ldj;")
    public static class44 field3395 = class89.method650(255, " weitere Optionen");

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field3393 = 0;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Ldj;")
    private static class44 field3399 = class89.method650(255, "Loading textures )2 ");

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "Ldj;")
    public static class44 field3405 = field3390;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Ldj;")
    public static class44 field3391 = field3399;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Ldj;")
    public static class44 field3397 = class89.method650(255, " )2> ");

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field3408 = 1;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Ldj;")
    public static class44 field3406 = class89.method650(255, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "Ldj;")
    private static class44 field3415 = class89.method650(255, "Your account is already logged in)3");

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Ldj;")
    public static class44 field3389 = field3415;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1240(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != -2) {
            field3395 = null;
        }
        field3394++;
        int var6 = class201.method1296(class14.field267, -126, arg3, class57.field1068);
        int var7 = class201.method1296(class14.field267, -128, arg0, class57.field1068);
        int var8 = class201.method1296(class70.field1337, -127, arg1, class70.field1321);
        int var9 = class201.method1296(class70.field1337, -125, arg5, class70.field1321);
        for (int var10 = var6; var10 <= var7; var10++) {
            class42.method290(class108.field1979[var10], -7, var8, var9, arg2);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)I")
    public final int method1241(int arg0) {
        field3407++;
        int var2 = -74 % ((arg0 + 38) / 33);
        return this.field3410 & 0x7;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static void method1242(int arg0) {
        field3406 = null;
        field3399 = null;
        field3391 = null;
        field3405 = null;
        field3395 = null;
        field3389 = null;
        field3415 = null;
        if (arg0 == -9) {
            field3390 = null;
            field3397 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)I")
    public final int method1243(int arg0) {
        field3401++;
        int var2 = 30 / ((arg0 - 44) / 54);
        return (this.field3410 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZZI)I")
    public static final int method1244(boolean arg0, boolean arg1, int arg2) {
        int var3 = 0;
        if (arg2 != 5270) {
            method1244(true, false, -51);
        }
        field3398++;
        if (arg1) {
            var3 += class3.field44 + class163.field2819;
        }
        if (arg0) {
            var3 += class54.field991 + class207.field3720;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -32476) {
            return;
        }
        if (arg3 - arg5 >= class70.field1337 && class70.field1321 >= arg3 + arg5 && arg0 - arg5 >= class14.field267 && class57.field1068 >= arg0 + arg5) {
            class79.method602(arg3, arg5, arg2, arg1, arg0, arg4, (byte) 43);
        } else {
            class71.method562(arg0, arg2, arg1, arg5, arg4, arg3, (byte) 31);
        }
        field3396++;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class194() {
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lfj;)V")
    public class194(class66 arg0) {
        this.field3410 = arg0.method505(false);
        this.field3404 = arg0.method500(71);
        this.field3413 = arg0.method528(true);
        this.field3392 = arg0.method528(true);
        this.field3402 = arg0.method528(true);
        this.field3411 = arg0.method528(true);
    }
}

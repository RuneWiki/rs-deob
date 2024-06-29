import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class151 extends class112 {

    @OriginalMember(owner = "client!wa", name = "jb", descriptor = "Z")
    public boolean field3447 = false;

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
    private int field3443 = 0;

    @OriginalMember(owner = "client!wa", name = "Cb", descriptor = "I")
    private int field3466 = 0;

    @OriginalMember(owner = "client!wa", name = "ib", descriptor = "I")
    public int field3446;

    @OriginalMember(owner = "client!wa", name = "Eb", descriptor = "I")
    public int field3468;

    @OriginalMember(owner = "client!wa", name = "Fb", descriptor = "I")
    public int field3469;

    @OriginalMember(owner = "client!wa", name = "mb", descriptor = "I")
    private int field3450;

    @OriginalMember(owner = "client!wa", name = "xb", descriptor = "I")
    public int field3461;

    @OriginalMember(owner = "client!wa", name = "ob", descriptor = "I")
    public int field3452;

    @OriginalMember(owner = "client!wa", name = "wb", descriptor = "Lqe;")
    private class116 field3460;

    @OriginalMember(owner = "client!wa", name = "pb", descriptor = "[I")
    public static int[] field3453 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!wa", name = "vb", descriptor = "Z")
    public static boolean field3459 = false;

    @OriginalMember(owner = "client!wa", name = "sb", descriptor = "Ltd;")
    public static class136 field3456 = class145.method1172("<img=0>", 45);

    @OriginalMember(owner = "client!wa", name = "zb", descriptor = "Ltd;")
    private static class136 field3463 = class145.method1172("Login server offline)3", 45);

    @OriginalMember(owner = "client!wa", name = "kb", descriptor = "I")
    public static int field3448 = 0;

    @OriginalMember(owner = "client!wa", name = "Bb", descriptor = "I")
    public static int field3465 = 0;

    @OriginalMember(owner = "client!wa", name = "ub", descriptor = "Ltd;")
    public static class136 field3458 = field3463;

    @OriginalMember(owner = "client!wa", name = "Db", descriptor = "I")
    public static int field3467 = 0;

    @OriginalMember(owner = "client!wa", name = "Ab", descriptor = "Ltd;")
    private static class136 field3464 = class145.method1172("Account locked as we suspect it has been stolen)3", 45);

    @OriginalMember(owner = "client!wa", name = "rb", descriptor = "Ltd;")
    public static class136 field3455 = class145.method1172("mapedge", 45);

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "Ltd;")
    public static class136 field3444 = field3464;

    @OriginalMember(owner = "client!wa", name = "Gb", descriptor = "Z")
    public static boolean field3470 = false;

    @OriginalMember(owner = "client!wa", name = "hb", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!wa", name = "lb", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!wa", name = "nb", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!wa", name = "qb", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!wa", name = "tb", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!wa", name = "yb", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Le;")
    public static final class29 method1191(int arg0, int arg1) {
        class29 var2 = (class29) class8.field144.method1162((long) arg0, true);
        field3451++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class51.field1150.method669(arg0, arg1, -70);
        class29 var4 = new class29();
        var4.field648 = arg0;
        if (var3 != null) {
            var4.method250(new class127(var3), (byte) -96);
        }
        class8.field144.method1164((long) arg0, var4, (byte) 127);
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)Ltd;")
    public static final class136 method1192(boolean arg0, int arg1) {
        if (arg0) {
            field3448 = -71;
        }
        class136 var2 = new class136();
        var2.field3183 = 0;
        var2.field3182 = new byte[arg1];
        field3462++;
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(Z)V")
    public static void method1193(boolean arg0) {
        field3444 = null;
        field3458 = null;
        field3455 = null;
        if (arg0) {
            method1192(false, -102);
        }
        field3456 = null;
        field3464 = null;
        field3463 = null;
        field3453 = null;
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)Lda;")
    public final class23 method93(int arg0) {
        class29 var2 = method1191(this.field3450, 13);
        field3445++;
        class23 var3;
        if (this.field3447) {
            var3 = var2.method246(-129, -1);
        } else {
            var3 = var2.method246(-129, this.field3466);
        }
        if (var3 == null) {
            return null;
        } else {
            int var4 = -47 / ((18 - arg0) / 63);
            return var3;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)V")
    public final void method1194(int arg0, boolean arg1) {
        field3454++;
        if (this.field3447) {
            return;
        }
        if (arg1) {
            this.method1194(108, false);
        }
        this.field3443 += arg0;
        while (this.field3460.field2650[this.field3466] < this.field3443) {
            this.field3443 -= this.field3460.field2650[this.field3466];
            this.field3466++;
            if (this.field3466 >= this.field3460.field2676.length) {
                this.field3447 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIIIII)V")
    public class151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3446 = arg4;
        this.field3468 = arg2;
        this.field3469 = arg5 + arg6;
        this.field3450 = arg0;
        this.field3461 = arg1;
        this.field3452 = arg3;
        int var8 = method1191(this.field3450, 13).field639;
        if (var8 == -1) {
            this.field3447 = true;
        } else {
            this.field3447 = false;
            this.field3460 = class29.method252(true, var8);
        }
    }
}

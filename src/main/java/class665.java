import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class665 {

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "Lnea;")
    public static class664 field9383 = new class664(65, 6);

    @OriginalMember(owner = "client!pca", name = "i", descriptor = "[[I")
    public static int[][] field9388 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!pca", name = "h", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!pca", name = "j", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "J")
    public long field9386;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "Lpca;")
    public class665 field9382;

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "Lpca;")
    public class665 field9384;

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "[I")
    public static int[] field9385;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method3675(boolean arg0) {
        if (arg0) {
            field9381++;
            return this.field9384 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIIZI)Lrb;", line = 20)
    public static final class320 method3676(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field9387++;
        class320 var5 = new class320();
        var5.field4703 = arg4;
        var5.field4704 = arg0;
        class654.field9178.method1403((byte) -18, var5, (long) arg2);
        class394.method2433(arg4, 1);
        class49 var6 = class534.method3038(-115, arg2);
        if (var6 != null) {
            class563.method3215(true, var6);
        }
        if (class37.field634 != null) {
            class563.method3215(true, class37.field634);
            class37.field634 = null;
        }
        int var7 = 2 / ((2 - arg1) / 46);
        class485.method2818((byte) 118);
        if (var6 != null) {
            class391.method2407(0, var6, !arg3);
        }
        if (!arg3) {
            class220.method1451(arg4);
        }
        if (!arg3 && class100.field1556 != -1) {
            class483.method2815(1, class100.field1556, -2064);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "(B)V", line = 58)
    public static void method3677(byte arg0) {
        field9383 = null;
        field9385 = null;
        field9388 = null;
        if (arg0 >= -65) {
            method3676(-30, 85, -80, false, -60);
        }
    }

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "(I)V", line = 77)
    public final void method3678(int arg0) {
        field9380++;
        if (this.field9384 != null && arg0 == -1) {
            this.field9384.field9382 = this.field9382;
            this.field9382.field9384 = this.field9384;
            this.field9384 = null;
            this.field9382 = null;
        }
    }
}

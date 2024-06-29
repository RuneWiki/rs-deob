import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class class554 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lre;")
    public class582 field7743;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field7751 = 1406;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "[I")
    public static int[] field7749 = new int[4096];

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field7753;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public void method2174(int arg0) {
        if (arg0 == 1406) {
            field7744++;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
    public static final void method3107(int arg0, int arg1, int arg2) {
        if (arg0 != -4097) {
            field7749 = null;
        }
        field7750++;
        class632 var3 = class641.method3699(arg0 + 3984, 16, arg2);
        var3.method3656(0);
        var3.field9198 = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    public abstract void method470(int arg0);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZILsw;)V")
    public abstract void method464(boolean arg0, int arg1, class11 arg2);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)Z")
    public static final boolean method3108(int arg0, byte arg1) {
        field7745++;
        if (arg1 <= 120) {
            method3107(-42, -8, 120);
        }
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
    public void method2173(int arg0) {
        field7752++;
        int var2 = -126 / ((-arg0 - 6) / 56);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public void method2169(byte arg0) {
        if (arg0 > 11) {
            field7746++;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BZ)V")
    public abstract void method466(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
    public static void method3109(int arg0) {
        if (arg0 != 1406) {
            method3107(3, 77, 91);
        }
        field7749 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZI)V")
    public abstract void method473(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lre;)V")
    public class554(class582 arg0) {
        this.field7743 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V")
    public abstract void method471(boolean arg0, int arg1);

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)Z")
    public abstract boolean method467(int arg0);

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V")
    public void method2168(int arg0) {
        if (arg0 <= 99) {
            method3109(49);
        }
        field7753++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public void method2170(boolean arg0) {
        if (arg0) {
            field7748++;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public void method2172(byte arg0) {
        if (arg0 >= -111) {
            this.method2169((byte) -56);
        }
        field7747++;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field7749[var0] = class354.method2207(var0, 111);
        }
    }
}

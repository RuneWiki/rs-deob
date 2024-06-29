import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class473 {

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "B")
    public byte field6901;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public int field6917;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    private int field6912;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public int field6903;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public int field6904;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "Lsm;")
    public class473 field6920;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public static int field6914 = 0;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "Loi;")
    public static class169 field6916 = new class169(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "[I")
    public static int[] field6918 = new int[100];

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "F")
    public static float field6922;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public int field6902;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public int field6905;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public int field6906;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public int field6907;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public int field6908;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public int field6910;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public int field6911;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public int field6913;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "I")
    public int field6923;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "Lf;")
    public static class404 field6921;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V")
    public static void method2835(boolean arg0) {
        field6921 = null;
        field6918 = null;
        if (!arg0) {
            field6921 = null;
        }
        field6916 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIII)Lsm;")
    public final class473 method2836(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            field6918 = null;
        }
        field6915++;
        return new class473(this.field6912, arg0, arg3, arg2, this.field6901);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Ltv;")
    public final class292 method2837(int arg0) {
        if (arg0 != -27472) {
            this.method2837(-116);
        }
        field6919++;
        return class151.method1042(this.field6912, 0);
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(IIIIB)V")
    public class473(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field6901 = arg4;
        this.field6917 = arg2;
        this.field6912 = arg0;
        this.field6903 = arg3;
        this.field6904 = arg1;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lsm;I)V")
    public class473(class473 arg0, int arg1) {
        this.field6920 = arg0;
        this.field6901 = this.field6920.field6901;
        this.field6912 = this.field6920.field6912;
        this.field6903 = this.field6920.field6903 + arg1;
        this.field6917 = this.field6920.field6917 + arg1;
        this.field6904 = this.field6920.field6904 + arg1;
    }
}

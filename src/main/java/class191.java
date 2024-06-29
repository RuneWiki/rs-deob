import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class191 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public int field2896;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[I")
    public int[] field2901;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "[I")
    public int[] field2898;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lgf;")
    public static class481 field2897;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[Lha;")
    public static class116[] field2900;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method1240(int arg0) {
        field2900 = null;
        field2897 = null;
        if (arg0 != 20181) {
            field2897 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class272 var7 = new class272();
        var7.field4019 = arg1 >> class179.field2726;
        var7.field4021 = arg2 >> class179.field2726;
        var7.field4012 = arg3 >> class179.field2726;
        var7.field4011 = arg4 >> class179.field2726;
        var7.field4025 = arg0;
        var7.field4020 = arg1;
        var7.field4023 = arg2;
        var7.field4031 = arg3;
        var7.field4032 = arg4;
        var7.field4018 = arg5;
        var7.field4028 = arg6;
        class595.field8777[class382.field5585++] = var7;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V")
    public static final void method1242(byte arg0, int arg1) {
        field2899++;
        class49.field573.method2028(arg1, true);
        if (arg0 != -52) {
            method1242((byte) 56, -57);
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V")
    public class191(int arg0) {
        this.field2896 = arg0;
        this.field2901 = new int[this.field2896];
        this.field2898 = new int[this.field2896];
    }
}

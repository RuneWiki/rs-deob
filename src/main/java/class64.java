import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class64 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "[I")
    public static int[] field1139 = new int[200];

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Lid;")
    private static class149 field1140 = class60.method382("Loaded textures", (byte) 109);

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lid;")
    public static class149 field1143 = class60.method382("Shift)2click disabled)3", (byte) 78);

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lid;")
    private static class149 field1145 = class60.method382("Loaded config", (byte) 121);

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lid;")
    private static class149 field1141 = class60.method382("Started 3d Library", (byte) 12);

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1146 = 50;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lid;")
    public static class149 field1149 = field1141;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lid;")
    public static class149 field1147 = field1145;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lid;")
    public static class149 field1142 = field1140;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "J")
    public long field1148;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Lal;")
    public static class230 field1152;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Ljf;")
    public class64 field1144;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Ljf;")
    public class64 field1153;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)Z")
    public final boolean method400(byte arg0) {
        field1150++;
        if (arg0 >= -82) {
            method403(true);
        }
        return this.field1153 != null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public final void method401(byte arg0) {
        field1151++;
        if (this.field1153 == null) {
            return;
        }
        this.field1153.field1144 = this.field1144;
        this.field1144.field1153 = this.field1153;
        if (arg0 == -118) {
            this.field1153 = null;
            this.field1144 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIIIB)V")
    public static final void method402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field1138++;
        int var9 = arg2 - arg5;
        if (arg8 >= -47) {
            field1141 = null;
        }
        int var10 = arg4 - arg1;
        int var11 = (arg0 - arg7 << 16) / var9;
        int var12 = (arg3 - arg6 << 16) / var10;
        class131.method919(arg2, var12, arg1, arg7, 16777215, arg5, 0, arg6, arg4, var11, 0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public static void method403(boolean arg0) {
        field1142 = null;
        field1140 = null;
        field1143 = null;
        field1149 = null;
        if (!arg0) {
            method402(127, 80, -84, -83, 12, -128, -117, -29, (byte) -118);
        }
        field1139 = null;
        field1141 = null;
        field1152 = null;
        field1147 = null;
        field1145 = null;
    }
}

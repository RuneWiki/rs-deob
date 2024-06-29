import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class52 {

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Z")
    public boolean field1061 = true;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field1063 = 0;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lrd;")
    public static class173 field1067 = class133.method843("mapflag", -90);

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Lrd;")
    private static class173 field1070 = class133.method843("level)2", -66);

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "[J")
    public static long[] field1074 = new long[100];

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Lrd;")
    public static class173 field1073 = field1070;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "[S")
    public static short[] field1071;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static void method351(byte arg0) {
        field1067 = null;
        field1071 = null;
        field1074 = null;
        field1070 = null;
        if (arg0 < -18) {
            field1073 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1065 = arg4;
        this.field1069 = arg3;
        this.field1066 = arg2;
        this.field1064 = arg5;
        this.field1062 = arg0;
        this.field1061 = arg6;
        this.field1060 = arg1;
    }
}

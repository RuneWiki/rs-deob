import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class401 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Lhj;")
    public static class400 field5880 = class376.method2243(47);

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Z")
    public static boolean field5885 = false;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[I")
    public static int[] field5884 = new int[13];

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field5886 = -1;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Lol;")
    public static class187 field5883 = new class187("", 16);

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field5887 = 0;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field5888 = 0;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lbm;")
    public static class75 field5882;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
    public static final void method2418(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field5881++;
        class124 var8 = new class124();
        var8.field1846 = class441.field6516 + arg2;
        var8.field1853 = arg0;
        var8.field1843 = arg1;
        var8.field1849 = arg7;
        var8.field1850 = arg4;
        var8.field1848 = arg6;
        var8.field1844 = arg5;
        class388.field5656.method2454(-9946, var8);
        if (arg3 != 13150) {
            method2418(-24, -99, 86, 46, -5, null, 35, 109);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method2419(int arg0) {
        if (arg0 == 13) {
            field5880 = null;
            field5882 = null;
            field5883 = null;
            field5884 = null;
        }
    }
}

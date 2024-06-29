import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class68 extends class333 {

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "[[F")
    public static float[][] field945 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "[I")
    public static int[] field950 = new int[5];

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "Llda;")
    public static class511 field951;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Z")
    public static final boolean method575(int arg0) {
        if (arg0 == -22203) {
            field947++;
            return class697.field9244;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Leo;")
    public class313 method576(byte arg0) {
        if (arg0 != 41) {
            this.field940 = 33;
        }
        field942++;
        return class709.field9694;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
    public static void method577(byte arg0) {
        field950 = null;
        int var1 = 112 / ((-arg0 - 76) / 34);
        field951 = null;
        field945 = null;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Log;Lgi;IIIIIIIIIIIII)V")
    public class68(class673 arg0, class705 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field949 = arg11;
        this.field940 = arg12;
        this.field946 = arg10;
        this.field941 = arg13;
        this.field944 = arg14;
        this.field948 = arg9;
    }
}

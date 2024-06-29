import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public abstract class class26 {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field296 = "Loading defaults - ";

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Z")
    public static boolean field297 = true;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "[I")
    public static int[] field300 = new int[256];

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "[I")
    public static int[] field301;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "[[[I")
    public static int[][][] field302;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)V")
    public static final void method184(boolean arg0, int arg1) {
        field298++;
        class21.field232.method1548(arg1, 0);
        class289.field4583.method1548(arg1, 0);
        if (arg0) {
            method184(true, -84);
        }
        class268.field4331.method1548(arg1, 0);
        class119.field1719.method1548(arg1, 0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)I")
    public abstract int method185(int arg0, int arg1);

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)[B")
    public abstract byte[] method186(int arg0, int arg1);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method187(int arg0, int arg1, String arg2) {
        if (arg1 != 2583) {
            field302 = null;
        }
        class201 var3 = class94.method738(arg1 ^ 0xFFFFF59A, arg0, 3);
        field299++;
        var3.method1477(0);
        var3.field3230 = arg2;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)V")
    public abstract void method188(int arg0, boolean arg1);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)Lw;")
    public abstract class146 method189(byte arg0);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method190(int arg0) {
        if (arg0 != 28560) {
            field301 = null;
        }
        field301 = null;
        field300 = null;
        field302 = null;
        field296 = null;
    }
}

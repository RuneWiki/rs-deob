import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class285 {

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "[Z")
    public static boolean[] field3667 = new boolean[100];

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)V")
    public static void method1738(byte arg0) {
        field3667 = null;
        int var1 = 107 / ((arg0 - 88) / 32);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)Z")
    public static final boolean method1739(int arg0, int arg1, int arg2) {
        field3666++;
        if (arg0 != 100) {
            field3668 = -17;
        }
        return class472.method2664(arg1, arg2, -8056) || class92.method554(arg2, (byte) 114, arg1);
    }
}

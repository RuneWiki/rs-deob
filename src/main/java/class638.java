import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class638 extends class50 {

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public int field9174;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Lmv;")
    public static class295 field9171;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "[I")
    public static int[] field9173;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "[Z")
    public static boolean[] field9172;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)V", line = 4)
    public static void method3643(boolean arg0) {
        if (!arg0) {
            field9171 = null;
            field9173 = null;
            field9172 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIB)V", line = 23)
    public static final void method3644(int arg0, int arg1, byte arg2) {
        class139.method980(-1, arg1, arg0);
        field9170++;
        int var3 = 8 % ((arg2 - 60) / 33);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Z", line = 33)
    public static final boolean method3645(byte arg0) {
        field9169++;
        if (arg0 != -75) {
            field9173 = null;
        }
        return class436.method2588("jaclib", (byte) 58) ? class436.method2588("hw3d", (byte) 33) : false;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I)V", line = 48)
    public class638(int arg0) {
        this.field9174 = arg0;
    }
}

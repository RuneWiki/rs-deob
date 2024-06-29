import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public abstract class class204 {

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Lfs;")
    public class607 field2853;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public int field2852;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "[I")
    public static int[] field2848 = new int[8];

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "[I")
    public static int[] field2849;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I")
    public abstract int method487(int arg0, int arg1);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public abstract void method486(int arg0);

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)Z")
    public static final boolean method1307(int arg0) {
        int var1 = 96 % ((arg0 - 11) / 51);
        field2854++;
        return class664.field9331 >= 1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)I")
    public abstract int method490(byte arg0);

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)I")
    public static final int method1308(int arg0, int arg1) {
        field2851++;
        if (arg1 <= 86) {
            method1308(79, -42);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(II)V")
    public final void method1309(int arg0, int arg1) {
        if (arg0 != this.method487(arg1, arg0 ^ 0xD)) {
            this.method488(arg1, arg0 - 119);
        }
        field2850++;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(II)V")
    public abstract void method488(int arg0, int arg1);

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lfs;)V")
    public class204(class607 arg0) {
        this.field2853 = arg0;
        this.field2852 = this.method490((byte) 88);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(ILfs;)V")
    public class204(int arg0, class607 arg1) {
        this.field2853 = arg1;
        this.field2852 = arg0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static void method1310(boolean arg0) {
        field2849 = null;
        if (!arg0) {
            method1307(23);
        }
        field2848 = null;
    }
}

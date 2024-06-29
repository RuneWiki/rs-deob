import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class class187 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Ldf;")
    public static class231 field3284 = new class231(16);

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Lqj;")
    public static class196 field3286 = class80.method502("blinken3:", -48);

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field3287 = 1;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "[Lqj;")
    public static class196[] field3285 = new class196[100];

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "[[[B")
    public static byte[][][] field3288;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method1223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg4 - arg0 >= class188.field3296 && arg0 + arg4 <= class95.field1388 && arg1 - arg0 >= class93.field1361 && arg1 + arg0 <= class23.field291) {
            class256.method1724(arg4, arg0, arg3, arg5, arg2, arg1, 23433);
        } else {
            class199.method1344(arg5, arg0, arg2, arg1, arg4, arg6, arg3);
        }
        field3282++;
        if (!arg6) {
            field3287 = 80;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method1224(byte arg0) {
        if (arg0 > -87) {
            method1225(-126, -84);
        }
        field3284 = null;
        field3285 = null;
        field3286 = null;
        field3288 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public abstract void method149(int arg0);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Z")
    public static final boolean method1225(int arg0, int arg1) {
        if (arg1 == 1) {
            field3283++;
            return (arg0 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)I")
    public abstract int method150(int arg0, int arg1, int arg2);
}

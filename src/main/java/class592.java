import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class592 {

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lji;")
    public class622 field8014;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Z")
    public static boolean field8013 = false;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field8016 = 0;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "[Ldg;")
    public static class193[] field8019 = new class193[2048];

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "[I")
    public static int[] field8018 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Loi;")
    public static class57 field8017;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILgq;)V")
    public abstract void method35(int arg0, int arg1, class710 arg2);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public abstract void method29(int arg0);

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lji;)V")
    public class592(class622 arg0) {
        this.field8014 = arg0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method3220(byte arg0) {
        field8019 = null;
        field8017 = null;
        if (arg0 >= 51) {
            field8018 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Z")
    public static final boolean method3221(int arg0, int arg1, int arg2) {
        int var3 = -111 % ((52 - arg0) / 59);
        field8015++;
        return (arg1 & 0x70000) != 0 | class560.method2995(arg2, arg1, 1536) || class575.method3086(arg2, (byte) 124, arg1);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)V")
    public abstract void method32(int arg0, boolean arg1);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZII)V")
    public abstract void method33(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)Z")
    public abstract boolean method30(byte arg0);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZB)V")
    public abstract void method27(boolean arg0, byte arg1);
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class185 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Llg;")
    public static class20 field2353;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILtq;)Lsd;")
    public static final class67 method994(int arg0, class250 arg1) {
        if (arg0 == -2) {
            field2354++;
            return new class67(arg1.method1366((byte) 20), arg1.method1366((byte) -87), arg1.method1366((byte) -112), arg1.method1366((byte) 84), arg1.method1372(-2), arg1.method1372(-2), arg1.method1350(31351));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BB)Z")
    public static final boolean method995(byte[] arg0, byte arg1) {
        int var2 = 8 % ((39 - arg1) / 58);
        field2352++;
        class250 var3 = new class250(arg0);
        int var4 = var3.method1350(31351);
        if (var4 != 1) {
            return false;
        }
        boolean var5 = var3.method1350(31351) == 1;
        if (var5) {
            class254.method1438(4900, var3);
        }
        class260.method1455(var3, -25160);
        return true;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method996(byte arg0) {
        field2353 = null;
        int var1 = -100 / ((4 - arg0) / 46);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLgd;)Lgd;")
    public abstract class110 method997(byte arg0, class110 arg1);
}

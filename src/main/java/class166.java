import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public abstract class class166 extends class213 {

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!cn", name = "C", descriptor = "Z")
    public static boolean field2324;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II[B)I", line = 13)
    public static final int method1241(int arg0, int arg1, byte[] arg2) {
        field2321++;
        if (arg1 != 0) {
            method1241(-18, -34, (byte[]) null);
        }
        return class213.method1555(arg2, arg0, 94, 0);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)Lg;", line = 31)
    public static final class42 method1242(int arg0, int arg1, int arg2) {
        if (arg2 != -1249071392) {
            field2324 = true;
        }
        class42 var3 = (class42) class117.field1529.method2279((long) arg0 << 32 | (long) arg1, -126);
        if (var3 == null) {
            var3 = new class42(arg0, arg1);
            class117.field1529.method2275(var3, 108, var3.field304);
        }
        field2322++;
        return var3;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method1239(boolean arg0);

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)Z")
    public abstract boolean method1240(int arg0);
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public abstract class class372 {

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Lne;")
    public static class139 field5519 = new class139("WTI", 5);

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "[I")
    public static int[] field5522 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field5523;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 3)
    public static void method2392(int arg0) {
        field5522 = null;
        if (arg0 != 0) {
            field5522 = null;
        }
        field5523 = null;
        field5519 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([SBI)[S", line = 15)
    public static final short[] method2393(short[] arg0, byte arg1, int arg2) {
        field5518++;
        short[] var3 = new short[arg2];
        if (arg1 < 12) {
            field5519 = null;
        }
        class325.method2137(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)V", line = 32)
    public static final void method2394(int arg0, int arg1, int arg2, int arg3) {
        field5521++;
        class188 var4 = class10.method48((byte) 111, arg3, arg0);
        var4.method1308(false);
        var4.field2873 = arg1;
        var4.field2882 = arg2;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[BII)I")
    public abstract int method2152(int arg0, byte[] arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public abstract void method2156(int arg0);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Z")
    public abstract boolean method2158(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
    public abstract void method2155(boolean arg0);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III[B)V")
    public abstract void method2159(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;
}

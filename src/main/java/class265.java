import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class265 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "[S")
    public static short[] field3976 = new short[256];

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3981 = "shake:";

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "[B")
    public static byte[] field3982 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public int field3984;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Lgn;")
    public class170 field3978;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Lil;")
    public static class264 field3987;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "[I")
    public int[] field3986;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "[[[Lsk;")
    public static class168[][][] field3980;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZB)V")
    public static final void method1891(boolean arg0, byte arg1) {
        field3983++;
        if (arg1 == 0 && class308.field4506 != arg0) {
            class308.field4506 = arg0;
            class358.method2297(false);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static void method1892(byte arg0) {
        field3987 = null;
        if (arg0 != 62) {
            field3977 = -9;
        }
        field3982 = null;
        field3981 = null;
        field3976 = null;
        field3980 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILdp;IB)Leb;")
    public static final class382 method1893(int arg0, class174 arg1, int arg2, byte arg3) {
        field3979++;
        if (arg3 >= -95) {
            field3981 = null;
        }
        byte[] var4 = arg1.method1355(arg2, -12607, arg0);
        return var4 == null ? null : new class382(var4);
    }
}

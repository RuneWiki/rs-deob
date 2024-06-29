import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class class154 extends class199 {

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "Z")
    public volatile boolean field2317 = true;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "Ljava/lang/String;")
    public static String field2314 = "Started 3d Library";

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "Z")
    public static boolean field2311 = false;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field2313 = 0;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "Lba;")
    public static class53 field2319 = new class53(128);

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2322 = "shake:";

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "Z")
    public boolean field2312;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "Z")
    public boolean field2316;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLl;I)Lwj;", line = 5)
    public static final class270 method1058(int arg0, byte arg1, class133 arg2, int arg3) {
        field2321++;
        if (class181.method1296(false, arg2, arg3, arg0)) {
            return arg1 <= 17 ? (class270) null : class289.method1987(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 22)
    public static void method1059(byte arg0) {
        field2314 = null;
        int var1 = -123 % ((-arg0 - 52) / 37);
        field2319 = null;
        field2322 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILkh;)Ljava/lang/String;", line = 38)
    public static final String method1060(int arg0, int arg1, class166 arg2) {
        field2315++;
        try {
            if (arg0 != 128) {
                method1060(-37, -105, (class166) null);
            }
            int var3 = arg2.method1145(arg0);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field2532 += class26.field398.method1035(var4, arg2.field2532, (byte) -100, var3, arg2.field2500, 0);
            return class26.method240(var4, (byte) 56, 0, var3);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V", line = 68)
    public static final void method1061(byte arg0) {
        if (arg0 == 36) {
            class281.field4320 = new class170(32);
            field2318++;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V", line = 105)
    public static final void method1062(int arg0, int arg1) {
        field2320++;
        class250.method1736(class250.field3943, ((float) arg1 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        class250.method1734(-50.0F, -60.0F, -50.0F);
        class250.method1730(class250.field3948, arg0, false);
        class250.method1738();
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)[B")
    public abstract byte[] method410(boolean arg0);

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)I")
    public abstract int method414(int arg0);
}

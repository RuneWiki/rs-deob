import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class132 {

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "Z")
    public static boolean field2128 = false;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "Lmb;")
    public static class258 field2132 = null;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "[[B")
    public static byte[][] field2131 = new byte[50][];

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "Lce;")
    public static class345 field2134 = new class345(128);

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public static int field2136 = 0;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "Lvq;")
    public static class22 field2135 = new class22();

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "Ldp;")
    public static class174 field2126;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)Lkf;")
    public static final class293 method1099(boolean arg0, int arg1) {
        if (arg0) {
            method1101((byte) 103);
        }
        field2127++;
        class18 var2 = class197.field2875;
        class293 var3;
        synchronized (class197.field2875) {
            var3 = (class293) class197.field2875.method103(0, (long) arg1);
            if (var3 == null) {
                var3 = new class293(arg1);
                class197.field2875.method113(var3, 0, (long) arg1);
            }
        }
        synchronized (var3) {
            return var3.method2050((byte) 116) ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)V")
    public static final void method1100(int arg0, int arg1) {
        class349.field4961.method104(arg1, (byte) -34);
        if (arg0 > -42) {
            method1099(false, 59);
        }
        field2133++;
        class264.field3974.method104(arg1, (byte) -34);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
    public static void method1101(byte arg0) {
        field2126 = null;
        field2135 = null;
        field2131 = null;
        field2132 = null;
        field2134 = null;
        int var1 = 28 % ((28 - arg0) / 56);
    }
}

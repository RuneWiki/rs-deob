import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class6 extends class35 {

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
    public static int field129 = 0;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "Lab;")
    public static class279 field133 = new class279(64);

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field135 = -1;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static volatile int field138 = 0;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public int field118;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public int field128;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "Z")
    public static boolean field136;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "[[[B")
    public static byte[][][] field137;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILbm;IZ)[Loj;", line = 7)
    public static final class283[] method60(int arg0, class307 arg1, int arg2, boolean arg3) {
        field134++;
        if (class135.method885(arg0, arg1, -10948, arg2)) {
            return arg3 ? (class283[]) null : class122.method787((byte) -120);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 27)
    public static void method61(int arg0) {
        field133 = null;
        if (arg0 > -52) {
            method61(84);
        }
        field137 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ISIJILjava/lang/String;ILjava/lang/String;)V", line = 40)
    public static final void method62(int arg0, short arg1, int arg2, long arg3, int arg4, String arg5, int arg6, String arg7) {
        field123++;
        if (arg4 != -1) {
            field133 = (class279) null;
        }
        if (class290.field4459 || class48.field999 >= 500) {
            return;
        }
        class256.field3998[class48.field999] = arg5;
        class296.field4515[class48.field999] = arg7;
        class169.field2715[class48.field999] = arg2 == -1 ? class268.field4140 : arg2;
        class120.field2088[class48.field999] = arg1;
        class11.field226[class48.field999] = arg3;
        class153.field2502[class48.field999] = arg6;
        class255.field3988[class48.field999] = arg0;
        class48.field999++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V", line = 75)
    public static final void method63(int arg0, int arg1, int arg2) {
        field121++;
        class2 var3 = class212.method1433(arg0, 6, -13802);
        if (arg1 >= -115) {
            field137 = (byte[][][]) ((byte[][][]) null);
        }
        var3.method13((byte) -1);
        var3.field39 = arg2;
    }
}

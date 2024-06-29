import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class151 {

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public int field2179;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Lhp;")
    private class296 field2180;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "[B")
    public static byte[] field2184 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "([J[Ljava/lang/Object;B)V")
    public static final void method1064(long[] arg0, Object[] arg1, byte arg2) {
        field2183++;
        if (arg2 != 62) {
            method1066(-51, null, true);
        }
        class398.method2442(arg0.length - 1, arg1, arg0, 1, 0);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)Lbt;")
    public static final class40 method1065(int arg0, int arg1, int arg2) {
        if (class153.field2210[arg0][arg1][arg2] == null) {
            boolean var3 = class153.field2210[0][arg1][arg2] != null && class153.field2210[0][arg1][arg2].field668 != null;
            if (var3 && arg0 >= class41.field685 - 1) {
                return null;
            }
            class701.method3903(arg0, arg1, arg2);
        }
        return class153.field2210[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method1066(int arg0, String arg1, boolean arg2) {
        field2182++;
        if (!arg2) {
            method1064(null, null, (byte) -55);
        }
        class355.method2172(49);
        class270.method1756((byte) 61);
        class169.method1163(76);
        class366.method2219(arg1, arg0, 7394);
        class75.method706(arg2);
        class136.method990(class282.field4228, (byte) -91);
        class658.method3624(class282.field4228, 2);
        class699.method3898(true, class703.field9909, class282.field4228);
        class271.method1787(7);
        class267.method1747(1, class258.field3939);
        class158.method1100(-65);
        class496.method2869(111);
        if (class420.field6113 == 3) {
            class112.method868(4, (byte) 1);
        } else if (class420.field6113 == 7) {
            class112.method868(8, (byte) -113);
        } else if (class420.field6113 == 10) {
            class112.method868(11, (byte) -117);
        } else if (class420.field6113 == 1 || class420.field6113 == 2) {
            class628.method3503(6025);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)V")
    public static void method1067(boolean arg0) {
        if (!arg0) {
            method1067(false);
        }
        field2184 = null;
    }

    @OriginalMember(owner = "client!wq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2181++;
        this.field2180.method1900(this.field2179, 30525);
        super.finalize();
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lhp;II)V")
    public class151(class296 arg0, int arg1, int arg2) {
        this.field2179 = arg2;
        this.field2180 = arg0;
    }
}

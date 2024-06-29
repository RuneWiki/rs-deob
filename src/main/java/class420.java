import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class class420 {

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lao;")
    public static class188 field6180 = new class188(106, 8);

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field6182 = 0;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Z")
    public static boolean field6183 = true;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Lao;")
    public static class188 field6184 = new class188(68, 8);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Lhh;")
    public static class84 field6181;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)I")
    public static final int method2574(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field6182 = -73;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        field6179++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)J")
    public abstract long method242(boolean arg0);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method2575(byte arg0) {
        if (arg0 != -43) {
            method2575((byte) -29);
        }
        field6184 = null;
        field6180 = null;
        field6181 = null;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)C")
    public abstract char method233(byte arg0);

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)I")
    public abstract int method244(byte arg0);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIZI)V")
    public static final void method2576(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg2 == 31027) {
            field6178++;
            if (class91.method738(false, arg1)) {
                class417.method2564(arg0, arg3, (byte) -123, arg4, -1, class416.field6157[arg1]);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(B)I")
    public abstract int method245(byte arg0);

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(B)Z")
    public abstract boolean method238(byte arg0);
}

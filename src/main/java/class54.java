import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class54 extends class102 {

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "[J")
    public static long[] field934 = new long[1000];

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "Lr;")
    public static class66 field935 = class93.method641(43, "showingVideoAd");

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "Lr;")
    public static class66 field941 = class93.method641(43, ":duelfriend:");

    @OriginalMember(owner = "client!tf", name = "V", descriptor = "I")
    public static int field944 = 127;

    @OriginalMember(owner = "client!tf", name = "W", descriptor = "I")
    public static int field945 = -1;

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
    public static int field942 = 0;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "Lr;")
    public static class66 field938 = class93.method641(43, "underlay");

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "B")
    public byte field936;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!tf", name = "X", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!tf", name = "Y", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!tf", name = "Z", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!tf", name = "ab", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!tf", name = "bb", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "Lsg;")
    public class247 field939;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V")
    public static void method365(byte arg0) {
        field941 = null;
        field935 = null;
        field934 = null;
        if (arg0 != -63) {
            method365((byte) -1);
        }
        field938 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field940++;
        if (arg1 == arg4) {
            class214.method1375(arg6, arg2, arg5, arg1, arg3, 73, arg0);
            return;
        }
        if (class165.field2972 <= (arg2 - arg1) && class215.field3706 >= arg1 + arg2 && arg3 - arg4 >= class241.field4186 && (arg3 + arg4) <= class222.field3788) {
            class247.method1627(arg5, arg4, arg6, arg2, arg0, arg1, (byte) -111, arg3);
        } else {
            class50.method350(arg0, arg1, arg3, arg4, arg6, arg2, arg5, -1832820639);
        }
        if (arg7 != -12) {
            field941 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)Lha;")
    public static final class63 method367(int arg0, byte arg1) {
        if (arg1 != -80) {
            field941 = null;
        }
        field946++;
        int var2 = arg0 & 0xFFFF;
        int var3 = arg0 >> 16;
        if (class31.field466[var3] == null || class31.field466[var3][var2] == null) {
            boolean var4 = class164.method1107(var3, (byte) -2);
            if (!var4) {
                return null;
            }
        }
        return class31.field466[var3][var2];
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIBI)I")
    public static final int method368(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 114) {
            field945 = 105;
        }
        field949++;
        if (arg0 < arg3) {
            return arg3;
        } else if (arg0 <= arg1) {
            return arg0;
        } else {
            return arg1;
        }
    }
}

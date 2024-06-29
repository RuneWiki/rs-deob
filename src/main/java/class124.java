import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class124 extends class32 {

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Lij;")
    private static class50 field2173 = class78.method578(121, "Ok");

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "[I")
    public static int[] field2175 = new int[128];

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field2172 = 0;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field2167 = -1;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Lij;")
    public static class50 field2174 = field2173;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public int field2178;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Lwi;")
    public class21 field2169;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "Lwi;")
    public static class21 field2181;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Lbf;")
    public class47 field2179;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "[B")
    public byte[] field2182;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static void method896(byte arg0) {
        field2181 = null;
        field2173 = null;
        field2174 = null;
        if (arg0 != -59) {
            method896((byte) 75);
        }
        field2175 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIBIIII)V")
    public static final void method897(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class177.field2953 <= (arg6 - arg1) && (arg1 + arg6) <= class224.field3773 && class100.field1855 <= arg3 - arg1 && (arg1 + arg3) <= class97.field1816) {
            class160.method1129(arg4, arg6, arg3, arg5, (byte) -3, arg0, arg1);
        } else {
            class231.method1576(arg1, arg4, arg5, arg0, arg3, (byte) -119, arg6);
        }
        int var7 = -100 / ((arg2 + 62) / 56);
        field2177++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I")
    public static final int method898(int arg0, int arg1) {
        field2170++;
        int var2 = arg1 & 0x3F;
        if (arg0 != -4) {
            method897(122, 113, (byte) -92, -22, -98, -36, 126);
        }
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }
}

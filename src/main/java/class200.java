import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class200 {

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field2919 = 0;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "B")
    public byte field2911;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "B")
    public byte field2912;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "B")
    public byte field2917;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "B")
    public byte field2926;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "B")
    public byte field2929;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "B")
    public byte field2930;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "B")
    public byte field2934;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Ldj;")
    public static class304 field2925;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Laj;")
    public static class71 field2916;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "S")
    public short field2918;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Z")
    public boolean field2910;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Z")
    public boolean field2914;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Z")
    public boolean field2915;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Z")
    public boolean field2920;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Z")
    public boolean field2921;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Z")
    public boolean field2922;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Z")
    public boolean field2923;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Z")
    public boolean field2927;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "Z")
    public boolean field2931;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "[I")
    public static int[] field2932;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "[Lof;")
    public static class421[] field2924;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static final void method1520(int arg0) {
        field2913++;
        class221 var1 = class447.method2795(15, (byte) -49, 0);
        var1.method1689(-102);
        if (arg0 != -277309434) {
            field2925 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2928++;
        if (arg7 != -25216) {
            method1520(-111);
        }
        if (class51.method407(arg6, arg7 + 25220)) {
            client.method1810(class45.field710[arg6], -1, arg5, arg1, arg3, arg4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
    public static void method1522(boolean arg0) {
        if (!arg0) {
            field2919 = 57;
        }
        field2932 = null;
        field2925 = null;
        field2924 = null;
        field2916 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)I")
    public static final int method1523(int arg0, byte arg1) {
        field2933++;
        if (arg1 > -87) {
            return 47;
        }
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xC9) >> 6;
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

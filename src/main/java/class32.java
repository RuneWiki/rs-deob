import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class32 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Lud;")
    public static class279 field724 = class130.method1024("Benutzen", 255);

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Lud;")
    public static class279 field728 = class130.method1024("leuchten1:", 255);

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Lud;")
    public static class279 field729 = class130.method1024("floorshadows", 255);

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Ldg;")
    public static class317 field727 = new class317();

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Ldd;")
    public static class247 field732 = new class247(64);

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lud;")
    public static class279 field733;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)V", line = 40)
    public static final void method292(byte arg0, int arg1) {
        int var2 = -34 / ((arg0 - 19) / 48);
        class104 var3 = class293.method2085(4, arg1, false);
        var3.method875(12466);
        field730++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IS)Z", line = 68)
    public static final boolean method293(int arg0, short arg1) {
        field725++;
        if (arg1 == 45 || arg1 == 37 || arg1 == 22 || arg1 == 13 || arg1 == 10 || arg1 == 7 || arg1 == 3 || arg1 == 39) {
            return true;
        } else if (arg1 == 44 || arg1 == 6 || arg1 == 1001 || arg1 == 1005) {
            return true;
        } else if (arg1 == 38 || arg1 == 41 || arg1 == 29 || arg1 == 2 || arg1 == 42) {
            return true;
        } else if (arg1 == 46 || arg1 == 24 || arg1 == 5 || arg1 == 17 || arg1 == 35 || arg1 == 14) {
            return true;
        } else {
            int var2 = -62 / ((86 - arg0) / 37);
            return false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BIII)I", line = 176)
    public static final int method294(byte arg0, int arg1, int arg2, int arg3) {
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        field731++;
        int var4 = -48 % ((-arg0 - 3) / 63);
        return (arg1 >> 5 << 7) + (arg2 >> 2 << 10) + (arg3 >> 1);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 205)
    public static void method295(byte arg0) {
        field733 = null;
        field732 = null;
        field729 = null;
        field724 = null;
        if (arg0 != -122) {
            method292((byte) -53, -109);
        }
        field728 = null;
        field727 = null;
    }
}

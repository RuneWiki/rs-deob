import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 extends class217 {

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    private final int field142;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    private final int field136;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    private final int field139;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    private final int field122;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "Lbe;")
    public static class283 field128 = class153.method941(-57, " loggt sich ein)3");

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public static int field131 = -1;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "Lbe;")
    public static class283 field126 = class153.method941(126, "mem=");

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "[I")
    public static int[] field127 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "Lbe;")
    private static class283 field130 = class153.method941(125, "green:");

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "Lbe;")
    public static class283 field137 = field130;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "Lbe;")
    public static class283 field125 = field130;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZII)V", line = 5)
    public final void method66(boolean arg0, int arg1, int arg2) {
        field132++;
        if (arg0) {
            field131 = -4;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IIIIII)V", line = 22)
    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field142 = arg3;
        this.field136 = arg2;
        this.field139 = arg0;
        this.field122 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(III)V", line = 36)
    public final void method67(int arg0, int arg1, int arg2) {
        int var4 = this.field136 * arg0 >> 12;
        field140++;
        if (arg2 == 17113) {
            int var5 = this.field139 * arg0 >> 12;
            int var6 = this.field122 * arg1 >> 12;
            int var7 = this.field142 * arg1 >> 12;
            class143.method901(this.field3671, var4, var7, var6, var5, (byte) 36);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V", line = 59)
    public final void method68(int arg0, int arg1, int arg2) {
        if (arg1 <= -28) {
            field129++;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 69)
    public static void method69(int arg0) {
        field126 = null;
        field130 = null;
        field128 = null;
        field125 = null;
        field127 = null;
        field137 = null;
        if (arg0 != 91) {
            method70((class172) null, true);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lek;Z)V", line = 99)
    public static final void method70(class172 arg0, boolean arg1) {
        class86.field1456 = arg0;
        field141++;
        if (!arg1) {
            method73(-92);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[Lkg;ZII)V", line = 130)
    public static final void method71(int arg0, int arg1, class69[] arg2, boolean arg3, int arg4, int arg5) {
        field123++;
        int var6 = 0;
        int var7 = -9 / ((-arg5 - 46) / 46);
        while (var6 < arg2.length) {
            class69 var8 = arg2[var6];
            if (var8 != null && var8.field1059 == arg4) {
                class46.method268(var8, arg3, arg1, arg0, (byte) -89);
                class2.method10((byte) 127, arg0, arg1, var8);
                if (var8.field998 - var8.field1069 < var8.field1011) {
                    var8.field1011 = var8.field998 - var8.field1069;
                }
                if (var8.field987 - var8.field1085 < var8.field1098) {
                    var8.field1098 = var8.field987 - var8.field1085;
                }
                if (var8.field1011 < 0) {
                    var8.field1011 = 0;
                }
                if (var8.field1098 < 0) {
                    var8.field1098 = 0;
                }
                if (var8.field1143 == 0) {
                    class245.method1668(arg3, var8, 0);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z[IIJ)Lbe;", line = 176)
    public static final class283 method72(boolean arg0, int[] arg1, int arg2, long arg3) {
        if (arg0) {
            return (class283) null;
        }
        field133++;
        if (class33.field487 != null) {
            class283 var5 = class33.field487.method408(arg3, arg2, arg1, 126);
            if (var5 != null) {
                return var5;
            }
        }
        return arg2 == 5 ? class232.method1567(arg3, -124).method1901(4095) : class178.method1173((byte) -123, arg3);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V", line = 204)
    public static final void method73(int arg0) {
        class212.method1396(104, 104);
        field135++;
        class20.method136(class94.field1587, 0, class69.field1067);
        class57.method369(class69.field1067, false);
        int var1 = -62 % ((-arg0 - 49) / 41);
        if (class175.field3019 == 10) {
            class77.method506(28, -30354);
        }
        if (class175.field3019 == 30) {
            class77.method506(25, -30354);
        }
    }
}

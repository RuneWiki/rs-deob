import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class94 {

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Lsg;")
    public static class169 field1753 = class165.method1060(")3", 1536);

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "[I")
    public static int[] field1756 = new int[256];

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lsg;")
    public static class169 field1751 = class165.method1060("Standort", 1536);

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "[[B")
    public static byte[][] field1759 = new byte[50][];

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lsg;")
    private static class169 field1763;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "Lsg;")
    public static class169 field1762;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Lqd;")
    public static class148 field1750;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "[Lbg;")
    public static class18[] field1760;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lke;BI)Z")
    public static final boolean method546(class95 arg0, byte arg1, int arg2) {
        if (arg1 != -55) {
            method549((byte) -37);
        }
        field1757++;
        byte[] var3 = arg0.method558(arg2, -108);
        if (var3 == null) {
            return false;
        } else {
            class22.method154(arg1 ^ 0xFFFFFFC9, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)I")
    public static final int method547(int arg0, int arg1, int arg2, int arg3) {
        field1755++;
        if (arg1 > 179) {
            arg3 /= 2;
        }
        if (arg1 > 192) {
            arg3 /= 2;
        }
        if (arg1 > 217) {
            arg3 /= 2;
        }
        if (arg1 > 243) {
            arg3 /= 2;
        }
        int var4 = arg1 / 2 + (arg0 / 4 << 10) + (arg3 / 32 << 7);
        if (arg2 != -10271) {
            method547(-49, -74, 125, -27);
        }
        return var4;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILqd;I)V")
    public static final void method548(int arg0, class148 arg1, int arg2) {
        field1754++;
        if (arg2 < 9) {
            method548(70, null, 46);
        }
        if (class182.field3554 == null) {
            class106.method621(0, (byte) 0, (byte) -87, true, 255, null, 255);
            class93.field1748[arg0] = arg1;
        } else {
            class182.field3554.field2346 = arg0 * 8 + 5;
            int var3 = class182.field3554.method814(8);
            int var4 = class182.field3554.method814(8);
            arg1.method969(var4, var3, 24657);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method549(byte arg0) {
        field1753 = null;
        field1759 = null;
        int var1 = -69 / ((-arg0 - 57) / 62);
        field1750 = null;
        field1756 = null;
        field1751 = null;
        field1762 = null;
        field1763 = null;
        field1760 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1756[var0] = var1;
        }
        field1763 = class165.method1060("as it was used to break our rules)3", 1536);
        field1762 = field1763;
    }
}

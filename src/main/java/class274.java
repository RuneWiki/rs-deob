import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class274 {

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "Lfc;")
    public static class235 field3865 = new class235(83, 6);

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "[[B")
    public static byte[][] field3870 = new byte[250][];

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
    public int field3861;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
    public int field3864;

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
    public int field3867;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "Lvaa;")
    public static class431 field3872;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
    public static final void method1666(int arg0) {
        if (arg0 == 128) {
            class124.field1722 = 0;
            field3868++;
            class247.field3508 = -1;
            class178.field2636 = -1;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3862++;
        int var8 = arg6 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class576.field7742 - class590.field8217) * var8 / 100 + class590.field8217;
        int var10 = arg5 * var9 >> 8;
        int var11 = 16384 - arg1 & 0x3FFF;
        int var12 = 16384 - arg7 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class675.field9542[var11] * -var10 >> 14;
            var15 = class675.field9541[var11] * var10 >> 14;
        }
        if (~var12 != arg4) {
            var13 = class675.field9542[var12] * var15 >> 14;
            var15 = class675.field9541[var12] * var15 >> 14;
        }
        class492.field6794 = arg1;
        class591.field8245 = arg7;
        class172.field2572 = arg3 - var13;
        class263.field3732 = 0;
        class117.field1563 = arg0 - var15;
        class628.field8762 = arg2 - var14;
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
    public static final void method1668(int arg0) {
        if (arg0 != -18820) {
            method1667(-117, -121, 120, 121, 82, 50, -10, 70);
        }
        field3863++;
        for (class81 var1 = (class81) class138.field1938.method1270((byte) -25); var1 != null; var1 = (class81) class138.field1938.method1282(arg0 + 18820)) {
            if (var1.field1120 == -1) {
                var1.field1130 = 0;
                if (var1.field1121 >= 0 && var1.field1127 >= 0 && class86.field1185 > var1.field1121 && var1.field1127 < class526.field7212) {
                    class654.method3637(var1, (byte) -122);
                }
            } else {
                var1.method2971(arg0 ^ 0xFFFFB67D);
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)I")
    public static final int method1669(int arg0) {
        field3869++;
        if (arg0 >= -105) {
            field3870 = null;
        }
        return class684.field9621;
    }

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "(I)V")
    public static void method1670(int arg0) {
        field3865 = null;
        field3872 = null;
        if (arg0 <= 0) {
            field3872 = null;
        }
        field3870 = null;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BZ)C")
    public static final char method1671(byte arg0, boolean arg1) {
        field3866++;
        if (!arg1) {
            return '-';
        }
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class587.field8205[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }
}

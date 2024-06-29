import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class105 {

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Lph;")
    private static class229 field1784 = class266.method1858(" from your ignore list first)3", 0);

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Lph;")
    public static class229 field1781 = class266.method1858("welle:", 0);

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "[I")
    public static int[] field1782 = new int[2048];

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "[Z")
    public static boolean[] field1776 = new boolean[8];

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Lph;")
    public static class229 field1785 = field1784;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Lph;")
    private static class229 field1787 = class266.method1858("Loaded interfaces", 0);

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "Lph;")
    public static class229 field1789 = field1787;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Lvm;")
    public static class202 field1786 = new class202(64);

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field1790 = 0;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lsi;")
    public static class66 field1780;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "[Lrl;")
    public static class327[] field1779;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIILqa;I)V", line = 32)
    public static final void method802(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class83 arg7, int arg8) {
        field1778++;
        int var9 = arg0 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg7.field1434;
            var11 = arg7.field1424;
        } else {
            var10 = arg7.field1424;
            var11 = arg7.field1434;
        }
        if (arg2 != 1548233894) {
            field1789 = (class229) null;
        }
        int var12;
        int var13;
        if (arg4 + var11 <= 104) {
            var12 = (var11 + 1 >> 1) + arg4;
            var13 = (var11 >> 1) + arg4;
        } else {
            var12 = arg4 + 1;
            var13 = arg4;
        }
        int var14 = (arg4 << 7) + (var11 << 6);
        int var15;
        int var16;
        if ((arg5 + var10) > 104) {
            var15 = arg5;
            var16 = arg5 + 1;
        } else {
            var16 = (var10 + 1 >> 1) + arg5;
            var15 = (var10 >> 1) + arg5;
        }
        int[][] var17 = class192.field3174[arg6];
        int var18 = (arg5 << 7) + (var10 << 6);
        int var19 = var17[var13][var16] + var17[var12][var16] + var17[var12][var15] + var17[var13][var15] >> 2;
        int var20 = 0;
        if (arg6 != 0) {
            int[][] var21 = class192.field3174[0];
            var20 = var19 - (var21[var12][var15] + var21[var13][var15] + var21[var12][var16] + var21[var13][var16] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg6 < 3) {
            var22 = class192.field3174[arg6 + 1];
        }
        class58 var23 = arg7.method618((byte) -106, var14, var22, true, var17, var19, arg3, arg0, false, var18, (class32) null);
        class137.method975(var23.field821, var14 - arg8, var20, var18 - arg1);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 116)
    public static final void method803(byte arg0) {
        class121.field2033.method37(89, 37);
        int var1 = 53 % ((49 - arg0) / 39);
        field1777++;
        class108.field1852++;
        class121.field2033.method1188(-125, class269.method1870(true));
        class121.field2033.method1155(-1640531527, class273.field4567);
        class121.field2033.method1155(-1640531527, class266.field4484);
        class121.field2033.method1188(-104, class272.field4546);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 153)
    public static void method804(int arg0) {
        field1779 = null;
        field1781 = null;
        field1786 = null;
        field1784 = null;
        field1780 = null;
        field1785 = null;
        field1789 = null;
        field1776 = null;
        field1782 = null;
        field1787 = null;
        if (arg0 != -489382426) {
            field1790 = 63;
        }
    }
}

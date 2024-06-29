import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class81 extends class539 {

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public int field1120 = -1;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public int field1130 = 0;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "Lqaa;")
    public static class26 field1132 = new class26();

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "[[I")
    public static int[][] field1134 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "Lsu;")
    public static class192 field1135 = new class192();

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Lfc;")
    public static class235 field1137 = new class235(21, 7);

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "Loaa;")
    public static class260 field1136;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "[[Z")
    public static boolean[][] field1138;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 12)
    public static void method640(byte arg0) {
        field1135 = null;
        if (arg0 != -22) {
            method641(87, -110, 118, 103, -56, 53, (byte) -37, 126);
        }
        field1136 = null;
        field1132 = null;
        field1137 = null;
        field1138 = null;
        field1134 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIBI)V", line = 34)
    public static final void method641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field1128++;
        int var8 = class355.method2104(class631.field8829, arg3, 89, class92.field1219);
        int var9 = class355.method2104(class631.field8829, arg5, 44, class92.field1219);
        int var10 = class355.method2104(class144.field2148, arg0, 30, class482.field6703);
        int var11 = class355.method2104(class144.field2148, arg2, -122, class482.field6703);
        if (arg6 < 71) {
            field1138 = null;
        }
        int var12 = class355.method2104(class631.field8829, arg3 + arg4, 23, class92.field1219);
        int var13 = class355.method2104(class631.field8829, arg5 - arg4, -123, class92.field1219);
        for (int var14 = var8; var14 < var12; var14++) {
            class548.method3012(var11, (byte) 23, arg7, var10, class476.field6655[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class548.method3012(var11, (byte) 23, arg7, var10, class476.field6655[var15]);
        }
        int var16 = class355.method2104(class144.field2148, arg0 + arg4, -116, class482.field6703);
        int var17 = class355.method2104(class144.field2148, arg2 - arg4, -114, class482.field6703);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class476.field6655[var18];
            class548.method3012(var16, (byte) 23, arg7, var10, var19);
            class548.method3012(var17, (byte) 23, arg1, var16, var19);
            class548.method3012(var11, (byte) 23, arg7, var17, var19);
        }
    }
}

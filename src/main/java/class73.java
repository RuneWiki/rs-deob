import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class73 {

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "[[I")
    public int[][] field1119 = new int[6][258];

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "[B")
    public byte[] field1132 = new byte[4096];

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "[I")
    public int[] field1130 = new int[257];

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "[B")
    public byte[] field1118 = new byte[18002];

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "[Z")
    public boolean[] field1124 = new boolean[16];

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "[I")
    public int[] field1117 = new int[256];

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "[I")
    public int[] field1148 = new int[6];

    @OriginalMember(owner = "client!fn", name = "J", descriptor = "[[I")
    public int[][] field1151 = new int[6][258];

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "[Z")
    public boolean[] field1149 = new boolean[256];

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "[I")
    public int[] field1141 = new int[16];

    @OriginalMember(owner = "client!fn", name = "L", descriptor = "[[I")
    public int[][] field1153 = new int[6][258];

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "[B")
    public byte[] field1146 = new byte[256];

    @OriginalMember(owner = "client!fn", name = "I", descriptor = "I")
    public int field1150 = 0;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public int field1143 = 0;

    @OriginalMember(owner = "client!fn", name = "M", descriptor = "[B")
    public byte[] field1154 = new byte[18002];

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "[[B")
    public byte[][] field1145 = new byte[6][258];

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
    public static int field1142 = 0;

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "B")
    public byte field1147;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!fn", name = "K", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "Llf;")
    public static class130 field1139;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "Laf;")
    public static class249 field1137;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "[B")
    public byte[] field1116;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "[B")
    public byte[] field1121;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I[IIII)V")
    public static final void method486(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        arg0--;
        field1144++;
        int var5 = 99 / ((arg3 + 52) / 40);
        int var14 = arg4 - 1;
        int var6 = var14 - 7;
        while (arg0 < var6) {
            int var7 = arg0 + 1;
            arg1[var7] = arg2;
            int var8 = var7 + 1;
            arg1[var8] = arg2;
            int var9 = var8 + 1;
            arg1[var9] = arg2;
            int var10 = var9 + 1;
            arg1[var10] = arg2;
            int var11 = var10 + 1;
            arg1[var11] = arg2;
            int var12 = var11 + 1;
            arg1[var12] = arg2;
            int var13 = var12 + 1;
            arg1[var13] = arg2;
            arg0 = var13 + 1;
            arg1[arg0] = arg2;
        }
        while (arg0 < var14) {
            arg0++;
            arg1[arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lrj;Laa;ZIIII)V")
    public static final void method487(class352 arg0, class281 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field1126++;
        if (arg2) {
            class91.field1379.method867((class194.field2696 - class91.field1379.method874()) / 2, (class243.field3359 - class91.field1379.method877()) / 2);
            class264.field3600.method867((class194.field2696 - class264.field3600.method874()) / 2, 18);
        }
        arg0.method2277(class243.field3359 / 2 - 26, class180.field2521 == 1 ? class356.field5010 : class259.field3550, class194.field2696 / 2, -43, -1, arg5);
        int var7 = class243.field3359 / 2 - 18;
        arg1.method1748(class194.field2696 / 2 - 152, var7, 304, 34, arg4, 0);
        arg1.method1748(class194.field2696 / 2 - 151, var7 - -1, 302, 32, 0, 0);
        int var8 = 16 % ((arg6 + 2) / 49);
        arg1.method1785(class194.field2696 / 2 - 150, var7 - -2, class293.field4054 * 3, 30, arg3, 0);
        arg1.method1785(class194.field2696 / 2 - (150 - (class293.field4054 * 3)), var7 + 2, 300 - class293.field4054 * 3, 30, 0, 0);
        arg0.method2277(class243.field3359 / 2 + 4, class276.field3743, class194.field2696 / 2, -44, -1, arg5);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
    public static final void method488(boolean arg0) {
        field1134++;
        if (!arg0) {
            field1139 = null;
        }
        for (int var1 = 0; var1 < class71.field1096; var1++) {
            int var2 = class280.field3837[var1];
            class437 var3 = class445.field6422[var2];
            if (var3 != null) {
                class262.method1614(var3, arg0, var3.field6290.field2958);
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static void method489(int arg0) {
        field1139 = null;
        field1137 = null;
        if (arg0 != 18002) {
            method486(-127, (int[]) null, 72, -28, 72);
        }
    }
}

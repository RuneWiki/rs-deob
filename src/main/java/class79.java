import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class79 extends class5 {

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    public int field1162 = 0;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "[Lcn;")
    public class228[] field1157 = new class228[5];

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "[I")
    public int[] field1180 = new int[5];

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field1152 = new String[100];

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
    public static int field1166 = 0;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "[Lbd;")
    public static class28[] field1149 = new class28[14];

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    public int field1160;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "Laj;")
    public class135 field1156;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "Leh;")
    public class158 field1175;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "Lke;")
    public class271 field1158;

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "Lhd;")
    public class341 field1179;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "Lu;")
    public class35 field1161;

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "Lvb;")
    public class79 field1176;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Lhm;")
    public class91 field1154;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "Z")
    public boolean field1153;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "Z")
    public boolean field1163;

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "Z")
    public boolean field1177;

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "[[I")
    public static int[][] field1178;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "[[[I")
    public static int[][][] field1151;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII)Z", line = 9)
    public static final boolean method612(byte arg0, int arg1, int arg2) {
        int var3 = -14 / ((arg0 + 17) / 49);
        field1164++;
        if (!class330.field5089) {
            return false;
        }
        int var4 = arg1 >> 16;
        int var5 = arg1 & 0xFFFF;
        if (class8.field128[var4] == null || class8.field128[var4][var5] == null) {
            return false;
        }
        class161 var6 = class8.field128[var4][var5];
        if (arg2 == -1 && var6.field2590 == 0) {
            for (int var7 = 0; var7 < class32.field393; var7++) {
                if (class118.field1843[var7] == 34 || class118.field1843[var7] == 1007 || class118.field1843[var7] == 31 || class118.field1843[var7] == 29 || class118.field1843[var7] == 51) {
                    for (class161 var8 = class331.method2308((byte) 8, class323.field4993[var7]); var8 != null; var8 = class171.method1294(var8, 10)) {
                        if (var6.field2615 == var8.field2615) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < class32.field393; var9++) {
                if (class25.field290[var9] == arg2 && class323.field4993[var9] == var6.field2615 && (class118.field1843[var9] == 34 || class118.field1843[var9] == 1007 || class118.field1843[var9] == 31 || class118.field1843[var9] == 29 || class118.field1843[var9] == 51)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(III)V", line = 74)
    public class79(int arg0, int arg1, int arg2) {
        this.field1168 = arg2;
        this.field1173 = arg1;
        this.field1172 = this.field1174 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V", line = 90)
    public static void method613(boolean arg0) {
        field1151 = (int[][][]) null;
        field1149 = null;
        if (!arg0) {
            field1159 = -35;
        }
        field1152 = null;
        field1178 = (int[][]) null;
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V", line = 117)
    public static final void method614(int arg0) {
        class144.field2208 = arg0;
        for (int var1 = 0; var1 < class75.field1091; var1++) {
            for (int var2 = 0; var2 < class115.field1818; var2++) {
                if (class213.field3262[arg0][var1][var2] == null) {
                    class213.field3262[arg0][var1][var2] = new class79(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V", line = 146)
    public static final void method615(int arg0) {
        for (class239 var1 = (class239) class108.field1590.method1954(-66); var1 != null; var1 = (class239) class108.field1590.method1950((byte) 99)) {
            if (var1.field3652) {
                var1.method1665(arg0 ^ 0x7F);
            }
        }
        if (arg0 != -32) {
            method613(false);
        }
        for (class239 var2 = (class239) class294.field4534.method1954(-66); var2 != null; var2 = (class239) class294.field4534.method1950((byte) 121)) {
            if (var2.field3652) {
                var2.method1665(arg0 - 88);
            }
        }
        field1150++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I", line = 198)
    public static final int method616(int arg0, int arg1) {
        field1170++;
        if (arg1 != -20255) {
            method612((byte) -128, -78, -60);
        }
        return arg0 & 0x7F;
    }
}

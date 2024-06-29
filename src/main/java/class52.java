import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class52 {

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "[I")
    public int[] field1084 = new int[256];

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "[I")
    public int[] field1094 = new int[6];

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "[[I")
    public int[][] field1096 = new int[6][258];

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "[Z")
    public boolean[] field1103 = new boolean[256];

    @OriginalMember(owner = "client!pv", name = "v", descriptor = "[[I")
    public int[][] field1105 = new int[6][258];

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "[B")
    public byte[] field1087 = new byte[4096];

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
    public int field1106 = 0;

    @OriginalMember(owner = "client!pv", name = "E", descriptor = "[B")
    public byte[] field1114 = new byte[256];

    @OriginalMember(owner = "client!pv", name = "B", descriptor = "[I")
    public int[] field1111 = new int[257];

    @OriginalMember(owner = "client!pv", name = "J", descriptor = "[B")
    public byte[] field1119 = new byte[18002];

    @OriginalMember(owner = "client!pv", name = "F", descriptor = "[I")
    public int[] field1115 = new int[16];

    @OriginalMember(owner = "client!pv", name = "D", descriptor = "I")
    public int field1113 = 0;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "[B")
    public byte[] field1097 = new byte[18002];

    @OriginalMember(owner = "client!pv", name = "A", descriptor = "[Z")
    public boolean[] field1110 = new boolean[16];

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "[[B")
    public byte[][] field1108 = new byte[6][258];

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "[[I")
    public int[][] field1104 = new int[6][258];

    @OriginalMember(owner = "client!pv", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field1118 = new String[100];

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public static int field1085 = 0;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "Los;")
    public static class309 field1088 = new class309("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!pv", name = "L", descriptor = "S")
    public static short field1121 = 32767;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "B")
    public byte field1099;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "client!pv", name = "C", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "client!pv", name = "G", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "client!pv", name = "H", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "client!pv", name = "K", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!pv", name = "M", descriptor = "Lon;")
    public static class223 field1122;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "[B")
    public byte[] field1092;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "[B")
    public byte[] field1100;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)V")
    public static final void method486(int arg0, int arg1, int arg2) {
        boolean var3 = class518.field7511[0][arg1][arg2] != null && class518.field7511[0][arg1][arg2].field3621 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class518.field7511[var4][arg1][arg2] == null) {
                class234 var5 = class518.field7511[var4][arg1][arg2] = new class234(var4, arg1, arg2);
                if (var3) {
                    var5.field3600++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
    public static void method487(int arg0) {
        field1088 = null;
        field1118 = null;
        field1122 = null;
        if (arg0 != 20351) {
            method486(109, 3, 113);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIII[FII)V")
    public static final void method488(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        field1091++;
        if (arg0 > 0 && !class388.method2381(arg0, 95)) {
            throw new IllegalArgumentException("");
        } else if (arg6 <= 0 || class388.method2381(arg6, 105)) {
            int var7 = class185.method1258((byte) 104, arg3);
            int var8 = 0;
            int var9 = arg6 <= arg0 ? arg6 : arg0;
            int var10 = arg0 >> 1;
            int var11 = arg6 >> 1;
            int var12 = 77 % ((47 - arg5) / 50);
            float[] var13 = arg4;
            float[] var14 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg2, var8, arg1, arg0, arg6, 0, arg3, 5126, var13, 0);
                if (var9 <= 1) {
                    return;
                }
                int var15 = arg0 * var7;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var18 = var16;
                    int var19 = var16;
                    int var20 = var15 + var16;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var10; var22++) {
                            float var23 = var13[var19];
                            int var24 = var7 + var19;
                            float var25 = var13[var24] + var23;
                            float var26 = var13[var20] + var25;
                            var19 = var7 + var24;
                            int var27 = var7 + var20;
                            float var28 = var13[var27] + var26;
                            var14[var18] = var28 * 0.25F;
                            var20 = var7 + var27;
                            var18 += var7;
                        }
                        var20 += var15;
                        var19 += var15;
                    }
                }
                float[] var17 = var14;
                var14 = var13;
                arg0 = var10;
                var13 = var17;
                arg6 = var11;
                var8++;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
    public static final void method489(byte arg0) {
        field1120++;
        if (arg0 <= 109) {
            return;
        }
        if (class480.field7074.toLowerCase().indexOf("microsoft") != -1) {
            class288.field4363[219] = 42;
            class288.field4363[187] = 27;
            class288.field4363[192] = 58;
            class288.field4363[222] = 59;
            class288.field4363[186] = 57;
            class288.field4363[191] = 73;
            class288.field4363[190] = 72;
            class288.field4363[189] = 26;
            class288.field4363[221] = 43;
            class288.field4363[223] = 28;
            class288.field4363[220] = 74;
            class288.field4363[188] = 71;
            return;
        }
        class288.field4363[45] = 26;
        class288.field4363[91] = 42;
        class288.field4363[46] = 72;
        class288.field4363[93] = 43;
        class288.field4363[47] = 73;
        class288.field4363[44] = 71;
        if (class480.field7091 == null) {
            class288.field4363[222] = 59;
            class288.field4363[192] = 58;
        } else {
            class288.field4363[222] = 58;
            class288.field4363[520] = 59;
            class288.field4363[192] = 28;
        }
        class288.field4363[61] = 27;
        class288.field4363[92] = 74;
        class288.field4363[59] = 57;
    }
}

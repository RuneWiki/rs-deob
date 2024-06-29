import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class57 {

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "[[I")
    public int[][] field1172 = new int[6][258];

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public int field1170 = 0;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public int field1185 = 0;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "[I")
    public int[] field1197 = new int[257];

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "[[I")
    public int[][] field1196 = new int[6][258];

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "[B")
    public byte[] field1183 = new byte[18002];

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "[I")
    public int[] field1202 = new int[6];

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "[B")
    public byte[] field1201 = new byte[256];

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "[Z")
    public boolean[] field1188 = new boolean[256];

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "[I")
    public int[] field1199 = new int[16];

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "[B")
    public byte[] field1184 = new byte[4096];

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "[[I")
    public int[][] field1181 = new int[6][258];

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "[B")
    public byte[] field1178 = new byte[18002];

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "[I")
    public int[] field1209 = new int[256];

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "[[B")
    public byte[][] field1192 = new byte[6][258];

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "[Z")
    public boolean[] field1208 = new boolean[16];

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1173 = 0;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "Loh;")
    private static class263 field1190 = class253.method1681(-125, " has logged in)3");

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1171 = 0;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "Loh;")
    public static class263 field1200 = field1190;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Loh;")
    public static class263 field1177 = class253.method1681(-126, "hint_mapmarkers");

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "[I")
    public static int[] field1186 = new int[4096];

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "B")
    public byte field1189;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public int field1179;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public int field1194;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "[B")
    public byte[] field1191;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "[B")
    public byte[] field1195;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLah;)V")
    public static final void method359(boolean arg0, class267 arg1) {
        field1198++;
        int var2 = arg1.field4663 - class228.field4012;
        int var3 = arg1.field4648 * 128 + (arg1.method898(36) * 64);
        int var4 = arg1.field4695 * 128 + arg1.method898(94) * 64;
        if (arg0) {
            return;
        }
        arg1.field4688 += (var3 - arg1.field4688) / var2;
        if (arg1.field4712 == 0) {
            arg1.field4674 = 1024;
        }
        arg1.field4704 = 0;
        if (arg1.field4712 == 1) {
            arg1.field4674 = 1536;
        }
        arg1.field4705 += (var4 - arg1.field4705) / var2;
        if (arg1.field4712 == 2) {
            arg1.field4674 = 0;
        }
        if (arg1.field4712 == 3) {
            arg1.field4674 = 512;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method360(int arg0) {
        field1186 = null;
        field1177 = null;
        if (arg0 != 19720) {
            field1200 = null;
        }
        field1200 = null;
        field1190 = null;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1186[var0] = class1.method3(var0, 6);
        }
    }
}

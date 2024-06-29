import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class90 {

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public int field1283 = 0;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public int field1273 = 0;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "[B")
    public byte[] field1275 = new byte[18002];

    @OriginalMember(owner = "client!p", name = "q", descriptor = "[B")
    public byte[] field1288 = new byte[18002];

    @OriginalMember(owner = "client!p", name = "t", descriptor = "[B")
    public byte[] field1291 = new byte[256];

    @OriginalMember(owner = "client!p", name = "G", descriptor = "[I")
    public int[] field1303 = new int[256];

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[[B")
    public byte[][] field1278 = new byte[6][258];

    @OriginalMember(owner = "client!p", name = "H", descriptor = "[Z")
    public boolean[] field1304 = new boolean[256];

    @OriginalMember(owner = "client!p", name = "j", descriptor = "[Z")
    public boolean[] field1281 = new boolean[16];

    @OriginalMember(owner = "client!p", name = "K", descriptor = "[[I")
    public int[][] field1307 = new int[6][258];

    @OriginalMember(owner = "client!p", name = "J", descriptor = "[I")
    public int[] field1306 = new int[257];

    @OriginalMember(owner = "client!p", name = "F", descriptor = "[I")
    public int[] field1302 = new int[6];

    @OriginalMember(owner = "client!p", name = "r", descriptor = "[[I")
    public int[][] field1289 = new int[6][258];

    @OriginalMember(owner = "client!p", name = "w", descriptor = "[I")
    public int[] field1294 = new int[16];

    @OriginalMember(owner = "client!p", name = "N", descriptor = "[B")
    public byte[] field1310 = new byte[4096];

    @OriginalMember(owner = "client!p", name = "O", descriptor = "[[I")
    public int[][] field1311 = new int[6][258];

    @OriginalMember(owner = "client!p", name = "v", descriptor = "[I")
    public static int[] field1293 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!p", name = "h", descriptor = "[I")
    public static int[] field1279 = new int[128];

    @OriginalMember(owner = "client!p", name = "B", descriptor = "[I")
    public static int[] field1298 = new int[128];

    @OriginalMember(owner = "client!p", name = "L", descriptor = "Z")
    public static boolean field1308 = false;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public static int field1309 = 0;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "B")
    public byte field1277;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public int field1280;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public int field1285;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public int field1296;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public int field1297;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public int field1300;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "I")
    public int field1305;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "[B")
    public byte[] field1284;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "[B")
    public byte[] field1301;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 15)
    public static final void method654(int arg0, int arg1) {
        class153.field2322 = 20;
        class336.field5234 = 3;
        class248.field3756 = arg0;
        field1287++;
        if (arg1 != 258) {
            field1298 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lvl;B)[Lvn;", line = 34)
    public static final class134[] method655(class6 arg0, byte arg1) {
        field1295++;
        if (!arg0.method61((byte) -118)) {
            return new class134[0];
        }
        class208 var2 = arg0.method56((byte) 82);
        while (var2.field3185 == 0) {
            class324.method2252(-24861, 10L);
        }
        if (var2.field3185 == 2) {
            return new class134[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field3186);
        class134[] var4 = new class134[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class134 var6 = new class134();
            var4[var5] = var6;
            var6.field2035 = var3[var5 << 2];
            var6.field2043 = var3[(var5 << 2) + 1];
            var6.field2040 = var3[(var5 << 2) + 2];
            var6.field2037 = var3[(var5 << 2) + 3];
        }
        if (arg1 >= -69) {
            method657(64);
        }
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Ljava/lang/String;", line = 103)
    public static final String method656(int arg0, int arg1) {
        field1286++;
        if (arg0 != 3) {
            method657(14);
        }
        return class311.field4832[arg1].length() > 0 ? class204.field3122[arg1] + class265.field4119 + class311.field4832[arg1] : class204.field3122[arg1];
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 202)
    public static void method657(int arg0) {
        field1298 = null;
        field1293 = null;
        if (arg0 != 0) {
            field1308 = true;
        }
        field1279 = null;
    }
}

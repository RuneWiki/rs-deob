import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class74 {

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "[Z")
    public boolean[] field1354 = new boolean[256];

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "[[B")
    public byte[][] field1350 = new byte[6][258];

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "[[I")
    public int[][] field1368 = new int[6][258];

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[Z")
    public boolean[] field1355 = new boolean[16];

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "[B")
    public byte[] field1363 = new byte[18002];

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "[B")
    public byte[] field1358 = new byte[4096];

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "[[I")
    public int[][] field1364 = new int[6][258];

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public int field1376 = 0;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "[B")
    public byte[] field1377 = new byte[18002];

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "[I")
    public int[] field1370 = new int[257];

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "[I")
    public int[] field1371 = new int[256];

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "[I")
    public int[] field1361 = new int[6];

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "[B")
    public byte[] field1379 = new byte[256];

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public int field1385 = 0;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "[[I")
    public int[][] field1388 = new int[6][258];

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "[I")
    public int[] field1386 = new int[16];

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1352 = -1;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field1353 = 0;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "[[I")
    public static int[][] field1372 = new int[104][104];

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "Lcf;")
    public static class93 field1375 = class147.method1066("Liste des serveurs charg-Be", -48);

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "Lcf;")
    public static class93 field1380 = class147.method1066("Forced tweening disabled)3", -48);

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "B")
    public byte field1381;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public int field1356;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public int field1366;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public int field1367;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public int field1373;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public int field1374;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public int field1382;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "[B")
    public byte[] field1365;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "[B")
    public byte[] field1383;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[[[B")
    public static byte[][][] field1351;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public static void method501(boolean arg0) {
        field1372 = null;
        if (!arg0) {
            field1380 = null;
        }
        field1375 = null;
        field1351 = null;
        field1380 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)I")
    public static final int method502(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field1384++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else if (arg2 < 108) {
            return 26;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIII)Z")
    public static final boolean method503(int arg0, int arg1, int arg2, int arg3) {
        if (class160.method1162(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class268.method1792(var4 + 1, class233.field4151[arg0][arg1][arg2] + arg3, var5 + 1) && class268.method1792(var4 + 128 - 1, class233.field4151[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class268.method1792(var4 + 128 - 1, class233.field4151[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class268.method1792(var4 + 1, class233.field4151[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static final void method504(int arg0) {
        class126.field2228.method300(0);
        if (arg0 > -39) {
            method504(119);
        }
        field1362++;
    }
}

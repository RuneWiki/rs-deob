import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class81 {

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "[[I")
    public int[][] field1361 = new int[6][258];

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "[I")
    public int[] field1344 = new int[6];

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "[[I")
    public int[][] field1363 = new int[6][258];

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "[B")
    public byte[] field1349 = new byte[256];

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public int field1360 = 0;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "[I")
    public int[] field1356 = new int[16];

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "[[B")
    public byte[][] field1370 = new byte[6][258];

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "[B")
    public byte[] field1362 = new byte[18002];

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "[I")
    public int[] field1377 = new int[257];

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "[[I")
    public int[][] field1375 = new int[6][258];

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "[I")
    public int[] field1352 = new int[256];

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "[Z")
    public boolean[] field1353 = new boolean[16];

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "[Z")
    public boolean[] field1366 = new boolean[256];

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "[B")
    public byte[] field1368 = new byte[18002];

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "[B")
    public byte[] field1371 = new byte[4096];

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public int field1372 = 0;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "[Lfb;")
    public static class30[] field1373 = new class30[14];

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "B")
    public byte field1380;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public int field1367;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public int field1369;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public int field1379;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public int field1381;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public int field1382;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Lre;")
    public static class228 field1348;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "[B")
    public byte[] field1345;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "[B")
    public byte[] field1354;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)[Led;")
    public static final class186[] method578(byte arg0) {
        field1364++;
        class186[] var1 = new class186[class293.field4626];
        for (int var2 = 0; var2 < class293.field4626; var2++) {
            byte[] var3 = class198.field3123[var2];
            int var4 = class28.field390[var2] * class171.field2679[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class94.field1601[class55.method420(255, var3[var6])];
            }
            var1[var2] = new class276(class213.field3317, class130.field2056, class193.field3066[var2], class108.field1779[var2], class28.field390[var2], class171.field2679[var2], var5);
        }
        if (arg0 <= 113) {
            return null;
        } else {
            class19.method179(8);
            return var1;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method579(int arg0, String arg1, int arg2, String arg3) {
        field1347++;
        class240.method1646(arg3, (String) null, arg2, arg1, arg0, (byte) -126);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public static final void method580(byte arg0) {
        field1355++;
        if (arg0 != 9) {
            field1350 = 5;
        }
        class33.field494.method1898((byte) -83);
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
    public static void method581(byte arg0) {
        field1373 = null;
        field1348 = null;
        if (arg0 > -45) {
            field1348 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIII)V")
    public static final void method582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1374++;
        if (arg5 != -5406) {
            field1348 = null;
        }
        if (class223.field3423 <= arg2 && class148.field2338 >= arg4 && class90.field1568 <= arg1 && class266.field4247 >= arg0) {
            class84.method597(arg1, arg4, (byte) 100, arg3, arg0, arg2);
        } else {
            class142.method955(arg3, (byte) 107, arg4, arg2, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
    public static final int method583(int arg0, int arg1) {
        int var2 = -70 % ((arg0 - 9) / 36);
        field1378++;
        return arg1 >>> 8;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ha")
public class class70 extends class71 {

    @OriginalMember(owner = "ha", name = "p", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "ha", name = "n", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "ha", name = "A", descriptor = "[I")
    public int[] field1362;

    @OriginalMember(owner = "ha", name = "C", descriptor = "[Z")
    private boolean[] field1364;

    @OriginalMember(owner = "ha", name = "x", descriptor = "[[I")
    public int[][] field1359;

    @OriginalMember(owner = "ha", name = "w", descriptor = "Llf;")
    private static class109 field1358 = class35.method275("May", 2);

    @OriginalMember(owner = "ha", name = "z", descriptor = "Llf;")
    private static class109 field1361 = class35.method275("Jan", 2);

    @OriginalMember(owner = "ha", name = "u", descriptor = "Llf;")
    private static class109 field1356 = class35.method275("Dec", 2);

    @OriginalMember(owner = "ha", name = "t", descriptor = "Llf;")
    private static class109 field1355 = class35.method275("Existing User", 2);

    @OriginalMember(owner = "ha", name = "s", descriptor = "Llf;")
    private static class109 field1354 = class35.method275("Oct", 2);

    @OriginalMember(owner = "ha", name = "B", descriptor = "Llf;")
    private static class109 field1363 = class35.method275("Jun", 2);

    @OriginalMember(owner = "ha", name = "E", descriptor = "Llf;")
    private static class109 field1366 = class35.method275("Apr", 2);

    @OriginalMember(owner = "ha", name = "F", descriptor = "Llf;")
    private static class109 field1367 = class35.method275("Jul", 2);

    @OriginalMember(owner = "ha", name = "v", descriptor = "Llf;")
    private static class109 field1357 = class35.method275("Feb", 2);

    @OriginalMember(owner = "ha", name = "q", descriptor = "Llf;")
    private static class109 field1352 = class35.method275("Use", 2);

    @OriginalMember(owner = "ha", name = "M", descriptor = "Llf;")
    private static class109 field1374 = class35.method275("Sep", 2);

    @OriginalMember(owner = "ha", name = "I", descriptor = "Llf;")
    public static class109 field1370 = field1355;

    @OriginalMember(owner = "ha", name = "K", descriptor = "[[B")
    public static byte[][] field1372 = new byte[1000][];

    @OriginalMember(owner = "ha", name = "o", descriptor = "Llf;")
    public static class109 field1350 = field1352;

    @OriginalMember(owner = "ha", name = "H", descriptor = "Llf;")
    private static class109 field1369 = class35.method275("Mar", 2);

    @OriginalMember(owner = "ha", name = "L", descriptor = "Llf;")
    private static class109 field1373 = class35.method275("Nov", 2);

    @OriginalMember(owner = "ha", name = "J", descriptor = "Llf;")
    private static class109 field1371 = class35.method275("Aug", 2);

    @OriginalMember(owner = "ha", name = "G", descriptor = "[Llf;")
    public static class109[] field1368 = new class109[] { field1361, field1357, field1369, field1366, field1358, field1363, field1367, field1371, field1374, field1354, field1373, field1356 };

    @OriginalMember(owner = "ha", name = "N", descriptor = "Llf;")
    private static class109 field1375 = class35.method275("RuneScape is loading )2 please wait)3)3)3", 2);

    @OriginalMember(owner = "ha", name = "D", descriptor = "Llf;")
    public static class109 field1365 = field1375;

    @OriginalMember(owner = "ha", name = "O", descriptor = "Llf;")
    public static class109 field1376 = class35.method275("(Y", 2);

    @OriginalMember(owner = "ha", name = "y", descriptor = "Lrc;")
    public static class160 field1360 = new class160(200);

    @OriginalMember(owner = "ha", name = "r", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "ha", name = "a", descriptor = "(I)V")
    public static final void method448(int arg0) {
        if (arg0 <= 84) {
            method449((byte) -14);
        }
        field1353++;
        class76.field1466 = new class49(32);
    }

    @OriginalMember(owner = "ha", name = "c", descriptor = "(B)V")
    public static void method449(byte arg0) {
        field1365 = null;
        field1354 = null;
        field1369 = null;
        field1352 = null;
        field1360 = null;
        field1368 = null;
        field1356 = null;
        if (arg0 != -28) {
            return;
        }
        field1367 = null;
        field1375 = null;
        field1372 = null;
        field1355 = null;
        field1363 = null;
        field1371 = null;
        field1357 = null;
        field1350 = null;
        field1374 = null;
        field1361 = null;
        field1373 = null;
        field1358 = null;
        field1370 = null;
        field1376 = null;
        field1366 = null;
    }

    @OriginalMember(owner = "ha", name = "<init>", descriptor = "(I[B)V")
    public class70(int arg0, byte[] arg1) {
        this.field1351 = arg0;
        class86 var3 = new class86(arg1);
        this.field1349 = var3.method598((byte) 93);
        this.field1362 = new int[this.field1349];
        this.field1364 = new boolean[this.field1349];
        this.field1359 = new int[this.field1349][];
        for (int var4 = 0; var4 < this.field1349; var4++) {
            this.field1362[var4] = var3.method598((byte) 84);
        }
        for (int var5 = 0; var5 < this.field1349; var5++) {
            this.field1364[var5] = var3.method598((byte) 123) == 1;
        }
        for (int var6 = 0; var6 < this.field1349; var6++) {
            this.field1359[var6] = new int[var3.method598((byte) 72)];
        }
        for (int var7 = 0; var7 < this.field1349; var7++) {
            for (int var8 = 0; var8 < this.field1359[var7].length; var8++) {
                this.field1359[var7][var8] = var3.method598((byte) 71);
            }
        }
    }
}

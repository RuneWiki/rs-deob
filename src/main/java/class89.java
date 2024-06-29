import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class89 extends class62 {

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    public int field1413 = 0;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "Lbf;")
    public static class202 field1405 = new class202(64);

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "Lid;")
    public static class226 field1419 = new class226();

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "I")
    public static int field1424 = 0;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "Lbf;")
    public static class202 field1422 = new class202(32);

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "Leg;")
    public static class37 field1426 = class174.method1167("compass", 115);

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "Leg;")
    public static class37 field1427 = class174.method1167("V-Brification des mises -9 jour )2 ", -40);

    @OriginalMember(owner = "client!nj", name = "Y", descriptor = "[I")
    public static int[] field1428 = new int[4096];

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    public int field1414;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public int field1417;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "Ltc;")
    public class133 field1401;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "Lq;")
    public class163 field1418;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "Lpi;")
    public class188 field1415;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "Lg;")
    public class57 field1410;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "Lg;")
    public class57 field1421;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "Z")
    public boolean field1406;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "[I")
    public int[] field1416;

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "[Lja;")
    public static class105[] field1425;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIILme;JLme;Lme;)V")
    public static final void method586(int arg0, int arg1, int arg2, int arg3, class67 arg4, long arg5, class67 arg6, class67 arg7) {
        class68 var9 = new class68();
        var9.field1075 = arg4;
        var9.field1083 = arg1 * 128 + 64;
        var9.field1085 = arg2 * 128 + 64;
        var9.field1086 = arg3;
        var9.field1079 = arg5;
        var9.field1087 = arg6;
        var9.field1077 = arg7;
        int var10 = 0;
        class111 var11 = class286.field5048[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1880; var12++) {
                class27 var13 = var11.field1858[var12];
                if ((var13.field381 & 0x400000L) == 4194304L) {
                    int var14 = var13.field400.method308();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1081 = -var10;
        if (class286.field5048[arg0][arg1][arg2] == null) {
            class286.field5048[arg0][arg1][arg2] = new class111(arg0, arg1, arg2);
        }
        class286.field5048[arg0][arg1][arg2].field1870 = var9;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(BI)I")
    public static final int method587(byte arg0, int arg1) {
        if (arg0 != 10) {
            field1428 = null;
        }
        field1407++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
    public final void method588(byte arg0) {
        field1409++;
        int var2 = 101 / ((arg0 + 51) / 42);
        int var3 = this.field1417;
        if (this.field1401 != null) {
            class133 var4 = this.field1401.method962(64);
            if (var4 == null) {
                this.field1412 = 0;
                this.field1416 = null;
                this.field1404 = 0;
                this.field1400 = 0;
                this.field1417 = -1;
            } else {
                this.field1412 = var4.field2296 * 128;
                this.field1404 = var4.field2234;
                this.field1416 = var4.field2247;
                this.field1417 = var4.field2236;
                this.field1400 = var4.field2287;
            }
        } else if (this.field1418 != null) {
            int var5 = class247.method1708(26421, this.field1418);
            if (var3 != var5) {
                this.field1417 = var5;
                class275 var6 = this.field1418.field2691;
                if (var6.field4888 != null) {
                    var6 = var6.method1854((byte) 68);
                }
                if (var6 == null) {
                    this.field1412 = 0;
                } else {
                    this.field1412 = var6.field4880 * 128;
                }
            }
        } else if (this.field1415 != null) {
            this.field1417 = class285.method1911(-50, this.field1415);
            this.field1412 = this.field1415.field3215 * 128;
        }
        if (this.field1417 != var3 && this.field1410 != null) {
            class127.field2127.method1514(this.field1410);
            this.field1410 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)J")
    public static final long method589(int arg0, int arg1, int arg2) {
        class111 var3 = class286.field5048[arg0][arg1][arg2];
        return var3 == null || var3.field1876 == null ? 0L : var3.field1876.field4244;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
    public static void method590(int arg0) {
        field1419 = null;
        if (arg0 != 0) {
            return;
        }
        field1426 = null;
        field1422 = null;
        field1405 = null;
        field1427 = null;
        field1425 = null;
        field1428 = null;
    }
}

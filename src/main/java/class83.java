import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class83 extends class286 {

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    private int field1416 = -1;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "Z")
    public static boolean field1408 = true;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "Lbe;")
    public static class283 field1412 = class153.method941(125, "sl_back");

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "Lbe;")
    public static class283 field1415 = class153.method941(-32, "<col=c0ff00>");

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "[Lbe;")
    public static class283[] field1406 = new class283[1000];

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "Lbe;")
    public static class283 field1402 = class153.method941(-36, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "Lbe;")
    public static class283 field1411 = null;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field1405 = 0;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "Lbe;")
    public static class283 field1413 = class153.method941(125, "mapscene");

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "Lek;")
    public static class172 field1410;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "[I")
    private int[] field1409;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V", line = 5)
    public final void method536(int arg0) {
        super.method536(-122);
        if (arg0 < -55) {
            this.field1409 = null;
            field1414++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 45)
    public class83() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)I", line = 50)
    public final int method537(int arg0) {
        if (arg0 != -24963) {
            field1405 = -50;
        }
        field1404++;
        return this.field1416;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)I", line = 73)
    public static final int method538(int arg0, int arg1) {
        field1418++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        if (arg1 != -948) {
            method538(-121, 15);
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lfe;ZI)V", line = 118)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1410 = (class172) null;
        }
        field1417++;
        if (arg2 == 0) {
            this.field1416 = arg0.method1496(true);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V", line = 140)
    public static void method539(byte arg0) {
        field1406 = null;
        field1402 = null;
        field1410 = null;
        if (arg0 >= -60) {
            field1402 = (class283) null;
        }
        field1411 = null;
        field1415 = null;
        field1412 = null;
        field1413 = null;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)Z", line = 163)
    private final boolean method540(byte arg0) {
        if (arg0 < 95) {
            this.method540((byte) 54);
        }
        field1407++;
        if (this.field1409 != null) {
            return true;
        } else if (this.field1416 < 0) {
            return false;
        } else {
            int var2 = class27.field410;
            int var3 = class13.field124;
            int var4 = class34.field515.method632((byte) 81, this.field1416) ? 64 : 128;
            this.field1409 = class34.field515.method628((byte) -59, this.field1416);
            this.field1401 = var4;
            this.field1403 = var4;
            class138.method857(var2, var3, -99);
            return this.field1409 != null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)[[I", line = 195)
    public final int[][] method16(int arg0, byte arg1) {
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (this.field4878.field2524 && this.method540((byte) 106)) {
            int var4 = (class13.field124 == this.field1401 ? arg0 : this.field1401 * arg0 / class13.field124) * this.field1403;
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            if (class27.field410 == this.field1403) {
                for (int var8 = 0; var8 < class27.field410; var8++) {
                    int var9 = this.field1409[var4++];
                    var7[var8] = class178.method1174(4080, var9 << 4);
                    var5[var8] = class178.method1174(var9 >> 4, 4080);
                    var6[var8] = class178.method1174(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class27.field410; var10++) {
                    int var11 = this.field1403 * var10 / class27.field410;
                    int var12 = this.field1409[var4 + var11];
                    var7[var10] = class178.method1174(var12 << 4, 4080);
                    var5[var10] = class178.method1174(var12, 65280) >> 4;
                    var6[var10] = class178.method1174(4080, var12 >> 12);
                }
            }
        }
        if (arg1 == -19) {
            field1400++;
            return var3;
        } else {
            return (int[][]) ((int[][]) null);
        }
    }
}

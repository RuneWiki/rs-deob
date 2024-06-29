import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class111 extends class641 {

    @OriginalMember(owner = "client!qv", name = "G", descriptor = "[[B")
    private byte[][] field1486 = new byte[10][];

    @OriginalMember(owner = "client!qv", name = "F", descriptor = "Ldc;")
    private class63 field1485 = new class63(null);

    @OriginalMember(owner = "client!qv", name = "O", descriptor = "Ldc;")
    private class63 field1494 = new class63(null);

    @OriginalMember(owner = "client!qv", name = "K", descriptor = "Luu;")
    private class237 field1490;

    @OriginalMember(owner = "client!qv", name = "D", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client!qv", name = "N", descriptor = "[[I")
    public static int[][] field1493 = new int[6][];

    @OriginalMember(owner = "client!qv", name = "J", descriptor = "[I")
    public static int[] field1489 = new int[2];

    @OriginalMember(owner = "client!qv", name = "E", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!qv", name = "H", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client!qv", name = "I", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!qv", name = "M", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!qv", name = "L", descriptor = "[I")
    private int[] field1491;

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "(I)V", line = 3)
    public final void method719(int arg0) {
        field1488++;
        if (this.field1491 == null) {
            return;
        }
        for (int var2 = arg0; var2 < 10; var2++) {
            if (this.field1491.length <= this.field1487 + var2) {
                return;
            }
            if (this.field1486[var2] == null && this.field1490.method1570(-2, this.field1491[this.field1487 + var2], 0)) {
                this.field1486[var2] = this.field1490.method1572(this.field1491[this.field1487 + var2], 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "([BI)I", line = 32)
    public final int method720(byte[] arg0, int arg1) throws IOException {
        field1484++;
        if (arg1 < 126) {
            return -89;
        }
        if (this.field1491 == null) {
            if (!this.field1490.method1570(-2, this.field1483, 0)) {
                return 0;
            }
            byte[] var3 = this.field1490.method1572(this.field1483, 0, 0);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field1494.field956 = 0;
            this.field1494.field954 = var3;
            int var4 = var3.length >> 1;
            this.field1491 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1491[var5] = this.field1494.method482(-772591672);
            }
        }
        if (this.field1487 >= this.field1491.length) {
            return -1;
        }
        this.method719(0);
        this.field1494.field954 = arg0;
        this.field1494.field956 = 0;
        do {
            if (this.field1494.field956 >= this.field1494.field954.length) {
                this.field1494.field954 = null;
                return arg0.length;
            }
            if (this.field1485.field954 == null) {
                if (this.field1486[0] == null) {
                    this.field1494.field954 = null;
                    return this.field1494.field956;
                }
                this.field1485.field954 = this.field1486[0];
            }
            int var6 = this.field1494.field954.length - this.field1494.field956;
            int var7 = this.field1485.field954.length - this.field1485.field956;
            if (var6 < var7) {
                this.field1485.method449(this.field1494.field956, var6, this.field1494.field954, (byte) -116);
                this.field1494.field954 = null;
                return arg0.length;
            }
            this.field1494.method497(this.field1485.field954, var7, this.field1485.field956, -1);
            this.field1487++;
            this.field1485.field956 = 0;
            this.field1485.field954 = null;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field1486[var8] = this.field1486[var8 + 1];
            }
            this.field1486[9] = null;
        } while (this.field1487 < this.field1491.length);
        this.field1494.field954 = null;
        return this.field1494.field956;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(ILuu;I)V", line = 132)
    public class111(int arg0, class237 arg1, int arg2) {
        super(arg0);
        this.field1490 = arg1;
        this.field1483 = arg2;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)V", line = 144)
    public static void method721(boolean arg0) {
        field1493 = null;
        if (arg0) {
            field1489 = null;
        }
        field1489 = null;
    }

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "(B)V", line = 162)
    public static final void method722(byte arg0) {
        if (arg0 != -2) {
            field1489 = null;
        }
        field1492++;
        class54.field780.method3906(arg0 - 107);
    }
}

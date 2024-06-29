import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 {

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lff;")
    public class42 field1302 = null;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Z")
    public boolean field1297 = false;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public int field1303 = -1;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
    public int[] field1300;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "[I")
    public int[] field1294;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[I")
    public int[] field1299;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "[I")
    public int[] field1301;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[I")
    private static int[] field1296 = new int[500];

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
    private static int[] field1298 = new int[500];

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[I")
    private static int[] field1295 = new int[500];

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
    private static int[] field1304 = new int[500];

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()V", line = 5)
    public static void method557() {
        field1296 = null;
        field1295 = null;
        field1304 = null;
        field1298 = null;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([BLff;)V", line = 39)
    public class52(byte[] arg0, class42 arg1) {
        this.field1302 = arg1;
        class25 var3 = new class25(arg0);
        class25 var4 = new class25(arg0);
        var3.field710 = 2;
        int var5 = var3.method322((byte) -50);
        int var6 = -1;
        int var7 = 0;
        var4.field710 = var3.field710 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method322((byte) -50);
            if (var10 > 0) {
                if (this.field1302.field1134[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1302.field1134[var11] == 0) {
                            field1296[var7] = var11;
                            field1295[var7] = 0;
                            field1304[var7] = 0;
                            field1298[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1296[var7] = var8;
                short var12 = 0;
                if (this.field1302.field1134[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1295[var7] = var12;
                } else {
                    field1295[var7] = var4.method286((byte) -101);
                }
                if ((var10 & 0x2) == 0) {
                    field1304[var7] = var12;
                } else {
                    field1304[var7] = var4.method286((byte) -101);
                }
                if ((var10 & 0x4) == 0) {
                    field1298[var7] = var12;
                } else {
                    field1298[var7] = var4.method286((byte) -101);
                }
                var6 = var8;
                var7++;
                if (this.field1302.field1134[var8] == 5) {
                    this.field1297 = true;
                }
            }
        }
        if (arg0.length != var4.field710) {
            throw new RuntimeException();
        }
        this.field1303 = var7;
        this.field1300 = new int[var7];
        this.field1294 = new int[var7];
        this.field1299 = new int[var7];
        this.field1301 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1300[var9] = field1296[var9];
            this.field1294[var9] = field1295[var9];
            this.field1299[var9] = field1304[var9];
            this.field1301[var9] = field1298[var9];
        }
    }
}

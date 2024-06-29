import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Ldd;")
    public class26 field1412 = null;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Z")
    public boolean field1410 = false;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public int field1416 = -1;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "[I")
    public int[] field1415;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "[I")
    public int[] field1418;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "[I")
    public int[] field1420;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "[I")
    public int[] field1417;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[I")
    private static int[] field1414 = new int[500];

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "[I")
    private static int[] field1413 = new int[500];

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "[I")
    private static int[] field1411 = new int[500];

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "[I")
    private static int[] field1419 = new int[500];

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()V")
    public static void method491() {
        field1411 = null;
        field1414 = null;
        field1413 = null;
        field1419 = null;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "([BLdd;)V")
    public class66(byte[] arg0, class26 arg1) {
        this.field1412 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2995 = 2;
        int var5 = var3.method1011(41);
        int var6 = -1;
        int var7 = 0;
        var4.field2995 = var3.field2995 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method1011(100);
            if (var10 > 0) {
                if (this.field1412.field583[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1412.field583[var11] == 0) {
                            field1411[var7] = var11;
                            field1414[var7] = 0;
                            field1413[var7] = 0;
                            field1419[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1411[var7] = var8;
                short var12 = 0;
                if (this.field1412.field583[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1414[var7] = var12;
                } else {
                    field1414[var7] = var4.method1021(65536);
                }
                if ((var10 & 0x2) == 0) {
                    field1413[var7] = var12;
                } else {
                    field1413[var7] = var4.method1021(65536);
                }
                if ((var10 & 0x4) == 0) {
                    field1419[var7] = var12;
                } else {
                    field1419[var7] = var4.method1021(65536);
                }
                var6 = var8;
                var7++;
                if (this.field1412.field583[var8] == 5) {
                    this.field1410 = true;
                }
            }
        }
        if (arg0.length != var4.field2995) {
            throw new RuntimeException();
        }
        this.field1416 = var7;
        this.field1415 = new int[var7];
        this.field1418 = new int[var7];
        this.field1420 = new int[var7];
        this.field1417 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1415[var9] = field1411[var9];
            this.field1418[var9] = field1414[var9];
            this.field1420[var9] = field1413[var9];
            this.field1417[var9] = field1419[var9];
        }
    }
}

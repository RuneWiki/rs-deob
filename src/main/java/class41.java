import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class41 {

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public int field1052 = -1;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lwd;")
    public class135 field1056 = null;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Z")
    public boolean field1059 = false;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[I")
    public int[] field1057;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
    public int[] field1049;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "[I")
    public int[] field1053;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "[I")
    public int[] field1058;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "[I")
    private static int[] field1051 = new int[500];

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[I")
    private static int[] field1054 = new int[500];

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[I")
    private static int[] field1050 = new int[500];

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "[I")
    private static int[] field1055 = new int[500];

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([BLwd;)V", line = 42)
    public class41(byte[] arg0, class135 arg1) {
        this.field1056 = arg1;
        class39 var3 = new class39(arg0);
        class39 var4 = new class39(arg0);
        var3.field957 = 2;
        int var5 = var3.method330(-30864);
        int var6 = -1;
        int var7 = 0;
        var4.field957 = var3.field957 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method330(-30864);
            if (var10 > 0) {
                if (this.field1056.field3277[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1056.field3277[var11] == 0) {
                            field1050[var7] = var11;
                            field1054[var7] = 0;
                            field1055[var7] = 0;
                            field1051[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1050[var7] = var8;
                short var12 = 0;
                if (this.field1056.field3277[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1054[var7] = var12;
                } else {
                    field1054[var7] = var4.method320(18956);
                }
                if ((var10 & 0x2) == 0) {
                    field1055[var7] = var12;
                } else {
                    field1055[var7] = var4.method320(18956);
                }
                if ((var10 & 0x4) == 0) {
                    field1051[var7] = var12;
                } else {
                    field1051[var7] = var4.method320(18956);
                }
                var6 = var8;
                var7++;
                if (this.field1056.field3277[var8] == 5) {
                    this.field1059 = true;
                }
            }
        }
        if (arg0.length != var4.field957) {
            throw new RuntimeException();
        }
        this.field1052 = var7;
        this.field1057 = new int[var7];
        this.field1049 = new int[var7];
        this.field1053 = new int[var7];
        this.field1058 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1057[var9] = field1050[var9];
            this.field1049[var9] = field1054[var9];
            this.field1053[var9] = field1055[var9];
            this.field1058[var9] = field1051[var9];
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()V", line = 27)
    public static void method352() {
        field1050 = null;
        field1054 = null;
        field1055 = null;
        field1051 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class54 {

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Z")
    public boolean field1053 = false;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public int field1054 = -1;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lve;")
    public class151 field1057 = null;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[I")
    public int[] field1049;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[I")
    public int[] field1052;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "[I")
    public int[] field1050;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[I")
    public int[] field1056;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "[I")
    private static int[] field1055 = new int[500];

    @OriginalMember(owner = "client!he", name = "c", descriptor = "[I")
    private static int[] field1051 = new int[500];

    @OriginalMember(owner = "client!he", name = "j", descriptor = "[I")
    private static int[] field1058 = new int[500];

    @OriginalMember(owner = "client!he", name = "k", descriptor = "[I")
    private static int[] field1059 = new int[500];

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
    public static void method382() {
        field1055 = null;
        field1059 = null;
        field1051 = null;
        field1058 = null;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "([BLve;)V")
    public class54(byte[] arg0, class151 arg1) {
        this.field1057 = arg1;
        class91 var3 = new class91(arg0);
        class91 var4 = new class91(arg0);
        var3.field2043 = 2;
        int var5 = var3.method649(false);
        int var6 = -1;
        int var7 = 0;
        var4.field2043 = var3.field2043 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method649(false);
            if (var10 > 0) {
                if (this.field1057.field3462[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1057.field3462[var11] == 0) {
                            field1055[var7] = var11;
                            field1059[var7] = 0;
                            field1051[var7] = 0;
                            field1058[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1055[var7] = var8;
                short var12 = 0;
                if (this.field1057.field3462[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1059[var7] = var12;
                } else {
                    field1059[var7] = var4.method650(-64);
                }
                if ((var10 & 0x2) == 0) {
                    field1051[var7] = var12;
                } else {
                    field1051[var7] = var4.method650(-64);
                }
                if ((var10 & 0x4) == 0) {
                    field1058[var7] = var12;
                } else {
                    field1058[var7] = var4.method650(-64);
                }
                var6 = var8;
                var7++;
                if (this.field1057.field3462[var8] == 5) {
                    this.field1053 = true;
                }
            }
        }
        if (arg0.length != var4.field2043) {
            throw new RuntimeException();
        }
        this.field1054 = var7;
        this.field1049 = new int[var7];
        this.field1052 = new int[var7];
        this.field1050 = new int[var7];
        this.field1056 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1049[var9] = field1055[var9];
            this.field1052[var9] = field1059[var9];
            this.field1050[var9] = field1051[var9];
            this.field1056[var9] = field1058[var9];
        }
    }
}

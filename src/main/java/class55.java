import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class55 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Z")
    public boolean field1025 = false;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public int field1031 = -1;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Lta;")
    public class172 field1035 = null;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "[I")
    public int[] field1028;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "[I")
    public int[] field1029;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "[I")
    public int[] field1032;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "[I")
    public int[] field1030;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "[I")
    private static int[] field1026 = new int[500];

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "[I")
    private static int[] field1027 = new int[500];

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "[I")
    private static int[] field1033 = new int[500];

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "[I")
    private static int[] field1034 = new int[500];

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()V")
    public static void method444() {
        field1026 = null;
        field1033 = null;
        field1027 = null;
        field1034 = null;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "([BLta;)V")
    public class55(byte[] arg0, class172 arg1) {
        this.field1035 = arg1;
        class53 var3 = new class53(arg0);
        class53 var4 = new class53(arg0);
        var3.field1000 = 2;
        int var5 = var3.method400(255);
        int var6 = -1;
        int var7 = 0;
        var4.field1000 = var3.field1000 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method400(255);
            if (var10 > 0) {
                if (this.field1035.field3289[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1035.field3289[var11] == 0) {
                            field1026[var7] = var11;
                            field1033[var7] = 0;
                            field1027[var7] = 0;
                            field1034[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1026[var7] = var8;
                short var12 = 0;
                if (this.field1035.field3289[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1033[var7] = var12;
                } else {
                    field1033[var7] = var4.method412(false);
                }
                if ((var10 & 0x2) == 0) {
                    field1027[var7] = var12;
                } else {
                    field1027[var7] = var4.method412(false);
                }
                if ((var10 & 0x4) == 0) {
                    field1034[var7] = var12;
                } else {
                    field1034[var7] = var4.method412(false);
                }
                var6 = var8;
                var7++;
                if (this.field1035.field3289[var8] == 5) {
                    this.field1025 = true;
                }
            }
        }
        if (arg0.length != var4.field1000) {
            throw new RuntimeException();
        }
        this.field1031 = var7;
        this.field1028 = new int[var7];
        this.field1029 = new int[var7];
        this.field1032 = new int[var7];
        this.field1030 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1028[var9] = field1026[var9];
            this.field1029[var9] = field1033[var9];
            this.field1032[var9] = field1027[var9];
            this.field1030[var9] = field1034[var9];
        }
    }
}

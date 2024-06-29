import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Lwe;")
    public class158 field55 = null;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Z")
    public boolean field52 = false;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public int field61 = -1;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "[I")
    public int[] field59;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
    public int[] field58;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "[I")
    public int[] field53;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "[I")
    public int[] field62;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "[I")
    private static int[] field54 = new int[500];

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
    private static int[] field57 = new int[500];

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "[I")
    private static int[] field60 = new int[500];

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "[I")
    private static int[] field56 = new int[500];

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
    public static void method11() {
        field60 = null;
        field54 = null;
        field57 = null;
        field56 = null;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([BLwe;)V")
    public class3(byte[] arg0, class158 arg1) {
        this.field55 = arg1;
        class105 var3 = new class105(arg0);
        class105 var4 = new class105(arg0);
        var3.field2404 = 2;
        int var5 = var3.method831((byte) 76);
        int var6 = -1;
        int var7 = 0;
        var4.field2404 = var3.field2404 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method831((byte) 76);
            if (var10 > 0) {
                if (this.field55.field3639[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field55.field3639[var11] == 0) {
                            field60[var7] = var11;
                            field54[var7] = 0;
                            field57[var7] = 0;
                            field56[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field60[var7] = var8;
                short var12 = 0;
                if (this.field55.field3639[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field54[var7] = var12;
                } else {
                    field54[var7] = var4.method788(-64);
                }
                if ((var10 & 0x2) == 0) {
                    field57[var7] = var12;
                } else {
                    field57[var7] = var4.method788(-64);
                }
                if ((var10 & 0x4) == 0) {
                    field56[var7] = var12;
                } else {
                    field56[var7] = var4.method788(-64);
                }
                var6 = var8;
                var7++;
                if (this.field55.field3639[var8] == 5) {
                    this.field52 = true;
                }
            }
        }
        if (arg0.length != var4.field2404) {
            throw new RuntimeException();
        }
        this.field61 = var7;
        this.field59 = new int[var7];
        this.field58 = new int[var7];
        this.field53 = new int[var7];
        this.field62 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field59[var9] = field60[var9];
            this.field58[var9] = field54[var9];
            this.field53[var9] = field57[var9];
            this.field62[var9] = field56[var9];
        }
    }
}

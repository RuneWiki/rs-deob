import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Z")
    public boolean field2459 = false;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public int field2463 = -1;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lnf;")
    public class96 field2456 = null;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "[I")
    public int[] field2461;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
    public int[] field2460;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "[I")
    public int[] field2465;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "[I")
    public int[] field2466;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "[I")
    private static int[] field2462 = new int[500];

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[I")
    private static int[] field2457 = new int[500];

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "[I")
    private static int[] field2458 = new int[500];

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "[I")
    private static int[] field2464 = new int[500];

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()V")
    public static void method899() {
        field2462 = null;
        field2464 = null;
        field2457 = null;
        field2458 = null;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "([BLnf;)V")
    public class109(byte[] arg0, class96 arg1) {
        this.field2456 = arg1;
        class8 var3 = new class8(arg0);
        class8 var4 = new class8(arg0);
        var3.field182 = 2;
        int var5 = var3.method62((byte) 112);
        int var6 = -1;
        int var7 = 0;
        var4.field182 = var3.field182 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method62((byte) 106);
            if (var10 > 0) {
                if (this.field2456.field2191[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field2456.field2191[var11] == 0) {
                            field2462[var7] = var11;
                            field2464[var7] = 0;
                            field2457[var7] = 0;
                            field2458[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2462[var7] = var8;
                short var12 = 0;
                if (this.field2456.field2191[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field2464[var7] = var12;
                } else {
                    field2464[var7] = var4.method61(false);
                }
                if ((var10 & 0x2) == 0) {
                    field2457[var7] = var12;
                } else {
                    field2457[var7] = var4.method61(false);
                }
                if ((var10 & 0x4) == 0) {
                    field2458[var7] = var12;
                } else {
                    field2458[var7] = var4.method61(false);
                }
                var6 = var8;
                var7++;
                if (this.field2456.field2191[var8] == 5) {
                    this.field2459 = true;
                }
            }
        }
        if (arg0.length != var4.field182) {
            throw new RuntimeException();
        }
        this.field2463 = var7;
        this.field2461 = new int[var7];
        this.field2460 = new int[var7];
        this.field2465 = new int[var7];
        this.field2466 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field2461[var9] = field2462[var9];
            this.field2460[var9] = field2464[var9];
            this.field2465[var9] = field2457[var9];
            this.field2466[var9] = field2458[var9];
        }
    }
}

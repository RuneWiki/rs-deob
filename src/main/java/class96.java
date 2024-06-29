import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class96 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Lgd;")
    public class46 field2326 = null;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public int field2333 = -1;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Z")
    public boolean field2335 = false;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
    public int[] field2336;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "[I")
    public int[] field2329;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[I")
    public int[] field2327;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "[I")
    public int[] field2332;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[I")
    private static int[] field2328 = new int[500];

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "[I")
    private static int[] field2331 = new int[500];

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[I")
    private static int[] field2330 = new int[500];

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "[I")
    private static int[] field2334 = new int[500];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()V")
    public static void method797() {
        field2330 = null;
        field2334 = null;
        field2328 = null;
        field2331 = null;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([BLgd;)V")
    public class96(byte[] arg0, class46 arg1) {
        this.field2326 = arg1;
        class95 var3 = new class95(arg0);
        class95 var4 = new class95(arg0);
        var3.field2304 = 2;
        int var5 = var3.method790((byte) 73);
        int var6 = -1;
        int var7 = 0;
        var4.field2304 = var3.field2304 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method790((byte) 73);
            if (var10 > 0) {
                if (this.field2326.field1052[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field2326.field1052[var11] == 0) {
                            field2330[var7] = var11;
                            field2334[var7] = 0;
                            field2328[var7] = 0;
                            field2331[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2330[var7] = var8;
                short var12 = 0;
                if (this.field2326.field1052[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field2334[var7] = var12;
                } else {
                    field2334[var7] = var4.method771(49152);
                }
                if ((var10 & 0x2) == 0) {
                    field2328[var7] = var12;
                } else {
                    field2328[var7] = var4.method771(49152);
                }
                if ((var10 & 0x4) == 0) {
                    field2331[var7] = var12;
                } else {
                    field2331[var7] = var4.method771(49152);
                }
                var6 = var8;
                var7++;
                if (this.field2326.field1052[var8] == 5) {
                    this.field2335 = true;
                }
            }
        }
        if (arg0.length != var4.field2304) {
            throw new RuntimeException();
        }
        this.field2333 = var7;
        this.field2336 = new int[var7];
        this.field2329 = new int[var7];
        this.field2327 = new int[var7];
        this.field2332 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field2336[var9] = field2330[var9];
            this.field2329[var9] = field2334[var9];
            this.field2327[var9] = field2328[var9];
            this.field2332[var9] = field2331[var9];
        }
    }
}

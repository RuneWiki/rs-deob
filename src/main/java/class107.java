import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class107 {

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lmc;")
    public class86 field2627 = null;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field2621 = -1;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Z")
    public boolean field2628 = false;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "[I")
    public int[] field2620;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[I")
    public int[] field2625;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
    public int[] field2626;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "[I")
    public int[] field2624;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
    private static int[] field2622 = new int[500];

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[I")
    private static int[] field2623 = new int[500];

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "[I")
    private static int[] field2629 = new int[500];

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "[I")
    private static int[] field2630 = new int[500];

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()V")
    public static void method861() {
        field2629 = null;
        field2630 = null;
        field2623 = null;
        field2622 = null;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "([BLmc;)V")
    public class107(byte[] arg0, class86 arg1) {
        this.field2627 = arg1;
        class122 var3 = new class122(arg0);
        class122 var4 = new class122(arg0);
        var3.field2903 = 2;
        int var5 = var3.method931((byte) 124);
        int var6 = -1;
        int var7 = 0;
        var4.field2903 = var3.field2903 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method931((byte) 124);
            if (var10 > 0) {
                if (this.field2627.field2013[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field2627.field2013[var11] == 0) {
                            field2629[var7] = var11;
                            field2630[var7] = 0;
                            field2623[var7] = 0;
                            field2622[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2629[var7] = var8;
                short var12 = 0;
                if (this.field2627.field2013[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field2630[var7] = var12;
                } else {
                    field2630[var7] = var4.method958(-24839);
                }
                if ((var10 & 0x2) == 0) {
                    field2623[var7] = var12;
                } else {
                    field2623[var7] = var4.method958(-24839);
                }
                if ((var10 & 0x4) == 0) {
                    field2622[var7] = var12;
                } else {
                    field2622[var7] = var4.method958(-24839);
                }
                var6 = var8;
                var7++;
                if (this.field2627.field2013[var8] == 5) {
                    this.field2628 = true;
                }
            }
        }
        if (arg0.length != var4.field2903) {
            throw new RuntimeException();
        }
        this.field2621 = var7;
        this.field2620 = new int[var7];
        this.field2625 = new int[var7];
        this.field2626 = new int[var7];
        this.field2624 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field2620[var9] = field2629[var9];
            this.field2625[var9] = field2630[var9];
            this.field2626[var9] = field2623[var9];
            this.field2624[var9] = field2622[var9];
        }
    }
}

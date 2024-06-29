import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class111 {

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Z")
    public boolean field2294 = false;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lv;")
    public class189 field2298 = null;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public int field2297 = -1;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
    public int[] field2296;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "[I")
    public int[] field2290;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "[I")
    public int[] field2291;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[I")
    public int[] field2292;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "[I")
    private static int[] field2293 = new int[500];

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "[I")
    private static int[] field2300 = new int[500];

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "[I")
    private static int[] field2299 = new int[500];

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "[I")
    private static int[] field2295 = new int[500];

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()V")
    public static void method888() {
        field2293 = null;
        field2300 = null;
        field2299 = null;
        field2295 = null;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([BLv;)V")
    public class111(byte[] arg0, class189 arg1) {
        this.field2298 = arg1;
        class68 var3 = new class68(arg0);
        class68 var4 = new class68(arg0);
        var3.field1454 = 2;
        int var5 = var3.method604((byte) -11);
        int var6 = -1;
        int var7 = 0;
        var4.field1454 = var3.field1454 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method604((byte) -127);
            if (var10 > 0) {
                if (this.field2298.field3664[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field2298.field3664[var11] == 0) {
                            field2293[var7] = var11;
                            field2300[var7] = 0;
                            field2299[var7] = 0;
                            field2295[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2293[var7] = var8;
                short var12 = 0;
                if (this.field2298.field3664[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field2300[var7] = var12;
                } else {
                    field2300[var7] = var4.method591(25006);
                }
                if ((var10 & 0x2) == 0) {
                    field2299[var7] = var12;
                } else {
                    field2299[var7] = var4.method591(25006);
                }
                if ((var10 & 0x4) == 0) {
                    field2295[var7] = var12;
                } else {
                    field2295[var7] = var4.method591(25006);
                }
                var6 = var8;
                var7++;
                if (this.field2298.field3664[var8] == 5) {
                    this.field2294 = true;
                }
            }
        }
        if (arg0.length != var4.field1454) {
            throw new RuntimeException();
        }
        this.field2297 = var7;
        this.field2296 = new int[var7];
        this.field2290 = new int[var7];
        this.field2291 = new int[var7];
        this.field2292 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field2296[var9] = field2293[var9];
            this.field2290[var9] = field2300[var9];
            this.field2291[var9] = field2299[var9];
            this.field2292[var9] = field2295[var9];
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class117 {

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
    public boolean field2579 = false;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Lte;")
    public class137 field2582 = null;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public int field2584 = -1;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "[I")
    public int[] field2578;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[I")
    public int[] field2576;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "[I")
    public int[] field2580;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "[I")
    public int[] field2585;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[I")
    private static int[] field2575 = new int[500];

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[I")
    private static int[] field2577 = new int[500];

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[I")
    private static int[] field2581 = new int[500];

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[I")
    private static int[] field2583 = new int[500];

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()V")
    public static void method885() {
        field2581 = null;
        field2577 = null;
        field2583 = null;
        field2575 = null;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([BLte;)V")
    public class117(byte[] arg0, class137 arg1) {
        this.field2582 = arg1;
        class138 var3 = new class138(arg0);
        class138 var4 = new class138(arg0);
        var3.field3175 = 2;
        int var5 = var3.method1055(122);
        int var6 = -1;
        int var7 = 0;
        var4.field3175 = var3.field3175 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method1055(113);
            if (var10 > 0) {
                if (this.field2582.field3132[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field2582.field3132[var11] == 0) {
                            field2581[var7] = var11;
                            field2577[var7] = 0;
                            field2583[var7] = 0;
                            field2575[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2581[var7] = var8;
                short var12 = 0;
                if (this.field2582.field3132[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field2577[var7] = var12;
                } else {
                    field2577[var7] = var4.method1097((byte) -80);
                }
                if ((var10 & 0x2) == 0) {
                    field2583[var7] = var12;
                } else {
                    field2583[var7] = var4.method1097((byte) -80);
                }
                if ((var10 & 0x4) == 0) {
                    field2575[var7] = var12;
                } else {
                    field2575[var7] = var4.method1097((byte) -80);
                }
                var6 = var8;
                var7++;
                if (this.field2582.field3132[var8] == 5) {
                    this.field2579 = true;
                }
            }
        }
        if (arg0.length != var4.field3175) {
            throw new RuntimeException();
        }
        this.field2584 = var7;
        this.field2578 = new int[var7];
        this.field2576 = new int[var7];
        this.field2580 = new int[var7];
        this.field2585 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field2578[var9] = field2581[var9];
            this.field2576[var9] = field2577[var9];
            this.field2580[var9] = field2583[var9];
            this.field2585[var9] = field2575[var9];
        }
    }
}

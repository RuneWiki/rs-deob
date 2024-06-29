import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class142 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Z")
    public boolean field2568 = false;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public int field2578 = -1;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Lca;")
    public class24 field2580 = null;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "[S")
    public short[] field2573;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "[S")
    public short[] field2577;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "[S")
    public short[] field2571;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "[S")
    public short[] field2574;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "[S")
    public short[] field2575;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "[S")
    private static short[] field2572 = new short[500];

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[S")
    private static short[] field2569 = new short[500];

    @OriginalMember(owner = "client!n", name = "l", descriptor = "[S")
    private static short[] field2579 = new short[500];

    @OriginalMember(owner = "client!n", name = "c", descriptor = "[S")
    private static short[] field2570 = new short[500];

    @OriginalMember(owner = "client!n", name = "i", descriptor = "[S")
    private static short[] field2576 = new short[500];

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
    public static void method962() {
        field2569 = null;
        field2570 = null;
        field2572 = null;
        field2576 = null;
        field2579 = null;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "([BLca;)V")
    public class142(byte[] arg0, class24 arg1) {
        this.field2580 = arg1;
        class145 var3 = new class145(arg0);
        class145 var4 = new class145(arg0);
        var3.field2643 = 2;
        int var5 = var3.method998(103);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2643 = var3.field2643 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2580.field600[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method998(71);
            if (var11 > 0) {
                if (this.field2580.field600[var9] == 0) {
                    var8 = var9;
                }
                field2569[var6] = (short) var9;
                short var12 = 0;
                if (this.field2580.field600[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2570[var6] = var12;
                } else {
                    field2570[var6] = (short) var4.method1029((byte) 95);
                }
                if ((var11 & 0x2) == 0) {
                    field2572[var6] = var12;
                } else {
                    field2572[var6] = (short) var4.method1029((byte) 109);
                }
                if ((var11 & 0x4) == 0) {
                    field2576[var6] = var12;
                } else {
                    field2576[var6] = (short) var4.method1029((byte) 127);
                }
                if (this.field2580.field600[var9] == 2) {
                    field2570[var6] = (short) (((field2570[var6] & 0xFF) << 3) + (field2570[var6] >> 8 & 0x7));
                    field2572[var6] = (short) (((field2572[var6] & 0xFF) << 3) + (field2572[var6] >> 8 & 0x7));
                    field2576[var6] = (short) (((field2576[var6] & 0xFF) << 3) + (field2576[var6] >> 8 & 0x7));
                }
                field2579[var6] = -1;
                if (this.field2580.field600[var9] >= 1 && this.field2580.field600[var9] <= 3 && var7 > var8) {
                    field2579[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field2580.field600[var9] == 5) {
                    this.field2568 = true;
                }
            }
        }
        if (arg0.length != var4.field2643) {
            throw new RuntimeException();
        }
        this.field2578 = var6;
        this.field2573 = new short[var6];
        this.field2577 = new short[var6];
        this.field2571 = new short[var6];
        this.field2574 = new short[var6];
        this.field2575 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2573[var10] = field2569[var10];
            this.field2577[var10] = field2570[var10];
            this.field2571[var10] = field2572[var10];
            this.field2574[var10] = field2576[var10];
            this.field2575[var10] = field2579[var10];
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class147 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Z")
    public boolean field2532 = false;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public int field2538 = -1;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Li;")
    public class94 field2533 = null;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "[S")
    public short[] field2540;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "[S")
    public short[] field2539;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "[S")
    public short[] field2537;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "[S")
    public short[] field2541;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "[S")
    public short[] field2542;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "[S")
    private static short[] field2534 = new short[500];

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "[S")
    private static short[] field2536 = new short[500];

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "[S")
    private static short[] field2543 = new short[500];

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "[S")
    private static short[] field2535 = new short[500];

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "[S")
    private static short[] field2544 = new short[500];

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
    public static void method1031() {
        field2534 = null;
        field2543 = null;
        field2536 = null;
        field2535 = null;
        field2544 = null;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "([BLi;)V")
    public class147(byte[] arg0, class94 arg1) {
        this.field2533 = arg1;
        class217 var3 = new class217(arg0);
        class217 var4 = new class217(arg0);
        var3.field3581 = 2;
        int var5 = var3.method1487(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3581 = var3.field3581 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2533.field1753[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method1487(255);
            if (var11 > 0) {
                if (this.field2533.field1753[var9] == 0) {
                    var8 = var9;
                }
                field2534[var6] = (short) var9;
                short var12 = 0;
                if (this.field2533.field1753[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2543[var6] = var12;
                } else {
                    field2543[var6] = (short) var4.method1453(128);
                }
                if ((var11 & 0x2) == 0) {
                    field2536[var6] = var12;
                } else {
                    field2536[var6] = (short) var4.method1453(128);
                }
                if ((var11 & 0x4) == 0) {
                    field2535[var6] = var12;
                } else {
                    field2535[var6] = (short) var4.method1453(128);
                }
                if (this.field2533.field1753[var9] == 2) {
                    field2543[var6] = (short) (((field2543[var6] & 0xFF) << 3) + (field2543[var6] >> 8 & 0x7));
                    field2536[var6] = (short) (((field2536[var6] & 0xFF) << 3) + (field2536[var6] >> 8 & 0x7));
                    field2535[var6] = (short) (((field2535[var6] & 0xFF) << 3) + (field2535[var6] >> 8 & 0x7));
                }
                field2544[var6] = -1;
                if (this.field2533.field1753[var9] >= 1 && this.field2533.field1753[var9] <= 3 && var7 > var8) {
                    field2544[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field2533.field1753[var9] == 5) {
                    this.field2532 = true;
                }
            }
        }
        if (arg0.length != var4.field3581) {
            throw new RuntimeException();
        }
        this.field2538 = var6;
        this.field2540 = new short[var6];
        this.field2539 = new short[var6];
        this.field2537 = new short[var6];
        this.field2541 = new short[var6];
        this.field2542 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2540[var10] = field2534[var10];
            this.field2539[var10] = field2543[var10];
            this.field2537[var10] = field2536[var10];
            this.field2541[var10] = field2535[var10];
            this.field2542[var10] = field2544[var10];
        }
    }
}

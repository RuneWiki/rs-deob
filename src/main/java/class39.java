import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class39 {

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Ljf;")
    public class9 field601 = null;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Z")
    public boolean field603 = false;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public int field608 = -1;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "[S")
    public short[] field598;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "[S")
    public short[] field604;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "[S")
    public short[] field607;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "[S")
    public short[] field609;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "[S")
    public short[] field606;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "[S")
    private static short[] field602 = new short[500];

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "[S")
    private static short[] field597 = new short[500];

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "[S")
    private static short[] field599 = new short[500];

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "[S")
    private static short[] field600 = new short[500];

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "[S")
    private static short[] field605 = new short[500];

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()V", line = 3)
    public static void method262() {
        field602 = null;
        field597 = null;
        field600 = null;
        field599 = null;
        field605 = null;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "([BLjf;)V", line = 48)
    public class39(byte[] arg0, class9 arg1) {
        this.field601 = arg1;
        class112 var3 = new class112(arg0);
        class112 var4 = new class112(arg0);
        var3.field1640 = 2;
        int var5 = var3.method792(2);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1640 = var3.field1640 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field601.field116[var9] == 0) {
                var7 = var9;
            }
            int var10 = var3.method792(2);
            if (var10 > 0) {
                if (this.field601.field116[var9] == 0) {
                    var8 = var9;
                }
                field602[var6] = (short) var9;
                short var11 = 0;
                if (this.field601.field116[var9] == 3) {
                    var11 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field597[var6] = var11;
                } else {
                    field597[var6] = (short) var4.method765(255);
                }
                if ((var10 & 0x2) == 0) {
                    field600[var6] = var11;
                } else {
                    field600[var6] = (short) var4.method765(255);
                }
                if ((var10 & 0x4) == 0) {
                    field599[var6] = var11;
                } else {
                    field599[var6] = (short) var4.method765(255);
                }
                if (this.field601.field116[var9] == 2) {
                    field597[var6] = (short) (((field597[var6] & 0xFF) << 3) + (field597[var6] >> 8 & 0x7));
                    field600[var6] = (short) (((field600[var6] & 0xFF) << 3) + (field600[var6] >> 8 & 0x7));
                    field599[var6] = (short) (((field599[var6] & 0xFF) << 3) + (field599[var6] >> 8 & 0x7));
                }
                field605[var6] = -1;
                if (this.field601.field116[var9] >= 1 && this.field601.field116[var9] <= 3 && var7 > var8) {
                    field605[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field601.field116[var9] == 5) {
                    this.field603 = true;
                }
            }
        }
        if (arg0.length != var4.field1640) {
            throw new RuntimeException();
        }
        this.field608 = var6;
        this.field598 = new short[var6];
        this.field604 = new short[var6];
        this.field607 = new short[var6];
        this.field609 = new short[var6];
        this.field606 = new short[var6];
        for (int var12 = 0; var12 < var6; var12++) {
            this.field598[var12] = field602[var12];
            this.field604[var12] = field597[var12];
            this.field607[var12] = field600[var12];
            this.field609[var12] = field599[var12];
            this.field606[var12] = field605[var12];
        }
    }
}

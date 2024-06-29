import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class84 {

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lli;")
    public class136 field1645 = null;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public int field1650 = -1;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "Z")
    public boolean field1651 = false;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "[S")
    public short[] field1644;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "[S")
    public short[] field1647;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "[S")
    public short[] field1652;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "[S")
    public short[] field1654;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[S")
    public short[] field1648;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "[S")
    private static short[] field1643 = new short[500];

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[S")
    private static short[] field1642 = new short[500];

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "[S")
    private static short[] field1649 = new short[500];

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[S")
    private static short[] field1646 = new short[500];

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "[S")
    private static short[] field1653 = new short[500];

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()V")
    public static void method637() {
        field1643 = null;
        field1646 = null;
        field1653 = null;
        field1649 = null;
        field1642 = null;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([BLli;)V")
    public class84(byte[] arg0, class136 arg1) {
        this.field1645 = arg1;
        class152 var3 = new class152(arg0);
        class152 var4 = new class152(arg0);
        var3.field2677 = 2;
        int var5 = var3.method1051((byte) 125);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2677 = var3.field2677 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1645.field2427[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method1051((byte) 120);
            if (var11 > 0) {
                if (this.field1645.field2427[var9] == 0) {
                    var8 = var9;
                }
                field1643[var6] = (short) var9;
                short var12 = 0;
                if (this.field1645.field2427[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field1646[var6] = var12;
                } else {
                    field1646[var6] = (short) var4.method1046(-87);
                }
                if ((var11 & 0x2) == 0) {
                    field1653[var6] = var12;
                } else {
                    field1653[var6] = (short) var4.method1046(-28);
                }
                if ((var11 & 0x4) == 0) {
                    field1649[var6] = var12;
                } else {
                    field1649[var6] = (short) var4.method1046(-79);
                }
                if (this.field1645.field2427[var9] == 2) {
                    field1646[var6] = (short) (((field1646[var6] & 0xFF) << 3) + (field1646[var6] >> 8 & 0x7));
                    field1653[var6] = (short) (((field1653[var6] & 0xFF) << 3) + (field1653[var6] >> 8 & 0x7));
                    field1649[var6] = (short) (((field1649[var6] & 0xFF) << 3) + (field1649[var6] >> 8 & 0x7));
                }
                field1642[var6] = -1;
                if (this.field1645.field2427[var9] >= 1 && this.field1645.field2427[var9] <= 3 && var7 > var8) {
                    field1642[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field1645.field2427[var9] == 5) {
                    this.field1651 = true;
                }
            }
        }
        if (arg0.length != var4.field2677) {
            throw new RuntimeException();
        }
        this.field1650 = var6;
        this.field1644 = new short[var6];
        this.field1647 = new short[var6];
        this.field1652 = new short[var6];
        this.field1654 = new short[var6];
        this.field1648 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field1644[var10] = field1643[var10];
            this.field1647[var10] = field1646[var10];
            this.field1652[var10] = field1653[var10];
            this.field1654[var10] = field1649[var10];
            this.field1648[var10] = field1642[var10];
        }
    }
}

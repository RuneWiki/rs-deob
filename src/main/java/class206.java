import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class206 {

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Lhb;")
    public class70 field3500 = null;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Z")
    public boolean field3503 = false;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public int field3498 = -1;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[S")
    public short[] field3497;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "[S")
    public short[] field3504;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "[S")
    public short[] field3507;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "[S")
    public short[] field3502;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "[S")
    public short[] field3508;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "[S")
    private static short[] field3496 = new short[500];

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "[S")
    private static short[] field3501 = new short[500];

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "[S")
    private static short[] field3499 = new short[500];

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "[S")
    private static short[] field3505 = new short[500];

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "[S")
    private static short[] field3506 = new short[500];

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()V")
    public static void method1316() {
        field3505 = null;
        field3501 = null;
        field3506 = null;
        field3496 = null;
        field3499 = null;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "([BLhb;)V")
    public class206(byte[] arg0, class70 arg1) {
        this.field3500 = arg1;
        class226 var3 = new class226(arg0);
        class226 var4 = new class226(arg0);
        var3.field3879 = 2;
        int var5 = var3.method1471(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3879 = var3.field3879 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3500.field1237[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method1471(255);
            if (var11 > 0) {
                if (this.field3500.field1237[var9] == 0) {
                    var8 = var9;
                }
                field3505[var6] = (short) var9;
                short var12 = 0;
                if (this.field3500.field1237[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3501[var6] = var12;
                } else {
                    field3501[var6] = (short) var4.method1455(-129);
                }
                if ((var11 & 0x2) == 0) {
                    field3506[var6] = var12;
                } else {
                    field3506[var6] = (short) var4.method1455(-129);
                }
                if ((var11 & 0x4) == 0) {
                    field3496[var6] = var12;
                } else {
                    field3496[var6] = (short) var4.method1455(-129);
                }
                if (this.field3500.field1237[var9] == 2) {
                    field3501[var6] = (short) (((field3501[var6] & 0xFF) << 3) + (field3501[var6] >> 8 & 0x7));
                    field3506[var6] = (short) (((field3506[var6] & 0xFF) << 3) + (field3506[var6] >> 8 & 0x7));
                    field3496[var6] = (short) (((field3496[var6] & 0xFF) << 3) + (field3496[var6] >> 8 & 0x7));
                }
                field3499[var6] = -1;
                if (this.field3500.field1237[var9] >= 1 && this.field3500.field1237[var9] <= 3 && var7 > var8) {
                    field3499[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field3500.field1237[var9] == 5) {
                    this.field3503 = true;
                }
            }
        }
        if (arg0.length != var4.field3879) {
            throw new RuntimeException();
        }
        this.field3498 = var6;
        this.field3497 = new short[var6];
        this.field3504 = new short[var6];
        this.field3507 = new short[var6];
        this.field3502 = new short[var6];
        this.field3508 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field3497[var10] = field3505[var10];
            this.field3504[var10] = field3501[var10];
            this.field3507[var10] = field3506[var10];
            this.field3502[var10] = field3496[var10];
            this.field3508[var10] = field3499[var10];
        }
    }
}

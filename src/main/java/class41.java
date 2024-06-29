import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class41 {

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "Z")
    public boolean field576 = false;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Lgg;")
    public class66 field583 = null;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public int field577 = -1;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "[S")
    public short[] field575;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "[S")
    public short[] field578;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "[S")
    public short[] field579;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "[S")
    public short[] field573;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "[S")
    public short[] field580;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "[S")
    private static short[] field581 = new short[500];

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "[S")
    private static short[] field584 = new short[500];

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "[S")
    private static short[] field574 = new short[500];

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "[S")
    private static short[] field582 = new short[500];

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "[S")
    private static short[] field585 = new short[500];

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()V", line = 11)
    public static void method253() {
        field581 = null;
        field584 = null;
        field582 = null;
        field574 = null;
        field585 = null;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "([BLgg;)V", line = 44)
    public class41(byte[] arg0, class66 arg1) {
        this.field583 = arg1;
        class229 var3 = new class229(arg0);
        class229 var4 = new class229(arg0);
        var3.field3905 = 2;
        int var5 = var3.method1535((byte) 105);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3905 = var3.field3905 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field583.field918[var9] == 0) {
                var7 = var9;
            }
            int var10 = var3.method1535((byte) 80);
            if (var10 > 0) {
                if (this.field583.field918[var9] == 0) {
                    var8 = var9;
                }
                field581[var6] = (short) var9;
                short var11 = 0;
                if (this.field583.field918[var9] == 3) {
                    var11 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field584[var6] = var11;
                } else {
                    field584[var6] = (short) var4.method1558((byte) 88);
                }
                if ((var10 & 0x2) == 0) {
                    field582[var6] = var11;
                } else {
                    field582[var6] = (short) var4.method1558((byte) -125);
                }
                if ((var10 & 0x4) == 0) {
                    field574[var6] = var11;
                } else {
                    field574[var6] = (short) var4.method1558((byte) -110);
                }
                if (this.field583.field918[var9] == 2) {
                    field584[var6] = (short) (((field584[var6] & 0xFF) << 3) + (field584[var6] >> 8 & 0x7));
                    field582[var6] = (short) (((field582[var6] & 0xFF) << 3) + (field582[var6] >> 8 & 0x7));
                    field574[var6] = (short) (((field574[var6] & 0xFF) << 3) + (field574[var6] >> 8 & 0x7));
                }
                field585[var6] = -1;
                if (this.field583.field918[var9] >= 1 && this.field583.field918[var9] <= 3 && var7 > var8) {
                    field585[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field583.field918[var9] == 5) {
                    this.field576 = true;
                }
            }
        }
        if (arg0.length != var4.field3905) {
            throw new RuntimeException();
        }
        this.field577 = var6;
        this.field575 = new short[var6];
        this.field578 = new short[var6];
        this.field579 = new short[var6];
        this.field573 = new short[var6];
        this.field580 = new short[var6];
        for (int var12 = 0; var12 < var6; var12++) {
            this.field575[var12] = field581[var12];
            this.field578[var12] = field584[var12];
            this.field579[var12] = field582[var12];
            this.field573[var12] = field574[var12];
            this.field580[var12] = field585[var12];
        }
    }
}

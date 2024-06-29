import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class207 {

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Z")
    public boolean field3554 = false;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public int field3550 = -1;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Lna;")
    public class25 field3556 = null;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "[S")
    public short[] field3548;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "[S")
    public short[] field3547;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "[S")
    public short[] field3555;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "[S")
    public short[] field3559;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "[S")
    public short[] field3552;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "[S")
    private static short[] field3551 = new short[500];

    @OriginalMember(owner = "client!h", name = "c", descriptor = "[S")
    private static short[] field3549 = new short[500];

    @OriginalMember(owner = "client!h", name = "k", descriptor = "[S")
    private static short[] field3557 = new short[500];

    @OriginalMember(owner = "client!h", name = "l", descriptor = "[S")
    private static short[] field3558 = new short[500];

    @OriginalMember(owner = "client!h", name = "g", descriptor = "[S")
    private static short[] field3553 = new short[500];

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V", line = 15)
    public static void method1497() {
        field3558 = null;
        field3551 = null;
        field3557 = null;
        field3549 = null;
        field3553 = null;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "([BLna;)V", line = 48)
    public class207(byte[] arg0, class25 arg1) {
        this.field3556 = arg1;
        class70 var3 = new class70(arg0);
        class70 var4 = new class70(arg0);
        var3.field1068 = 2;
        int var5 = var3.method481(0);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1068 = var3.field1068 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3556.field387[var9] == 0) {
                var7 = var9;
            }
            int var10 = var3.method481(0);
            if (var10 > 0) {
                if (this.field3556.field387[var9] == 0) {
                    var8 = var9;
                }
                field3558[var6] = (short) var9;
                short var11 = 0;
                if (this.field3556.field387[var9] == 3) {
                    var11 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field3551[var6] = var11;
                } else {
                    field3551[var6] = (short) var4.method448(false);
                }
                if ((var10 & 0x2) == 0) {
                    field3557[var6] = var11;
                } else {
                    field3557[var6] = (short) var4.method448(false);
                }
                if ((var10 & 0x4) == 0) {
                    field3549[var6] = var11;
                } else {
                    field3549[var6] = (short) var4.method448(false);
                }
                if (this.field3556.field387[var9] == 2) {
                    field3551[var6] = (short) (((field3551[var6] & 0xFF) << 3) + (field3551[var6] >> 8 & 0x7));
                    field3557[var6] = (short) (((field3557[var6] & 0xFF) << 3) + (field3557[var6] >> 8 & 0x7));
                    field3549[var6] = (short) (((field3549[var6] & 0xFF) << 3) + (field3549[var6] >> 8 & 0x7));
                }
                field3553[var6] = -1;
                if (this.field3556.field387[var9] >= 1 && this.field3556.field387[var9] <= 3 && var7 > var8) {
                    field3553[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field3556.field387[var9] == 5) {
                    this.field3554 = true;
                }
            }
        }
        if (arg0.length != var4.field1068) {
            throw new RuntimeException();
        }
        this.field3550 = var6;
        this.field3548 = new short[var6];
        this.field3547 = new short[var6];
        this.field3555 = new short[var6];
        this.field3559 = new short[var6];
        this.field3552 = new short[var6];
        for (int var12 = 0; var12 < var6; var12++) {
            this.field3548[var12] = field3558[var12];
            this.field3547[var12] = field3551[var12];
            this.field3555[var12] = field3557[var12];
            this.field3559[var12] = field3549[var12];
            this.field3552[var12] = field3553[var12];
        }
    }
}

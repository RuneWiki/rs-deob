import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class198 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Ll;")
    public class158 field3539 = null;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Z")
    public boolean field3540 = false;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public int field3544 = -1;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "[S")
    public short[] field3548;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "[S")
    public short[] field3547;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "[S")
    public short[] field3545;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "[S")
    public short[] field3542;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "[S")
    public short[] field3543;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[S")
    private static short[] field3541 = new short[500];

    @OriginalMember(owner = "client!se", name = "l", descriptor = "[S")
    private static short[] field3550 = new short[500];

    @OriginalMember(owner = "client!se", name = "h", descriptor = "[S")
    private static short[] field3546 = new short[500];

    @OriginalMember(owner = "client!se", name = "k", descriptor = "[S")
    private static short[] field3549 = new short[500];

    @OriginalMember(owner = "client!se", name = "m", descriptor = "[S")
    private static short[] field3551 = new short[500];

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()V")
    public static void method1409() {
        field3546 = null;
        field3551 = null;
        field3541 = null;
        field3549 = null;
        field3550 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "([BLl;)V")
    public class198(byte[] arg0, class158 arg1) {
        this.field3539 = arg1;
        class14 var3 = new class14(arg0);
        class14 var4 = new class14(arg0);
        var3.field318 = 2;
        int var5 = var3.method200(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field318 = var3.field318 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3539.field2826[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method200(255);
            if (var11 > 0) {
                if (this.field3539.field2826[var9] == 0) {
                    var8 = var9;
                }
                field3546[var6] = (short) var9;
                short var12 = 0;
                if (this.field3539.field2826[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3551[var6] = var12;
                } else {
                    field3551[var6] = (short) var4.method182(-75);
                }
                if ((var11 & 0x2) == 0) {
                    field3541[var6] = var12;
                } else {
                    field3541[var6] = (short) var4.method182(-55);
                }
                if ((var11 & 0x4) == 0) {
                    field3549[var6] = var12;
                } else {
                    field3549[var6] = (short) var4.method182(-108);
                }
                if (this.field3539.field2826[var9] == 2) {
                    field3551[var6] = (short) (((field3551[var6] & 0xFF) << 3) + (field3551[var6] >> 8 & 0x7));
                    field3541[var6] = (short) (((field3541[var6] & 0xFF) << 3) + (field3541[var6] >> 8 & 0x7));
                    field3549[var6] = (short) (((field3549[var6] & 0xFF) << 3) + (field3549[var6] >> 8 & 0x7));
                }
                field3550[var6] = -1;
                if (this.field3539.field2826[var9] >= 1 && this.field3539.field2826[var9] <= 3 && var7 > var8) {
                    field3550[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field3539.field2826[var9] == 5) {
                    this.field3540 = true;
                }
            }
        }
        if (arg0.length != var4.field318) {
            throw new RuntimeException();
        }
        this.field3544 = var6;
        this.field3548 = new short[var6];
        this.field3547 = new short[var6];
        this.field3545 = new short[var6];
        this.field3542 = new short[var6];
        this.field3543 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field3548[var10] = field3546[var10];
            this.field3547[var10] = field3551[var10];
            this.field3545[var10] = field3541[var10];
            this.field3542[var10] = field3549[var10];
            this.field3543[var10] = field3550[var10];
        }
    }
}

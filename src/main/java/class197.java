import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class197 {

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Z")
    public boolean field3779 = false;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public int field3781 = -1;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Lha;")
    public class78 field3788 = null;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "[S")
    public short[] field3783;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "[S")
    public short[] field3785;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "[S")
    public short[] field3782;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "[S")
    public short[] field3787;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[S")
    public short[] field3776;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "[S")
    private static short[] field3778 = new short[500];

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "[S")
    private static short[] field3780 = new short[500];

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[S")
    private static short[] field3777 = new short[500];

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "[S")
    private static short[] field3786 = new short[500];

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "[S")
    private static short[] field3784 = new short[500];

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
    public static void method1364() {
        field3777 = null;
        field3784 = null;
        field3780 = null;
        field3778 = null;
        field3786 = null;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([BLha;)V")
    public class197(byte[] arg0, class78 arg1) {
        this.field3788 = arg1;
        class46 var3 = new class46(arg0);
        class46 var4 = new class46(arg0);
        var3.field831 = 2;
        int var5 = var3.method347(26119);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field831 = var3.field831 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3788.field1409[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method347(26119);
            if (var11 > 0) {
                if (this.field3788.field1409[var9] == 0) {
                    var8 = var9;
                }
                field3777[var6] = (short) var9;
                short var12 = 0;
                if (this.field3788.field1409[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3784[var6] = var12;
                } else {
                    field3784[var6] = (short) var4.method342(true);
                }
                if ((var11 & 0x2) == 0) {
                    field3780[var6] = var12;
                } else {
                    field3780[var6] = (short) var4.method342(true);
                }
                if ((var11 & 0x4) == 0) {
                    field3778[var6] = var12;
                } else {
                    field3778[var6] = (short) var4.method342(true);
                }
                if (this.field3788.field1409[var9] == 2) {
                    field3784[var6] = (short) (((field3784[var6] & 0xFF) << 3) + (field3784[var6] >> 8 & 0x7));
                    field3780[var6] = (short) (((field3780[var6] & 0xFF) << 3) + (field3780[var6] >> 8 & 0x7));
                    field3778[var6] = (short) (((field3778[var6] & 0xFF) << 3) + (field3778[var6] >> 8 & 0x7));
                }
                field3786[var6] = -1;
                if (this.field3788.field1409[var9] >= 1 && this.field3788.field1409[var9] <= 3 && var7 > var8) {
                    field3786[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field3788.field1409[var9] == 5) {
                    this.field3779 = true;
                }
            }
        }
        if (arg0.length != var4.field831) {
            throw new RuntimeException();
        }
        this.field3781 = var6;
        this.field3783 = new short[var6];
        this.field3785 = new short[var6];
        this.field3782 = new short[var6];
        this.field3787 = new short[var6];
        this.field3776 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field3783[var10] = field3777[var10];
            this.field3785[var10] = field3784[var10];
            this.field3782[var10] = field3780[var10];
            this.field3787[var10] = field3778[var10];
            this.field3776[var10] = field3786[var10];
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vb")
public class class195 {

    @OriginalMember(owner = "vb", name = "a", descriptor = "Lha;")
    public class70 field3725 = null;

    @OriginalMember(owner = "vb", name = "l", descriptor = "I")
    public int field3736 = -1;

    @OriginalMember(owner = "vb", name = "m", descriptor = "Z")
    public boolean field3737 = false;

    @OriginalMember(owner = "vb", name = "c", descriptor = "[S")
    public short[] field3727;

    @OriginalMember(owner = "vb", name = "g", descriptor = "[S")
    public short[] field3731;

    @OriginalMember(owner = "vb", name = "i", descriptor = "[S")
    public short[] field3733;

    @OriginalMember(owner = "vb", name = "f", descriptor = "[S")
    public short[] field3730;

    @OriginalMember(owner = "vb", name = "h", descriptor = "[S")
    public short[] field3732;

    @OriginalMember(owner = "vb", name = "b", descriptor = "[S")
    private static short[] field3726 = new short[500];

    @OriginalMember(owner = "vb", name = "j", descriptor = "[S")
    private static short[] field3734 = new short[500];

    @OriginalMember(owner = "vb", name = "d", descriptor = "[S")
    private static short[] field3728 = new short[500];

    @OriginalMember(owner = "vb", name = "k", descriptor = "[S")
    private static short[] field3735 = new short[500];

    @OriginalMember(owner = "vb", name = "e", descriptor = "[S")
    private static short[] field3729 = new short[500];

    @OriginalMember(owner = "vb", name = "a", descriptor = "()V")
    public static void method1304() {
        field3734 = null;
        field3729 = null;
        field3728 = null;
        field3735 = null;
        field3726 = null;
    }

    @OriginalMember(owner = "vb", name = "<init>", descriptor = "([BLha;)V")
    public class195(byte[] arg0, class70 arg1) {
        this.field3725 = arg1;
        class86 var3 = new class86(arg0);
        class86 var4 = new class86(arg0);
        var3.field1773 = 2;
        int var5 = var3.method598((byte) 96);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1773 = var3.field1773 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3725.field1362[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method598((byte) 88);
            if (var11 > 0) {
                if (this.field3725.field1362[var9] == 0) {
                    var8 = var9;
                }
                field3734[var6] = (short) var9;
                short var12 = 0;
                if (this.field3725.field1362[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3729[var6] = var12;
                } else {
                    field3729[var6] = (short) var4.method550(128);
                }
                if ((var11 & 0x2) == 0) {
                    field3728[var6] = var12;
                } else {
                    field3728[var6] = (short) var4.method550(128);
                }
                if ((var11 & 0x4) == 0) {
                    field3735[var6] = var12;
                } else {
                    field3735[var6] = (short) var4.method550(128);
                }
                field3726[var6] = -1;
                if (this.field3725.field1362[var9] >= 1 && this.field3725.field1362[var9] <= 3 && var7 > var8) {
                    field3726[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field3725.field1362[var9] == 5) {
                    this.field3737 = true;
                }
            }
        }
        if (arg0.length != var4.field1773) {
            throw new RuntimeException();
        }
        this.field3736 = var6;
        this.field3727 = new short[var6];
        this.field3731 = new short[var6];
        this.field3733 = new short[var6];
        this.field3730 = new short[var6];
        this.field3732 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field3727[var10] = field3734[var10];
            this.field3731[var10] = field3729[var10];
            this.field3733[var10] = field3728[var10];
            this.field3730[var10] = field3735[var10];
            this.field3732[var10] = field3726[var10];
        }
    }
}

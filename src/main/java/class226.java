import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class226 {

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Z")
    public boolean field3858 = false;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Lmc;")
    public class221 field3850 = null;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public int field3862 = -1;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "[S")
    public short[] field3861;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "[S")
    public short[] field3851;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "[S")
    public short[] field3856;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "[S")
    public short[] field3854;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "[S")
    public short[] field3857;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "[S")
    private static short[] field3855 = new short[500];

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "[S")
    private static short[] field3853 = new short[500];

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "[S")
    private static short[] field3859 = new short[500];

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "[S")
    private static short[] field3852 = new short[500];

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "[S")
    private static short[] field3860 = new short[500];

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()V")
    public static void method1468() {
        field3859 = null;
        field3853 = null;
        field3855 = null;
        field3852 = null;
        field3860 = null;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "([BLmc;)V")
    public class226(byte[] arg0, class221 arg1) {
        this.field3850 = arg1;
        class112 var3 = new class112(arg0);
        class112 var4 = new class112(arg0);
        var3.field1821 = 2;
        int var5 = var3.method758(true);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1821 = var3.field1821 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3850.field3801[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method758(true);
            if (var11 > 0) {
                if (this.field3850.field3801[var9] == 0) {
                    var8 = var9;
                }
                field3859[var6] = (short) var9;
                short var12 = 0;
                if (this.field3850.field3801[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3853[var6] = var12;
                } else {
                    field3853[var6] = (short) var4.method771(128);
                }
                if ((var11 & 0x2) == 0) {
                    field3855[var6] = var12;
                } else {
                    field3855[var6] = (short) var4.method771(128);
                }
                if ((var11 & 0x4) == 0) {
                    field3852[var6] = var12;
                } else {
                    field3852[var6] = (short) var4.method771(128);
                }
                if (this.field3850.field3801[var9] == 2) {
                    field3853[var6] = (short) (((field3853[var6] & 0xFF) << 3) + (field3853[var6] >> 8 & 0x7));
                    field3855[var6] = (short) (((field3855[var6] & 0xFF) << 3) + (field3855[var6] >> 8 & 0x7));
                    field3852[var6] = (short) (((field3852[var6] & 0xFF) << 3) + (field3852[var6] >> 8 & 0x7));
                }
                field3860[var6] = -1;
                if (this.field3850.field3801[var9] >= 1 && this.field3850.field3801[var9] <= 3 && var7 > var8) {
                    field3860[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field3850.field3801[var9] == 5) {
                    this.field3858 = true;
                }
            }
        }
        if (arg0.length != var4.field1821) {
            throw new RuntimeException();
        }
        this.field3862 = var6;
        this.field3861 = new short[var6];
        this.field3851 = new short[var6];
        this.field3856 = new short[var6];
        this.field3854 = new short[var6];
        this.field3857 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field3861[var10] = field3859[var10];
            this.field3851[var10] = field3853[var10];
            this.field3856[var10] = field3855[var10];
            this.field3854[var10] = field3852[var10];
            this.field3857[var10] = field3860[var10];
        }
    }
}

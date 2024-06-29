import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class198 {

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public int field3923 = -1;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Lrd;")
    public class161 field3927 = null;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Z")
    public boolean field3925 = false;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "[S")
    public short[] field3926;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "[S")
    public short[] field3931;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "[S")
    public short[] field3932;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "[S")
    public short[] field3928;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "[S")
    public short[] field3929;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "[S")
    private static short[] field3924 = new short[500];

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "[S")
    private static short[] field3922 = new short[500];

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "[S")
    private static short[] field3930 = new short[500];

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "[S")
    private static short[] field3933 = new short[500];

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "[S")
    private static short[] field3934 = new short[500];

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()V")
    public static void method1311() {
        field3922 = null;
        field3924 = null;
        field3934 = null;
        field3933 = null;
        field3930 = null;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "([BLrd;)V")
    public class198(byte[] arg0, class161 arg1) {
        this.field3927 = arg1;
        class52 var3 = new class52(arg0);
        class52 var4 = new class52(arg0);
        var3.field1033 = 2;
        int var5 = var3.method344(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1033 = var3.field1033 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3927.field3252[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method344(255);
            if (var11 > 0) {
                if (this.field3927.field3252[var9] == 0) {
                    var8 = var9;
                }
                field3922[var6] = (short) var9;
                short var12 = 0;
                if (this.field3927.field3252[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3924[var6] = var12;
                } else {
                    field3924[var6] = (short) var4.method357(-129);
                }
                if ((var11 & 0x2) == 0) {
                    field3934[var6] = var12;
                } else {
                    field3934[var6] = (short) var4.method357(-129);
                }
                if ((var11 & 0x4) == 0) {
                    field3933[var6] = var12;
                } else {
                    field3933[var6] = (short) var4.method357(-129);
                }
                field3930[var6] = -1;
                if ((this.field3927.field3252[var9] == 2 || this.field3927.field3252[var9] == 3) && var7 > var8) {
                    field3930[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field3927.field3252[var9] == 5) {
                    this.field3925 = true;
                }
            }
        }
        if (arg0.length != var4.field1033) {
            throw new RuntimeException();
        }
        this.field3923 = var6;
        this.field3926 = new short[var6];
        this.field3931 = new short[var6];
        this.field3932 = new short[var6];
        this.field3928 = new short[var6];
        this.field3929 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field3926[var10] = field3922[var10];
            this.field3931[var10] = field3924[var10];
            this.field3932[var10] = field3934[var10];
            this.field3928[var10] = field3933[var10];
            this.field3929[var10] = field3930[var10];
        }
    }
}

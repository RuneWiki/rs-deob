import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class242 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public int field4230 = -1;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Z")
    public boolean field4236 = false;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "Lch;")
    public class6 field4242 = null;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[S")
    public short[] field4232;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "[S")
    public short[] field4238;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "[S")
    public short[] field4241;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "[S")
    public short[] field4233;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "[S")
    public short[] field4237;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "[S")
    private static short[] field4235 = new short[500];

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[S")
    private static short[] field4234 = new short[500];

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[S")
    private static short[] field4231 = new short[500];

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "[S")
    private static short[] field4240 = new short[500];

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "[S")
    private static short[] field4239 = new short[500];

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "()V")
    public static void method1584() {
        field4240 = null;
        field4239 = null;
        field4234 = null;
        field4235 = null;
        field4231 = null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([BLch;)V")
    public class242(byte[] arg0, class6 arg1) {
        this.field4242 = arg1;
        class85 var3 = new class85(arg0);
        class85 var4 = new class85(arg0);
        var3.field1392 = 2;
        int var5 = var3.method564((byte) 59);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1392 = var3.field1392 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field4242.field86[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method564((byte) 99);
            if (var11 > 0) {
                if (this.field4242.field86[var9] == 0) {
                    var8 = var9;
                }
                field4240[var6] = (short) var9;
                short var12 = 0;
                if (this.field4242.field86[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field4239[var6] = var12;
                } else {
                    field4239[var6] = (short) var4.method583(255);
                }
                if ((var11 & 0x2) == 0) {
                    field4234[var6] = var12;
                } else {
                    field4234[var6] = (short) var4.method583(255);
                }
                if ((var11 & 0x4) == 0) {
                    field4235[var6] = var12;
                } else {
                    field4235[var6] = (short) var4.method583(255);
                }
                if (this.field4242.field86[var9] == 2) {
                    field4239[var6] = (short) (((field4239[var6] & 0xFF) << 3) + (field4239[var6] >> 8 & 0x7));
                    field4234[var6] = (short) (((field4234[var6] & 0xFF) << 3) + (field4234[var6] >> 8 & 0x7));
                    field4235[var6] = (short) (((field4235[var6] & 0xFF) << 3) + (field4235[var6] >> 8 & 0x7));
                }
                field4231[var6] = -1;
                if (this.field4242.field86[var9] >= 1 && this.field4242.field86[var9] <= 3 && var7 > var8) {
                    field4231[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field4242.field86[var9] == 5) {
                    this.field4236 = true;
                }
            }
        }
        if (arg0.length != var4.field1392) {
            throw new RuntimeException();
        }
        this.field4230 = var6;
        this.field4232 = new short[var6];
        this.field4238 = new short[var6];
        this.field4241 = new short[var6];
        this.field4233 = new short[var6];
        this.field4237 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field4232[var10] = field4240[var10];
            this.field4238[var10] = field4239[var10];
            this.field4241[var10] = field4234[var10];
            this.field4233[var10] = field4235[var10];
            this.field4237[var10] = field4231[var10];
        }
    }
}

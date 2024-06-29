import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class260 {

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Z")
    public boolean field3823 = false;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "Lt;")
    public class339 field3834 = null;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "Z")
    public boolean field3831 = false;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public int field3835 = -1;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "[S")
    public short[] field3836;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "[S")
    public short[] field3830;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "[S")
    public short[] field3828;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "[S")
    public short[] field3821;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "[S")
    public short[] field3826;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "[B")
    public byte[] field3822;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "[S")
    private static short[] field3829 = new short[500];

    @OriginalMember(owner = "client!em", name = "g", descriptor = "[S")
    private static short[] field3827 = new short[500];

    @OriginalMember(owner = "client!em", name = "e", descriptor = "[B")
    private static byte[] field3825 = new byte[500];

    @OriginalMember(owner = "client!em", name = "d", descriptor = "[S")
    private static short[] field3824 = new short[500];

    @OriginalMember(owner = "client!em", name = "m", descriptor = "[S")
    private static short[] field3833 = new short[500];

    @OriginalMember(owner = "client!em", name = "l", descriptor = "[S")
    private static short[] field3832 = new short[500];

    @OriginalMember(owner = "client!em", name = "a", descriptor = "()V", line = 3)
    public static void method1786() {
        field3832 = null;
        field3833 = null;
        field3824 = null;
        field3829 = null;
        field3827 = null;
        field3825 = null;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "([BLt;)V", line = 60)
    public class260(byte[] arg0, class339 arg1) {
        this.field3834 = arg1;
        class316 var3 = new class316(arg0);
        class316 var4 = new class316(arg0);
        var3.field4777 = 2;
        int var5 = var3.method2219(16448);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field4777 = var3.field4777 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var10 = this.field3834.field5094[var9];
            if (var10 == 0) {
                var7 = var9;
            }
            int var11 = var3.method2219(16448);
            if (var11 > 0) {
                if (var10 == 0) {
                    var8 = var9;
                }
                field3832[var6] = (short) var9;
                short var12 = 0;
                if (var10 == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3833[var6] = var12;
                } else {
                    field3833[var6] = (short) var4.method2173(true);
                }
                if ((var11 & 0x2) == 0) {
                    field3824[var6] = var12;
                } else {
                    field3824[var6] = (short) var4.method2173(true);
                }
                if ((var11 & 0x4) == 0) {
                    field3829[var6] = var12;
                } else {
                    field3829[var6] = (short) var4.method2173(true);
                }
                field3825[var6] = (byte) (var11 >>> 3 & 0x3);
                if (var10 == 2) {
                    field3833[var6] = (short) (((field3833[var6] & 0xFF) << 3) + (field3833[var6] >> 8 & 0x7));
                    field3824[var6] = (short) (((field3824[var6] & 0xFF) << 3) + (field3824[var6] >> 8 & 0x7));
                    field3829[var6] = (short) (((field3829[var6] & 0xFF) << 3) + (field3829[var6] >> 8 & 0x7));
                }
                field3827[var6] = -1;
                if (var10 == 1 || var10 == 2 || var10 == 3) {
                    if (var7 > var8) {
                        field3827[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var10 == 5) {
                    this.field3823 = true;
                } else if (var10 == 7) {
                    this.field3831 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field4777) {
            throw new RuntimeException();
        }
        this.field3835 = var6;
        this.field3836 = new short[var6];
        this.field3830 = new short[var6];
        this.field3828 = new short[var6];
        this.field3821 = new short[var6];
        this.field3826 = new short[var6];
        this.field3822 = new byte[var6];
        for (int var13 = 0; var13 < var6; var13++) {
            this.field3836[var13] = field3832[var13];
            this.field3830[var13] = field3833[var13];
            this.field3828[var13] = field3824[var13];
            this.field3821[var13] = field3829[var13];
            this.field3826[var13] = field3827[var13];
            this.field3822[var13] = field3825[var13];
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class239 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Z")
    public boolean field3877 = false;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Ldm;")
    public class172 field3880 = null;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public int field3885 = -1;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "[S")
    public short[] field3886;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[S")
    public short[] field3878;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "[S")
    public short[] field3883;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[S")
    public short[] field3882;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "[S")
    public short[] field3888;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "[S")
    private static short[] field3881 = new short[500];

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[S")
    private static short[] field3884 = new short[500];

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[S")
    private static short[] field3879 = new short[500];

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "[S")
    private static short[] field3887 = new short[500];

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "[S")
    private static short[] field3889 = new short[500];

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "([BLdm;)V", line = 44)
    public class239(byte[] arg0, class172 arg1) {
        this.field3880 = arg1;
        class153 var3 = new class153(arg0);
        class153 var4 = new class153(arg0);
        var3.field2367 = 2;
        int var5 = var3.method1042((byte) -76);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2367 = var3.field2367 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3880.field2805[var9] == 0) {
                var7 = var9;
            }
            int var10 = var3.method1042((byte) 118);
            if (var10 > 0) {
                if (this.field3880.field2805[var9] == 0) {
                    var8 = var9;
                }
                field3889[var6] = (short) var9;
                short var11 = 0;
                if (this.field3880.field2805[var9] == 3) {
                    var11 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field3881[var6] = var11;
                } else {
                    field3881[var6] = (short) var4.method1065(0);
                }
                if ((var10 & 0x2) == 0) {
                    field3879[var6] = var11;
                } else {
                    field3879[var6] = (short) var4.method1065(0);
                }
                if ((var10 & 0x4) == 0) {
                    field3887[var6] = var11;
                } else {
                    field3887[var6] = (short) var4.method1065(0);
                }
                if (this.field3880.field2805[var9] == 2) {
                    field3881[var6] = (short) (((field3881[var6] & 0xFF) << 3) + (field3881[var6] >> 8 & 0x7));
                    field3879[var6] = (short) (((field3879[var6] & 0xFF) << 3) + (field3879[var6] >> 8 & 0x7));
                    field3887[var6] = (short) (((field3887[var6] & 0xFF) << 3) + (field3887[var6] >> 8 & 0x7));
                }
                field3884[var6] = -1;
                if (this.field3880.field2805[var9] >= 1 && this.field3880.field2805[var9] <= 3 && var7 > var8) {
                    field3884[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field3880.field2805[var9] == 5) {
                    this.field3877 = true;
                }
            }
        }
        if (arg0.length != var4.field2367) {
            throw new RuntimeException();
        }
        this.field3885 = var6;
        this.field3886 = new short[var6];
        this.field3878 = new short[var6];
        this.field3883 = new short[var6];
        this.field3882 = new short[var6];
        this.field3888 = new short[var6];
        for (int var12 = 0; var12 < var6; var12++) {
            this.field3886[var12] = field3889[var12];
            this.field3878[var12] = field3881[var12];
            this.field3883[var12] = field3879[var12];
            this.field3882[var12] = field3887[var12];
            this.field3888[var12] = field3884[var12];
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()V", line = 11)
    public static void method1620() {
        field3889 = null;
        field3881 = null;
        field3879 = null;
        field3887 = null;
        field3884 = null;
    }
}

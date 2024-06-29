import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class179 {

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lgg;")
    public class207 field3132 = null;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Z")
    public boolean field3131 = false;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public int field3135 = -1;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "[S")
    public short[] field3137;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "[S")
    public short[] field3125;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "[S")
    public short[] field3127;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "[S")
    public short[] field3136;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "[S")
    public short[] field3129;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "[S")
    private static short[] field3134 = new short[500];

    @OriginalMember(owner = "client!t", name = "d", descriptor = "[S")
    private static short[] field3128 = new short[500];

    @OriginalMember(owner = "client!t", name = "f", descriptor = "[S")
    private static short[] field3130 = new short[500];

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[S")
    private static short[] field3126 = new short[500];

    @OriginalMember(owner = "client!t", name = "i", descriptor = "[S")
    private static short[] field3133 = new short[500];

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public static void method1195() {
        field3130 = null;
        field3134 = null;
        field3133 = null;
        field3128 = null;
        field3126 = null;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "([BLgg;)V")
    public class179(byte[] arg0, class207 arg1) {
        this.field3132 = arg1;
        class249 var3 = new class249(arg0);
        class249 var4 = new class249(arg0);
        var3.field4335 = 2;
        int var5 = var3.method1677(-6677);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field4335 = var3.field4335 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3132.field3588[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method1677(-6677);
            if (var11 > 0) {
                if (this.field3132.field3588[var9] == 0) {
                    var8 = var9;
                }
                field3130[var6] = (short) var9;
                short var12 = 0;
                if (this.field3132.field3588[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field3134[var6] = var12;
                } else {
                    field3134[var6] = (short) var4.method1687(32767);
                }
                if ((var11 & 0x2) == 0) {
                    field3133[var6] = var12;
                } else {
                    field3133[var6] = (short) var4.method1687(32767);
                }
                if ((var11 & 0x4) == 0) {
                    field3128[var6] = var12;
                } else {
                    field3128[var6] = (short) var4.method1687(32767);
                }
                if (this.field3132.field3588[var9] == 2) {
                    field3134[var6] = (short) (((field3134[var6] & 0xFF) << 3) + (field3134[var6] >> 8 & 0x7));
                    field3133[var6] = (short) (((field3133[var6] & 0xFF) << 3) + (field3133[var6] >> 8 & 0x7));
                    field3128[var6] = (short) (((field3128[var6] & 0xFF) << 3) + (field3128[var6] >> 8 & 0x7));
                }
                field3126[var6] = -1;
                if (this.field3132.field3588[var9] >= 1 && this.field3132.field3588[var9] <= 3 && var7 > var8) {
                    field3126[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field3132.field3588[var9] == 5) {
                    this.field3131 = true;
                }
            }
        }
        if (arg0.length != var4.field4335) {
            throw new RuntimeException();
        }
        this.field3135 = var6;
        this.field3137 = new short[var6];
        this.field3125 = new short[var6];
        this.field3127 = new short[var6];
        this.field3136 = new short[var6];
        this.field3129 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field3137[var10] = field3130[var10];
            this.field3125[var10] = field3134[var10];
            this.field3127[var10] = field3133[var10];
            this.field3136[var10] = field3128[var10];
            this.field3129[var10] = field3126[var10];
        }
    }
}

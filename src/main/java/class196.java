import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class196 {

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Z")
    public boolean field3236 = false;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Lo;")
    public class88 field3238 = null;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public int field3246 = -1;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "[S")
    public short[] field3237;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "[S")
    public short[] field3241;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "[S")
    public short[] field3244;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "[S")
    public short[] field3242;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "[S")
    public short[] field3239;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "[S")
    private static short[] field3235 = new short[500];

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "[S")
    private static short[] field3234 = new short[500];

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "[S")
    private static short[] field3243 = new short[500];

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "[S")
    private static short[] field3240 = new short[500];

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "[S")
    private static short[] field3245 = new short[500];

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()V", line = 4)
    public static void method1421() {
        field3245 = null;
        field3235 = null;
        field3243 = null;
        field3234 = null;
        field3240 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([BLo;)V", line = 48)
    public class196(byte[] arg0, class88 arg1) {
        this.field3238 = arg1;
        class170 var3 = new class170(arg0);
        class170 var4 = new class170(arg0);
        var3.field2787 = 2;
        int var5 = var3.method1221(95);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2787 = var3.field2787 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3238.field1399[var9] == 0) {
                var7 = var9;
            }
            int var10 = var3.method1221(108);
            if (var10 > 0) {
                if (this.field3238.field1399[var9] == 0) {
                    var8 = var9;
                }
                field3245[var6] = (short) var9;
                short var11 = 0;
                if (this.field3238.field1399[var9] == 3) {
                    var11 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field3235[var6] = var11;
                } else {
                    field3235[var6] = (short) var4.method1232((byte) -108);
                }
                if ((var10 & 0x2) == 0) {
                    field3243[var6] = var11;
                } else {
                    field3243[var6] = (short) var4.method1232((byte) 102);
                }
                if ((var10 & 0x4) == 0) {
                    field3234[var6] = var11;
                } else {
                    field3234[var6] = (short) var4.method1232((byte) -114);
                }
                if (this.field3238.field1399[var9] == 2) {
                    field3235[var6] = (short) (((field3235[var6] & 0xFF) << 3) + (field3235[var6] >> 8 & 0x7));
                    field3243[var6] = (short) (((field3243[var6] & 0xFF) << 3) + (field3243[var6] >> 8 & 0x7));
                    field3234[var6] = (short) (((field3234[var6] & 0xFF) << 3) + (field3234[var6] >> 8 & 0x7));
                }
                field3240[var6] = -1;
                if (this.field3238.field1399[var9] >= 1 && this.field3238.field1399[var9] <= 3 && var7 > var8) {
                    field3240[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field3238.field1399[var9] == 5) {
                    this.field3236 = true;
                }
            }
        }
        if (arg0.length != var4.field2787) {
            throw new RuntimeException();
        }
        this.field3246 = var6;
        this.field3237 = new short[var6];
        this.field3241 = new short[var6];
        this.field3244 = new short[var6];
        this.field3242 = new short[var6];
        this.field3239 = new short[var6];
        for (int var12 = 0; var12 < var6; var12++) {
            this.field3237[var12] = field3245[var12];
            this.field3241[var12] = field3235[var12];
            this.field3244[var12] = field3243[var12];
            this.field3242[var12] = field3234[var12];
            this.field3239[var12] = field3240[var12];
        }
    }
}

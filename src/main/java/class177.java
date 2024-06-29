import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class177 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Z")
    public boolean field3225 = false;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public int field3230 = -1;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lj;")
    public class243 field3236 = null;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "[S")
    public short[] field3229;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[S")
    public short[] field3227;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "[S")
    public short[] field3234;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "[S")
    public short[] field3237;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "[S")
    public short[] field3231;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[S")
    private static short[] field3228 = new short[500];

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "[S")
    private static short[] field3232 = new short[500];

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "[S")
    private static short[] field3233 = new short[500];

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "[S")
    private static short[] field3235 = new short[500];

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[S")
    private static short[] field3226 = new short[500];

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V")
    public static void method1250() {
        field3226 = null;
        field3228 = null;
        field3235 = null;
        field3232 = null;
        field3233 = null;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([BLj;)V")
    public class177(byte[] arg0, class243 arg1) {
        this.field3236 = arg1;
        class118 var3 = new class118(arg0);
        class118 var4 = new class118(arg0);
        var3.field2155 = 2;
        int var5 = var3.method867(false);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2155 = var3.field2155 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field3236.field4340[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method867(false);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field3226[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field3228[var6] = var13;
                } else {
                    field3228[var6] = (short) var4.method824((byte) 61);
                }
                if ((var12 & 0x2) == 0) {
                    field3235[var6] = var13;
                } else {
                    field3235[var6] = (short) var4.method824((byte) 57);
                }
                if ((var12 & 0x4) == 0) {
                    field3232[var6] = var13;
                } else {
                    field3232[var6] = (short) var4.method824((byte) 17);
                }
                if (var11 == 2) {
                    field3228[var6] = (short) (((field3228[var6] & 0xFF) << 3) + (field3228[var6] >> 8 & 0x7));
                    field3235[var6] = (short) (((field3235[var6] & 0xFF) << 3) + (field3235[var6] >> 8 & 0x7));
                    field3232[var6] = (short) (((field3232[var6] & 0xFF) << 3) + (field3232[var6] >> 8 & 0x7));
                }
                field3233[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field3233[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field3225 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field2155) {
            throw new RuntimeException();
        }
        this.field3230 = var6;
        this.field3229 = new short[var6];
        this.field3227 = new short[var6];
        this.field3234 = new short[var6];
        this.field3237 = new short[var6];
        this.field3231 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field3229[var10] = field3226[var10];
            this.field3227[var10] = field3228[var10];
            this.field3234[var10] = field3235[var10];
            this.field3237[var10] = field3232[var10];
            this.field3231[var10] = field3233[var10];
        }
    }
}

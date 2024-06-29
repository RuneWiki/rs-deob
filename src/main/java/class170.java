import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class170 {

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Lph;")
    public class72 field2956 = null;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Z")
    public boolean field2959 = false;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public int field2957 = -1;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "[S")
    public short[] field2954;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "[S")
    public short[] field2951;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "[S")
    public short[] field2958;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "[S")
    public short[] field2953;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "[S")
    public short[] field2955;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "[S")
    private static short[] field2949 = new short[500];

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "[S")
    private static short[] field2950 = new short[500];

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[S")
    private static short[] field2952 = new short[500];

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "[S")
    private static short[] field2960 = new short[500];

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "[S")
    private static short[] field2961 = new short[500];

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "()V", line = 8)
    public static void method1205() {
        field2960 = null;
        field2950 = null;
        field2952 = null;
        field2961 = null;
        field2949 = null;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "([BLph;)V", line = 48)
    public class170(byte[] arg0, class72 arg1) {
        this.field2956 = arg1;
        class13 var3 = new class13(arg0);
        class13 var4 = new class13(arg0);
        var3.field281 = 2;
        int var5 = var3.method152((byte) -74);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field281 = var3.field281 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2956.field1384[var9] == 0) {
                var7 = var9;
            }
            int var10 = var3.method152((byte) -104);
            if (var10 > 0) {
                if (this.field2956.field1384[var9] == 0) {
                    var8 = var9;
                }
                field2960[var6] = (short) var9;
                short var11 = 0;
                if (this.field2956.field1384[var9] == 3) {
                    var11 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field2950[var6] = var11;
                } else {
                    field2950[var6] = (short) var4.method134(5525);
                }
                if ((var10 & 0x2) == 0) {
                    field2952[var6] = var11;
                } else {
                    field2952[var6] = (short) var4.method134(5525);
                }
                if ((var10 & 0x4) == 0) {
                    field2961[var6] = var11;
                } else {
                    field2961[var6] = (short) var4.method134(5525);
                }
                if (this.field2956.field1384[var9] == 2) {
                    field2950[var6] = (short) (((field2950[var6] & 0xFF) << 3) + (field2950[var6] >> 8 & 0x7));
                    field2952[var6] = (short) (((field2952[var6] & 0xFF) << 3) + (field2952[var6] >> 8 & 0x7));
                    field2961[var6] = (short) (((field2961[var6] & 0xFF) << 3) + (field2961[var6] >> 8 & 0x7));
                }
                field2949[var6] = -1;
                if (this.field2956.field1384[var9] >= 1 && this.field2956.field1384[var9] <= 3 && var7 > var8) {
                    field2949[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field2956.field1384[var9] == 5) {
                    this.field2959 = true;
                }
            }
        }
        if (arg0.length != var4.field281) {
            throw new RuntimeException();
        }
        this.field2957 = var6;
        this.field2954 = new short[var6];
        this.field2951 = new short[var6];
        this.field2958 = new short[var6];
        this.field2953 = new short[var6];
        this.field2955 = new short[var6];
        for (int var12 = 0; var12 < var6; var12++) {
            this.field2954[var12] = field2960[var12];
            this.field2951[var12] = field2950[var12];
            this.field2958[var12] = field2952[var12];
            this.field2953[var12] = field2961[var12];
            this.field2955[var12] = field2949[var12];
        }
    }
}

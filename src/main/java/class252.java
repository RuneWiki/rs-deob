import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class252 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Z")
    public boolean field4030 = false;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Z")
    public boolean field4035 = false;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Lig;")
    public class160 field4041 = null;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public int field4044 = -1;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "[S")
    public short[] field4040;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "[S")
    public short[] field4043;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "[S")
    public short[] field4042;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "[S")
    public short[] field4038;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "[S")
    public short[] field4045;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "[B")
    public byte[] field4037;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[S")
    private static short[] field4034 = new short[500];

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "[S")
    private static short[] field4036 = new short[500];

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "[S")
    private static short[] field4033 = new short[500];

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "[S")
    private static short[] field4031 = new short[500];

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "[S")
    private static short[] field4039 = new short[500];

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[B")
    private static byte[] field4032 = new byte[500];

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
    public static void method1655() {
        field4036 = null;
        field4034 = null;
        field4031 = null;
        field4033 = null;
        field4039 = null;
        field4032 = null;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "([BLig;)V")
    public class252(byte[] arg0, class160 arg1) {
        this.field4041 = arg1;
        class264 var3 = new class264(arg0);
        class264 var4 = new class264(arg0);
        var3.field4195 = 2;
        int var5 = var3.method1779(-107);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field4195 = var3.field4195 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field4041.field2601[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1779(-69);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field4036[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field4034[var6] = var13;
                } else {
                    field4034[var6] = (short) var4.method1783((byte) 69);
                }
                if ((var12 & 0x2) == 0) {
                    field4031[var6] = var13;
                } else {
                    field4031[var6] = (short) var4.method1783((byte) 69);
                }
                if ((var12 & 0x4) == 0) {
                    field4033[var6] = var13;
                } else {
                    field4033[var6] = (short) var4.method1783((byte) 69);
                }
                field4032[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field4034[var6] = (short) (((field4034[var6] & 0xFF) << 3) + (field4034[var6] >> 8 & 0x7));
                    field4031[var6] = (short) (((field4031[var6] & 0xFF) << 3) + (field4031[var6] >> 8 & 0x7));
                    field4033[var6] = (short) (((field4033[var6] & 0xFF) << 3) + (field4033[var6] >> 8 & 0x7));
                }
                field4039[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field4039[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field4035 = true;
                } else if (var11 == 7) {
                    this.field4030 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field4195) {
            throw new RuntimeException();
        }
        this.field4044 = var6;
        this.field4040 = new short[var6];
        this.field4043 = new short[var6];
        this.field4042 = new short[var6];
        this.field4038 = new short[var6];
        this.field4045 = new short[var6];
        this.field4037 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field4040[var10] = field4036[var10];
            this.field4043[var10] = field4034[var10];
            this.field4042[var10] = field4031[var10];
            this.field4038[var10] = field4033[var10];
            this.field4045[var10] = field4039[var10];
            this.field4037[var10] = field4032[var10];
        }
    }
}

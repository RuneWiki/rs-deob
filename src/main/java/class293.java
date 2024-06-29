import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class293 {

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public int field5031 = -1;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Z")
    public boolean field5034 = false;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Llf;")
    public class116 field5030 = null;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "[S")
    public short[] field5028;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "[S")
    public short[] field5032;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "[S")
    public short[] field5027;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "[S")
    public short[] field5036;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[S")
    public short[] field5029;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "[S")
    private static short[] field5035 = new short[500];

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[S")
    private static short[] field5033 = new short[500];

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "[S")
    private static short[] field5026 = new short[500];

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "[S")
    private static short[] field5038 = new short[500];

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "[S")
    private static short[] field5037 = new short[500];

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "()V", line = 5)
    public static void method2040() {
        field5026 = null;
        field5038 = null;
        field5035 = null;
        field5037 = null;
        field5033 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([BLlf;)V", line = 42)
    public class293(byte[] arg0, class116 arg1) {
        this.field5030 = arg1;
        class60 var3 = new class60(arg0);
        class60 var4 = new class60(arg0);
        var3.field1012 = 2;
        int var5 = var3.method501(0);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1012 = var3.field1012 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field5030.field1956[var9] == 0) {
                var7 = var9;
            }
            int var10 = var3.method501(0);
            if (var10 > 0) {
                if (this.field5030.field1956[var9] == 0) {
                    var8 = var9;
                }
                field5026[var6] = (short) var9;
                short var11 = 0;
                if (this.field5030.field1956[var9] == 3) {
                    var11 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field5038[var6] = var11;
                } else {
                    field5038[var6] = (short) var4.method531(true);
                }
                if ((var10 & 0x2) == 0) {
                    field5035[var6] = var11;
                } else {
                    field5035[var6] = (short) var4.method531(true);
                }
                if ((var10 & 0x4) == 0) {
                    field5037[var6] = var11;
                } else {
                    field5037[var6] = (short) var4.method531(true);
                }
                if (this.field5030.field1956[var9] == 2) {
                    field5038[var6] = (short) (((field5038[var6] & 0xFF) << 3) + (field5038[var6] >> 8 & 0x7));
                    field5035[var6] = (short) (((field5035[var6] & 0xFF) << 3) + (field5035[var6] >> 8 & 0x7));
                    field5037[var6] = (short) (((field5037[var6] & 0xFF) << 3) + (field5037[var6] >> 8 & 0x7));
                }
                field5033[var6] = -1;
                if (this.field5030.field1956[var9] >= 1 && this.field5030.field1956[var9] <= 3 && var7 > var8) {
                    field5033[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field5030.field1956[var9] == 5) {
                    this.field5034 = true;
                }
            }
        }
        if (arg0.length != var4.field1012) {
            throw new RuntimeException();
        }
        this.field5031 = var6;
        this.field5028 = new short[var6];
        this.field5032 = new short[var6];
        this.field5027 = new short[var6];
        this.field5036 = new short[var6];
        this.field5029 = new short[var6];
        for (int var12 = 0; var12 < var6; var12++) {
            this.field5028[var12] = field5026[var12];
            this.field5032[var12] = field5038[var12];
            this.field5027[var12] = field5035[var12];
            this.field5036[var12] = field5037[var12];
            this.field5029[var12] = field5033[var12];
        }
    }
}

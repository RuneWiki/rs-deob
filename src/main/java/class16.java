import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class16 {

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public int field226 = -1;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "Lvi;")
    public class204 field230 = null;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Z")
    public boolean field233 = false;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[S")
    public short[] field227;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[S")
    public short[] field223;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[S")
    public short[] field222;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "[S")
    public short[] field225;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "[S")
    public short[] field231;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "[S")
    private static short[] field228 = new short[500];

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "[S")
    private static short[] field232 = new short[500];

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[S")
    private static short[] field224 = new short[500];

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "[S")
    private static short[] field234 = new short[500];

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[S")
    private static short[] field229 = new short[500];

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()V")
    public static void method117() {
        field224 = null;
        field234 = null;
        field229 = null;
        field232 = null;
        field228 = null;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "([BLvi;)V")
    public class16(byte[] arg0, class204 arg1) {
        this.field230 = arg1;
        class187 var3 = new class187(arg0);
        class187 var4 = new class187(arg0);
        var3.field3169 = 2;
        int var5 = var3.method1268(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3169 = var3.field3169 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field230.field3481[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1268(255);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field224[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field234[var6] = var13;
                } else {
                    field234[var6] = (short) var4.method1249((byte) -100);
                }
                if ((var12 & 0x2) == 0) {
                    field229[var6] = var13;
                } else {
                    field229[var6] = (short) var4.method1249((byte) -100);
                }
                if ((var12 & 0x4) == 0) {
                    field232[var6] = var13;
                } else {
                    field232[var6] = (short) var4.method1249((byte) -100);
                }
                if (var11 == 2) {
                    field234[var6] = (short) (((field234[var6] & 0xFF) << 3) + (field234[var6] >> 8 & 0x7));
                    field229[var6] = (short) (((field229[var6] & 0xFF) << 3) + (field229[var6] >> 8 & 0x7));
                    field232[var6] = (short) (((field232[var6] & 0xFF) << 3) + (field232[var6] >> 8 & 0x7));
                }
                field228[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field228[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field233 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field3169) {
            throw new RuntimeException();
        }
        this.field226 = var6;
        this.field227 = new short[var6];
        this.field223 = new short[var6];
        this.field222 = new short[var6];
        this.field225 = new short[var6];
        this.field231 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field227[var10] = field224[var10];
            this.field223[var10] = field234[var10];
            this.field222[var10] = field229[var10];
            this.field225[var10] = field232[var10];
            this.field231[var10] = field228[var10];
        }
    }
}

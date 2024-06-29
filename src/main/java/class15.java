import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 {

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Z")
    public boolean field225 = false;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public int field221 = -1;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Lmd;")
    public class204 field222 = null;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "[S")
    public short[] field231;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "[S")
    public short[] field228;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "[S")
    public short[] field220;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "[S")
    public short[] field227;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "[S")
    public short[] field232;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "[S")
    private static short[] field224 = new short[500];

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[S")
    private static short[] field223 = new short[500];

    @OriginalMember(owner = "client!we", name = "j", descriptor = "[S")
    private static short[] field229 = new short[500];

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[S")
    private static short[] field230 = new short[500];

    @OriginalMember(owner = "client!we", name = "g", descriptor = "[S")
    private static short[] field226 = new short[500];

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V")
    public static void method80() {
        field224 = null;
        field229 = null;
        field223 = null;
        field226 = null;
        field230 = null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "([BLmd;)V")
    public class15(byte[] arg0, class204 arg1) {
        this.field222 = arg1;
        class121 var3 = new class121(arg0);
        class121 var4 = new class121(arg0);
        var3.field2026 = 2;
        int var5 = var3.method897(-106);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2026 = var3.field2026 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field222.field3404[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method897(116);
            if (var11 > 0) {
                if (this.field222.field3404[var9] == 0) {
                    var8 = var9;
                }
                field224[var6] = (short) var9;
                short var12 = 0;
                if (this.field222.field3404[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field229[var6] = var12;
                } else {
                    field229[var6] = (short) var4.method902((byte) 108);
                }
                if ((var11 & 0x2) == 0) {
                    field223[var6] = var12;
                } else {
                    field223[var6] = (short) var4.method902((byte) 69);
                }
                if ((var11 & 0x4) == 0) {
                    field226[var6] = var12;
                } else {
                    field226[var6] = (short) var4.method902((byte) 32);
                }
                if (this.field222.field3404[var9] == 2) {
                    field229[var6] = (short) (((field229[var6] & 0xFF) << 3) + (field229[var6] >> 8 & 0x7));
                    field223[var6] = (short) (((field223[var6] & 0xFF) << 3) + (field223[var6] >> 8 & 0x7));
                    field226[var6] = (short) (((field226[var6] & 0xFF) << 3) + (field226[var6] >> 8 & 0x7));
                }
                field230[var6] = -1;
                if (this.field222.field3404[var9] >= 1 && this.field222.field3404[var9] <= 3 && var7 > var8) {
                    field230[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field222.field3404[var9] == 5) {
                    this.field225 = true;
                }
            }
        }
        if (arg0.length != var4.field2026) {
            throw new RuntimeException();
        }
        this.field221 = var6;
        this.field231 = new short[var6];
        this.field228 = new short[var6];
        this.field220 = new short[var6];
        this.field227 = new short[var6];
        this.field232 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field231[var10] = field224[var10];
            this.field228[var10] = field229[var10];
            this.field220[var10] = field223[var10];
            this.field227[var10] = field226[var10];
            this.field232[var10] = field230[var10];
        }
    }
}

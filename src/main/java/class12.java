import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class12 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public int field221 = -1;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lnb;")
    public class143 field226 = null;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Z")
    public boolean field230 = false;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "[S")
    public short[] field227;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "[S")
    public short[] field224;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "[S")
    public short[] field229;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "[S")
    public short[] field225;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "[S")
    public short[] field220;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[S")
    private static short[] field222 = new short[500];

    @OriginalMember(owner = "client!b", name = "d", descriptor = "[S")
    private static short[] field223 = new short[500];

    @OriginalMember(owner = "client!b", name = "i", descriptor = "[S")
    private static short[] field228 = new short[500];

    @OriginalMember(owner = "client!b", name = "m", descriptor = "[S")
    private static short[] field232 = new short[500];

    @OriginalMember(owner = "client!b", name = "l", descriptor = "[S")
    private static short[] field231 = new short[500];

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
    public static void method111() {
        field223 = null;
        field228 = null;
        field222 = null;
        field231 = null;
        field232 = null;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "([BLnb;)V")
    public class12(byte[] arg0, class143 arg1) {
        this.field226 = arg1;
        class66 var3 = new class66(arg0);
        class66 var4 = new class66(arg0);
        var3.field1195 = 2;
        int var5 = var3.method506(255);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field1195 = var3.field1195 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field226.field2539[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method506(255);
            if (var11 > 0) {
                if (this.field226.field2539[var9] == 0) {
                    var8 = var9;
                }
                field223[var6] = (short) var9;
                short var12 = 0;
                if (this.field226.field2539[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field228[var6] = var12;
                } else {
                    field228[var6] = (short) var4.method494((byte) 73);
                }
                if ((var11 & 0x2) == 0) {
                    field222[var6] = var12;
                } else {
                    field222[var6] = (short) var4.method494((byte) 89);
                }
                if ((var11 & 0x4) == 0) {
                    field231[var6] = var12;
                } else {
                    field231[var6] = (short) var4.method494((byte) 37);
                }
                if (this.field226.field2539[var9] == 2) {
                    field228[var6] = (short) (((field228[var6] & 0xFF) << 3) + (field228[var6] >> 8 & 0x7));
                    field222[var6] = (short) (((field222[var6] & 0xFF) << 3) + (field222[var6] >> 8 & 0x7));
                    field231[var6] = (short) (((field231[var6] & 0xFF) << 3) + (field231[var6] >> 8 & 0x7));
                }
                field232[var6] = -1;
                if (this.field226.field2539[var9] >= 1 && this.field226.field2539[var9] <= 3 && var7 > var8) {
                    field232[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field226.field2539[var9] == 5) {
                    this.field230 = true;
                }
            }
        }
        if (arg0.length != var4.field1195) {
            throw new RuntimeException();
        }
        this.field221 = var6;
        this.field227 = new short[var6];
        this.field224 = new short[var6];
        this.field229 = new short[var6];
        this.field225 = new short[var6];
        this.field220 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field227[var10] = field223[var10];
            this.field224[var10] = field228[var10];
            this.field229[var10] = field222[var10];
            this.field225[var10] = field231[var10];
            this.field220[var10] = field232[var10];
        }
    }
}

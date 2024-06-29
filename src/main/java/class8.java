import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class8 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public int field70 = -1;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Lfk;")
    public class52 field73 = null;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "Z")
    public boolean field84 = false;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "Z")
    public boolean field85 = false;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "[S")
    public short[] field83;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "[S")
    public short[] field76;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "[S")
    public short[] field72;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "[S")
    public short[] field74;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "[S")
    public short[] field79;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "[B")
    public byte[] field82;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "[S")
    private static short[] field71 = new short[500];

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "[S")
    private static short[] field77 = new short[500];

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "[S")
    private static short[] field75 = new short[500];

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "[S")
    private static short[] field78 = new short[500];

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "[B")
    private static byte[] field81 = new byte[500];

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "[S")
    private static short[] field80 = new short[500];

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "()V")
    public static void method41() {
        field80 = null;
        field75 = null;
        field71 = null;
        field78 = null;
        field77 = null;
        field81 = null;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "([BLfk;)V")
    public class8(byte[] arg0, class52 arg1) {
        this.field73 = arg1;
        class162 var3 = new class162(arg0);
        class162 var4 = new class162(arg0);
        var3.field2568 = 2;
        int var5 = var3.method1133((byte) 53);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field2568 = var3.field2568 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = this.field73.field863[var9];
            if (var11 == 0) {
                var7 = var9;
            }
            int var12 = var3.method1133((byte) 53);
            if (var12 > 0) {
                if (var11 == 0) {
                    var8 = var9;
                }
                field80[var6] = (short) var9;
                short var13 = 0;
                if (var11 == 3) {
                    var13 = 128;
                }
                if ((var12 & 0x1) == 0) {
                    field75[var6] = var13;
                } else {
                    field75[var6] = (short) var4.method1162(false);
                }
                if ((var12 & 0x2) == 0) {
                    field71[var6] = var13;
                } else {
                    field71[var6] = (short) var4.method1162(false);
                }
                if ((var12 & 0x4) == 0) {
                    field78[var6] = var13;
                } else {
                    field78[var6] = (short) var4.method1162(false);
                }
                field81[var6] = (byte) (var12 >>> 3 & 0x3);
                if (var11 == 2) {
                    field75[var6] = (short) (((field75[var6] & 0xFF) << 3) + (field75[var6] >> 8 & 0x7));
                    field71[var6] = (short) (((field71[var6] & 0xFF) << 3) + (field71[var6] >> 8 & 0x7));
                    field78[var6] = (short) (((field78[var6] & 0xFF) << 3) + (field78[var6] >> 8 & 0x7));
                }
                field77[var6] = -1;
                if (var11 == 1 || var11 == 2 || var11 == 3) {
                    if (var7 > var8) {
                        field77[var6] = (short) var7;
                        var8 = var7;
                    }
                } else if (var11 == 5) {
                    this.field85 = true;
                } else if (var11 == 7) {
                    this.field84 = true;
                }
                var6++;
            }
        }
        if (arg0.length != var4.field2568) {
            throw new RuntimeException();
        }
        this.field70 = var6;
        this.field83 = new short[var6];
        this.field76 = new short[var6];
        this.field72 = new short[var6];
        this.field74 = new short[var6];
        this.field79 = new short[var6];
        this.field82 = new byte[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field83[var10] = field80[var10];
            this.field76[var10] = field75[var10];
            this.field72[var10] = field71[var10];
            this.field74[var10] = field78[var10];
            this.field79[var10] = field77[var10];
            this.field82[var10] = field81[var10];
        }
    }
}

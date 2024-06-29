import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class164 {

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Z")
    public boolean field2903 = false;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public int field2899 = -1;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Ln;")
    public class7 field2907 = null;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "[S")
    public short[] field2905;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "[S")
    public short[] field2908;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "[S")
    public short[] field2902;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "[S")
    public short[] field2898;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "[S")
    public short[] field2901;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "[S")
    private static short[] field2906 = new short[500];

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "[S")
    private static short[] field2900 = new short[500];

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "[S")
    private static short[] field2904 = new short[500];

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "[S")
    private static short[] field2909 = new short[500];

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "[S")
    private static short[] field2910 = new short[500];

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
    public static void method1185() {
        field2904 = null;
        field2910 = null;
        field2906 = null;
        field2909 = null;
        field2900 = null;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([BLn;)V")
    public class164(byte[] arg0, class7 arg1) {
        this.field2907 = arg1;
        class239 var3 = new class239(arg0);
        class239 var4 = new class239(arg0);
        var3.field4124 = 2;
        int var5 = var3.method1651(4139);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field4124 = var3.field4124 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2907.field134[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method1651(4139);
            if (var11 > 0) {
                if (this.field2907.field134[var9] == 0) {
                    var8 = var9;
                }
                field2904[var6] = (short) var9;
                short var12 = 0;
                if (this.field2907.field134[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2910[var6] = var12;
                } else {
                    field2910[var6] = (short) var4.method1640(-49152);
                }
                if ((var11 & 0x2) == 0) {
                    field2906[var6] = var12;
                } else {
                    field2906[var6] = (short) var4.method1640(-49152);
                }
                if ((var11 & 0x4) == 0) {
                    field2909[var6] = var12;
                } else {
                    field2909[var6] = (short) var4.method1640(-49152);
                }
                if (this.field2907.field134[var9] == 2) {
                    field2910[var6] = (short) (((field2910[var6] & 0xFF) << 3) + (field2910[var6] >> 8 & 0x7));
                    field2906[var6] = (short) (((field2906[var6] & 0xFF) << 3) + (field2906[var6] >> 8 & 0x7));
                    field2909[var6] = (short) (((field2909[var6] & 0xFF) << 3) + (field2909[var6] >> 8 & 0x7));
                }
                field2900[var6] = -1;
                if (this.field2907.field134[var9] >= 1 && this.field2907.field134[var9] <= 3 && var7 > var8) {
                    field2900[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field2907.field134[var9] == 5) {
                    this.field2903 = true;
                }
            }
        }
        if (arg0.length != var4.field4124) {
            throw new RuntimeException();
        }
        this.field2899 = var6;
        this.field2905 = new short[var6];
        this.field2908 = new short[var6];
        this.field2902 = new short[var6];
        this.field2898 = new short[var6];
        this.field2901 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2905[var10] = field2904[var10];
            this.field2908[var10] = field2910[var10];
            this.field2902[var10] = field2906[var10];
            this.field2898[var10] = field2909[var10];
            this.field2901[var10] = field2900[var10];
        }
    }
}

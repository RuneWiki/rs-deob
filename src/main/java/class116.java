import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class116 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public int field2032 = -1;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lg;")
    public class264 field2037 = null;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Z")
    public boolean field2044 = false;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "[S")
    public short[] field2041;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "[S")
    public short[] field2036;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "[S")
    public short[] field2034;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "[S")
    public short[] field2038;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "[S")
    public short[] field2042;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "[S")
    private static short[] field2035 = new short[500];

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "[S")
    private static short[] field2039 = new short[500];

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "[S")
    private static short[] field2033 = new short[500];

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "[S")
    private static short[] field2040 = new short[500];

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "[S")
    private static short[] field2043 = new short[500];

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()V")
    public static void method849() {
        field2043 = null;
        field2035 = null;
        field2040 = null;
        field2039 = null;
        field2033 = null;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "([BLg;)V")
    public class116(byte[] arg0, class264 arg1) {
        this.field2037 = arg1;
        class32 var3 = new class32(arg0);
        class32 var4 = new class32(arg0);
        var3.field647 = 2;
        int var5 = var3.method316((byte) 104);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field647 = var3.field647 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2037.field4510[var9] == 0) {
                var7 = var9;
            }
            int var11 = var3.method316((byte) -54);
            if (var11 > 0) {
                if (this.field2037.field4510[var9] == 0) {
                    var8 = var9;
                }
                field2043[var6] = (short) var9;
                short var12 = 0;
                if (this.field2037.field4510[var9] == 3) {
                    var12 = 128;
                }
                if ((var11 & 0x1) == 0) {
                    field2035[var6] = var12;
                } else {
                    field2035[var6] = (short) var4.method323(80);
                }
                if ((var11 & 0x2) == 0) {
                    field2040[var6] = var12;
                } else {
                    field2040[var6] = (short) var4.method323(30);
                }
                if ((var11 & 0x4) == 0) {
                    field2039[var6] = var12;
                } else {
                    field2039[var6] = (short) var4.method323(119);
                }
                if (this.field2037.field4510[var9] == 2) {
                    field2035[var6] = (short) (((field2035[var6] & 0xFF) << 3) + (field2035[var6] >> 8 & 0x7));
                    field2040[var6] = (short) (((field2040[var6] & 0xFF) << 3) + (field2040[var6] >> 8 & 0x7));
                    field2039[var6] = (short) (((field2039[var6] & 0xFF) << 3) + (field2039[var6] >> 8 & 0x7));
                }
                field2033[var6] = -1;
                if (this.field2037.field4510[var9] >= 1 && this.field2037.field4510[var9] <= 3 && var7 > var8) {
                    field2033[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field2037.field4510[var9] == 5) {
                    this.field2044 = true;
                }
            }
        }
        if (arg0.length != var4.field647) {
            throw new RuntimeException();
        }
        this.field2032 = var6;
        this.field2041 = new short[var6];
        this.field2036 = new short[var6];
        this.field2034 = new short[var6];
        this.field2038 = new short[var6];
        this.field2042 = new short[var6];
        for (int var10 = 0; var10 < var6; var10++) {
            this.field2041[var10] = field2043[var10];
            this.field2036[var10] = field2035[var10];
            this.field2034[var10] = field2040[var10];
            this.field2038[var10] = field2039[var10];
            this.field2042[var10] = field2033[var10];
        }
    }
}

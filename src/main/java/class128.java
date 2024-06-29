import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class128 {

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lo;")
    public class14 field1921 = null;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public int field1923 = -1;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Z")
    public boolean field1916 = false;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "[S")
    public short[] field1928;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[S")
    public short[] field1918;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "[S")
    public short[] field1926;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "[S")
    public short[] field1919;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "[S")
    public short[] field1920;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "[S")
    private static short[] field1917 = new short[500];

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "[S")
    private static short[] field1924 = new short[500];

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "[S")
    private static short[] field1925 = new short[500];

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "[S")
    private static short[] field1922 = new short[500];

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "[S")
    private static short[] field1927 = new short[500];

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([BLo;)V", line = 45)
    public class128(byte[] arg0, class14 arg1) {
        this.field1921 = arg1;
        class221 var3 = new class221(arg0);
        class221 var4 = new class221(arg0);
        var3.field3610 = 2;
        int var5 = var3.method1509(true);
        int var6 = 0;
        int var7 = -1;
        int var8 = -1;
        var4.field3610 = var3.field3610 + var5;
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1921.field270[var9] == 0) {
                var7 = var9;
            }
            int var10 = var3.method1509(true);
            if (var10 > 0) {
                if (this.field1921.field270[var9] == 0) {
                    var8 = var9;
                }
                field1917[var6] = (short) var9;
                short var11 = 0;
                if (this.field1921.field270[var9] == 3) {
                    var11 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1927[var6] = var11;
                } else {
                    field1927[var6] = (short) var4.method1529(-1);
                }
                if ((var10 & 0x2) == 0) {
                    field1925[var6] = var11;
                } else {
                    field1925[var6] = (short) var4.method1529(-1);
                }
                if ((var10 & 0x4) == 0) {
                    field1924[var6] = var11;
                } else {
                    field1924[var6] = (short) var4.method1529(-1);
                }
                if (this.field1921.field270[var9] == 2) {
                    field1927[var6] = (short) (((field1927[var6] & 0xFF) << 3) + (field1927[var6] >> 8 & 0x7));
                    field1925[var6] = (short) (((field1925[var6] & 0xFF) << 3) + (field1925[var6] >> 8 & 0x7));
                    field1924[var6] = (short) (((field1924[var6] & 0xFF) << 3) + (field1924[var6] >> 8 & 0x7));
                }
                field1922[var6] = -1;
                if (this.field1921.field270[var9] >= 1 && this.field1921.field270[var9] <= 3 && var7 > var8) {
                    field1922[var6] = (short) var7;
                    var8 = var7;
                }
                var6++;
                if (this.field1921.field270[var9] == 5) {
                    this.field1916 = true;
                }
            }
        }
        if (arg0.length != var4.field3610) {
            throw new RuntimeException();
        }
        this.field1923 = var6;
        this.field1928 = new short[var6];
        this.field1918 = new short[var6];
        this.field1926 = new short[var6];
        this.field1919 = new short[var6];
        this.field1920 = new short[var6];
        for (int var12 = 0; var12 < var6; var12++) {
            this.field1928[var12] = field1917[var12];
            this.field1918[var12] = field1927[var12];
            this.field1926[var12] = field1925[var12];
            this.field1919[var12] = field1924[var12];
            this.field1920[var12] = field1922[var12];
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()V", line = 23)
    public static void method855() {
        field1917 = null;
        field1927 = null;
        field1925 = null;
        field1924 = null;
        field1922 = null;
    }
}

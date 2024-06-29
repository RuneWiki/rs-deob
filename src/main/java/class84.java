import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class84 {

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public int field1891 = -1;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Z")
    public boolean field1892 = false;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lhd;")
    public class46 field1884 = null;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
    public int[] field1888;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "[I")
    public int[] field1889;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "[I")
    public int[] field1893;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
    public int[] field1883;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "[I")
    private static int[] field1885 = new int[500];

    @OriginalMember(owner = "client!o", name = "h", descriptor = "[I")
    private static int[] field1890 = new int[500];

    @OriginalMember(owner = "client!o", name = "d", descriptor = "[I")
    private static int[] field1886 = new int[500];

    @OriginalMember(owner = "client!o", name = "e", descriptor = "[I")
    private static int[] field1887 = new int[500];

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
    public static void method603() {
        field1890 = null;
        field1885 = null;
        field1887 = null;
        field1886 = null;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "([BLhd;)V")
    public class84(byte[] arg0, class46 arg1) {
        this.field1884 = arg1;
        class94 var3 = new class94(arg0);
        class94 var4 = new class94(arg0);
        var3.field2061 = 2;
        int var5 = var3.method703((byte) 98);
        int var6 = -1;
        int var7 = 0;
        var4.field2061 = var3.field2061 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method703((byte) -61);
            if (var10 > 0) {
                if (this.field1884.field966[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1884.field966[var11] == 0) {
                            field1890[var7] = var11;
                            field1885[var7] = 0;
                            field1887[var7] = 0;
                            field1886[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1890[var7] = var8;
                short var12 = 0;
                if (this.field1884.field966[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1885[var7] = var12;
                } else {
                    field1885[var7] = var4.method702((byte) -112);
                }
                if ((var10 & 0x2) == 0) {
                    field1887[var7] = var12;
                } else {
                    field1887[var7] = var4.method702((byte) -93);
                }
                if ((var10 & 0x4) == 0) {
                    field1886[var7] = var12;
                } else {
                    field1886[var7] = var4.method702((byte) -101);
                }
                var6 = var8;
                var7++;
                if (this.field1884.field966[var8] == 5) {
                    this.field1892 = true;
                }
            }
        }
        if (arg0.length != var4.field2061) {
            throw new RuntimeException();
        }
        this.field1891 = var7;
        this.field1888 = new int[var7];
        this.field1889 = new int[var7];
        this.field1893 = new int[var7];
        this.field1883 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1888[var9] = field1890[var9];
            this.field1889[var9] = field1885[var9];
            this.field1893[var9] = field1887[var9];
            this.field1883[var9] = field1886[var9];
        }
    }
}

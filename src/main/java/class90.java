import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class90 {

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Z")
    public boolean field1895 = false;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lid;")
    public class60 field1897 = null;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public int field1898 = -1;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "[I")
    public int[] field1902;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "[I")
    public int[] field1899;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[I")
    public int[] field1894;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "[I")
    public int[] field1900;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "[I")
    private static int[] field1896 = new int[500];

    @OriginalMember(owner = "client!n", name = "a", descriptor = "[I")
    private static int[] field1893 = new int[500];

    @OriginalMember(owner = "client!n", name = "k", descriptor = "[I")
    private static int[] field1903 = new int[500];

    @OriginalMember(owner = "client!n", name = "i", descriptor = "[I")
    private static int[] field1901 = new int[500];

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
    public static void method740() {
        field1893 = null;
        field1903 = null;
        field1901 = null;
        field1896 = null;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "([BLid;)V")
    public class90(byte[] arg0, class60 arg1) {
        this.field1897 = arg1;
        class13 var3 = new class13(arg0);
        class13 var4 = new class13(arg0);
        var3.field309 = 2;
        int var5 = var3.method142(27467);
        int var6 = -1;
        int var7 = 0;
        var4.field309 = var3.field309 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method142(27467);
            if (var10 > 0) {
                if (this.field1897.field1175[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1897.field1175[var11] == 0) {
                            field1893[var7] = var11;
                            field1903[var7] = 0;
                            field1901[var7] = 0;
                            field1896[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1893[var7] = var8;
                short var12 = 0;
                if (this.field1897.field1175[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1903[var7] = var12;
                } else {
                    field1903[var7] = var4.method155(49152);
                }
                if ((var10 & 0x2) == 0) {
                    field1901[var7] = var12;
                } else {
                    field1901[var7] = var4.method155(49152);
                }
                if ((var10 & 0x4) == 0) {
                    field1896[var7] = var12;
                } else {
                    field1896[var7] = var4.method155(49152);
                }
                var6 = var8;
                var7++;
                if (this.field1897.field1175[var8] == 5) {
                    this.field1895 = true;
                }
            }
        }
        if (arg0.length != var4.field309) {
            throw new RuntimeException();
        }
        this.field1898 = var7;
        this.field1902 = new int[var7];
        this.field1899 = new int[var7];
        this.field1894 = new int[var7];
        this.field1900 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1902[var9] = field1893[var9];
            this.field1899[var9] = field1903[var9];
            this.field1894[var9] = field1901[var9];
            this.field1900[var9] = field1896[var9];
        }
    }
}

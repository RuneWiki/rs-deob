import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class90 {

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Lgg;")
    public class61 field1931 = null;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Z")
    public boolean field1934 = false;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public int field1937 = -1;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "[I")
    public int[] field1938;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "[I")
    public int[] field1930;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
    public int[] field1928;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "[I")
    public int[] field1936;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "[I")
    private static int[] field1929 = new int[500];

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "[I")
    private static int[] field1932 = new int[500];

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "[I")
    private static int[] field1935 = new int[500];

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "[I")
    private static int[] field1933 = new int[500];

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public static void method589() {
        field1932 = null;
        field1929 = null;
        field1935 = null;
        field1933 = null;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([BLgg;)V")
    public class90(byte[] arg0, class61 arg1) {
        this.field1931 = arg1;
        class189 var3 = new class189(arg0);
        class189 var4 = new class189(arg0);
        var3.field3752 = 2;
        int var5 = var3.method1202(-67);
        int var6 = -1;
        int var7 = 0;
        var4.field3752 = var3.field3752 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method1202(107);
            if (var10 > 0) {
                if (this.field1931.field1422[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1931.field1422[var11] == 0) {
                            field1932[var7] = var11;
                            field1929[var7] = 0;
                            field1935[var7] = 0;
                            field1933[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1932[var7] = var8;
                short var12 = 0;
                if (this.field1931.field1422[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1929[var7] = var12;
                } else {
                    field1929[var7] = var4.method1205(7470);
                }
                if ((var10 & 0x2) == 0) {
                    field1935[var7] = var12;
                } else {
                    field1935[var7] = var4.method1205(7470);
                }
                if ((var10 & 0x4) == 0) {
                    field1933[var7] = var12;
                } else {
                    field1933[var7] = var4.method1205(7470);
                }
                var6 = var8;
                var7++;
                if (this.field1931.field1422[var8] == 5) {
                    this.field1934 = true;
                }
            }
        }
        if (arg0.length != var4.field3752) {
            throw new RuntimeException();
        }
        this.field1937 = var7;
        this.field1938 = new int[var7];
        this.field1930 = new int[var7];
        this.field1928 = new int[var7];
        this.field1936 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1938[var9] = field1932[var9];
            this.field1930[var9] = field1929[var9];
            this.field1928[var9] = field1935[var9];
            this.field1936[var9] = field1933[var9];
        }
    }
}

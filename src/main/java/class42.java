import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 {

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public int field976 = -1;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Z")
    public boolean field978 = false;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lnb;")
    public class92 field975 = null;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "[I")
    public int[] field982;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "[I")
    public int[] field980;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "[I")
    public int[] field983;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "[I")
    public int[] field977;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
    private static int[] field974 = new int[500];

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "[I")
    private static int[] field979 = new int[500];

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "[I")
    private static int[] field973 = new int[500];

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "[I")
    private static int[] field981 = new int[500];

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
    public static void method329() {
        field974 = null;
        field981 = null;
        field979 = null;
        field973 = null;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([BLnb;)V")
    public class42(byte[] arg0, class92 arg1) {
        this.field975 = arg1;
        class66 var3 = new class66(arg0);
        class66 var4 = new class66(arg0);
        var3.field1569 = 2;
        int var5 = var3.method533(255);
        int var6 = -1;
        int var7 = 0;
        var4.field1569 = var3.field1569 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method533(255);
            if (var10 > 0) {
                if (this.field975.field2108[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field975.field2108[var11] == 0) {
                            field974[var7] = var11;
                            field981[var7] = 0;
                            field979[var7] = 0;
                            field973[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field974[var7] = var8;
                short var12 = 0;
                if (this.field975.field2108[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field981[var7] = var12;
                } else {
                    field981[var7] = var4.method517(-49152);
                }
                if ((var10 & 0x2) == 0) {
                    field979[var7] = var12;
                } else {
                    field979[var7] = var4.method517(-49152);
                }
                if ((var10 & 0x4) == 0) {
                    field973[var7] = var12;
                } else {
                    field973[var7] = var4.method517(-49152);
                }
                var6 = var8;
                var7++;
                if (this.field975.field2108[var8] == 5) {
                    this.field978 = true;
                }
            }
        }
        if (arg0.length != var4.field1569) {
            throw new RuntimeException();
        }
        this.field976 = var7;
        this.field982 = new int[var7];
        this.field980 = new int[var7];
        this.field983 = new int[var7];
        this.field977 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field982[var9] = field974[var9];
            this.field980[var9] = field981[var9];
            this.field983[var9] = field979[var9];
            this.field977[var9] = field973[var9];
        }
    }
}

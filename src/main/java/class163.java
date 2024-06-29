import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class163 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Z")
    public boolean field3233 = false;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lke;")
    public class96 field3234 = null;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public int field3241 = -1;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "[I")
    public int[] field3243;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[I")
    public int[] field3237;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "[I")
    public int[] field3242;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[I")
    public int[] field3240;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "[I")
    private static int[] field3238 = new int[500];

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[I")
    private static int[] field3239 = new int[500];

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[I")
    private static int[] field3236 = new int[500];

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[I")
    private static int[] field3235 = new int[500];

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "([BLke;)V")
    public class163(byte[] arg0, class96 arg1) {
        this.field3234 = arg1;
        class158 var3 = new class158(arg0);
        class158 var4 = new class158(arg0);
        var3.field3153 = 2;
        int var5 = var3.method1054(128);
        int var6 = -1;
        int var7 = 0;
        var4.field3153 = var3.field3153 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method1054(128);
            if (var10 > 0) {
                if (this.field3234.field1785[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field3234.field1785[var11] == 0) {
                            field3235[var7] = var11;
                            field3236[var7] = 0;
                            field3238[var7] = 0;
                            field3239[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field3235[var7] = var8;
                short var12 = 0;
                if (this.field3234.field1785[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field3236[var7] = var12;
                } else {
                    field3236[var7] = var4.method1079((byte) 118);
                }
                if ((var10 & 0x2) == 0) {
                    field3238[var7] = var12;
                } else {
                    field3238[var7] = var4.method1079((byte) 118);
                }
                if ((var10 & 0x4) == 0) {
                    field3239[var7] = var12;
                } else {
                    field3239[var7] = var4.method1079((byte) 100);
                }
                var6 = var8;
                var7++;
                if (this.field3234.field1785[var8] == 5) {
                    this.field3233 = true;
                }
            }
        }
        if (arg0.length != var4.field3153) {
            throw new RuntimeException();
        }
        this.field3241 = var7;
        this.field3243 = new int[var7];
        this.field3237 = new int[var7];
        this.field3242 = new int[var7];
        this.field3240 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field3243[var9] = field3235[var9];
            this.field3237[var9] = field3236[var9];
            this.field3242[var9] = field3238[var9];
            this.field3240[var9] = field3239[var9];
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
    public static void method1107() {
        field3235 = null;
        field3236 = null;
        field3238 = null;
        field3239 = null;
    }
}

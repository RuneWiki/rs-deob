import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class159 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public int field3282 = -1;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Z")
    public boolean field3284 = false;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Lsh;")
    public class170 field3291 = null;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[I")
    public int[] field3281;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "[I")
    public int[] field3286;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "[I")
    public int[] field3290;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
    public int[] field3285;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "[I")
    private static int[] field3283 = new int[500];

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[I")
    private static int[] field3287 = new int[500];

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "[I")
    private static int[] field3289 = new int[500];

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "[I")
    private static int[] field3288 = new int[500];

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()V")
    public static void method1096() {
        field3289 = null;
        field3283 = null;
        field3288 = null;
        field3287 = null;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([BLsh;)V")
    public class159(byte[] arg0, class170 arg1) {
        this.field3291 = arg1;
        class3 var3 = new class3(arg0);
        class3 var4 = new class3(arg0);
        var3.field54 = 2;
        int var5 = var3.method64(31790);
        int var6 = -1;
        int var7 = 0;
        var4.field54 = var3.field54 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method64(31790);
            if (var10 > 0) {
                if (this.field3291.field3503[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field3291.field3503[var11] == 0) {
                            field3289[var7] = var11;
                            field3283[var7] = 0;
                            field3288[var7] = 0;
                            field3287[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field3289[var7] = var8;
                short var12 = 0;
                if (this.field3291.field3503[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field3283[var7] = var12;
                } else {
                    field3283[var7] = var4.method35(true);
                }
                if ((var10 & 0x2) == 0) {
                    field3288[var7] = var12;
                } else {
                    field3288[var7] = var4.method35(true);
                }
                if ((var10 & 0x4) == 0) {
                    field3287[var7] = var12;
                } else {
                    field3287[var7] = var4.method35(true);
                }
                var6 = var8;
                var7++;
                if (this.field3291.field3503[var8] == 5) {
                    this.field3284 = true;
                }
            }
        }
        if (arg0.length != var4.field54) {
            throw new RuntimeException();
        }
        this.field3282 = var7;
        this.field3281 = new int[var7];
        this.field3286 = new int[var7];
        this.field3290 = new int[var7];
        this.field3285 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field3281[var9] = field3289[var9];
            this.field3286[var9] = field3283[var9];
            this.field3290[var9] = field3288[var9];
            this.field3285[var9] = field3287[var9];
        }
    }
}

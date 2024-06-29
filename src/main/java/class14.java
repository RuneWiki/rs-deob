import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 {

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Z")
    public boolean field330 = false;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Lme;")
    public class88 field329 = null;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public int field337 = -1;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "[I")
    public int[] field333;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "[I")
    public int[] field332;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "[I")
    public int[] field334;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[I")
    public int[] field328;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
    private static int[] field331 = new int[500];

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "[I")
    private static int[] field338 = new int[500];

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "[I")
    private static int[] field336 = new int[500];

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "[I")
    private static int[] field335 = new int[500];

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()V")
    public static void method101() {
        field331 = null;
        field335 = null;
        field336 = null;
        field338 = null;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([BLme;)V")
    public class14(byte[] arg0, class88 arg1) {
        this.field329 = arg1;
        class128 var3 = new class128(arg0);
        class128 var4 = new class128(arg0);
        var3.field2873 = 2;
        int var5 = var3.method1025(255);
        int var6 = -1;
        int var7 = 0;
        var4.field2873 = var3.field2873 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method1025(255);
            if (var10 > 0) {
                if (this.field329.field2094[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field329.field2094[var11] == 0) {
                            field331[var7] = var11;
                            field335[var7] = 0;
                            field336[var7] = 0;
                            field338[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field331[var7] = var8;
                short var12 = 0;
                if (this.field329.field2094[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field335[var7] = var12;
                } else {
                    field335[var7] = var4.method1029(11932);
                }
                if ((var10 & 0x2) == 0) {
                    field336[var7] = var12;
                } else {
                    field336[var7] = var4.method1029(11932);
                }
                if ((var10 & 0x4) == 0) {
                    field338[var7] = var12;
                } else {
                    field338[var7] = var4.method1029(11932);
                }
                var6 = var8;
                var7++;
                if (this.field329.field2094[var8] == 5) {
                    this.field330 = true;
                }
            }
        }
        if (arg0.length != var4.field2873) {
            throw new RuntimeException();
        }
        this.field337 = var7;
        this.field333 = new int[var7];
        this.field332 = new int[var7];
        this.field334 = new int[var7];
        this.field328 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field333[var9] = field331[var9];
            this.field332[var9] = field335[var9];
            this.field334[var9] = field336[var9];
            this.field328[var9] = field338[var9];
        }
    }
}

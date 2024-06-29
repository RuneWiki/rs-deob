import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class147 {

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lwf;")
    public class203 field3066 = null;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Z")
    public boolean field3061 = false;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public int field3065 = -1;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "[I")
    public int[] field3068;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "[I")
    public int[] field3064;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
    public int[] field3059;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "[I")
    public int[] field3067;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "[I")
    private static int[] field3060 = new int[500];

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "[I")
    private static int[] field3062 = new int[500];

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "[I")
    private static int[] field3058 = new int[500];

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "[I")
    private static int[] field3063 = new int[500];

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
    public static void method1046() {
        field3063 = null;
        field3062 = null;
        field3058 = null;
        field3060 = null;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([BLwf;)V")
    public class147(byte[] arg0, class203 arg1) {
        this.field3066 = arg1;
        class66 var3 = new class66(arg0);
        class66 var4 = new class66(arg0);
        var3.field1620 = 2;
        int var5 = var3.method509(119);
        int var6 = -1;
        int var7 = 0;
        var4.field1620 = var3.field1620 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method509(116);
            if (var10 > 0) {
                if (this.field3066.field3999[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field3066.field3999[var11] == 0) {
                            field3063[var7] = var11;
                            field3062[var7] = 0;
                            field3058[var7] = 0;
                            field3060[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field3063[var7] = var8;
                short var12 = 0;
                if (this.field3066.field3999[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field3062[var7] = var12;
                } else {
                    field3062[var7] = var4.method490(-128);
                }
                if ((var10 & 0x2) == 0) {
                    field3058[var7] = var12;
                } else {
                    field3058[var7] = var4.method490(105);
                }
                if ((var10 & 0x4) == 0) {
                    field3060[var7] = var12;
                } else {
                    field3060[var7] = var4.method490(-24);
                }
                var6 = var8;
                var7++;
                if (this.field3066.field3999[var8] == 5) {
                    this.field3061 = true;
                }
            }
        }
        if (arg0.length != var4.field1620) {
            throw new RuntimeException();
        }
        this.field3065 = var7;
        this.field3068 = new int[var7];
        this.field3064 = new int[var7];
        this.field3059 = new int[var7];
        this.field3067 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field3068[var9] = field3063[var9];
            this.field3064[var9] = field3062[var9];
            this.field3059[var9] = field3058[var9];
            this.field3067[var9] = field3060[var9];
        }
    }
}

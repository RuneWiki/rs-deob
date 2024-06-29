import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class134 {

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Ldd;")
    public class26 field3218 = null;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Z")
    public boolean field3219 = false;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public int field3220 = -1;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "[I")
    public int[] field3225;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "[I")
    public int[] field3222;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "[I")
    public int[] field3224;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "[I")
    public int[] field3227;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "[I")
    private static int[] field3217 = new int[500];

    @OriginalMember(owner = "client!te", name = "e", descriptor = "[I")
    private static int[] field3221 = new int[500];

    @OriginalMember(owner = "client!te", name = "g", descriptor = "[I")
    private static int[] field3223 = new int[500];

    @OriginalMember(owner = "client!te", name = "j", descriptor = "[I")
    private static int[] field3226 = new int[500];

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()V")
    public static void method1062() {
        field3217 = null;
        field3221 = null;
        field3226 = null;
        field3223 = null;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "([BLdd;)V")
    public class134(byte[] arg0, class26 arg1) {
        this.field3218 = arg1;
        class59 var3 = new class59(arg0);
        class59 var4 = new class59(arg0);
        var3.field1485 = 2;
        int var5 = var3.method480(0);
        int var6 = -1;
        int var7 = 0;
        var4.field1485 = var3.field1485 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method480(0);
            if (var10 > 0) {
                if (this.field3218.field623[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field3218.field623[var11] == 0) {
                            field3217[var7] = var11;
                            field3221[var7] = 0;
                            field3226[var7] = 0;
                            field3223[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field3217[var7] = var8;
                short var12 = 0;
                if (this.field3218.field623[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field3221[var7] = var12;
                } else {
                    field3221[var7] = var4.method479(128);
                }
                if ((var10 & 0x2) == 0) {
                    field3226[var7] = var12;
                } else {
                    field3226[var7] = var4.method479(128);
                }
                if ((var10 & 0x4) == 0) {
                    field3223[var7] = var12;
                } else {
                    field3223[var7] = var4.method479(128);
                }
                var6 = var8;
                var7++;
                if (this.field3218.field623[var8] == 5) {
                    this.field3219 = true;
                }
            }
        }
        if (arg0.length != var4.field1485) {
            throw new RuntimeException();
        }
        this.field3220 = var7;
        this.field3225 = new int[var7];
        this.field3222 = new int[var7];
        this.field3224 = new int[var7];
        this.field3227 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field3225[var9] = field3217[var9];
            this.field3222[var9] = field3221[var9];
            this.field3224[var9] = field3226[var9];
            this.field3227[var9] = field3223[var9];
        }
    }
}

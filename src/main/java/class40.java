import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class40 {

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Z")
    public boolean field753 = false;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public int field758 = -1;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lwe;")
    public class203 field757 = null;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "[I")
    public int[] field754;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
    public int[] field752;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[I")
    public int[] field751;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "[I")
    public int[] field756;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[I")
    private static int[] field750 = new int[500];

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "[I")
    private static int[] field748 = new int[500];

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[I")
    private static int[] field749 = new int[500];

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "[I")
    private static int[] field755 = new int[500];

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()V")
    public static void method263() {
        field750 = null;
        field755 = null;
        field748 = null;
        field749 = null;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([BLwe;)V")
    public class40(byte[] arg0, class203 arg1) {
        this.field757 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2346 = 2;
        int var5 = var3.method819((byte) 22);
        int var6 = -1;
        int var7 = 0;
        var4.field2346 = var3.field2346 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method819((byte) 22);
            if (var10 > 0) {
                if (this.field757.field3971[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field757.field3971[var11] == 0) {
                            field750[var7] = var11;
                            field755[var7] = 0;
                            field748[var7] = 0;
                            field749[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field750[var7] = var8;
                short var12 = 0;
                if (this.field757.field3971[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field755[var7] = var12;
                } else {
                    field755[var7] = var4.method807(-1465967912);
                }
                if ((var10 & 0x2) == 0) {
                    field748[var7] = var12;
                } else {
                    field748[var7] = var4.method807(-1465967912);
                }
                if ((var10 & 0x4) == 0) {
                    field749[var7] = var12;
                } else {
                    field749[var7] = var4.method807(-1465967912);
                }
                var6 = var8;
                var7++;
                if (this.field757.field3971[var8] == 5) {
                    this.field753 = true;
                }
            }
        }
        if (arg0.length != var4.field2346) {
            throw new RuntimeException();
        }
        this.field758 = var7;
        this.field754 = new int[var7];
        this.field752 = new int[var7];
        this.field751 = new int[var7];
        this.field756 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field754[var9] = field750[var9];
            this.field752[var9] = field755[var9];
            this.field751[var9] = field748[var9];
            this.field756[var9] = field749[var9];
        }
    }
}

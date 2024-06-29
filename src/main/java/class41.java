import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Li;")
    public class56 field835 = null;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public int field842 = -1;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Z")
    public boolean field838 = false;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "[I")
    public int[] field837;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "[I")
    public int[] field840;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "[I")
    public int[] field843;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "[I")
    public int[] field841;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "[I")
    private static int[] field834 = new int[500];

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "[I")
    private static int[] field836 = new int[500];

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[I")
    private static int[] field839 = new int[500];

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "[I")
    private static int[] field844 = new int[500];

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
    public static void method288() {
        field844 = null;
        field839 = null;
        field836 = null;
        field834 = null;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([BLi;)V")
    public class41(byte[] arg0, class56 arg1) {
        this.field835 = arg1;
        class60 var3 = new class60(arg0);
        class60 var4 = new class60(arg0);
        var3.field1227 = 2;
        int var5 = var3.method462((byte) 116);
        int var6 = -1;
        int var7 = 0;
        var4.field1227 = var3.field1227 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method462((byte) 116);
            if (var10 > 0) {
                if (this.field835.field1171[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field835.field1171[var11] == 0) {
                            field844[var7] = var11;
                            field839[var7] = 0;
                            field836[var7] = 0;
                            field834[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field844[var7] = var8;
                short var12 = 0;
                if (this.field835.field1171[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field839[var7] = var12;
                } else {
                    field839[var7] = var4.method459(false);
                }
                if ((var10 & 0x2) == 0) {
                    field836[var7] = var12;
                } else {
                    field836[var7] = var4.method459(false);
                }
                if ((var10 & 0x4) == 0) {
                    field834[var7] = var12;
                } else {
                    field834[var7] = var4.method459(false);
                }
                var6 = var8;
                var7++;
                if (this.field835.field1171[var8] == 5) {
                    this.field838 = true;
                }
            }
        }
        if (arg0.length != var4.field1227) {
            throw new RuntimeException();
        }
        this.field842 = var7;
        this.field837 = new int[var7];
        this.field840 = new int[var7];
        this.field843 = new int[var7];
        this.field841 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field837[var9] = field844[var9];
            this.field840[var9] = field839[var9];
            this.field843[var9] = field836[var9];
            this.field841[var9] = field834[var9];
        }
    }
}

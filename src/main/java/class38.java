import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class38 {

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lba;")
    public class7 field967 = null;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Z")
    public boolean field964 = false;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public int field970 = -1;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "[I")
    public int[] field969;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "[I")
    public int[] field973;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "[I")
    public int[] field966;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[I")
    public int[] field971;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
    private static int[] field963 = new int[500];

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "[I")
    private static int[] field972 = new int[500];

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "[I")
    private static int[] field968 = new int[500];

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
    private static int[] field965 = new int[500];

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()V", line = 7)
    public static void method298() {
        field963 = null;
        field972 = null;
        field965 = null;
        field968 = null;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([BLba;)V", line = 42)
    public class38(byte[] arg0, class7 arg1) {
        this.field967 = arg1;
        class39 var3 = new class39(arg0);
        class39 var4 = new class39(arg0);
        var3.field998 = 2;
        int var5 = var3.method334(107);
        int var6 = -1;
        int var7 = 0;
        var4.field998 = var3.field998 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method334(110);
            if (var10 > 0) {
                if (this.field967.field143[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field967.field143[var11] == 0) {
                            field963[var7] = var11;
                            field972[var7] = 0;
                            field965[var7] = 0;
                            field968[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field963[var7] = var8;
                short var12 = 0;
                if (this.field967.field143[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field972[var7] = var12;
                } else {
                    field972[var7] = var4.method304(126);
                }
                if ((var10 & 0x2) == 0) {
                    field965[var7] = var12;
                } else {
                    field965[var7] = var4.method304(105);
                }
                if ((var10 & 0x4) == 0) {
                    field968[var7] = var12;
                } else {
                    field968[var7] = var4.method304(109);
                }
                var6 = var8;
                var7++;
                if (this.field967.field143[var8] == 5) {
                    this.field964 = true;
                }
            }
        }
        if (arg0.length != var4.field998) {
            throw new RuntimeException();
        }
        this.field970 = var7;
        this.field969 = new int[var7];
        this.field973 = new int[var7];
        this.field966 = new int[var7];
        this.field971 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field969[var9] = field963[var9];
            this.field973[var9] = field972[var9];
            this.field966[var9] = field965[var9];
            this.field971[var9] = field968[var9];
        }
    }
}

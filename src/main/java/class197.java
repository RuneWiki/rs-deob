import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class197 extends class7 {

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    private int field3761 = 1;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "I")
    private int field3765 = 204;

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "I")
    private int field3768 = 1;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "[I")
    public static int[] field3763 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!th", name = "R", descriptor = "Lob;")
    public static class141 field3760 = class175.method1195(40, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!th", name = "T", descriptor = "Lob;")
    public static class141 field3762 = class175.method1195(40, "<col=00ff00>");

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!th", name = "X", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!th", name = "bb", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!th", name = "cb", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        ++field3764;
        int var4 = -24 % ((arg1 - 66) / 57);
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field3765 = arg2.method1007(39);
                }
            } else {
                this.field3768 = arg2.method991(255);
            }
        } else {
            this.field3761 = arg2.method991(255);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
    public static void method1325(byte arg0) {
        field3762 = null;
        field3763 = null;
        int var1 = -125 % ((4 - arg0) / 52);
        field3760 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)I")
    public static final int method1326(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3769;
        int var5 = 65536 - class44.field843[arg0 * arg2 / arg3] >> 1;
        return ((-var5 + 65536) * arg4 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class197() {
        super(0, true);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        int[] var3 = super.field100.method842(arg1, 12);
        ++field3767;
        if (arg0 < 13) {
            return null;
        } else {
            if (super.field100.field2534) {
                for (int var4 = 0; var4 < class117.field2272; ++var4) {
                    int var5 = class177.field3503[arg1];
                    int var6 = class15.field272[var4];
                    int var7 = this.field3761 * var6 >> 12;
                    int var8 = this.field3768 * var5 >> 12;
                    int var9 = var6 % (4096 / this.field3761) * this.field3761;
                    int var10 = var5 % (4096 / this.field3768) * this.field3768;
                    if (this.field3765 > var10) {
                        for (var7 -= var8; var7 < 0; var7 += 4) {
                        }
                        while (var7 > 3) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~var9 > ~this.field3765) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (~this.field3765 < ~var9) {
                        int var11;
                        for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                        }
                        while (var11 > 3) {
                            var11 -= 4;
                        }
                        if (var11 > 0) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }
}

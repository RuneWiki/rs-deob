import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class204 extends class111 {

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    private int field2762;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    private int field2759;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    private int field2760;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    private int field2764;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    private int field2757;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lnf;")
    private class256 field2756;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    private int field2761;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "[[I")
    private static int[][] field2758 = new int[6][];

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "[I")
    private static int[] field2763 = new int[6];

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Lvm;")
    private class322 field2765;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lvm;", line = 8)
    public final class322 method729(byte arg0) {
        if (this.field2765 == null) {
            field2763[5] = this.field2757;
            field2763[1] = this.field2762;
            field2763[3] = this.field2761;
            field2763[4] = this.field2759;
            field2763[0] = this.field2764;
            field2763[2] = this.field2760;
            class210 var2 = this.field2756.field3631;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method184(field2763[var5], arg0 + 14486)) {
                    return null;
                }
                class444 var6 = var2.method186(field2763[var5], -9590);
                int var7 = var6.field6509 ? 64 : 128;
                if (var6.field6497 > 0) {
                    var3 = true;
                }
                if (var4 < var7) {
                    var4 = var7;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field2758[var8] = var2.method181(var4, (byte) 100, false, var4, field2763[var8], 1.0F);
            }
            this.field2765 = new class322(this.field2756, 6407, var4, var3, field2758);
        }
        if (arg0 != 70) {
            this.field2761 = -31;
        }
        return this.field2765;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lnf;IIIIII)V", line = 77)
    public class204(class256 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2762 = arg2;
        this.field2759 = arg5;
        this.field2760 = arg3;
        this.field2764 = arg1;
        this.field2757 = arg6;
        this.field2756 = arg0;
        this.field2761 = arg4;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class52 extends class59 {

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    private int field740 = 1;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    private int field743 = 204;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    private int field746 = 1;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "Lri;")
    public static class301 field742 = null;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "[I")
    public static int[] field739 = new int[200];

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field747 = 1;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BILhb;)V", line = 14)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg1 == 0) {
            this.field740 = arg2.method1178(arg0 - 107);
        } else if (arg1 == 1) {
            this.field746 = arg2.method1178(8);
        } else if (arg1 == 2) {
            this.field743 = arg2.method1161(true);
        }
        if (arg0 != 115) {
            this.field743 = 7;
        }
        field745++;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V", line = 52)
    public static void method360(byte arg0) {
        field742 = null;
        if (arg0 == 60) {
            field739 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 73)
    public class52() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)[I", line = 92)
    public final int[] method63(boolean arg0, int arg1) {
        field741++;
        if (!arg0) {
            this.method63(true, 40);
        }
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            for (int var4 = 0; var4 < class293.field4789; var4++) {
                int var5 = class219.field3608[var4];
                int var6 = class269.field4504[arg1];
                int var7 = this.field740 * var5 >> 12;
                int var8 = var5 % (4096 / this.field740) * this.field740;
                int var9 = var6 % (4096 / this.field746) * this.field746;
                int var10 = this.field746 * var6 >> 12;
                if (this.field743 > var9) {
                    for (var7 -= var10; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field743 > var8) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field743 > var8) {
                    int var11;
                    for (var11 = var7 - var10; var11 < 0; var11 += 4) {
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

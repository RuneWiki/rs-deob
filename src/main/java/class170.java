import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class170 extends class124 {

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    private int field2874 = 585;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "[Le;")
    public static class191[] field2881 = new class191[500];

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "Le;")
    public static class191 field2877 = class54.method368("Untersuchen", 2047);

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "Le;")
    public static class191 field2879 = class54.method368("b12_full", 2047);

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "Lng;")
    public static class121 field2878;

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class170() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static void method1147(boolean arg0) {
        field2877 = null;
        field2879 = null;
        field2878 = null;
        field2881 = null;
        if (!arg0) {
            method1147(true);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        ++field2873;
        if (arg0 == 0) {
            this.field2874 = arg1.method1593(true);
        }
        if (!arg2) {
            this.method136(-87, (class225) null, false);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        if (arg0 <= 68) {
            this.method131((byte) -106, 89);
        }
        ++field2880;
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            int var4 = class236.field4202[arg1];
            for (int var5 = 0; var5 < class64.field1132; ++var5) {
                int var6 = class257.field4559[var5];
                if (this.field2874 < var6 && var6 < -this.field2874 + 4096 && var4 > -this.field2874 + 2048 && var4 < this.field2874 + 2048) {
                    int var7 = 2048 - var6;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2874 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field2874 + 2048 < var6 && var6 < this.field2874 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field2874;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field2874);
                } else if (this.field2874 <= var4 && ~var4 >= ~(-this.field2874 + 4096)) {
                    if (var6 >= this.field2874 && ~(-this.field2874 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2874 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field2874;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field2874);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2875;
        if ((arg3 & 1) == 1) {
            int var7 = arg5;
            arg5 = arg6;
            arg6 = var7;
        }
        int var8 = arg4 & 3;
        if (~var8 == -1) {
            return arg2;
        } else {
            int var9 = 14 / ((arg0 - -42) / 41);
            if (~var8 == -2) {
                return arg1;
            } else {
                return ~var8 == -3 ? -arg2 - (arg5 - 1) + 7 : 8 - arg1 + -arg6;
            }
        }
    }
}

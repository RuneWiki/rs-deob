import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class357 extends class200 {

    @OriginalMember(owner = "client!mba", name = "p", descriptor = "I")
    private int field5083;

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
    private int field5078;

    @OriginalMember(owner = "client!mba", name = "q", descriptor = "I")
    private int field5084;

    @OriginalMember(owner = "client!mba", name = "r", descriptor = "I")
    private int field5085;

    @OriginalMember(owner = "client!mba", name = "n", descriptor = "I")
    private int field5081;

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "I")
    private int field5079;

    @OriginalMember(owner = "client!mba", name = "m", descriptor = "Lad;")
    private class362 field5080;

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!mba", name = "o", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "Lvda;")
    private class158 field5076;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IJ)V", line = 9)
    public static final void method2242(int arg0, long arg1) {
        field5082++;
        int var3 = class326.field4703;
        int var4 = class151.field1860;
        if (class325.field4695 != var3) {
            int var5 = var3 - class325.field4695;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class325.field4695 += var6;
        }
        if (!class595.field8694.field6547) {
            class388.field5967 += (float) arg1 * class65.field719 / 40.0F * 8.0F;
            class639.field9187 += (float) arg1 * class99.field1159 / 40.0F * 8.0F;
        }
        if (arg0 != -1) {
            return;
        }
        if (class620.field8987 != var4) {
            int var7 = var4 - class620.field8987;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class620.field8987 += var8;
        }
        class508.method3029(-2368);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)Lvda;", line = 100)
    public final class158 method1269(boolean arg0) {
        field5077++;
        if (arg0) {
            this.method1269(true);
        }
        if (this.field5076 == null) {
            class444.field6651[1] = this.field5079;
            class462 var2 = this.field5080.field8852;
            class444.field6651[2] = this.field5085;
            class444.field6651[0] = this.field5081;
            class444.field6651[4] = this.field5078;
            class444.field6651[3] = this.field5084;
            class444.field6651[5] = this.field5083;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method436(class444.field6651[var5], -5686)) {
                    return null;
                }
                class614 var7 = var2.method438(40, class444.field6651[var5]);
                int var8 = var7.field8944 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field8940 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class146.field1802[var6] = var2.method432(var4, 1.0F, class444.field6651[var6], var4, -18170, false);
            }
            this.field5076 = new class158(this.field5080, 6407, var4, var3 != 0, class146.field1802);
        }
        return this.field5076;
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lad;IIIIII)V", line = 160)
    public class357(class362 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5083 = arg6;
        this.field5078 = arg5;
        this.field5084 = arg4;
        this.field5085 = arg3;
        this.field5081 = arg1;
        this.field5079 = arg2;
        this.field5080 = arg0;
    }
}

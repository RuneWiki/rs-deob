import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class412 extends class95 {

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "Lqi;")
    private class458 field5712;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    private int field5711;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    private int field5715;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    private int field5713;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    private int field5706;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    private int field5708;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    private int field5710;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "[I")
    private static int[] field5707 = new int[6];

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "[[I")
    private static int[][] field5709 = new int[6][];

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "Lqh;")
    private class452 field5714;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Lqh;", line = 4)
    public final class452 method618(byte arg0) {
        if (this.field5714 == null) {
            field5707[3] = this.field5706;
            field5707[1] = this.field5711;
            field5707[0] = this.field5713;
            field5707[4] = this.field5708;
            class187 var2 = this.field5712.field6863;
            field5707[5] = this.field5715;
            field5707[2] = this.field5710;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1215(14455, field5707[var5])) {
                    return null;
                }
                class192 var6 = var2.method1218(field5707[var5], false);
                int var7 = var6.field2730 ? 64 : 128;
                if (var4 < var7) {
                    var4 = var7;
                }
                if (var6.field2748 > 0) {
                    var3 = true;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field5709[var8] = var2.method1219(false, var4, 1.0F, field5707[var8], var4, 59);
            }
            this.field5714 = new class452(this.field5712, 6407, var4, var3, field5709);
        }
        if (arg0 <= 94) {
            this.method618((byte) 104);
        }
        return this.field5714;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lqi;IIIIII)V", line = 78)
    public class412(class458 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5712 = arg0;
        this.field5711 = arg2;
        this.field5715 = arg6;
        this.field5713 = arg1;
        this.field5706 = arg4;
        this.field5708 = arg5;
        this.field5710 = arg3;
    }
}

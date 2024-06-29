import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class28 extends class159 {

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "Loea;")
    private class594 field388;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    private int field390;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lni;")
    private class518 field393;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Lwc;")
    public static class66 field389;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Lni;")
    public final class518 method201(byte arg0) {
        int var2 = 74 / ((35 - arg0) / 38);
        field391++;
        if (this.field393 == null) {
            class581.field8211[3] = this.field394;
            class581.field8211[0] = this.field387;
            class581.field8211[1] = this.field395;
            class149 var3 = this.field388.field1084;
            class581.field8211[2] = this.field392;
            class581.field8211[4] = this.field390;
            class581.field8211[5] = this.field397;
            boolean var4 = false;
            int var5 = 0;
            for (int var6 = 0; var6 < 6; var6++) {
                if (!var3.method1152(class581.field8211[var6], 98)) {
                    return null;
                }
                class546 var8 = var3.method1154(-102, class581.field8211[var6]);
                int var9 = var8.field7706 ? 64 : 128;
                if (var8.field7709 > 0) {
                    var4 = true;
                }
                if (var9 > var5) {
                    var5 = var9;
                }
            }
            for (int var7 = 0; var7 < 6; var7++) {
                class146.field2243[var7] = var3.method1151(1.0F, var5, false, -18596, class581.field8211[var7], var5);
            }
            this.field393 = new class518(this.field388, 6407, var5, var4, class146.field2243);
        }
        return this.field393;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()V")
    public static final void method202() {
        for (int var0 = 0; var0 < class253.field3660.length; var0++) {
            class253.field3660[var0].method3927();
        }
        class253.field3660 = null;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public static void method203(int arg0) {
        int var1 = -55 % ((arg0 - 81) / 44);
        field389 = null;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Loea;IIIIII)V")
    public class28(class594 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field392 = arg3;
        this.field395 = arg2;
        this.field394 = arg4;
        this.field387 = arg1;
        this.field388 = arg0;
        this.field397 = arg6;
        this.field390 = arg5;
    }
}

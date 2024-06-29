import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class8 extends class5 {

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "Lrga;")
    public static class280 field159 = new class280(72, 15);

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "Lki;")
    public static class320 field160 = new class320();

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field162 = 0;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "[[[S")
    public static short[][][] field161;

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 3)
    public class8() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I", line = 8)
    public final int[] method39(int arg0, int arg1) {
        ++field158;
        int var3 = -47 % ((81 - arg0) / 36);
        int[] var4 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            class293.method1642(var4, 0, class657.field9287, class272.field3439[arg1]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "(I)V", line = 31)
    public static void method62(int arg0) {
        field161 = null;
        field160 = null;
        if (arg0 != 0) {
            method62(-60);
        }
        field159 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lha;III[Z)Z", line = 52)
    public static final boolean method63(class119 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class699.field9887 != class491.field6485) {
            int var6 = class256.field3127[arg1].method1565(arg3, arg2, true);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class272 var8 = class256.field3127[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1565(arg3, arg2, true);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1286(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1284(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }
}

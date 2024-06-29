import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class252 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lia;")
    public static class257 field4332 = class28.method234(101, "<)4col>");

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lia;")
    public static class257 field4336 = class28.method234(-112, "<img=1>");

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lmb;")
    public static class178 field4334;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Lck;")
    public static class186 field4335;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Lag;")
    public static class259 field4338;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
    public static final void method1647(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= arg4) {
            for (int var5 = arg1; var5 < arg4; var5++) {
                class185.field3220[var5][arg0] = arg3;
            }
        } else {
            for (int var6 = arg4; var6 < arg1; var6++) {
                class185.field3220[var6][arg0] = arg3;
            }
        }
        if (arg2 != 0) {
            method1649();
        }
        field4333++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method1648(byte arg0) {
        field4335 = null;
        field4332 = null;
        field4338 = null;
        field4334 = null;
        if (arg0 == 94) {
            field4336 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
    public static final void method1649() {
        for (int var0 = 0; var0 < class236.field4045; var0++) {
            for (int var5 = 0; var5 < class140.field2491; var5++) {
                for (int var6 = 0; var6 < class73.field1427; var6++) {
                    class75.field1463[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class79.field1547; var1++) {
            for (int var4 = 0; var4 < class79.field1546[var1]; var4++) {
                class79.field1548[var1][var4] = null;
            }
            class79.field1546[var1] = 0;
        }
        for (int var2 = 0; var2 < class253.field4356; var2++) {
            class198.field3388[var2] = null;
        }
        class253.field4356 = 0;
        for (int var3 = 0; var3 < class259.field4492.length; var3++) {
            class259.field4492[var3] = null;
        }
    }
}

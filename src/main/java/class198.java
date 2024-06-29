import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class198 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Lmh;")
    private static class128 field3460 = class22.method156(124, "shake:");

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Lmh;")
    public static class128 field3462 = field3460;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Lmh;")
    public static class128 field3463 = field3460;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "()V", line = 4)
    public static final void method1376() {
        GL var0 = class247.field4253;
        var0.glDisableClientState(32886);
        class247.method1706(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class247.method1688();
        for (int var1 = 0; var1 < class38.field762[0].length; var1++) {
            class154 var2 = class38.field762[0][var1];
            if (var2.field2637 >= 0 && class141.field2419.method101(var2.field2637, 118) == 4) {
                var0.glColor4fv(class192.method1289(-118, var2.field2656), 0);
                float var3 = 201.5F - (var2.field2651 ? 1.0F : 0.5F);
                var2.method1023(class182.field3184, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class247.method1715();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class247.method1692();
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 45)
    public static void method1377(int arg0) {
        if (arg0 != 4) {
            method1377(46);
        }
        field3463 = null;
        field3462 = null;
        field3460 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIBI)V", line = 75)
    public static final void method1378(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = class7.method59(class181.field3173, arg2, class70.field1315, 0);
        int var7 = class7.method59(class181.field3173, arg0, class70.field1315, 0);
        if (arg4 <= 88) {
            return;
        }
        int var8 = class7.method59(class43.field875, arg3, class193.field3335, 0);
        field3461++;
        int var9 = class7.method59(class43.field875, arg5, class193.field3335, 0);
        for (int var10 = var6; var10 <= var7; var10++) {
            class314.method2138(var9, true, arg1, class219.field3850[var10], var8);
        }
    }
}

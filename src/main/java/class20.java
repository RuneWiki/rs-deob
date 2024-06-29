import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class20 extends class535 {

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "Ldda;")
    public static class597 field182;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIII)V")
    public static final void method92(int arg0, int arg1, int arg2, int arg3) {
        class415 var4 = class526.field7777[arg0][arg1][arg2];
        if (var4 != null) {
            class73 var5 = var4.field5985;
            class73 var6 = var4.field5989;
            if (var5 != null) {
                var5.field857 = var5.field857 * arg3 / (16 << class179.field2726 - 7);
                var5.field845 = var5.field845 * arg3 / (16 << class179.field2726 - 7);
            }
            if (var6 != null) {
                var6.field857 = var6.field857 * arg3 / (16 << class179.field2726 - 7);
                var6.field845 = var6.field845 * arg3 / (16 << class179.field2726 - 7);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V")
    public final void method93(int arg0, int arg1, int arg2, int arg3) {
        super.field7919 = arg1;
        if (arg0 != -1) {
            field182 = null;
        }
        super.field7912 = arg2;
        ++field184;
        super.field7928 = arg3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IF)V")
    public final void method94(int arg0, float arg1) {
        if (arg0 < -8) {
            super.field7927 = arg1;
            ++field183;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(IIIIIF)V")
    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V")
    public static void method95(byte arg0) {
        if (arg0 < 115) {
            method92(47, 83, -44, 15);
        }
        field182 = null;
    }
}

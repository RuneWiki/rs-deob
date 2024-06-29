import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class727 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field10097 = 0;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[I")
    public static int[] field10098 = new int[2];

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field10095;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field10096;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field10099;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field10100;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "J")
    public static long field10101;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V")
    public static final void method4085(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 >= -120) {
            field10095 = 119;
        }
        field10100++;
        int var6 = class10.method99(class431.field5944, 101, class380.field5289, arg3);
        int var7 = class10.method99(class431.field5944, 19, class380.field5289, arg0);
        int var8 = class10.method99(class209.field3090, 45, class261.field3632, arg1);
        int var9 = class10.method99(class209.field3090, 103, class261.field3632, arg2);
        for (int var10 = var6; var10 <= var7; var10++) {
            class717.method4012(arg5, -61, var8, class690.field9616[var10], var9);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method4086(int arg0) {
        if (arg0 >= 3) {
            field10098 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Component;Z)Lpg;")
    public static final class734 method4087(Component arg0, boolean arg1) {
        field10099++;
        if (!arg1) {
            field10095 = 4;
        }
        return new class390(arg0);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public abstract class class691 {

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "Z")
    public static boolean field9594 = false;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "I")
    public static int field9593;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    public static int field9595;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lgj;IIIIZJI)V")
    public static final void method3870(class662 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, long arg6, int arg7) {
        class234.field3371 = arg5;
        class203.field3067 = arg6;
        class457.field6220 = arg1;
        class469.field6348 = 1;
        class676.field9431 = null;
        class171.field2733 = 10000;
        class752.field10377 = arg7;
        class11.field180 = arg0;
        class126.field2224 = arg4;
        if (arg3 != 10000) {
            method3870(null, -105, 114, 122, -94, true, 106L, -22);
        }
        field9593++;
        class1.field6 = arg2;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILcaa;)Lcaa;")
    public abstract class320 method2835(int arg0, class320 arg1);
}

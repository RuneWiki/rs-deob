import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class217 extends class144 {

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "[I")
    public int[] field2954;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "[I")
    public int[] field2953;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field2956 = 52;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIZZIII)V")
    public static final void method1379(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (!arg2) {
            field2956 = -45;
        }
        class43.field462 = arg6;
        class456.field6808 = arg1;
        class527.field7740 = arg4;
        class199.field2579 = arg5;
        field2957++;
        class168.field2177 = arg0;
        if (arg3 && class199.field2579 >= 100) {
            class139.field1857 = class168.field2177 * 128 + 64;
            class238.field3171 = class527.field7740 * 128 + 64;
            class267.field3572 = class470.method2868(-15, class210.field2808, class238.field3171, class139.field1857) - class43.field462;
        }
        class47.field491 = 2;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(II[I[I)V")
    public class217(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field2954 = arg2;
        this.field2953 = arg3;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public static final void method1380(byte arg0) {
        for (int var1 = 0; var1 < class275.field3657.length; var1++) {
            for (int var2 = 0; var2 < class275.field3657[var1].length; var2++) {
                class275.field3657[var1][var2] = class358.field4873;
            }
        }
        field2955++;
        if (arg0 != 118) {
            field2956 = 22;
        }
    }
}

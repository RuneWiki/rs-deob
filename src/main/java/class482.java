import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class class482 {

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field6959 = 13156520;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field6960 = 0;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZZ)V")
    public static final void method2863(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != 0) {
            method2863(-60, true, true);
        }
        field6961++;
        if (arg2) {
            class157.field2399++;
            class431.method2559(1);
        }
        if (arg1) {
            class304.field4130++;
            class79.method611((byte) -121);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static final void method2864(byte arg0) {
        field6958++;
        if (class6.field79 == class523.field7659) {
            return;
        }
        try {
            class344.method2077(false, "tbrefresh", class502.field7343);
            if (arg0 < 76) {
                method2863(-23, true, true);
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lpo;I)Lpo;")
    public abstract class395 method1549(class395 arg0, int arg1);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
    public static final void method2865(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 13156520) {
            field6959 = -54;
        }
        if (arg3 <= arg1) {
            for (int var5 = arg3; var5 < arg1; var5++) {
                class42.field626[var5][arg4] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg3; var6++) {
                class42.field626[var6][arg4] = arg2;
            }
        }
        field6962++;
    }
}

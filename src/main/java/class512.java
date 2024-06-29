import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public abstract class class512 {

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "F")
    public static float field7330;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)V", line = 3)
    public static final void method2931(int arg0, int arg1) {
        field7331++;
        class235.field2997 = 3;
        if (arg0 == -4495) {
            class2.field19 = 100;
            class388.field5189 = -1;
            class685.field9699 = arg1;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BIII)I", line = 20)
    public static final int method2932(byte arg0, int arg1, int arg2, int arg3) {
        field7328++;
        if (arg0 != -46) {
            field7330 = -1.6131934F;
        }
        if (arg3 > arg1) {
            return arg3;
        } else if (arg2 >= arg1) {
            return arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)Ljava/lang/String;", line = 41)
    public static final String method2933(int arg0) {
        field7329++;
        if (class215.field2615 || class122.field1377 == null) {
            return "";
        } else {
            if (arg0 > -102) {
                field7330 = -1.2037836F;
            }
            return class122.field1377.field2529;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BI)V")
    public abstract void method1218(byte arg0, int arg1);

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(II)I")
    public abstract int method1217(int arg0, int arg1);

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)Lhc;")
    public abstract class127 method1214(int arg0);

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(II)[B")
    public abstract byte[] method1205(int arg0, int arg1);
}

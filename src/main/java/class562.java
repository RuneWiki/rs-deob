import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class562 implements class617 {

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "Ljca;")
    private class684 field7762;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public static int field7757 = 0;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "[I")
    public static int[] field7761 = new int[3];

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BZ)V", line = 4)
    public final void method1475(byte arg0, boolean arg1) {
        if (arg1) {
            class272.field3822.method217(0, 0, class467.field6559, class582.field7968, this.field7762.field9258, 0);
        }
        field7759++;
        if (arg0 != -49) {
            field7757 = -20;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIB)V", line = 20)
    public static final void method3227(int arg0, int arg1, int arg2, byte arg3) {
        field7755++;
        if (arg3 != -98) {
            method3229((byte) 69);
        }
        int var4 = arg1 * class693.field9368.field4457.method820(-32350) >> 8;
        if (var4 == 0 || arg0 == -1) {
            return;
        }
        if (!class737.field9928 && class277.field3916 != -1 && class534.method3078(true) && !class531.method3062((byte) -99)) {
            class287.field4000 = class495.method2915(false);
            class12 var5 = class584.method3341(class287.field4000, arg3 ^ 0xFFFFFF97);
            class161.method1231(true, -95, var5);
        }
        class580.method3329(0, arg0, false, 102, class72.field1324, var4);
        class25.method382(-1, 255, -1);
        class737.field9928 = true;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V", line = 50)
    public final void method1474(int arg0) {
        field7758++;
        if (arg0 != 10286) {
            method3229((byte) 42);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)Z", line = 60)
    public final boolean method1470(byte arg0) {
        field7754++;
        int var2 = 35 / ((arg0 - 25) / 52);
        return true;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIILjava/lang/Class;)Ljb;", line = 77)
    public static final class494 method3228(int arg0, int arg1, int arg2, Class arg3) {
        class384 var4 = class649.field8928[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class474 var5 = var4.field5567; var5 != null; var5 = var5.field6621) {
            class494 var6 = var5.field6623;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6831 == arg1 && var6.field6838 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V", line = 101)
    public static void method3229(byte arg0) {
        if (arg0 == -22) {
            field7761 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Ljca;)V", line = 119)
    public class562(class684 arg0) {
        this.field7762 = arg0;
    }
}

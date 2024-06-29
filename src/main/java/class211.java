import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class211 {

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field2491;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eq", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field2492;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2486;

    // $FF: synthetic method
    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1256(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZLsw;)V", line = 10)
    public static final void method1251(boolean arg0, class752 arg1) {
        field2485++;
        if (class638.field9170 == null) {
            return;
        }
        class281 var2 = null;
        if (arg1.field10514 == 0) {
            var2 = (class281) class628.method3602(arg1.field10515, arg1.field10512, arg1.field10517);
        }
        if (arg0) {
            return;
        }
        if (arg1.field10514 == 1) {
            var2 = (class281) class603.method3426(arg1.field10515, arg1.field10512, arg1.field10517);
        }
        if (arg1.field10514 == 2) {
            var2 = (class281) class229.method1330(arg1.field10515, arg1.field10512, arg1.field10517, field2492 == null ? (field2492 = method1256("wha")) : field2492);
        }
        if (arg1.field10514 == 3) {
            var2 = (class281) class199.method1201(arg1.field10515, arg1.field10512, arg1.field10517);
        }
        if (var2 == null) {
            arg1.field10520 = 0;
            arg1.field10523 = 0;
            arg1.field10510 = -1;
        } else {
            arg1.field10510 = var2.method1241((byte) 99);
            arg1.field10523 = var2.method1236((byte) -78);
            arg1.field10520 = var2.method1243((byte) 117);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V", line = 54)
    public static void method1252(byte arg0) {
        field2486 = null;
        if (arg0 > -6) {
            field2487 = 68;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V", line = 65)
    public static final void method1253(int arg0) {
        class82.field858.method360(((float) class654.field9334.field9832.method2441(65) * 0.1F + 0.7F) * class30.field338);
        field2491++;
        if (arg0 == -1678206238) {
            class82.field858.method325(class287.field3518, class135.field1531, class253.field3046, (float) (class679.field9614 << 2), (float) (class77.field805 << 2), (float) (class203.field2404 << 2));
            class82.field858.method348(class591.field8336);
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V", line = 79)
    public static final void method1254(int arg0) {
        field2490++;
        int var1 = arg0;
        if (class654.field9334 != null) {
            var1 = class654.field9334.field9849.method3465(30);
        }
        if (var1 == 2) {
            int var4 = class71.field758 > 800 ? 800 : class71.field758;
            class705.field9926 = var4;
            class93.field979 = (class71.field758 - var4) / 2;
            int var5 = class217.field2523 <= 600 ? class217.field2523 : 600;
            class504.field7104 = 0;
            class476.field6777 = var5;
        } else if (var1 == 1) {
            int var2 = class71.field758 > 1024 ? 1024 : class71.field758;
            int var3 = class217.field2523 > 768 ? 768 : class217.field2523;
            class93.field979 = (class71.field758 - var2) / 2;
            class705.field9926 = var2;
            class476.field6777 = var3;
            class504.field7104 = 0;
        } else {
            class504.field7104 = 0;
            class93.field979 = 0;
            class705.field9926 = class71.field758;
            class476.field6777 = class217.field2523;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZI)I", line = 124)
    public static final int method1255(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            return -77;
        }
        field2488++;
        if (arg0 > arg1) {
            return arg0;
        } else if (arg1 > arg3) {
            return arg3;
        } else {
            return arg1;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public abstract class class106 {

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field1506 = -1;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V", line = 5)
    public static final void method706(byte arg0) {
        field1505++;
        class93.field1352 = 0;
        class99.field1423 = -1;
        if (arg0 != 1) {
            field1506 = 26;
        }
        class112.field1573 = -1;
        class479.field7009 = -1;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(JB)V", line = 28)
    public static final void method710(long arg0, byte arg1) {
        if (arg1 != 6) {
            field1506 = 15;
        }
        field1507++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class496.method2946(1, arg0 - 1L);
            class496.method2946(1, 1L);
        } else {
            class496.method2946(1, arg0);
        }
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)Z", line = 49)
    public static final boolean method711(int arg0) {
        int var1 = -24 / ((arg0 - 66) / 38);
        field1504++;
        return class12.field201 > 0;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BI)Z")
    public abstract boolean method705(byte arg0, int arg1);

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(B)V")
    public abstract void method707(byte arg0);

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)Lsk;")
    public abstract class333 method708(int arg0);

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V")
    public abstract void method709(int arg0);
}

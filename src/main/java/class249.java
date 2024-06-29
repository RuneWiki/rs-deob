import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class class249 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field3495 = 0;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lij;")
    public static class316 field3497;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILpl;)Lpl;")
    public abstract class448 method1612(int arg0, class448 arg1);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZI)V")
    public static final void method1613(int arg0, int arg1, boolean arg2, int arg3) {
        field3496++;
        if (~arg3 > arg0 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class231.field3248 = arg3;
        class105.field1478 = arg2;
        class52.field671 = arg1;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method1614(int arg0) {
        field3497 = null;
        if (arg0 > -100) {
            method1614(-41);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(JI)V")
    public static final void method1615(long arg0, int arg1) {
        if (class341.field4617 != null) {
            if (class26.field337 == 1 || class26.field337 == 5) {
                class316.method1913(arg0, 500);
            } else if (class26.field337 == 4) {
                class237.method1547(arg0, false);
            }
        }
        field3498++;
        class271.method1721(class354.field4765, (long) class246.field3467, (byte) -86);
        if (class350.field4712 != -1) {
            class155.method1133(87, class350.field4712);
        }
        for (int var3 = 0; var3 < class58.field751; var3++) {
            if (class363.field4998[var3]) {
                class53.field680[var3] = true;
            }
            class160.field2276[var3] = class363.field4998[var3];
            class363.field4998[var3] = false;
        }
        class251.field3507 = class246.field3467;
        if (class354.field4765.method166()) {
            class18.field241 = true;
        }
        if (class350.field4712 != -1) {
            class58.field751 = 0;
            class130.method978((byte) -105);
        }
        class354.field4765.method204();
        if (arg1 != -17497) {
            method1614(103);
        }
        class232.method1513(-78, class354.field4765);
        int var4 = class418.method2578(-70);
        if (var4 == -1) {
            var4 = class430.field6019;
        }
        class31.method285(var4, -1);
        class424.method2623(false, class343.field4623, class359.field4970.field44, class359.field4970.field40, class54.field694);
        class54.field694 = 0;
    }
}

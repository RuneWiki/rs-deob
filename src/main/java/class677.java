import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class677 {

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "Ljn;")
    public static class134 field9480 = new class134(66, 0);

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public static int field9482 = -1;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
    public static int field9481;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Z)V", line = 13)
    public static final void method3855(boolean arg0) {
        class128.method881((byte) -38);
        field9481++;
        class315.field4517.field6962 = 0;
        class501.field6853 = null;
        class350.field5090 = null;
        class29.field239 = 0;
        if (arg0) {
            method3855(true);
        }
        class637.field8958 = 0;
        class499.field6844 = null;
        class434.field6026 = null;
        class179.field2258 = 0;
        class692.method3922((byte) 28);
        class436.method2619(true);
        for (int var1 = 0; var1 < 2048; var1++) {
            class413.field5787[var1] = null;
        }
        class724.field10031 = null;
        for (int var2 = 0; var2 < class744.field10275; var2++) {
            class359 var4 = class669.field9376[var2].field9573;
            if (var4 != null) {
                var4.field9137 = -1;
            }
        }
        class213.method1341((byte) 82);
        class695.field9691 = 1;
        class362.field5225 = -1;
        class5.field30 = -1;
        class285.method1884(true, 10);
        for (int var3 = 0; var3 < 100; var3++) {
            class363.field5240[var3] = true;
        }
        class570.method3352((byte) -121);
        class288.field4222 = null;
        class405.field5711 = 0L;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V", line = 71)
    public static void method3856(int arg0) {
        field9480 = null;
        if (arg0 != 66) {
            field9480 = null;
        }
    }
}

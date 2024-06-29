import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class141 {

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field1939 = 0;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field1940 = 0;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Z")
    public static boolean field1942;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZBLim;)V")
    public static final void method890(boolean arg0, byte arg1, class178 arg2) {
        if (arg1 < 99) {
            return;
        }
        field1941++;
        int var3 = arg2.field2556 == 0 ? arg2.field2529 : arg2.field2556;
        int var4 = arg2.field2579 == 0 ? arg2.field2571 : arg2.field2579;
        class227.method1500(class262.field4214[arg2.field2545 >> 16], var4, 0, arg0, arg2.field2545, var3);
        if (arg2.field2642 != null) {
            class227.method1500(arg2.field2642, var4, 0, arg0, arg2.field2545, var3);
        }
        class60 var5 = (class60) class186.field2821.method1453(true, (long) arg2.field2545);
        if (var5 != null) {
            class8.method46(arg0, var3, var5.field831, var4, -91);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class268 extends class209 {

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lpk;Lf;Lpk;B)V", line = 6)
    public static final void method1859(class120 arg0, class262 arg1, class120 arg2, byte arg3) {
        class174.field2796 = arg2;
        class36.field550 = arg1;
        field4116++;
        class229.field3520 = arg0;
        if (class174.field2796 != null) {
            class328.field5137 = class174.field2796.method962((byte) -118, 1);
        }
        if (arg3 != 24) {
            field4114 = 104;
        }
        if (class229.field3520 != null) {
            class291.field4563 = class229.field3520.method962((byte) -100, 1);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)V", line = 29)
    public static final void method1860(byte arg0, int arg1) {
        field4115++;
        if (arg1 == -1 || !class309.method2186(26080, arg1)) {
            return;
        }
        class266[] var2 = class110.field1789[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class266 var4 = var2[var3];
            if (var4.field4062 != null) {
                class150 var5 = new class150();
                var5.field2458 = var4;
                var5.field2450 = var4.field4062;
                class307.method2176(2000000, var5, -1);
            }
        }
        if (arg0 != -8) {
            field4114 = 88;
        }
    }
}

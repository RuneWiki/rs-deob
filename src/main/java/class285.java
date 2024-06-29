import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class285 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "[I")
    public static int[] field4160 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Lqj;")
    public static class238 field4163;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V", line = 7)
    public static final void method1808(int arg0, int arg1) {
        field4161++;
        if (!class200.field2869) {
            arg0 = -1;
        }
        if (class312.field4474 == arg0 || arg1 != 1) {
            return;
        }
        if (arg0 != -1) {
            class205 var2 = class393.method2575(arg0, 0);
            class25 var3 = var2.method1293(false);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class361.field5285.method7(var3.method231(), var3.method227(), new Point(var2.field2969, var2.field2967), var3.method219(), class319.field4561, -126);
                class312.field4474 = arg0;
            }
        }
        if (arg0 == -1 && class312.field4474 != -1) {
            class361.field5285.method7((int[]) null, -1, new Point(), -1, class319.field4561, arg1 ^ 0xFFFFFF80);
            class312.field4474 = -1;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 48)
    public static void method1809(int arg0) {
        field4160 = null;
        if (arg0 == 24069) {
            field4163 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V", line = 59)
    public static final void method1810(int arg0) {
        field4159++;
        if (class137.field1815 == 10 || class137.field1815 == 28) {
            class307.method1925(class237.field3326 >> 10, 5000, true, class7.field71 >> 10);
        } else {
            class307.method1925(class100.field1350.field303[0] >> 3, 5000, true, class100.field1350.field306[0] >> 3);
        }
        class344.method2265(0);
        class126.method861(32767);
        class137.method911((byte) -58);
        class238.method1454((byte) -67);
        if (arg0 != -9941) {
            field4160 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;)V", line = 79)
    public static final void method1811(int arg0, String arg1) {
        field4162++;
        if (class409.field6130 != null) {
            class232.field3279.method756(arg0, 71);
            class242.field3393++;
            class232.field3279.method1707(-116, class410.method2668((byte) -109, arg1));
            class232.field3279.method1662(arg1, (byte) 85);
        }
    }
}

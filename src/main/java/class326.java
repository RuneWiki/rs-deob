import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class326 extends class476 {

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Ljm;")
    public class209 field4455;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Lrb;")
    public static class283 field4460 = new class283(47, 2);

    @OriginalMember(owner = "client!le", name = "o", descriptor = "F")
    public static float field4461;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljm;)V", line = 4)
    public class326(class209 arg0) {
        this.field4455 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 13)
    public static void method1931(int arg0) {
        if (arg0 != 3) {
            method1934(127, -38, -67);
        }
        field4460 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZI)Z", line = 24)
    public static final boolean method1932(int arg0, boolean arg1, int arg2) {
        field4457++;
        if (arg1) {
            field4461 = 0.23831634F;
        }
        return class502.method2981(arg2, arg0, 22) | (arg0 & 0x70000) != 0 || class267.method1575(arg0, arg2, -418764735);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)[Ltp;", line = 36)
    public static final class141[] method1933(boolean arg0) {
        if (!arg0) {
            field4461 = 0.5634013F;
        }
        field4458++;
        return new class141[] { class88.field1429, class88.field1430, class88.field1431, class88.field1432, class88.field1433, class88.field1434, class88.field1435, class88.field1436, class88.field1437, class88.field1438, class88.field1439, class88.field1440 };
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)I", line = 47)
    public static final int method1934(int arg0, int arg1, int arg2) {
        field4456++;
        if (arg0 == 4 || arg0 == 5) {
            return class532.field7843[arg2 & 0x3];
        } else {
            if (arg1 > -98) {
                method1931(-30);
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 62)
    public static final void method1935(int arg0) {
        class274.method1602(14, class186.field2749);
        field4459++;
        class443.field6375++;
        class17.field275.method1891(false, class75.method586((byte) 72));
        class17.field275.method1857(561746448, class66.field953);
        class17.field275.method1857(561746448, class348.field5033);
        class17.field275.method1891(false, class76.field1075.field3689);
        if (arg0 != -30620) {
            field4461 = 1.5140733F;
        }
    }
}

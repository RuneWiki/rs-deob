import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class429 {

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field5826 = 0;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Ljs;")
    public static class275 field5825 = new class275(14, 0, 4, 1);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public int field5822;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Ljava/lang/String;")
    public String field5823;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2487(int arg0) {
        class106.field1298.method474((byte) -114);
        field5821++;
        class299.field3844.method214(0);
        class368.field4857.method2744(100);
        class16.field126.method1753(-63);
        class518.field7296.method146(true);
        class449.field6217.method2018(256);
        class393.field5190.method765(0);
        class344.field4461.method1391((byte) -51);
        class530.field7446.method2054(128);
        class29.field203.method3531(false);
        class16.field125.method3600(-1);
        class284.field3721.method3420(true);
        class450.field6233.method3243((byte) 12);
        class240.field3001.method3440(-116);
        class290.field3771.method2791(true);
        class562.field8276.method2982(-18);
        class643.field9362.method816((byte) -75);
        class76.field887.method2243((byte) 10);
        class290.field3765.method2037(false);
        class503.field6971.method3473(true);
        class605.method3481(true);
        class284.method1605((byte) -85);
        class411.method2349(-124);
        class187.method1025(0);
        class436.field5918.method3694(0);
        class220.field2716.method3694(0);
        class562.field8256.method3694(0);
        class29.field200.method3694(0);
        if (arg0 >= 41) {
            class630.field9059.method3694(0);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Ljava/lang/String;", line = 45)
    public static final String method2488(int arg0, int arg1) {
        if (arg1 != 11147) {
            method2488(60, -56);
        }
        field5824++;
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFF22F9) >> 16) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V", line = 56)
    public static void method2489(int arg0) {
        field5825 = null;
        if (arg0 >= -55) {
            field5825 = null;
        }
    }
}

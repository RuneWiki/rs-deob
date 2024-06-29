import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class class287 {

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field4391 = 0;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field4394 = 0;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Lpk;")
    public static class237 field4390;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lpk;")
    public static class237 field4392;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "[[[I")
    public static int[][][] field4389;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1904(int arg0) {
        if (arg0 != 2) {
            field4392 = null;
        }
        field4389 = null;
        field4390 = null;
        field4392 = null;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I")
    public abstract int method1651(int arg0);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1653(Component arg0, int arg1);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method1652(byte arg0, Component arg1);

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public static final void method1905(int arg0) {
        field4395++;
        if (class85.field1305 == 2) {
            if (class281.field4314 == class102.field1490 && class220.field3435 == class101.field1470) {
                class85.field1305 = 0;
                if (class172.field2521 && class293.field4451[81] && class51.field826 > 2) {
                    class198.method1325((byte) 109, class51.field826 - 2);
                } else {
                    class198.method1325((byte) -67, class51.field826 - 1);
                }
            }
        } else if (class157.field2303 == class102.field1490 && class87.field1317 == class101.field1470) {
            class85.field1305 = 0;
            if (class172.field2521 && class293.field4451[81] && class51.field826 > 2) {
                class198.method1325((byte) -22, class51.field826 - 2);
            } else {
                class198.method1325((byte) 15, class51.field826 - 1);
            }
        } else {
            class281.field4314 = class157.field2303;
            class85.field1305 = 2;
            class220.field3435 = class87.field1317;
        }
        if (arg0 != 0) {
            method1905(-118);
        }
    }
}

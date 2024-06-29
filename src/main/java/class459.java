import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class class459 {

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "Ljava/lang/Object;")
    public static Object field6703;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public static void method2661(int arg0) {
        field6703 = null;
        if (arg0 != -16603) {
            method2661(84);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method2662(int arg0, Component arg1);

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)I")
    public abstract int method2663(int arg0);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method2664(boolean arg0, String arg1) {
        field6704++;
        if (!arg0) {
            method2664(true, null);
        }
        if (class293.field4399 != null) {
            class348.field5348++;
            class97.method758(class95.field1472, !arg0);
            class43.field559.method2754(class521.method3084(arg1, 110), 5574);
            class43.field559.method2731(arg1, (byte) -32);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method2665(byte arg0, Component arg1);
}

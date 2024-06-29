import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class382 {

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "Z")
    public static boolean field4855 = false;

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)V")
    public static final void method2173(int arg0) {
        for (class375 var1 = (class375) class297.field3910.method1156(arg0 ^ arg0); var1 != null; var1 = (class375) class297.field3910.method1158(22706)) {
            class386.method2194(var1.field4808, arg0 + 11832);
        }
        field4856++;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class295 extends class213 {

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "Ljg;")
    public static class241 field4482 = new class241(64);

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "[I")
    public static int[] field4483;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "[S")
    public static short[] field4481;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(Z)V")
    public static final void method1833(boolean arg0) {
        field4484++;
        class241 var1 = class427.field6296;
        synchronized (class427.field6296) {
            if (!arg0) {
                field4483 = null;
            }
            class427.field6296.method1485(-22032);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static void method1834(int arg0) {
        if (arg0 >= -72) {
            method1834(28);
        }
        field4483 = null;
        field4482 = null;
        field4481 = null;
    }
}

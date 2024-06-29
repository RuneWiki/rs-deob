import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class276 {

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field4459 = -1;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4458 = new String[1000];

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIZ)V", line = 10)
    public static final void method2001(int arg0, int arg1, boolean arg2) {
        class102.field1486 = class61.field870[arg1][arg0].field2306;
        if (!arg2) {
            method2001(127, -99, true);
        }
        class210.field3444 = class61.field870[arg1][arg0].field2310;
        field4460++;
        class157.field2494 = class61.field870[arg1][arg0].field2299;
        class87.method594((float) class102.field1486, (float) class210.field3444, (float) class157.field2494);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lak;ZII)Lbf;", line = 30)
    public static final class58 method2002(class172 arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return (class58) null;
        } else {
            field4461++;
            return class55.method353(arg0, arg2, (byte) -5, arg3) ? class200.method1464(true) : null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 48)
    public static void method2003(int arg0) {
        field4458 = null;
        if (arg0 != -1) {
            field4458 = (String[]) null;
        }
    }
}

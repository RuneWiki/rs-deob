import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class366 extends class444 {

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field5455;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "F")
    public static float field5454;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZ)V")
    public static final void method2262(int arg0, int arg1, boolean arg2) {
        field5450++;
        class110 var3 = class455.method2749(92, arg2, arg1);
        if (arg0 != 21856) {
            field5454 = -0.47409412F;
        }
        if (var3 != null) {
            var3.method1525((byte) 102);
        }
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(B)Z")
    public final boolean method719(byte arg0) {
        if (arg0 <= 81) {
            method2263((byte) 47, 41);
        }
        field5452++;
        return false;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)V")
    public static final void method2263(byte arg0, int arg1) {
        field5449++;
        class396.field5817 = arg1;
        class156 var2 = class158.field2240;
        synchronized (class158.field2240) {
            class158.field2240.method1105(false);
        }
        if (arg0 != -3) {
            field5454 = 0.19173466F;
        }
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(B)Ljava/lang/Object;")
    public final Object method718(byte arg0) {
        field5451++;
        if (arg0 <= 22) {
            method2263((byte) 93, 69);
        }
        return this.field5455;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lbq;Ljava/lang/Object;I)V")
    public class366(class190 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5455 = arg1;
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(B)Lie;")
    public static final class6 method2264(byte arg0) {
        field5453++;
        try {
            return arg0 > -45 ? null : (class6) Class.forName("us").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}

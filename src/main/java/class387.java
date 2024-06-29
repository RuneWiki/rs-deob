import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class class387 {

    @OriginalMember(owner = "client!es", name = "b", descriptor = "Lrda;")
    public class663 field5405;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
    public abstract void method644(boolean arg0);

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BLvfa;Lha;)V")
    public static final void method2297(byte arg0, class672 arg1, class59 arg2) {
        field5404++;
        boolean var3 = class77.field948.method1167(arg0 - 5, arg1.field9295 | 0xFF000000, arg1.field9318, arg2, arg1.field9254, arg1.field9218, arg1.field9223, arg1.field9267 ? class472.field6475.field5333 : null) == null;
        if (var3) {
            class27.field433.method11(new class661(arg1.field9318, arg1.field9218, arg1.field9254, arg1.field9295 | 0xFF000000, arg1.field9223, arg1.field9267), -122);
            class399.method2347(arg1, 2260);
        }
        if (arg0 == -117) {
            ;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BZ)V")
    public abstract void method639(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Z")
    public abstract boolean method641(int arg0);

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(III)V")
    public abstract void method643(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lrda;)V")
    public class387(class663 arg0) {
        this.field5405 = arg0;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ZB)V")
    public abstract void method640(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BILiga;)V")
    public abstract void method638(byte arg0, int arg1, class460 arg2);
}

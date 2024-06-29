import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public abstract class class230 {

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public int field3394;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public int field3389;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public int field3391;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field3390 = -1;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field3393 = 0;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "Lht;")
    public static class418 field3388;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V")
    public static void method1427(boolean arg0) {
        field3388 = null;
        if (arg0) {
            field3390 = 102;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIB)V")
    public abstract void method409(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)V")
    public abstract void method408(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(III)V")
    public abstract void method406(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(III)V")
    public class230(int arg0, int arg1, int arg2) {
        this.field3394 = arg0;
        this.field3389 = arg1;
        this.field3391 = arg2;
    }
}

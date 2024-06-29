import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class299 extends class577 {

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public int field4323;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public int field4325;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "Ljia;")
    public static class643 field4324;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)I", line = 6)
    public static final int method1940(int arg0, int arg1) {
        int var2 = 14 / ((64 - arg1) / 49);
        field4322++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V", line = 21)
    public static void method1941(byte arg0) {
        field4324 = null;
        if (arg0 >= -116) {
            field4324 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(II)V", line = 30)
    public class299(int arg0, int arg1) {
        this.field4323 = arg0;
        this.field4325 = arg1;
    }
}

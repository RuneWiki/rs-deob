import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class322 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
    public static final void method2015(int arg0, int arg1) {
        if (arg1 == -1) {
            field4780++;
            class393.field5716 = arg0;
            class49.field573.method2037(true);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BII)Z")
    public static final boolean method2016(byte arg0, int arg1, int arg2) {
        field4781++;
        if (arg0 >= -59) {
            method2016((byte) 54, -29, 39);
        }
        return (arg2 & 0x70000) != 0 | class420.method2500(arg1, 255, arg2) || class559.method3273(27834, arg2, arg1);
    }
}

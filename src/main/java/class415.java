import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class415 {

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method2312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5325++;
        if (~class611.field8310.field8689 != arg5 && arg3 != 0 && class141.field1697 < 50 && arg1 != -1) {
            class266.field3358[class141.field1697++] = new class175((byte) 1, arg1, arg3, arg2, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)J", line = 22)
    public static final long method2313(byte arg0) {
        field5324++;
        int var1 = 19 / ((26 - arg0) / 55);
        return class71.field914.method798(2);
    }
}

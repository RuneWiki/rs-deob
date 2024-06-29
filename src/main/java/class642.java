import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class642 extends class619 {

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public int field8865;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public int field8863;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILkha;)I", line = 6)
    public static final int method3490(int arg0, class687 arg1) {
        field8866++;
        int var2 = arg0;
        if (arg1.method3827(class284.field3617, (byte) 57)) {
            var2 = arg0 + 1;
        }
        if (arg1.method3827(class34.field524, (byte) 86)) {
            var2++;
        }
        if (arg1.method3827(class401.field5558, (byte) 92)) {
            var2++;
        }
        if (arg1.method3827(class1.field4, (byte) 64)) {
            var2++;
        }
        if (arg1.method3827(class84.field1085, (byte) 88)) {
            var2++;
        }
        if (arg1.method3827(class634.field8785, (byte) 57)) {
            var2++;
        }
        if (arg1.method3827(class574.field8014, (byte) 59)) {
            var2++;
        }
        if (arg1.method3827(class244.field3143, (byte) 100)) {
            var2++;
        }
        if (arg1.method3827(class463.field6706, (byte) 87)) {
            var2++;
        }
        if (arg1.method3827(class462.field6703, (byte) 72)) {
            var2++;
        }
        if (arg1.method3827(class270.field3408, (byte) 61)) {
            var2++;
        }
        if (arg1.method3827(class266.field3366, (byte) 53)) {
            var2++;
        }
        if (arg1.method3827(class536.field7503, (byte) 77)) {
            var2++;
        }
        if (arg1.method3827(class28.field456, (byte) 109)) {
            var2++;
        }
        if (arg1.method3827(class477.field6823, (byte) 46)) {
            var2++;
        }
        if (arg1.method3827(class449.field6310, (byte) 48)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)Lqi;", line = 72)
    public final class669 method271(boolean arg0) {
        if (arg0) {
            this.method271(true);
        }
        field8868++;
        return class125.field1495;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lgq;Lkfa;IIIIIIIII)V", line = 88)
    public class642(class761 arg0, class407 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field8865 = arg9;
        this.field8863 = arg10;
    }
}

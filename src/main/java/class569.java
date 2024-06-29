import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class569 {

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public int field8078 = 128;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public int field8083 = 128;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public int field8075;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public int field8077;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public int field8081;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public int field8076;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Lht;")
    public static class581 field8074 = new class581();

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field8080;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field8082;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lpt;")
    public static class530 field8079;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)Lmk;")
    public static final class54 method3274(byte arg0) {
        int var1 = -4 % ((arg0 - 56) / 42);
        field8080++;
        return class288.method1884(-30727, 1);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Lhj;")
    public final class569 method3275(int arg0) {
        if (arg0 == 128) {
            field8082++;
            return new class569(this.field8075, this.field8083, this.field8078, this.field8077, this.field8081, this.field8076);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V")
    public static void method3276(byte arg0) {
        if (arg0 > -97) {
            method3274((byte) 68);
        }
        field8079 = null;
        field8074 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILhj;)V")
    public final void method3277(int arg0, class569 arg1) {
        this.field8083 = arg1.field8083;
        if (arg0 != 128) {
            return;
        }
        field8084++;
        this.field8077 = arg1.field8077;
        this.field8078 = arg1.field8078;
        this.field8076 = arg1.field8076;
        this.field8075 = arg1.field8075;
        this.field8081 = arg1.field8081;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(I)V")
    public class569(int arg0) {
        this.field8075 = arg0;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(IIIIII)V")
    private class569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8075 = arg0;
        this.field8077 = arg3;
        this.field8081 = arg4;
        this.field8078 = arg2;
        this.field8083 = arg1;
        this.field8076 = arg5;
    }
}

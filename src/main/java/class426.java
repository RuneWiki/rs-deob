import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class426 extends class425 {

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "Ljava/lang/String;")
    public String field6140;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)Lmu;")
    public static final class275 method2590(byte arg0) {
        int var1 = -93 % (-arg0 / 41);
        field6141++;
        return class304.field4514 == 0 ? new class275() : class425.field6135[--class304.field4514];
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
    public class426() {
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class426(String arg0) {
        this.field6140 = arg0;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILqh;)Lwh;")
    public static final class133 method2591(int arg0, class61 arg1) {
        if (arg0 != -1) {
            field6142 = -126;
        }
        field6143++;
        return new class133(arg1.method721(arg0 - 461515023), arg1.method721(-461515024), arg1.method721(-461515024), arg1.method721(-461515024), arg1.method721(-461515024), arg1.method721(-461515024), arg1.method721(-461515024), arg1.method721(-461515024), arg1.method740((byte) 124), arg1.method732(-559537960));
    }
}

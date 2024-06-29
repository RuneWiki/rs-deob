import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class422 implements class126 {

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public int field5877;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "Lrn;")
    public class380 field5881;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public int field5880;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    public int field5883;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "Lhv;")
    public class97 field5884;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "[Llu;")
    public static class427[] field5874 = null;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "Lpq;")
    public static class159 field5876;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "Z")
    public static boolean field5875;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)Ljv;", line = 11)
    public class606 method472(byte arg0) {
        if (arg0 != -110) {
            method2443((byte) 77);
        }
        field5882++;
        return class167.field2085;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V", line = 24)
    public static void method2443(byte arg0) {
        field5874 = null;
        int var1 = 73 / ((arg0 + 88) / 36);
        field5876 = null;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(ILrn;Lhv;II)V", line = 41)
    public class422(int arg0, class380 arg1, class97 arg2, int arg3, int arg4) {
        this.field5877 = arg3;
        this.field5881 = arg1;
        this.field5880 = arg4;
        this.field5883 = arg0;
        this.field5884 = arg2;
    }
}

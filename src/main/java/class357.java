import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class357 extends class372 {

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Loc;")
    public class129 field5299;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Liu;")
    public static class390 field5300;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "[I")
    public static int[] field5298;

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lrl;II[B)V")
    public class357(class487 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5299 = class379.method2293(arg0, arg3, false, arg2, 6406, 6406, false, arg1);
        this.field5299.method228(false, false, 0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method2171(byte arg0) {
        if (arg0 != 35) {
            method2171((byte) 15);
        }
        field5298 = null;
        field5300 = null;
    }
}

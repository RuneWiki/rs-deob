import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class class433 {

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "Lmu;")
    public static class303 field6189;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
    public abstract void method706(byte arg0);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIB[B)I")
    public abstract int method707(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public abstract void method704(int arg0);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIII)V")
    public static final void method2631(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6188++;
        class594 var5 = class692.method3869(arg1, (byte) 105, arg3);
        var5.method3378(-25490);
        var5.field8125 = arg2;
        var5.field8126 = arg0;
        var5.field8124 = arg4;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)V")
    public static void method2632(byte arg0) {
        if (arg0 >= -90) {
            field6189 = null;
        }
        field6189 = null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Z")
    public abstract boolean method708(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(III[B)V")
    public abstract void method703(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;
}

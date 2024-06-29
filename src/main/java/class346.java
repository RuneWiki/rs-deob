import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class346 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lcb;")
    public static class544 field5086;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static void method2195(int arg0) {
        field5086 = null;
        int var1 = -66 / ((arg0 - 7) / 62);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[B)I")
    public abstract int method200(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public abstract void method202(byte arg0);

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public abstract void method201(int arg0);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)Z")
    public abstract boolean method199(int arg0, byte arg1) throws IOException;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(III[B)V")
    public abstract void method196(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;
}

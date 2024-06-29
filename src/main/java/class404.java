import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class class404 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([BIIB)V")
    public abstract void method922(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public abstract void method913(int arg0);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public abstract void method916(byte arg0);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Z")
    public abstract boolean method921(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III[B)I")
    public abstract int method918(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;
}

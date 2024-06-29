import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class12 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field154 = -1;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III[B)V")
    public abstract void method64(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public abstract void method65(boolean arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Z")
    public abstract boolean method66(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public abstract void method67(int arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II[BI)I")
    public abstract int method68(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;
}

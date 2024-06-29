import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class class769 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public int field10596;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field10598;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field10599;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Ljava/lang/String;")
    public String field10597;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 3)
    public static final void method4256(int arg0) {
        if (arg0 <= 3) {
            method4256(-124);
        }
        class227.field3106 = 0;
        class619.field8341 = 0;
        class487.field6739 = 0;
        class608.field8273 = 0;
        field10599++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)Ljava/net/Socket;", line = 15)
    public final Socket method4257(boolean arg0) throws IOException {
        if (arg0) {
            return null;
        } else {
            field10598++;
            return new Socket(this.field10597, this.field10596);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method758(int arg0) throws IOException;
}

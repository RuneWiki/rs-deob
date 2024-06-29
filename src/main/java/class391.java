import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class391 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lmq;")
    public static class85 field5447;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Luf;I)Luf;", line = 7)
    public static final class519 method2345(class519 arg0, int arg1) {
        field5446++;
        class519 var2 = client.method886(arg0);
        if (var2 == null) {
            var2 = arg0.field7192;
        }
        if (arg1 != -30553) {
            method2345(null, 25);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 23)
    public static void method2346(int arg0) {
        field5447 = null;
        if (arg0 != -27469) {
            field5447 = null;
        }
    }
}

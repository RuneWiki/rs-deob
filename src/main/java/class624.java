import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public abstract class class624 extends class36 {

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "Z")
    public volatile boolean field9009 = true;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "Lea;")
    public static class474 field9006 = new class474("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "Lfea;")
    public static class123 field9010 = new class123();

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "Z")
    public boolean field9007;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "Z")
    public boolean field9008;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(Z)V", line = 16)
    public static void method3578(boolean arg0) {
        field9006 = null;
        if (!arg0) {
            method3578(false);
        }
        field9010 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)I")
    public abstract int method600(byte arg0);

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)[B")
    public abstract byte[] method603(byte arg0);
}

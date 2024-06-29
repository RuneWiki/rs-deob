import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public abstract class class20 {

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "J")
    public static long field198 = -1L;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "Lsv;")
    public static class570 field199 = new class570(0, -1);

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B[BII)V")
    public abstract void method181(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)V")
    public abstract void method182(int arg0);

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V")
    public abstract void method183(byte arg0);

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)V")
    public static void method184(int arg0) {
        if (arg0 > 101) {
            field199 = null;
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(I[BII)I")
    public abstract int method185(int arg0, byte[] arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(II)Z")
    public abstract boolean method186(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "()V")
    public static final void method187() {
        class316.field4495 = class316.field4508;
    }
}

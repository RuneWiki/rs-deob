import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class class648 extends class665 {

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Z")
    public volatile boolean field9187 = true;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field9186 = -1;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public static int field9190;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "Loba;")
    public static class237 field9185;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "Lpe;")
    public static class558 field9184;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "Z")
    public boolean field9188;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "Z")
    public boolean field9192;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
    public static final void method3607(byte arg0) {
        field9189++;
        class357.field5108 = 0;
        class604.field8394 = new class629[50];
        if (arg0 != -37) {
            field9184 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(Z)[B")
    public abstract byte[] method2239(boolean arg0);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
    public static final int method3608(int arg0, int arg1) {
        field9191++;
        if (arg1 != 0) {
            field9190 = -92;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)I")
    public abstract int method2241(int arg0);

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)V")
    public static void method3609(int arg0) {
        field9185 = null;
        if (arg0 == -24261) {
            field9184 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class36 {

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public int field567 = 0;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "Liu;")
    public static class390 field563 = null;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Lts;")
    public static class356 field564;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 12)
    public static void method291(int arg0) {
        field564 = null;
        field563 = null;
        if (arg0 < 69) {
            method291(-56);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lae;I)V", line = 23)
    public final void method292(class156 arg0, int arg1) {
        field566++;
        while (true) {
            int var3 = arg0.method941((byte) 124);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    method291(-121);
                    return;
                }
            }
            this.method293(arg0, (byte) 64, var3);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lae;BI)V", line = 43)
    private final void method293(class156 arg0, byte arg1, int arg2) {
        field565++;
        if (arg2 == 5) {
            this.field567 = arg0.method993((byte) -80);
        }
        if (arg1 != 64) {
            this.field567 = -29;
        }
    }
}

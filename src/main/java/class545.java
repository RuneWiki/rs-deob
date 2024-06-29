import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class545 {

    @OriginalMember(owner = "client!up", name = "i", descriptor = "I")
    private int field7588;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public static int field7587 = -1;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "Lmt;")
    public static class467 field7585;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "[[[Lug;")
    public static class472[][][] field7583;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IBI)Lsn;", line = 3)
    public static final class739 method3224(int arg0, byte arg1, int arg2) {
        field7586++;
        class739 var3 = new class739();
        var3.field10196 = -1;
        var3.field10183 = arg0 + 6;
        var3.field10176 = -1;
        var3.field10195 = arg2 + 1 + 5;
        var3.field10184 = new int[var3.field10183][var3.field10195];
        if (arg1 > -26) {
            return null;
        } else {
            var3.method4089(-1);
            return var3;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V", line = 23)
    public final void method3225(int arg0) {
        int var2 = -22 % ((-arg0 - 11) / 45);
        OpenGL.glEndList();
        field7581++;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IC)V", line = 35)
    public final void method3226(int arg0, char arg1) {
        OpenGL.glCallList(this.field7588 + arg1);
        if (arg0 == 6) {
            field7582++;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IB)V", line = 47)
    public final void method3227(int arg0, byte arg1) {
        field7584++;
        if (arg1 > -83) {
            this.method3227(11, (byte) 120);
        }
        OpenGL.glNewList(this.field7588 + arg0, 4864);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V", line = 59)
    public static void method3228(byte arg0) {
        field7583 = null;
        if (arg0 < 115) {
            field7583 = null;
        }
        field7585 = null;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lpq;I)V", line = 83)
    public class545(class194 arg0, int arg1) {
        this.field7588 = OpenGL.glGenLists(arg1);
    }
}

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class43 extends class159 {

    @OriginalMember(owner = "client!pja", name = "q", descriptor = "Ljb;")
    public static class519 field460 = new class519(91, -1);

    @OriginalMember(owner = "client!pja", name = "k", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "client!pja", name = "l", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!pja", name = "m", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!pja", name = "o", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!pja", name = "p", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "client!pja", name = "v", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!pja", name = "n", descriptor = "Laf;")
    public class459 field457;

    @OriginalMember(owner = "client!pja", name = "r", descriptor = "Lef;")
    public static class513 field461;

    @OriginalMember(owner = "client!pja", name = "u", descriptor = "Lmw;")
    public class517 field464;

    @OriginalMember(owner = "client!pja", name = "t", descriptor = "Ltn;")
    public static class95 field463;

    @OriginalMember(owner = "client!pja", name = "s", descriptor = "[[S")
    public static short[][] field462;

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(Z)V")
    public static void method239(boolean arg0) {
        field461 = null;
        field463 = null;
        field462 = null;
        field460 = null;
        if (!arg0) {
            method239(false);
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(IB)V")
    public static final void method240(int arg0, byte arg1) {
        field458++;
        class778 var2 = class389.method2406(100, (long) arg0, 9);
        if (arg1 > -121) {
            field461 = null;
        }
        var2.method4276(0);
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(Ljava/awt/Canvas;ILd;IB)Lha;")
    public static final class66 method241(Canvas arg0, int arg1, class161 arg2, int arg3, byte arg4) {
        if (arg4 != 78) {
            method241(null, 14, null, -13, (byte) 4);
        }
        field456++;
        return new class721(arg0, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(I)V")
    public final void method242(int arg0) {
        field455++;
        if (arg0 == 9 && class67.field935.length > class572.field7796) {
            class67.field935[class572.field7796++] = this;
        }
    }
}

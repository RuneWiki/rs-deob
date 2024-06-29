import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public abstract class class404 extends class101 {

    @OriginalMember(owner = "client!dda", name = "p", descriptor = "Ldia;")
    public class246 field5860;

    @OriginalMember(owner = "client!dda", name = "o", descriptor = "J")
    public static long field5859 = -1L;

    @OriginalMember(owner = "client!dda", name = "n", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!dda", name = "q", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!dda", name = "r", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!dda", name = "s", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!dda", name = "t", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!dda", name = "v", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!dda", name = "u", descriptor = "Z")
    public boolean field5865;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)Z")
    public final boolean method2516(int arg0) {
        if (arg0 != 917) {
            this.method2518(100);
        }
        field5861++;
        return this.field5865;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(BLtca;ILtca;)V")
    public abstract void method2223(byte arg0, class184 arg1, int arg2, class184 arg3);

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Z")
    public abstract boolean method2225(int arg0);

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(III)V")
    public abstract void method2231(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "(I)I")
    public int method2226(int arg0) {
        if (arg0 == 1) {
            field5863++;
            return 0;
        } else {
            return 58;
        }
    }

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "(I)I")
    public final int method2517(int arg0) {
        if (arg0 <= 113) {
            return 32;
        } else {
            field5858++;
            return 1;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IB)V")
    public abstract void method2224(int arg0, byte arg1);

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Ldia;)V")
    public class404(class246 arg0) {
        this.field5860 = arg0;
    }

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "(I)Z")
    public final boolean method2518(int arg0) {
        field5862++;
        if (arg0 != 1) {
            this.method2231(114, 80, 73);
        }
        return false;
    }

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "(I)V")
    public static final void method2519(int arg0) {
        field5864++;
        class617.field8329.method1555((byte) -3);
        if (arg0 != 0) {
            field5866 = -21;
        }
    }

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "(I)V")
    public abstract void method2228(int arg0);

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "(I)Z")
    public abstract boolean method2230(int arg0);
}

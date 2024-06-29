import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class227 {

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Lbi;")
    private class449 field3200;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Z")
    public static boolean field3195 = false;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Z")
    public static boolean field3199 = true;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILjava/lang/Object;Z)[B")
    public static final byte[] method1422(int arg0, int arg1, Object arg2, boolean arg3) {
        field3197++;
        if (arg2 == null) {
            return null;
        }
        if (arg3) {
            field3196 = 1;
        }
        if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class232.method1449(arg0, arg1, (byte) 59, var4);
        } else if (arg2 instanceof class711) {
            class711 var5 = (class711) arg2;
            return var5.method3065(arg0, arg1, 14342);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lpca;ILbi;)V")
    public class227(class671 arg0, int arg1, class449 arg2) {
        new class666(64);
        this.field3200 = arg2;
        this.field3198 = this.field3200.method2527(0, 15);
    }
}

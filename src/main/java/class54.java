import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class54 extends class594 {

    @OriginalMember(owner = "client!nca", name = "m", descriptor = "Lem;")
    public class600 field727;

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "Lim;")
    public static class353 field724 = new class353(63, 3);

    @OriginalMember(owner = "client!nca", name = "l", descriptor = "Z")
    public static boolean field726 = false;

    @OriginalMember(owner = "client!nca", name = "n", descriptor = "I")
    public static int field728 = 0;

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "[I")
    public static int[] field722;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIB)Z")
    public static final boolean method300(int arg0, int arg1, byte arg2) {
        if (arg2 <= 99) {
            method301((byte) -28);
        }
        field723++;
        return class53.method293(arg0, true, arg1) | (arg0 & 0x70000) != 0 || class313.method1969(arg1, (byte) 125, arg0);
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(B)V")
    public static void method301(byte arg0) {
        field722 = null;
        if (arg0 == 115) {
            field724 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Luq;II[B)V")
    public class54(class313 arg0, int arg1, int arg2, byte[] arg3) {
        this.field727 = class429.method2508(6406, arg3, arg2, arg0, 3553, arg1, false, 6406);
        this.field727.method2776(-102, false, false);
    }
}

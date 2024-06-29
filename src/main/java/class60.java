import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class60 extends class513 {

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "J")
    public long field822;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field823 = 0;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "[S")
    public static short[] field824 = new short[256];

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([BZBILep;III)Ldd;", line = 9)
    public static final class146 method392(byte[] arg0, boolean arg1, byte arg2, int arg3, class371 arg4, int arg5, int arg6, int arg7) {
        field825++;
        if (arg2 < 78) {
            field821 = 29;
        }
        if (!arg4.field4991 && (!class447.method2664(0, arg5) || !class447.method2664(0, arg6))) {
            return arg4.field5001 ? new class146(arg4, 34037, arg3, arg5, arg6, arg1, arg0, arg7) : new class146(arg4, arg3, arg5, arg6, class670.method3834(arg5, 23538), class670.method3834(arg6, 23538), arg0, arg7);
        } else {
            return new class146(arg4, 3553, arg3, arg5, arg6, arg1, arg0, arg7);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 29)
    public static void method393(byte arg0) {
        if (arg0 >= -67) {
            method393((byte) -52);
        }
        field824 = null;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 38)
    public class60() {
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(J)V", line = 40)
    public class60(long arg0) {
        this.field822 = arg0;
    }
}

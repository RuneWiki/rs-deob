import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class733 {

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public int field10144 = -1;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public int field10142 = -1;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public int field10147 = -1;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field10150 = -1;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public int field10139;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public int field10140;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public int field10141;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field10143;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public int field10145;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field10146;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public int field10148;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public int field10149;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBII)V", line = 3)
    public static final void method4095(int arg0, byte arg1, int arg2, int arg3) {
        field10146++;
        class114 var4 = class601.field8423[arg0][arg3];
        if (arg1 == 56) {
            class519.method3127((byte) -106, var4 == null ? class758.field10462 : var4, arg2);
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lvn;)V", line = 53)
    public class733(class330 arg0) {
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z", line = 32)
    public static final boolean method4096(int arg0, int arg1, int arg2) {
        if (arg0 < 25) {
            return false;
        } else {
            field10143++;
            return (arg2 & 0x800) != 0 | class65.method496(32768, arg1, arg2) || class346.method2194(arg1, arg2, (byte) -100);
        }
    }
}

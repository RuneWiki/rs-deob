import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class191 extends class28 {

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "[B")
    public byte[] field2484;

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!ega", name = "m", descriptor = "Ltn;")
    public static class197 field2486;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)I")
    public static final int method1225(int arg0, int arg1) {
        return class659.field9291 == null ? 0 : class659.field9291[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "([B)V")
    public class191(byte[] arg0) {
        this.field2484 = arg0;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIII)I")
    public static final int method1226(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 16) {
            return -62;
        }
        field2485++;
        if (arg1 > arg0) {
            return arg1;
        } else if (arg2 >= arg0) {
            return arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(III)Z")
    public static final boolean method1227(int arg0, int arg1, int arg2) {
        if (arg2 < 54) {
            field2486 = null;
        }
        field2483++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
    public static void method1228(int arg0) {
        if (arg0 != 0) {
            method1227(81, 17, 103);
        }
        field2486 = null;
    }
}

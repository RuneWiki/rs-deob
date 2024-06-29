import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class190 extends class333 {

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public int field2177;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public int field2179;

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "Z")
    public static boolean field2181 = false;

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "I")
    public static int field2182 = -1;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "[J")
    public static long[] field2178;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method1152(int arg0, int arg1, int arg2) {
        field2180++;
        if (arg2 == 262144) {
            return (arg0 & 0x40000) != 0 | class480.method2764(arg1, (byte) -1, arg0) || class102.method555(-112, arg1, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V", line = 15)
    public static void method1153(int arg0) {
        if (arg0 != 8128) {
            method1152(27, 77, 26);
        }
        field2178 = null;
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(II)V", line = 29)
    public class190(int arg0, int arg1) {
        this.field2177 = arg0;
        this.field2179 = arg1;
    }
}

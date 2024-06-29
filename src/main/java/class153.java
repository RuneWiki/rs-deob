import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class153 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public int field2438;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public int field2445;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public int field2448;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public int field2440;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Z")
    public static boolean field2439 = false;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field2444 = 1401;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Lfd;")
    public static class467 field2446;

    @OriginalMember(owner = "client!hk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2443++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)I")
    public static final int method1201(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 122 % ((arg1 - 28) / 51);
        field2441++;
        if ((class336.field4782[arg3][arg2][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (class336.field4782[1][arg2][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static void method1202(byte arg0) {
        field2446 = null;
        if (arg0 != -25) {
            method1202((byte) 121);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)Luf;")
    public static final class519 method1203(int arg0, int arg1, int arg2) {
        field2442++;
        class519 var3 = class604.method3506(arg2, 255);
        if (~arg1 == arg0) {
            return var3;
        } else if (var3 == null || var3.field7170 == null || var3.field7170.length <= arg1) {
            return null;
        } else {
            return var3.field7170[arg1];
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIII)V")
    public class153(int arg0, int arg1, int arg2, int arg3) {
        this.field2438 = arg1;
        this.field2445 = arg2;
        this.field2448 = arg3;
        this.field2440 = arg0;
    }
}

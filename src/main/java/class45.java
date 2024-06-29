import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class45 extends class141 {

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Lhi;")
    public class82 field772;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Lhi;")
    public static class82 field768 = class95.method664((byte) -47, "http:)4)4");

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public static int field774 = 0;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Ljava/util/Random;")
    public static Random field773 = new Random();

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V", line = 5)
    public static void method331(int arg0) {
        field768 = null;
        field773 = null;
        if (arg0 <= 48) {
            method333(-81, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)I", line = 38)
    public static final int method332(int arg0, int arg1) {
        field770++;
        if (arg1 <= 8) {
            return -106;
        } else if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[B)[B", line = 64)
    public static final byte[] method333(int arg0, byte[] arg1) {
        field769++;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = -98 % ((-arg0 - 48) / 32);
            byte[] var3 = new byte[arg1.length];
            class190.method1323(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V", line = 90)
    public class45() {
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lhi;I)V", line = 92)
    public class45(class82 arg0, int arg1) {
        this.field772 = arg0;
    }
}

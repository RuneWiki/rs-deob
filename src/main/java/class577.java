import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class577 extends class270 {

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "J")
    public long field8239;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field8240 = 0;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "Lqv;")
    public static class406 field8238 = new class406(5, 1);

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "J")
    public static long field8242 = -1L;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3262(boolean arg0, int arg1, int arg2) {
        field8241++;
        if (arg0) {
            field8242 = -120L;
        }
        return (arg2 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method3263(int arg0) {
        int var1 = -25 % ((arg0 - 7) / 57);
        field8238 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I")
    public static final int method3264(int arg0, int arg1) {
        return class398.field5323 == null ? 0 : class398.field5323[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class577() {
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(J)V")
    public class577(long arg0) {
        this.field8239 = arg0;
    }
}

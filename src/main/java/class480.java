import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class480 {

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    public int field6679;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public int field6681;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "B")
    public byte field6674;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
    public int field6684;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public int field6672;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public int field6680;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "[[Z")
    public static boolean[][] field6675 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "Z")
    public static boolean field6682 = false;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "Lsk;")
    public static class452 field6686 = new class452(4);

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "Lql;")
    public class161 field6677;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "Lmo;")
    public static class361 field6673;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "Ljq;")
    public class486 field6676;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "Lpga;")
    public class577 field6671;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "Lbga;")
    public class655 field6683;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "[I")
    public static int[] field6685;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZIBII)V")
    public static final void method2761(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 <= -81) {
            field6678++;
            if (class60.method341(arg1, 0)) {
                class427.method2416(0, arg0, -1, arg4, class124.field1729[arg1], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)Z")
    public final boolean method2762(byte arg0) {
        field6670++;
        if (arg0 != 104) {
            field6682 = false;
        }
        return this.field6674 == 2 || this.field6674 == 3;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    public static void method2763(int arg0) {
        field6686 = null;
        field6675 = null;
        field6673 = null;
        field6685 = null;
        if (arg0 != -1) {
            method2761(false, -111, (byte) 117, -73, 30);
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(BIIIII)V")
    public class480(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6679 = arg2;
        this.field6681 = arg3;
        this.field6674 = arg0;
        this.field6684 = arg4;
        this.field6672 = arg5;
        this.field6680 = arg1;
    }
}

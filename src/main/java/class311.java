import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class311 extends class633 implements class305 {

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    private int field4411;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "[[Z")
    public static boolean[][] field4414 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Lrl;")
    public static class713 field4416 = new class713();

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)I")
    public final int method1330(int arg0) {
        if (arg0 != 22302) {
            field4414 = null;
        }
        ++field4415;
        return 0;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Llea;ILjaclib/memory/Buffer;)V")
    public class311(class573 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field4411 = arg1;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Llea;I[BI)V")
    public class311(class573 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4411 = arg1;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public static void method1904(int arg0) {
        if (arg0 != -21772) {
            method1904(53);
        }
        field4416 = null;
        field4414 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([BIII)V")
    public final void method1332(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 30192) {
            field4414 = null;
        }
        ++field4412;
        this.method3612(arg0, arg1);
        this.field4411 = arg2;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)J")
    public final long method1333(byte arg0) {
        if (arg0 < 13) {
            field4414 = null;
        }
        ++field4413;
        return super.field8946.getAddress();
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)I")
    public final int method1335(int arg0) {
        if (arg0 != 6729) {
            this.method1330(58);
        }
        ++field4410;
        return this.field4411;
    }
}

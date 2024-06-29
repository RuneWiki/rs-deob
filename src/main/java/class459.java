import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class459 {

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public int field6515 = 16777215;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public int field6525 = 8;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Lsb;")
    public static class305 field6519 = new class305(46, 1);

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "[[Z")
    public static boolean[][] field6523 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "F")
    public static float field6517;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public int field6513;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public int field6514;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public int field6516;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public int field6518;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public int field6522;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "Z")
    public boolean field6524;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILnp;)V")
    public final void method2629(int arg0, class115 arg1) {
        while (true) {
            int var3 = arg1.method620((byte) -128);
            if (var3 == 0) {
                field6520++;
                if (arg0 != -6) {
                    field6517 = 0.047235675F;
                    return;
                }
                return;
            }
            this.method2631(var3, arg1, arg0 ^ 0xFFFFF199);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method2630(int arg0) {
        field6523 = null;
        if (arg0 != -1) {
            method2630(-5);
        }
        field6519 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILnp;I)V")
    private final void method2631(int arg0, class115 arg1, int arg2) {
        if (arg2 != 3683) {
            field6519 = null;
        }
        if (arg0 == 1) {
            this.field6525 = arg1.method643((byte) -77);
        } else if (arg0 == 2) {
            this.field6524 = true;
        } else if (arg0 == 3) {
            this.field6514 = arg1.method676(-5);
            this.field6522 = arg1.method676(-5);
            this.field6518 = arg1.method676(-5);
        } else if (arg0 == 4) {
            this.field6516 = arg1.method620((byte) -127);
        } else if (arg0 == 5) {
            this.field6513 = arg1.method643((byte) -77);
        } else if (arg0 == 6) {
            this.field6515 = arg1.method675(-127);
        }
        field6521++;
    }
}

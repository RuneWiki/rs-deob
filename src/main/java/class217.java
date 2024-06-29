import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class217 {

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Z")
    public boolean field3578 = true;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public int field3592;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public int field3582;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public int field3573;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public int field3583;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public int field3577;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public int field3586;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lok;")
    public static class146 field3584 = class235.method1724(-12908, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[Z")
    public static boolean[] field3574 = new boolean[200];

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static volatile int field3580 = 0;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Lok;")
    public static class146 field3585 = class235.method1724(-12908, "details");

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lok;")
    public static class146 field3589 = class235.method1724(-12908, "");

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field3587 = 0;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field3579 = -1;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3576 = 0;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Loh;")
    public static class15 field3588;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 27)
    public static void method1607(int arg0) {
        field3574 = null;
        field3589 = null;
        if (arg0 != 200) {
            method1608((byte) -76);
        }
        field3585 = null;
        field3584 = null;
        field3588 = null;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIIIIZ)V", line = 88)
    public class217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3592 = arg3;
        this.field3582 = arg5;
        this.field3573 = arg1;
        this.field3578 = arg6;
        this.field3583 = arg4;
        this.field3577 = arg2;
        this.field3586 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)I", line = 51)
    public static final int method1608(byte arg0) {
        field3590++;
        if (class107.field1732 == 0) {
            return 0;
        } else {
            if (arg0 <= 55) {
                method1608((byte) 122);
            }
            return class200.field3348[class107.field1732].method515();
        }
    }
}

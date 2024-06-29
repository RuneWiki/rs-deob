import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class189 extends class627 {

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "I")
    public int field2481;

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "Z")
    public boolean field2477;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
    public int field2474;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "I")
    public int field2484;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
    public static int field2480 = -1;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "Lmq;")
    public static class78 field2475 = new class78(24, 4);

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "I")
    public static int field2485 = 100;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)Z")
    public static final boolean method1198(int arg0, int arg1) {
        field2476++;
        if (arg1 > -122) {
            return true;
        } else {
            return arg0 == 7 || arg0 == 8 || arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)Z")
    public static final boolean method1199(int arg0, int arg1, int arg2) {
        if (arg1 != 24) {
            field2478 = -61;
        }
        field2482++;
        return (arg2 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public static void method1200(int arg0) {
        if (arg0 == 21154) {
            field2475 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(IIIIIZ)V")
    public class189(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2483 = arg0;
        this.field2481 = arg4;
        this.field2479 = arg2;
        this.field2477 = arg5;
        this.field2474 = arg1;
        this.field2484 = arg3;
    }
}

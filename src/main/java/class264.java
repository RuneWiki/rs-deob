import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class264 {

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Lna;")
    public static class31 field4652 = new class31();

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lsb;")
    public static class221 field4653 = new class221(50);

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lp;")
    public static class280 field4656 = class18.method140((byte) -118, "<col=ff7000>");

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "[I")
    public static int[] field4658 = new int[32];

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field4659 = 20;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Lua;")
    public static class113 field4657 = null;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Z")
    public static volatile boolean field4661 = false;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lp;")
    public static class280 field4660 = class18.method140((byte) -127, "blinken2:");

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "Lp;")
    public static class280 field4662 = class18.method140((byte) -123, ")0");

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field4663 = 0;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "[I")
    public static int[] field4664 = new int[1000];

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Lpf;")
    public static class281 field4665;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)I")
    public static final int method1783(boolean arg0) {
        field4649++;
        if (!arg0) {
            field4656 = null;
        }
        return ((class54.field892 == 0 ? 0 : 1) << 22) + ((class261.field4617 == 0 ? 0 : 1) << 20) + ((class81.field1332 ? 1 : 0) << 9) + (((class160.field2810 ? 1 : 0) << 7) + ((class12.field252 ? 1 : 0) << 5) + ((class140.field2430 ? 1 : 0) << 4) + ((class92.field1501 ? 1 : 0) << 3) + (class120.field2126 & 0x7) + (((class83.field1376 ? 1 : 0) << 6) - -((class2.field80 ? 1 : 0) << 8) + ((class215.field3720 ? 1 : 0) << 10) - -(class17.field316 & 0x3 << 11)) - (-((class273.field4754 ? 1 : 0) << 13) + -((class183.field3219 ? 1 : 0) << 15) - ((class3.field101 ? 1 : 0) << 16) - (((class157.field2752 ? 1 : 0) << 19) - (-((class188.field3307 == 0 ? 0 : 1) << 21) - (class95.method669() << 23)))));
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method1784(int arg0) {
        field4662 = null;
        field4656 = null;
        field4660 = null;
        field4653 = null;
        field4664 = null;
        field4658 = null;
        field4652 = null;
        field4657 = null;
        if (arg0 != 2762) {
            method1783(true);
        }
        field4665 = null;
    }
}

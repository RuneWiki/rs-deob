import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class283 extends class418 {

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "J")
    public long field4288;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V", line = 5)
    public static final void method1938(int arg0, int arg1) {
        class143.field1818 = new int[arg0];
        class399.field5850 = new int[arg0];
        if (arg1 != -5) {
            method1938(-22, 25);
        }
        class110.field1437 = new int[arg0];
        class231.field3184 = new int[arg0];
        field4287++;
        class406.field5915 = new int[arg0];
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)V", line = 21)
    public static final void method1939(int arg0, int arg1) {
        field4289++;
        class136.field1761.method379(arg0, false);
        class244.field3423.method379(arg0, false);
        if (arg1 == 3) {
            class238.field3332.method379(arg0, false);
            class117.field1523.method379(arg0, false);
            class398.field5828.method379(arg0, false);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lw;I)Z", line = 38)
    public static final boolean method1940(class170 arg0, int arg1) {
        field4286++;
        if (arg1 != 5) {
            return false;
        } else if (arg0 == null) {
            return false;
        } else if (!arg0.field2322) {
            return false;
        } else if (!arg0.method1138(-4123)) {
            return false;
        } else if (class247.field3476.method2826(false, (long) arg0.field2300) == null) {
            return class328.field4842.method2826(false, (long) arg0.field2299) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V", line = 70)
    public class283() {
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(J)V", line = 72)
    public class283(long arg0) {
        this.field4288 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)I", line = 81)
    public static final int method1941(int arg0, int arg1, int arg2) {
        if (arg0 == 5) {
            field4285++;
            return arg2 == 4 || arg2 == 5 ? class113.field1464[arg1 & 0x3] : 256;
        } else {
            return -17;
        }
    }
}

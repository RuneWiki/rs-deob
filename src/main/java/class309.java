import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class309 extends class159 {

    @OriginalMember(owner = "client!tha", name = "q", descriptor = "I")
    public int field4386;

    @OriginalMember(owner = "client!tha", name = "k", descriptor = "I")
    public int field4380;

    @OriginalMember(owner = "client!tha", name = "p", descriptor = "[I")
    public static int[] field4385 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!tha", name = "m", descriptor = "Lmw;")
    public static class517 field4382 = new class517(18, 3);

    @OriginalMember(owner = "client!tha", name = "r", descriptor = "Ljb;")
    public static class519 field4387 = new class519(2, 6);

    @OriginalMember(owner = "client!tha", name = "l", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!tha", name = "n", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!tha", name = "o", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(BII)Z", line = 3)
    public static final boolean method1995(byte arg0, int arg1, int arg2) {
        if (arg0 >= -31) {
            method1995((byte) -42, 110, -82);
        }
        field4381++;
        return class469.method2751(0, arg1, arg2) || class84.method680(arg2, arg1, (byte) 80);
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V", line = 15)
    public static void method1996(byte arg0) {
        field4387 = null;
        field4382 = null;
        field4385 = null;
        if (arg0 >= -60) {
            field4387 = null;
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)Lpja;", line = 27)
    public static final class43 method1997(int arg0) {
        field4383++;
        if (class572.field7796 == 0) {
            return new class43();
        } else {
            if (arg0 != 69) {
                field4382 = null;
            }
            return class67.field935[--class572.field7796];
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(BC)C", line = 50)
    public static final char method1998(byte arg0, char arg1) {
        field4384++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg0 < 118) {
            return '7';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(II)V", line = 84)
    public class309(int arg0, int arg1) {
        this.field4386 = arg1;
        this.field4380 = arg0;
    }
}

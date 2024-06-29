import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class200 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "S")
    public static short field3454 = 256;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "J")
    public static long field3456 = 0L;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lsc;")
    public static class181 field3455 = class149.method967(255, ")3runescape)3com");

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Lsc;")
    public static class181 field3459 = class149.method967(255, " (X");

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method1349(int arg0) {
        if (arg0 != 1) {
            field3455 = null;
        }
        field3459 = null;
        field3455 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)I")
    public static final int method1350(int arg0, int arg1, int arg2) {
        field3458++;
        if (arg1 == -3422) {
            int var3 = class12.method120(arg2 - 1, arg0 + -1, (byte) -124) + class12.method120(arg2 + 1, arg0 - 1, (byte) -124) + (class12.method120(arg2 + -1, arg0 + 1, (byte) -124) - -class12.method120(arg2 + 1, arg0 + 1, (byte) -124));
            int var4 = class12.method120(arg2 - 1, arg0, (byte) -124) + (class12.method120(arg2 + 1, arg0, (byte) -124) + class12.method120(arg2, arg0 - 1, (byte) -124)) + class12.method120(arg2, arg0 + 1, (byte) -124);
            int var5 = class12.method120(arg2, arg0, (byte) -124);
            return var3 / 16 + var4 / 8 + var5 / 4;
        } else {
            return 83;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILph;)Lph;")
    public abstract class31 method890(int arg0, class31 arg1);
}

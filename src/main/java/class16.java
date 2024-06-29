import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class16 extends class132 {

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Lvd;")
    private static class222 field416 = class212.method1357("Loading)3)3)3", 10731);

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Lvd;")
    public static class222 field419 = field416;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Lvd;")
    private static class222 field420 = class212.method1357("Login limit exceeded)3", 10731);

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "[I")
    public static int[] field417 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Lvd;")
    public static class222 field415 = class212.method1357("Ihr Spielkonto wird bereits benutzt)3", 10731);

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "Lvd;")
    public static class222 field424 = field420;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIB)Z")
    public static final boolean method142(int arg0, int arg1, byte arg2) {
        if (arg2 == 18) {
            field422++;
            return (arg1 >> arg0 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;")
    public static final Object method143(boolean arg0, byte arg1, byte[] arg2) {
        field421++;
        int var3 = 57 / ((5 - arg1) / 47);
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class139.field2689) {
            try {
                class18 var4 = (class18) Class.forName("ed").getDeclaredConstructor().newInstance();
                var4.method151(arg2, -4532);
                return var4;
            } catch (Throwable var5) {
                class139.field2689 = true;
            }
        }
        return arg0 ? class182.method1141(108, arg2) : arg2;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
    public static void method144(byte arg0) {
        if (arg0 != -49) {
            return;
        }
        field416 = null;
        field420 = null;
        field424 = null;
        field415 = null;
        field417 = null;
        field419 = null;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(II)V")
    public class16(int arg0, int arg1) {
        this.field425 = arg0;
        this.field418 = arg1;
    }
}

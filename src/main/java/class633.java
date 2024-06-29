import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class class633 extends class190 {

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "Lpr;")
    public static class407 field8970 = new class407(18, 3);

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "[[[I")
    public static int[][][] field8973 = new int[2][][];

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "Ljo;")
    public static class303 field8972;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(B)V", line = 6)
    public static void method3540(byte arg0) {
        field8970 = null;
        field8972 = null;
        field8973 = null;
        if (arg0 < 46) {
            method3540((byte) -15);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)Lsda;", line = 18)
    public static final class234 method3541(int arg0) {
        field8969++;
        try {
            if (arg0 != 31264) {
                method3540((byte) 3);
            }
            return (class234) Class.forName("iba").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)Z", line = 35)
    public static final boolean method3542(int arg0, int arg1) {
        int var2 = 1 / ((58 - arg0) / 32);
        field8968++;
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)Lng;")
    public abstract class310 method1631(int arg0);
}

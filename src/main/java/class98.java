import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class98 extends class51 {

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "Led;")
    public static class43 field1894 = class191.method1219(" x ", false);

    @OriginalMember(owner = "client!kg", name = "eb", descriptor = "I")
    public static int field1898 = 0;

    @OriginalMember(owner = "client!kg", name = "db", descriptor = "I")
    public static int field1897 = -1;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!kg", name = "cb", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!kg", name = "fb", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!kg", name = "gb", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)Lnh;")
    public static final class126 method613(int arg0, int arg1) {
        class126 var2 = (class126) class129.field2601.method1106(arg1 ^ 108, (long) arg0);
        ++field1899;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class108.field2062.method367(arg1, arg0, (byte) -34);
            class126 var4 = new class126();
            if (var3 != null) {
                var4.method808(arg1 + -112, new class89(var3));
            }
            class129.field2601.method1107((long) arg0, var4, 68);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V")
    public static void method614(byte arg0) {
        if (arg0 != 29) {
            method613(-51, 112);
        }
        field1894 = null;
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(B)Ldc;")
    public static final class33 method615(byte arg0) {
        ++field1893;
        try {
            int var1 = 38 / ((arg0 - -17) / 62);
            return (class33) Class.forName("ne").newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class98() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field1896;
        if (arg0 != 16) {
            this.method27(30, -67);
        }
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            class42.method233(var3, 0, class122.field2442, class40.field771[arg1]);
        }
        return var3;
    }
}

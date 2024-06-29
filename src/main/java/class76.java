import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class76 extends class147 {

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "Lwb;")
    public static class45 field913 = new class45(64);

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public static int field916 = 0;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field921 = -2;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "Lg;")
    public static class470 field919;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(JB)V")
    public static final void method386(long arg0, byte arg1) {
        if (arg1 != 30) {
            method388((byte) 73);
        }
        field915++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)Lwd;")
    public static final class39 method387(boolean arg0) {
        field917++;
        try {
            return arg0 ? (class39) Class.forName("ut").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V")
    public static void method388(byte arg0) {
        field919 = null;
        if (arg0 == -122) {
            field913 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(II)V")
    public class76(int arg0, int arg1) {
        this.field918 = arg1;
        this.field914 = arg0;
    }
}

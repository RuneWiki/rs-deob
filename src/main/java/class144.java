import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class144 {

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field2076 = 1338;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field2077 = 0;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lvh;")
    public static class93 field2075;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public static void method957(boolean arg0) {
        if (!arg0) {
            method958(74);
        }
        field2075 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)Lik;")
    public static final class78 method958(int arg0) {
        if (arg0 != -13300) {
            return null;
        }
        field2074++;
        try {
            return (class78) Class.forName("pr").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}

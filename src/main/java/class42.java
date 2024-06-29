import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class42 extends class54 {

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "Lkh;")
    private static class117 field934 = class224.method1450((byte) 113, "flash3:");

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "Lkh;")
    public static class117 field936 = field934;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Lkh;")
    private static class117 field938 = class224.method1450((byte) 126, "Loading)3)3)3");

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Lkh;")
    public static class117 field941 = field934;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Lkh;")
    public static class117 field935 = field938;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "Ljava/util/Random;")
    public static Random field939 = new Random();

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "Lkh;")
    private static class117 field945 = class224.method1450((byte) -79, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "Lkh;")
    public static class117 field942 = field945;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "Lkh;")
    public static class117 field944 = class224.method1450((byte) 20, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "[I")
    public static int[] field940;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)Lkh;")
    public static final class117 method358(int arg0, byte arg1) {
        if (arg1 == 34) {
            field937++;
            return class125.method868((byte) -105, false, arg0, 10);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
    public static void method359(int arg0) {
        field942 = null;
        if (arg0 > -117) {
            method358(72, (byte) 11);
        }
        field944 = null;
        field936 = null;
        field938 = null;
        field940 = null;
        field945 = null;
        field941 = null;
        field934 = null;
        field935 = null;
        field939 = null;
    }
}

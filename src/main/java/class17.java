import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class17 {

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
    public static boolean field310 = false;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field309 = 0;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Ljava/lang/String;")
    public static String field306 = "Loaded update list";

    @OriginalMember(owner = "client!n", name = "c", descriptor = "[Lwb;")
    public static class28[] field308 = new class28[29];

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([BB)Lge;")
    public static final class73 method132(byte[] arg0, byte arg1) {
        field312++;
        if (arg1 > -48) {
            method132((byte[]) null, (byte) 119);
        }
        if (arg0 == null) {
            return null;
        } else {
            class190 var2 = new class190(arg0, class80.field1286, class211.field3364, class217.field3413, class140.field2284, class232.field3635);
            class180.method1265(102);
            return var2;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method133(int arg0) {
        if (arg0 != 22878) {
            method133(-12);
        }
        field306 = null;
        field308 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lgi;ZLgi;)V")
    public static final void method134(class164 arg0, boolean arg1, class164 arg2) {
        field307++;
        class91.field1436 = arg2;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        class22.field414 = arg0;
        class91.field1436.method1145((byte) 114, 34);
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        class97.field1533 = var4 + var6;
        if (!arg1) {
            class238.field3742 = var3 + var6;
            class159.field2605 = var5 + var6;
        }
    }
}

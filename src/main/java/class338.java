import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class338 extends class145 {

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "Ljava/lang/String;")
    public static String field5406 = "Loading...";

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field5410 = 0;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field5408 = 0;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "Lcg;")
    public static class49 field5412;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "[Lta;")
    public static class217[] field5409;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)V", line = 11)
    public static final void method2384(int arg0) {
        field5407++;
        class161.field2862.method466(arg0 - 9);
        if (arg0 == 8) {
            class17.field259.method466(-1);
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V", line = 31)
    public static final void method2385(byte arg0) {
        field5405++;
        int var1 = 67 % ((12 - arg0) / 59);
        class341.field5438.method470(12);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 43)
    public static final String method2386(int arg0, byte arg1) {
        String var2 = Integer.toString(arg0);
        field5411++;
        if (arg1 != 16) {
            return (String) null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() <= 9) {
            return var2.length() <= 6 ? " <col=ffff00>" + var2 + "</col>" : " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class351.field5560 + " (" + var2 + ")</col>";
        } else {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class74.field1225 + " (" + var2 + ")</col>";
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V", line = 75)
    public static void method2387(byte arg0) {
        field5409 = null;
        field5412 = null;
        field5406 = null;
        if (arg0 != -13) {
            method2385((byte) -38);
        }
    }
}

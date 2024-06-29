import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class221 {

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field3838 = 2;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Loa;")
    public static class99 field3839 = method1463(2844, "Module texte charg-B");

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field3844 = 0;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static volatile int field3846 = -1;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field3847 = 2;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Loa;")
    private static class99 field3845 = method1463(2844, " has logged out)3");

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Loa;")
    public static class99 field3848 = field3845;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "[I")
    public static int[] field3842;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/String;)Loa;")
    public static final class99 method1463(int arg0, String arg1) {
        field3840++;
        byte[] var2 = arg1.getBytes();
        if (arg0 != 2844) {
            return null;
        }
        int var3 = 0;
        int var4 = var2.length;
        class99 var5 = new class99();
        var5.field1697 = new byte[var4];
        while (var3 < var4) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 <= var3) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field1697[var5.field1682++] = (byte) (var6 * 43 + (var7 - 1768));
            } else if (var6 != 0) {
                var5.field1697[var5.field1682++] = (byte) var6;
            }
        }
        var5.method670(19541);
        return var5.method683(4096);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ltg;III)[Laa;")
    public static final class170[] method1464(class182 arg0, int arg1, int arg2, int arg3) {
        field3841++;
        if (class153.method1016(arg3, 21451, arg0, arg1)) {
            if (arg2 != 0) {
                method1464((class182) null, -73, -82, -100);
            }
            return class24.method182(6983);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
    public static void method1465(boolean arg0) {
        field3848 = null;
        field3839 = null;
        if (arg0) {
            method1463(-68, (String) null);
        }
        field3842 = null;
        field3845 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
    public static final void method1466(int arg0, int arg1, int arg2) {
        class9.field71++;
        field3849++;
        if (arg0 <= -50) {
            class131.field2277.method966((byte) 49, 87);
            class131.field2277.method1750(arg2, 8248);
            class131.field2277.method1697(arg1, -121);
        }
    }
}

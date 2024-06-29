import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class228 {

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "J")
    public long field3631 = 0L;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3625 = "Loading fonts - ";

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public int field3621;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public int field3622;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public int field3624;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public int field3630;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public int field3632;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public int field3633;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    public int field3634;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Lwb;")
    public class253 field3623;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "Lwb;")
    public class253 field3628;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "[[[B")
    public static byte[][][] field3626;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 7)
    public static void method1614(int arg0) {
        if (arg0 > -19) {
            method1616((String) null, -121);
        }
        field3625 = null;
        field3626 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V", line = 19)
    public static final void method1615(int arg0) {
        field3629++;
        class160.field2416.method1968(0);
        class50.field803 = null;
        class225.field3583 = arg0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 34)
    public static final int method1616(String arg0, int arg1) {
        field3635++;
        if (arg1 != -27002) {
            field3627 = -112;
        }
        for (int var2 = 0; var2 < class96.field1532.length; var2++) {
            if (class96.field1532[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }
}

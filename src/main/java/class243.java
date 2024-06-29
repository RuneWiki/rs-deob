import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class243 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3893 = "flash2:";

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Z")
    public static volatile boolean field3899 = false;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static volatile int field3897 = 0;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Lsj;")
    public static class48 field3892 = new class48();

    @OriginalMember(owner = "client!r", name = "k", descriptor = "[S")
    public static short[] field3901 = new short[256];

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "[I")
    public static int[] field3895;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[[[B")
    public static byte[][][] field3894;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static final void method1597(int arg0) {
        field3891++;
        for (class54 var1 = (class54) class76.field1041.method365(3); var1 != null; var1 = (class54) class76.field1041.method372((byte) 7)) {
            if (var1.field770) {
                var1.method419((byte) -57);
            }
        }
        if (arg0 != 0) {
            method1597(-71);
        }
        for (class54 var2 = (class54) class128.field2141.method365(3); var2 != null; var2 = (class54) class128.field2141.method372((byte) 7)) {
            if (var2.field770) {
                var2.method419((byte) -99);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1598(String arg0, int arg1) {
        if (arg1 != -30311) {
            method1598((String) null, 109);
        }
        field3898++;
        String var2 = class94.method659(class238.method1570(arg0, (byte) 84), (byte) -103);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static void method1599(byte arg0) {
        if (arg0 != -15) {
            field3899 = false;
        }
        field3901 = null;
        field3894 = null;
        field3892 = null;
        field3893 = null;
        field3895 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Z")
    public static final boolean method1600(byte arg0) {
        field3900++;
        try {
            int var1 = -21 / ((1 - arg0) / 52);
            if (class130.field2178 == 2) {
                if (class257.field4104 == null) {
                    class257.field4104 = class212.method1426(class110.field1899, class230.field3657, class52.field745);
                    if (class257.field4104 == null) {
                        return false;
                    }
                }
                if (class177.field2848 == null) {
                    class177.field2848 = new class238(class202.field3244, class72.field989);
                }
                if (class93.field1326.method748(class257.field4104, class177.field2848, 22050, class103.field1688, (byte) 31)) {
                    class93.field1326.method745(-21171);
                    class93.field1326.method773(class20.field236, (byte) -104);
                    class93.field1326.method771(class86.field1179, 127, class257.field4104);
                    class110.field1899 = null;
                    class257.field4104 = null;
                    class130.field2178 = 0;
                    class177.field2848 = null;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class93.field1326.method775(2430);
            class257.field4104 = null;
            class130.field2178 = 0;
            class177.field2848 = null;
            class110.field1899 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class243() {
        new class279();
    }
}

import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class166 {

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Z")
    public boolean field1860 = true;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field1867 = new Hashtable();

    @OriginalMember(owner = "client!af", name = "m", descriptor = "[[Z")
    public static boolean[][] field1871 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!af", name = "d", descriptor = "C")
    private char field1862;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public int field1859;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field1869;

    // $FF: synthetic field
    @OriginalMember(owner = "client!af", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field1872;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Ljava/lang/String;")
    public String field1865;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "[Lf;")
    public static class534[] field1870;

    // $FF: synthetic method
    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method914(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lnp;I)V", line = 3)
    public final void method907(class115 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method620((byte) 64);
            if (var3 == 0) {
                field1861++;
                if (arg1 < 119) {
                    field1870 = null;
                    return;
                }
                return;
            }
            this.method912(var3, (byte) 116, arg0);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 25)
    public static final boolean method908(String arg0, byte arg1) {
        if (arg1 <= 72) {
            return false;
        } else {
            field1869++;
            return class559.method3172(field1872 == null ? (field1872 = method914("qga")) : field1872, -115, arg0);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BII)Z", line = 40)
    public static final boolean method909(byte arg0, int arg1, int arg2) {
        int var3 = 119 / ((-arg0 - 8) / 43);
        field1868++;
        return class390.method2221(arg1, (byte) 108, arg2) | (arg1 & 0x70000) != 0 || class424.method2442(arg2, (byte) 111, arg1);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Z", line = 63)
    public final boolean method910(byte arg0) {
        field1863++;
        if (arg0 != 68) {
            this.field1865 = null;
        }
        return this.field1862 == 's';
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 74)
    public static void method911(int arg0) {
        field1870 = null;
        if (arg0 == 0) {
            field1871 = null;
            field1867 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IBLnp;)V", line = 91)
    private final void method912(int arg0, byte arg1, class115 arg2) {
        field1866++;
        if (arg0 == 1) {
            this.field1862 = class161.method876((byte) 93, arg2.method657(false));
        } else if (arg0 == 2) {
            this.field1859 = arg2.method631(false);
        } else if (arg0 == 4) {
            this.field1860 = false;
        } else if (arg0 == 5) {
            this.field1865 = arg2.method626(76);
        }
        if (arg1 != 116) {
            method913(null, 63);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lwp;I)Ljava/lang/String;", line = 122)
    public static final String method913(class452 arg0, int arg1) {
        if (arg1 <= 60) {
            method909((byte) 65, 40, 124);
        }
        field1864++;
        if (client.method3750(arg0).method1802(1) == 0) {
            return null;
        } else if (arg0.field6412 == null || arg0.field6412.trim().length() == 0) {
            return class590.field8339 ? "Hidden-use" : null;
        } else {
            return arg0.field6412;
        }
    }
}

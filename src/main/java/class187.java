import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class187 extends class69 {

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public int field2330;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public int field2334;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "[Lbt;")
    public static class519[] field2329 = new class519[5];

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field2331 = 0;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field2336;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field2337;

    static {
        for (int var0 = 0; var0 < field2329.length; var0++) {
            field2329[var0] = new class519();
        }
        field2336 = new String[] { "en", "de", "fr", "pt", "nl" };
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)Z", line = 9)
    public static final boolean method1170(byte arg0, int arg1, int arg2) {
        field2332++;
        if (arg0 >= -19) {
            return true;
        } else {
            return (arg1 & 0x40000) != 0 | class627.method3610(arg2, 0, arg1) || class171.method1100(arg1, 353, arg2);
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V", line = 27)
    public class187(int arg0, int arg1) {
        this.field2330 = arg0;
        this.field2334 = arg1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 57)
    public static void method1171(byte arg0) {
        int var1 = 114 % ((arg0 + 49) / 44);
        field2329 = null;
        field2336 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)Llc;", line = 67)
    public static final class736 method1172(boolean arg0) {
        if (arg0) {
            field2331 = -108;
        }
        field2333++;
        try {
            return (class736) Class.forName("naa").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 84)
    public static final void method1173(int arg0) {
        if (arg0 < 25) {
            field2337 = -66;
        }
        field2328++;
        if (class688.field9602.field8542.method1756((byte) -98) == 0 && class464.field6471 != class435.field6040) {
            class625.method3602(class728.field10063, false, 11, 7, class372.field5352);
        } else {
            class480.method2855(class111.field1332, -1);
            if (class597.field8365 != class435.field6040) {
                class421.method2540((byte) -67);
            }
        }
    }
}

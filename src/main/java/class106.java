import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class106 extends class53 {

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "Ljava/lang/Object;")
    private Object field2123;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "Lsg;")
    private static class30 field2122 = class167.method1221((byte) 33, "skill: ");

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "[Laa;")
    public static class8[] field2124 = new class8[2048];

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "Lsg;")
    public static class30 field2127 = class167.method1221((byte) 33, "");

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "Lsg;")
    public static class30 field2133 = field2122;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "Lsg;")
    private static class30 field2128 = class167.method1221((byte) 33, "Loaded wordpack");

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "Lsg;")
    public static class30 field2126 = field2128;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "Lmc;")
    public static class151 field2132;

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "Lu;")
    public static class212 field2130;

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "[I")
    public static int[] field2134;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "(I)V")
    public static void method844(int arg0) {
        field2126 = null;
        field2133 = null;
        field2132 = null;
        field2127 = null;
        if (arg0 != 11) {
            return;
        }
        field2122 = null;
        field2130 = null;
        field2134 = null;
        field2124 = null;
        field2128 = null;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(Z)Z")
    public final boolean method517(boolean arg0) {
        if (arg0) {
            field2131++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Lij;")
    public static final class65 method845(byte arg0, int arg1) {
        field2125++;
        class65 var2 = (class65) class149.field2841.method174((long) arg1, (byte) -60);
        if (var2 != null) {
            return var2;
        }
        int var3 = -3 % ((arg0 - 62) / 48);
        byte[] var4 = class172.field3220.method1115(arg1, (byte) -83, 11);
        class65 var5 = new class65();
        if (var4 != null) {
            var5.method585(new class8(var4), (byte) 41);
        }
        class149.field2841.method169(var5, -125, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class106(Object arg0) {
        this.field2123 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method521(int arg0) {
        field2129++;
        if (arg0 <= 82) {
            field2133 = null;
        }
        return this.field2123;
    }
}

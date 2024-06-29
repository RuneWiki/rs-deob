import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class223 extends class26 {

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[I")
    public int[] field3216 = new int[] { -1 };

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "[I")
    public int[] field3217 = new int[] { 0 };

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field3208 = 0;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3210 = "glow3:";

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field3212 = 0;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field3214 = 500;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Ld;")
    public static class91 field3218 = new class91();

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILwf;)Lwf;", line = 15)
    public static final class333 method1622(int arg0, class333 arg1) {
        field3215++;
        if (arg1.field5142 != -1) {
            return class89.method644(49, arg1.field5142);
        }
        int var2 = arg1.field5109 >>> 16;
        int var3 = 65 % ((arg0 + 17) / 57);
        class58 var4 = new class58(class272.field3900);
        for (class74 var5 = (class74) var4.method434((byte) -128); var5 != null; var5 = (class74) var4.method438((byte) 101)) {
            if (var5.field982 == var2) {
                return class89.method644(-114, (int) var5.field304);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(B)V", line = 65)
    public static void method1623(byte arg0) {
        field3210 = null;
        field3218 = null;
        int var1 = 57 % ((arg0 + 4) / 32);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class182 extends class241 {

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public int field3305;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field3299 = -1;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Loh;")
    public static class263 field3297 = class253.method1681(-117, "cookieprefix");

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Loh;")
    public static class263 field3304 = class253.method1681(-123, "(U0a )2 in: ");

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Loh;")
    public static class263 field3307 = class253.method1681(-120, "Mem:");

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Lli;")
    public static class277 field3300 = new class277();

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "Loh;")
    public static class263 field3308 = null;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "Z")
    public static boolean field3309 = false;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Lue;")
    public static class86 field3303;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public static void method1210(int arg0) {
        field3308 = null;
        field3303 = null;
        field3304 = null;
        field3307 = null;
        int var1 = 102 / ((20 - arg0) / 41);
        field3300 = null;
        field3297 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lu;I)V")
    public static final void method1211(class116 arg0, int arg1) {
        field3306++;
        if (arg1 >= 100) {
            class219.method1495(200000, arg0, 16383);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(JZ)V")
    public static final void method1212(long arg0, boolean arg1) {
        field3302++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = 0;
        if (!arg1) {
            return;
        }
        while (var3 < class31.field785) {
            if (class41.field909[var3] == arg0) {
                class204.field3698++;
                class31.field785--;
                for (int var4 = var3; var4 < class31.field785; var4++) {
                    class41.field909[var4] = class41.field909[var4 + 1];
                    class98.field1879[var4] = class98.field1879[var4 + 1];
                }
                class75.field1558 = class112.field2108;
                class154.field2792.method1516(-54, 98);
                class154.field2792.method1272((byte) 72, arg0);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class182() {
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I)V")
    public class182(int arg0) {
        this.field3305 = arg0;
    }
}

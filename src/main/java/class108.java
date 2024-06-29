import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class108 extends class5 {

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public int field2636;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "Lhe;")
    public static class54 field2629 = class6.method58("oder ung-Ultiges Passwort)3", false);

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "Lhe;")
    public static class54 field2628 = class6.method58("Verbindung abgebrochen)3", false);

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "[I")
    public static int[] field2632 = new int[5];

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "Lhe;")
    public static class54 field2631 = class6.method58("Fertigkeit)2", false);

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "Lnc;")
    public static class93 field2638 = null;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "Lod;")
    public static class101 field2626;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "Ld;")
    public static class22 field2639;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "[I")
    public static int[] field2627;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)Lhe;")
    public static final class54 method821(int arg0, boolean arg1) {
        field2637++;
        if (!arg1) {
            field2626 = null;
        }
        return class34.field842[arg0].method404(-100) > 0 ? class143.method1105(new class54[] { class67.field1618[arg0], class87.field2156, class34.field842[arg0] }, -842) : class67.field1618[arg0];
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public static void method822(int arg0) {
        if (arg0 < 74) {
            field2639 = null;
        }
        field2626 = null;
        field2632 = null;
        field2629 = null;
        field2628 = null;
        field2638 = null;
        field2627 = null;
        field2639 = null;
        field2631 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)I")
    public static final int method823(int arg0, byte arg1, int arg2) {
        field2634++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 0) {
                arg2 = 0;
            } else if (arg2 > 127) {
                arg2 = 127;
            }
            return 127 - arg2;
        } else {
            int var4 = (arg0 & 0x7F) * arg2 / 128;
            if (arg1 != 96) {
                return 77;
            }
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class108() {
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
    public class108(int arg0) {
        this.field2636 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)I")
    public static final int method824(int arg0, int arg1, int arg2, int arg3) {
        field2640++;
        if ((class87.field2152[arg2][arg0][arg3] & 0x8) == arg1) {
            return arg2 <= 0 || (class87.field2152[1][arg0][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }
}

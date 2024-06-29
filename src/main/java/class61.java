import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class61 {

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "F")
    public float field800 = 1.0F;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "F")
    public float field805 = 0.25F;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "F")
    public float field811 = 1.0F;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "F")
    public float field816;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "F")
    public float field804;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "F")
    public float field813;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "Lkj;")
    public class256 field812;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "Ljava/lang/String;")
    public static String field808 = "Loaded title screen";

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "La;")
    public static class281 field815 = new class281();

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field818 = 2301979;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field819 = 0;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "La;")
    public static class281 field820 = new class281();

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
    public static int field822 = 0;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field823 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "Lkj;")
    public static class256 field806;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)I", line = 4)
    public static final int method421(int arg0, int arg1) {
        field798++;
        return arg0 == 16803 ? arg1 & 0xFF : 57;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLwm;)V", line = 17)
    public final void method422(byte arg0, class254 arg1) {
        this.field811 = (float) (arg1.method1774((byte) 100) * 8) / 255.0F;
        this.field805 = (float) (arg1.method1774((byte) -120) * 8) / 255.0F;
        field810++;
        this.field800 = (float) (arg1.method1774((byte) 14) * 8) / 255.0F;
        if (arg0 <= 2) {
            this.method422((byte) -4, (class254) null);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)V", line = 31)
    public static final void method423(byte arg0, int arg1) {
        class224.field3428.method741(arg1, (byte) 124);
        class71.field1021.method741(arg1, (byte) 120);
        if (arg0 != -128) {
            method421(103, 57);
        }
        field802++;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V", line = 103)
    public class61() {
        this.field816 = 1.1523438F;
        this.field817 = -50;
        this.field807 = class179.field2840;
        this.field814 = -50;
        this.field801 = -60;
        this.field799 = 0;
        this.field809 = class179.field2839;
        this.field804 = 0.69921875F;
        this.field813 = 1.2F;
        if (class149.field2261 != null) {
            this.field812 = class256.method1801(class149.field2261[0], class149.field2261[1], class149.field2261[2], class149.field2261[3], class149.field2261[4], class149.field2261[5]);
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lwm;)V", line = 129)
    public class61(class254 arg0) {
        int var2 = arg0.method1774((byte) -113);
        if ((var2 & 0x1) == 0) {
            this.field807 = class179.field2840;
        } else {
            this.field807 = arg0.method1741(-32769);
        }
        if ((var2 & 0x2) == 0) {
            this.field816 = 1.1523438F;
        } else {
            this.field816 = (float) arg0.method1755(false) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field804 = 0.69921875F;
        } else {
            this.field804 = (float) arg0.method1755(false) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field813 = 1.2F;
        } else {
            this.field813 = (float) arg0.method1755(false) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field801 = -60;
            this.field817 = -50;
            this.field814 = -50;
        } else {
            this.field814 = arg0.method1768(65536);
            this.field801 = arg0.method1768(65536);
            this.field817 = arg0.method1768(65536);
        }
        if ((var2 & 0x20) == 0) {
            this.field809 = class179.field2839;
        } else {
            this.field809 = arg0.method1741(-32769);
        }
        if ((var2 & 0x40) == 0) {
            this.field799 = 0;
        } else {
            this.field799 = arg0.method1755(false);
        }
        if ((var2 & 0x80) != 0) {
            this.field812 = class256.method1801(arg0.method1755(false), arg0.method1755(false), arg0.method1755(false), arg0.method1755(false), arg0.method1755(false), arg0.method1755(false));
        } else if (class149.field2261 != null) {
            this.field812 = class256.method1801(class149.field2261[0], class149.field2261[1], class149.field2261[2], class149.field2261[3], class149.field2261[4], class149.field2261[5]);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 47)
    public static final String method424(String arg0, int arg1) {
        if (arg1 > -54) {
            method425(114);
        }
        field803++;
        String var2 = class336.method2344(23827, class49.method374(arg0, -1));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 64)
    public static void method425(int arg0) {
        field823 = null;
        field820 = null;
        if (arg0 != 1) {
            method423((byte) 15, -39);
        }
        field806 = null;
        field808 = null;
        field815 = null;
    }
}

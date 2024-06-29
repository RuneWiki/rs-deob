import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class553 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "J")
    private long field7455;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    private int field7459;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Z")
    public static boolean field7458 = false;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Ljj;")
    public final class103 method3100(int arg0, int arg1) {
        if (arg1 == 0) {
            field7457++;
            return class103.method755(this.method3103((byte) 116, arg0), (byte) 59);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Ljj;)V")
    public class553(class103 arg0) {
        this.field7455 = arg0.field1443;
        this.field7459 = 1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)B")
    public static final byte method3101(int arg0, int arg1, int arg2) {
        field7463++;
        if (arg2 != 0) {
            field7458 = false;
        }
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "([Ljj;)V")
    public class553(class103[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method3102(true, arg0[var2]);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLjj;)V")
    private final void method3102(boolean arg0, class103 arg1) {
        field7460++;
        if (!arg0) {
            method3105((byte) 35, 71, 31);
        }
        this.field7455 |= (arg1.field1443 << class103.field1450 * this.field7459++);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)I")
    private final int method3103(byte arg0, int arg1) {
        field7466++;
        int var3 = 33 % ((arg0 - 44) / 47);
        return (int) (this.field7455 >> class103.field1450 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)I")
    public final int method3104(boolean arg0) {
        field7461++;
        return arg0 ? 121 : this.field7459;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BII)V")
    public static final void method3105(byte arg0, int arg1, int arg2) {
        int var3 = -120 / ((arg0 - 31) / 59);
        field7464++;
        if (class704.field9959 == class219.field3065) {
            if (!class151.method1091(arg2, false, 0, 3762, -2, arg1, 0, 1, 1)) {
                class151.method1091(arg2, false, 0, 3762, -3, arg1, 0, 1, 1);
            }
        } else if (!class151.method1091(arg2, false, 0, 3762, -3, arg1, 0, 1, 1)) {
            class151.method1091(arg2, false, 0, 3762, -2, arg1, 0, 1, 1);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BIIII)V")
    public static final void method3106(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field7462++;
        if (arg0 <= 80) {
            method3106((byte) 79, 29, -81, -13, -62);
        }
        if (arg3 < arg2) {
            for (int var5 = arg3; var5 < arg2; var5++) {
                class344.field4599[var5][arg4] = arg1;
            }
        } else {
            for (int var6 = arg2; var6 < arg3; var6++) {
                class344.field4599[var6][arg4] = arg1;
            }
        }
    }
}

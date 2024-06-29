import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class242 {

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field3644 = 0;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field3648 = 0;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field3642 = -1;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "[I")
    public static int[] field3650 = new int[5];

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field3651 = 0;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[I")
    public static int[] field3643;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 7)
    public static void method1745(int arg0) {
        field3643 = null;
        int var1 = -40 / ((-arg0 - 38) / 53);
        field3650 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)V", line = 20)
    public static final void method1746(int arg0, byte arg1) {
        field3649++;
        if (arg0 == -1 || !class328.field5016[arg0]) {
            return;
        }
        class285.field4490.method1181(arg0, (byte) 73);
        if (class175.field2535[arg0] == null) {
            return;
        }
        boolean var2 = true;
        if (arg1 != -116) {
            return;
        }
        for (int var3 = 0; var3 < class175.field2535[arg0].length; var3++) {
            if (class175.field2535[arg0][var3] != null) {
                if (class175.field2535[arg0][var3].field3981 == 2) {
                    var2 = false;
                } else {
                    class175.field2535[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class175.field2535[arg0] = null;
        }
        class328.field5016[arg0] = false;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)Lue;", line = 77)
    public static final class17 method1747(byte arg0) {
        if (arg0 > -111) {
            method1747((byte) 100);
        }
        field3641++;
        try {
            return (class17) Class.forName("nh").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class173();
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)J", line = 109)
    public static final long method1748(int arg0) {
        field3646++;
        return arg0 == 9434 ? class308.field4767.method116(-67) : -98L;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V", line = 120)
    public static final void method1749(int arg0) {
        field3647++;
        if (arg0 >= -109) {
            field3648 = 14;
        }
        class97.field1267.method1237((byte) -119);
        class183.field2640.method1237((byte) -122);
    }
}

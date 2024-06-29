import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class693 extends class152 implements class145 {

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    private int field9851;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "Ljk;")
    public static class585 field9856 = new class585(5, 6);

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field9849;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field9852;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field9853;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field9854;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field9855;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field9858;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)I", line = 6)
    public static final int method3906(int arg0, int arg1, int arg2) {
        if (arg1 != 126) {
            method3906(30, -72, 108);
        }
        int var3 = (127 & arg2) * arg0 >> 7;
        ++field9855;
        if (~var3 > -3) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (65408 & arg2) + var3;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 26)
    public static void method3907(int arg0) {
        int var1 = -50 / ((arg0 - 1) / 54);
        field9856 = null;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)I", line = 35)
    public final int method940(byte arg0) {
        int var2 = -41 % (-arg0 / 39);
        ++field9858;
        return super.field1878;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V", line = 47)
    public final void method669(boolean arg0) {
        super.field1877.method2970(-16059, this);
        if (!arg0) {
            this.method669(true);
        }
        ++field9854;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)I", line = 60)
    public final int method939(int arg0) {
        ++field9852;
        if (arg0 != 32726) {
            field9857 = -71;
        }
        return this.field9851;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)J", line = 73)
    public final long method937(byte arg0) {
        if (arg0 >= -103) {
            method3908(104);
        }
        ++field9850;
        return 0L;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BIII)V", line = 87)
    public final void method938(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 32290) {
            ++field9849;
            this.method976(623, arg0, arg3);
            this.field9851 = arg1;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lkga;I[BIZ)V", line = 101)
    public class693(class506 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field9851 = arg1;
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V", line = 113)
    public static final void method3908(int arg0) {
        if (arg0 == 126) {
            if (class68.field1045 != null) {
                class196.field2369.method2072((byte) 123);
                class37.method422();
                class338.method1955(43);
                class70.method627((byte) -68);
                class337.method1943((byte) -98);
                class659.method3736(123);
                if (class418.field5919 != null) {
                    class418.field5919.method2921((byte) -85);
                }
                class309.method1816(89);
                class354.method2000(0);
                class328.method1907(-27347);
                class520.method3087(124);
                class112.method801((byte) 81, false);
                for (int var1 = 0; var1 < 2048; ++var1) {
                    class613 var5 = class184.field2252[var1];
                    if (var5 != null) {
                        for (int var6 = 0; var6 < var5.field2687.length; ++var6) {
                            var5.field2687[var6] = null;
                        }
                    }
                }
                for (int var2 = 0; ~var2 > ~class59.field928; ++var2) {
                    class557 var3 = class671.field9657[var2].field9097;
                    if (var3 != null) {
                        for (int var4 = 0; var3.field2687.length > var4; ++var4) {
                            var3.field2687[var4] = null;
                        }
                    }
                }
                class230.field2999 = null;
                class521.field7627 = null;
                class68.field1045.method1047(1);
                class68.field1045 = null;
            }
            ++field9853;
        }
    }
}

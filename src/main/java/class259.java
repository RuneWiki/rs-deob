import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class259 extends class540 {

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "Z")
    public static boolean field3838 = false;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "Lmw;")
    public static class517 field3839 = new class517(16, 4);

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "Lmw;")
    public static class517 field3850 = new class517(17, -1);

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "Lhh;")
    private class140 field3840;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZIII)V", line = 3)
    public final void method1265(boolean arg0, int arg1, int arg2, int arg3) {
        ++field3841;
        int var5 = this.method3129(8324) * super.field7476.field4708 / 10000;
        if (arg1 != 10) {
            field3850 = null;
        }
        int[] var6 = new int[4];
        class375.field5490.method467(var6);
        class375.field5490.method453(arg2, arg3 + 2, arg2 + var5, super.field7476.field4710 + arg3);
        this.field3840.method978(arg2, arg3 - -2, super.field7476.field4708, super.field7476.field4710);
        class375.field5490.method453(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;I)V", line = 21)
    public static final void method1755(boolean arg0, int arg1, String arg2, String arg3, int arg4) {
        ++field3847;
        class596.method3339((byte) 93, arg0, arg1, true, -1, arg2, arg3);
        if (arg4 != -6963) {
            field3839 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZI)V", line = 32)
    public final void method1267(int arg0, int arg1, boolean arg2, int arg3) {
        ++field3846;
        if (arg1 != -19726) {
            field3838 = false;
        }
        class375.field5490.method539(arg0 + -2, arg3, super.field7476.field4708 + 4, super.field7476.field4710 - -2, ((class215) super.field7476).field2822, 0);
        class375.field5490.method539(arg0 + -1, arg3 - -1, super.field7476.field4708 + 2, super.field7476.field4710, 0, 0);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Z", line = 44)
    public final boolean method210(int arg0) {
        ++field3844;
        return !super.method210(arg0) ? false : super.field7471.method1185(((class215) super.field7476).field2821, 9330);
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Luq;Luq;Ltw;)V", line = 55)
    public class259(class172 arg0, class172 arg1, class215 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 59)
    public final void method211(byte arg0) {
        ++field3845;
        super.method211((byte) -123);
        if (arg0 >= -107) {
            this.method1267(-89, 42, false, -57);
        }
        this.field3840 = class570.method3243(super.field7471, ((class215) super.field7476).field2821, true);
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)[Led;", line = 72)
    public static final class732[] method1756(int arg0) {
        if (arg0 != 1) {
            method1756(-106);
        }
        ++field3848;
        return new class732[] { class548.field7575, class672.field9002, class553.field7634, class120.field1615, class749.field10085, class452.field6491, class251.field3677, class639.field8605, class777.field10681, class574.field7824, class517.field7188, class129.field1776, class77.field1076, class596.field8108 };
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZB)V", line = 87)
    public static final void method1757(int arg0, int arg1, boolean arg2, byte arg3) {
        if (arg3 <= 67) {
            field3849 = -3;
        }
        if (class138.field1861.method1248(91, (long) arg0) == null) {
            if (!class350.field5102) {
                class31.method175(arg0, arg2, -100);
            } else {
                class116 var4 = new class116(arg0, new class494(4096, class734.field9951, arg0), arg1, arg2);
                var4.field1570.method2601(class95.field1368[class55.field647], (byte) 33);
                class138.field1861.method1247(4070, (long) arg0, var4);
            }
        }
        ++field3837;
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)V", line = 111)
    public static void method1758(int arg0) {
        field3850 = null;
        field3839 = null;
        int var1 = 101 / ((arg0 - 56) / 51);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V", line = 129)
    public static final void method1759(int arg0, int arg1) {
        class440.field6332 = arg0;
        ++field3842;
        if (arg1 != 4) {
            method1756(117);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZIII)V", line = 145)
    public static final void method1760(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; ~arg0 <= ~var6; ++var6) {
            class464.method2733(arg1, arg4, arg3, -22816, class228.field2951[var6]);
        }
        if (!arg2) {
            ++field3843;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class269 extends class331 {

    @OriginalMember(owner = "client!av", name = "v", descriptor = "I")
    public static int field3403 = -1;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!av", name = "s", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!av", name = "t", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!av", name = "u", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!av", name = "r", descriptor = "[[[I")
    public static int[][][] field3399;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(B)I", line = 4)
    public final int method1611(byte arg0) {
        ++field3402;
        if (arg0 > -119) {
            this.method222(-8, -98);
        }
        return super.field4202;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(Ljava/lang/String;B)V", line = 15)
    public static final void method1612(String arg0, byte arg1) {
        ++field3400;
        if (!arg0.equals("")) {
            if (arg1 != -52) {
                method1612((String) null, (byte) 25);
            }
            ++class129.field1556;
            class650 var2 = class314.method1837(class586.field8191, true, class625.field8727);
            var2.field8928.method1141(class663.method3588(0, arg0), -51);
            var2.field8928.method1110(arg0, -30452);
            class108.method745(var2, -47);
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(II)I", line = 34)
    public final int method222(int arg0, int arg1) {
        ++field3397;
        return arg1 != 1 ? -85 : 1;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BIIIIII)Ltj;", line = 46)
    public static final class662 method1613(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 > -55) {
            field3403 = -43;
        }
        ++field3396;
        long var7 = (long) arg3 * 76724863L ^ (long) arg5 * 67481L ^ (long) arg6 * 97549L ^ (long) arg1 * 475427L ^ (long) arg2 * 986053L ^ (long) arg4 * 32147369L;
        class662 var9 = (class662) class533.field7487.method778(var7, -108);
        if (var9 != null) {
            return var9;
        } else {
            class662 var10 = class518.field7289.method137(arg5, arg6, arg1, arg2, arg4, arg3);
            class533.field7487.method774(var7, 89, var10);
            return var10;
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(ILts;)V", line = 67)
    public class269(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(II)V", line = 70)
    public final void method227(int arg0, int arg1) {
        super.field4202 = arg1;
        if (arg0 <= 113) {
            field3399 = null;
        }
        ++field3401;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V", line = 84)
    public final void method224(int arg0) {
        if (super.field4202 != 1 && super.field4202 != 0) {
            super.field4202 = this.method226((byte) 13);
        }
        ++field3395;
        if (arg0 != -1959) {
            field3403 = 57;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(B)I", line = 97)
    public final int method226(byte arg0) {
        ++field3394;
        if (arg0 != 13) {
            field3403 = 121;
        }
        return 1;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lkha;Z)V", line = 112)
    public static final void method1614(class687 arg0, boolean arg1) {
        if (!arg1) {
            method1613((byte) 91, -2, -29, -44, 68, -38, -68);
        }
        class556.field7802 = 0;
        ++field3398;
        class169.field2222 = 0;
        class173.field2264 = new class314();
        class700.field9880 = new class32[1024];
        class149.field1812 = new class428[class613.field8536[class266.field3369] - -1];
        class111.field1371 = 0;
        class185.field2421 = 0;
        class663.method3592(22183, arg0);
        class25.method272(-107, arg0);
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lts;)V", line = 131)
    public class269(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V", line = 134)
    public static void method1615(int arg0) {
        field3399 = null;
        if (arg0 != 1) {
            field3399 = null;
        }
    }
}

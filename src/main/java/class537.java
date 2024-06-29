import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class537 {

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public int field7555 = 128;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public int field7568 = 128;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public int field7562;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public int field7552;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public int field7556;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public int field7554;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field7557 = 0;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field7551 = 0;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public int field7553;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public int field7558;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public int field7561;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public int field7563;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public int field7566;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIII)Ljia;", line = 4)
    public static final class645 method3190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7560++;
        long var7 = (long) arg6 * 32147369L ^ (long) arg1 * 986053L ^ (long) arg4 * 475427L ^ (long) arg5 * 97549L ^ (long) arg0 * 67481L ^ (long) arg2 * 76724863L;
        int var9 = -99 / ((arg3 - 60) / 63);
        class645 var10 = (class645) class250.field2935.method1684(var7, -359);
        if (var10 == null) {
            class645 var11 = class390.field5065.method611(arg0, arg5, arg4, arg1, arg6, arg2);
            class250.field2935.method1686(-25638, var7, var11);
            return var11;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Z", line = 24)
    public static final boolean method3191(int arg0, int arg1, int arg2) {
        field7567++;
        if (arg1 != -30802) {
            field7557 = -30;
        }
        return (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 36)
    public static final void method3192(int arg0) {
        if (arg0 > -91) {
            field7551 = -40;
        }
        for (class318 var1 = (class318) class444.field5950.method2119(-115); var1 != null; var1 = (class318) class444.field5950.method2111((byte) -111)) {
            if (var1.field3913) {
                var1.field3913 = false;
            } else {
                class652.method3684(true, var1.field3915);
            }
        }
        field7559++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ldk;B)V", line = 71)
    public final void method3193(class537 arg0, byte arg1) {
        this.field7555 = arg0.field7555;
        this.field7562 = arg0.field7562;
        field7569++;
        this.field7554 = arg0.field7554;
        this.field7552 = arg0.field7552;
        this.field7568 = arg0.field7568;
        if (arg1 > -121) {
            this.method3193(null, (byte) 77);
        }
        this.field7556 = arg0.field7556;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(I)V", line = 118)
    public class537(int arg0) {
        this.field7562 = arg0;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIIIII)V", line = 125)
    private class537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7555 = arg2;
        this.field7552 = arg3;
        this.field7556 = arg5;
        this.field7562 = arg0;
        this.field7568 = arg1;
        this.field7554 = arg4;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Ldk;", line = 95)
    public final class537 method3194(int arg0) {
        field7564++;
        return arg0 == 55 ? new class537(this.field7562, this.field7568, this.field7555, this.field7552, this.field7554, this.field7556) : null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class480 {

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
    public int field6906 = 128;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public int field6904 = 128;

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "I")
    public int field6912;

    @OriginalMember(owner = "client!tea", name = "t", descriptor = "I")
    public int field6921;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
    public int field6905;

    @OriginalMember(owner = "client!tea", name = "v", descriptor = "I")
    public int field6923;

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "[I")
    public static int[] field6907 = new int[5];

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "[F")
    public static float[] field6909 = new float[4];

    @OriginalMember(owner = "client!tea", name = "s", descriptor = "I")
    public static int field6920 = -1;

    @OriginalMember(owner = "client!tea", name = "q", descriptor = "Lwp;")
    public static class452 field6918 = null;

    @OriginalMember(owner = "client!tea", name = "o", descriptor = "I")
    public static int field6916 = 0;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
    public int field6903;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "I")
    public int field6910;

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "I")
    public int field6914;

    @OriginalMember(owner = "client!tea", name = "n", descriptor = "I")
    public int field6915;

    @OriginalMember(owner = "client!tea", name = "p", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!tea", name = "r", descriptor = "I")
    public int field6919;

    @OriginalMember(owner = "client!tea", name = "u", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ltf;I)I")
    public static final int method2762(class701 arg0, int arg1) {
        field6902++;
        int var2 = 0;
        if (arg0.method3849(class8.field89, false)) {
            var2++;
        }
        if (arg0.method3849(class465.field6638, false)) {
            var2++;
        }
        if (arg0.method3849(class445.field6278, false)) {
            var2++;
        }
        if (arg0.method3849(class221.field2683, false)) {
            var2++;
        }
        if (arg0.method3849(class306.field3777, false)) {
            var2++;
        }
        if (arg0.method3849(class11.field110, false)) {
            var2++;
        }
        if (arg0.method3849(class336.field4232, false)) {
            var2++;
        }
        if (arg1 != -4569) {
            field6918 = null;
        }
        if (arg0.method3849(class287.field3589, false)) {
            var2++;
        }
        if (arg0.method3849(class531.field7482, false)) {
            var2++;
        }
        if (arg0.method3849(class227.field2813, false)) {
            var2++;
        }
        if (arg0.method3849(class549.field7862, false)) {
            var2++;
        }
        if (arg0.method3849(class305.field3773, false)) {
            var2++;
        }
        if (arg0.method3849(class497.field7200, false)) {
            var2++;
        }
        if (arg0.method3849(class496.field7181, false)) {
            var2++;
        }
        if (arg0.method3849(class510.field7324, false)) {
            var2++;
        }
        if (arg0.method3849(class467.field6657, false)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V")
    public static void method2763(byte arg0) {
        if (arg0 < 61) {
            field6909 = null;
        }
        field6909 = null;
        field6918 = null;
        field6907 = null;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2764(int arg0, byte arg1, int arg2) {
        if (arg1 != -1) {
            field6909 = null;
        }
        field6908++;
        return (arg2 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)Ltea;")
    public final class480 method2765(int arg0) {
        if (arg0 >= -36) {
            method2766((byte) -62);
        }
        field6917++;
        return new class480(this.field6912, this.field6906, this.field6904, this.field6905, this.field6923, this.field6921);
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)V")
    public static final void method2766(byte arg0) {
        field6911++;
        class306.field3786 = 0;
        if (arg0 != 1) {
            field6916 = -99;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class304.field3766[var1] = null;
            class649.field9141[var1] = 1;
            class186.field2112[var1] = null;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(JJ)J")
    public static long method2767(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ltea;I)V")
    public final void method2768(class480 arg0, int arg1) {
        this.field6912 = arg0.field6912;
        this.field6921 = arg0.field6921;
        this.field6904 = arg0.field6904;
        field6922++;
        this.field6923 = arg0.field6923;
        this.field6906 = arg0.field6906;
        if (arg1 >= -89) {
            this.field6914 = 18;
        }
        this.field6905 = arg0.field6905;
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(I)V")
    public class480(int arg0) {
        this.field6912 = arg0;
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(IIIIII)V")
    private class480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6904 = arg2;
        this.field6912 = arg0;
        this.field6906 = arg1;
        this.field6921 = arg5;
        this.field6905 = arg3;
        this.field6923 = arg4;
    }
}

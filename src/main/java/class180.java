import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class180 {

    @OriginalMember(owner = "client!oga", name = "i", descriptor = "Lfc;")
    private class642 field2758;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "I")
    public int field2750;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "J")
    public static long field2756;

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "Lgga;")
    public static class513 field2751;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V", line = 4)
    public static void method1310(int arg0) {
        field2751 = null;
        if (arg0 != -622) {
            field2752 = 39;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(III)Lne;", line = 18)
    public static final class203 method1311(int arg0, int arg1, int arg2) {
        class172 var3 = class514.field7096[arg0][arg1][arg2];
        return var3 == null || var3.field2595 == null ? null : var3.field2595;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIIILlea;)Luk;", line = 27)
    public static final class296 method1312(int arg0, int arg1, int arg2, int arg3, int arg4, class573 arg5) {
        field2757++;
        if (arg1 < 121) {
            return null;
        } else if (!arg5.field8186 && (!class362.method2181(arg0, -1) || !class362.method2181(arg3, -1))) {
            return arg5.field8220 ? new class296(arg5, 34037, arg4, arg2, arg0, arg3, true) : new class296(arg5, arg4, arg2, arg0, arg3, class661.method3706(arg0, true), class661.method3706(arg3, true), true);
        } else {
            return new class296(arg5, 3553, arg4, arg2, arg0, arg3, true);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(ZI)V", line = 48)
    public static final void method1313(boolean arg0, int arg1) {
        if (arg0 && class751.field10419 != null) {
            class77.field1158 = class751.field10419.field3596;
        } else {
            class77.field1158 = -1;
        }
        field2754++;
        class148.field2381 = null;
        class751.field10419 = null;
        if (arg1 != 25932) {
            return;
        }
        class260.field3685 = null;
        class466.field6347 = 0;
        class751.method4145();
        class751.field10432.method3735(-4676);
        class242.field3475 = null;
        class397.field5473 = null;
        class751.field10430 = null;
        class626.field8906 = null;
        class620.field8762 = null;
        class611.field8673 = null;
        class291.field4252 = null;
        class747.field10396 = null;
        class284.field4169 = null;
        class61.field943 = null;
        class414.field5684 = -1;
        class630.field8932 = -1;
        if (class751.field10415 != null) {
            class751.field10415.method4110(arg1 ^ 0xFFFFBCB8);
            class751.field10415.method4107(false, 64, 128);
        }
        if (class751.field10421 != null) {
            class751.field10421.method649(64, (byte) 56, 64);
        }
        if (class751.field10416 != null) {
            class751.field10416.method363(false, 64);
        }
        class600.field8552.method3554(true, 64);
    }

    @OriginalMember(owner = "client!oga", name = "finalize", descriptor = "()V", line = 97)
    protected final void finalize() throws Throwable {
        this.field2758.method3642(this.field2750, false);
        field2755++;
        super.finalize();
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIII)V", line = 108)
    public static final void method1314(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2753++;
        class371 var5 = class490.method2867((byte) -116, 18, (long) arg4 << 32 | (long) arg0);
        var5.method2212(-93);
        if (arg1 > -83) {
            field2756 = -98L;
        }
        var5.field5225 = arg3;
        var5.field5233 = arg2;
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lfc;II)V", line = 126)
    public class180(class642 arg0, int arg1, int arg2) {
        this.field2758 = arg0;
        this.field2750 = arg2;
    }
}

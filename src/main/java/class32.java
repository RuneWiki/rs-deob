import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class32 {

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "Ljda;")
    private class239 field518 = new class239(256);

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "Lai;")
    private class626 field523;

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "Ld;")
    private class161 field519;

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "Ljw;")
    public static class581 field524 = new class581(105, 8);

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V")
    public final void method229(int arg0) {
        field525++;
        int var2 = 28 / ((7 - arg0) / 34);
        this.field518.method1546(5, (byte) -8);
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZI)Lec;")
    public final class248 method230(boolean arg0, int arg1) {
        field521++;
        Object var3 = this.field518.method1541(-10, (long) arg1);
        if (var3 != null) {
            return (class248) var3;
        } else if (this.field519.method1173(true, arg1)) {
            if (arg0) {
                method235(null, 97);
            }
            class662 var4 = this.field519.method1174(arg1, true);
            int var5 = var4.field9143 ? 64 : this.field523.field8676;
            class248 var7;
            if (var4.field9158 && this.field523.method461()) {
                float[] var6 = this.field519.method1176((byte) -13, var5, false, 0.7F, arg1, var5);
                var7 = this.field523.method3480(1, var5, var5, class305.field4404, var6, var4.field9153 != 0);
            } else {
                int[] var8;
                if (var4.field9135 != 2 && class758.method4216(var4.field9140, 99)) {
                    var8 = this.field519.method1177(var5, true, var5, 0.7F, arg1, (byte) -93);
                } else {
                    var8 = this.field519.method1178(var5, arg1, -119, 0.7F, var5, false);
                }
                var7 = this.field523.method3517((byte) -109, var5, var5, var4.field9153 != 0, var8);
            }
            var7.method1667(var4.field9147, var4.field9155, 30135);
            this.field518.method1544(true, var7, (long) arg1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(II)Z")
    public static final boolean method231(int arg0, int arg1) {
        field526++;
        if (arg0 > -29) {
            field524 = null;
        }
        return arg1 == 0 || arg1 == 2;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Z)V")
    public final void method232(boolean arg0) {
        field522++;
        this.field518.method1555((byte) -3);
        if (!arg0) {
            this.field518 = null;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)V")
    public static void method233(byte arg0) {
        int var1 = 93 / ((arg0 - 32) / 58);
        field524 = null;
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lai;Ld;)V")
    public class32(class626 arg0, class161 arg1) {
        this.field523 = arg0;
        this.field519 = arg1;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IBI)I")
    public static final int method234(int arg0, byte arg1, int arg2) {
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        int var4 = -81 / ((-arg1 - 79) / 46);
        field517++;
        while (arg0 != 0) {
            int var5 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var5;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method235(String arg0, int arg1) {
        if (arg1 != 5) {
            field524 = null;
        }
        field520++;
        return arg0.length() + 2;
    }
}

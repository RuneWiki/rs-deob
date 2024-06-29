import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class708 {

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "Lrg;")
    private class644 field9843 = new class644();

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "Lqk;")
    private class16 field9844 = new class16();

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
    private int field9846;

    @OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
    private int field9847;

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "Ltba;")
    private class165 field9845;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    public static int field9836 = 0;

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
    public static int field9841 = 0;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field9834;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    public static int field9837;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
    public static int field9838;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
    public static int field9839;

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
    public static int field9840;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
    public static int field9842;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IJ)Lrg;", line = 8)
    public final class644 method3962(int arg0, long arg1) {
        int var4 = 88 / ((7 - arg0) / 52);
        field9842++;
        class644 var5 = (class644) this.field9845.method1160(arg1, 122);
        if (var5 != null) {
            this.field9844.method116(var5, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(IJ)V", line = 34)
    public final void method3963(int arg0, long arg1) {
        field9840++;
        class644 var4 = (class644) this.field9845.method1160(arg1, 125);
        if (var4 != null) {
            var4.method1175(-2);
            var4.method3615(33);
            this.field9846++;
        }
        int var5 = -58 / ((-arg0 - 10) / 52);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(BI)I", line = 58)
    public static final int method3964(byte arg0, int arg1) {
        field9837++;
        if (arg0 > -120) {
            field9836 = -76;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)V", line = 83)
    public final void method3965(boolean arg0) {
        field9834++;
        this.field9844.method113(64);
        this.field9845.method1161(arg0);
        this.field9843 = new class644();
        this.field9846 = this.field9847;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IJLrg;)V", line = 95)
    public final void method3966(int arg0, long arg1, class644 arg2) {
        if (arg0 != 1667) {
            this.method3962(117, -73L);
        }
        field9838++;
        if (this.field9846 == 0) {
            class644 var5 = this.field9844.method114(arg0 - 1750);
            var5.method1175(-2);
            var5.method3615(arg0 ^ 0x6BF);
            if (this.field9843 == var5) {
                class644 var6 = this.field9844.method114(-109);
                var6.method1175(-2);
                var6.method3615(28);
            }
        } else {
            this.field9846--;
        }
        this.field9845.method1153(arg2, arg1, -1);
        this.field9844.method116(arg2, arg0 ^ 0x682);
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(I)V", line = 204)
    public class708(int arg0) {
        this.field9846 = arg0;
        this.field9847 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field9845 = new class165(var2);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIIIIIII)V", line = 130)
    public static final void method3967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field9839++;
        if (class525.method3039(4, arg2)) {
            int var10 = arg0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            if (class676.field9448) {
                var12 = class122.field1766;
                var11 = class745.field10383;
                var10 = class330.field4224;
                var14 = class90.field1248;
                var13 = class100.field1389;
                class90.field1248 = 1;
            }
            if (class416.field5300[arg2] == null) {
                class97.method781(arg6, arg7, arg3, arg1, (byte) -9, arg4, -1, arg8, arg5, class218.field2938[arg2], arg8 < 0);
            } else {
                class97.method781(arg6, arg7, arg3, arg1, (byte) -9, arg4, -1, arg8, arg5, class416.field5300[arg2], arg8 < 0);
            }
            if (class676.field9448) {
                if (arg8 >= 0 && class90.field1248 == 2) {
                    class236.method1478(arg0 - 111, class745.field10383, class122.field1766, class330.field4224, class100.field1389);
                }
                class330.field4224 = var10;
                class745.field10383 = var11;
                class90.field1248 = var14;
                class100.field1389 = var13;
                class122.field1766 = var12;
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class559.field7782[var9] = true;
            }
        } else {
            class559.field7782[arg8] = true;
        }
    }
}

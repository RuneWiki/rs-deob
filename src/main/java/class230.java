import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class230 {

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Lwf;")
    private class89 field2931 = new class89();

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Lkg;")
    public static class179 field2935 = new class179(18, 7);

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "Ldq;")
    public static class493 field2941 = new class493(55, 8);

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field2942 = 0;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "Lwf;")
    private class89 field2939;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)Lwf;")
    public final class89 method1393(byte arg0) {
        field2930++;
        class89 var2 = this.field2931.field1099;
        if (this.field2931 == var2) {
            return null;
        }
        if (arg0 < 125) {
            field2929 = 43;
        }
        var2.method701(99);
        return var2;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)Lwf;")
    public final class89 method1394(byte arg0) {
        field2940++;
        class89 var2 = this.field2939;
        if (this.field2931 == var2) {
            this.field2939 = null;
            return null;
        }
        this.field2939 = var2.field1099;
        if (arg0 != 14) {
            field2941 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII)V")
    public static final void method1395(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2936++;
        float var5 = (float) class241.field3117 / (float) class241.field3116;
        int var6 = arg3;
        int var7 = arg2;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg4 - (arg3 - var6) / 2;
        int var9 = arg0 - (arg2 - var7) / 2;
        class175.field2277 = class241.field3116 * var8 / var6;
        class179.field2366 = -1;
        class9.field144 = -1;
        if (arg1 >= 103) {
            class38.field496 = class241.field3117 - (class241.field3117 * var9 / var7);
            class95.method729(0);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public final void method1396(int arg0) {
        if (arg0 >= -10) {
            this.method1398((byte) 4);
        }
        while (true) {
            class89 var2 = this.field2931.field1099;
            if (this.field2931 == var2) {
                field2934++;
                this.field2939 = null;
                return;
            }
            var2.method701(126);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
    public static void method1397(int arg0) {
        field2941 = null;
        field2935 = null;
        if (arg0 <= 101) {
            field2935 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)I")
    public final int method1398(byte arg0) {
        field2933++;
        if (arg0 <= 32) {
            method1395(-26, 55, -99, 25, -128);
        }
        int var2 = 0;
        class89 var3 = this.field2931.field1099;
        while (this.field2931 != var3) {
            var3 = var3.field1099;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)Lwf;")
    public final class89 method1399(int arg0) {
        field2937++;
        if (arg0 <= 106) {
            return null;
        }
        class89 var2 = this.field2931.field1099;
        if (this.field2931 == var2) {
            this.field2939 = null;
            return null;
        } else {
            this.field2939 = var2.field1099;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZLwf;)V")
    public final void method1400(boolean arg0, class89 arg1) {
        if (arg1.field1094 != null) {
            arg1.method701(121);
        }
        field2938++;
        arg1.field1094 = this.field2931.field1094;
        if (arg0) {
            this.method1394((byte) -65);
        }
        arg1.field1099 = this.field2931;
        arg1.field1094.field1099 = arg1;
        arg1.field1099.field1094 = arg1;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
    public class230() {
        this.field2931.field1099 = this.field2931;
        this.field2931.field1094 = this.field2931;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZI)I")
    public static final int method1401(boolean arg0, int arg1) {
        field2932++;
        return arg0 ? arg1 >>> 8 : -90;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class224 {

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lut;")
    private class80 field3156 = new class80();

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Lcs;")
    private class225 field3157 = new class225();

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    private int field3160;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    private int field3158;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lbj;")
    private class159 field3159;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Luf;")
    public static class310 field3151 = new class310(25, 8);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILvh;I)Lji;", line = 3)
    public static final class433 method1320(int arg0, int arg1, class240 arg2, int arg3) {
        field3149++;
        class365 var4 = new class365(arg2.method1411(true, arg0, arg1));
        class433 var5 = new class433(arg0, var4.method2106(-1), var4.method2106(-1), var4.method2056((byte) -99), var4.method2056((byte) -116), var4.method2099(255) == 1, var4.method2099(255), var4.method2099(255));
        int var6 = var4.method2099(255);
        if (arg3 != -87) {
            method1322(-106, 83, 50, (byte) 127);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field6293.method3070(new class45(var4.method2099(255), var4.method2062((byte) 14), var4.method2062((byte) 14), var4.method2062((byte) 14), var4.method2062((byte) 14), var4.method2062((byte) 14), var4.method2062((byte) 14), var4.method2062((byte) 14), var4.method2062((byte) 14)), (byte) -128);
        }
        var5.method2585(arg3 + 87);
        return var5;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(JI)Lut;", line = 30)
    public final class80 method1321(long arg0, int arg1) {
        field3150++;
        if (arg1 < 46) {
            return null;
        }
        class80 var4 = (class80) this.field3159.method979((byte) 28, arg0);
        if (var4 != null) {
            this.field3157.method1335(-571093627, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIB)V", line = 61)
    public static final void method1322(int arg0, int arg1, int arg2, byte arg3) {
        field3153++;
        if (arg3 != 123) {
            method1327(null, 39);
        }
        class483 var4 = class84.field1168[arg2][arg1];
        class354.method1960(var4 == null ? class514.field7555 : var4, arg0, arg3 ^ 0x2A);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 74)
    public final void method1323(int arg0) {
        this.field3157.method1333(-119);
        field3152++;
        if (arg0 != 0) {
            this.field3159 = null;
        }
        this.field3159.method992(-15728);
        this.field3156 = new class80();
        this.field3158 = this.field3160;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(JILut;)V", line = 89)
    public final void method1324(long arg0, int arg1, class80 arg2) {
        if (arg1 >= -27) {
            this.field3160 = -32;
        }
        if (this.field3158 == 0) {
            class80 var5 = this.field3157.method1334(28);
            var5.method2946(-126);
            var5.method581(4);
            if (this.field3156 == var5) {
                class80 var6 = this.field3157.method1334(44);
                var6.method2946(-95);
                var6.method581(4);
            }
        } else {
            this.field3158--;
        }
        field3147++;
        this.field3159.method990(arg0, (byte) 25, arg2);
        this.field3157.method1335(-571093627, arg2);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLvh;)I", line = 122)
    public static final int method1325(boolean arg0, class240 arg1) {
        field3154++;
        int var2 = 0;
        if (arg1.method1412(class23.field383, 1)) {
            var2++;
        }
        if (arg1.method1412(class466.field6800, 1)) {
            var2++;
        }
        if (arg1.method1412(class266.field3644, 1)) {
            var2++;
        }
        if (arg1.method1412(class330.field4496, 1)) {
            var2++;
        }
        if (arg1.method1412(class47.field644, 1)) {
            var2++;
        }
        if (arg1.method1412(class162.field2316, 1)) {
            var2++;
        }
        if (arg1.method1412(class516.field7578, 1)) {
            var2++;
        }
        if (arg1.method1412(class283.field3814, 1)) {
            var2++;
        }
        if (arg1.method1412(class138.field1981, 1)) {
            var2++;
        }
        if (arg1.method1412(class413.field6069, 1)) {
            var2++;
        }
        if (arg0) {
            field3155 = 115;
        }
        if (arg1.method1412(class85.field1173, 1)) {
            var2++;
        }
        if (arg1.method1412(class271.field3699, 1)) {
            var2++;
        }
        if (arg1.method1412(class124.field1693, 1)) {
            var2++;
        }
        if (arg1.method1412(class343.field4723, 1)) {
            var2++;
        }
        if (arg1.method1412(class63.field871, 1)) {
            var2++;
        }
        if (arg1.method1412(class213.field3036, 1)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V", line = 201)
    public static void method1326(int arg0) {
        if (arg0 != 50) {
            method1322(-6, 93, 86, (byte) -101);
        }
        field3151 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lem;I)Ljava/lang/String;", line = 213)
    public static final String method1327(class149 arg0, int arg1) {
        field3148++;
        if (arg1 != 6645) {
            method1326(7);
        }
        return arg0.field2097 == null || arg0.field2097.length() <= 0 ? arg0.field2096 : arg0.field2096 + class173.field2488.method590(class105.field1434, -22602) + arg0.field2097;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I)V", line = 248)
    public class224(int arg0) {
        this.field3160 = arg0;
        this.field3158 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3159 = new class159(var2);
    }
}

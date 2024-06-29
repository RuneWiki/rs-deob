import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 {

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "[I")
    private int[] field32;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field30 = Calendar.getInstance();

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field31 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)I")
    public final int method25(int arg0, int arg1) {
        field28++;
        if (arg1 != 14540) {
            method26(55, (byte) -44, -54, -73);
        }
        int var3 = (this.field32.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field32[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field32[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IBII)I")
    public static final int method26(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field27++;
        if (var4 == 0) {
            return arg0;
        }
        if (arg1 > -122) {
            field33 = -101;
        }
        if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            return 4095 - arg3;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
    public static void method27(int arg0) {
        field31 = null;
        field30 = null;
        if (arg0 > -55) {
            method26(-60, (byte) -19, -123, -22);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lso;B)V")
    public static final void method28(class494 arg0, byte arg1) {
        field29++;
        int var2 = arg0.method2993(46);
        class300.field4334 = new class261[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class300.field4334[var3] = new class261();
            class300.field4334[var3].field3835 = arg0.method2993(arg1 ^ 0xFFFFFFCE);
            class300.field4334[var3].field3833 = arg0.method3001((byte) -10);
        }
        class693.field9664 = arg0.method2993(-123);
        class734.field10151 = arg0.method2993(-118);
        if (arg1 != 80) {
            method28(null, (byte) 93);
        }
        class637.field8944 = arg0.method2993(81);
        class266.field3888 = new class204[class734.field10151 + 1 - class693.field9664];
        for (int var4 = 0; var4 < class637.field8944; var4++) {
            int var5 = arg0.method2993(83);
            class204 var6 = class266.field3888[var5] = new class204();
            var6.field7397 = arg0.method2964((byte) 105);
            var6.field7399 = arg0.method2976(-127);
            var6.field3170 = var5 + class693.field9664;
            var6.field3166 = arg0.method3001((byte) -122);
            var6.field3169 = arg0.method3001((byte) 96);
        }
        class225.field3469 = arg0.method2976(arg1 ^ 0xFFFFFFD2);
        class30.field418 = true;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(FIFF)F")
    public static final float method29(float arg0, int arg1, float arg2, float arg3) {
        field26++;
        return arg1 <= 97 ? -1.3833F : (arg3 - arg2) * arg0 + arg2;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "([I)V")
    public class4(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field32 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field32[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field32[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field32[var5 + var5] = arg0[var4];
            this.field32[var5 + var5 + 1] = var4++;
        }
    }
}

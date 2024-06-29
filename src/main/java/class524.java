import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class524 {

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "Lie;")
    private class6 field7750 = new class6();

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "Lcn;")
    private class356 field7754 = new class356();

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    private int field7752;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    private int field7751;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "Lmn;")
    private class247 field7753;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "Z")
    public static boolean field7745 = false;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "[I")
    public static int[] field7755 = new int[1];

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;II)I")
    public static final int method3112(String arg0, int arg1, int arg2) {
        field7749++;
        if (arg1 != 28071) {
            method3116(27);
        }
        return class491.method2879(true, (byte) -122, arg2, arg0);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lie;BJ)V")
    public final void method3113(class6 arg0, byte arg1, long arg2) {
        if (arg1 != -47) {
            method3112(null, 25, 18);
        }
        if (this.field7751 == 0) {
            class6 var5 = this.field7754.method2128(1339);
            var5.method1565(0);
            var5.method36(0);
            if (this.field7750 == var5) {
                class6 var6 = this.field7754.method2128(1339);
                var6.method1565(0);
                var6.method36(arg1 + 47);
            }
        } else {
            this.field7751--;
        }
        field7747++;
        this.field7753.method1487(-112, arg2, arg0);
        this.field7754.method2127((byte) -110, arg0);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
    public final void method3114(byte arg0) {
        int var2 = -98 / ((7 - arg0) / 40);
        field7756++;
        this.field7754.method2135(-126);
        this.field7753.method1490(true);
        this.field7750 = new class6();
        this.field7751 = this.field7752;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V")
    public static void method3115(byte arg0) {
        field7755 = null;
        int var1 = -22 / ((18 - arg0) / 36);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public static final void method3116(int arg0) {
        field7746++;
        class528 var1 = (class528) class391.field5737.method2818((byte) 114);
        boolean var2 = class110.field1664 != null || class514.field7607 > 0;
        if (var2) {
            class296.field4073 = 1;
        }
        int var3 = -74 % ((-arg0 - 66) / 32);
        if (class481.field7023 && class310.field4231.method901(0, 81) && class274.field3764 > 2) {
            if (var2) {
                class502.field7404 = (class82) class526.field7778.field6997.field3617.field3617;
            } else {
                class48.method426(var1.method2747(5), var1.method2749(-2257), (class82) class526.field7778.field6997.field3617.field3617, -67);
            }
        } else if (var2) {
            class502.field7404 = (class82) class526.field7778.field6997.field3617;
        } else {
            class48.method426(var1.method2747(5), var1.method2749(-2257), (class82) class526.field7778.field6997.field3617, -123);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(JI)Lie;")
    public final class6 method3117(long arg0, int arg1) {
        field7748++;
        class6 var4 = (class6) this.field7753.method1492(arg0, 6340);
        if (arg1 < 47) {
            this.method3113(null, (byte) 94, -97L);
        }
        if (var4 != null) {
            this.field7754.method2127((byte) -116, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I)V")
    public class524(int arg0) {
        this.field7752 = arg0;
        this.field7751 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field7753 = new class247(var2);
    }
}

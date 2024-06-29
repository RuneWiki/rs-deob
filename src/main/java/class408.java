import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class408 {

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "D")
    public static double field5679;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B[Ldm;I)V", line = 8)
    public static final void method2498(byte arg0, class50[] arg1, int arg2) {
        if (arg0 <= 88) {
            field5679 = 0.4424858545104362D;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class50 var4 = arg1[var3];
            if (var4 != null && var4.field791 == arg2 && !client.method1948(var4)) {
                if (var4.field765 == 0) {
                    method2498((byte) 113, arg1, var4.field792);
                    if (var4.field863 != null) {
                        method2498((byte) 120, var4.field863, var4.field792);
                    }
                    class548 var5 = (class548) class310.field4383.method4203(true, (long) var4.field792);
                    if (var5 != null) {
                        class6.method35(false, var5.field7723);
                    }
                }
                if (var4.field765 == 6 && var4.field853 != -1) {
                    class718 var6 = class698.field9806.method851(var4.field853, -2);
                    if (var6 != null) {
                        var4.field751 += class373.field5232;
                        int var7 = var4.field714;
                        while (var4.field751 > var6.field10048[var4.field714]) {
                            var4.field751 -= var6.field10048[var4.field714];
                            var4.field714++;
                            if (var4.field714 >= var6.field10053.length) {
                                var4.field714 -= var6.field10043;
                                if (var4.field714 < 0 || var6.field10053.length <= var4.field714) {
                                    var4.field714 = 0;
                                }
                            }
                            var4.field798 = var4.field714 + 1;
                            if (var4.field798 >= var6.field10053.length) {
                                var4.field798 -= var6.field10043;
                                if (var4.field798 < 0 || var4.field798 >= var6.field10053.length) {
                                    var4.field798 = -1;
                                }
                            }
                            class262.method1776(0, var4);
                        }
                        if (var4.field714 != var7) {
                            class127.method984(-3991, var6, var4.field714);
                        }
                    }
                }
            }
        }
        field5680++;
    }
}

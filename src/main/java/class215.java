import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class215 extends class415 {

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "[I")
    public static int[] field2935 = new int[1];

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "D")
    public static double field2934;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[Luaa;I)V")
    public static final void method1419(int arg0, class391[] arg1, int arg2) {
        field2937++;
        int var3 = 0;
        if (arg0 != -1) {
            field2935 = null;
        }
        while (var3 < arg1.length) {
            class391 var4 = arg1[var3];
            if (var4 != null && var4.field5136 == arg2 && !client.method2630(var4)) {
                if (var4.field5007 == 0) {
                    method1419(-1, arg1, var4.field5151);
                    if (var4.field5145 != null) {
                        method1419(-1, var4.field5145, var4.field5151);
                    }
                    class278 var5 = (class278) class149.field1895.method2616((long) var4.field5151, (byte) -116);
                    if (var5 != null) {
                        class766.method4165(arg0, var5.field3617);
                    }
                }
                if (var4.field5007 == 6 && var4.field5024 != -1) {
                    class11 var6 = class143.field1864.method4265(true, var4.field5024);
                    if (var6 != null) {
                        var4.field5142 += class621.field7858;
                        int var7 = var4.field5113;
                        while (true) {
                            if (var4.field5142 <= var6.field121[var4.field5113]) {
                                if (var4.field5113 != var7) {
                                    class216.method1423(var4.field5113, arg0 + 1, var6);
                                }
                                break;
                            }
                            var4.field5142 -= var6.field121[var4.field5113];
                            var4.field5113++;
                            if (var6.field109.length <= var4.field5113) {
                                var4.field5113 -= var6.field111;
                                if (var4.field5113 < 0 || var4.field5113 >= var6.field109.length) {
                                    var4.field5113 = 0;
                                }
                            }
                            var4.field5029 = var4.field5113 + 1;
                            if (var4.field5029 >= var6.field109.length) {
                                var4.field5029 -= var6.field111;
                                if (var4.field5029 < 0 || var6.field109.length <= var4.field5029) {
                                    var4.field5029 = -1;
                                }
                            }
                            class776.method4255(var4, arg0 - 1006);
                        }
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
    public static void method1420(byte arg0) {
        field2935 = null;
        int var1 = -29 % ((-arg0 - 48) / 43);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lha;I)V")
    public static final void method1421(class570 arg0, int arg1) {
        field2936++;
        if (arg1 != 0) {
            field2935 = null;
        }
        if (class621.field7861 != class422.field5564.field2895 && class28.field252 != null && class728.method3894(arg0, false, class422.field5564.field2895)) {
            class621.field7861 = class422.field5564.field2895;
        }
    }
}

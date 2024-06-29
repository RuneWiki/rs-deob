import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class488 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Luc;")
    public static class27 field6776 = new class27(28, 4);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method2744(byte arg0) {
        if (arg0 < 16) {
            method2745(114);
        }
        field6776 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static final void method2745(int arg0) {
        field6775++;
        if (arg0 != 14811) {
            method2744((byte) -64);
        }
        for (class345 var1 = (class345) class487.field6761.method1270((byte) -25); var1 != null; var1 = (class345) class487.field6761.method1282(arg0 - 14811)) {
            if (class44.method246((byte) 114, var1.field4983)) {
                class538.method2966(-123, var1);
            }
        }
        if (class315.field4697 == 1) {
            class592.method3296((byte) 82);
            return;
        }
        class568.method3135(class371.field5287, -122, class113.field1532, class364.field5200, class174.field2605);
        int var2 = class432.field6119.method3314(class9.field158.method42(class666.field9377, arg0 ^ 0x75AF), -76);
        for (class345 var3 = (class345) class487.field6761.method1270((byte) -25); var3 != null; var3 = (class345) class487.field6761.method1282(arg0 ^ 0x39DB)) {
            int var4 = class428.method2423(var3, (byte) 56);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class371.field5287 = (class36.field450 ? 26 : 22) + class315.field4697 * 16;
        class364.field5200 = var2 + 8;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;ILmj;ILta;ILfa;IIILfaa;I)V")
    public static final void method2746(String arg0, int arg1, class599 arg2, int arg3, class194 arg4, int arg5, class212 arg6, int arg7, int arg8, int arg9, class140 arg10, int arg11) {
        field6777++;
        int var12;
        if (class670.field9445 == 4) {
            var12 = (int) class646.field9167 & 0x3FFF;
        } else {
            var12 = (int) class646.field9167 + class156.field2356 & 0x3FFF;
        }
        int var13 = Math.max(arg10.field2121 / 2, arg10.field2082 / 2) + 10;
        if (arg5 > -121) {
            field6776 = null;
        }
        int var14 = arg1 * arg1 + arg7 * arg7;
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class675.field9542[var12];
        int var16 = class675.field9541[var12];
        if (class670.field9445 != 4) {
            var16 = var16 * 256 / (class455.field6362 + 256);
            var15 = var15 * 256 / (class455.field6362 + 256);
        }
        int var17 = arg1 * var16 + arg7 * var15 >> 14;
        int var18 = arg7 * var16 - (arg1 * var15) >> 14;
        int var19 = arg2.method3318(86, arg0, 100, null);
        int var20 = var17 - var19 / 2;
        int var21 = arg2.method3315(100, arg0, null, false, 0);
        if (-arg10.field2121 <= var20 && arg10.field2121 >= var20 && var18 >= -arg10.field2082 && arg10.field2082 >= var18) {
            arg4.method1310(1, arg6, arg0, 50, null, arg11, 0, (byte) 95, var19, 0, 0, null, arg9, arg11 + (arg10.field2082 / 2) - arg3 - var18 - var21, arg10.field2121 / 2 + arg8 + var20, arg8);
        }
    }
}

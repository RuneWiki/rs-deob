import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class522 implements class318 {

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public int field7398;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Lsb;")
    public static class305 field7397 = new class305(27, 8);

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field7400 = 1401;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
    public static final void method2959(byte arg0) {
        if (arg0 > -4) {
            return;
        }
        class645.method3613(class701.field9813, (long) class678.field9539, false);
        field7395++;
        if (class209.field2466 != -1) {
            class307.method1768(class209.field2466, -11609);
        }
        for (int var1 = 0; var1 < class141.field1556; var1++) {
            if (class313.field3894[var1]) {
                class444.field6263[var1] = true;
            }
            class73.field768[var1] = class313.field3894[var1];
            class313.field3894[var1] = false;
        }
        class386.field5212 = class678.field9539;
        if (class209.field2466 != -1) {
            class141.field1556 = 0;
            class8.method52((byte) 99);
        }
        class701.field9813.method1050();
        class605.method3382(class701.field9813, (byte) 112);
        int var2 = class364.method2127(-21221);
        if (var2 == -1) {
            var2 = class178.field1992;
        }
        if (var2 == -1) {
            var2 = class176.field1966;
        }
        class125.method716((byte) -27, var2);
        class569.field8088 = 0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lib;")
    public final class14 method203(byte arg0) {
        if (arg0 != -92) {
            this.field7398 = 76;
        }
        field7399++;
        return class325.field3998;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method2960(int arg0) {
        field7397 = null;
        int var1 = 38 % ((-arg0 - 80) / 32);
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I)V")
    public class522(int arg0) {
        this.field7398 = arg0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILr;IIII)Lda;")
    public static final class473 method2961(int arg0, int arg1, class564 arg2, int arg3, int arg4, int arg5, int arg6) {
        field7396++;
        long var7 = (long) arg4;
        class473 var9 = (class473) class310.field3831.method78(0, var7);
        short var10 = 2055;
        if (var9 == null) {
            class581 var11 = class331.method1919(0, (byte) -43, class436.field6155, arg4);
            if (var11 == null) {
                return null;
            }
            if (var11.field8264 < 13) {
                var11.method3289(2, -101);
            }
            var9 = arg2.method1051(var11, var10, class143.field1589, 64, 768);
            class310.field3831.method92(1, var7, var9);
        }
        if (arg3 > -15) {
            return null;
        }
        class473 var12 = var9.method1877((byte) 2, var10, true);
        if (arg5 != 0) {
            var12.method1879(arg5);
        }
        if (arg0 != 0) {
            var12.method1884(arg0);
        }
        if (arg1 != 0) {
            var12.method1902(arg1);
        }
        if (arg6 != 0) {
            var12.method1915(0, arg6, 0);
        }
        return var12;
    }
}

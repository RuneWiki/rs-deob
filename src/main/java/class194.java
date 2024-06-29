import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class194 extends class550 {

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public int field2512;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public int field2511;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "[I")
    public static int[] field2509 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "Lcb;")
    public static class318 field2516 = new class318(33, 6);

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)I", line = 4)
    public static final int method1235(byte arg0, int arg1) {
        if (arg0 != 56) {
            method1237(68, -13, 7, 36, (byte) 113);
        }
        field2510++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lrn;Lhv;IIIIIII)V", line = 16)
    public class194(class380 arg0, class97 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        this.field2512 = arg8;
        this.field2511 = arg7;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)Ljv;", line = 28)
    public final class606 method472(byte arg0) {
        field2513++;
        return arg0 == -110 ? class225.field2928 : null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 48)
    public static void method1236(int arg0) {
        field2509 = null;
        field2516 = null;
        if (arg0 != 0) {
            method1235((byte) -127, 36);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIB)I", line = 59)
    public static final int method1237(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2514++;
        int var5 = arg3 & 0xF;
        int var6 = 22 % ((-arg4 - 4) / 40);
        int var7 = var5 < 8 ? arg2 : arg0;
        int var8 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg2 : arg1) : arg0;
        return ((var5 & 0x1) == 0 ? var7 : -var7) + ((var5 & 0x2) == 0 ? var8 : -var8);
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V", line = 75)
    public static final void method1238(byte arg0) {
        if (class346.method2172((byte) -75, class476.field6436) || class20.method113(110, class476.field6436)) {
            class578.method3252(5000, class471.field6379 >> 12, true, class132.field1679 >> 12);
        } else {
            int var1 = class596.field8164.field526[0] >> 3;
            int var2 = class596.field8164.field516[0] >> 3;
            if (var1 >= 0 && var1 < (class588.field8082 >> 3) && var2 >= 0 && class12.field113 >> 3 > var2) {
                class578.method3252(5000, var2, true, var1);
            } else {
                class578.method3252(0, class12.field113 >> 4, true, class588.field8082 >> 4);
            }
        }
        field2515++;
        class627.method3423((byte) 54);
        if (arg0 != 79) {
            method1237(106, -39, -44, 73, (byte) -71);
        }
        class143.method977((byte) -75);
        class419.method2434((byte) 22);
        class4.method18(-5788);
    }
}

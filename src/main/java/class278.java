import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class278 extends class201 {

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    private int field3954;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    private int field3947;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    private int field3957;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    private int field3952;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    private int field3950;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    private int field3948;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "Lnq;")
    private class325 field3955;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Lni;")
    public static class367 field3940 = new class367(4, 1);

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    public static int field3953 = 0;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "Luu;")
    public static class191 field3956;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "Lus;")
    private class1 field3951;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Lgm;")
    public static class80 field3943;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "[Luo;")
    public static class412[] field3944;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILjt;I)J", line = 3)
    public static final long method1785(int arg0, int arg1, class68 arg2, int arg3) {
        field3945++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        if (arg3 != 6407) {
            return 22L;
        }
        long var8 = Long.MIN_VALUE;
        class209 var10 = class432.field6575.method1872(arg2.method338(arg3 - 6291), false);
        long var11 = (long) (arg0 << 7 | arg1 | arg2.method336(arg3 ^ 0xFFFFF109) << 14 | arg2.method332(arg3 ^ 0x1D0) << 20 | 0x40000000);
        if (var10.field2930 == 0) {
            var11 |= var8;
        }
        if (var10.field2909 == 1) {
            var11 |= var4;
        }
        if (var10.field2887) {
            var11 |= var6;
        }
        return var11 | (long) arg2.method338(121) << 32;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)Lus;", line = 35)
    public final class1 method1364(int arg0) {
        if (arg0 < 88) {
            field3953 = 43;
        }
        field3946++;
        if (this.field3951 == null) {
            class347.field5368[2] = this.field3947;
            class347.field5368[5] = this.field3950;
            class347.field5368[1] = this.field3948;
            class15 var2 = this.field3955.field2235;
            class347.field5368[0] = this.field3957;
            class347.field5368[4] = this.field3954;
            class347.field5368[3] = this.field3952;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method160((byte) 23, class347.field5368[var5])) {
                    return null;
                }
                class107 var7 = var2.method157((byte) 105, class347.field5368[var5]);
                int var8 = var7.field1516 ? 64 : 128;
                if (var7.field1504 > 0) {
                    var3 = 1;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class163.field2150[var6] = var2.method156(class347.field5368[var6], false, var4, var4, 1.0F, (byte) -103);
            }
            this.field3951 = new class1(this.field3955, 6407, var4, var3 != 0, class163.field2150);
        }
        return this.field3951;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V", line = 96)
    public static final void method1786(int arg0) {
        class538.field7879.method1073(326170192, class293.field4270.method1280(127));
        field3942++;
        class538.field7879.method1073(326170192, class339.field5257.method1280(82));
        class538.field7879.method1073(326170192, class315.field4587.method1280(81));
        class538.field7879.method1073(326170192, class247.field3447.method1280(86));
        class538.field7879.method1073(326170192, class149.field1964.method1280(58));
        class538.field7879.method1073(326170192, class79.field1131.method1280(80));
        class538.field7879.method1073(326170192, class162.field2111.method1280(-106));
        class538.field7879.method1073(326170192, class288.field4210.method1280(-101));
        class538.field7879.method1073(326170192, class266.field3709.method1280(86));
        if (arg0 < 5) {
            method1789(81, 86);
        }
        class538.field7879.method1073(326170192, class229.field3273.method1280(31));
        class538.field7879.method1073(326170192, class22.field327.method1280(99));
        class538.field7879.method1073(326170192, class41.field612.method1280(82));
        class538.field7879.method1073(326170192, class350.field5399.method1280(-112));
        class538.field7879.method1073(326170192, class381.field5811.method1280(-79));
        class538.field7879.method1073(326170192, class359.field5511.method1280(-91));
        class538.field7879.method1073(326170192, class256.field3536.method1280(-127));
        class538.field7879.method1073(326170192, class467.field6983.method1280(-109));
        class538.field7879.method1073(326170192, class532.field7829.method1280(-125));
        class538.field7879.method1073(326170192, class126.field1714.method1280(78));
        class538.field7879.method1073(326170192, class502.field7407.method1280(31));
        class538.field7879.method1073(326170192, class273.field3801.method1280(-82));
        class538.field7879.method1073(326170192, class304.field4439.method1280(-99));
        class538.field7879.method1073(326170192, class63.field895.method1280(40));
        class538.field7879.method1073(326170192, class502.field7409.method1280(-80));
        class538.field7879.method1073(326170192, class359.field5509.method1280(52));
        class538.field7879.method1073(326170192, class21.field324.method1280(125));
        class538.field7879.method1073(326170192, class474.field7041.method1280(-103));
        class538.field7879.method1073(326170192, class526.field7722.method1280(-56));
        class538.field7879.method1073(326170192, class359.field5514.method1280(-92));
        class538.field7879.method1073(326170192, class103.field1486.method1280(32));
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V", line = 146)
    public static final void method1787(byte arg0) {
        int var1 = 6 % ((arg0 - 9) / 37);
        field3941++;
        for (int var2 = 0; var2 < 5; var2++) {
            class17.field286[var2] = false;
        }
        class340.field5269 = 1;
        class507.field7462 = 0;
        class174.field2332 = 0;
        class538.field7892 = -1;
        class256.field3535 = -1;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V", line = 172)
    public static void method1788(int arg0) {
        if (arg0 != 2499) {
            field3940 = null;
        }
        field3943 = null;
        field3940 = null;
        field3956 = null;
        field3944 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V", line = 190)
    public static final void method1789(int arg0, int arg1) {
        field3949++;
        if (!class203.field2716.field1152) {
            arg1 = -1;
        }
        if (class491.field7253 == arg1) {
            return;
        }
        if (arg0 > -63) {
            method1787((byte) -3);
        }
        if (arg1 != -1) {
            class136 var2 = class77.field1120.method2962(arg1, (byte) -98);
            class252 var3 = var2.method919(0);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class312.field4572.method2985(17, var3.method1629(), class85.field1245, new Point(var2.field1811, var2.field1813), var3.method1640(), var3.method1636());
                class491.field7253 = arg1;
            }
        }
        if (arg1 == -1 && class491.field7253 != -1) {
            class312.field4572.method2985(17, -1, class85.field1245, new Point(), -1, null);
            class491.field7253 = -1;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lnq;IIIIII)V", line = 242)
    public class278(class325 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3954 = arg5;
        this.field3947 = arg3;
        this.field3957 = arg1;
        this.field3952 = arg4;
        this.field3950 = arg6;
        this.field3948 = arg2;
        this.field3955 = arg0;
    }
}

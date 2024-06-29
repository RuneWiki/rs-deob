import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class248 extends class184 {

    @OriginalMember(owner = "client!dea", name = "m", descriptor = "I")
    public int field3603;

    @OriginalMember(owner = "client!dea", name = "n", descriptor = "I")
    public int field3604;

    @OriginalMember(owner = "client!dea", name = "o", descriptor = "[I")
    public static int[] field3605 = new int[1];

    @OriginalMember(owner = "client!dea", name = "q", descriptor = "I")
    public static int field3607 = 1401;

    @OriginalMember(owner = "client!dea", name = "t", descriptor = "Lfa;")
    public static class235 field3610 = new class235(0, 2, 2, 1);

    @OriginalMember(owner = "client!dea", name = "r", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!dea", name = "s", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!dea", name = "p", descriptor = "Lvd;")
    public static class39 field3606;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
    public static void method1644(int arg0) {
        field3610 = null;
        field3606 = null;
        field3605 = null;
        if (arg0 >= -111) {
            method1645(-42, -46, 125, 65);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIII)I")
    public static final int method1645(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -193) {
            return 123;
        }
        field3609++;
        if (arg2 > 243) {
            arg3 >>= 0x4;
        } else if (arg2 > 217) {
            arg3 >>= 0x3;
        } else if (arg2 > 192) {
            arg3 >>= 0x2;
        } else if (arg2 > 179) {
            arg3 >>= 0x1;
        }
        return (arg3 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10) + (arg2 >> 1);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILha;ILada;I)V")
    public static final void method1646(int arg0, class60 arg1, int arg2, class164 arg3, int arg4) {
        field3608++;
        class603.field8529.method1200(104);
        if (arg2 != 1 || class575.field8135) {
            return;
        }
        for (class622 var5 = (class622) arg3.method1195(0); var5 != null; var5 = (class622) arg3.method1201(arg2 ^ 0x3)) {
            class519 var6 = class84.field1175.method864(-29, var5.field8729);
            if (class79.method646((byte) 83, var6)) {
                boolean var7 = class633.method3648(arg1, var6, arg0, 2, var5, arg4);
                if (var7) {
                    class437.method2702(7511, arg1, var5, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(II)V")
    public class248(int arg0, int arg1) {
        this.field3603 = arg0;
        this.field3604 = arg1;
    }
}

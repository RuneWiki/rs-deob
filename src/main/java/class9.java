import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class9 extends class222 {

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Z")
    public static boolean field118 = true;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Lnh;")
    public static class54 field119 = new class54(4);

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "[I")
    public static int[] field131 = new int[32];

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "Z")
    public static boolean field129 = false;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field128 = 0;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "[I")
    public static int[] field133 = new int[100];

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field132 = -1;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "Lcf;")
    public static class93 field127 = class147.method1066("", -48);

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Lhg;")
    public static class177 field130;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILtg;IIIIB)V")
    public static final void method37(int arg0, class181 arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 <= 43) {
            field118 = false;
        }
        field123++;
        int var7 = arg0 * arg0 + (arg4 * arg4);
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg1.field3270 / 2, arg1.field3252 / 2);
        if (var7 <= (var8 * var8)) {
            class231.method1583(arg0, 1, arg5, arg4, arg2, class149.field2627[arg3], arg1);
            return;
        }
        var8 -= 10;
        int var9 = class50.field825 + class95.field1719 & 0x7FF;
        int var10 = class179.field3155[var9];
        int var11 = var10 * 256 / (class248.field4458 + 256);
        int var12 = class179.field3158[var9];
        int var13 = var12 * 256 / (class248.field4458 + 256);
        int var14 = arg4 * var13 - (arg0 * var11) >> 16;
        int var15 = arg0 * var13 + arg4 * var11 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) (Math.cos(var16) * (double) var8);
        ((class158) class237.field4214[arg3]).method569(arg1.field3270 / 2 + arg5 + var18 - 10, arg1.field3252 / 2 + -var19 + arg2 + -10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)V")
    public static void method38(byte arg0) {
        field133 = null;
        field127 = null;
        field119 = null;
        field131 = null;
        field130 = null;
        if (arg0 != 0) {
            method38((byte) 107);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
    public static final void method39(boolean arg0) {
        if (!arg0) {
            field134++;
            class6.field82 = new class181[class264.field4714.method1279(-1)][];
            class205.field3690 = new boolean[class264.field4714.method1279(-1)];
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
    public static final void method40(int arg0, int arg1, int arg2) {
        class176.field3061[arg1] = arg2;
        field120++;
        if (arg0 != 17739) {
            method39(false);
        }
        class60 var3 = (class60) class208.field3722.method135((long) arg1, true);
        if (var3 == null) {
            class60 var4 = new class60(class28.method155((byte) -3) + 500L);
            class208.field3722.method137((long) arg1, var4, -1);
        } else {
            var3.field1014 = class28.method155((byte) -117) + 500L;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lhg;I)V")
    public static final void method41(class177 arg0, int arg1) {
        if (arg1 != 1516874416) {
            method38((byte) -84);
        }
        class154.field2702 = arg0;
        field117++;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static final void method42(int arg0) {
        field122++;
        class137.field2395.method300(arg0 ^ arg0);
        class157.field2774.method300(0);
        class76.field1402.method300(0);
        class252.field4538.method300(0);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(III)Z")
    public final boolean method43(int arg0, int arg1, int arg2) {
        field124++;
        if (arg2 >= -78) {
            this.method43(15, -10, 25);
        }
        return this.field121 <= arg0 && arg0 <= this.field125 && arg1 >= this.field126 && this.field135 >= arg1;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(IIII)V")
    public class9(int arg0, int arg1, int arg2, int arg3) {
        this.field135 = arg3;
        this.field121 = arg0;
        this.field125 = arg2;
        this.field126 = arg1;
    }
}

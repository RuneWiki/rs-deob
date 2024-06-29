import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class55 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lsf;")
    private static class108 field801 = class140.method973(255, "Cancel");

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[Lsf;")
    public static class108[] field808 = new class108[1000];

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field810 = 50;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Lsf;")
    public static class108 field806 = class140.method973(255, ":");

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lsf;")
    public static class108 field807 = field801;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "[I")
    public static int[] field813 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Z")
    public static boolean field804 = false;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Lsf;")
    public static class108 field809 = class140.method973(255, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Lsf;")
    public static class108 field812 = class140.method973(255, "<col=c0ff00>");

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lik;")
    public static class262 field802;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I", line = 16)
    public static final int method382(int arg0, int arg1) {
        field814++;
        int var2 = 0;
        if (arg0 > -4) {
            return 67;
        }
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 74)
    public static void method383(int arg0) {
        if (arg0 <= 1) {
            method384(22, (class249) null, (class108) null);
        }
        field807 = null;
        field802 = null;
        field809 = null;
        field808 = null;
        field813 = null;
        field812 = null;
        field801 = null;
        field806 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILrm;Lsf;)I", line = 93)
    public static final int method384(int arg0, class249 arg1, class108 arg2) {
        int var3 = arg1.field4314;
        field811++;
        arg1.method1763(arg2.field1870, (byte) 26);
        arg1.field4314 += class122.field2088.method164(arg1.field4338, arg0, arg2.field1884, arg2.field1870, arg1.field4314, -103);
        return arg1.field4314 - var3;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lca;IIII)V", line = 113)
    public static final void method385(class98 arg0, int arg1, int arg2, int arg3, int arg4) {
        field803++;
        if (class231.field4051) {
            class50.method345(arg3, arg4, arg3 + arg0.field1673, arg0.field1688 + arg4);
        }
        if (class157.field2836 < 3) {
            if (class231.field4051) {
                ((class49) class248.field4296).method337(arg3, arg4, arg0.field1673, arg0.field1688, class248.field4296.field2347 / 2, class248.field4296.field2329 / 2, class186.field3423, 256, (class49) arg0.method665(false, (byte) 53));
            } else {
                ((class12) class248.field4296).method73(arg3, arg4, arg0.field1673, arg0.field1688, class248.field4296.field2347 / 2, class248.field4296.field2329 / 2, class186.field3423, 256, arg0.field1618, arg0.field1709);
            }
        } else if (class231.field4051) {
            class135 var5 = arg0.method665(false, (byte) 53);
            if (var5 != null) {
                var5.method81(arg3, arg4);
            }
        } else {
            class28.method198(arg3, arg4, 0, arg0.field1618, arg0.field1709);
        }
        class280.field4910[arg1] = true;
        int var6 = -34 % ((24 - arg2) / 40);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Lvd;", line = 164)
    public static final class135 method386(int arg0) {
        int var1 = class273.field4795[0] * class155.field2780[0];
        field815++;
        int[] var2 = new int[var1];
        byte[] var3 = class94.field1512[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class321.field5494[class162.method1118(var3[var4], 255)];
        }
        class135 var5;
        if (class231.field4051) {
            var5 = new class49(class95.field1519, class197.field3560, class154.field2775[0], class88.field1383[0], class155.field2780[0], class273.field4795[0], var2);
        } else {
            var5 = new class12(class95.field1519, class197.field3560, class154.field2775[0], class88.field1383[0], class155.field2780[0], class273.field4795[0], var2);
        }
        class15.method100(1);
        return arg0 == 255 ? var5 : (class135) null;
    }
}

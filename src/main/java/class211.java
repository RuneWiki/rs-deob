import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class211 extends class115 {

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "[Luk;")
    public class93[] field3707;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "Lud;")
    public static class279 field3702 = class130.method1024("mem=", 255);

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "Lud;")
    public static class279 field3703 = class130.method1024("1", 255);

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "[I")
    public static int[] field3709 = new int[4096];

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "Lud;")
    private static class279 field3710 = class130.method1024("Connection lost)3", 255);

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "Lud;")
    public static class279 field3704 = field3710;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "Lok;")
    public static class149 field3712;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 17)
    public static void method1544(int arg0) {
        field3709 = null;
        field3712 = null;
        field3702 = null;
        field3703 = null;
        field3704 = null;
        field3710 = null;
        if (arg0 != 23580) {
            method1548(119, 117);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)Z", line = 33)
    public final boolean method1545(int arg0, boolean arg1) {
        field3708++;
        if (arg1) {
            field3710 = (class279) null;
        }
        return this.field3707[arg0].field1756;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILcn;II)V", line = 44)
    public static final void method1546(int arg0, int arg1, class264 arg2, int arg3, int arg4) {
        field3705++;
        if (arg3 != 0) {
            return;
        }
        for (class52 var5 = (class52) class322.field5623.method2248(-82); var5 != null; var5 = (class52) class322.field5623.method2240(arg3 + 1138)) {
            if (var5.field1098 == arg0 && (arg1 * 128) == var5.field1079 && arg4 * 128 == var5.field1076 && var5.field1069.field4727 == arg2.field4727) {
                if (var5.field1083 != null) {
                    class322.field5630.method1957(var5.field1083);
                    var5.field1083 = null;
                }
                if (var5.field1096 != null) {
                    class322.field5630.method1957(var5.field1096);
                    var5.field1096 = null;
                }
                var5.method2221(true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lsf;III)V", line = 81)
    public static final void method1547(class108 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class207.field3668) {
            class191 var4 = class24.field619[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3440 != null && var4.field3440.field4316.method895()) {
                arg0.method894(var4.field3440.field4316, 128, 0, 0, true);
            }
        }
        if (arg3 < class207.field3668) {
            class191 var5 = class24.field619[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3440 != null && var5.field3440.field4316.method895()) {
                arg0.method894(var5.field3440.field4316, 0, 0, 128, true);
            }
        }
        if (arg2 < class207.field3668 && arg3 < class54.field1193) {
            class191 var6 = class24.field619[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3440 != null && var6.field3440.field4316.method895()) {
                arg0.method894(var6.field3440.field4316, 128, 0, 128, true);
            }
        }
        if (arg2 < class207.field3668 && arg3 > 0) {
            class191 var7 = class24.field619[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3440 != null && var7.field3440.field4316.method895()) {
                arg0.method894(var7.field3440.field4316, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Z", line = 128)
    public static final boolean method1548(int arg0, int arg1) {
        field3706++;
        if (arg1 != -21732) {
            field3703 = (class279) null;
        }
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)Z", line = 143)
    public final boolean method1549(int arg0, int arg1) {
        field3711++;
        if (arg0 != 4096) {
            method1544(-75);
        }
        return this.field3707[arg1].field1749;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lok;Lok;IZ)V", line = 156)
    public class211(class149 arg0, class149 arg1, int arg2, boolean arg3) {
        class317 var5 = new class317();
        int var6 = arg0.method1174(arg2, -17680);
        this.field3707 = new class93[var6];
        int[] var7 = arg0.method1182(arg2, 0);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1192(0, arg2, var7[var8]);
            int var10 = var9[1] & 0xFF | var9[0] & 0xFF << 8;
            class112 var11 = null;
            for (class112 var12 = (class112) var5.method2248(104); var12 != null; var12 = (class112) var5.method2240(1138)) {
                if (var12.field2061 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1170(var10, (byte) 123, 0);
                } else {
                    var13 = arg1.method1170(0, (byte) 123, var10);
                }
                var11 = new class112(var10, var13);
                var5.method2246(true, var11);
            }
            this.field3707[var7[var8]] = new class93(var9, var11);
        }
    }
}

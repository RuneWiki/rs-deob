import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class148 {

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public int field2506;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public int field2509;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public int field2515;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public int field2510;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "[I")
    public static int[] field2508 = new int[25];

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2512++;
        int var7 = 68 / ((17 - arg5) / 34);
        if ((arg0 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg3;
            arg3 = var8;
        }
        int var9 = arg1 & 0x3;
        if (var9 == 0) {
            return arg4;
        } else if (var9 == 1) {
            return arg2;
        } else if (var9 == 2) {
            return 7 + 1 - arg6 - arg4;
        } else {
            return 7 + 1 - arg2 - arg3;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljl;IZIII)V")
    public static final void method1020(class101 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2514++;
        class156.field2607 = arg5;
        class120.field2029 = 1;
        class116.field1979 = arg2;
        if (arg1 != -2744) {
            field2505 = 48;
        }
        class269.field4697 = arg0;
        class56.field874 = arg4;
        class75.field1171 = 10000;
        class47.field737 = arg3;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILsb;)V")
    public static final void method1021(int arg0, class109 arg1) {
        field2513++;
        if (class72.field1146 == arg1.field1823 || arg1.field1800 == -1 || arg1.field1785 != 0 || arg1.field1797 + 1 > class186.method1242(0, arg1.field1800).field46[arg1.field1771]) {
            int var2 = class72.field1146 - arg1.field1763;
            int var3 = arg1.field1823 - arg1.field1763;
            int var4 = arg1.field1788 * 128 + (arg1.method763(-1) * 64);
            int var5 = arg1.field1794 * 128 + (arg1.method763(-1) * 64);
            int var6 = arg1.field1791 * 128 + arg1.method763(-1) * 64;
            int var7 = arg1.field1817 * 128 + (arg1.method763(-1) * 64);
            arg1.field1799 = ((var3 - var2) * var4 + var2 * var6) / var3;
            arg1.field1793 = ((var3 - var2) * var5 + var2 * var7) / var3;
        }
        int var8 = 109 % ((arg0 + 44) / 36);
        arg1.field1765 = 0;
        if (arg1.field1781 == 0) {
            arg1.field1816 = 1024;
        }
        if (arg1.field1781 == 1) {
            arg1.field1816 = 1536;
        }
        if (arg1.field1781 == 2) {
            arg1.field1816 = 0;
        }
        if (arg1.field1781 == 3) {
            arg1.field1816 = 512;
        }
        arg1.field1798 = arg1.field1816;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)Lih;")
    public static final class275 method1022(int arg0, byte arg1) {
        field2511++;
        class275 var2 = (class275) class187.field3184.method1411(-4, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class231.field3970.method666(class110.method770(false, arg0), class112.method800(arg0, -62), (byte) -51);
        class275 var4 = new class275();
        if (arg1 != -116) {
            return null;
        }
        var4.field4881 = arg0;
        if (var3 != null) {
            var4.method1852(arg1 + 71, new class187(var3));
        }
        var4.method1848(-1);
        class187.field3184.method1404((long) arg0, false, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method1023(int arg0) {
        field2508 = null;
        if (arg0 != 1) {
            method1023(119);
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class148() {
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lwj;)V")
    public class148(class148 arg0) {
        this.field2506 = arg0.field2506;
        this.field2509 = arg0.field2509;
        this.field2515 = arg0.field2515;
        this.field2510 = arg0.field2510;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class467 extends class281 {

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "Lkw;")
    public class263 field6479;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "Lcha;")
    public class230 field6480;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "Ljava/lang/String;")
    public static String field6471 = null;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public int field6475;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public int field6477;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
    public int field6478;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    public int field6481;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "I")
    public int field6483;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "Ldga;")
    public static class219 field6472;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Laj;Laj;Laj;ILaj;)V", line = 5)
    public static final void method2757(class333 arg0, class333 arg1, class333 arg2, int arg3, class333 arg4) {
        field6476++;
        class777.field10678 = arg2;
        if (arg3 < -50) {
            class287.field4233 = arg4;
            class366.field5326 = arg1;
            class111.field1528 = new class668[class777.field10678.method2094((byte) -115)][];
            class634.field8855 = new boolean[class777.field10678.method2094((byte) -115)];
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)V", line = 23)
    public final void method2758(byte arg0) {
        this.field6478 = this.field6479.field3903;
        this.field6475 = this.field6479.field3907;
        field6482++;
        if (arg0 >= -16) {
            this.field6477 = 102;
        }
        this.field6483 = this.field6479.field3902;
        if (this.field6479.field3900 != null) {
            this.field6479.field3900.method974(this.field6480.field3137, this.field6480.field3126, this.field6480.field3125, class13.field196);
        }
        this.field6481 = class13.field196[2];
        this.field6477 = class13.field196[0];
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lwp;I)I", line = 46)
    public static final int method2759(class192 arg0, int arg1) {
        field6474++;
        class220 var2 = arg0.field2577;
        int var3 = -69 % ((arg1 - 60) / 61);
        if (var2.field2995 != null) {
            var2 = var2.method1449(class382.field5602, -1);
            if (var2 == null) {
                return -1;
            }
        }
        int var4 = var2.field2927;
        class208 var5 = arg0.method1014((byte) -34);
        if (arg0.field1794 == -1 || arg0.field1826) {
            var4 = var2.field2972;
        } else if (arg0.field1794 == var5.field2765 || arg0.field1794 == var5.field2744 || arg0.field1794 == var5.field2737 || arg0.field1794 == var5.field2739) {
            var4 = var2.field2953;
        } else if (arg0.field1794 == var5.field2716 || arg0.field1794 == var5.field2727 || arg0.field1794 == var5.field2729 || arg0.field1794 == var5.field2754) {
            var4 = var2.field2945;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Lsca;", line = 84)
    public static final class49 method2760(int arg0, int arg1) {
        field6473++;
        class49[] var2 = class48.method368((byte) 104);
        int var3 = 0;
        int var4 = -73 / ((arg1 + 88) / 34);
        while (var3 < var2.length) {
            class49 var5 = var2[var3];
            if (var5.field736 == arg0) {
                return var5;
            }
            var3++;
        }
        return null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 114)
    public static final void method2761(int arg0) {
        class178.field2377 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(B)V", line = 120)
    public static void method2762(byte arg0) {
        if (arg0 != 105) {
            method2760(114, -20);
        }
        field6472 = null;
        field6471 = null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lkw;Lsp;)V", line = 135)
    public class467(class263 arg0, class663 arg1) {
        this.field6479 = arg0;
        this.field6480 = this.field6479.method1737(1);
        this.method2758((byte) -98);
    }
}

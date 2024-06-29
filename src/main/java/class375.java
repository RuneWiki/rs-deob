import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class375 extends class333 {

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public int field5094 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public int field5096 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public int field5093 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    public int field5100 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    public int field5099 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
    public int field5106 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
    public int field5105 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
    public int field5102 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "Lwl;")
    public class679 field5104;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "Z")
    public static boolean field5098 = false;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "Lps;")
    public static class469 field5097 = new class469(1, 2);

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "Lgk;")
    public static class616 field5107 = new class616();

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lwl;)V", line = 159)
    public class375(class679 arg0) {
        this.field5104 = arg0;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lr;ZII)Lla;", line = 9)
    public static final class413 method2174(class564 arg0, boolean arg1, int arg2, int arg3) {
        field5095++;
        class651 var4 = class386.method2210(arg0, -85, arg2, arg1);
        int var5 = -25 % ((59 - arg3) / 34);
        return var4 == null ? null : var4.field9146;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IBIIIII)Z", line = 44)
    public static final boolean method2175(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5103++;
        if (!class321.field3945) {
            return false;
        } else if (class697.field9783 < 100) {
            return false;
        } else if (arg4 != arg6 || arg0 != arg2) {
            int var9 = arg6;
            if (arg1 != -21) {
                field5098 = true;
            }
            while (arg4 >= var9) {
                for (int var12 = arg0; var12 <= arg2; var12++) {
                    if (class269.field3348[arg3][var9][var12] == -class507.field7280) {
                        return false;
                    }
                }
                var9++;
            }
            int var10 = (arg6 << class559.field7984) + 1;
            int var11 = (arg0 << class559.field7984) + 2;
            if (class300.method1744(arg5, var11, -22975, (arg4 + 1 - arg6) * class171.field1904, (arg2 + 1 - arg0) * class171.field1904, class156.field1743[arg3].method1608(arg0, 840, arg6), var10)) {
                class676.field9402++;
                return true;
            } else {
                return false;
            }
        } else if (class64.method349(arg1 ^ 0xFFFFFFA1, arg6, arg3, arg0)) {
            int var7 = arg6 << class559.field7984;
            int var8 = arg0 << class559.field7984;
            if (class300.method1744(arg5, var8, arg1 ^ 0x59AA, class171.field1904, class171.field1904, class156.field1743[arg3].method1608(arg0, 840, arg6), var7)) {
                class676.field9402++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)Z", line = 109)
    public final boolean method2176(int arg0, int arg1, int arg2) {
        field5101++;
        if (arg1 != 1) {
            this.field5105 = -116;
        }
        if (arg2 >= this.field5105 && arg2 <= this.field5100 && arg0 >= this.field5093 && this.field5096 >= arg0) {
            return true;
        } else {
            return arg2 >= this.field5094 && this.field5099 >= arg2 && this.field5102 <= arg0 && arg0 <= this.field5106;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V", line = 133)
    public static void method2177(byte arg0) {
        field5097 = null;
        field5107 = null;
        if (arg0 != -22) {
            method2174(null, true, -81, -32);
        }
    }
}

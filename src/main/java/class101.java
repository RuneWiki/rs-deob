import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class101 {

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Lgd;")
    private class273 field1791 = new class273();

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Llc;")
    private static class143 field1792 = class66.method374("Opened title screen", -1);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Llc;")
    public static class143 field1790 = field1792;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "Llc;")
    private static class143 field1805 = class66.method374("red:", -1);

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Llc;")
    public static class143 field1795 = field1805;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "Llc;")
    public static class143 field1804 = field1805;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "Llc;")
    public static class143 field1807 = class66.method374("k", -1);

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Lgd;")
    private class273 field1806;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Lgd;")
    public final class273 method599(int arg0) {
        field1802++;
        class273 var2 = this.field1791.field4868;
        if (this.field1791 == var2) {
            this.field1806 = null;
            return null;
        }
        if (arg0 != 0) {
            field1790 = null;
        }
        this.field1806 = var2.field4868;
        return var2;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
    public static void method600(byte arg0) {
        field1792 = null;
        field1804 = null;
        field1807 = null;
        field1805 = null;
        field1795 = null;
        field1790 = null;
        int var1 = -103 % ((6 - arg0) / 56);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1803++;
        if (arg5 <= 67) {
            method608(-107, 2, -58, -19, -43, -124, -34);
        }
        if (class47.method289((byte) 55, arg6)) {
            class76.field1419 = null;
            class149.method968(arg0, arg7, arg1, arg2, -78, arg3, -1, arg8, arg4, class223.field4045[arg6]);
            if (class76.field1419 != null) {
                class149.method968(arg0, class237.field4304, arg1, class271.field4840, -44, arg3, -1412584499, arg8, arg4, class76.field1419);
                class76.field1419 = null;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class69.field1323[var9] = true;
            }
        } else {
            class69.field1323[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLgd;)V")
    public final void method602(boolean arg0, class273 arg1) {
        if (arg1.field4859 != null) {
            arg1.method1800(99);
        }
        arg1.field4868 = this.field1791;
        field1800++;
        arg1.field4859 = this.field1791.field4859;
        arg1.field4859.field4868 = arg1;
        arg1.field4868.field4859 = arg1;
        if (!arg0) {
            this.field1791 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lcc;ILcc;)V")
    public static final void method603(class217 arg0, int arg1, class217 arg2) {
        field1798++;
        if (arg2.field3971 != null) {
            arg2.method1490(-28126);
        }
        arg2.field3971 = arg0;
        if (arg1 <= 125) {
            method604(-46, -20);
        }
        arg2.field3974 = arg0.field3974;
        arg2.field3971.field3974 = arg2;
        arg2.field3974.field3971 = arg2;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lik;")
    public static final class225 method604(int arg0, int arg1) {
        if (arg1 > -6) {
            return null;
        }
        field1796++;
        class225 var2 = (class225) class4.field61.method826((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        class225 var3 = class62.method353(arg0, class95.field1743, true, false, class172.field3078);
        if (var3 != null) {
            class4.field61.method827(-3, var3, (long) arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLlc;I)V")
    public static final void method605(boolean arg0, class143 arg1, int arg2) {
        class143 var3 = arg1.method868(-86);
        short[] var4 = new short[16];
        field1794++;
        int var5 = 0;
        for (int var6 = 0; var6 < class112.field1967; var6++) {
            class148 var9 = class262.method1743(var6, arg2 ^ 0xFFFFBC29);
            if ((!arg0 || var9.field2711) && var9.field2713 == -1 && var9.field2672 == -1 && var9.field2705 == 0 && var9.field2681.method868(42).method891(-31978, var3) != -1) {
                if (var5 >= 250) {
                    class107.field1892 = null;
                    class30.field472 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class107.field1892 = var4;
        if (arg2 != -1) {
            method601(-5, -4, 36, -69, -35, -80, 83, -1, 121);
        }
        class24.field407 = 0;
        class30.field472 = var5;
        class143[] var7 = new class143[class30.field472];
        for (int var8 = 0; var8 < class30.field472; var8++) {
            var7[var8] = class262.method1743(var4[var8], 17366).field2681;
        }
        class37.method247(class107.field1892, var7, (byte) 114);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)I")
    public final int method606(int arg0) {
        field1793++;
        if (arg0 != -28616) {
            return 55;
        }
        int var2 = 0;
        class273 var3 = this.field1791.field4868;
        while (this.field1791 != var3) {
            var3 = var3.field4868;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)Lgd;")
    public final class273 method607(byte arg0) {
        if (arg0 <= 121) {
            return null;
        }
        class273 var2 = this.field1806;
        field1801++;
        if (this.field1791 == var2) {
            this.field1806 = null;
            return null;
        } else {
            this.field1806 = var2.field4868;
            return var2;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIII)V")
    public static final void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 - arg5) >= class31.field481 && class9.field173 >= (arg5 + arg6) && class188.field3398 <= arg3 - arg5 && arg3 + arg5 <= class239.field4321) {
            class269.method1781(arg2, arg6, arg4, arg0, arg5, arg3, (byte) 88);
        } else {
            class282.method1859(arg3, arg5, 3, arg0, arg4, arg2, arg6);
        }
        field1797++;
        if (arg1 != 0) {
            method603((class217) null, -35, (class217) null);
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
    public class101() {
        this.field1791.field4859 = this.field1791;
        this.field1791.field4868 = this.field1791;
    }
}

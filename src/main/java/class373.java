import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public abstract class class373 extends class543 {

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "S")
    public short field5065;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "Lfja;")
    public static class783 field5067 = new class783(111, -1);

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "Ljia;")
    public static class645 field5070 = new class645();

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "Liv;")
    public static class107 field5061;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "Lgj;")
    public static class662 field5068;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)V", line = 5)
    public static void method2264(byte arg0) {
        field5061 = null;
        field5068 = null;
        if (arg0 != -52) {
            method2265(125);
        }
        field5067 = null;
        field5070 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILha;)Z", line = 19)
    public final boolean method2261(int arg0, class66 arg1) {
        ++field5066;
        int var3 = 98 % ((21 - arg0) / 48);
        return class660.method3710(this, 6306, super.field7396 >> class654.field9055, super.field7398 >> class654.field9055, super.field7404);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([Lbq;Z)I", line = 29)
    public final int method2262(class307[] arg0, boolean arg1) {
        ++field5064;
        int var3 = super.field7396 >> class654.field9055;
        int var4 = super.field7398 >> class654.field9055;
        int var5 = 0;
        if (class434.field5912 == var3) {
            ++var5;
        } else if (~var3 < ~class434.field5912) {
            var5 += 2;
        }
        if (~class111.field1920 != ~var4) {
            if (class111.field1920 > var4) {
                var5 += 6;
            }
        } else {
            var5 += 3;
        }
        int var6 = class155.field2538[var5];
        if (~(this.field5065 & var6) != -1) {
            return this.method3065(var4, -110, var3, arg0);
        } else if (~this.field5065 == -2 && ~var3 < -1) {
            return this.method3065(var4, -96, var3 + -1, arg0);
        } else if (this.field5065 == 4 && var3 <= class441.field5980) {
            return this.method3065(var4, -117, var3 - -1, arg0);
        } else if (this.field5065 == 8 && ~var4 < -1) {
            return this.method3065(var4 + -1, -118, var3, arg0);
        } else if (this.field5065 == 2 && ~var4 >= ~class375.field5083) {
            return this.method3065(var4 + 1, -125, var3, arg0);
        } else if (this.field5065 == 16 && var3 > 0 && var4 <= class375.field5083) {
            return this.method3065(var4 + 1, -125, var3 + -1, arg0);
        } else {
            if (arg1) {
                method2267(68, false);
            }
            if (this.field5065 == 32 && class441.field5980 >= var3 && class375.field5083 >= var4) {
                return this.method3065(var4 + 1, -107, var3 + 1, arg0);
            } else if (~this.field5065 == -129 && var3 > 0 && ~var4 < -1) {
                return this.method3065(var4 + -1, -90, var3 + -1, arg0);
            } else if (this.field5065 == 64 && ~var3 >= ~class441.field5980 && var4 > 0) {
                return this.method3065(var4 + -1, -127, var3 + 1, arg0);
            } else {
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "(I)Z", line = 111)
    public static final boolean method2265(int arg0) {
        ++field5060;
        class410 var1 = (class410) class153.field2516.method3589((byte) -128);
        if (var1 == null) {
            return false;
        } else {
            for (int var2 = arg0; var1.field5610 > var2; ++var2) {
                if (var1.field5603[var2] != null && ~var1.field5603[var2].field7412 == -1) {
                    return false;
                }
                if (var1.field5612[var2] != null && ~var1.field5612[var2].field7412 == -1) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)V", line = 151)
    public static final void method2266(boolean arg0, int arg1) {
        ++field5062;
        if (arg0) {
            class281 var2 = class54.method395((byte) -53, (long) arg1, 1);
            var2.method1818((byte) 119);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)Lrha;", line = 168)
    public static final class235 method2267(int arg0, boolean arg1) {
        ++field5063;
        class235[] var2 = class234.method1578(-121);
        int var3 = 0;
        if (!arg1) {
            field5061 = null;
        }
        while (~var3 > ~var2.length) {
            class235 var4 = var2[var3];
            if (~var4.field3378 == ~arg0) {
                return var4;
            }
            ++var3;
        }
        return null;
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)Z", line = 195)
    public final boolean method2263(int arg0) {
        ++field5069;
        if (arg0 != -2) {
            this.method2263(-66);
        }
        return class641.field8883[(super.field7396 >> class654.field9055) + -class434.field5912 + class389.field5342][(super.field7398 >> class654.field9055) + -class111.field1920 + class389.field5342];
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIIIII)V", line = 206)
    public class373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field7404 = (byte) arg4;
        super.field7398 = arg2;
        super.field7405 = arg1;
        this.field5065 = (short) arg5;
        super.field7391 = (byte) arg3;
        super.field7396 = arg0;
    }
}

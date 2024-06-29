import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public abstract class class465 extends class383 {

    @OriginalMember(owner = "client!hfa", name = "E", descriptor = "S")
    public short field6646;

    @OriginalMember(owner = "client!hfa", name = "z", descriptor = "I")
    public static int field6641 = -1;

    @OriginalMember(owner = "client!hfa", name = "G", descriptor = "Ljava/lang/String;")
    public static String field6648 = "";

    @OriginalMember(owner = "client!hfa", name = "C", descriptor = "F")
    public static float field6644;

    @OriginalMember(owner = "client!hfa", name = "w", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!hfa", name = "x", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!hfa", name = "y", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!hfa", name = "A", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!hfa", name = "B", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!hfa", name = "D", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!hfa", name = "F", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lsp;IIIIII)V")
    public static final void method2686(class677 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == 6) {
            class372.method2165(arg4, arg0.field5166, arg2 + -123, arg1, arg0.field5179, arg3, arg6, arg0.field5176, arg5, 0);
            ++field6642;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "(B)Z")
    public final boolean method483(byte arg0) {
        if (arg0 < 101) {
            this.method481(29);
        }
        ++field6640;
        return class286.method1663(super.field5179 >> class559.field7984, this, super.field5169, super.field5176 >> class559.field7984, 1);
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I[Leq;)I")
    public final int method479(int arg0, class670[] arg1) {
        ++field6647;
        int var3 = super.field5179 >> class559.field7984;
        int var4 = super.field5176 >> class559.field7984;
        int var5 = 0;
        if (class309.field3830 == var3) {
            ++var5;
        } else if (var3 > class309.field3830) {
            var5 += 2;
        }
        if (~class379.field5139 != ~var4) {
            if (~class379.field5139 < ~var4) {
                var5 += 6;
            }
        } else {
            var5 += 3;
        }
        int var6 = class489.field7116[var5];
        if ((this.field6646 & var6) != 0) {
            return this.method2199(var3, var4, arg1, -112);
        } else if (this.field6646 == 1 && var3 > 0) {
            return this.method2199(var3 + -1, var4, arg1, arg0 + 26285);
        } else if (~this.field6646 == -5 && class122.field1369 >= var3) {
            return this.method2199(var3 + 1, var4, arg1, arg0 + 26279);
        } else if (~this.field6646 == -9 && var4 > 0) {
            return this.method2199(var3, var4 + -1, arg1, -125);
        } else if (~this.field6646 == -3 && var4 <= class247.field3058) {
            return this.method2199(var3, var4 + 1, arg1, arg0 ^ 26288);
        } else {
            if (arg0 != -26355) {
                field6648 = null;
            }
            if (~this.field6646 == -17 && ~var3 < -1 && class247.field3058 >= var4) {
                return this.method2199(var3 + -1, var4 + 1, arg1, 79);
            } else if (this.field6646 == 32 && class122.field1369 >= var3 && var4 <= class247.field3058) {
                return this.method2199(var3 + 1, var4 - -1, arg1, 127);
            } else if (~this.field6646 == -129 && ~var3 < -1 && var4 > 0) {
                return this.method2199(var3 + -1, var4 + -1, arg1, arg0 ^ 26257);
            } else if (this.field6646 == 64 && ~var3 >= ~class122.field1369 && ~var4 < -1) {
                return this.method2199(var3 + 1, var4 - 1, arg1, 125);
            } else {
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!hfa", name = "k", descriptor = "(I)Lqs;")
    public static final class71 method2687(int arg0) {
        ++field6643;
        int var1 = -92 % ((-33 - arg0) / 56);
        try {
            return new class86();
        } catch (Throwable var3) {
            try {
                return (class71) Class.forName("ph").newInstance();
            } catch (Throwable var2) {
                return new class354();
            }
        }
    }

    @OriginalMember(owner = "client!hfa", name = "l", descriptor = "(I)V")
    public static void method2688(int arg0) {
        if (arg0 != -1) {
            method2686((class677) null, 43, 63, -62, -98, -118, -77);
        }
        field6648 = null;
    }

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "(I)Z")
    public final boolean method481(int arg0) {
        ++field6645;
        if (arg0 != 0) {
            field6638 = 85;
        }
        return class475.field6837[(super.field5179 >> class559.field7984) + -class309.field3830 + class460.field6544][(super.field5176 >> class559.field7984) - class379.field5139 + class460.field6544];
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(IIIIII)V")
    public class465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field5176 = arg2;
        super.field5178 = arg1;
        this.field6646 = (short) arg5;
        super.field5169 = (byte) arg4;
        super.field5179 = arg0;
        super.field5166 = (byte) arg3;
    }
}

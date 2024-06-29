import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public abstract class class332 extends class538 {

    @OriginalMember(owner = "client!po", name = "x", descriptor = "S")
    public short field4824;

    @OriginalMember(owner = "client!po", name = "A", descriptor = "[I")
    public static int[] field4827 = new int[13];

    @OriginalMember(owner = "client!po", name = "D", descriptor = "I")
    public static int field4830 = 0;

    @OriginalMember(owner = "client!po", name = "w", descriptor = "Liba;")
    public static class211 field4823 = new class211(18, -1);

    @OriginalMember(owner = "client!po", name = "y", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!po", name = "z", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!po", name = "B", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "J")
    public static long field4822;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "Lr;")
    public static class98 field4821;

    @OriginalMember(owner = "client!po", name = "C", descriptor = "Ljava/awt/Font;")
    public static Font field4829;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(I)Z")
    public final boolean method1809(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field4825;
            return class406.field6066[(super.field7895 >> class125.field1831) - class361.field5293 + class176.field2466][(super.field7896 >> class125.field1831) + -class545.field8045 - -class176.field2466];
        }
    }

    @OriginalMember(owner = "client!po", name = "i", descriptor = "(I)V")
    public static void method2041(int arg0) {
        field4829 = null;
        field4827 = null;
        field4821 = null;
        field4823 = null;
        if (arg0 != 13) {
            method2041(15);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I[Ltg;)I")
    public final int method1808(int arg0, class334[] arg1) {
        ++field4826;
        int var3 = super.field7895 >> class125.field1831;
        int var4 = super.field7896 >> class125.field1831;
        int var5 = 0;
        if (~class361.field5293 != ~var3) {
            if (~var3 < ~class361.field5293) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (~class545.field8045 == ~var4) {
            var5 += 3;
        } else if (class545.field8045 > var4) {
            var5 += 6;
        }
        int var6 = class134.field1947[var5];
        if (~(this.field4824 & var6) != -1) {
            return this.method3104(var3, var4, (byte) -126, arg1);
        } else if (~this.field4824 == -2 && ~var3 < -1) {
            return this.method3104(var3 + -1, var4, (byte) -80, arg1);
        } else if (this.field4824 == 4 && ~var3 >= ~class91.field1390) {
            return this.method3104(var3 + 1, var4, (byte) -66, arg1);
        } else if (~this.field4824 == -9 && ~var4 < -1) {
            return this.method3104(var3, var4 + -1, (byte) -61, arg1);
        } else if (this.field4824 == 2 && var4 <= class575.field8372) {
            return this.method3104(var3, var4 + 1, (byte) -108, arg1);
        } else if (this.field4824 == arg0 && ~var3 < -1 && ~class575.field8372 <= ~var4) {
            return this.method3104(var3 + -1, var4 + 1, (byte) -88, arg1);
        } else if (~this.field4824 == -33 && class91.field1390 >= var3 && ~class575.field8372 <= ~var4) {
            return this.method3104(var3 - -1, var4 + 1, (byte) -100, arg1);
        } else if (~this.field4824 == -129 && ~var3 < -1 && var4 > 0) {
            return this.method3104(var3 - 1, var4 - 1, (byte) -55, arg1);
        } else if (~this.field4824 == -65 && class91.field1390 >= var3 && ~var4 < -1) {
            return this.method3104(var3 - -1, var4 + -1, (byte) -127, arg1);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(IIIIII)V")
    public class332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4824 = (short) arg5;
        super.field7900 = (byte) arg4;
        super.field7905 = (byte) arg3;
        super.field7895 = arg0;
        super.field7894 = arg1;
        super.field7896 = arg2;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(Z)Z")
    public final boolean method1807(boolean arg0) {
        if (arg0) {
            method2041(114);
        }
        ++field4828;
        return class443.method2618(super.field7900, super.field7896 >> class125.field1831, this, super.field7895 >> class125.field1831, 75);
    }
}

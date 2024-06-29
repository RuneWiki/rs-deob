import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class721 extends class210 {

    @OriginalMember(owner = "client!si", name = "x", descriptor = "S")
    public short field9466;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public static int field9472 = -1;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "Luw;")
    public static class208 field9468 = new class208(57, 12);

    @OriginalMember(owner = "client!si", name = "H", descriptor = "S")
    public static short field9475 = 256;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "Lrn;")
    public static class633 field9477 = new class633(55, 8);

    @OriginalMember(owner = "client!si", name = "G", descriptor = "F")
    public static float field9474;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public static int field9467;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    public static int field9469;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field9470;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field9471;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "Luw;")
    public static class208 field9476;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([Lgu;I)I", line = 11)
    public final int method719(class757[] arg0, int arg1) {
        ++field9467;
        int var3 = super.field2896 >> class88.field1221;
        int var4 = super.field2900 >> class88.field1221;
        int var5 = 0;
        if (arg1 <= 62) {
            this.field9466 = -9;
        }
        if (~class454.field5914 != ~var3) {
            if (~class454.field5914 > ~var3) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (~class309.field3875 == ~var4) {
            var5 += 3;
        } else if (class309.field3875 > var4) {
            var5 += 6;
        }
        int var6 = class269.field3553[var5];
        if (~(this.field9466 & var6) != -1) {
            return this.method1406(var3, arg0, var4, 61);
        } else if (this.field9466 == 1 && ~var3 < -1) {
            return this.method1406(var3 + -1, arg0, var4, 52);
        } else if (this.field9466 == 4 && var3 <= class330.field4039) {
            return this.method1406(var3 - -1, arg0, var4, 46);
        } else if (this.field9466 == 8 && var4 > 0) {
            return this.method1406(var3, arg0, var4 + -1, 122);
        } else if (this.field9466 == 2 && var4 <= class559.field7102) {
            return this.method1406(var3, arg0, var4 + 1, 68);
        } else if (~this.field9466 == -17 && ~var3 < -1 && ~var4 >= ~class559.field7102) {
            return this.method1406(var3 + -1, arg0, var4 + 1, 118);
        } else if (this.field9466 == 32 && class330.field4039 >= var3 && class559.field7102 >= var4) {
            return this.method1406(var3 + 1, arg0, var4 + 1, 96);
        } else if (~this.field9466 == -129 && var3 > 0 && var4 > 0) {
            return this.method1406(var3 + -1, arg0, var4 - 1, 87);
        } else if (~this.field9466 == -65 && ~var3 >= ~class330.field4039 && var4 > 0) {
            return this.method1406(var3 + 1, arg0, var4 + -1, 86);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIII)V", line = 91)
    public class721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field2889 = (byte) arg4;
        super.field2900 = arg2;
        this.field9466 = (short) arg5;
        super.field2896 = arg0;
        super.field2892 = arg1;
        super.field2895 = (byte) arg3;
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "(I)Laca;", line = 107)
    public static final class230 method3864(int arg0) {
        class534.field6741 = 0;
        if (arg0 != -19036) {
            return null;
        } else {
            ++field9470;
            return class595.method3207((byte) -126);
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)Z", line = 122)
    public final boolean method718(int arg0) {
        if (arg0 > -95) {
            method3865((byte) -85);
        }
        ++field9473;
        return class145.field1873[(super.field2896 >> class88.field1221) - class454.field5914 + class76.field1069][(super.field2900 >> class88.field1221) + -class309.field3875 + class76.field1069];
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Lha;I)Z", line = 133)
    public final boolean method717(class570 arg0, int arg1) {
        ++field9469;
        int var3 = -16 / ((21 - arg1) / 53);
        return class562.method3041(this, super.field2900 >> class88.field1221, super.field2889, super.field2896 >> class88.field1221, (byte) -84);
    }

    @OriginalMember(owner = "client!si", name = "i", descriptor = "(B)V", line = 143)
    public static void method3865(byte arg0) {
        field9468 = null;
        if (arg0 > -60) {
            method3865((byte) -90);
        }
        field9476 = null;
        field9477 = null;
    }
}

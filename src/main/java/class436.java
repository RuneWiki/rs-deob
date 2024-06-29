import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public abstract class class436 extends class543 {

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "S")
    public short field5931;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "[F")
    public static float[] field5932 = new float[16384];

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "[F")
    public static float[] field5937 = new float[16384];

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "Lvl;")
    public static class15 field5939;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "Lhn;")
    public static class752 field5938;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILha;)Z")
    public final boolean method2261(int arg0, class66 arg1) {
        ++field5933;
        int var3 = -108 % ((21 - arg0) / 48);
        return class757.method4186(super.field7404, (byte) -49, super.field7396 >> class654.field9055, super.field7398 >> class654.field9055);
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)Z")
    public final boolean method2263(int arg0) {
        ++field5935;
        return arg0 != -2 ? true : class641.field8883[(super.field7396 >> class654.field9055) + class389.field5342 + -class434.field5912][(super.field7398 >> class654.field9055) - -class389.field5342 + -class111.field1920];
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(IIIIII)V")
    public class436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field7391 = (byte) arg3;
        super.field7405 = arg1;
        this.field5931 = (short) arg5;
        super.field7398 = arg2;
        super.field7404 = (byte) arg4;
        super.field7396 = arg0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lbq;Z)I")
    public final int method2262(class307[] arg0, boolean arg1) {
        ++field5934;
        return arg1 ? 19 : this.method3065(super.field7398 >> class654.field9055, -101, super.field7396 >> class654.field9055, arg0);
    }

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "(I)V")
    public static void method2546(int arg0) {
        field5938 = null;
        field5937 = null;
        if (arg0 >= -7) {
            method2548(0);
        }
        field5939 = null;
        field5932 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIJ)Ljava/lang/String;")
    public static final String method2547(int arg0, int arg1, long arg2) {
        class127.method1087((byte) 83, arg2);
        if (arg0 != 10) {
            method2548(114);
        }
        ++field5930;
        int var4 = class60.field821.get(5);
        int var5 = 1 + class60.field821.get(2);
        int var6 = class60.field821.get(1);
        int var7 = class60.field821.get(11);
        int var8 = class60.field821.get(12);
        return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10;
    }

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "(I)V")
    public static final void method2548(int arg0) {
        class760.method4203((long) class440.field5977, arg0 ^ 7965, class95.field1472);
        ++field5936;
        if (~class359.field4911 != 0) {
            class61.method429((byte) 92, class359.field4911);
        }
        for (int var1 = 0; ~class526.field7139 < ~var1; ++var1) {
            if (class377.field5145[var1]) {
                class684.field9516[var1] = true;
            }
            class338.field4574[var1] = class377.field5145[var1];
            class377.field5145[var1] = false;
        }
        class1.field12 = class440.field5977;
        if (~class359.field4911 != 0) {
            class526.field7139 = 0;
            class677.method3819(true);
        }
        class95.field1472.method575();
        class277.method1781(class95.field1472, 8384);
        int var2 = class734.method4074((byte) 82);
        if (var2 == -1) {
            var2 = class335.field4516;
        }
        if (~var2 == 0) {
            var2 = class84.field1154;
        }
        class391.method2367(var2, -90);
        class241.field3425 = arg0;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field5932[var2] = (float) Math.sin((double) var2 * var0);
            field5937[var2] = (float) Math.cos((double) var2 * var0);
        }
        field5939 = new class15(33, 4);
    }
}

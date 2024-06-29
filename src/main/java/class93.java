import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class93 extends class298 {

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "Lpn;")
    public static class72 field1156 = new class72(23, 8);

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public static int field1161 = 0;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "Lqe;")
    public static class160 field1153;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "Lg;")
    public static class470 field1162;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I")
    public static final int method459(int arg0, int arg1) {
        ++field1152;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return arg0 != -719824240 ? 120 : var6 + 1;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public static void method460(int arg0) {
        field1162 = null;
        field1153 = null;
        field1156 = null;
        if (arg0 != 1435) {
            field1153 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class93() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILvt;)Lgd;")
    public static final class121 method461(int arg0, class179 arg1) {
        if (arg0 < 4) {
            method463(121, -123, -103);
        }
        ++field1154;
        return new class121(arg1.method906(-15), arg1.method906(-93), arg1.method906(-9), arg1.method906(-110), arg1.method906(-28), arg1.method906(-111), arg1.method906(-38), arg1.method906(-49), arg1.method899((byte) 117), arg1.method895((byte) -116));
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Loj;BJ)V")
    public static final void method462(class280 arg0, byte arg1, long arg2) {
        class318.field4632 = 0;
        class92.field1144 = class480.field6794;
        ++field1155;
        class480.field6794 = 0;
        int var4 = -23 / ((arg1 - -26) / 34);
        long var5 = class434.method2591(-19310);
        for (class380 var7 = (class380) class224.field3110.method2334(-103); var7 != null; var7 = (class380) class224.field3110.method2340(-89)) {
            if (var7.method2273(arg0, arg2)) {
                ++class318.field4632;
            }
        }
        if (class262.field3773 && arg2 % 100L == 0L) {
            System.out.println("Particle system count: " + class224.field3110.method2337(0) + ", running: " + class318.field4632 + ". Particles: " + class480.field6794 + ". Time taken: " + (-var5 + class434.method2591(-19310)) + "ms");
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)[I")
    public final int[] method13(int arg0, boolean arg1) {
        if (!arg1) {
            field1162 = null;
        }
        ++field1158;
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            class268.method1621(var3, 0, class158.field1877, class156.field1865[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(III)I")
    public static final int method463(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            field1159 = 12;
        }
        ++field1157;
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg0 + -var3;
    }
}

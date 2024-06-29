import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class264 extends class270 {

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public int field3339;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public int field3336;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "Lkfa;")
    public static class549 field3337 = new class549(50, 0);

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "[F")
    public static float[] field3341 = new float[16384];

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "[F")
    public static float[] field3340 = new float[16384];

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "Z")
    public static boolean field3343;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Ljava/lang/Object;")
    public static Object field3333;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3341[var2] = (float) Math.sin((double) var2 * var0);
            field3340[var2] = (float) Math.cos((double) var2 * var0);
        }
        field3343 = false;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)I", line = 3)
    public final int method1495(byte arg0) {
        field3334++;
        if (arg0 <= 103) {
            method1501(34);
        }
        return class189.method1100((byte) 72, this.field3339);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Z", line = 18)
    public final boolean method1496(int arg0, int arg1) {
        field3342++;
        if (arg1 != -1) {
            method1501(126);
        }
        return (this.field3339 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I", line = 29)
    public final int method1497(int arg0) {
        if (arg0 > -75) {
            return -8;
        } else {
            field3335++;
            return this.field3339 >> 18 & 0x7;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V", line = 44)
    public static void method1498(boolean arg0) {
        if (!arg0) {
            method1501(-85);
        }
        field3333 = null;
        field3341 = null;
        field3337 = null;
        field3340 = null;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(B)Z", line = 57)
    public final boolean method1499(byte arg0) {
        field3338++;
        if (arg0 > -45) {
            this.field3339 = -24;
        }
        return (this.field3339 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(B)Z", line = 74)
    public final boolean method1500(byte arg0) {
        if (arg0 <= 123) {
            field3337 = null;
        }
        field3330++;
        return ((this.field3339 & 0x5118F4) >> 22) != 0;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(II)V", line = 84)
    public class264(int arg0, int arg1) {
        this.field3339 = arg0;
        this.field3336 = arg1;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 93)
    public static final void method1501(int arg0) {
        if (arg0 != -1) {
            field3337 = null;
        }
        field3332++;
        class431.field5697 = null;
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(B)Z", line = 109)
    public final boolean method1502(byte arg0) {
        int var2 = -128 / ((-arg0 - 54) / 49);
        field3331++;
        return (this.field3339 & 0x1) != 0;
    }
}

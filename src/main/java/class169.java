import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class169 {

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public int field2524;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public int field2521;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lpd;")
    public class169 field2528;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lc;")
    public class122 field2518;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "[F")
    public static float[] field2525 = new float[4];

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Lol;")
    public static class187 field2523 = new class187("", 10);

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public int field2526;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public int field2529;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Lwl;", line = 5)
    public final class281 method1109(int arg0) {
        if (arg0 > -117) {
            this.field2521 = -44;
        }
        field2527++;
        return class494.method2893(this.field2521, 0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)Lpd;", line = 17)
    public final class169 method1110(byte arg0, int arg1) {
        int var3 = -118 % ((51 - arg0) / 46);
        field2522++;
        return new class169(this.field2521, arg1);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 31)
    public static void method1111(int arg0) {
        field2523 = null;
        if (arg0 != 0) {
            field2525 = null;
        }
        field2525 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLmg;)I", line = 44)
    public static final int method1112(byte arg0, class101 arg1) {
        field2519++;
        int var2 = 0;
        if (arg1.method747(class317.field4338, (byte) -68)) {
            var2++;
        }
        if (arg1.method747(class129.field1914, (byte) -68)) {
            var2++;
        }
        if (arg1.method747(class231.field3268, (byte) -68)) {
            var2++;
        }
        if (arg1.method747(class211.field2942, (byte) -68)) {
            var2++;
        }
        if (arg1.method747(class261.field3631, (byte) -68)) {
            var2++;
        }
        if (arg1.method747(class175.field2598, (byte) -68)) {
            var2++;
        }
        if (arg0 > -67) {
            field2523 = null;
        }
        if (arg1.method747(class147.field2125, (byte) -68)) {
            var2++;
        }
        if (arg1.method747(class514.field7608, (byte) -68)) {
            var2++;
        }
        if (arg1.method747(class267.field3682, (byte) -68)) {
            var2++;
        }
        if (arg1.method747(class388.field5651, (byte) -68)) {
            var2++;
        }
        if (arg1.method747(class202.field2847, (byte) -68)) {
            var2++;
        }
        if (arg1.method747(class433.field6348, (byte) -68)) {
            var2++;
        }
        if (arg1.method747(class147.field2122, (byte) -68)) {
            var2++;
        }
        if (arg1.method747(class314.field4264, (byte) -68)) {
            var2++;
        }
        if (arg1.method747(class325.field4414, (byte) -68)) {
            var2++;
        }
        if (arg1.method747(class17.field231, (byte) -68)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(II)V", line = 124)
    public class169(int arg0, int arg1) {
        this.field2524 = arg1;
        this.field2521 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lpd;I)V", line = 132)
    public class169(class169 arg0, int arg1) {
        this.field2528 = arg0;
        this.field2524 = this.field2528.field2524 + arg1;
        this.field2521 = this.field2528.field2521;
        this.field2518 = this.field2528.field2518;
    }
}

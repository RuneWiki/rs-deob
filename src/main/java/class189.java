import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class189 {

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lvv;")
    public static class313 field2955 = new class313(71, 2);

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "[F")
    public static float[] field2958;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Lvi;")
    public static class206 field2957;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Llc;")
    public static class494 field2953;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z")
    public static final boolean method1277(int arg0, int arg1, int arg2) {
        field2954++;
        if (arg0 != 0) {
            field2956 = -127;
        }
        return class78.method571(arg1, arg2, (byte) -37) | (arg2 & 0x40000) != 0 || class206.method1354(-2, arg1, arg2);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method1278(byte arg0) {
        if (arg0 == -103) {
            field2958 = null;
            field2953 = null;
            field2955 = null;
            field2957 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z")
    public static final boolean method1279(int arg0, int arg1) {
        field2951++;
        if (arg1 == -18) {
            return arg0 >= 12 && arg0 <= 17;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLia;)V")
    public static final void method1280(byte arg0, class23 arg1) {
        field2952++;
        int var2 = arg1.method123(false);
        class240.field4131 = new class2[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class240.field4131[var3] = new class2();
            class240.field4131[var3].field15 = arg1.method123(false);
            class240.field4131[var3].field13 = arg1.method133(arg0 ^ 0x6B2C);
        }
        class228.field3992 = arg1.method123(false);
        class491.field7176 = arg1.method123(false);
        class11.field124 = arg1.method123(false);
        class275.field4527 = new class239[class491.field7176 + 1 - class228.field3992];
        for (int var4 = 0; var4 < class11.field124; var4++) {
            int var5 = arg1.method123(false);
            class239 var6 = class275.field4527[var5] = new class239();
            var6.field4986 = arg1.method126((byte) -96);
            var6.field4982 = arg1.method143(-3230);
            var6.field4128 = class228.field3992 + var5;
            var6.field4127 = arg1.method133(27482);
            var6.field4119 = arg1.method133(arg0 + 27364);
        }
        class193.field3014 = arg1.method143(-3230);
        class465.field6891 = true;
        if (arg0 != 118) {
            field2956 = -98;
        }
    }

    static {
        new class403("", 73);
        field2958 = new float[16];
        field2957 = new class206("RC", 1);
    }
}

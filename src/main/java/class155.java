import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class155 extends class262 {

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    private int field2739 = -32768;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field2741 = 0;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Lcd;")
    public static class64 field2744 = class44.method335((byte) 71, ")1 ");

    @OriginalMember(owner = "client!df", name = "l", descriptor = "F")
    public static float field2738;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "J")
    public static long field2743;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIIIJ)V", line = 6)
    public final void method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2746++;
        class243 var11 = class132.method949(this.field2742, false).method704((class199) null, 0, this.field2740, -113);
        if (var11 != null) {
            var11.method43(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2739 = var11.method48();
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 25)
    public static final void method1117(byte arg0) {
        if (class69.field1335 < 0) {
            class69.field1335 = 0;
            class255.field4436 = -1;
            class189.field3257 = -1;
        }
        if (class69.field1335 > class226.field3845) {
            class255.field4436 = -1;
            class189.field3257 = -1;
            class69.field1335 = class226.field3845;
        }
        if (arg0 > -21) {
            field2743 = 20L;
        }
        field2747++;
        if (class274.field4699 < 0) {
            class189.field3257 = -1;
            class255.field4436 = -1;
            class274.field4699 = 0;
        }
        if (class274.field4699 > class233.field3934) {
            class189.field3257 = -1;
            class255.field4436 = -1;
            class274.field4699 = class233.field3934;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZI)V", line = 65)
    public static final void method1118(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method1120((byte) -51);
        }
        if (class163.field2865 != 0 && arg2 != -1) {
            class137.method981(arg2, class163.field2865, (byte) 110, class226.field3843, false, 0);
            class43.field696 = true;
        }
        field2736++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)Z", line = 90)
    public static final boolean method1119(byte arg0, int arg1) {
        field2748++;
        if (arg0 != -78) {
            method1117((byte) -27);
        }
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V", line = 107)
    public static void method1120(byte arg0) {
        field2744 = null;
        int var1 = 118 % ((-arg0 - 11) / 63);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()I", line = 116)
    public final int method48() {
        field2737++;
        return this.field2739;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILqm;I)[Lvd;", line = 135)
    public static final class127[] method1121(int arg0, int arg1, class222 arg2, int arg3) {
        if (arg1 == -32768) {
            field2745++;
            return class135.method966(105, arg0, arg3, arg2) ? class11.method94((byte) 116) : null;
        } else {
            return (class127[]) null;
        }
    }
}

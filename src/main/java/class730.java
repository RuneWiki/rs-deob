import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class730 {

    @OriginalMember(owner = "client!sha", name = "f", descriptor = "[I")
    public static int[] field10160 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!sha", name = "e", descriptor = "Ltba;")
    public static class165 field10159 = new class165(8);

    @OriginalMember(owner = "client!sha", name = "k", descriptor = "[Lic;")
    public static class701[] field10165 = new class701[14];

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "I")
    public static int field10156;

    @OriginalMember(owner = "client!sha", name = "d", descriptor = "I")
    public static int field10158;

    @OriginalMember(owner = "client!sha", name = "i", descriptor = "I")
    public static int field10163;

    @OriginalMember(owner = "client!sha", name = "h", descriptor = "[B")
    public byte[] field10162;

    @OriginalMember(owner = "client!sha", name = "j", descriptor = "[Lrba;")
    public static class435[] field10164;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "[S")
    public short[] field10155;

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "[S")
    public short[] field10157;

    @OriginalMember(owner = "client!sha", name = "g", descriptor = "[S")
    public short[] field10161;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)V", line = 8)
    public static final void method4071(int arg0) {
        for (class184 var1 = (class184) class330.field4215.method118(-30553); var1 != null; var1 = (class184) class330.field4215.method111(22548)) {
            if (var1.field2555 > 1) {
                var1.field2555 = 0;
                class263.field3317.method3077((byte) -109, ((class277) var1.field2556.field313.field8921).field3472, var1);
                var1.field2556.method113(arg0 + 65);
            }
        }
        field10156++;
        class159.field2181 = 0;
        class512.field7203 = 0;
        class343.field4334.method3668(arg0);
        class543.field7569.method1161(false);
        class330.field4215.method113(107);
        class14.field276 = false;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZII)Z", line = 38)
    public static final boolean method4072(boolean arg0, int arg1, int arg2) {
        field10158++;
        if (arg0) {
            return (arg2 & 0x100100) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)V", line = 49)
    public static final void method4073(int arg0) {
        if (arg0 < 116) {
            return;
        }
        if (class669.field9386 >= 0) {
            long var1 = class446.method2525(500);
            class669.field9386 = (int) ((long) class669.field9386 - (var1 - class379.field4840));
            if (class669.field9386 <= 0) {
                class372.field4780 = class174.field2432.field2783;
                class563.field7923 = class174.field2432.field2769;
                class383.field4858 = class174.field2432.field2771;
                class762.field10628 = class174.field2432.field2786;
                class637.field8786 = class174.field2432.field2776;
                class621.field8562 = class174.field2432.field2779;
                class546.field7612 = class174.field2432.field2768;
                class669.field9386 = -1;
                class102.field1412 = class174.field2432.field2774;
                class349.field4507 = class174.field2432.field2781;
                class318.field4113 = class174.field2432.field2785;
            } else {
                int var3 = (class669.field9386 << 8) / class383.field4857;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class563.field7923 = ((class721.field10036 & 0xFF00) * var3 + ((class174.field2432.field2769 & 0xFF00) * var4) & 0xFF0000) + ((class721.field10036 & 0xFF00FF) * var3 + (class174.field2432.field2769 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class762.field10628 = (class174.field2432.field2786 - class83.field1137) * var6 + class83.field1137;
                class372.field4780 = (class174.field2432.field2783 - class525.field7338) * var6 + class525.field7338;
                class637.field8786 = ((class300.field3940 & 0xFF00) * var3 + ((class174.field2432.field2776 & 0xFF00) * var4) & 0xFF0000) + ((class300.field3940 & 0xFF00FF) * var3 + (class174.field2432.field2776 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class318.field4113 = (class174.field2432.field2785 - class136.field1951) * var6 + class136.field1951;
                class102.field1412 = (class174.field2432.field2774 - class575.field8086) * var6 + class575.field8086;
                class349.field4507 = class440.field5867 * var3 + class174.field2432.field2781 * var4 >> 8;
                class546.field7612 = (class174.field2432.field2768 - class182.field2547) * var6 + class182.field2547;
                class383.field4858 = (class174.field2432.field2771 - class336.field4261) * var6 + class336.field4261;
                if (class271.field3407 != class174.field2432.field2779) {
                    class621.field8562 = class739.field10303.method485(class271.field3407, class174.field2432.field2779, var6, class621.field8562);
                }
            }
            class379.field4840 = var1;
        }
        field10163++;
    }

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "(I)V", line = 106)
    public static void method4074(int arg0) {
        field10159 = null;
        field10160 = null;
        if (arg0 <= 60) {
            method4073(-112);
        }
        field10165 = null;
        field10164 = null;
    }
}

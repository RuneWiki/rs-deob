import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class421 extends class135 {

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "Leda;")
    public static class116 field6013 = new class116(30, 4);

    @OriginalMember(owner = "client!mt", name = "u", descriptor = "F")
    public static float field6018;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZI)V", line = 4)
    public final void method376(boolean arg0, int arg1) {
        if (arg1 != -25475) {
            method2490((String) null, (class465) null, 28);
        }
        ++field6014;
        super.field2179.method2908(true, (byte) 97);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(III)V", line = 16)
    public final void method377(int arg0, int arg1, int arg2) {
        ++field6015;
        if (arg2 != 0) {
            method2492(-52, (class144) null);
        }
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(B)V", line = 27)
    public static final void method2489(byte arg0) {
        ++field6016;
        class410.method2452((byte) 113);
        class447.field6457 = null;
        class305.field4260 = null;
        class426.field6089 = 0;
        class127.field2083 = null;
        class99.field1481 = 0;
        class376.field5209.field6710 = 0;
        class26.field363 = 0;
        class256.field3697 = null;
        class50.method404(12690);
        class334.method1989(true);
        for (int var1 = 0; ~var1 > -2049; ++var1) {
            class76.field1186[var1] = null;
        }
        class103.field1708 = null;
        for (int var2 = 0; class392.field5702 > var2; ++var2) {
            class88 var4 = class82.field1259[var2].field49;
            if (var4 != null) {
                var4.field2434 = -1;
            }
        }
        class493.method2887(-87);
        class76.field1181 = -1;
        class294.field4104 = -1;
        class40.field544 = 1;
        class595.method3408((byte) 54, 10);
        if (arg0 == -48) {
            for (int var3 = 0; ~var3 > -101; ++var3) {
                class636.field9030[var3] = true;
            }
            class307.method1864(false);
            class586.field8574 = 0L;
            class533.field7844 = null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZ)V", line = 83)
    public final void method375(int arg0, boolean arg1) {
        ++field6012;
        if (arg0 < 14) {
            field6018 = 0.17487994F;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/lang/String;Lek;I)I", line = 97)
    public static final int method2490(String arg0, class465 arg1, int arg2) {
        ++field6011;
        int var3 = arg1.field6710;
        byte[] var4 = class149.method1137(-82, arg0);
        arg1.method2704(var4.length, (byte) 57);
        arg1.field6710 += class427.field6096.method3063(var4.length, var4, arg1.field6710, arg1.field6719, arg2, (byte) 5);
        return arg1.field6710 - var3;
    }

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "(I)V", line = 115)
    public static void method2491(int arg0) {
        field6013 = null;
        if (arg0 != 17065) {
            field6018 = 3.3828053F;
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lnh;)V", line = 125)
    public class421(class495 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "(I)Z", line = 128)
    public final boolean method379(int arg0) {
        ++field6017;
        return arg0 != -4931 ? true : true;
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)V", line = 141)
    public final void method385(int arg0) {
        super.field2179.method2908(false, (byte) 97);
        int var2 = 2 % ((-29 - arg0) / 45);
        ++field6009;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILat;)Llba;", line = 151)
    public static final class198 method2492(int arg0, class144 arg1) {
        ++field6010;
        class198 var2;
        if (class374.field5195 != null) {
            var2 = class374.field5195;
            class374.field5195 = class374.field5195.field3078;
            --class465.field6662;
            var2.field3078 = null;
        } else {
            var2 = new class198();
        }
        if (arg0 != -27822) {
            field6013 = null;
        }
        var2.field3085 = arg1;
        return var2;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Laj;II)V", line = 174)
    public final void method384(class402 arg0, int arg1, int arg2) {
        super.field2179.method2924(13528, arg0);
        ++field6008;
        if (arg1 != 0) {
            this.method375(-2, false);
        }
        super.field2179.method2956((byte) 47, arg2);
    }
}

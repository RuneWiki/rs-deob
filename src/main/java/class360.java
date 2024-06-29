import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class360 extends class417 implements class109 {

    @OriginalMember(owner = "client!un", name = "u", descriptor = "[F")
    public static float[] field4899 = new float[16];

    @OriginalMember(owner = "client!un", name = "s", descriptor = "Lada;")
    public static class144 field4897 = new class144(27, 6);

    @OriginalMember(owner = "client!un", name = "v", descriptor = "[C")
    public static char[] field4900 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!un", name = "q", descriptor = "C")
    public char field4895;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public int field4890;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    public int field4893;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    public int field4894;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "J")
    public long field4888;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)C", line = 5)
    public final char method799(int arg0) {
        field4892++;
        return (char) (arg0 < 69 ? 65508 : this.field4895);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(B)I", line = 21)
    public final int method803(byte arg0) {
        field4898++;
        if (arg0 <= 56) {
            field4900 = null;
        }
        return this.field4894;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)J", line = 36)
    public final long method800(byte arg0) {
        field4887++;
        int var2 = 73 % ((9 - arg0) / 32);
        return this.field4888;
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)I", line = 47)
    public final int method802(int arg0) {
        if (arg0 >= -1) {
            return -110;
        } else {
            field4896++;
            return this.field4893;
        }
    }

    @OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V", line = 58)
    public static void method2174(int arg0) {
        if (arg0 != 382) {
            method2174(49);
        }
        field4899 = null;
        field4897 = null;
        field4900 = null;
    }

    @OriginalMember(owner = "client!un", name = "h", descriptor = "(I)V", line = 72)
    public static final void method2175(int arg0) {
        field4891++;
        class391.field5388.method674((byte) -126, 5);
        class437.field5844.method1628(56, 5);
        class194.field2879.method3645(5, arg0 - 133);
        class216.field3172.method1507(5, 8);
        class64.field797.method1175((byte) -99, 5);
        class150.field2242.method3601(arg0, (byte) -8);
        class463.field6521.method2978(5, 64);
        class59.field742.method858(5, (byte) 123);
        class32.field393.method2267(5, -124);
        class110.field1564.method2297(false, 5);
        class105.field1514.method926(5, 21103);
        class440.field5876.method3059(5, arg0 + 59);
        class599.field8839.method544(-107, 5);
        class516.field7358.method1273(arg0 ^ 0xFFFFFFF9, 5);
        class86.field1226.method2169(true, 5);
        class97.field1414.method3023(5, arg0 - 2);
        class351.field4786.method3616(5, (byte) 115);
        class116.field1639.method812(true, 5);
        class583.field8559.method3569((byte) 63, 5);
        class47.field560.method903(5, false);
        class155.method1123(5, (byte) 50);
        class482.method2901(-3692, 50);
        class184.method1280((byte) -27, 5);
        class614.method3602(5, -16168);
        class647.field9397.method834(5, arg0 ^ 0x5);
        class1.field1.method834(5, arg0 ^ 0x5);
        class333.field4607.method834(5, arg0 - 5);
        class398.field5471.method834(5, 0);
        class98.field1442.method834(5, 0);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)I", line = 112)
    public final int method801(int arg0) {
        if (arg0 != 11773) {
            field4897 = null;
        }
        field4889++;
        return this.field4890;
    }
}

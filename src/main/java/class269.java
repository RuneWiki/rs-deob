import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class269 extends class287 {

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public int field4180;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public int field4186;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "Lug;")
    public static class253 field4176;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "[I")
    public int[] field4187;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "[I")
    public int[] field4189;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "[I")
    public int[] field4190;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "[Lcl;")
    public class114[] field4178;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "[Lcl;")
    public class114[] field4183;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "[[Lcd;")
    public static class136[][] field4182;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "[[[B")
    public byte[][][] field4175;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BIII)V", line = 7)
    public static final void method1906(byte arg0, int arg1, int arg2, int arg3) {
        field4179++;
        String var4 = "::tele " + arg3 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
        if (arg0 != -56) {
            field4177 = -39;
        }
        System.out.println(var4);
        class24.method232(var4, 126);
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V", line = 21)
    public static final void method1907(int arg0) {
        class18.field282++;
        if (arg0 != 28573) {
            method1910((byte) -33, (class136) null);
        }
        field4174++;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V", line = 33)
    public static void method1908(byte arg0) {
        field4182 = (class136[][]) null;
        field4176 = null;
        int var1 = 42 / ((-arg0 - 22) / 38);
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V", line = 45)
    public static final void method1909(int arg0) {
        class148.method1086();
        class327.field5130 = new class173[9];
        class327.field5130[1] = new class208();
        if (arg0 != 2047) {
            method1907(-32);
        }
        field4185++;
        class327.field5130[2] = new class75();
        class327.field5130[3] = new class74();
        class327.field5130[4] = new class268();
        class327.field5130[5] = new class267();
        class327.field5130[6] = new class44();
        class327.field5130[7] = new class133();
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLcd;)V", line = 70)
    public static final void method1910(byte arg0, class136 arg1) {
        field4184++;
        if (arg0 <= 97) {
            field4182 = (class136[][]) ((class136[][]) null);
        }
        int var2 = arg1.field2038;
        if (var2 == 324) {
            if (class46.field607 == -1) {
                class78.field1043 = arg1.field2155;
                class46.field607 = arg1.field2093;
            }
            if (class130.field1915.field756) {
                arg1.field2093 = class46.field607;
            } else {
                arg1.field2093 = class78.field1043;
            }
        } else if (var2 == 325) {
            if (class46.field607 == -1) {
                class46.field607 = arg1.field2093;
                class78.field1043 = arg1.field2155;
            }
            if (class130.field1915.field756) {
                arg1.field2093 = class78.field1043;
            } else {
                arg1.field2093 = class46.field607;
            }
        } else if (var2 == 327) {
            arg1.field2145 = 150;
            arg1.field2096 = (int) (Math.sin((double) class229.field3595 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field2166 = 5;
            arg1.field2117 = -1;
        } else if (var2 == 328) {
            if (class146.field2310.field5277 == null) {
                arg1.field2117 = 0;
            } else {
                arg1.field2145 = 150;
                arg1.field2096 = (int) (Math.sin((double) class229.field3595 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field2166 = 5;
                arg1.field2117 = ((int) class83.method608(class146.field2310.field5277, (byte) 69) << 11) + 2047;
                arg1.field2128 = class146.field2310.field4724;
                arg1.field2147 = class146.field2310.field4725;
                arg1.field2088 = 0;
                arg1.field2130 = class146.field2310.field4651;
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class161 extends class493 {

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Z")
    private boolean field2021 = false;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    public static int field2032 = 0;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "[I")
    public static int[] field2022 = new int[50];

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "D")
    public static double field2029;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "Lhba;")
    public static class10 field2025;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "[I")
    public static int[] field2024;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Z", line = 4)
    public final boolean method634(byte arg0) {
        if (arg0 != 27) {
            return false;
        } else {
            ++field2028;
            return true;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V", line = 15)
    public final void method627(int arg0, int arg1, int arg2) {
        ++field2031;
        if (arg2 >= -75) {
            method953((byte) 40);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILbl;)V", line = 27)
    public final void method629(int arg0, int arg1, class649 arg2) {
        ++field2019;
        if (arg0 != 6) {
            this.method627(62, 22, -72);
        }
        super.field6720.method2148(arg2, 0);
        super.field6720.method2153(arg1, (byte) 79);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)V", line = 40)
    public final void method632(int arg0, boolean arg1) {
        ++field2030;
        if (arg0 < 93) {
            this.method627(-61, 44, -112);
        }
        super.field6720.method2156(class365.field4838, class199.field2365, 22831);
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V", line = 51)
    public static void method953(byte arg0) {
        field2025 = null;
        if (arg0 == 4) {
            field2024 = null;
            field2022 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Luv;)V", line = 155)
    public class161(class367 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BIII)Z", line = 70)
    public static final boolean method954(byte arg0, int arg1, int arg2, int arg3) {
        ++field2023;
        if (class314.field4236 && class232.field2988) {
            if (class51.field536 < 100) {
                return false;
            } else {
                int var4 = class435.field6105[arg1][arg3][arg2];
                if (~(-class13.field85) == ~var4) {
                    return false;
                } else if (class13.field85 == var4) {
                    return true;
                } else if (class25.field188 == class143.field1850) {
                    return false;
                } else {
                    int var5 = -108 % ((arg0 - 2) / 56);
                    int var6 = arg3 << class443.field6172;
                    int var7 = arg2 << class443.field6172;
                    if (class563.method3171(class25.field188[arg1].method1685(arg2 - -1, -12639, arg3 + 1), var6 + 1, var7 - -1, (byte) 82, class25.field188[arg1].method1685(arg2, -12639, arg3), var7 - -class601.field8373 + -1, class25.field188[arg1].method1685(arg2 + 1, -12639, arg3), var7 - (-class601.field8373 - -1), class601.field8373 + var6 + -1, var6 + 1) && class563.method3171(class25.field188[arg1].method1685(arg2, -12639, arg3 + 1), class601.field8373 + var6 - 1, var7 + 1, (byte) 82, class25.field188[arg1].method1685(arg2, -12639, arg3), class601.field8373 + -1 + var7, class25.field188[arg1].method1685(arg2 + 1, -12639, arg3 - -1), var7 - -1, var6 - -class601.field8373 + -1, var6 + 1)) {
                        ++class735.field10252;
                        class435.field6105[arg1][arg3][arg2] = class13.field85;
                        return true;
                    } else {
                        class435.field6105[arg1][arg3][arg2] = -class13.field85;
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V", line = 116)
    public final void method628(int arg0) {
        ++field2026;
        if (!this.field2021) {
            super.field6720.method2116(arg0 ^ 107, class71.field769, 0);
        } else {
            super.field6720.method2114((byte) 120, 1);
            super.field6720.method1301(class601.field8374, (byte) 26);
            super.field6720.method2156(class199.field2365, class199.field2365, 22831);
            super.field6720.method2174(2, -92, class421.field5897);
            super.field6720.method2116(-84, class71.field769, 0);
            super.field6720.method2135(2);
            super.field6720.method2148((class649) null, arg0 + -116);
            super.field6720.method2114((byte) 120, 0);
            this.field2021 = false;
        }
        super.field6720.method2156(class199.field2365, class199.field2365, 22831);
        if (arg0 != -2) {
            method953((byte) -25);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B[[I)V", line = 144)
    public static final void method955(byte arg0, int[][] arg1) {
        class300.field4036 = arg1;
        ++field2033;
        if (arg0 >= -62) {
            field2024 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(IZ)V", line = 160)
    public final void method633(int arg0, boolean arg1) {
        ++field2020;
        class455 var3 = super.field6720.method2106(-109);
        if (var3 != null && arg1) {
            super.field6720.method2114((byte) 120, 1);
            super.field6720.method2148(var3, arg0 + -6);
            super.field6720.method1301(class514.field6953, (byte) 26);
            super.field6720.method2114((byte) 120, 1);
            super.field6720.method2156(class365.field4838, class94.field1233, 22831);
            super.field6720.method1334(2, true, (byte) 27, class547.field7717, false);
            super.field6720.method2116(-101, class293.field3928, 0);
            class648 var4 = super.field6720.method2119((byte) -101);
            var4.method3668(super.field6720.method2159(1), 0);
            super.field6720.method2149(class555.field7829, (byte) 120);
            super.field6720.method2114((byte) 120, 0);
            this.field2021 = true;
        } else {
            super.field6720.method2116(-127, class293.field3928, 0);
        }
        if (arg0 != 69) {
            this.method632(-119, true);
        }
    }
}

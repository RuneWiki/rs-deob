import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class144 {

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "[I")
    public static int[] field2072 = new int[6];

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "Ldc;")
    public static class302 field2079 = new class302();

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2080 = new BigInteger("c212a1842345687146f935ba8e59ac85b4a7a90dfce3d12aba32dc1f33f4f217da4c8c7af730f209fb0810773793679f635f3a73ab65bc3f49569f108f77b5a53b09ac541ebcd44ca817fbd98edfee7ce09e251af793a2a360aa4a69b6b10a6114449caa140cf7ceccb471e38ea7b65aeeddd62ec41c674598a0188cbfad06f8fcf00fe83f26e69de6787b8d23ade62741250820876c592f75d2abc3e4302c3d1ab55b4ded17802ef0c4c99a25b4131f0edc7c7292c143b87973d0cc6cf31e77a27cc5546e0b2c8458001de6f0f0d1c5cca57c975563721b98ac0f1bbd6f20206ac69de0182e9a277d19dab0df8658a1cf6baa96cae460487f22cd50526ea4d7d2d290520b7bbc0c2a9fc9257bb87492c8f7115c76c1684d1374d090241dc887c90cf110f1caa429384ca89e4c3229e79035252f109ea806e0067d37c7dfcd7d434ee2a94a6dd63f9e66461694f6839097db1a7d8b98ff38e6d85ec4a51f34acaace7522490bd72effd3deda7bdf3b65732cf571c49d5547cb664793c8e81de8449c3180133c93b832de8c763b85766eb8947ed180f07d94d69c927fb152408bde6413933f8fe1744180330e8039c600600a811e92cb0ddad2759f5ebf04d988ee6466105148f12649613bf4759e989ce3487562d929aaaf9abb2c24047a85a4f5575ace1ab68cde93c7d2e76e81f18f87e047d0e8903d18ec7f7ae2494887ef", 16);

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
    public int field2074;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
    private int field2075;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "Lfl;")
    public class104 field2077;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
    public static void method999(int arg0) {
        field2080 = null;
        int var1 = 29 / ((arg0 - 12) / 53);
        field2079 = null;
        field2072 = null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1000(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method999(21);
        }
        field2073++;
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lgk;I)V")
    public final void method1001(class540 arg0, int arg1) {
        if (arg1 != 0) {
            method1003(-76, 4, -60);
        }
        while (true) {
            int var3 = arg0.method3115(29871);
            if (var3 == 0) {
                field2078++;
                return;
            }
            this.method1002(-77, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILgk;I)V")
    private final void method1002(int arg0, class540 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2075 = arg1.method3169(26488);
        } else if (arg2 == 2) {
            this.field2076 = arg1.method3115(29871);
            this.field2074 = arg1.method3115(29871);
        }
        int var4 = -61 % ((arg0 - 67) / 49);
        field2071++;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)V")
    public static final void method1003(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field2080 = null;
        }
        field2069++;
        if (class478.field6840 == class132.field1922) {
            if (!class151.method1077(0, -2, 1, (byte) -103, arg1, 1, false, 0, arg0)) {
                class151.method1077(0, -3, 1, (byte) -109, arg1, 1, false, 0, arg0);
            }
        } else if (!class151.method1077(0, -3, 1, (byte) -127, arg1, 1, false, 0, arg0)) {
            class151.method1077(0, -2, 1, (byte) -28, arg1, 1, false, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)Lut;")
    public final synchronized class616 method1004(int arg0) {
        field2070++;
        class616 var2 = (class616) this.field2077.field1559.method3901((long) this.field2075, -48);
        if (var2 != null) {
            return var2;
        }
        class616 var3 = class616.method3509(this.field2077.field1552, this.field2075, arg0);
        if (var3 != null) {
            this.field2077.field1559.method3894(var3, (byte) 60, (long) this.field2075);
        }
        return var3;
    }
}

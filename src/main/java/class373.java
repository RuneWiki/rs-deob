import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class373 extends class465 {

    @OriginalMember(owner = "client!sj", name = "Rb", descriptor = "Leda;")
    public static class116 field5171 = new class116(27, -2);

    @OriginalMember(owner = "client!sj", name = "Yb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5178 = new BigInteger("8ee0abe0f07f48c414e38ad4d498ba96b45f89a5f88f7d37a296e1d3ebc54a894ba5c0adf471177291e6447b79d351881ba8cc4c8279e9e9deab33a160342334e4f1fa3a94a32c1716ab93853bda3cfe53a36d18c015a8d6c7f86f6c06e3b5ac5136c4aa7a5a269a97ff5eb22c5327041de09043cf022b1652e39a449634caee6b05272768ee498b0aab458de62209b4f3305697fce30595b61df3a1349f3f18add691a1244c225b771db18d8b02e718f3570fe4a3cefa48b10369543bbcc0b6ffcbf43e98338666cf460d5d3e2fd28709619d83a7d3831e8d3d2056cae663e8a9d9e37fa99c7cea46a3b6c68a7bc7958950c1b57eb49b9bf3431be993b0d9c592c6bee04afb91205581ef14b3837aa529fc39c2aaaeaac4bc86c349f43cd7d939f3d1b3f8875eb8a4324836b33f147567c10e11b4060f811d09d33074e16bcdcab085ef939ae45e35e3e2ffa2ca5b5a857ea12ade07f428e916bdf8fd9309b40d059e5918a775c14f9fa0476377f5a878a7f47e53f94496f6b195fe3cacbdd8bd9e20ff91a0351b1ca25aafb3f20283683ea6eb143b18aa2bcc65c5955fcb1dbee5a51f08b32a5143fa9545258d0e217cf6a6e757be38a2496a95412d4a9cb9c239fba8b9be30b504dd1c25a2d09a62adc605f8dcb1b0f57daea92f16afeec64923f047313f4fe7ef3b321e1e744802a663a90e8c8349502184aa1240fe2d5b", 16);

    @OriginalMember(owner = "client!sj", name = "bc", descriptor = "[Z")
    public static boolean[] field5181 = new boolean[100];

    @OriginalMember(owner = "client!sj", name = "ac", descriptor = "F")
    public static float field5180;

    @OriginalMember(owner = "client!sj", name = "Mb", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!sj", name = "Nb", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!sj", name = "Ob", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!sj", name = "Pb", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!sj", name = "Qb", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!sj", name = "Sb", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!sj", name = "Tb", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!sj", name = "Ub", descriptor = "I")
    private int field5174;

    @OriginalMember(owner = "client!sj", name = "Vb", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!sj", name = "Xb", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!sj", name = "Zb", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!sj", name = "Wb", descriptor = "Lwe;")
    private class115 field5176;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([II)V", line = 3)
    public final void method2221(int[] arg0, int arg1) {
        this.field5176 = new class115(arg0);
        ++field5179;
        if (arg1 != -5666) {
            field5171 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(I)V", line = 17)
    public class373(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "(B)I", line = 24)
    public final int method2222(byte arg0) {
        if (arg0 != -119) {
            this.method2229((byte) -50);
        }
        ++field5172;
        int var2 = 255 & super.field6719[super.field6710++] + -this.field5176.method929(arg0 ^ -15);
        return ~var2 > -129 ? var2 : (255 & super.field6719[super.field6710++] - this.field5176.method929(arg0 ^ 18)) + (var2 + -128 << 8);
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(ZI)I", line = 40)
    public final int method2223(boolean arg0, int arg1) {
        if (arg0) {
            this.method2228(-40);
        }
        ++field5170;
        return arg1 * 8 + -this.field5174;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lwe;I)V", line = 51)
    public final void method2224(class115 arg0, int arg1) {
        if (arg1 != 1) {
            this.method2221((int[]) null, 109);
        }
        ++field5175;
        this.field5176 = arg0;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[BII)V", line = 62)
    public final void method2225(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field5167;
        if (arg0 == -7088) {
            for (int var5 = 0; arg3 > var5; ++var5) {
                arg1[arg2 + var5] = (byte) (super.field6719[super.field6710++] + -this.field5176.method929(127));
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "(II)V", line = 80)
    public final void method2226(int arg0, int arg1) {
        super.field6719[super.field6710++] = (byte) (this.field5176.method929(-69) + arg1);
        int var3 = -114 / ((arg0 - -32) / 63);
        ++field5168;
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(Z)V", line = 97)
    public static void method2227(boolean arg0) {
        if (arg0) {
            field5181 = null;
        }
        field5178 = null;
        field5181 = null;
        field5171 = null;
    }

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "(I)V", line = 113)
    public final void method2228(int arg0) {
        int var2 = -86 / ((arg0 - 44) / 45);
        super.field6710 = (this.field5174 + 7) / 8;
        ++field5166;
    }

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "(B)V", line = 127)
    public final void method2229(byte arg0) {
        int var2 = 77 / ((arg0 - 85) / 38);
        ++field5169;
        this.field5174 = super.field6710 * 8;
    }

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "(I)Z", line = 142)
    public final boolean method2230(int arg0) {
        ++field5177;
        int var2 = arg0 & super.field6719[super.field6710] + -this.field5176.method928((byte) -92);
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "(II)I", line = 156)
    public final int method2231(int arg0, int arg1) {
        ++field5173;
        int var3 = this.field5174 >> 3;
        int var4 = -(7 & this.field5174) + 8;
        int var5 = -2 % ((27 - arg1) / 56);
        this.field5174 += arg0;
        int var6 = 0;
        while (~var4 > ~arg0) {
            var6 += (super.field6719[var3++] & class30.field452[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg0 == var4) {
            var7 = (class30.field452[var4] & super.field6719[var3]) + var6;
        } else {
            var7 = (super.field6719[var3] >> -arg0 + var4 & class30.field452[arg0]) + var6;
        }
        return var7;
    }
}

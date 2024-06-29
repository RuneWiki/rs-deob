import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class242 extends class206 {

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "[Leg;")
    public class285[] field4083 = new class285[5];

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "[I")
    public int[] field4099 = new int[5];

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public int field4097 = 0;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
    public int field4100;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public int field4094;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    public int field4087;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public int field4093;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "Lwa;")
    public static class75 field4076 = class66.method560("gleiten:", false);

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "Lvd;")
    public static class126 field4080 = new class126(16);

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public int field4081;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public int field4084;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    public int field4086;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public int field4091;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
    public int field4101;

    @OriginalMember(owner = "client!tf", name = "V", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "Lbm;")
    public class129 field4082;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "Laf;")
    public class167 field4098;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "Lmj;")
    public class217 field4092;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "Ldd;")
    public class235 field4096;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "Ltk;")
    public class236 field4089;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "Ltf;")
    public class242 field4088;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "Lbe;")
    public class282 field4095;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lvi;")
    public static class5 field4072;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "Z")
    public boolean field4085;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "Z")
    public boolean field4090;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "Z")
    public boolean field4103;

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "[[[B")
    public static byte[][][] field4102;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)I", line = 19)
    public static final int method1760(int arg0) {
        if (arg0 != -1150223675) {
            method1767(103, true);
        }
        field4074++;
        return ((class164.field2783 == 0 ? 0 : 1) << 21) + ((class17.field221 == 0 ? 0 : 1) << 20) + (class274.field4727 & 0x3 << 17) + ((class167.field2816 ? 1 : 0) << 15) + ((class116.field1970 ? 1 : 0) << 13) + (class157.field2692 & 0x3 << 11) + ((class75.field1286 ? 1 : 0) << 10) + ((class75.field1293 ? 1 : 0) << 9) + ((class273.field4709 ? 1 : 0) << 6) + (((class74.field1239 ? 1 : 0) << 4) + (class253.field4256 & 0x7) + (((class287.field4937 ? 1 : 0) << 3) - -((class161.field2727 ? 1 : 0) << 5)) - (-((class246.field4140 ? 1 : 0) << 7) - (((class125.field2088 ? 1 : 0) << 8) + ((class69.field1193 ? 1 : 0) << 16))) - (-((class151.field2599 ? 1 : 0) << 19) + -((class285.field4909 == 0 ? 0 : 1) << 22)));
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII)V", line = 30)
    public static final void method1761(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class150.method1151(7, class63.field1096[arg3], arg1 - arg2, arg4, arg1 + arg2);
        field4078++;
        int var5 = arg2;
        if (arg0 <= 120) {
            field4080 = (class126) null;
        }
        int var6 = -1;
        int var7 = 0;
        int var8 = -arg2;
        while (var7 < var5) {
            var6 += 2;
            var8 += var6;
            var7++;
            if (var8 >= 0) {
                var5--;
                var8 -= var5 << 1;
                int[] var9 = class63.field1096[arg3 + var5];
                int var10 = arg1 + var7;
                int[] var11 = class63.field1096[arg3 - var5];
                int var12 = arg1 - var7;
                class150.method1151(7, var9, var12, arg4, var10);
                class150.method1151(7, var11, var12, arg4, var10);
            }
            int var13 = arg1 - var5;
            int var14 = arg1 + var5;
            int[] var15 = class63.field1096[arg3 + var7];
            int[] var16 = class63.field1096[arg3 - var7];
            class150.method1151(7, var15, var13, arg4, var14);
            class150.method1151(7, var16, var13, arg4, var14);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V", line = 86)
    public static final void method1762(int arg0, byte arg1) {
        field4073++;
        if (class198.field3324 == null) {
            class198.field3324 = new byte[4][104][104];
        }
        if (arg0 < 2) {
            return;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class198.field3324[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V", line = 123)
    public static final void method1763(int arg0) {
        if (class118.field2003 == 10) {
            class52.method380(5, 28);
        }
        field4077++;
        if (class118.field2003 == 30) {
            class52.method380(89, 25);
        }
        if (arg0 != 17243) {
            field4102 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 143)
    public static void method1764(byte arg0) {
        if (arg0 >= 93) {
            field4072 = null;
            field4080 = null;
            field4102 = (byte[][][]) null;
            field4076 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(IB)V", line = 156)
    public static final void method1765(int arg0, byte arg1) {
        class178.field3005 = arg0;
        field4104++;
        class294.method2041((byte) -68, 3);
        if (arg1 < 85) {
            method1760(125);
        }
        class294.method2041((byte) -68, 4);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Z", line = 171)
    public static final boolean method1766(int arg0, int arg1) {
        field4075++;
        if (arg0 != 11680) {
            field4102 = (byte[][][]) ((byte[][][]) null);
        }
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)Z", line = 188)
    public static final boolean method1767(int arg0, boolean arg1) {
        field4079++;
        if (arg1) {
            method1765(75, (byte) -50);
        }
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(III)V", line = 201)
    public class242(int arg0, int arg1, int arg2) {
        this.field4100 = arg1;
        this.field4094 = arg2;
        this.field4093 = this.field4087 = arg0;
    }
}

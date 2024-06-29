import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class370 extends class428 {

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "B")
    public byte field5167 = 5;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public static int field5176 = 0;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "[S")
    public static short[] field5172 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    public static int field5166 = -1;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public static int field5180 = -1;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public int field5165;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public int field5168;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    public int field5170;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public int field5173;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public int field5175;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public int field5177;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "Lam;")
    public static class286 field5181;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "Lok;")
    public static class60 field5174;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)Z", line = 10)
    public static final boolean method2233(int arg0, int arg1, int arg2, int arg3) {
        if (class198.method1060(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class328.method1881(var4 + 1, class98.field1161[arg0].method271(arg1, arg2) + arg3, var5 + 1) && class328.method1881(var4 + 128 - 1, class98.field1161[arg0].method271(arg1 + 1, arg2) + arg3, var5 + 1) && class328.method1881(var4 + 128 - 1, class98.field1161[arg0].method271(arg1 + 1, arg2 + 1) + arg3, var5 + 128 - 1) && class328.method1881(var4 + 1, class98.field1161[arg0].method271(arg1, arg2 + 1) + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V", line = 25)
    public static void method2234(int arg0) {
        if (arg0 == 10491) {
            field5174 = null;
            field5172 = null;
            field5181 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(JI)V", line = 41)
    public static final void method2235(long arg0, int arg1) {
        field5169++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % (long) arg1 == 0L) {
            class383.method2379(arg0 - 1L, arg1 ^ 0x76);
            class383.method2379(1L, 124);
        } else {
            class383.method2379(arg0, 119);
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V", line = 63)
    public static final void method2236(int arg0) {
        class392.method2442(-88);
        field5178++;
        class386.method2395((byte) 58);
        class127.method683(100);
        class295.method1736((byte) 59);
        class227.method1232(arg0 + 640);
        class294.method1731((byte) 121);
        class262.method1468((byte) -102);
        if (arg0 != 128) {
            field5171 = -97;
        }
        class27.method133(true);
        class252.method1404((byte) 86);
        class158.method860((byte) 107);
        class317.method1830(3391);
        class319.method1836((byte) 121);
        class330.method1888((byte) -98);
        class14.method64((byte) -125);
        class293.method1729(940);
        class233.method1261((byte) -18);
        class89.method492((byte) -20);
        class279.method1541(1006);
        class305.method1793((byte) 103);
        class65.method371(250);
        class314.method1822(false);
        class47.method217((byte) -22);
        class295.method1737(arg0 - 74);
        class422.field6190.method606((byte) 91);
        class115.field1433.method606((byte) 69);
        client.field3468.method606((byte) 106);
        class398.field5730.method606((byte) 108);
        class277.field3758.method606((byte) 108);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjj;Ljj;IZIZ)I", line = 112)
    public static final int method2237(int arg0, class156 arg1, class156 arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field5179++;
        int var7 = class236.method1280(arg4, (byte) -21, arg2, arg0, arg1);
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class236.method1280(arg6, (byte) -21, arg2, arg3, arg1);
            int var9 = -12 / ((15 - arg5) / 34);
            return arg6 ? -var8 : var8;
        }
    }
}

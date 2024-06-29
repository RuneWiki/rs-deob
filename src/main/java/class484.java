import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class484 extends class597 implements class310 {

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "Lwda;")
    public class597 field6007;

    @OriginalMember(owner = "client!fo", name = "N", descriptor = "Ldr;")
    public static class675 field6017 = new class675(67, 6);

    @OriginalMember(owner = "client!fo", name = "P", descriptor = "[I")
    public static int[] field6019 = new int[32];

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!fo", name = "C", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!fo", name = "O", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!fo", name = "Q", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!fo", name = "R", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!fo", name = "S", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!fo", name = "T", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(B)V")
    public final void method140(byte arg0) {
        field6013++;
        int var2 = 17 % ((-arg0 - 16) / 40);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([JIII[Ljava/lang/Object;)V")
    public static final void method2632(long[] arg0, int arg1, int arg2, int arg3, Object[] arg4) {
        field6016++;
        if (arg1 > arg2) {
            int var5 = (arg2 + arg1) / 2;
            int var6 = arg2;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            Object var9 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg2; var11 < arg1; var11++) {
                if ((long) (var11 & var10) + var7 > arg0[var11]) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    Object var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var9;
            method2632(arg0, var6 - 1, arg2, 80, arg4);
            method2632(arg0, arg1, var6 + 1, 92, arg4);
        }
        int var15 = 117 % ((arg3 + 52) / 59);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)Z")
    public final boolean method133(boolean arg0) {
        field6021++;
        if (arg0) {
            this.field6007 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)Z")
    public final boolean method137(int arg0) {
        field6004++;
        if (arg0 >= -30) {
            field6017 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Loa;B)V")
    public final void method130(class650 arg0, byte arg1) {
        if (arg1 <= -27) {
            field6015++;
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(IIIIIIIIIILwda;)V")
    public class484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class597 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class598.method3297(arg0, arg1, 2));
        this.field6007 = arg10;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class292.field3700 <= arg9 && class337.field4186 >= arg9 && class292.field3700 <= arg2 && arg2 <= class337.field4186 && arg5 >= class292.field3700 && class337.field4186 >= arg5 && class292.field3700 <= arg0 && arg0 <= class337.field4186 && arg6 >= class125.field1524 && arg6 <= class377.field4848 && class125.field1524 <= arg4 && arg4 <= class377.field4848 && class125.field1524 <= arg7 && arg7 <= class377.field4848 && class125.field1524 <= arg3 && arg3 <= class377.field4848) {
            class319.method1853(arg0, (byte) -126, arg3, arg5, arg9, arg1, arg4, arg2, arg7, arg6);
        } else {
            class480.method2619(arg1, arg9, arg2, arg3, arg6, arg0, arg4, arg5, arg7, -5);
        }
        if (arg8 != 2) {
            method2633(-74, 61, -60, 14, -100, 20, 85, 40, 84, -12);
        }
        field6010++;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public final void method132(int arg0) {
        field6011++;
        if (arg0 != -13968) {
            this.method140((byte) -61);
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)I")
    public final int method138(int arg0) {
        if (arg0 == 8470) {
            field6005++;
            return 0;
        } else {
            return 99;
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(Loa;B)V")
    public final void method7(class650 arg0, byte arg1) {
        if (arg1 == 98) {
            field6001++;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Loa;I)V")
    public final void method136(class650 arg0, int arg1) {
        field6023++;
        int var3 = 113 % ((-arg1 - 78) / 37);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZLoa;Lnt;IIII)V")
    public final void method135(boolean arg0, class650 arg1, class209 arg2, int arg3, int arg4, int arg5, int arg6) {
        field6006++;
        if (arg6 != 12137) {
            this.field6007 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BILoa;I)Z")
    public final boolean method8(byte arg0, int arg1, class650 arg2, int arg3) {
        field6020++;
        int var5 = -65 / ((77 - arg0) / 40);
        return false;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILoa;)Lww;")
    public final class686 method11(int arg0, class650 arg1) {
        if (arg0 >= -89) {
            return null;
        } else {
            field6000++;
            return null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([[BILgo;)V")
    public static final void method2634(byte[][] arg0, int arg1, class586 arg2) {
        field6018++;
        int var3 = class552.field6912.length;
        for (int var4 = arg1; var4 < var3; var4++) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class307.field3888[var4] >> 8) * 64 - class227.field2938;
                int var7 = (class307.field3888[var4] & 0xFF) * 64 - class522.field6612;
                class428.method2354(arg1 ^ 0xFFFFE745);
                arg2.method3252(0, class634.field8601, class309.field3898, var7, var6, var5);
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(Loa;I)Lqt;")
    public final class595 method6(class650 arg0, int arg1) {
        field6008++;
        return arg1 == -7459 ? this.field6007.method6(arg0, arg1) : null;
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)I")
    public final int method2117(int arg0) {
        field6003++;
        if (arg0 != 9295) {
            this.method133(true);
        }
        return 0;
    }

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "(I)V")
    public static void method2635(int arg0) {
        field6017 = null;
        field6019 = null;
        if (arg0 != 0) {
            method2635(37);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Loa;BI)Lba;")
    public final class359 method134(class650 arg0, byte arg1, int arg2) {
        field6002++;
        return arg1 <= 80 ? null : null;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(B)I")
    public final int method139(byte arg0) {
        field6014++;
        return arg0 <= 13 ? -6 : 0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)I")
    public final int method131(byte arg0) {
        field6022++;
        if (arg0 != -97) {
            this.method131((byte) 29);
        }
        return 0;
    }
}

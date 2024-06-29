import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class168 {

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "J")
    public long field2949 = 0L;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lha;")
    private static class46 field2947 = class271.method1828("shake:", -46);

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lha;")
    public static class46 field2957 = field2947;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field2953 = 0;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Lha;")
    public static class46 field2952 = class271.method1828("Benutzeroberfl-=che geladen)3", -46);

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field2962 = 0;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static volatile int field2965 = 0;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Lha;")
    public static class46 field2969 = null;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "Lha;")
    public static class46 field2973 = field2947;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "Lha;")
    public static class46 field2971 = class271.method1828("<col=40ff00>", -46);

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public int field2955;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public int field2960;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public int field2961;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public int field2967;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Lj;")
    public class139 field2951;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Lj;")
    public class139 field2964;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "Lpi;")
    public static class181 field2972;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "[Lhh;")
    public static class263[] field2956;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
    public static final void method1190(int arg0, int arg1) {
        field2959++;
        class146 var2 = class6.method22((byte) 16, arg1, arg0);
        var2.method1082((byte) -94);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)Z")
    public static final boolean method1191(byte arg0) {
        field2970++;
        if (arg0 < 5) {
            method1196(121);
        }
        if (class3.field59) {
            try {
                if ((Boolean) class76.field1406.method321(0, class8.field130.field143)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1192(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2950++;
        if (class175.method1259(arg2, (byte) 79)) {
            if (arg1 != -1) {
                field2962 = -87;
            }
            client.method1816(class215.field3809[arg2], -1, arg0, arg7, arg6, arg4, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[BI)I")
    public static final int method1193(int arg0, byte[] arg1, int arg2) {
        field2968++;
        return arg2 >= -9 ? 46 : class76.method597(arg1, 0, arg0, 3);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIB)I")
    public static final int method1194(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -32) {
            return -101;
        }
        field2974++;
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        return (arg2 >> 1) + (arg0 >> 2 << 10) + (arg1 >> 5 << 7);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(DB)V")
    public static final void method1195(double arg0, byte arg1) {
        field2963++;
        int var3 = 0 / ((arg1 + 74) / 39);
        if (class196.field3503 == arg0) {
            return;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = (int) (Math.pow((double) var4 / 255.0D, arg0) * 255.0D);
            class127.field2332[var4] = var5 > 255 ? 255 : var5;
        }
        class196.field3503 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method1196(int arg0) {
        field2972 = null;
        field2957 = null;
        field2947 = null;
        if (arg0 != 6) {
            field2957 = null;
        }
        field2973 = null;
        field2956 = null;
        field2971 = null;
        field2952 = null;
        field2969 = null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)Z")
    public static final boolean method1197(int arg0, int arg1) {
        field2954++;
        int var2 = -18 % ((-arg1 - 50) / 60);
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZB)V")
    public static final void method1198(boolean arg0, byte arg1) {
        field2958++;
        if (arg1 >= -105) {
            field2962 = -127;
        }
        if (arg0 != class170.field3038) {
            class170.field3038 = arg0;
            class39.method261(-46);
        }
    }
}

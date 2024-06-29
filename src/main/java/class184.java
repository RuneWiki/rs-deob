import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class184 extends class507 {

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Lao;")
    public static class191 field2389 = new class191(75, 2);

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "Ljc;")
    public static class305 field2396 = new class305("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "Lao;")
    public static class191 field2397 = new class191(50, -1);

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "[I")
    public static int[] field2398;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public int field2388;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "Ljava/lang/String;")
    public String field2394;

    static {
        new class305("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field2398 = new int[99];
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2398[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)V", line = 6)
    public final void method1069(boolean arg0) {
        super.field7348 |= Long.MIN_VALUE;
        if (!arg0) {
            this.method1074((byte) 40);
        }
        ++field2387;
        if (this.method1074((byte) -23) == 0L) {
            class81.field990.method1938(true, this);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 23)
    public static void method1070(byte arg0) {
        field2397 = null;
        field2396 = null;
        if (arg0 == 38) {
            field2389 = null;
            field2398 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)I", line = 41)
    public final int method1071(int arg0) {
        ++field2386;
        return arg0 <= 71 ? -100 : (int) super.field6348;
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)I", line = 54)
    public final int method1072(int arg0) {
        ++field2385;
        if (arg0 != 0) {
            this.method1069(true);
        }
        return (int) (super.field6348 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/lang/String;ILta;Ljk;BLgf;IILla;II)V", line = 68)
    public static final void method1073(int arg0, String arg1, int arg2, class144 arg3, class450 arg4, byte arg5, class183 arg6, int arg7, int arg8, class316 arg9, int arg10, int arg11) {
        ++field2391;
        int var12;
        if (class47.field491 == 4) {
            var12 = 16383 & (int) class143.field1907;
        } else {
            var12 = (int) class143.field1907 - -class299.field3928 & 16383;
        }
        int var13 = Math.max(arg4.field6612 / 2, arg4.field6573 / 2) + 10;
        int var14 = arg0 * arg0 + arg11 * arg11;
        if (var13 * var13 >= var14) {
            if (arg5 == -75) {
                int var15 = class456.field6812[var12];
                int var16 = class456.field6811[var12];
                if (~class47.field491 != -5) {
                    var16 = var16 * 256 / (class420.field6099 + 256);
                    var15 = var15 * 256 / (class420.field6099 - -256);
                }
                int var17 = arg0 * var15 + arg11 * var16 >> 15;
                int var18 = arg0 * var16 + -(arg11 * var15) >> 15;
                int var19 = arg6.method1068(arg1, (byte) -46, 100, (class24[]) null);
                int var20 = arg6.method1059(100, arg1, (class24[]) null, 54, 0);
                int var21 = var17 - var19 / 2;
                if (var21 >= -arg4.field6612 && ~var21 >= ~arg4.field6612 && ~var18 <= ~(-arg4.field6573) && var18 <= arg4.field6573) {
                    arg9.method1876(50, arg2 + var21 - -(arg4.field6612 / 2), (int[]) null, 0, (class24[]) null, arg2, arg3, (byte) -92, 0, var19, 0, 1, arg10, arg1, arg4.field6573 / 2 - var18 + -arg8 + arg10 + -var20, arg7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(II)V", line = 115)
    public class184(int arg0, int arg1) {
        super.field6348 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)J", line = 124)
    public final long method1074(byte arg0) {
        if (arg0 != -23) {
            field2389 = null;
        }
        ++field2390;
        return Long.MAX_VALUE & super.field7348;
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)V", line = 149)
    public final void method1075(byte arg0) {
        super.field7348 = 500L + class45.method252((byte) -8) | super.field7348 & Long.MIN_VALUE;
        int var2 = -33 / ((arg0 - 34) / 62);
        ++field2395;
        class90.field1079.method1938(true, this);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class125 extends class242 {

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public int field2194 = 0;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "[I")
    public int[] field2208 = new int[5];

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "[Lwc;")
    public class104[] field2204 = new class104[5];

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public int field2195;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public int field2200;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "Ljf;")
    private static class229 field2186 = class212.method1457((byte) 112, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "Ljf;")
    public static class229 field2206 = field2186;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field2216 = -1;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "Ljg;")
    public static class303 field2203 = new class303();

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "[S")
    public static short[] field2217 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "B")
    public byte field2213;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Lqb;")
    public class102 field2187;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "Llf;")
    public class125 field2210;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Ld;")
    public class143 field2190;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "Lwb;")
    public class156 field2189;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "Llc;")
    public class167 field2198;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "Lmj;")
    public class232 field2192;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "Lck;")
    public class240 field2196;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "Lcb;")
    public class285 field2188;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "Z")
    public boolean field2197;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "Z")
    public boolean field2199;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "Z")
    public boolean field2212;

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(III)V", line = 3)
    public class125(int arg0, int arg1, int arg2) {
        this.field2200 = this.field2195 = arg0;
        this.field2215 = arg2;
        this.field2202 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)I", line = 30)
    public static final int method882(int arg0, int arg1, int arg2) {
        field2193++;
        class187 var3 = (class187) class278.field4772.method1890((long) arg2, arg1 ^ 0xFFFFFF8F);
        if (arg1 != 3) {
            field2203 = (class303) null;
        }
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && var3.field3281.length > arg0) {
            return var3.field3281[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([BBIIIIII[Lqg;IZ)V", line = 55)
    public static final void method883(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class244[] arg8, int arg9, boolean arg10) {
        if (arg1 != -108) {
            field2217 = (short[]) null;
        }
        field2209++;
        class14 var11 = new class14(arg0);
        int var12 = -1;
        while (true) {
            int var13 = var11.method134(32767);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method104(72);
                if (var15 == 0) {
                    break;
                }
                int var16 = var11.method93(false);
                var14 += var15 - 1;
                int var17 = var16 & 0x3;
                int var18 = var14 >> 6 & 0x3F;
                int var19 = var14 & 0x3F;
                int var20 = var14 >> 12;
                int var21 = var16 >> 2;
                if (arg7 == var20 && var18 >= arg2 && arg2 + 8 > var18 && var19 >= arg3 && var19 < arg3 + 8) {
                    class83 var22 = class271.method1909(arg1 ^ 0x22, var12);
                    int var23 = arg5 + class242.method1745(0, arg4, var22.field1528, var22.field1572, var17, var19 & 0x7, var18 & 0x7);
                    int var24 = arg6 + class191.method1312(var22.field1528, var19 & 0x7, var18 & 0x7, arg4, var17, (byte) -110, var22.field1572);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class244 var25 = null;
                        if (!arg10) {
                            int var26 = arg9;
                            if ((class142.field2464[1][var23][var24] & 0x2) == 2) {
                                var26 = arg9 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg8[var26];
                            }
                        }
                        class140.method981(arg10, arg9, !arg10, var25, var24, var21, (byte) 90, arg4 + var17 & 0x3, arg9, var12, var23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIILhg;IJIIII)Z", line = 147)
    public static final boolean method884(int arg0, int arg1, int arg2, int arg3, class174 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class104.method699(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(Z)V", line = 155)
    public static void method885(boolean arg0) {
        field2217 = null;
        field2206 = null;
        if (!arg0) {
            method882(-100, 51, 72);
        }
        field2203 = null;
        field2186 = null;
    }
}

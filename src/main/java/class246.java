import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class246 {

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field4183 = 0;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field4186 = 0;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Ltl;")
    public static class252 field4185;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Lhi;")
    public static class26 field4190;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "[I")
    public static int[] field4184;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1717(int arg0) {
        if (arg0 > -40) {
            field4185 = (class252) null;
        }
        field4191++;
        class71.field1085 = true;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IJ)Lmh;", line = 17)
    public static final class62 method1718(int arg0, long arg1) {
        if (arg0 != 10) {
            method1717(54);
        }
        field4181++;
        return class301.method2062(false, false, arg1, 10);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([BIIZIIIIII[Lwc;)V", line = 40)
    public static final void method1719(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class218[] arg10) {
        field4189++;
        if (arg2 < 75) {
            field4185 = (class252) null;
        }
        class92 var11 = new class92(arg0);
        int var12 = -1;
        while (true) {
            int var13 = var11.method706((byte) 125);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method731(-63);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 12;
                int var17 = var14 & 0x3F;
                int var18 = var11.method702(-1);
                int var19 = (var14 & 0xFDE) >> 6;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg5 == var16 && arg8 <= var19 && var19 < arg8 + 8 && var17 >= arg9 && var17 < (arg9 + 8)) {
                    class216 var22 = class252.method1755(var12, (byte) -41);
                    int var23 = arg7 + class186.method1300(var17 & 0x7, var19 & 0x7, (byte) -29, arg4, var22.field3676, var21, var22.field3669);
                    int var24 = class131.method965(var22.field3676, var19 & 0x7, var22.field3669, var21, -109, arg4, var17 & 0x7) + arg1;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class218 var25 = null;
                        if (!arg3) {
                            int var26 = arg6;
                            if ((class42.field641[1][var23][var24] & 0x2) == 2) {
                                var26 = arg6 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg10[var26];
                            }
                        }
                        class110.method847(var23, var12, arg6, var24, arg6, var20, arg4 + var21 & 0x3, (byte) 127, arg3, var25, !arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 123)
    public static void method1720(byte arg0) {
        field4184 = null;
        field4190 = null;
        field4185 = null;
        if (arg0 < 12) {
            method1718(84, -98L);
        }
    }
}

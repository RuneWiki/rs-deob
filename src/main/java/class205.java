import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class205 {

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3078 = "Loading defaults - ";

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field3076 = 0;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field3077 = 0;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "Lda;")
    public static class189 field3072;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILfl;)V")
    public static final void method1297(int arg0, class248 arg1) {
        int var2 = -74 / ((arg0 + 48) / 63);
        for (int var3 = 0; var3 < class158.field2425; var3++) {
            int var4 = arg1.method1563((byte) 3);
            int var5 = arg1.method1575(false);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class91.field1433[var4] != null) {
                class91.field1433[var4].field340 = var5;
            }
        }
        field3074++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([BIZII[Lha;IIIII)V")
    public static final void method1298(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4, class31[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg7 != -28194) {
            method1298((byte[]) null, 11, false, 15, 93, (class31[]) null, 36, 87, 17, 2, -80);
        }
        field3073++;
        class248 var11 = new class248(arg0);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1607(0);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1563((byte) 3);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var14 >> 6 & 0x3F;
                int var19 = var11.method1593((byte) 27);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg1 == var17 && arg6 <= var18 && (arg6 + 8) > var18 && var16 >= arg3 && var16 < arg3 + 8) {
                    class288 var22 = class274.method1816(117, var12);
                    int var23 = class23.method144((byte) 125, arg8, var22.field4307, var16 & 0x7, var22.field4383, var18 & 0x7, var20) + arg10;
                    int var24 = arg4 + class285.method1878(arg8, var22.field4383, var18 & 0x7, var22.field4307, var16 & 0x7, var20, -1);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class31 var25 = null;
                        if (!arg2) {
                            int var26 = arg9;
                            if ((class221.field3333[1][var23][var24] & 0x2) == 2) {
                                var26 = arg9 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg5[var26];
                            }
                        }
                        class65.method444(arg9, arg8 + var20 & 0x3, var25, var23, var12, var21, arg9, !arg2, arg2, 0, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method1299(int arg0) {
        field3078 = null;
        if (arg0 < 114) {
            method1300(false, -73);
        }
        field3072 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
    public static final void method1300(boolean arg0, int arg1) {
        class237.field3566.method1780(arg1, true);
        field3075++;
        class255.field3883.method1780(arg1, arg0);
    }
}

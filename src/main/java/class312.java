import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class312 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Lqd;")
    public static class40 field5260 = class147.method1106("(U0a )2 in: ", (byte) -66);

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Lqd;")
    public static class40 field5264 = class147.method1106("event_opbase", (byte) -69);

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "Lqd;")
    public static class40 field5267 = class147.method1106("Gegenstand f-Ur Mitglieder", (byte) -96);

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Lqd;")
    public static class40 field5269 = class147.method1106("Lade)3)3)3", (byte) -43);

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lqd;")
    private static class40 field5271 = class147.method1106("Allocated memory", (byte) -111);

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Lqd;")
    public static class40 field5262 = field5271;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Lclient;")
    public static client field5265;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[[[B")
    public static byte[][][] field5261;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 5)
    public static void method2153(int arg0) {
        field5262 = null;
        field5271 = null;
        field5267 = null;
        field5260 = null;
        field5269 = null;
        field5264 = null;
        field5261 = (byte[][][]) null;
        field5265 = null;
        if (arg0 != 1) {
            method2158(43, (class239) null, -113, false);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;)V", line = 24)
    public static final void method2154(int arg0, String arg1) {
        field5270++;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(arg0);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 33)
    public static final void method2155(byte arg0) {
        field5263++;
        if (arg0 == 54) {
            class128.field2199.method1349(true);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIIIII)V", line = 60)
    public static final void method2156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != -26746) {
            return;
        }
        field5266++;
        if (arg2 == arg5 && arg1 == arg4 && arg0 == arg6 && arg3 == arg9) {
            class229.method1604(arg5, 1, arg0, arg8, arg1, arg9);
            return;
        }
        int var10 = arg5 * 3;
        int var11 = arg1 * 3;
        int var12 = arg2 * 3;
        int var13 = arg1;
        int var14 = arg5;
        int var15 = arg4 * 3;
        int var16 = arg6 * 3;
        int var17 = var10 + var16 - var12 - var12;
        int var18 = arg3 * 3;
        int var19 = arg0 + var12 - var16 - arg5;
        int var20 = var15 + arg9 - arg1 - var18;
        int var21 = var12 - var10;
        int var22 = var18 + var11 - var15 - var15;
        int var23 = var15 - var11;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var19 * var26;
            int var28 = var20 * var26;
            int var29 = var22 * var25;
            int var30 = var17 * var25;
            int var31 = var21 * var24;
            int var32 = arg5 + (var27 + var30 + var31 >> 12);
            int var33 = var23 * var24;
            int var34 = (var28 + var29 + var33 >> 12) + arg1;
            class229.method1604(var14, arg7 + 26747, var32, arg8, var13, var34);
            var14 = var32;
            var13 = var34;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()V", line = 148)
    public static final void method2157() {
        if (class290.field4857 != null) {
            for (int var0 = 0; var0 < class290.field4857.length; var0++) {
                for (int var1 = 0; var1 < class90.field1632; var1++) {
                    for (int var2 = 0; var2 < class285.field4807; var2++) {
                        class290.field4857[var0][var1][var2] = null;
                    }
                }
            }
        }
        class147.field2439 = (class47[][]) null;
        if (class27.field591 != null) {
            for (int var3 = 0; var3 < class27.field591.length; var3++) {
                for (int var4 = 0; var4 < class90.field1632; var4++) {
                    for (int var5 = 0; var5 < class285.field4807; var5++) {
                        class27.field591[var3][var4][var5] = null;
                    }
                }
            }
        }
        class158.field2645 = (class47[][]) null;
        class120.field2033 = 0;
        if (class39.field709 != null) {
            for (int var6 = 0; var6 < class120.field2033; var6++) {
                class39.field709[var6] = null;
            }
        }
        if (class243.field4010 != null) {
            for (int var7 = 0; var7 < class207.field3300; var7++) {
                class243.field4010[var7] = null;
            }
            class207.field3300 = 0;
        }
        if (class195.field3137 != null) {
            for (int var8 = 0; var8 < class195.field3137.length; var8++) {
                class195.field3137[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILce;IZ)[Lda;", line = 259)
    public static final class114[] method2158(int arg0, class239 arg1, int arg2, boolean arg3) {
        field5268++;
        if (class272.method1881(arg1, arg0, arg2, 929)) {
            if (!arg3) {
                field5269 = (class40) null;
            }
            return class102.method768(15739);
        } else {
            return null;
        }
    }
}

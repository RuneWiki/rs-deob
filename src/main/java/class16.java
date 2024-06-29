import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class16 {

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field281 = 0;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lkb;")
    private static class93 field291 = class76.method390("Loaded interfaces", 0);

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field287 = 0;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Lkb;")
    public static class93 field279 = field291;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lkb;")
    public static class93 field286 = class76.method390("(Y", 0);

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Lkb;")
    private static class93 field288 = class76.method390("Continue", 0);

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Lkb;")
    public static class93 field289 = field288;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method91(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 > -48) {
            return;
        }
        field280++;
        if (arg4 < 1 || arg0 < 1 || arg4 > 102 || arg0 > 102) {
            return;
        }
        if (class82.field1515 && class114.field2145 != arg6) {
            return;
        }
        boolean var8 = false;
        int var9 = 0;
        if (arg2 == 0) {
            var9 = class175.field3458.method844(arg6, arg4, arg0);
        }
        boolean var10 = true;
        if (arg2 == 1) {
            var9 = class175.field3458.method816(arg6, arg4, arg0);
        }
        boolean var11 = false;
        if (arg2 == 2) {
            var9 = class175.field3458.method832(arg6, arg4, arg0);
        }
        if (arg2 == 3) {
            var9 = class175.field3458.method809(arg6, arg4, arg0);
        }
        if (var9 != 0) {
            int var12 = var9 >> 14 & 0x7FFF;
            int var13 = class175.field3458.method803(arg6, arg4, arg0, var9);
            int var14 = var13 & 0x1F;
            int var15 = var13 >> 6 & 0x3;
            if (arg2 == 0) {
                class175.field3458.method823(arg6, arg4, arg0);
                class81 var16 = class154.method990(var12, true);
                if (var16.field1480 != 0) {
                    class145.field2822[arg6].method947(var14, -80, arg0, var16.field1441, arg4, var15);
                }
            }
            if (arg2 == 1) {
                class175.field3458.method835(arg6, arg4, arg0);
            }
            if (arg2 == 2) {
                class175.field3458.method826(arg6, arg4, arg0);
                class81 var17 = class154.method990(var12, true);
                if (var17.field1439 + arg4 > 103 || var17.field1439 + arg0 > 103 || var17.field1487 + arg4 > 103 || arg0 + var17.field1487 > 103) {
                    return;
                }
                if (var17.field1480 != 0) {
                    class145.field2822[arg6].method936(var17.field1487, -4, var17.field1439, arg4, var15, arg0, var17.field1441);
                }
            }
            if (arg2 == 3) {
                class175.field3458.method802(arg6, arg4, arg0);
                class81 var18 = class154.method990(var12, true);
                if (var18.field1480 == 1) {
                    class145.field2822[arg6].method938(arg0, (byte) -61, arg4);
                }
            }
        }
        if (arg7 < 0) {
            return;
        }
        int var19 = arg6;
        if (arg6 < 3 && (class136.field2637[1][arg4][arg0] & 0x2) == 2) {
            var19 = arg6 + 1;
        }
        class3.method14(arg6, arg0, var19, arg4, class145.field2822[arg6], arg3, 0, class175.field3458, arg7, arg5);
        return;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method92(int arg0) {
        field289 = null;
        int var1 = 35 % ((arg0 - 59) / 56);
        field291 = null;
        field286 = null;
        field279 = null;
        field288 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
    public static final void method93(int arg0, int arg1) {
        if (arg0 != -104) {
            field284 = -58;
        }
        field292++;
        class36 var2 = (class36) client.field496.method616((long) arg1, -1);
        if (var2 != null) {
            var2.method235(false);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljg;ILjg;)V")
    public static final void method94(class89 arg0, int arg1, class89 arg2) {
        class1.field22 = arg2;
        field282++;
        class65.field1095 = arg0;
        class204.field3950 = class1.field22.method456(3, -81);
        if (arg1 != 0) {
            field288 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static final void method95(int arg0) {
        class151.field2908.method47(255, 8);
        if (arg0 != 0) {
            return;
        }
        for (class78 var1 = (class78) class147.field2834.method612(arg0 + 12981); var1 != null; var1 = (class78) class147.field2834.method623((byte) -77)) {
            if (var1.field1401 == 0) {
                class18.method108(arg0, true, var1);
            }
        }
        field283++;
        if (class82.field1511 != null) {
            class160.method1095(0, class82.field1511);
            class82.field1511 = null;
        }
        class176.field3462++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lna;I)V")
    public static final void method96(class119 arg0, int arg1) {
        field278++;
        for (int var2 = 0; var2 < class2.field30.length; var2++) {
            class2.field30[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * Math.random() * 128.0D);
            class2.field30[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = arg1; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class174.field3450[var15] = (class2.field30[var15 + 128] + class2.field30[var15 + 1] + class2.field30[var15 - 1] + class2.field30[var15 + -128]) / 4;
                }
            }
            int[] var13 = class2.field30;
            class2.field30 = class174.field3450;
            class174.field3450 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field2212; var7++) {
            for (int var8 = 0; var8 < arg0.field2211; var8++) {
                if (arg0.field2208[var6++] != 0) {
                    int var9 = var8 + arg0.field2214 + 16;
                    int var10 = var7 + arg0.field2209 + 16;
                    int var11 = (var10 << 7) + var9;
                    class2.field30[var11] = 0;
                }
            }
        }
    }
}

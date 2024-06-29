import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class130 extends class163 {

    @OriginalMember(owner = "client!la", name = "r", descriptor = "[I")
    public static int[] field2242 = new int[50];

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Lgb;")
    public static class158 field2243 = new class158(20);

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Lwa;")
    public static class75 field2244 = class66.method560("T", false);

    @OriginalMember(owner = "client!la", name = "u", descriptor = "[[[Lmc;")
    public static class170[][][] field2245 = new class170[4][104][104];

    @OriginalMember(owner = "client!la", name = "y", descriptor = "Lwa;")
    public static class75 field2249 = class66.method560("(Y", false);

    @OriginalMember(owner = "client!la", name = "D", descriptor = "Lwa;")
    public static class75 field2254 = class66.method560(":assistreq:", false);

    @OriginalMember(owner = "client!la", name = "C", descriptor = "Lje;")
    public static class68 field2253 = null;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "Lwa;")
    public static class75 field2246 = class66.method560("lila:", false);

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field2247 = 0;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "Lwa;")
    public static class75 field2256 = class66.method560("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", false);

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "Lcb;")
    public static class267 field2248;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIIBII)V", line = 4)
    public static final void method1018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        if (arg1 == arg6 && arg2 == arg3 && arg4 == arg8 && arg0 == arg5) {
            class162.method1215(arg9, arg4, arg2, false, arg6, arg5);
        } else {
            int var10 = arg2;
            int var11 = arg6;
            int var12 = arg6 * 3;
            int var13 = arg2 * 3;
            int var14 = arg3 * 3;
            int var15 = arg0 * 3;
            int var16 = arg8 * 3;
            int var17 = arg1 * 3;
            int var18 = arg4 + var17 - arg6 - var16;
            int var19 = arg5 + var14 - var15 - arg2;
            int var20 = var15 + var13 - var14 - var14;
            int var21 = var16 - (var17 - var12) - var17;
            int var22 = var17 - var12;
            int var23 = var14 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var21 * var25;
                int var30 = var20 * var25;
                int var31 = var23 * var24;
                int var32 = var22 * var24;
                int var33 = (var28 + var30 + var31 >> 12) + arg2;
                int var34 = (var27 + var29 + var32 >> 12) + arg6;
                class162.method1215(arg9, var34, var10, false, var11, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        field2241++;
        if (arg7 >= -124) {
            method1021(-35);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Leg;)V", line = 83)
    public static final void method1019(class285 arg0) {
        for (int var1 = arg0.field4907; var1 <= arg0.field4911; var1++) {
            for (int var2 = arg0.field4895; var2 <= arg0.field4896; var2++) {
                class242 var3 = class271.field4681[arg0.field4904][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4086; var4++) {
                        if (var3.field4083[var4] == arg0) {
                            var3.field4086--;
                            for (int var5 = var4; var5 < var3.field4086; var5++) {
                                var3.field4083[var5] = var3.field4083[var5 + 1];
                                var3.field4099[var5] = var3.field4099[var5 + 1];
                            }
                            var3.field4083[var3.field4086] = null;
                            break;
                        }
                    }
                    var3.field4097 = 0;
                    for (int var6 = 0; var6 < var3.field4086; var6++) {
                        var3.field4097 |= var3.field4099[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(III)Lmj;", line = 139)
    public static final class217 method1020(int arg0, int arg1, int arg2) {
        class242 var3 = class271.field4681[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class217 var4 = var3.field4092;
            var3.field4092 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 166)
    public static void method1021(int arg0) {
        field2243 = null;
        field2249 = null;
        field2248 = null;
        field2254 = null;
        field2256 = null;
        field2246 = null;
        int var1 = -91 % ((arg0 + 74) / 34);
        field2244 = null;
        field2253 = null;
        field2245 = (class170[][][]) null;
        field2242 = null;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V", line = 184)
    public static final void method1022(int arg0) {
        if (arg0 == -4539) {
            class213.field3618.method1200(false);
            field2240++;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)Lp;", line = 197)
    public static final class93 method1023(int arg0, int arg1, int arg2, int arg3) {
        field2255++;
        class93 var4 = new class93();
        if (arg1 != 3) {
            return (class93) null;
        }
        var4.field1518 = arg0;
        var4.field1519 = arg2;
        class73.field1224.method1004((byte) 73, (long) arg3, var4);
        class162.method1214(arg0, true);
        class262 var5 = class51.method374(-17, arg3);
        if (var5 != null) {
            class291.method2027(var5, arg1 ^ 0x38F7);
        }
        if (class286.field4929 != null) {
            class291.method2027(class286.field4929, 14580);
            class286.field4929 = null;
        }
        int var6 = class126.field2188;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class90.method714(80, class99.field1646[var7])) {
                class302.method2075(1, var7);
            }
        }
        if (class126.field2188 == 1) {
            class153.field2625 = false;
            class177.method1306(class59.field985, class269.field4653, class188.field3135, class270.field4677, (byte) -106);
        } else {
            class177.method1306(class59.field985, class269.field4653, class188.field3135, class270.field4677, (byte) -106);
            int var8 = class3.field28.method779(class69.field1187);
            for (int var9 = 0; var9 < class126.field2188; var9++) {
                int var10 = class3.field28.method779(class147.method1134(var9, (byte) -90));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class269.field4653 = var8 + 8;
            class270.field4677 = class126.field2188 * 15 + 22;
        }
        if (var5 != null) {
            class180.method1324(false, var5, true);
        }
        class72.method596(1, arg0);
        if (class81.field1361 != -1) {
            class176.method1296(arg1 ^ 0x1F, 1, class81.field1361);
        }
        return var4;
    }
}

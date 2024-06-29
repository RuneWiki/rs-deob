import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class186 extends class20 {

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    private int field3406 = 0;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    private int field3415 = -32768;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "Z")
    public boolean field3409 = false;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    private int field3416 = 0;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public int field3418;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    private int field3412;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public int field3429;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public int field3425;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public int field3423;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "Leh;")
    private class138 field3411;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Lsg;")
    public static class30 field3413 = class167.method1221((byte) 33, "Abbrechen");

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field3410 = 0;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "Lsg;")
    public static class30 field3428 = class167.method1221((byte) 33, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "Lsg;")
    public static class30 field3427 = class167.method1221((byte) 33, "Ablegen");

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static final void method1337(int arg0) {
        if (arg0 != 26130) {
            field3428 = null;
        }
        field3408++;
        class251.field4438.method1650(124);
        class233.field4147.method1650(84);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)I")
    public static final int method1338(int arg0, int arg1) {
        field3421++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + arg0;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZII[[[Lne;ZI)Z")
    public static final boolean method1339(boolean arg0, int arg1, int arg2, class195[][][] arg3, boolean arg4, int arg5) {
        byte var6 = arg4 ? 1 : (byte) (class116.field2290 & 0xFF);
        if (!arg0) {
            field3427 = null;
        }
        field3414++;
        if (class81.field1747[class159.field2998][arg1][arg2] == var6) {
            return false;
        } else if ((class272.field4771[class159.field2998][arg1][arg2] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class195.field3509[var8] = arg1;
            int var31 = var8 + 1;
            class132.field2594[var8] = arg2;
            class81.field1747[class159.field2998][arg1][arg2] = var6;
            while (var7 != var31) {
                int var9 = (class195.field3509[var7] & 0xFFC8CC) >> 16;
                int var10 = class195.field3509[var7] & 0xFFFF;
                int var11 = class195.field3509[var7] >> 24 & 0xFF;
                int var12 = class132.field2594[var7] & 0xFFFF;
                int var13 = class132.field2594[var7] >> 16 & 0xFF;
                var7 = var7 + 1 & 0xFFF;
                boolean var14 = false;
                boolean var15 = false;
                if ((class272.field4771[class159.field2998][var10][var12] & 0x4) == 0) {
                    var15 = true;
                }
                label229: for (int var16 = class159.field2998 + 1; var16 <= 3; var16++) {
                    if ((class272.field4771[var16][var10][var12] & 0x8) == 0) {
                        if (var15 && arg3[var16][var10][var12] != null) {
                            if (arg3[var16][var10][var12].field3532 != null) {
                                int var19 = class272.method1859(var9, 2047);
                                if (arg3[var16][var10][var12].field3532.field4023 == var19 || arg3[var16][var10][var12].field3532.field4030 == var19) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var20 = class272.method1859(var11, 2047);
                                    if (arg3[var16][var10][var12].field3532.field4023 == var20 || arg3[var16][var10][var12].field3532.field4030 == var20) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var21 = class272.method1859(var13, 2047);
                                    if (arg3[var16][var10][var12].field3532.field4023 == var21 || arg3[var16][var10][var12].field3532.field4030 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg3[var16][var10][var12].field3540 != null) {
                                for (int var22 = 0; var22 < arg3[var16][var10][var12].field3522; var22++) {
                                    int var23 = (int) (arg3[var16][var10][var12].field3540[var22].field863 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg3[var16][var10][var12].field3540[var22].field863 >> 20 & 0x3L);
                                    int var25 = var23 | var24 << 6;
                                    if (var9 == var25 || var11 != 0 && var11 == var25 || var13 != 0 && var13 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var14 = true;
                        class195 var26 = arg3[var16][var10][var12];
                        if (var26 != null && var26.field3522 > 0) {
                            for (int var27 = 0; var27 < var26.field3522; var27++) {
                                class35 var28 = var26.field3540[var27];
                                if (var28.field854 != var28.field844 || var28.field856 != var28.field853) {
                                    for (int var29 = var28.field854; var29 <= var28.field844; var29++) {
                                        for (int var30 = var28.field856; var30 <= var28.field853; var30++) {
                                            class81.field1747[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class81.field1747[var16][var10][var12] = var6;
                    }
                }
                if (var14) {
                    int var17 = var12 << 7;
                    if (class60.field1290[arg5] < class242.field4333[class159.field2998 + 1][var10][var12]) {
                        class60.field1290[arg5] = class242.field4333[class159.field2998 + 1][var10][var12];
                    }
                    int var18 = var10 << 7;
                    if (class50.field1160[arg5] > var18) {
                        class50.field1160[arg5] = var18;
                    } else if (var18 > class235.field4193[arg5]) {
                        class235.field4193[arg5] = var18;
                    }
                    if (var17 < class276.field4813[arg5]) {
                        class276.field4813[arg5] = var17;
                    } else if (var17 > class116.field2282[arg5]) {
                        class116.field2282[arg5] = var17;
                    }
                }
                if (!var15) {
                    if (var10 >= 1 && class81.field1747[class159.field2998][var10 - 1][var12] != var6) {
                        class195.field3509[var31] = class182.method1314(class182.method1314(1179648, var10 - 1), -754974720);
                        class132.field2594[var31] = class182.method1314(1245184, var12);
                        class81.field1747[class159.field2998][var10 - 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < 104) {
                        if ((var10 - 1) >= 0 && class81.field1747[class159.field2998][var10 - 1][var12] != var6 && (class272.field4771[class159.field2998][var10][var12] & 0x4) == 0 && (class272.field4771[class159.field2998][var10 - 1][var12 - 1] & 0x4) == 0) {
                            class195.field3509[var31] = class182.method1314(class182.method1314(1179648, var10 - 1), 1375731712);
                            class132.field2594[var31] = class182.method1314(var12, 1245184);
                            var31 = var31 + 1 & 0xFFF;
                            class81.field1747[class159.field2998][var10 - 1][var12] = var6;
                        }
                        if (class81.field1747[class159.field2998][var10][var12] != var6) {
                            class195.field3509[var31] = class182.method1314(class182.method1314(5373952, var10), 318767104);
                            class132.field2594[var31] = class182.method1314(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class81.field1747[class159.field2998][var10][var12] = var6;
                        }
                        if ((var10 + 1) < 104 && class81.field1747[class159.field2998][var10 + 1][var12] != var6 && (class272.field4771[class159.field2998][var10][var12] & 0x4) == 0 && (class272.field4771[class159.field2998][var10 + 1][var12 - 1] & 0x4) == 0) {
                            class195.field3509[var31] = class182.method1314(-1845493760, class182.method1314(var10 + 1, 5373952));
                            class132.field2594[var31] = class182.method1314(var12, 5439488);
                            class81.field1747[class159.field2998][var10 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if ((var10 + 1) < 104 && class81.field1747[class159.field2998][var10 + 1][var12] != var6) {
                        class195.field3509[var31] = class182.method1314(class182.method1314(var10 + 1, 9568256), 1392508928);
                        class132.field2594[var31] = class182.method1314(9633792, var12);
                        class81.field1747[class159.field2998][var10 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var10 - 1) >= 0 && class81.field1747[class159.field2998][var10 - 1][var12] != var6 && (class272.field4771[class159.field2998][var10][var12] & 0x4) == 0 && (class272.field4771[class159.field2998][var10 - 1][var12 + 1] & 0x4) == 0) {
                            class195.field3509[var31] = class182.method1314(301989888, class182.method1314(var10 - 1, 13762560));
                            class132.field2594[var31] = class182.method1314(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class81.field1747[class159.field2998][var10 - 1][var12] = var6;
                        }
                        if (class81.field1747[class159.field2998][var10][var12] != var6) {
                            class195.field3509[var31] = class182.method1314(class182.method1314(13762560, var10), -1828716544);
                            class132.field2594[var31] = class182.method1314(var12, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class81.field1747[class159.field2998][var10][var12] = var6;
                        }
                        if (var10 + 1 < 104 && class81.field1747[class159.field2998][var10 + 1][var12] != var6 && (class272.field4771[class159.field2998][var10][var12] & 0x4) == 0 && (class272.field4771[class159.field2998][var10 + 1][var12 + 1] & 0x4) == 0) {
                            class195.field3509[var31] = class182.method1314(-771751936, class182.method1314(9568256, var10 + 1));
                            class132.field2594[var31] = class182.method1314(9633792, var12);
                            class81.field1747[class159.field2998][var10 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class60.field1290[arg5] != -1000000) {
                class60.field1290[arg5] += 10;
                class50.field1160[arg5] -= 50;
                class235.field4193[arg5] += 50;
                class116.field2282[arg5] += 50;
                class276.field4813[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)Lfi;")
    private final class217 method1340(byte arg0) {
        if (arg0 != 30) {
            this.field3429 = 127;
        }
        field3419++;
        class24 var2 = class263.method1819(this.field3412, -4);
        class217 var3;
        if (this.field3409) {
            var3 = var2.method217(arg0 ^ 0x1E, -1);
        } else {
            var3 = var2.method217(0, this.field3416);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3417++;
        class217 var11 = this.method1340((byte) 30);
        if (var11 != null) {
            var11.method21(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3415 = var11.method22();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILmc;I)[Lgj;")
    public static final class192[] method1341(int arg0, int arg1, class151 arg2, int arg3) {
        if (arg0 == -16775) {
            field3422++;
            return class224.method1608(arg3, arg1, arg2, 0) ? class137.method1030(13588) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
    public static void method1342(int arg0) {
        field3427 = null;
        field3413 = null;
        field3428 = null;
        if (arg0 != 2865) {
            field3410 = 34;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(II)V")
    public final void method1343(int arg0, int arg1) {
        field3407++;
        if (this.field3409) {
            return;
        }
        this.field3406 += arg0;
        while (this.field3406 > this.field3411.field2690[this.field3416]) {
            this.field3406 -= this.field3411.field2690[this.field3416];
            this.field3416++;
            if (this.field3411.field2699.length <= this.field3416) {
                this.field3409 = true;
                break;
            }
        }
        if (arg1 != -1) {
            method1337(125);
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(II)I")
    public static int method1344(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()I")
    public final int method22() {
        field3426++;
        return this.field3415;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIIIII)V")
    public class186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3424 = arg2;
        this.field3418 = arg4;
        this.field3412 = arg0;
        this.field3429 = arg5 + arg6;
        this.field3425 = arg1;
        this.field3423 = arg3;
        int var8 = class263.method1819(this.field3412, -4).field460;
        if (var8 == -1) {
            this.field3409 = true;
        } else {
            this.field3409 = false;
            this.field3411 = class193.method1396(-30590, var8);
        }
    }
}

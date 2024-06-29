import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class213 {

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "J")
    public long field3625 = 0L;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lve;")
    public static class255 field3633 = class87.method607(57, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "Lve;")
    private static class255 field3642 = class87.method607(82, "Please remove ");

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lve;")
    public static class255 field3624 = field3642;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Lve;")
    public static class255 field3630 = field3642;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public int field3622;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public int field3627;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public int field3635;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public int field3636;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public int field3638;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public int field3639;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public int field3640;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lme;")
    public class177 field3634;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Lme;")
    public class177 field3637;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "[Ldd;")
    public static class238[] field3631;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Ldm;", line = 32)
    public static final class273 method1524(byte arg0) {
        field3623++;
        class273 var1 = new class273(class153.field2608, class154.field2632, class131.field2167[0], class298.field5098[0], class132.field2173[0], class187.field3027[0], class282.field4849[0], class18.field296);
        class111.method850(-3);
        if (arg0 != 36) {
            method1527((byte) 39);
        }
        return var1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([Ljava/lang/Object;Z[I)V", line = 47)
    public static final void method1525(Object[] arg0, boolean arg1, int[] arg2) {
        class221.method1551(arg2.length - 1, arg0, true, arg2, 0);
        if (arg1) {
            field3632 = 28;
        }
        field3626++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V", line = 63)
    public static final void method1526(int arg0, int arg1) {
        class150.field2550.method562((byte) 63, arg0);
        class130.field2144.method562((byte) 51, arg0);
        field3628++;
        class145.field2421.method562((byte) 67, arg0);
        if (arg1 >= -18) {
            field3642 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V", line = 83)
    public static void method1527(byte arg0) {
        field3642 = null;
        field3624 = null;
        if (arg0 == 105) {
            field3633 = null;
            field3630 = null;
            field3631 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILtl;I)I", line = 105)
    public static final int method1528(int arg0, class197 arg1, int arg2) {
        field3643++;
        if (arg1.field3311 == null || arg2 >= arg1.field3311.length) {
            return -2;
        }
        try {
            if (arg0 != 17) {
                method1524((byte) 60);
            }
            int[] var3 = arg1.field3311[arg2];
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var6++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 1) {
                    var8 = class217.field3678[var3[var6++]];
                }
                if (var7 == 2) {
                    var8 = class271.field4678[var3[var6++]];
                }
                if (var7 == 3) {
                    var8 = class143.field2386[var3[var6++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class197 var12 = class58.method353(var11, (byte) 69);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class132.method990((byte) -119, var13).field3129 || class112.field1902)) {
                        for (int var14 = 0; var14 < var12.field3352.length; var14++) {
                            if (var13 + 1 == var12.field3352[var14]) {
                                var8 += var12.field3360[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class76.field1246[var3[var6++]];
                }
                if (var7 == 6) {
                    var8 = class251.field4231[class271.field4678[var3[var6++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class76.field1246[var3[var6++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class276.field4742.field4074;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class284.field4889[var15]) {
                            var8 += class271.field4678[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class197 var18 = class58.method353(var17, (byte) -117);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class132.method990((byte) -119, var19).field3129 || class112.field1902)) {
                        for (int var20 = 0; var20 < var18.field3352.length; var20++) {
                            if (var19 + 1 == var18.field3352[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class114.field1938;
                }
                if (var7 == 12) {
                    var8 = class15.field221;
                }
                if (var7 == 13) {
                    int var21 = class76.field1246[var3[var6++]];
                    int var22 = var3[var6++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var6++];
                    var8 = class282.method1995((byte) -87, var23);
                }
                if (var7 == 18) {
                    var8 = (class276.field4742.field5130 >> 7) + class197.field3355;
                }
                if (var7 == 19) {
                    var8 = (class276.field4742.field5173 >> 7) + class268.field4615;
                }
                if (var7 == 20) {
                    var8 = var3[var6++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var4 += var8;
                    }
                    if (var5 == 1) {
                        var4 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var5 == 3) {
                        var4 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }
}

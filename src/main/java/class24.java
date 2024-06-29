import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class class24 {

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Lve;")
    public static class255 field369 = class87.method607(122, "showVideoAd");

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lve;")
    private static class255 field362 = class87.method607(43, " from your friend list first)3");

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Lve;")
    public static class255 field376 = class87.method607(98, "gleiten:");

    @OriginalMember(owner = "client!od", name = "r", descriptor = "[I")
    public static int[] field374 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field373 = 0;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Lve;")
    public static class255 field372 = class87.method607(105, "Lade)3)3)3");

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Lve;")
    public static class255 field377 = field362;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "[Lud;")
    public static class269[] field368;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class253 var7 = new class253();
        var7.field4271 = arg1 / 128;
        var7.field4276 = arg2 / 128;
        var7.field4252 = arg3 / 128;
        var7.field4261 = arg4 / 128;
        var7.field4265 = arg0;
        var7.field4272 = arg1;
        var7.field4253 = arg2;
        var7.field4275 = arg3;
        var7.field4259 = arg4;
        var7.field4251 = arg5;
        var7.field4268 = arg6;
        class298.field5099[class137.field2303++] = var7;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 35)
    public static final void method131(int arg0) {
        for (class298 var1 = (class298) class19.field312.method1471((byte) 22); var1 != null; var1 = (class298) class19.field312.method1475((byte) 83)) {
            class30 var2 = var1.field5093;
            if (client.field4039 != var2.field491 || class277.field4768 > var2.field477) {
                var1.method1502((byte) -82);
            } else if (var2.field466 <= class277.field4768) {
                if (var2.field470 > 0) {
                    class186 var3 = class82.field1334[var2.field470 - 1];
                    if (var3 != null && var3.field5130 >= 0 && var3.field5130 < 13312 && var3.field5173 >= 0 && var3.field5173 < 13312) {
                        var2.method169(var3.field5173, class277.field4768, class113.method861((byte) 123, var3.field5130, var3.field5173, var2.field491) - var2.field484, var3.field5130, -32768);
                    }
                }
                if (var2.field470 < 0) {
                    int var4 = -var2.field470 - 1;
                    class242 var5;
                    if (class14.field210 == var4) {
                        var5 = class276.field4742;
                    } else {
                        var5 = class151.field2555[var4];
                    }
                    if (var5 != null && var5.field5130 >= 0 && var5.field5130 < 13312 && var5.field5173 >= 0 && var5.field5173 < 13312) {
                        var2.method169(var5.field5173, class277.field4768, class113.method861((byte) -74, var5.field5130, var5.field5173, var2.field491) - var2.field484, var5.field5130, arg0 ^ 0xFFFFB400);
                    }
                }
                var2.method167(arg0 ^ 0xFFFF83A7, class122.field2036);
                class112.method856(client.field4039, (int) var2.field487, (int) var2.field488, (int) var2.field504, 60, var2, var2.field480, -1L, false);
            }
        }
        field364++;
        if (arg0 != 13312) {
            method130(7, 95, 70, -40, 81, 69, -67);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Z", line = 89)
    public final boolean method132(int arg0) {
        if (arg0 > -117) {
            method130(49, -25, -86, -12, -96, -120, 35);
        }
        field375++;
        return (this.field378 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Z", line = 105)
    public final boolean method133(int arg0) {
        if (arg0 != 0) {
            this.method133(-28);
        }
        field360++;
        return (this.field378 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I[BIII[Lhc;ZIIII)V", line = 138)
    public static final void method134(int arg0, byte[] arg1, int arg2, int arg3, int arg4, class163[] arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg10 != -26586) {
            method137(false);
        }
        field365++;
        if (!arg6) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if ((arg7 + var11) > 0 && arg7 + var11 < 103 && (arg4 + var12) > 0 && arg4 + var12 < 103) {
                        arg5[arg9].field2743[arg7 + var11][arg4 + var12] = class154.method1134(arg5[arg9].field2743[arg7 + var11][arg4 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg6) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class70 var14 = new class70(arg1);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg2 == var15 && var16 >= arg8 && var16 < arg8 + 8 && arg3 <= var17 && var17 < (arg3 + 8)) {
                        class162.method1171(var14, arg0, arg9, class70.method456((byte) -8, arg0, var16 & 0x7, var17 & 0x7) + arg4, arg7 + class121.method895(var16 & 0x7, arg10 + 26501, arg0, var17 & 0x7), 0, arg6, -50, 0);
                    } else {
                        class162.method1171(var14, 0, 0, -1, -1, 0, arg6, -50, 0);
                    }
                }
            }
        }
        if (!class281.field4827 || arg6) {
            return;
        }
        class181 var18 = null;
        while (true) {
            int var20;
            label102: do {
                while (var14.field1066.length > var14.field1068) {
                    int var19 = var14.method481(0);
                    if (var19 != 0) {
                        if (var19 != 1) {
                            throw new IllegalStateException();
                        }
                        var20 = var14.method481(arg10 + 26586);
                        continue label102;
                    }
                    var18 = new class181(var14);
                }
                if (var18 == null) {
                    var18 = new class181();
                }
                class185.field2982[arg7 >> 3][arg4 >> 3] = var18;
                return;
            } while (var20 <= 0);
            for (int var21 = 0; var21 < var20; var21++) {
                class1 var22 = new class1(var14);
                int var23 = var22.field16 >> 7;
                int var24 = var22.field1 >> 7;
                if (var22.field11 == arg2 && arg8 <= var24 && (arg8 + 8) > var24 && var23 >= arg3 && (arg3 + 8) > var23) {
                    int var25 = class253.method1731(var22.field1 & 0x3FF, false, arg0, var22.field16 & 0x3FF) + (arg7 << 7);
                    int var26 = (arg4 << 7) + class70.method458(var22.field16 & 0x3FF, (byte) 107, var22.field1 & 0x3FF, arg0);
                    var22.field16 = var26;
                    var22.field1 = var25;
                    int var27 = var22.field16 >> 7;
                    int var28 = var22.field1 >> 7;
                    if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                        var22.field13 = class106.field1783[var22.field11][var28][var27] - var22.field13;
                        class164.method1204(var22);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Z", line = 292)
    public final boolean method135(boolean arg0) {
        if (!arg0) {
            method131(29);
        }
        field370++;
        return (this.field378 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Z", line = 309)
    public final boolean method136(int arg0) {
        field366++;
        int var2 = 57 % ((arg0 + 58) / 61);
        return (this.field378 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V", line = 320)
    public static void method137(boolean arg0) {
        field377 = null;
        field368 = null;
        field369 = null;
        if (arg0) {
            field372 = null;
            field376 = null;
            field374 = null;
            field362 = null;
        }
    }
}

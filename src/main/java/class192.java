import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class192 extends class249 {

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Lmb;")
    public class96 field3315;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "[Lmb;")
    public static class96[] field3316 = new class96[500];

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "[Lmb;")
    public static class96[] field3319 = new class96[100];

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Lmb;")
    public static class96 field3320 = null;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field3322 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "Lmb;")
    public static class96 field3324 = class243.method1708("Stufe: ", (byte) 91);

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Lff;")
    public static class3 field3317;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Lnj;")
    public static class87 field3321;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "[I")
    public static int[] field3325;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public static void method1342(int arg0) {
        field3319 = null;
        field3325 = null;
        field3316 = null;
        field3321 = null;
        field3324 = null;
        field3317 = null;
        if (arg0 != 128) {
            field3319 = null;
        }
        field3320 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method1343(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3318++;
        if (class260.field4578 == arg1 && class128.field2342 == arg5 && class277.field4822 == arg6 || class106.method786(52)) {
            return;
        }
        class260.field4578 = arg1;
        class128.field2342 = arg5;
        class277.field4822 = arg6;
        if (class106.method786(47)) {
            class277.field4822 = 0;
        }
        if (arg0) {
            class146.method1076(6938, 28);
        } else {
            class146.method1076(6938, 25);
        }
        class241.method1698(8215, class103.field1742, true);
        int var7 = class196.field3383;
        int var8 = class225.field3832;
        class225.field3832 = (arg5 - 6) * 8;
        class196.field3383 = (arg1 - 6) * 8;
        class128.field2332 = class68.method475(class128.field2342 * 8, class260.field4578 * 8, 6551);
        int var9 = class196.field3383 - var7;
        int var10 = class196.field3383;
        class178.field3085 = null;
        int var11 = class225.field3832 - var8;
        int var12 = class225.field3832;
        if (arg0) {
            class132.field2375 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class197 var14 = class86.field1450[var13];
                if (var14 != null) {
                    var14.field4533 -= var11 * 128;
                    var14.field4511 -= var9 * 128;
                    if (var14.field4511 >= 0 && var14.field4511 <= 13184 && var14.field4533 >= 0 && var14.field4533 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field4528[var15] -= var9;
                            var14.field4566[var15] -= var11;
                        }
                        class222.field3797[class132.field2375++] = var13;
                    } else {
                        class86.field1450[var13].field3436 = null;
                        class86.field1450[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class197 var32 = class86.field1450[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field4528[var33] -= var9;
                        var32.field4566[var33] -= var11;
                    }
                    var32.field4511 -= var9 * 128;
                    var32.field4533 -= var11 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class47 var30 = class22.field371[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field4528[var31] -= var9;
                    var30.field4566[var31] -= var11;
                }
                var30.field4511 -= var9 * 128;
                var30.field4533 -= var11 * 128;
            }
        }
        class216.field3712 = arg6;
        class236.field4047.method360(arg3, arg2, 4770, false);
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 0;
        byte var21 = 1;
        if (var9 < 0) {
            var21 = -1;
            var18 = 103;
            var19 = -1;
        }
        byte var22 = 104;
        byte var23 = 1;
        if (var11 < 0) {
            var22 = -1;
            var23 = -1;
            var20 = 103;
        }
        for (int var24 = var18; var24 != var19; var24 += var21) {
            for (int var26 = var20; var26 != var22; var26 += var23) {
                int var27 = var9 + var24;
                int var28 = var11 + var26;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class220.field3764[var29][var24][var26] = class220.field3764[var29][var27][var28];
                    } else {
                        class220.field3764[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class251 var25 = (class251) class175.field3048.method1811(2); var25 != null; var25 = (class251) class175.field3048.method1810(false)) {
            var25.field4338 -= var9;
            var25.field4341 -= var11;
            if (var25.field4338 < 0 || var25.field4341 < 0 || var25.field4338 >= 104 || var25.field4341 >= 104) {
                var25.method1743((byte) 96);
            }
        }
        if (class217.field3727 != 0) {
            class227.field3863 -= var11;
            class217.field3727 -= var9;
        }
        class58.field1012 = 0;
        if (arg0) {
            class178.field3078 -= var9 * 128;
            class22.field389 -= var11 * 128;
            class110.field2030 -= var11;
            class42.field712 -= var9;
            class200.field3467 -= var9;
            class49.field865 -= var11;
        } else {
            class179.field3095 = 1;
        }
        class97.field1639 = -1;
        class262.field4592.method1817(arg4);
        class242.field4202.method1817(1);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class192() {
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
    public static final void method1344(int arg0) {
        class170.field2982 = null;
        if (arg0 != 0) {
            field3325 = null;
        }
        class176.field3064 = null;
        class217.field3724 = null;
        field3314++;
        class241.field4187 = null;
        class31.field490 = null;
        class139.field2492 = null;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lmb;)V")
    public class192(class96 arg0) {
        this.field3315 = arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class303 {

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Ltl;")
    public static class59 field5164 = class85.method639("<img=1>", 9588);

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field5163 = 0;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Ltl;")
    public static class59 field5161 = class85.method639("::breakcon", 9588);

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field5158 = 0;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Lic;")
    public static class20 field5159;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIIBIII)V", line = 27)
    public static final void method2107(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field5157++;
        if (class187.field3127 == arg6 && class294.field5017 == arg4 && class291.field4986 == arg5 || class125.method922((byte) 51)) {
            return;
        }
        class294.field5017 = arg4;
        class187.field3127 = arg6;
        class291.field4986 = arg5;
        if (class125.method922((byte) 55)) {
            class291.field4986 = 0;
        }
        if (arg0) {
            class286.method1996(30143, 28);
        } else {
            class286.method1996(30143, 25);
        }
        class128.method939(-21, true, class69.field1059);
        int var7 = class187.field3135;
        int var8 = class197.field3249;
        class197.field3249 = (arg6 - 6) * 8;
        class187.field3135 = (arg4 - 6) * 8;
        class173.field2840 = class53.method370(class187.field3127 * 8, (byte) -31, class294.field5017 * 8);
        int var9 = class197.field3249 - var8;
        int var10 = class187.field3135 - var7;
        int var11 = class197.field3249;
        class86.field1350 = null;
        int var12 = class187.field3135;
        if (arg0) {
            class185.field3107 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class23 var14 = class23.field311[var13];
                if (var14 != null) {
                    var14.field1769 -= var10 * 128;
                    var14.field1774 -= var9 * 128;
                    if (var14.field1774 >= 0 && var14.field1774 <= 13184 && var14.field1769 >= 0 && var14.field1769 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field1729[var15] -= var9;
                            var14.field1773[var15] -= var10;
                        }
                        class232.field3816[class185.field3107++] = var13;
                    } else {
                        class23.field311[var13].field314 = null;
                        class23.field311[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class23 var17 = class23.field311[var16];
                if (var17 != null) {
                    for (int var18 = 0; var18 < 10; var18++) {
                        var17.field1729[var18] -= var9;
                        var17.field1773[var18] -= var10;
                    }
                    var17.field1774 -= var9 * 128;
                    var17.field1769 -= var10 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class102 var20 = class211.field3438[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field1729[var21] -= var9;
                    var20.field1773[var21] -= var10;
                }
                var20.field1769 -= var10 * 128;
                var20.field1774 -= var9 * 128;
            }
        }
        byte var22 = 0;
        class247.field4119 = arg5;
        byte var23 = 104;
        byte var24 = 1;
        if (var9 < 0) {
            var23 = -1;
            var24 = -1;
            var22 = 103;
        }
        class286.field4920.method780(false, arg1, arg2, (byte) 50);
        byte var25 = 0;
        byte var26 = 104;
        byte var27 = 1;
        if (var10 < 0) {
            var26 = -1;
            var25 = 103;
            var27 = -1;
        }
        for (int var28 = var22; var28 != var23; var28 += var24) {
            for (int var29 = var25; var29 != var26; var29 += var27) {
                int var30 = var9 + var28;
                int var31 = var10 + var29;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class159.field2604[var32][var28][var29] = class159.field2604[var32][var30][var31];
                    } else {
                        class159.field2604[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class286 var33 = (class286) class173.field2839.method536(2); var33 != null; var33 = (class286) class173.field2839.method533(24)) {
            var33.field4910 -= var10;
            var33.field4921 -= var9;
            if (var33.field4921 < 0 || var33.field4910 < 0 || var33.field4921 >= 104 || var33.field4910 >= 104) {
                var33.method2000(arg3 ^ 0xFFFFFF9B);
            }
        }
        if (arg3 != 40) {
            field5159 = (class20) null;
        }
        if (class72.field1123 != 0) {
            class72.field1123 -= var9;
            class18.field227 -= var10;
        }
        if (arg0) {
            class73.field1158 -= var10;
            class222.field3607 -= var10;
            class88.field1381 -= var9;
            class283.field4866 -= var9;
        } else {
            class266.field4585 = 1;
        }
        class140.field2310 = 0;
        if (class55.field815 && arg0 && (Math.abs(var9) > 104 || Math.abs(var10) > 104)) {
            class255.method1779(-12843);
        }
        class84.field1317 = -1;
        class108.field1802.method530(-15068);
        class178.field2913.method530(arg3 - 15108);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIII)V", line = 278)
    public static final void method2108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5160++;
        if (arg7 != -3547 || arg5 < 0 || arg2 < 0 || arg5 >= 103 || arg2 >= 103) {
            return;
        }
        if (arg1 == 0) {
            class201 var8 = class59.method474(arg0, arg5, arg2);
            if (var8 != null) {
                int var9 = Integer.MAX_VALUE & (int) (var8.field3325 >>> 32);
                if (arg4 == 2) {
                    var8.field3323 = new class237(var9, 2, arg6 + 4, arg0, arg5, arg2, arg3, false, var8.field3323);
                    var8.field3326 = new class237(var9, 2, arg6 + 1 & 0x3, arg0, arg5, arg2, arg3, false, var8.field3326);
                } else {
                    var8.field3323 = new class237(var9, arg4, arg6, arg0, arg5, arg2, arg3, false, var8.field3323);
                }
            }
        }
        if (arg1 == 1) {
            class222 var10 = class221.method1534(arg0, arg5, arg2);
            if (var10 != null) {
                int var11 = (int) (var10.field3606 >>> 32) & Integer.MAX_VALUE;
                if (arg4 == 4 || arg4 == 5) {
                    var10.field3588 = new class237(var11, 4, arg6, arg0, arg5, arg2, arg3, false, var10.field3588);
                } else if (arg4 == 6) {
                    var10.field3588 = new class237(var11, 4, arg6 + 4, arg0, arg5, arg2, arg3, false, var10.field3588);
                } else if (arg4 == 7) {
                    var10.field3588 = new class237(var11, 4, (arg6 + 2 & 0x3) + 4, arg0, arg5, arg2, arg3, false, var10.field3588);
                } else if (arg4 == 8) {
                    var10.field3588 = new class237(var11, 4, arg6 + 4, arg0, arg5, arg2, arg3, false, var10.field3588);
                    var10.field3593 = new class237(var11, 4, (arg6 + 2 & 0x3) + 4, arg0, arg5, arg2, arg3, false, var10.field3593);
                }
            }
        }
        if (arg1 == 2) {
            class165 var12 = class284.method1987(arg0, arg5, arg2);
            if (arg4 == 11) {
                arg4 = 10;
            }
            if (var12 != null) {
                var12.field2688 = new class237(Integer.MAX_VALUE & (int) (var12.field2673 >>> 32), arg4, arg6, arg0, arg5, arg2, arg3, false, var12.field2688);
            }
        }
        if (arg1 == 3) {
            class296 var13 = class226.method1555(arg0, arg5, arg2);
            if (var13 != null) {
                var13.field5073 = new class237(Integer.MAX_VALUE & (int) (var13.field5074 >>> 32), 22, arg6, arg0, arg5, arg2, arg3, false, var13.field5073);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 377)
    public static void method2109(byte arg0) {
        field5161 = null;
        if (arg0 == -108) {
            field5159 = null;
            field5164 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)V", line = 396)
    public static final void method2110(boolean arg0, int arg1) {
        field5165++;
        class186 var2 = class67.method561(32, arg1, 5);
        var2.method1381(arg0);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 410)
    public static final void method2111(int arg0) {
        field5162++;
        int var1 = class228.method1568(true);
        if (arg0 <= 31) {
            field5158 = 28;
        }
        if (var1 == 0) {
            class213.field3500 = (byte[][][]) null;
            class99.method754(3, 0);
        } else if (var1 == 1) {
            class6.method49((byte) 0, 4);
            class99.method754(3, 512);
            class99.method749(-44);
        } else {
            class6.method49((byte) (class178.field2914 - 4 & 0xFF), 4);
            class99.method754(3, 2);
        }
    }
}

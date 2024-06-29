import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class184 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Ljd;")
    public static class86 field3267 = class122.method868("leuchten2:", true);

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Ljd;")
    public static class86 field3270 = class122.method868(":chalreq:", true);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static void method1269(boolean arg0) {
        if (!arg0) {
            field3267 = null;
        }
        field3270 = null;
        field3267 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
    public static final void method1270(int arg0, int arg1, int arg2) {
        class243.field4352 = true;
        class30.field631 = arg0;
        class139.field2651 = arg1;
        class160.field3007 = arg2;
        class38.field897 = -1;
        class46.field1026 = -1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIZII)V")
    public static final void method1271(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3269++;
        if (class249.field4446 == arg3 && class149.field2780 == arg0 && class6.field235 == arg2 || class171.method1225(20)) {
            return;
        }
        class149.field2780 = arg0;
        class249.field4446 = arg3;
        class6.field235 = arg2;
        if (class171.method1225(-124)) {
            class6.field235 = 0;
        }
        if (arg4) {
            class138.method983(28, (byte) -45);
        } else {
            class138.method983(25, (byte) 13);
        }
        class46.method361((byte) -48, class272.field4768, true);
        int var7 = class252.field4481;
        class252.field4481 = arg3 * 8 - 48;
        if (arg1 > -103) {
            return;
        }
        int var8 = class79.field1554;
        class79.field1554 = (arg0 - 6) * 8;
        class65.field1291 = class215.method1520(class149.field2780 * 8, 22515, class249.field4446 * 8);
        int var9 = class79.field1554 - var8;
        int var10 = class252.field4481 - var7;
        int var11 = class252.field4481;
        int var12 = class79.field1554;
        if (arg4) {
            class61.field1207 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class170 var14 = class233.field4217[var13];
                if (var14 != null) {
                    var14.field676 -= var10 * 128;
                    var14.field685 -= var9 * 128;
                    if (var14.field676 >= 0 && var14.field676 <= 13184 && var14.field685 >= 0 && var14.field685 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field707[var15] -= var10;
                            var14.field705[var15] -= var9;
                        }
                        class189.field3350[class61.field1207++] = var13;
                    } else {
                        class233.field4217[var13].field3130 = null;
                        class233.field4217[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class170 var32 = class233.field4217[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field707[var33] -= var10;
                        var32.field705[var33] -= var9;
                    }
                    var32.field676 -= var10 * 128;
                    var32.field685 -= var9 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class224 var30 = class186.field3294[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field707[var31] -= var10;
                    var30.field705[var31] -= var9;
                }
                var30.field685 -= var9 * 128;
                var30.field676 -= var10 * 128;
            }
        }
        class180.field3244 = arg2;
        class124.field2412.method1570(arg6, false, arg5, -118);
        byte var18 = 104;
        byte var19 = 0;
        byte var20 = 1;
        byte var21 = 104;
        byte var22 = 0;
        byte var23 = 1;
        if (var9 < 0) {
            var21 = -1;
            var22 = 103;
            var23 = -1;
        }
        if (var10 < 0) {
            var18 = -1;
            var20 = -1;
            var19 = 103;
        }
        for (int var24 = var19; var24 != var18; var24 += var20) {
            for (int var26 = var22; var26 != var21; var26 += var23) {
                int var27 = var9 + var26;
                int var28 = var10 + var24;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                        class238.field4284[var29][var24][var26] = class238.field4284[var29][var28][var27];
                    } else {
                        class238.field4284[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class162 var25 = (class162) class229.field4158.method1737((byte) 74); var25 != null; var25 = (class162) class229.field4158.method1740(-8843)) {
            var25.field3041 -= var9;
            var25.field3055 -= var10;
            if (var25.field3055 < 0 || var25.field3041 < 0 || var25.field3055 >= 104 || var25.field3041 >= 104) {
                var25.method1477(1);
            }
        }
        class21.field544 = 0;
        if (class133.field2514 != 0) {
            class133.field2514 -= var10;
            class193.field3459 -= var9;
        }
        if (arg4) {
            class144.field2725 -= var10;
            class242.field4334 -= var9;
            class8.field261 -= var10;
            class88.field1741 -= var9;
        } else {
            class152.field2874 = 1;
        }
        class244.field4357 = -1;
        class187.field3313.method1739(true);
        class23.field576.method1739(true);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)Z")
    public static final boolean method1272(int arg0) {
        field3271++;
        if (arg0 != 22050) {
            field3267 = null;
        }
        try {
            if (class45.field1007 == 2) {
                if (class221.field3965 == null) {
                    class221.field3965 = class172.method1234(class187.field3315, class272.field4766, class171.field3143);
                    if (class221.field3965 == null) {
                        return false;
                    }
                }
                if (class12.field392 == null) {
                    class12.field392 = new class42(class69.field1384, class126.field2437);
                }
                if (class253.field4504.method300(class12.field392, class224.field4050, class221.field3965, 22050, -12956)) {
                    class253.field4504.method307(arg0 - 13858);
                    class253.field4504.method308(class135.field2592, arg0 ^ 0x3D5F);
                    class253.field4504.method289((byte) 69, class221.field3965, class177.field3208);
                    class221.field3965 = null;
                    class12.field392 = null;
                    class187.field3315 = null;
                    class45.field1007 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class253.field4504.method294((byte) 46);
            class45.field1007 = 0;
            class187.field3315 = null;
            class12.field392 = null;
            class221.field3965 = null;
        }
        return false;
    }
}

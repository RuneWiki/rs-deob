import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class24 extends class107 {

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public static int field364 = 0;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
    public static int field363 = 0;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "Ldf;")
    private static class51 field369 = class46.method233("Loaded wordpack", 100);

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "Ldf;")
    public static class51 field359 = field369;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    public static int field370 = 5063219;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "Lu;")
    public static class111 field361;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lkb;III)V")
    public static final void method129(class49 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class48.field758) {
            class97 var4 = class27.field395[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1614 != null && var4.field1614.field2655.method259()) {
                arg0.method261(var4.field1614.field2655, 128, 0, 0, true);
            }
        }
        if (arg3 < class48.field758) {
            class97 var5 = class27.field395[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1614 != null && var5.field1614.field2655.method259()) {
                arg0.method261(var5.field1614.field2655, 0, 0, 128, true);
            }
        }
        if (arg2 < class48.field758 && arg3 < class192.field3229) {
            class97 var6 = class27.field395[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1614 != null && var6.field1614.field2655.method259()) {
                arg0.method261(var6.field1614.field2655, 128, 0, 128, true);
            }
        }
        if (arg2 < class48.field758 && arg3 > 0) {
            class97 var7 = class27.field395[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1614 != null && var7.field1614.field2655.method259()) {
                arg0.method261(var7.field1614.field2655, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public static void method130(boolean arg0) {
        field361 = null;
        if (arg0) {
            field359 = null;
            field369 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lhb;IIIIIIZ)V")
    public static final void method131(class199 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field3341.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field3341[var9] - class124.field2105;
            int var23 = arg0.field3344[var9] - class69.field1108;
            int var24 = arg0.field3342[var9] - class123.field2083;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field3348 != null) {
                class199.field3345[var9] = var25;
                class199.field3328[var9] = var28;
                class199.field3346[var9] = var29;
            }
            class199.field3347[var9] = (var25 << 9) / var29 + class73.field1163;
            class199.field3330[var9] = (var28 << 9) / var29 + class73.field1154;
        }
        class73.field1153 = 0;
        int var10 = arg0.field3332.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field3332[var11];
            int var13 = arg0.field3338[var11];
            int var14 = arg0.field3349[var11];
            int var15 = class199.field3347[var12];
            int var16 = class199.field3347[var13];
            int var17 = class199.field3347[var14];
            int var18 = class199.field3330[var12];
            int var19 = class199.field3330[var13];
            int var20 = class199.field3330[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class82.field1389 && class190.method1360(class73.field1163 + class22.field316, class8.field85 + class73.field1154, var18, var19, var20, var15, var16, var17)) {
                    class247.field4320 = arg5;
                    class116.field1962 = arg6;
                }
                if (!arg7) {
                    class73.field1157 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class73.field1162 || var16 > class73.field1162 || var17 > class73.field1162) {
                        class73.field1157 = true;
                    }
                    if (arg0.field3348 == null || arg0.field3348[var11] == -1) {
                        if (arg0.field3343[var11] != 12345678) {
                            class73.method511(var18, var19, var20, var15, var16, var17, arg0.field3343[var11], arg0.field3334[var11], arg0.field3336[var11]);
                        }
                    } else if (!class190.field3182) {
                        int var21 = class73.field1166.method460(-1765, arg0.field3348[var11]);
                        class73.method511(var18, var19, var20, var15, var16, var17, class17.method89(var21, arg0.field3343[var11]), class17.method89(var21, arg0.field3334[var11]), class17.method89(var21, arg0.field3336[var11]));
                    } else if (arg0.field3340) {
                        class73.method510(var18, var19, var20, var15, var16, var17, arg0.field3343[var11], arg0.field3334[var11], arg0.field3336[var11], class199.field3345[0], class199.field3345[1], class199.field3345[3], class199.field3328[0], class199.field3328[1], class199.field3328[3], class199.field3346[0], class199.field3346[1], class199.field3346[3], arg0.field3348[var11]);
                    } else {
                        class73.method510(var18, var19, var20, var15, var16, var17, arg0.field3343[var11], arg0.field3334[var11], arg0.field3336[var11], class199.field3345[var12], class199.field3345[var13], class199.field3345[var14], class199.field3328[var12], class199.field3328[var13], class199.field3328[var14], class199.field3346[var12], class199.field3346[var13], class199.field3346[var14], arg0.field3348[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V")
    public static final void method132(byte arg0) {
        if (arg0 == -100) {
            class97.field1600.method1350((byte) 111);
            class204.field3403.method1350((byte) 110);
            field358++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)V")
    public static final void method133(int arg0, int arg1) {
        field360++;
        class255 var2 = (class255) class242.field4190.method1451(61);
        if (arg0 >= -119) {
            field369 = null;
        }
        while (var2 != null) {
            if ((long) arg1 == (var2.field1760 >> 48 & 0xFFFFL)) {
                var2.method764((byte) -128);
            }
            var2 = (class255) class242.field4190.method1449(-1);
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(II)V")
    public class24(int arg0, int arg1) {
        this.field362 = arg0;
        this.field368 = arg1;
    }
}

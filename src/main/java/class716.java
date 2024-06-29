import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class716 {

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "J")
    public long field10109;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "Lkw;")
    private class346 field10107;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "Lfba;")
    public static class348 field10105 = new class348(8);

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field10113 = new String[100];

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field10106;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field10111;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field10112;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "Lda;")
    public static class400 field10110;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "([[[Ldn;IZIIZ)Z")
    public static final boolean method4025(class375[][][] arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        field10112++;
        byte var6 = arg2 ? 1 : (byte) (class444.field6347 & 0xFF);
        if (class651.field9345[class687.field9758][arg1][arg3] == var6) {
            return false;
        } else if ((class160.field2297[class687.field9758][arg1][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            if (!arg5) {
                field10113 = null;
            }
            class67.field1036[var7] = arg1;
            int var35 = var7 + 1;
            class11.field99[var7] = arg3;
            class651.field9345[class687.field9758][arg1][arg3] = var6;
            while (var35 != var8) {
                int var9 = class67.field1036[var8] & 0xFFFF;
                int var10 = (class67.field1036[var8] & 0xFF9381) >> 16;
                int var11 = class67.field1036[var8] >> 24 & 0xFF;
                int var12 = class11.field99[var8] & 0xFFFF;
                int var13 = (class11.field99[var8] & 0xFFF1F1) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class160.field2297[class687.field9758][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class687.field9758 + 1; var16 <= 3; var16++) {
                    if ((class160.field2297[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field5431 != null) {
                                int var20 = class32.method170(var10, true);
                                if (arg0[var16][var9][var12].field5431.field181 == var20 || arg0[var16][var9][var12].field5427 != null && arg0[var16][var9][var12].field5427.field181 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class32.method170(var11, arg5);
                                    if (arg0[var16][var9][var12].field5431.field181 == var21 || arg0[var16][var9][var12].field5427 != null && arg0[var16][var9][var12].field5427.field181 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class32.method170(var13, arg5);
                                    if (arg0[var16][var9][var12].field5431.field181 == var22 || arg0[var16][var9][var12].field5427 != null && arg0[var16][var9][var12].field5427.field181 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class375 var23 = arg0[var16][var9][var12];
                            if (var23.field5425 != null) {
                                for (class208 var24 = var23.field5425; var24 != null; var24 = var24.field3146) {
                                    class638 var25 = var24.field3144;
                                    if (var25 instanceof class324) {
                                        class324 var26 = (class324) var25;
                                        int var27 = var26.method604((byte) 94);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method606(-85);
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class375 var30 = arg0[var16][var9][var12];
                        if (var30 != null && var30.field5425 != null) {
                            for (class208 var31 = var30.field5425; var31 != null; var31 = var31.field3146) {
                                class638 var32 = var31.field3144;
                                if (var32.field9038 != var32.field9036 || var32.field9042 != var32.field9035) {
                                    for (int var33 = var32.field9038; var33 <= var32.field9036; var33++) {
                                        for (int var34 = var32.field9035; var34 <= var32.field9042; var34++) {
                                            class651.field9345[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class651.field9345[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class95.field1372[class687.field9758 + 1].method2087(57, var9, var12);
                    if (class192.field2820[arg4] < var17) {
                        class192.field2820[arg4] = var17;
                    }
                    int var18 = var9 << 9;
                    int var19 = var12 << 9;
                    if (class403.field5757[arg4] > var18) {
                        class403.field5757[arg4] = var18;
                    } else if (var18 > class721.field10155[arg4]) {
                        class721.field10155[arg4] = var18;
                    }
                    if (class738.field10308[arg4] > var19) {
                        class738.field10308[arg4] = var19;
                    } else if (class726.field10208[arg4] < var19) {
                        class726.field10208[arg4] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class651.field9345[class687.field9758][var9 - 1][var12] != var6) {
                        class67.field1036[var35] = class430.method2658(-754974720, class430.method2658(var9 - 1, 1179648));
                        class11.field99[var35] = class430.method2658(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class651.field9345[class687.field9758][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class240.field3555;
                    var12++;
                    if (var10000 < ~var12) {
                        if ((var9 - 1) >= 0 && class651.field9345[class687.field9758][var9 - 1][var12] != var6 && (class160.field2297[class687.field9758][var9][var12] & 0x4) == 0 && (class160.field2297[class687.field9758][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class67.field1036[var35] = class430.method2658(1375731712, class430.method2658(1179648, var9 - 1));
                            class11.field99[var35] = class430.method2658(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class651.field9345[class687.field9758][var9 - 1][var12] = var6;
                        }
                        if (class651.field9345[class687.field9758][var9][var12] != var6) {
                            class67.field1036[var35] = class430.method2658(318767104, class430.method2658(5373952, var9));
                            class11.field99[var35] = class430.method2658(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class651.field9345[class687.field9758][var9][var12] = var6;
                        }
                        if (var9 + 1 < class184.field2546 && class651.field9345[class687.field9758][var9 + 1][var12] != var6 && (class160.field2297[class687.field9758][var9][var12] & 0x4) == 0 && (class160.field2297[class687.field9758][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class67.field1036[var35] = class430.method2658(-1845493760, class430.method2658(var9 + 1, 5373952));
                            class11.field99[var35] = class430.method2658(5439488, var12);
                            class651.field9345[class687.field9758][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class184.field2546 > (var9 + 1) && class651.field9345[class687.field9758][var9 + 1][var12] != var6) {
                        class67.field1036[var35] = class430.method2658(class430.method2658(var9 + 1, 9568256), 1392508928);
                        class11.field99[var35] = class430.method2658(var12, 9633792);
                        class651.field9345[class687.field9758][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class651.field9345[class687.field9758][var9 - 1][var12] != var6 && (class160.field2297[class687.field9758][var9][var12] & 0x4) == 0 && (class160.field2297[class687.field9758][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class67.field1036[var35] = class430.method2658(301989888, class430.method2658(var9 - 1, 13762560));
                            class11.field99[var35] = class430.method2658(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class651.field9345[class687.field9758][var9 - 1][var12] = var6;
                        }
                        if (class651.field9345[class687.field9758][var9][var12] != var6) {
                            class67.field1036[var35] = class430.method2658(-1828716544, class430.method2658(var9, 13762560));
                            class11.field99[var35] = class430.method2658(13828096, var12);
                            class651.field9345[class687.field9758][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class184.field2546 && class651.field9345[class687.field9758][var9 + 1][var12] != var6 && (class160.field2297[class687.field9758][var9][var12] & 0x4) == 0 && (class160.field2297[class687.field9758][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class67.field1036[var35] = class430.method2658(-771751936, class430.method2658(9568256, var9 + 1));
                            class11.field99[var35] = class430.method2658(9633792, var12);
                            class651.field9345[class687.field9758][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class192.field2820[arg4] != -1000000) {
                class192.field2820[arg4] += 40;
                class403.field5757[arg4] -= 512;
                class721.field10155[arg4] += 512;
                class726.field10208[arg4] += 512;
                class738.field10308[arg4] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public static final void method4026(int arg0) {
        field10106++;
        class751.field10467.method271(((float) class243.field3580.field8018.method3449(false) * 0.1F + 0.7F) * 1.1523438F);
        int var1 = 40 / ((arg0 - 44) / 47);
        class751.field10467.method363(class514.field7445, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class751.field10467.method388(class647.field9314, -1, 0);
        class751.field10467.method353(class387.field5590);
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V")
    public static void method4027(int arg0) {
        field10110 = null;
        field10105 = null;
        field10113 = null;
        if (arg0 != -21121) {
            method4025(null, 98, false, 118, -38, false);
        }
    }

    @OriginalMember(owner = "client!tn", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field10107.method2118(this.field10109, true);
        field10108++;
        super.finalize();
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lkw;JI)V")
    public class716(class346 arg0, long arg1, int arg2) {
        this.field10109 = arg1;
        this.field10107 = arg0;
    }
}

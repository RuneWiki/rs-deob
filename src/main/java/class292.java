import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class292 extends class476 {

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "Lmg;")
    public class530 field3957 = new class530();

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "[I")
    public static int[] field3953 = new int[2];

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "J")
    public static long field3954;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILdc;I)V", line = 4)
    public static final void method1691(int arg0, class16 arg1, int arg2) {
        field3955++;
        int var3 = -1;
        int var4 = arg2;
        if (arg1.field160 > class28.field417) {
            class189.method1261(true, arg1);
        } else if (arg1.field181 >= class28.field417) {
            class490.method2905(false, arg1);
        } else {
            class370.method2209(-21152, arg1, false);
            var4 = class264.field3548;
            var3 = class392.field5666;
        }
        if (arg1.field6284 < 128 || arg1.field6287 < 128 || arg1.field6284 >= class9.field111 * 128 - 128 || arg1.field6287 >= (class192.field2809 * 128 - 128)) {
            arg1.field166 = -1;
            arg1.field237 = -1;
            var3 = -1;
            arg1.field160 = 0;
            var4 = 0;
            arg1.field175 = -1;
            arg1.field181 = 0;
            arg1.field6284 = arg1.field263[0] * 128 + arg1.method116(8569) * 64;
            arg1.field6287 = arg1.field257[0] * 128 + arg1.method116(arg2 + 8569) * 64;
            arg1.method117(0);
        }
        if (class81.field1158 == arg1 && (arg1.field6284 < 1536 || arg1.field6287 < 1536 || (class9.field111 - 12) * 128 <= arg1.field6284 || (class192.field2809 * 128 - 1536) <= arg1.field6287)) {
            var4 = 0;
            var3 = -1;
            arg1.field166 = -1;
            arg1.field237 = -1;
            arg1.field181 = 0;
            arg1.field160 = 0;
            arg1.field175 = -1;
            arg1.field6284 = arg1.field263[0] * 128 + (arg1.method116(8569) * 64);
            arg1.field6287 = arg1.field257[0] * 128 + (arg1.method116(arg2 ^ 0x2179) * 64);
            arg1.method117(0);
        }
        int var5 = class532.method3158(-5501, arg1);
        class214.method1350(arg1, arg2 - 1, var4, var3, var5);
        class466.method2700(arg1, 21758);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIILnt;IB)V", line = 66)
    public static final void method1692(int arg0, int arg1, int arg2, class374 arg3, int arg4, byte arg5) {
        field3952++;
        if (arg5 != -1) {
            field3953 = null;
        }
        if (arg3.field5361 == -1 && arg3.field5363 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class76.field1075.field3682 * arg3.field5366 >> 8;
        if (arg3.field5380 < arg1) {
            var6 += arg1 - arg3.field5380;
        } else if (arg1 < arg3.field5370) {
            var6 += arg3.field5370 - arg1;
        }
        if (arg3.field5365 < arg2) {
            var6 += arg2 - arg3.field5365;
        } else if (arg2 < arg3.field5382) {
            var6 += arg3.field5382 - arg2;
        }
        if (arg3.field5378 == 0 || var6 - 64 > arg3.field5378 || class76.field1075.field3682 == 0 || arg3.field5377 != arg4) {
            if (arg3.field5367 != null) {
                class290.field3924.method298(arg3.field5367);
                arg3.field5367 = null;
            }
            if (arg3.field5369 != null) {
                class290.field3924.method298(arg3.field5369);
                arg3.field5369 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field5378 - var6) * var7 / arg3.field5378;
        if (arg3.field5367 != null) {
            arg3.field5367.method2821(var8);
        } else if (arg3.field5361 >= 0) {
            class64 var9 = class64.method423(class481.field6956, arg3.field5361, 0);
            if (var9 != null) {
                class174 var10 = var9.method425().method1204(class149.field2289);
                class477 var11 = class477.method2820(var10, 100, var8);
                var11.method2825(-1);
                class290.field3924.method293(var11);
                arg3.field5367 = var11;
            }
        }
        if (arg3.field5369 != null) {
            arg3.field5369.method2821(var8);
            if (!arg3.field5369.method2790(-100)) {
                arg3.field5369 = null;
            }
        } else if (arg3.field5363 != null && (arg3.field5375 -= arg0) <= 0) {
            int var12 = (int) (Math.random() * (double) arg3.field5363.length);
            class64 var13 = class64.method423(class481.field6956, arg3.field5363[var12], 0);
            if (var13 != null) {
                class174 var14 = var13.method425().method1204(class149.field2289);
                class477 var15 = class477.method2820(var14, 100, var8);
                var15.method2825(0);
                class290.field3924.method293(var15);
                arg3.field5375 = (int) ((double) (arg3.field5368 - arg3.field5359) * Math.random()) + arg3.field5359;
                arg3.field5369 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V", line = 195)
    public static void method1693(int arg0) {
        if (arg0 <= -39) {
            field3953 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZLpf;Z)V", line = 211)
    public static final void method1694(boolean arg0, class487 arg1, boolean arg2) {
        if (!arg0) {
            method1691(74, null, -79);
        }
        field3951++;
        if (class527.field7690 >= 400) {
            return;
        }
        if (class81.field1158 != arg1) {
            String var9;
            if (arg1.field7017 == 0) {
                boolean var3 = true;
                if (class81.field1158.field7012 != -1 && arg1.field7012 != -1) {
                    int var4 = arg1.field7028 < class81.field1158.field7028 ? class81.field1158.field7028 : arg1.field7028;
                    int var5 = arg1.field7012 > class81.field1158.field7012 ? class81.field1158.field7012 : arg1.field7012;
                    int var6 = 5 - (-(var4 * 10 / 100) - var5);
                    int var7 = class81.field1158.field7028 - arg1.field7028;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var7 > var6) {
                        var3 = false;
                    }
                }
                String var8 = class308.field4192 == class152.field2343 ? class492.field7105.method1126(class486.field6998, (byte) -19) : class102.field1608.method1126(class486.field6998, (byte) -19);
                if (arg1.field7028 >= arg1.field7021) {
                    var9 = arg1.method2885(true, -127) + (var3 ? class269.method1580(arg0, arg1.field7028, class81.field1158.field7028) : "<col=ffffff>") + " (" + var8 + arg1.field7028 + ")";
                } else {
                    var9 = arg1.method2885(true, -83) + (var3 ? class269.method1580(true, arg1.field7028, class81.field1158.field7028) : "<col=ffffff>") + " (" + var8 + arg1.field7028 + "+" + (arg1.field7021 - arg1.field7028) + ")";
                }
            } else {
                var9 = arg1.method2885(true, -111) + " (" + class7.field89.method1126(class486.field6998, (byte) -19) + arg1.field7017 + ")";
            }
            if (class375.field5390) {
                if (!arg2 && (class107.field1737 & 0x8) != 0) {
                    class100.field1583++;
                    class193.method1274(0, class87.field1409, true, class484.field6965, class476.field6886 + " -> <col=ffffff>" + var9, -1, 0, 57, false, true, (long) arg1.field179);
                }
            } else if (arg2) {
                class193.method1274(0, "<col=cccccc>" + var9, false, -1, "", 0, 0, -1, true, true, 0L);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class331.field4501[var10] != null) {
                        short var11 = 0;
                        if (class98.field1564 == class152.field2343 && class331.field4501[var10].equalsIgnoreCase(class181.field2694.method1126(class486.field6998, (byte) -19))) {
                            if (arg1.field7028 > class81.field1158.field7028) {
                                var11 = 2000;
                            }
                            if (class81.field1158.field7005 != 0 && arg1.field7005 != 0) {
                                if (class81.field1158.field7005 == arg1.field7005) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class245.field3354[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class241.field3323[var10] + var11);
                        int var13 = class497.field7282[var10] == -1 ? class153.field2359 : class497.field7282[var10];
                        class193.method1274(0, class331.field4501[var10], true, var13, "<col=ffffff>" + var9, -1, 0, var12, false, true, (long) arg1.field179);
                        class512.field7503++;
                    }
                }
            }
            if (!arg2) {
                for (class440 var14 = (class440) class391.field5638.method3137(0); var14 != null; var14 = (class440) class391.field5638.method3132(0)) {
                    if (var14.field6337 == 10) {
                        var14.field6338 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class375.field5390 && (class107.field1737 & 0x10) != 0) {
            class193.method1274(0, class87.field1409, true, class484.field6965, class476.field6886 + " -> <col=ffffff>" + class185.field2741.method1126(class486.field6998, (byte) -19), -1, 0, 16, false, true, 0L);
            class369.field5283++;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)V", line = 369)
    public static final void method1695(int arg0, int arg1) {
        class2.field33.method2779(14896, arg0);
        field3956++;
        if (arg1 != 0) {
            method1695(54, 92);
        }
    }
}

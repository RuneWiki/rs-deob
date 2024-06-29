import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class277 {

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "[I")
    private static int[] field3747 = new int[5];

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    private static int field3745 = 0;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "[Ljava/lang/String;")
    private static String[] field3741 = new String[1000];

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "[Lvj;")
    private static class177[] field3748 = new class177[50];

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "[I")
    private static int[] field3751 = new int[1000];

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "[[I")
    private static int[][] field3753 = new int[5][5000];

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "Ljava/util/Calendar;")
    private static Calendar field3754 = Calendar.getInstance();

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "[I")
    private static int[] field3759 = new int[3];

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field3760 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Lph;")
    public static class114 field3758 = new class114(4);

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Lfd;")
    private static class194 field3735;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lfd;")
    private static class194 field3746;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Lri;")
    private static class97 field3744;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "[I")
    private static int[] field3740;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "[Ljava/lang/String;")
    private static String[] field3750;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
    public static void method1521() {
        field3740 = null;
        field3750 = null;
        field3747 = null;
        field3753 = null;
        field3751 = null;
        field3741 = null;
        field3748 = null;
        field3746 = null;
        field3735 = null;
        field3744 = null;
        field3754 = null;
        field3760 = null;
        field3759 = null;
        field3758 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
    public static final void method1522(int arg0, int arg1, int arg2) {
        class451 var3 = class337.method1963(arg1, arg2, (byte) -126, arg0);
        if (var3 == null) {
            return;
        }
        field3740 = new int[var3.field6559];
        field3750 = new String[var3.field6557];
        if (var3.field6564 == 15 || var3.field6564 == 17 || var3.field6564 == 16) {
            int var4 = 0;
            int var5 = 0;
            if (class271.field3671 != null) {
                var4 = class271.field3671.field2562;
                var5 = class271.field3671.field2553;
            }
            field3740[0] = class337.field4493 - var4;
            field3740[1] = class306.field4146 - var5;
        }
        method1526(var3, 200000);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljb;)V")
    public static final void method1523(class425 arg0) {
        method1525(arg0, 200000);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static final void method1524(int arg0) {
        if (arg0 == -1 || !class262.method1460((byte) -126, arg0)) {
            return;
        }
        class194[] var1 = class235.field3227[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class194 var3 = var1[var2];
            if (var3.field2615 != null) {
                class425 var4 = new class425();
                var4.field6242 = var3;
                var4.field6240 = var3.field2615;
                method1525(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljb;I)V")
    private static final void method1525(class425 arg0, int arg1) {
        Object[] var2 = arg0.field6240;
        int var3 = (Integer) var2[0];
        class451 var4 = class108.method572((byte) -2, var3);
        if (var4 == null) {
            return;
        }
        field3740 = new int[var4.field6559];
        int var5 = 0;
        field3750 = new String[var4.field6557];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field6227;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field6239;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field6242 == null ? -1 : arg0.field6242.field2502;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field6238;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field6242 == null ? -1 : arg0.field6242.field2542;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field6237 == null ? -1 : arg0.field6237.field2502;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field6237 == null ? -1 : arg0.field6237.field2542;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field6236;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field6233;
                }
                field3740[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field6228;
                }
                field3750[var6++] = var9;
            }
        }
        method1526(var4, arg1);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lml;I)V")
    private static final void method1526(class451 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field6565;
        int[] var6 = arg0.field6555;
        byte var7 = -1;
        field3745 = 0;
        try {
            int var8 = 0;
            label4411: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var607 = var5[var4];
                if (var607 < 100) {
                    if (var607 == 0) {
                        field3751[var2++] = var6[var4];
                        continue;
                    }
                    if (var607 == 1) {
                        int var9 = var6[var4];
                        field3751[var2++] = class254.field3495[var9];
                        continue;
                    }
                    if (var607 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class44.method205(field3751[var2], true, var10);
                        continue;
                    }
                    if (var607 == 3) {
                        field3741[var3++] = arg0.field6566[var4];
                        continue;
                    }
                    if (var607 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var607 == 7) {
                        var2 -= 2;
                        if (field3751[var2 + 1] != field3751[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 8) {
                        var2 -= 2;
                        if (field3751[var2 + 1] == field3751[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 9) {
                        var2 -= 2;
                        if (field3751[var2] < field3751[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 10) {
                        var2 -= 2;
                        if (field3751[var2] > field3751[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 21) {
                        if (field3745 == 0) {
                            return;
                        }
                        class177 var11 = field3748[--field3745];
                        arg0 = var11.field2212;
                        var5 = arg0.field6565;
                        var6 = arg0.field6555;
                        var4 = var11.field2213;
                        field3740 = var11.field2222;
                        field3750 = var11.field2218;
                        continue;
                    }
                    if (var607 == 25) {
                        int var12 = var6[var4];
                        field3751[var2++] = class181.method955(var12, (byte) 35);
                        continue;
                    }
                    if (var607 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class176.method927((byte) -125, var13, field3751[var2]);
                        continue;
                    }
                    if (var607 == 31) {
                        var2 -= 2;
                        if (field3751[var2] <= field3751[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 32) {
                        var2 -= 2;
                        if (field3751[var2] >= field3751[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 33) {
                        field3751[var2++] = field3740[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var607 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field3740[var10001] = field3751[var2];
                        continue;
                    }
                    if (var607 == 35) {
                        field3741[var3++] = field3750[var6[var4]];
                        continue;
                    }
                    if (var607 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field3750[var10001] = field3741[var3];
                        continue;
                    }
                    if (var607 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class366.method2219(field3741, var3, (byte) 86, var14);
                        field3741[var3++] = var15;
                        continue;
                    }
                    if (var607 == 38) {
                        var2--;
                        continue;
                    }
                    if (var607 == 39) {
                        var3--;
                        continue;
                    }
                    if (var607 == 40) {
                        int var16 = var6[var4];
                        class451 var17 = class108.method572((byte) -2, var16);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field6559];
                        String[] var19 = new String[var17.field6557];
                        for (int var20 = 0; var20 < var17.field6562; var20++) {
                            var18[var20] = field3751[var2 + var20 - var17.field6562];
                        }
                        for (int var21 = 0; var21 < var17.field6558; var21++) {
                            var19[var21] = field3741[var3 + var21 - var17.field6558];
                        }
                        var2 -= var17.field6562;
                        var3 -= var17.field6558;
                        class177 var22 = new class177();
                        var22.field2212 = arg0;
                        var22.field2213 = var4;
                        var22.field2222 = field3740;
                        var22.field2218 = field3750;
                        if (field3745 >= field3748.length) {
                            throw new RuntimeException();
                        }
                        field3748[field3745++] = var22;
                        arg0 = var17;
                        var5 = var17.field6565;
                        var6 = var17.field6555;
                        var4 = -1;
                        field3740 = var18;
                        field3750 = var19;
                        continue;
                    }
                    if (var607 == 42) {
                        field3751[var2++] = class142.field1810[var6[var4]];
                        continue;
                    }
                    if (var607 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class142.field1810[var23] = field3751[var2];
                        class396.method2479(-76, var23);
                        class293.field3988 |= class279.field3799[var23];
                        continue;
                    }
                    if (var607 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field3751[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field3747[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4411;
                                }
                                field3753[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var607 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field3751[var2];
                        if (var30 >= 0 && var30 < field3747[var29]) {
                            field3751[var2++] = field3753[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var607 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field3751[var2];
                        if (var32 >= 0 && var32 < field3747[var31]) {
                            field3753[var31][var32] = field3751[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var607 == 47) {
                        String var33 = class321.field4298[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field3741[var3++] = var33;
                        continue;
                    }
                    if (var607 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class321.field4298[var34] = field3741[var3];
                        class177.method931(var34, (byte) -102);
                        continue;
                    }
                    if (var607 == 51) {
                        class58 var35 = arg0.field6560[var6[var4]];
                        var2--;
                        class310 var36 = (class310) var35.method308((long) field3751[var2], (byte) -123);
                        if (var36 != null) {
                            var4 += var36.field4186;
                        }
                        continue;
                    }
                }
                boolean var37;
                if (var6[var4] == 1) {
                    var37 = true;
                } else {
                    var37 = false;
                }
                if (var607 < 300) {
                    if (var607 == 100) {
                        var2 -= 3;
                        int var38 = field3751[var2];
                        int var39 = field3751[var2 + 1];
                        int var40 = field3751[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class194 var41 = class57.method301(var38, (byte) 110);
                        if (var41.field2620 == null) {
                            var41.field2620 = new class194[var40 + 1];
                        }
                        if (var41.field2620.length <= var40) {
                            class194[] var42 = new class194[var40 + 1];
                            for (int var43 = 0; var43 < var41.field2620.length; var43++) {
                                var42[var43] = var41.field2620[var43];
                            }
                            var41.field2620 = var42;
                        }
                        if (var40 > 0 && var41.field2620[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class194 var44 = new class194();
                        var44.field2492 = var39;
                        var44.field2470 = var44.field2502 = var41.field2502;
                        var44.field2542 = var40;
                        var44.field2575 = true;
                        var41.field2620[var40] = var44;
                        if (var37) {
                            field3735 = var44;
                        } else {
                            field3746 = var44;
                        }
                        class204.method1107(var41, (byte) -97);
                        continue;
                    }
                    if (var607 == 101) {
                        class194 var45 = var37 ? field3735 : field3746;
                        if (var45.field2542 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class194 var46 = class57.method301(var45.field2502, (byte) 109);
                        var46.field2620[var45.field2542] = null;
                        class204.method1107(var46, (byte) -119);
                        continue;
                    }
                    if (var607 == 102) {
                        var2--;
                        class194 var47 = class57.method301(field3751[var2], (byte) 88);
                        var47.field2620 = null;
                        class204.method1107(var47, (byte) -97);
                        continue;
                    }
                    if (var607 == 200) {
                        var2 -= 2;
                        int var48 = field3751[var2];
                        int var49 = field3751[var2 + 1];
                        class194 var50 = class142.method769(-1, var49, var48);
                        if (var50 != null && var49 != -1) {
                            field3751[var2++] = 1;
                            if (var37) {
                                field3735 = var50;
                            } else {
                                field3746 = var50;
                            }
                            continue;
                        }
                        field3751[var2++] = 0;
                        continue;
                    }
                    if (var607 == 201) {
                        var2--;
                        int var51 = field3751[var2];
                        class194 var52 = class57.method301(var51, (byte) 73);
                        if (var52 == null) {
                            field3751[var2++] = 0;
                        } else {
                            field3751[var2++] = 1;
                            if (var37) {
                                field3735 = var52;
                            } else {
                                field3746 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var607 < 500) {
                    if (var607 == 403) {
                        var2 -= 2;
                        int var53 = field3751[var2];
                        int var54 = field3751[var2 + 1];
                        for (int var55 = 0; var55 < class308.field4172.length; var55++) {
                            if (class308.field4172[var55] == var53) {
                                class427.field6264.field2017.method1913(0, var55, var54);
                                continue label4411;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class419.field6088.length) {
                                continue label4411;
                            }
                            if (class419.field6088[var56] == var53) {
                                class427.field6264.field2017.method1913(0, var56, var54);
                                continue label4411;
                            }
                            var56++;
                        }
                    }
                    if (var607 == 404) {
                        var2 -= 2;
                        int var57 = field3751[var2];
                        int var58 = field3751[var2 + 1];
                        class427.field6264.field2017.method1908(1, var58, var57);
                        continue;
                    }
                    if (var607 == 410) {
                        var2--;
                        boolean var59 = field3751[var2] != 0;
                        class427.field6264.field2017.method1916(var59, (byte) -85);
                        continue;
                    }
                } else if (var607 >= 1000 && var607 < 1100 || var607 >= 2000 && var607 < 2100) {
                    class194 var60;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var60 = class57.method301(field3751[var2], (byte) 119);
                    } else {
                        var60 = var37 ? field3735 : field3746;
                    }
                    if (var607 == 1000) {
                        var2 -= 4;
                        var60.field2447 = field3751[var2];
                        var60.field2457 = field3751[var2 + 1];
                        int var61 = field3751[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field3751[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field2498 = (byte) var61;
                        var60.field2570 = (byte) var62;
                        class204.method1107(var60, (byte) -91);
                        class384.method2384((byte) -110, var60);
                        if (var60.field2542 == -1) {
                            class129.method696(var60.field2502, 11);
                        }
                        continue;
                    }
                    if (var607 == 1001) {
                        var2 -= 4;
                        var60.field2495 = field3751[var2];
                        var60.field2450 = field3751[var2 + 1];
                        var60.field2626 = 0;
                        var60.field2588 = 0;
                        int var63 = field3751[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field3751[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field2619 = (byte) var63;
                        var60.field2606 = (byte) var64;
                        class204.method1107(var60, (byte) -121);
                        class384.method2384((byte) -108, var60);
                        if (var60.field2492 == 0) {
                            class420.method2615((byte) -74, false, var60);
                        }
                        continue;
                    }
                    if (var607 == 1003) {
                        var2--;
                        boolean var65 = field3751[var2] == 1;
                        if (var60.field2494 != var65) {
                            var60.field2494 = var65;
                            class204.method1107(var60, (byte) -121);
                        }
                        if (var60.field2542 == -1) {
                            class300.method1773(true, var60.field2502);
                        }
                        continue;
                    }
                    if (var607 == 1004) {
                        var2 -= 2;
                        var60.field2509 = field3751[var2];
                        var60.field2469 = field3751[var2 + 1];
                        class204.method1107(var60, (byte) -102);
                        class384.method2384((byte) -121, var60);
                        if (var60.field2492 == 0) {
                            class420.method2615((byte) -88, false, var60);
                        }
                        continue;
                    }
                    if (var607 == 1005) {
                        var2--;
                        var60.field2550 = field3751[var2] == 1;
                        continue;
                    }
                } else if (var607 >= 1100 && var607 < 1200 || var607 >= 2100 && var607 < 2200) {
                    class194 var66;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var66 = class57.method301(field3751[var2], (byte) 64);
                    } else {
                        var66 = var37 ? field3735 : field3746;
                    }
                    if (var607 == 1100) {
                        var2 -= 2;
                        var66.field2522 = field3751[var2];
                        if (var66.field2522 > var66.field2528 - var66.field2501) {
                            var66.field2522 = var66.field2528 - var66.field2501;
                        }
                        if (var66.field2522 < 0) {
                            var66.field2522 = 0;
                        }
                        var66.field2565 = field3751[var2 + 1];
                        if (var66.field2565 > var66.field2445 - var66.field2460) {
                            var66.field2565 = var66.field2445 - var66.field2460;
                        }
                        if (var66.field2565 < 0) {
                            var66.field2565 = 0;
                        }
                        class204.method1107(var66, (byte) -92);
                        if (var66.field2542 == -1) {
                            class161.method868((byte) 29, var66.field2502);
                        }
                        continue;
                    }
                    if (var607 == 1101) {
                        var2--;
                        var66.field2563 = field3751[var2];
                        class204.method1107(var66, (byte) -91);
                        if (var66.field2542 == -1) {
                            class429.method2654(var66.field2502, -126);
                        }
                        continue;
                    }
                    if (var607 == 1102) {
                        var2--;
                        var66.field2580 = field3751[var2] == 1;
                        class204.method1107(var66, (byte) -90);
                        continue;
                    }
                    if (var607 == 1103) {
                        var2--;
                        var66.field2537 = field3751[var2];
                        class204.method1107(var66, (byte) -93);
                        continue;
                    }
                    if (var607 == 1104) {
                        var2--;
                        var66.field2601 = field3751[var2];
                        class204.method1107(var66, (byte) -124);
                        continue;
                    }
                    if (var607 == 1105) {
                        var2--;
                        int var67 = field3751[var2];
                        if (var66.field2603 != var67) {
                            var66.field2603 = var67;
                            class204.method1107(var66, (byte) -99);
                        }
                        if (var66.field2542 == -1) {
                            class422.method2630(false, var66.field2502);
                        }
                        continue;
                    }
                    if (var607 == 1106) {
                        var2--;
                        var66.field2517 = field3751[var2];
                        class204.method1107(var66, (byte) -100);
                        continue;
                    }
                    if (var607 == 1107) {
                        var2--;
                        var66.field2480 = field3751[var2] == 1;
                        class204.method1107(var66, (byte) -117);
                        continue;
                    }
                    if (var607 == 1108) {
                        var66.field2444 = 1;
                        var2--;
                        var66.field2599 = field3751[var2];
                        class204.method1107(var66, (byte) -90);
                        if (var66.field2542 == -1) {
                            class46.method213(-24091, var66.field2502);
                        }
                        continue;
                    }
                    if (var607 == 1109) {
                        var2 -= 6;
                        var66.field2548 = field3751[var2];
                        var66.field2448 = field3751[var2 + 1];
                        var66.field2479 = field3751[var2 + 2];
                        var66.field2583 = field3751[var2 + 3];
                        var66.field2557 = field3751[var2 + 4];
                        var66.field2598 = field3751[var2 + 5];
                        class204.method1107(var66, (byte) -112);
                        if (var66.field2542 == -1) {
                            class97.method531(var66.field2502, 35);
                            class260.method1452(-7825, var66.field2502);
                        }
                        continue;
                    }
                    if (var607 == 1110) {
                        var2--;
                        int var68 = field3751[var2];
                        if (var66.field2516 != var68) {
                            var66.field2516 = var68;
                            var66.field2463 = 0;
                            var66.field2486 = 1;
                            var66.field2508 = 0;
                            class204.method1107(var66, (byte) -115);
                        }
                        if (var66.field2542 == -1) {
                            class236.method1279((byte) 105, var66.field2502);
                        }
                        continue;
                    }
                    if (var607 == 1111) {
                        var2--;
                        var66.field2612 = field3751[var2] == 1;
                        class204.method1107(var66, (byte) -91);
                        continue;
                    }
                    if (var607 == 1112) {
                        var3--;
                        String var69 = field3741[var3];
                        if (!var69.equals(var66.field2569)) {
                            var66.field2569 = var69;
                            class204.method1107(var66, (byte) -101);
                        }
                        if (var66.field2542 == -1) {
                            class3.method14(var66.field2502, 30787);
                        }
                        continue;
                    }
                    if (var607 == 1113) {
                        var2--;
                        var66.field2451 = field3751[var2];
                        class204.method1107(var66, (byte) -105);
                        continue;
                    }
                    if (var607 == 1114) {
                        var2 -= 3;
                        var66.field2560 = field3751[var2];
                        var66.field2591 = field3751[var2 + 1];
                        var66.field2483 = field3751[var2 + 2];
                        class204.method1107(var66, (byte) -118);
                        continue;
                    }
                    if (var607 == 1115) {
                        var2--;
                        var66.field2541 = field3751[var2] == 1;
                        class204.method1107(var66, (byte) -122);
                        continue;
                    }
                    if (var607 == 1116) {
                        var2--;
                        var66.field2523 = field3751[var2];
                        class204.method1107(var66, (byte) -118);
                        continue;
                    }
                    if (var607 == 1117) {
                        var2--;
                        var66.field2590 = field3751[var2];
                        class204.method1107(var66, (byte) -96);
                        continue;
                    }
                    if (var607 == 1118) {
                        var2--;
                        var66.field2524 = field3751[var2] == 1;
                        class204.method1107(var66, (byte) -124);
                        continue;
                    }
                    if (var607 == 1119) {
                        var2--;
                        var66.field2459 = field3751[var2] == 1;
                        class204.method1107(var66, (byte) -109);
                        continue;
                    }
                    if (var607 == 1120) {
                        var2 -= 2;
                        var66.field2528 = field3751[var2];
                        var66.field2445 = field3751[var2 + 1];
                        class204.method1107(var66, (byte) -124);
                        if (var66.field2492 == 0) {
                            class420.method2615((byte) -73, false, var66);
                        }
                        continue;
                    }
                    if (var607 == 1121) {
                        var2 -= 2;
                        var66.field2617 = (short) field3751[var2];
                        var66.field2605 = (short) field3751[var2 + 1];
                        class204.method1107(var66, (byte) -99);
                        continue;
                    }
                    if (var607 == 1122) {
                        var2--;
                        var66.field2490 = field3751[var2] == 1;
                        class204.method1107(var66, (byte) -105);
                        continue;
                    }
                    if (var607 == 1123) {
                        var2--;
                        var66.field2598 = field3751[var2];
                        class204.method1107(var66, (byte) -93);
                        if (var66.field2542 == -1) {
                            class97.method531(var66.field2502, -114);
                        }
                        continue;
                    }
                    if (var607 == 1124) {
                        var2--;
                        int var70 = field3751[var2];
                        var66.field2513 = var70 == 1;
                        class204.method1107(var66, (byte) -114);
                        continue;
                    }
                    if (var607 == 1125) {
                        var2 -= 2;
                        var66.field2476 = field3751[var2];
                        var66.field2543 = field3751[var2 + 1];
                        class204.method1107(var66, (byte) -103);
                        continue;
                    }
                } else if (!(var607 < 1200 || var607 >= 1300) || !(var607 < 2200 || var607 >= 2300)) {
                    class194 var71;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var71 = class57.method301(field3751[var2], (byte) 69);
                    } else {
                        var71 = var37 ? field3735 : field3746;
                    }
                    class204.method1107(var71, (byte) -100);
                    if (var607 == 1200 || var607 == 1205 || var607 == 1208 || var607 == 1209 || var607 == 1212 || var607 == 1213) {
                        var2 -= 2;
                        int var72 = field3751[var2];
                        int var73 = field3751[var2 + 1];
                        if (var71.field2542 == -1) {
                            class292.method1720(var71.field2502, 0);
                            class97.method531(var71.field2502, -116);
                            class260.method1452(-7825, var71.field2502);
                        }
                        if (var72 == -1) {
                            var71.field2444 = 1;
                            var71.field2599 = -1;
                            var71.field2507 = -1;
                            continue;
                        }
                        var71.field2507 = var72;
                        var71.field2461 = var73;
                        if (var607 == 1208 || var607 == 1209) {
                            var71.field2515 = true;
                        } else {
                            var71.field2515 = false;
                        }
                        class123 var74 = class65.method368(var72, -118);
                        var71.field2479 = var74.field1535;
                        var71.field2583 = var74.field1528;
                        var71.field2557 = var74.field1555;
                        var71.field2548 = var74.field1585;
                        var71.field2448 = var74.field1564;
                        var71.field2598 = var74.field1533;
                        if (var607 == 1205 || var607 == 1209) {
                            var71.field2466 = 0;
                        } else if (var607 == 1212 || var607 == 1213) {
                            var71.field2466 = 1;
                        } else {
                            var71.field2466 = 2;
                        }
                        if (var71.field2626 > 0) {
                            var71.field2598 = var71.field2598 * 32 / var71.field2626;
                        } else if (var71.field2495 > 0) {
                            var71.field2598 = var71.field2598 * 32 / var71.field2495;
                        }
                        continue;
                    }
                    if (var607 == 1201) {
                        var71.field2444 = 2;
                        var2--;
                        var71.field2599 = field3751[var2];
                        if (var71.field2542 == -1) {
                            class46.method213(-24091, var71.field2502);
                        }
                        continue;
                    }
                    if (var607 == 1202) {
                        var71.field2444 = 3;
                        var71.field2599 = -1;
                        if (var71.field2542 == -1) {
                            class46.method213(-24091, var71.field2502);
                        }
                        continue;
                    }
                    if (var607 == 1203) {
                        var71.field2444 = 6;
                        var2--;
                        var71.field2599 = field3751[var2];
                        if (var71.field2542 == -1) {
                            class46.method213(-24091, var71.field2502);
                        }
                        continue;
                    }
                    if (var607 == 1204) {
                        var71.field2444 = 5;
                        var2--;
                        var71.field2599 = field3751[var2];
                        if (var71.field2542 == -1) {
                            class46.method213(-24091, var71.field2502);
                        }
                        continue;
                    }
                    if (var607 == 1206) {
                        var2 -= 4;
                        var71.field2576 = field3751[var2];
                        var71.field2491 = field3751[var2 + 1];
                        var71.field2596 = field3751[var2 + 2];
                        var71.field2452 = field3751[var2 + 3];
                        class204.method1107(var71, (byte) -95);
                        continue;
                    }
                    if (var607 == 1207) {
                        var2 -= 2;
                        var71.field2627 = field3751[var2];
                        var71.field2594 = field3751[var2 + 1];
                        class204.method1107(var71, (byte) -100);
                        continue;
                    }
                    if (var607 == 1210) {
                        var2 -= 4;
                        var71.field2599 = field3751[var2];
                        var71.field2487 = field3751[var2 + 1];
                        if (field3751[var2 + 2] == 1) {
                            var71.field2444 = 9;
                        } else {
                            var71.field2444 = 8;
                        }
                        if (field3751[var2 + 3] == 1) {
                            var71.field2515 = true;
                        } else {
                            var71.field2515 = false;
                        }
                        if (var71.field2542 == -1) {
                            class46.method213(-24091, var71.field2502);
                        }
                        continue;
                    }
                    if (var607 == 1211) {
                        var71.field2444 = 5;
                        var71.field2599 = 2047;
                        var71.field2487 = 0;
                        if (var71.field2542 == -1) {
                            class46.method213(-24091, var71.field2502);
                        }
                        continue;
                    }
                } else if ((var607 < 1300 || var607 >= 1400) && (var607 < 2300 || var607 >= 2400)) {
                    if (var607 >= 1400 && var607 < 1500 || var607 >= 2400 && var607 < 2500) {
                        class194 var81;
                        if (var607 >= 2000) {
                            var607 -= 1000;
                            var2--;
                            var81 = class57.method301(field3751[var2], (byte) 100);
                        } else {
                            var81 = var37 ? field3735 : field3746;
                        }
                        var3--;
                        String var82 = field3741[var3];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var2--;
                            int var84 = field3751[var2];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var2--;
                                    var83[var84] = field3751[var2];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var3--;
                                var85[var86] = field3741[var3];
                            } else {
                                var2--;
                                var85[var86] = Integer.valueOf(field3751[var2]);
                            }
                        }
                        var2--;
                        int var87 = field3751[var2];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var607 == 1400) {
                            var81.field2607 = var85;
                        } else if (var607 == 1401) {
                            var81.field2566 = var85;
                        } else if (var607 == 1402) {
                            var81.field2623 = var85;
                        } else if (var607 == 1403) {
                            var81.field2625 = var85;
                        } else if (var607 == 1404) {
                            var81.field2592 = var85;
                        } else if (var607 == 1405) {
                            var81.field2539 = var85;
                        } else if (var607 == 1406) {
                            var81.field2616 = var85;
                        } else if (var607 == 1407) {
                            var81.field2496 = var85;
                            var81.field2622 = var83;
                        } else if (var607 == 1408) {
                            var81.field2504 = var85;
                        } else if (var607 == 1409) {
                            var81.field2526 = var85;
                        } else if (var607 == 1410) {
                            var81.field2477 = var85;
                        } else if (var607 == 1411) {
                            var81.field2608 = var85;
                        } else if (var607 == 1412) {
                            var81.field2505 = var85;
                        } else if (var607 == 1414) {
                            var81.field2577 = var85;
                            var81.field2600 = var83;
                        } else if (var607 == 1415) {
                            var81.field2530 = var85;
                            var81.field2567 = var83;
                        } else if (var607 == 1416) {
                            var81.field2558 = var85;
                        } else if (var607 == 1417) {
                            var81.field2573 = var85;
                        } else if (var607 == 1418) {
                            var81.field2586 = var85;
                        } else if (var607 == 1419) {
                            var81.field2547 = var85;
                        } else if (var607 == 1420) {
                            var81.field2581 = var85;
                        } else if (var607 == 1421) {
                            var81.field2471 = var85;
                        } else if (var607 == 1422) {
                            var81.field2621 = var85;
                        } else if (var607 == 1423) {
                            var81.field2458 = var85;
                        } else if (var607 == 1424) {
                            var81.field2497 = var85;
                        } else if (var607 == 1425) {
                            var81.field2568 = var85;
                        } else if (var607 == 1426) {
                            var81.field2472 = var85;
                        } else if (var607 == 1427) {
                            var81.field2546 = var85;
                        } else if (var607 == 1428) {
                            var81.field2462 = var85;
                            var81.field2510 = var83;
                        } else if (var607 == 1429) {
                            var81.field2503 = var85;
                            var81.field2529 = var83;
                        }
                        var81.field2574 = true;
                        continue;
                    }
                    if (var607 < 1600) {
                        class194 var88 = var37 ? field3735 : field3746;
                        if (var607 == 1500) {
                            field3751[var2++] = var88.field2562;
                            continue;
                        }
                        if (var607 == 1501) {
                            field3751[var2++] = var88.field2553;
                            continue;
                        }
                        if (var607 == 1502) {
                            field3751[var2++] = var88.field2501;
                            continue;
                        }
                        if (var607 == 1503) {
                            field3751[var2++] = var88.field2460;
                            continue;
                        }
                        if (var607 == 1504) {
                            field3751[var2++] = var88.field2494 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 1505) {
                            field3751[var2++] = var88.field2470;
                            continue;
                        }
                    } else if (var607 < 1700) {
                        class194 var89 = var37 ? field3735 : field3746;
                        if (var607 == 1600) {
                            field3751[var2++] = var89.field2522;
                            continue;
                        }
                        if (var607 == 1601) {
                            field3751[var2++] = var89.field2565;
                            continue;
                        }
                        if (var607 == 1602) {
                            field3741[var3++] = var89.field2569;
                            continue;
                        }
                        if (var607 == 1603) {
                            field3751[var2++] = var89.field2528;
                            continue;
                        }
                        if (var607 == 1604) {
                            field3751[var2++] = var89.field2445;
                            continue;
                        }
                        if (var607 == 1605) {
                            field3751[var2++] = var89.field2598;
                            continue;
                        }
                        if (var607 == 1606) {
                            field3751[var2++] = var89.field2479;
                            continue;
                        }
                        if (var607 == 1607) {
                            field3751[var2++] = var89.field2557;
                            continue;
                        }
                        if (var607 == 1608) {
                            field3751[var2++] = var89.field2583;
                            continue;
                        }
                        if (var607 == 1609) {
                            field3751[var2++] = var89.field2537;
                            continue;
                        }
                        if (var607 == 1610) {
                            field3751[var2++] = var89.field2548;
                            continue;
                        }
                        if (var607 == 1611) {
                            field3751[var2++] = var89.field2448;
                            continue;
                        }
                        if (var607 == 1612) {
                            field3751[var2++] = var89.field2603;
                            continue;
                        }
                    } else if (var607 < 1800) {
                        class194 var90 = var37 ? field3735 : field3746;
                        if (var607 == 1700) {
                            field3751[var2++] = var90.field2507;
                            continue;
                        }
                        if (var607 == 1701) {
                            if (var90.field2507 == -1) {
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = var90.field2461;
                            }
                            continue;
                        }
                        if (var607 == 1702) {
                            field3751[var2++] = var90.field2542;
                            continue;
                        }
                    } else if (var607 < 1900) {
                        class194 var91 = var37 ? field3735 : field3746;
                        if (var607 == 1800) {
                            field3751[var2++] = client.method1410(var91).method1180((byte) 88);
                            continue;
                        }
                        if (var607 == 1801) {
                            var2--;
                            int var92 = field3751[var2];
                            int var608 = var92 - 1;
                            if (var91.field2481 != null && var608 < var91.field2481.length && var91.field2481[var608] != null) {
                                field3741[var3++] = var91.field2481[var608];
                                continue;
                            }
                            field3741[var3++] = "";
                            continue;
                        }
                        if (var607 == 1802) {
                            if (var91.field2535 == null) {
                                field3741[var3++] = "";
                            } else {
                                field3741[var3++] = var91.field2535;
                            }
                            continue;
                        }
                    } else if (var607 < 2600) {
                        var2--;
                        class194 var93 = class57.method301(field3751[var2], (byte) 101);
                        if (var607 == 2500) {
                            field3751[var2++] = var93.field2562;
                            continue;
                        }
                        if (var607 == 2501) {
                            field3751[var2++] = var93.field2553;
                            continue;
                        }
                        if (var607 == 2502) {
                            field3751[var2++] = var93.field2501;
                            continue;
                        }
                        if (var607 == 2503) {
                            field3751[var2++] = var93.field2460;
                            continue;
                        }
                        if (var607 == 2504) {
                            field3751[var2++] = var93.field2494 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 2505) {
                            field3751[var2++] = var93.field2470;
                            continue;
                        }
                    } else if (var607 < 2700) {
                        var2--;
                        class194 var94 = class57.method301(field3751[var2], (byte) 83);
                        if (var607 == 2600) {
                            field3751[var2++] = var94.field2522;
                            continue;
                        }
                        if (var607 == 2601) {
                            field3751[var2++] = var94.field2565;
                            continue;
                        }
                        if (var607 == 2602) {
                            field3741[var3++] = var94.field2569;
                            continue;
                        }
                        if (var607 == 2603) {
                            field3751[var2++] = var94.field2528;
                            continue;
                        }
                        if (var607 == 2604) {
                            field3751[var2++] = var94.field2445;
                            continue;
                        }
                        if (var607 == 2605) {
                            field3751[var2++] = var94.field2598;
                            continue;
                        }
                        if (var607 == 2606) {
                            field3751[var2++] = var94.field2479;
                            continue;
                        }
                        if (var607 == 2607) {
                            field3751[var2++] = var94.field2557;
                            continue;
                        }
                        if (var607 == 2608) {
                            field3751[var2++] = var94.field2583;
                            continue;
                        }
                        if (var607 == 2609) {
                            field3751[var2++] = var94.field2537;
                            continue;
                        }
                        if (var607 == 2610) {
                            field3751[var2++] = var94.field2548;
                            continue;
                        }
                        if (var607 == 2611) {
                            field3751[var2++] = var94.field2448;
                            continue;
                        }
                        if (var607 == 2612) {
                            field3751[var2++] = var94.field2603;
                            continue;
                        }
                    } else if (var607 < 2800) {
                        if (var607 == 2700) {
                            var2--;
                            class194 var95 = class57.method301(field3751[var2], (byte) 110);
                            field3751[var2++] = var95.field2507;
                            continue;
                        }
                        if (var607 == 2701) {
                            var2--;
                            class194 var96 = class57.method301(field3751[var2], (byte) 114);
                            if (var96.field2507 == -1) {
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = var96.field2461;
                            }
                            continue;
                        }
                        if (var607 == 2702) {
                            var2--;
                            int var97 = field3751[var2];
                            class141 var98 = (class141) class337.field4495.method308((long) var97, (byte) -112);
                            if (var98 == null) {
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = 1;
                            }
                            continue;
                        }
                        if (var607 == 2703) {
                            var2--;
                            class194 var99 = class57.method301(field3751[var2], (byte) 125);
                            if (var99.field2620 == null) {
                                field3751[var2++] = 0;
                                continue;
                            }
                            int var100 = var99.field2620.length;
                            for (int var101 = 0; var101 < var99.field2620.length; var101++) {
                                if (var99.field2620[var101] == null) {
                                    var100 = var101;
                                    break;
                                }
                            }
                            field3751[var2++] = var100;
                            continue;
                        }
                        if (var607 == 2704 || var607 == 2705) {
                            var2 -= 2;
                            int var102 = field3751[var2];
                            int var103 = field3751[var2 + 1];
                            class141 var104 = (class141) class337.field4495.method308((long) var102, (byte) 67);
                            if (var104 != null && var104.field1802 == var103) {
                                field3751[var2++] = 1;
                                continue;
                            }
                            field3751[var2++] = 0;
                            continue;
                        }
                    } else if (var607 < 2900) {
                        var2--;
                        class194 var105 = class57.method301(field3751[var2], (byte) 74);
                        if (var607 == 2800) {
                            field3751[var2++] = client.method1410(var105).method1180((byte) 88);
                            continue;
                        }
                        if (var607 == 2801) {
                            var2--;
                            int var106 = field3751[var2];
                            int var609 = var106 - 1;
                            if (var105.field2481 != null && var609 < var105.field2481.length && var105.field2481[var609] != null) {
                                field3741[var3++] = var105.field2481[var609];
                                continue;
                            }
                            field3741[var3++] = "";
                            continue;
                        }
                        if (var607 == 2802) {
                            if (var105.field2535 == null) {
                                field3741[var3++] = "";
                            } else {
                                field3741[var3++] = var105.field2535;
                            }
                            continue;
                        }
                    } else if (var607 < 3200) {
                        if (var607 == 3100) {
                            var3--;
                            String var107 = field3741[var3];
                            class371.method2240(var107, -94);
                            continue;
                        }
                        if (var607 == 3101) {
                            var2 -= 2;
                            class390.method2424(class427.field6264, (byte) -64, field3751[var2], field3751[var2 + 1]);
                            continue;
                        }
                        if (var607 == 3103) {
                            class248.method1320((byte) -106, true);
                            continue;
                        }
                        if (var607 == 3104) {
                            var3--;
                            String var108 = field3741[var3];
                            int var109 = 0;
                            if (class125.method672(true, var108)) {
                                var109 = class359.method2196((byte) 104, var108);
                            }
                            field3739++;
                            class281.field3857.method295(20579, 107);
                            class281.field3857.method1357(var109, 1826838072);
                            continue;
                        }
                        if (var607 == 3105) {
                            var3--;
                            String var110 = field3741[var3];
                            field3736++;
                            class281.field3857.method295(20579, 140);
                            class281.field3857.method1386(-222840624, var110.length() + 1);
                            class281.field3857.method1343(var110, 22608);
                            continue;
                        }
                        if (var607 == 3106) {
                            var3--;
                            String var111 = field3741[var3];
                            field3749++;
                            class281.field3857.method295(20579, 103);
                            class281.field3857.method1386(-222840624, var111.length() + 1);
                            class281.field3857.method1343(var111, 22608);
                            continue;
                        }
                        if (var607 == 3107) {
                            var2--;
                            int var112 = field3751[var2];
                            var3--;
                            String var113 = field3741[var3];
                            class211.method1143(var113, 212, var112);
                            continue;
                        }
                        if (var607 == 3108) {
                            var2 -= 3;
                            int var114 = field3751[var2];
                            int var115 = field3751[var2 + 1];
                            int var116 = field3751[var2 + 2];
                            class194 var117 = class57.method301(var116, (byte) 61);
                            class307.method1802(var114, var117, -13416, var115);
                            continue;
                        }
                        if (var607 == 3109) {
                            var2 -= 2;
                            int var118 = field3751[var2];
                            int var119 = field3751[var2 + 1];
                            class194 var120 = var37 ? field3735 : field3746;
                            class307.method1802(var118, var120, -13416, var119);
                            continue;
                        }
                        if (var607 == 3110) {
                            var2--;
                            int var121 = field3751[var2];
                            field3742++;
                            class281.field3857.method295(20579, 156);
                            class281.field3857.method1346(120, var121);
                            continue;
                        }
                        if (var607 == 3111) {
                            var2 -= 2;
                            int var122 = field3751[var2];
                            int var123 = field3751[var2 + 1];
                            class141 var124 = (class141) class337.field4495.method308((long) var122, (byte) -121);
                            if (var124 != null) {
                                class89.method494(true, var124, var124.field1802 != var123, false);
                            }
                            class383.method2375(var123, true, 3, (byte) 101, var122);
                            continue;
                        }
                        if (var607 == 3112) {
                            var2--;
                            int var125 = field3751[var2];
                            class141 var126 = (class141) class337.field4495.method308((long) var125, (byte) -93);
                            if (var126 != null && var126.field1803 == 3) {
                                class89.method494(true, var126, true, false);
                            }
                            continue;
                        }
                    } else if (var607 < 3300) {
                        if (var607 == 3200) {
                            var2 -= 3;
                            class166.method884(field3751[var2], field3751[var2 + 2], -113, 255, field3751[var2 + 1]);
                            continue;
                        }
                        if (var607 == 3201) {
                            var2--;
                            class83.method455(89, field3751[var2], 255);
                            continue;
                        }
                        if (var607 == 3202) {
                            var2 -= 2;
                            class112.method598(255, field3751[var2], field3751[var2 + 1], 0);
                            continue;
                        }
                    } else if (var607 < 3400) {
                        if (var607 == 3300) {
                            field3751[var2++] = class234.field3224;
                            continue;
                        }
                        if (var607 == 3301) {
                            var2 -= 2;
                            int var127 = field3751[var2];
                            int var128 = field3751[var2 + 1];
                            field3751[var2++] = class23.method122(-104, var128, var127);
                            continue;
                        }
                        if (var607 == 3302) {
                            var2 -= 2;
                            int var129 = field3751[var2];
                            int var130 = field3751[var2 + 1];
                            field3751[var2++] = class231.method1254(var130, (byte) 64, var129);
                            continue;
                        }
                        if (var607 == 3303) {
                            var2 -= 2;
                            int var131 = field3751[var2];
                            int var132 = field3751[var2 + 1];
                            field3751[var2++] = class305.method1791(var132, var131, (byte) 28);
                            continue;
                        }
                        if (var607 == 3304) {
                            var2--;
                            int var133 = field3751[var2];
                            field3751[var2++] = class229.method1245(false, var133).field5993;
                            continue;
                        }
                        if (var607 == 3305) {
                            var2--;
                            int var134 = field3751[var2];
                            field3751[var2++] = class198.field2653[var134];
                            continue;
                        }
                        if (var607 == 3306) {
                            var2--;
                            int var135 = field3751[var2];
                            field3751[var2++] = class342.field4580[var135];
                            continue;
                        }
                        if (var607 == 3307) {
                            var2--;
                            int var136 = field3751[var2];
                            field3751[var2++] = class232.field3199[var136];
                            continue;
                        }
                        if (var607 == 3308) {
                            int var137 = class263.field3592;
                            int var138 = (class427.field6264.field152 >> 7) + class70.field767;
                            int var139 = (class427.field6264.field154 >> 7) + class291.field3961;
                            field3751[var2++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var607 == 3309) {
                            var2--;
                            int var140 = field3751[var2];
                            field3751[var2++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var607 == 3310) {
                            var2--;
                            int var141 = field3751[var2];
                            field3751[var2++] = var141 >> 28;
                            continue;
                        }
                        if (var607 == 3311) {
                            var2--;
                            int var142 = field3751[var2];
                            field3751[var2++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var607 == 3312) {
                            field3751[var2++] = class21.field210 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3313) {
                            var2 -= 2;
                            int var143 = field3751[var2] + 32768;
                            int var144 = field3751[var2 + 1];
                            field3751[var2++] = class23.method122(-108, var144, var143);
                            continue;
                        }
                        if (var607 == 3314) {
                            var2 -= 2;
                            int var145 = field3751[var2] + 32768;
                            int var146 = field3751[var2 + 1];
                            field3751[var2++] = class231.method1254(var146, (byte) 81, var145);
                            continue;
                        }
                        if (var607 == 3315) {
                            var2 -= 2;
                            int var147 = field3751[var2] + 32768;
                            int var148 = field3751[var2 + 1];
                            field3751[var2++] = class305.method1791(var148, var147, (byte) 28);
                            continue;
                        }
                        if (var607 == 3316) {
                            if (class110.field1357 >= 2) {
                                field3751[var2++] = class110.field1357;
                            } else {
                                field3751[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 3317) {
                            field3751[var2++] = class422.field6188;
                            continue;
                        }
                        if (var607 == 3318) {
                            field3751[var2++] = class281.field3854;
                            continue;
                        }
                        if (var607 == 3321) {
                            field3751[var2++] = class418.field6008;
                            continue;
                        }
                        if (var607 == 3322) {
                            field3751[var2++] = class194.field2587;
                            continue;
                        }
                        if (var607 == 3323) {
                            if (class177.field2215 >= 5 && class177.field2215 <= 9) {
                                field3751[var2++] = 1;
                                continue;
                            }
                            field3751[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3324) {
                            if (class177.field2215 >= 5 && class177.field2215 <= 9) {
                                field3751[var2++] = class177.field2215;
                                continue;
                            }
                            field3751[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3325) {
                            field3751[var2++] = class244.field3326 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3326) {
                            field3751[var2++] = class427.field6264.field2022;
                            continue;
                        }
                        if (var607 == 3327) {
                            field3751[var2++] = class427.field6264.field2017.field4447 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3328) {
                            field3751[var2++] = class142.field1814 && !class342.field4576 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3329) {
                            field3751[var2++] = class374.field5268 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3330) {
                            var2--;
                            int var149 = field3751[var2];
                            field3751[var2++] = class425.method2640(var149, (byte) -11);
                            continue;
                        }
                        if (var607 == 3331) {
                            var2 -= 2;
                            int var150 = field3751[var2];
                            int var151 = field3751[var2 + 1];
                            field3751[var2++] = class385.method2388(var151, false, var150, 0);
                            continue;
                        }
                        if (var607 == 3332) {
                            var2 -= 2;
                            int var152 = field3751[var2];
                            int var153 = field3751[var2 + 1];
                            field3751[var2++] = class385.method2388(var153, true, var152, 0);
                            continue;
                        }
                        if (var607 == 3333) {
                            field3751[var2++] = class30.field291;
                            continue;
                        }
                        if (var607 == 3335) {
                            field3751[var2++] = class85.field953;
                            continue;
                        }
                        if (var607 == 3336) {
                            var2 -= 4;
                            int var154 = field3751[var2];
                            int var155 = field3751[var2 + 1];
                            int var156 = field3751[var2 + 2];
                            int var157 = field3751[var2 + 3];
                            int var158 = (var155 << 14) + var154;
                            int var159 = (var156 << 28) + var158;
                            int var160 = var157 + var159;
                            field3751[var2++] = var160;
                            continue;
                        }
                        if (var607 == 3337) {
                            field3751[var2++] = class156.field1980;
                            continue;
                        }
                        if (var607 == 3338) {
                            field3751[var2++] = class32.method151(false);
                            continue;
                        }
                    } else if (var607 < 3500) {
                        if (var607 == 3400) {
                            var2 -= 2;
                            int var161 = field3751[var2];
                            int var162 = field3751[var2 + 1];
                            class341 var163 = class155.method830(var161, (byte) -98);
                            field3741[var3++] = var163.method1988(-93, var162);
                            continue;
                        }
                        if (var607 == 3408) {
                            var2 -= 4;
                            int var164 = field3751[var2];
                            int var165 = field3751[var2 + 1];
                            int var166 = field3751[var2 + 2];
                            int var167 = field3751[var2 + 3];
                            class341 var168 = class155.method830(var166, (byte) -98);
                            if (var168.field4560 == var164 && var168.field4558 == var165) {
                                if (var165 == 115) {
                                    field3741[var3++] = var168.method1988(-73, var167);
                                } else {
                                    field3751[var2++] = var168.method1991((byte) 112, var167);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var607 == 3409) {
                            var2 -= 3;
                            int var169 = field3751[var2];
                            int var170 = field3751[var2 + 1];
                            int var171 = field3751[var2 + 2];
                            if (var170 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class341 var172 = class155.method830(var170, (byte) -98);
                            if (var172.field4558 != var169) {
                                throw new RuntimeException("C3409-1");
                            }
                            field3751[var2++] = var172.method1995(80, var171) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3410) {
                            var2--;
                            int var173 = field3751[var2];
                            var3--;
                            String var174 = field3741[var3];
                            if (var173 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class341 var175 = class155.method830(var173, (byte) -98);
                            if (var175.field4558 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field3751[var2++] = var175.method1997(var174, -127) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3411) {
                            var2--;
                            int var176 = field3751[var2];
                            class341 var177 = class155.method830(var176, (byte) -98);
                            field3751[var2++] = var177.field4562.method311(3369);
                            continue;
                        }
                    } else if (var607 < 3700) {
                        if (var607 == 3600) {
                            if (class338.field4502 == 0) {
                                field3751[var2++] = -2;
                            } else if (class338.field4502 == 1) {
                                field3751[var2++] = -1;
                            } else {
                                field3751[var2++] = class88.field993;
                            }
                            continue;
                        }
                        if (var607 == 3601) {
                            var2--;
                            int var178 = field3751[var2];
                            if (class338.field4502 == 2 && var178 < class88.field993) {
                                field3741[var3++] = class198.field2647[var178];
                                if (class182.field2309[var178] == null) {
                                    field3741[var3++] = "";
                                } else {
                                    field3741[var3++] = class182.field2309[var178];
                                }
                                continue;
                            }
                            field3741[var3++] = "";
                            field3741[var3++] = "";
                            continue;
                        }
                        if (var607 == 3602) {
                            var2--;
                            int var179 = field3751[var2];
                            if (class338.field4502 == 2 && var179 < class88.field993) {
                                field3751[var2++] = class392.field5645[var179];
                                continue;
                            }
                            field3751[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3603) {
                            var2--;
                            int var180 = field3751[var2];
                            if (class338.field4502 == 2 && var180 < class88.field993) {
                                field3751[var2++] = class232.field3188[var180];
                                continue;
                            }
                            field3751[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3604) {
                            var3--;
                            String var181 = field3741[var3];
                            var2--;
                            int var182 = field3751[var2];
                            class179.method941(var181, 220, var182);
                            continue;
                        }
                        if (var607 == 3605) {
                            var3--;
                            String var183 = field3741[var3];
                            class327.method1873(false, var183);
                            continue;
                        }
                        if (var607 == 3606) {
                            var3--;
                            String var184 = field3741[var3];
                            class201.method1093((byte) -45, var184);
                            continue;
                        }
                        if (var607 == 3607) {
                            var3--;
                            String var185 = field3741[var3];
                            class1.method2(var185, false, -21386);
                            continue;
                        }
                        if (var607 == 3608) {
                            var3--;
                            String var186 = field3741[var3];
                            class51.method249(var186, 1);
                            continue;
                        }
                        if (var607 == 3609) {
                            var3--;
                            String var187 = field3741[var3];
                            if (var187.startsWith("<img=0>") || var187.startsWith("<img=1>")) {
                                var187 = var187.substring(7);
                            }
                            field3751[var2++] = class51.method246(100, var187) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3610) {
                            var2--;
                            int var188 = field3751[var2];
                            if (class338.field4502 == 2 && var188 < class88.field993) {
                                field3741[var3++] = class260.field3566[var188];
                                continue;
                            }
                            field3741[var3++] = "";
                            continue;
                        }
                        if (var607 == 3611) {
                            if (class356.field5027 == null) {
                                field3741[var3++] = "";
                            } else {
                                field3741[var3++] = class248.method1322(-4349, class356.field5027);
                            }
                            continue;
                        }
                        if (var607 == 3612) {
                            if (class356.field5027 == null) {
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = class127.field1637;
                            }
                            continue;
                        }
                        if (var607 == 3613) {
                            var2--;
                            int var189 = field3751[var2];
                            if (class356.field5027 != null && var189 < class127.field1637) {
                                field3741[var3++] = class27.field263[var189].field79;
                                continue;
                            }
                            field3741[var3++] = "";
                            continue;
                        }
                        if (var607 == 3614) {
                            var2--;
                            int var190 = field3751[var2];
                            if (class356.field5027 != null && var190 < class127.field1637) {
                                field3751[var2++] = class27.field263[var190].field81;
                                continue;
                            }
                            field3751[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3615) {
                            var2--;
                            int var191 = field3751[var2];
                            if (class356.field5027 != null && var191 < class127.field1637) {
                                field3751[var2++] = class27.field263[var191].field85;
                                continue;
                            }
                            field3751[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3616) {
                            field3751[var2++] = class324.field4318;
                            continue;
                        }
                        if (var607 == 3617) {
                            var3--;
                            String var192 = field3741[var3];
                            class278.method1528(var192, (byte) -107);
                            continue;
                        }
                        if (var607 == 3618) {
                            field3751[var2++] = class114.field1417;
                            continue;
                        }
                        if (var607 == 3619) {
                            var3--;
                            String var193 = field3741[var3];
                            class12.method56((byte) 127, var193);
                            continue;
                        }
                        if (var607 == 3620) {
                            class389.method2415(21132);
                            continue;
                        }
                        if (var607 == 3621) {
                            if (class338.field4502 == 0) {
                                field3751[var2++] = -1;
                            } else {
                                field3751[var2++] = class452.field6573;
                            }
                            continue;
                        }
                        if (var607 == 3622) {
                            var2--;
                            int var194 = field3751[var2];
                            if (class338.field4502 != 0 && var194 < class452.field6573) {
                                field3741[var3++] = class333.field4427[var194];
                                if (class139.field1782[var194] == null) {
                                    field3741[var3++] = "";
                                } else {
                                    field3741[var3++] = class139.field1782[var194];
                                }
                                continue;
                            }
                            field3741[var3++] = "";
                            field3741[var3++] = "";
                            continue;
                        }
                        if (var607 == 3623) {
                            var3--;
                            String var195 = field3741[var3];
                            if (var195.startsWith("<img=0>") || var195.startsWith("<img=1>")) {
                                var195 = var195.substring(7);
                            }
                            field3751[var2++] = class398.method2491(var195, 116) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3624) {
                            var2--;
                            int var196 = field3751[var2];
                            if (class27.field263 != null && var196 < class127.field1637 && class27.field263[var196].field76.equalsIgnoreCase(class427.field6264.field2034)) {
                                field3751[var2++] = 1;
                                continue;
                            }
                            field3751[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3625) {
                            if (class72.field802 == null) {
                                field3741[var3++] = "";
                            } else {
                                field3741[var3++] = class72.field802;
                            }
                            continue;
                        }
                        if (var607 == 3626) {
                            var2--;
                            int var197 = field3751[var2];
                            if (class356.field5027 != null && var197 < class127.field1637) {
                                field3741[var3++] = class27.field263[var197].field78;
                                continue;
                            }
                            field3741[var3++] = "";
                            continue;
                        }
                        if (var607 == 3627) {
                            var2--;
                            int var198 = field3751[var2];
                            if (class338.field4502 == 2 && var198 >= 0 && var198 < class88.field993) {
                                field3751[var2++] = class230.field3176[var198] ? 1 : 0;
                                continue;
                            }
                            field3751[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3628) {
                            var3--;
                            String var199 = field3741[var3];
                            if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                                var199 = var199.substring(7);
                            }
                            field3751[var2++] = class9.method43(var199, -1);
                            continue;
                        }
                        if (var607 == 3629) {
                            field3751[var2++] = class70.field736;
                            continue;
                        }
                        if (var607 == 3630) {
                            var3--;
                            String var200 = field3741[var3];
                            class1.method2(var200, true, -21386);
                            continue;
                        }
                        if (var607 == 3631) {
                            var2--;
                            int var201 = field3751[var2];
                            field3751[var2++] = class269.field3654[var201] ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3632) {
                            var2--;
                            int var202 = field3751[var2];
                            if (class356.field5027 != null && var202 < class127.field1637) {
                                field3741[var3++] = class27.field263[var202].field76;
                                continue;
                            }
                            field3741[var3++] = "";
                            continue;
                        }
                        if (var607 == 3633) {
                            var2--;
                            int var203 = field3751[var2];
                            if (class338.field4502 != 0 && var203 < class452.field6573) {
                                field3741[var3++] = class414.field5959[var203];
                                continue;
                            }
                            field3741[var3++] = "";
                            continue;
                        }
                    } else if (var607 < 4000) {
                        if (var607 == 3903) {
                            var2--;
                            int var204 = field3751[var2];
                            field3751[var2++] = class312.field4198[var204].method412(1);
                            continue;
                        }
                        if (var607 == 3904) {
                            var2--;
                            int var205 = field3751[var2];
                            field3751[var2++] = class312.field4198[var205].field803;
                            continue;
                        }
                        if (var607 == 3905) {
                            var2--;
                            int var206 = field3751[var2];
                            field3751[var2++] = class312.field4198[var206].field798;
                            continue;
                        }
                        if (var607 == 3906) {
                            var2--;
                            int var207 = field3751[var2];
                            field3751[var2++] = class312.field4198[var207].field800;
                            continue;
                        }
                        if (var607 == 3907) {
                            var2--;
                            int var208 = field3751[var2];
                            field3751[var2++] = class312.field4198[var208].field791;
                            continue;
                        }
                        if (var607 == 3908) {
                            var2--;
                            int var209 = field3751[var2];
                            field3751[var2++] = class312.field4198[var209].field792;
                            continue;
                        }
                        if (var607 == 3910) {
                            var2--;
                            int var210 = field3751[var2];
                            int var211 = class312.field4198[var210].method413(7);
                            field3751[var2++] = var211 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3911) {
                            var2--;
                            int var212 = field3751[var2];
                            int var213 = class312.field4198[var212].method413(7);
                            field3751[var2++] = var213 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3912) {
                            var2--;
                            int var214 = field3751[var2];
                            int var215 = class312.field4198[var214].method413(7);
                            field3751[var2++] = var215 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3913) {
                            var2--;
                            int var216 = field3751[var2];
                            int var217 = class312.field4198[var216].method413(7);
                            field3751[var2++] = var217 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 4100) {
                        if (var607 == 4000) {
                            var2 -= 2;
                            int var218 = field3751[var2];
                            int var219 = field3751[var2 + 1];
                            field3751[var2++] = var218 + var219;
                            continue;
                        }
                        if (var607 == 4001) {
                            var2 -= 2;
                            int var220 = field3751[var2];
                            int var221 = field3751[var2 + 1];
                            field3751[var2++] = var220 - var221;
                            continue;
                        }
                        if (var607 == 4002) {
                            var2 -= 2;
                            int var222 = field3751[var2];
                            int var223 = field3751[var2 + 1];
                            field3751[var2++] = var222 * var223;
                            continue;
                        }
                        if (var607 == 4003) {
                            var2 -= 2;
                            int var224 = field3751[var2];
                            int var225 = field3751[var2 + 1];
                            field3751[var2++] = var224 / var225;
                            continue;
                        }
                        if (var607 == 4004) {
                            var2--;
                            int var226 = field3751[var2];
                            field3751[var2++] = (int) (Math.random() * (double) var226);
                            continue;
                        }
                        if (var607 == 4005) {
                            var2--;
                            int var227 = field3751[var2];
                            field3751[var2++] = (int) (Math.random() * (double) (var227 + 1));
                            continue;
                        }
                        if (var607 == 4006) {
                            var2 -= 5;
                            int var228 = field3751[var2];
                            int var229 = field3751[var2 + 1];
                            int var230 = field3751[var2 + 2];
                            int var231 = field3751[var2 + 3];
                            int var232 = field3751[var2 + 4];
                            field3751[var2++] = (var229 - var228) * (var232 - var230) / (var231 - var230) + var228;
                            continue;
                        }
                        if (var607 == 4007) {
                            var2 -= 2;
                            long var233 = (long) field3751[var2];
                            long var235 = (long) field3751[var2 + 1];
                            field3751[var2++] = (int) (var233 * var235 / 100L + var233);
                            continue;
                        }
                        if (var607 == 4008) {
                            var2 -= 2;
                            int var237 = field3751[var2];
                            int var238 = field3751[var2 + 1];
                            field3751[var2++] = var237 | 0x1 << var238;
                            continue;
                        }
                        if (var607 == 4009) {
                            var2 -= 2;
                            int var239 = field3751[var2];
                            int var240 = field3751[var2 + 1];
                            field3751[var2++] = var239 & -(0x1 << var240) - 1;
                            continue;
                        }
                        if (var607 == 4010) {
                            var2 -= 2;
                            int var241 = field3751[var2];
                            int var242 = field3751[var2 + 1];
                            field3751[var2++] = (var241 & 0x1 << var242) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var607 == 4011) {
                            var2 -= 2;
                            int var243 = field3751[var2];
                            int var244 = field3751[var2 + 1];
                            field3751[var2++] = var243 % var244;
                            continue;
                        }
                        if (var607 == 4012) {
                            var2 -= 2;
                            int var245 = field3751[var2];
                            int var246 = field3751[var2 + 1];
                            if (var245 == 0) {
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = (int) Math.pow((double) var245, (double) var246);
                            }
                            continue;
                        }
                        if (var607 == 4013) {
                            var2 -= 2;
                            int var247 = field3751[var2];
                            int var248 = field3751[var2 + 1];
                            if (var247 == 0) {
                                field3751[var2++] = 0;
                            } else if (var248 == 0) {
                                field3751[var2++] = Integer.MAX_VALUE;
                            } else {
                                field3751[var2++] = (int) Math.pow((double) var247, 1.0D / (double) var248);
                            }
                            continue;
                        }
                        if (var607 == 4014) {
                            var2 -= 2;
                            int var249 = field3751[var2];
                            int var250 = field3751[var2 + 1];
                            field3751[var2++] = var249 & var250;
                            continue;
                        }
                        if (var607 == 4015) {
                            var2 -= 2;
                            int var251 = field3751[var2];
                            int var252 = field3751[var2 + 1];
                            field3751[var2++] = var251 | var252;
                            continue;
                        }
                        if (var607 == 4016) {
                            var2 -= 2;
                            int var253 = field3751[var2];
                            int var254 = field3751[var2 + 1];
                            field3751[var2++] = var253 < var254 ? var253 : var254;
                            continue;
                        }
                        if (var607 == 4017) {
                            var2 -= 2;
                            int var255 = field3751[var2];
                            int var256 = field3751[var2 + 1];
                            field3751[var2++] = var255 > var256 ? var255 : var256;
                            continue;
                        }
                        if (var607 == 4018) {
                            var2 -= 3;
                            long var257 = (long) field3751[var2];
                            long var259 = (long) field3751[var2 + 1];
                            long var261 = (long) field3751[var2 + 2];
                            field3751[var2++] = (int) (var257 * var261 / var259);
                            continue;
                        }
                    } else if (var607 < 4200) {
                        if (var607 == 4100) {
                            var3--;
                            String var263 = field3741[var3];
                            var2--;
                            int var264 = field3751[var2];
                            field3741[var3++] = var263 + var264;
                            continue;
                        }
                        if (var607 == 4101) {
                            var3 -= 2;
                            String var265 = field3741[var3];
                            String var266 = field3741[var3 + 1];
                            field3741[var3++] = var265 + var266;
                            continue;
                        }
                        if (var607 == 4102) {
                            var3--;
                            String var267 = field3741[var3];
                            var2--;
                            int var268 = field3751[var2];
                            field3741[var3++] = var267 + class47.method221(var268, (byte) -50, true);
                            continue;
                        }
                        if (var607 == 4103) {
                            var3--;
                            String var269 = field3741[var3];
                            field3741[var3++] = var269.toLowerCase();
                            continue;
                        }
                        if (var607 == 4104) {
                            var2--;
                            int var270 = field3751[var2];
                            long var271 = ((long) var270 + 11745L) * 86400000L;
                            field3754.setTime(new Date(var271));
                            int var273 = field3754.get(5);
                            int var274 = field3754.get(2);
                            int var275 = field3754.get(1);
                            field3741[var3++] = var273 + "-" + field3760[var274] + "-" + var275;
                            continue;
                        }
                        if (var607 == 4105) {
                            var3 -= 2;
                            String var276 = field3741[var3];
                            String var277 = field3741[var3 + 1];
                            if (class427.field6264.field2017 != null && class427.field6264.field2017.field4447) {
                                field3741[var3++] = var277;
                                continue;
                            }
                            field3741[var3++] = var276;
                            continue;
                        }
                        if (var607 == 4106) {
                            var2--;
                            int var278 = field3751[var2];
                            field3741[var3++] = Integer.toString(var278);
                            continue;
                        }
                        if (var607 == 4107) {
                            var3 -= 2;
                            field3751[var2++] = class75.method424(field3741[var3 + 1], class85.field953, (byte) -43, field3741[var3]);
                            continue;
                        }
                        if (var607 == 4108) {
                            var3--;
                            String var279 = field3741[var3];
                            var2 -= 2;
                            int var280 = field3751[var2];
                            int var281 = field3751[var2 + 1];
                            class402 var282 = class243.method1305(class199.field2662, 0, var281, true);
                            field3751[var2++] = var282.method2523(var280, 4, var279, class88.field999);
                            continue;
                        }
                        if (var607 == 4109) {
                            var3--;
                            String var283 = field3741[var3];
                            var2 -= 2;
                            int var284 = field3751[var2];
                            int var285 = field3751[var2 + 1];
                            class402 var286 = class243.method1305(class199.field2662, 0, var285, true);
                            field3751[var2++] = var286.method2529(var284, class88.field999, var283, 0);
                            continue;
                        }
                        if (var607 == 4110) {
                            var3 -= 2;
                            String var287 = field3741[var3];
                            String var288 = field3741[var3 + 1];
                            var2--;
                            if (field3751[var2] == 1) {
                                field3741[var3++] = var287;
                            } else {
                                field3741[var3++] = var288;
                            }
                            continue;
                        }
                        if (var607 == 4111) {
                            var3--;
                            String var289 = field3741[var3];
                            field3741[var3++] = class183.method980((byte) -58, var289);
                            continue;
                        }
                        if (var607 == 4112) {
                            var3--;
                            String var290 = field3741[var3];
                            var2--;
                            int var291 = field3751[var2];
                            if (var291 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field3741[var3++] = var290 + (char) var291;
                            continue;
                        }
                        if (var607 == 4113) {
                            var2--;
                            int var292 = field3751[var2];
                            field3751[var2++] = class308.method1809((char) var292, -24754) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4114) {
                            var2--;
                            int var293 = field3751[var2];
                            field3751[var2++] = class97.method532(-19611, (char) var293) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4115) {
                            var2--;
                            int var294 = field3751[var2];
                            field3751[var2++] = class203.method1104(false, (char) var294) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4116) {
                            var2--;
                            int var295 = field3751[var2];
                            field3751[var2++] = class192.method1029((char) var295, -17255) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4117) {
                            var3--;
                            String var296 = field3741[var3];
                            if (var296 == null) {
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = var296.length();
                            }
                            continue;
                        }
                        if (var607 == 4118) {
                            var3--;
                            String var297 = field3741[var3];
                            var2 -= 2;
                            int var298 = field3751[var2];
                            int var299 = field3751[var2 + 1];
                            field3741[var3++] = var297.substring(var298, var299);
                            continue;
                        }
                        if (var607 == 4119) {
                            var3--;
                            String var300 = field3741[var3];
                            StringBuffer var301 = new StringBuffer(var300.length());
                            boolean var302 = false;
                            for (int var303 = 0; var303 < var300.length(); var303++) {
                                char var304 = var300.charAt(var303);
                                if (var304 == '<') {
                                    var302 = true;
                                } else if (var304 == '>') {
                                    var302 = false;
                                } else if (!var302) {
                                    var301.append(var304);
                                }
                            }
                            field3741[var3++] = var301.toString();
                            continue;
                        }
                        if (var607 == 4120) {
                            var3--;
                            String var305 = field3741[var3];
                            var2 -= 2;
                            int var306 = field3751[var2];
                            int var307 = field3751[var2 + 1];
                            field3751[var2++] = var305.indexOf(var306, var307);
                            continue;
                        }
                        if (var607 == 4121) {
                            var3 -= 2;
                            String var308 = field3741[var3];
                            String var309 = field3741[var3 + 1];
                            var2--;
                            int var310 = field3751[var2];
                            field3751[var2++] = var308.indexOf(var309, var310);
                            continue;
                        }
                        if (var607 == 4122) {
                            var2--;
                            int var311 = field3751[var2];
                            field3751[var2++] = Character.toLowerCase((char) var311);
                            continue;
                        }
                        if (var607 == 4123) {
                            var2--;
                            int var312 = field3751[var2];
                            field3751[var2++] = Character.toUpperCase((char) var312);
                            continue;
                        }
                        if (var607 == 4124) {
                            var2--;
                            boolean var313 = field3751[var2] != 0;
                            var2--;
                            int var314 = field3751[var2];
                            field3741[var3++] = class318.method1833(var313, (long) var314, class85.field953, 0, -20112);
                            continue;
                        }
                    } else if (var607 < 4300) {
                        if (var607 == 4200) {
                            var2--;
                            int var315 = field3751[var2];
                            field3741[var3++] = class65.method368(var315, -118).field1519;
                            continue;
                        }
                        if (var607 == 4201) {
                            var2 -= 2;
                            int var316 = field3751[var2];
                            int var317 = field3751[var2 + 1];
                            class123 var318 = class65.method368(var316, -121);
                            if (var317 >= 1 && var317 <= 5 && var318.field1551[var317 - 1] != null) {
                                field3741[var3++] = var318.field1551[var317 - 1];
                                continue;
                            }
                            field3741[var3++] = "";
                            continue;
                        }
                        if (var607 == 4202) {
                            var2 -= 2;
                            int var319 = field3751[var2];
                            int var320 = field3751[var2 + 1];
                            class123 var321 = class65.method368(var319, -121);
                            if (var320 >= 1 && var320 <= 5 && var321.field1574[var320 - 1] != null) {
                                field3741[var3++] = var321.field1574[var320 - 1];
                                continue;
                            }
                            field3741[var3++] = "";
                            continue;
                        }
                        if (var607 == 4203) {
                            var2--;
                            int var322 = field3751[var2];
                            field3751[var2++] = class65.method368(var322, -114).field1588;
                            continue;
                        }
                        if (var607 == 4204) {
                            var2--;
                            int var323 = field3751[var2];
                            field3751[var2++] = class65.method368(var323, -128).field1517 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4205) {
                            var2--;
                            int var324 = field3751[var2];
                            class123 var325 = class65.method368(var324, -112);
                            if (var325.field1529 == -1 && var325.field1525 >= 0) {
                                field3751[var2++] = var325.field1525;
                                continue;
                            }
                            field3751[var2++] = var324;
                            continue;
                        }
                        if (var607 == 4206) {
                            var2--;
                            int var326 = field3751[var2];
                            class123 var327 = class65.method368(var326, -115);
                            if (var327.field1529 >= 0 && var327.field1525 >= 0) {
                                field3751[var2++] = var327.field1525;
                                continue;
                            }
                            field3751[var2++] = var326;
                            continue;
                        }
                        if (var607 == 4207) {
                            var2--;
                            int var328 = field3751[var2];
                            field3751[var2++] = class65.method368(var328, -114).field1522 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4208) {
                            var2 -= 2;
                            int var329 = field3751[var2];
                            int var330 = field3751[var2 + 1];
                            class193 var331 = class110.method580(var330, true);
                            if (var331.method1038(7392)) {
                                field3741[var3++] = class65.method368(var329, -114).method658((byte) 121, var330, var331.field2435);
                            } else {
                                field3751[var2++] = class65.method368(var329, -112).method663(var331.field2441, var330, 1);
                            }
                            continue;
                        }
                        if (var607 == 4210) {
                            var3--;
                            String var332 = field3741[var3];
                            var2--;
                            int var333 = field3751[var2];
                            class65.method374(var333 == 1, var332, 0);
                            field3751[var2++] = class359.field5063;
                            continue;
                        }
                        if (var607 == 4211) {
                            if (class19.field184 != null && class370.field5171 < class359.field5063) {
                                field3751[var2++] = class19.field184[class370.field5171++] & 0xFFFF;
                                continue;
                            }
                            field3751[var2++] = -1;
                            continue;
                        }
                        if (var607 == 4212) {
                            class370.field5171 = 0;
                            continue;
                        }
                    } else if (var607 < 4400) {
                        if (var607 == 4300) {
                            var2 -= 2;
                            int var334 = field3751[var2];
                            int var335 = field3751[var2 + 1];
                            class193 var336 = class110.method580(var335, true);
                            if (var336.method1038(7392)) {
                                field3741[var3++] = class6.method30((byte) -125, var334).method2016(var336.field2435, var335, (byte) 112);
                            } else {
                                field3751[var2++] = class6.method30((byte) -85, var334).method2025(var335, var336.field2441, -1);
                            }
                            continue;
                        }
                    } else if (var607 < 4500) {
                        if (var607 == 4400) {
                            var2 -= 2;
                            int var337 = field3751[var2];
                            int var338 = field3751[var2 + 1];
                            class193 var339 = class110.method580(var338, true);
                            if (var339.method1038(7392)) {
                                field3741[var3++] = class281.method1655((byte) -28, var337).method1205(var339.field2435, -23774, var338);
                            } else {
                                field3751[var2++] = class281.method1655((byte) -28, var337).method1211((byte) -123, var339.field2441, var338);
                            }
                            continue;
                        }
                    } else if (var607 < 4600) {
                        if (var607 == 4500) {
                            var2 -= 2;
                            int var340 = field3751[var2];
                            int var341 = field3751[var2 + 1];
                            class193 var342 = class110.method580(var341, true);
                            if (var342.method1038(7392)) {
                                field3741[var3++] = class171.method902(26, var340).method1448(var341, 107, var342.field2435);
                            } else {
                                field3751[var2++] = class171.method902(26, var340).method1446((byte) 33, var342.field2441, var341);
                            }
                            continue;
                        }
                    } else if (var607 < 4700) {
                        if (var607 == 4600) {
                            var2--;
                            int var343 = field3751[var2];
                            field3751[var2++] = class298.method1761(var343, 29514).field781;
                            continue;
                        }
                    } else if (var607 < 5100) {
                        if (var607 == 5000) {
                            field3751[var2++] = class371.field5196;
                            continue;
                        }
                        if (var607 == 5001) {
                            var2 -= 3;
                            class371.field5196 = field3751[var2];
                            class72.field793 = field3751[var2 + 1];
                            class222.field2968 = field3751[var2 + 2];
                            field3752++;
                            class281.field3857.method295(20579, 175);
                            class281.field3857.method1386(-222840624, class371.field5196);
                            class281.field3857.method1386(-222840624, class72.field793);
                            class281.field3857.method1386(-222840624, class222.field2968);
                            continue;
                        }
                        if (var607 == 5002) {
                            var3--;
                            String var344 = field3741[var3];
                            var2 -= 2;
                            int var345 = field3751[var2];
                            int var346 = field3751[var2 + 1];
                            field3755++;
                            class281.field3857.method295(20579, 36);
                            class281.field3857.method1386(-222840624, class75.method426(28555, var344) + 2);
                            class281.field3857.method1343(var344, 22608);
                            class281.field3857.method1386(-222840624, var345 - 1);
                            class281.field3857.method1386(-222840624, var346);
                            continue;
                        }
                        if (var607 == 5003) {
                            var2--;
                            int var347 = field3751[var2];
                            String var348 = null;
                            if (var347 < 100) {
                                var348 = class149.field1899[var347];
                            }
                            if (var348 == null) {
                                var348 = "";
                            }
                            field3741[var3++] = var348;
                            continue;
                        }
                        if (var607 == 5004) {
                            var2--;
                            int var349 = field3751[var2];
                            int var350 = -1;
                            if (var349 < 100 && class149.field1899[var349] != null) {
                                var350 = class176.field2210[var349];
                            }
                            field3751[var2++] = var350;
                            continue;
                        }
                        if (var607 == 5005) {
                            field3751[var2++] = class72.field793;
                            continue;
                        }
                        if (var607 == 5008) {
                            var3--;
                            String var351 = field3741[var3];
                            if (class110.field1357 == 0 && (class142.field1814 && !class342.field4576 || class374.field5268)) {
                                continue;
                            }
                            String var352 = var351.toLowerCase();
                            byte var353 = 0;
                            if (var352.startsWith(class374.field5266)) {
                                var353 = 0;
                                var351 = var351.substring(class374.field5266.length());
                            } else if (var352.startsWith(class167.field2117)) {
                                var353 = 1;
                                var351 = var351.substring(class167.field2117.length());
                            } else if (var352.startsWith(class350.field4873)) {
                                var353 = 2;
                                var351 = var351.substring(class350.field4873.length());
                            } else if (var352.startsWith(class243.field3310)) {
                                var353 = 3;
                                var351 = var351.substring(class243.field3310.length());
                            } else if (var352.startsWith(class129.field1666)) {
                                var353 = 4;
                                var351 = var351.substring(class129.field1666.length());
                            } else if (var352.startsWith(class106.field1303)) {
                                var353 = 5;
                                var351 = var351.substring(class106.field1303.length());
                            } else if (var352.startsWith(class143.field1836)) {
                                var353 = 6;
                                var351 = var351.substring(class143.field1836.length());
                            } else if (var352.startsWith(class250.field3430)) {
                                var353 = 7;
                                var351 = var351.substring(class250.field3430.length());
                            } else if (var352.startsWith(class312.field4195)) {
                                var353 = 8;
                                var351 = var351.substring(class312.field4195.length());
                            } else if (var352.startsWith(class32.field314)) {
                                var353 = 9;
                                var351 = var351.substring(class32.field314.length());
                            } else if (var352.startsWith(class213.field2880)) {
                                var353 = 10;
                                var351 = var351.substring(class213.field2880.length());
                            } else if (var352.startsWith(class21.field209)) {
                                var353 = 11;
                                var351 = var351.substring(class21.field209.length());
                            } else if (class85.field953 != 0) {
                                if (var352.startsWith(class193.field2438)) {
                                    var353 = 0;
                                    var351 = var351.substring(class193.field2438.length());
                                } else if (var352.startsWith(class110.field1359)) {
                                    var353 = 1;
                                    var351 = var351.substring(class110.field1359.length());
                                } else if (var352.startsWith(class69.field728)) {
                                    var353 = 2;
                                    var351 = var351.substring(class69.field728.length());
                                } else if (var352.startsWith(class444.field6484)) {
                                    var353 = 3;
                                    var351 = var351.substring(class444.field6484.length());
                                } else if (var352.startsWith(class366.field5121)) {
                                    var353 = 4;
                                    var351 = var351.substring(class366.field5121.length());
                                } else if (var352.startsWith(class132.field1702)) {
                                    var353 = 5;
                                    var351 = var351.substring(class132.field1702.length());
                                } else if (var352.startsWith(class115.field1439)) {
                                    var353 = 6;
                                    var351 = var351.substring(class115.field1439.length());
                                } else if (var352.startsWith(class250.field3433)) {
                                    var353 = 7;
                                    var351 = var351.substring(class250.field3433.length());
                                } else if (var352.startsWith(class269.field3655)) {
                                    var353 = 8;
                                    var351 = var351.substring(class269.field3655.length());
                                } else if (var352.startsWith(class213.field2887)) {
                                    var353 = 9;
                                    var351 = var351.substring(class213.field2887.length());
                                } else if (var352.startsWith(class312.field4201)) {
                                    var353 = 10;
                                    var351 = var351.substring(class312.field4201.length());
                                } else if (var352.startsWith(class296.field4035)) {
                                    var353 = 11;
                                    var351 = var351.substring(class296.field4035.length());
                                }
                            }
                            String var354 = var351.toLowerCase();
                            byte var355 = 0;
                            if (var354.startsWith(class23.field215)) {
                                var355 = 1;
                                var351 = var351.substring(class23.field215.length());
                            } else if (var354.startsWith(class54.field552)) {
                                var355 = 2;
                                var351 = var351.substring(class54.field552.length());
                            } else if (var354.startsWith(class262.field3574)) {
                                var355 = 3;
                                var351 = var351.substring(class262.field3574.length());
                            } else if (var354.startsWith(class75.field830)) {
                                var355 = 4;
                                var351 = var351.substring(class75.field830.length());
                            } else if (var354.startsWith(class112.field1394)) {
                                var355 = 5;
                                var351 = var351.substring(class112.field1394.length());
                            } else if (class85.field953 != 0) {
                                if (var354.startsWith(class395.field5694)) {
                                    var355 = 1;
                                    var351 = var351.substring(class395.field5694.length());
                                } else if (var354.startsWith(class32.field307)) {
                                    var355 = 2;
                                    var351 = var351.substring(class32.field307.length());
                                } else if (var354.startsWith(class2.field21)) {
                                    var355 = 3;
                                    var351 = var351.substring(class2.field21.length());
                                } else if (var354.startsWith(class87.field990)) {
                                    var355 = 4;
                                    var351 = var351.substring(class87.field990.length());
                                } else if (var354.startsWith(class368.field5160)) {
                                    var355 = 5;
                                    var351 = var351.substring(class368.field5160.length());
                                }
                            }
                            field3743++;
                            class281.field3857.method295(20579, 192);
                            class281.field3857.method1386(-222840624, 0);
                            int var356 = class281.field3857.field3389;
                            class281.field3857.method1386(-222840624, var353);
                            class281.field3857.method1386(-222840624, var355);
                            class122.method650(var351, class281.field3857, 110);
                            class281.field3857.method1362(class281.field3857.field3389 - var356, (byte) 95);
                            continue;
                        }
                        if (var607 == 5009) {
                            var3 -= 2;
                            String var357 = field3741[var3];
                            String var358 = field3741[var3 + 1];
                            if (class110.field1357 != 0 || (!class142.field1814 || class342.field4576) && !class374.field5268) {
                                field3737++;
                                class281.field3857.method295(20579, 43);
                                class281.field3857.method1386(-222840624, 0);
                                int var359 = class281.field3857.field3389;
                                class281.field3857.method1343(var357, 22608);
                                class122.method650(var358, class281.field3857, 118);
                                class281.field3857.method1362(class281.field3857.field3389 - var359, (byte) 89);
                            }
                            continue;
                        }
                        if (var607 == 5010) {
                            var2--;
                            int var360 = field3751[var2];
                            String var361 = null;
                            if (var360 < 100) {
                                var361 = class145.field1865[var360];
                            }
                            if (var361 == null) {
                                var361 = "";
                            }
                            field3741[var3++] = var361;
                            continue;
                        }
                        if (var607 == 5011) {
                            var2--;
                            int var362 = field3751[var2];
                            String var363 = null;
                            if (var362 < 100) {
                                var363 = class21.field198[var362];
                            }
                            if (var363 == null) {
                                var363 = "";
                            }
                            field3741[var3++] = var363;
                            continue;
                        }
                        if (var607 == 5012) {
                            var2--;
                            int var364 = field3751[var2];
                            int var365 = -1;
                            if (var364 < 100) {
                                var365 = class119.field1486[var364];
                            }
                            field3751[var2++] = var365;
                            continue;
                        }
                        if (var607 == 5015) {
                            String var366;
                            if (class427.field6264 == null || class427.field6264.field2043 == null) {
                                var366 = class264.field3600;
                            } else {
                                var366 = class427.field6264.method851(true, -116);
                            }
                            field3741[var3++] = var366;
                            continue;
                        }
                        if (var607 == 5016) {
                            field3751[var2++] = class222.field2968;
                            continue;
                        }
                        if (var607 == 5017) {
                            field3751[var2++] = class323.field4315;
                            continue;
                        }
                        if (var607 == 5018) {
                            var2--;
                            int var367 = field3751[var2];
                            int var368 = 0;
                            if (var367 < 100 && class149.field1899[var367] != null) {
                                var368 = class176.field2210[var367];
                            }
                            field3751[var2++] = var368;
                            continue;
                        }
                        if (var607 == 5019) {
                            var2--;
                            int var369 = field3751[var2];
                            String var370 = null;
                            if (var369 < 100) {
                                var370 = class208.field2834[var369];
                            }
                            if (var370 == null) {
                                var370 = "";
                            }
                            field3741[var3++] = var370;
                            continue;
                        }
                        if (var607 == 5020) {
                            String var371;
                            if (class427.field6264 == null || class427.field6264.field2043 == null) {
                                var371 = class264.field3600;
                            } else {
                                var371 = class427.field6264.method855(false, false);
                            }
                            field3741[var3++] = var371;
                            continue;
                        }
                        if (var607 == 5050) {
                            var2--;
                            int var372 = field3751[var2];
                            field3741[var3++] = class118.method642(var372, true).field2700;
                            continue;
                        }
                        if (var607 == 5051) {
                            var2--;
                            int var373 = field3751[var2];
                            class201 var374 = class118.method642(var373, true);
                            if (var374.field2698 == null) {
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = var374.field2698.length;
                            }
                            continue;
                        }
                        if (var607 == 5052) {
                            var2 -= 2;
                            int var375 = field3751[var2];
                            int var376 = field3751[var2 + 1];
                            class201 var377 = class118.method642(var375, true);
                            int var378 = var377.field2698[var376];
                            field3751[var2++] = var378;
                            continue;
                        }
                        if (var607 == 5053) {
                            var2--;
                            int var379 = field3751[var2];
                            class201 var380 = class118.method642(var379, true);
                            if (var380.field2699 == null) {
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = var380.field2699.length;
                            }
                            continue;
                        }
                        if (var607 == 5054) {
                            var2 -= 2;
                            int var381 = field3751[var2];
                            int var382 = field3751[var2 + 1];
                            field3751[var2++] = class118.method642(var381, true).field2699[var382];
                            continue;
                        }
                        if (var607 == 5055) {
                            var2--;
                            int var383 = field3751[var2];
                            field3741[var3++] = class206.method1118(var383, 32767).method2544((byte) -92);
                            continue;
                        }
                        if (var607 == 5056) {
                            var2--;
                            int var384 = field3751[var2];
                            class409 var385 = class206.method1118(var384, 32767);
                            if (var385.field5922 == null) {
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = var385.field5922.length;
                            }
                            continue;
                        }
                        if (var607 == 5057) {
                            var2 -= 2;
                            int var386 = field3751[var2];
                            int var387 = field3751[var2 + 1];
                            field3751[var2++] = class206.method1118(var386, 32767).field5922[var387];
                            continue;
                        }
                        if (var607 == 5058) {
                            field3744 = new class97();
                            var2--;
                            field3744.field1148 = field3751[var2];
                            field3744.field1150 = class206.method1118(field3744.field1148, 32767);
                            field3744.field1151 = new int[field3744.field1150.method2545(32768)];
                            continue;
                        }
                        if (var607 == 5059) {
                            field3756++;
                            class281.field3857.method295(20579, 243);
                            class281.field3857.method1386(-222840624, 0);
                            int var388 = class281.field3857.field3389;
                            class281.field3857.method1386(-222840624, 0);
                            class281.field3857.method1346(121, field3744.field1148);
                            field3744.field1150.method2542(field3744.field1151, class281.field3857, (byte) 85);
                            class281.field3857.method1362(class281.field3857.field3389 - var388, (byte) 111);
                            continue;
                        }
                        if (var607 == 5060) {
                            var3--;
                            String var389 = field3741[var3];
                            field3757++;
                            class281.field3857.method295(20579, 121);
                            class281.field3857.method1386(-222840624, 0);
                            int var390 = class281.field3857.field3389;
                            class281.field3857.method1343(var389, 22608);
                            class281.field3857.method1346(125, field3744.field1148);
                            field3744.field1150.method2542(field3744.field1151, class281.field3857, (byte) 85);
                            class281.field3857.method1362(class281.field3857.field3389 - var390, (byte) 120);
                            continue;
                        }
                        if (var607 == 5061) {
                            field3756++;
                            class281.field3857.method295(20579, 243);
                            class281.field3857.method1386(-222840624, 0);
                            int var391 = class281.field3857.field3389;
                            class281.field3857.method1386(-222840624, 1);
                            class281.field3857.method1346(122, field3744.field1148);
                            field3744.field1150.method2542(field3744.field1151, class281.field3857, (byte) 85);
                            class281.field3857.method1362(class281.field3857.field3389 - var391, (byte) 109);
                            continue;
                        }
                        if (var607 == 5062) {
                            var2 -= 2;
                            int var392 = field3751[var2];
                            int var393 = field3751[var2 + 1];
                            field3751[var2++] = class118.method642(var392, true).field2701[var393];
                            continue;
                        }
                        if (var607 == 5063) {
                            var2 -= 2;
                            int var394 = field3751[var2];
                            int var395 = field3751[var2 + 1];
                            field3751[var2++] = class118.method642(var394, true).field2703[var395];
                            continue;
                        }
                        if (var607 == 5064) {
                            var2 -= 2;
                            int var396 = field3751[var2];
                            int var397 = field3751[var2 + 1];
                            if (var397 == -1) {
                                field3751[var2++] = -1;
                            } else {
                                field3751[var2++] = class118.method642(var396, true).method1089((char) var397, -108);
                            }
                            continue;
                        }
                        if (var607 == 5065) {
                            var2 -= 2;
                            int var398 = field3751[var2];
                            int var399 = field3751[var2 + 1];
                            if (var399 == -1) {
                                field3751[var2++] = -1;
                            } else {
                                field3751[var2++] = class118.method642(var398, true).method1090((char) var399, (byte) 54);
                            }
                            continue;
                        }
                        if (var607 == 5066) {
                            var2--;
                            int var400 = field3751[var2];
                            field3751[var2++] = class206.method1118(var400, 32767).method2545(32768);
                            continue;
                        }
                        if (var607 == 5067) {
                            var2 -= 2;
                            int var401 = field3751[var2];
                            int var402 = field3751[var2 + 1];
                            int var403 = class206.method1118(var401, 32767).method2548(-121, var402);
                            field3751[var2++] = var403;
                            continue;
                        }
                        if (var607 == 5068) {
                            var2 -= 2;
                            int var404 = field3751[var2];
                            int var405 = field3751[var2 + 1];
                            field3744.field1151[var404] = var405;
                            continue;
                        }
                        if (var607 == 5069) {
                            var2 -= 2;
                            int var406 = field3751[var2];
                            int var407 = field3751[var2 + 1];
                            field3744.field1151[var406] = var407;
                            continue;
                        }
                        if (var607 == 5070) {
                            var2 -= 3;
                            int var408 = field3751[var2];
                            int var409 = field3751[var2 + 1];
                            int var410 = field3751[var2 + 2];
                            class409 var411 = class206.method1118(var408, 32767);
                            if (var411.method2548(121, var409) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field3751[var2++] = var411.method2549(var410, true, var409);
                            continue;
                        }
                        if (var607 == 5071) {
                            var3--;
                            String var412 = field3741[var3];
                            var2--;
                            boolean var413 = field3751[var2] == 1;
                            class32.method149((byte) 48, var413, var412);
                            field3751[var2++] = class359.field5063;
                            continue;
                        }
                        if (var607 == 5072) {
                            if (class19.field184 != null && class370.field5171 < class359.field5063) {
                                field3751[var2++] = class19.field184[class370.field5171++] & 0xFFFF;
                                continue;
                            }
                            field3751[var2++] = -1;
                            continue;
                        }
                        if (var607 == 5073) {
                            class370.field5171 = 0;
                            continue;
                        }
                    } else if (var607 < 5200) {
                        if (var607 == 5100) {
                            if (class249.field3361[86]) {
                                field3751[var2++] = 1;
                            } else {
                                field3751[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 5101) {
                            if (class249.field3361[82]) {
                                field3751[var2++] = 1;
                            } else {
                                field3751[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 5102) {
                            if (class249.field3361[81]) {
                                field3751[var2++] = 1;
                            } else {
                                field3751[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var607 < 5300) {
                        if (var607 == 5200) {
                            var2--;
                            class7.method32(37, field3751[var2]);
                            continue;
                        }
                        if (var607 == 5201) {
                            field3751[var2++] = class209.method1137(-746268989);
                            continue;
                        }
                        if (var607 == 5205) {
                            var2--;
                            class208.method1125(field3751[var2], false, -1, 4, -1);
                            continue;
                        }
                        if (var607 == 5206) {
                            var2--;
                            int var414 = field3751[var2];
                            class180 var415 = class443.method2741(var414 >> 14 & 0x3FFF, var414 & 0x3FFF);
                            if (var415 == null) {
                                field3751[var2++] = -1;
                            } else {
                                field3751[var2++] = var415.field2266;
                            }
                            continue;
                        }
                        if (var607 == 5207) {
                            var2--;
                            class180 var416 = class443.method2735(field3751[var2]);
                            if (var416 != null && var416.field2252 != null) {
                                field3741[var3++] = var416.field2252;
                                continue;
                            }
                            field3741[var3++] = "";
                            continue;
                        }
                        if (var607 == 5208) {
                            field3751[var2++] = class272.field3681;
                            field3751[var2++] = class262.field3573;
                            continue;
                        }
                        if (var607 == 5209) {
                            field3751[var2++] = class98.field1165 + class443.field6479;
                            field3751[var2++] = class443.field6469 + class158.field2027;
                            continue;
                        }
                        if (var607 == 5210) {
                            var2--;
                            int var417 = field3751[var2];
                            class180 var418 = class443.method2735(var417);
                            if (var418 == null) {
                                field3751[var2++] = 0;
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = var418.field2256 >> 14 & 0x3FFF;
                                field3751[var2++] = var418.field2256 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var607 == 5211) {
                            var2--;
                            int var419 = field3751[var2];
                            class180 var420 = class443.method2735(var419);
                            if (var420 == null) {
                                field3751[var2++] = 0;
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = var420.field2260 - var420.field2262;
                                field3751[var2++] = var420.field2267 - var420.field2265;
                            }
                            continue;
                        }
                        if (var607 == 5212) {
                            class216 var421 = class236.method1282((byte) 86);
                            if (var421 == null) {
                                field3751[var2++] = -1;
                                field3751[var2++] = -1;
                            } else {
                                field3751[var2++] = var421.field2903;
                                int var422 = var421.field2898 << 28 | class443.field6479 + var421.field2908 << 14 | class443.field6469 + var421.field2896;
                                field3751[var2++] = var422;
                            }
                            continue;
                        }
                        if (var607 == 5213) {
                            class216 var423 = class342.method2004(116);
                            if (var423 == null) {
                                field3751[var2++] = -1;
                                field3751[var2++] = -1;
                            } else {
                                field3751[var2++] = var423.field2903;
                                int var424 = var423.field2898 << 28 | class443.field6479 + var423.field2908 << 14 | class443.field6469 + var423.field2896;
                                field3751[var2++] = var424;
                            }
                            continue;
                        }
                        if (var607 == 5214) {
                            var2--;
                            int var425 = field3751[var2];
                            class180 var426 = class264.method1477((byte) -128);
                            if (var426 != null) {
                                boolean var427 = var426.method952(field3759, var425 >> 14 & 0x3FFF, true, var425 & 0x3FFF, var425 >> 28 & 0x3);
                                if (var427) {
                                    class112.method599(field3759[2], (byte) -59, field3759[1]);
                                }
                            }
                            continue;
                        }
                        if (var607 == 5215) {
                            var2 -= 2;
                            int var428 = field3751[var2];
                            int var429 = field3751[var2 + 1];
                            class69 var430 = class443.method2738(var428 >> 14 & 0x3FFF, var428 & 0x3FFF);
                            boolean var431 = false;
                            for (class180 var432 = (class180) var430.method399(125); var432 != null; var432 = (class180) var430.method397(18244)) {
                                if (var432.field2266 == var429) {
                                    var431 = true;
                                    break;
                                }
                            }
                            if (var431) {
                                field3751[var2++] = 1;
                            } else {
                                field3751[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 5218) {
                            var2--;
                            int var433 = field3751[var2];
                            class180 var434 = class443.method2735(var433);
                            if (var434 == null) {
                                field3751[var2++] = -1;
                            } else {
                                field3751[var2++] = var434.field2254;
                            }
                            continue;
                        }
                        if (var607 == 5220) {
                            field3751[var2++] = class337.field4497 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5221) {
                            var2--;
                            int var435 = field3751[var2];
                            class112.method599(var435 & 0x3FFF, (byte) -85, var435 >> 14 & 0x3FFF);
                            continue;
                        }
                        if (var607 == 5222) {
                            class180 var436 = class264.method1477((byte) -128);
                            if (var436 == null) {
                                field3751[var2++] = -1;
                                field3751[var2++] = -1;
                            } else {
                                boolean var437 = var436.method950(class98.field1165 + class443.field6479, -12176, class443.field6469 + class158.field2027, field3759);
                                if (var437) {
                                    field3751[var2++] = field3759[1];
                                    field3751[var2++] = field3759[2];
                                } else {
                                    field3751[var2++] = -1;
                                    field3751[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var607 == 5223) {
                            var2 -= 2;
                            int var438 = field3751[var2];
                            int var439 = field3751[var2 + 1];
                            class208.method1125(var438, false, var439 >> 14 & 0x3FFF, 4, var439 & 0x3FFF);
                            continue;
                        }
                        if (var607 == 5224) {
                            var2--;
                            int var440 = field3751[var2];
                            class180 var441 = class264.method1477((byte) -128);
                            if (var441 == null) {
                                field3751[var2++] = -1;
                                field3751[var2++] = -1;
                            } else {
                                boolean var442 = var441.method952(field3759, var440 >> 14 & 0x3FFF, true, var440 & 0x3FFF, var440 >> 28 & 0x3);
                                if (var442) {
                                    field3751[var2++] = field3759[1];
                                    field3751[var2++] = field3759[2];
                                } else {
                                    field3751[var2++] = -1;
                                    field3751[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var607 == 5225) {
                            var2--;
                            int var443 = field3751[var2];
                            class180 var444 = class264.method1477((byte) -128);
                            if (var444 == null) {
                                field3751[var2++] = -1;
                                field3751[var2++] = -1;
                            } else {
                                boolean var445 = var444.method950(var443 >> 14 & 0x3FFF, -12176, var443 & 0x3FFF, field3759);
                                if (var445) {
                                    field3751[var2++] = field3759[1];
                                    field3751[var2++] = field3759[2];
                                } else {
                                    field3751[var2++] = -1;
                                    field3751[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var607 == 5226) {
                            var2--;
                            class286.method1680(field3751[var2], (byte) 22);
                            continue;
                        }
                        if (var607 == 5227) {
                            var2 -= 2;
                            int var446 = field3751[var2];
                            int var447 = field3751[var2 + 1];
                            class208.method1125(var446, true, var447 >> 14 & 0x3FFF, 4, var447 & 0x3FFF);
                            continue;
                        }
                        if (var607 == 5228) {
                            var2--;
                            class42.field437 = field3751[var2] == 1;
                            continue;
                        }
                        if (var607 == 5229) {
                            field3751[var2++] = class42.field437 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5230) {
                            var2--;
                            int var448 = field3751[var2];
                            class249.method1327(601892515, var448);
                            continue;
                        }
                        if (var607 == 5231) {
                            var2 -= 2;
                            int var449 = field3751[var2];
                            boolean var450 = field3751[var2 + 1] == 1;
                            if (class254.field3480 == null) {
                                continue;
                            }
                            class338 var451 = class254.field3480.method308((long) var449, (byte) 25);
                            if (var451 != null && !var450) {
                                var451.method1967(-1);
                                continue;
                            }
                            if (var451 == null && var450) {
                                class338 var452 = new class338();
                                class254.field3480.method314((long) var449, var452, 7079);
                            }
                            continue;
                        }
                        if (var607 == 5232) {
                            var2--;
                            int var453 = field3751[var2];
                            if (class254.field3480 == null) {
                                field3751[var2++] = 0;
                            } else {
                                class338 var454 = class254.field3480.method308((long) var453, (byte) 54);
                                field3751[var2++] = var454 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var607 == 5233) {
                            var2 -= 2;
                            int var455 = field3751[var2];
                            boolean var456 = field3751[var2 + 1] == 1;
                            if (class189.field2393 == null) {
                                continue;
                            }
                            class338 var457 = class189.field2393.method308((long) var455, (byte) 71);
                            if (var457 != null && !var456) {
                                var457.method1967(-1);
                                continue;
                            }
                            if (var457 == null && var456) {
                                class338 var458 = new class338();
                                class189.field2393.method314((long) var455, var458, 7079);
                            }
                            continue;
                        }
                        if (var607 == 5234) {
                            var2--;
                            int var459 = field3751[var2];
                            if (class189.field2393 == null) {
                                field3751[var2++] = 0;
                            } else {
                                class338 var460 = class189.field2393.method308((long) var459, (byte) -114);
                                field3751[var2++] = var460 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var607 == 5235) {
                            field3751[var2++] = class443.field6447 == null ? -1 : class443.field6447.field2266;
                            continue;
                        }
                    } else if (var607 < 5400) {
                        if (var607 == 5300) {
                            var2 -= 2;
                            int var461 = field3751[var2];
                            int var462 = field3751[var2 + 1];
                            class345.method2010(false, var462, var461, 0, 3);
                            field3751[var2++] = class171.field2153 == null ? 0 : 1;
                            continue;
                        }
                        if (var607 == 5301) {
                            if (class171.field2153 != null) {
                                class345.method2010(false, -1, -1, 0, class284.field3877);
                            }
                            continue;
                        }
                        if (var607 == 5302) {
                            class108[] var463 = class383.method2380(0);
                            field3751[var2++] = var463.length;
                            continue;
                        }
                        if (var607 == 5303) {
                            var2--;
                            int var464 = field3751[var2];
                            class108[] var465 = class383.method2380(0);
                            field3751[var2++] = var465[var464].field1320;
                            field3751[var2++] = var465[var464].field1326;
                            continue;
                        }
                        if (var607 == 5305) {
                            int var466 = class444.field6490;
                            int var467 = class335.field4449;
                            int var468 = -1;
                            class108[] var469 = class383.method2380(0);
                            for (int var470 = 0; var470 < var469.length; var470++) {
                                class108 var471 = var469[var470];
                                if (var471.field1320 == var466 && var471.field1326 == var467) {
                                    var468 = var470;
                                    break;
                                }
                            }
                            field3751[var2++] = var468;
                            continue;
                        }
                        if (var607 == 5306) {
                            field3751[var2++] = class219.method1184((byte) 13);
                            continue;
                        }
                        if (var607 == 5307) {
                            var2--;
                            int var472 = field3751[var2];
                            if (var472 >= 1 && var472 <= 2) {
                                class345.method2010(false, -1, -1, 0, var472);
                            }
                            continue;
                        }
                        if (var607 == 5308) {
                            field3751[var2++] = class284.field3877;
                            continue;
                        }
                        if (var607 == 5309) {
                            var2--;
                            int var473 = field3751[var2];
                            if (var473 >= 1 && var473 <= 2) {
                                class284.field3877 = var473;
                                class340.method1982(6288, class159.field2055);
                            }
                            continue;
                        }
                    } else if (var607 < 5500) {
                        if (var607 == 5400) {
                            var3 -= 2;
                            String var474 = field3741[var3];
                            String var475 = field3741[var3 + 1];
                            var2--;
                            int var476 = field3751[var2];
                            field3738++;
                            class281.field3857.method295(20579, 85);
                            class281.field3857.method1386(-222840624, class75.method426(28555, var474) + class75.method426(28555, var475) + 1);
                            class281.field3857.method1343(var474, 22608);
                            class281.field3857.method1343(var475, 22608);
                            class281.field3857.method1386(-222840624, var476);
                            continue;
                        }
                        if (var607 == 5401) {
                            var2 -= 2;
                            class29.field285[field3751[var2]] = (short) class424.method2636(-15, field3751[var2 + 1]);
                            class17.method78(false);
                            class397.method2485(false);
                            class339.method1978((byte) 74);
                            class396.method2477(false);
                            class84.method458((byte) -94);
                            continue;
                        }
                        if (var607 == 5405) {
                            var2 -= 2;
                            int var477 = field3751[var2];
                            int var478 = field3751[var2 + 1];
                            if (var477 >= 0 && var477 < 2) {
                                class351.field4903[var477] = new int[var478 << 1][4];
                            }
                            continue;
                        }
                        if (var607 == 5406) {
                            var2 -= 7;
                            int var479 = field3751[var2];
                            int var480 = field3751[var2 + 1] << 1;
                            int var481 = field3751[var2 + 2];
                            int var482 = field3751[var2 + 3];
                            int var483 = field3751[var2 + 4];
                            int var484 = field3751[var2 + 5];
                            int var485 = field3751[var2 + 6];
                            if (var479 >= 0 && var479 < 2 && class351.field4903[var479] != null && var480 >= 0 && var480 < class351.field4903[var479].length) {
                                class351.field4903[var479][var480] = new int[] { (var481 >> 14 & 0x3FFF) * 128, var482, (var481 & 0x3FFF) * 128, var485 };
                                class351.field4903[var479][var480 + 1] = new int[] { (var483 >> 14 & 0x3FFF) * 128, var484, (var483 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var607 == 5407) {
                            var2--;
                            int var486 = class351.field4903[field3751[var2]].length >> 1;
                            field3751[var2++] = var486;
                            continue;
                        }
                        if (var607 == 5411) {
                            if (class171.field2153 != null) {
                                class345.method2010(false, -1, -1, 0, class284.field3877);
                            }
                            if (class213.field2888 == null) {
                                String var487 = class418.field6019 == null ? class130.method698((byte) 13) : class418.field6019;
                                class69.method394(class159.field2055, class101.field1182 == 1, -91, var487, false);
                            } else {
                                class360.method2204(0);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var607 == 5419) {
                            String var488 = "";
                            if (class179.field2244 != null) {
                                if (class179.field2244.field4126 == null) {
                                    var488 = class83.method450(class179.field2244.field4124, 116);
                                } else {
                                    var488 = (String) class179.field2244.field4126;
                                }
                            }
                            field3741[var3++] = var488;
                            continue;
                        }
                        if (var607 == 5420) {
                            field3751[var2++] = class450.field6549 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5421) {
                            if (class171.field2153 != null) {
                                class345.method2010(false, -1, -1, 0, class284.field3877);
                            }
                            var3--;
                            String var489 = field3741[var3];
                            var2--;
                            boolean var490 = field3751[var2] == 1;
                            String var491 = class130.method698((byte) 13) + var489;
                            class69.method394(class159.field2055, class101.field1182 == 1, -88, var491, var490);
                            continue;
                        }
                        if (var607 == 5422) {
                            var3 -= 2;
                            String var492 = field3741[var3];
                            String var493 = field3741[var3 + 1];
                            var2--;
                            int var494 = field3751[var2];
                            if (var492.length() > 0) {
                                if (class172.field2161 == null) {
                                    class172.field2161 = new String[class205.field2772[class62.field636]];
                                }
                                class172.field2161[var494] = var492;
                            }
                            if (var493.length() > 0) {
                                if (class267.field3628 == null) {
                                    class267.field3628 = new String[class205.field2772[class62.field636]];
                                }
                                class267.field3628[var494] = var493;
                            }
                            continue;
                        }
                        if (var607 == 5423) {
                            var3--;
                            System.out.println(field3741[var3]);
                            continue;
                        }
                        if (var607 == 5424) {
                            var2 -= 11;
                            class75.field847 = field3751[var2];
                            class122.field1512 = field3751[var2 + 1];
                            class356.field5039 = field3751[var2 + 2];
                            class118.field1471 = field3751[var2 + 3];
                            class293.field3975 = field3751[var2 + 4];
                            class140.field1801 = field3751[var2 + 5];
                            class266.field3623 = field3751[var2 + 6];
                            class263.field3598 = field3751[var2 + 7];
                            class227.field3102 = field3751[var2 + 8];
                            class360.field5105 = field3751[var2 + 9];
                            class94.field1095 = field3751[var2 + 10];
                            class72.field797.method1673(-111, class293.field3975);
                            class72.field797.method1673(80, class140.field1801);
                            class72.field797.method1673(110, class266.field3623);
                            class72.field797.method1673(-104, class263.field3598);
                            class72.field797.method1673(-128, class227.field3102);
                            class162.field2076 = null;
                            class371.field5197 = null;
                            class75.field821 = null;
                            class440.field6433 = null;
                            class171.field2151 = null;
                            class200.field2667 = null;
                            class96.field1145 = null;
                            class126.field1621 = null;
                            class338.field4511 = true;
                            continue;
                        }
                        if (var607 == 5425) {
                            class206.method1116((byte) -112);
                            class338.field4511 = false;
                            continue;
                        }
                        if (var607 == 5426) {
                            var2 -= 2;
                            class12.field116 = field3751[var2];
                            class110.field1358 = field3751[var2 + 1];
                            continue;
                        }
                        if (var607 == 5427) {
                            var2 -= 2;
                            class418.field6013 = field3751[var2];
                            class356.field5023 = field3751[var2 + 1];
                            continue;
                        }
                        if (var607 == 5428) {
                            var2 -= 2;
                            int var495 = field3751[var2];
                            int var496 = field3751[var2 + 1];
                            field3751[var2++] = class156.method841(-123, var496, var495) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5429) {
                            var3--;
                            class227.method1233(field3741[var3], 7272, false);
                            continue;
                        }
                    } else if (var607 < 5600) {
                        if (var607 == 5500) {
                            var2 -= 4;
                            int var497 = field3751[var2];
                            int var498 = field3751[var2 + 1];
                            int var499 = field3751[var2 + 2];
                            int var500 = field3751[var2 + 3];
                            class292.method1722(false, (var497 & 0x3FFF) - class291.field3961, var499, (byte) 122, (var497 >> 14 & 0x3FFF) - class70.field767, var500, var498);
                            continue;
                        }
                        if (var607 == 5501) {
                            var2 -= 4;
                            int var501 = field3751[var2];
                            int var502 = field3751[var2 + 1];
                            int var503 = field3751[var2 + 2];
                            int var504 = field3751[var2 + 3];
                            class36.method178(var502, var503, (var501 >> 14 & 0x3FFF) - class70.field767, var504, (byte) 56, (var501 & 0x3FFF) - class291.field3961);
                            continue;
                        }
                        if (var607 == 5502) {
                            var2 -= 6;
                            int var505 = field3751[var2];
                            if (var505 >= 2) {
                                throw new RuntimeException();
                            }
                            class141.field1804 = var505;
                            int var506 = field3751[var2 + 1];
                            if (var506 + 1 >= class351.field4903[class141.field1804].length >> 1) {
                                throw new RuntimeException();
                            }
                            class53.field521 = var506;
                            class294.field3995 = 0;
                            class379.field5358 = field3751[var2 + 2];
                            class438.field6400 = field3751[var2 + 3];
                            int var507 = field3751[var2 + 4];
                            if (var507 >= 2) {
                                throw new RuntimeException();
                            }
                            class61.field622 = var507;
                            int var508 = field3751[var2 + 5];
                            if (var508 + 1 >= class351.field4903[class61.field622].length >> 1) {
                                throw new RuntimeException();
                            }
                            class398.field5728 = var508;
                            class294.field3993 = 3;
                            continue;
                        }
                        if (var607 == 5503) {
                            class298.method1753(28);
                            continue;
                        }
                        if (var607 == 5504) {
                            var2 -= 2;
                            class271.method1504(field3751[var2], field3751[var2 + 1], 0, (byte) 19);
                            continue;
                        }
                        if (var607 == 5505) {
                            field3751[var2++] = (int) class41.field432 >> 3;
                            continue;
                        }
                        if (var607 == 5506) {
                            field3751[var2++] = (int) class425.field6241 >> 3;
                            continue;
                        }
                        if (var607 == 5507) {
                            class200.method1087((byte) 99);
                            continue;
                        }
                        if (var607 == 5508) {
                            class307.method1800((byte) -33);
                            continue;
                        }
                        if (var607 == 5509) {
                            class140.method765(-18522);
                            continue;
                        }
                        if (var607 == 5510) {
                            class289.method1711((byte) -125);
                            continue;
                        }
                        if (var607 == 5511) {
                            var2--;
                            int var509 = field3751[var2];
                            int var510 = var509 >> 14 & 0x3FFF;
                            int var511 = var509 & 0x3FFF;
                            int var512 = var510 - class70.field767;
                            if (var512 < 0) {
                                var512 = 0;
                            } else if (var512 >= class315.field4214) {
                                var512 = class315.field4214;
                            }
                            int var513 = var511 - class291.field3961;
                            if (var513 < 0) {
                                var513 = 0;
                            } else if (var513 >= class340.field4549) {
                                var513 = class340.field4549;
                            }
                            class274.field3698 = var512 * 128 + 64;
                            class91.field1030 = var513 * 128 + 64;
                            class294.field3993 = 4;
                            continue;
                        }
                        if (var607 == 5512) {
                            class18.method86(96);
                            continue;
                        }
                    } else if (var607 < 5700) {
                        if (var607 == 5600) {
                            var3 -= 2;
                            String var514 = field3741[var3];
                            String var515 = field3741[var3 + 1];
                            var2--;
                            int var516 = field3751[var2];
                            if (class129.field1664 == 10 && class248.field3339 == 0 && class263.field3595 == 0 && class351.field4913 == 0 && class264.field3607 == 0) {
                                class356.method2168(0, var516, var514, var515);
                            }
                            continue;
                        }
                        if (var607 == 5601) {
                            class242.method1298(6);
                            continue;
                        }
                        if (var607 == 5602) {
                            if (class263.field3595 == 0) {
                                class297.field4046 = -2;
                            }
                            continue;
                        }
                        if (var607 == 5603) {
                            var2 -= 4;
                            if (class129.field1664 == 10 && class248.field3339 == 0 && class263.field3595 == 0 && class351.field4913 == 0 && class264.field3607 == 0) {
                                class220.method1192(field3751[var2], field3751[var2 + 2], 123, field3751[var2 + 3], field3751[var2 + 1]);
                            }
                            continue;
                        }
                        if (var607 == 5604) {
                            var3--;
                            if (class129.field1664 == 10 && class248.field3339 == 0 && class263.field3595 == 0 && class351.field4913 == 0 && class264.field3607 == 0) {
                                class385.method2389((byte) 124, class317.method1829(-106, field3741[var3]));
                            }
                            continue;
                        }
                        if (var607 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class129.field1664 == 10 && class248.field3339 == 0 && class263.field3595 == 0 && class351.field4913 == 0 && class264.field3607 == 0) {
                                class420.method2618(field3751[var2], field3741[var3 + 1], 0, field3741[var3 + 2], field3751[var2 + 6] == 1, class317.method1829(-26, field3741[var3]), field3751[var2 + 4] == 1, field3751[var2 + 2], field3751[var2 + 1], field3751[var2 + 3], field3751[var2 + 5] == 1);
                            }
                            continue;
                        }
                        if (var607 == 5606) {
                            if (class351.field4913 == 0) {
                                class388.field5529 = -2;
                            }
                            continue;
                        }
                        if (var607 == 5607) {
                            field3751[var2++] = class297.field4046;
                            continue;
                        }
                        if (var607 == 5608) {
                            field3751[var2++] = class395.field5686;
                            continue;
                        }
                        if (var607 == 5609) {
                            field3751[var2++] = class388.field5529;
                            continue;
                        }
                        if (var607 == 5610) {
                            for (int var517 = 0; var517 < 5; var517++) {
                                field3741[var3++] = class96.field1144.length > var517 ? class248.method1322(-4349, class96.field1144[var517]) : "";
                            }
                            class96.field1144 = null;
                            continue;
                        }
                        if (var607 == 5611) {
                            field3751[var2++] = class396.field5695;
                            continue;
                        }
                    } else if (var607 < 6100) {
                        if (var607 == 6001) {
                            var2--;
                            int var518 = field3751[var2];
                            if (var518 < 1) {
                                var518 = 1;
                            }
                            if (var518 > 4) {
                                var518 = 4;
                            }
                            class168.field2125 = var518;
                            class418.method2598(30);
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6002) {
                            var2--;
                            class424.method2637(field3751[var2] == 1, -1417244891);
                            class414.method2571((byte) -36);
                            class418.method2598(30);
                            class352.method2158((byte) -42);
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6003) {
                            var2--;
                            class177.field2217 = field3751[var2] == 1;
                            class352.method2158((byte) -42);
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6005) {
                            var2--;
                            class216.field2905 = field3751[var2] == 1;
                            class418.method2598(30);
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6006) {
                            var2--;
                            class92.field1058 = field3751[var2] == 1;
                            class88.field1003.method1558(!class92.field1058);
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6007) {
                            var2--;
                            class295.field4005 = field3751[var2];
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6008) {
                            var2--;
                            class448.field6510 = field3751[var2] == 1;
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6009) {
                            var2--;
                            class2.field19 = field3751[var2] == 1;
                            class418.method2598(30);
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6010) {
                            var2--;
                            class405.field5900 = field3751[var2] == 1;
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6011) {
                            var2--;
                            int var519 = field3751[var2];
                            if (var519 < 0 || var519 > 2) {
                                var519 = 0;
                            }
                            class169.field2133 = var519;
                            class418.method2598(30);
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6012) {
                            var2--;
                            class199.field2664 = field3751[var2] == 1;
                            class368.method2226(-275);
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6014) {
                            var2--;
                            class29.field278 = field3751[var2] == 1;
                            class418.method2598(30);
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6015) {
                            var2--;
                            class264.field3609 = field3751[var2] == 1;
                            class418.method2598(30);
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6016) {
                            var2--;
                            int var520 = field3751[var2];
                            if (var520 < 0 || var520 > 2) {
                                var520 = 0;
                            }
                            class424.field6226 = var520;
                            class382.method2359(-12699);
                            class340.method1982(6288, class159.field2055);
                            continue;
                        }
                        if (var607 == 6017) {
                            var2--;
                            class84.field942 = field3751[var2] == 1;
                            class56.method290((byte) 10);
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6018) {
                            var2--;
                            int var521 = field3751[var2];
                            if (var521 < 0) {
                                var521 = 0;
                            }
                            if (var521 > 127) {
                                var521 = 127;
                            }
                            class63.field653 = var521;
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6019) {
                            var2--;
                            int var522 = field3751[var2];
                            if (var522 < 0) {
                                var522 = 0;
                            }
                            if (var522 > 255) {
                                var522 = 255;
                            }
                            if (class160.field2062 != var522) {
                                if (class160.field2062 == 0 && class200.field2668 != -1) {
                                    class319.method1840(14652, class283.field3875, var522, class200.field2668, false, 0);
                                    class41.field431 = false;
                                } else if (var522 == 0) {
                                    class222.method1199(-1);
                                    class41.field431 = false;
                                } else {
                                    class204.method1106((byte) -51, var522);
                                }
                                class160.field2062 = var522;
                            }
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6020) {
                            var2--;
                            int var523 = field3751[var2];
                            if (var523 < 0) {
                                var523 = 0;
                            }
                            if (var523 > 127) {
                                var523 = 127;
                            }
                            class295.field4002 = var523;
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6021) {
                            var2--;
                            class177.field2211 = field3751[var2] == 1;
                            class352.method2158((byte) -42);
                            continue;
                        }
                        if (var607 == 6023) {
                            var2--;
                            int var524 = field3751[var2];
                            boolean var525 = false;
                            if (var524 < 0) {
                                var524 = 0;
                            }
                            if (var524 > 2) {
                                var524 = 2;
                            }
                            if (class436.field6389 < 96) {
                                var524 = 0;
                                var525 = true;
                            }
                            class34.method163(-65, var524);
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            field3751[var2++] = var525 ? 0 : 1;
                            continue;
                        }
                        if (var607 == 6024) {
                            var2--;
                            int var526 = field3751[var2];
                            if (var526 < 0 || var526 > 2) {
                                var526 = 0;
                            }
                            class9.field80 = var526;
                            class340.method1982(6288, class159.field2055);
                            continue;
                        }
                        if (var607 == 6025) {
                            var2--;
                            int var527 = field3751[var2];
                            if (var527 < 0 || var527 > 3) {
                                var527 = 0;
                            }
                            class292.field3962 = var527;
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                        if (var607 == 6027) {
                            var2--;
                            int var528 = field3751[var2];
                            if (var528 < 0 || var528 > 1) {
                                var528 = 0;
                            }
                            class188.method1012(var528 == 1, -1);
                            continue;
                        }
                        if (var607 == 6028) {
                            var2--;
                            class274.field3689 = field3751[var2] != 0;
                            class340.method1982(6288, class159.field2055);
                            continue;
                        }
                        if (var607 == 6029) {
                            var2--;
                            class295.field4005 = field3751[var2];
                            class340.method1982(6288, class159.field2055);
                            continue;
                        }
                        if (var607 == 6030) {
                            var2--;
                            class297.field4040 = field3751[var2] != 0;
                            class340.method1982(6288, class159.field2055);
                            class418.method2598(30);
                            continue;
                        }
                        if (var607 == 6031) {
                            var2--;
                            int var529 = field3751[var2];
                            if (var529 < 0 || var529 > 3) {
                                var529 = 2;
                            }
                            class429.method2657(var529, 616516448);
                            continue;
                        }
                        if (var607 == 6032) {
                            var2--;
                            int var530 = field3751[var2];
                            if (var530 < 0 || var530 > 3) {
                                var530 = 2;
                            }
                            class417.field6000 = var530;
                            class340.method1982(6288, class159.field2055);
                            class114.field1416 = false;
                            continue;
                        }
                    } else if (var607 < 6200) {
                        if (var607 == 6101) {
                            field3751[var2++] = class168.field2125;
                            continue;
                        }
                        if (var607 == 6102) {
                            field3751[var2++] = class138.method758(-10762) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6103) {
                            field3751[var2++] = class177.field2217 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6105) {
                            field3751[var2++] = class216.field2905 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6106) {
                            field3751[var2++] = class92.field1058 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6107) {
                            field3751[var2++] = class295.field4005;
                            continue;
                        }
                        if (var607 == 6108) {
                            field3751[var2++] = class448.field6510 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6109) {
                            field3751[var2++] = class2.field19 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6110) {
                            field3751[var2++] = class405.field5900 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6111) {
                            field3751[var2++] = class169.field2133;
                            continue;
                        }
                        if (var607 == 6112) {
                            field3751[var2++] = class199.field2664 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6114) {
                            field3751[var2++] = class29.field278 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6115) {
                            field3751[var2++] = class264.field3609 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6116) {
                            field3751[var2++] = class424.field6226;
                            continue;
                        }
                        if (var607 == 6117) {
                            field3751[var2++] = class84.field942 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6118) {
                            field3751[var2++] = class63.field653;
                            continue;
                        }
                        if (var607 == 6119) {
                            field3751[var2++] = class160.field2062;
                            continue;
                        }
                        if (var607 == 6120) {
                            field3751[var2++] = class295.field4002;
                            continue;
                        }
                        if (var607 == 6121) {
                            field3751[var2++] = class88.field1003.method1570() ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6123) {
                            field3751[var2++] = class444.method2757(-32724);
                            continue;
                        }
                        if (var607 == 6124) {
                            field3751[var2++] = class9.field80;
                            continue;
                        }
                        if (var607 == 6125) {
                            field3751[var2++] = class292.field3962;
                            continue;
                        }
                        if (var607 == 6126) {
                            field3751[var2++] = class88.field1003.method1619() ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6127) {
                            field3751[var2++] = class225.field3041 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6128) {
                            field3751[var2++] = class274.field3689 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6129) {
                            field3751[var2++] = class295.field4005;
                            continue;
                        }
                        if (var607 == 6130) {
                            field3751[var2++] = class297.field4040 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6131) {
                            field3751[var2++] = class101.field1182;
                            continue;
                        }
                        if (var607 == 6132) {
                            field3751[var2++] = class417.field6000;
                            continue;
                        }
                        if (var607 == 6133) {
                            field3751[var2++] = class450.field6549 == 1 || class450.field6549 == 4 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6300) {
                        if (var607 == 6200) {
                            var2 -= 2;
                            class136.field1743 = (short) field3751[var2];
                            if (class136.field1743 <= 0) {
                                class136.field1743 = 256;
                            }
                            class260.field3551 = (short) field3751[var2 + 1];
                            if (class260.field3551 <= 0) {
                                class260.field3551 = 205;
                            }
                            continue;
                        }
                        if (var607 == 6201) {
                            var2 -= 2;
                            class305.field4133 = (short) field3751[var2];
                            if (class305.field4133 <= 0) {
                                class305.field4133 = 256;
                            }
                            class118.field1475 = (short) field3751[var2 + 1];
                            if (class118.field1475 <= 0) {
                                class118.field1475 = 320;
                            }
                            continue;
                        }
                        if (var607 == 6202) {
                            var2 -= 4;
                            class191.field2410 = (short) field3751[var2];
                            if (class191.field2410 <= 0) {
                                class191.field2410 = 1;
                            }
                            class115.field1438 = (short) field3751[var2 + 1];
                            if (class115.field1438 <= 0) {
                                class115.field1438 = 32767;
                            } else if (class115.field1438 < class191.field2410) {
                                class115.field1438 = class191.field2410;
                            }
                            class208.field2833 = (short) field3751[var2 + 2];
                            if (class208.field2833 <= 0) {
                                class208.field2833 = 1;
                            }
                            class188.field2369 = (short) field3751[var2 + 3];
                            if (class188.field2369 <= 0) {
                                class188.field2369 = 32767;
                            } else if (class188.field2369 < class208.field2833) {
                                class188.field2369 = class208.field2833;
                            }
                            continue;
                        }
                        if (var607 == 6203) {
                            class142.method772(class243.field3308.field2460, (byte) 87, 0, false, 0, class243.field3308.field2501);
                            field3751[var2++] = class71.field788;
                            field3751[var2++] = class376.field5279;
                            continue;
                        }
                        if (var607 == 6204) {
                            field3751[var2++] = class305.field4133;
                            field3751[var2++] = class118.field1475;
                            continue;
                        }
                        if (var607 == 6205) {
                            field3751[var2++] = class136.field1743;
                            field3751[var2++] = class260.field3551;
                            continue;
                        }
                    } else if (var607 < 6400) {
                        if (var607 == 6300) {
                            field3751[var2++] = (int) (class442.method2730(25207) / 60000L);
                            continue;
                        }
                        if (var607 == 6301) {
                            field3751[var2++] = (int) (class442.method2730(25207) / 86400000L) - 11745;
                            continue;
                        }
                        if (var607 == 6302) {
                            var2 -= 3;
                            int var531 = field3751[var2];
                            int var532 = field3751[var2 + 1];
                            int var533 = field3751[var2 + 2];
                            field3754.clear();
                            field3754.set(11, 12);
                            field3754.set(var533, var532, var531);
                            field3751[var2++] = (int) (field3754.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var607 == 6303) {
                            field3754.clear();
                            field3754.setTime(new Date(class442.method2730(25207)));
                            field3751[var2++] = field3754.get(1);
                            continue;
                        }
                        if (var607 == 6304) {
                            var2--;
                            int var534 = field3751[var2];
                            boolean var535 = true;
                            if (var534 < 0) {
                                var535 = (var534 + 1) % 4 == 0;
                            } else if (var534 < 1582) {
                                var535 = var534 % 4 == 0;
                            } else if (var534 % 4 != 0) {
                                var535 = false;
                            } else if (var534 % 100 != 0) {
                                var535 = true;
                            } else if (var534 % 400 != 0) {
                                var535 = false;
                            }
                            field3751[var2++] = var535 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6500) {
                        if (var607 == 6405) {
                            field3751[var2++] = class136.method734((byte) 84) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6406) {
                            field3751[var2++] = class383.method2369((byte) -114) ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6600) {
                        if (var607 == 6500) {
                            if (class129.field1664 == 10 && class248.field3339 == 0 && class263.field3595 == 0 && class351.field4913 == 0) {
                                field3751[var2++] = class98.method534(26213) == -1 ? 0 : 1;
                                continue;
                            }
                            field3751[var2++] = 1;
                            continue;
                        }
                        if (var607 == 6501) {
                            class156 var536 = class272.method1507((byte) -83);
                            if (var536 == null) {
                                field3751[var2++] = -1;
                                field3751[var2++] = 0;
                                field3741[var3++] = "";
                                field3751[var2++] = 0;
                                field3741[var3++] = "";
                                field3751[var2++] = 0;
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = var536.field1975;
                                field3751[var2++] = var536.field3484;
                                field3741[var3++] = var536.field1981;
                                class272 var537 = var536.method840(76);
                                field3751[var2++] = var537.field3675;
                                field3741[var3++] = var537.field3673;
                                field3751[var2++] = var536.field3482;
                                field3751[var2++] = var536.field1974;
                            }
                            continue;
                        }
                        if (var607 == 6502) {
                            class156 var538 = class435.method2688(true);
                            if (var538 == null) {
                                field3751[var2++] = -1;
                                field3751[var2++] = 0;
                                field3741[var3++] = "";
                                field3751[var2++] = 0;
                                field3741[var3++] = "";
                                field3751[var2++] = 0;
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = var538.field1975;
                                field3751[var2++] = var538.field3484;
                                field3741[var3++] = var538.field1981;
                                class272 var539 = var538.method840(116);
                                field3751[var2++] = var539.field3675;
                                field3741[var3++] = var539.field3673;
                                field3751[var2++] = var538.field3482;
                                field3751[var2++] = var538.field1974;
                            }
                            continue;
                        }
                        if (var607 == 6503) {
                            var2--;
                            int var540 = field3751[var2];
                            if (class129.field1664 == 10 && class248.field3339 == 0 && class263.field3595 == 0 && class351.field4913 == 0) {
                                field3751[var2++] = class188.method1015(-26378, var540) ? 1 : 0;
                                continue;
                            }
                            field3751[var2++] = 0;
                            continue;
                        }
                        if (var607 == 6504) {
                            var2--;
                            class289.field3931 = field3751[var2];
                            class340.method1982(6288, class159.field2055);
                            continue;
                        }
                        if (var607 == 6505) {
                            field3751[var2++] = class289.field3931;
                            continue;
                        }
                        if (var607 == 6506) {
                            var2--;
                            int var541 = field3751[var2];
                            class156 var542 = class131.method700((byte) -105, var541);
                            if (var542 == null) {
                                field3751[var2++] = -1;
                                field3741[var3++] = "";
                                field3751[var2++] = 0;
                                field3741[var3++] = "";
                                field3751[var2++] = 0;
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = var542.field3484;
                                field3741[var3++] = var542.field1981;
                                class272 var543 = var542.method840(105);
                                field3751[var2++] = var543.field3675;
                                field3741[var3++] = var543.field3673;
                                field3751[var2++] = var542.field3482;
                                field3751[var2++] = var542.field1974;
                            }
                            continue;
                        }
                        if (var607 == 6507) {
                            var2 -= 4;
                            int var544 = field3751[var2];
                            boolean var545 = field3751[var2 + 1] == 1;
                            int var546 = field3751[var2 + 2];
                            boolean var547 = field3751[var2 + 3] == 1;
                            class57.method298(var545, var546, -1, var547, var544);
                            continue;
                        }
                        if (var607 == 6508) {
                            class211.method1147(-1);
                            continue;
                        }
                        if (var607 == 6509) {
                            if (class129.field1664 == 10) {
                                var2--;
                                if (field3751[var2] == 1) {
                                    if (class17.field162 == null) {
                                        class17.field162 = new class249();
                                    }
                                } else if (class17.field162 != null) {
                                    class17.field162.method1328((byte) 96);
                                    class17.field162 = null;
                                }
                            }
                            continue;
                        }
                    } else if (var607 < 6700) {
                        if (var607 == 6600) {
                            var2--;
                            class165.field2104 = field3751[var2] == 1;
                            class340.method1982(6288, class159.field2055);
                            continue;
                        }
                        if (var607 == 6601) {
                            field3751[var2++] = class165.field2104 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6800 && class14.field131 == 2) {
                        if (var607 == 6700) {
                            int var548 = class337.field4495.method311(3369);
                            if (class272.field3680 != -1) {
                                var548++;
                            }
                            field3751[var2++] = var548;
                            continue;
                        }
                        if (var607 == 6701) {
                            var2--;
                            int var549 = field3751[var2];
                            if (class272.field3680 != -1) {
                                if (var549 == 0) {
                                    field3751[var2++] = class272.field3680;
                                    continue;
                                }
                                var549--;
                            }
                            class141 var550 = (class141) class337.field4495.method315((byte) -64);
                            while (var549-- > 0) {
                                var550 = (class141) class337.field4495.method310(-80);
                            }
                            field3751[var2++] = var550.field1802;
                            continue;
                        }
                        if (var607 == 6702) {
                            var2--;
                            int var551 = field3751[var2];
                            if (class235.field3227[var551] == null) {
                                field3741[var3++] = "";
                            } else {
                                String var552 = class235.field3227[var551][0].field2456;
                                if (var552 == null) {
                                    field3741[var3++] = "";
                                } else {
                                    field3741[var3++] = var552.substring(0, var552.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var607 == 6703) {
                            var2--;
                            int var553 = field3751[var2];
                            if (class235.field3227[var553] == null) {
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = class235.field3227[var553].length;
                            }
                            continue;
                        }
                        if (var607 == 6704) {
                            var2 -= 2;
                            int var554 = field3751[var2];
                            int var555 = field3751[var2 + 1];
                            if (class235.field3227[var554] == null) {
                                field3741[var3++] = "";
                            } else {
                                String var556 = class235.field3227[var554][var555].field2456;
                                if (var556 == null) {
                                    field3741[var3++] = "";
                                } else {
                                    field3741[var3++] = var556;
                                }
                            }
                            continue;
                        }
                        if (var607 == 6705) {
                            var2 -= 2;
                            int var557 = field3751[var2];
                            int var558 = field3751[var2 + 1];
                            if (class235.field3227[var557] == null) {
                                field3751[var2++] = 0;
                            } else {
                                field3751[var2++] = class235.field3227[var557][var558].field2589;
                            }
                            continue;
                        }
                        if (var607 == 6706) {
                            continue;
                        }
                        if (var607 == 6707) {
                            var2 -= 3;
                            int var559 = field3751[var2];
                            int var560 = field3751[var2 + 1];
                            int var561 = field3751[var2 + 2];
                            class128.method690(1, var559 << 16 | var560, 5, var561, "");
                            continue;
                        }
                        if (var607 == 6708) {
                            var2 -= 3;
                            int var562 = field3751[var2];
                            int var563 = field3751[var2 + 1];
                            int var564 = field3751[var2 + 2];
                            class128.method690(2, var562 << 16 | var563, 5, var564, "");
                            continue;
                        }
                        if (var607 == 6709) {
                            var2 -= 3;
                            int var565 = field3751[var2];
                            int var566 = field3751[var2 + 1];
                            int var567 = field3751[var2 + 2];
                            class128.method690(3, var565 << 16 | var566, 5, var567, "");
                            continue;
                        }
                        if (var607 == 6710) {
                            var2 -= 3;
                            int var568 = field3751[var2];
                            int var569 = field3751[var2 + 1];
                            int var570 = field3751[var2 + 2];
                            class128.method690(4, var568 << 16 | var569, 5, var570, "");
                            continue;
                        }
                        if (var607 == 6711) {
                            var2 -= 3;
                            int var571 = field3751[var2];
                            int var572 = field3751[var2 + 1];
                            int var573 = field3751[var2 + 2];
                            class128.method690(5, var571 << 16 | var572, 5, var573, "");
                            continue;
                        }
                        if (var607 == 6712) {
                            var2 -= 3;
                            int var574 = field3751[var2];
                            int var575 = field3751[var2 + 1];
                            int var576 = field3751[var2 + 2];
                            class128.method690(6, var574 << 16 | var575, 5, var576, "");
                            continue;
                        }
                        if (var607 == 6713) {
                            var2 -= 3;
                            int var577 = field3751[var2];
                            int var578 = field3751[var2 + 1];
                            int var579 = field3751[var2 + 2];
                            class128.method690(7, var577 << 16 | var578, 5, var579, "");
                            continue;
                        }
                        if (var607 == 6714) {
                            var2 -= 3;
                            int var580 = field3751[var2];
                            int var581 = field3751[var2 + 1];
                            int var582 = field3751[var2 + 2];
                            class128.method690(8, var580 << 16 | var581, 5, var582, "");
                            continue;
                        }
                        if (var607 == 6715) {
                            var2 -= 3;
                            int var583 = field3751[var2];
                            int var584 = field3751[var2 + 1];
                            int var585 = field3751[var2 + 2];
                            class128.method690(9, var583 << 16 | var584, 5, var585, "");
                            continue;
                        }
                        if (var607 == 6716) {
                            var2 -= 3;
                            int var586 = field3751[var2];
                            int var587 = field3751[var2 + 1];
                            int var588 = field3751[var2 + 2];
                            class128.method690(10, var586 << 16 | var587, 5, var588, "");
                            continue;
                        }
                        if (var607 == 6717) {
                            var2 -= 3;
                            int var589 = field3751[var2];
                            int var590 = field3751[var2 + 1];
                            int var591 = field3751[var2 + 2];
                            class194 var592 = class142.method769(-1, var591, var589 << 16 | var590);
                            class425.method2641(true);
                            class219 var593 = client.method1410(var592);
                            class278.method1536(var592.field2475, var592.field2544, var591, var593.field2929, var593.method1180((byte) 88), var589 << 16 | var590, -1);
                            continue;
                        }
                    } else if (var607 < 6900) {
                        if (var607 == 6800) {
                            var2--;
                            int var594 = field3751[var2];
                            class228 var595 = class283.method1668(-72, var594);
                            if (var595.field3123 == null) {
                                field3741[var3++] = "";
                            } else {
                                field3741[var3++] = var595.field3123;
                            }
                            continue;
                        }
                        if (var607 == 6801) {
                            var2--;
                            int var596 = field3751[var2];
                            class228 var597 = class283.method1668(-81, var596);
                            field3751[var2++] = var597.field3116;
                            continue;
                        }
                        if (var607 == 6802) {
                            var2--;
                            int var598 = field3751[var2];
                            class228 var599 = class283.method1668(-93, var598);
                            field3751[var2++] = var599.field3115;
                            continue;
                        }
                        if (var607 == 6803) {
                            var2--;
                            int var600 = field3751[var2];
                            class228 var601 = class283.method1668(-76, var600);
                            field3751[var2++] = var601.field3133;
                            continue;
                        }
                    }
                } else {
                    class194 var75;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var75 = class57.method301(field3751[var2], (byte) 67);
                    } else {
                        var75 = var37 ? field3735 : field3746;
                    }
                    if (var607 == 1300) {
                        var2--;
                        int var76 = field3751[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method1041(true, field3741[var3], var76);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var607 == 1301) {
                        var2 -= 2;
                        int var77 = field3751[var2];
                        int var78 = field3751[var2 + 1];
                        var75.field2571 = class142.method769(-1, var78, var77);
                        continue;
                    }
                    if (var607 == 1302) {
                        var2--;
                        var75.field2597 = field3751[var2] == 1;
                        continue;
                    }
                    if (var607 == 1303) {
                        var2--;
                        var75.field2536 = field3751[var2];
                        continue;
                    }
                    if (var607 == 1304) {
                        var2--;
                        var75.field2521 = field3751[var2];
                        continue;
                    }
                    if (var607 == 1305) {
                        var3--;
                        var75.field2535 = field3741[var3];
                        continue;
                    }
                    if (var607 == 1306) {
                        var3--;
                        var75.field2467 = field3741[var3];
                        continue;
                    }
                    if (var607 == 1307) {
                        var75.field2481 = null;
                        continue;
                    }
                    if (var607 == 1308) {
                        var2--;
                        var75.field2475 = field3751[var2];
                        var2--;
                        var75.field2544 = field3751[var2];
                        continue;
                    }
                    if (var607 == 1309) {
                        var2--;
                        int var79 = field3751[var2];
                        var2--;
                        int var80 = field3751[var2];
                        if (var80 >= 1 && var80 <= 10) {
                            var75.method1039(var80 - 1, -1, var79);
                        }
                        continue;
                    }
                    if (var607 == 1310) {
                        var3--;
                        var75.field2549 = field3741[var3];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var606) {
            if (arg0.field6563 == null) {
                class254.method1439(22292, var606, "CS2 - scr:" + arg0.field4510 + " op:" + var7);
            } else {
                class371.method2240("Clientscript error in: " + arg0.field6563, 122);
                StringBuffer var603 = new StringBuffer(30);
                var603.append("Clientscript error in: ").append(arg0.field6563).append("\n");
                for (int var604 = field3745 - 1; var604 >= 0; var604--) {
                    var603.append("via: ").append(field3748[var604].field2212.field6563).append("\n");
                }
                var603.append("Op: ").append(var7).append("\n");
                String var605 = var606.getMessage();
                if (var605 != null && var605.length() > 0) {
                    var603.append("Message: ").append(var605).append("\n");
                }
                class254.method1439(22292, var606, var603.toString());
                class418.method2592(var603.toString(), false);
            }
        }
    }
}

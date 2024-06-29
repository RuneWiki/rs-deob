import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class54 extends class366 {

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "[I")
    public static int[] field699 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    public int field701;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "Ljava/lang/String;")
    public String field696;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "[I")
    public int[] field697;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "[I")
    public int[] field700;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "[Ldj;")
    public class191[] field692;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "[Ljava/lang/String;")
    public String[] field705;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)V", line = 10)
    public static void method345(byte arg0) {
        field699 = null;
        if (arg0 < 42) {
            method345((byte) -12);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(Z)V", line = 20)
    public static final void method346(boolean arg0) {
        field691++;
        if (class284.field4139.length() == 0) {
            return;
        }
        class295.method1999((byte) -114, "--> " + class284.field4139);
        class258.method1789(arg0, class284.field4139, false);
        class198.field2836 = 0;
        class137.field2111 = 0;
        class284.field4139 = "";
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I", line = 36)
    public static final int method347(int arg0, int arg1) {
        if (arg0 != 21511) {
            method348(56, true, -16, 114, true, true, -113, -116);
        }
        field698++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZIIZZII)V", line = 56)
    public static final void method348(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        field703++;
        if (!arg1 && class327.field4741 == arg3 && class171.field2415 == arg2 && class40.field558 == arg6 || class296.method2000((byte) -57)) {
            return;
        }
        class171.field2415 = arg2;
        class327.field4741 = arg3;
        class40.field558 = arg6;
        if (class296.method2000((byte) -35)) {
            class40.field558 = 0;
        }
        if (arg4) {
            class390.method2463(28, true);
        } else {
            class390.method2463(25, true);
        }
        class135.method1044(arg5, 30585, class169.field2394.method2284((byte) 91, class309.field4497), class402.field5648);
        int var8 = class306.field4459;
        class306.field4459 = (class327.field4741 - (class80.field1034 >> 4)) * 8;
        int var9 = class342.field4959;
        class342.field4959 = (class171.field2415 - (class381.field5414 >> 4)) * 8;
        class374.field5330 = class176.method1260(class327.field4741 * 8, class171.field2415 * 8);
        class24.field297 = null;
        int var10 = class306.field4459 - var8;
        int var11 = class342.field4959 - var9;
        if (arg4) {
            class229.field3396 = 0;
            int var15 = class80.field1034 * 128 - 128;
            int var16 = class381.field5414 * 128 - 128;
            for (int var17 = 0; var17 < 32768; var17++) {
                class446 var22 = class442.field6317[var17];
                if (var22 != null) {
                    var22.field4466 -= var11 * 128;
                    var22.field4463 -= var10 * 128;
                    if (var22.field4463 >= 0 && var22.field4463 <= var15 && var22.field4466 >= 0 && var22.field4466 <= var16) {
                        boolean var23 = true;
                        for (int var24 = 0; var24 < 10; var24++) {
                            var22.field4595[var24] -= var10;
                            var22.field4601[var24] -= var11;
                            if (var22.field4595[var24] < 0 || class80.field1034 <= var22.field4595[var24] || var22.field4601[var24] < 0 || class381.field5414 <= var22.field4601[var24]) {
                                var23 = false;
                            }
                        }
                        if (var23) {
                            class431.field6169[class229.field3396++] = var17;
                        } else {
                            class442.field6317[var17].method2781((class346) null, (byte) 114);
                            class442.field6317[var17] = null;
                        }
                    } else {
                        class442.field6317[var17].method2781((class346) null, (byte) 122);
                        class442.field6317[var17] = null;
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < 32768; var12++) {
                class446 var13 = class442.field6317[var12];
                if (var13 != null) {
                    for (int var14 = 0; var14 < 10; var14++) {
                        var13.field4595[var14] -= var10;
                        var13.field4601[var14] -= var11;
                    }
                    var13.field4463 -= var10 * 128;
                    var13.field4466 -= var11 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class128 var20 = class243.field3596[var18];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field4595[var21] -= var10;
                    var20.field4601[var21] -= var11;
                }
                var20.field4463 -= var10 * 128;
                var20.field4466 -= var11 * 128;
            }
        }
        class158.field2302 = arg6;
        class181.field2555.method779(-3, class158.field2302, arg7, false, arg0);
        class266.method1822(var11, 101, var10);
        for (class102 var19 = (class102) class128.field1810.method2752(-92); var19 != null; var19 = (class102) class128.field1810.method2754(-1)) {
            var19.field1289 -= var10;
            var19.field1285 -= var11;
            if (var19.field1289 < 0 || var19.field1285 < 0 || class80.field1034 <= var19.field1289 || class381.field5414 <= var19.field1285) {
                var19.method2660((byte) 126);
            }
        }
        if (class218.field3132 != 0) {
            class72.field944 -= var11;
            class218.field3132 -= var10;
        }
        class221.field3176 = 0;
        if (arg4) {
            class308.field4486 -= var11;
            class120.field1620 -= var10;
            class417.field5999 -= var11 * 128;
            class386.field5469 -= var10 * 128;
            class32.field397 -= var10;
            class96.field1234 -= var11;
            if (Math.abs(var10) > class80.field1034 || Math.abs(var11) > class381.field5414) {
                class349.method2289((byte) -80);
            }
        } else if (class336.field4878 == 4) {
            class302.field4402 -= var10 * 128;
            class431.field6168 -= var11 * 128;
            class165.field2348 -= var11 * 128;
            class323.field4712 -= var10 * 128;
        } else {
            class336.field4878 = 1;
        }
        class84.method492(0);
        class276.method1879((byte) 55);
        class319.field4666.method2755(0);
        class335.field4860.method2755(0);
        class113.field1457.method1083((byte) -115);
        class92.method549((byte) -82);
    }
}

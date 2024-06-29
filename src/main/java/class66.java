import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class66 {

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "[C")
    public static char[] field935 = new char[128];

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "Ljava/lang/String;")
    public static String field939 = null;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field942 = 0;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "[I")
    public static int[] field943 = new int[250];

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "Z")
    public static boolean field941 = false;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field944 = 500;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "Lqj;")
    public static class238 field937;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lnr;Lgm;[Lbi;IZB)V", line = 9)
    public static final void method429(class437 arg0, class337 arg1, class138[] arg2, int arg3, boolean arg4, byte arg5) {
        field940++;
        if (!arg4) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < class324.field4652; var7++) {
                    for (int var8 = 0; var8 < class336.field4964; var8++) {
                        if ((class37.field606[var6][var7][var8] & 0x1) != 0) {
                            int var9 = var6;
                            if ((class37.field606[1][var7][var8] & 0x2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg2[var9].method923(var8, -53, var7);
                            }
                        }
                    }
                }
            }
        }
        int[][] var10 = new int[class324.field4652][class336.field4964];
        if (arg5 >= -103) {
            method430(63, -21, -109, false, true);
        }
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var13 = 0; var13 < class336.field4964; var13++) {
                class370.field5512[var13] = 0;
                class31.field527[var13] = 0;
                class405.field6089[var13] = 0;
                class436.field6402[var13] = 0;
                class269.field3934[var13] = 0;
            }
            for (int var14 = -5; var14 < class324.field4652; var14++) {
                for (int var15 = 0; var15 < class336.field4964; var15++) {
                    int var24 = var14 + 5;
                    int var10002;
                    if (var24 < class324.field4652) {
                        int var25 = class300.field4296[var11][var24][var15] & 0xFF;
                        if (var25 > 0) {
                            class340 var26 = class135.method907(-114, var25 - 1);
                            class370.field5512[var15] += var26.field4996;
                            class31.field527[var15] += var26.field4998;
                            class405.field6089[var15] += var26.field4999;
                            class436.field6402[var15] += var26.field5001;
                            var10002 = class269.field3934[var15]++;
                        }
                    }
                    int var27 = var14 - 5;
                    if (var27 >= 0) {
                        int var28 = class300.field4296[var11][var27][var15] & 0xFF;
                        if (var28 > 0) {
                            class340 var29 = class135.method907(-128, var28 - 1);
                            class370.field5512[var15] -= var29.field4996;
                            class31.field527[var15] -= var29.field4998;
                            class405.field6089[var15] -= var29.field4999;
                            class436.field6402[var15] -= var29.field5001;
                            var10002 = class269.field3934[var15]--;
                        }
                    }
                }
                if (var14 >= 0) {
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < class336.field4964; var21++) {
                        int var22 = var21 + 5;
                        if (class336.field4964 > var22) {
                            var17 += class31.field527[var22];
                            var19 += class436.field6402[var22];
                            var20 += class269.field3934[var22];
                            var16 += class370.field5512[var22];
                            var18 += class405.field6089[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var17 -= class31.field527[var23];
                            var16 -= class370.field5512[var23];
                            var20 -= class269.field3934[var23];
                            var19 -= class436.field6402[var23];
                            var18 -= class405.field6089[var23];
                        }
                        if (var21 >= 0 && var19 > 0 && var20 > 0) {
                            var10[var14][var21] = class143.method959(var17 / var20, var18 / var20, var16 * 256 / var19, 13552);
                        }
                    }
                }
            }
            class324.method2001(arg0, class40.field639[var11], class336.field4964, class88.field1226[var11], class300.field4296[var11], class327.field4702[var11], class324.field4652, (byte) 79, arg1, var10, arg4, var11, class79.field1084[var11]);
            class300.field4296[var11] = null;
            class327.field4702[var11] = null;
            class79.field1084[var11] = null;
            class40.field639[var11] = null;
        }
        if (!arg4) {
            if (class417.field6217) {
                class311.method1941();
            }
            if (class176.field2300 != 0) {
                class63.method412();
            }
        }
        for (int var12 = 0; var12 < arg3; var12++) {
            class88.field1226[var12].method785();
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIZZ)V", line = 223)
    public static final void method430(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field934++;
        class154.field2021 = 0L;
        int var5 = class6.method51(-32);
        if (arg0 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (!class35.field574.method2073()) {
            arg3 = true;
        }
        class26.method237(arg1, var5, arg4, arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 245)
    public static final void method431(int arg0) {
        class17.field190 = null;
        if (arg0 != -172) {
            field944 = 64;
        }
        field938++;
        class126.field1684 = null;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V", line = 258)
    public static void method432(int arg0) {
        if (arg0 < 6) {
            field939 = null;
        }
        field935 = null;
        field937 = null;
        field939 = null;
        field943 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BJ)V", line = 272)
    public static final void method433(byte arg0, long arg1) {
        if (arg0 <= 52) {
            return;
        }
        field936++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }
}

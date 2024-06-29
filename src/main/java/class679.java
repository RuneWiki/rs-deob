import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class679 {

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "Lpr;")
    public static class407 field9615 = new class407(81, 2);

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "Lkfa;")
    public static class549 field9617 = new class549(79, 3);

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "Lkfa;")
    public static class549 field9618 = new class549(82, 7);

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "Lkfa;")
    public static class549 field9619 = new class549(56, 4);

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "[Lro;")
    public static class2[] field9620 = new class2[14];

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field9614;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field9616;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)Z", line = 9)
    public static final boolean method3794(boolean arg0) {
        for (int var1 = class472.field6593; var1 < class337.field4416; var1++) {
            class287[][] var2 = class97.field1074[var1];
            for (int var3 = -class658.field9390; var3 <= 0; var3++) {
                int var4 = class325.field4238 + var3;
                int var5 = class325.field4238 - var3;
                if (var4 >= class650.field9307 || var5 < class648.field9178) {
                    for (int var6 = -class658.field9390; var6 <= 0; var6++) {
                        int var7 = class75.field789 + var6;
                        int var8 = class75.field789 - var6;
                        if (var4 >= class650.field9307) {
                            if (var7 >= class147.field1649) {
                                class287 var9 = var2[var4][var7];
                                if (var9 != null && var9.field3682) {
                                    class526.field7524 = arg0;
                                    class81.field859.method1409(0, var9);
                                    class81.field859.method1412((byte) 121);
                                }
                            }
                            if (var8 < class585.field8323) {
                                class287 var10 = var2[var4][var8];
                                if (var10 != null && var10.field3682) {
                                    class526.field7524 = arg0;
                                    class81.field859.method1409(0, var10);
                                    class81.field859.method1412((byte) -50);
                                }
                            }
                        }
                        if (var5 < class648.field9178) {
                            if (var7 >= class147.field1649) {
                                class287 var11 = var2[var5][var7];
                                if (var11 != null && var11.field3682) {
                                    class526.field7524 = arg0;
                                    class81.field859.method1409(0, var11);
                                    class81.field859.method1412((byte) 72);
                                }
                            }
                            if (var8 < class585.field8323) {
                                class287 var12 = var2[var5][var8];
                                if (var12 != null && var12.field3682) {
                                    class526.field7524 = arg0;
                                    class81.field859.method1409(0, var12);
                                    class81.field859.method1412((byte) -109);
                                }
                            }
                        }
                        if (class195.field2336 == 0) {
                            if (class603.field8547) {
                                class81.field859.method1413(-8076, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(JIBIZ)Ljava/lang/String;", line = 116)
    public static final String method3795(long arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        field9614++;
        char var6 = ',';
        char var7 = '.';
        if (arg1 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg1 == 2) {
            var7 = ' ';
        }
        if (arg2 != -43) {
            return null;
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > 0) {
            for (int var10 = 0; var10 < arg3; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - (int) arg0 * 10));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)V", line = 195)
    public static void method3796(boolean arg0) {
        field9617 = null;
        field9620 = null;
        field9619 = null;
        field9618 = null;
        if (!arg0) {
            field9615 = null;
        }
        field9615 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIII)V", line = 210)
    public static final void method3797(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9616++;
        if (arg0 <= 0) {
            method3795(-84L, -15, (byte) 96, -99, false);
        }
        if (arg1 >= class326.field4246 && arg1 <= class163.field1942) {
            int var5 = class512.method2932((byte) -46, arg4, class501.field7217, class58.field602);
            int var6 = class512.method2932((byte) -46, arg2, class501.field7217, class58.field602);
            class347.method1924(var6, arg3, arg1, -22269, var5);
        }
    }
}

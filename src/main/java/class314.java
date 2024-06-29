import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class314 {

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field4593 = 0;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "Lmea;")
    public static class355 field4594 = new class355("", 10);

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "[I")
    public static int[] field4601 = new int[] { 3500, 200 };

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Lvg;")
    public static class622 field4597 = new class622(88, 8);

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "[Lrk;")
    public static class259[] field4598;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)V")
    public static final void method1949(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4599++;
        if (arg1 == 8 || arg1 == 16) {
            for (int var6 = 0; var6 < class261.field3398; var6++) {
                class203 var7 = class191.field2591[var6];
                if (var7.field2779 == arg1 && var7.field2781 == arg3 && var7.field2777 == arg2 || var7.field2783 == arg3 && var7.field2777 == arg2) {
                    if (class261.field3398 != var6) {
                        class667.method3744(class191.field2591, var6 + 1, class191.field2591, var6, class191.field2591.length - var6 - 1);
                    }
                    class261.field3398--;
                    return;
                }
            }
        } else {
            class44 var5 = class603.field8695[arg4][arg3][arg2];
            if (var5 != null) {
                if (arg1 == 1) {
                    var5.field665 = 0;
                } else if (arg1 == 2) {
                    var5.field676 = 0;
                }
            }
            class168.method1170(arg0 + 30);
        }
        if (arg0 != 1) {
            method1949(-93, -20, -103, -14, 34);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static void method1950(int arg0) {
        if (arg0 != 1436353504) {
            method1950(21);
        }
        field4594 = null;
        field4597 = null;
        field4601 = null;
        field4598 = null;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(IIIII)V")
    public static final void method1951(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4602++;
        float var5 = (float) class55.field869 / (float) class55.field851;
        int var6 = arg0;
        if (arg3 != 15081) {
            method1950(-116);
        }
        int var7 = arg2;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg1 - (arg0 - var6) / 2;
        int var9 = arg4 - (arg2 - var7) / 2;
        class425.field6217 = -1;
        class19.field375 = class55.field869 - (class55.field869 * var9 / var7);
        class519.field7277 = -1;
        class108.field1617 = class55.field851 * var8 / var6;
        class103.method734((byte) -103);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1952(int arg0, boolean arg1, int arg2) {
        field4603++;
        if (!arg1) {
            field4598 = null;
        }
        return class442.method2614(true, arg0, arg2) | (arg2 & 0x70000) != 0 || class566.method3263(arg0, arg2, 126);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lmv;IZIIIZ)V")
    public static final void method1953(class295 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg6) {
            return;
        }
        if (arg3 > 0) {
            class177.field2475 = 1;
            class258.field3346 = null;
            class634.field9148 = arg0;
            class303.field4504 = arg4;
            class20.field381 = arg5;
            class166.field2325 = arg1;
            class512.field7217 = arg2;
            class71.field1103 = class416.field6148.method3552(36) / arg3;
            if (class71.field1103 < 1) {
                class71.field1103 = 1;
            }
        } else {
            class78.method454(arg4, arg1, arg0, -23561, arg5, arg2);
        }
        field4600++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[S[Ljava/lang/String;II)V")
    public static final void method1954(int arg0, short[] arg1, String[] arg2, int arg3, int arg4) {
        if (arg3 < arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (var7 == null || arg2[var9] != null && arg2[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method1954(120, arg1, arg2, arg3, var6 - 1);
            method1954(119, arg1, arg2, var6 + 1, arg4);
        }
        field4596++;
        if (arg0 < 118) {
            field4594 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lr;I)V")
    public static final void method1955(class98 arg0, int arg1) {
        field4595++;
        if (!(class373.field5520 >= 2 || class240.field3164) || class188.field2561 != null) {
            return;
        }
        String var2;
        if (class240.field3164 && class373.field5520 < 2) {
            var2 = class697.field9824 + class279.field3657.method1654(arg1 + 38, class262.field3401) + class372.field5508 + " ->";
        } else if (class51.field790 && class18.field362.method1609(81, arg1 ^ 0xFFFF9492) && class373.field5520 > 2) {
            var2 = class443.method2616((class426) class152.field2150.field4475.field5735.field5735, 91);
        } else {
            class426 var3 = (class426) class152.field2150.field4475.field5735;
            var2 = class443.method2616(var3, 109);
            int[] var4 = null;
            if (class56.method352(var3.field6223, (byte) -91)) {
                var4 = class259.field3355.method2382((int) var3.field6231, (byte) 28).field5842;
            } else if (var3.field6227 != -1) {
                var4 = class259.field3355.method2382(var3.field6227, (byte) 28).field5842;
            } else if (class160.method1140(false, var3.field6223)) {
                class177 var5 = (class177) class271.field3550.method2002((byte) -114, (long) ((int) var3.field6231));
                if (var5 != null) {
                    class53 var6 = var5.field2476;
                    class76 var7 = var6.field805;
                    if (var7.field1212 != null) {
                        var7 = var7.method443(class308.field4545, (byte) 87);
                    }
                    if (var7 != null) {
                        var4 = var7.field1174;
                    }
                }
            } else if (class643.method3664(var3.field6223, false)) {
                Object var8 = null;
                class289 var9;
                if (var3.field6223 == 1007) {
                    var9 = class60.field965.method2596(0, (int) var3.field6231);
                } else {
                    var9 = class60.field965.method2596(arg1 ^ 0x51, (int) (var3.field6231 >>> 32 & 0x7FFFFFFFL));
                }
                if (var9.field4213 != null) {
                    var9 = var9.method1788(class308.field4545, -83);
                }
                if (var9 != null) {
                    var4 = var9.field4247;
                }
            }
            if (var4 != null) {
                var2 = var2 + class365.method2237(var4, arg1 ^ 0xFFFFBDA4);
            }
        }
        if (class373.field5520 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class373.field5520 - 2) + class279.field3650.method1654(-55, class262.field3401);
        }
        if (client.field1440 != null) {
            class393 var11 = client.field1440.method35(arg1 ^ 0xFFFFFFAE, arg0);
            if (var11 == null) {
                var11 = class395.field5976;
            }
            var11.method2436(client.field1440.field131, class56.field874, var2, class203.field2768, client.field1440.field147, class224.field2975, -1, client.field1440.field76, class386.field5772, class19.field373, client.field1440.field171, class305.field4525, client.field1440.field202, client.field1440.field168, class696.field9796);
            class430.method2569(class305.field4525[3], 0, class305.field4525[0], class305.field4525[2], class305.field4525[1]);
        } else if (class565.field8252 != null && class518.field7269 == class478.field6840) {
            int var10 = class395.field5976.method2437(class386.field5772, var2, class224.field2975, class19.field373, 16777215, 16777215, class164.field2309 + 4, class696.field9796, 0, class533.field7838 + 16);
            class430.method2569(16, arg1 ^ 0x51, class164.field2309 + 4, class141.field2042.method3455(var2, (byte) 1) + var10, class533.field7838);
        }
        if (arg1 != 81) {
            method1955(null, -84);
        }
    }
}

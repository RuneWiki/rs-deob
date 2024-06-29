import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class202 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lbh;")
    public static class538 field2911 = new class538(10);

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "[I")
    public static int[] field2914 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Z")
    public static boolean field2916 = false;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "J")
    public static long field2915 = 0L;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 6)
    public static final boolean method1356(byte arg0, String arg1) {
        field2910++;
        return arg0 == 18 ? class46.field672.containsKey(arg1) : true;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lha;ILta;I)V", line = 17)
    public static final void method1357(class545 arg0, int arg1, class27 arg2, int arg3) {
        if (arg1 != 23676) {
            return;
        }
        field2912++;
        if (class404.field5605 != null && arg2.field348 >= arg3) {
            for (int var4 = 0; var4 < class404.field5605.length; var4++) {
                if (class404.field5605[var4] != -1000000 && (class404.field5605[var4] >= arg2.field358[0] || class404.field5605[var4] >= arg2.field358[1] || arg2.field358[2] <= class404.field5605[var4] || class404.field5605[var4] >= arg2.field358[3]) && (class71.field993[var4] >= arg2.field357[0] || class71.field993[var4] >= arg2.field357[1] || arg2.field357[2] <= class71.field993[var4] || class71.field993[var4] >= arg2.field357[3]) && (class646.field9154[var4] <= arg2.field357[0] || class646.field9154[var4] <= arg2.field357[1] || arg2.field357[2] >= class646.field9154[var4] || arg2.field357[3] >= class646.field9154[var4]) && (class569.field8067[var4] >= arg2.field352[0] || class569.field8067[var4] >= arg2.field352[1] || arg2.field352[2] <= class569.field8067[var4] || arg2.field352[3] <= class569.field8067[var4]) && (class271.field3667[var4] <= arg2.field352[0] || arg2.field352[1] >= class271.field3667[var4] || class271.field3667[var4] <= arg2.field352[2] || arg2.field352[3] >= class271.field3667[var4])) {
                    return;
                }
            }
        }
        if (arg2.field351 == 1) {
            int var5 = arg2.field356 + class707.field9874 - class126.field1717;
            if (var5 >= 0 && (class707.field9874 + class707.field9874) >= var5) {
                int var6 = class707.field9874 + arg2.field350 - class157.field2139;
                if (var6 < 0) {
                    var6 = 0;
                } else if (class707.field9874 + class707.field9874 < var6) {
                    return;
                }
                int var7 = class707.field9874 + arg2.field347 - class157.field2139;
                if (var7 > (class707.field9874 + class707.field9874)) {
                    var7 = class707.field9874 + class707.field9874;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var6 <= var7) {
                    if (class359.field4594[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class310.field3978 - arg2.field357[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!(var9 < (float) class256.field3513) && class127.method819(0, false, arg2) && class127.method819(1, false, arg2) && class127.method819(2, false, arg2) && class127.method819(3, false, arg2)) {
                        class313.field4023[class75.field1036++] = arg2;
                    }
                }
            }
        } else if (arg2.field351 == 2) {
            int var10 = class707.field9874 + arg2.field350 - class157.field2139;
            if (var10 >= 0 && var10 <= (class707.field9874 + class707.field9874)) {
                int var11 = class707.field9874 + arg2.field356 - class126.field1717;
                if (var11 < 0) {
                    var11 = 0;
                } else if ((class707.field9874 + class707.field9874) < var11) {
                    return;
                }
                int var12 = arg2.field349 + class707.field9874 - class126.field1717;
                if ((class707.field9874 + class707.field9874) < var12) {
                    var12 = class707.field9874 + class707.field9874;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var12 >= var11) {
                    if (class359.field4594[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class125.field1705 - arg2.field352[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!(var14 < (float) class256.field3513) && class127.method819(0, false, arg2) && class127.method819(1, false, arg2) && class127.method819(2, false, arg2) && class127.method819(3, false, arg2)) {
                        class313.field4023[class75.field1036++] = arg2;
                    }
                }
            }
        } else if (arg2.field351 == 16 || arg2.field351 == 8) {
            int var23 = class707.field9874 + arg2.field356 - class126.field1717;
            if (var23 >= 0 && var23 <= (class707.field9874 + class707.field9874)) {
                int var24 = class707.field9874 + arg2.field350 - class157.field2139;
                if (var24 >= 0 && (class707.field9874 + class707.field9874) >= var24 && class359.field4594[var23][var24]) {
                    float var25 = (float) (class310.field3978 - arg2.field357[0]);
                    if (var25 < 0.0F) {
                        var25 *= -1.0F;
                    }
                    float var26 = (float) (class125.field1705 - arg2.field352[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    if (!(var25 < (float) class256.field3513) || !(var26 < (float) class256.field3513) && class127.method819(0, false, arg2) && class127.method819(1, false, arg2) && class127.method819(2, false, arg2) && class127.method819(3, false, arg2)) {
                        class313.field4023[class75.field1036++] = arg2;
                    }
                }
            }
        } else if (arg2.field351 == 4) {
            float var15 = (float) (arg2.field358[0] - class60.field821);
            if (!((float) class520.field7272 >= var15)) {
                int var16 = arg2.field350 + class707.field9874 - class157.field2139;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > (class707.field9874 + class707.field9874)) {
                    return;
                }
                int var17 = arg2.field347 + class707.field9874 - class157.field2139;
                if ((class707.field9874 + class707.field9874) < var17) {
                    var17 = class707.field9874 + class707.field9874;
                } else if (var17 < 0) {
                    return;
                }
                int var18 = arg2.field356 + class707.field9874 - class126.field1717;
                if (var18 < 0) {
                    var18 = 0;
                } else if (class707.field9874 + class707.field9874 < var18) {
                    return;
                }
                int var19 = arg2.field349 + class707.field9874 - class126.field1717;
                if ((class707.field9874 + class707.field9874) < var19) {
                    var19 = class707.field9874 + class707.field9874;
                } else if (var19 < 0) {
                    return;
                }
                boolean var20 = false;
                label295: for (int var21 = var18; var21 <= var19; var21++) {
                    for (int var22 = var16; var22 <= var17; var22++) {
                        if (class359.field4594[var21][var22]) {
                            var20 = true;
                            break label295;
                        }
                    }
                }
                if (var20 && class127.method819(0, false, arg2) && class127.method819(1, false, arg2) && class127.method819(2, false, arg2) && class127.method819(3, false, arg2)) {
                    class313.field4023[class75.field1036++] = arg2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 356)
    public static void method1358(byte arg0) {
        field2911 = null;
        field2914 = null;
        if (arg0 <= 25) {
            field2914 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lwu;ZIIZII)V", line = 368)
    public static final void method1359(class557 arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field2913++;
        if (arg2 > 0) {
            class703.field9783 = arg6;
            class108.field1548 = arg5;
            class298.field3896 = arg4;
            class470.field6423 = arg3;
            class539.field7539 = null;
            class736.field10292 = 1;
            class355.field4565 = arg0;
            class308.field3973 = class336.field4314.method2296(1) / arg2;
            if (class308.field3973 < 1) {
                class308.field3973 = 1;
            }
        } else {
            class82.method489(arg6, arg0, arg4, arg5, (byte) -31, arg3);
        }
        if (!arg1) {
            method1357(null, 90, null, 126);
        }
    }
}

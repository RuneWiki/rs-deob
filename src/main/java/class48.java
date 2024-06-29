import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class48 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lqk;")
    private class61 field742 = new class61();

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lwm;")
    public static class152 field740 = class157.method1048("hint_mapmarkers", 101);

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Lwm;")
    private static class152 field747 = class157.method1048("Please wait )2 attempting to reestablish)3", 97);

    @OriginalMember(owner = "client!m", name = "m", descriptor = "Lwm;")
    private static class152 field751 = class157.method1048("Choose Option", 114);

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lwm;")
    public static class152 field741 = field751;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lwm;")
    public static class152 field744 = field747;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field753 = -1;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Lah;")
    public static class205 field754;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "Lqk;")
    private class61 field759;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)V", line = 7)
    public static final void method328(boolean arg0, int arg1) {
        if (arg0) {
            if (class253.field4387 != -1) {
                class253.method1764(class253.field4387, (byte) 76);
            }
            for (class122 var2 = (class122) class107.field1519.method1585(-1506054736); var2 != null; var2 = (class122) class107.field1519.method1581((byte) -13)) {
                class23.method197(var2, false, true);
            }
            class253.field4387 = -1;
            class107.field1519 = new class231(8);
            class219.method1498(true);
            class253.field4387 = class248.field4149;
            class198.method1321(false, false);
            class147.method923((byte) 3);
            class159.method1071(class253.field4387, arg1 ^ 0x5EF);
        }
        field757++;
        class321.field5607 = -1;
        class299.method2097(-271, class92.field1283);
        class85.field1176 = new class12();
        class85.field1176.field4162 = 3000;
        class85.field1176.field4231 = 3000;
        if (arg1 != 103) {
            field754 = (class205) null;
        }
        if (!class217.field3516) {
            class231.method1580((byte) -10, class224.field3650);
            class232.method1597((byte) 127, 10);
            return;
        }
        if (class28.field485 == 2) {
            class80.field1129 = class17.field241 << 7;
            class224.field3639 = class310.field5307 << 7;
        } else {
            class280.method1905(true);
        }
        class121.method783(159);
        class22.method188(107);
        class232.method1597((byte) 127, 28);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Lqk;", line = 71)
    public final class61 method329(int arg0) {
        if (arg0 != -13985) {
            method328(true, 73);
        }
        field758++;
        class61 var2 = this.field759;
        if (this.field742 == var2) {
            this.field759 = null;
            return null;
        } else {
            this.field759 = var2.field927;
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLah;)V", line = 95)
    public static final void method330(byte arg0, class205 arg1) {
        field739++;
        if (class98.field1408) {
            return;
        }
        if (class217.field3516) {
            class13.method82();
        } else {
            class96.method628();
        }
        class234.field3834 = class90.method593((byte) -17, arg1, class180.field2871);
        int var2 = class227.field3709;
        int var3 = var2 * 956 / 503;
        class234.field3834.method428((class172.field2757 - var3) / 2, 0, var3, var2);
        if (arg0 < 109) {
            field756 = -9;
        }
        class242.field3986 = class100.method672(2, arg1, field753);
        class242.field3986.method1572(class172.field2757 / 2 - (class242.field3986.field3746 / 2), 18);
        class98.field1408 = true;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Z", line = 132)
    public static final boolean method331(int arg0, int arg1) {
        byte var2 = 0;
        field750++;
        byte var3 = 0;
        if (class174.field2776 == null) {
            if (class217.field3516 || class251.field4292 == null) {
                class174.field2776 = new class109(512, 512);
            } else {
                class174.field2776 = (class109) class251.field4292;
            }
            int[] var4 = class174.field2776.field1552;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < (104 - var3 - 1); var7++) {
                int var8 = (var3 + 103 - var7) * 2048 + 24628;
                for (int var9 = var2 + 1; var9 < (104 - var2 - 1); var9++) {
                    if ((class70.field1026[arg0][var9][var7] & 0x18) == 0) {
                        class172.method1148(var4, var8, 512, arg0, var9, var7);
                    }
                    if (arg0 < 3 && (class70.field1026[arg0 + 1][var9][var7] & 0x8) != 0) {
                        class172.method1148(var4, var8, 512, arg0 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class236.field3868 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class226.method1553(class23.field400, var10 + var2, var3 + var11);
                    if (var12 != 0L) {
                        class270 var14 = class242.method1656(Integer.MAX_VALUE & (int) (var12 >>> 32), true);
                        int var15 = var14.field4606;
                        if (var14.field4592 != null) {
                            for (int var16 = 0; var16 < var14.field4592.length; var16++) {
                                if (var14.field4592[var16] != -1) {
                                    class270 var17 = class242.method1656(var14.field4592[var16], true);
                                    if (var17.field4606 >= 0) {
                                        var15 = var17.field4606;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var15 >= 0) {
                            int var18 = var2 + var10;
                            int var19 = var3 + var11;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var20 = class135.field2076[class23.field400].field384;
                                for (int var21 = 0; var21 < 10; var21++) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (var22 == 0 && var18 > 0 && var18 > (var10 - 3) && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
                                        var18--;
                                    }
                                    if (var22 == 1 && var18 < 103 && (var10 + 3) > var18 && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
                                        var18++;
                                    }
                                    if (var22 == 2 && var19 > 0 && var19 > (var11 - 3) && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
                                        var19--;
                                    }
                                    if (var22 == 3 && var19 < 103 && var11 + 3 > var19 && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
                                        var19++;
                                    }
                                }
                            }
                            class200.field3234[class236.field3868] = var14.field4604;
                            class128.field1953[class236.field3868] = var18 - var2;
                            class154.field2451[class236.field3868] = var19 - var3;
                            class236.field3868++;
                        }
                    }
                }
            }
        }
        if (arg1 != 19661088) {
            return true;
        }
        class174.field2776.method726();
        int var23 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) - (-((int) (Math.random() * 20.0D)) + -238 + 10);
        int var24 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class70.field1026[arg0][var2 + var26][var25 + var3] & 0x18) == 0 && !class8.method39(arg0, var25, var23, var2, var24, var26, var3, (byte) 118)) {
                    if (class217.field3516) {
                        class96.field1376 = null;
                    } else {
                        class311.field5322.method883(true);
                    }
                    return false;
                }
                if (arg0 < 3 && (class70.field1026[arg0 + 1][var2 + var26][var3 + var25] & 0x8) != 0 && !class8.method39(arg0 + 1, var25, var23, var2, var24, var26, var3, (byte) 117)) {
                    if (class217.field3516) {
                        class96.field1376 = null;
                    } else {
                        class311.field5322.method883(true);
                    }
                    return false;
                }
            }
        }
        if (class217.field3516) {
            int[] var27 = class174.field2776.field1552;
            int var28 = var27.length;
            for (int var29 = 0; var29 < var28; var29++) {
                if (var27[var29] == 0) {
                    var27[var29] = 1;
                }
            }
            class251.field4292 = new class68(class174.field2776);
        } else {
            class251.field4292 = class174.field2776;
        }
        if (class217.field3516) {
            class96.field1376 = null;
        } else {
            class311.field5322.method883(true);
        }
        class174.field2776 = null;
        return true;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 367)
    public final void method332(byte arg0) {
        if (arg0 <= 27) {
            return;
        }
        while (true) {
            class61 var2 = this.field742.field927;
            if (this.field742 == var2) {
                field749++;
                this.field759 = null;
                return;
            }
            var2.method402(0);
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)Lqk;", line = 393)
    public final class61 method333(byte arg0) {
        field752++;
        class61 var2 = this.field742.field927;
        if (this.field742 == var2) {
            this.field759 = null;
            return null;
        }
        this.field759 = var2.field927;
        if (arg0 <= 82) {
            this.field742 = (class61) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLqk;)V", line = 416)
    public final void method334(byte arg0, class61 arg1) {
        if (arg0 < 64) {
            field745 = 107;
        }
        if (arg1.field930 != null) {
            arg1.method402(0);
        }
        arg1.field927 = this.field742;
        arg1.field930 = this.field742.field930;
        arg1.field930.field927 = arg1;
        field746++;
        arg1.field927.field930 = arg1;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)Lqk;", line = 438)
    public final class61 method335(int arg0) {
        int var2 = -22 % ((-arg0 - 4) / 61);
        class61 var3 = this.field742.field927;
        field755++;
        if (this.field742 == var3) {
            return null;
        } else {
            var3.method402(0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V", line = 453)
    public static final void method336(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field748++;
        int var5 = 0;
        if (arg1 < 63) {
            field744 = (class152) null;
        }
        while (var5 < class121.field1709) {
            if (arg4 < class288.field4874[var5] + class227.field3695[var5] && arg2 + arg4 > class288.field4874[var5] && arg0 < (class286.field4847[var5] + class174.field2788[var5]) && arg0 + arg3 > class286.field4847[var5]) {
                class206.field3360[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)I", line = 486)
    public final int method337(byte arg0) {
        field743++;
        if (arg0 >= -79) {
            return 73;
        }
        int var2 = 0;
        class61 var3 = this.field742.field927;
        while (this.field742 != var3) {
            var3 = var3.field927;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 528)
    public class48() {
        this.field742.field927 = this.field742;
        this.field742.field930 = this.field742;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V", line = 545)
    public static void method338(int arg0) {
        field754 = null;
        field740 = null;
        field744 = null;
        if (arg0 == 0) {
            field751 = null;
            field741 = null;
            field747 = null;
        }
    }
}

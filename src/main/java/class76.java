import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class76 {

    @OriginalMember(owner = "client!hka", name = "g", descriptor = "Laf;")
    private class39 field849 = new class39(16);

    @OriginalMember(owner = "client!hka", name = "b", descriptor = "Lae;")
    private class283 field844;

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "Liga;")
    public static class91 field843 = new class91(5, 5);

    @OriginalMember(owner = "client!hka", name = "j", descriptor = "Lqk;")
    public static class1 field852 = new class1(14, 3);

    @OriginalMember(owner = "client!hka", name = "l", descriptor = "I")
    public static int field854 = 0;

    @OriginalMember(owner = "client!hka", name = "c", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!hka", name = "d", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!hka", name = "e", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!hka", name = "f", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!hka", name = "h", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!hka", name = "i", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!hka", name = "k", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!hka", name = "m", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(II)V", line = 4)
    public final void method553(int arg0, int arg1) {
        if (arg0 != 28295) {
            this.method553(81, -95);
        }
        field851++;
        class39 var3 = this.field849;
        synchronized (this.field849) {
            this.field849.method308(-1, arg1);
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(IB)Lee;", line = 17)
    public static final class506 method554(int arg0, byte arg1) {
        field850++;
        int var2 = 59 % ((arg1 - 87) / 32);
        if (arg0 == 0) {
            if ((double) class46.field489 == 3.0D) {
                return class120.field1599;
            }
            if ((double) class46.field489 == 4.0D) {
                return class602.field8448;
            }
            if ((double) class46.field489 == 6.0D) {
                return class531.field7312;
            }
            if ((double) class46.field489 >= 8.0D) {
                return class732.field10114;
            }
        } else if (arg0 == 1) {
            if ((double) class46.field489 == 3.0D) {
                return class531.field7312;
            }
            if ((double) class46.field489 == 4.0D) {
                return class732.field10114;
            }
            if ((double) class46.field489 == 6.0D) {
                return class748.field10329;
            }
            if ((double) class46.field489 >= 8.0D) {
                return class116.field1580;
            }
        } else if (arg0 == 2) {
            if ((double) class46.field489 == 3.0D) {
                return class748.field10329;
            }
            if ((double) class46.field489 == 4.0D) {
                return class116.field1580;
            }
            if ((double) class46.field489 == 6.0D) {
                return class428.field5976;
            }
            if ((double) class46.field489 >= 8.0D) {
                return class498.field6832;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(B)J", line = 94)
    public static final long method555(byte arg0) {
        if (arg0 < 65) {
            field854 = 123;
        }
        field846++;
        return class731.field10109.method2303((byte) -124);
    }

    @OriginalMember(owner = "client!hka", name = "b", descriptor = "(B)V", line = 107)
    public final void method556(byte arg0) {
        if (arg0 != -57) {
            method561(-16);
        }
        class39 var2 = this.field849;
        synchronized (this.field849) {
            this.field849.method314(-2);
        }
        field847++;
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(Z)V", line = 120)
    public final void method557(boolean arg0) {
        if (arg0) {
            return;
        }
        field845++;
        class39 var2 = this.field849;
        synchronized (this.field849) {
            this.field849.method319(-7);
        }
    }

    @OriginalMember(owner = "client!hka", name = "c", descriptor = "(B)V", line = 140)
    public static void method558(byte arg0) {
        field843 = null;
        field852 = null;
        if (arg0 < 120) {
            field843 = null;
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(BI)Lhfa;", line = 153)
    public final class365 method559(byte arg0, int arg1) {
        if (arg0 != 14) {
            this.field849 = null;
        }
        field853++;
        class39 var3 = this.field849;
        class365 var4;
        synchronized (this.field849) {
            var4 = (class365) this.field849.method312(arg0 - 14, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field844;
        byte[] var6;
        synchronized (this.field844) {
            var6 = this.field844.method1849(arg1, (byte) -124, 30);
        }
        class365 var7 = new class365();
        if (var6 != null) {
            var7.method2287(false, new class511(var6));
        }
        class39 var8 = this.field849;
        synchronized (this.field849) {
            this.field849.method305(var7, (long) arg1, arg0 + 18306);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hka", name = "<init>", descriptor = "(Ljk;ILae;)V", line = 186)
    public class76(class788 arg0, int arg1, class283 arg2) {
        this.field844 = arg2;
        this.field844.method1867(30, (byte) 49);
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(Laa;Lsha;ILha;IIIIZ)V", line = 204)
    public static final void method560(class87 arg0, class115 arg1, int arg2, class473 arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field848++;
        class547 var9 = class657.field9274.method514(arg5, (byte) 75);
        if (var9 != null && var9.field7618 && var9.method3238(-2, class173.field2192)) {
            if (var9.field7626 != null) {
                int[] var10 = new int[var9.field7626.length];
                for (int var11 = 0; var11 < var10.length / 2; var11++) {
                    int var28;
                    if (class695.field9691 == 4) {
                        var28 = (int) class702.field9790 & 0x3FFF;
                    } else {
                        var28 = (int) class702.field9790 + class703.field9795 & 0x3FFF;
                    }
                    int var29 = class448.field6265[var28];
                    int var30 = class448.field6270[var28];
                    if (class695.field9691 != 4) {
                        var29 = var29 * 256 / (class686.field9577 + 256);
                        var30 = var30 * 256 / (class686.field9577 + 256);
                    }
                    var10[var11 * 2] = ((var9.field7626[var11 * 2] * 4 + arg2) * var30 + (var9.field7626[var11 * 2 + 1] * 4 + arg4) * var29 >> 14) + arg1.field1560 / 2 + arg6;
                    var10[var11 * 2 + 1] = arg7 + (arg1.field1517 / 2) - ((var9.field7626[var11 * 2 - -1] * 4 + arg4) * var30 + -((var9.field7626[var11 * 2] * 4 + arg2) * var29) >> 14);
                }
                class624.method3587(arg3, var10, var9.field7644, arg1.field1506, arg1.field1399);
                if (var9.field7620 <= 0) {
                    for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                        arg3.method212(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 + 1 + 2], var9.field7596[var9.field7628[var12] & 0xFF], 1, arg0, arg6, arg7);
                    }
                    arg3.method212(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field7596[var9.field7628[var9.field7628.length - 1] & 0xFF], 1, arg0, arg6, arg7);
                } else {
                    for (int var13 = 0; var13 < (var10.length / 2 - 1); var13++) {
                        int var21 = var10[var13 * 2];
                        int var22 = var10[var13 * 2 + 1];
                        int var23 = var10[var13 * 2 + 2];
                        int var24 = var10[var13 * 2 + 3];
                        if (var23 < var21) {
                            int var26 = var21;
                            var21 = var23;
                            int var27 = var22;
                            var23 = var26;
                            var22 = var24;
                            var24 = var27;
                        } else if (var21 == var23 && var22 > var24) {
                            int var25 = var22;
                            var22 = var24;
                            var24 = var25;
                        }
                        arg3.method249(var21, var22, var23, var24, var9.field7596[var9.field7628[var13] & 0xFF], 1, arg0, arg6, arg7, var9.field7620, var9.field7605, var9.field7625);
                    }
                    int var14 = var10[var10.length - 2];
                    int var15 = var10[var10.length - 1];
                    int var16 = var10[0];
                    int var17 = var10[1];
                    if (var14 > var16) {
                        int var18 = var14;
                        int var19 = var15;
                        var14 = var16;
                        var16 = var18;
                        var15 = var17;
                        var17 = var19;
                    } else if (var14 == var16 && var17 < var15) {
                        int var20 = var15;
                        var15 = var17;
                        var17 = var20;
                    }
                    arg3.method249(var14, var15, var16, var17, var9.field7596[var9.field7628[var9.field7628.length - 1] & 0xFF], 1, arg0, arg6, arg7, var9.field7620, var9.field7605, var9.field7625);
                }
            }
            class318 var31 = null;
            if (var9.field7634 != -1) {
                var31 = var9.method3237(-123, arg3, false);
                if (var31 != null) {
                    class353.method2221(arg0, arg4, var31, arg1, arg6, (byte) 28, arg2, arg7);
                }
            }
            if (var9.field7597 != null) {
                int var32 = 0;
                if (var31 != null) {
                    var32 = var31.method738();
                }
                class442 var33 = class78.field878;
                class300 var34 = class525.field7226;
                if (var9.field7631 == 1) {
                    var34 = class582.field8243;
                    var33 = class559.field7865;
                }
                if (var9.field7631 == 2) {
                    var34 = class705.field9812;
                    var33 = class386.field5515;
                }
                class670.method3825(arg7, arg6, arg1, var33, var34, arg2, var9.field7609, arg4, var9.field7597, arg0, (byte) -121, var32);
            }
        }
        if (!arg8) {
            method554(-7, (byte) -12);
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(I)V", line = 378)
    public static final void method561(int arg0) {
        field855++;
        if (!class773.field10644) {
            return;
        }
        class115 var1 = class446.method2705(class539.field7462, 92, class326.field4586);
        if (var1 != null && var1.field1387 != null) {
            class114 var2 = new class114();
            var2.field1378 = var1;
            var2.field1384 = var1.field1387;
            class700.method3959(var2);
        }
        class81.field913 = arg0;
        class773.field10644 = false;
        class213.field2954 = -1;
        if (var1 != null) {
            class43.method336(-1, var1);
        }
    }
}

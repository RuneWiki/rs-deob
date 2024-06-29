import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class99 {

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lqi;")
    private class257 field1425 = new class257();

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Lii;")
    private class250 field1434;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "[[Z")
    public static boolean[][] field1436 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Z")
    public static boolean field1427 = false;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V", line = 8)
    public final void method741(int arg0, byte arg1) {
        int var3 = 98 / ((69 - arg1) / 41);
        if (class132.field2018 != null) {
            for (class286 var4 = (class286) this.field1425.method1811(7); var4 != null; var4 = (class286) this.field1425.method1807(-45)) {
                if (var4.method728((byte) 77)) {
                    if (var4.method724((byte) -114) == null) {
                        var4.method39(10717);
                        var4.method2257(false);
                        this.field1439++;
                    }
                } else if ((long) arg0 < ++var4.field5013) {
                    class286 var5 = class132.field2018.method203(true, var4);
                    this.field1434.method1708(var4.field69, (byte) -79, var5);
                    class196.method1436(-125, var5, var4);
                    var4.method39(10717);
                    var4.method2257(false);
                }
            }
        }
        field1435++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)[Lrj;", line = 59)
    public static final class269[] method742(int arg0) {
        field1424++;
        class269[] var1 = new class269[class131.field2005];
        for (int var2 = 0; var2 < class131.field2005; var2++) {
            int var3 = class209.field3191[var2] * class133.field2028[var2];
            byte[] var4 = class220.field3362[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class82.field1212[class149.method1117(var4[var6], 255)];
            }
            if (class73.field1058) {
                var1[var2] = new class44(class233.field3554, class38.field559, class304.field4666[var2], class27.field293[var2], class133.field2028[var2], class209.field3191[var2], var5);
            } else {
                var1[var2] = new class195(class233.field3554, class38.field559, class304.field4666[var2], class27.field293[var2], class133.field2028[var2], class209.field3191[var2], var5);
            }
        }
        if (arg0 != 1) {
            method748(-107, (class305) null);
        }
        class245.method1684(255);
        return var1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)I", line = 100)
    public static final int method743(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 76) {
            return -55;
        }
        field1431++;
        if ((class324.field5005[arg0][arg3][arg1] & 0x8) == 0) {
            return arg0 <= 0 || (class324.field5005[1][arg3][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/Object;IJ)V", line = 117)
    public final void method744(Object arg0, int arg1, long arg2) {
        this.method749(0, arg2);
        if (arg1 != -15692) {
            field1436 = (boolean[][]) ((boolean[][]) null);
        }
        if (this.field1439 == 0) {
            class286 var5 = (class286) this.field1425.method1813(1);
            var5.method39(10717);
            var5.method2257(false);
        } else {
            this.field1439--;
        }
        field1432++;
        class97 var6 = new class97(arg0);
        this.field1434.method1708(arg2, (byte) -79, var6);
        this.field1425.method1810(var6, false);
        var6.field5013 = 0L;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)J", line = 145)
    public static final long method745(int arg0, int arg1, int arg2) {
        class79 var3 = class213.field3262[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1169; var4++) {
            class228 var5 = var3.field1157[var4];
            if ((var5.field3482 >> 29 & 0x3L) == 2L && var5.field3472 == arg1 && var5.field3475 == arg2) {
                return var5.field3482;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V", line = 167)
    public static void method746(boolean arg0) {
        field1436 = (boolean[][]) null;
        if (!arg0) {
            method746(false);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(JB)Ljava/lang/Object;", line = 180)
    public final Object method747(long arg0, byte arg1) {
        if (arg1 <= 78) {
            return (Object) null;
        }
        class286 var4 = (class286) this.field1434.method1716(-1, arg0);
        field1423++;
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method724((byte) -114);
        if (var5 == null) {
            var4.method39(10717);
            var4.method2257(false);
            this.field1439++;
            return null;
        }
        if (var4.method728((byte) 40)) {
            class97 var6 = new class97(var5);
            this.field1434.method1708(var4.field69, (byte) -79, var6);
            this.field1425.method1810(var6, false);
            var6.field5013 = 0L;
            var4.method39(10717);
            var4.method2257(false);
        } else {
            this.field1425.method1810(var4, false);
            var4.field5013 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILt;)V", line = 224)
    public static final void method748(int arg0, class305 arg1) {
        field1440++;
        arg1.field4683 = false;
        if (arg1.field4765 != -1) {
            class28 var2 = client.method1010(arg1.field4765, (byte) 117);
            if (var2 == null || var2.field312 == null) {
                arg1.field4765 = -1;
            } else {
                arg1.field4700++;
                if (var2.field312.length > arg1.field4743 && var2.field328[arg1.field4743] < arg1.field4700) {
                    arg1.field4700 = 1;
                    arg1.field4743++;
                    arg1.field4695++;
                    class146.method1105(arg1.field4743, class39.field575 == arg1, 6924, arg1.field4731, var2, arg1.field4713);
                }
                if (arg1.field4743 >= var2.field312.length) {
                    arg1.field4743 = 0;
                    arg1.field4700 = 0;
                    class146.method1105(arg1.field4743, class39.field575 == arg1, 6924, arg1.field4731, var2, arg1.field4713);
                }
                arg1.field4695 = arg1.field4743 + 1;
                if (arg1.field4695 >= var2.field312.length) {
                    arg1.field4695 = 0;
                }
            }
        }
        if (arg1.field4750 != -1 && arg1.field4734 <= class233.field3542) {
            class38 var3 = class265.method1866(arg1.field4750, 11273);
            int var4 = var3.field547;
            if (var4 == -1) {
                arg1.field4750 = -1;
            } else {
                label318: {
                    class28 var5 = client.method1010(var4, (byte) 116);
                    if (var3.field563) {
                        if (var5.field342 == 3) {
                            if (arg1.field4694 > 0 && class233.field3542 >= arg1.field4746 && arg1.field4748 < class233.field3542) {
                                arg1.field4750 = -1;
                                break label318;
                            }
                        } else if (var5.field342 == 1 && arg1.field4694 > 0 && class233.field3542 >= arg1.field4746 && class233.field3542 > arg1.field4748) {
                            arg1.field4734 = class233.field3542 + 1;
                            break label318;
                        }
                    }
                    if (var5 == null || var5.field312 == null) {
                        arg1.field4750 = -1;
                    } else {
                        if (arg1.field4754 < 0) {
                            arg1.field4754 = 0;
                            class146.method1105(0, class39.field575 == arg1, 6924, arg1.field4731, var5, arg1.field4713);
                        }
                        arg1.field4692++;
                        if (var5.field312.length > arg1.field4754 && var5.field328[arg1.field4754] < arg1.field4692) {
                            arg1.field4754++;
                            arg1.field4692 = 1;
                            class146.method1105(arg1.field4754, class39.field575 == arg1, 6924, arg1.field4731, var5, arg1.field4713);
                        }
                        if (var5.field312.length <= arg1.field4754) {
                            if (var3.field563) {
                                arg1.field4742++;
                                arg1.field4754 -= var5.field339;
                                if (arg1.field4742 >= var5.field325) {
                                    arg1.field4750 = -1;
                                } else if (arg1.field4754 >= 0 && arg1.field4754 < var5.field312.length) {
                                    class146.method1105(arg1.field4754, class39.field575 == arg1, 6924, arg1.field4731, var5, arg1.field4713);
                                } else {
                                    arg1.field4750 = -1;
                                }
                            } else {
                                arg1.field4750 = -1;
                            }
                        }
                        arg1.field4769 = arg1.field4754 + 1;
                        if (var5.field312.length <= arg1.field4769) {
                            if (var3.field563) {
                                arg1.field4769 -= var5.field339;
                                if (var5.field325 <= (arg1.field4742 + 1)) {
                                    arg1.field4769 = -1;
                                } else if (arg1.field4769 < 0 || arg1.field4769 >= var5.field312.length) {
                                    arg1.field4769 = -1;
                                }
                            } else {
                                arg1.field4769 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 <= 1) {
            field1436 = (boolean[][]) ((boolean[][]) null);
        }
        if (arg1.field4707 != -1 && arg1.field4684 <= 1) {
            class28 var6 = client.method1010(arg1.field4707, (byte) 112);
            if (var6.field342 == 3) {
                if (arg1.field4694 > 0 && class233.field3542 >= arg1.field4746 && class233.field3542 > arg1.field4748) {
                    arg1.field4707 = -1;
                }
            } else if (var6.field342 == 1 && arg1.field4694 > 0 && class233.field3542 >= arg1.field4746 && arg1.field4748 < class233.field3542) {
                arg1.field4684 = 1;
            }
        }
        if (arg1.field4707 != -1 && arg1.field4684 == 0) {
            class28 var7 = client.method1010(arg1.field4707, (byte) 125);
            if (var7 == null || var7.field312 == null) {
                arg1.field4707 = -1;
            } else {
                arg1.field4699++;
                if (var7.field312.length > arg1.field4727 && var7.field328[arg1.field4727] < arg1.field4699) {
                    arg1.field4699 = 1;
                    arg1.field4727++;
                    class146.method1105(arg1.field4727, class39.field575 == arg1, 6924, arg1.field4731, var7, arg1.field4713);
                }
                if (var7.field312.length <= arg1.field4727) {
                    arg1.field4724++;
                    arg1.field4727 -= var7.field339;
                    if (var7.field325 <= arg1.field4724) {
                        arg1.field4707 = -1;
                    } else if (arg1.field4727 >= 0 && arg1.field4727 < var7.field312.length) {
                        class146.method1105(arg1.field4727, class39.field575 == arg1, 6924, arg1.field4731, var7, arg1.field4713);
                    } else {
                        arg1.field4707 = -1;
                    }
                }
                arg1.field4685 = arg1.field4727 + 1;
                if (var7.field312.length <= arg1.field4685) {
                    arg1.field4685 -= var7.field339;
                    if ((arg1.field4724 + 1) >= var7.field325) {
                        arg1.field4685 = -1;
                    } else if (arg1.field4685 < 0 || var7.field312.length <= arg1.field4685) {
                        arg1.field4685 = -1;
                    }
                }
                arg1.field4683 = var7.field307;
            }
        }
        if (arg1.field4684 > 0) {
            arg1.field4684--;
        }
        for (int var8 = 0; var8 < arg1.field4672.length; var8++) {
            class69 var9 = arg1.field4672[var8];
            if (var9 != null) {
                if (var9.field989 > 0) {
                    var9.field989--;
                } else {
                    class28 var10 = client.method1010(var9.field978, (byte) 110);
                    if (var10 == null || var10.field312 == null) {
                        arg1.field4672[var8] = null;
                    } else {
                        var9.field981++;
                        if (var9.field992 < var10.field312.length && var9.field981 > var10.field328[var9.field992]) {
                            var9.field981 = 1;
                            var9.field992++;
                            class146.method1105(var9.field992, class39.field575 == arg1, 6924, arg1.field4731, var10, arg1.field4713);
                        }
                        if (var10.field312.length <= var9.field992) {
                            var9.field992 -= var10.field339;
                            var9.field979++;
                            if (var9.field979 >= var10.field325) {
                                arg1.field4672[var8] = null;
                            } else if (var9.field992 >= 0 && var10.field312.length > var9.field992) {
                                class146.method1105(var9.field992, class39.field575 == arg1, 6924, arg1.field4731, var10, arg1.field4713);
                            } else {
                                arg1.field4672[var8] = null;
                            }
                        }
                        var9.field988 = var9.field992 + 1;
                        if (var10.field312.length <= var9.field988) {
                            var9.field988 -= var10.field339;
                            if (var10.field325 <= (var9.field979 + 1)) {
                                var9.field988 = -1;
                            } else if (var9.field988 < 0 || var9.field988 >= var10.field312.length) {
                                var9.field988 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IJ)V", line = 528)
    public final void method749(int arg0, long arg1) {
        if (arg0 != 0) {
            this.field1439 = 73;
        }
        class286 var4 = (class286) this.field1434.method1716(-1, arg1);
        field1428++;
        if (var4 != null) {
            var4.method39(arg0 + 10717);
            var4.method2257(false);
            this.field1439++;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 549)
    public final void method750(byte arg0) {
        this.field1425.method1816(1);
        if (arg0 <= 74) {
            this.field1438 = -24;
        }
        this.field1434.method1713(0);
        this.field1439 = this.field1438;
        field1426++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIILjd;)[Laf;", line = 566)
    public static final class195[] method751(byte arg0, int arg1, int arg2, class95 arg3) {
        field1429++;
        if (arg0 >= -56) {
            method745(9, -72, 95);
        }
        return class31.method233(arg1, 0, arg2, arg3) ? class224.method1597(109) : null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V", line = 587)
    public final void method752(boolean arg0) {
        for (class286 var2 = (class286) this.field1425.method1811(7); var2 != null; var2 = (class286) this.field1425.method1807(-30)) {
            if (var2.method728((byte) 99)) {
                var2.method39(10717);
                var2.method2257(false);
                this.field1439++;
            }
        }
        field1437++;
        if (arg0) {
            method743(-83, 57, 65, -9);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)I", line = 622)
    public final int method753(int arg0) {
        field1430++;
        int var2 = arg0;
        for (class286 var3 = (class286) this.field1425.method1811(7); var3 != null; var3 = (class286) this.field1425.method1807(-107)) {
            if (!var3.method728((byte) 19)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I)V", line = 735)
    public class99(int arg0) {
        this.field1438 = arg0;
        this.field1439 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1434 = new class250(var2);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([IIIIII)V", line = 645)
    public static final void method754(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class79 var6 = class213.field3262[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class135 var7 = var6.field1156;
        if (var7 != null) {
            int var8 = var7.field2051;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class271 var10 = var6.field1158;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field4243;
        int var12 = var10.field4244;
        int var13 = var10.field4246;
        int var14 = var10.field4229;
        int[] var15 = class217.field3324[var11];
        int[] var16 = class300.field4625[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }
}

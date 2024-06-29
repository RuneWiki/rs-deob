import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class213 {

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    private int field3736 = 0;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    private int field3742 = 0;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    private int field3741 = 128;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Z")
    public boolean field3746 = false;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    private int field3754 = 0;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public int field3755 = -1;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    private int field3756 = 128;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "[I")
    public static int[] field3740 = new int[32];

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lud;")
    private static class279 field3744 = class130.method1024(" has logged out)3", 255);

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "Lud;")
    public static class279 field3753 = field3744;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public int field3750;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    private int field3751;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Ldh;")
    public static class166 field3747;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "[S")
    private short[] field3733;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "[S")
    private short[] field3735;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "[S")
    private short[] field3745;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "[S")
    private short[] field3752;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "[[Z")
    public static boolean[][] field3734;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 12)
    public static void method1562(int arg0) {
        field3744 = null;
        field3753 = null;
        if (arg0 == 8) {
            field3734 = (boolean[][]) null;
            field3740 = null;
            field3747 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILvh;)V", line = 35)
    public final void method1563(int arg0, class53 arg1) {
        field3739++;
        while (true) {
            int var3 = arg1.method483(-128);
            if (var3 == 0) {
                int var4 = -83 % ((arg0 - 53) / 42);
                return;
            }
            this.method1568((byte) 33, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)Z", line = 59)
    public static final boolean method1564(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class222.field3933; var3++) {
            class195 var4 = class77.field1495[var3];
            if (var4.field3500 == 1) {
                int var5 = var4.field3517 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3502 * var5 >> 8) + var4.field3522;
                    int var7 = (var4.field3523 * var5 >> 8) + var4.field3514;
                    int var8 = (var4.field3512 * var5 >> 8) + var4.field3509;
                    int var9 = (var4.field3503 * var5 >> 8) + var4.field3515;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3500 == 2) {
                int var10 = arg0 - var4.field3517;
                if (var10 > 0) {
                    int var11 = (var4.field3502 * var10 >> 8) + var4.field3522;
                    int var12 = (var4.field3523 * var10 >> 8) + var4.field3514;
                    int var13 = (var4.field3512 * var10 >> 8) + var4.field3509;
                    int var14 = (var4.field3503 * var10 >> 8) + var4.field3515;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3500 == 3) {
                int var15 = var4.field3522 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3508 * var15 >> 8) + var4.field3517;
                    int var17 = (var4.field3528 * var15 >> 8) + var4.field3506;
                    int var18 = (var4.field3512 * var15 >> 8) + var4.field3509;
                    int var19 = (var4.field3503 * var15 >> 8) + var4.field3515;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3500 == 4) {
                int var20 = arg2 - var4.field3522;
                if (var20 > 0) {
                    int var21 = (var4.field3508 * var20 >> 8) + var4.field3517;
                    int var22 = (var4.field3528 * var20 >> 8) + var4.field3506;
                    int var23 = (var4.field3512 * var20 >> 8) + var4.field3509;
                    int var24 = (var4.field3503 * var20 >> 8) + var4.field3515;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3500 == 5) {
                int var25 = arg1 - var4.field3509;
                if (var25 > 0) {
                    int var26 = (var4.field3508 * var25 >> 8) + var4.field3517;
                    int var27 = (var4.field3528 * var25 >> 8) + var4.field3506;
                    int var28 = (var4.field3502 * var25 >> 8) + var4.field3522;
                    int var29 = (var4.field3523 * var25 >> 8) + var4.field3514;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lrj;)V", line = 186)
    public static final void method1565(class18 arg0) {
        for (int var1 = arg0.field560; var1 <= arg0.field562; var1++) {
            for (int var2 = arg0.field564; var2 <= arg0.field556; var2++) {
                class191 var3 = class24.field619[arg0.field557][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3451; var4++) {
                        if (var3.field3455[var4] == arg0) {
                            var3.field3451--;
                            for (int var5 = var4; var5 < var3.field3451; var5++) {
                                var3.field3455[var5] = var3.field3455[var5 + 1];
                                var3.field3459[var5] = var3.field3459[var5 + 1];
                            }
                            var3.field3455[var3.field3451] = null;
                            break;
                        }
                    }
                    var3.field3443 = 0;
                    for (int var6 = 0; var6 < var3.field3451; var6++) {
                        var3.field3443 |= var3.field3459[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZII)Lga;", line = 264)
    public final class19 method1566(int arg0, boolean arg1, int arg2, int arg3) {
        field3737++;
        class19 var5 = (class19) class265.field4774.method1336((long) this.field3750, 0);
        if (var5 == null) {
            class148 var6 = class148.method1157(class115.field2101, this.field3751, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field3745 != null) {
                for (int var7 = 0; var7 < this.field3745.length; var7++) {
                    var6.method1140(this.field3745[var7], this.field3733[var7]);
                }
            }
            if (this.field3735 != null) {
                for (int var8 = 0; var8 < this.field3735.length; var8++) {
                    var6.method1158(this.field3735[var8], this.field3752[var8]);
                }
            }
            var5 = var6.method1144(this.field3742 + 64, this.field3754 + 850, -30, -50, -30);
            class265.field4774.method1331(var5, 30237, (long) this.field3750);
        }
        class19 var9;
        if (this.field3755 == -1 || arg0 == -1) {
            var9 = var5.method187(true, true, true);
        } else {
            var9 = class131.method1033((byte) -82, this.field3755).method1407(arg2, arg3, arg0, var5, (byte) 117);
        }
        if (this.field3741 != 128 || this.field3756 != 128) {
            var9.method164(this.field3741, this.field3756, this.field3741);
        }
        if (this.field3736 != 0) {
            if (this.field3736 == 90) {
                var9.method183();
            }
            if (this.field3736 == 180) {
                var9.method169();
            }
            if (this.field3736 == 270) {
                var9.method185();
            }
        }
        return arg1 ? (class19) null : var9;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 355)
    public static final void method1567(byte arg0) {
        field3743++;
        if (arg0 != 103) {
            return;
        }
        for (class275 var1 = (class275) class32.field727.method2248(102); var1 != null; var1 = (class275) class32.field727.method2240(1138)) {
            class139 var2 = var1.field4884;
            if (class287.field5134 != var2.field2508 || class8.field279 > var2.field2501) {
                var1.method2221(true);
            } else if (var2.field2510 <= class8.field279) {
                if (var2.field2525 > 0) {
                    class102 var3 = class122.field2196[var2.field2525 - 1];
                    if (var3 != null && var3.field86 >= 0 && var3.field86 < 13312 && var3.field79 >= 0 && var3.field79 < 13312) {
                        var2.method1079(var3.field79, var3.field86, class130.method1025(var3.field86, 1008652135, var2.field2508, var3.field79) - var2.field2528, arg0 + -230, class8.field279);
                    }
                }
                if (var2.field2525 < 0) {
                    int var4 = -var2.field2525 - 1;
                    class239 var5;
                    if (class79.field1506 == var4) {
                        var5 = class72.field1420;
                    } else {
                        var5 = class96.field1780[var4];
                    }
                    if (var5 != null && var5.field86 >= 0 && var5.field86 < 13312 && var5.field79 >= 0 && var5.field79 < 13312) {
                        var2.method1079(var5.field79, var5.field86, class130.method1025(var5.field86, arg0 + 1008652032, var2.field2508, var5.field79) - var2.field2528, arg0 + -231, class8.field279);
                    }
                }
                var2.method1076(true, class121.field2187);
                class320.method2251(class287.field5134, (int) var2.field2506, (int) var2.field2517, (int) var2.field2515, 60, var2, var2.field2529, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BILvh;)V", line = 412)
    private final void method1568(byte arg0, int arg1, class53 arg2) {
        int var4 = -57 % ((arg0 + 31) / 33);
        if (arg1 == 1) {
            this.field3751 = arg2.method468(28214);
        } else if (arg1 == 2) {
            this.field3755 = arg2.method468(28214);
        } else if (arg1 == 4) {
            this.field3741 = arg2.method468(28214);
        } else if (arg1 == 5) {
            this.field3756 = arg2.method468(28214);
        } else if (arg1 == 6) {
            this.field3736 = arg2.method468(28214);
        } else if (arg1 == 7) {
            this.field3742 = arg2.method483(-127);
        } else if (arg1 == 8) {
            this.field3754 = arg2.method483(-120);
        } else if (arg1 == 9) {
            this.field3746 = true;
        } else if (arg1 == 40) {
            int var7 = arg2.method483(-121);
            this.field3745 = new short[var7];
            this.field3733 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3745[var8] = (short) arg2.method468(28214);
                this.field3733[var8] = (short) arg2.method468(28214);
            }
        } else if (arg1 == 41) {
            int var5 = arg2.method483(-113);
            this.field3752 = new short[var5];
            this.field3735 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3735[var6] = (short) arg2.method468(28214);
                this.field3752[var6] = (short) arg2.method468(28214);
            }
        }
        field3749++;
    }
}

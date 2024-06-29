import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class164 extends class259 {

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "Z")
    public static volatile boolean field3043 = true;

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "[I")
    public static int[] field3045 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "Lbj;")
    public static class44 field3047;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        if (arg1) {
            this.method17(-13, true);
        }
        ++field3042;
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            class26.method234(var3, 0, class223.field3999, class154.field2910[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method1212(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; ~var9 > ~class29.field556.field3467; ++var9) {
            int var10 = -class29.field556.field3459[var9] + -1 + class53.field1179 + class170.field3205;
            int var11 = (-arg1 + arg7) * (-arg4 + var10) / (arg2 - arg4) + arg1;
            int var12 = class29.field556.field3465[var9] + -class61.field1323;
            int var13 = 16777215;
            int var14 = arg0 - -((-arg0 + arg8) * (-arg3 + var12) / (-arg3 + arg6));
            class34 var15 = null;
            int var16 = class29.field556.method1380(var9, -124);
            if (var16 == 0) {
                if ((double) class208.field3749 == 3.0D) {
                    var15 = class197.field3561;
                }
                if ((double) class208.field3749 == 4.0D) {
                    var15 = class197.field3562;
                }
                if ((double) class208.field3749 == 6.0D) {
                    var15 = class222.field3989;
                }
                if ((double) class208.field3749 == 8.0D) {
                    var15 = class149.field2836;
                }
            }
            if (~var16 == -2) {
                if ((double) class208.field3749 == 3.0D) {
                    var15 = class222.field3989;
                }
                if ((double) class208.field3749 == 4.0D) {
                    var15 = class149.field2836;
                }
                if ((double) class208.field3749 == 6.0D) {
                    var15 = class257.field4527;
                }
                if ((double) class208.field3749 == 8.0D) {
                    var15 = class196.field3555;
                }
            }
            if (~var16 == -3) {
                var13 = 16755200;
                if ((double) class208.field3749 == 3.0D) {
                    var15 = class257.field4527;
                }
                if ((double) class208.field3749 == 4.0D) {
                    var15 = class196.field3555;
                }
                if ((double) class208.field3749 == 6.0D) {
                    var15 = class2.field26;
                }
                if ((double) class208.field3749 == 8.0D) {
                    var15 = class87.field1784;
                }
            }
            if (class29.field556.field3462[var9] != -1) {
                var13 = class29.field556.field3462[var9];
            }
            if (var15 != null) {
                class30[] var17 = new class30[1 + class29.field556.field3457[var9].method257(114, 60)];
                class191.field3476.method1452(class29.field556.field3457[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var11 - (var18 - 1) * var15.method337() / 2;
                int var20 = var19 + var15.method339() / 2;
                for (int var21 = 0; ~var21 > ~var18; ++var21) {
                    class30 var22 = var18 - 1 != var21 ? var17[var21].method274(var17[var21].method249(-104) - 4, 0, (byte) -121) : var17[var21];
                    var15.method335(var22, var14, var20, var13, true);
                    var20 += var15.method337();
                }
            }
        }
        if (arg5 > -32) {
            field3043 = false;
        }
        ++field3046;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    public class164() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(Z)V")
    public static void method1213(boolean arg0) {
        field3045 = null;
        if (arg0) {
            method1214(-15, (class66) null, (class8) null, (byte) 43);
        }
        field3047 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILbi;Laa;B)V")
    public static final void method1214(int arg0, class66 arg1, class8 arg2, byte arg3) {
        ++field3044;
        if (arg3 < 17) {
            method1214(110, (class66) null, (class8) null, (byte) 42);
        }
        class61 var4 = new class61();
        var4.field1314 = arg2.method63((byte) 117);
        var4.field1316 = arg2.method70(65280);
        var4.field1319 = new class27[var4.field1314];
        var4.field1312 = new int[var4.field1314];
        var4.field1311 = new class27[var4.field1314];
        var4.field1313 = new int[var4.field1314];
        var4.field1317 = new byte[var4.field1314][][];
        var4.field1321 = new int[var4.field1314];
        for (int var5 = 0; var5 < var4.field1314; ++var5) {
            try {
                int var6 = arg2.method63((byte) 76);
                if (~var6 != -1 && ~var6 != -2 && ~var6 != -3) {
                    if (var6 == 3 || ~var6 == -5) {
                        String var7 = new String(arg2.method84(0).method261(-1));
                        String var8 = new String(arg2.method84(0).method261(-1));
                        int var9 = arg2.method63((byte) 48);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; var9 > var11; ++var11) {
                            var10[var11] = new String(arg2.method84(0).method261(-1));
                        }
                        byte[][] var12 = new byte[var9][];
                        if (~var6 == -4) {
                            for (int var13 = 0; var13 < var9; ++var13) {
                                int var14 = arg2.method70(65280);
                                var12[var13] = new byte[var14];
                                arg2.method51(0, var14, (byte) -105, var12[var13]);
                            }
                        }
                        var4.field1313[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; ~var16 > ~var9; ++var16) {
                            var15[var16] = class73.method672(var10[var16], true);
                        }
                        var4.field1311[var5] = arg1.method595(var8, class73.method672(var7, true), var15, 0);
                        var4.field1317[var5] = var12;
                    }
                } else {
                    String var17 = new String(arg2.method84(0).method261(-1));
                    String var18 = new String(arg2.method84(0).method261(-1));
                    int var19 = 0;
                    if (~var6 == -2) {
                        var19 = arg2.method70(65280);
                    }
                    var4.field1313[var5] = var6;
                    var4.field1312[var5] = var19;
                    var4.field1319[var5] = arg1.method598(class73.method672(var17, true), 14, var18);
                }
            } catch (ClassNotFoundException var20) {
                var4.field1321[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1321[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1321[var5] = -3;
            } catch (Exception var23) {
                var4.field1321[var5] = -4;
            } catch (Throwable var24) {
                var4.field1321[var5] = -5;
            }
        }
        class29.field553.method477(var4, (byte) 6);
    }
}

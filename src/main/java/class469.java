import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class469 implements class526 {

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "Llh;")
    private class128 field5971 = new class128(256);

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Lpl;")
    private class612 field5970;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lpl;")
    private class612 field5968;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    private int field5967;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "[Lvca;")
    private class13[] field5966;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
    public static int[] field5960;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "[I")
    public static int[] field5963;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)Z", line = 5)
    public final boolean method2480(boolean arg0, int arg1) {
        field5959++;
        class389 var3 = this.method2482(19579, arg1);
        if (arg0) {
            return false;
        } else {
            return var3 != null && var3.method2092(0, this.field5968, this);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IFZIII)[I", line = 19)
    public final int[] method2481(int arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg4 == -5969) {
            field5964++;
            return this.method2482(19579, arg0).method2094((byte) 68, this.field5968, (double) arg1, arg5, arg2, this.field5966[arg0].field235, arg3, this);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lhp;", line = 30)
    private final class389 method2482(int arg0, int arg1) {
        field5969++;
        if (arg0 != 19579) {
            this.method2488(-0.6752861F, 82, (byte) 27, true, -112, 121);
        }
        class508 var3 = this.field5971.method684((byte) 113, (long) arg1);
        if (var3 != null) {
            return (class389) var3;
        }
        byte[] var4 = this.field5970.method3344(126, arg1);
        if (var4 == null) {
            return null;
        } else {
            class389 var5 = new class389(new class630(var4));
            this.field5971.method681(var5, false, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZFII)[F", line = 54)
    public final float[] method2483(int arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5) {
        field5956++;
        if (arg0 < 83) {
            this.field5966 = null;
        }
        return this.method2482(19579, arg5).method2093(this.field5966[arg5].field235, arg1, 0, this, this.field5968, arg4);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V", line = 68)
    public static final void method2484(boolean arg0) {
        field5965++;
        class479 var1 = null;
        try {
            var1 = class648.method3631("2", (byte) -101);
            class630 var2 = new class630(class388.field4892 * 6 + 3);
            var2.method3509(1, (byte) -127);
            var2.method3526(class388.field4892, 13469);
            for (int var3 = 0; var3 < class412.field5150.length; var3++) {
                if (class287.field3574[var3]) {
                    var2.method3526(var3, 13469);
                    var2.method3464(class412.field5150[var3], -94);
                }
            }
            var1.method2605(0, (byte) 55, var2.field8812, var2.field8804);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method2603((byte) -127);
            }
        } catch (Exception var4) {
        }
        class591.field8305 = class571.method3150(119);
        class665.field9381 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I", line = 110)
    public final int method2485(int arg0) {
        if (arg0 != -16330) {
            this.method2483(-56, -128, false, 2.7798905F, 123, 54);
        }
        field5955++;
        return this.field5967;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Lvca;", line = 125)
    public final class13 method2486(int arg0, byte arg1) {
        if (arg1 == 86) {
            field5958++;
            return this.field5966[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZILqi;)V", line = 141)
    public static final void method2487(boolean arg0, int arg1, class514 arg2) {
        field5957++;
        if (arg1 != 6592 || class463.field5904 >= 400) {
            return;
        }
        if (class376.field4748 != arg2) {
            String var3;
            if (arg2.field7003 == 0) {
                boolean var4 = true;
                if (class376.field4748.field6987 != -1 && arg2.field6987 != -1) {
                    int var5 = class376.field4748.field6981 <= arg2.field6981 ? arg2.field6981 : class376.field4748.field6981;
                    int var6 = arg2.field6987 > class376.field4748.field6987 ? class376.field4748.field6987 : arg2.field6987;
                    int var7 = var5 * 10 / 100 + var6 + 5;
                    int var8 = class376.field4748.field6981 - arg2.field6981;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var7 < var8) {
                        var4 = false;
                    }
                }
                String var9 = class98.field1337 == class641.field9035 ? class83.field1138.method476((byte) 115, class250.field3068) : class83.field1136.method476((byte) -96, class250.field3068);
                if (arg2.field7021 > arg2.field6981) {
                    var3 = arg2.method2777((byte) -126, true) + (var4 ? class109.method613(arg2.field6981, true, class376.field4748.field6981) : "<col=ffffff>") + " (" + var9 + arg2.field6981 + "+" + (arg2.field7021 - arg2.field6981) + ")";
                } else {
                    var3 = arg2.method2777((byte) -123, true) + (var4 ? class109.method613(arg2.field6981, true, class376.field4748.field6981) : "<col=ffffff>") + " (" + var9 + arg2.field6981 + ")";
                }
            } else if (arg2.field7003 == -1) {
                var3 = arg2.method2777((byte) -127, true);
            } else {
                var3 = arg2.method2777((byte) -124, true) + " (" + class83.field1137.method476((byte) -55, class250.field3068) + arg2.field7003 + ")";
            }
            if (class664.field9377 && !arg0 && (class639.field8984 & 0x8) != 0) {
                class326.method1864(0, false, 0, -1, true, class477.field6046, 126, (long) arg2.field9676, class473.field6007 + " -> <col=ffffff>" + var3, 4, class537.field7208);
                class392.field4935++;
            }
            if (arg0) {
                class326.method1864(0, true, 0, 0, false, -1, 126, 0L, "", -1, "<col=cccccc>" + var3);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class280.field3518[var10] != null) {
                        short var11 = 0;
                        if (class98.field1337 == class662.field9360 && class280.field3518[var10].equalsIgnoreCase(class83.field1131.method476((byte) 113, class250.field3068))) {
                            if (arg2.field6981 > class376.field4748.field6981) {
                                var11 = 2000;
                            }
                            if (class376.field4748.field7015 != 0 && arg2.field7015 != 0) {
                                if (class376.field4748.field7015 == arg2.field7015) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class491.field6487[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class365.field4650[var10] + var11);
                        int var13 = class512.field6956[var10] == -1 ? class533.field7186 : class512.field6956[var10];
                        class651.field9192++;
                        class326.method1864(0, false, 0, -1, true, var13, 126, (long) arg2.field9676, "<col=ffffff>" + var3, var12, class280.field3518[var10]);
                    }
                }
            }
            if (!arg0) {
                for (class145 var14 = (class145) class1.field7.method237(121); var14 != null; var14 = (class145) class1.field7.method245((byte) 47)) {
                    if (var14.field1873 == 10) {
                        var14.field1867 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class664.field9377 && (class639.field8984 & 0x10) != 0) {
            class326.method1864(0, false, 0, -1, true, class477.field6046, arg1 - 6466, 0L, class473.field6007 + " -> <col=ffffff>" + class83.field1145.method476((byte) 96, class250.field3068), 2, class537.field7208);
            class355.field4531++;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(FIBZII)[I", line = 297)
    public final int[] method2488(float arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        field5961++;
        return arg2 < 13 ? null : this.method2482(19579, arg5).method2091(this, arg1, this.field5966[arg5].field235, this.field5968, arg4, (double) arg0, -126);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V", line = 310)
    public static void method2489(boolean arg0) {
        field5963 = null;
        field5960 = null;
        if (!arg0) {
            method2487(true, -50, null);
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lpl;Lpl;Lpl;)V", line = 324)
    public class469(class612 arg0, class612 arg1, class612 arg2) {
        this.field5970 = arg1;
        this.field5968 = arg2;
        class630 var4 = new class630(arg0.method3365(0, -126, 0));
        this.field5967 = var4.method3470(13111);
        this.field5966 = new class13[this.field5967];
        for (int var5 = 0; var5 < this.field5967; var5++) {
            if (var4.method3501(-9268) == 1) {
                this.field5966[var5] = new class13();
            }
        }
        for (int var6 = 0; var6 < this.field5967; var6++) {
            if (this.field5966[var6] != null) {
                this.field5966[var6].field246 = var4.method3501(-9268) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field5967; var7++) {
            if (this.field5966[var7] != null) {
                this.field5966[var7].field230 = var4.method3501(-9268) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field5967; var8++) {
            if (this.field5966[var8] != null) {
                this.field5966[var8].field241 = var4.method3501(-9268) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field5967; var9++) {
            if (this.field5966[var9] != null) {
                this.field5966[var9].field249 = var4.method3501(-9268) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field5967; var10++) {
            if (this.field5966[var10] != null) {
                this.field5966[var10].field231 = var4.method3480(-20933);
            }
        }
        for (int var11 = 0; var11 < this.field5967; var11++) {
            if (this.field5966[var11] != null) {
                this.field5966[var11].field242 = var4.method3480(-20933);
            }
        }
        for (int var12 = 0; var12 < this.field5967; var12++) {
            if (this.field5966[var12] != null) {
                this.field5966[var12].field234 = var4.method3480(-20933);
            }
        }
        for (int var13 = 0; var13 < this.field5967; var13++) {
            if (this.field5966[var13] != null) {
                this.field5966[var13].field248 = var4.method3480(-20933);
            }
        }
        for (int var14 = 0; var14 < this.field5967; var14++) {
            if (this.field5966[var14] != null) {
                this.field5966[var14].field247 = (short) var4.method3470(13111);
            }
        }
        for (int var15 = 0; var15 < this.field5967; var15++) {
            if (this.field5966[var15] != null) {
                this.field5966[var15].field239 = var4.method3480(-20933);
            }
        }
        for (int var16 = 0; var16 < this.field5967; var16++) {
            if (this.field5966[var16] != null) {
                this.field5966[var16].field228 = var4.method3480(-20933);
            }
        }
        for (int var17 = 0; var17 < this.field5967; var17++) {
            if (this.field5966[var17] != null) {
                this.field5966[var17].field233 = var4.method3501(-9268) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field5967; var18++) {
            if (this.field5966[var18] != null) {
                this.field5966[var18].field235 = var4.method3501(-9268) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field5967; var19++) {
            if (this.field5966[var19] != null) {
                this.field5966[var19].field232 = var4.method3480(-20933);
            }
        }
        for (int var20 = 0; var20 < this.field5967; var20++) {
            if (this.field5966[var20] != null) {
                this.field5966[var20].field238 = var4.method3501(-9268) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field5967; var21++) {
            if (this.field5966[var21] != null) {
                this.field5966[var21].field243 = var4.method3501(-9268) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field5967; var22++) {
            if (this.field5966[var22] != null) {
                this.field5966[var22].field245 = var4.method3501(-9268) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field5967; var23++) {
            if (this.field5966[var23] != null) {
                this.field5966[var23].field226 = var4.method3501(-9268);
            }
        }
        for (int var24 = 0; var24 < this.field5967; var24++) {
            if (this.field5966[var24] != null) {
                this.field5966[var24].field240 = var4.method3483(82);
            }
        }
        for (int var25 = 0; var25 < this.field5967; var25++) {
            if (this.field5966[var25] != null) {
                this.field5966[var25].field244 = var4.method3501(-9268) == 1;
            }
        }
    }
}

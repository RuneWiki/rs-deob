import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class37 extends class44 {

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    private int field812 = -32768;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "Z")
    private boolean field814 = false;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    private int field815 = 0;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    private int field813 = 0;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    private int field805;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    private int field808;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    private int field817;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
    private int field828;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    private int field799;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    private int field802;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "Lre;")
    private class183 field801;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lvd;")
    public static class222 field793 = class212.method1357("Registrierter Benutzer", 10731);

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "D")
    private double field797;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "D")
    public double field798;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "D")
    public double field804;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "D")
    private double field807;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "D")
    private double field811;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "D")
    private double field816;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "D")
    public double field819;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "D")
    private double field822;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    private int field825;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Lbg;")
    public static class19 field796;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "[[[B")
    public static byte[][][] field810;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
    public final void method298(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field814) {
            double var6 = (double) (arg2 - this.field799);
            double var8 = (double) (arg3 - this.field805);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field819 = (double) this.field828 * var6 / var10 + (double) this.field799;
            this.field804 = this.field808;
            this.field798 = (double) this.field828 * var8 / var10 + (double) this.field805;
        }
        field795++;
        double var12 = (double) (this.field823 + 1 - arg1);
        this.field822 = ((double) arg3 - this.field798) / var12;
        if (arg0 != 17847) {
            return;
        }
        this.field807 = ((double) arg2 - this.field819) / var12;
        this.field811 = Math.sqrt(this.field822 * this.field822 + this.field807 * this.field807);
        if (!this.field814) {
            this.field816 = -this.field811 * Math.tan((double) this.field802 * 0.02454369D);
        }
        this.field797 = ((double) arg4 - this.field804 - this.field816 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()I")
    public final int method87() {
        field829++;
        return this.field812;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method299(boolean arg0) {
        field810 = null;
        field793 = null;
        if (arg0) {
            method305(-119, -108, 17, (byte) -79, 35, 31);
        }
        field796 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Lee;")
    private final class49 method300(int arg0) {
        if (arg0 != 1722922868) {
            this.method89(-127, 38, -55, 24, 124, -11, -91, 19, -56L);
        }
        field820++;
        class98 var2 = class127.method805(this.field817, (byte) 84);
        class49 var3 = var2.method613(this.field815, arg0 ^ 0x66B1B35F);
        if (var3 == null) {
            return null;
        } else {
            var3.method355(this.field825);
            return var3;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field821++;
        if (arg1 != 3) {
            method305(-68, -125, 84, (byte) 60, 12, -126);
        }
        if (arg5 == arg6) {
            class34.method289(arg0, arg3, arg5, arg4, arg7, 71, arg2);
        } else if (arg4 - arg5 >= class112.field2107 && arg4 + arg5 <= class127.field2448 && arg3 - arg6 >= class129.field2514 && arg3 + arg6 <= class230.field4322) {
            class92.method586(arg3, -18343, arg5, arg0, arg7, arg4, arg6, arg2);
        } else {
            class55.method408(arg5, arg7, arg3, (byte) -128, arg0, arg2, arg4, arg6);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ld;ZLka;I)V")
    public static final void method302(class33 arg0, boolean arg1, class109 arg2, int arg3) {
        field827++;
        class237 var4 = new class237();
        if (arg1) {
            return;
        }
        var4.field4419 = arg2.method662((byte) -123);
        var4.field4417 = arg2.method710(28908);
        var4.field4410 = new class141[var4.field4419];
        var4.field4412 = new byte[var4.field4419][][];
        var4.field4422 = new int[var4.field4419];
        var4.field4409 = new class141[var4.field4419];
        var4.field4414 = new int[var4.field4419];
        var4.field4416 = new int[var4.field4419];
        for (int var5 = 0; var5 < var4.field4419; var5++) {
            try {
                int var6 = arg2.method662((byte) -106);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    int var7 = 0;
                    String var8 = new String(arg2.method674(-65).method1439(0));
                    String var9 = new String(arg2.method674(-41).method1439(0));
                    if (var6 == 1) {
                        var7 = arg2.method710(28908);
                    }
                    var4.field4416[var5] = var6;
                    var4.field4414[var5] = var7;
                    var4.field4409[var5] = arg0.method286(9, class135.method852(106, var8), var9);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg2.method674(-63).method1439(0));
                    String var11 = new String(arg2.method674(-125).method1439(0));
                    int var12 = arg2.method662((byte) -118);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg2.method674(-97).method1439(0));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method710(28908);
                            var15[var16] = new byte[var17];
                            arg2.method669(0, 0, var17, var15[var16]);
                        }
                    }
                    var4.field4416[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class135.method852(-34, var13[var19]);
                    }
                    var4.field4410[var5] = arg0.method284((byte) 82, class135.method852(84, var10), var11, var18);
                    var4.field4412[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field4422[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4422[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4422[var5] = -3;
            } catch (Exception var23) {
                var4.field4422[var5] = -4;
            } catch (Throwable var24) {
                var4.field4422[var5] = -5;
            }
        }
        class118.field2244.method235(var4, true);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lvd;I)V")
    public static final void method303(class222 arg0, int arg1) {
        class114.field2175 = arg0;
        class126.method798(0);
        if (arg1 != 3) {
            field793 = null;
        }
        field803++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field792++;
        class49 var11 = this.method300(1722922868);
        if (var11 != null) {
            var11.method89(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field812 = var11.method87();
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)V")
    public final void method304(int arg0, boolean arg1) {
        if (arg1) {
            method299(true);
        }
        this.field798 += (double) arg0 * this.field822;
        this.field804 += this.field797 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field816;
        this.field814 = true;
        this.field816 += (double) arg0 * this.field797;
        this.field819 += (double) arg0 * this.field807;
        field818++;
        this.field809 = (int) (Math.atan2(this.field807, this.field822) * 325.949D) + 1024 & 0x7FF;
        this.field825 = (int) (Math.atan2(this.field816, this.field811) * 325.949D) & 0x7FF;
        if (this.field801 == null) {
            return;
        }
        this.field813 += arg0;
        while (true) {
            do {
                do {
                    if (this.field813 <= this.field801.field3396[this.field815]) {
                        return;
                    }
                    this.field813 -= this.field801.field3396[this.field815];
                    this.field815++;
                } while (this.field815 < this.field801.field3404.length);
                this.field815 -= this.field801.field3385;
            } while (this.field815 >= 0 && this.field801.field3404.length > this.field815);
            this.field815 = 0;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIBII)V")
    public static final void method305(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field824++;
        long var6 = class146.method921(arg1, arg2, arg0);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int var9 = arg4;
            int[] var10 = class155.field2958.field445;
            if (var6 > 0L) {
                var9 = arg5;
            }
            int var11 = (int) var6 >> 14 & 0x1F;
            int var12 = (52736 - arg0 * 512) * 4 + arg2 * 4 + 24624;
            int var13 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            class65 var14 = class174.method1102(var13, 0);
            if (var14.field1223 == -1) {
                if (var11 == 0 || var11 == 2) {
                    if (var8 == 0) {
                        var10[var12] = var9;
                        var10[var12 + 512] = var9;
                        var10[var12 + 1024] = var9;
                        var10[var12 + 1536] = var9;
                    } else if (var8 == 1) {
                        var10[var12] = var9;
                        var10[var12 + 1] = var9;
                        var10[var12 + 2] = var9;
                        var10[var12 + 3] = var9;
                    } else if (var8 == 2) {
                        var10[var12 + 3] = var9;
                        var10[var12 + 3 + 512] = var9;
                        var10[var12 + 1024 + 3] = var9;
                        var10[var12 + 3 + 1536] = var9;
                    } else if (var8 == 3) {
                        var10[var12 + 1536] = var9;
                        var10[var12 + 1536 + 1] = var9;
                        var10[var12 + 1538] = var9;
                        var10[var12 + 1536 + 3] = var9;
                    }
                }
                if (var11 == 3) {
                    if (var8 == 0) {
                        var10[var12] = var9;
                    } else if (var8 == 1) {
                        var10[var12 + 3] = var9;
                    } else if (var8 == 2) {
                        var10[var12 + 3 + 1536] = var9;
                    } else if (var8 == 3) {
                        var10[var12 + 1536] = var9;
                    }
                }
                if (var11 == 2) {
                    if (var8 == 3) {
                        var10[var12] = var9;
                        var10[var12 + 512] = var9;
                        var10[var12 + 1024] = var9;
                        var10[var12 + 1536] = var9;
                    } else if (var8 == 0) {
                        var10[var12] = var9;
                        var10[var12 + 1] = var9;
                        var10[var12 + 2] = var9;
                        var10[var12 + 3] = var9;
                    } else if (var8 == 1) {
                        var10[var12 + 3] = var9;
                        var10[var12 + 3 + 512] = var9;
                        var10[var12 + 1024 + 3] = var9;
                        var10[var12 + 3 + 1536] = var9;
                    } else if (var8 == 2) {
                        var10[var12 + 1536] = var9;
                        var10[var12 + 1537] = var9;
                        var10[var12 + 1538] = var9;
                        var10[var12 + 1539] = var9;
                    }
                }
            } else {
                class219 var15 = class21.field504[var14.field1223];
                if (var15 != null) {
                    int var16 = (var14.field1196 * 4 - var15.field4057) / 2;
                    int var17 = (var14.field1209 * 4 - var15.field4061) / 2;
                    var15.method1394(arg2 * 4 + var16 + 48, 48 - (-((-var14.field1209 + 104 - arg0) * 4) + -var17));
                }
            }
        }
        long var18 = class200.method1280(arg1, arg2, arg0);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class65 var23 = class174.method1102(var22, 0);
            if (var23.field1223 != -1) {
                class219 var24 = class21.field504[var23.field1223];
                if (var24 != null) {
                    int var25 = (var23.field1196 * 4 - var24.field4057) / 2;
                    int var26 = (var23.field1209 * 4 - var24.field4061) / 2;
                    var24.method1394(arg2 * 4 + var25 + 48, (-var23.field1209 + -arg0 + 104) * 4 + var26 + 48);
                }
            } else if (var21 == 9) {
                int[] var27 = class155.field2958.field445;
                int var28 = 15658734;
                int var29 = arg2 * 4 + (52736 - arg0 * 512) * 4 + 24624;
                if (var18 > 0L) {
                    var28 = 15597568;
                }
                if (var20 == 0 || var20 == 2) {
                    var27[var29 + 1536] = var28;
                    var27[var29 + 1024 + 1] = var28;
                    var27[var29 + 2 + 512] = var28;
                    var27[var29 + 3] = var28;
                } else {
                    var27[var29] = var28;
                    var27[var29 + 512 + 1] = var28;
                    var27[var29 + 1026] = var28;
                    var27[var29 + 3 + 1536] = var28;
                }
            }
        }
        long var30 = class94.method603(arg1, arg2, arg0);
        if (arg3 <= 60 || var30 == 0L) {
            return;
        }
        int var32 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
        class65 var33 = class174.method1102(var32, 0);
        if (var33.field1223 == -1) {
            return;
        }
        class219 var34 = class21.field504[var33.field1223];
        if (var34 != null) {
            int var35 = (var33.field1196 * 4 - var34.field4057) / 2;
            int var36 = (var33.field1209 * 4 - var34.field4061) / 2;
            var34.method1394(arg2 * 4 + var35 + 48, (-var33.field1209 + 104 - arg0) * 4 + var36 + 48);
            return;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field826 = arg9;
        this.field805 = arg3;
        this.field808 = arg4;
        this.field817 = arg0;
        this.field814 = false;
        this.field800 = arg5;
        this.field828 = arg8;
        this.field799 = arg2;
        this.field806 = arg10;
        this.field802 = arg7;
        this.field823 = arg6;
        this.field794 = arg1;
        int var12 = class127.method805(this.field817, (byte) 84).field1827;
        if (var12 == -1) {
            this.field801 = null;
        } else {
            this.field801 = class93.method599((byte) -20, var12);
        }
    }
}

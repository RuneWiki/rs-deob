import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class184 {

    @OriginalMember(owner = "client!ro", name = "D", descriptor = "[I")
    public static int[] field11 = new int[250];

    @OriginalMember(owner = "client!ro", name = "J", descriptor = "I")
    public static int field17 = 0;

    @OriginalMember(owner = "client!ro", name = "K", descriptor = "Lap;")
    public static class335 field18 = new class335("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!ro", name = "Q", descriptor = "I")
    public static int field24 = 0;

    @OriginalMember(owner = "client!ro", name = "H", descriptor = "F")
    public static float field15;

    @OriginalMember(owner = "client!ro", name = "O", descriptor = "F")
    public static float field22;

    @OriginalMember(owner = "client!ro", name = "E", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ro", name = "G", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "I", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ro", name = "L", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ro", name = "M", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ro", name = "N", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "Lfe;")
    public static class403 field13;

    @OriginalMember(owner = "client!ro", name = "P", descriptor = "[Ldi;")
    private class83[] field23;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "(Z)V", line = 5)
    public static final void method5(boolean arg0) {
        ++field21;
        class533.field7841 = -1;
        class297.field3820 = null;
        if (arg0) {
            method12(58);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)[I", line = 18)
    public final int[] method6(int arg0, int arg1) {
        if (arg1 != 578) {
            this.method13(-31, 78);
        }
        ++field20;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (super.field2409.field436) {
            this.method10(super.field2409.method249((byte) -115), (byte) -87);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V", line = 42)
    public class2() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BILfh;)V", line = 47)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        int var4 = -44 % ((-13 - arg0) / 51);
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field2406 = arg2.method2737(false) == 1;
            }
        } else {
            this.field23 = new class83[arg2.method2737(false)];
            for (int var5 = 0; ~this.field23.length < ~var5; ++var5) {
                int var6 = arg2.method2737(false);
                if (var6 != 0) {
                    if (~var6 != -2) {
                        if (~var6 != -3) {
                            if (var6 == 3) {
                                this.field23[var5] = class375.method2131((byte) -88, arg2);
                            }
                        } else {
                            this.field23[var5] = class422.method2481(256, arg2);
                        }
                    } else {
                        this.field23[var5] = class194.method1193(0, arg2);
                    }
                } else {
                    this.field23[var5] = class169.method1085(arg2, 256);
                }
            }
        }
        ++field19;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lya;)V", line = 129)
    public static final void method8(class38 arg0) {
        for (int var1 = class329.field4164; var1 < class524.field7753; ++var1) {
            for (int var2 = 0; var2 < class470.field6825; ++var2) {
                for (int var3 = 0; var3 < class105.field1336; ++var3) {
                    class490 var4 = class125.field1664[var1][var2][var3];
                    if (var4 != null) {
                        class314 var5 = var4.field7126;
                        class314 var6 = var4.field7130;
                        if (var5 != null && var5.method194((byte) -107)) {
                            class345.method1981(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method194((byte) -106)) {
                                class345.method1981(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method193(var5, 0, false, 0, 0, 113, arg0);
                                var6.method180((byte) -2);
                            }
                            var5.method180((byte) -2);
                        }
                        for (class376 var7 = var4.field7127; var7 != null; var7 = var7.field4952) {
                            class205 var9 = var7.field4953;
                            if (var9 != null && var9.method194((byte) -92)) {
                                class345.method1981(arg0, var9, var1, var2, var3, var9.field2681 - var9.field2673 + 1, var9.field2670 - var9.field2671 + 1);
                                var9.method180((byte) -2);
                            }
                        }
                        class522 var8 = var4.field7131;
                        if (var8 != null && var8.method194((byte) -114)) {
                            class531.method3151(arg0, var8, var1, var2, var3);
                            var8.method180((byte) -2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(III)Le;", line = 209)
    public static final class372 method9(int arg0, int arg1, int arg2) {
        class490 var3 = class125.field1664[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7137;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "([[IB)V", line = 216)
    private final void method10(int[][] arg0, byte arg1) {
        ++field14;
        int var3 = class245.field3167;
        if (arg1 > -12) {
            method9(91, -20, -107);
        }
        int var4 = class79.field1026;
        class316.method1859(arg0, 0);
        class69.method613(class421.field5961, (byte) 105, 0, 0, class501.field7240);
        if (this.field23 != null) {
            for (int var5 = 0; ~this.field23.length < ~var5; ++var5) {
                class83 var6 = this.field23[var5];
                int var7 = var6.field1048;
                int var8 = var6.field1044;
                if (var7 >= 0) {
                    if (~var8 > -1) {
                        var6.method678(var3, var4, 0);
                    } else {
                        var6.method676(var3, var4, 22742);
                    }
                } else if (var8 >= 0) {
                    var6.method679(var3, false, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BI)V", line = 267)
    public static final void method11(byte arg0, int arg1) {
        class449 var2 = class512.field7423;
        synchronized (class512.field7423) {
            class512.field7423.method2648(false, arg1);
        }
        ++field16;
        class449 var3 = class363.field4723;
        synchronized (class363.field4723) {
            if (arg0 <= -85) {
                class363.field4723.method2648(false, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)V", line = 284)
    public static void method12(int arg0) {
        if (arg0 < 122) {
            field17 = 45;
        }
        field11 = null;
        field18 = null;
        field13 = null;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)[[I", line = 298)
    public final int[][] method13(int arg0, int arg1) {
        ++field12;
        int[][] var3 = super.field2416.method3031(-28526, arg0);
        if (arg1 != 1) {
            return null;
        } else {
            if (super.field2416.field7271) {
                int var4 = class245.field3167;
                int var5 = class79.field1026;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field2416.method3029((byte) -118);
                this.method10(var6, (byte) -111);
                for (int var8 = 0; ~var8 > ~class79.field1026; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; var14 < class245.field3167; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class378.method2145(var15 << 4, 4080);
                        var12[var14] = class378.method2145(65280, var15) >> 4;
                        var11[var14] = class378.method2145(var15, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }
}

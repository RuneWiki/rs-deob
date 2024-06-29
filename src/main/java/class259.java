import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class259 extends class64 {

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "I")
    public int field4542 = 0;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public static int field4538 = 0;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "[I")
    public static int[] field4548 = new int[100];

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
    public static int field4549 = 1;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "Lgk;")
    public static class157 field4524 = new class157();

    @OriginalMember(owner = "client!ik", name = "Z", descriptor = "[S")
    public static short[] field4556 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "Lve;")
    public static class189 field4552 = new class189(64);

    @OriginalMember(owner = "client!ik", name = "ab", descriptor = "I")
    public static int field4557 = 0;

    @OriginalMember(owner = "client!ik", name = "bb", descriptor = "Lid;")
    public static class149 field4558 = class60.method382("<col=00ff80>", (byte) 83);

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public int field4526;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
    public int field4527;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public int field4533;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public int field4534;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "I")
    public int field4543;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
    public int field4544;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
    public int field4545;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "Lpb;")
    public class127 field4550;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "Lbk;")
    public class20 field4540;

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "Lal;")
    public static class230 field4553;

    @OriginalMember(owner = "client!ik", name = "Y", descriptor = "Lal;")
    public static class230 field4555;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "Ljc;")
    public class238 field4531;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "Ljc;")
    public class238 field4541;

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "Lsa;")
    public static class260 field4546;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "Ljb;")
    public class268 field4529;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "Z")
    public boolean field4530;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "[I")
    public int[] field4522;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lbk;[II[I[I)V")
    public static final void method1781(class20 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        for (int var5 = arg2; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg3[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var7 != 0 && arg0.field2363.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field2363[var9] = null;
                    } else {
                        class164 var10 = class69.method436(var6, -32);
                        class242 var11 = arg0.field2363[var9];
                        int var12 = var10.field3030;
                        if (var11 != null) {
                            if (var11.field4254 == var6) {
                                if (var12 == 0) {
                                    var11 = arg0.field2363[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field4263 = 0;
                                    var11.field4255 = var8;
                                    var11.field4250 = 1;
                                    var11.field4259 = 0;
                                    var11.field4253 = 0;
                                    class94.method686(var10, arg0.field2340, -112, arg0.field2347, false, 0);
                                } else if (var12 == 2) {
                                    var11.field4259 = 0;
                                }
                            } else if (var10.field3036 >= class69.method436(var11.field4254, -32).field3036) {
                                var11 = arg0.field2363[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class242 var13 = arg0.field2363[var9] = new class242();
                            var13.field4250 = 1;
                            var13.field4254 = var6;
                            var13.field4255 = var8;
                            var13.field4253 = 0;
                            var13.field4263 = 0;
                            var13.field4259 = 0;
                            class94.method686(var10, arg0.field2340, arg2 ^ 0xFFFFFF8E, arg0.field2347, false, 0);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field4523++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[BII)I")
    public static final int method1782(int arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        if (arg3 >= -127) {
            field4555 = null;
        }
        field4547++;
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class48.field878[(arg1[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZ)V")
    public static final void method1783(boolean arg0, boolean arg1) {
        class267.method1852(arg0, class240.field4197, (byte) 91, class218.field3851, class11.field161);
        if (arg1) {
            method1781((class20) null, (int[]) null, -93, (int[]) null, (int[]) null);
        }
        field4537++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public final void method1784(int arg0) {
        field4539++;
        int var2 = this.field4545;
        if (this.field4529 != null) {
            class268 var5 = this.field4529.method1863((byte) -84);
            if (var5 == null) {
                this.field4526 = 0;
                this.field4527 = 0;
                this.field4545 = -1;
                this.field4532 = 0;
                this.field4522 = null;
            } else {
                this.field4532 = var5.field4830 * 128;
                this.field4545 = var5.field4793;
                this.field4522 = var5.field4827;
                this.field4526 = var5.field4765;
                this.field4527 = var5.field4823;
            }
        } else if (this.field4540 != null) {
            int var3 = class237.method1604((byte) 94, this.field4540);
            if (var2 != var3) {
                this.field4545 = var3;
                class59 var4 = this.field4540.field296;
                if (var4.field1046 != null) {
                    var4 = var4.method374(-1);
                }
                if (var4 == null) {
                    this.field4532 = 0;
                } else {
                    this.field4532 = var4.field1038 * 128;
                }
            }
        } else if (this.field4550 != null) {
            this.field4545 = class185.method1274(98, this.field4550);
            this.field4532 = this.field4550.field2219 * 128;
        }
        if (this.field4545 != var2 && this.field4531 != null) {
            class246.field4318.method814(this.field4531);
            this.field4531 = null;
        }
        int var6 = -117 % ((-arg0 - 75) / 32);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)Lfg;")
    public static final class12 method1785(int arg0, int arg1) {
        if (arg0 != -1328) {
            method1785(-6, 114);
        }
        field4528++;
        class12 var2 = (class12) class249.field4372.method1293((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class158.field2912.method1562(-809612665, 0, arg1);
        class12 var4 = new class12(var3);
        var4.method1151(class184.field3326, (int[]) null);
        class249.field4372.method1295((long) arg1, var4, (byte) -71);
        return var4;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method1786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field4535++;
        for (int var9 = 0; var9 < class168.field3120.field4965; var9++) {
            if (class168.field3120.method1919(71, var9)) {
                int var11 = class287.field5086 - (1 - (class91.field1615 - class168.field3120.field4969[var9]));
                int var12 = (var11 - arg2) * (arg4 - arg8) / (arg5 - arg2) + arg8;
                int var13 = class168.field3120.field4970[var9] - class80.field1480;
                int var14 = 16777215;
                int var15 = arg0 + ((arg3 - arg0) * (var13 - arg1) / (arg6 - arg1));
                int var16 = class168.field3120.method1916(var9, (byte) 13);
                class225 var17 = null;
                if (var16 == 0) {
                    if ((double) class11.field156 == 3.0D) {
                        var17 = class82.field1508;
                    }
                    if ((double) class11.field156 == 4.0D) {
                        var17 = class9.field129;
                    }
                    if ((double) class11.field156 == 6.0D) {
                        var17 = class224.field3938;
                    }
                    if ((double) class11.field156 >= 8.0D) {
                        var17 = class267.field4754;
                    }
                }
                if (var16 == 1) {
                    if ((double) class11.field156 == 3.0D) {
                        var17 = class224.field3938;
                    }
                    if ((double) class11.field156 == 4.0D) {
                        var17 = class267.field4754;
                    }
                    if ((double) class11.field156 == 6.0D) {
                        var17 = class151.field2755;
                    }
                    if ((double) class11.field156 >= 8.0D) {
                        var17 = class197.field3583;
                    }
                }
                if (var16 == 2) {
                    if ((double) class11.field156 == 3.0D) {
                        var17 = class151.field2755;
                    }
                    var14 = 16755200;
                    if ((double) class11.field156 == 4.0D) {
                        var17 = class197.field3583;
                    }
                    if ((double) class11.field156 == 6.0D) {
                        var17 = class287.field5116;
                    }
                    if ((double) class11.field156 >= 8.0D) {
                        var17 = class71.field1247;
                    }
                }
                if (class168.field3120.field4959[var9] != -1) {
                    var14 = class168.field3120.field4959[var9];
                }
                if (var17 != null) {
                    int var18 = class188.field3364.method1159(class168.field3120.field4967[var9], (int[]) null, class260.field4585);
                    int var19 = var12 - var17.method1509() * (var18 - 1) / 2;
                    int var20 = var19 + var17.method1513() / 2;
                    for (int var21 = 0; var21 < var18; var21++) {
                        class149 var22 = class260.field4585[var21];
                        if (var21 < var18 - 1) {
                            var22.method1064(-64, var22.method1053((byte) -106) - 4);
                        }
                        var17.method1507(var22, var15, var20, var14, true);
                        var20 += var17.method1509();
                    }
                }
            }
        }
        int var10 = 12 / ((-arg7 - 63) / 42);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILaj;)V")
    public static final void method1787(int arg0, class47 arg1) {
        field4551++;
        class47 var2 = class26.method146(arg1, (byte) 72);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class240.field4197;
            var4 = class218.field3851;
        } else {
            var4 = var2.field722;
            var3 = var2.field727;
        }
        class213.method1447(arg1, var4, false, var3, 2);
        if (arg0 != 0) {
            method1782(49, (byte[]) null, 45, -111);
        }
        class24.method140(arg1, (byte) -76, var4, var3);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public static void method1788(int arg0) {
        if (arg0 != -6580) {
            return;
        }
        field4552 = null;
        field4558 = null;
        field4556 = null;
        field4524 = null;
        field4546 = null;
        field4555 = null;
        field4548 = null;
        field4553 = null;
    }
}

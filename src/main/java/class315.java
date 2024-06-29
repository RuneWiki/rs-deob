import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class315 {

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Lau;")
    private class692 field4613 = new class692(64);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Lmv;")
    private class295 field4604;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Loea;")
    public static class547 field4612;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1956(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4606++;
        if (arg6 == arg7 && arg0 == arg8 && arg1 == arg5 && arg2 == arg9) {
            class617.method3530(arg4, arg6, arg8, arg2, true, arg5);
        } else {
            int var10 = arg6;
            int var11 = arg8;
            int var12 = arg6 * 3;
            int var13 = arg8 * 3;
            int var14 = arg7 * 3;
            int var15 = arg0 * 3;
            int var16 = arg1 * 3;
            int var17 = arg9 * 3;
            int var18 = arg5 + var14 - arg6 - var16;
            int var19 = arg2 + var15 - arg8 - var17;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg6;
                int var34 = (var28 - (-var30 - var32) >> 12) + arg8;
                class617.method3530(arg4, var10, var11, var34, true, var33);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg3 >= -25) {
            method1956(109, -35, -28, -32, -69, -51, -49, -63, 30, 50);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public final void method1957(int arg0) {
        field4611++;
        class692 var2 = this.field4613;
        synchronized (this.field4613) {
            this.field4613.method3891(13747);
            if (arg0 >= -38) {
                this.field4604 = null;
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)V")
    public static final void method1958(int arg0, int arg1, int arg2, int arg3) {
        field4605++;
        class489 var4 = class704.method3942(arg1, arg0, 0);
        var4.method2797(-1);
        var4.field6942 = arg2;
        var4.field6952 = arg3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
    public final void method1959(int arg0, int arg1) {
        class692 var3 = this.field4613;
        synchronized (this.field4613) {
            if (arg0 <= 32) {
                this.field4613 = null;
            }
            this.field4613.method3890(-1);
            this.field4613 = new class692(arg1);
        }
        field4609++;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public static void method1960(int arg0) {
        field4612 = null;
        if (arg0 != 16191) {
            field4612 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)V")
    public final void method1961(int arg0, int arg1) {
        class692 var3 = this.field4613;
        synchronized (this.field4613) {
            this.field4613.method3900(arg1, 0);
        }
        int var4 = -52 / ((60 - arg0) / 47);
        field4610++;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(II)Lju;")
    public final class350 method1962(int arg0, int arg1) {
        field4608++;
        class692 var3 = this.field4613;
        class350 var4;
        synchronized (this.field4613) {
            var4 = (class350) this.field4613.method3901((long) arg0, -52);
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field4604;
        byte[] var6;
        synchronized (this.field4604) {
            var6 = this.field4604.method1844(class206.method1326(arg0, (byte) 87), 31330, class405.method2496(1023, arg0));
        }
        if (arg1 != 26778) {
            this.method1961(-82, -22);
        }
        class350 var7 = new class350();
        if (var6 != null) {
            var7.method2166(false, new class540(var6));
        }
        class692 var8 = this.field4613;
        synchronized (this.field4613) {
            this.field4613.method3894(var7, (byte) 60, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public final void method1963(byte arg0) {
        field4607++;
        class692 var2 = this.field4613;
        synchronized (this.field4613) {
            this.field4613.method3890(-1);
        }
        if (arg0 != -50) {
            this.field4604 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z[[[BIB)V")
    public static final void method1964(boolean arg0, byte[][][] arg1, int arg2, byte arg3) {
        int var4 = arg0 ? 1 : 0;
        class129.field1862 = 0;
        class141.field2035 = 0;
        class612.field8820++;
        for (int var5 = 0; var5 < class311.field4576[var4]; var5++) {
            if (!class651.method3687(class313.field4591[var4][var5], arg0, arg1, arg2, arg3)) {
                class104.method746(class313.field4591[var4][var5]);
                if (class313.field4591[var4][var5].field7901 != -1) {
                    class258.field3351[class129.field1862++] = class313.field4591[var4][var5];
                }
            }
        }
        for (int var6 = 0; var6 < class48.field760[var4]; var6++) {
            if (!class651.method3687(class403.field6051[var4][var6], arg0, arg1, arg2, arg3)) {
                class104.method746(class403.field6051[var4][var6]);
                if (class403.field6051[var4][var6].field7901 != -1) {
                    class249.field3275[class141.field2035++] = class403.field6051[var4][var6];
                }
            }
        }
        for (int var7 = 0; var7 < class464.field6700[var4]; var7++) {
            if (!class651.method3687(class153.field2152[var4][var7], arg0, arg1, arg2, arg3)) {
                if (class153.field2152[var4][var7].method274(-1510217528)) {
                    class104.method746(class153.field2152[var4][var7]);
                    if (class153.field2152[var4][var7].field7901 != -1) {
                        class249.field3275[class141.field2035++] = class153.field2152[var4][var7];
                    }
                } else {
                    class104.method746(class153.field2152[var4][var7]);
                    if (class153.field2152[var4][var7].field7901 != -1) {
                        class258.field3351[class129.field1862++] = class153.field2152[var4][var7];
                    }
                }
            }
        }
        if (!arg0) {
            for (int var8 = 0; var8 < class296.field4366; var8++) {
                if (!class651.method3687(class117.field1753[var8], arg0, arg1, arg2, arg3)) {
                    class104.method746(class117.field1753[var8]);
                    if (class117.field1753[var8].field7901 != -1) {
                        if (class117.field1753[var8].method274(-1510217528)) {
                            class249.field3275[class141.field2035++] = class117.field1753[var8];
                        } else {
                            class258.field3351[class129.field1862++] = class117.field1753[var8];
                        }
                    }
                }
            }
        }
        if (class129.field1862 > 0) {
            class410.method2513(class258.field3351, 0, class129.field1862 - 1);
            for (int var9 = 0; var9 < class129.field1862; var9++) {
                class13.method88(class258.field3351[var9], true);
            }
        }
        if (class356.field5267) {
            class503.field7110.method696(0, null);
        }
        for (int var10 = class565.field8255; var10 < class555.field8157; var10++) {
            if (var10 < arg2 || arg1 == null) {
                int var21 = class406.field6066.length;
                if (class406.field6066.length + class617.field8900 > class91.field1390) {
                    var21 -= class406.field6066.length + class617.field8900 - class91.field1390;
                }
                int var22 = class406.field6066[0].length;
                if (class406.field6066[0].length + class181.field2501 > class575.field8372) {
                    var22 -= class406.field6066[0].length + class181.field2501 - class575.field8372;
                }
                boolean[][] var23 = class501.field7093;
                if (class476.field6821) {
                    if (class96.field1479) {
                        var23 = class60.field964[var10];
                    }
                    for (int var24 = class330.field4794; var24 < var21; var24++) {
                        int var25 = class617.field8900 + var24 - class330.field4794;
                        for (int var26 = class23.field432; var26 < var22; var26++) {
                            if (class406.field6066[var24][var26] && !class636.method3638(-20628, class181.field2501 + var26 - class23.field432, var10, var25)) {
                                var23[var24][var26] = true;
                            } else {
                                var23[var24][var26] = false;
                            }
                        }
                    }
                }
                if (class96.field1479) {
                    class178.field2480[var10].method2174(0, 0, 0, null, false);
                    for (int var27 = 0; var27 < class281.field3735; var27++) {
                        class78.field1283[var27].method2775(new class638(var10 + 1), (byte) -94);
                    }
                } else if (class473.field6798) {
                    class178.field2480[var10].method2168(class361.field5293, class545.field8045, class176.field2466, class501.field7093, true, class63.field999);
                } else {
                    class178.field2480[var10].method2174(class361.field5293, class545.field8045, class176.field2466, class501.field7093, true);
                }
            } else {
                int var12 = class406.field6066.length;
                if (class406.field6066.length + class617.field8900 > class91.field1390) {
                    var12 -= class406.field6066.length + class617.field8900 - class91.field1390;
                }
                int var13 = class406.field6066[0].length;
                if (class406.field6066[0].length + class181.field2501 > class575.field8372) {
                    var13 -= class406.field6066[0].length + class181.field2501 - class575.field8372;
                }
                boolean[][] var14 = class501.field7093;
                if (class476.field6821) {
                    if (class96.field1479) {
                        var14 = class60.field964[var10];
                    }
                    for (int var15 = class330.field4794; var15 < var12; var15++) {
                        int var16 = class617.field8900 + var15 - class330.field4794;
                        for (int var17 = class23.field432; var17 < var13; var17++) {
                            var14[var15][var17] = false;
                            if (class406.field6066[var15][var17]) {
                                int var18 = class181.field2501 + var17 - class23.field432;
                                for (int var19 = var10; var19 >= 0; var19--) {
                                    if (class603.field8695[var19][var16][var18] != null && class603.field8695[var19][var16][var18].field677 == var10) {
                                        if ((var19 < arg2 || arg1[var19][var16][var18] != arg3) && !class636.method3638(-20628, var18, var10, var16)) {
                                            var14[var15][var17] = true;
                                            break;
                                        }
                                        var14[var15][var17] = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (class96.field1479) {
                    class178.field2480[var10].method2174(0, 0, 0, null, false);
                    for (int var20 = 0; var20 < class281.field3735; var20++) {
                        class78.field1283[var20].method2775(new class638(var10 + 1), (byte) -94);
                    }
                } else if (class473.field6798) {
                    class178.field2480[var10].method2168(class361.field5293, class545.field8045, class176.field2466, class501.field7093, false, class63.field999);
                } else {
                    class178.field2480[var10].method2174(class361.field5293, class545.field8045, class176.field2466, class501.field7093, false);
                }
            }
        }
        if (class141.field2035 > 0) {
            class589.method3362(class249.field3275, 0, class141.field2035 - 1);
            for (int var11 = 0; var11 < class141.field2035; var11++) {
                class13.method88(class249.field3275[var11], true);
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lsea;ILmv;)V")
    public class315(class373 arg0, int arg1, class295 arg2) {
        this.field4604 = arg2;
        if (this.field4604 != null) {
            int var4 = this.field4604.method1816(-101) - 1;
            this.field4604.method1845(var4, true);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class446 extends class49 implements class395 {

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "Lcp;")
    public class397 field6483;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "Z")
    private boolean field6498;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "Ldp;")
    public static class174 field6488;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "Ldp;")
    public static class174 field6501;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lja;I)V")
    public final void method1021(class90 arg0, int arg1) {
        int var3 = -96 / ((-58 - arg1) / 56);
        this.field6483.method2523(-17547, arg0);
        ++field6486;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBZIILnf;Lja;)V")
    public final void method47(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class256 arg5, class90 arg6) {
        if (arg1 == 47) {
            ++field6482;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)I")
    public final int method1013(boolean arg0) {
        ++field6492;
        if (arg0) {
            this.field6498 = true;
        }
        return this.field6483.field5841;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIILc;IIZIII[I[III)I")
    public static final int method2790(int arg0, int arg1, int arg2, int arg3, class158 arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int[] arg11, int[] arg12, int arg13, int arg14) {
        ++field6491;
        for (int var15 = 0; var15 < 128; ++var15) {
            for (int var35 = 0; ~var35 > -129; ++var35) {
                class323.field4657[var15][var35] = 0;
                class415.field6012[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (~arg2 != -2) {
            if (arg2 == 2) {
                var16 = class86.method654(arg0, arg5, arg10, arg4, (byte) 125, arg13, arg8, arg1, arg3, arg14, arg6);
            } else {
                var16 = class331.method2166(arg13, false, arg1, arg4, arg3, arg0, arg2, arg6, arg8, arg10, arg14, arg5);
            }
        } else {
            var16 = class372.method2371(arg10, arg14, arg13, arg8, arg1, arg5, arg6, (byte) 125, arg3, arg0, arg4);
        }
        int var17 = arg3 - 64;
        int var18 = arg1 + -64;
        int var19 = class218.field3224;
        int var20 = class223.field3312;
        if (!var16) {
            if (!arg7) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = -var23 + arg0; arg0 + var23 >= var24; ++var24) {
                for (int var25 = -var23 + arg13; arg13 + var23 >= var25; ++var25) {
                    int var26 = -var17 + var24;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && ~var26 > -129 && ~var27 > -129 && ~class415.field6012[var26][var27] > -101) {
                        int var28 = 0;
                        if (~arg0 >= ~var24) {
                            if (arg0 - -arg8 + -1 < var24) {
                                var28 = 1 - (arg0 + arg8) + var24;
                            }
                        } else {
                            var28 = -var24 + arg0;
                        }
                        int var29 = 0;
                        if (var25 >= arg13) {
                            if (arg13 - (-arg14 - -1) < var25) {
                                var29 = -arg14 + 1 + -arg13 + var25;
                            }
                        } else {
                            var29 = -var25 + arg13;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || ~var21 == ~var30 && ~class415.field6012[var26][var27] > ~var22) {
                            var20 = var25;
                            var22 = class415.field6012[var26][var27];
                            var19 = var24;
                            var21 = var30;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (~arg3 == ~var19 && ~arg1 == ~var20) {
            return 0;
        } else {
            byte var31 = 0;
            class26.field390[var31] = var19;
            int var37 = var31 + 1;
            class253.field3656[var31] = var20;
            int var32;
            int var33 = var32 = class323.field4657[var19 - var17][-var18 + var20];
            while (arg3 != var19 || arg1 != var20) {
                if (~var32 != ~var33) {
                    var32 = var33;
                    class26.field390[var37] = var19;
                    class253.field3656[var37++] = var20;
                }
                if ((2 & var33) == 0) {
                    if ((var33 & 8) != 0) {
                        --var19;
                    }
                } else {
                    ++var19;
                }
                if (~(1 & var33) != -1) {
                    ++var20;
                } else if (~(4 & var33) != -1) {
                    --var20;
                }
                var33 = class323.field4657[-var17 + var19][-var18 + var20];
            }
            int var34 = 0;
            while (~(var37--) < -1) {
                arg11[var34] = class26.field390[var37];
                arg12[var34++] = class253.field3656[var37];
                if (~arg11.length >= ~var34) {
                    break;
                }
            }
            if (arg9 != 22) {
                return -109;
            } else {
                return var34;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZLja;)V")
    public final void method1022(boolean arg0, class90 arg1) {
        if (arg0) {
            this.field6483.method2527(arg1, 108);
            ++field6490;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)I")
    public final int method1020(int arg0) {
        if (arg0 != 15829) {
            this.field6483 = null;
        }
        ++field6493;
        return this.field6483.field5834;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V")
    public static void method2791(byte arg0) {
        field6501 = null;
        field6488 = null;
        int var1 = -73 / ((arg0 - -25) / 47);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLja;)Lkh;")
    public final class69 method134(byte arg0, class90 arg1) {
        ++field6496;
        class100 var3 = this.field6483.method2522(true, arg1, super.field795, 1024, false, (byte) -88, super.field787);
        if (var3 == null) {
            return null;
        } else {
            class202 var4 = arg1.method709();
            var4.method1527(super.field795, super.field784, super.field787);
            class69 var5 = null;
            if (this.field6498) {
                var5 = class256.method1849(1, 106);
            }
            if (this.field6483.field5813 == null) {
                var3.method530(var4, var5 != null ? var5.field1128[0] : null, 0);
            } else {
                class30 var6 = this.field6483.field5813.method427();
                arg1.method698(var3, var6, var4, var5 != null ? var5.field1128[0] : null, 0);
            }
            if (arg0 <= 90) {
                method2790(-128, -110, -53, 35, (class158) null, 22, -76, false, -17, 84, 50, (int[]) null, (int[]) null, 105, -78);
            }
            this.field6483.method2525(super.field795 >> 7, arg1, false, super.field787 >> 7, var3, true, super.field795 >> 7, super.field787 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILja;II)Z")
    public final boolean method132(int arg0, class90 arg1, int arg2, int arg3) {
        ++field6494;
        class100 var5 = this.field6483.method2522(false, arg1, super.field795, 65536, false, (byte) -117, super.field787);
        if (var5 == null) {
            return false;
        } else {
            class202 var6 = arg1.method709();
            var6.method1527(super.field795, super.field784, super.field787);
            if (arg2 != 28033) {
                this.field6483 = null;
            }
            return var5.method574(arg3, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V")
    public final void method54(int arg0) {
        ++field6502;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(Z)V")
    public static final void method2792(boolean arg0) {
        ++field6497;
        if (class435.field6350 == null) {
            class435.field6350 = new int[65536];
            double var1 = Math.random() * 0.03D - 0.015D + 0.7D;
            int var3 = 0;
            for (int var4 = 0; ~var4 > -513; ++var4) {
                float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                float var6 = (float) (7 & var4) / 8.0F + 0.0625F;
                for (int var7 = 0; ~var7 > -129; ++var7) {
                    float var8 = (float) var7 / 128.0F;
                    float var9 = 0.0F;
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    float var12 = var5 / 60.0F;
                    int var13 = (int) var12;
                    int var14 = var13 % 6;
                    float var15 = var12 - (float) var13;
                    float var16 = (1.0F - var6) * var8;
                    float var17 = (1.0F - var6 * var15) * var8;
                    float var18 = (1.0F - (-var15 + 1.0F) * var6) * var8;
                    if (var14 != 0) {
                        if (~var14 == -2) {
                            var11 = var16;
                            var10 = var8;
                            var9 = var17;
                        } else if (~var14 == -3) {
                            var9 = var16;
                            var10 = var8;
                            var11 = var18;
                        } else if (~var14 == -4) {
                            var9 = var16;
                            var10 = var17;
                            var11 = var8;
                        } else if (var14 == 4) {
                            var11 = var8;
                            var9 = var18;
                            var10 = var16;
                        } else if (~var14 == -6) {
                            var9 = var8;
                            var10 = var16;
                            var11 = var17;
                        }
                    } else {
                        var10 = var18;
                        var9 = var8;
                        var11 = var16;
                    }
                    float var19 = (float) Math.pow((double) var9, var1);
                    float var20 = (float) Math.pow((double) var10, var1);
                    float var21 = (float) Math.pow((double) var11, var1);
                    int var22 = (int) (var19 * 256.0F);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = (var23 << 8) + ((var22 << 16) + -16777216 - -var24);
                    class435.field6350[var3++] = var25;
                }
            }
            if (arg0) {
                method2793(-71);
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)Z")
    public final boolean method1018(byte arg0) {
        ++field6485;
        if (arg0 >= -16) {
            this.method54(121);
        }
        return this.field6483.method2536(16426);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILja;)V")
    public final void method137(int arg0, class90 arg1) {
        ++field6484;
        int var3 = -66 / ((arg0 - -31) / 51);
        class100 var4 = this.field6483.method2522(true, arg1, super.field795, 131072, true, (byte) -93, super.field787);
        if (var4 != null) {
            this.field6483.method2525(super.field795 >> 7, arg1, false, super.field787 >> 7, var4, false, super.field795 >> 7, super.field787 >> 7);
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)I")
    public final int method1024(int arg0) {
        ++field6487;
        return arg0 != 20691 ? -79 : this.field6483.field5827;
    }

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "(I)V")
    public static final void method2793(int arg0) {
        ++field6499;
        for (class54 var1 = (class54) class322.field4654.method2496(arg0 + 68); var1 != null; var1 = (class54) class322.field4654.method2487(0)) {
            var1.method426();
        }
        if (arg0 != 0) {
            method2793(68);
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lja;Lfb;IIIIIIZI)V")
    public class446(class90 arg0, class45 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field702, arg1.field738);
        this.field6483 = new class397(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field6498 = ~arg1.field697 != -1;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BILja;)Lrc;")
    public final class100 method1025(byte arg0, int arg1, class90 arg2) {
        if (arg0 != -84) {
            this.method1020(-60);
        }
        ++field6500;
        return this.field6483.method2522(false, arg2, 0, arg1, false, (byte) -60, 0);
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
    public final void method1023(int arg0) {
        if (arg0 >= 40) {
            ++field6495;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)Z")
    public final boolean method53(byte arg0) {
        ++field6489;
        if (arg0 <= 58) {
            this.field6498 = false;
        }
        return false;
    }
}

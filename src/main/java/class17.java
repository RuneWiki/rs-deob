import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 extends class170 {

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
    public static int field186 = -1;

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "Lge;")
    public static class511 field187 = new class511(64);

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!bu", name = "r", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIB)V")
    public final void method70(int arg0, int arg1, byte arg2) {
        if (arg2 != -99) {
            method97((class415) null, 80, (byte) -9);
        }
        ++field180;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)V")
    public final void method69(int arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            ++field185;
            int var4 = this.field190 * arg2 >> 12;
            int var5 = this.field184 * arg2 >> 12;
            int var6 = this.field183 * arg0 >> 12;
            int var7 = this.field182 * arg0 >> 12;
            class514.method3002(var4, super.field2534, var7, (byte) 93, var6, var5);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
    public static void method96(int arg0) {
        if (arg0 != -16) {
            field186 = 4;
        }
        field187 = null;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(IIB)V")
    public final void method72(int arg0, int arg1, byte arg2) {
        ++field179;
        int var4 = this.field190 * arg0 >> 12;
        if (arg2 != 60) {
            method97((class415) null, 92, (byte) -98);
        }
        int var5 = this.field184 * arg0 >> 12;
        int var6 = this.field183 * arg1 >> 12;
        int var7 = this.field182 * arg1 >> 12;
        class335.method2124(var6, super.field2538, (byte) -49, var7, super.field2534, var5, var4, super.field2533);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Liu;IB)V")
    public static final void method97(class415 arg0, int arg1, byte arg2) {
        ++field181;
        boolean var3 = arg0.method2487(1, -98) == 1;
        if (var3) {
            class8.field60[class177.field2636++] = arg1;
        }
        int var4 = arg0.method2487(2, -6);
        class510 var5 = class494.field7143[arg1];
        if (~var4 == -1) {
            if (var3) {
                var5.field7382 = false;
            } else if (~class497.field7188 == ~arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class22 var6 = class263.field3977[arg1] = new class22();
                var6.field228 = (var5.field6956 << 28) + (class82.field1315 - -var5.field343[0] >> 6 << 14) + (var5.field344[0] + class501.field7240 >> 6);
                if (var5.field7394 != -1) {
                    var6.field229 = var5.field7394;
                } else {
                    var6.field229 = var5.field318.method650((byte) -6);
                }
                var6.field230 = var5.field260;
                var6.field233 = var5.field7375;
                if (~var5.field7405 < -1) {
                    class501.method2926((byte) 120, var5);
                }
                class494.field7143[arg1] = null;
                if (~arg0.method2487(1, -124) != -1) {
                    class130.method957(-1190546226, arg1, arg0);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method2487(3, -16);
            int var8 = var5.field343[0];
            int var9 = var5.field344[0];
            if (var7 != 0) {
                if (var7 != 1) {
                    if (~var7 == -3) {
                        --var9;
                        ++var8;
                    } else if (~var7 != -4) {
                        if (~var7 == -5) {
                            ++var8;
                        } else if (var7 != 5) {
                            if (var7 != 6) {
                                if (~var7 == -8) {
                                    ++var8;
                                    ++var9;
                                }
                            } else {
                                ++var9;
                            }
                        } else {
                            ++var9;
                            --var8;
                        }
                    } else {
                        --var8;
                    }
                } else {
                    --var9;
                }
            } else {
                --var8;
                --var9;
            }
            if (!var3) {
                var5.method2969(class319.field4736[arg1], var9, var8, (byte) 110);
            } else {
                var5.field7372 = var9;
                var5.field7379 = var8;
                var5.field7382 = true;
            }
        } else if (~var4 == -3) {
            int var10 = arg0.method2487(4, -8);
            int var11 = var5.field343[0];
            int var12 = var5.field344[0];
            if (~var10 != -1) {
                if (var10 != 1) {
                    if (~var10 != -3) {
                        if (~var10 != -4) {
                            if (var10 == 4) {
                                var12 -= 2;
                                var11 += 2;
                            } else if (~var10 == -6) {
                                --var12;
                                var11 -= 2;
                            } else if (~var10 == -7) {
                                --var12;
                                var11 += 2;
                            } else if (var10 != 7) {
                                if (~var10 != -9) {
                                    if (var10 == 9) {
                                        var11 -= 2;
                                        ++var12;
                                    } else if (~var10 == -11) {
                                        ++var12;
                                        var11 += 2;
                                    } else if (~var10 == -12) {
                                        var11 -= 2;
                                        var12 += 2;
                                    } else if (var10 == 12) {
                                        var12 += 2;
                                        --var11;
                                    } else if (var10 != 13) {
                                        if (var10 == 14) {
                                            var12 += 2;
                                            ++var11;
                                        } else if (var10 == 15) {
                                            var11 += 2;
                                            var12 += 2;
                                        }
                                    } else {
                                        var12 += 2;
                                    }
                                } else {
                                    var11 += 2;
                                }
                            } else {
                                var11 -= 2;
                            }
                        } else {
                            ++var11;
                            var12 -= 2;
                        }
                    } else {
                        var12 -= 2;
                    }
                } else {
                    --var11;
                    var12 -= 2;
                }
            } else {
                var12 -= 2;
                var11 -= 2;
            }
            if (!var3) {
                var5.method2969(class319.field4736[arg1], var12, var11, (byte) 112);
            } else {
                var5.field7382 = true;
                var5.field7379 = var11;
                var5.field7372 = var12;
            }
        } else {
            int var13 = arg0.method2487(1, -67);
            if (~var13 == -1) {
                int var14 = arg0.method2487(12, -41);
                int var15 = var14 >> 10;
                int var16 = 31 & var14 >> 5;
                if (~var16 < -16) {
                    var16 -= 32;
                }
                int var17 = var14 & 31;
                if (~var17 < -16) {
                    var17 -= 32;
                }
                int var18 = var5.field343[0] + var16;
                int var19 = var5.field344[0] + var17;
                if (var3) {
                    var5.field7382 = true;
                    var5.field7379 = var18;
                    var5.field7372 = var19;
                } else {
                    var5.method2969(class319.field4736[arg1], var19, var18, (byte) 88);
                }
                var5.field6956 = (byte) (3 & var5.field6956 + var15);
                if (~class497.field7188 == ~arg1) {
                    class123.field1944 = var5.field6956;
                }
            } else {
                int var20 = arg0.method2487(30, -98);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 16383;
                int var23 = 16383 & var20;
                int var24 = (var5.field343[0] + class82.field1315 + var22 & 16383) + -class82.field1315;
                int var25 = (16383 & var5.field344[0] - -class501.field7240 + var23) + -class501.field7240;
                if (!var3) {
                    var5.method2969(class319.field4736[arg1], var25, var24, (byte) 111);
                } else {
                    var5.field7372 = var25;
                    var5.field7382 = true;
                    var5.field7379 = var24;
                }
                var5.field6956 = (byte) (var5.field6956 + var21 & 3);
                int var26 = 91 % ((arg2 - 21) / 63);
                if (class497.field7188 == arg1) {
                    class123.field1944 = var5.field6956;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IIIIIII)V")
    public class17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field183 = arg1;
        this.field190 = arg0;
        this.field182 = arg3;
        this.field184 = arg2;
    }
}

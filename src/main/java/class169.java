import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class169 extends class681 {

    @OriginalMember(owner = "client!ffa", name = "o", descriptor = "Z")
    private boolean field2455 = false;

    @OriginalMember(owner = "client!ffa", name = "s", descriptor = "Z")
    private boolean field2459;

    @OriginalMember(owner = "client!ffa", name = "v", descriptor = "[Lhea;")
    private class388[] field2462;

    @OriginalMember(owner = "client!ffa", name = "t", descriptor = "Llh;")
    public static class487 field2460 = new class487(12, 3);

    @OriginalMember(owner = "client!ffa", name = "u", descriptor = "[I")
    public static int[] field2461 = new int[14];

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!ffa", name = "m", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!ffa", name = "n", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!ffa", name = "p", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!ffa", name = "q", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!ffa", name = "r", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!ffa", name = "w", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method1196(int arg0, int arg1, int arg2) {
        if (arg2 != 20033) {
            method1196(64, -98, 96);
        }
        ++field2458;
        return ~(arg0 & 384) != -1;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZI)V", line = 20)
    public final void method739(boolean arg0, int arg1) {
        ++field2457;
        if (arg1 != 7) {
            this.field2455 = false;
        }
        super.field9721.method2199(class334.field4505, 9797, class276.field3814);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)Z", line = 33)
    public final boolean method751(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field2454;
            return true;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "(I)V", line = 44)
    public final void method740(int arg0) {
        if (arg0 != -3) {
            method1197(110);
        }
        ++field2452;
        if (!this.field2455) {
            super.field9721.method2223(0, class262.field3553, (byte) -66);
        } else {
            super.field9721.method2201((byte) -8, 1);
            super.field9721.method2241((class218) null, (byte) 44);
            super.field9721.method1042(false, class564.field7621);
            super.field9721.method2234(-76);
            if (this.field2459) {
                super.field9721.method2199(class334.field4505, 9797, class334.field4505);
                super.field9721.method2264(arg0 ^ -12, class262.field3553, 0);
                super.field9721.method2223(0, class262.field3553, (byte) -42);
            } else {
                super.field9721.method2199(class334.field4505, arg0 ^ -9800, class334.field4505);
                super.field9721.method2264(arg0 ^ -12, class262.field3553, 0);
                super.field9721.method2201((byte) 127, 2);
                super.field9721.method2199(class334.field4505, 9797, class334.field4505);
                super.field9721.method2264(9, class262.field3553, 0);
                super.field9721.method2264(9, class78.field1179, 1);
                super.field9721.method2223(0, class262.field3553, (byte) -34);
                super.field9721.method2241((class218) null, (byte) 44);
            }
            super.field9721.method2201((byte) -29, 0);
            this.field2455 = false;
        }
        super.field9721.method2199(class334.field4505, 9797, class334.field4505);
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lnv;)V", line = 85)
    public class169(class382 arg0) {
        super(arg0);
        if (arg0.field5372) {
            this.field2459 = ~arg0.field5352 > -4;
            int var2 = !this.field2459 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (var14 != 1) {
                            if (~var14 != -3) {
                                if (var14 == 3) {
                                    var15 = -var12;
                                } else if (var14 == 4) {
                                    var15 = var11;
                                } else {
                                    var15 = -var11;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = var16 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var18 << 24;
                    }
                    ++var6;
                }
            }
            this.field2462 = new class388[3];
            this.field2462[0] = super.field9721.method1028(false, var4, 64, 109);
            this.field2462[1] = super.field9721.method1028(false, var5, 64, 75);
            this.field2462[2] = super.field9721.method1028(false, var3, 64, 89);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILrga;I)V", line = 197)
    public final void method744(int arg0, class218 arg1, int arg2) {
        ++field2453;
        super.field9721.method2241(arg1, (byte) 44);
        super.field9721.method2246(arg0, 26770);
        if (arg2 != -3) {
            this.method751(false);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "(I)V", line = 209)
    public static void method1197(int arg0) {
        field2460 = null;
        if (arg0 != 512) {
            field2460 = null;
        }
        field2461 = null;
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(B)V", line = 225)
    public static final void method1198(byte arg0) {
        ++field2451;
        if (arg0 != 58) {
            field2461 = null;
        }
        for (class585 var1 = (class585) class198.field2809.method1436(28964); var1 != null; var1 = (class585) class198.field2809.method1443((byte) 6)) {
            class198 var2 = var1.field8246;
            if (~var2.field2789 > ~class186.field2697) {
                var1.method2340(117);
                var2.method1314((byte) -68);
            } else if (var2.field2821 <= class186.field2697) {
                if (~var2.field2802 < -1) {
                    class393 var3 = (class393) class299.field4071.method970((byte) 89, (long) (var2.field2802 + -1));
                    if (var3 != null) {
                        class61 var4 = var3.field5552;
                        if (var4.field4042 >= 0 && ~(class401.field5620 * 512) < ~var4.field4042 && ~var4.field4047 <= -1 && class257.field3508 * 512 > var4.field4047) {
                            var2.method1310((byte) 115, class249.method1533(var2.field4053, var4.field4047, var4.field4042, -104) + -var2.field2779, class186.field2697, var4.field4042, var4.field4047);
                        }
                    }
                }
                if (var2.field2802 < 0) {
                    int var5 = -var2.field2802 + -1;
                    class677 var6;
                    if (class409.field5813 != var5) {
                        var6 = class671.field9407[var5];
                    } else {
                        var6 = class143.field2063;
                    }
                    if (var6 != null && var6.field4042 >= 0 && var6.field4042 < class401.field5620 * 512 && var6.field4047 >= 0 && ~(class257.field3508 * 512) < ~var6.field4047) {
                        var2.method1310((byte) 115, class249.method1533(var2.field4053, var6.field4047, var6.field4042, -114) + -var2.field2779, class186.field2697, var6.field4042, var6.field4047);
                    }
                }
                var2.method1312(class41.field479, (byte) 86);
                class190.method1291(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIB)V", line = 289)
    public final void method742(int arg0, int arg1, byte arg2) {
        if (this.field2455) {
            super.field9721.method2201((byte) 0, 1);
            super.field9721.method2241(this.field2462[arg1 + -1], (byte) 44);
            super.field9721.method2201((byte) 120, 0);
        }
        int var4 = -126 / ((-38 - arg2) / 35);
        ++field2456;
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(ZI)V", line = 305)
    public final void method741(boolean arg0, int arg1) {
        if (this.field2462 != null && arg0) {
            super.field9721.method2201((byte) -42, 1);
            super.field9721.method1042(false, class669.field9395);
            class274 var3 = super.field9721.method2235(arg1 ^ 1);
            var3.method678(1024);
            super.field9721.method2227(class467.field6424, (byte) -103);
            if (!this.field2459) {
                super.field9721.method2199(class276.field3814, 9797, class334.field4505);
                super.field9721.method2264(arg1 + 6, class78.field1179, 0);
                super.field9721.method2201((byte) 124, 2);
                super.field9721.method2199(class335.field4510, 9797, class276.field3814);
                super.field9721.method2264(9, class78.field1179, 0);
                super.field9721.method1052(false, 1, true, class78.field1179, 96);
                super.field9721.method2223(0, class227.field3159, (byte) -16);
                super.field9721.method2241(super.field9721.field5305, (byte) 44);
            } else {
                super.field9721.method2199(class335.field4510, 9797, class276.field3814);
                super.field9721.method1052(false, 0, true, class262.field3553, arg1 ^ 116);
                super.field9721.method2223(0, class227.field3159, (byte) -91);
            }
            super.field9721.method2201((byte) 122, 0);
            this.field2455 = true;
        } else {
            super.field9721.method2223(0, class227.field3159, (byte) -82);
        }
        ++field2463;
        if (arg1 != 3) {
            this.field2459 = false;
        }
    }
}

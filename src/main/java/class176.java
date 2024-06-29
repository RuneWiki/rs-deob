import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class176 extends class224 {

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!di", name = "P", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!di", name = "T", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "Lil;")
    public static class162 field2755;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "Lnh;")
    public static class54 field2746;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "[Lsd;")
    private class44[] field2748;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V")
    public static final void method1228(int arg0) {
        class105.field1620.method1420(arg0);
        ++field2749;
        class28.field384.method1420(arg0);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIZBI[Lef;)V")
    public static final void method1229(int arg0, int arg1, boolean arg2, byte arg3, int arg4, class214[] arg5) {
        ++field2757;
        if (arg3 == -14) {
            for (int var6 = 0; ~var6 > ~arg5.length; ++var6) {
                class214 var7 = arg5[var6];
                if (var7 != null && var7.field3477 == arg0) {
                    class282.method1884(var7, arg1, -65, arg4, arg2);
                    class77.method520(arg4, arg1, (byte) -120, var7);
                    if (-var7.field3369 + var7.field3378 < var7.field3455) {
                        var7.field3455 = -var7.field3369 + var7.field3378;
                    }
                    if (var7.field3455 < 0) {
                        var7.field3455 = 0;
                    }
                    if (var7.field3448 > -var7.field3473 + var7.field3490) {
                        var7.field3448 = -var7.field3473 + var7.field3490;
                    }
                    if (var7.field3448 < 0) {
                        var7.field3448 = 0;
                    }
                    if (~var7.field3447 == -1) {
                        class54.method391((byte) 90, arg2, var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg2 > -46) {
            this.field2748 = null;
        }
        ++field2752;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field3624 = arg0.method201(255) == 1;
                return;
            }
        } else {
            this.field2748 = new class44[arg0.method201(255)];
            for (int var4 = 0; ~this.field2748.length < ~var4; ++var4) {
                int var5 = arg0.method201(255);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field2748[var4] = class246.method1664(arg0, 0);
                            }
                        } else {
                            this.field2748[var4] = class125.method848((byte) 45, arg0);
                        }
                    } else {
                        this.field2748[var4] = class3.method10(true, arg0);
                    }
                } else {
                    this.field2748[var4] = class232.method1583(arg0, -18772);
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(Z)V")
    public static final void method1230(boolean arg0) {
        ++field2756;
        class190.method1335();
        for (int var1 = 0; var1 < 4; ++var1) {
            class290.field4574[var1].method546((byte) 40);
        }
        if (arg0) {
            field2746 = null;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([[II)V")
    private final void method1231(int[][] arg0, int arg1) {
        ++field2747;
        int var3 = class36.field471;
        int var4 = class78.field1108;
        class223.method1521(arg1 + -127, arg0);
        class118.method781(arg1, 0, class206.field3220, (byte) -125, class261.field4217);
        if (this.field2748 != null) {
            for (int var5 = 0; this.field2748.length > var5; ++var5) {
                class44 var6 = this.field2748[var5];
                int var7 = var6.field565;
                int var8 = var6.field564;
                if (var8 < 0) {
                    if (~var7 <= -1) {
                        var6.method336(var3, (byte) 43, var4);
                    }
                } else if (var7 >= 0) {
                    var6.method332(var4, 119, var3);
                } else {
                    var6.method333(0, var4, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BLef;)Lef;")
    public static final class214 method1232(byte arg0, class214 arg1) {
        ++field2753;
        if (arg0 <= 57) {
            return null;
        } else if (~arg1.field3477 != 0) {
            return class206.method1403((byte) 7, arg1.field3477);
        } else {
            int var2 = arg1.field3474 >>> 16;
            class252 var3 = new class252(class2.field22);
            for (class35 var4 = (class35) var3.method1689(1); var4 != null; var4 = (class35) var3.method1690(-92)) {
                if (~var4.field456 == ~var2) {
                    return class206.method1403((byte) 7, (int) var4.field1750);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
    public class176() {
        super(0, true);
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field2750;
        int[][] var3 = super.field3616.method1341(false, arg0);
        if (super.field3616.field3042) {
            int var4 = class36.field471;
            int var5 = class78.field1108;
            int[][][] var6 = super.field3616.method1343(117);
            int[][] var7 = new int[var4][var5];
            this.method1231(var7, arg1 ^ 1);
            for (int var8 = 0; class36.field471 > var8; ++var8) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[2];
                int[] var13 = var10[1];
                for (int var14 = 0; class78.field1108 > var14; ++var14) {
                    int var15 = var9[var14];
                    var12[var14] = class224.method1526(4080, var15 << 4);
                    var13[var14] = class224.method1526(65280, var15) >> 4;
                    var11[var14] = class224.method1526(var15, 16711680) >> 12;
                }
            }
        }
        if (arg1 != 1) {
            this.field2748 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static void method1233(byte arg0) {
        field2755 = null;
        if (arg0 < -98) {
            field2746 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field2751;
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            this.method1231(super.field3625.method1861((byte) -66), 0);
        }
        if (!arg1) {
            this.field2748 = null;
        }
        return var3;
    }
}

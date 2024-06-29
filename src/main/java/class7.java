import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 extends class224 {

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    private int field103 = 2000;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    private int field111 = 0;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    private int field108 = 0;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    private int field110 = 4096;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    private int field112 = 16;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "[I")
    public static int[] field104 = new int[200];

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "F")
    public static float field106;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
    public static void method44(int arg0) {
        if (arg0 != 0) {
            field104 = null;
        }
        field104 = null;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class7() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILbk;)V")
    public static final void method45(int arg0, class20 arg1) {
        ++field107;
        class132 var2 = null;
        try {
            class208 var3 = arg1.method145("runescape", 10);
            while (var3.field3247 == 0) {
                class170.method1183(1L, (byte) -127);
            }
            if (~var3.field3247 == -2) {
                var2 = (class132) var3.field3249;
                class25 var4 = class19.method130(-14);
                var2.method902(0, var4.field349, var4.field339, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == 255) {
                if (var2 != null) {
                    var2.method898((byte) 5);
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        ++field109;
        if (arg2 < -46) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (~arg1 != -4) {
                            if (~arg1 == -5) {
                                this.field110 = arg0.method190(-3);
                            }
                        } else {
                            this.field108 = arg0.method190(-3);
                        }
                    } else {
                        this.field112 = arg0.method201(255);
                    }
                } else {
                    this.field103 = arg0.method190(-3);
                }
            } else {
                this.field111 = arg0.method201(255);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        ++field102;
        if (arg0 <= -4) {
            class189.method1329(21822);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIZI)V")
    public static final void method46(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field113;
        for (class190 var5 = (class190) class205.field3207.method350(8240); var5 != null; var5 = (class190) class205.field3207.method353((byte) -115)) {
            class8.method49(var5, -64, arg1, arg2, arg0, arg4);
        }
        for (class190 var6 = (class190) class54.field743.method350(8240); var6 != null; var6 = (class190) class54.field743.method353((byte) -113)) {
            class85 var11 = var6.field2996.method564(126);
            byte var12 = 1;
            if (~var6.field2996.field1196 == ~var11.field1319) {
                var12 = 0;
            } else if (var6.field2996.field1196 != var11.field1354 && var6.field2996.field1196 != var11.field1353 && var6.field2996.field1196 != var11.field1356 && var6.field2996.field1196 != var11.field1340) {
                if (~var6.field2996.field1196 == ~var11.field1336 || ~var6.field2996.field1196 == ~var11.field1334 || var6.field2996.field1196 == var11.field1323 || var6.field2996.field1196 == var11.field1338) {
                    var12 = 3;
                }
            } else {
                var12 = 2;
            }
            if (var6.field3006 != var12) {
                int var13 = class258.method1773(var6.field2996, -17921);
                if (var6.field3018 != var13) {
                    if (var6.field2986 != null) {
                        class130.field1907.method716(var6.field2986);
                        var6.field2986 = null;
                    }
                    var6.field3018 = var13;
                }
                var6.field3006 = var12;
            }
            var6.field3003 = var6.field2996.field1226;
            var6.field3016 = var6.field2996.field1226 - -(64 * var6.field2996.method565((byte) 0));
            var6.field2990 = var6.field2996.field1273;
            var6.field3007 = var6.field2996.field1273 + 64 * var6.field2996.method565((byte) 0);
            class8.method49(var6, -75, arg1, arg2, arg0, arg4);
        }
        if (arg3) {
            method44(-24);
        }
        for (class190 var7 = (class190) class290.field4573.method671(0); var7 != null; var7 = (class190) class290.field4573.method666(125)) {
            byte var8 = 1;
            class85 var9 = var7.field2991.method564(126);
            if (~var7.field2991.field1196 != ~var9.field1319) {
                if (~var7.field2991.field1196 != ~var9.field1354 && ~var7.field2991.field1196 != ~var9.field1353 && var7.field2991.field1196 != var9.field1356 && var7.field2991.field1196 != var9.field1340) {
                    if (~var7.field2991.field1196 == ~var9.field1336 || var7.field2991.field1196 == var9.field1334 || var7.field2991.field1196 == var9.field1323 || ~var7.field2991.field1196 == ~var9.field1338) {
                        var8 = 3;
                    }
                } else {
                    var8 = 2;
                }
            } else {
                var8 = 0;
            }
            if (var7.field3006 != var8) {
                int var10 = class222.method1507(var7.field2991, 0);
                if (~var7.field3018 != ~var10) {
                    if (var7.field2986 != null) {
                        class130.field1907.method716(var7.field2986);
                        var7.field2986 = null;
                    }
                    var7.field3018 = var10;
                }
                var7.field3006 = var8;
            }
            var7.field3003 = var7.field2991.field1226;
            var7.field3016 = var7.field2991.field1226 - -(var7.field2991.method565((byte) 0) * 64);
            var7.field2990 = var7.field2991.field1273;
            var7.field3007 = var7.field2991.field1273 - -(var7.field2991.method565((byte) 0) * 64);
            class8.method49(var7, -68, arg1, arg2, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ID)V")
    public static final void method47(int arg0, double arg1) {
        if (class234.field3763 != arg1) {
            for (int var3 = 0; var3 < 256; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg1));
                class226.field3649[var3] = ~var4 < -256 ? 255 : var4;
            }
            class234.field3763 = arg1;
        }
        ++field115;
        if (arg0 != 3) {
            field104 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field105;
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (!arg1) {
            this.field103 = -125;
        }
        if (super.field3625.field4425) {
            int var4 = this.field110 >> 1;
            int[][] var5 = super.field3625.method1861((byte) -24);
            Random var6 = new Random((long) this.field111);
            for (int var7 = 0; this.field103 > var7; ++var7) {
                int var8 = ~this.field110 < -1 ? this.field108 + -var4 + class80.method557(this.field110, var6, arg1) : this.field108;
                int var9 = (var8 & 4085) >> 4;
                int var10 = class80.method557(class78.field1108, var6, true);
                int var11 = class80.method557(class36.field471, var6, true);
                int var12 = (class216.field3527[var9] * this.field112 >> 12) + var10;
                int var13 = (class262.field4243[var9] * this.field112 >> 12) + var11;
                int var14 = -var10 + var12;
                int var15 = -var11 + var13;
                if (var14 != 0 || var15 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 < ~var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        var11 = var17;
                        int var18 = var12;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        var10 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = -var10 + var12;
                    int var22 = var11;
                    int var23 = 2048 / var21;
                    int var24 = -var21 / 2;
                    int var25 = var13 - var11;
                    int var26 = -(class80.method557(4096, var6, true) >> 2) + 1024;
                    if (var25 < 0) {
                        var25 = -var25;
                    }
                    int var27 = var13 <= var11 ? -1 : 1;
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = var26 - -((-var10 + var28) * var23) + 1024;
                        var24 += var25;
                        int var30 = class206.field3220 & var28;
                        int var31 = var22 & class261.field4217;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (~var24 < -1) {
                            var24 -= var21;
                            var22 -= -var27;
                        }
                    }
                }
            }
        }
        return var3;
    }
}

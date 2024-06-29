import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public abstract class class559 extends class668 {

    @OriginalMember(owner = "client!vp", name = "A", descriptor = "B")
    public byte field7926;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "S")
    public short field7927;

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "S")
    public short field7930;

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "S")
    public short field7934;

    @OriginalMember(owner = "client!vp", name = "C", descriptor = "Z")
    public boolean field7928;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "S")
    public short field7931;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "Ltm;")
    public static class334 field7932 = new class334(60, 6);

    @OriginalMember(owner = "client!vp", name = "J", descriptor = "[I")
    public static int[] field7935 = new int[1];

    @OriginalMember(owner = "client!vp", name = "N", descriptor = "I")
    public static int field7939 = 0;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
    public static int field7925;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!vp", name = "K", descriptor = "I")
    public static int field7936;

    @OriginalMember(owner = "client!vp", name = "L", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!vp", name = "M", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lofa;I)Lnda;")
    public static final class268 method3245(class301 arg0, int arg1) {
        ++field7936;
        int var2 = arg0.method1989((byte) -105);
        if (arg1 > -26) {
            return null;
        } else {
            class686 var3 = class99.method818((byte) 18)[arg0.method1987(-19)];
            class322 var4 = class570.method3305(0)[arg0.method1987(-94)];
            int var5 = arg0.method1977((byte) 97);
            int var6 = arg0.method1977((byte) -126);
            return new class268(var2, var3, var4, var5, var6);
        }
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(B)Z")
    public final boolean method1468(byte arg0) {
        ++field7938;
        if (arg0 >= -82) {
            field7939 = -1;
        }
        for (int var2 = this.field7927; ~var2 >= ~this.field7931; ++var2) {
            for (int var3 = this.field7930; var3 <= this.field7934; ++var3) {
                int var4 = -class336.field4923 + class155.field2405 + var2;
                if (~var4 <= -1 && ~class52.field838.length < ~var4) {
                    int var5 = class155.field2405 + var3 + -class63.field996;
                    if (~var5 <= -1 && ~var5 > ~class52.field838.length && class52.field838[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "([Lvt;I)I")
    public final int method1469(class759[] arg0, int arg1) {
        ++field7929;
        int var3 = 0;
        int var4 = this.field7927;
        if (arg1 < 104) {
            return -104;
        } else {
            label116: while (~var4 >= ~this.field7931) {
                label114: for (int var5 = this.field7930; var5 <= this.field7934; ++var5) {
                    long var6 = class324.field4792[super.field9470][var4][var5];
                    long var8 = 0L;
                    while (true) {
                        label109: while (true) {
                            if (var8 > 48L) {
                                continue label114;
                            }
                            int var10 = (int) (var6 >>> (int) var8 & 65535L);
                            if (var10 <= 0) {
                                continue label114;
                            }
                            class639 var11 = class96.field1422[var10 + -1];
                            for (int var12 = 0; ~var3 < ~var12; ++var12) {
                                if (arg0[var12] == var11.field8979) {
                                    var8 += 16L;
                                    continue label109;
                                }
                            }
                            arg0[var3++] = var11.field8979;
                            if (var3 == 4) {
                                break label116;
                            }
                            var8 += 16L;
                        }
                    }
                }
                ++var4;
            }
            for (int var13 = var3; ~var13 > -5; ++var13) {
                arg0[var13] = null;
            }
            if (this.field7926 != 0) {
                int var14 = this.field7927 - class336.field4923;
                int var15 = -class63.field996 + this.field7930;
                int var16;
                short var17;
                int var18;
                short var19;
                if (this.field7926 == 1) {
                    if (~var15 < ~var14) {
                        var16 = this.field7930 + -1;
                        var17 = this.field7930;
                        var18 = this.field7927 - -1;
                        var19 = this.field7927;
                    } else {
                        var17 = this.field7930;
                        var18 = this.field7927 + -1;
                        var19 = this.field7927;
                        var16 = this.field7930 + 1;
                    }
                } else if (-var14 >= var15) {
                    var17 = this.field7930;
                    var18 = this.field7927 + 1;
                    var16 = this.field7930 + 1;
                    var19 = this.field7927;
                } else {
                    var16 = this.field7930 - 1;
                    var19 = this.field7927;
                    var17 = this.field7930;
                    var18 = this.field7927 + -1;
                }
                label80: for (int var20 = 0; ~var20 > ~var3; ++var20) {
                    long var21 = class324.field4792[super.field9470][var19][var16];
                    while (~var21 != -1L) {
                        class639 var27 = class96.field1422[(int) ((var21 & 65535L) - 1L)];
                        var21 >>>= 16;
                        if (arg0[var20] == var27.field8979) {
                            continue label80;
                        }
                    }
                    long var23 = class324.field4792[super.field9470][var18][var17];
                    while (var23 != 0L) {
                        class639 var26 = class96.field1422[(int) ((65535L & var23) + -1L)];
                        var23 >>>= 16;
                        if (arg0[var20] == var26.field8979) {
                            continue label80;
                        }
                    }
                    for (int var25 = var20; ~var25 > ~(var3 - 1); ++var25) {
                        arg0[var25] = arg0[var25 + 1];
                    }
                    --var3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "(B)V")
    public static void method3246(byte arg0) {
        field7935 = null;
        field7932 = null;
        int var1 = -30 / ((69 - arg0) / 55);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILha;)Z")
    public final boolean method1467(int arg0, class544 arg1) {
        ++field7925;
        if (arg0 > -26) {
            method3246((byte) -58);
        }
        return class253.method1720(super.field9469, this.field7927, this.field7931, this.field7934, this.field7930, (byte) -118, this.method93(arg1, 1));
    }

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "(I)V")
    public void method894(int arg0) {
        if (arg0 != 240) {
            this.field7926 = -13;
        }
        ++field7937;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lcca;ZZ)V")
    public static final void method3247(class461 arg0, boolean arg1, boolean arg2) {
        ++field7933;
        if (~class608.field8588 > -401) {
            class504 var3 = arg0.field6688;
            if (var3.field7308 != null) {
                var3 = var3.method3046(91, class422.field6216);
                if (var3 == null) {
                    return;
                }
            }
            if (var3.field7334) {
                String var4 = var3.field7344;
                if (var3.field7333 != 0) {
                    String var5 = class519.field7498 != class322.field4757 ? class641.field9021.method3621(105, class467.field6804) : class641.field9023.method3621(97, class467.field6804);
                    var4 = var4 + class446.method2723(class145.field2251.field8121, var3.field7333, -87) + " (" + var5 + var3.field7333 + ")";
                }
                if (class552.field7867 && !arg2) {
                    class193 var6 = class493.field7149 != -1 ? class382.field5728.method1997((byte) 105, class493.field7149) : null;
                    if ((2 & class553.field7869) != 0 && (var6 == null || ~var3.method3040(12, class493.field7149, var6.field3339) != ~var6.field3339)) {
                        ++class628.field8808;
                        class274.method1800(0, class355.field5375 + " -> <col=ffff00>" + var4, true, (byte) -112, false, class400.field5936, 0, -1, (long) arg0.field1628, false, class131.field2134, 45, (long) arg0.field1628);
                    }
                }
                if (!arg2) {
                    String[] var7 = var3.field7294;
                    if (class440.field6415) {
                        var7 = class461.method2822((byte) -67, var7);
                    }
                    if (var7 != null) {
                        for (int var8 = 4; ~var8 <= -1; --var8) {
                            if (var7[var8] != null && (var3.field7358 == 0 || !var7[var8].equalsIgnoreCase(class641.field9016.method3621(93, class467.field6804)))) {
                                byte var9 = 0;
                                if (var8 == 0) {
                                    var9 = 58;
                                }
                                int var10 = class380.field5712;
                                if (~var8 == -2) {
                                    var9 = 30;
                                }
                                if (~var8 == -3) {
                                    var9 = 23;
                                }
                                if (var8 == 3) {
                                    var9 = 15;
                                }
                                if (~var3.field7351 == ~var8) {
                                    var10 = var3.field7291;
                                }
                                if (~var8 == -5) {
                                    var9 = 2;
                                }
                                if (var3.field7301 == var8) {
                                    var10 = var3.field7329;
                                }
                                class274.method1800(0, "<col=ffff00>" + var4, true, (byte) 90, false, !var7[var8].equalsIgnoreCase(class641.field9016.method3621(99, class467.field6804)) ? var10 : var3.field7330, 0, -1, (long) arg0.field1628, false, var7[var8], var9, (long) arg0.field1628);
                                ++class510.field7395;
                            }
                        }
                    }
                    if (var3.field7358 == 1 && var7 != null) {
                        for (int var11 = 4; ~var11 <= -1; --var11) {
                            if (var7[var11] != null && var7[var11].equalsIgnoreCase(class641.field9016.method3621(111, class467.field6804))) {
                                short var12 = 0;
                                if (var3.field7333 > class145.field2251.field8121) {
                                    var12 = 2000;
                                }
                                short var13 = 0;
                                if (var11 == 0) {
                                    var13 = 58;
                                }
                                if (var11 == 1) {
                                    var13 = 30;
                                }
                                if (var11 == 2) {
                                    var13 = 23;
                                }
                                if (~var11 == -4) {
                                    var13 = 15;
                                }
                                if (var11 == 4) {
                                    var13 = 2;
                                }
                                if (~var13 != -1) {
                                    var13 += var12;
                                }
                                ++class178.field3048;
                                class274.method1800(0, "<col=ffff00>" + var4, true, (byte) 104, false, var3.field7330, 0, -1, (long) arg0.field1628, false, var7[var11], var13, (long) arg0.field1628);
                            }
                        }
                    }
                }
                class274.method1800(0, "<col=ffff00>" + var4, true, (byte) 93, arg1, class637.field8956, 0, -1, (long) arg0.field1628, arg2, class641.field9015.method3621(107, class467.field6804), 1004, (long) arg0.field1628);
                ++class548.field7820;
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field7926 = arg10;
        this.field7927 = (short) arg5;
        super.field9469 = (byte) arg1;
        super.field9477 = arg2;
        this.field7930 = (short) arg7;
        this.field7934 = (short) arg8;
        super.field9470 = (byte) arg0;
        this.field7928 = arg9;
        super.field9474 = arg3;
        this.field7931 = (short) arg6;
        super.field9475 = arg4;
    }
}

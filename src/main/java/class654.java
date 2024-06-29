import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class654 {

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    private int field9114 = -1;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "Z")
    public boolean field9117 = true;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "Lbba;")
    private class116 field9108;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    private int field9110;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    private int field9112;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Luv;")
    private class367 field9109;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    private int field9119;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    private int field9106;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "Lug;")
    private class562 field9118;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public int field9104;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Ljs;")
    private class334 field9105;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "[I")
    public static int[] field9107 = new int[1];

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "[[[B")
    public static byte[][][] field9113;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public final void method3688(int arg0) {
        field9103++;
        if (arg0 != 30925) {
            method3693(-107L, -52);
        }
        this.method3690(-18732, this.field9118, this.field9104);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)B")
    public static final byte method3689(int arg0, int arg1, int arg2) {
        field9115++;
        if (arg1 <= 54) {
            method3689(8, 49, -34);
        }
        if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILug;I)V")
    public final void method3690(int arg0, class562 arg1, int arg2) {
        if (arg2 > 0) {
            this.method3692(128);
            this.field9109.method2148(this.field9105, 125);
            this.field9109.method1304(class387.field5460, this.field9106 + 1 - this.field9119, 0, 26810, arg1, this.field9119, arg2);
        }
        if (arg0 != -18732) {
            method3691(41);
        }
        field9120++;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public static void method3691(int arg0) {
        field9107 = null;
        field9113 = null;
        if (arg0 != 27387) {
            method3691(102);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
    private final void method3692(int arg0) {
        if (arg0 != 128) {
            this.field9105 = null;
        }
        field9116++;
        if (!this.field9117) {
            return;
        }
        this.field9117 = false;
        byte[] var2 = this.field9108.field1532;
        int var3 = 0;
        int var4 = this.field9108.field1536;
        int var5 = this.field9108.field1536 * this.field9110 + this.field9112;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field9105 != null && this.field9114 == var3) {
            this.field9117 = false;
            return;
        }
        this.field9114 = var3;
        int var7 = this.field9112 + (this.field9110 * var4);
        int var8 = 0;
        if (!this.field9109.method1315(arg0 - 128, class695.field9710, class594.field8277)) {
            if (class666.field9278 == null) {
                class666.field9278 = new int[16384];
            }
            int[] var9 = class666.field9278;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var7] == 0) {
                        int var12 = 0;
                        if (var2[var7 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var12++;
                        }
                        var9[var8++] = var12 * 17 << 24;
                    } else {
                        var9[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field9108.field1536 - 128;
            }
            if (this.field9105 == null) {
                this.field9105 = this.field9109.method2150(128, 128, (byte) 31, class666.field9278, false);
                this.field9105.method1694(false, false, arg0 - 61);
            } else {
                this.field9105.method1697(17779, 0, 128, class666.field9278, 0, 0, 128, 128);
            }
            return;
        }
        if (class696.field9734 == null) {
            class696.field9734 = new byte[16384];
        }
        byte[] var13 = class696.field9734;
        for (int var14 = -128; var14 < 0; var14++) {
            for (int var15 = -128; var15 < 0; var15++) {
                if (var2[var7] == 0) {
                    int var16 = 0;
                    if (var2[var7 - 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var16++;
                    }
                    if (var2[var4 + var7] != 0) {
                        var16++;
                    }
                    var13[var8++] = (byte) (var16 * 17);
                } else {
                    var13[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field9108.field1536 - 128;
        }
        if (this.field9105 == null) {
            this.field9105 = this.field9109.method2176(128, class695.field9710, (byte) 87, class696.field9734, false, 128);
            this.field9105.method1694(false, false, 124);
        } else {
            this.field9105.method1691(128, 0, 128, 0, 128, -26946, class696.field9734, class695.field9710, 0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Luv;Lbba;Lsi;IIIII)V")
    public class654(class367 arg0, class116 arg1, class560 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field9108 = arg1;
        this.field9110 = arg7;
        this.field9112 = arg6;
        this.field9109 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field3727 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field7883[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field9104 = 0;
            this.field9105 = null;
        } else {
            this.field9119 = Integer.MAX_VALUE;
            this.field9106 = Integer.MIN_VALUE;
            this.field9118 = this.field9109.method1281((byte) 84, false);
            this.field9118.method180(var10, 20779);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field9118.method179(true, -102);
                if (var15 != null) {
                    Stream var16 = this.field9109.method2170(24022, var15);
                    if (Stream.method3786()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field3727 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field7883[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 > this.field9106) {
                                            this.field9106 = var22;
                                        }
                                        if (this.field9119 > var22) {
                                            this.field9119 = var22;
                                        }
                                        var16.method3791(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field3727 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field7883[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 < this.field9119) {
                                            this.field9119 = var28;
                                        }
                                        if (var28 > this.field9106) {
                                            this.field9106 = var28;
                                        }
                                        var16.method3792(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3795();
                    if (this.field9118.method178((byte) -120)) {
                        break;
                    }
                }
            }
            this.field9104 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(JI)V")
    public static final void method3693(long arg0, int arg1) {
        field9111++;
        if (class77.field947 != null) {
            if (class8.field57 == 1 || class8.field57 == 5) {
                class256.method1526(arg0, (byte) -102);
            } else if (class8.field57 == 4) {
                class249.method1491(-1, arg0);
            }
        }
        class704.method3970((long) class406.field5732, true, class21.field142);
        if (class116.field1543 != -1) {
            class54.method312(class116.field1543, -47);
        }
        int var3 = 49 % ((66 - arg1) / 60);
        for (int var4 = 0; var4 < class497.field6763; var4++) {
            if (class24.field186[var4]) {
                class12.field78[var4] = true;
            }
            class362.field4797[var4] = class24.field186[var4];
            class24.field186[var4] = false;
        }
        class266.field3520 = class406.field5732;
        class388.method2266(-1, -125, -1, null);
        class622.method3520(-1, null, -1, 60);
        if (class116.field1543 != -1) {
            class497.field6763 = 0;
            class406.method2347((byte) 118);
        }
        class21.field142.method406();
        class418.method2399(256, class21.field142);
        int var5 = class258.method1549((byte) -72);
        if (var5 == -1) {
            var5 = class553.field7817;
        }
        if (var5 == -1) {
            var5 = class410.field5779;
        }
        class61.method466(var5, true);
        int var6 = class653.field9086.method543(0) << 8;
        class239.method1443(class242.field3146, class653.field9086.field2175, class653.field9086.field2165 + var6, class653.field9086.field2170 + var6, (byte) 112);
        class242.field3146 = 0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class385 extends class227 {

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    private int field5599 = 0;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "[S")
    private short[] field5603 = new short[257];

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    public static int field5601 = 0;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "Lcg;")
    public static class92 field5597;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "[I")
    private int[] field5600;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "[I")
    private int[] field5604;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "[[I")
    private int[][] field5593;

    static {
        new class305("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V", line = 4)
    public final void method877(int arg0) {
        ++field5605;
        if (this.field5593 == null) {
            this.field5593 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field5593.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field5599 == 2) {
                this.method2343((byte) -97);
            }
            class32.method182(109);
            this.method2339(arg0 + -26197);
            if (arg0 != 1) {
                this.method2341(50, -68);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "(I)V", line = 33)
    private final void method2339(int arg0) {
        int var2 = this.field5599;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field5593.length + -1 && ~var4 <= ~this.field5593[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field5593[var5 - 1];
                    int[] var7 = this.field5593[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class143.field1906[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field5603[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field5593.length + -1 > var14 && ~var13 <= ~this.field5593[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field5593[var14 - 1];
                    int[] var16 = this.field5593[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field5603[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field5593.length + -1) < ~var22 && ~var21 <= ~this.field5593[var22][0]; ++var22) {
                }
                int[] var23 = this.field5593[var22 + -1];
                int[] var24 = this.field5593[var22];
                int var25 = this.method2341(127, var22 - 2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2341(arg0 ^ -26159, var22 + 1)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + -var27 + var26 + var28;
                int var32 = var25 - (var26 + var31);
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var35 - (-var36 + -var37);
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field5603[var20] = (short) var38;
            }
        }
        if (arg0 != -26196) {
            method2342(-7);
        }
        ++field5606;
    }

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "(I)V", line = 213)
    public static void method2340(int arg0) {
        if (arg0 != -1411) {
            method2342(77);
        }
        field5597 = null;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)[I", line = 224)
    private final int[] method2341(int arg0, int arg1) {
        ++field5596;
        if (~arg1 > -1) {
            return this.field5600;
        } else if (arg1 >= this.field5593.length) {
            return this.field5604;
        } else {
            return arg0 < 121 ? null : this.field5593[arg1];
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V", line = 283)
    public class385() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lug;II)V", line = 254)
    public final void method61(class396 arg0, int arg1, int arg2) {
        ++field5602;
        if (arg1 != 487215116) {
            field5601 = 126;
        }
        if (~arg2 == -1) {
            this.field5599 = arg0.method2388((byte) -116);
            this.field5593 = new int[arg0.method2388((byte) -121)][2];
            for (int var4 = 0; ~this.field5593.length < ~var4; ++var4) {
                this.field5593[var4][0] = arg0.method2386(class335.method1958(arg1, -487197780));
                this.field5593[var4][1] = arg0.method2386(-23648);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "(I)V", line = 286)
    public static final void method2342(int arg0) {
        ++field5607;
        if (arg0 != -1821699996) {
            field5598 = 95;
        }
        class413.method2521(class188.field2436, false);
        ++class297.field3917;
        if (class95.field1137 && class463.field6905) {
            int var1 = class148.field1951.method349((byte) 88);
            int var2 = class148.field1951.method347(arg0 + 1821699882);
            int var3 = var2 - class389.field5639;
            int var4 = var1 - class272.field3624;
            if (~class13.field142 < ~var4) {
                var4 = class13.field142;
            }
            if (~(class13.field142 + class474.field7033.field6612) > ~(class188.field2436.field6612 + var4)) {
                var4 = class13.field142 + class474.field7033.field6612 + -class188.field2436.field6612;
            }
            if (class216.field2951 > var3) {
                var3 = class216.field2951;
            }
            if (class216.field2951 + class474.field7033.field6573 < var3 - -class188.field2436.field6573) {
                var3 = -class188.field2436.field6573 + class216.field2951 - -class474.field7033.field6573;
            }
            int var5 = -class13.field142 - -class474.field7033.field6634 + var4;
            int var6 = class474.field7033.field6687 + var3 + -class216.field2951;
            if (!class148.field1951.method355(31027)) {
                if (class392.field5669) {
                    class227.method1451(arg0 ^ -1821703962);
                    if (class188.field2436.field6600 != null) {
                        class293 var7 = new class293();
                        var7.field3866 = class188.field2436.field6600;
                        var7.field3877 = class188.field2436;
                        var7.field3875 = class304.field4048;
                        var7.field3874 = var6;
                        var7.field3868 = var5;
                        class432.method2657(var7);
                    }
                    if (class304.field4048 != null && client.method1261(class188.field2436) != null) {
                        class48.method274(arg0 + 1821699997, class188.field2436, class304.field4048);
                    }
                } else if ((~class270.field3616 == -2 || class528.method3131((byte) 121)) && ~class391.field5656 < -3) {
                    class144.method882((byte) -124, class335.field4438 + class272.field3624, class512.field7463 + class389.field5639);
                } else if (class259.method1594(arg0 ^ -1821699995)) {
                    class144.method882((byte) -103, class335.field4438 + class272.field3624, class512.field7463 + class389.field5639);
                }
                class188.field2436 = null;
            } else {
                if (class297.field3917 > class188.field2436.field6591) {
                    int var8 = -class335.field4438 + var4;
                    int var9 = -class512.field7463 + var3;
                    if (~var8 < ~class188.field2436.field6639 || -class188.field2436.field6639 > var8 || ~class188.field2436.field6639 > ~var9 || -class188.field2436.field6639 > var9) {
                        class392.field5669 = true;
                    }
                }
                if (class188.field2436.field6678 != null && class392.field5669) {
                    class293 var10 = new class293();
                    var10.field3868 = var5;
                    var10.field3866 = class188.field2436.field6678;
                    var10.field3874 = var6;
                    var10.field3877 = class188.field2436;
                    class432.method2657(var10);
                }
            }
        } else {
            if (~class297.field3917 < -2) {
                class188.field2436 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 400)
    private final void method2343(byte arg0) {
        ++field5594;
        int[] var2 = this.field5593[0];
        int[] var3 = this.field5593[1];
        int[] var4 = this.field5593[this.field5593.length + -2];
        int var5 = -101 % ((-32 - arg0) / 36);
        int[] var6 = this.field5593[this.field5593.length - 1];
        this.field5604 = new int[] { var4[0] - (var6[0] + -var4[0]), -var6[1] - (-var4[1] - var4[1]) };
        this.field5600 = new int[] { var2[0] - var3[0] - -var2[0], var2[1] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)[I", line = 420)
    public final int[] method62(int arg0, int arg1) {
        ++field5595;
        if (arg0 != 15811) {
            this.field5600 = null;
        }
        int[] var3 = super.field3068.method1970(arg1, (byte) 25);
        if (super.field3068.field4480) {
            int[] var4 = this.method1459(arg1, 118, 0);
            for (int var5 = 0; ~class446.field6486 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field5603[var6];
            }
        }
        return var3;
    }
}

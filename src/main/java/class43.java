import java.awt.event.ActionEvent;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class43 extends class27 {

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    private int field691 = 5;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    private int field694 = 0;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
    private int field700 = 1;

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "I")
    private int field704 = 2;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "I")
    private int field703 = 25;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    private int field693 = 2048;

    @OriginalMember(owner = "client!ed", name = "fb", descriptor = "I")
    private int field710 = 5;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "Lnb;")
    public static class120 field701 = new class120(64);

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "I")
    public static int field707 = 0;

    @OriginalMember(owner = "client!ed", name = "ib", descriptor = "I")
    public static int field713 = 0;

    @OriginalMember(owner = "client!ed", name = "jb", descriptor = "Lkb;")
    public static class93 field714 = class76.method390("und die Schaltfl-=che (WSpielkonto erstellen(W am", 0);

    @OriginalMember(owner = "client!ed", name = "hb", descriptor = "Lkb;")
    public static class93 field712 = class76.method390("", 0);

    @OriginalMember(owner = "client!ed", name = "gb", descriptor = "Lkb;")
    public static class93 field711 = class76.method390("Lade Titelbild )2 ", 0);

    @OriginalMember(owner = "client!ed", name = "kb", descriptor = "Lkb;")
    public static class93 field715 = field712;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    private int field692;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
    private int field695;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    private int field696;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ed", name = "eb", descriptor = "Z")
    public static boolean field709;

    @OriginalMember(owner = "client!ed", name = "db", descriptor = "[[I")
    private int[][] field708;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        ++field705;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field691 = arg2.method1054(128);
                                }
                            } else {
                                this.field710 = arg2.method1054(128);
                            }
                        } else {
                            this.field700 = arg2.method1054(128);
                        }
                    } else {
                        this.field704 = arg2.method1054(128);
                    }
                } else {
                    this.field693 = arg2.method1071(28101);
                }
            } else {
                this.field694 = arg2.method1054(128);
            }
        } else {
            this.field710 = this.field691 = arg2.method1054(128);
        }
        if (arg0 < 106) {
            this.field700 = 50;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
    public static void method230(int arg0) {
        if (arg0 == 2) {
            field711 = null;
            field714 = null;
            field712 = null;
            field701 = null;
            field715 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field698;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int var4 = class142.field2781[arg0];
            int var5 = this.field704;
            if (~var5 != -3) {
                if (~var5 == -2) {
                    for (int var6 = 0; class159.field3209 > var6; ++var6) {
                        int var7 = class97.field1808[var6];
                        var3[var6] = this.method233(var4, 2, (byte) -56, var7)[1];
                    }
                } else {
                    for (int var8 = 0; ~class159.field3209 < ~var8; ++var8) {
                        int var9 = class97.field1808[var8];
                        var3[var8] = this.method233(var4, 1, (byte) 98, var9)[0];
                    }
                }
            } else {
                for (int var10 = 0; var10 < class159.field3209; ++var10) {
                    int var11 = class97.field1808[var10];
                    int[] var12 = this.method233(var4, 2, (byte) 109, var11);
                    var3[var10] = var12[1] + -var12[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)V")
    public final void method154(byte arg0) {
        if (arg0 < 77) {
            method232((Object) null, (class149) null, -85);
        }
        this.method231(0);
        ++field697;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class43() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V")
    private final void method231(int arg0) {
        ++field699;
        Random var2 = new Random((long) this.field694);
        int var3 = 4096 / this.field710;
        this.field703 = this.field710 * this.field691;
        this.field695 = var3 >> 1;
        this.field708 = new int[this.field703][2];
        int var4 = 4096 / this.field691;
        this.field692 = var4 >> 1;
        int var5 = this.field695 * this.field693 >> 12;
        int var6 = this.field693 * this.field692 >> 12;
        for (int var7 = arg0; ~this.field691 < ~var7; ++var7) {
            int var8 = var4 * var7;
            for (int var9 = 0; ~this.field710 < ~var9; ++var9) {
                int var10 = this.field710 * var7 + var9;
                int var11 = var5 * (-4096 + class64.method327(8192, var2, 10093)) >> 12;
                int var12 = var6 * (-4096 + class64.method327(8192, var2, 10093)) >> 12;
                this.field708[var10][0] = var11 - -(var3 * var9);
                this.field708[var10][1] = var8 + var12;
            }
        }
        this.field696 = this.field691 < this.field710 ? this.field710 : this.field691;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/Object;Lqd;I)V")
    public static final void method232(Object arg0, class149 arg1, int arg2) {
        ++field706;
        if (arg1.field2874 != null) {
            int var3 = 0;
            if (arg2 <= 60) {
                method230(10);
            }
            while (~var3 > -51 && arg1.field2874.peekEvent() != null) {
                class39.method212(55, 1L);
                ++var3;
            }
            if (arg0 != null) {
                arg1.field2874.postEvent(new ActionEvent(arg0, 1001, "dummy"));
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIBI)[I")
    private final int[] method233(int arg0, int arg1, byte arg2, int arg3) {
        ++field702;
        int[] var5 = new int[arg1];
        for (int var6 = 0; ~var6 > ~arg1; ++var6) {
            var5[var6] = Integer.MAX_VALUE;
        }
        int var7 = 97 / ((5 - arg2) / 51);
        int var8 = this.field692 + arg0;
        if (var8 > 4096) {
            var8 -= 4096;
        }
        int var9 = this.field695 + arg3;
        if (var9 > 4096) {
            var9 -= 4096;
        }
        int var10 = this.field691 * var8 >> 12;
        int var11 = this.field710 * var9 >> 12;
        int var12 = -1;
        int var13 = -1;
        int var14 = Integer.MAX_VALUE;
        int var15 = this.field710 <= 2 ? this.field710 + -1 : 2;
        int var16 = Integer.MAX_VALUE;
        int var17 = this.field691 > 2 ? 2 : this.field691 + -1;
        for (int var18 = -var15; var15 >= var18; ++var18) {
            for (int var26 = -var17; ~var26 >= ~var17; ++var26) {
                int var27 = var10 + var26;
                int var28 = var11 + var18;
                if (var27 < 0) {
                    var27 += this.field691;
                }
                if (~var28 > -1) {
                    var28 += this.field710;
                }
                if (var28 >= this.field710) {
                    var28 -= this.field710;
                }
                if (var27 >= this.field691) {
                    var27 -= this.field691;
                }
                int var29 = this.field710 * var27 + var28;
                int var30 = this.field708[var29][0];
                int var31 = var9 - var30;
                int var32 = this.field708[var29][1];
                int var33 = -var32 + var8;
                if (~var33 > -1) {
                    var33 = -var33;
                }
                if (var31 < 0) {
                    var31 = -var31;
                }
                if (~var31 < -2049) {
                    var31 = -var31 + 4096;
                }
                if (~var33 < -2049) {
                    var33 = -var33 + 4096;
                }
                int var34 = var31 * var31 + var33 * var33 >> 12;
                if (var14 > var34) {
                    if (~var12 != 0) {
                        var12 = var13;
                        var16 = var14;
                    } else {
                        var12 = var29;
                        var16 = var34;
                    }
                    var13 = var29;
                    var14 = var34;
                } else if (var12 == var13 && var12 != var29 || var16 > var34 && ~var13 != ~var29) {
                    var16 = var34;
                    var12 = var29;
                }
            }
        }
        int var19 = var8 - this.field708[var13][1];
        if (var19 < 0) {
            var19 = -var19;
        }
        if (var19 > 2048) {
            var19 = -var19 + 4096;
        }
        int var20 = -this.field708[var13][0] + var9;
        int var21 = -this.field708[var12][0] + var9;
        int var22 = -this.field708[var12][1] + var8;
        if (~var22 > -1) {
            var22 = -var22;
        }
        if (~var21 > -1) {
            var21 = -var21;
        }
        if (var22 > 2048) {
            var22 = -var22 + 4096;
        }
        if (~var20 > -1) {
            var20 = -var20;
        }
        if (~var20 < -2049) {
            var20 = 4096 - var20;
        }
        if (~var21 < -2049) {
            var21 = -var21 + 4096;
        }
        int var23 = this.field700;
        int var24;
        int var25;
        if (var23 != 1) {
            if (var23 == 2) {
                var24 = Math.max(var20, var19);
                var25 = Math.max(var21, var22);
            } else {
                var24 = var19 * var19 + var20 * var20;
                var25 = var21 * var21 - -(var22 * var22);
            }
        } else {
            var24 = (int) Math.sqrt((double) (var19 * var19 + var20 * var20));
            var25 = (int) Math.sqrt((double) (var21 * var21 + var22 * var22));
        }
        if (arg1 > 1) {
            var5[1] = this.field696 * var25;
        }
        var5[0] = this.field696 * var24;
        return var5;
    }
}

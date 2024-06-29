import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class56 extends class189 {

    @OriginalMember(owner = "client!fh", name = "jb", descriptor = "I")
    private int field1471 = 25;

    @OriginalMember(owner = "client!fh", name = "pb", descriptor = "I")
    private int field1477 = 5;

    @OriginalMember(owner = "client!fh", name = "xb", descriptor = "I")
    private int field1485 = 1;

    @OriginalMember(owner = "client!fh", name = "sb", descriptor = "I")
    private int field1480 = 5;

    @OriginalMember(owner = "client!fh", name = "ub", descriptor = "I")
    private int field1482 = 2048;

    @OriginalMember(owner = "client!fh", name = "rb", descriptor = "I")
    private int field1479 = 2;

    @OriginalMember(owner = "client!fh", name = "Cb", descriptor = "I")
    private int field1490 = 0;

    @OriginalMember(owner = "client!fh", name = "gb", descriptor = "Lgg;")
    public static class63 field1468 = class116.method911(43, "null");

    @OriginalMember(owner = "client!fh", name = "qb", descriptor = "[I")
    public static int[] field1478 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!fh", name = "Bb", descriptor = "I")
    public static int field1489 = -1;

    @OriginalMember(owner = "client!fh", name = "zb", descriptor = "[I")
    public static int[] field1487 = new int[1000];

    @OriginalMember(owner = "client!fh", name = "hb", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!fh", name = "ib", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!fh", name = "kb", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!fh", name = "lb", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client!fh", name = "mb", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!fh", name = "vb", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client!fh", name = "yb", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!fh", name = "Ab", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!fh", name = "Db", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client!fh", name = "Eb", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!fh", name = "ob", descriptor = "Lwb;")
    public static class200 field1476;

    @OriginalMember(owner = "client!fh", name = "tb", descriptor = "Ljc;")
    public static class85 field1481;

    @OriginalMember(owner = "client!fh", name = "nb", descriptor = "[I")
    public static int[] field1475;

    @OriginalMember(owner = "client!fh", name = "wb", descriptor = "[[I")
    private int[][] field1484;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
    public static void method546(int arg0) {
        field1476 = null;
        field1481 = null;
        field1478 = null;
        field1475 = null;
        if (arg0 == -31339) {
            field1487 = null;
            field1468 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class56() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field1469;
        if (arg0 != 0) {
            this.method77(83, (byte) -98, (class3) null);
        }
        int[] var3 = super.field3825.method681(arg1, (byte) -82);
        if (super.field3825.field1840) {
            int var4 = class21.field496[arg1];
            int var5 = this.field1479;
            if (~var5 != -3) {
                if (var5 == 1) {
                    for (int var6 = 0; ~var6 > ~class54.field1430; ++var6) {
                        int var7 = class35.field825[var6];
                        var3[var6] = this.method549((byte) 112, var7, var4, 2)[1];
                    }
                } else {
                    for (int var8 = 0; var8 < class54.field1430; ++var8) {
                        int var9 = class35.field825[var8];
                        var3[var8] = this.method549((byte) 125, var9, var4, 1)[0];
                    }
                }
            } else {
                for (int var10 = 0; ~var10 > ~class54.field1430; ++var10) {
                    int var11 = class35.field825[var10];
                    int[] var12 = this.method549((byte) 78, var11, var4, 2);
                    var3[var10] = var12[1] + -var12[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        ++field1474;
        this.method547(arg0);
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(Z)V")
    private final void method547(boolean arg0) {
        ++field1486;
        Random var2 = new Random((long) this.field1490);
        int var3 = 4096 / this.field1480;
        this.field1491 = var3 >> 1;
        this.field1471 = this.field1480 * this.field1477;
        int var4 = 4096 / this.field1477;
        this.field1484 = new int[this.field1471][2];
        if (!arg0) {
            this.field1471 = 0;
        }
        this.field1483 = var4 >> 1;
        int var5 = this.field1491 * this.field1482 >> 12;
        int var6 = this.field1483 * this.field1482 >> 12;
        for (int var7 = 0; ~this.field1480 < ~var7; ++var7) {
            int var8 = var3 * var7;
            for (int var9 = 0; ~this.field1477 < ~var9; ++var9) {
                int var10 = this.field1477 * var7 + var9;
                int var11 = var6 * (class97.method834(0, var2, 8192) + -4096) >> 12;
                int var12 = (-4096 + class97.method834(0, var2, 8192)) * var5 >> 12;
                this.field1484[var10][0] = var11 - -(var4 * var9);
                this.field1484[var10][1] = var8 + var12;
            }
        }
        this.field1473 = ~this.field1480 <= ~this.field1477 ? this.field1480 : this.field1477;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[Lff;I)V")
    public static final void method548(int arg0, class54[] arg1, int arg2) {
        ++field1492;
        for (int var3 = arg2; ~var3 > ~arg1.length; ++var3) {
            class54 var4 = arg1[var3];
            if (var4 != null && var4.field1353 == arg0 && (!var4.field1336 || !class183.method1208((byte) 96, var4))) {
                if (~var4.field1432 == -1) {
                    if (!var4.field1336 && class183.method1208((byte) 118, var4) && class11.field257 != var4) {
                        continue;
                    }
                    method548(var4.field1323, arg1, 0);
                    if (var4.field1368 != null) {
                        method548(var4.field1323, var4.field1368, 0);
                    }
                    class132 var5 = (class132) class133.field2885.method694(-23979, (long) var4.field1323);
                    if (var5 != null) {
                        class191.method1259((byte) 127, var5.field2865);
                    }
                }
                if (var4.field1432 == 6) {
                    if (~var4.field1361 != 0 || ~var4.field1416 != 0) {
                        boolean var6 = class96.method831(var4, 5);
                        int var7;
                        if (!var6) {
                            var7 = var4.field1361;
                        } else {
                            var7 = var4.field1416;
                        }
                        if (var7 != -1) {
                            class9 var8 = class49.method480(1000, var7);
                            var4.field1429 += class131.field2852;
                            while (var4.field1429 > var8.field201[var4.field1307]) {
                                var4.field1429 -= var8.field201[var4.field1307];
                                ++var4.field1307;
                                if (~var8.field219.length >= ~var4.field1307) {
                                    var4.field1307 -= var8.field215;
                                    if (var4.field1307 < 0 || ~var4.field1307 <= ~var8.field219.length) {
                                        var4.field1307 = 0;
                                    }
                                }
                                class113.method901(0, var4);
                            }
                        }
                    }
                    if (var4.field1322 != 0 && !var4.field1336) {
                        int var9 = var4.field1322 >> 16;
                        int var10 = var4.field1322 << 16 >> 16;
                        int var11 = class131.field2852 * var10;
                        int var12 = class131.field2852 * var9;
                        var4.field1421 = var4.field1421 + var11 & 2047;
                        var4.field1418 = 2047 & var4.field1418 - -var12;
                        class113.method901(0, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BIII)[I")
    private final int[] method549(byte arg0, int arg1, int arg2, int arg3) {
        ++field1470;
        int[] var5 = new int[arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            var5[var6] = Integer.MAX_VALUE;
        }
        int var7 = this.field1491 + arg2;
        int var8 = this.field1483 + arg1;
        if (~var7 < -4097) {
            var7 -= 4096;
        }
        int var9 = -1;
        if (var8 > 4096) {
            var8 -= 4096;
        }
        if (arg0 < 25) {
            this.field1479 = 116;
        }
        int var10 = this.field1480 * var7 >> 12;
        int var11 = -1;
        int var12 = Integer.MAX_VALUE;
        int var13 = this.field1477 * var8 >> 12;
        int var14 = Integer.MAX_VALUE;
        int var15 = ~this.field1477 < -3 ? 2 : this.field1477 + -1;
        int var16 = this.field1480 > 2 ? 2 : this.field1480 + -1;
        for (int var17 = -var15; var15 >= var17; ++var17) {
            for (int var25 = -var16; ~var25 >= ~var16; ++var25) {
                int var26 = var13 + var17;
                if (~var26 > -1) {
                    var26 += this.field1477;
                }
                if (~var26 <= ~this.field1477) {
                    var26 -= this.field1477;
                }
                int var27 = var10 + var25;
                if (~var27 > -1) {
                    var27 += this.field1480;
                }
                if (this.field1480 <= var27) {
                    var27 -= this.field1480;
                }
                int var28 = this.field1477 * var27 + var26;
                int var29 = this.field1484[var28][0];
                int var30 = this.field1484[var28][1];
                int var31 = var8 - var29;
                int var32 = -var30 + var7;
                if (~var31 > -1) {
                    var31 = -var31;
                }
                if (var31 > 2048) {
                    var31 = -var31 + 4096;
                }
                if (~var32 > -1) {
                    var32 = -var32;
                }
                if (~var32 < -2049) {
                    var32 = -var32 + 4096;
                }
                int var33 = var31 * var31 + var32 * var32 >> 12;
                if (var12 > var33) {
                    if (~var11 == 0) {
                        var14 = var33;
                        var11 = var28;
                    } else {
                        var14 = var12;
                        var11 = var9;
                    }
                    var12 = var33;
                    var9 = var28;
                } else if (~var9 == ~var11 && var11 != var28 || var33 < var14 && ~var9 != ~var28) {
                    var14 = var33;
                    var11 = var28;
                }
            }
        }
        int var18 = -this.field1484[var9][0] + var8;
        if (var18 < 0) {
            var18 = -var18;
        }
        if (var18 > 2048) {
            var18 = 4096 - var18;
        }
        int var19 = -this.field1484[var11][0] + var8;
        int var20 = -this.field1484[var9][1] + var7;
        if (~var19 > -1) {
            var19 = -var19;
        }
        if (~var20 > -1) {
            var20 = -var20;
        }
        if (var19 > 2048) {
            var19 = 4096 - var19;
        }
        if (var20 > 2048) {
            var20 = -var20 + 4096;
        }
        int var21 = -this.field1484[var11][1] + var7;
        if (var21 < 0) {
            var21 = -var21;
        }
        if (var21 > 2048) {
            var21 = -var21 + 4096;
        }
        int var22 = this.field1485;
        int var23;
        int var24;
        if (var22 != 1) {
            if (var22 == 2) {
                var23 = Math.max(var18, var20);
                var24 = Math.max(var19, var21);
            } else {
                var23 = var18 * var18 + var20 * var20;
                var24 = var19 * var19 + var21 * var21;
            }
        } else {
            var23 = (int) Math.sqrt((double) (var18 * var18 - -(var20 * var20)));
            var24 = (int) Math.sqrt((double) (var19 * var19 + var21 * var21));
        }
        if (arg3 > 1) {
            var5[1] = this.field1473 * var24;
        }
        var5[0] = this.field1473 * var23;
        return var5;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field1480 = arg2.method64(31790);
                                }
                            } else {
                                this.field1477 = arg2.method64(31790);
                            }
                        } else {
                            this.field1485 = arg2.method64(31790);
                        }
                    } else {
                        this.field1479 = arg2.method64(31790);
                    }
                } else {
                    this.field1482 = arg2.method46((byte) 65);
                }
            } else {
                this.field1490 = arg2.method64(31790);
            }
        } else {
            this.field1477 = this.field1480 = arg2.method64(31790);
        }
        ++field1472;
        if (arg1 <= 32) {
            this.method547(false);
        }
    }
}
